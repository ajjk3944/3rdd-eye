.class public Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;
.super Lorg/snmp4j/CertifiedTarget;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x1b7dc7d56e47a5ecL


# instance fields
.field private tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/smi/OctetString;",
            "Lorg/snmp4j/smi/OctetString;",
            "Lorg/snmp4j/smi/OctetString;",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lorg/snmp4j/CertifiedTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V

    iput-object p5, p0, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-void
.end method


# virtual methods
.method public duplicate()Lorg/snmp4j/Target;
    .locals 7

    new-instance v6, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v1

    invoke-virtual {p0}, Lorg/snmp4j/CertifiedTarget;->getIdentity()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {p0}, Lorg/snmp4j/CertifiedTarget;->getServerFingerprint()Lorg/snmp4j/smi/OctetString;

    move-result-object v3

    invoke-virtual {p0}, Lorg/snmp4j/CertifiedTarget;->getClientFingerprint()Lorg/snmp4j/smi/OctetString;

    move-result-object v4

    iget-object v5, p0, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getRetries()I

    move-result v0

    invoke-virtual {v6, v0}, Lorg/snmp4j/AbstractTarget;->setRetries(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getTimeout()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getMaxSizeRequestPDU()I

    move-result v0

    invoke-virtual {v6, v0}, Lorg/snmp4j/AbstractTarget;->setMaxSizeRequestPDU(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getPreferredTransports()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/snmp4j/AbstractTarget;->setPreferredTransports(Ljava/util/List;)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getVersion()I

    move-result v0

    invoke-virtual {v6, v0}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getSecurityLevel()I

    move-result v0

    invoke-virtual {v6, v0}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getSecurityModel()I

    move-result v0

    invoke-virtual {v6, v0}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    return-object v6
.end method

.method public getTlsTmSecurityCallback()Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/snmp4j/transport/tls/TlsTmSecurityCallback<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/tls/TlsX509CertifiedTarget;->tlsTmSecurityCallback:Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    return-object v0
.end method
