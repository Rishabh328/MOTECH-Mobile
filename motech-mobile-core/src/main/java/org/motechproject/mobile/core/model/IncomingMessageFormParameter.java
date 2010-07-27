package org.motechproject.mobile.core.model;

import java.util.Date;

/**
 * IncomingMessageFormParameter interface is a POJO to hold IncomingMessageFormParameter information for data storage and manipulation
 * Date: Dec 14, 2009
 * @author Joseph Djomeda (joseph@dreamoval.com)
 */
public interface IncomingMessageFormParameter {

    /**
     *
     * @param id the id to set
     */
    public void setId(String id);

    /**
     *
     * @return id to get
     */
    public String getId();
    /**
     * @return the dateCreated
     */
    public Date getDateCreated();

    /**
     * @return the errCode
     */
    public int getErrCode();

    /**
     * @return the errText
     */
    public String getErrText();

    /**
     * @return the incomingMsgForm
     */
    public IncomingMessageForm getIncomingMsgForm();

    /**
     * @return the lastModified
     */
    public Date getLastModified();

    /**
     * @return the messageFormParamStatus
     */
    public IncMessageFormParameterStatus getMessageFormParamStatus();

    /**
     * @return the name
     */
    public String getName();

    /**
     * @return the value
     */
    public String getValue();

    /**
     * @return the value incomingMsgFormParamDefinition
     */
    public IncomingMessageFormParameterDefinition getIncomingMsgFormParamDefinition();

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated);

    /**
     * @param errCode the errCode to set
     */
    public void setErrCode(int errCode);

    /**
     * @param errText the errText to set
     */
    public void setErrText(String errText);

    /**
     * @param incomingMsgForm the incomingMsgForm to set
     */
    public void setIncomingMsgForm(IncomingMessageForm incomingMsgForm);

    /**
     * @param lastModified the lastModified to set
     */
    public void setLastModified(Date lastModified);

    /**
     * @param messageFormParamStatus the messageFormParamStatus to set
     */
    public void setMessageFormParamStatus(IncMessageFormParameterStatus messageFormParamStatus);

    /**
     * @param name the name to set
     */
    public void setName(String name);

    /**
     * @param value the value to set
     */
    public void setValue(String value);

    /**
     * @param incomingMsgFormParamDefinition the incomingMsgFormParamDefinition to set
     */
    public void setIncomingMsgFormParamDefinition(IncomingMessageFormParameterDefinition incomingMsgFormParamDefinition);

    /**
     * Helper method to display string value of all properties of the object
     * @return formated string value of all properties
     */
    @Override
    public String toString();


     /**
     * @return the version
     */
    int getVersion();

    /**
     * @param version the version to set
     */
    void setVersion(int version);
}
