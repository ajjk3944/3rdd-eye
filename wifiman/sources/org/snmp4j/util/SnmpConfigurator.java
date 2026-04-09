package org.snmp4j.util;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.snmp4j.AbstractTarget;
import org.snmp4j.CertifiedTarget;
import org.snmp4j.CommunityTarget;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.PDU;
import org.snmp4j.PDUv1;
import org.snmp4j.ScopedPDU;
import org.snmp4j.Snmp;
import org.snmp4j.Target;
import org.snmp4j.TransportMapping;
import org.snmp4j.UserTarget;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.MessageProcessingModel;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.security.AuthHMAC128SHA224;
import org.snmp4j.security.AuthHMAC192SHA256;
import org.snmp4j.security.AuthHMAC256SHA384;
import org.snmp4j.security.AuthHMAC384SHA512;
import org.snmp4j.security.AuthMD5;
import org.snmp4j.security.AuthSHA;
import org.snmp4j.security.Priv3DES;
import org.snmp4j.security.PrivAES128;
import org.snmp4j.security.PrivAES192;
import org.snmp4j.security.PrivAES256;
import org.snmp4j.security.PrivDES;
import org.snmp4j.security.USM;
import org.snmp4j.security.UsmUser;
import org.snmp4j.security.nonstandard.PrivAES192With3DESKeyExtension;
import org.snmp4j.security.nonstandard.PrivAES256With3DESKeyExtension;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.IpAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TimeTicks;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.tls.PropertiesTlsTmSecurityCallback;
import org.snmp4j.transport.tls.X509TlsTransportMappingConfig;

