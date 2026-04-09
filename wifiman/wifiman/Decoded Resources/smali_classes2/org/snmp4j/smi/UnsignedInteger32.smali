.class public Lorg/snmp4j/smi/UnsignedInteger32;
.super Lorg/snmp4j/smi/AbstractVariable;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/smi/AssignableFromLong;
.implements Lorg/snmp4j/smi/AssignableFromString;


# static fields
.field private static final serialVersionUID:J = -0x1de965a4dae9500fL


# instance fields
.field protected value:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    return-void
.end method

.method public constructor <init>(B)V
    .locals 2

    .line 9
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const-wide/16 v0, 0x0

    .line 10
    iput-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    and-int/lit16 p1, p1, 0xff

    int-to-long v0, p1

    .line 11
    invoke-virtual {p0, v0, v1}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 6
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    .line 8
    invoke-virtual {p0, v0, v1}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lorg/snmp4j/smi/AbstractVariable;-><init>()V

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void
.end method

.method public static getBERLengthFromValue(J)I
    .locals 2

    const-wide/16 v0, 0x80

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    const/4 p0, 0x3

    return p0

    :cond_0
    const-wide/32 v0, 0x8000

    cmp-long v0, p0, v0

    if-gez v0, :cond_1

    const/4 p0, 0x4

    return p0

    :cond_1
    const-wide/32 v0, 0x800000

    cmp-long v0, p0, v0

    if-gez v0, :cond_2

    const/4 p0, 0x5

    return p0

    :cond_2
    const-wide v0, 0x80000000L

    cmp-long p0, p0, v0

    if-gez p0, :cond_3

    const/4 p0, 0x6

    goto :goto_0

    :cond_3
    const/4 p0, 0x7

    :goto_0
    return p0
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lorg/snmp4j/smi/UnsignedInteger32;

    iget-wide v1, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>(J)V

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/UnsignedInteger32;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result p1

    return p1
.end method

.method public compareTo(Lorg/snmp4j/smi/Variable;)I
    .locals 4

    .line 2
    iget-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    check-cast p1, Lorg/snmp4j/smi/UnsignedInteger32;

    invoke-virtual {p1}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
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

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeUnsignedInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)J

    move-result-wide v1

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result p1

    const/16 v3, 0x42

    if-ne p1, v3, :cond_0

    invoke-virtual {p0, v1, v2}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type encountered when decoding Gauge: "

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

    const/16 v0, 0x42

    iget-wide v1, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    invoke-static {p1, v0, v1, v2}, Lorg/snmp4j/asn1/BER;->encodeUnsignedInteger(Ljava/io/OutputStream;BJ)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lorg/snmp4j/smi/UnsignedInteger32;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/UnsignedInteger32;

    iget-wide v2, p1, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    iget-wide v4, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public fromSubIndex(Lorg/snmp4j/smi/OID;Z)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lorg/snmp4j/smi/OID;->getUnsigned(I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void
.end method

.method public getBERLength()I
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    invoke-static {v0, v1}, Lorg/snmp4j/smi/UnsignedInteger32;->getBERLengthFromValue(J)I

    move-result v0

    return v0
.end method

.method public getSyntax()I
    .locals 1

    const/16 v0, 0x42

    return v0
.end method

.method public getValue()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    long-to-int v0, v0

    return v0
.end method

.method public setValue(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const-wide v0, 0xffffffffL

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 2
    iput-wide p1, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Argument must be an unsigned 32bit value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void
.end method

.method public final toInt()I
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public final toLong()J
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 1

    new-instance p1, Lorg/snmp4j/smi/OID;

    invoke-virtual {p0}, Lorg/snmp4j/smi/UnsignedInteger32;->toInt()I

    move-result v0

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/snmp4j/smi/OID;-><init>([I)V

    return-object p1
.end method
