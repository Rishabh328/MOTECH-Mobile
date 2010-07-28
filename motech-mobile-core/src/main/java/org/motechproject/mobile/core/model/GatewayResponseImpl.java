package org.motechproject.mobile.core.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Date :Jul 24, 2009
 * @author Joseph Djomeda (joseph@dreamoval.com)
 */
public class GatewayResponseImpl implements GatewayResponse {

    private static final long serialVersionUID = 1L;
    private Long id;
    private GatewayRequest gatewayRequest;
    private String gatewayMessageId;
    private String recipientNumber;
    private MStatus messageStatus;
    private String responseText;
//    private Set<Transition> transitions = new HashSet<Transition>();
    private String requestId;
    private Date dateCreated;
    private Date lastModified;

    public GatewayResponseImpl() {
    }

    public GatewayResponseImpl(String gatewayMessageId, String recipientNumber, MStatus messageStatus) {
        this.gatewayMessageId = gatewayMessageId;
        this.recipientNumber = recipientNumber;
        this.messageStatus = messageStatus;
    }



private int version=-1;
    /**
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(int version) {
        this.version = version;
    }
    /**
     * @return the messageId
     */
    public GatewayRequest getGatewayRequest() {
        return gatewayRequest;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setGatewayRequest(GatewayRequest gatewayRequest) {
        this.gatewayRequest = gatewayRequest;
    }

    /**
     * @return the gatewayMessageId
     */
    public String getGatewayMessageId() {
        return gatewayMessageId;
    }

    /**
     * @param gatewayMessageId the gatewayMessageId to set
     */
    public void setGatewayMessageId(String gatewayMessageId) {
        this.gatewayMessageId = gatewayMessageId;
    }

    /**
     * @return the recipientNumber
     */
    public String getRecipientNumber() {
        return recipientNumber;
    }

    /**
     * @param recipientNumber the recipientNumber to set
     */
    public void setRecipientNumber(String recipientNumber) {
        this.recipientNumber = recipientNumber;
    }

    /**
     * @return the messageStatus
     */
    public MStatus getMessageStatus() {
        return messageStatus;
    }

    /**
     * @param messageStatus the messageStatus to set
     */
    public void setMessageStatus(MStatus messageStatus) {
        this.messageStatus = messageStatus;
    }

//    /**
//     * @return the transitions
//     */
//    public Set<Transition> getTransitions() {
//        return transitions;
//    }

//    /**
//     * @param transitions the transitions to set
//     */
//    public void setTransitions(Set<Transition> transitions) {
//        this.transitions = transitions;
//    }
//
//    public void addTransition(Transition transition) {
//        transition.setGatewayResponse(this);
//        this.transitions.add(transition);
//
//    }
//
//    public void addTransition(List<Transition> transitions) {
//        for (Transition t : transitions) {
//            t.setGatewayResponse(this);
//            this.transitions.add(t);
//        }
//    }
//
//    public void removeTransition(List<Transition> transitions) {
//        for (Transition t : transitions) {
//            if (this.transitions.contains(t)) {
//                this.transitions.remove(t);
//            }
//        }
//    }
//
//    public void removeTransition(Transition transition) {
//        if (this.transitions.contains(transition)) {
//            this.transitions.remove(transition);
//        }
//    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    /**
     * @return the requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * @param requestId the requestId to set
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the lastModified
     */
    public Date getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified the lastModified to set
     */
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    
    
     @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        String newLine = System.getProperty("line.separator");
     
       if(this != null) {
           sb.append((this.getId()!= null) ? "key=Id value=" + this.getId().toString() : "Id is null ");
           sb.append(newLine);
           sb.append((this.gatewayRequest != null) ? "key=gatewayRequest.Id value=" + this.gatewayRequest.getId() : "gatewayRequest.Id is null ");
           sb.append(newLine);
           sb.append((this.requestId != null) ? "key=requestId value=" + this.requestId : "requestId is null ");
           sb.append(newLine);
           sb.append((this.gatewayMessageId != null) ? "key=gatewayMessageID value=" + this.gatewayMessageId : "gatewayMessageId is null  ");
           sb.append(newLine);
           sb.append((this.recipientNumber != null) ? "key=recipientNumber value=" + this.recipientNumber : "recipientNumber is null ");
           sb.append(newLine); 
           sb.append((this.responseText != null ) ? "key=tryNumber.Id value=" + this.responseText : "responseText is null ");
           sb.append(newLine);
           sb.append((this.dateCreated != null) ? "key=dateSent value=" + this.dateCreated.toString() : "dateCreate is null ");
           sb.append(newLine);
           sb.append((this.lastModified != null) ? "key=lastModified value=" + this.lastModified.toString() : "lastModified is null ");
           sb.append(newLine);
           sb.append((this.messageStatus != null) ? "key=messageStatus value=" + this.messageStatus.toString() : "messageStatus is null ");
           sb.append(newLine);
          
           return sb.toString();
     
       } else {
           return "Object is null";
       }

        
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }


}
