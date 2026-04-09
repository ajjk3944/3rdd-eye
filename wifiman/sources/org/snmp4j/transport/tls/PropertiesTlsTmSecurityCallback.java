package org.snmp4j.transport.tls;

import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Properties;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes2.dex */
public class PropertiesTlsTmSecurityCallback implements TlsTmSecurityCallback<X509Certificate> {
    private static final LogAdapter LOGGER = LogFactory.getLogger(PropertiesTlsTmSecurityCallback.class);
    private Properties properties;
    private boolean serverMode;

    public PropertiesTlsTmSecurityCallback(boolean z10) {
        this(System.getProperties(), z10);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public String getLocalCertificateAlias(Address address) {
        return this.properties.getProperty(SnmpConfigurator.P_TLS_LOCAL_ID);
    }

    public PropertiesTlsTmSecurityCallback(Properties properties, boolean z10) {
        this.serverMode = z10;
        properties.getClass();
        this.properties = properties;
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public OctetString getSecurityName(X509Certificate[] x509CertificateArr) {
        String property = this.properties.getProperty(SnmpConfigurator.P_SECURITY_NAME, null);
        if (property != null) {
            return new OctetString(property);
        }
        return null;
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isAcceptedIssuer(X509Certificate x509Certificate) throws CertificateException {
        String property = this.properties.getProperty(SnmpConfigurator.P_TLS_TRUST_CA, "");
        if (property.length() == 0) {
            return false;
        }
        if (x509Certificate != null && x509Certificate.getIssuerDN().getName().equals(property)) {
            return true;
        }
        throw new CertificateException("Issuer certificate " + x509Certificate + " does not have accepted DN: " + property);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isClientCertificateAccepted(X509Certificate x509Certificate) throws CertificateException {
        String property = this.properties.getProperty(SnmpConfigurator.P_TLS_LOCAL_ID, "");
        if (this.serverMode) {
            property = this.properties.getProperty(SnmpConfigurator.P_TLS_PEER_ID, "");
        }
        if (x509Certificate != null && x509Certificate.getSubjectDN().getName().equals(property)) {
            return true;
        }
        if (property.length() == 0) {
            return false;
        }
        throw new CertificateException("Client certificate " + x509Certificate + " rejected because subject DN does not match " + property);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isServerCertificateAccepted(X509Certificate[] x509CertificateArr) throws NoSuchAlgorithmException, CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new CertificateException("Server certificate chain is empty");
        }
        String property = this.properties.getProperty(SnmpConfigurator.P_TLS_CERT_FINGERPRINT, "");
        if (property.length() > 0) {
            OctetString octetStringFromHexString = OctetString.fromHexString(property);
            int length = x509CertificateArr.length;
            char c10 = 65535;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                OctetString fingerprint = TLSTMUtil.getFingerprint(x509CertificateArr[i10]);
                LogAdapter logAdapter = LOGGER;
                if (logAdapter.isDebugEnabled()) {
                    logAdapter.debug("Matching server fingerprint " + fingerprint + " against accepted " + property);
                }
                if (fingerprint != null && fingerprint.equals(octetStringFromHexString)) {
                    c10 = 1;
                    break;
                }
                i10++;
                c10 = 0;
            }
            if (c10 <= 0) {
                throw new CertificateException("Server certificate chain " + Arrays.asList(x509CertificateArr) + " does not match accepted fingerprint " + octetStringFromHexString);
            }
        }
        String property2 = this.properties.getProperty(SnmpConfigurator.P_TLS_PEER_ID, "");
        if (this.serverMode) {
            property2 = this.properties.getProperty(SnmpConfigurator.P_TLS_LOCAL_ID, "");
        }
        String name = x509CertificateArr[0].getSubjectDN().getName();
        if (name.equals(property2)) {
            return true;
        }
        if (property2.length() > 0) {
            throw new CertificateException("Certificate subject '" + name + "' does not match accepted peer '" + property2 + "'");
        }
        String property3 = this.properties.getProperty(SnmpConfigurator.P_TLS_TRUST_CA, "");
        if (property3.length() == 0) {
            return false;
        }
        for (int i11 = 1; i11 < x509CertificateArr.length; i11++) {
            String name2 = x509CertificateArr[i11].getIssuerDN().getName();
            if (name2.equals(property3)) {
                return true;
            }
            LOGGER.debug("Certification authority '" + name2 + "' does not match accepted CA '" + property3 + "'");
        }
        throw new CertificateException("Certification authorities for certificate chain " + Arrays.asList(x509CertificateArr) + " does not match accepted CA '" + property3 + "'");
    }
}
