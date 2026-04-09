package org.xbill.DNS;

import java.io.IOException;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public class GenericEDNSOption extends EDNSOption {
    private byte[] data;

    public GenericEDNSOption(int i10) {
        super(i10);
    }

    @Override // org.xbill.DNS.EDNSOption
    public void optionFromWire(DNSInput dNSInput) throws IOException {
        this.data = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.EDNSOption
    public String optionToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<");
        stringBuffer.append(base16.toString(this.data));
        stringBuffer.append(">");
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.EDNSOption
    public void optionToWire(DNSOutput dNSOutput) {
        dNSOutput.writeByteArray(this.data);
    }

    public GenericEDNSOption(int i10, byte[] bArr) {
        super(i10);
        this.data = Record.checkByteArrayLength("option data", bArr, 65535);
    }
}
