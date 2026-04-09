package org.snmp4j;

import java.io.Serializable;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TlsAddress;

/* loaded from: classes2.dex */
public class CertifiedTarget extends SecureTarget implements CertifiedIdentity, Serializable {
    private static final long serialVersionUID = 1;
    private OctetString clientFingerprint;
    private OctetString serverFingerprint;

    public CertifiedTarget(OctetString octetString) {
        super(new TlsAddress(), octetString);
        setSecurityModel(4);
    }

    @Override // org.snmp4j.Target
    public Target duplicate() {
        CertifiedTarget certifiedTarget = new CertifiedTarget(getAddress(), getIdentity(), this.serverFingerprint, this.clientFingerprint);
        certifiedTarget.setRetries(getRetries());
        certifiedTarget.setTimeout(getTimeout());
        certifiedTarget.setMaxSizeRequestPDU(getMaxSizeRequestPDU());
        certifiedTarget.setPreferredTransports(getPreferredTransports());
        certifiedTarget.setVersion(getVersion());
        certifiedTarget.setSecurityLevel(getSecurityLevel());
        certifiedTarget.setSecurityModel(getSecurityModel());
        return certifiedTarget;
    }

    @Override // org.snmp4j.CertifiedIdentity
    public OctetString getClientFingerprint() {
        return this.clientFingerprint;
    }

    @Override // org.snmp4j.CertifiedIdentity
    public OctetString getIdentity() {
        return super.getSecurityName();
    }

    @Override // org.snmp4j.CertifiedIdentity
    public OctetString getServerFingerprint() {
        return this.serverFingerprint;
    }

    @Override // org.snmp4j.SecureTarget, org.snmp4j.AbstractTarget
    public String toString() {
        return "CertifiedTarget[" + toStringAbstractTarget() + ", serverFingerprint=" + this.serverFingerprint + ", clientFingerprint=" + this.clientFingerprint + ']';
    }

    public CertifiedTarget(Address address, OctetString octetString, OctetString octetString2, OctetString octetString3) {
        super(address, octetString);
        this.serverFingerprint = octetString2;
        this.clientFingerprint = octetString3;
        setSecurityModel(4);
    }
}
