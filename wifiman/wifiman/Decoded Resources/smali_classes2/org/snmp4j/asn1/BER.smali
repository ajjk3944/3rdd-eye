.class public Lorg/snmp4j/asn1/BER;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/asn1/BER$MutableByte;
    }
.end annotation


# static fields
.field public static final ASN_APPLICATION:B = 0x40t

.field public static final ASN_BIT8:B = -0x80t

.field public static final ASN_BIT_STR:B = 0x3t

.field public static final ASN_BOOLEAN:B = 0x1t

.field public static final ASN_CONSTRUCTOR:B = 0x20t

.field public static final ASN_CONTEXT:B = -0x80t

.field public static final ASN_EXTENSION_ID:B = 0x1ft

.field public static final ASN_INTEGER:B = 0x2t

.field public static final ASN_LONG_LEN:B = -0x80t

.field public static final ASN_NULL:B = 0x5t

.field public static final ASN_OBJECT_ID:B = 0x6t

.field public static final ASN_OCTET_STR:B = 0x4t

.field public static final ASN_PRIMITIVE:B = 0x0t

.field public static final ASN_PRIVATE:B = -0x40t

.field public static final ASN_SEQUENCE:B = 0x10t

.field public static final ASN_SET:B = 0x11t

.field public static final ASN_UNIVERSAL:B = 0x0t

.field public static final BITSTRING:B = 0x3t

.field public static final COUNTER:B = 0x41t

.field public static final COUNTER32:B = 0x41t

.field public static final COUNTER64:B = 0x46t

.field public static final ENDOFMIBVIEW:I = 0x82

.field public static final GAUGE:B = 0x42t

.field public static final GAUGE32:B = 0x42t

.field public static final INTEGER:B = 0x2t

.field public static final INTEGER32:B = 0x2t

.field public static final IPADDRESS:B = 0x40t

.field private static final LENMASK:I = 0xff

.field public static final MAX_OID_LENGTH:I = 0x7f

.field public static final NOSUCHINSTANCE:I = 0x81

.field public static final NOSUCHOBJECT:I = 0x80

.field public static final NULL:B = 0x5t

.field public static final OCTETSTRING:B = 0x4t

.field public static final OID:B = 0x6t

.field public static final OPAQUE:B = 0x44t

.field public static final SEQUENCE:B = 0x30t

.field public static final TIMETICKS:B = 0x43t

.field private static checkFirstSubID012:Z = true

.field private static checkSequenceLength:Z = true

.field private static checkValueLength:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static checkLength(Lorg/snmp4j/asn1/BERInputStream;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-boolean v0, Lorg/snmp4j/asn1/BER;->checkValueLength:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-ltz p1, :cond_1

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->getAvailableBytes()I

    move-result v0

    if-gt p1, v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The encoded length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " exceeds the number of bytes left in input"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " which actually is "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->getAvailableBytes()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    invoke-static {}, Lorg/snmp4j/asn1/BER;->isCheckSequenceLength()Z

    move-result v0

    if-eqz v0, :cond_1

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The actual length of the SEQUENCE object "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", but "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " was expected"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static checkSequenceLength(ILorg/snmp4j/asn1/BERSerializable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lorg/snmp4j/asn1/BER;->isCheckSequenceLength()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lorg/snmp4j/asn1/BERSerializable;->getBERPayloadLength()I

    move-result v0

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The actual length of the SEQUENCE object "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-interface {p1}, Lorg/snmp4j/asn1/BERSerializable;->getBERPayloadLength()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", but "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " was expected"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static decodeBigInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)Ljava/math/BigInteger;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    iget-byte v0, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;)I

    move-result p1

    if-ltz p1, :cond_1

    new-array v0, p1, [B

    invoke-virtual {p0, v0}, Lorg/snmp4j/asn1/BERInputStream;->read([B)I

    move-result p0

    if-ne p0, p1, :cond_0

    new-instance p0, Ljava/math/BigInteger;

    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>([B)V

    return-object p0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length of INTEGER ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is greater than number of bytes left in BER stream: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Length greater than 2147483647 are not supported  for integers: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong ASN.1 type. Not an INTEGER: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, v0}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;Z)I

    move-result p0

    return p0
.end method

.method public static decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;Z)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    int-to-byte v0, v0

    and-int/lit8 v1, v0, 0x1f

    const/16 v2, 0x1f

    if-eq v1, v2, :cond_0

    .line 2
    invoke-virtual {p1, v0}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    .line 3
    invoke-static {p0, p2}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;Z)I

    move-result p0

    return p0

    .line 4
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot process extension IDs"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static decodeInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    iget-byte v0, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/16 v1, 0x43

    if-eq v0, v1, :cond_1

    const/16 v1, 0x41

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong ASN.1 type. Not an integer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;)I

    move-result p1

    const/4 v0, 0x4

    if-gt p1, v0, :cond_5

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    and-int/lit16 v1, v0, 0xff

    and-int/lit16 v0, v0, 0x80

    if-lez v0, :cond_2

    const/4 v0, -0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    add-int/lit8 v2, p1, -0x1

    if-lez p1, :cond_4

    shl-int/lit8 p1, v0, 0x8

    or-int v0, p1, v1

    if-lez v2, :cond_3

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v1

    :cond_3
    move p1, v2

    goto :goto_1

    :cond_4
    return v0

    :cond_5
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Length greater than 32bit are not supported  for integers: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static decodeLength(Lorg/snmp4j/asn1/BERInputStream;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-static {p0, v0}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;Z)I

    move-result p0

    return p0
