package org.snmp4j.transport;

import java.nio.ByteBuffer;
import org.snmp4j.TransportMapping;
import org.snmp4j.TransportStateReference;
import org.snmp4j.smi.Address;

/* loaded from: classes2.dex */
public interface TransportListener {
    void processMessage(TransportMapping transportMapping, Address address, ByteBuffer byteBuffer, TransportStateReference transportStateReference);
}