/* loaded from: classes2.dex */
public class SnmpConfigurator {
    public static final String F_ADDRESS = "s<(udp|tcp|dtls|tls):.*[/[0-9]+]?>";
    public static final String F_AUTHORITATIVE_ENGINE_ID = "o<\\n\\n[:\\n\\n]*>";
    public static final String F_AUTH_PASSPHRASE = "s<.*>";
    public static final String F_AUTH_PROTOCOL = "s<(MD5|SHA|SHA224|SHA256|SHA384|SHA512)>";
    public static final String F_BIND_ADDRESS = "s<(udp|tcp|dtls|tls):.*[/[0-9]+]?>";
    public static final String F_BOOT_COUNTER = "i{=0}";
    public static final String F_COMMUNITY = "s{=public}";
    public static final String F_CONTEXT_ENGINE_ID = "o<\\n\\n[:\\n\\n]*>";
    public static final String F_CONTEXT_NAME = "s{=}";
    public static final String F_DTLS_VERSION = "s{=DTLSv1.2}<DTLSv1[\\.0|\\.2|\\.3]?[,DTLSv1[\\.0|\\.2|\\.3]?]*>";
    public static final String F_LOCAL_ENGINE_ID = "o<\\n\\n[:\\n\\n]*>";
    public static final String F_MAX_REPETITIONS = "i{=10}";
    public static final String F_NON_REPEATERS = "i{=0}";
    public static final String F_OPERATION = "s<(?i)(GET|GETNEXT|GETBULK|TRAP|NOTIFICATION|SET|INFORM)>";
    public static final String F_PRIV_PASSPHRASE = "s<.*>";
    public static final String F_PRIV_PROTOCOL = "s<(DES|3DES|AES|AES128|AES192|AES256)>";
    public static final String F_RETRIES = "i";
    public static final String F_SECURITY_NAME = "s";
    public static final String F_SEC_LEVEL = "i";
    public static final String F_SEC_MODEL = "i";
    public static final String F_TIMEOUT = "l";
    public static final String F_TLS_CERT_FINGERPRINT = "o<\\n\\n[:\\n\\n]*>";
    public static final String F_TLS_LOCAL_ID = "s";
    public static final String F_TLS_PEER_ID = "s";
    public static final String F_TLS_TRUST_CA = "s";
    public static final String F_TLS_VERSION = "s{=TLSv1.2}<TLSv1[\\.1|\\.2|\\.3]?[,TLSv1[\\.1|\\.2|\\.3]?]*>";
    public static final String F_TRAPV1_AGENT_ADDR = "s{=0.0.0.0}<\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}>";
    public static final String F_TRAPV1_ENTERPRISE = "s{=0.0}<([a-zA-Z\\-0-9]*:)?[0-9a-zA-Z\\-\\.]*>";
    public static final String F_TRAPV1_GENERIC_ID = "i{=0}";
    public static final String F_TRAPV1_SPECIFIC_ID = "i{=0}";
    public static final String F_TRAP_OID = "s{=1.3.6.1.6.3.1.1.5.1}<([a-zA-Z\\-0-9]*:)?[0-9a-zA-Z\\-\\.]*>";
    public static final String F_TRAP_UPTIME = "l{=0}";
    public static final String F_VERSION = "s<1|2c|3>";
    public static final String O_ADDRESS = "address";
    public static final String O_AUTHORITATIVE_ENGINE_ID = "e";
    public static final String O_AUTH_PASSPHRASE = "A";
    public static final String O_AUTH_PROTOCOL = "a";
    public static final String O_BIND_ADDRESS = "b";
    public static final String O_BOOT_COUNTER = "bc";
    public static final String O_COMMUNITY = "c";
    public static final String O_CONTEXT_ENGINE_ID = "E";
    public static final String O_CONTEXT_NAME = "n";
    public static final String O_DTLS_VERSION = "dtls-version";
    public static final String O_LOCAL_ENGINE_ID = "l";
    public static final String O_MAX_REPETITIONS = "Cr";
    public static final String O_NON_REPEATERS = "Cn";
    public static final String O_OPERATION = "o";
    public static final String O_PRIV_PASSPHRASE = "Y";
    public static final String O_PRIV_PROTOCOL = "y";
    public static final String O_RETRIES = "r";
    public static final String O_SECURITY_NAME = "u";
    public static final String O_SEC_LEVEL = "sl";
    public static final String O_SEC_MODEL = "sm";
    public static final String O_TIMEOUT = "t";
    public static final String O_TLS_CERT_FINGERPRINT = "tls-cert-fingerprint";
    public static final String O_TLS_LOCAL_ID = "tls-local-id";
    public static final String O_TLS_PEER_ID = "tls-peer-id";
    public static final String O_TLS_TRUST_CA = "tls-trust-ca";
    public static final String O_TLS_VERSION = "tls-version";
    public static final String O_TRAPV1_AGENT_ADDR = "Ta";
    public static final String O_TRAPV1_ENTERPRISE = "Te";
    public static final String O_TRAPV1_GENERIC_ID = "Tg";
    public static final String O_TRAPV1_SPECIFIC_ID = "Ts";
    public static final String O_TRAP_OID = "To";
    public static final String O_TRAP_UPTIME = "Tu";
    public static final String O_VERSION = "v";
    public static final String P_ADDRESS = "org.snmp4j.arg.address";
    public static final String P_AUTHORITATIVE_ENGINE_ID = "org.snmp4j.arg.authoritativeEngineID";
    public static final String P_AUTH_PASSPHRASE = "org.snmp4j.arg.authPassphrase";
    public static final String P_AUTH_PROTOCOL = "org.snmp4j.arg.authProtocol";
    public static final String P_BIND_ADDRESS = "org.snmp4j.arg.bindAddress";
    public static final String P_BOOT_COUNTER = "org.snmp4j.arg.bootCounter";
    public static final String P_COMMUNITY = "org.snmp4j.arg.community";
    public static final String P_CONTEXT_ENGINE_ID = "org.snmp4j.arg.contextEngineID";
    public static final String P_CONTEXT_NAME = "org.snmp4j.arg.contextName";
    public static final String P_DTLS_VERSION = "org.snmp4j.arg.dtlsVersion";
    public static final String P_LOCAL_ENGINE_ID = "org.snmp4j.arg.localEngineID";
    public static final String P_MAX_REPETITIONS = "org.snmp4j.arg.maxRepetitions";
    public static final String P_NON_REPEATERS = "org.snmp4j.arg.nonRepeaters";
    public static final String P_OPERATION = "org.snmp4j.arg.operation";
    public static final String P_PRIV_PASSPHRASE = "org.snmp4j.arg.privPassphrase";
    public static final String P_PRIV_PROTOCOL = "org.snmp4j.arg.privProtocol";
    public static final String P_RETRIES = "org.snmp4j.arg.retries";
    public static final String P_SECURITY_NAME = "org.snmp4j.arg.securityName";
    public static final String P_SEC_LEVEL = "org.snmp4j.arg.securityLevel";
    public static final String P_SEC_MODEL = "org.snmp4j.arg.securityModel";
    public static final String P_TIMEOUT = "org.snmp4j.arg.timeout";
    public static final String P_TLS_CERT_FINGERPRINT = "org.snmp4j.arg.tlsCertFingerprint";
    public static final String P_TLS_LOCAL_ID = "org.snmp4j.arg.tlsLocalID";
    public static final String P_TLS_PEER_ID = "org.snmp4j.arg.tlsPeerID";
    public static final String P_TLS_TRUST_CA = "org.snmp4j.arg.tlsTrustCA";
    public static final String P_TLS_VERSION = "org.snmp4j.arg.tlsVersion";
    public static final String P_TRAPV1_AGENT_ADDR = "org.snmp4j.arg.trapv1.agentAddr";
    public static final String P_TRAPV1_ENTERPRISE = "org.snmp4j.arg.trap.trapv1.enterprise";
    public static final String P_TRAPV1_GENERIC_ID = "org.snmp4j.arg.trap.trapv1.genericID";
    public static final String P_TRAPV1_SPECIFIC_ID = "org.snmp4j.arg.trap.trapv1.specificID";
    public static final String P_TRAP_OID = "org.snmp4j.arg.trap.trapOID";
    public static final String P_TRAP_UPTIME = "org.snmp4j.arg.trap.trapUpTime";
    public static final String P_VERSION = "org.snmp4j.arg.version";
    private boolean commandResponder;
    private String oAddress;
    private String oAgentAddr;
    private String oAuthPassphrase;
    private String oAuthProtocol;
    private String oAuthoritativeEngineID;
    private String oBindAddress;
    private String oBootCounter;
    private String oCommunity;
    private String oContextEngineID;
    private String oContextName;
    private String oDtlsVersion;
    private String oEnterprise;
    private String oGenericID;
    private String oLocalEngineID;
    private String oMaxRepetitions;
    private String oNonRepeaters;
    private String oOperation;
    private String oPrivPassphrase;
    private String oPrivProtocol;
    private String oRetries;
    private String oSecLevel;
    private String oSecModel;
    private String oSecurityName;
    private String oSpecificID;
    private String oTimeout;
    private String oTlsCertFingerprint;
    private String oTlsLocalID;
    private String oTlsPeerID;
    private String oTlsTrustCA;
    private String oTlsVersion;
    private String oTrapOID;
    private String oTrapSysUpTime;
    private String oVersion;

