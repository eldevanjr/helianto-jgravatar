# helianto-jgravatar
 Implementation of <a href="https://github.com/ralfebert/jgravatar"> Ralf Ebert </a> of jgravatar as Maven project.

it's a tiny Java library for accessing avatar images from gravatar.com.

## Download and usage

### Download

#### clone project and run 
	cd ~/helianto-jgravatar
	~/helianto-jgravatar mvc clean install

#### add to pom.xml
		<dependency>
			<groupId>org.helianto</groupId>
			<artifactId>helianto-jgravatar</artifactId>
			<version>1.0-SNAPSHOT</version>
		</dependency>
### Usage

#### example 

	Gravatar gravatar = new Gravatar();
	gravatar.setSize(50);
	gravatar.setRating(GravatarRating.GENERAL_AUDIENCES);
	gravatar.setDefaultImage(GravatarDefaultImage.IDENTICON);
	String url = gravatar.getUrl("test@email.com");
	byte[] jpg = gravatar.download("test@email.com");
	
#### Using constructor
	Gravatar gravatar = new Gravatar(80, GravatarRating.GENERAL_AUDIENCES, GravatarDefaultImage.MYSTERY_MAN);
	String url = gravatar.getUrl("test@email.com");
	byte[] jpg = gravatar.download("test@email.com");
	
#### Direct to byte[]
	byte[] jpg = new Gravatar(80, GravatarRating.GENERAL_AUDIENCES, GravatarDefaultImage.BLANK).download("test@email.com");
	
	