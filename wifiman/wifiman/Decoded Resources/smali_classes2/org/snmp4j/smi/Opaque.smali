.class public Lorg/snmp4j/smi/Opaque;
.super Lorg/snmp4j/smi/OctetString;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x3c990b1b76d0cdL


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/Opaque;

    invoke-super {p0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Opaque;-><init>([B)V

    return-object v0
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

    const/16 v2, 0x44

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

    const/16 v0, 0x44

    invoke-virtual {p0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeString(Ljava/io/OutputStream;B[B)V

    return-void
.end method

.method public getSyntax()I
    .locals 1

    const/16 v0, 0x44

    return v0
.end method

.method public setValue(Lorg/snmp4j/smi/OctetString;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/smi/OctetString;->append(Lorg/snmp4j/smi/OctetString;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
