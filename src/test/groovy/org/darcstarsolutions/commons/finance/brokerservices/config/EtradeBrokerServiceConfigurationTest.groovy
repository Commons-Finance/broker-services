package org.darcstarsolutions.commons.finance.brokerservices.config

import org.darcstarsolutions.commons.finance.brokerservices.config.etrade.EtradeBrokerServiceConfiguration
import org.darcstarsolutions.commons.finance.brokerservices.etrade.EtradeAuthorizationService
import org.darcstarsolutions.commons.finance.brokerservices.etrade.EtradeBrokerService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.instanceOf
import static org.hamcrest.core.Is.is
import static org.hamcrest.core.IsNot.not

/**
 * Created by mharris on 11/24/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = [EtradeBrokerServiceConfiguration.class])
class EtradeBrokerServiceConfigurationTest {

    @Autowired
    private EtradeBrokerServiceConfiguration etradeBrokerServiceConfiguration

    @Autowired
    private EtradeBrokerService etradeBrokerService

    @Autowired
    private EtradeAuthorizationService etradeAuthorizationService

    @Test
    public void testConfigurationExistence() throws Exception {
        assertThat(etradeBrokerServiceConfiguration, is(not(null)))
        assertThat(etradeBrokerServiceConfiguration, instanceOf(EtradeBrokerServiceConfiguration.class))
    }

    @Test
    public void testBrokerServiceExistence() throws Exception {
        assertThat(etradeBrokerService, is(not(null)))
        assertThat(etradeBrokerService, instanceOf(EtradeBrokerService.class))
    }

    @Test
    public void testAuthorizationServiceExistence() throws Exception {
        assertThat(etradeAuthorizationService, is(not(null)))
        assertThat(etradeAuthorizationService, instanceOf(EtradeAuthorizationService.class))
    }
}
