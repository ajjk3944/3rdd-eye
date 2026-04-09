package org.snmp4j;

import java.io.IOException;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.event.ResponseListener;

/* loaded from: classes2.dex */
public interface Session {
    void cancel(PDU pdu, ResponseListener responseListener);

    void close() throws IOException;

    ResponseEvent send(PDU pdu, Target target) throws IOException;

    ResponseEvent send(PDU pdu, Target target, TransportMapping transportMapping) throws IOException;

    void send(PDU pdu, Target target, Object obj, ResponseListener responseListener) throws IOException;

    void send(PDU pdu, Target target, TransportMapping transportMapping, Object obj, ResponseListener responseListener) throws IOException;
}
