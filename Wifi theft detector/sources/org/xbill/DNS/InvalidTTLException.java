package org.xbill.DNS;

/* loaded from: classes4.dex */
public class InvalidTTLException extends IllegalArgumentException {
    public InvalidTTLException(long j10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid DNS TTL: ");
        stringBuffer.append(j10);
        super(stringBuffer.toString());
    }
}
