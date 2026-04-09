.class public interface abstract Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Ljava/security/cert/Certificate;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract getLocalCertificateAlias(Lorg/snmp4j/smi/Address;)Ljava/lang/String;
.end method

.method public abstract getSecurityName([Ljava/security/cert/Certificate;)Lorg/snmp4j/smi/OctetString;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TC;)",
            "Lorg/snmp4j/smi/OctetString;"
        }
    .end annotation
.end method

.method public abstract isAcceptedIssuer(Ljava/security/cert/Certificate;)Z
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
.end method

.method public abstract isClientCertificateAccepted(Ljava/security/cert/Certificate;)Z
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
.end method

.method public abstract isServerCertificateAccepted([Ljava/security/cert/Certificate;)Z
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
.end method
