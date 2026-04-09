package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class Counter32 extends UnsignedInteger32 {
    public static final long MAX_COUNTER32_VALUE = 4294967295L;
    private static final long serialVersionUID = 6140742767439142144L;

    public Counter32() {
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new Counter32(this.value);
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        long jDecodeUnsignedInteger = BER.decodeUnsignedInteger(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 65) {
            setValue(jDecodeUnsignedInteger);
            return;
        }
        throw new IOException("Wrong type encountered when decoding Counter: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeUnsignedInteger(outputStream, (byte) 65, getValue());
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof Counter32) && ((Counter32) obj).getValue() == getValue();
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public void fromSubIndex(OID oid, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 65;
    }

    public void increment() {
        long j10 = this.value;
        if (j10 < MAX_COUNTER32_VALUE) {
            this.value = j10 + 1;
        } else {
            this.value = 0L;
        }
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public OID toSubIndex(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public Counter32(long j10) {
        super(j10);
    }

    public long increment(long j10) {
        if (j10 > 0) {
            long j11 = this.value;
            if (j11 + j10 < MAX_COUNTER32_VALUE) {
                this.value = j11 + j10;
            } else {
                this.value = j10 - (MAX_COUNTER32_VALUE - j11);
            }
        } else if (j10 < 0) {
            throw new IllegalArgumentException("Negative increments not allowed for counters: " + j10);
        }
        return this.value;
    }
}
