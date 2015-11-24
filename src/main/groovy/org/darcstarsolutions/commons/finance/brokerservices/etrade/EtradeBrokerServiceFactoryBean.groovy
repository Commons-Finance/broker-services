package org.darcstarsolutions.commons.finance.brokerservices.etrade

import org.darcstarsolutions.commons.finance.brokerservices.BrokerServiceFactoryBean

/**
 * Created by mharris on 11/24/15.
 */


class EtradeBrokerServiceFactoryBean implements BrokerServiceFactoryBean<EtradeBrokerService> {
    @Override
    EtradeBrokerService getObject() throws Exception {
        return new EtradeBrokerService()
    }

    @Override
    Class<?> getObjectType() {
        return EtradeBrokerService.class
    }

    @Override
    boolean isSingleton() {
        return false
    }
}
