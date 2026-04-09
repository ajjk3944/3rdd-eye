package org.xbill.DNS;

/* loaded from: classes4.dex */
public class InvalidDClassException extends IllegalArgumentException {
    public InvalidDClassException(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid DNS class: ");
        stringBuffer.append(i10);
        super(stringBuffer.toString());
    }
}
