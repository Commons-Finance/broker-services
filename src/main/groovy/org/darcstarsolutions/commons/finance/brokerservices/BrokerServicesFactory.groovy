package org.darcstarsolutions.commons.finance.brokerservices

import org.darcstarsolutions.commons.finance.brokerservices.etrade.EtradeBrokerServiceFactoryBean
import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by mharris on 11/24/15.
 */
class BrokerServicesFactory {

    @Autowired
    private EtradeBrokerServiceFactoryBean etradeBrokerServiceFactoryBean

    BrokerService createBrokerService(AvailableBrokers availableBrokers) {
        BrokerServiceFactoryBean brokerServiceFactoryBean = getRequestedBrokerServiceFactoryBean(availableBrokers)
        return brokerServiceFactoryBean.getObject()
    }

    BrokerServiceFactoryBean getRequestedBrokerServiceFactoryBean(AvailableBrokers availableBrokers) {
        switch (availableBrokers) {
            case AvailableBrokers.ETRADE: return etradeBrokerServiceFactoryBean;
            default: throw new IllegalArgumentException("The requested Broker $availableBrokers is not supported")
        }
    }
}
