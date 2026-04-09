.class public Lorg/snmp4j/smi/OctetString;
.super Lorg/snmp4j/smi/AbstractVariable;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/AssignableFromByteArray;
.implements Lorg/snmp4j/smi/AssignableFromString;


# static fields
.field private static final DEFAULT_HEX_DELIMITER:C = ':'

.field private static final serialVersionUID:J = 0x39414b0344051ea1L


# instance fields
.field private value:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    iput-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x0

    .line 15
    new-array v0, v0, [B

    iput-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x0

    .line 18
    new-array v0, v0, [B

    iput-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    .line 19
    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->append(Lorg/snmp4j/smi/OctetString;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lorg/snmp4j/smi/OctetString;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 2

    .line 4
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [B

    iput-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    .line 6
    new-array v1, p3, [B

    iput-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    .line 7
    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 3

    .line 8
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const/4 v0, 0x0

    .line 9
    new-array v1, v0, [B

    iput-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    if-nez p2, :cond_0

    .line 10
    array-length v1, p1

    new-array v1, v1, [B

    iput-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    goto :goto_0

    .line 11
    :cond_0
    array-length v1, p1

    array-length v2, p2

    add-int/2addr v1, v2

    new-array v1, v1, [B

    iput-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    .line 12
    :goto_0
    iget-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v2, p1

    invoke-static {p1, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p2, :cond_1

    .line 13
    iget-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length p1, p1

    array-length v2, p2

    invoke-static {p2, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    return-void
.end method

.method public static fromByteArray([B)Lorg/snmp4j/smi/OctetString;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object v0
.end method

.method public static fromHexString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;
    .locals 1

    const/16 v0, 0x3a

    .line 1
    invoke-static {p0, v0}, Lorg/snmp4j/smi/OctetString;->fromHexString(Ljava/lang/String;C)Lorg/snmp4j/smi/OctetString;

    move-result-object p0

    return-object p0
.end method

.method public static fromHexString(Ljava/lang/String;C)Lorg/snmp4j/smi/OctetString;
    .locals 1

    const/16 v0, 0x10

    .line 2
    invoke-static {p0, p1, v0}, Lorg/snmp4j/smi/OctetString;->fromString(Ljava/lang/String;CI)Lorg/snmp4j/smi/OctetString;

    move-result-object p0

    return-object p0
.end method

.method public static fromHexStringPairs(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    add-int/lit8 v4, v3, 0x2

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p0, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object p0
.end method

.method public static fromString(Ljava/lang/String;CI)Lorg/snmp4j/smi/OctetString;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/util/StringTokenizer;

    invoke-direct {v0, p0, p1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->countTokens()I

    move-result p0

    new-array p0, p0, [B

    const/4 p1, 0x0

    .line 4
    :goto_0
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static {v1, p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, p0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1, p0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object p1
.end method

.method public static fromString(Ljava/lang/String;I)Lorg/snmp4j/smi/OctetString;
    .locals 5

    const-wide/high16 v0, 0x4070000000000000L    # 256.0

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    int-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    div-int/2addr v1, v0

    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 10
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    add-int v3, v2, v0

    .line 11
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 12
    div-int/2addr v2, v0

    invoke-static {v4, p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    move v2, v3

    goto :goto_0

    .line 13
    :cond_0
    new-instance p0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p0, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object p0
.end method

.method public static split(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Ljava/util/Collection;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/smi/OctetString;",
            "Lorg/snmp4j/smi/OctetString;",
            ")",
            "Ljava/util/Collection<",
            "Lorg/snmp4j/smi/OctetString;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v4, v1

    move v3, v2

    :goto_0
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v5

    if-ge v3, v5, :cond_1

    invoke-virtual {p1, v3}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    if-le v5, v4, :cond_0

    move v4, v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v2

    move v5, v3

    :goto_1
    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v6

    if-ge v3, v6, :cond_7

    iget-object v6, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    aget-byte v6, v6, v3

    and-int/lit16 v6, v6, 0xff

    if-gt v6, v4, :cond_4

    move v7, v2

    move v8, v7

    :goto_2
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v9

    if-ge v7, v9, :cond_5

    invoke-virtual {p1, v7}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v9

    and-int/lit16 v9, v9, 0xff

    if-ne v6, v9, :cond_3

    if-ltz v5, :cond_2

    if-le v3, v5, :cond_2

    new-instance v8, Lorg/snmp4j/smi/OctetString;

    iget-object v9, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    sub-int v10, v3, v5

    invoke-direct {v8, v9, v5, v10}, Lorg/snmp4j/smi/OctetString;-><init>([BII)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 v8, 0x1

    move v5, v1

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_4
    move v8, v2

    :cond_5
    if-nez v8, :cond_6

    if-gez v5, :cond_6

    move v5, v3

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    if-ltz v5, :cond_8

    new-instance p1, Lorg/snmp4j/smi/OctetString;

    iget-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p0

    sub-int/2addr p0, v5

    invoke-direct {p1, v1, v5, p0}, Lorg/snmp4j/smi/OctetString;-><init>([BII)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    return-object v0
.end method


# virtual methods
.method public append(B)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 2
    array-length v3, v0

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v0, v0

    aput-byte p1, v1, v0

    .line 4
    iput-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    return-void
.end method

.method public append(Ljava/lang/String;)V
    .locals 0

    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->append([B)V

    return-void
.end method

.method public append(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    .line 9
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->append([B)V

    return-void
.end method

.method public append([B)V
    .locals 4

    .line 5
    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v1, v0

    array-length v2, p1

    add-int/2addr v1, v2

    new-array v1, v1, [B

    .line 6
    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v0, v0

    array-length v2, p1

    invoke-static {p1, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    iput-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    return-void
.end method

.method public clear()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    iget-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 4

    .line 2
    instance-of v0, p1, Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_3

    .line 3
    check-cast p1, Lorg/snmp4j/smi/OctetString;

    .line 4
    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v0, v0

    iget-object v1, p1, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 5
    iget-object v2, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    aget-byte v2, v2, v1

    iget-object v3, p1, Lorg/snmp4j/smi/OctetString;->value:[B

    aget-byte v3, v3, v1

    if-eq v2, v3, :cond_1

    and-int/lit16 p1, v2, 0xff

    and-int/lit16 v0, v3, 0xff

    if-ge p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_2
    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v0, v0

    iget-object p1, p1, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length p1, p1

    sub-int/2addr v0, p1

    return v0

    .line 7
    :cond_3
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeString(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)[B

    move-result-object p1

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type encountered when decoding OctetString: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeString(Ljava/io/OutputStream;B[B)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/OctetString;

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    iget-object p1, p1, Lorg/snmp4j/smi/OctetString;->value:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public equalsValue([B)Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->toByteArray()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    goto :goto_0

    :cond_0
    new-instance p2, Lorg/snmp4j/smi/OID;

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->getValue()[I

    move-result-object v0

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->size()I

    move-result p1

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    invoke-direct {p2, v0, v1, p1}, Lorg/snmp4j/smi/OID;-><init>([III)V

    invoke-virtual {p2}, Lorg/snmp4j/smi/OID;->toByteArray()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    :goto_0
    return-void
.end method

.method public final get(I)B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public getBERLength()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v1, v0

    array-length v0, v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v0

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    return v1
.end method

.method public getBERPayloadLength()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v0, v0

    return v0
.end method

.method public getSyntax()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public getValue()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public isPrintable()Z
    .locals 7

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-byte v4, v0, v3

    int-to-char v4, v4

    invoke-static {v4}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v5

    if-nez v5, :cond_0

    and-int/lit16 v5, v4, 0xff

    const/16 v6, 0x80

    if-lt v5, v6, :cond_1

    :cond_0
    invoke-static {v4}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v5

    if-eqz v5, :cond_2

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0x1c

    if-lt v4, v5, :cond_1

    const/16 v5, 0x1f

    if-gt v4, v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v2

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final length()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v0, v0

    return v0
.end method

.method public mask(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;
    .locals 5

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v1, v0

    new-array v2, v1, [B

    array-length v3, v0

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    if-ge v4, v0, :cond_0

    if-ge v4, v1, :cond_0

    aget-byte v0, v2, v4

    invoke-virtual {p1, v4}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v3

    and-int/2addr v0, v3

    int-to-byte v0, v0

    aput-byte v0, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1, v2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object p1
.end method

.method public final set(IB)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    aput-byte p2, v0, p1

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    return-void
.end method

.method public setValue([B)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "OctetString must not be assigned a null value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startsWith(Lorg/snmp4j/smi/OctetString;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v1

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    move v1, v0

    :goto_0
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p1, v1}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v2

    iget-object v3, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    aget-byte v3, v3, v1

    if-eq v2, v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v0
.end method

.method public substring(II)Lorg/snmp4j/smi/OctetString;
    .locals 3

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    sub-int/2addr p2, p1

    new-array v0, p2, [B

    iget-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1, v0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public toASCII(C)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-byte v4, v1, v3

    int-to-char v5, v4

    invoke-static {v5}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v6

    if-nez v6, :cond_1

    and-int/lit16 v4, v4, 0xff

    const/16 v6, 0x80

    if-lt v4, v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toByteArray()[B
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    return-object v0
.end method

.method public toHexString()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x3a

    .line 1
    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/OctetString;->toHexString(C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toHexString(C)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x10

    .line 2
    invoke-virtual {p0, p1, v0}, Lorg/snmp4j/smi/OctetString;->toString(CI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toInt()I
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toLong()J
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->isPrintable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(CI)Ljava/lang/String;
    .locals 7

    const-wide/high16 v0, 0x4070000000000000L    # 256.0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    int-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v2, v2

    add-int/lit8 v3, v0, 0x1

    mul-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    .line 6
    :goto_0
    iget-object v4, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v4, v4

    if-ge v3, v4, :cond_2

    if-lez v3, :cond_0

    .line 7
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 8
    :cond_0
    iget-object v4, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    aget-byte v4, v4, v3

    and-int/lit16 v4, v4, 0xff

    .line 9
    invoke-static {v4, p2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    move v5, v2

    .line 10
    :goto_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    sub-int v6, v0, v6

    if-ge v5, v6, :cond_1

    const/16 v6, 0x30

    .line 11
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString(I)Ljava/lang/String;
    .locals 9

    const-wide/high16 v0, 0x4070000000000000L    # 256.0

    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    int-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v2, v2

    add-int/lit8 v3, v0, 0x1

    mul-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    iget-object v2, p0, Lorg/snmp4j/smi/OctetString;->value:[B

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget-byte v6, v2, v5

    and-int/lit16 v6, v6, 0xff

    .line 17
    invoke-static {v6, p1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v6

    move v7, v4

    .line 18
    :goto_1
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    sub-int v8, v0, v8

    if-ge v7, v8, :cond_0

    const/16 v8, 0x30

    .line 19
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p1

    const/4 v1, 0x1

    add-int/2addr p1, v1

    new-array p1, p1, [I

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    aput v2, p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p1

    new-array p1, p1, [I

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    add-int v2, v1, v0

    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    aput v3, p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-object v0
.end method
