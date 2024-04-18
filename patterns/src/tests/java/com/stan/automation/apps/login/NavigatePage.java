package com.stan.automation.apps.login;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigatePage {

	private Logger	log		= LoggerFactory.getLogger( NavigatePage.class );

	private boolean	newUser	= false;

		
	public void login( String username, String password ) {
	
		log.info( "Logging in with username: " + username + "password: " + password );
		LoginPage loginPage = new LoginPage( );

		if ( loginPage.loggedOut( ) ) {
			loginPage.signInAgain( );
		}

		loginPage.setUsername( username );
		loginPage.setPassword( password );
		loginPage.submit( );
		
		if ( loginPage.loggedOut( ) ) {
			log.error( "Login failed" );
		}		  
	}

	public void loginAsAdmin() {
		
		login( ConfigUtility.getStringProperty( "ADMIN_USERNAME" ),
				ConfigUtility.getStringProperty( "ADMIN_PASSWORD" ) );
	}

	public void loginAsAdmin( boolean newUser ) {
		this.newUser = newUser;
		login( ConfigUtility.getStringProperty( "ADMIN_USERNAME" ),
				ConfigUtility.getStringProperty( "ADMIN_PASSWORD" ) );
	}

	public void loginRegularUser() {
		login( ConfigUtility.getStringProperty( "DEFAULT_USER" ),
				ConfigUtility.getStringProperty( "DEFAULT_PASSWORD" ) );
	}

    public void loginRegularUser( boolean newUser ) {
		this.newUser = newUser;
		login( ConfigUtility.getStringProperty( "NEW_USER" ),
				ConfigUtility.getStringProperty( "NEW_PASSWORD" ) );
	}

	/**
	 * @return the newUser
	 */
	public boolean isNewUser() {
		return newUser;
	}

	/**
	 * @param newUser set the newUser
	 */
	public void setNewUser( boolean newUser ) {
		this.newUser = newUser;
	}
}
