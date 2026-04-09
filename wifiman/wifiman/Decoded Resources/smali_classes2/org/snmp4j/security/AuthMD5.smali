.class public Lorg/snmp4j/security/AuthMD5;
.super Lorg/snmp4j/security/AuthGeneric;
.source "SourceFile"


# static fields
.field public static final ID:Lorg/snmp4j/smi/OID;

.field public static final KEY_LENGTH:I = 0x10

.field private static final serialVersionUID:J = -0x52e1c852306b8fc8L


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OID;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->usmHMACMD5AuthProtocol:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    sput-object v0, Lorg/snmp4j/security/AuthMD5;->ID:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "MD5"

    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lorg/snmp4j/security/AuthGeneric;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public getID()Lorg/snmp4j/smi/OID;
    .locals 1

    sget-object v0, Lorg/snmp4j/security/AuthMD5;->ID:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    return-object v0
.end method
