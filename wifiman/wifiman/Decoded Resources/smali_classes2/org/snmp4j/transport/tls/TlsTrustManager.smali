.class public Lorg/snmp4j/transport/tls/TlsTrustManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# static fields
.field private static LOGGER:Lorg/snmp4j/log/LogAdapter;


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

    const-class v0, Lorg/snmp4j/transport/tls/TlsTrustManager;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/X509TrustManager;ZLorg/snmp4j/TransportStateReference;Lorg/snmp4j/mp/CounterSupport;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/net/ssl/X509TrustManager;",
            "Z",
            "Lorg/snmp4j/TransportStateReference;",
            "Lorg/snmp4j/mp/CounterSupport;",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    iput-boolean p2, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->useClientMode:Z

    iput-object p3, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    iput-object p4, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    iput-object p5, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-void
.end method

.method public static getAcceptedIssuers(Ljavax/net/ssl/X509TrustManager;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)[Ljava/security/cert/X509Certificate;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/net/ssl/X509TrustManager;",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;)[",
            "Ljava/security/cert/X509Certificate;"
        }
    .end annotation

    .line 2
    invoke-interface {p0}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object p0

    if-eqz p0, :cond_2

    if-eqz p1, :cond_2

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p0, v3

    .line 5
    :try_start_0
    invoke-interface {p1, v4}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->isAcceptedIssuer(Ljava/security/cert/Certificate;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 6
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 7
    :catch_0
    sget-object v5, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Security callback "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " rejected "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 8
    :cond_1
    new-array p0, v2, [Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/security/cert/X509Certificate;

    :cond_2
    return-object p0
.end method

.method private isMatchingFingerprint([Ljava/security/cert/X509Certificate;Lorg/snmp4j/smi/OctetString;Z)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v1

    if-lez v1, :cond_6

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_4

    aget-object v2, p1, v0

    invoke-static {v2}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getFingerprint(Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;

    move-result-object v3

    sget-object v4, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Comparing certificate fingerprint "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " with "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    if-nez v3, :cond_1

    sget-object v3, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to determine fingerprint for certificate "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " and algorithm "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSigAlgName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3, p2}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object p1, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Peer is trusted by fingerprint \'"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' of certificate: \'"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\'"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    if-eqz p3, :cond_5

    sget-object p3, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidServerCertificates:Lorg/snmp4j/smi/OID;

    goto :goto_2

    :cond_5
    sget-object p3, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

    :goto_2
    invoke-direct {v1, p0, p3}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance p3, Ljava/security/cert/CertificateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No fingerprint of provided certificates "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " matched "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_6
    return v0
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    const-string v0, "\'"

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    const-string v2, "Client certificate validation by fingerprint failed for \'"

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object p2, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {p2}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object p2

    invoke-interface {p2}, Lorg/snmp4j/CertifiedIdentity;->getClientFingerprint()Lorg/snmp4j/smi/OctetString;

    move-result-object p2

    invoke-direct {p0, p1, p2, v3}, Lorg/snmp4j/transport/tls/TlsTrustManager;->isMatchingFingerprint([Ljava/security/cert/X509Certificate;Lorg/snmp4j/smi/OctetString;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    sget-object v4, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p0, v4}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance v0, Ljava/security/cert/CertificateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v3

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' (does not match "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lorg/snmp4j/transport/tls/TlsTrustManager;->getSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-result-object v1

    :try_start_0
    iget-boolean v4, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->useClientMode:Z

    if-nez v4, :cond_4

    if-eqz v1, :cond_4

    aget-object p2, p1, v3

    invoke-interface {v1, p2}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->isClientCertificateAccepted(Ljava/security/cert/Certificate;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Client is trusted with certificate \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, p1, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object p2, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    sget-object v4, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p0, v4}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p2, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance p2, Ljava/security/cert/CertificateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, p1, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    invoke-interface {v1, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v2, Lorg/snmp4j/event/CounterEvent;

    sget-object v4, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    invoke-direct {v2, p0, v4}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v2}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v2, Lorg/snmp4j/event/CounterEvent;

    sget-object v4, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidClientCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v2, p0, v4}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v2}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    sget-object v1, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Client certificate validation failed for \'"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v3

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    throw p2
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    const-string v0, "\'"

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v1}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v1}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/CertifiedIdentity;->getServerFingerprint()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-direct {p0, p1, v1, v2}, Lorg/snmp4j/transport/tls/TlsTrustManager;->isMatchingFingerprint([Ljava/security/cert/X509Certificate;Lorg/snmp4j/smi/OctetString;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    return-void

    :cond_0
    move-object v1, v3

    :cond_1
    const/4 v4, 0x0

    :try_start_0
    aget-object v5, p1, v4

    invoke-virtual {v5}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getSubjAltName(Ljava/util/Collection;I)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v5, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v6, Lorg/snmp4j/event/CounterEvent;

    sget-object v7, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidServerCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v6, p0, v7}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v5, v6}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    sget-object v5, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CertificateParsingException while verifying server certificate "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :goto_0
    if-nez v3, :cond_2

    aget-object v5, p1, v4

    invoke-virtual {v5}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljavax/security/auth/x500/X500Principal;->getName()Ljava/lang/String;

    move-result-object v3

    :cond_2
    if-eqz v3, :cond_7

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v1}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v1}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/CertifiedIdentity;->getIdentity()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    if-eqz v1, :cond_7

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v3}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/CertifiedIdentity;->getIdentity()Lorg/snmp4j/smi/OctetString;

    move-result-object v3

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, "Peer hostname "

    if-lez v5, :cond_6

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v7, 0x2a

    if-ne v5, v7, :cond_4

    const/16 v5, 0x2e

    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-lez v5, :cond_3

    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    :cond_4
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object p1, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " matches dNSName "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_5
    return-void

    :cond_6
    sget-object v2, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " did not match dNSName "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_7
    :try_start_1
    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    invoke-interface {v1, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {p0}, Lorg/snmp4j/transport/tls/TlsTrustManager;->getSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-result-object p2

    iget-boolean v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->useClientMode:Z

    if-eqz v1, :cond_9

    if-eqz p2, :cond_9

    invoke-interface {p2, p1}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->isServerCertificateAccepted([Ljava/security/cert/Certificate;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_1

    :cond_8
    sget-object p2, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Server is NOT trusted with certificate \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    new-instance p2, Ljava/security/cert/CertificateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Server\'s certificate is not trusted by this application (although it was trusted by the JRE): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    :goto_1
    return-void

    :catch_1
    move-exception p2

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v2, Lorg/snmp4j/event/CounterEvent;

    sget-object v3, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpenErrors:Lorg/snmp4j/smi/OID;

    invoke-direct {v2, p0, v3}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v2}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    iget-object v1, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tlstmCounters:Lorg/snmp4j/mp/CounterSupport;

    new-instance v2, Lorg/snmp4j/event/CounterEvent;

    sget-object v3, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionInvalidServerCertificates:Lorg/snmp4j/smi/OID;

    invoke-direct {v2, p0, v3}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, v2}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    sget-object v1, Lorg/snmp4j/transport/tls/TlsTrustManager;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Server certificate validation failed for \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v4

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    throw p2
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->trustManager:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {p0}, Lorg/snmp4j/transport/tls/TlsTrustManager;->getSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/snmp4j/transport/tls/TlsTrustManager;->getAcceptedIssuers(Ljavax/net/ssl/X509TrustManager;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)[Ljava/security/cert/X509Certificate;

    move-result-object v0

    return-object v0
.end method

.method protected getSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v0}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v0

    instance-of v0, v0, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v0}, Lorg/snmp4j/TransportStateReference;->getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;->getTlsTmSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;->getTlsTmSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTrustManager;->securityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-object v0
.end method
