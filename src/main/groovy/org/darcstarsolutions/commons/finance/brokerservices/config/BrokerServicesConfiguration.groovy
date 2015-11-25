package org.darcstarsolutions.commons.finance.brokerservices.config
import org.darcstarsolutions.commons.finance.brokerservices.BrokerServicesFactory
import org.darcstarsolutions.commons.finance.brokerservices.config.etrade.EtradeBrokerServiceConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * Created by mharris on 11/24/15.
 */

@Configuration
@Import(value = [EtradeBrokerServiceConfiguration])
class BrokerServicesConfiguration {

    @Bean(name = "brokerServicesFactory")
    public BrokerServicesFactory brokerServicesFactory() {
        return new BrokerServicesFactory()
    }

}
