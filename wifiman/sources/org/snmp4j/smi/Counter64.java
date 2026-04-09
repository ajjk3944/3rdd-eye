package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class Counter64 extends AbstractVariable implements AssignableFromLong, AssignableFromString {
    private static final long serialVersionUID = 8741539680564150071L;
    private long value = 0;

    public Counter64() {
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new Counter64(this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        long jDecodeUnsignedInt64 = BER.decodeUnsignedInt64(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 70) {
            setValue(jDecodeUnsignedInt64);
            return;
        }
        throw new IOException("Wrong type encountered when decoding Counter64: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeUnsignedInt64(outputStream, BER.COUNTER64, this.value);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof Counter64) && ((Counter64) obj).value == this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public void fromSubIndex(OID oid, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        long j10 = this.value;
        if (j10 < 0) {
            return 11;
        }
        return j10 < 2147483648L ? j10 < 32768 ? j10 < 128 ? 3 : 4 : j10 < 8388608 ? 5 : 6 : j10 < 140737488355328L ? j10 < 549755813888L ? 7 : 8 : j10 < 36028797018963968L ? 9 : 10;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 70;
    }

    public long getValue() {
        return this.value;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return (int) this.value;
    }

    public void increment() {
        this.value++;
    }

    @Override // org.snmp4j.smi.AssignableFromString
    public void setValue(String str) {
        this.value = Long.parseLong(str);
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
        long j10 = this.value;
        if (j10 > 0 && j10 < Long.MAX_VALUE) {
            return Long.toString(j10);
        }
        byte[] bArr = new byte[8];
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[i10] = (byte) ((this.value >> ((7 - i10) * 8)) & 255);
        }
        return new BigInteger(1, bArr).toString();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public OID toSubIndex(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public int compareTo(Variable variable) {
        long j10 = ((Counter64) variable).value;
        for (int i10 = 63; i10 >= 0; i10--) {
            long j11 = this.value;
            if (((j11 >> i10) & 1) != ((j10 >> i10) & 1)) {
                return ((j11 >> i10) & 1) != 0 ? 1 : -1;
            }
        }
        return 0;
    }

    public long increment(long j10) {
        if (j10 >= 0) {
            long j11 = this.value + j10;
            this.value = j11;
            return j11;
        }
        throw new IllegalArgumentException("Counter64 allows only positive increments: " + j10);
    }

    @Override // org.snmp4j.smi.AssignableFromLong
    public void setValue(long j10) {
        this.value = j10;
    }

    public Counter64(long j10) {
        setValue(j10);
    }
}
