package org.darcstarsolutions.commons.finance.brokerservices

/**
 * Created by mharris on 11/24/15.
 */
class RequestToken {

    private String token
    private String tokenSecret
    private boolean callbackConfirmed

    RequestToken(String token, String tokenSecret, boolean callbackConfirmed) {
        this.token = token
        this.tokenSecret = tokenSecret
        this.callbackConfirmed = callbackConfirmed
    }

}
