package org.snmp4j.transport.tls;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.snmp4j.TransportStateReference;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.IpAddress;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class TLSTMExtendedTrustManager extends X509ExtendedTrustManager {
    private static final LogAdapter logger = LogFactory.getLogger(TLSTMExtendedTrustManager.class);
    private TlsTmSecurityCallback<X509Certificate> securityCallback;
    private CounterSupport tlstmCounters;
    private TransportStateReference tmStateReference;
    X509TrustManager trustManager;
    private boolean useClientMode;

    public TLSTMExtendedTrustManager(CounterSupport counterSupport, TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback, X509TrustManager x509TrustManager, boolean z10, TransportStateReference transportStateReference) {
        this.tlstmCounters = counterSupport;
        this.securityCallback = tlsTmSecurityCallback;
        this.trustManager = x509TrustManager;
        this.useClientMode = z10;
        this.tmStateReference = transportStateReference;
    }

    private boolean checkClientTrustedIntern(X509Certificate[] x509CertificateArr) throws CertificateException {
        TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback;
        TransportStateReference transportStateReference = this.tmStateReference;
        if (transportStateReference != null && transportStateReference.getCertifiedIdentity() != null && isMatchingFingerprint(x509CertificateArr, this.tmStateReference.getCertifiedIdentity().getClientFingerprint(), true)) {
            return true;
        }
        if (this.useClientMode || (tlsTmSecurityCallback = this.securityCallback) == null || !tlsTmSecurityCallback.isClientCertificateAccepted(x509CertificateArr[0])) {
            return false;
        }
        LogAdapter logAdapter = logger;
        if (logAdapter.isInfoEnabled()) {
            logAdapter.info("Client is trusted with certificate '" + x509CertificateArr[0] + "'");
        }
        return true;
    }

    private boolean isMatchingFingerprint(X509Certificate[] x509CertificateArr, OctetString octetString, boolean z10) throws CertificateException {
        return TLSTMUtil.isMatchingFingerprint(x509CertificateArr, octetString, z10, this.tlstmCounters, logger, this);
    }

    private void postCheckServerTrusted(X509Certificate[] x509CertificateArr) throws CertificateException {
        TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback;
        if (!this.useClientMode || (tlsTmSecurityCallback = this.securityCallback) == null) {
            return;
        }
        tlsTmSecurityCallback.isServerCertificateAccepted(x509CertificateArr);
    }

    private boolean preCheckServerTrusted(X509Certificate[] x509CertificateArr) throws CertificateException {
        Object name;
        X500Principal subjectX500Principal;
        if (this.tmStateReference.getCertifiedIdentity() != null && TLSTMUtil.isMatchingFingerprint(x509CertificateArr, this.tmStateReference.getCertifiedIdentity().getServerFingerprint(), true, this.tlstmCounters, logger, this)) {
            return true;
        }
        try {
            name = TLSTMUtil.getSubjAltName(x509CertificateArr[0].getSubjectAlternativeNames(), 2);
        } catch (CertificateParsingException unused) {
            logger.error("CertificateParsingException while verifying server certificate " + Arrays.asList(x509CertificateArr));
            name = null;
        }
        if (name == null && (subjectX500Principal = x509CertificateArr[0].getSubjectX500Principal()) != null) {
            name = subjectX500Principal.getName();
        }
        if (name != null) {
            String lowerCase = ((String) name).toLowerCase();
            String canonicalHostName = ((IpAddress) this.tmStateReference.getAddress()).getInetAddress().getCanonicalHostName();
            if (lowerCase.length() > 0) {
                if (lowerCase.charAt(0) == '*') {
                    canonicalHostName = canonicalHostName.substring(canonicalHostName.indexOf(46));
                    lowerCase = lowerCase.substring(1);
                }
                if (canonicalHostName.equalsIgnoreCase(lowerCase)) {
                    LogAdapter logAdapter = logger;
                    if (logAdapter.isInfoEnabled()) {
                        logAdapter.info("Peer hostname " + canonicalHostName + " matches dNSName " + lowerCase);
                    }
                    return true;
                }
            }
            LogAdapter logAdapter2 = logger;
            if (logAdapter2.isDebugEnabled()) {
                logAdapter2.debug("Peer hostname " + canonicalHostName + " did not match dNSName " + lowerCase);
            }
        }
        return false;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (checkClientTrustedIntern(x509CertificateArr)) {
            return;
        }
        try {
            this.trustManager.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e10) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpenErrors));
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidClientCertificates));
            logger.warn("Client certificate validation failed for '" + x509CertificateArr[0] + "'");
            throw e10;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (preCheckServerTrusted(x509CertificateArr)) {
            return;
        }
        try {
            this.trustManager.checkServerTrusted(x509CertificateArr, str);
            postCheckServerTrusted(x509CertificateArr);
        } catch (CertificateException e10) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpenErrors));
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidServerCertificates));
            logger.warn("Server certificate validation failed for '" + x509CertificateArr[0] + "'");
            throw e10;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return TlsTrustManager.getAcceptedIssuers(this.trustManager, this.securityCallback);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        LogAdapter logAdapter = logger;
        logAdapter.debug("checkClientTrusted with socket");
        if (checkClientTrustedIntern(x509CertificateArr)) {
            return;
        }
        try {
            X509TrustManager x509TrustManager = this.trustManager;
            if (x509TrustManager instanceof X509ExtendedTrustManager) {
                logAdapter.debug("Extended checkClientTrusted with socket");
                ((X509ExtendedTrustManager) this.trustManager).checkClientTrusted(x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpenErrors));
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidClientCertificates));
            logger.warn("Client certificate validation failed for '" + x509CertificateArr[0] + "'");
            throw e10;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        LogAdapter logAdapter = logger;
        logAdapter.debug("checkClientTrusted with socket");
        if (preCheckServerTrusted(x509CertificateArr)) {
            return;
        }
        try {
            X509TrustManager x509TrustManager = this.trustManager;
            if (x509TrustManager instanceof X509ExtendedTrustManager) {
                logAdapter.debug("extended checkClientTrusted with socket");
                ((X509ExtendedTrustManager) this.trustManager).checkServerTrusted(x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                postCheckServerTrusted(x509CertificateArr);
            }
        } catch (CertificateException e10) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpenErrors));
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidServerCertificates));
            logger.warn("Server certificate validation failed for '" + x509CertificateArr[0] + "'");
            throw e10;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        LogAdapter logAdapter = logger;
        logAdapter.debug("checkClientTrusted with sslEngine");
        if (checkClientTrustedIntern(x509CertificateArr)) {
            return;
        }
        try {
            X509TrustManager x509TrustManager = this.trustManager;
            if (x509TrustManager instanceof X509ExtendedTrustManager) {
                logAdapter.debug("extended checkClientTrusted with sslEngine");
                ((X509ExtendedTrustManager) this.trustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpenErrors));
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidClientCertificates));
            logger.warn("Client certificate validation failed for '" + x509CertificateArr[0] + "'");
            throw e10;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        LogAdapter logAdapter = logger;
        logAdapter.debug("checkServerTrusted with sslEngine");
        if (preCheckServerTrusted(x509CertificateArr)) {
            return;
        }
        try {
            X509TrustManager x509TrustManager = this.trustManager;
            if (x509TrustManager instanceof X509ExtendedTrustManager) {
                logAdapter.debug("extended checkServerTrusted with sslEngine");
                ((X509ExtendedTrustManager) this.trustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
            postCheckServerTrusted(x509CertificateArr);
        } catch (CertificateException e10) {
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionOpenErrors));
            this.tlstmCounters.fireIncrementCounter(new CounterEvent(this, SnmpConstants.snmpTlstmSessionInvalidServerCertificates));
            logger.warn("Server certificate validation failed for '" + x509CertificateArr[0] + "'");
            throw e10;
        }
    }
}
