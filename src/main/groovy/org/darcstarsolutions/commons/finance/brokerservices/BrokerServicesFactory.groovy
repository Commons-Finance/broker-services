package org.darcstarsolutions.commons.finance.brokerservices

import org.darcstarsolutions.commons.finance.brokerservices.etrade.EtradeBrokerService
import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
/**
 * Created by mharris on 11/24/15.
 */
class BrokerServicesFactory implements ApplicationContextAware {

    private ApplicationContext applicationContext

    BrokerService createBrokerService(AvailableBrokers availableBrokers) {
        BrokerService brokerService
        switch (availableBrokers) {
            case AvailableBrokers.ETRADE: brokerService = applicationContext.getBean(EtradeBrokerService.class)
                break
            default: throw new IllegalArgumentException("The requested Broker $availableBrokers is not supported")
        }
        return brokerService
    }

    @Override
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext
    }
}
