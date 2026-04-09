package org.snmp4j.smi;

/* loaded from: classes2.dex */
public class SubIndexInfoImpl implements SubIndexInfo {
    private boolean impliedLength;
    private int maxLength;
    private int minLength;
    private int snmpSyntax;

    public SubIndexInfoImpl(boolean z10, int i10, int i11, int i12) {
        this.impliedLength = z10;
        this.maxLength = i11;
        this.minLength = i10;
        this.snmpSyntax = i12;
    }

    @Override // org.snmp4j.smi.SubIndexInfo
    public int getMaxLength() {
        return this.maxLength;
    }

    @Override // org.snmp4j.smi.SubIndexInfo
    public int getMinLength() {
        return this.minLength;
    }

    @Override // org.snmp4j.smi.SubIndexInfo
    public int getSnmpSyntax() {
        return this.snmpSyntax;
    }

    @Override // org.snmp4j.smi.SubIndexInfo
    public boolean hasImpliedLength() {
        return this.impliedLength;
    }
}
