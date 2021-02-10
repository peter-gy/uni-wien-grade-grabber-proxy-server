package hu.gyarmatip.uniwiengradegrabberproxyserver.service;

import hu.gyarmatip.uniwiengradegrabberproxyserver.model.LoginData;

public interface AuthService {

    /**
     * Initiates a new u:space session and returns the session related cookies as
     * a single String
     * @param loginData the login data of the user to be logged in
     * @return the u:space session related cookies as a single String
     */
    String getUspaceSessionCookie(LoginData loginData);

}
