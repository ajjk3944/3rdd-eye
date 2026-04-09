.class public Lorg/snmp4j/transport/tls/TlsTmSecurityCallbackProxy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Ljava/security/cert/Certificate;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLocalCertificateAlias(Lorg/snmp4j/smi/Address;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTmSecurityCallbackProxy;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->getLocalCertificateAlias(Lorg/snmp4j/smi/Address;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getSecurityName([Ljava/security/cert/Certificate;)Lorg/snmp4j/smi/OctetString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TC;)",
            "Lorg/snmp4j/smi/OctetString;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTmSecurityCallbackProxy;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->getSecurityName([Ljava/security/cert/Certificate;)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getTlsTmSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "TC;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTmSecurityCallbackProxy;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-object v0
.end method

.method public isAcceptedIssuer(Ljava/security/cert/Certificate;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTmSecurityCallbackProxy;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->isAcceptedIssuer(Ljava/security/cert/Certificate;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isClientCertificateAccepted(Ljava/security/cert/Certificate;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTmSecurityCallbackProxy;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->isClientCertificateAccepted(Ljava/security/cert/Certificate;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isServerCertificateAccepted([Ljava/security/cert/Certificate;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TC;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsTmSecurityCallbackProxy;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->isServerCertificateAccepted([Ljava/security/cert/Certificate;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setTlsTmSecurityCallback(Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "TC;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/tls/TlsTmSecurityCallbackProxy;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-void
.end method
