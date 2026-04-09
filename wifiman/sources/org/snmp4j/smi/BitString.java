package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class BitString extends OctetString {
    private static final long serialVersionUID = -8739361280962307248L;

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        BitString bitString = new BitString();
        bitString.setValue(super.getValue());
        return bitString;
    }

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        byte[] bArrDecodeString = BER.decodeString(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 3) {
            setValue(bArrDecodeString);
            return;
        }
        throw new IOException("Wrong type encountered when decoding BitString: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeString(outputStream, (byte) 3, getValue());
    }

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 3;
    }
}
