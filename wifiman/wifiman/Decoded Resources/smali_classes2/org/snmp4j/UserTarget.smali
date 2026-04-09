.class public Lorg/snmp4j/UserTarget;
.super Lorg/snmp4j/SecureTarget;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x13cbfc8518a84102L


# instance fields
.field private authoritativeEngineID:Lorg/snmp4j/smi/OctetString;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/SecureTarget;-><init>()V

    .line 2
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    const/4 v0, 0x3

    .line 3
    invoke-virtual {p0, v0}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;[B)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/SecureTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    .line 5
    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    .line 6
    invoke-virtual {p0, p3}, Lorg/snmp4j/UserTarget;->setAuthoritativeEngineID([B)V

    const/4 p1, 0x3

    .line 7
    invoke-virtual {p0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;[BI)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/SecureTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    .line 9
    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    .line 10
    invoke-virtual {p0, p3}, Lorg/snmp4j/UserTarget;->setAuthoritativeEngineID([B)V

    .line 11
    invoke-virtual {p0, p4}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    const/4 p1, 0x3

    .line 12
    invoke-virtual {p0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    return-void
.end method


# virtual methods
.method public duplicate()Lorg/snmp4j/Target;
    .locals 5

    new-instance v0, Lorg/snmp4j/UserTarget;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v1

    iget-object v2, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    iget-object v3, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v3

    iget v4, p0, Lorg/snmp4j/AbstractTarget;->securityLevel:I

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/snmp4j/UserTarget;-><init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;[BI)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getRetries()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setRetries(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getTimeout()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getMaxSizeRequestPDU()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setMaxSizeRequestPDU(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getSecurityModel()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getPreferredTransports()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/AbstractTarget;->setPreferredTransports(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-super {p0, p1}, Lorg/snmp4j/AbstractTarget;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Lorg/snmp4j/UserTarget;

    iget-object v2, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    iget-object p1, p1, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_3

    invoke-virtual {v2, p1}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    :goto_0
    return v1

    :cond_4
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public getAuthoritativeEngineID()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lorg/snmp4j/AbstractTarget;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public setAuthoritativeEngineID([B)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserTarget["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->toStringAbstractTarget()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", authoritativeEngineID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/UserTarget;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
