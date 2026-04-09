package org.snmp4j.smi;

/* loaded from: classes2.dex */
public class Gauge32 extends UnsignedInteger32 {
    static final long serialVersionUID = 1469573439175461445L;

    public Gauge32() {
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new Gauge32(this.value);
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 66;
    }

    public Gauge32(long j10) {
        super(j10);
    }
}