    public SnmpConfigurator() {
        this(new Properties());
    }

    private void configureEngine(Snmp snmp, USM usm, Map<String, List<Object>> map) {
        int iIntValue;
        Integer num = (Integer) ArgumentParser.getValue(map, this.oBootCounter, 0);
        if (num != null) {
            iIntValue = num.intValue();
            usm.setEngineBoots(iIntValue);
        } else {
            iIntValue = 0;
        }
        OctetString octetStringCreateOctetString = createOctetString((String) ArgumentParser.getValue(map, this.oLocalEngineID, 0), null);
        if (octetStringCreateOctetString != null) {
            snmp.setLocalEngine(octetStringCreateOctetString.getValue(), iIntValue, 0);
        } else if (snmp.getLocalEngineID() == null) {
            snmp.setLocalEngine(MPv3.createLocalEngineID(), iIntValue, 0);
        }
    }

    public static OctetString createOctetString(String str, String str2) {
        if (str == null) {
            str = str2;
        }
        if (str != null && str.startsWith("0x")) {
            return OctetString.fromHexString(str.substring(2), ':');
        }
        if (str != null) {
            return new OctetString(str);
        }
        return null;
    }

    public static OID getAuthProtocolOid(String str) {
        if ("MD5".equals(str)) {
            return AuthMD5.ID;
        }
        if ("SHA".equals(str)) {
            return AuthSHA.ID;
        }
        if ("SHA224".equals(str)) {
            return AuthHMAC128SHA224.ID;
        }
        if ("SHA256".equals(str)) {
            return AuthHMAC192SHA256.ID;
        }
        if ("SHA384".equals(str)) {
            return AuthHMAC256SHA384.ID;
        }
        if ("SHA512".equals(str)) {
            return AuthHMAC384SHA512.ID;
        }
        return null;
    }

