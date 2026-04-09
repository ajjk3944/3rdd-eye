.class public Lorg/snmp4j/security/UsmUserTable$UsmUserKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/security/UsmUserTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UsmUserKey"
.end annotation


# instance fields
.field engineID:Lorg/snmp4j/smi/OctetString;

.field securityName:Lorg/snmp4j/smi/OctetString;


# direct methods
.method public constructor <init>(Lorg/snmp4j/security/UsmUserEntry;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUserEntry;->getEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->setEngineID(Lorg/snmp4j/smi/OctetString;)V

    .line 3
    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUserEntry;->getUsmUser()Lorg/snmp4j/security/UsmUser;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmUser;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->securityName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-direct {p0, p1}, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->setEngineID(Lorg/snmp4j/smi/OctetString;)V

    .line 6
    iput-object p2, p0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->securityName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method private setEngineID(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    if-nez p1, :cond_0

    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->engineID:Lorg/snmp4j/smi/OctetString;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->engineID:Lorg/snmp4j/smi/OctetString;

    :goto_0
    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 2

    instance-of v0, p1, Lorg/snmp4j/security/UsmUserEntry;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;

    check-cast p1, Lorg/snmp4j/security/UsmUserEntry;

    invoke-direct {v0, p1}, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;-><init>(Lorg/snmp4j/security/UsmUserEntry;)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    check-cast p1, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->engineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_1

    iget-object v1, p1, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->engineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lorg/snmp4j/smi/OctetString;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->engineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_3

    const/4 v0, -0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_4

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->securityName:Lorg/snmp4j/smi/OctetString;

    iget-object p1, p1, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    :cond_4
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lorg/snmp4j/security/UsmUserEntry;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    instance-of v0, p1, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->compareTo(Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->engineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/snmp4j/security/UsmUserTable$UsmUserKey;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->hashCode()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    xor-int/2addr v0, v1

    return v0
.end method
