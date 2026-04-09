.class public Lorg/snmp4j/smi/OID;
.super Lorg/snmp4j/smi/AbstractVariable;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/AssignableFromString;
.implements Lorg/snmp4j/smi/AssignableFromIntArray;


# static fields
.field public static final MAX_OID_LEN:I = 0x80

.field public static final MAX_SUBID_VALUE:I = -0x1

.field private static final NULL_OID:[I

.field private static oidTextFormat:Lorg/snmp4j/util/OIDTextFormat; = null

.field private static final serialVersionUID:J = 0x68625480b0533a74L


# instance fields
.field private value:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/snmp4j/util/SimpleOIDTextFormat;

    invoke-direct {v0}, Lorg/snmp4j/util/SimpleOIDTextFormat;-><init>()V

    sput-object v0, Lorg/snmp4j/smi/OID;->oidTextFormat:Lorg/snmp4j/util/OIDTextFormat;

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lorg/snmp4j/smi/OID;->NULL_OID:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    .line 2
    sget-object v0, Lorg/snmp4j/smi/OID;->NULL_OID:[I

    iput-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    .line 4
    sget-object v0, Lorg/snmp4j/smi/OID;->NULL_OID:[I

    iput-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    .line 5
    invoke-static {p1}, Lorg/snmp4j/smi/OID;->parseDottedString(Ljava/lang/String;)[I

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/smi/OID;->value:[I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OID;)V
    .locals 0

    .line 20
    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->getValue()[I

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-void
.end method

.method public constructor <init>([I)V
    .locals 2

    .line 6
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lorg/snmp4j/smi/OID;-><init>([III)V

    return-void
.end method

.method public constructor <init>([II)V
    .locals 3

    .line 12
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    .line 13
    sget-object v0, Lorg/snmp4j/smi/OID;->NULL_OID:[I

    iput-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    .line 14
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    const/4 v1, 0x0

    .line 15
    array-length v2, p1

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length p1, p1

    aput p2, v0, p1

    return-void
.end method

.method public constructor <init>([III)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    .line 18
    sget-object v0, Lorg/snmp4j/smi/OID;->NULL_OID:[I

    iput-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lorg/snmp4j/smi/OID;->setValue([III)V

    return-void
.end method

.method public constructor <init>([I[I)V
    .locals 3

    .line 7
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    .line 8
    sget-object v0, Lorg/snmp4j/smi/OID;->NULL_OID:[I

    iput-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    .line 9
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    .line 10
    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length p1, p1

    array-length v1, p2

    invoke-static {p2, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static max(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;
    .locals 1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    if-ltz v0, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static min(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;
    .locals 1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    if-gtz v0, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method private static parseDottedString(Ljava/lang/String;)[I
    .locals 4

    :try_start_0
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getOIDTextFormat()Lorg/snmp4j/util/OIDTextFormat;

    move-result-object v0

    invoke-interface {v0, p0}, Lorg/snmp4j/util/OIDTextFormat;->parse(Ljava/lang/String;)[I

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OID \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' cannot be parsed"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private setValue([III)V
    .locals 2

    .line 4
    new-array v0, p3, [I

    iput-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    const/4 v1, 0x0

    .line 5
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method


# virtual methods
.method public final append(I)Lorg/snmp4j/smi/OID;
    .locals 4

    .line 7
    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    .line 8
    array-length v3, v0

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    aput p1, v1, v0

    .line 10
    iput-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    return-object p0
.end method

.method public final append(Ljava/lang/String;)Lorg/snmp4j/smi/OID;
    .locals 1

    .line 1
    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    move-result-object p1

    return-object p1
.end method

.method public final append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;
    .locals 4

    .line 3
    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    iget-object v2, p1, Lorg/snmp4j/smi/OID;->value:[I

    array-length v2, v2

    add-int/2addr v1, v2

    new-array v1, v1, [I

    .line 4
    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    iget-object p1, p1, Lorg/snmp4j/smi/OID;->value:[I

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    array-length v2, p1

    invoke-static {p1, v3, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    iput-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    return-object p0
.end method

.method public final appendUnsigned(J)Lorg/snmp4j/smi/OID;
    .locals 2

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p1, p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OID;->append(I)Lorg/snmp4j/smi/OID;

    move-result-object p1

    return-object p1
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OID;

    iget-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public final compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 2

    .line 2
    instance-of v0, p1, Lorg/snmp4j/smi/OID;

    if-eqz v0, :cond_1

    .line 3
    check-cast p1, Lorg/snmp4j/smi/OID;

    .line 4
    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    iget-object v1, p1, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lorg/snmp4j/smi/OID;->leftMostCompare(ILorg/snmp4j/smi/OID;)I

    move-result v0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    iget-object p1, p1, Lorg/snmp4j/smi/OID;->value:[I

    array-length p1, p1

    sub-int/2addr v0, p1

    :cond_0
    return v0

    .line 7
    :cond_1
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

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeOID(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)[I

    move-result-object p1

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v1

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OID;->setValue([I)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type encountered when decoding OID: "

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

    const/4 v0, 0x6

    iget-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeOID(Ljava/io/OutputStream;B[I)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lorg/snmp4j/smi/OID;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Lorg/snmp4j/smi/OID;

    iget-object v0, p1, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    iget-object v2, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v2, v2

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v3, v2

    if-ge v0, v3, :cond_2

    aget v2, v2, v0

    iget-object v3, p1, Lorg/snmp4j/smi/OID;->value:[I

    aget v3, v3, v0

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

.method public format()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getOIDTextFormat()Lorg/snmp4j/util/OIDTextFormat;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    invoke-interface {v0, v1}, Lorg/snmp4j/util/OIDTextFormat;->format([I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
    .locals 1

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->getValue()[I

    move-result-object v0

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->size()I

    move-result p1

    sub-int/2addr p1, p2

    invoke-direct {p0, v0, p2, p1}, Lorg/snmp4j/smi/OID;->setValue([III)V

    return-void
.end method

.method public final get(I)I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    aget p1, v0, p1

    return p1
.end method

.method public getBERLength()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getOIDLength([I)I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getSyntax()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public final getUnsigned(I)J
    .locals 4

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    aget p1, v0, p1

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final getValue()[I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->getValue()[I

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    return v0
.end method

.method public isValid()Z
    .locals 9

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v0

    const/16 v1, 0x80

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    aget v1, v0, v2

    int-to-long v3, v1

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    const-wide/16 v7, 0x2

    cmp-long v1, v3, v7

    if-gtz v1, :cond_0

    const/4 v1, 0x1

    aget v0, v0, v1

    int-to-long v3, v0

    and-long/2addr v3, v5

    const-wide/16 v5, 0x28

    cmp-long v0, v3, v5

    if-gez v0, :cond_0

    move v2, v1

    :cond_0
    return v2
.end method

.method public final last()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    if-lez v1, :cond_0

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final lastUnsigned()J
    .locals 4

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    if-lez v1, :cond_0

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public leftMostCompare(ILorg/snmp4j/smi/OID;)I
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, -0x1

    const/4 v3, 0x1

    if-ge v1, p1, :cond_2

    iget-object v4, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v4, v4

    if-ge v1, v4, :cond_2

    invoke-virtual {p2}, Lorg/snmp4j/smi/OID;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    iget-object v4, p0, Lorg/snmp4j/smi/OID;->value:[I

    aget v4, v4, v1

    iget-object v5, p2, Lorg/snmp4j/smi/OID;->value:[I

    aget v5, v5, v1

    if-eq v4, v5, :cond_1

    int-to-long p1, v4

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    int-to-long v4, v5

    and-long/2addr v0, v4

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    return v2

    :cond_0
    return v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v1

    if-le p1, v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p2}, Lorg/snmp4j/smi/OID;->size()I

    move-result p2

    if-le p1, p2, :cond_4

    return v3

    :cond_4
    return v0
.end method

.method public mask(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OID;
    .locals 6

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    new-array v2, v1, [I

    array-length v3, v0

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v4

    :goto_0
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v3

    mul-int/lit8 v3, v3, 0x8

    if-ge v0, v3, :cond_1

    if-ge v0, v1, :cond_1

    rem-int/lit8 v3, v0, 0x8

    const/16 v5, 0x80

    shr-int v3, v5, v3

    int-to-byte v3, v3

    div-int/lit8 v5, v0, 0x8

    invoke-virtual {p1, v5}, Lorg/snmp4j/smi/OctetString;->get(I)B

    move-result v5

    and-int/2addr v3, v5

    if-nez v3, :cond_0

    aput v4, v2, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lorg/snmp4j/smi/OID;

    invoke-direct {p1, v2}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-object p1
.end method

.method public final nextPeer()Lorg/snmp4j/smi/OID;
    .locals 4

    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v1

    const/4 v2, 0x1

    if-lez v1, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->last()I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->last()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v0, v1, v3}, Lorg/snmp4j/smi/OID;->set(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v1

    if-le v1, v2, :cond_1

    invoke-virtual {v0, v2}, Lorg/snmp4j/smi/OID;->trim(I)V

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->nextPeer()Lorg/snmp4j/smi/OID;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final predecessor()Lorg/snmp4j/smi/OID;
    .locals 5

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->last()I

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x80

    new-array v1, v0, [I

    iget-object v2, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v3, v2

    const/4 v4, 0x0

    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v2, v2

    const/4 v3, -0x1

    invoke-static {v1, v2, v0, v3}, Ljava/util/Arrays;->fill([IIII)V

    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->last()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/smi/OID;->set(II)V

    return-object v0

    :cond_0
    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->removeLast()I

    return-object v0
.end method

.method public removeLast()I
    .locals 4

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    new-array v1, v1, [I

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget v0, v0, v2

    iput-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    return v0
.end method

.method public rightMostCompare(ILorg/snmp4j/smi/OID;)I
    .locals 5

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iget-object v2, p2, Lorg/snmp4j/smi/OID;->value:[I

    array-length v2, v2

    sub-int/2addr v2, v1

    sub-int/2addr p1, v1

    :goto_0
    if-ltz p1, :cond_2

    iget-object v3, p0, Lorg/snmp4j/smi/OID;->value:[I

    aget v3, v3, v0

    iget-object v4, p2, Lorg/snmp4j/smi/OID;->value:[I

    aget v4, v4, v2

    if-eq v3, v4, :cond_1

    if-ge v3, v4, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 p1, p1, -0x1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final set(II)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    aput p2, v0, p1

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lorg/snmp4j/smi/OID;->parseDottedString(Ljava/lang/String;)[I

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/smi/OID;->value:[I

    return-void
.end method

.method public final setValue([I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lorg/snmp4j/smi/OID;->value:[I

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "OID value must not be set to null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    return v0
.end method

.method public startsWith(Lorg/snmp4j/smi/OID;)Z
    .locals 5

    iget-object v0, p1, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    iget-object v2, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v3, v2

    const/4 v4, 0x0

    if-le v1, v3, :cond_0

    return v4

    :cond_0
    array-length v1, v2

    array-length v0, v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/snmp4j/smi/OID;->leftMostCompare(ILorg/snmp4j/smi/OID;)I

    move-result p1

    if-nez p1, :cond_1

    const/4 v4, 0x1

    :cond_1
    return v4
.end method

.method public final successor()Lorg/snmp4j/smi/OID;
    .locals 5

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    const/16 v2, 0x80

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    const/16 v0, 0x7f

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    aget v2, v1, v0

    const/4 v4, -0x1

    if-eq v2, v4, :cond_0

    add-int/lit8 v2, v0, 0x1

    new-array v4, v2, [I

    invoke-static {v1, v3, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget v1, v4, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, v4, v0

    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v4}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0}, Lorg/snmp4j/smi/OID;-><init>()V

    return-object v0

    :cond_2
    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [I

    array-length v2, v0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    aput v3, v1, v0

    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-object v0
.end method

.method public toByteArray()[B
    .locals 4

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v0, v0

    new-array v0, v0, [B

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget v2, v2, v1

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public toDottedString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lorg/snmp4j/smi/OID;->oidTextFormat:Lorg/snmp4j/util/OIDTextFormat;

    iget-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    invoke-interface {v0, v1}, Lorg/snmp4j/util/OIDTextFormat;->format([I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toInt()I
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toIntArray()[I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    return-object v0
.end method

.method public toLong()J
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getOIDTextFormat()Lorg/snmp4j/util/OIDTextFormat;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    invoke-interface {v0, v1}, Lorg/snmp4j/util/OIDTextFormat;->formatForRoundTrip([I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 1

    if-eqz p1, :cond_0

    new-instance p1, Lorg/snmp4j/smi/OID;

    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    invoke-direct {p1, v0}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-object p1

    :cond_0
    new-instance p1, Lorg/snmp4j/smi/OID;

    invoke-virtual {p0}, Lorg/snmp4j/smi/OID;->size()I

    move-result v0

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/snmp4j/smi/OID;-><init>([I)V

    invoke-virtual {p1, p0}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    return-object p1
.end method

.method public trim()Lorg/snmp4j/smi/OID;
    .locals 4

    .line 6
    new-instance v0, Lorg/snmp4j/smi/OID;

    iget-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-direct {v0, v1, v3, v2}, Lorg/snmp4j/smi/OID;-><init>([III)V

    return-object v0
.end method

.method public trim(I)V
    .locals 3

    if-lez p1, :cond_1

    .line 1
    iget-object v0, p0, Lorg/snmp4j/smi/OID;->value:[I

    array-length v1, v0

    if-le p1, v1, :cond_0

    .line 2
    array-length p1, v0

    .line 3
    :cond_0
    array-length v1, v0

    sub-int/2addr v1, p1

    new-array v1, v1, [I

    .line 4
    array-length v2, v0

    sub-int/2addr v2, p1

    const/4 p1, 0x0

    invoke-static {v0, p1, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    iput-object v1, p0, Lorg/snmp4j/smi/OID;->value:[I

    :cond_1
    return-void
.end method
