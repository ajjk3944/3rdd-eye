.class public Lorg/snmp4j/security/UsmUserEntry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# static fields
.field private static final serialVersionUID:J = -0x29ee4e2fc0ad32deL


# instance fields
.field private authenticationKey:[B

.field private engineID:Lorg/snmp4j/smi/OctetString;

.field private privacyKey:[B

.field private storageType:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

.field private userName:Lorg/snmp4j/smi/OctetString;

.field private usmUser:Lorg/snmp4j/security/UsmUser;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->nonVolatile:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    iput-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->storageType:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    .line 3
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    .line 4
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->userName:Lorg/snmp4j/smi/OctetString;

    .line 5
    new-instance v0, Lorg/snmp4j/security/UsmUser;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v2}, Lorg/snmp4j/smi/OctetString;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lorg/snmp4j/security/UsmUser;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;)V

    iput-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->usmUser:Lorg/snmp4j/security/UsmUser;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object v0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->nonVolatile:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    iput-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->storageType:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    .line 8
    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->userName:Lorg/snmp4j/smi/OctetString;

    .line 9
    iput-object p2, p0, Lorg/snmp4j/security/UsmUserEntry;->usmUser:Lorg/snmp4j/security/UsmUser;

    .line 10
    invoke-virtual {p2}, Lorg/snmp4j/security/UsmUser;->isLocalized()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 11
    invoke-virtual {p2}, Lorg/snmp4j/security/UsmUser;->getLocalizationEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    .line 12
    invoke-virtual {p2}, Lorg/snmp4j/security/UsmUser;->getAuthenticationProtocol()Lorg/snmp4j/smi/OID;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p2}, Lorg/snmp4j/security/UsmUser;->getAuthenticationPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p2}, Lorg/snmp4j/security/UsmUser;->getAuthenticationPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->authenticationKey:[B

    .line 15
    invoke-virtual {p2}, Lorg/snmp4j/security/UsmUser;->getPrivacyProtocol()Lorg/snmp4j/smi/OID;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 16
    invoke-virtual {p2}, Lorg/snmp4j/security/UsmUser;->getPrivacyPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 17
    invoke-virtual {p2}, Lorg/snmp4j/security/UsmUser;->getPrivacyPassphrase()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->privacyKey:[B

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p3}, Lorg/snmp4j/security/UsmUserEntry;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/UsmUser;)V

    .line 19
    iput-object p2, p0, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public constructor <init>([BLorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;[BLorg/snmp4j/smi/OID;[B)V
    .locals 9

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    sget-object v0, Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;->nonVolatile:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    iput-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->storageType:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v1, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    :goto_0
    iput-object v1, p0, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    .line 23
    iput-object p2, p0, Lorg/snmp4j/security/UsmUserEntry;->userName:Lorg/snmp4j/smi/OctetString;

    .line 24
    iput-object p4, p0, Lorg/snmp4j/security/UsmUserEntry;->authenticationKey:[B

    .line 25
    iput-object p6, p0, Lorg/snmp4j/security/UsmUserEntry;->privacyKey:[B

    .line 26
    new-instance p1, Lorg/snmp4j/security/UsmUser;

    if-eqz p4, :cond_1

    new-instance p4, Lorg/snmp4j/smi/OctetString;

    iget-object p6, p0, Lorg/snmp4j/security/UsmUserEntry;->authenticationKey:[B

    invoke-direct {p4, p6}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    move-object v5, p4

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    iget-object p4, p0, Lorg/snmp4j/security/UsmUserEntry;->privacyKey:[B

    if-eqz p4, :cond_2

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    iget-object p4, p0, Lorg/snmp4j/security/UsmUserEntry;->privacyKey:[B

    invoke-direct {v0, p4}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    :cond_2
    move-object v7, v0

    iget-object v8, p0, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-direct/range {v2 .. v8}, Lorg/snmp4j/security/UsmUser;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->usmUser:Lorg/snmp4j/security/UsmUser;

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lorg/snmp4j/security/UsmUserEntry;

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lorg/snmp4j/smi/OctetString;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v1, p1, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    if-nez v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    iget-object v0, p1, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->userName:Lorg/snmp4j/smi/OctetString;

    iget-object v1, p1, Lorg/snmp4j/security/UsmUserEntry;->userName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Lorg/snmp4j/smi/OctetString;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->usmUser:Lorg/snmp4j/security/UsmUser;

    iget-object p1, p1, Lorg/snmp4j/security/UsmUserEntry;->usmUser:Lorg/snmp4j/security/UsmUser;

    invoke-virtual {v0, p1}, Lorg/snmp4j/security/UsmUser;->compareTo(Ljava/lang/Object;)I

    move-result v0

    :cond_3
    return v0
.end method

.method public getAuthenticationKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->authenticationKey:[B

    return-object v0
.end method

.method public getEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getPrivacyKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->privacyKey:[B

    return-object v0
.end method

.method public getStorageType()Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->storageType:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    return-object v0
.end method

.method public getUserName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->userName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getUsmUser()Lorg/snmp4j/security/UsmUser;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUserEntry;->usmUser:Lorg/snmp4j/security/UsmUser;

    return-object v0
.end method

.method public setAuthenticationKey([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->authenticationKey:[B

    return-void
.end method

.method public setEngineID(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setPrivacyKey([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->privacyKey:[B

    return-void
.end method

.method public setStorageType(Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->storageType:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    return-void
.end method

.method public setUserName(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->userName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setUsmUser(Lorg/snmp4j/security/UsmUser;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmUserEntry;->usmUser:Lorg/snmp4j/security/UsmUser;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UsmUserEntry[userName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUserEntry;->userName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",usmUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUserEntry;->usmUser:Lorg/snmp4j/security/UsmUser;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",storageType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUserEntry;->storageType:Lorg/snmp4j/mp/SnmpConstants$StorageTypeEnum;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
