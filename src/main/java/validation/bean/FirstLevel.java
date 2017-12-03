package validation.bean;

import validation.annotation.Check;
import validation.annotation.Validation;

public class FirstLevel {

	private String field1;
	private String field2;
	private Double field3;
	private SecondLevel secondLevel = new SecondLevel();
	
	@Check
	public SecondLevel getSecondLevel() {
		return secondLevel;
	}
	public void setSecondLevel(SecondLevel secondLevel) {
		this.secondLevel = secondLevel;
	}
	@Validation(name="field1")
	public String getField1() {
		return field1;
	}
	
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	@Validation(name="field3")
	public Double getField3() {
		return field3;
	}
	public void setField3(Double field3) {
		this.field3 = field3;
	}
}