    public static OID getPrivProtocolOid(String str) {
        if ("DES".equals(str)) {
            return PrivDES.ID;
        }
        if ("3DES".equals(str)) {
            return Priv3DES.ID;
        }
        if ("AES".equals(str) || "AES128".equals(str)) {
            return PrivAES128.ID;
        }
        if ("AES192".equals(str)) {
            return PrivAES192.ID;
        }
        if ("AES256".equals(str)) {
            return PrivAES256.ID;
        }
        if ("AES192p".equals(str)) {
            return PrivAES192With3DESKeyExtension.ID;
        }
        if ("AES256p".equals(str)) {
            return PrivAES256With3DESKeyExtension.ID;
        }
        return null;
    }

    private Properties getTlsProperties(Map<String, List<Object>> map) {
        Properties properties = new Properties();
        String str = (String) ArgumentParser.getValue(map, this.oTlsLocalID, 0);
        if (str != null) {
            properties.setProperty(P_TLS_LOCAL_ID, str);
        }
        String str2 = (String) ArgumentParser.getValue(map, this.oTlsTrustCA, 0);
        if (str2 != null) {
            properties.setProperty(P_TLS_TRUST_CA, str2);
        }
        String str3 = (String) ArgumentParser.getValue(map, this.oTlsPeerID, 0);
        if (str3 != null) {
            properties.setProperty(P_TLS_PEER_ID, str3);
        }
        String str4 = (String) ArgumentParser.getValue(map, this.oSecurityName, 0);
        if (str4 != null) {
            properties.setProperty(P_SECURITY_NAME, str4);
        }
        String str5 = (String) ArgumentParser.getValue(map, this.oTlsVersion, 0);
        if (str5 != null) {
            properties.setProperty(P_TLS_VERSION, str5);
        }
        String str6 = (String) ArgumentParser.getValue(map, this.oDtlsVersion, 0);
        if (str6 != null) {
            properties.setProperty(P_DTLS_VERSION, str6);
        }
        String str7 = (String) ArgumentParser.getValue(map, this.oTlsCertFingerprint, 0);
        if (str7 != null) {
            properties.setProperty(P_TLS_CERT_FINGERPRINT, str7);
        }
        return properties;
    }

    private void setSecurityLevelOnTarget(Map<String, List<Object>> map, AbstractTarget abstractTarget) {
        Integer num = (Integer) ArgumentParser.getValue(map, this.oSecLevel, 0);
        if (num != null) {
            abstractTarget.setSecurityLevel(num.intValue());
            return;
        }
        if (map.containsKey(this.oPrivPassphrase) || (abstractTarget instanceof CertifiedTarget)) {
            abstractTarget.setSecurityLevel(3);
        } else if (map.containsKey(this.oAuthPassphrase)) {
            abstractTarget.setSecurityLevel(2);
        } else {
            abstractTarget.setSecurityLevel(1);
        }
    }

    public void configure(Snmp snmp, Map<String, List<Object>> map) {
        configure(snmp, snmp.getUSM(), snmp.getMessageDispatcher(), map);
    }

    public Address getBindAddress(Map<String, List<Object>> map) {
        String str = (String) ArgumentParser.getValue(map, this.oBindAddress, 0);
        if (str == null) {
            return null;
        }
        if (str.indexOf(47) <= 0) {
            str = str + "/0";
        }
        return GenericAddress.parse(str);
    }

    public PDUFactory getPDUFactory(Map<String, List<Object>> map) {
        return new InnerPDUFactory(map);
    }

