.class public Lorg/snmp4j/PDUv1;
.super Lorg/snmp4j/PDU;
.source "SourceFile"


# static fields
.field public static final AUTHENTICATIONFAILURE:I = 0x4

.field public static final COLDSTART:I = 0x0

.field public static final ENTERPRISE_SPECIFIC:I = 0x6

.field public static final LINKDOWN:I = 0x2

.field public static final LINKUP:I = 0x3

.field private static final OPERATION_NOT_SUPPORTED:Ljava/lang/String; = "Operation not supported for SNMPv1 PDUs"

.field public static final WARMSTART:I = 0x1

.field private static final serialVersionUID:J = -0x59e956edb616b2baL


# instance fields
.field private agentAddress:Lorg/snmp4j/smi/IpAddress;

.field private enterprise:Lorg/snmp4j/smi/OID;

.field private genericTrap:Lorg/snmp4j/smi/Integer32;

.field private specificTrap:Lorg/snmp4j/smi/Integer32;

.field private timestamp:Lorg/snmp4j/smi/TimeTicks;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/PDU;-><init>()V

    .line 2
    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0}, Lorg/snmp4j/smi/OID;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    .line 3
    new-instance v0, Lorg/snmp4j/smi/IpAddress;

    const-string v1, "0.0.0.0"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/IpAddress;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    .line 4
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    .line 5
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    .line 6
    new-instance v0, Lorg/snmp4j/smi/TimeTicks;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/TimeTicks;-><init>(J)V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    const/16 v0, -0x5c

    .line 7
    invoke-virtual {p0, v0}, Lorg/snmp4j/PDU;->setType(I)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/PDUv1;)V
    .locals 3

    .line 8
    invoke-direct {p0, p1}, Lorg/snmp4j/PDU;-><init>(Lorg/snmp4j/PDU;)V

    .line 9
    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0}, Lorg/snmp4j/smi/OID;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    .line 10
    new-instance v0, Lorg/snmp4j/smi/IpAddress;

    const-string v1, "0.0.0.0"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/IpAddress;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    .line 11
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    .line 12
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    .line 13
    new-instance v0, Lorg/snmp4j/smi/TimeTicks;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/TimeTicks;-><init>(J)V

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    .line 14
    iget-object v0, p1, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OID;

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    .line 15
    iget-object v0, p1, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/IpAddress;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/IpAddress;

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    .line 16
    iget-object v0, p1, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/Integer32;

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    .line 17
    iget-object v0, p1, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/Integer32;

    iput-object v0, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    .line 18
    iget-object p1, p1, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    invoke-virtual {p1}, Lorg/snmp4j/smi/TimeTicks;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/TimeTicks;

    iput-object p1, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    return-void
.end method

.method private checkV1TRAP()V
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v1, -0x5c

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is only supported for SNMPv1 trap PDUs (V1TRAP)"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected checkNull(Lorg/snmp4j/smi/Variable;)V
    .locals 1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Members of PDUv1 must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lorg/snmp4j/PDUv1;

    invoke-direct {v0, p0}, Lorg/snmp4j/PDUv1;-><init>(Lorg/snmp4j/PDUv1;)V

    return-object v0
.end method

