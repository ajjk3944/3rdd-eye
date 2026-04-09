package org.snmp4j.transport.tls;

import java.security.cert.X509Certificate;
import org.snmp4j.CertifiedTarget;
import org.snmp4j.Target;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class TlsX509CertifiedTarget extends CertifiedTarget {
    private static final long serialVersionUID = -1980959130605037036L;
    private TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback;

    public TlsX509CertifiedTarget(Address address, OctetString octetString, OctetString octetString2, OctetString octetString3, TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback) {
        super(address, octetString, octetString2, octetString3);
        this.tlsTmSecurityCallback = tlsTmSecurityCallback;
    }

    @Override // org.snmp4j.CertifiedTarget, org.snmp4j.Target
    public Target duplicate() {
        TlsX509CertifiedTarget tlsX509CertifiedTarget = new TlsX509CertifiedTarget(getAddress(), getIdentity(), getServerFingerprint(), getClientFingerprint(), this.tlsTmSecurityCallback);
        tlsX509CertifiedTarget.setRetries(getRetries());
        tlsX509CertifiedTarget.setTimeout(getTimeout());
        tlsX509CertifiedTarget.setMaxSizeRequestPDU(getMaxSizeRequestPDU());
        tlsX509CertifiedTarget.setPreferredTransports(getPreferredTransports());
        tlsX509CertifiedTarget.setVersion(getVersion());
        tlsX509CertifiedTarget.setSecurityLevel(getSecurityLevel());
        tlsX509CertifiedTarget.setSecurityModel(getSecurityModel());
        return tlsX509CertifiedTarget;
    }

    public TlsTmSecurityCallback<X509Certificate> getTlsTmSecurityCallback() {
        return this.tlsTmSecurityCallback;
    }
}
