.class public abstract Lorg/snmp4j/AbstractTarget;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/Target;


# instance fields
.field private address:Lorg/snmp4j/smi/Address;

.field private maxSizeRequestPDU:I

.field private preferredTransports:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;>;"
        }
    .end annotation
.end field

.field private retries:I

.field protected securityLevel:I

.field protected securityModel:I

.field protected securityName:Lorg/snmp4j/smi/OctetString;

.field private timeout:J

.field private version:I


# direct methods
.method protected constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lorg/snmp4j/AbstractTarget;->version:I

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lorg/snmp4j/AbstractTarget;->retries:I

    const-wide/16 v1, 0x3e8

    .line 4
    iput-wide v1, p0, Lorg/snmp4j/AbstractTarget;->timeout:J

    const v1, 0xffff

    .line 5
    iput v1, p0, Lorg/snmp4j/AbstractTarget;->maxSizeRequestPDU:I

    const/4 v1, 0x1

    .line 6
    iput v1, p0, Lorg/snmp4j/AbstractTarget;->securityLevel:I

    .line 7
    iput v0, p0, Lorg/snmp4j/AbstractTarget;->securityModel:I

    .line 8
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method protected constructor <init>(Lorg/snmp4j/smi/Address;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 10
    iput v0, p0, Lorg/snmp4j/AbstractTarget;->version:I

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lorg/snmp4j/AbstractTarget;->retries:I

    const-wide/16 v1, 0x3e8

    .line 12
    iput-wide v1, p0, Lorg/snmp4j/AbstractTarget;->timeout:J

    const v1, 0xffff

    .line 13
    iput v1, p0, Lorg/snmp4j/AbstractTarget;->maxSizeRequestPDU:I

    const/4 v1, 0x1

    .line 14
    iput v1, p0, Lorg/snmp4j/AbstractTarget;->securityLevel:I

    .line 15
    iput v0, p0, Lorg/snmp4j/AbstractTarget;->securityModel:I

    .line 16
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    .line 17
    iput-object p1, p0, Lorg/snmp4j/AbstractTarget;->address:Lorg/snmp4j/smi/Address;

    return-void
.end method

.method protected constructor <init>(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lorg/snmp4j/AbstractTarget;-><init>(Lorg/snmp4j/smi/Address;)V

    .line 19
    iput-object p2, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lorg/snmp4j/AbstractTarget;

    iget v2, p0, Lorg/snmp4j/AbstractTarget;->version:I

    iget v3, p1, Lorg/snmp4j/AbstractTarget;->version:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lorg/snmp4j/AbstractTarget;->retries:I

    iget v3, p1, Lorg/snmp4j/AbstractTarget;->retries:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, Lorg/snmp4j/AbstractTarget;->timeout:J

    iget-wide v4, p1, Lorg/snmp4j/AbstractTarget;->timeout:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    return v1

    :cond_4
    iget v2, p0, Lorg/snmp4j/AbstractTarget;->maxSizeRequestPDU:I

    iget v3, p1, Lorg/snmp4j/AbstractTarget;->maxSizeRequestPDU:I

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget v2, p0, Lorg/snmp4j/AbstractTarget;->securityLevel:I

    iget v3, p1, Lorg/snmp4j/AbstractTarget;->securityLevel:I

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget v2, p0, Lorg/snmp4j/AbstractTarget;->securityModel:I

    iget v3, p1, Lorg/snmp4j/AbstractTarget;->securityModel:I

    if-eq v2, v3, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lorg/snmp4j/AbstractTarget;->address:Lorg/snmp4j/smi/Address;

    iget-object v3, p1, Lorg/snmp4j/AbstractTarget;->address:Lorg/snmp4j/smi/Address;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Lorg/snmp4j/AbstractTarget;->preferredTransports:Ljava/util/List;

    if-eqz v2, :cond_9

    iget-object v3, p1, Lorg/snmp4j/AbstractTarget;->preferredTransports:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_0

    :cond_9
    iget-object v2, p1, Lorg/snmp4j/AbstractTarget;->preferredTransports:Ljava/util/List;

    if-eqz v2, :cond_a

    :goto_0
    return v1

    :cond_a
    iget-object v2, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    iget-object p1, p1, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2, p1}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v1

    :cond_b
    return v0

    :cond_c
    :goto_1
    return v1
.end method

.method public getAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/AbstractTarget;->address:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public getMaxSizeRequestPDU()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/AbstractTarget;->maxSizeRequestPDU:I

    return v0
.end method

.method public getPreferredTransports()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/AbstractTarget;->preferredTransports:Ljava/util/List;

    return-object v0
.end method

.method public getRetries()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/AbstractTarget;->retries:I

    return v0
.end method

.method public getSecurityLevel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/AbstractTarget;->securityLevel:I

    return v0
.end method

.method public getSecurityModel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/AbstractTarget;->securityModel:I

    return v0
.end method

.method public final getSecurityName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getTimeout()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/AbstractTarget;->timeout:J

    return-wide v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/AbstractTarget;->version:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/AbstractTarget;->address:Lorg/snmp4j/smi/Address;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/snmp4j/AbstractTarget;->version:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public setAddress(Lorg/snmp4j/smi/Address;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/AbstractTarget;->address:Lorg/snmp4j/smi/Address;

    return-void
.end method

.method public setMaxSizeRequestPDU(I)V
    .locals 1

    const/16 v0, 0x1e4

    if-lt p1, v0, :cond_0

    iput p1, p0, Lorg/snmp4j/AbstractTarget;->maxSizeRequestPDU:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The minimum PDU length is: 484"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPreferredTransports(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/AbstractTarget;->preferredTransports:Ljava/util/List;

    return-void
.end method

.method public setRetries(I)V
    .locals 1

    if-ltz p1, :cond_0

    iput p1, p0, Lorg/snmp4j/AbstractTarget;->retries:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Number of retries < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSecurityLevel(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/AbstractTarget;->securityLevel:I

    return-void
.end method

.method public setSecurityModel(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/AbstractTarget;->securityModel:I

    return-void
.end method

.method public final setSecurityName(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lorg/snmp4j/AbstractTarget;->timeout:J

    return-void
.end method

.method public setVersion(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/AbstractTarget;->version:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->toStringAbstractTarget()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected toStringAbstractTarget()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "address="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/AbstractTarget;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/AbstractTarget;->version:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",timeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/snmp4j/AbstractTarget;->timeout:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",retries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/AbstractTarget;->retries:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",securityLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/AbstractTarget;->securityLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",securityModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/AbstractTarget;->securityModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",securityName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/AbstractTarget;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",preferredTransports="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/AbstractTarget;->preferredTransports:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
