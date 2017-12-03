package validation.bean;

import validation.annotation.Check;
import validation.annotation.Field;

@Check
public class SecondLevel {

	private String field4;
	private String field5;
	private Double field6;
	private ThirdLevel thirdLevel = new ThirdLevel();
	
	@Field(name="field4")
	public String getField4() {
		return field4;
	}
	public void setField4(String field4) {
		this.field4 = field4;
	}
	public String getField5() {
		return field5;
	}
	public void setField5(String field5) {
		this.field5 = field5;
	}
	@Field(name="field6")
	public Double getField6() {
		return field6;
	}
	public void setField6(Double field6) {
		this.field6 = field6;
	}
	@Check
	public ThirdLevel getThirdLevel() {
		return thirdLevel;
	}
	public void setThirdLevel(ThirdLevel thirdLevel) {
		this.thirdLevel = thirdLevel;
	}
}
