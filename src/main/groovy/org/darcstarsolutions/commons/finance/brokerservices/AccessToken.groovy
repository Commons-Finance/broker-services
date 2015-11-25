package org.darcstarsolutions.commons.finance.brokerservices

/**
 * Created by mharris on 11/24/15.
 */
class AccessToken {
    private String token
    private String tokenSecret

    AccessToken(String token, String tokenSecret) {
        this.token = token
        this.tokenSecret = tokenSecret
    }

}
