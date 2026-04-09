.class public Lorg/snmp4j/security/PrivAES256;
.super Lorg/snmp4j/security/PrivAES;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/nonstandard/NonStandardSecurityProtocol;


# static fields
.field public static ID:Lorg/snmp4j/smi/OID; = null

.field private static final serialVersionUID:J = -0x40ee6ffb71e6cb1aL


# instance fields
.field private oid:Lorg/snmp4j/smi/OID;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OID;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->oosnmpUsmAesCfb256Protocol:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    sput-object v0, Lorg/snmp4j/security/PrivAES256;->ID:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lorg/snmp4j/security/PrivAES;-><init>(I)V

    return-void
.end method


# virtual methods
.method public getDefaultID()Lorg/snmp4j/smi/OID;
    .locals 1

    sget-object v0, Lorg/snmp4j/security/PrivAES256;->ID:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getID()Lorg/snmp4j/smi/OID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/PrivAES256;->oid:Lorg/snmp4j/smi/OID;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/security/PrivAES256;->getDefaultID()Lorg/snmp4j/smi/OID;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public setID(Lorg/snmp4j/smi/OID;)V
    .locals 1

    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    iput-object v0, p0, Lorg/snmp4j/security/PrivAES256;->oid:Lorg/snmp4j/smi/OID;

    return-void
.end method
