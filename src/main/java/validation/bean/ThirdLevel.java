package validation.bean;

import validation.annotation.Field;

public class ThirdLevel {

	private String field7;
	private String field8;
	private Double field9;
	
	public String getField7() {
		return field7;
	}
	public void setField7(String field7) {
		this.field7 = field7;
	}
	@Field(name="field8")
	public String getField8() {
		return field8;
	}
	public void setField8(String field8) {
		this.field8 = field8;
	}
	public Double getField9() {
		return field9;
	}
	public void setField9(Double field9) {
		this.field9 = field9;
	}
}
