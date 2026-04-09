package org.xbill.DNS;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public class NSAPRecord extends Record {
    private static final long serialVersionUID = -1037209403185658593L;
    private byte[] address;

    public NSAPRecord() {
    }

    private static final byte[] checkAndConvertAddress(String str) {
        if (!str.substring(0, 2).equalsIgnoreCase("0x")) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 2; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '.') {
                int iDigit = Character.digit(cCharAt, 16);
                if (iDigit == -1) {
                    return null;
                }
                if (z10) {
                    i10 += iDigit;
                    byteArrayOutputStream.write(i10);
                    z10 = false;
                } else {
                    i10 = iDigit << 4;
                    z10 = true;
                }
            }
        }
        if (z10) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String getAddress() {
        return Record.byteArrayToString(this.address, false);
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NSAPRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        String string = tokenizer.getString();
        byte[] bArrCheckAndConvertAddress = checkAndConvertAddress(string);
        this.address = bArrCheckAndConvertAddress;
        if (bArrCheckAndConvertAddress != null) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("invalid NSAP address ");
        stringBuffer.append(string);
        throw tokenizer.exception(stringBuffer.toString());
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.address = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("0x");
        stringBuffer.append(base16.toString(this.address));
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        dNSOutput.writeByteArray(this.address);
    }

    public NSAPRecord(Name name, int i10, long j10, String str) {
        super(name, 22, i10, j10);
        byte[] bArrCheckAndConvertAddress = checkAndConvertAddress(str);
        this.address = bArrCheckAndConvertAddress;
        if (bArrCheckAndConvertAddress != null) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("invalid NSAP address ");
        stringBuffer.append(str);
        throw new IllegalArgumentException(stringBuffer.toString());
    }
}
