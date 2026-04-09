.class public Lorg/snmp4j/security/nonstandard/PrivAES192With3DESKeyExtension;
.super Lorg/snmp4j/security/nonstandard/PrivAESWith3DESKeyExtension;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/nonstandard/NonStandardSecurityProtocol;


# static fields
.field public static ID:Lorg/snmp4j/smi/OID;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OID;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->oosnmpUsmAesCfb192ProtocolWith3DESKeyExtension:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    sput-object v0, Lorg/snmp4j/security/nonstandard/PrivAES192With3DESKeyExtension;->ID:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x18

    invoke-direct {p0, v0}, Lorg/snmp4j/security/nonstandard/PrivAESWith3DESKeyExtension;-><init>(I)V

    return-void
.end method


# virtual methods
.method public getDefaultID()Lorg/snmp4j/smi/OID;
    .locals 1

    sget-object v0, Lorg/snmp4j/security/nonstandard/PrivAES192With3DESKeyExtension;->ID:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    return-object v0
.end method
