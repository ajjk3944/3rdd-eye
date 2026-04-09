.class public Lorg/snmp4j/security/UsmUser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/User;
.implements Ljava/lang/Comparable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = -0x1f597c84da40932fL


# instance fields
.field private authenticationPassphrase:Lorg/snmp4j/smi/OctetString;

.field private authenticationProtocol:Lorg/snmp4j/smi/OID;

.field private localizationEngineID:Lorg/snmp4j/smi/OctetString;

.field private privacyPassphrase:Lorg/snmp4j/smi/OctetString;

.field private privacyProtocol:Lorg/snmp4j/smi/OID;

.field private securityName:Lorg/snmp4j/smi/OctetString;


# direct methods
.method public constructor <init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isCheckUsmUserPassphraseLength()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4
    const-string v0, "USM passphrases must be at least 8 bytes long (RFC3414 \u00a711.2)"

    const/16 v1, 0x8

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    .line 5
    invoke-virtual {p3}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    if-lt v2, v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p4, :cond_3

    if-eqz p5, :cond_3

    .line 7
    invoke-virtual {p5}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    if-lt v2, v1, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_3
    :goto_1
    iput-object p1, p0, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    .line 10
    iput-object p2, p0, Lorg/snmp4j/security/UsmUser;->authenticationProtocol:Lorg/snmp4j/smi/OID;

    .line 11
    iput-object p3, p0, Lorg/snmp4j/security/UsmUser;->authenticationPassphrase:Lorg/snmp4j/smi/OctetString;

    .line 12
    iput-object p4, p0, Lorg/snmp4j/security/UsmUser;->privacyProtocol:Lorg/snmp4j/smi/OID;

    .line 13
    iput-object p5, p0, Lorg/snmp4j/security/UsmUser;->privacyPassphrase:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    .line 14
    invoke-direct/range {p0 .. p5}, Lorg/snmp4j/security/UsmUser;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;)V

    .line 15
    iput-object p6, p0, Lorg/snmp4j/security/UsmUser;->localizationEngineID:Lorg/snmp4j/smi/OctetString;

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 8

    new-instance v7, Lorg/snmp4j/security/UsmUser;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    iget-object v2, p0, Lorg/snmp4j/security/UsmUser;->authenticationProtocol:Lorg/snmp4j/smi/OID;

    iget-object v3, p0, Lorg/snmp4j/security/UsmUser;->authenticationPassphrase:Lorg/snmp4j/smi/OctetString;

    iget-object v4, p0, Lorg/snmp4j/security/UsmUser;->privacyProtocol:Lorg/snmp4j/smi/OID;

    iget-object v5, p0, Lorg/snmp4j/security/UsmUser;->privacyPassphrase:Lorg/snmp4j/smi/OctetString;

    iget-object v6, p0, Lorg/snmp4j/security/UsmUser;->localizationEngineID:Lorg/snmp4j/smi/OctetString;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/snmp4j/security/UsmUser;-><init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)V

    return-object v7
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lorg/snmp4j/security/UsmUser;

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    iget-object p1, p1, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_5

    :cond_1
    check-cast p1, Lorg/snmp4j/security/UsmUser;

    iget-object v2, p0, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    iget-object v3, p1, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lorg/snmp4j/security/UsmUser;->authenticationPassphrase:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_3

    iget-object v3, p1, Lorg/snmp4j/security/UsmUser;->authenticationPassphrase:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lorg/snmp4j/security/UsmUser;->authenticationPassphrase:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_4

    :goto_0
    return v1

    :cond_4
    iget-object v2, p0, Lorg/snmp4j/security/UsmUser;->privacyPassphrase:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_5

    iget-object v3, p1, Lorg/snmp4j/security/UsmUser;->privacyPassphrase:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_5
    iget-object v2, p1, Lorg/snmp4j/security/UsmUser;->privacyPassphrase:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_6

    :goto_1
    return v1

    :cond_6
    iget-object v2, p0, Lorg/snmp4j/security/UsmUser;->authenticationProtocol:Lorg/snmp4j/smi/OID;

    if-eqz v2, :cond_7

    iget-object v3, p1, Lorg/snmp4j/security/UsmUser;->authenticationProtocol:Lorg/snmp4j/smi/OID;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_7
    iget-object v2, p1, Lorg/snmp4j/security/UsmUser;->authenticationProtocol:Lorg/snmp4j/smi/OID;

    if-eqz v2, :cond_8

    :goto_2
    return v1

    :cond_8
    iget-object v2, p0, Lorg/snmp4j/security/UsmUser;->privacyProtocol:Lorg/snmp4j/smi/OID;

    if-eqz v2, :cond_9

    iget-object v3, p1, Lorg/snmp4j/security/UsmUser;->privacyProtocol:Lorg/snmp4j/smi/OID;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_3

    :cond_9
    iget-object v2, p1, Lorg/snmp4j/security/UsmUser;->privacyProtocol:Lorg/snmp4j/smi/OID;

    if-eqz v2, :cond_a

    :goto_3
    return v1

    :cond_a
    iget-object v2, p0, Lorg/snmp4j/security/UsmUser;->localizationEngineID:Lorg/snmp4j/smi/OctetString;

    iget-object p1, p1, Lorg/snmp4j/security/UsmUser;->localizationEngineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v2, :cond_b

    invoke-virtual {v2, p1}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_4

    :cond_b
    if-eqz p1, :cond_c

    :goto_4
    return v1

    :cond_c
    return v0

    :cond_d
    :goto_5
    return v1
.end method

.method public getAuthenticationPassphrase()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->authenticationPassphrase:Lorg/snmp4j/smi/OctetString;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getAuthenticationProtocol()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->authenticationProtocol:Lorg/snmp4j/smi/OID;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getLocalizationEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->localizationEngineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getPrivacyPassphrase()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->privacyPassphrase:Lorg/snmp4j/smi/OctetString;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getPrivacyProtocol()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->privacyProtocol:Lorg/snmp4j/smi/OID;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getSecurityModel()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getSecurityName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->hashCode()I

    move-result v0

    return v0
.end method

.method public isLocalized()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmUser;->localizationEngineID:Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UsmUser[secName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUser;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",authProtocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUser;->authenticationProtocol:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",authPassphrase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUser;->authenticationPassphrase:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",privProtocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUser;->privacyProtocol:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",privPassphrase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/UsmUser;->privacyPassphrase:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",localizationEngineID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmUser;->getLocalizationEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
