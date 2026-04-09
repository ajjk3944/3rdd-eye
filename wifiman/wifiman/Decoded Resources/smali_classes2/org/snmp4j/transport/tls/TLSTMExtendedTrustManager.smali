.class public Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;
.super Ljavax/net/ssl/X509ExtendedTrustManager;
.source "SourceFile"


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field

.field private tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

.field private tmStateReference:Lorg/snmp4j/TransportStateReference;

.field trustManager:Ljavax/net/ssl/X509TrustManager;

.field private useClientMode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/mp/CounterSupport;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;Ljavax/net/ssl/X509TrustManager;ZLorg/snmp4j/TransportStateReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/mp/CounterSupport;",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;",
            "Ljavax/net/ssl/X509TrustManager;",
            "Z",
            "Lorg/snmp4j/TransportStateReference;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljavax/net/ssl/X509ExtendedTrustManager;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    iput-object p2, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    iput-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    iput-boolean p4, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->useClientMode:Z

    iput-object p5, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    return-void
.end method

.method private checkClientTrustedIntern([Ljava/security/cert/X509Certificate;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v0}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/CertifiedIdentity;->getClientFingerprint()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-direct {p0, p1, v0, v1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->isMatchingFingerprint([Ljava/security/cert/X509Certificate;Lorg/snmp4j/smi/OctetString;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->useClientMode:Z

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    if-eqz v0, :cond_2

    aget-object v3, p1, v2

    invoke-interface {v0, v3}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->isClientCertificateAccepted(Ljava/security/cert/Certificate;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Client is trusted with certificate \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v2

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_1
    return v1

    :cond_2
    return v2
.end method

.method private isMatchingFingerprint([Ljava/security/cert/X509Certificate;Lorg/snmp4j/smi/OctetString;Z)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    iget-object v3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    sget-object v4, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lorg/snmp4j/transport/tls/TLSTMUtil;->isMatchingFingerprint([Ljava/security/cert/X509Certificate;Lorg/snmp4j/smi/OctetString;ZLorg/snmp4j/mp/CounterSupport;Lorg/snmp4j/log/LogAdapter;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private postCheckServerTrusted([Ljava/security/cert/X509Certificate;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    iget-boolean v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->useClientMode:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->isServerCertificateAccepted([Ljava/security/cert/Certificate;)Z

    :cond_0
    return-void
.end method

.method private preCheckServerTrusted([Ljava/security/cert/X509Certificate;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v0}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v0}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/CertifiedIdentity;->getServerFingerprint()Lorg/snmp4j/smi/OctetString;

    move-result-object v3

    iget-object v5, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    sget-object v6, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    const/4 v4, 0x1

    move-object v2, p1

    move-object v7, p0

    invoke-static/range {v2 .. v7}, Lorg/snmp4j/transport/tls/TLSTMUtil;->isMatchingFingerprint([Ljava/security/cert/X509Certificate;Lorg/snmp4j/smi/OctetString;ZLorg/snmp4j/mp/CounterSupport;Lorg/snmp4j/log/LogAdapter;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    aget-object v2, p1, v0

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v2, v3}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getSubjAltName(Ljava/util/Collection;I)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CertificateParsingException while verifying server certificate "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljavax/security/auth/x500/X500Principal;->getName()Ljava/lang/String;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v2}, Lorg/snmp4j/TransportStateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {v2}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getCanonicalHostName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "Peer hostname "

    if-lez v3, :cond_4

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x2a

    if-ne v3, v5, :cond_2

    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " matches dNSName "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_3
    return v1

    :cond_4
    sget-object v1, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " did not match dNSName "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_5
    return v0
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->checkClientTrustedIntern([Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    invoke-interface {v0, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 3
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p0, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 4
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p0, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 5
    sget-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Client certificate validation failed for \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    aget-object p1, p1, v2

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 6
    throw p2

    :cond_0
    :goto_0
    return-void
.end method

.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 7
    sget-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "checkClientTrusted with socket"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 8
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->checkClientTrustedIntern([Ljava/security/cert/X509Certificate;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 9
    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    instance-of v2, v1, Ljavax/net/ssl/X509ExtendedTrustManager;

    if-eqz v2, :cond_0

    .line 10
    const-string v1, "Extended checkClientTrusted with socket"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 11
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    check-cast v0, Ljavax/net/ssl/X509ExtendedTrustManager;

    invoke-virtual {v0, p1, p2, p3}, Ljavax/net/ssl/X509ExtendedTrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {v1, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 13
    :goto_0
    iget-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 14
    iget-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 15
    sget-object p3, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Client certificate validation failed for \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 16
    throw p2

    :cond_1
    :goto_1
    return-void
.end method

.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 17
    sget-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "checkClientTrusted with sslEngine"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 18
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->checkClientTrustedIntern([Ljava/security/cert/X509Certificate;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 19
    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    instance-of v2, v1, Ljavax/net/ssl/X509ExtendedTrustManager;

    if-eqz v2, :cond_0

    .line 20
    const-string v1, "extended checkClientTrusted with sslEngine"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 21
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    check-cast v0, Ljavax/net/ssl/X509ExtendedTrustManager;

    invoke-virtual {v0, p1, p2, p3}, Ljavax/net/ssl/X509ExtendedTrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {v1, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 23
    :goto_0
    iget-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 24
    iget-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 25
    sget-object p3, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Client certificate validation failed for \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 26
    throw p2

    :cond_1
    :goto_1
    return-void
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->preCheckServerTrusted([Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    invoke-interface {v0, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->postCheckServerTrusted([Ljava/security/cert/X509Certificate;)V

    return-void

    :catch_0
    move-exception p2

    .line 4
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p0, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 5
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidServerCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p0, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 6
    sget-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Server certificate validation failed for \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    aget-object p1, p1, v2

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 7
    throw p2
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 8
    sget-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "checkClientTrusted with socket"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 9
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->preCheckServerTrusted([Ljava/security/cert/X509Certificate;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 10
    :cond_0
    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    instance-of v2, v1, Ljavax/net/ssl/X509ExtendedTrustManager;

    if-eqz v2, :cond_1

    .line 11
    const-string v1, "extended checkClientTrusted with socket"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 12
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    check-cast v0, Ljavax/net/ssl/X509ExtendedTrustManager;

    invoke-virtual {v0, p1, p2, p3}, Ljavax/net/ssl/X509ExtendedTrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    .line 13
    :cond_1
    invoke-interface {v1, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->postCheckServerTrusted([Ljava/security/cert/X509Certificate;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    .line 15
    :goto_1
    iget-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 16
    iget-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidServerCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 17
    sget-object p3, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Server certificate validation failed for \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 18
    throw p2
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 19
    sget-object v0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "checkServerTrusted with sslEngine"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 20
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->preCheckServerTrusted([Ljava/security/cert/X509Certificate;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 21
    :cond_0
    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    instance-of v2, v1, Ljavax/net/ssl/X509ExtendedTrustManager;

    if-eqz v2, :cond_1

    .line 22
    const-string v1, "extended checkServerTrusted with sslEngine"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 23
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    check-cast v0, Ljavax/net/ssl/X509ExtendedTrustManager;

    invoke-virtual {v0, p1, p2, p3}, Ljavax/net/ssl/X509ExtendedTrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    .line 24
    :cond_1
    invoke-interface {v1, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :goto_0
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->postCheckServerTrusted([Ljava/security/cert/X509Certificate;)V

    return-void

    .line 26
    :goto_1
    iget-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 27
    iget-object p3, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidServerCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 28
    sget-object p3, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Server certificate validation failed for \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 29
    throw p2
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TLSTMExtendedTrustManager;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    invoke-static {v0, v1}, Lorg/snmp4j/transport/tls/TlsTrustManager;->getAcceptedIssuers(Ljavax/net/ssl/X509TrustManager;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)[Ljava/security/cert/X509Certificate;

    move-result-object v0

    return-object v0
.end method
