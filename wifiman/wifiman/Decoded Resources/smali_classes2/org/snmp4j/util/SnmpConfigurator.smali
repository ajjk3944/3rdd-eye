.class public Lorg/snmp4j/util/SnmpConfigurator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;
    }
.end annotation


# static fields
.field public static final F_ADDRESS:Ljava/lang/String; = "s<(udp|tcp|dtls|tls):.*[/[0-9]+]?>"

.field public static final F_AUTHORITATIVE_ENGINE_ID:Ljava/lang/String; = "o<\\n\\n[:\\n\\n]*>"

.field public static final F_AUTH_PASSPHRASE:Ljava/lang/String; = "s<.*>"

.field public static final F_AUTH_PROTOCOL:Ljava/lang/String; = "s<(MD5|SHA|SHA224|SHA256|SHA384|SHA512)>"

.field public static final F_BIND_ADDRESS:Ljava/lang/String; = "s<(udp|tcp|dtls|tls):.*[/[0-9]+]?>"

.field public static final F_BOOT_COUNTER:Ljava/lang/String; = "i{=0}"

.field public static final F_COMMUNITY:Ljava/lang/String; = "s{=public}"

.field public static final F_CONTEXT_ENGINE_ID:Ljava/lang/String; = "o<\\n\\n[:\\n\\n]*>"

.field public static final F_CONTEXT_NAME:Ljava/lang/String; = "s{=}"

.field public static final F_DTLS_VERSION:Ljava/lang/String; = "s{=DTLSv1.2}<DTLSv1[\\.0|\\.2|\\.3]?[,DTLSv1[\\.0|\\.2|\\.3]?]*>"

.field public static final F_LOCAL_ENGINE_ID:Ljava/lang/String; = "o<\\n\\n[:\\n\\n]*>"

.field public static final F_MAX_REPETITIONS:Ljava/lang/String; = "i{=10}"

.field public static final F_NON_REPEATERS:Ljava/lang/String; = "i{=0}"

.field public static final F_OPERATION:Ljava/lang/String; = "s<(?i)(GET|GETNEXT|GETBULK|TRAP|NOTIFICATION|SET|INFORM)>"

.field public static final F_PRIV_PASSPHRASE:Ljava/lang/String; = "s<.*>"

.field public static final F_PRIV_PROTOCOL:Ljava/lang/String; = "s<(DES|3DES|AES|AES128|AES192|AES256)>"

.field public static final F_RETRIES:Ljava/lang/String; = "i"

.field public static final F_SECURITY_NAME:Ljava/lang/String; = "s"

.field public static final F_SEC_LEVEL:Ljava/lang/String; = "i"

.field public static final F_SEC_MODEL:Ljava/lang/String; = "i"

.field public static final F_TIMEOUT:Ljava/lang/String; = "l"

.field public static final F_TLS_CERT_FINGERPRINT:Ljava/lang/String; = "o<\\n\\n[:\\n\\n]*>"

.field public static final F_TLS_LOCAL_ID:Ljava/lang/String; = "s"

.field public static final F_TLS_PEER_ID:Ljava/lang/String; = "s"

.field public static final F_TLS_TRUST_CA:Ljava/lang/String; = "s"

.field public static final F_TLS_VERSION:Ljava/lang/String; = "s{=TLSv1.2}<TLSv1[\\.1|\\.2|\\.3]?[,TLSv1[\\.1|\\.2|\\.3]?]*>"

.field public static final F_TRAPV1_AGENT_ADDR:Ljava/lang/String; = "s{=0.0.0.0}<\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}>"

.field public static final F_TRAPV1_ENTERPRISE:Ljava/lang/String; = "s{=0.0}<([a-zA-Z\\-0-9]*:)?[0-9a-zA-Z\\-\\.]*>"

.field public static final F_TRAPV1_GENERIC_ID:Ljava/lang/String; = "i{=0}"

.field public static final F_TRAPV1_SPECIFIC_ID:Ljava/lang/String; = "i{=0}"

.field public static final F_TRAP_OID:Ljava/lang/String; = "s{=1.3.6.1.6.3.1.1.5.1}<([a-zA-Z\\-0-9]*:)?[0-9a-zA-Z\\-\\.]*>"

.field public static final F_TRAP_UPTIME:Ljava/lang/String; = "l{=0}"

