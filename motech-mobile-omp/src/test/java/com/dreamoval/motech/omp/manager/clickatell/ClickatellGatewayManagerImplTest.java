package com.dreamoval.motech.omp.manager.orserve;

import static org.easymock.EasyMock.*;

import com.dreamoval.motech.core.model.MessageDetails;
import com.dreamoval.motech.core.model.MessageDetailsImpl;
import com.dreamoval.motech.core.model.ResponseDetails;
import com.dreamoval.motech.omp.manager.GatewayMessageHandler;
import com.dreamoval.motech.omp.manager.clickatell.ClickatellGatewayManagerImpl;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tst for th ORServeGatewayManagerImpl class
 *
 * @author Kofi A. Asamoah (yoofi@dreamoval.com)
 * Date Created Aug 10, 2009
 */
public class ClickatellGatewayManagerImplTest {

    ClickatellGatewayManagerImpl instance;
    GatewayMessageHandler mockHandler;

    public ClickatellGatewayManagerImplTest() {
    }

    @Before
    public void setUp(){
        mockHandler = createMock(GatewayMessageHandler.class);
        instance = new ClickatellGatewayManagerImpl();
        instance.setMessageHandler(mockHandler);
    }

    /**
     * Test of sendMessage method, of class ClickatellGatewayManagerImpl.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");

        MessageDetails messageDetails = new MessageDetailsImpl();
        messageDetails.setGlobalStatus("pending");
        messageDetails.setMessageText("a message for testing");
        messageDetails.setNumberOfPages(1);
        messageDetails.setRecipientsNumbers("000000000000");
        messageDetails.setMessageType("TEXT");

        expect(
                mockHandler.parseMessageResponse((MessageDetails) anyObject(), (String) anyObject())
                ).andReturn(new HashSet<ResponseDetails>());
        replay(mockHandler);

        Set<ResponseDetails> result = instance.sendMessage(messageDetails);
        assertNotNull(result);
        verify(mockHandler);
    }

    /**
     * Test of getMessageStatus method, of class ClickatellGatewayManagerImpl.
     */
    @Test
    public void testGetMessageStatus() {
        System.out.println("getMessageStatus");
        String gatewayMessageId = "testid";

        expect(
                mockHandler.parseMessageStatus((String) anyObject())
                ).andReturn("delivered");
        replay(mockHandler);

        String result = instance.getMessageStatus(gatewayMessageId);
        assertNotNull(result);
        verify(mockHandler);
    }
}