package org.darcstarsolutions.commons.finance.brokerservices

/**
 * Created by mharris on 11/24/15.
 */
interface AuthorizationService {
    RequestToken getRequestToken(ConsumerKey consumerKey)

    AuthorizationKey authorizeApplication(ConsumerKey consumerKey, RequestToken requestToken)

    AccessToken getAccessToken(ConsumerKey consumerKey, RequestToken requestToken, AuthorizationKey authorizationKey)

    AccessToken renewAccessToken(ConsumerKey consumerKey, RequestToken requestToken, AuthorizationKey authorizationKey)

    AccessToken revokeAccessToken(ConsumerKey consumerKey, AccessToken accessToken)

}