.field public static final F_VERSION:Ljava/lang/String; = "s<1|2c|3>"

.field public static final O_ADDRESS:Ljava/lang/String; = "address"

.field public static final O_AUTHORITATIVE_ENGINE_ID:Ljava/lang/String; = "e"

.field public static final O_AUTH_PASSPHRASE:Ljava/lang/String; = "A"

.field public static final O_AUTH_PROTOCOL:Ljava/lang/String; = "a"

.field public static final O_BIND_ADDRESS:Ljava/lang/String; = "b"

.field public static final O_BOOT_COUNTER:Ljava/lang/String; = "bc"

.field public static final O_COMMUNITY:Ljava/lang/String; = "c"

.field public static final O_CONTEXT_ENGINE_ID:Ljava/lang/String; = "E"

.field public static final O_CONTEXT_NAME:Ljava/lang/String; = "n"

.field public static final O_DTLS_VERSION:Ljava/lang/String; = "dtls-version"

.field public static final O_LOCAL_ENGINE_ID:Ljava/lang/String; = "l"

.field public static final O_MAX_REPETITIONS:Ljava/lang/String; = "Cr"

.field public static final O_NON_REPEATERS:Ljava/lang/String; = "Cn"

.field public static final O_OPERATION:Ljava/lang/String; = "o"

.field public static final O_PRIV_PASSPHRASE:Ljava/lang/String; = "Y"

.field public static final O_PRIV_PROTOCOL:Ljava/lang/String; = "y"

.field public static final O_RETRIES:Ljava/lang/String; = "r"

.field public static final O_SECURITY_NAME:Ljava/lang/String; = "u"

.field public static final O_SEC_LEVEL:Ljava/lang/String; = "sl"

.field public static final O_SEC_MODEL:Ljava/lang/String; = "sm"

.field public static final O_TIMEOUT:Ljava/lang/String; = "t"

.field public static final O_TLS_CERT_FINGERPRINT:Ljava/lang/String; = "tls-cert-fingerprint"

.field public static final O_TLS_LOCAL_ID:Ljava/lang/String; = "tls-local-id"

.field public static final O_TLS_PEER_ID:Ljava/lang/String; = "tls-peer-id"

.field public static final O_TLS_TRUST_CA:Ljava/lang/String; = "tls-trust-ca"

.field public static final O_TLS_VERSION:Ljava/lang/String; = "tls-version"

.field public static final O_TRAPV1_AGENT_ADDR:Ljava/lang/String; = "Ta"

.field public static final O_TRAPV1_ENTERPRISE:Ljava/lang/String; = "Te"

.field public static final O_TRAPV1_GENERIC_ID:Ljava/lang/String; = "Tg"

.field public static final O_TRAPV1_SPECIFIC_ID:Ljava/lang/String; = "Ts"

.field public static final O_TRAP_OID:Ljava/lang/String; = "To"

.field public static final O_TRAP_UPTIME:Ljava/lang/String; = "Tu"

.field public static final O_VERSION:Ljava/lang/String; = "v"

.field public static final P_ADDRESS:Ljava/lang/String; = "org.snmp4j.arg.address"

.field public static final P_AUTHORITATIVE_ENGINE_ID:Ljava/lang/String; = "org.snmp4j.arg.authoritativeEngineID"

.field public static final P_AUTH_PASSPHRASE:Ljava/lang/String; = "org.snmp4j.arg.authPassphrase"

.field public static final P_AUTH_PROTOCOL:Ljava/lang/String; = "org.snmp4j.arg.authProtocol"

.field public static final P_BIND_ADDRESS:Ljava/lang/String; = "org.snmp4j.arg.bindAddress"

.field public static final P_BOOT_COUNTER:Ljava/lang/String; = "org.snmp4j.arg.bootCounter"

.field public static final P_COMMUNITY:Ljava/lang/String; = "org.snmp4j.arg.community"

.field public static final P_CONTEXT_ENGINE_ID:Ljava/lang/String; = "org.snmp4j.arg.contextEngineID"

.field public static final P_CONTEXT_NAME:Ljava/lang/String; = "org.snmp4j.arg.contextName"

.field public static final P_DTLS_VERSION:Ljava/lang/String; = "org.snmp4j.arg.dtlsVersion"

