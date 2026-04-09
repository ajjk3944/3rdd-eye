.class public Lorg/snmp4j/CertifiedTarget;
.super Lorg/snmp4j/SecureTarget;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/CertifiedIdentity;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private clientFingerprint:Lorg/snmp4j/smi/OctetString;

.field private serverFingerprint:Lorg/snmp4j/smi/OctetString;


# direct methods
.method public constructor <init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/SecureTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    .line 4
    iput-object p3, p0, Lorg/snmp4j/CertifiedTarget;->serverFingerprint:Lorg/snmp4j/smi/OctetString;

    .line 5
    iput-object p4, p0, Lorg/snmp4j/CertifiedTarget;->clientFingerprint:Lorg/snmp4j/smi/OctetString;

    const/4 p1, 0x4

    .line 6
    invoke-virtual {p0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/snmp4j/smi/TlsAddress;

    invoke-direct {v0}, Lorg/snmp4j/smi/TlsAddress;-><init>()V

    invoke-direct {p0, v0, p1}, Lorg/snmp4j/SecureTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    const/4 p1, 0x4

    .line 2
    invoke-virtual {p0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    return-void
.end method


# virtual methods
.method public duplicate()Lorg/snmp4j/Target;
    .locals 5

    new-instance v0, Lorg/snmp4j/CertifiedTarget;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v1

    invoke-virtual {p0}, Lorg/snmp4j/CertifiedTarget;->getIdentity()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    iget-object v3, p0, Lorg/snmp4j/CertifiedTarget;->serverFingerprint:Lorg/snmp4j/smi/OctetString;

    iget-object v4, p0, Lorg/snmp4j/CertifiedTarget;->clientFingerprint:Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/snmp4j/CertifiedTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getRetries()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setRetries(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getTimeout()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getMaxSizeRequestPDU()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setMaxSizeRequestPDU(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getPreferredTransports()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setPreferredTransports(Ljava/util/List;)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getSecurityLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getSecurityModel()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    return-object v0
.end method

.method public getClientFingerprint()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CertifiedTarget;->clientFingerprint:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getIdentity()Lorg/snmp4j/smi/OctetString;
    .locals 1

    invoke-super {p0}, Lorg/snmp4j/AbstractTarget;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    return-object v0
.end method

.method public getServerFingerprint()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CertifiedTarget;->serverFingerprint:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CertifiedTarget["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->toStringAbstractTarget()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", serverFingerprint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/CertifiedTarget;->serverFingerprint:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientFingerprint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/CertifiedTarget;->clientFingerprint:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
