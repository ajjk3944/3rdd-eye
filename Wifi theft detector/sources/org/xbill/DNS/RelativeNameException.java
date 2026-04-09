package org.xbill.DNS;

/* loaded from: classes4.dex */
public class RelativeNameException extends IllegalArgumentException {
    public RelativeNameException(Name name) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("'");
        stringBuffer.append(name);
        stringBuffer.append("' is not an absolute name");
        super(stringBuffer.toString());
    }

    public RelativeNameException(String str) {
        super(str);
    }
}
