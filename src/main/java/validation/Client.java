package validation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import validation.annotation.Check;
import validation.annotation.Validation;
import validation.annotation.Validator;
import validation.bean.FirstLevel;

public class Client {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		FirstLevel firstLevel = new FirstLevel();
		check(firstLevel);
	}

	public static void check(Object firstLevel) throws IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<? extends Object> checkClass = firstLevel.getClass();
		Method[] methods = checkClass.getMethods();
		for (Method method : methods) {
			Validation fieldAnnotation = method.getAnnotation(Validation.class);
			if(fieldAnnotation != null){
				Object invoke = method.invoke(firstLevel);
				System.out.print("Hello, I'm a checked method: ");
				System.out.print(method.getName() + " of " + checkClass + " class. ");
				System.out.print("My value is: ");
				System.out.println(invoke != null ? invoke.toString() : "null");
				Validator validator = fieldAnnotation.validator().newInstance();
				System.out.print("Call validator: ");
				System.out.println(validator.validate(invoke));
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
