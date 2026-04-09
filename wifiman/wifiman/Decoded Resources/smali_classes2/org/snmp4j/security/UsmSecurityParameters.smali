.class public Lorg/snmp4j/security/UsmSecurityParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/security/SecurityParameters;


# static fields
.field private static final MAX_BER_LENGTH_WITHOU_SEC_PARAMS:I = 0x50

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private authParametersPosition:I

.field private authenticationKey:[B

.field private authenticationParameters:Lorg/snmp4j/smi/OctetString;

.field private authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

.field private authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

.field private authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

.field private authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

.field private decodedLength:I

.field private privacyKey:[B

.field private privacyParameters:Lorg/snmp4j/smi/OctetString;

.field private privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

.field private securityParametersPosition:I

.field private sequencePosition:I

.field private userName:Lorg/snmp4j/smi/OctetString;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/UsmSecurityParameters;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/UsmSecurityParameters;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    .line 3
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

    .line 4
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

    .line 5
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->userName:Lorg/snmp4j/smi/OctetString;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

    .line 7
    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

    .line 8
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyParameters:Lorg/snmp4j/smi/OctetString;

    .line 9
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->securityParametersPosition:I

    .line 11
    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authParametersPosition:I

    .line 12
    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->decodedLength:I

    .line 13
    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->sequencePosition:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/AuthenticationProtocol;Lorg/snmp4j/security/PrivacyProtocol;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    .line 16
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

    .line 17
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

    .line 18
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->userName:Lorg/snmp4j/smi/OctetString;

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

    .line 20
    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

    .line 21
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyParameters:Lorg/snmp4j/smi/OctetString;

    .line 22
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0}, Lorg/snmp4j/smi/OctetString;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    const/4 v0, -0x1

    .line 23
    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->securityParametersPosition:I

    .line 24
    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authParametersPosition:I

    .line 25
    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->decodedLength:I

    .line 26
    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->sequencePosition:I

    .line 27
    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    .line 28
    iput-object p2, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

    .line 29
    iput-object p3, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

    .line 30
    iput-object p6, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

    .line 31
    iput-object p4, p0, Lorg/snmp4j/security/UsmSecurityParameters;->userName:Lorg/snmp4j/smi/OctetString;

    .line 32
    iput-object p5, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

    return-void
.end method

.method private getBEREncodedAuthParamsPosition()I
    .locals 3

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getBERLength()I

    move-result v0

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getBERPayloadLength()I

    move-result v1

    iget-object v2, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v2

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->decodedLength:I

    new-instance v1, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v1}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {p1, v1}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v2

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v3

    invoke-virtual {v1}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v5

    const/4 v6, 0x4

    if-ne v5, v6, :cond_2

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v5

    long-to-int v5, v5

    iput v5, p0, Lorg/snmp4j/security/UsmSecurityParameters;->sequencePosition:I

    invoke-static {p1, v1}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v5

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v6

    invoke-virtual {v1}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v8

    const/16 v9, 0x30

    if-ne v8, v9, :cond_1

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v1, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v1, p1}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->userName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v8

    int-to-long v0, v0

    sub-long/2addr v8, v0

    long-to-int v0, v8

    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authParametersPosition:I

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v0

    long-to-int v0, v0

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    iget v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authParametersPosition:I

    int-to-long v8, v1

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v10

    int-to-long v0, v0

    sub-long/2addr v10, v0

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getBERPayloadLength()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr v10, v0

    add-long/2addr v8, v10

    long-to-int v0, v8

    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authParametersPosition:I

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v0

    iget v8, p0, Lorg/snmp4j/security/UsmSecurityParameters;->decodedLength:I

    int-to-long v8, v8

    sub-long/2addr v0, v8

    long-to-int v0, v0

    iput v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->decodedLength:I

    invoke-static {}, Lorg/snmp4j/asn1/BER;->isCheckSequenceLength()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v0

    sub-long/2addr v0, v6

    long-to-int v0, v0

    invoke-static {v5, v0, p0}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    invoke-virtual {p1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v0

    sub-long/2addr v0, v3

    long-to-int p1, v0

    invoke-static {v2, p1, p0}, Lorg/snmp4j/asn1/BER;->checkSequenceLength(IILorg/snmp4j/asn1/BERSerializable;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "BER decoding error: Expected BER SEQUENCE but found: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lorg/snmp4j/security/UsmSecurityParameters;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "BER decoding error: Expected BER OCTETSTRING but found: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lorg/snmp4j/security/UsmSecurityParameters;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public encodeBER(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getBERPayloadLength()I

    move-result v1

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    const/16 v0, 0x30

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getBERUsmPayloadLength()I

    move-result v1

    invoke-static {p1, v0, v1}, Lorg/snmp4j/asn1/BER;->encodeHeader(Ljava/io/OutputStream;II)V

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->userName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->encodeBER(Ljava/io/OutputStream;)V

    return-void
.end method

.method public getAuthParametersPosition()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authParametersPosition:I

    if-ltz v0, :cond_0

    return v0

    :cond_0
    invoke-direct {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getBEREncodedAuthParamsPosition()I

    move-result v0

    return v0
.end method

.method public getAuthenticationKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationKey:[B

    return-object v0
.end method

.method public getAuthenticationParameters()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getAuthenticationProtocol()Lorg/snmp4j/security/AuthenticationProtocol;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

    return-object v0
.end method

.method public getAuthoritativeEngineBoots()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getAuthoritativeEngineID()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    return-object v0
.end method

.method public getAuthoritativeEngineTime()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v0

    return v0
.end method

.method public getBERLength()I
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getBERPayloadLength()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public getBERMaxLength(I)I
    .locals 4

    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v0

    const/4 v1, 0x1

    if-le p1, v1, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/security/SecurityProtocols;->getMaxAuthDigestLength()I

    move-result v2

    invoke-virtual {v0}, Lorg/snmp4j/security/SecurityProtocols;->getMaxAuthDigestLength()I

    move-result v3

    invoke-static {v3}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v2, v1

    const/4 v3, 0x3

    if-ne p1, v3, :cond_1

    invoke-virtual {v0}, Lorg/snmp4j/security/SecurityProtocols;->getMaxPrivDecryptParamsLength()I

    move-result p1

    invoke-virtual {v0}, Lorg/snmp4j/security/SecurityProtocols;->getMaxPrivDecryptParamsLength()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v0

    add-int/2addr p1, v0

    add-int/2addr p1, v1

    add-int/2addr v2, p1

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :cond_1
    :goto_0
    add-int/lit8 v2, v2, 0x50

    invoke-static {v2}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result p1

    add-int/2addr v2, p1

    add-int/2addr v2, v1

    return v2
.end method

.method public getBERPayloadLength()I
    .locals 2

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getBERUsmPayloadLength()I

    move-result v0

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public getBERUsmPayloadLength()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v0

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->userName:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyParameters:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getPrivacyKey()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyKey:[B

    return-object v0
.end method

.method public getPrivacyParameters()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyParameters:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getPrivacyProtocol()Lorg/snmp4j/security/PrivacyProtocol;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

    return-object v0
.end method

.method public getScopedPduPosition()I
    .locals 2

    iget v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->decodedLength:I

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getSecurityParametersPosition()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    invoke-virtual {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getSecurityParametersPosition()I

    move-result v0

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmSecurityParameters;->getBERLength()I

    move-result v1

    goto :goto_0
.end method

.method public getSecurityParametersPosition()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->securityParametersPosition:I

    return v0
.end method

.method public getSequencePosition()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->sequencePosition:I

    return v0
.end method

.method public getUserName()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->userName:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public setAuthenticationKey([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationKey:[B

    return-void
.end method

.method public setAuthenticationParameters(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationParameters:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setAuthenticationProtocol(Lorg/snmp4j/security/AuthenticationProtocol;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authenticationProtocol:Lorg/snmp4j/security/AuthenticationProtocol;

    return-void
.end method

.method public setAuthoritativeEngineBoots(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineBoots:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setAuthoritativeEngineID([B)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Authoritative engine ID must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAuthoritativeEngineTime(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmSecurityParameters;->authoritativeEngineTime:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    return-void
.end method

.method public setPrivacyKey([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyKey:[B

    return-void
.end method

.method public setPrivacyParameters(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyParameters:Lorg/snmp4j/smi/OctetString;

    return-void
.end method

.method public setPrivacyProtocol(Lorg/snmp4j/security/PrivacyProtocol;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->privacyProtocol:Lorg/snmp4j/security/PrivacyProtocol;

    return-void
.end method

.method public setSecurityParametersPosition(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->securityParametersPosition:I

    return-void
.end method

.method public setUserName(Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/security/UsmSecurityParameters;->userName:Lorg/snmp4j/smi/OctetString;

    return-void
.end method
