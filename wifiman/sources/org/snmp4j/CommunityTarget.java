package org.snmp4j;

import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class CommunityTarget extends AbstractTarget {
    static final long serialVersionUID = 147443821594052003L;

    public CommunityTarget() {
        setVersion(0);
        setSecurityLevel(1);
        setSecurityModel(1);
    }

    @Override // org.snmp4j.Target
    public Target duplicate() {
        CommunityTarget communityTarget = new CommunityTarget(getAddress(), getCommunity());
        communityTarget.setSecurityModel(getSecurityModel());
        communityTarget.setSecurityLevel(getSecurityLevel());
        communityTarget.setRetries(getRetries());
        communityTarget.setTimeout(getTimeout());
        communityTarget.setVersion(getVersion());
        communityTarget.setMaxSizeRequestPDU(getMaxSizeRequestPDU());
        communityTarget.setPreferredTransports(getPreferredTransports());
        return communityTarget;
    }

    public OctetString getCommunity() {
        return getSecurityName();
    }

    @Override // org.snmp4j.AbstractTarget, org.snmp4j.Target
    public int getSecurityModel() {
        return getVersion() != 0 ? 2 : 1;
    }

    public void setCommunity(OctetString octetString) {
        if (octetString == null) {
            throw new IllegalArgumentException("Community must not be null");
        }
        setSecurityName(octetString);
    }

    @Override // org.snmp4j.AbstractTarget, org.snmp4j.Target
    public void setSecurityLevel(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("CommunityTarget only supports SecurityLevel.NOAUTH_NOPRIV");
        }
        super.setSecurityLevel(i10);
    }

    @Override // org.snmp4j.AbstractTarget, org.snmp4j.Target
    public void setSecurityModel(int i10) {
        if (i10 == 1) {
            super.setSecurityModel(i10);
            super.setVersion(0);
        } else {
            if (i10 != 2) {
                throw new UnsupportedOperationException("To set security model for a CommunityTarget, use setVersion");
            }
            super.setSecurityModel(i10);
            super.setVersion(1);
        }
    }

    @Override // org.snmp4j.AbstractTarget
    public String toString() {
        return "CommunityTarget[" + toStringAbstractTarget() + ']';
    }

    public CommunityTarget(Address address, OctetString octetString) {
        super(address, octetString);
        setVersion(0);
        setSecurityLevel(1);
        setSecurityModel(1);
    }
}
