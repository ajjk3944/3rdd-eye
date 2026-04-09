.class public Lorg/snmp4j/mp/MPv2c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/mp/MessageProcessingModel;


# static fields
.field public static final ID:I = 0x1

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field protected incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/mp/MPv2c;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/MPv2c;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/snmp4j/mp/MPv2c$1;

    invoke-direct {v0, p0}, Lorg/snmp4j/mp/MPv2c$1;-><init>(Lorg/snmp4j/mp/MPv2c;)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv2c;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/PDUFactory;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lorg/snmp4j/mp/MPv2c$1;

    invoke-direct {v0, p0}, Lorg/snmp4j/mp/MPv2c$1;-><init>(Lorg/snmp4j/mp/MPv2c;)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv2c;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    if-eqz p1, :cond_0

    .line 5
    iput-object p1, p0, Lorg/snmp4j/mp/MPv2c;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    :cond_0
    return-void
.end method


# virtual methods
.method public getID()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isProtocolVersionSupported(I)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public prepareDataElements(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/MutablePDU;Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/mp/MutableStateReference;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance p1, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {p1}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p3, p1}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result p4

    invoke-virtual {p3}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide p11

    long-to-int p11, p11

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result p1

    const/16 p12, 0x30

    if-ne p1, p12, :cond_0

    new-instance p1, Lorg/snmp4j/smi/Integer32;

    invoke-direct {p1}, Lorg/snmp4j/smi/Integer32;-><init>()V

    invoke-virtual {p1, p3}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {p7, p3}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    const/4 p1, 0x1

    invoke-virtual {p8, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    const/4 p8, 0x2

    invoke-virtual {p6, p8}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    invoke-virtual {p5, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    iget-object p1, p0, Lorg/snmp4j/mp/MPv2c;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-interface {p1, p0}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;

    move-result-object p1

    invoke-virtual {p9, p1}, Lorg/snmp4j/MutablePDU;->setPdu(Lorg/snmp4j/PDU;)V

    invoke-virtual {p1, p3}, Lorg/snmp4j/PDU;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {p3}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide p8

    long-to-int p3, p8

    sub-int/2addr p3, p11

    invoke-static {p4, p3, p1}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result p1

    invoke-virtual {p10, p1}, Lorg/snmp4j/mp/PduHandle;->setTransactionID(I)V

    new-instance p1, Lorg/snmp4j/mp/StateReference;

    invoke-static {}, Lorg/snmp4j/security/SecurityModels;->getInstance()Lorg/snmp4j/security/SecurityModels;

    move-result-object p3

    invoke-virtual {p3, p6}, Lorg/snmp4j/security/SecurityModels;->getSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;

    move-result-object p8

    invoke-virtual {p7}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p9

    const/4 p11, 0x0

    const/4 p6, 0x0

    move-object p3, p1

    move-object p4, p10

    move-object p5, p2

    move-object p7, p8

    move-object p8, p9

    move p9, p11

    invoke-direct/range {p3 .. p9}, Lorg/snmp4j/mp/StateReference;-><init>(Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/security/SecurityModel;[BI)V

    invoke-virtual {p13, p1}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object p1, Lorg/snmp4j/mp/MPv2c;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string p2, "SNMPv2c PDU must start with a SEQUENCE"

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public prepareOutgoingMessage(Lorg/snmp4j/smi/Address;III[BILorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 p1, -0x57a

    const/4 p2, 0x1

    if-ne p6, p2, :cond_3

    const/4 p6, 0x2

    if-eq p4, p6, :cond_0

    goto :goto_0

    :cond_0
    instance-of p4, p7, Lorg/snmp4j/ScopedPDU;

    if-nez p4, :cond_2

    invoke-virtual {p0, p3}, Lorg/snmp4j/mp/MPv2c;->isProtocolVersionSupported(I)Z

    move-result p4

    if-nez p4, :cond_1

    sget-object p2, Lorg/snmp4j/mp/MPv2c;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string p3, "MPv2c used with unsupported SNMP version"

    invoke-interface {p2, p3}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return p1

    :cond_1
    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1, p5}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    new-instance p4, Lorg/snmp4j/smi/Integer32;

    invoke-direct {p4, p3}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {p7}, Lorg/snmp4j/PDU;->getBERLength()I

    move-result p3

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result p5

    add-int/2addr p3, p5

    invoke-virtual {p4}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result p5

    add-int/2addr p3, p5

    invoke-static {p3}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result p5

    add-int/2addr p5, p3

    add-int/2addr p5, p2

    invoke-static {p5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p11, p2}, Lorg/snmp4j/asn1/BEROutputStream;->setBuffer(Ljava/nio/ByteBuffer;)V

    const/16 p2, 0x30

    invoke-static {p11, p2, p3}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    invoke-virtual {p4, p11}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    invoke-virtual {p1, p11}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    invoke-virtual {p7, p11}, Lorg/snmp4j/PDU;->encodeBER(Ljava/io/OutputStream;)V

    const/4 p1, 0x0

    return p1

    :cond_2
    sget-object p1, Lorg/snmp4j/mp/MPv2c;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string p2, "ScopedPDU must not be used with MPv2c"

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    sget-object p2, Lorg/snmp4j/mp/MPv2c;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string p3, "MPv2c used with unsupported security model"

    invoke-interface {p2, p3}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return p1
.end method

.method public prepareResponseMessage(III[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/asn1/BEROutputStream;)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/mp/StateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v1

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/mp/StateReference;->getPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move v2, p2

    move v3, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v11, p10

    invoke-virtual/range {v0 .. v12}, Lorg/snmp4j/mp/MPv2c;->prepareOutgoingMessage(Lorg/snmp4j/smi/Address;III[BILorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I

    move-result v0

    return v0
.end method

.method public releaseStateReference(Lorg/snmp4j/mp/PduHandle;)V
    .locals 0

    return-void
.end method
