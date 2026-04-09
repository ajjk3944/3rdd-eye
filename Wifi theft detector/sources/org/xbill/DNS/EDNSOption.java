package org.xbill.DNS;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class EDNSOption {
    private final int code;

    public static class Code {
        public static final int CLIENT_SUBNET = 8;
        public static final int NSID = 3;
        private static Mnemonic codes;

        static {
            Mnemonic mnemonic = new Mnemonic("EDNS Option Codes", 2);
            codes = mnemonic;
            mnemonic.setMaximum(65535);
            codes.setPrefix("CODE");
            codes.setNumericAllowed(true);
            codes.add(3, "NSID");
            codes.add(8, "CLIENT_SUBNET");
        }

        private Code() {
        }

        public static String string(int i10) {
            return codes.getText(i10);
        }

        public static int value(String str) {
            return codes.getValue(str);
        }
    }

    public EDNSOption(int i10) {
        this.code = Record.checkU16("code", i10);
    }

    public static EDNSOption fromWire(DNSInput dNSInput) throws IOException {
        int u16 = dNSInput.readU16();
        int u162 = dNSInput.readU16();
        if (dNSInput.remaining() < u162) {
            throw new WireParseException("truncated option");
        }
        int iSaveActive = dNSInput.saveActive();
        dNSInput.setActive(u162);
        EDNSOption genericEDNSOption = u16 != 3 ? u16 != 8 ? new GenericEDNSOption(u16) : new ClientSubnetOption() : new NSIDOption();
        genericEDNSOption.optionFromWire(dNSInput);
        dNSInput.restoreActive(iSaveActive);
        return genericEDNSOption;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof EDNSOption)) {
            return false;
        }
        EDNSOption eDNSOption = (EDNSOption) obj;
        if (this.code != eDNSOption.code) {
            return false;
        }
        return Arrays.equals(getData(), eDNSOption.getData());
    }

    public int getCode() {
        return this.code;
    }

    public byte[] getData() {
        DNSOutput dNSOutput = new DNSOutput();
        optionToWire(dNSOutput);
        return dNSOutput.toByteArray();
    }

    public int hashCode() {
        int i10 = 0;
        for (byte b10 : getData()) {
            i10 += (i10 << 3) + (b10 & 255);
        }
        return i10;
    }

    public abstract void optionFromWire(DNSInput dNSInput) throws IOException;

    public abstract String optionToString();

    public abstract void optionToWire(DNSOutput dNSOutput);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(Code.string(this.code));
        stringBuffer.append(": ");
        stringBuffer.append(optionToString());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput) {
        dNSOutput.writeU16(this.code);
        int iCurrent = dNSOutput.current();
        dNSOutput.writeU16(0);
        optionToWire(dNSOutput);
        dNSOutput.writeU16At((dNSOutput.current() - iCurrent) - 2, iCurrent);
    }

    public byte[] toWire() throws IOException {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput);
        return dNSOutput.toByteArray();
    }

    public static EDNSOption fromWire(byte[] bArr) throws IOException {
        return fromWire(new DNSInput(bArr));
    }
}
