.class public Lorg/snmp4j/mp/SimpleMessageID;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/mp/MessageID;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x57748eb6203c0e23L


# instance fields
.field private messageID:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/snmp4j/mp/SimpleMessageID;->messageID:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lorg/snmp4j/mp/SimpleMessageID;

    iget v2, p0, Lorg/snmp4j/mp/SimpleMessageID;->messageID:I

    iget p1, p1, Lorg/snmp4j/mp/SimpleMessageID;->messageID:I

    if-eq v2, p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public getID()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/SimpleMessageID;->messageID:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/SimpleMessageID;->messageID:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/SimpleMessageID;->messageID:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
