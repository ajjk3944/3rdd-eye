package org.snmp4j.transport.tls;

import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.snmp4j.TransportStateReference;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class TlsTrustManager implements X509TrustManager {
    private static LogAdapter LOGGER = LogFactory.getLogger(TlsTrustManager.class);
    private TlsTmSecurityCallback<X509Certificate> securityCallback;
    private CounterSupport tlstmCounters;
    private TransportStateReference tmStateReference;
    X509TrustManager trustManager;
    private boolean useClientMode;

    public TlsTrustManager(X509TrustManager x509TrustManager, boolean z10, TransportStateReference transportStateReference, CounterSupport counterSupport, TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback) {
        this.trustManager = x509TrustManager;
        this.useClientMode = z10;
        this.tmStateReference = transportStateReference;
        this.tlstmCounters = counterSupport;
        this.securityCallback = tlsTmSecurityCallback;
    }

    private boolean isMatchingFingerprint(X509Certificate[] x509CertificateArr, OctetString octetString, boolean z10) throws NoSuchAlgorithmException, CertificateException {
        if (octetString == null || octetString.length() <= 0) {
            return false;
        }
        for (X509Certificate x509Certificate : x509CertificateArr) {
            OctetString fingerprint = TLSTMUtil.getFingerprint(x509Certificate);
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Comparing certificate fingerprint " + fingerprint + " with " + octetString);
            }
            if (fingerprint == null) {
                LOGGER.error("Failed to determine fingerprint for certificate " + x509Certificate + " and algorithm " + x509Certificate.getSigAlgName());
            } else if (fingerprint.equals(octetString)) {
                if (!LOGGER.isInfoEnabled()) {
                    return true;
                }
                LOGGER.info("Peer is trusted by fingerprint '" + octetString + "' of certificate: '" + x509Certificate + "'");
                return true;
            }
        }
        this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, z10 ? SnmpConstants.snmpTlstmSessionInvalidServerCertificates : SnmpConstants.snmpTlstmSessionInvalidClientCertificates));
        throw new CertificateException("No fingerprint of provided certificates " + Arrays.asList(x509CertificateArr) + " matched " + octetString.toHexString());
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        TransportStateReference transportStateReference = this.tmStateReference;
        if (transportStateReference != null && transportStateReference.getCertifiedIdentity() != null) {
            OctetString clientFingerprint = this.tmStateReference.getCertifiedIdentity().getClientFingerprint();
            if (isMatchingFingerprint(x509CertificateArr, clientFingerprint, false)) {
                return;
            }
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidClientCertificates));
            throw new CertificateException("Client certificate validation by fingerprint failed for '" + x509CertificateArr[0] + "' (does not match " + clientFingerprint.toHexString() + ")");
        }
        TlsTmSecurityCallback<X509Certificate> securityCallback = getSecurityCallback();
        try {
            if (this.useClientMode || securityCallback == null) {
                this.trustManager.checkClientTrusted(x509CertificateArr, str);
                return;
            }
            if (!securityCallback.isClientCertificateAccepted(x509CertificateArr[0])) {
                this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidClientCertificates));
                throw new CertificateException("Client certificate validation by fingerprint failed for '" + x509CertificateArr[0] + "'");
            }
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Client is trusted with certificate '" + x509CertificateArr[0] + "'");
            }
        } catch (CertificateException e10) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpenErrors));
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidClientCertificates));
            LOGGER.warn("Client certificate validation failed for '" + x509CertificateArr[0] + "'");
            throw e10;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        OctetString serverFingerprint;
        X500Principal subjectX500Principal;
        Object name = null;
        if (this.tmStateReference.getCertifiedIdentity() != null) {
            serverFingerprint = this.tmStateReference.getCertifiedIdentity().getServerFingerprint();
            if (isMatchingFingerprint(x509CertificateArr, serverFingerprint, true)) {
                return;
            }
        } else {
            serverFingerprint = null;
        }
        try {
            name = TLSTMUtil.getSubjAltName(x509CertificateArr[0].getSubjectAlternativeNames(), 2);
        } catch (CertificateParsingException unused) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidServerCertificates));
            LOGGER.warn("CertificateParsingException while verifying server certificate " + Arrays.asList(x509CertificateArr));
        }
        if (name == null && (subjectX500Principal = x509CertificateArr[0].getSubjectX500Principal()) != null) {
            name = subjectX500Principal.getName();
        }
        if (name != null && serverFingerprint != null && serverFingerprint.length() == 0 && this.tmStateReference.getCertifiedIdentity() != null && this.tmStateReference.getCertifiedIdentity().getIdentity() != null) {
            String lowerCase = ((String) name).toLowerCase();
            String string = this.tmStateReference.getCertifiedIdentity().getIdentity().toString();
            if (string.length() > 0) {
                if (string.charAt(0) == '*') {
                    int iIndexOf = lowerCase.indexOf(46);
                    if (iIndexOf > 0) {
                        lowerCase = lowerCase.substring(iIndexOf);
                    }
                    string = string.substring(1);
                }
                if (string.equalsIgnoreCase(lowerCase)) {
                    if (LOGGER.isInfoEnabled()) {
                        LOGGER.info("Peer hostname " + string + " matches dNSName " + lowerCase);
                        return;
                    }
                    return;
                }
            }
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Peer hostname " + string + " did not match dNSName " + lowerCase);
            }
        }
        try {
            this.trustManager.checkServerTrusted(x509CertificateArr, str);
            TlsTmSecurityCallback<X509Certificate> securityCallback = getSecurityCallback();
            if (!this.useClientMode || securityCallback == null || securityCallback.isServerCertificateAccepted(x509CertificateArr)) {
                return;
            }
            LOGGER.info("Server is NOT trusted with certificate '" + Arrays.asList(x509CertificateArr) + "'");
            throw new CertificateException("Server's certificate is not trusted by this application (although it was trusted by the JRE): " + Arrays.asList(x509CertificateArr));
        } catch (CertificateException e10) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpenErrors));
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidServerCertificates));
            LOGGER.warn("Server certificate validation failed for '" + x509CertificateArr[0] + "'");
            throw e10;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return getAcceptedIssuers(this.trustManager, getSecurityCallback());
    }

    protected TlsTmSecurityCallback<X509Certificate> getSecurityCallback() {
        TlsX509CertifiedTarget tlsX509CertifiedTarget;
        return (!(this.tmStateReference.getCertifiedIdentity() instanceof TlsX509CertifiedTarget) || (tlsX509CertifiedTarget = (TlsX509CertifiedTarget) this.tmStateReference.getCertifiedIdentity()) == null || tlsX509CertifiedTarget.getTlsTmSecurityCallback() == null) ? this.securityCallback : tlsX509CertifiedTarget.getTlsTmSecurityCallback();
    }

    public static X509Certificate[] getAcceptedIssuers(X509TrustManager x509TrustManager, TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        if (acceptedIssuers == null || tlsTmSecurityCallback == null) {
            return acceptedIssuers;
        }
        ArrayList arrayList = new ArrayList(acceptedIssuers.length);
        for (X509Certificate x509Certificate : acceptedIssuers) {
            try {
                if (tlsTmSecurityCallback.isAcceptedIssuer(x509Certificate)) {
                    arrayList.add(x509Certificate);
                }
            } catch (CertificateException unused) {
                LOGGER.debug("Security callback " + tlsTmSecurityCallback + " rejected " + x509Certificate);
            }
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
    }
}
