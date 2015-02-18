package adesisPoc.commons.dto.enums;

/**
 * @author Manuel Bayona
 *
 */
public enum EnumPersonType {
	
	MORAL("1"),FISICA("2");
	
	private String code;
	
	EnumPersonType(String code){
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
