package org.snmp4j.event;

import java.util.EventObject;
import org.snmp4j.TransportMapping;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.smi.Address;
import org.snmp4j.transport.TransportListener;

/* loaded from: classes2.dex */
public class AuthenticationFailureEvent extends EventObject {
    private static final long serialVersionUID = -8623553792794471405L;
    private Address address;
    private int error;
    private BERInputStream message;
    private transient TransportMapping transport;

    public AuthenticationFailureEvent(TransportListener transportListener, Address address, TransportMapping transportMapping, int i10, BERInputStream bERInputStream) {
        super(transportListener);
        this.address = address;
        this.transport = transportMapping;
        this.error = i10;
        this.message = bERInputStream;
    }

    public Address getAddress() {
        return this.address;
    }

    public int getError() {
        return this.error;
    }

    public BERInputStream getMessage() {
        return this.message;
    }

    public TransportMapping getTransport() {
        return this.transport;
    }
}
