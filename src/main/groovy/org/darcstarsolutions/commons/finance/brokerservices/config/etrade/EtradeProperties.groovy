package org.darcstarsolutions.commons.finance.brokerservices.config.etrade

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Created by mharris on 11/25/15.
 */

@ConfigurationProperties(prefix = "commons.finance.brokers.etrade")
class EtradeProperties {
    String consumerKey = ""
}
