.class public Lorg/snmp4j/mp/MPv3$HeaderData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/asn1/BERSerializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/mp/MPv3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "HeaderData"
.end annotation


# static fields
.field public static final FLAG_AUTH:B = 0x1t

.field public static final FLAG_PRIV:B = 0x2t


# instance fields
.field msgFlags:Lorg/snmp4j/smi/OctetString;

.field msgID:Lorg/snmp4j/smi/Integer32;

.field msgMaxSize:Lorg/snmp4j/smi/Integer32;

.field securityModel:Lorg/snmp4j/smi/Integer32;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/snmp4j/smi/Integer32;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgID:Lorg/snmp4j/smi/Integer32;

    new-instance v0, Lorg/snmp4j/smi/Integer32;

    const v2, 0x7fffffff

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    const/4 v2, 0x1

    new-array v2, v2, [B

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->securityModel:Lorg/snmp4j/smi/Integer32;

    return-void
.end method


# virtual methods
.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v1

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v2

    const/16 v3, 0x30

    if-ne v2, v3, :cond_3

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v2

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    const/16 v4, 0x1e4

    if-lt v0, v4, :cond_2

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->securityModel:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SNMPv3 header decoded: msgId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", msgMaxSize="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", msgFlags="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v5}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", secModel="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->securityModel:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v4

    sub-long/2addr v4, v2

    long-to-int p1, v4

    invoke-static {v1, p1, p0}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    return-void

    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Message flags length != 1: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid msgMaxSize: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected sequence header type: "

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

    const/16 v0, 0x30

    invoke-virtual {p0}, Lorg/snmp4j/mp/MPv3$HeaderData;->getBERPayloadLength()I

    move-result v1

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->securityModel:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    return-void
.end method

.method public getBERLength()I
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/mp/MPv3$HeaderData;->getBERPayloadLength()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public getBERPayloadLength()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v0

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->securityModel:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getMsgFlags()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public getMsgID()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getMsgMaxSize()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getSecurityModel()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->securityModel:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public setMsgFlags(I)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgFlags:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    const/4 v1, 0x0

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method public setMsgID(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setMsgMaxSize(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setSecurityModel(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$HeaderData;->securityModel:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method
