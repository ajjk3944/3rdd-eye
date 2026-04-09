package org.snmp4j.smi;

/* loaded from: classes2.dex */
public interface Address extends AssignableFromString, AssignableFromByteArray {
    boolean isValid();

    boolean parseAddress(String str);

    @Override // org.snmp4j.smi.AssignableFromString
    void setValue(String str);
}