    public Target getTarget(Map<String, List<Object>> map) {
        AbstractTarget abstractTarget;
        String str = (String) ArgumentParser.getValue(map, this.oVersion, 0);
        OctetString octetStringCreateOctetString = createOctetString((String) ArgumentParser.getValue(map, this.oCommunity, 0), "public");
        Integer num = (Integer) ArgumentParser.getValue(map, this.oSecModel, 0);
        if ("1".equals(str)) {
            CommunityTarget communityTarget = new CommunityTarget();
            communityTarget.setVersion(0);
            communityTarget.setCommunity(octetStringCreateOctetString);
            abstractTarget = communityTarget;
        } else if ("2c".equals(str)) {
            CommunityTarget communityTarget2 = new CommunityTarget();
            communityTarget2.setVersion(1);
            communityTarget2.setCommunity(octetStringCreateOctetString);
            abstractTarget = communityTarget2;
        } else if ((num == null || num.intValue() != 4) && (num != null || getTlsProperties(map).size() <= 1)) {
            UserTarget userTarget = new UserTarget();
            String str2 = (String) ArgumentParser.getValue(map, this.oAuthoritativeEngineID, 0);
            if (str2 != null) {
                userTarget.setAuthoritativeEngineID(createOctetString(str2, null).getValue());
            }
            userTarget.setSecurityModel(3);
            String str3 = (String) ArgumentParser.getValue(map, this.oSecurityName, 0);
            if (str3 != null) {
                userTarget.setSecurityName(createOctetString(str3, null));
            }
            setSecurityLevelOnTarget(map, userTarget);
            abstractTarget = userTarget;
        } else {
            String str4 = (String) ArgumentParser.getValue(map, this.oSecurityName, 0);
            if (str4 == null) {
                throw new IllegalArgumentException("Mandatory securityName for TLS target not specified with option -" + this.oSecurityName);
            }
            AbstractTarget certifiedTarget = new CertifiedTarget(new OctetString(str4));
            certifiedTarget.setSecurityModel(4);
            setSecurityLevelOnTarget(map, certifiedTarget);
            abstractTarget = certifiedTarget;
        }
        Number number = (Number) ArgumentParser.getValue(map, this.oRetries, 0);
        abstractTarget.setRetries(number != null ? number.intValue() : 0);
        Number number2 = (Number) ArgumentParser.getValue(map, this.oTimeout, 0);
        abstractTarget.setTimeout(number2 != null ? number2.longValue() : 5000L);
        String str5 = (String) ArgumentParser.getValue(map, this.oAddress, 0);
        if (str5 != null) {
            if (str5.indexOf(47) <= 0) {
                str5 = str5 + "/161";
            }
            abstractTarget.setAddress(GenericAddress.parse(str5));
        }
        return abstractTarget;
    }

    public boolean isCommandResponder() {
        return this.commandResponder;
    }

    public void setCommandResponder(boolean z10) {
        this.commandResponder = z10;
    }

