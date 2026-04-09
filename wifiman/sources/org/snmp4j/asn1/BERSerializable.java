package org.snmp4j.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public interface BERSerializable {
    void decodeBER(BERInputStream bERInputStream) throws IOException;

    void encodeBER(OutputStream outputStream) throws IOException;

    int getBERLength();

    int getBERPayloadLength();
}
