package org.snmp4j;

import java.io.Serializable;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public abstract class SecureTarget extends AbstractTarget implements Serializable {
    private static final long serialVersionUID = 3864834593299255038L;

    protected SecureTarget() {
    }

    @Override // org.snmp4j.AbstractTarget
    public String toString() {
        return "SecureTarget[" + toStringAbstractTarget() + ']';
    }

    protected SecureTarget(Address address, OctetString octetString) {
        super(address, octetString);
    }
}