    public SnmpConfigurator(Properties properties) {
        this.oVersion = properties.getProperty(P_VERSION, O_VERSION);
        this.oLocalEngineID = properties.getProperty(P_LOCAL_ENGINE_ID, "l");
        this.oRetries = properties.getProperty(P_RETRIES, O_RETRIES);
        this.oTimeout = properties.getProperty(P_TIMEOUT, O_TIMEOUT);
        this.oAddress = properties.getProperty(P_ADDRESS, O_ADDRESS);
        this.oBindAddress = properties.getProperty(P_BIND_ADDRESS, O_BIND_ADDRESS);
        this.oCommunity = properties.getProperty(P_COMMUNITY, O_COMMUNITY);
        this.oSecurityName = properties.getProperty(P_SECURITY_NAME, O_SECURITY_NAME);
        this.oAuthoritativeEngineID = properties.getProperty(P_AUTHORITATIVE_ENGINE_ID, O_AUTHORITATIVE_ENGINE_ID);
        this.oAuthPassphrase = properties.getProperty(P_AUTH_PASSPHRASE, O_AUTH_PASSPHRASE);
        this.oAuthProtocol = properties.getProperty(P_AUTH_PROTOCOL, O_AUTH_PROTOCOL);
        this.oPrivPassphrase = properties.getProperty(P_PRIV_PASSPHRASE, O_PRIV_PASSPHRASE);
        this.oPrivProtocol = properties.getProperty(P_PRIV_PROTOCOL, O_PRIV_PROTOCOL);
        this.oOperation = properties.getProperty(P_OPERATION, O_OPERATION);
        this.oMaxRepetitions = properties.getProperty(P_MAX_REPETITIONS, O_MAX_REPETITIONS);
        this.oNonRepeaters = properties.getProperty(P_NON_REPEATERS, O_NON_REPEATERS);
        this.oBootCounter = properties.getProperty(P_BOOT_COUNTER, O_BOOT_COUNTER);
        this.oContextName = properties.getProperty(P_CONTEXT_NAME, O_CONTEXT_NAME);
        this.oContextEngineID = properties.getProperty(P_CONTEXT_ENGINE_ID, O_CONTEXT_ENGINE_ID);
        this.oSecLevel = properties.getProperty(P_SEC_LEVEL, O_SEC_LEVEL);
        this.oSecModel = properties.getProperty(P_SEC_MODEL, O_SEC_MODEL);
        this.oAgentAddr = properties.getProperty(P_TRAPV1_AGENT_ADDR, O_TRAPV1_AGENT_ADDR);
        this.oTrapOID = properties.getProperty(P_TRAP_OID, O_TRAP_OID);
        this.oTrapSysUpTime = properties.getProperty(P_TRAP_UPTIME, O_TRAP_UPTIME);
        this.oSpecificID = properties.getProperty(P_TRAPV1_SPECIFIC_ID, O_TRAPV1_SPECIFIC_ID);
        this.oGenericID = properties.getProperty(P_TRAPV1_GENERIC_ID, O_TRAPV1_GENERIC_ID);
        this.oEnterprise = properties.getProperty(P_TRAPV1_ENTERPRISE, O_TRAPV1_ENTERPRISE);
        this.oTlsLocalID = properties.getProperty(P_TLS_LOCAL_ID, O_TLS_LOCAL_ID);
        this.oTlsPeerID = properties.getProperty(P_TLS_PEER_ID, O_TLS_PEER_ID);
        this.oTlsTrustCA = properties.getProperty(P_TLS_TRUST_CA, O_TLS_TRUST_CA);
        this.oTlsVersion = properties.getProperty(P_TLS_VERSION, O_TLS_VERSION);
        this.oDtlsVersion = properties.getProperty(P_DTLS_VERSION, O_DTLS_VERSION);
        this.oTlsCertFingerprint = properties.getProperty(P_TLS_CERT_FINGERPRINT, O_TLS_CERT_FINGERPRINT);
    }

    public void configure(Snmp snmp, USM usm, MessageDispatcher messageDispatcher, Map<String, List<Object>> map) {
        if (usm != null) {
            configureEngine(snmp, usm, map);
            String str = (String) ArgumentParser.getValue(map, this.oSecurityName, 0);
            if (str != null) {
                String str2 = (String) ArgumentParser.getValue(map, this.oAuthPassphrase, 0);
                String str3 = (String) ArgumentParser.getValue(map, this.oPrivPassphrase, 0);
                String str4 = (String) ArgumentParser.getValue(map, this.oAuthProtocol, 0);
                String str5 = (String) ArgumentParser.getValue(map, this.oPrivProtocol, 0);
                OID authProtocolOid = getAuthProtocolOid(str4);
                OID privProtocolOid = getPrivProtocolOid(str5);
                OctetString octetStringCreateOctetString = createOctetString(str, null);
                usm.addUser(octetStringCreateOctetString, new UsmUser(octetStringCreateOctetString, authProtocolOid, createOctetString(str2, null), privProtocolOid, createOctetString(str3, null)));
            }
        }
        Properties tlsProperties = getTlsProperties(map);
        for (TransportMapping transportMapping : messageDispatcher.getTransportMappings()) {
            if (transportMapping instanceof X509TlsTransportMappingConfig) {
                X509TlsTransportMappingConfig x509TlsTransportMappingConfig = (X509TlsTransportMappingConfig) transportMapping;
                x509TlsTransportMappingConfig.setSecurityCallback(new PropertiesTlsTmSecurityCallback(tlsProperties, this.commandResponder));
                if (tlsProperties.getProperty(x509TlsTransportMappingConfig.getProtocolVersionPropertyName()) != null) {
                    x509TlsTransportMappingConfig.setProtocolVersions(tlsProperties.getProperty(x509TlsTransportMappingConfig.getProtocolVersionPropertyName()).split(","));
                }
            }
        }
    }

