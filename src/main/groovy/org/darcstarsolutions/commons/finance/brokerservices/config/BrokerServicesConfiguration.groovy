package org.darcstarsolutions.commons.finance.brokerservices.config

import org.darcstarsolutions.commons.finance.brokerservices.BrokerServicesFactory
import org.darcstarsolutions.commons.finance.brokerservices.etrade.EtradeBrokerServiceFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by mharris on 11/24/15.
 */

@Configuration
class BrokerServicesConfiguration {

    @Bean(name = "brokerServicesFactory")
    public BrokerServicesFactory brokerServicesFactory() {
        return new BrokerServicesFactory()
    }

    @Bean
    public EtradeBrokerServiceFactoryBean etradeBrokerServiceFactoryBean() {
        return new EtradeBrokerServiceFactoryBean();
    }

}
