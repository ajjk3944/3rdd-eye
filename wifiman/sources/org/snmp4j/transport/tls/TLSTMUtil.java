package org.snmp4j.transport.tls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.snmp4j.TransportStateReference;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OctetString;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes2.dex */
public class TLSTMUtil {
    private static final LogAdapter logger = LogFactory.getLogger(TLSTMUtil.class);
    private static final int MD_SHA_PREFIX_LENGTH = 3;

    public static SSLContext createSSLContext(String str, String str2, String str3, String str4, String str5, TransportStateReference transportStateReference, TLSTM.TLSTMTrustManagerFactory tLSTMTrustManagerFactory, boolean z10, TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback, String str6) throws GeneralSecurityException, IOException {
        SSLContext sSLContext = SSLContext.getInstance(str);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        try {
            FileInputStream fileInputStream = new FileInputStream(str2);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str4);
                try {
                    KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    keyStore.load(fileInputStream, str3 != null ? str3.toCharArray() : null);
                    LogAdapter logAdapter = logger;
                    if (logAdapter.isInfoEnabled()) {
                        logAdapter.info("KeyStore '" + str2 + "' contains: " + Collections.list(keyStore.aliases()));
                    }
                    filterCertificates(keyStore, transportStateReference, tlsTmSecurityCallback, str6);
                    KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
                    keyStore2.load(fileInputStream2, str5 != null ? str5.toCharArray() : null);
                    if (logAdapter.isInfoEnabled()) {
                        logAdapter.info("TrustStore '" + str4 + "' contains: " + Collections.list(keyStore2.aliases()));
                    }
                    KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                    keyManagerFactory.init(keyStore, str3 != null ? str3.toCharArray() : null);
                    trustManagerFactory.init(keyStore2);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    if (logAdapter.isDebugEnabled()) {
                        logAdapter.debug("SSL context initializing with TrustManagers: " + Arrays.asList(trustManagers) + " and factory " + tLSTMTrustManagerFactory.getClass().getName());
                    }
                    sSLContext.init(keyManagerFactory.getKeyManagers(), new TrustManager[]{tLSTMTrustManagerFactory.create((X509TrustManager) trustManagers[0], z10, transportStateReference)}, null);
                    fileInputStream2.close();
                    fileInputStream.close();
                    return sSLContext;
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException e10) {
            String str7 = "Failed to initialize SSLContext because of a FileNotFoundException: " + e10.getMessage();
            logger.error(str7, e10);
            throw new KeyStoreException(str7, e10);
        } catch (IOException e11) {
            String str8 = "Failed to initialize SSLContext because of an IOException: " + e11.getMessage();
            logger.error(str8, e11);
            throw new KeyStoreException(str8, e11);
        } catch (NullPointerException e12) {
            logger.error("Failed to initialize SSLContext because of missing key store (javax.net.ssl.keyStore)");
            throw new KeyStoreException("Failed to initialize SSLContext because of missing key store (javax.net.ssl.keyStore)", e12);
        } catch (KeyManagementException e13) {
            logger.error("Failed to initialize SSLContext because of a KeyManagementException: " + e13.getMessage(), e13);
            throw e13;
        } catch (KeyStoreException e14) {
            logger.error("Failed to initialize SSLContext because of a KeyStoreException: " + e14.getMessage(), e14);
            throw e14;
        } catch (UnrecoverableKeyException e15) {
            logger.error("Failed to initialize SSLContext because of an UnrecoverableKeyException: " + e15.getMessage(), e15);
            throw e15;
        } catch (CertificateException e16) {
            logger.error("Failed to initialize SSLContext because of a CertificateException: " + e16.getMessage(), e16);
            throw e16;
        }
    }

