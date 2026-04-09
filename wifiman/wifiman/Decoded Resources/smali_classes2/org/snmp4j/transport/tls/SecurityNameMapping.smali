.class public Lorg/snmp4j/transport/tls/SecurityNameMapping;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;
    }
.end annotation


# instance fields
.field private data:Lorg/snmp4j/smi/OctetString;

.field private fingerprint:Lorg/snmp4j/smi/OctetString;

.field private securityName:Lorg/snmp4j/smi/OctetString;

.field private type:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;


# direct methods
.method public constructor <init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->fingerprint:Lorg/snmp4j/smi/OctetString;

    iput-object p2, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->data:Lorg/snmp4j/smi/OctetString;

    iput-object p3, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->type:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    iput-object p4, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->securityName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    :cond_1
    check-cast p1, Lorg/snmp4j/transport/tls/SecurityNameMapping;

    iget-object v2, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->data:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lorg/snmp4j/transport/tls/SecurityNameMapping;->data:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lorg/snmp4j/transport/tls/SecurityNameMapping;->data:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    :cond_3
    iget-object v2, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->fingerprint:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lorg/snmp4j/transport/tls/SecurityNameMapping;->fingerprint:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lorg/snmp4j/transport/tls/SecurityNameMapping;->fingerprint:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    :cond_5
    iget-object v2, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->type:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    iget-object p1, p1, Lorg/snmp4j/transport/tls/SecurityNameMapping;->type:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    if-eq v2, p1, :cond_6

    return v1

    :cond_6
    return v0

    :cond_7
    :goto_2
    return v1
.end method

.method public getData()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->data:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getFingerprint()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->fingerprint:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getSecurityName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->securityName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getType()Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->type:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->fingerprint:Lorg/snmp4j/smi/OctetString;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->data:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->type:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SecurityNameMapping{fingerprint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->fingerprint:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->data:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->type:Lorg/snmp4j/transport/tls/SecurityNameMapping$CertMappingType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", securityName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/tls/SecurityNameMapping;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
