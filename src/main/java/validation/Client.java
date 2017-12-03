package validation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import validation.annotation.Check;
import validation.annotation.Field;
import validation.bean.FirstLevel;

public class Client {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		FirstLevel firstLevel = new FirstLevel();
		check(firstLevel);
	}

	public static void check(Object firstLevel) throws IllegalAccessException, InvocationTargetException {
		Class<? extends Object> checkClass = firstLevel.getClass();
		Method[] methods = checkClass.getMethods();
		for (Method method : methods) {
			Field fieldAnnotation = method.getAnnotation(Field.class);
			if(fieldAnnotation != null){
				Object invoke = method.invoke(firstLevel);
				System.out.print("Hello, I'm a checked method: ");
				System.out.print(method.getName() + " of " + checkClass + " class. ");
				System.out.print("My value is: ");
				System.out.println(invoke != null ? invoke.toString() : "null");
			}
			
			Check checkAnn = method.getAnnotation(Check.class);
			if(checkAnn != null){
				Object invoke = method.invoke(firstLevel);
				if(invoke != null){
					check(invoke);
				}
			}
		}
	}
}
