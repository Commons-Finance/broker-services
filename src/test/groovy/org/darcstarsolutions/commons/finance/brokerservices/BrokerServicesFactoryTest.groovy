package org.darcstarsolutions.commons.finance.brokerservices

import org.darcstarsolutions.commons.finance.brokerservices.config.BrokerServicesConfiguration
import org.darcstarsolutions.commons.finance.brokerservices.etrade.EtradeBrokerService
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = [BrokerServicesConfiguration.class])
class BrokerServicesFactoryTest {

    private static final Logger logger = LoggerFactory.getLogger(BrokerServicesFactoryTest.class)

    @Resource
    private BrokerServicesFactory brokerServicesFactory

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testExistence() throws Exception {
        assertThat(brokerServicesFactory, is(not(null)))
    }

    @Test
    public void testCreateEtradeBrokerService() throws Exception {
        BrokerService brokerService = brokerServicesFactory.createBrokerService(AvailableBrokers.ETRADE)
        assertThat(brokerService, is(not(null)))
        assertThat(brokerService, instanceOf(EtradeBrokerService.class))
    }

    @After
    public void tearDown() throws Exception {


    }
}