.field public static final P_LOCAL_ENGINE_ID:Ljava/lang/String; = "org.snmp4j.arg.localEngineID"

.field public static final P_MAX_REPETITIONS:Ljava/lang/String; = "org.snmp4j.arg.maxRepetitions"

.field public static final P_NON_REPEATERS:Ljava/lang/String; = "org.snmp4j.arg.nonRepeaters"

.field public static final P_OPERATION:Ljava/lang/String; = "org.snmp4j.arg.operation"

.field public static final P_PRIV_PASSPHRASE:Ljava/lang/String; = "org.snmp4j.arg.privPassphrase"

.field public static final P_PRIV_PROTOCOL:Ljava/lang/String; = "org.snmp4j.arg.privProtocol"

.field public static final P_RETRIES:Ljava/lang/String; = "org.snmp4j.arg.retries"

.field public static final P_SECURITY_NAME:Ljava/lang/String; = "org.snmp4j.arg.securityName"

.field public static final P_SEC_LEVEL:Ljava/lang/String; = "org.snmp4j.arg.securityLevel"

.field public static final P_SEC_MODEL:Ljava/lang/String; = "org.snmp4j.arg.securityModel"

.field public static final P_TIMEOUT:Ljava/lang/String; = "org.snmp4j.arg.timeout"

.field public static final P_TLS_CERT_FINGERPRINT:Ljava/lang/String; = "org.snmp4j.arg.tlsCertFingerprint"

.field public static final P_TLS_LOCAL_ID:Ljava/lang/String; = "org.snmp4j.arg.tlsLocalID"

.field public static final P_TLS_PEER_ID:Ljava/lang/String; = "org.snmp4j.arg.tlsPeerID"

.field public static final P_TLS_TRUST_CA:Ljava/lang/String; = "org.snmp4j.arg.tlsTrustCA"

.field public static final P_TLS_VERSION:Ljava/lang/String; = "org.snmp4j.arg.tlsVersion"

.field public static final P_TRAPV1_AGENT_ADDR:Ljava/lang/String; = "org.snmp4j.arg.trapv1.agentAddr"

.field public static final P_TRAPV1_ENTERPRISE:Ljava/lang/String; = "org.snmp4j.arg.trap.trapv1.enterprise"

.field public static final P_TRAPV1_GENERIC_ID:Ljava/lang/String; = "org.snmp4j.arg.trap.trapv1.genericID"

.field public static final P_TRAPV1_SPECIFIC_ID:Ljava/lang/String; = "org.snmp4j.arg.trap.trapv1.specificID"

.field public static final P_TRAP_OID:Ljava/lang/String; = "org.snmp4j.arg.trap.trapOID"

.field public static final P_TRAP_UPTIME:Ljava/lang/String; = "org.snmp4j.arg.trap.trapUpTime"

.field public static final P_VERSION:Ljava/lang/String; = "org.snmp4j.arg.version"


# instance fields
.field private commandResponder:Z

.field private oAddress:Ljava/lang/String;

.field private oAgentAddr:Ljava/lang/String;

.field private oAuthPassphrase:Ljava/lang/String;

.field private oAuthProtocol:Ljava/lang/String;

.field private oAuthoritativeEngineID:Ljava/lang/String;

.field private oBindAddress:Ljava/lang/String;

.field private oBootCounter:Ljava/lang/String;

.field private oCommunity:Ljava/lang/String;

.field private oContextEngineID:Ljava/lang/String;

.field private oContextName:Ljava/lang/String;

.field private oDtlsVersion:Ljava/lang/String;

.field private oEnterprise:Ljava/lang/String;

.field private oGenericID:Ljava/lang/String;

.field private oLocalEngineID:Ljava/lang/String;

.field private oMaxRepetitions:Ljava/lang/String;

.field private oNonRepeaters:Ljava/lang/String;

.field private oOperation:Ljava/lang/String;

.field private oPrivPassphrase:Ljava/lang/String;

.field private oPrivProtocol:Ljava/lang/String;

.field private oRetries:Ljava/lang/String;

.field private oSecLevel:Ljava/lang/String;

.field private oSecModel:Ljava/lang/String;

.field private oSecurityName:Ljava/lang/String;

.field private oSpecificID:Ljava/lang/String;

