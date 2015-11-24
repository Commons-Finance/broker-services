package org.darcstarsolutions.commons.finance.brokerservices

import org.darcstarsolutions.commons.finance.brokerservices.config.BrokerServicesConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by mharris on 11/24/15.
 */

@SpringBootApplication(scanBasePackageClasses = [BrokerServicesConfiguration.class])
class Application implements CommandLineRunner {

    @Autowired
    private BrokerServicesFactory brokerServicesFactory

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args)
    }

    @Override
    void run(String... args) throws Exception {
        brokerServicesFactory != null
    }
}
