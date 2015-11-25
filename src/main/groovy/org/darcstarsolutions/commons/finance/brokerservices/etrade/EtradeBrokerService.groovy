package org.darcstarsolutions.commons.finance.brokerservices.etrade

import org.darcstarsolutions.commons.finance.brokerservices.AuthorizationService
import org.darcstarsolutions.commons.finance.brokerservices.BrokerService
import org.springframework.beans.factory.annotation.Autowired
/**
 * Created by mharris on 11/24/15.
 */
class EtradeBrokerService implements BrokerService {

    @Autowired
    private EtradeAuthorizationService authorizationService

    @Override
    AuthorizationService getAuthorizationService() {
        return authorizationService
    }
}
