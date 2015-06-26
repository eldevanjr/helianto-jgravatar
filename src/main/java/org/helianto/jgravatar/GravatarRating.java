package org.helianto.jgravatar;

/**
 * 
 *  <cite>"Gravatar allows users to self-rate their images so that they can indicate
 *  if an image is appropriate for a certain audience." <a href="gravatar.com"> gravatar.com</a> </cite>
 *  <p>Enum represent above idea</p>
 *   <ul>
 *		<li><strong>GENERAL_AUDIENCES</strong>: <cite>'suitable for display on all websites with any audience type.'<a href="gravatar.com"> gravatar.com</a> </cite></li>
 *		<li><strong>PARENTAL_GUIDANCE_SUGGESTED</strong>:<cite>' may contain rude gestures, provocatively dressed individuals, the lesser swear words, or mild violence.'<a href="gravatar.com"> gravatar.com</a> </cite></li>
 *		<li><strong>RESTRICTED</strong>: <cite>'may contain such things as harsh profanity, intense violence, nudity, or hard drug use.'<a href="gravatar.com"> gravatar.com</a> </cite></li>
 *		<li><strong>XPLICIT</strong>:<cite>' may contain hardcore sexual imagery or extremely disturbing violence.'<a href="gravatar.com"> gravatar.com</a> </cite></li>
 *  </ul>
 *  <citenote>
 * 
 * @author Ralf Ebert  <a href="https://github.com/ralfebert/jgravatar"> Site on gitHub</a>
 * @author Eldevan Nery Junior
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