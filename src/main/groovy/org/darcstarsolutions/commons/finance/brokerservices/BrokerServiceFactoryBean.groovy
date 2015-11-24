package org.darcstarsolutions.commons.finance.brokerservices

import org.springframework.beans.factory.FactoryBean

/**
 * Created by mharris on 11/24/15.
 */
interface BrokerServiceFactoryBean<T extends BrokerService> extends FactoryBean<T> {
}
