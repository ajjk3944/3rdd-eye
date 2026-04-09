package org.snmp4j.security;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.security.nonstandard.NonStandardSecurityProtocol;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class SecurityProtocols implements Serializable {
    public static final String SECURITY_PROTOCOLS_PROPERTIES = "org.snmp4j.securityProtocols";
    private static final String SECURITY_PROTOCOLS_PROPERTIES_DEFAULT = "SecurityProtocols.properties";
    private static final long serialVersionUID = 3800474900139635836L;
    private static final LogAdapter logger = LogFactory.getLogger(SecurityProtocols.class);
    private static SecurityProtocols instance = null;
    private int maxAuthDigestLength = 0;
    private int maxPrivDecryptParamsLength = 0;
    private Hashtable<OID, AuthenticationProtocol> authProtocols = new Hashtable<>(5);
    private Hashtable<OID, PrivacyProtocol> privProtocols = new Hashtable<>(5);

    public enum SecurityProtocolType {
        authentication,
        privacy
    }

    protected SecurityProtocols() {
    }

    public static SecurityProtocols getInstance() {
        if (instance == null) {
            instance = new SecurityProtocols();
        }
        return instance;
    }

    public static void setSecurityProtocols(SecurityProtocols securityProtocols) {
        instance = securityProtocols;
    }

    public synchronized void addAuthenticationProtocol(AuthenticationProtocol authenticationProtocol) {
        if (this.authProtocols.get(authenticationProtocol.getID()) == null) {
            this.authProtocols.put(authenticationProtocol.getID(), authenticationProtocol);
            if (authenticationProtocol.getDigestLength() > this.maxAuthDigestLength) {
                this.maxAuthDigestLength = authenticationProtocol.getDigestLength();
            }
        }
    }

    public synchronized SecurityProtocols addDefaultProtocols() {
        if (SNMP4JSettings.isExtensibilityEnabled()) {
            String property = System.getProperty(SECURITY_PROTOCOLS_PROPERTIES, SECURITY_PROTOCOLS_PROPERTIES_DEFAULT);
            InputStream resourceAsStream = SecurityProtocols.class.getResourceAsStream(property);
            if (resourceAsStream == null) {
                throw new InternalError("Could not read '" + property + "' from classpath!");
            }
            Properties properties = new Properties();
            try {
                try {
                    properties.load(resourceAsStream);
                    Enumeration<?> enumerationPropertyNames = properties.propertyNames();
                    while (enumerationPropertyNames.hasMoreElements()) {
                        String string = enumerationPropertyNames.nextElement().toString();
                        String property2 = properties.getProperty(string);
                        OID oid = property2 != null ? new OID(property2) : null;
                        try {
                            Object objNewInstance = Class.forName(string).newInstance();
                            if ((objNewInstance instanceof NonStandardSecurityProtocol) && oid != null && oid.size() > 0) {
                                LogAdapter logAdapter = logger;
                                if (logAdapter.isInfoEnabled()) {
                                    logAdapter.info("Assigning custom ID '" + oid + "' to security protocol " + string);
                                }
                                ((NonStandardSecurityProtocol) objNewInstance).setID(oid);
                            }
                            if (objNewInstance instanceof AuthenticationProtocol) {
                                addAuthenticationProtocol((AuthenticationProtocol) objNewInstance);
                            } else if (objNewInstance instanceof PrivacyProtocol) {
                                addPrivacyProtocol((PrivacyProtocol) objNewInstance);
                            } else {
                                logger.error("Failed to register security protocol because it does not implement required interfaces: " + string);
                            }
                        } catch (Exception e10) {
                            logger.error(e10);
                            throw new InternalError(e10.toString());
                        }
                    }
                } catch (IOException e11) {
                    String str = "Could not read '" + property + "': " + e11.getMessage();
                    logger.error(str);
                    throw new InternalError(str);
                }
            } finally {
                try {
                    resourceAsStream.close();
                } catch (IOException e12) {
                    logger.warn(e12);
                }
            }
        } else {
            addAuthenticationProtocol(new AuthMD5());
            addAuthenticationProtocol(new AuthSHA());
            addAuthenticationProtocol(new AuthHMAC128SHA224());
            addAuthenticationProtocol(new AuthHMAC192SHA256());
            addAuthenticationProtocol(new AuthHMAC256SHA384());
            addAuthenticationProtocol(new AuthHMAC384SHA512());
            addPrivacyProtocol(new PrivDES());
            addPrivacyProtocol(new PrivAES128());
            addPrivacyProtocol(new PrivAES192());
            addPrivacyProtocol(new PrivAES256());
        }
        return this;
    }

    public synchronized void addPrivacyProtocol(PrivacyProtocol privacyProtocol) {
        if (this.privProtocols.get(privacyProtocol.getID()) == null) {
            this.privProtocols.put(privacyProtocol.getID(), privacyProtocol);
            if (privacyProtocol.getDecryptParamsLength() > this.maxPrivDecryptParamsLength) {
                this.maxPrivDecryptParamsLength = privacyProtocol.getDecryptParamsLength();
            }
        }
    }

    public AuthenticationProtocol getAuthenticationProtocol(OID oid) {
        if (oid == null) {
            return null;
        }
        return this.authProtocols.get(oid);
    }

    public int getMaxAuthDigestLength() {
        return this.maxAuthDigestLength;
    }

    public int getMaxPrivDecryptParamsLength() {
        return this.maxPrivDecryptParamsLength;
    }

    public PrivacyProtocol getPrivacyProtocol(OID oid) {
        if (oid == null) {
            return null;
        }
        return this.privProtocols.get(oid);
    }

    public SecurityProtocol getSecurityProtocol(OID oid) {
        AuthenticationProtocol authenticationProtocol = getAuthenticationProtocol(oid);
        return authenticationProtocol == null ? getPrivacyProtocol(oid) : authenticationProtocol;
    }

    public byte[] passwordToKey(OID oid, OctetString octetString, byte[] bArr) {
        AuthenticationProtocol authenticationProtocol = this.authProtocols.get(oid);
        if (authenticationProtocol == null) {
            return null;
        }
        return authenticationProtocol.passwordToKey(octetString, bArr);
    }

    public void removeAuthenticationProtocol(AuthenticationProtocol authenticationProtocol) {
        this.authProtocols.remove(authenticationProtocol.getID());
    }

    public void removePrivacyProtocol(PrivacyProtocol privacyProtocol) {
        this.privProtocols.remove(privacyProtocol.getID());
    }

    public byte[] truncateKey(byte[] bArr, int i10) {
        int iMin = Math.min(i10, bArr.length);
        byte[] bArr2 = new byte[iMin];
        System.arraycopy(bArr, 0, bArr2, 0, iMin);
        return bArr2;
    }

    public byte[] passwordToKey(OID oid, OID oid2, OctetString octetString, byte[] bArr) {
        PrivacyProtocol privacyProtocol;
        byte[] bArrPasswordToKey;
        AuthenticationProtocol authenticationProtocol = this.authProtocols.get(oid2);
        if (authenticationProtocol == null || (privacyProtocol = this.privProtocols.get(oid)) == null || (bArrPasswordToKey = authenticationProtocol.passwordToKey(octetString, bArr)) == null) {
            return null;
        }
        if (bArrPasswordToKey.length >= privacyProtocol.getMinKeyLength()) {
            if (bArrPasswordToKey.length <= privacyProtocol.getMaxKeyLength()) {
                return bArrPasswordToKey;
            }
            byte[] bArr2 = new byte[privacyProtocol.getMaxKeyLength()];
            System.arraycopy(bArrPasswordToKey, 0, bArr2, 0, privacyProtocol.getMaxKeyLength());
            return bArr2;
        }
        return privacyProtocol.extendShortKey(bArrPasswordToKey, octetString, bArr, authenticationProtocol);
    }
}
