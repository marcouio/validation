package validation.annotation;

import java.util.List;

public interface Validator {

	List<String> validate(Object toValidate);
}
