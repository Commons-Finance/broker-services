package org.darcstarsolutions.commons.finance.brokerservices.etrade

import org.darcstarsolutions.commons.finance.brokerservices.*

/**
 * Created by mharris on 11/24/15.
 */
class EtradeAuthorizationService implements AuthorizationService {

    @Override
    RequestToken getRequestToken(ConsumerKey consumerKey) {
        return null
    }

    @Override
    AuthorizationKey authorizeApplication(ConsumerKey consumerKey, RequestToken requestToken) {
        return null
    }

    @Override
    AccessToken getAccessToken(ConsumerKey consumerKey, RequestToken requestToken, AuthorizationKey authorizationKey) {
        return null
    }

    @Override
    AccessToken renewAccessToken(ConsumerKey consumerKey, RequestToken requestToken, AuthorizationKey authorizationKey) {
        return null
    }

    @Override
    AccessToken revokeAccessToken(ConsumerKey consumerKey, AccessToken accessToken) {
        return null
    }
}
