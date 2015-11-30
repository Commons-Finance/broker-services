package org.darcstarsolutions.commons.finance.brokerservices.config
import org.darcstarsolutions.commons.finance.brokerservices.BrokerServicesFactory
import org.darcstarsolutions.commons.finance.brokerservices.config.etrade.EtradeBrokerServiceAutoConfiguration
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import javax.annotation.Resource

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.instanceOf
import static org.hamcrest.core.Is.is
import static org.hamcrest.core.IsNot.not
/**
 * Created by mharris on 11/24/15.
 */

@RunWith(SpringJUnit4ClassRunner)
@ContextConfiguration(classes = [BrokerServicesConfiguration.class])
class BrokerServicesConfigurationTest {

    @Autowired
    private BrokerServicesConfiguration brokerServicesConfiguration

    @Resource
    private BrokerServicesFactory brokerServicesFactory

    @Autowired
    private EtradeBrokerServiceAutoConfiguration etradeBrokerServiceConfiguration

    @Test
    public void testConfigurationExistence() throws Exception {
        assertThat(brokerServicesConfiguration, is(not(null)))
        assertThat(brokerServicesConfiguration, instanceOf(BrokerServicesConfiguration.class))
    }

    @Test
    public void testBrokerServicesFactoryExistence() throws Exception {
        assertThat(brokerServicesFactory, is(not(null)))
        assertThat(brokerServicesFactory, instanceOf(BrokerServicesFactory.class))
    }

    @Test
    public void testEtradeBrokerServiceFactoryBeanExistence() throws Exception {
        assertThat(etradeBrokerServiceConfiguration, is(not(null)))
        assertThat(etradeBrokerServiceConfiguration, instanceOf(EtradeBrokerServiceAutoConfiguration.class))
    }
}
