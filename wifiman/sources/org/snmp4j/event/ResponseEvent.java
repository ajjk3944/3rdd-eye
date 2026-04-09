package org.snmp4j.event;

import java.util.EventObject;
import org.snmp4j.PDU;
import org.snmp4j.smi.Address;

/* loaded from: classes2.dex */
public class ResponseEvent extends EventObject {
    private static final long serialVersionUID = 3966730838956160070L;
    private Exception error;
    private Address peerAddress;
    private PDU request;
    private PDU response;
    private Object userObject;

    public ResponseEvent(Object obj, Address address, PDU pdu, PDU pdu2, Object obj2) {
        super(obj);
        setPeerAddress(address);
        setRequest(pdu);
        setResponse(pdu2);
        setUserObject(obj2);
    }

    public Exception getError() {
        return this.error;
    }

    public Address getPeerAddress() {
        return this.peerAddress;
    }

    public PDU getRequest() {
        return this.request;
    }

    public PDU getResponse() {
        return this.response;
    }

    public Object getUserObject() {
        return this.userObject;
    }

    protected final void setPeerAddress(Address address) {
        this.peerAddress = address;
    }

    protected final void setRequest(PDU pdu) {
        this.request = pdu;
    }

    protected final void setResponse(PDU pdu) {
        this.response = pdu;
    }

    protected final void setUserObject(Object obj) {
        this.userObject = obj;
    }

    public ResponseEvent(Object obj, Address address, PDU pdu, PDU pdu2, Object obj2, Exception exc) {
        this(obj, address, pdu, pdu2, obj2);
        this.error = exc;
    }
}
