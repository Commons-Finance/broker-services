package org.darcstarsolutions.commons.finance.brokerservices.config.etrade

import org.darcstarsolutions.commons.finance.brokerservices.etrade.EtradeAuthorizationService
import org.darcstarsolutions.commons.finance.brokerservices.etrade.EtradeBrokerService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.context.annotation.Scope

/**
 * Created by mharris on 11/24/15.
 */

@Configuration
class EtradeBrokerServiceConfiguration {

    @Bean
    @Scope(value = "prototype")
    @DependsOn(value = "etradeAuthorizationService")
    public EtradeBrokerService etradeBrokerService() {
        return new EtradeBrokerService();
    }

    @Bean
    public EtradeAuthorizationService etradeAuthorizationService() {
        return new EtradeAuthorizationService()
    }
}