    private static void filterCertificates(KeyStore keyStore, TransportStateReference transportStateReference, TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback, String str) throws KeyStoreException {
        String localCertificateAlias;
        if (tlsTmSecurityCallback != null && transportStateReference != null && (localCertificateAlias = tlsTmSecurityCallback.getLocalCertificateAlias(transportStateReference.getAddress())) != null) {
            str = localCertificateAlias;
        }
        if (str != null) {
            try {
                Certificate[] certificateChain = keyStore.getCertificateChain(str);
                if (certificateChain == null) {
                    logger.warn("Local certificate with alias '" + str + "' not found. Known aliases are: " + Collections.list(keyStore.aliases()));
                    return;
                }
                ArrayList arrayList = new ArrayList(certificateChain.length);
                for (Certificate certificate : certificateChain) {
                    String certificateAlias = keyStore.getCertificateAlias(certificate);
                    if (certificateAlias != null) {
                        arrayList.add(certificateAlias);
                    }
                }
                Iterator it = Collections.list(keyStore.aliases()).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!arrayList.contains(str2)) {
                        keyStore.deleteEntry(str2);
                    }
                }
            } catch (KeyStoreException e10) {
                logger.error("Failed to get certificate chain for alias " + str + ": " + e10.getMessage(), e10);
            }
        }
    }

    public static OctetString getFingerprint(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        char cCharAt;
        try {
            String sigAlgName = x509Certificate.getSigAlgName();
            if (sigAlgName.contains("with")) {
                sigAlgName = sigAlgName.substring(0, sigAlgName.indexOf("with"));
            }
            int length = sigAlgName.length();
            int i10 = MD_SHA_PREFIX_LENGTH;
            if (length > i10 && ((cCharAt = sigAlgName.charAt(i10)) == '1' || cCharAt == '2')) {
                sigAlgName = sigAlgName.substring(0, i10) + "-" + sigAlgName.substring(i10);
            }
            MessageDigest messageDigest = MessageDigest.getInstance(sigAlgName);
            messageDigest.update(x509Certificate.getEncoded());
            return new OctetString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            logger.error("No such digest algorithm exception while getting fingerprint from " + x509Certificate + ": " + e10.getMessage(), e10);
            return null;
        } catch (CertificateEncodingException e11) {
            logger.error("Certificate encoding exception while getting fingerprint from " + x509Certificate + ": " + e11.getMessage(), e11);
            return null;
        }
    }

    public static OctetString getIpAddressFromSubjAltName(Collection<List<?>> collection) {
        Object subjAltName = getSubjAltName(collection, 7);
        if (subjAltName == null) {
            return null;
        }
        String lowerCase = ((String) subjAltName).toLowerCase();
        if (lowerCase.indexOf(58) < 0) {
            return new OctetString(lowerCase);
        }
        StringBuilder sb2 = new StringBuilder(16);
        for (String str : lowerCase.split(":")) {
            for (int length = 2 - str.length(); length > 0; length--) {
                sb2.append('0');
            }
            sb2.append(str);
        }
        return new OctetString(sb2.toString());
    }

    public static Object getSubjAltName(Collection<List<?>> collection, int i10) {
        if (collection == null) {
            return null;
        }
        for (List<?> list : collection) {
            if (((Integer) list.get(0)).intValue() == i10) {
                return list.get(1);
            }
        }
        return null;
    }

    public static boolean isMatchingFingerprint(X509Certificate[] x509CertificateArr, OctetString octetString, boolean z10, CounterSupport counterSupport, LogAdapter logAdapter, Object obj) throws NoSuchAlgorithmException, CertificateException {
        X509Certificate x509Certificate = x509CertificateArr[0];
        if (octetString == null || octetString.length() <= 0) {
            return false;
        }
        OctetString fingerprint = getFingerprint(x509Certificate);
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Comparing certificate fingerprint " + fingerprint + " with " + octetString);
        }
        if (fingerprint == null) {
            logAdapter.error("Failed to determine fingerprint for certificate " + x509Certificate + " and algorithm " + x509Certificate.getSigAlgName());
        } else if (fingerprint.equals(octetString)) {
            if (!logAdapter.isInfoEnabled()) {
                return true;
            }
            logAdapter.info("Peer is trusted by fingerprint '" + octetString + "' of certificate: '" + x509Certificate + "'");
            return true;
        }
        counterSupport.fireIncrementCounter(new CounterEvent(obj, z10 ? SnmpConstants.snmpTlstmSessionInvalidServerCertificates : SnmpConstants.snmpTlstmSessionInvalidClientCertificates));
        throw new CertificateException("No fingerprint of provided certificates " + Arrays.asList(x509CertificateArr) + " matched " + octetString.toHexString());
    }
}
