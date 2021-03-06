/**
 * MOTECH PLATFORM OPENSOURCE LICENSE AGREEMENT
 *
 * Copyright (c) 2010-11 The Trustees of Columbia University in the City of
 * New York and Grameen Foundation USA.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of Grameen Foundation USA, Columbia University, or
 * their respective contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY GRAMEEN FOUNDATION USA, COLUMBIA UNIVERSITY
 * AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL GRAMEEN FOUNDATION
 * USA, COLUMBIA UNIVERSITY OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.motechproject.mobile.omp.manager;

import org.motechproject.mobile.omp.service.CacheService;
import org.motechproject.mobile.omp.service.MobileMessagingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

/**
 * Unit test for the OMPManagerImpl class
 *
 * @author Kofi A. Asamoah (yoofi@dreamoval.com)
 * Date Created Aug 10, 2009
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/test-omp-config.xml"})
public class OMPManagerImplTest {

    @Autowired
    OMPManagerImpl ompManager;

    public OMPManagerImplTest() {
    }

    /**
     * Test of createGatewayMessageHandler method, of class OMPManagerImpl.
     */
    @Test
    public void testCreateGatewayMessageHandler() {
        System.out.println("createGatewayMessageHandler");
        GatewayMessageHandler result = ompManager.createGatewayMessageHandler();
        assertNotNull(result);
    }

    /**
     * Test of createSMSGatewayManager method, of class OMPManagerImpl.
     */
    @Test
    public void testCreateGatewayManager() {
        System.out.println("createGatewayManager");
        GatewayManager result = ompManager.createGatewayManager();
        assertNotNull(result);
    }

    /**
     * Test of createSMSCacheService method, of class OMPManagerImpl.
     */
    @Test
    public void testCreateCacheService() {
        System.out.println("createCacheService");
        CacheService result = ompManager.createCacheService();
        assertNotNull(result);
    }

    /**
     * Test of createSMSService method, of class OMPManagerImpl.
     */
    @Test
    public void testCreateMessagingService() {
        System.out.println("createMessagingService");
        MobileMessagingService result = ompManager.createMessagingService();
        assertNotNull(result);
    }

}