.class public Lorg/snmp4j/smi/Counter64;
.super Lorg/snmp4j/smi/AbstractVariable;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/AssignableFromLong;
.implements Lorg/snmp4j/smi/AssignableFromString;


# static fields
.field private static final serialVersionUID:J = 0x795030065a01ff37L


# instance fields
.field private value:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/smi/Counter64;->setValue(J)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lorg/snmp4j/smi/Counter64;

    iget-wide v1, p0, Lorg/snmp4j/smi/Counter64;->value:J

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/Counter64;-><init>(J)V

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/Counter64;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 10

    .line 2
    check-cast p1, Lorg/snmp4j/smi/Counter64;

    iget-wide v0, p1, Lorg/snmp4j/smi/Counter64;->value:J

    const/16 p1, 0x3f

    :goto_0
    if-ltz p1, :cond_2

    .line 3
    iget-wide v2, p0, Lorg/snmp4j/smi/Counter64;->value:J

    shr-long v4, v2, p1

    const-wide/16 v6, 0x1

    and-long/2addr v4, v6

    shr-long v8, v0, p1

    and-long/2addr v8, v6

    cmp-long v4, v4, v8

    if-eqz v4, :cond_1

    shr-long v0, v2, p1

    and-long/2addr v0, v6

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeUnsignedInt64(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)J

    move-result-wide v1

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result p1

    const/16 v3, 0x46

    if-ne p1, v3, :cond_0

    invoke-virtual {p0, v1, v2}, Lorg/snmp4j/smi/Counter64;->setValue(J)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type encountered when decoding Counter64: "

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
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x46

    iget-wide v1, p0, Lorg/snmp4j/smi/Counter64;->value:J

    invoke-static {p1, v0, v1, v2}, Lorg/snmp4j/asn1/BER;->encodeUnsignedInt64(Ljava/io/OutputStream;BJ)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lorg/snmp4j/smi/Counter64;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/Counter64;

    iget-wide v0, p1, Lorg/snmp4j/smi/Counter64;->value:J

    iget-wide v2, p0, Lorg/snmp4j/smi/Counter64;->value:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public getBERLength()I
    .locals 4

    iget-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    const/16 v0, 0xb

    return v0

    :cond_0
    const-wide v2, 0x80000000L

    cmp-long v2, v0, v2

    if-gez v2, :cond_4

    const-wide/32 v2, 0x8000

    cmp-long v2, v0, v2

    if-gez v2, :cond_2

    const-wide/16 v2, 0x80

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    :goto_0
    return v0

    :cond_2
    const-wide/32 v2, 0x800000

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    const/4 v0, 0x5

    goto :goto_1

    :cond_3
    const/4 v0, 0x6

    :goto_1
    return v0

    :cond_4
    const-wide v2, 0x800000000000L

    cmp-long v2, v0, v2

    if-gez v2, :cond_6

    const-wide v2, 0x8000000000L

    cmp-long v0, v0, v2

    if-gez v0, :cond_5

    const/4 v0, 0x7

    goto :goto_2

    :cond_5
    const/16 v0, 0x8

    :goto_2
    return v0

    :cond_6
    const-wide/high16 v2, 0x80000000000000L

    cmp-long v0, v0, v2

    if-gez v0, :cond_7

    const/16 v0, 0x9

    goto :goto_3

    :cond_7
    const/16 v0, 0xa

    :goto_3
    return v0
.end method

.method public getSyntax()I
    .locals 1

    const/16 v0, 0x46

    return v0
.end method

.method public getValue()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    long-to-int v0, v0

    return v0
.end method

.method public increment(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 2
    iget-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    return-wide v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Counter64 allows only positive increments: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public increment()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    return-void
.end method

.method public setValue(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lorg/snmp4j/smi/Counter64;->value:J

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    return-void
.end method

.method public final toInt()I
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/smi/Counter64;->getValue()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public final toLong()J
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/smi/Counter64;->getValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lorg/snmp4j/smi/Counter64;->value:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v0, 0x8

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-wide v3, p0, Lorg/snmp4j/smi/Counter64;->value:J

    rsub-int/lit8 v5, v2, 0x7

    mul-int/2addr v5, v0

    shr-long/2addr v3, v5

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
