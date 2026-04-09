.class public Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
        "Ljava/security/cert/X509Certificate;",
        ">;"
    }
.end annotation


# instance fields
.field private LOGGER:Lorg/snmp4j/log/LogAdapter;

.field private acceptedIssuerDN:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private acceptedSubjectDN:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private localCertMapping:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Address;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private securityNameMapping:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/transport/tls/SecurityNameMapping;",
            "Lorg/snmp4j/smi/OctetString;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->securityNameMapping:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->localCertMapping:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedSubjectDN:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedIssuerDN:Ljava/util/Set;

    return-void
.end method

.method private mapCertToTSN(Ljava/security/cert/X509Certificate;Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateParsingException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Mapping cert to security name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " and date "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    sget-object v0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback$1;->$SwitchMap$org$snmp4j$transport$tls$SecurityNameMapping$CertMappingType:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p3}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getSubjAltName(Ljava/util/Collection;I)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    check-cast p2, Ljava/lang/String;

    const-string p1, "@"

    invoke-virtual {p2, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    aget-object v2, p2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p2, p3

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    :pswitch_1
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object p2

    const/4 p3, 0x2

    invoke-static {p2, p3}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getSubjAltName(Ljava/util/Collection;I)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p2, p1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_2
    :pswitch_2
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object p2

    invoke-static {p2}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getIpAddressFromSubjAltName(Ljava/util/Collection;)Lorg/snmp4j/smi/OctetString;

    move-result-object p2

    if-eqz p2, :cond_3

    return-object p2

    :cond_3
    :pswitch_3
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object p1

    new-instance p2, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p1}, Ljavax/security/auth/x500/X500Principal;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    return-object p2

    :pswitch_4
    return-object p3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public addAcceptedIssuerDN(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedIssuerDN:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addAcceptedSubjectDN(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedSubjectDN:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addLocalCertMapping(Lorg/snmp4j/smi/Address;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->localCertMapping:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public addSecurityNameMapping(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->securityNameMapping:Ljava/util/Map;

    new-instance v1, Lorg/snmp4j/transport/tls/SecurityNameMapping;

    invoke-direct {v1, p1, p3, p2, p4}, Lorg/snmp4j/transport/tls/SecurityNameMapping;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;Lorg/snmp4j/smi/OctetString;)V

    invoke-interface {v0, v1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public getLocalCertificateAlias(Lorg/snmp4j/smi/Address;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->localCertMapping:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->localCertMapping:Ljava/util/Map;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :cond_0
    return-object p1
.end method

.method public bridge synthetic getSecurityName([Ljava/security/cert/Certificate;)Lorg/snmp4j/smi/OctetString;
    .locals 0

    .line 1
    check-cast p1, [Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->getSecurityName([Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    return-object p1
.end method

.method public getSecurityName([Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;
    .locals 12

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Getting security name for peer certificate chain: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->securityNameMapping:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 5
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/snmp4j/transport/tls/SecurityNameMapping;

    invoke-virtual {v4}, Lorg/snmp4j/transport/tls/SecurityNameMapping;->getFingerprint()Lorg/snmp4j/smi/OctetString;

    move-result-object v4

    .line 6
    array-length v5, p1

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, p1, v6

    .line 7
    invoke-static {v7}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getFingerprint(Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;

    move-result-object v8

    .line 8
    iget-object v9, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v9}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 9
    iget-object v9, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Matching peer cert fingerprint "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " against local "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    if-eqz v4, :cond_6

    .line 10
    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v9

    if-eqz v9, :cond_3

    if-eqz v8, :cond_6

    .line 11
    invoke-virtual {v8, v4}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 12
    :cond_3
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/snmp4j/transport/tls/SecurityNameMapping;

    invoke-virtual {v8}, Lorg/snmp4j/transport/tls/SecurityNameMapping;->getType()Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    move-result-object v8

    .line 13
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/snmp4j/transport/tls/SecurityNameMapping;

    invoke-virtual {v9}, Lorg/snmp4j/transport/tls/SecurityNameMapping;->getData()Lorg/snmp4j/smi/OctetString;

    move-result-object v9

    .line 14
    :try_start_0
    invoke-direct {p0, v7, v8, v9}, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->mapCertToTSN(Ljava/security/cert/X509Certificate;Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;

    move-result-object v7
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v2, :cond_4

    if-nez v7, :cond_4

    .line 15
    :try_start_1
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/snmp4j/transport/tls/SecurityNameMapping;

    invoke-virtual {v8}, Lorg/snmp4j/transport/tls/SecurityNameMapping;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v2
    :try_end_1
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v8

    goto :goto_1

    :catch_1
    move-exception v8

    move-object v7, v1

    .line 16
    :goto_1
    iget-object v9, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Failed to parse client certificate: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v8}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 17
    :cond_4
    :goto_2
    iget-object v8, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v8}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 18
    iget-object v8, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Matched security name: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_5
    if-eqz v7, :cond_6

    .line 19
    invoke-virtual {v7}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v8

    const/16 v9, 0x20

    if-gt v8, v9, :cond_6

    return-object v7

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_7
    if-eqz v2, :cond_9

    .line 20
    iget-object p1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 21
    iget-object p1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Matched security name \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' by fallback mapping"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_8
    return-object v2

    :cond_9
    return-object v1
.end method

.method public bridge synthetic isAcceptedIssuer(Ljava/security/cert/Certificate;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->isAcceptedIssuer(Ljava/security/cert/X509Certificate;)Z

    move-result p1

    return p1
.end method

.method public isAcceptedIssuer(Ljava/security/cert/X509Certificate;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedIssuerDN:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedIssuerDN:Ljava/util/Set;

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 5
    :cond_1
    new-instance v0, Ljava/security/cert/CertificateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Issuer certificate "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not have accepted DN: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedIssuerDN:Ljava/util/Set;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic isClientCertificateAccepted(Ljava/security/cert/Certificate;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->isClientCertificateAccepted(Ljava/security/cert/X509Certificate;)Z

    move-result p1

    return p1
.end method

.method public isClientCertificateAccepted(Ljava/security/cert/X509Certificate;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedSubjectDN:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedSubjectDN:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 4
    :cond_1
    new-instance v0, Ljava/security/cert/CertificateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Client certificate "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has no accepted subject DN: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedSubjectDN:Ljava/util/Set;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic isServerCertificateAccepted([Ljava/security/cert/Certificate;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    check-cast p1, [Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->isServerCertificateAccepted([Ljava/security/cert/X509Certificate;)Z

    move-result p1

    return p1
.end method

.method public isServerCertificateAccepted([Ljava/security/cert/X509Certificate;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    if-eqz p1, :cond_a

    .line 2
    array-length v0, p1

    if-eqz v0, :cond_a

    .line 3
    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->securityNameMapping:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, -0x1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/transport/tls/SecurityNameMapping;

    invoke-virtual {v2}, Lorg/snmp4j/transport/tls/SecurityNameMapping;->getFingerprint()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    .line 5
    array-length v5, p1

    move v6, v4

    :goto_1
    if-ge v6, v5, :cond_0

    aget-object v1, p1, v6

    .line 6
    invoke-static {v1}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getFingerprint(Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    .line 7
    iget-object v7, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v7}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 8
    iget-object v7, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Matching server fingerprint "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " against accepted "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 9
    :cond_1
    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v7

    if-eqz v7, :cond_3

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v1, v2}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    move v1, v4

    goto :goto_1

    :cond_3
    :goto_2
    move v1, v3

    goto :goto_0

    .line 11
    :cond_4
    const-string v0, "Server certificate chain "

    if-eqz v1, :cond_9

    .line 12
    aget-object v1, p1, v4

    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    .line 13
    iget-object v2, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedSubjectDN:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return v3

    .line 14
    :cond_5
    array-length v1, p1

    move v2, v4

    :goto_3
    if-ge v2, v1, :cond_7

    aget-object v5, p1, v2

    .line 15
    invoke-virtual {v5}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 16
    iget-object v6, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedIssuerDN:Ljava/util/Set;

    invoke-interface {v5}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    return v3

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 17
    :cond_7
    iget-object v1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedSubjectDN:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedIssuerDN:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    return v4

    .line 18
    :cond_8
    new-instance v1, Ljava/security/cert/CertificateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " rejected because issuer and subject DN not accepted"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 19
    :cond_9
    new-instance v1, Ljava/security/cert/CertificateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not match accepted fingerprints: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->securityNameMapping:Ljava/util/Map;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 20
    :cond_a
    new-instance p1, Ljava/security/cert/CertificateException;

    const-string v0, "Server certificate chain is empty"

    invoke-direct {p1, v0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeAcceptedIssuerDN(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedIssuerDN:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeAcceptedSubjectDN(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->acceptedSubjectDN:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeLocalCertMapping(Lorg/snmp4j/smi/Address;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->localCertMapping:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public removeSecurityNameMapping(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/transport/tls/DefaultTlsTmSecurityCallback;->securityNameMapping:Ljava/util/Map;

    new-instance v1, Lorg/snmp4j/transport/tls/SecurityNameMapping;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p3, p2, v2}, Lorg/snmp4j/transport/tls/SecurityNameMapping;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;Lorg/snmp4j/smi/OctetString;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/OctetString;

    return-object p1
.end method
