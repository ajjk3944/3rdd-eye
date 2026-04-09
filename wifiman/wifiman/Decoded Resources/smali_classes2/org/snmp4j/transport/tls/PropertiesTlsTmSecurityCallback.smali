.class public Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;
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


# static fields
.field private static final LOGGER:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private properties:Ljava/util/Properties;

.field private serverMode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(Ljava/util/Properties;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p2, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->serverMode:Z

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iput-object p1, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/System;->getProperties()Ljava/util/Properties;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;-><init>(Ljava/util/Properties;Z)V

    return-void
.end method


# virtual methods
.method public getLocalCertificateAlias(Lorg/snmp4j/smi/Address;)Ljava/lang/String;
    .locals 1

    iget-object p1, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v0, "org.snmp4j.arg.tlsLocalID"

    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getSecurityName([Ljava/security/cert/Certificate;)Lorg/snmp4j/smi/OctetString;
    .locals 0

    .line 1
    check-cast p1, [Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->getSecurityName([Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    return-object p1
.end method

.method public getSecurityName([Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;
    .locals 2

    .line 2
    iget-object p1, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v0, "org.snmp4j.arg.securityName"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
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

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->isAcceptedIssuer(Ljava/security/cert/X509Certificate;)Z

    move-result p1

    return p1
.end method

.method public isAcceptedIssuer(Ljava/security/cert/X509Certificate;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v1, "org.snmp4j.arg.tlsTrustCA"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 5
    :cond_1
    new-instance v1, Ljava/security/cert/CertificateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Issuer certificate "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not have accepted DN: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v1
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

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->isClientCertificateAccepted(Ljava/security/cert/X509Certificate;)Z

    move-result p1

    return p1
.end method

.method public isClientCertificateAccepted(Ljava/security/cert/X509Certificate;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v1, "org.snmp4j.arg.tlsLocalID"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->serverMode:Z

    if-eqz v1, :cond_0

    .line 4
    iget-object v0, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v1, "org.snmp4j.arg.tlsPeerID"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 6
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, 0x0

    return p1

    .line 7
    :cond_2
    new-instance v1, Ljava/security/cert/CertificateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Client certificate "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " rejected because subject DN does not match "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v1
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

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->isServerCertificateAccepted([Ljava/security/cert/X509Certificate;)Z

    move-result p1

    return p1
.end method

.method public isServerCertificateAccepted([Ljava/security/cert/X509Certificate;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    if-eqz p1, :cond_b

    .line 2
    array-length v0, p1

    if-eqz v0, :cond_b

    .line 3
    iget-object v0, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v1, "org.snmp4j.arg.tlsCertFingerprint"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lez v1, :cond_4

    .line 5
    invoke-static {v0}, Lorg/snmp4j/smi/OctetString;->fromHexString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    .line 6
    array-length v5, p1

    const/4 v6, -0x1

    move v7, v3

    :goto_0
    if-ge v7, v5, :cond_2

    aget-object v6, p1, v7

    .line 7
    invoke-static {v6}, Lorg/snmp4j/transport/tls/TLSTMUtil;->getFingerprint(Ljava/security/cert/X509Certificate;)Lorg/snmp4j/smi/OctetString;

    move-result-object v6

    .line 8
    sget-object v8, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v8}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 9
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Matching server fingerprint "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " against accepted "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    if-eqz v6, :cond_1

    .line 10
    invoke-virtual {v6, v1}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    move v6, v3

    goto :goto_0

    :cond_2
    :goto_1
    if-lez v6, :cond_3

    goto :goto_2

    .line 11
    :cond_3
    new-instance v0, Ljava/security/cert/CertificateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Server certificate chain "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not match accepted fingerprint "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_4
    :goto_2
    iget-object v0, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v1, "org.snmp4j.arg.tlsPeerID"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    iget-boolean v1, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->serverMode:Z

    if-eqz v1, :cond_5

    .line 14
    iget-object v0, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v1, "org.snmp4j.arg.tlsLocalID"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 15
    :cond_5
    aget-object v1, p1, v3

    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    return v4

    .line 17
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, "\'"

    if-gtz v5, :cond_a

    .line 18
    iget-object v0, p0, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->properties:Ljava/util/Properties;

    const-string v1, "org.snmp4j.arg.tlsTrustCA"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_7

    return v3

    :cond_7
    move v1, v4

    .line 20
    :goto_3
    array-length v2, p1

    if-ge v1, v2, :cond_9

    .line 21
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v2

    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    return v4

    .line 23
    :cond_8
    sget-object v3, Lorg/snmp4j/transport/tls/PropertiesTlsTmSecurityCallback;->LOGGER:Lorg/snmp4j/log/LogAdapter;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Certification authority \'"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' does not match accepted CA \'"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 24
    :cond_9
    new-instance v1, Ljava/security/cert/CertificateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Certification authorities for certificate chain "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not match accepted CA \'"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 26
    :cond_a
    new-instance p1, Ljava/security/cert/CertificateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Certificate subject \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' does not match accepted peer \'"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 27
    :cond_b
    new-instance p1, Ljava/security/cert/CertificateException;

    const-string v0, "Server certificate chain is empty"

    invoke-direct {p1, v0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
