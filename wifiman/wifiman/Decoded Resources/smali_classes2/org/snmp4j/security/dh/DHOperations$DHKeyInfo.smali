.class public Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/security/dh/DHOperations;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DHKeyInfo"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x31772a32d93449c7L


# instance fields
.field private authKey:[B

.field private final authProtocol:Lorg/snmp4j/smi/OID;

.field private privKey:[B

.field private final privProtocol:Lorg/snmp4j/smi/OID;

.field private privateKey:[B

.field private final userName:Lorg/snmp4j/smi/OctetString;


# direct methods
.method public constructor <init>(Lorg/snmp4j/smi/OctetString;[BLorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->userName:Lorg/snmp4j/smi/OctetString;

    iput-object p2, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->privateKey:[B

    iput-object p3, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->authProtocol:Lorg/snmp4j/smi/OID;

    iput-object p4, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->privProtocol:Lorg/snmp4j/smi/OID;

    return-void
.end method


# virtual methods
.method public getAuthKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->authKey:[B

    return-object v0
.end method

.method public getAuthProtocol()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->authProtocol:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getPrivKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->privKey:[B

    return-object v0
.end method

.method public getPrivProtocol()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->privProtocol:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getPrivateKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->privateKey:[B

    return-object v0
.end method

.method public getUserName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->userName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public setAuthKey([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->authKey:[B

    return-void
.end method

.method public setPrivKey([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/dh/DHOperations$DHKeyInfo;->privKey:[B

    return-void
.end method
