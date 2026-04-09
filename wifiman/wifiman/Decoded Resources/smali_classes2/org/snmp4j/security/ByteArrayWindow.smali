.class public Lorg/snmp4j/security/ByteArrayWindow;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private length:I

.field private offset:I

.field private value:[B


# direct methods
.method public constructor <init>([BII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    iput p2, p0, Lorg/snmp4j/security/ByteArrayWindow;->offset:I

    iput p3, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lorg/snmp4j/security/ByteArrayWindow;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2
    check-cast p1, Lorg/snmp4j/security/ByteArrayWindow;

    .line 3
    iget v0, p1, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    iget v2, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    move v0, v1

    .line 4
    :goto_0
    iget v2, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    if-ge v0, v2, :cond_2

    .line 5
    iget-object v2, p1, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    aget-byte v2, v2, v0

    iget-object v3, p0, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    aget-byte v3, v3, v0

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public equals(Lorg/snmp4j/security/ByteArrayWindow;I)Z
    .locals 5

    .line 6
    iget v0, p1, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    const/4 v1, 0x0

    if-lt v0, p2, :cond_3

    iget v0, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    if-ge v0, p2, :cond_0

    goto :goto_1

    :cond_0
    move v0, v1

    :goto_0
    if-ge v0, p2, :cond_2

    .line 7
    iget-object v2, p0, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    iget v3, p0, Lorg/snmp4j/security/ByteArrayWindow;->offset:I

    add-int/2addr v3, v0

    aget-byte v2, v2, v3

    iget-object v3, p1, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    iget v4, p1, Lorg/snmp4j/security/ByteArrayWindow;->offset:I

    add-int/2addr v4, v0

    aget-byte v3, v3, v4

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v1
.end method

.method public get(I)B
    .locals 3

    iget v0, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    const-string v1, ""

    if-ge p1, v0, :cond_1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    iget v1, p0, Lorg/snmp4j/security/ByteArrayWindow;->offset:I

    add-int/2addr p1, v1

    aget-byte p1, v0, p1

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " >= "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    return v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/ByteArrayWindow;->offset:I

    return v0
.end method

.method public getValue()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    return-object v0
.end method

.method public set(IB)V
    .locals 2

    iget v0, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    const-string v1, ""

    if-ge p1, v0, :cond_1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    iget v1, p0, Lorg/snmp4j/security/ByteArrayWindow;->offset:I

    add-int/2addr p1, v1

    aput-byte p2, v0, p1

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " >= "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lorg/snmp4j/security/ByteArrayWindow;->length:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public setValue([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/ByteArrayWindow;->value:[B

    return-void
.end method
