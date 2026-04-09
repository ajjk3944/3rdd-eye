.class public Lorg/snmp4j/security/TSM;
.super Lorg/snmp4j/security/SNMPv3SecurityModel;
.source "SourceFile"


# static fields
.field private static final MAX_PREFIX_LENGTH:I = 0x4

.field private static final PREFIX_SEPARATOR:B = 0x3at

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private counterSupport:Lorg/snmp4j/mp/CounterSupport;

.field private usePrefix:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/TSM;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/TSM;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->createLocalEngineID()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lorg/snmp4j/security/TSM;-><init>(Lorg/snmp4j/smi/OctetString;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lorg/snmp4j/security/SNMPv3SecurityModel;-><init>()V

    .line 3
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/security/TSM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    .line 4
    iput-object p1, p0, Lorg/snmp4j/security/SNMPv3SecurityModel;->localEngineID:Lorg/snmp4j/smi/OctetString;

    .line 5
    iput-boolean p2, p0, Lorg/snmp4j/security/TSM;->usePrefix:Z

    return-void
.end method

.method private generateMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p9, Lorg/snmp4j/security/TsmSecurityStateReference;

    const/4 p3, 0x0

    const/4 p4, 0x1

    if-eqz p9, :cond_0

    invoke-virtual {p9}, Lorg/snmp4j/security/TsmSecurityStateReference;->getTmStateReference()Lorg/snmp4j/TransportStateReference;

    move-result-object p5

    if-eqz p5, :cond_0

    invoke-virtual {p9}, Lorg/snmp4j/security/TsmSecurityStateReference;->getTmStateReference()Lorg/snmp4j/TransportStateReference;

    move-result-object p5

    invoke-virtual {p5}, Lorg/snmp4j/TransportStateReference;->getTransportSecurityLevel()Lorg/snmp4j/security/SecurityLevel;

    move-result-object p6

    invoke-virtual {p5, p6}, Lorg/snmp4j/TransportStateReference;->setRequestedSecurityLevel(Lorg/snmp4j/security/SecurityLevel;)V

    invoke-virtual {p5, p4}, Lorg/snmp4j/TransportStateReference;->setSameSecurity(Z)V

    goto :goto_1

    :cond_0
    invoke-virtual {p12, p3}, Lorg/snmp4j/TransportStateReference;->setSameSecurity(Z)V

    iget-boolean p5, p0, Lorg/snmp4j/security/TSM;->usePrefix:Z

    if-eqz p5, :cond_4

    invoke-virtual {p12}, Lorg/snmp4j/TransportStateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object p5

    invoke-virtual {p0, p5}, Lorg/snmp4j/security/TSM;->getTransportDomainPrefix(Lorg/snmp4j/smi/Address;)Ljava/lang/String;

    move-result-object p5

    const/16 p7, 0x641

    if-nez p5, :cond_1

    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmUnknownPrefixes:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/TSM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    return p7

    :cond_1
    invoke-virtual {p0, p6}, Lorg/snmp4j/security/TSM;->getSecurityNamePrefix([B)Ljava/lang/String;

    move-result-object p9

    if-eqz p9, :cond_3

    invoke-virtual {p9, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_2

    goto :goto_0

    :cond_2
    new-instance p5, Lorg/snmp4j/smi/OctetString;

    new-instance p7, Ljava/lang/String;

    invoke-direct {p7, p6}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p9}, Ljava/lang/String;->length()I

    move-result p6

    add-int/2addr p6, p4

    invoke-virtual {p7, p6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p4

    invoke-direct {p5, p4}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    invoke-virtual {p12, p5}, Lorg/snmp4j/TransportStateReference;->setSecurityName(Lorg/snmp4j/smi/OctetString;)V

    goto :goto_1

    :cond_3
    :goto_0
    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmInvalidPrefixes:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/TSM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    return p7

    :cond_4
    new-instance p4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p4, p6}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {p12, p4}, Lorg/snmp4j/TransportStateReference;->setSecurityName(Lorg/snmp4j/smi/OctetString;)V

    :goto_1
    invoke-static {p8}, Lorg/snmp4j/security/SNMPv3SecurityModel;->buildMessageBuffer(Lorg/snmp4j/asn1/BERInputStream;)[B

    move-result-object p4

    new-instance p5, Lorg/snmp4j/smi/Integer32;

    invoke-direct {p5, p1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-static {p5, p4, p2, p10}, Lorg/snmp4j/security/SNMPv3SecurityModel;->buildWholeMessage(Lorg/snmp4j/smi/Integer32;[B[BLorg/snmp4j/security/SecurityParameters;)[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    array-length p1, p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p11, p1}, Lorg/snmp4j/asn1/BEROutputStream;->setBuffer(Ljava/nio/ByteBuffer;)V

    return p3
.end method

.method private updateStatusInfo(ILorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/event/CounterEvent;)V
    .locals 1

    if-eqz p2, :cond_0

    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {p2, v0}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    new-instance p1, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {p3}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v0

    invoke-virtual {p3}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object p3

    invoke-direct {p1, v0, p3}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {p2, p1}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/TSM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    return-void
.end method

.method public generateRequestMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v12}, Lorg/snmp4j/security/TSM;->generateMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I

    move-result v0

    return v0
.end method

.method public generateResponseMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v12, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v12}, Lorg/snmp4j/security/TSM;->generateMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I

    move-result v0

    return v0
.end method

.method public getCounterSupport()Lorg/snmp4j/mp/CounterSupport;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/TSM;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-object v0
.end method

.method public getID()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method protected getSecurityNamePrefix([B)Ljava/lang/String;
    .locals 2

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    new-instance p1, Ljava/lang/String;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([B)V

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_1

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getTransportDomainPrefix(Lorg/snmp4j/smi/Address;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lorg/snmp4j/smi/GenericAddress;->getTDomainPrefix(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hasAuthoritativeEngineID()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isUsePrefix()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/security/TSM;->usePrefix:Z

    return v0
.end method

.method public newSecurityParametersInstance()Lorg/snmp4j/security/SecurityParameters;
    .locals 1

    new-instance v0, Lorg/snmp4j/security/TsmSecurityParameters;

    invoke-direct {v0}, Lorg/snmp4j/security/TsmSecurityParameters;-><init>()V

    return-object v0
.end method

.method public newSecurityStateReference()Lorg/snmp4j/security/SecurityStateReference;
    .locals 1

    new-instance v0, Lorg/snmp4j/security/TsmSecurityStateReference;

    invoke-direct {v0}, Lorg/snmp4j/security/TsmSecurityStateReference;-><init>()V

    return-object v0
.end method

.method public processIncomingMsg(IILorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/security/SecurityModel;ILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/mp/StatusInformation;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p1, p0, Lorg/snmp4j/security/SNMPv3SecurityModel;->localEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    invoke-virtual {p8, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    if-eqz p7, :cond_6

    invoke-virtual {p7}, Lorg/snmp4j/TransportStateReference;->isTransportSecurityValid()Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-boolean p1, p0, Lorg/snmp4j/security/TSM;->usePrefix:Z

    if-eqz p1, :cond_4

    invoke-virtual {p7}, Lorg/snmp4j/TransportStateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lorg/snmp4j/smi/GenericAddress;->getTDomainPrefix(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    const/16 p4, 0x641

    if-nez p1, :cond_1

    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmUnknownPrefixes:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/TSM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    invoke-direct {p0, p5, p13, p1}, Lorg/snmp4j/security/TSM;->updateStatusInfo(ILorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/event/CounterEvent;)V

    return p4

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p8

    if-lez p8, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p8

    const/4 v0, 0x4

    if-le p8, v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p4, p1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    const/16 p1, 0x3a

    invoke-virtual {p4, p1}, Lorg/snmp4j/smi/OctetString;->append(B)V

    invoke-virtual {p7}, Lorg/snmp4j/TransportStateReference;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p4, p1}, Lorg/snmp4j/smi/OctetString;->append(Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {p4}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    invoke-virtual {p9, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    goto :goto_1

    :cond_3
    :goto_0
    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmInvalidPrefixes:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/TSM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    invoke-direct {p0, p5, p13, p1}, Lorg/snmp4j/security/TSM;->updateStatusInfo(ILorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/event/CounterEvent;)V

    return p4

    :cond_4
    invoke-virtual {p7}, Lorg/snmp4j/TransportStateReference;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    invoke-virtual {p9, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    :goto_1
    invoke-virtual {p7}, Lorg/snmp4j/TransportStateReference;->getTransportSecurityLevel()Lorg/snmp4j/security/SecurityLevel;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/security/SecurityLevel;->getSnmpValue()I

    move-result p1

    if-le p5, p1, :cond_5

    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmInadequateSecurityLevels:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/TSM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    invoke-direct {p0, p5, p13, p1}, Lorg/snmp4j/security/TSM;->updateStatusInfo(ILorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/event/CounterEvent;)V

    const/16 p1, 0x643

    return p1

    :cond_5
    check-cast p12, Lorg/snmp4j/security/TsmSecurityStateReference;

    invoke-virtual {p12, p7}, Lorg/snmp4j/security/TsmSecurityStateReference;->setTmStateReference(Lorg/snmp4j/TransportStateReference;)V

    check-cast p3, Lorg/snmp4j/security/TsmSecurityParameters;

    invoke-virtual {p3}, Lorg/snmp4j/security/TsmSecurityParameters;->getScopedPduPosition()I

    move-result p1

    invoke-static {p6}, Lorg/snmp4j/security/SNMPv3SecurityModel;->buildMessageBuffer(Lorg/snmp4j/asn1/BERInputStream;)[B

    move-result-object p4

    array-length p6, p4

    sub-int/2addr p6, p1

    invoke-static {p4, p1, p6}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p10, p1}, Lorg/snmp4j/asn1/BEROutputStream;->setFilledBuffer(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p3, p5}, Lorg/snmp4j/security/TsmSecurityParameters;->getBERMaxLength(I)I

    move-result p1

    sub-int/2addr p2, p1

    invoke-virtual {p11, p2}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_2
    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpTsmInvalidCaches:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/security/TSM;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    const/16 p1, 0x642

    return p1
.end method

.method public setLocalEngineID(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/SNMPv3SecurityModel;->localEngineID:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setUsePrefix(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/security/TSM;->usePrefix:Z

    return-void
.end method

.method public supportsEngineIdDiscovery()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
