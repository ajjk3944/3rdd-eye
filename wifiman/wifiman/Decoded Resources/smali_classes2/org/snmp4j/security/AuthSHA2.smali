.class public Lorg/snmp4j/security/AuthSHA2;
.super Lorg/snmp4j/security/AuthGeneric;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private protocolID:Lorg/snmp4j/smi/OID;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/snmp4j/smi/OID;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, Lorg/snmp4j/security/AuthGeneric;-><init>(Ljava/lang/String;II)V

    .line 2
    iput-object p2, p0, Lorg/snmp4j/security/AuthSHA2;->protocolID:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/snmp4j/smi/OID;III)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p3, p4, p5}, Lorg/snmp4j/security/AuthGeneric;-><init>(Ljava/lang/String;III)V

    .line 4
    iput-object p2, p0, Lorg/snmp4j/security/AuthSHA2;->protocolID:Lorg/snmp4j/smi/OID;

    return-void
.end method


# virtual methods
.method public getID()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/AuthSHA2;->protocolID:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    return-object v0
.end method
