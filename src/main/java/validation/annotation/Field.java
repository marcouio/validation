package validation.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.text.SimpleDateFormat;

@Retention(RUNTIME)
@Target(METHOD)
public @interface Field {

	public SimpleDateFormat sdf = new SimpleDateFormat();
	
	String name();
	
}
