package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class UnsignedInteger32 extends AbstractVariable implements AssignableFromLong, AssignableFromString {
    private static final long serialVersionUID = -2155365655395258383L;
    protected long value = 0;

    public UnsignedInteger32() {
    }

    public static int getBERLengthFromValue(long j10) {
        if (j10 < 128) {
            return 3;
        }
        if (j10 < 32768) {
            return 4;
        }
        if (j10 < 8388608) {
            return 5;
        }
        return j10 < 2147483648L ? 6 : 7;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new UnsignedInteger32(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        long jDecodeUnsignedInteger = BER.decodeUnsignedInteger(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 66) {
            setValue(jDecodeUnsignedInteger);
            return;
        }
        throw new IOException("Wrong type encountered when decoding Gauge: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeUnsignedInteger(outputStream, (byte) 66, this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof UnsignedInteger32) && ((UnsignedInteger32) obj).value == this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public void fromSubIndex(OID oid, boolean z10) {
        setValue(oid.getUnsigned(0));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        return getBERLengthFromValue(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 66;
    }

    public long getValue() {
        return this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return (int) this.value;
    }

    public void setValue(String str) {
        setValue(Long.parseLong(str));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final int toInt() {
        return (int) getValue();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final long toLong() {
        return getValue();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return Long.toString(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public OID toSubIndex(boolean z10) {
        return new OID(new int[]{toInt()});
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public int compareTo(Variable variable) {
        long value = this.value - ((UnsignedInteger32) variable).getValue();
        if (value < 0) {
            return -1;
        }
        return value > 0 ? 1 : 0;
    }

    @Override // org.snmp4j.smi.AssignableFromLong
    public void setValue(long j10) {
        if (j10 < 0 || j10 > Counter32.MAX_COUNTER32_VALUE) {
            throw new IllegalArgumentException("Argument must be an unsigned 32bit value");
        }
        this.value = j10;
    }

    public UnsignedInteger32(long j10) {
        setValue(j10);
    }

    public UnsignedInteger32(int i10) {
        setValue(i10 & Counter32.MAX_COUNTER32_VALUE);
    }

    public UnsignedInteger32(byte b10) {
        setValue(b10 & 255);
    }
}
