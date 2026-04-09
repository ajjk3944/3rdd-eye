.class public Lorg/snmp4j/security/UsmSecurityStateReference;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/SecurityStateReference;


# instance fields
.field private authenticationKey:[B

.field private authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

.field private privacyKey:[B

.field private privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

.field private securityEngineID:[B

.field private securityLevel:I

.field private securityName:[B

.field private userName:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAuthenticationKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->authenticationKey:[B

    return-object v0
.end method

.method public getAuthenticationProtocol()Lorg/snmp4j/security/AuthenticationProtocol;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

    return-object v0
.end method

.method public getPrivacyKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->privacyKey:[B

    return-object v0
.end method

.method public getPrivacyProtocol()Lorg/snmp4j/security/PrivacyProtocol;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

    return-object v0
.end method

.method public getSecurityEngineID()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->securityEngineID:[B

    return-object v0
.end method

.method public getSecurityLevel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->securityLevel:I

    return v0
.end method

.method public getSecurityName()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->securityName:[B

    return-object v0
.end method

.method public getUserName()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->userName:[B

    return-object v0
.end method

.method public setAuthenticationKey([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->authenticationKey:[B

    return-void
.end method

.method public setAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

    return-void
.end method

.method public setPrivacyKey([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->privacyKey:[B

    return-void
.end method

.method public setPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

    return-void
.end method

.method public setSecurityEngineID([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->securityEngineID:[B

    return-void
.end method

.method public setSecurityLevel(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->securityLevel:I

    return-void
.end method

.method public setSecurityName([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->securityName:[B

    return-void
.end method

.method public setUserName([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityStateReference;->userName:[B

    return-void
.end method