.field private oTimeout:Ljava/lang/String;

.field private oTlsCertFingerprint:Ljava/lang/String;

.field private oTlsLocalID:Ljava/lang/String;

.field private oTlsPeerID:Ljava/lang/String;

.field private oTlsTrustCA:Ljava/lang/String;

.field private oTlsVersion:Ljava/lang/String;

.field private oTrapOID:Ljava/lang/String;

.field private oTrapSysUpTime:Ljava/lang/String;

.field private oVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    invoke-direct {p0, v0}, Lorg/snmp4j/util/SnmpConfigurator;-><init>(Ljava/util/Properties;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Properties;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "org.snmp4j.arg.version"

    const-string v1, "v"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oVersion:Ljava/lang/String;

    .line 4
    const-string v0, "org.snmp4j.arg.localEngineID"

    const-string v1, "l"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oLocalEngineID:Ljava/lang/String;

    .line 5
    const-string v0, "org.snmp4j.arg.retries"

    const-string v1, "r"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oRetries:Ljava/lang/String;

    .line 6
    const-string v0, "org.snmp4j.arg.timeout"

    const-string v1, "t"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTimeout:Ljava/lang/String;

    .line 7
    const-string v0, "org.snmp4j.arg.address"

    const-string v1, "address"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAddress:Ljava/lang/String;

    .line 8
    const-string v0, "org.snmp4j.arg.bindAddress"

    const-string v1, "b"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oBindAddress:Ljava/lang/String;

    .line 9
    const-string v0, "org.snmp4j.arg.community"

    const-string v1, "c"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oCommunity:Ljava/lang/String;

    .line 10
    const-string v0, "org.snmp4j.arg.securityName"

    const-string v1, "u"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecurityName:Ljava/lang/String;

    .line 11
    const-string v0, "org.snmp4j.arg.authoritativeEngineID"

    const-string v1, "e"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAuthoritativeEngineID:Ljava/lang/String;

    .line 12
    const-string v0, "org.snmp4j.arg.authPassphrase"

    const-string v1, "A"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAuthPassphrase:Ljava/lang/String;

    .line 13
    const-string v0, "org.snmp4j.arg.authProtocol"

    const-string v1, "a"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAuthProtocol:Ljava/lang/String;

    .line 14
    const-string v0, "org.snmp4j.arg.privPassphrase"

    const-string v1, "Y"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oPrivPassphrase:Ljava/lang/String;

    .line 15
    const-string v0, "org.snmp4j.arg.privProtocol"

    const-string v1, "y"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oPrivProtocol:Ljava/lang/String;

    .line 16
    const-string v0, "org.snmp4j.arg.operation"

    const-string v1, "o"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oOperation:Ljava/lang/String;

    .line 17
    const-string v0, "org.snmp4j.arg.maxRepetitions"

    const-string v1, "Cr"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oMaxRepetitions:Ljava/lang/String;

    .line 18
    const-string v0, "org.snmp4j.arg.nonRepeaters"

    const-string v1, "Cn"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oNonRepeaters:Ljava/lang/String;

    .line 19
    const-string v0, "org.snmp4j.arg.bootCounter"

    const-string v1, "bc"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oBootCounter:Ljava/lang/String;

    .line 20
    const-string v0, "org.snmp4j.arg.contextName"

    const-string v1, "n"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oContextName:Ljava/lang/String;

    .line 21
    const-string v0, "org.snmp4j.arg.contextEngineID"

    const-string v1, "E"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oContextEngineID:Ljava/lang/String;

    .line 22
    const-string v0, "org.snmp4j.arg.securityLevel"

    const-string v1, "sl"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecLevel:Ljava/lang/String;

    .line 23
    const-string v0, "org.snmp4j.arg.securityModel"

    const-string v1, "sm"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecModel:Ljava/lang/String;

    .line 24
    const-string v0, "org.snmp4j.arg.trapv1.agentAddr"

    const-string v1, "Ta"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAgentAddr:Ljava/lang/String;

    .line 25
    const-string v0, "org.snmp4j.arg.trap.trapOID"

    const-string v1, "To"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTrapOID:Ljava/lang/String;

    .line 26
    const-string v0, "org.snmp4j.arg.trap.trapUpTime"

    const-string v1, "Tu"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTrapSysUpTime:Ljava/lang/String;

    .line 27
    const-string v0, "org.snmp4j.arg.trap.trapv1.specificID"

    const-string v1, "Ts"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSpecificID:Ljava/lang/String;

    .line 28
    const-string v0, "org.snmp4j.arg.trap.trapv1.genericID"

    const-string v1, "Tg"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oGenericID:Ljava/lang/String;

    .line 29
    const-string v0, "org.snmp4j.arg.trap.trapv1.enterprise"

    const-string v1, "Te"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oEnterprise:Ljava/lang/String;

    .line 30
    const-string v0, "org.snmp4j.arg.tlsLocalID"

    const-string v1, "tls-local-id"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsLocalID:Ljava/lang/String;

    .line 31
    const-string v0, "org.snmp4j.arg.tlsPeerID"

    const-string v1, "tls-peer-id"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsPeerID:Ljava/lang/String;

    .line 32
    const-string v0, "org.snmp4j.arg.tlsTrustCA"

    const-string v1, "tls-trust-ca"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsTrustCA:Ljava/lang/String;

    .line 33
    const-string v0, "org.snmp4j.arg.tlsVersion"

    const-string v1, "tls-version"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsVersion:Ljava/lang/String;

    .line 34
    const-string v0, "org.snmp4j.arg.dtlsVersion"

    const-string v1, "dtls-version"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oDtlsVersion:Ljava/lang/String;

    .line 35
    const-string v0, "org.snmp4j.arg.tlsCertFingerprint"

    const-string v1, "tls-cert-fingerprint"

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsCertFingerprint:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/Properties;Z)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lorg/snmp4j/util/SnmpConfigurator;-><init>(Ljava/util/Properties;)V

    .line 39
    iput-boolean p2, p0, Lorg/snmp4j/util/SnmpConfigurator;->commandResponder:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lorg/snmp4j/util/SnmpConfigurator;-><init>()V

    .line 37
    iput-boolean p1, p0, Lorg/snmp4j/util/SnmpConfigurator;->commandResponder:Z

    return-void
