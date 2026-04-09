package org.snmp4j.transport;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface MessageLengthDecoder {
    MessageLength getMessageLength(ByteBuffer byteBuffer) throws IOException;

    int getMinHeaderLength();
}
