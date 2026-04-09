.class public Lorg/snmp4j/event/SnmpEngineEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# static fields
.field public static final ADDED_ENGINE_ID:I = 0x1

.field public static final IGNORED_ENGINE_ID:I = 0x3

.field public static final REMOVED_ENGINE_ID:I = 0x2

.field private static final serialVersionUID:J = -0x6520c3d3b25ce49fL


# instance fields
.field private engineAddress:Lorg/snmp4j/smi/Address;

.field private engineID:Lorg/snmp4j/smi/OctetString;

.field private type:I


# direct methods
.method public constructor <init>(Lorg/snmp4j/mp/MPv3;ILorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Address;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lorg/snmp4j/event/SnmpEngineEvent;->engineID:Lorg/snmp4j/smi/OctetString;

    iput p2, p0, Lorg/snmp4j/event/SnmpEngineEvent;->type:I

    iput-object p4, p0, Lorg/snmp4j/event/SnmpEngineEvent;->engineAddress:Lorg/snmp4j/smi/Address;

    return-void
.end method


# virtual methods
.method public getEngineAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/SnmpEngineEvent;->engineAddress:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public getEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/SnmpEngineEvent;->engineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/event/SnmpEngineEvent;->type:I

    return v0
.end method
