.class public Lorg/snmp4j/MutablePDU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x22d9567d8537656fL


# instance fields
.field private pdu:Lorg/snmp4j/PDU;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPdu()Lorg/snmp4j/PDU;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/MutablePDU;->pdu:Lorg/snmp4j/PDU;

    return-object v0
.end method

.method public setPdu(Lorg/snmp4j/PDU;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/MutablePDU;->pdu:Lorg/snmp4j/PDU;

    return-void
.end method