.end method

.method public static decodeLength(Lorg/snmp4j/asn1/BERInputStream;Z)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    and-int/lit8 v1, v0, -0x80

    if-lez v1, :cond_4

    and-int/lit8 v0, v0, 0x7f

    if-eqz v0, :cond_3

    const/4 v1, 0x4

    if-gt v0, v1, :cond_2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v0, -0x1

    sub-int/2addr v4, v1

    mul-int/lit8 v4, v4, 0x8

    shl-int/2addr v3, v4

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-ltz v2, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "SNMP does not support data lengths > 2^31"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 5
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Data length > 4 bytes are not supported!"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 6
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Indefinite lengths are not supported"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    and-int/lit16 v2, v0, 0xff

    :goto_1
    if-eqz p1, :cond_5

    .line 7
    invoke-static {p0, v2}, Lorg/snmp4j/asn1/BER;->checkLength(Lorg/snmp4j/asn1/BERInputStream;I)V

    :cond_5
    return v2
.end method

.method public static decodeNull(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    iget-byte v0, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/16 v1, -0x80

    if-eq v0, v1, :cond_1

    const/16 v1, -0x7f

    if-eq v0, v1, :cond_1

    const/16 v1, -0x7e

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong ASN.1 type. Is not null: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;)I

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Null encoding, length is not zero: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static decodeOID(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)[I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    iget-byte v0, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    const/4 v1, 0x6

    if-ne v0, v1, :cond_9

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;)I

    move-result p1

    add-int/lit8 v0, p1, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    aput v2, v0, v1

    aput v2, v0, v2

    :cond_0
    move v3, v1

    :goto_0
    if-lez p1, :cond_4

    move v4, v2

    :cond_1
    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v5

    if-ltz v5, :cond_3

    shl-int/lit8 v4, v4, 0x7

    and-int/lit8 v6, v5, 0x7f

    add-int/2addr v4, v6

    add-int/lit8 p1, p1, -0x1

    if-lez p1, :cond_2

    and-int/lit16 v5, v5, 0x80

    if-nez v5, :cond_1

    :cond_2
    add-int/lit8 v5, v3, 0x1

    aput v4, v0, v3

    move v3, v5

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected end of input stream"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    aget p0, v0, v1

    const/16 p1, 0x2b

    const/4 v4, 0x2

    if-ne p0, p1, :cond_5

    aput v1, v0, v2

    const/4 p0, 0x3

    aput p0, v0, v1

    goto :goto_1

    :cond_5
    const/16 p1, 0x50

    if-ltz p0, :cond_7

    if-ge p0, p1, :cond_7

    const/16 p1, 0x28

    if-ge p0, p1, :cond_6

    aput v2, v0, v2

    aput p0, v0, v1

    goto :goto_1

    :cond_6
    aput v1, v0, v2

    sub-int/2addr p0, p1

    aput p0, v0, v1

    goto :goto_1

    :cond_7
    aput v4, v0, v2

    sub-int/2addr p0, p1

    aput p0, v0, v1

    :goto_1
    if-ge v3, v4, :cond_8

    move v3, v4

    :cond_8
    new-array p0, v3, [I

    invoke-static {v0, v2, p0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0

    :cond_9
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type. Not an OID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static decodeString(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    iget-byte v0, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x24

    if-eq v0, v1, :cond_1

    const/16 v1, 0x40

    if-eq v0, v1, :cond_1

    const/16 v1, 0x44

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/16 v1, 0x45

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong ASN.1 type. Not a string: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;)I

    move-result p1

    new-array v0, p1, [B

    if-lez p1, :cond_3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Lorg/snmp4j/asn1/BERInputStream;->read([BII)I

    move-result p0

    if-ltz p0, :cond_2

    if-lt p0, p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong string length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " < "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public static decodeUnsignedInt64(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    iget-byte v0, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/16 v1, 0x46

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type. Not an integer 64: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;)I

    move-result p1

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x9

    if-gt p1, v1, :cond_6

    if-nez v0, :cond_3

    const/4 v1, 0x1

    if-le p1, v1, :cond_2

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    :cond_2
    add-int/lit8 p1, p1, -0x1

    :cond_3
    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :cond_4
    :goto_1
    if-ge v3, p1, :cond_5

    const/16 v4, 0x8

    shl-long/2addr v1, v4

    and-int/lit16 v4, v0, 0xff

    int-to-long v4, v4

    or-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    if-ge v3, p1, :cond_4

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    goto :goto_1

    :cond_5
    return-wide v1

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid 64bit unsigned integer length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static decodeUnsignedInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Lorg/snmp4j/asn1/BER$MutableByte;->setValue(B)V

    iget-byte v0, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/16 v1, 0x43

    if-eq v0, v1, :cond_1

    const/16 v1, 0x41

    if-eq v0, v1, :cond_1

    const/16 v1, 0x42

    if-eq v0, v1, :cond_1

    const/16 v1, 0x47

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong ASN.1 type. Not an unsigned integer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p1, Lorg/snmp4j/asn1/BER$MutableByte;->value:B

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->decodeLength(Lorg/snmp4j/asn1/BERInputStream;)I

    move-result p1

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    const/4 v1, 0x5

    if-gt p1, v1, :cond_7

    const/4 v1, 0x4

    if-le p1, v1, :cond_2

    if-nez v0, :cond_7

    :cond_2
    if-nez v0, :cond_4

    const/4 v1, 0x1

    if-le p1, v1, :cond_3

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    :cond_3
    add-int/lit8 p1, p1, -0x1

    :cond_4
    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :cond_5
    :goto_1
    if-ge v3, p1, :cond_6

    const/16 v4, 0x8

    shl-long/2addr v1, v4

    and-int/lit16 v4, v0, 0xff

    int-to-long v4, v4

    or-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    if-ge v3, p1, :cond_5

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->read()I

    move-result v0

    goto :goto_1

    :cond_6
    return-wide v1

    :cond_7
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Only 32bit unsigned integers are supported"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static encodeBigInteger(Ljava/io/OutputStream;BLjava/math/BigInteger;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p2}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p2

    array-length v0, p2

    invoke-static {p0, p1, v0}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    invoke-virtual {p0, p2}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static encodeHeader(Ljava/io/OutputStream;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 2
    invoke-static {p0, p2}, Lorg/snmp4j/asn1/BER;->encodeLength(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public static encodeHeader(Ljava/io/OutputStream;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 4
    invoke-static {p0, p2, p3}, Lorg/snmp4j/asn1/BER;->encodeLength(Ljava/io/OutputStream;II)V

    return-void
.end method

.method public static encodeInteger(Ljava/io/OutputStream;BI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    :goto_0
    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    and-int v2, p2, v1

    if-eqz v2, :cond_0

    if-ne v2, v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    add-int/lit8 v0, v0, -0x1

    shl-int/lit8 p2, p2, 0x8

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, v0}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-lez v0, :cond_2

    const/high16 v0, -0x1000000

    and-int/2addr v0, p2

    shr-int/lit8 v0, v0, 0x18

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shl-int/lit8 p2, p2, 0x8

    move v0, p1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static encodeLength(Ljava/io/OutputStream;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x7c

    const/16 v1, 0xff

    if-gez p1, :cond_0

    .line 1
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x18

    and-int/2addr v0, v1

    .line 2
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x10

    and-int/2addr v0, v1

    .line 3
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/2addr v0, v1

    .line 4
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/2addr p1, v1

    .line 5
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x80

    if-ge p1, v2, :cond_1

    .line 6
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0

    :cond_1
    if-gt p1, v1, :cond_2

    const/16 v0, -0x7f

    .line 7
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 8
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0

    :cond_2
    const v2, 0xffff

    if-gt p1, v2, :cond_3

    const/16 v0, -0x7e

    .line 9
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/2addr v0, v1

    .line 10
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/2addr p1, v1

    .line 11
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0

    :cond_3
    const v2, 0xffffff

    if-gt p1, v2, :cond_4

    const/16 v0, -0x7d

    .line 12
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x10

    and-int/2addr v0, v1

    .line 13
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/2addr v0, v1

    .line 14
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/2addr p1, v1

    .line 15
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0

    .line 16
    :cond_4
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x18

    and-int/2addr v0, v1

    .line 17
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x10

    and-int/2addr v0, v1

    .line 18
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v0, p1, 0x8

    and-int/2addr v0, v1

    .line 19
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/2addr p1, v1

    .line 20
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    :goto_0
    return-void
.end method

.method public static encodeLength(Ljava/io/OutputStream;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    or-int/lit8 v0, p2, -0x80

    .line 21
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 p2, p2, -0x1

    mul-int/lit8 p2, p2, 0x8

    :goto_0
    if-ltz p2, :cond_0

    shr-int v0, p1, p2

    and-int/lit16 v0, v0, 0xff

    .line 22
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 p2, p2, -0x8

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static encodeOID(Ljava/io/OutputStream;B[I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Lorg/snmp4j/asn1/BER;->getOIDLength([I)I

    move-result v0

    invoke-static {p0, p1, v0}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    array-length p1, p2

    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    move v2, v1

    goto :goto_1

    :cond_0
    aget v0, p2, v1

    sget-boolean v1, Lorg/snmp4j/asn1/BER;->checkFirstSubID012:Z

    if-eqz v1, :cond_2

    if-ltz v0, :cond_1

    if-gt v0, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid first sub-identifier (must be 0, 1, or 2)"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    const/4 v1, 0x1

    aget v1, p2, v1

    mul-int/lit8 v0, v0, 0x28

    add-int/2addr v1, v0

    invoke-static {p0, v1}, Lorg/snmp4j/asn1/BER;->encodeSubID(Ljava/io/OutputStream;I)V

    add-int/lit8 v1, p1, -0x2

    :goto_1
    add-int/lit8 p1, v1, -0x1

    if-lez v1, :cond_3

    add-int/lit8 v1, v2, 0x1

    aget v0, p2, v2

    invoke-static {p0, v0}, Lorg/snmp4j/asn1/BER;->encodeSubID(Ljava/io/OutputStream;I)V

    move v2, v1

    move v1, p1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static encodeSequence(Ljava/io/OutputStream;BI)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    invoke-static {p0, p2}, Lorg/snmp4j/asn1/BER;->encodeLength(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public static encodeString(Ljava/io/OutputStream;B[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    array-length v0, p2

    invoke-static {p0, p1, v0}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    invoke-virtual {p0, p2}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method private static encodeSubID(Ljava/io/OutputStream;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    const-wide/16 v3, 0x7f

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    long-to-int v1, v1

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    goto :goto_2

    :cond_0
    const-wide/16 v5, 0x0

    move-wide v7, v3

    move-wide v11, v7

    move-wide v9, v5

    move-wide v13, v9

    :goto_0
    cmp-long v15, v7, v5

    const-wide/16 v16, 0x7

    const/16 v18, 0x7

    if-eqz v15, :cond_2

    and-long v19, v1, v7

    cmp-long v15, v19, v5

    if-lez v15, :cond_1

    move-wide v11, v7

    move-wide v13, v9

    :cond_1
    shl-long v7, v7, v18

    add-long v9, v9, v16

    goto :goto_0

    :cond_2
    :goto_1
    cmp-long v5, v11, v3

    if-eqz v5, :cond_4

    const-wide/32 v5, 0x1e00000

    cmp-long v5, v11, v5

    if-nez v5, :cond_3

    const-wide/32 v11, 0xfe00000

    :cond_3
    and-long v5, v1, v11

    long-to-int v7, v13

    shr-long/2addr v5, v7

    const-wide/16 v7, -0x80

    or-long/2addr v5, v7

    long-to-int v5, v5

    invoke-virtual {v0, v5}, Ljava/io/OutputStream;->write(I)V

    shr-long v11, v11, v18

    sub-long v13, v13, v16

    goto :goto_1

    :cond_4
    and-long/2addr v1, v11

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    :goto_2
    return-void
.end method

.method public static encodeUnsignedInt64(Ljava/io/OutputStream;BJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    move v1, v0

    :goto_0
    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    if-le v1, v4, :cond_1

    add-int/lit8 v4, v1, -0x1

    mul-int/2addr v4, v0

    shr-long v4, p2, v4

    const-wide/16 v6, 0xff

    and-long/2addr v4, v6

    cmp-long v4, v4, v2

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 v4, v1, -0x1

    mul-int/2addr v4, v0

    shr-long v4, p2, v4

    const-wide/16 v6, 0x80

    and-long/2addr v4, v6

    cmp-long v2, v4, v2

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    :cond_2
    invoke-static {p0, p1, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    const/16 p1, 0x9

    const/4 v2, 0x0

    if-ne v1, p1, :cond_3

    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v1, v1, -0x1

    :cond_3
    :goto_2
    if-ge v2, v1, :cond_4

    add-int/lit8 p1, v1, -0x1

    sub-int/2addr p1, v2

    mul-int/2addr p1, v0

    and-int/lit16 p1, p1, 0xff

    shr-long v3, p2, p1

    long-to-int p1, v3

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public static encodeUnsignedInteger(Ljava/io/OutputStream;BJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x18

    shr-long v0, p2, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    const/16 v1, 0x8

    const/4 v6, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    shr-long v7, p2, v0

    and-long/2addr v7, v2

    cmp-long v0, v7, v4

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    shr-long v7, p2, v1

    and-long/2addr v2, v7

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    move v0, v6

    :goto_0
    add-int/lit8 v2, v0, -0x1

    mul-int/2addr v2, v1

    shr-long v2, p2, v2

    const-wide/16 v7, 0x80

    and-long/2addr v2, v7

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    add-int/lit8 v0, v0, 0x1

    :cond_3
    invoke-static {p0, p1, v0}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    const/4 p1, 0x5

    const/4 v2, 0x0

    if-ne v0, p1, :cond_4

    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V

    :goto_1
    if-ge v6, v0, :cond_5

    rsub-int/lit8 p1, v6, 0x4

    mul-int/2addr p1, v1

    and-int/lit16 p1, p1, 0xff

    shr-long v2, p2, p1

    long-to-int p1, v2

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-ge v2, v0, :cond_5

    add-int/lit8 p1, v0, -0x1

    sub-int/2addr p1, v2

    mul-int/2addr p1, v1

    and-int/lit16 p1, p1, 0xff

    shr-long v3, p2, p1

    long-to-int p1, v3

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public static getBERLengthOfLength(I)I
    .locals 2

    const/4 v0, 0x5

    if-gez p0, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x80

    if-ge p0, v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/16 v1, 0xff

    if-gt p0, v1, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    const v1, 0xffff

    if-gt p0, v1, :cond_3

    const/4 p0, 0x3

    return p0

    :cond_3
    const v1, 0xffffff

    if-gt p0, v1, :cond_4

    const/4 p0, 0x4

    return p0

    :cond_4
    return v0
.end method

.method public static getBigIntegerBERLength(Ljava/math/BigInteger;)I
    .locals 1

    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    array-length p0, p0

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v0

    add-int/2addr p0, v0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static getOIDLength([I)I
    .locals 3

    array-length v0, p0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    aget v0, p0, v0

    mul-int/lit8 v0, v0, 0x28

    aget v1, p0, v1

    add-int/2addr v0, v1

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getSubIDLength(I)I

    move-result v1

    :cond_0
    const/4 v0, 0x2

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    aget v2, p0, v0

    invoke-static {v2}, Lorg/snmp4j/asn1/BER;->getSubIDLength(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private static getPositionMessage(Lorg/snmp4j/asn1/BERInputStream;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " at position "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getSubIDLength(I)I
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const-wide/16 v2, 0x80

    cmp-long p0, v0, v2

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x4000

    cmp-long p0, v0, v2

    if-gez p0, :cond_1

    const/4 p0, 0x2

    goto :goto_0

    :cond_1
    const-wide/32 v2, 0x200000

    cmp-long p0, v0, v2

    if-gez p0, :cond_2

    const/4 p0, 0x3

    goto :goto_0

    :cond_2
    const-wide/32 v2, 0x10000000

    cmp-long p0, v0, v2

    if-gez p0, :cond_3

    const/4 p0, 0x4

    goto :goto_0

    :cond_3
    const/4 p0, 0x5

    :goto_0
    return p0
.end method

.method public static isCheckFirstSubID012()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/asn1/BER;->checkFirstSubID012:Z

    return v0
.end method

.method public static isCheckSequenceLength()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/asn1/BER;->checkSequenceLength:Z

    return v0
.end method

.method public static setCheckFirstSubID012(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/asn1/BER;->checkFirstSubID012:Z

    return-void
.end method

.method public static setCheckSequenceLength(Z)V
    .locals 0

    sput-boolean p0, Lorg/snmp4j/asn1/BER;->checkSequenceLength:Z

    return-void
.end method


# virtual methods
.method public isCheckValueLength()Z
    .locals 1

    sget-boolean v0, Lorg/snmp4j/asn1/BER;->checkValueLength:Z

    return v0
.end method

.method public setCheckValueLength(Z)V
    .locals 0

    sput-boolean p1, Lorg/snmp4j/asn1/BER;->checkValueLength:Z

    return-void
.end method
