.class public Lorg/snmp4j/ScopedPDU;
.super Lorg/snmp4j/PDU;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x3c45fe6cd878746fL


# instance fields
.field private contextEngineID:Lorg/snmp4j/smi/OctetString;

.field private contextName:Lorg/snmp4j/smi/OctetString;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/PDU;-><init>()V

    .line 2
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    .line 3
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/ScopedPDU;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1}, Lorg/snmp4j/PDU;-><init>(Lorg/snmp4j/PDU;)V

    .line 5
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    .line 6
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    .line 7
    iget-object v0, p1, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OctetString;

    iput-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    .line 8
    iget-object p1, p1, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/OctetString;

    iput-object p1, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lorg/snmp4j/ScopedPDU;

    invoke-direct {v0, p0}, Lorg/snmp4j/ScopedPDU;-><init>(Lorg/snmp4j/ScopedPDU;)V

    return-object v0
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v0

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v1

    iget-object v3, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v3, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v3, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v3, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-super {p0, p1}, Lorg/snmp4j/PDU;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-static {}, Lorg/snmp4j/asn1/BER;->isCheckSequenceLength()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v3

    sub-long/2addr v3, v1

    long-to-int p1, v3

    invoke-static {v0, p1, p0}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    :cond_0
    return-void
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x30

    invoke-virtual {p0}, Lorg/snmp4j/ScopedPDU;->getBERPayloadLength()I

    move-result v1

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    iget-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    invoke-super {p0, p1}, Lorg/snmp4j/PDU;->encodeBER(Ljava/io/OutputStream;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lorg/snmp4j/ScopedPDU;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lorg/snmp4j/ScopedPDU;

    invoke-super {p0, p1}, Lorg/snmp4j/PDU;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    iget-object v1, v0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-static {p1, v1}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    iget-object v0, v0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    invoke-static {p1, v0}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    invoke-super {p0, p1}, Lorg/snmp4j/PDU;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getBERLength()I
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/ScopedPDU;->getBERPayloadLength()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public getBERPayloadLength()I
    .locals 4

    invoke-super {p0}, Lorg/snmp4j/PDU;->getBERLength()I

    move-result v0

    iget-object v1, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v1

    :goto_0
    iget-object v3, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    :goto_1
    invoke-static {v1}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v1

    invoke-static {v2}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/2addr v3, v1

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v2

    add-int/2addr v0, v3

    return v0
.end method

.method public getContextEngineID()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getContextName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public setContextEngineID(Lorg/snmp4j/smi/OctetString;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Context engine ID must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setContextName(Lorg/snmp4j/smi/OctetString;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Context name must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/snmp4j/PDU;->type:I

    invoke-static {v1}, Lorg/snmp4j/PDU;->getTypeString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[{contextEngineID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/ScopedPDU;->contextEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contextName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/ScopedPDU;->contextName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}, requestID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", VBS["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :cond_0
    :goto_0
    iget-object v2, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    const-string v2, "; "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "]]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