    public class InnerPDUFactory implements PDUFactory {
        private Map<String, List<Object>> settings;

        public InnerPDUFactory(Map<String, List<Object>> map) {
            this.settings = map;
        }

        private void configurePDU(int i10, PDU pdu) {
            if (i10 == -92 && !(pdu instanceof PDUv1)) {
                throw new RuntimeException("V1TRAP can only be sent using SNMPv1");
            }
            if (i10 == -91) {
                Integer maxRepetitions = getMaxRepetitions();
                if (maxRepetitions != null) {
                    pdu.setMaxRepetitions(maxRepetitions.intValue());
                }
                Integer nonRepeaters = getNonRepeaters();
                if (nonRepeaters != null) {
                    pdu.setNonRepeaters(nonRepeaters.intValue());
                }
            } else if (i10 == -89 || i10 == -90) {
                Number number = (Number) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oTrapSysUpTime, 0);
                if (number != null) {
                    pdu.add(new VariableBinding(SnmpConstants.sysUpTime, new TimeTicks(number.longValue())));
                }
                String str = (String) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oTrapOID, 0);
                if (str != null) {
                    pdu.add(new VariableBinding(SnmpConstants.snmpTrapOID, new OID(str)));
                }
            } else if (i10 == -92) {
                PDUv1 pDUv1 = (PDUv1) pdu;
                String str2 = (String) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oAgentAddr, 0);
                if (str2 != null) {
                    pDUv1.setAgentAddress(new IpAddress(str2));
                }
                Integer num = (Integer) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oGenericID, 0);
                if (num != null) {
                    pDUv1.setGenericTrap(num.intValue());
                }
                Integer num2 = (Integer) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oSpecificID, 0);
                if (num2 != null) {
                    pDUv1.setSpecificTrap(num2.intValue());
                }
                String str3 = (String) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oEnterprise, 0);
                if (str3 != null) {
                    pDUv1.setEnterprise(new OID(str3));
                }
            }
            if (pdu instanceof ScopedPDU) {
                ScopedPDU scopedPDU = (ScopedPDU) pdu;
                String str4 = (String) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oContextEngineID, 0);
                if (str4 != null) {
                    scopedPDU.setContextEngineID(SnmpConfigurator.createOctetString(str4, null));
                }
                String str5 = (String) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oContextName, 0);
                if (str5 != null) {
                    scopedPDU.setContextName(SnmpConfigurator.createOctetString(str5, null));
                }
            }
        }

        private int getPduType() {
            String str = (String) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oOperation, 0);
            if (str == null) {
                str = "GET";
            }
            return PDU.getTypeFromString(str.toUpperCase());
        }

        @Override // org.snmp4j.util.PDUFactory
        public PDU createPDU(Target target) {
            int pduType = getPduType();
            PDU pduCreatePDU = DefaultPDUFactory.createPDU(target, pduType);
            configurePDU(pduType, pduCreatePDU);
            return pduCreatePDU;
        }

        public Integer getMaxRepetitions() {
            return (Integer) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oMaxRepetitions, 0);
        }

        public Integer getNonRepeaters() {
            return (Integer) ArgumentParser.getValue(this.settings, SnmpConfigurator.this.oNonRepeaters, 0);
        }

        @Override // org.snmp4j.util.PDUFactory
        public PDU createPDU(MessageProcessingModel messageProcessingModel) {
            int pduType = getPduType();
            PDU pduCreatePDU = DefaultPDUFactory.createPDU(messageProcessingModel, pduType);
            configurePDU(pduType, pduCreatePDU);
            return pduCreatePDU;
        }
    }

    public SnmpConfigurator(boolean z10) {
        this();
        this.commandResponder = z10;
    }

    public SnmpConfigurator(Properties properties, boolean z10) {
        this(properties);
        this.commandResponder = z10;
    }
}
