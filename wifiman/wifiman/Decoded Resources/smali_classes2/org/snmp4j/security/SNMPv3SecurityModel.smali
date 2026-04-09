.class public abstract Lorg/snmp4j/security/SNMPv3SecurityModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/SecurityModel;


# instance fields
.field protected localEngineID:Lorg/snmp4j/smi/OctetString;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static buildMessageBuffer(Lorg/snmp4j/asn1/BERInputStream;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lorg/snmp4j/asn1/BERInputStream;->mark(I)V

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v0

    long-to-int v0, v0

    new-instance v1, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v1}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p0, v1}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v1

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v2

    long-to-int v2, v2

    sub-int/2addr v2, v0

    add-int/2addr v1, v2

    new-array v0, v1, [B

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->reset()V

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->available()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    if-lez v2, :cond_1

    sub-int v4, v1, v3

    invoke-virtual {p0, v0, v3, v4}, Lorg/snmp4j/asn1/BERInputStream;->read([BII)I

    move-result v4

    if-gez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v3, v4

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method protected static buildWholeMessage(Lorg/snmp4j/smi/Integer32;[B[BLorg/snmp4j/security/SecurityParameters;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v0

    array-length v1, p2

    add-int/2addr v0, v1

    invoke-interface {p3}, Lorg/snmp4j/asn1/BERSerializable;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    array-length v1, p1

    add-int/2addr v0, v1

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/16 v1, 0x30

    invoke-static {v2, v1, v0}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    invoke-virtual {p0, v2}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    invoke-virtual {v2, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-interface {p3, v2}, Lorg/snmp4j/asn1/BERSerializable;->encodeBER(Ljava/io/OutputStream;)V

    invoke-virtual {v2, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p0}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result p1

    add-int/2addr p0, p1

    array-length p1, p2

    add-int/2addr p0, p1

    invoke-interface {p3, p0}, Lorg/snmp4j/security/SecurityParameters;->setSecurityParametersPosition(I)V

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getLocalEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/SNMPv3SecurityModel;->localEngineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method
