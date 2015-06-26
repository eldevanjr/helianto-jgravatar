package org.helianto.jgravatar;

/**
 * 
 * @author Ralf Ebert  <a href="https://github.com/ralfebert/jgravatar"> Site on gitHub</a>
 *
 */
public enum GravatarRating {

	GENERAL_AUDIENCES("g"),

	PARENTAL_GUIDANCE_SUGGESTED("pg"),

	RESTRICTED("r"),

	XPLICIT("x");

	private String code;

	private GravatarRating(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}