package org.darcstarsolutions.commons.finance.brokerservices.etrade

import org.darcstarsolutions.commons.finance.brokerservices.config.etrade.EtradeBrokerServiceConfiguration
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
class EtradeBrokerServiceTest {

    @Autowired
    private EtradeBrokerService etradeBrokerService

    @Test
    public void testExistence() throws Exception {
        assertThat(etradeBrokerService, is(not(null)))
        assertThat(etradeBrokerService, instanceOf(EtradeBrokerService.class))
    }

    @Test
    public void testAuthorizationServiceExists() throws Exception {
        EtradeAuthorizationService authorizationService = etradeBrokerService.getAuthorizationService()
        assertThat(authorizationService, is(not(null)))
        assertThat(authorizationService, instanceOf(EtradeAuthorizationService.class))

    }

}
