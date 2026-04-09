.class public Lorg/snmp4j/security/UsmTimeEntry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x6feacc938774bb19L


# instance fields
.field private engineBoots:I

.field private engineID:Lorg/snmp4j/smi/OctetString;

.field private latestReceivedTime:I

.field private timeDiff:I


# direct methods
.method public constructor <init>(Lorg/snmp4j/smi/OctetString;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/security/UsmTimeEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    iput p2, p0, Lorg/snmp4j/security/UsmTimeEntry;->engineBoots:I

    invoke-virtual {p0, p3}, Lorg/snmp4j/security/UsmTimeEntry;->setEngineTime(I)V

    return-void
.end method


# virtual methods
.method public getEngineBoots()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/UsmTimeEntry;->engineBoots:I

    return v0
.end method

.method public getEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeEntry;->engineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getLatestReceivedTime()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/UsmTimeEntry;->latestReceivedTime:I

    return v0
.end method

.method public getTimeDiff()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/UsmTimeEntry;->timeDiff:I

    return v0
.end method

.method public setEngineBoots(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/security/UsmTimeEntry;->engineBoots:I

    return-void
.end method

.method public setEngineTime(I)V
    .locals 4

    iput p1, p0, Lorg/snmp4j/security/UsmTimeEntry;->latestReceivedTime:I

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/32 v2, 0x3b9aca00

    div-long/2addr v0, v2

    long-to-int v0, v0

    sub-int/2addr p1, v0

    iput p1, p0, Lorg/snmp4j/security/UsmTimeEntry;->timeDiff:I

    return-void
.end method

.method public setLatestReceivedTime(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/security/UsmTimeEntry;->latestReceivedTime:I

    return-void
.end method

.method public setTimeDiff(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/security/UsmTimeEntry;->timeDiff:I

    return-void
.end method