.end method

.method static synthetic access$000(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTrapSysUpTime:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTrapOID:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1000(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oNonRepeaters:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAgentAddr:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oGenericID:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSpecificID:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oEnterprise:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$600(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oContextEngineID:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$700(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oContextName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$800(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oOperation:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$900(Lorg/snmp4j/util/SnmpConfigurator;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oMaxRepetitions:Ljava/lang/String;

    return-object p0
.end method

.method private configureEngine(Lorg/snmp4j/Snmp;Lorg/snmp4j/security/USM;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/Snmp;",
            "Lorg/snmp4j/security/USM;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oBootCounter:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p3, v0, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, v0}, Lorg/snmp4j/security/USM;->setEngineBoots(I)V

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object p2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oLocalEngineID:Ljava/lang/String;

    invoke-static {p3, p2, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 p3, 0x0

    invoke-static {p2, p3}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lorg/snmp4j/Snmp;->getLocalEngineID()[B

    move-result-object p2

    if-nez p2, :cond_2

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->createLocalEngineID()[B

    move-result-object p2

    invoke-virtual {p1, p2, v0, v1}, Lorg/snmp4j/Snmp;->setLocalEngine([BII)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p2

    invoke-virtual {p1, p2, v0, v1}, Lorg/snmp4j/Snmp;->setLocalEngine([BII)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;
    .locals 0

    if-nez p0, :cond_0

    move-object p0, p1

    :cond_0
    if-eqz p0, :cond_1

    const-string p1, "0x"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x3a

    invoke-static {p0, p1}, Lorg/snmp4j/smi/OctetString;->fromHexString(Ljava/lang/String;C)Lorg/snmp4j/smi/OctetString;

    move-result-object p0

    goto :goto_0

    :cond_1
    if-eqz p0, :cond_2

    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1, p0}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    move-object p0, p1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static getAuthProtocolOid(Ljava/lang/String;)Lorg/snmp4j/smi/OID;
    .locals 1

    const-string v0, "MD5"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lorg/snmp4j/security/AuthMD5;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_0

    :cond_0
    const-string v0, "SHA"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lorg/snmp4j/security/AuthSHA;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_0

    :cond_1
    const-string v0, "SHA224"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lorg/snmp4j/security/AuthHMAC128SHA224;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_0

    :cond_2
    const-string v0, "SHA256"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lorg/snmp4j/security/AuthHMAC192SHA256;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_0

    :cond_3
    const-string v0, "SHA384"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lorg/snmp4j/security/AuthHMAC256SHA384;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_0

    :cond_4
    const-string v0, "SHA512"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, Lorg/snmp4j/security/AuthHMAC384SHA512;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_0

    :cond_5
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static getPrivProtocolOid(Ljava/lang/String;)Lorg/snmp4j/smi/OID;
    .locals 1

    const-string v0, "DES"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lorg/snmp4j/security/PrivDES;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_0
    const-string v0, "3DES"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lorg/snmp4j/security/Priv3DES;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_1
    const-string v0, "AES"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "AES128"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "AES192"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lorg/snmp4j/security/PrivAES192;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_3
    const-string v0, "AES256"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lorg/snmp4j/security/PrivAES256;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_4
    const-string v0, "AES192p"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lorg/snmp4j/security/nonstandard/PrivAES192With3DESKeyExtension;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_5
    const-string v0, "AES256p"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    sget-object p0, Lorg/snmp4j/security/nonstandard/PrivAES256With3DESKeyExtension;->ID:Lorg/snmp4j/smi/OID;

    goto :goto_1

    :cond_6
    const/4 p0, 0x0

    goto :goto_1

    :cond_7
    :goto_0
    sget-object p0, Lorg/snmp4j/security/PrivAES128;->ID:Lorg/snmp4j/smi/OID;

    :goto_1
    return-object p0
.end method

.method private getTlsProperties(Ljava/util/Map;)Ljava/util/Properties;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/util/Properties;"
        }
    .end annotation

    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsLocalID:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v3, "org.snmp4j.arg.tlsLocalID"

    invoke-virtual {v0, v3, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsTrustCA:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v3, "org.snmp4j.arg.tlsTrustCA"

    invoke-virtual {v0, v3, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsPeerID:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v3, "org.snmp4j.arg.tlsPeerID"

    invoke-virtual {v0, v3, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecurityName:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v3, "org.snmp4j.arg.securityName"

    invoke-virtual {v0, v3, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsVersion:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v3, "org.snmp4j.arg.tlsVersion"

    invoke-virtual {v0, v3, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oDtlsVersion:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_5

    const-string v3, "org.snmp4j.arg.dtlsVersion"

    invoke-virtual {v0, v3, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :cond_5
    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTlsCertFingerprint:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    const-string v1, "org.snmp4j.arg.tlsCertFingerprint"

    invoke-virtual {v0, v1, p1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :cond_6
    return-object v0
.end method

.method private setSecurityLevelOnTarget(Ljava/util/Map;Lorg/snmp4j/AbstractTarget;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;",
            "Lorg/snmp4j/AbstractTarget;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecLevel:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oPrivPassphrase:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p2, Lorg/snmp4j/CertifiedTarget;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAuthPassphrase:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    invoke-virtual {p2, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x3

    invoke-virtual {p2, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    :goto_1
    return-void
.end method


# virtual methods
.method public configure(Lorg/snmp4j/Snmp;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/Snmp;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lorg/snmp4j/Snmp;->getUSM()Lorg/snmp4j/security/USM;

    move-result-object v0

    invoke-virtual {p1}, Lorg/snmp4j/Snmp;->getMessageDispatcher()Lorg/snmp4j/MessageDispatcher;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1, p2}, Lorg/snmp4j/util/SnmpConfigurator;->configure(Lorg/snmp4j/Snmp;Lorg/snmp4j/security/USM;Lorg/snmp4j/MessageDispatcher;Ljava/util/Map;)V

    return-void
.end method

.method public configure(Lorg/snmp4j/Snmp;Lorg/snmp4j/security/USM;Lorg/snmp4j/MessageDispatcher;Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/Snmp;",
            "Lorg/snmp4j/security/USM;",
            "Lorg/snmp4j/MessageDispatcher;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 2
    invoke-direct {p0, p1, p2, p4}, Lorg/snmp4j/util/SnmpConfigurator;->configureEngine(Lorg/snmp4j/Snmp;Lorg/snmp4j/security/USM;Ljava/util/Map;)V

    .line 3
    iget-object p1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecurityName:Ljava/lang/String;

    const/4 v0, 0x0

    .line 4
    invoke-static {p4, p1, v0}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 5
    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAuthPassphrase:Ljava/lang/String;

    .line 6
    invoke-static {p4, v1, v0}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    iget-object v2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oPrivPassphrase:Ljava/lang/String;

    .line 8
    invoke-static {p4, v2, v0}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 9
    iget-object v3, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAuthProtocol:Ljava/lang/String;

    .line 10
    invoke-static {p4, v3, v0}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 11
    iget-object v4, p0, Lorg/snmp4j/util/SnmpConfigurator;->oPrivProtocol:Ljava/lang/String;

    .line 12
    invoke-static {p4, v4, v0}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 13
    invoke-static {v3}, Lorg/snmp4j/util/SnmpConfigurator;->getAuthProtocolOid(Ljava/lang/String;)Lorg/snmp4j/smi/OID;

    move-result-object v6

    .line 14
    invoke-static {v0}, Lorg/snmp4j/util/SnmpConfigurator;->getPrivProtocolOid(Ljava/lang/String;)Lorg/snmp4j/smi/OID;

    move-result-object v8

    const/4 v0, 0x0

    .line 15
    invoke-static {p1, v0}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    .line 16
    new-instance v3, Lorg/snmp4j/security/UsmUser;

    .line 17
    invoke-static {v1, v0}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v7

    .line 18
    invoke-static {v2, v0}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    move-object v4, v3

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lorg/snmp4j/security/UsmUser;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;)V

    .line 19
    invoke-virtual {p2, p1, v3}, Lorg/snmp4j/security/USM;->addUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V

    .line 20
    :cond_0
    invoke-direct {p0, p4}, Lorg/snmp4j/util/SnmpConfigurator;->getTlsProperties(Ljava/util/Map;)Ljava/util/Properties;

    move-result-object p1

    .line 21
    invoke-interface {p3}, Lorg/snmp4j/MessageDispatcher;->getTransportMappings()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/snmp4j/TransportMapping;

    .line 22
    instance-of p4, p3, Lorg/snmp4j/transport/tls/X509TlsTransportMappingConfig;

    if-eqz p4, :cond_1

    .line 23
    check-cast p3, Lorg/snmp4j/transport/tls/X509TlsTransportMappingConfig;

    .line 24
    new-instance p4, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;

    iget-boolean v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->commandResponder:Z

    invoke-direct {p4, p1, v0}, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;-><init>(Ljava/util/Properties;Z)V

    invoke-interface {p3, p4}, Lorg/snmp4j/transport/tls/TlsTransportMappingConfig;->setSecurityCallback(Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V

    .line 25
    invoke-interface {p3}, Lorg/snmp4j/transport/tls/TlsTransportMappingConfig;->getProtocolVersionPropertyName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_1

    .line 26
    invoke-interface {p3}, Lorg/snmp4j/transport/tls/TlsTransportMappingConfig;->getProtocolVersionPropertyName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-string v0, ","

    invoke-virtual {p4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p4

    .line 27
    invoke-interface {p3, p4}, Lorg/snmp4j/transport/tls/TlsTransportMappingConfig;->setProtocolVersions([Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public getBindAddress(Ljava/util/Map;)Lorg/snmp4j/smi/Address;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lorg/snmp4j/smi/Address;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oBindAddress:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/0"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-static {p1}, Lorg/snmp4j/smi/GenericAddress;->parse(Ljava/lang/String;)Lorg/snmp4j/smi/Address;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getPDUFactory(Ljava/util/Map;)Lorg/snmp4j/util/PDUFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lorg/snmp4j/util/PDUFactory;"
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;

    invoke-direct {v0, p0, p1}, Lorg/snmp4j/util/SnmpConfigurator$InnerPDUFactory;-><init>(Lorg/snmp4j/util/SnmpConfigurator;Ljava/util/Map;)V

    return-object v0
.end method

.method public getTarget(Ljava/util/Map;)Lorg/snmp4j/Target;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lorg/snmp4j/Target;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->oVersion:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oCommunity:Ljava/lang/String;

    invoke-static {p1, v2, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "public"

    invoke-static {v2, v3}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    iget-object v3, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecModel:Ljava/lang/String;

    invoke-static {p1, v3, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const-string v4, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v0, Lorg/snmp4j/CommunityTarget;

    invoke-direct {v0}, Lorg/snmp4j/CommunityTarget;-><init>()V

    invoke-interface {v0, v1}, Lorg/snmp4j/Target;->setVersion(I)V

    invoke-virtual {v0, v2}, Lorg/snmp4j/CommunityTarget;->setCommunity(Lorg/snmp4j/smi/OctetString;)V

    goto/16 :goto_0

    :cond_0
    const-string v4, "2c"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    new-instance v0, Lorg/snmp4j/CommunityTarget;

    invoke-direct {v0}, Lorg/snmp4j/CommunityTarget;-><init>()V

    invoke-interface {v0, v4}, Lorg/snmp4j/Target;->setVersion(I)V

    invoke-virtual {v0, v2}, Lorg/snmp4j/CommunityTarget;->setCommunity(Lorg/snmp4j/smi/OctetString;)V

    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x4

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v2, v0, :cond_3

    :cond_2
    if-nez v3, :cond_5

    invoke-direct {p0, p1}, Lorg/snmp4j/util/SnmpConfigurator;->getTlsProperties(Ljava/util/Map;)Ljava/util/Properties;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Properties;->size()I

    move-result v2

    if-le v2, v4, :cond_5

    :cond_3
    iget-object v2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecurityName:Ljava/lang/String;

    invoke-static {p1, v2, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_4

    new-instance v3, Lorg/snmp4j/CertifiedTarget;

    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4, v2}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lorg/snmp4j/CertifiedTarget;-><init>(Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {v3, v0}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    invoke-direct {p0, p1, v3}, Lorg/snmp4j/util/SnmpConfigurator;->setSecurityLevelOnTarget(Ljava/util/Map;Lorg/snmp4j/AbstractTarget;)V

    move-object v0, v3

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mandatory securityName for TLS target not specified with option -"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecurityName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance v0, Lorg/snmp4j/UserTarget;

    invoke-direct {v0}, Lorg/snmp4j/UserTarget;-><init>()V

    iget-object v2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAuthoritativeEngineID:Ljava/lang/String;

    invoke-static {p1, v2, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    invoke-static {v2, v3}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/snmp4j/UserTarget;->setAuthoritativeEngineID([B)V

    :cond_6
    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    iget-object v2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oSecurityName:Ljava/lang/String;

    invoke-static {p1, v2, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_7

    invoke-static {v2, v3}, Lorg/snmp4j/util/SnmpConfigurator;->createOctetString(Ljava/lang/String;Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/snmp4j/AbstractTarget;->setSecurityName(Lorg/snmp4j/smi/OctetString;)V

    :cond_7
    invoke-direct {p0, p1, v0}, Lorg/snmp4j/util/SnmpConfigurator;->setSecurityLevelOnTarget(Ljava/util/Map;Lorg/snmp4j/AbstractTarget;)V

    :goto_0
    iget-object v2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oRetries:Ljava/lang/String;

    invoke-static {p1, v2, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    goto :goto_1

    :cond_8
    move v2, v1

    :goto_1
    invoke-interface {v0, v2}, Lorg/snmp4j/Target;->setRetries(I)V

    iget-object v2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oTimeout:Ljava/lang/String;

    invoke-static {p1, v2, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    goto :goto_2

    :cond_9
    const-wide/16 v2, 0x1388

    :goto_2
    invoke-interface {v0, v2, v3}, Lorg/snmp4j/Target;->setTimeout(J)V

    iget-object v2, p0, Lorg/snmp4j/util/SnmpConfigurator;->oAddress:Ljava/lang/String;

    invoke-static {p1, v2, v1}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_b

    const/16 v1, 0x2f

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gtz v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/161"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_a
    invoke-static {p1}, Lorg/snmp4j/smi/GenericAddress;->parse(Ljava/lang/String;)Lorg/snmp4j/smi/Address;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/Target;->setAddress(Lorg/snmp4j/smi/Address;)V

    :cond_b
    return-object v0
.end method

.method public isCommandResponder()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/SnmpConfigurator;->commandResponder:Z

    return v0
.end method

.method public setCommandResponder(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/SnmpConfigurator;->commandResponder:Z

    return-void
.end method
