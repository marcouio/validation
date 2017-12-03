package validation.annotation;

import java.util.ArrayList;
import java.util.List;

public class ValidatorBase implements Validator {

	List<String> errors = new ArrayList<String>();
	
	public List<String> validate(Object toValidate) {
		if(toValidate == null){
			errors.add("The field is null");
		}
		return errors;
	}
}