.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v1

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v3

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isAllowSNMPv2InV1()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported PDU type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    :pswitch_2
    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {p0, v0}, Lorg/snmp4j/PDU;->setType(I)V

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v3, -0x5c

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OID;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/IpAddress;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/TimeTicks;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    :goto_2
    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v0}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v3

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v4

    const/16 v5, 0x30

    if-ne v4, v5, :cond_5

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v4

    long-to-int v0, v4

    new-instance v4, Ljava/util/Vector;

    invoke-direct {v4}, Ljava/util/Vector;-><init>()V

    iput-object v4, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    :goto_3
    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v4

    int-to-long v6, v0

    sub-long/2addr v4, v6

    int-to-long v6, v3

    cmp-long v4, v4, v6

    if-gez v4, :cond_3

    new-instance v4, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v4}, Lorg/snmp4j/smi/VariableBinding;-><init>()V

    invoke-virtual {v4, p1}, Lorg/snmp4j/smi/VariableBinding;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {v4}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v5

    invoke-virtual {p0, v5}, Lorg/snmp4j/PDUv1;->isVariableV1(Lorg/snmp4j/smi/Variable;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v5, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    new-instance p1, Lorg/snmp4j/MessageException;

    const-string v0, "Counter64 encountered in SNMPv1 PDU (RFC 2576 \u00a74.1.2.1)"

    invoke-direct {p1, v0}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {}, Lorg/snmp4j/asn1/BER;->isCheckSequenceLength()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v4

    long-to-int v4, v4

    sub-int/2addr v4, v0

    invoke-static {v3, v4, p0}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v3

    long-to-int p1, v3

    sub-int/2addr p1, v2

    invoke-static {v1, p1, p0}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Encountered invalid tag, SEQUENCE expected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch -0x60
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lorg/snmp4j/PDU;->type:I

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getBERPayloadLength()I

    move-result v1

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    iget v0, p0, Lorg/snmp4j/PDU;->type:I

    const/16 v1, -0x5c

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OID;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/IpAddress;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/TimeTicks;->encodeBER(Ljava/io/OutputStream;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorStatus:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->errorIndex:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    :goto_0
    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v2}, Lorg/snmp4j/smi/VariableBinding;->getBERLength()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    const/16 v0, 0x30

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v1}, Lorg/snmp4j/smi/VariableBinding;->getVariable()Lorg/snmp4j/smi/Variable;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/snmp4j/PDUv1;->isVariableV1(Lorg/snmp4j/smi/Variable;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, p1}, Lorg/snmp4j/smi/VariableBinding;->encodeBER(Ljava/io/OutputStream;)V

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Cannot encode Counter64 into a SNMPv1 PDU"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lorg/snmp4j/PDUv1;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lorg/snmp4j/PDUv1;

    invoke-super {p0, p1}, Lorg/snmp4j/PDU;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    iget-object v1, v0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    invoke-static {p1, v1}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    iget-object v1, v0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    invoke-static {p1, v1}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    iget-object v1, v0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    invoke-static {p1, v1}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    iget-object v1, v0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    invoke-static {p1, v1}, Lorg/snmp4j/smi/AbstractVariable;->equal(Lorg/snmp4j/smi/AbstractVariable;Lorg/snmp4j/smi/AbstractVariable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    iget-object v0, v0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

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

.method public getAgentAddress()Lorg/snmp4j/smi/IpAddress;
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    return-object v0
.end method

.method protected getBERPayloadLengthPDU()I
    .locals 3

    invoke-virtual {p0}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v1, -0x5c

    if-eq v0, v1, :cond_0

    invoke-super {p0}, Lorg/snmp4j/PDU;->getBERPayloadLengthPDU()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/PDU;->variableBindings:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v2}, Lorg/snmp4j/smi/VariableBinding;->getBERLength()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v0

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/IpAddress;->getBERLength()I

    move-result v0

    add-int/2addr v1, v0

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OID;->getBERLength()I

    move-result v0

    add-int/2addr v1, v0

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v0

    add-int/2addr v1, v0

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v0

    add-int/2addr v1, v0

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    invoke-virtual {v0}, Lorg/snmp4j/smi/UnsignedInteger32;->getBERLength()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public getEnterprise()Lorg/snmp4j/smi/OID;
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    return-object v0
.end method

.method public getGenericTrap()I
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getMaxRepetitions()I
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation not supported for SNMPv1 PDUs"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getSpecificTrap()I
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getTimestamp()J
    .locals 2

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    invoke-virtual {v0}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v0

    return-wide v0
.end method

.method protected isVariableV1(Lorg/snmp4j/smi/Variable;)Z
    .locals 0

    instance-of p1, p1, Lorg/snmp4j/smi/Counter64;

    if-eqz p1, :cond_1

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isAllowSNMPv2InV1()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public setAgentAddress(Lorg/snmp4j/smi/IpAddress;)V
    .locals 0

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    invoke-virtual {p0, p1}, Lorg/snmp4j/PDUv1;->checkNull(Lorg/snmp4j/smi/Variable;)V

    iput-object p1, p0, Lorg/snmp4j/PDUv1;->agentAddress:Lorg/snmp4j/smi/IpAddress;

    return-void
.end method

.method public setEnterprise(Lorg/snmp4j/smi/OID;)V
    .locals 0

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    invoke-virtual {p0, p1}, Lorg/snmp4j/PDUv1;->checkNull(Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {p1}, Lorg/snmp4j/smi/OID;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/OID;

    iput-object p1, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    return-void
.end method

.method public setGenericTrap(I)V
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setMaxRepetitions(I)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported for SNMPv1 PDUs"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMaxSizeScopedPDU(I)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported for SNMPv1 PDUs"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setNonRepeaters(I)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported for SNMPv1 PDUs"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSpecificTrap(I)V
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setTimestamp(J)V
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/PDUv1;->checkV1TRAP()V

    iget-object v0, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    invoke-virtual {v0, p1, p2}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lorg/snmp4j/PDU;->type:I

    const/16 v1, -0x5c

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/snmp4j/PDU;->type:I

    invoke-static {v1}, Lorg/snmp4j/PDU;->getTypeString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[reqestID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDU;->requestID:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDUv1;->timestamp:Lorg/snmp4j/smi/TimeTicks;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",enterprise="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDUv1;->enterprise:Lorg/snmp4j/smi/OID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",genericTrap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDUv1;->genericTrap:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",specificTrap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/PDUv1;->specificTrap:Lorg/snmp4j/smi/Integer32;

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

    :cond_2
    invoke-super {p0}, Lorg/snmp4j/PDU;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
