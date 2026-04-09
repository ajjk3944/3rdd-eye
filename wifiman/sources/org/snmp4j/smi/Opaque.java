package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class Opaque extends OctetString {
    private static final long serialVersionUID = -17056771587100877L;

    public Opaque() {
    }

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new Opaque(super.getValue());
    }

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        byte[] bArrDecodeString = BER.decodeString(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 68) {
            setValue(bArrDecodeString);
            return;
        }
        throw new IOException("Wrong type encountered when decoding OctetString: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeString(outputStream, BER.OPAQUE, getValue());
    }

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 68;
    }

    public void setValue(OctetString octetString) {
        setValue(new byte[0]);
        append(octetString);
    }

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return super.toHexString();
    }

    public Opaque(byte[] bArr) {
        super(bArr);
    }
}
