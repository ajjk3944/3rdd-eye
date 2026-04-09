package org.snmp4j;

import org.snmp4j.security.SecurityLevel;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class TransportStateReference {
    private Address address;
    private CertifiedIdentity certifiedIdentity;
    private SecurityLevel requestedSecurityLevel;
    private boolean sameSecurity;
    private OctetString securityName;
    private Object sessionID;
    private TransportMapping transport;
    private SecurityLevel transportSecurityLevel;

    public TransportStateReference(TransportMapping transportMapping, Address address, OctetString octetString, SecurityLevel securityLevel, SecurityLevel securityLevel2, boolean z10, Object obj) {
        this.transport = transportMapping;
        this.address = address;
        this.securityName = octetString;
        this.requestedSecurityLevel = securityLevel;
        this.transportSecurityLevel = securityLevel2;
        this.sameSecurity = z10;
        this.sessionID = obj;
    }

    public Address getAddress() {
        return this.address;
    }

    public CertifiedIdentity getCertifiedIdentity() {
        return this.certifiedIdentity;
    }

    public SecurityLevel getRequestedSecurityLevel() {
        return this.requestedSecurityLevel;
    }

    public OctetString getSecurityName() {
        return this.securityName;
    }

    public Object getSessionID() {
        return this.sessionID;
    }

    public TransportMapping getTransport() {
        return this.transport;
    }

    public SecurityLevel getTransportSecurityLevel() {
        return this.transportSecurityLevel;
    }

    public boolean isSameSecurity() {
        return this.sameSecurity;
    }

    public boolean isTransportSecurityValid() {
        return (this.transport == null || this.address == null || this.securityName == null || this.transportSecurityLevel == null) ? false : true;
    }

    public void setRequestedSecurityLevel(SecurityLevel securityLevel) {
        this.requestedSecurityLevel = securityLevel;
    }

    public void setSameSecurity(boolean z10) {
        this.sameSecurity = z10;
    }

    public void setSecurityName(OctetString octetString) {
        this.securityName = octetString;
    }

    public void setTransportSecurityLevel(SecurityLevel securityLevel) {
        this.transportSecurityLevel = securityLevel;
    }

    public String toString() {
        return "TransportStateReference[transport=" + this.transport + ", address=" + this.address + ", securityName=" + this.securityName + ", requestedSecurityLevel=" + this.requestedSecurityLevel + ", transportSecurityLevel=" + this.transportSecurityLevel + ", sameSecurity=" + this.sameSecurity + ", sessionID=" + this.sessionID + ", certifiedIdentity=" + this.certifiedIdentity + ']';
    }

    public TransportStateReference(TransportMapping transportMapping, Address address, OctetString octetString, SecurityLevel securityLevel, SecurityLevel securityLevel2, boolean z10, Object obj, CertifiedIdentity certifiedIdentity) {
        this(transportMapping, address, octetString, securityLevel, securityLevel2, z10, obj);
        this.certifiedIdentity = certifiedIdentity;
    }
}
