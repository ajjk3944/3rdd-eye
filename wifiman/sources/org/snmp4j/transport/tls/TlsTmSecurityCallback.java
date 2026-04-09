package org.snmp4j.transport.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public interface TlsTmSecurityCallback<C extends Certificate> {
    String getLocalCertificateAlias(Address address);

    OctetString getSecurityName(C[] cArr);

    boolean isAcceptedIssuer(C c10) throws CertificateException;

    boolean isClientCertificateAccepted(C c10) throws CertificateException;

    boolean isServerCertificateAccepted(C[] cArr) throws CertificateException;
}
