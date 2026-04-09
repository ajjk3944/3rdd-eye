package org.snmp4j.transport.tls;

import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;
import org.snmp4j.transport.tls.SecurityNameMapping;

/* loaded from: classes2.dex */
public class DefaultTlsTmSecurityCallback implements TlsTmSecurityCallback<X509Certificate> {
    private LogAdapter LOGGER = LogFactory.getLogger(DefaultTlsTmSecurityCallback.class);
    private Map<SecurityNameMapping, OctetString> securityNameMapping = new HashMap();
    private Map<Address, String> localCertMapping = new HashMap();
    private Set<String> acceptedSubjectDN = new HashSet();
    private Set<String> acceptedIssuerDN = new HashSet();

    /* renamed from: org.snmp4j.transport.tls.DefaultTlsTmSecurityCallback$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType;

        static {
            int[] iArr = new int[SecurityNameMapping.CertMappingType.values().length];
            $SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType = iArr;
            try {
                iArr[SecurityNameMapping.CertMappingType.Specified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType[SecurityNameMapping.CertMappingType.SANAny.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType[SecurityNameMapping.CertMappingType.SANRFC822Name.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType[SecurityNameMapping.CertMappingType.SANDNSName.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType[SecurityNameMapping.CertMappingType.SANIpAddress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType[SecurityNameMapping.CertMappingType.CommonName.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private OctetString mapCertToTSN(X509Certificate x509Certificate, SecurityNameMapping.CertMappingType certMappingType, OctetString octetString) throws CertificateParsingException {
        if (this.LOGGER.isDebugEnabled()) {
            this.LOGGER.debug("Mapping cert to security name " + x509Certificate + " with type " + certMappingType + " and date " + octetString);
        }
        switch (AnonymousClass1.$SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType[certMappingType.ordinal()]) {
            case 1:
                return octetString;
            case 2:
            case 3:
                Object subjAltName = TLSTMUtil.getSubjAltName(x509Certificate.getSubjectAlternativeNames(), 1);
                if (subjAltName != null) {
                    String[] strArrSplit = ((String) subjAltName).split("@");
                    return new OctetString(strArrSplit[0] + "@" + strArrSplit[1].toLowerCase());
                }
            case 4:
                Object subjAltName2 = TLSTMUtil.getSubjAltName(x509Certificate.getSubjectAlternativeNames(), 2);
                if (subjAltName2 != null) {
                    return new OctetString(((String) subjAltName2).toLowerCase());
                }
            case 5:
                OctetString ipAddressFromSubjAltName = TLSTMUtil.getIpAddressFromSubjAltName(x509Certificate.getSubjectAlternativeNames());
                if (ipAddressFromSubjAltName != null) {
                    return ipAddressFromSubjAltName;
                }
            case 6:
                return new OctetString(x509Certificate.getSubjectX500Principal().getName());
            default:
                return null;
        }
    }

    public void addAcceptedIssuerDN(String str) {
        this.acceptedIssuerDN.add(str);
    }

    public void addAcceptedSubjectDN(String str) {
        this.acceptedSubjectDN.add(str);
    }

    public void addLocalCertMapping(Address address, String str) {
        this.localCertMapping.put(address, str);
    }

    public void addSecurityNameMapping(OctetString octetString, SecurityNameMapping.CertMappingType certMappingType, OctetString octetString2, OctetString octetString3) {
        this.securityNameMapping.put(new SecurityNameMapping(octetString, octetString2, certMappingType, octetString3), octetString3);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public String getLocalCertificateAlias(Address address) {
        String str = this.localCertMapping.get(address);
        return str == null ? this.localCertMapping.get(null) : str;
    }

    public boolean removeAcceptedIssuerDN(String str) {
        return this.acceptedIssuerDN.remove(str);
    }

    public boolean removeAcceptedSubjectDN(String str) {
        return this.acceptedSubjectDN.remove(str);
    }

    public String removeLocalCertMapping(Address address) {
        return this.localCertMapping.remove(address);
    }

    public OctetString removeSecurityNameMapping(OctetString octetString, SecurityNameMapping.CertMappingType certMappingType, OctetString octetString2) {
        return this.securityNameMapping.remove(new SecurityNameMapping(octetString, octetString2, certMappingType, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.snmp4j.smi.OctetString getSecurityName(java.security.cert.X509Certificate[] r13) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.transport.tls.DefaultTlsTmSecurityCallback.getSecurityName(java.security.cert.X509Certificate[]):org.snmp4j.smi.OctetString");
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isAcceptedIssuer(X509Certificate x509Certificate) throws CertificateException {
        Principal issuerDN = x509Certificate.getIssuerDN();
        if (this.acceptedIssuerDN.isEmpty()) {
            return false;
        }
        if (issuerDN != null && this.acceptedIssuerDN.contains(issuerDN.getName())) {
            return true;
        }
        throw new CertificateException("Issuer certificate " + x509Certificate + " does not have accepted DN: " + this.acceptedIssuerDN);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isClientCertificateAccepted(X509Certificate x509Certificate) throws CertificateException {
        if (this.acceptedSubjectDN.isEmpty()) {
            return false;
        }
        if (x509Certificate != null && this.acceptedSubjectDN.contains(x509Certificate.getSubjectDN().getName())) {
            return true;
        }
        throw new CertificateException("Client certificate " + x509Certificate + " has no accepted subject DN: " + this.acceptedSubjectDN);
    }

    @Override // org.snmp4j.transport.tls.TlsTmSecurityCallback
    public boolean isServerCertificateAccepted(X509Certificate[] x509CertificateArr) throws NoSuchAlgorithmException, CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new CertificateException("Server certificate chain is empty");
        }
        Iterator<Map.Entry<SecurityNameMapping, OctetString>> it = this.securityNameMapping.entrySet().iterator();
        char c10 = 65535;
        while (it.hasNext()) {
            OctetString fingerprint = it.next().getKey().getFingerprint();
            int length = x509CertificateArr.length;
            int i10 = 0;
            while (i10 < length) {
                OctetString fingerprint2 = TLSTMUtil.getFingerprint(x509CertificateArr[i10]);
                if (this.LOGGER.isDebugEnabled()) {
                    this.LOGGER.debug("Matching server fingerprint " + fingerprint2 + " against accepted " + fingerprint);
                }
                if (fingerprint.length() == 0 || (fingerprint2 != null && fingerprint2.equals(fingerprint))) {
                    c10 = 1;
                    break;
                }
                i10++;
                c10 = 0;
            }
        }
        if (c10 == 0) {
            throw new CertificateException("Server certificate chain " + Arrays.asList(x509CertificateArr) + " does not match accepted fingerprints: " + this.securityNameMapping);
        }
        if (this.acceptedSubjectDN.contains(x509CertificateArr[0].getSubjectDN().getName())) {
            return true;
        }
        for (X509Certificate x509Certificate : x509CertificateArr) {
            Principal issuerDN = x509Certificate.getIssuerDN();
            if (issuerDN != null && this.acceptedIssuerDN.contains(issuerDN.getName())) {
                return true;
            }
        }
        if (this.acceptedSubjectDN.isEmpty() && this.acceptedIssuerDN.isEmpty()) {
            return false;
        }
        throw new CertificateException("Server certificate chain " + Arrays.asList(x509CertificateArr) + " rejected because issuer and subject DN not accepted");
    }
}
