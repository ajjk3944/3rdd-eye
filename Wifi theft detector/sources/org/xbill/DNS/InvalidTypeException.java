package org.xbill.DNS;

/* loaded from: classes4.dex */
public class InvalidTypeException extends IllegalArgumentException {
    public InvalidTypeException(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid DNS type: ");
        stringBuffer.append(i10);
        super(stringBuffer.toString());
    }
}
