.class public Lorg/snmp4j/security/PrivAES128;
.super Lorg/snmp4j/security/PrivAES;
.source "SourceFile"


# static fields
.field public static final ID:Lorg/snmp4j/smi/OID;

.field private static final serialVersionUID:J = 0x3c7b83a9f582bde5L


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OID;

    const-string v1, "1.3.6.1.6.3.10.1.2.4"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/snmp4j/security/PrivAES128;->ID:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lorg/snmp4j/security/PrivAES;-><init>(I)V

    return-void
.end method


# virtual methods
.method public getID()Lorg/snmp4j/smi/OID;
    .locals 1

    sget-object v0, Lorg/snmp4j/security/PrivAES128;->ID:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    return-object v0
.end method
