.class public Lorg/snmp4j/mp/PduHandle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final NONE:I = -0x80000000

.field private static final serialVersionUID:J = -0x5857bd0558d648d6L


# instance fields
.field private transactionID:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    .line 2
    iput v0, p0, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    .line 4
    iput v0, p0, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    .line 5
    invoke-virtual {p0, p1}, Lorg/snmp4j/mp/PduHandle;->setTransactionID(I)V

    return-void
.end method


# virtual methods
.method public copyFrom(Lorg/snmp4j/mp/PduHandle;)V
    .locals 0

    iget p1, p1, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    invoke-virtual {p0, p1}, Lorg/snmp4j/mp/PduHandle;->setTransactionID(I)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/snmp4j/mp/PduHandle;

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    check-cast p1, Lorg/snmp4j/mp/PduHandle;

    iget p1, p1, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getTransactionID()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    return v0
.end method

.method public setTransactionID(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PduHandle["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/mp/PduHandle;->transactionID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
