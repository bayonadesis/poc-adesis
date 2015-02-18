package adesisPoc.poc.service.dao.dto;

import adesisPoc.commons.dto.enums.EnumPersonType;

/**
 * @author Manuel Bayona
 *
 */
public class DtoUser 
{

	private String id;
	private String name;
	private EnumPersonType type;
	private int age;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public EnumPersonType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(EnumPersonType type) {
		this.type = type;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	
}
