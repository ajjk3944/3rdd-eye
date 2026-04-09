.class public Lorg/snmp4j/security/dh/DHParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final DEFAULT:Lorg/snmp4j/security/dh/DHParameters;


# instance fields
.field private generator:Ljava/math/BigInteger;

.field private prime:Ljava/math/BigInteger;

.field private privateValueLength:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lorg/snmp4j/security/dh/DHParameters;

    sget-object v1, Lorg/snmp4j/security/dh/DHGroups;->P1:Ljava/math/BigInteger;

    sget-object v2, Lorg/snmp4j/security/dh/DHGroups;->G:Ljava/math/BigInteger;

    const/16 v3, 0x10

    invoke-direct {v0, v1, v2, v3}, Lorg/snmp4j/security/dh/DHParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    sput-object v0, Lorg/snmp4j/security/dh/DHParameters;->DEFAULT:Lorg/snmp4j/security/dh/DHParameters;

    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/security/dh/DHParameters;->prime:Ljava/math/BigInteger;

    iput-object p2, p0, Lorg/snmp4j/security/dh/DHParameters;->generator:Ljava/math/BigInteger;

    iput p3, p0, Lorg/snmp4j/security/dh/DHParameters;->privateValueLength:I

    return-void
.end method

.method public static encodeBER(Ljava/math/BigInteger;Ljava/math/BigInteger;I)Lorg/snmp4j/smi/OctetString;
    .locals 3

    invoke-static {p0}, Lorg/snmp4j/asn1/BER;->getBigIntegerBERLength(Ljava/math/BigInteger;)I

    move-result v0

    invoke-static {p1}, Lorg/snmp4j/asn1/BER;->getBigIntegerBERLength(Ljava/math/BigInteger;)I

    move-result v1

    if-eqz p2, :cond_0

    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v2, p2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v2}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v1, v0

    add-int/2addr v1, v2

    invoke-static {v1}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v0

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    new-instance v2, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-direct {v2, v0}, Lorg/snmp4j/asn1/BEROutputStream;-><init>(Ljava/nio/ByteBuffer;)V

    const/16 v0, 0x10

    :try_start_0
    invoke-static {v2, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeSequence(Ljava/io/OutputStream;BI)V

    const/4 v0, 0x2

    invoke-static {v2, v0, p0}, Lorg/snmp4j/asn1/BER;->encodeBigInteger(Ljava/io/OutputStream;BLjava/math/BigInteger;)V

    invoke-static {v2, v0, p1}, Lorg/snmp4j/asn1/BER;->encodeBigInteger(Ljava/io/OutputStream;BLjava/math/BigInteger;)V

    if-eqz p2, :cond_1

    invoke-static {v2, v0, p2}, Lorg/snmp4j/asn1/BER;->encodeInteger(Ljava/io/OutputStream;BI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    new-instance p0, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2}, Lorg/snmp4j/asn1/BEROutputStream;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getDHParametersFromBER(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/dh/DHParameters;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BERInputStream;

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    new-instance p0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {p0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {v0, p0}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result p0

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v1

    new-instance v3, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v3}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {v0, v3}, Lorg/snmp4j/asn1/BER;->decodeBigInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {v0, v3}, Lorg/snmp4j/asn1/BER;->decodeBigInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BERInputStream;->available()I

    move-result v6

    if-lez v6, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v6

    int-to-long v8, p0

    add-long/2addr v8, v1

    cmp-long p0, v6, v8

    if-gez p0, :cond_0

    invoke-static {v0, v3}, Lorg/snmp4j/asn1/BER;->decodeInteger(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v0, Lorg/snmp4j/security/dh/DHParameters;

    invoke-direct {v0, v4, v5, p0}, Lorg/snmp4j/security/dh/DHParameters;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lorg/snmp4j/security/dh/DHParameters;

    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getPrivateValueLength()I

    move-result v1

    invoke-virtual {p1}, Lorg/snmp4j/security/dh/DHParameters;->getPrivateValueLength()I

    move-result v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getPrime()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1}, Lorg/snmp4j/security/dh/DHParameters;->getPrime()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getGenerator()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1}, Lorg/snmp4j/security/dh/DHParameters;->getGenerator()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method public getGenerator()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/dh/DHParameters;->generator:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getPrime()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/dh/DHParameters;->prime:Ljava/math/BigInteger;

    return-object v0
.end method

.method public getPrivateValueLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/dh/DHParameters;->privateValueLength:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getPrime()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getGenerator()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lorg/snmp4j/security/dh/DHParameters;->getPrivateValueLength()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DHParameters{prime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/dh/DHParameters;->prime:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", generator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/security/dh/DHParameters;->generator:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", privateValueLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/security/dh/DHParameters;->privateValueLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
