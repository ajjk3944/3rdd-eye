.class public Lorg/snmp4j/smi/Counter32;
.super Lorg/snmp4j/smi/UnsignedInteger32;
.source "SourceFile"


# static fields
.field public static final MAX_COUNTER32_VALUE:J = 0xffffffffL

.field private static final serialVersionUID:J = 0x55384d030e425d00L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>()V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lorg/snmp4j/smi/UnsignedInteger32;-><init>(J)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lorg/snmp4j/smi/Counter32;

    iget-wide v1, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/Counter32;-><init>(J)V

    return-object v0
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

    const/16 v3, 0x41

    if-ne p1, v3, :cond_0

    invoke-virtual {p0, v1, v2}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type encountered when decoding Counter: "

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

    const/16 v0, 0x41

    invoke-virtual {p0}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Lorg/snmp4j/asn1/BER;->encodeUnsignedInteger(Ljava/io/OutputStream;BJ)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lorg/snmp4j/smi/Counter32;

    if-eqz v0, :cond_0

    check-cast p1, Lorg/snmp4j/smi/Counter32;

    invoke-virtual {p1}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v0

    invoke-virtual {p0}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v2

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

.method public getSyntax()I
    .locals 1

    const/16 v0, 0x41

    return v0
.end method

.method public increment(J)J
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    .line 4
    iget-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    add-long v2, v0, p1

    const-wide v4, 0xffffffffL

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    add-long/2addr v0, p1

    .line 5
    iput-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    goto :goto_0

    :cond_0
    sub-long/2addr v4, v0

    sub-long/2addr p1, v4

    .line 6
    iput-wide p1, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    goto :goto_0

    :cond_1
    if-ltz v0, :cond_2

    .line 7
    :goto_0
    iget-wide p1, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    return-wide p1

    .line 8
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Negative increments not allowed for counters: "

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
    iget-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    const-wide v2, 0xffffffffL

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 2
    iput-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lorg/snmp4j/smi/UnsignedInteger32;->value:J

    :goto_0
    return-void
.end method

.method public toSubIndex(Z)Lorg/snmp4j/smi/OID;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
