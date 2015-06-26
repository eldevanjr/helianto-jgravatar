package org.helianto.jgravatar;


/**
 * 
 * @author Ralf Ebert  <a href="https://github.com/ralfebert/jgravatar"> Site on gitHub</a>
 * @author Eldevan Nery Junior
 *
 */
public enum GravatarDefaultImage {

	GRAVATAR_ICON(""),
	
	MYSTERY_MAN("mm"),
	
	RETRO("retro"),
	
	BLANK("blank"),
	
	IDENTICON("identicon"),

	MONSTERID("monsterid"),

	WAVATAR("wavatar"),

	HTTP_404("404");

	private String code;

	private GravatarDefaultImage(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	

}
