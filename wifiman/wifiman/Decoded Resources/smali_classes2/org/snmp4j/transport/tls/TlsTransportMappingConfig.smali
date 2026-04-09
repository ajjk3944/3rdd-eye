.class public interface abstract Lorg/snmp4j/transport/tls/TlsTransportMappingConfig;
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
.method public abstract getKeyStore()Ljava/lang/String;
.end method

.method public abstract getKeyStorePassword()Ljava/lang/String;
.end method

.method public abstract getProtocolVersionPropertyName()Ljava/lang/String;
.end method

.method public abstract getProtocolVersions()[Ljava/lang/String;
.end method

.method public abstract getSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "TC;>;"
        }
    .end annotation
.end method

.method public abstract getTrustStore()Ljava/lang/String;
.end method

.method public abstract getTrustStorePassword()Ljava/lang/String;
.end method

.method public abstract setKeyStore(Ljava/lang/String;)V
.end method

.method public abstract setKeyStorePassword(Ljava/lang/String;)V
.end method

.method public abstract setLocalCertificateAlias(Ljava/lang/String;)V
.end method

.method public abstract setProtocolVersions([Ljava/lang/String;)V
.end method

.method public abstract setSecurityCallback(Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "TC;>;)V"
        }
    .end annotation
.end method

.method public abstract setTrustStore(Ljava/lang/String;)V
.end method

.method public abstract setTrustStorePassword(Ljava/lang/String;)V
.end method
