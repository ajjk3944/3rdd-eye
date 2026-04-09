package org.snmp4j.transport.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class TlsTmSecurityCallbackProxy<C extends Certificate> implements TlsTmSecurityCallback<C> {
    private TlsTmSecurityCallback<C> tlsTmSecurityCallback;

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public String getLocalCertificateAlias(Address address) {
        TlsTmSecurityCallback<C> tlsTmSecurityCallback = this.tlsTmSecurityCallback;
        if (tlsTmSecurityCallback == null) {
            return null;
        }
        return tlsTmSecurityCallback.getLocalCertificateAlias(address);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public OctetString getSecurityName(C[] cArr) {
        TlsTmSecurityCallback<C> tlsTmSecurityCallback = this.tlsTmSecurityCallback;
        if (tlsTmSecurityCallback == null) {
            return null;
        }
        return tlsTmSecurityCallback.getSecurityName(cArr);
    }

    public TlsTmSecurityCallback<C> getTlsTmSecurityCallback() {
        return this.tlsTmSecurityCallback;
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isAcceptedIssuer(C c10) throws CertificateException {
        TlsTmSecurityCallback<C> tlsTmSecurityCallback = this.tlsTmSecurityCallback;
        return tlsTmSecurityCallback != null && tlsTmSecurityCallback.isAcceptedIssuer(c10);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isClientCertificateAccepted(C c10) throws CertificateException {
        TlsTmSecurityCallback<C> tlsTmSecurityCallback = this.tlsTmSecurityCallback;
        return tlsTmSecurityCallback != null && tlsTmSecurityCallback.isClientCertificateAccepted(c10);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isServerCertificateAccepted(C[] cArr) throws CertificateException {
        TlsTmSecurityCallback<C> tlsTmSecurityCallback = this.tlsTmSecurityCallback;
        return tlsTmSecurityCallback != null && tlsTmSecurityCallback.isServerCertificateAccepted(cArr);
    }

    public void setTlsTmSecurityCallback(TlsTmSecurityCallback<C> tlsTmSecurityCallback) {
        this.tlsTmSecurityCallback = tlsTmSecurityCallback;
    }
}
