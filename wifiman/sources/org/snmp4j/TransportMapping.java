package org.snmp4j;

import java.io.IOException;
import org.snmp4j.smi.Address;
import org.snmp4j.transport.TransportListener;

/* loaded from: classes2.dex */
public interface TransportMapping<A extends Address> {
    void addTransportListener(TransportListener transportListener);

    void close() throws IOException;

    A getListenAddress();

    int getMaxInboundMessageSize();

    Class<? extends Address> getSupportedAddressClass();

    boolean isListening();

    void listen() throws IOException;

    void removeTransportListener(TransportListener transportListener);

    void sendMessage(A a10, byte[] bArr, TransportStateReference transportStateReference) throws IOException;
}
