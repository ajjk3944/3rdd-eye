package org.snmp4j.transport.ssh;

import org.snmp4j.TransportStateReference;
import org.snmp4j.transport.TransportListener;

/* loaded from: classes2.dex */
public interface SshSession<I> {
    void addTransportListener(TransportListener transportListener);

    Long getID();

    I getImplementation();

    TransportStateReference getTransportStateReference();

    void removeTransportListener(TransportListener transportListener);

    void setTransportStateReference(TransportStateReference transportStateReference);
}
