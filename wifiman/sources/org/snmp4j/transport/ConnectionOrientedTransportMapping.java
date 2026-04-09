package org.snmp4j.transport;

import java.io.IOException;
import org.snmp4j.TransportMapping;
import org.snmp4j.smi.Address;

/* loaded from: classes2.dex */
public interface ConnectionOrientedTransportMapping<A extends Address> extends TransportMapping<A> {
    void addTransportStateListener(TransportStateListener transportStateListener);

    boolean close(A a10) throws IOException;

    MessageLengthDecoder getMessageLengthDecoder();

    void removeTransportStateListener(TransportStateListener transportStateListener);

    boolean resumeAddress(A a10);

    void setConnectionTimeout(long j10);

    void setMessageLengthDecoder(MessageLengthDecoder messageLengthDecoder);

    void suspendAddress(A a10);
}
