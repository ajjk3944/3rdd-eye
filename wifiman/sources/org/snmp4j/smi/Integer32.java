package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class Integer32 extends AbstractVariable implements AssignableFromInteger, AssignableFromString {
    private static final long serialVersionUID = 5046132399890132416L;
    private int value = 0;

    public Integer32() {
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new Integer32(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        int iDecodeInteger = BER.decodeInteger(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 2) {
            setValue(iDecodeInteger);
            return;
        }
        throw new IOException("Wrong type encountered when decoding Counter: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeInteger(outputStream, (byte) 2, this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof Integer32) && ((Integer32) obj).value == this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public void fromSubIndex(OID oid, boolean z10) {
        setValue(oid.get(0));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        int i10 = this.value;
        if (i10 < 128 && i10 >= -128) {
            return 3;
        }
        if (i10 >= 32768 || i10 < -32768) {
            return (i10 >= 8388608 || i10 < -8388608) ? 6 : 5;
        }
        return 4;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 2;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return this.value;
    }

    @Override // org.snmp4j.smi.AssignableFromString
    public final void setValue(String str) {
        this.value = Integer.parseInt(str);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final int toInt() {
        return getValue();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final long toLong() {
        return getValue();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return Integer.toString(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public OID toSubIndex(boolean z10) {
        return new OID(new int[]{this.value});
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public int compareTo(Variable variable) {
        return this.value - ((Integer32) variable).value;
    }

    @Override // org.snmp4j.smi.AssignableFromInteger
    public final void setValue(int i10) {
        this.value = i10;
    }

    public Integer32(int i10) {
        setValue(i10);
    }
}
