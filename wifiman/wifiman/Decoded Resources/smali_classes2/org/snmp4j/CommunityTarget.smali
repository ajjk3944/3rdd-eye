.class public Lorg/snmp4j/CommunityTarget;
.super Lorg/snmp4j/AbstractTarget;
.source "SourceFile"


# static fields
.field static final serialVersionUID:J = 0x20bd35fe27085a3L


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/AbstractTarget;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lorg/snmp4j/CommunityTarget;->setSecurityLevel(I)V

    .line 4
    invoke-virtual {p0, v0}, Lorg/snmp4j/CommunityTarget;->setSecurityModel(I)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/AbstractTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lorg/snmp4j/CommunityTarget;->setSecurityLevel(I)V

    .line 8
    invoke-virtual {p0, p1}, Lorg/snmp4j/CommunityTarget;->setSecurityModel(I)V

    return-void
.end method


# virtual methods
.method public duplicate()Lorg/snmp4j/Target;
    .locals 3

    new-instance v0, Lorg/snmp4j/CommunityTarget;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v1

    invoke-virtual {p0}, Lorg/snmp4j/CommunityTarget;->getCommunity()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/CommunityTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {p0}, Lorg/snmp4j/CommunityTarget;->getSecurityModel()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/CommunityTarget;->setSecurityModel(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getSecurityLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/CommunityTarget;->setSecurityLevel(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getRetries()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setRetries(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getTimeout()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getMaxSizeRequestPDU()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setMaxSizeRequestPDU(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getPreferredTransports()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setPreferredTransports(Ljava/util/List;)V

    return-object v0
.end method

.method public getCommunity()Lorg/snmp4j/smi/OctetString;
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    return-object v0
.end method

.method public getSecurityModel()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getVersion()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public setCommunity(Lorg/snmp4j/smi/OctetString;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityName(Lorg/snmp4j/smi/OctetString;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Community must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSecurityLevel(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-super {p0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "CommunityTarget only supports SecurityLevel.NOAUTH_NOPRIV"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSecurityModel(I)V
    .locals 2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    invoke-super {p0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    invoke-super {p0, v0}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "To set security model for a CommunityTarget, use setVersion"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-super {p0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    const/4 p1, 0x0

    invoke-super {p0, p1}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CommunityTarget["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->toStringAbstractTarget()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
