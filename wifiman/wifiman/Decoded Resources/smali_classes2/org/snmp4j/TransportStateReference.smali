.class public Lorg/snmp4j/TransportStateReference;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private address:Lorg/snmp4j/smi/Address;

.field private certifiedIdentity:Lorg/snmp4j/CertifiedIdentity;

.field private requestedSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

.field private sameSecurity:Z

.field private securityName:Lorg/snmp4j/smi/OctetString;

.field private sessionID:Ljava/lang/Object;

.field private transport:Lorg/snmp4j/TransportMapping;

.field private transportSecurityLevel:Lorg/snmp4j/security/SecurityLevel;


# direct methods
.method public constructor <init>(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/SecurityLevel;Lorg/snmp4j/security/SecurityLevel;ZLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/snmp4j/TransportStateReference;->transport:Lorg/snmp4j/TransportMapping;

    .line 3
    iput-object p2, p0, Lorg/snmp4j/TransportStateReference;->address:Lorg/snmp4j/smi/Address;

    .line 4
    iput-object p3, p0, Lorg/snmp4j/TransportStateReference;->securityName:Lorg/snmp4j/smi/OctetString;

    .line 5
    iput-object p4, p0, Lorg/snmp4j/TransportStateReference;->requestedSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    .line 6
    iput-object p5, p0, Lorg/snmp4j/TransportStateReference;->transportSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    .line 7
    iput-boolean p6, p0, Lorg/snmp4j/TransportStateReference;->sameSecurity:Z

    .line 8
    iput-object p7, p0, Lorg/snmp4j/TransportStateReference;->sessionID:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/SecurityLevel;Lorg/snmp4j/security/SecurityLevel;ZLjava/lang/Object;Lorg/snmp4j/CertifiedIdentity;)V
    .locals 0

    .line 9
    invoke-direct/range {p0 .. p7}, Lorg/snmp4j/TransportStateReference;-><init>(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/SecurityLevel;Lorg/snmp4j/security/SecurityLevel;ZLjava/lang/Object;)V

    .line 10
    iput-object p8, p0, Lorg/snmp4j/TransportStateReference;->certifiedIdentity:Lorg/snmp4j/CertifiedIdentity;

    return-void
.end method


# virtual methods
.method public getAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->address:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public getCertifiedIdentity()Lorg/snmp4j/CertifiedIdentity;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->certifiedIdentity:Lorg/snmp4j/CertifiedIdentity;

    return-object v0
.end method

.method public getRequestedSecurityLevel()Lorg/snmp4j/security/SecurityLevel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->requestedSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    return-object v0
.end method

.method public getSecurityName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->securityName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getSessionID()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->sessionID:Ljava/lang/Object;

    return-object v0
.end method

.method public getTransport()Lorg/snmp4j/TransportMapping;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->transport:Lorg/snmp4j/TransportMapping;

    return-object v0
.end method

.method public getTransportSecurityLevel()Lorg/snmp4j/security/SecurityLevel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->transportSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    return-object v0
.end method

.method public isSameSecurity()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/TransportStateReference;->sameSecurity:Z

    return v0
.end method

.method public isTransportSecurityValid()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->transport:Lorg/snmp4j/TransportMapping;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->address:Lorg/snmp4j/smi/Address;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->securityName:Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/TransportStateReference;->transportSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setRequestedSecurityLevel(Lorg/snmp4j/security/SecurityLevel;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/TransportStateReference;->requestedSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    return-void
.end method

.method public setSameSecurity(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/TransportStateReference;->sameSecurity:Z

    return-void
.end method

.method public setSecurityName(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/TransportStateReference;->securityName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setTransportSecurityLevel(Lorg/snmp4j/security/SecurityLevel;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/TransportStateReference;->transportSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TransportStateReference[transport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/TransportStateReference;->transport:Lorg/snmp4j/TransportMapping;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", address="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/TransportStateReference;->address:Lorg/snmp4j/smi/Address;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", securityName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/TransportStateReference;->securityName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", requestedSecurityLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/TransportStateReference;->requestedSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transportSecurityLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/TransportStateReference;->transportSecurityLevel:Lorg/snmp4j/security/SecurityLevel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sameSecurity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lorg/snmp4j/TransportStateReference;->sameSecurity:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sessionID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/TransportStateReference;->sessionID:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", certifiedIdentity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/TransportStateReference;->certifiedIdentity:Lorg/snmp4j/CertifiedIdentity;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
