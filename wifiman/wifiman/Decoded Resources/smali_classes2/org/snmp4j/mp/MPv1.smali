.class public Lorg/snmp4j/mp/MPv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/mp/MessageProcessingModel;


# static fields
.field public static final ID:I

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field protected incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/mp/MPv1;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/MPv1;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/snmp4j/mp/MPv1$1;

    invoke-direct {v0, p0}, Lorg/snmp4j/mp/MPv1$1;-><init>(Lorg/snmp4j/mp/MPv1;)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv1;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/util/PDUFactory;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lorg/snmp4j/mp/MPv1$1;

    invoke-direct {v0, p0}, Lorg/snmp4j/mp/MPv1$1;-><init>(Lorg/snmp4j/mp/MPv1;)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv1;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    if-eqz p1, :cond_0

    .line 5
    iput-object p1, p0, Lorg/snmp4j/mp/MPv1;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    :cond_0
    return-void
.end method


# virtual methods
.method public getID()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isProtocolVersionSupported(I)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public prepareDataElements(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/MutablePDU;Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/mp/MutableStateReference;)I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p0

    move-object v1, p3

    move-object/from16 v2, p6

    new-instance v3, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v3}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p3, v3}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v4

    invoke-virtual {p3}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v3}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v3

    const/16 v6, 0x30

    if-ne v3, v6, :cond_0

    new-instance v3, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v3}, Lorg/snmp4j/smi/Integer32;-><init>()V

    invoke-virtual {v3, p3}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    move-object/from16 v3, p7

    invoke-virtual {v3, p3}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    const/4 v6, 0x1

    move-object/from16 v7, p8

    invoke-virtual {v7, v6}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    invoke-virtual {v2, v6}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    const/4 v6, 0x0

    move-object v7, p5

    invoke-virtual {p5, v6}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    iget-object v7, v0, Lorg/snmp4j/mp/MPv1;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-interface {v7, p0}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;

    move-result-object v7

    move-object/from16 v8, p9

    invoke-virtual {v8, v7}, Lorg/snmp4j/MutablePDU;->setPdu(Lorg/snmp4j/PDU;)V

    invoke-virtual {v7, p3}, Lorg/snmp4j/PDU;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {p3}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v8

    long-to-int v1, v8

    sub-int/2addr v1, v5

    invoke-static {v4, v1, v7}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    invoke-virtual {v7}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v1

    move-object/from16 v4, p10

    invoke-virtual {v4, v1}, Lorg/snmp4j/mp/PduHandle;->setTransactionID(I)V

    new-instance v1, Lorg/snmp4j/mp/StateReference;

    invoke-static {}, Lorg/snmp4j/security/SecurityModels;->getInstance()Lorg/snmp4j/security/SecurityModels;

    move-result-object v5

    invoke-virtual {v5, v2}, Lorg/snmp4j/security/SecurityModels;->getSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;

    move-result-object v2

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v3

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object p3, v1

    move-object/from16 p4, p10

    move-object p5, p2

    move-object/from16 p6, v7

    move-object/from16 p7, v2

    move-object/from16 p8, v3

    move/from16 p9, v5

    invoke-direct/range {p3 .. p9}, Lorg/snmp4j/mp/StateReference;-><init>(Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/security/SecurityModel;[BI)V

    move-object/from16 v2, p13

    invoke-virtual {v2, v1}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    return v6

    :cond_0
    sget-object v1, Lorg/snmp4j/mp/MPv1;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v2, "SNMPv1 PDU must start with a SEQUENCE"

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
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

    if-eq p4, p2, :cond_0

    goto :goto_0

    :cond_0
    instance-of p4, p7, Lorg/snmp4j/ScopedPDU;

    if-nez p4, :cond_2

    invoke-virtual {p0, p3}, Lorg/snmp4j/mp/MPv1;->isProtocolVersionSupported(I)Z

    move-result p4

    if-nez p4, :cond_1

    sget-object p2, Lorg/snmp4j/mp/MPv1;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string p3, "MPv1 used with unsupported SNMP version"

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
    sget-object p1, Lorg/snmp4j/mp/MPv1;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string p2, "ScopedPDU must not be used with MPv1"

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    sget-object p2, Lorg/snmp4j/mp/MPv1;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string p3, "MPv1 used with unsupported security model"

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

    invoke-virtual/range {v0 .. v12}, Lorg/snmp4j/mp/MPv1;->prepareOutgoingMessage(Lorg/snmp4j/smi/Address;III[BILorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I

    move-result v0

    return v0
.end method

.method public releaseStateReference(Lorg/snmp4j/mp/PduHandle;)V
    .locals 0

    return-void
.end method
