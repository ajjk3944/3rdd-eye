.class public Lorg/snmp4j/uri/SnmpURI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;,
        Lorg/snmp4j/uri/SnmpURI$Request;,
        Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;,
        Lorg/snmp4j/uri/SnmpURI$SnmpUriType;
    }
.end annotation


# instance fields
.field private defaultTarget:Lorg/snmp4j/Target;

.field private defaultUserInfo:Ljava/lang/String;

.field private pduFactory:Lorg/snmp4j/util/PDUFactory;

.field private retries:I

.field private securityModel:I

.field private snmp:Lorg/snmp4j/Session;

.field private timeout:J

.field private usm:Lorg/snmp4j/security/USM;

.field private version:I


# direct methods
.method public constructor <init>(Lorg/snmp4j/Session;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lorg/snmp4j/uri/SnmpURI;->version:I

    .line 3
    iput v0, p0, Lorg/snmp4j/uri/SnmpURI;->securityModel:I

    const-wide/16 v0, 0x1388

    .line 4
    iput-wide v0, p0, Lorg/snmp4j/uri/SnmpURI;->timeout:J

    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lorg/snmp4j/uri/SnmpURI;->retries:I

    .line 6
    const-string v0, "public"

    iput-object v0, p0, Lorg/snmp4j/uri/SnmpURI;->defaultUserInfo:Ljava/lang/String;

    .line 7
    new-instance v0, Lorg/snmp4j/util/DefaultPDUFactory;

    invoke-direct {v0}, Lorg/snmp4j/util/DefaultPDUFactory;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/uri/SnmpURI;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    .line 8
    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->snmp:Lorg/snmp4j/Session;

    .line 9
    instance-of v0, p1, Lorg/snmp4j/Snmp;

    if-eqz v0, :cond_0

    .line 10
    check-cast p1, Lorg/snmp4j/Snmp;

    invoke-virtual {p1}, Lorg/snmp4j/Snmp;->getUSM()Lorg/snmp4j/security/USM;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->usm:Lorg/snmp4j/security/USM;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/Session;Lorg/snmp4j/Target;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 12
    iput v0, p0, Lorg/snmp4j/uri/SnmpURI;->version:I

    .line 13
    iput v0, p0, Lorg/snmp4j/uri/SnmpURI;->securityModel:I

    const-wide/16 v0, 0x1388

    .line 14
    iput-wide v0, p0, Lorg/snmp4j/uri/SnmpURI;->timeout:J

    const/4 v0, 0x1

    .line 15
    iput v0, p0, Lorg/snmp4j/uri/SnmpURI;->retries:I

    .line 16
    const-string v0, "public"

    iput-object v0, p0, Lorg/snmp4j/uri/SnmpURI;->defaultUserInfo:Ljava/lang/String;

    .line 17
    new-instance v0, Lorg/snmp4j/util/DefaultPDUFactory;

    invoke-direct {v0}, Lorg/snmp4j/util/DefaultPDUFactory;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/uri/SnmpURI;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    .line 18
    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->snmp:Lorg/snmp4j/Session;

    .line 19
    iput-object p2, p0, Lorg/snmp4j/uri/SnmpURI;->defaultTarget:Lorg/snmp4j/Target;

    .line 20
    instance-of p2, p1, Lorg/snmp4j/Snmp;

    if-eqz p2, :cond_0

    .line 21
    check-cast p1, Lorg/snmp4j/Snmp;

    invoke-virtual {p1}, Lorg/snmp4j/Snmp;->getUSM()Lorg/snmp4j/security/USM;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->usm:Lorg/snmp4j/security/USM;

    :cond_0
    return-void
.end method

.method private createSnmpRequest(Ljava/net/URI;)Lorg/snmp4j/uri/SnmpURI$Request;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/URI;->getPort()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/16 v1, 0xa1

    :cond_0
    invoke-virtual {p1}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lorg/snmp4j/uri/SnmpURI;->defaultUserInfo:Ljava/lang/String;

    :cond_1
    invoke-virtual {p1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object p1

    const-string v3, "/"

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v3, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-le v3, v6, :cond_3

    aget-object v3, p1, v5

    aget-object p1, p1, v6

    const-string v7, ";"

    invoke-virtual {v3, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v7, v3

    if-le v7, v6, :cond_2

    aget-object v4, v3, v6

    invoke-static {v4}, Lorg/snmp4j/smi/OctetString;->fromHexStringPairs(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v4

    :cond_2
    aget-object v3, v3, v5

    goto :goto_1

    :cond_3
    array-length v3, p1

    const-string v7, ""

    if-ne v3, v6, :cond_4

    aget-object p1, p1, v5

    :goto_0
    move-object v3, v7

    goto :goto_1

    :cond_4
    move-object p1, v4

    goto :goto_0

    :goto_1
    new-instance v7, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v7, v2}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v7}, Lorg/snmp4j/uri/SnmpURI;->createTarget(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/Target;

    move-result-object v2

    if-eqz v0, :cond_6

    instance-of v7, v2, Lorg/snmp4j/CertifiedTarget;

    if-eqz v7, :cond_5

    new-instance v7, Lorg/snmp4j/smi/TlsAddress;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    invoke-direct {v7, v0, v1}, Lorg/snmp4j/smi/TlsAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-interface {v2, v7}, Lorg/snmp4j/Target;->setAddress(Lorg/snmp4j/smi/Address;)V

    goto :goto_2

    :cond_5
    new-instance v7, Lorg/snmp4j/smi/UdpAddress;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    invoke-direct {v7, v0, v1}, Lorg/snmp4j/smi/UdpAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-interface {v2, v7}, Lorg/snmp4j/Target;->setAddress(Lorg/snmp4j/smi/Address;)V

    :goto_2
    move-object v9, v2

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lorg/snmp4j/uri/SnmpURI;->defaultTarget:Lorg/snmp4j/Target;

    goto :goto_2

    :goto_3
    iget-object v0, p0, Lorg/snmp4j/uri/SnmpURI;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-interface {v0, v9}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object v10

    instance-of v0, v10, Lorg/snmp4j/ScopedPDU;

    if-eqz v0, :cond_8

    if-eqz v4, :cond_7

    move-object v0, v10

    check-cast v0, Lorg/snmp4j/ScopedPDU;

    invoke-virtual {v0, v4}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    :cond_7
    if-eqz v3, :cond_8

    move-object v0, v10

    check-cast v0, Lorg/snmp4j/ScopedPDU;

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v1, v3}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/ScopedPDU;->setContextName(Lorg/snmp4j/smi/OctetString;)V

    :cond_8
    sget-object v0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->GET:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    if-eqz p1, :cond_a

    const-string v1, ".*"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->SUBTREE:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {p1, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_9
    :goto_4
    move-object v12, v0

    goto :goto_5

    :cond_a
    if-eqz p1, :cond_9

    const-string v1, "+"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v0, Lorg/snmp4j/uri/SnmpURI$SnmpUriType;->NEXT:Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v6

    invoke-virtual {p1, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :goto_5
    if-eqz p1, :cond_c

    const-string v0, "("

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "[\\(,\\),\\,]"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    :goto_6
    if-ge v5, v1, :cond_e

    aget-object v2, p1, v5

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_b

    new-instance v3, Lorg/snmp4j/smi/OID;

    invoke-direct {v3, v2}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/snmp4j/smi/OID;->isValid()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_c
    if-eqz p1, :cond_d

    new-instance v0, Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p1}, Lorg/snmp4j/smi/OID;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_7

    :cond_d
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_e
    :goto_7
    new-instance p1, Lorg/snmp4j/uri/SnmpURI$Request;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lorg/snmp4j/smi/OID;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [Lorg/snmp4j/smi/OID;

    const/4 v13, 0x0

    move-object v7, p1

    move-object v8, p0

    invoke-direct/range {v7 .. v13}, Lorg/snmp4j/uri/SnmpURI$Request;-><init>(Lorg/snmp4j/uri/SnmpURI;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/uri/SnmpURI$SnmpUriType;Lorg/snmp4j/uri/SnmpURI$1;)V

    return-object p1
.end method

.method private createTarget(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/Target;
    .locals 4

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget v0, p0, Lorg/snmp4j/uri/SnmpURI;->version:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    iget v0, p0, Lorg/snmp4j/uri/SnmpURI;->securityModel:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_4

    iget-object v3, p0, Lorg/snmp4j/uri/SnmpURI;->usm:Lorg/snmp4j/security/USM;

    if-eqz v3, :cond_4

    invoke-virtual {v3, v2, p1}, Lorg/snmp4j/security/USM;->getUser(Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmUserEntry;

    move-result-object v0

    new-instance v2, Lorg/snmp4j/UserTarget;

    invoke-direct {v2}, Lorg/snmp4j/UserTarget;-><init>()V

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUserEntry;->getAuthenticationKey()[B

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmUserEntry;->getPrivacyKey()[B

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, v1}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    :cond_3
    :goto_0
    iget v0, p0, Lorg/snmp4j/uri/SnmpURI;->version:I

    invoke-virtual {v2, v0}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    invoke-virtual {v2, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityName(Lorg/snmp4j/smi/OctetString;)V

    iget p1, p0, Lorg/snmp4j/uri/SnmpURI;->securityModel:I

    invoke-virtual {v2, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    iget-wide v0, p0, Lorg/snmp4j/uri/SnmpURI;->timeout:J

    invoke-virtual {v2, v0, v1}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    iget p1, p0, Lorg/snmp4j/uri/SnmpURI;->retries:I

    invoke-virtual {v2, p1}, Lorg/snmp4j/AbstractTarget;->setRetries(I)V

    return-object v2

    :cond_4
    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    new-instance v0, Lorg/snmp4j/CertifiedTarget;

    invoke-direct {v0, p1}, Lorg/snmp4j/CertifiedTarget;-><init>(Lorg/snmp4j/smi/OctetString;)V

    iget p1, p0, Lorg/snmp4j/uri/SnmpURI;->version:I

    invoke-virtual {v0, p1}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    iget p1, p0, Lorg/snmp4j/uri/SnmpURI;->securityModel:I

    invoke-virtual {v0, p1}, Lorg/snmp4j/AbstractTarget;->setSecurityModel(I)V

    iget-wide v1, p0, Lorg/snmp4j/uri/SnmpURI;->timeout:J

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    iget p1, p0, Lorg/snmp4j/uri/SnmpURI;->retries:I

    invoke-virtual {v0, p1}, Lorg/snmp4j/AbstractTarget;->setRetries(I)V

    return-object v0

    :cond_5
    return-object v2

    :cond_6
    new-instance v0, Lorg/snmp4j/CommunityTarget;

    invoke-direct {v0}, Lorg/snmp4j/CommunityTarget;-><init>()V

    invoke-virtual {v0, p1}, Lorg/snmp4j/CommunityTarget;->setCommunity(Lorg/snmp4j/smi/OctetString;)V

    iget p1, p0, Lorg/snmp4j/uri/SnmpURI;->version:I

    invoke-virtual {v0, p1}, Lorg/snmp4j/AbstractTarget;->setVersion(I)V

    iget p1, p0, Lorg/snmp4j/uri/SnmpURI;->securityModel:I

    invoke-virtual {v0, p1}, Lorg/snmp4j/CommunityTarget;->setSecurityModel(I)V

    iget-wide v1, p0, Lorg/snmp4j/uri/SnmpURI;->timeout:J

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    iget p1, p0, Lorg/snmp4j/uri/SnmpURI;->retries:I

    invoke-virtual {v0, p1}, Lorg/snmp4j/AbstractTarget;->setRetries(I)V

    return-object v0

    :cond_7
    :goto_1
    iget-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->defaultTarget:Lorg/snmp4j/Target;

    return-object p1
.end method

.method private sendSnmpRequest(Lorg/snmp4j/uri/SnmpURI$Request;Lorg/snmp4j/PDU;)Lorg/snmp4j/uri/SnmpUriResponse;
    .locals 2

    .line 1
    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(I)V

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/uri/SnmpURI;->snmp:Lorg/snmp4j/Session;

    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getTarget()Lorg/snmp4j/Target;

    move-result-object p1

    invoke-interface {v1, p2, p1}, Lorg/snmp4j/Session;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result p2

    if-eqz p2, :cond_0

    .line 5
    new-instance p2, Lorg/snmp4j/uri/SnmpUriResponse;

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result p1

    invoke-direct {p2, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(I)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 6
    :cond_0
    new-instance p2, Lorg/snmp4j/uri/SnmpUriResponse;

    .line 7
    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getVariableBindings()Ljava/util/Vector;

    move-result-object v1

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->size()I

    move-result p1

    new-array p1, p1, [Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v1, p1}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 8
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Ljava/util/List;)V

    goto :goto_0

    .line 9
    :cond_1
    new-instance p2, Lorg/snmp4j/uri/SnmpUriResponse;

    sget-object p1, Lorg/snmp4j/uri/SnmpUriResponse$Type;->TIMEOUT:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-direct {p2, p1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V

    :goto_0
    move-object v0, p2

    goto :goto_2

    .line 10
    :cond_2
    new-instance p1, Lorg/snmp4j/uri/SnmpUriResponse;

    sget-object p2, Lorg/snmp4j/uri/SnmpUriResponse$Type;->FINAL:Lorg/snmp4j/uri/SnmpUriResponse$Type;

    invoke-direct {p1, p2}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Lorg/snmp4j/uri/SnmpUriResponse$Type;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    goto :goto_2

    .line 11
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    return-object v0
.end method

.method private sendSnmpRequest(Lorg/snmp4j/uri/SnmpURI$Request;Lorg/snmp4j/PDU;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;Ljava/lang/Object;)V
    .locals 2

    .line 12
    new-instance v0, Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p3, p4, v1}, Lorg/snmp4j/uri/SnmpURI$AsyncResponseListener;-><init>(Lorg/snmp4j/uri/SnmpURI;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;Lorg/snmp4j/uri/SnmpURI$1;)V

    .line 13
    :try_start_0
    iget-object p3, p0, Lorg/snmp4j/uri/SnmpURI;->snmp:Lorg/snmp4j/Session;

    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getTarget()Lorg/snmp4j/Target;

    move-result-object p1

    invoke-interface {p3, p2, p1, p5, v0}, Lorg/snmp4j/Session;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public browse(Ljava/net/URI;)Lorg/snmp4j/uri/SnmpUriResponse;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 13
    new-instance v0, Lorg/snmp4j/uri/SnmpUriResponse;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(I)V

    .line 14
    invoke-direct {p0, p1}, Lorg/snmp4j/uri/SnmpURI;->createSnmpRequest(Ljava/net/URI;)Lorg/snmp4j/uri/SnmpURI$Request;

    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getPdu()Lorg/snmp4j/PDU;

    move-result-object v1

    .line 16
    sget-object v2, Lorg/snmp4j/uri/SnmpURI$1;->$SwitchMap$org$snmp4j$uri$SnmpURI$SnmpUriType:[I

    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getType()Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v1, 0x3

    if-eq v2, v1, :cond_0

    goto :goto_1

    .line 17
    :cond_0
    new-instance v0, Lorg/snmp4j/util/TreeUtils;

    iget-object v1, p0, Lorg/snmp4j/uri/SnmpURI;->snmp:Lorg/snmp4j/Session;

    iget-object v2, p0, Lorg/snmp4j/uri/SnmpURI;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/util/TreeUtils;-><init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V

    .line 18
    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getTarget()Lorg/snmp4j/Target;

    move-result-object v1

    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getOIDs()[Lorg/snmp4j/smi/OID;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/snmp4j/util/TreeUtils;->walk(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;)Ljava/util/List;

    move-result-object p1

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/TreeEvent;

    .line 21
    invoke-virtual {v1}, Lorg/snmp4j/util/TreeEvent;->getVariableBindings()[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {v1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v1

    goto :goto_0

    .line 23
    :cond_1
    new-instance p1, Lorg/snmp4j/uri/SnmpUriResponse;

    invoke-direct {p1, v0, v1}, Lorg/snmp4j/uri/SnmpUriResponse;-><init>(Ljava/util/List;I)V

    move-object v0, p1

    goto :goto_1

    :cond_2
    const/16 v0, -0x5f

    .line 24
    invoke-virtual {v1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 25
    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getOIDs()[Lorg/snmp4j/smi/OID;

    move-result-object v0

    invoke-static {v0}, Lorg/snmp4j/smi/VariableBinding;->createFromOIDs([Lorg/snmp4j/smi/OID;)[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/snmp4j/PDU;->addAll([Lorg/snmp4j/smi/VariableBinding;)V

    .line 26
    invoke-direct {p0, p1, v1}, Lorg/snmp4j/uri/SnmpURI;->sendSnmpRequest(Lorg/snmp4j/uri/SnmpURI$Request;Lorg/snmp4j/PDU;)Lorg/snmp4j/uri/SnmpUriResponse;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/16 v0, -0x60

    .line 27
    invoke-virtual {v1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 28
    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getOIDs()[Lorg/snmp4j/smi/OID;

    move-result-object v0

    invoke-static {v0}, Lorg/snmp4j/smi/VariableBinding;->createFromOIDs([Lorg/snmp4j/smi/OID;)[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/snmp4j/PDU;->addAll([Lorg/snmp4j/smi/VariableBinding;)V

    .line 29
    invoke-direct {p0, p1, v1}, Lorg/snmp4j/uri/SnmpURI;->sendSnmpRequest(Lorg/snmp4j/uri/SnmpURI$Request;Lorg/snmp4j/PDU;)Lorg/snmp4j/uri/SnmpUriResponse;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public browse(Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lorg/snmp4j/uri/SnmpURI;->createSnmpRequest(Ljava/net/URI;)Lorg/snmp4j/uri/SnmpURI$Request;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Lorg/snmp4j/uri/SnmpURI$Request;->getPdu()Lorg/snmp4j/PDU;

    move-result-object v2

    .line 3
    sget-object v0, Lorg/snmp4j/uri/SnmpURI$1;->$SwitchMap$org$snmp4j$uri$SnmpURI$SnmpUriType:[I

    invoke-virtual {v1}, Lorg/snmp4j/uri/SnmpURI$Request;->getType()Lorg/snmp4j/uri/SnmpURI$SnmpUriType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lorg/snmp4j/util/TreeUtils;

    iget-object v2, p0, Lorg/snmp4j/uri/SnmpURI;->snmp:Lorg/snmp4j/Session;

    iget-object v3, p0, Lorg/snmp4j/uri/SnmpURI;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-direct {v0, v2, v3}, Lorg/snmp4j/util/TreeUtils;-><init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V

    .line 5
    new-instance v2, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;

    invoke-direct {v2, p0, p1, p2}, Lorg/snmp4j/uri/SnmpURI$AsyncTreeListener;-><init>(Lorg/snmp4j/uri/SnmpURI;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;)V

    .line 6
    invoke-virtual {v1}, Lorg/snmp4j/uri/SnmpURI$Request;->getTarget()Lorg/snmp4j/Target;

    move-result-object p1

    invoke-virtual {v1}, Lorg/snmp4j/uri/SnmpURI$Request;->getOIDs()[Lorg/snmp4j/smi/OID;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3, v2}, Lorg/snmp4j/util/TreeUtils;->walk(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Ljava/lang/Object;Lorg/snmp4j/util/TreeListener;)V

    goto :goto_0

    :cond_1
    const/16 v0, -0x5f

    .line 7
    invoke-virtual {v2, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 8
    invoke-virtual {v1}, Lorg/snmp4j/uri/SnmpURI$Request;->getOIDs()[Lorg/snmp4j/smi/OID;

    move-result-object v0

    invoke-static {v0}, Lorg/snmp4j/smi/VariableBinding;->createFromOIDs([Lorg/snmp4j/smi/OID;)[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/snmp4j/PDU;->addAll([Lorg/snmp4j/smi/VariableBinding;)V

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 9
    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/uri/SnmpURI;->sendSnmpRequest(Lorg/snmp4j/uri/SnmpURI$Request;Lorg/snmp4j/PDU;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const/16 v0, -0x60

    .line 10
    invoke-virtual {v2, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 11
    invoke-virtual {v1}, Lorg/snmp4j/uri/SnmpURI$Request;->getOIDs()[Lorg/snmp4j/smi/OID;

    move-result-object v0

    invoke-static {v0}, Lorg/snmp4j/smi/VariableBinding;->createFromOIDs([Lorg/snmp4j/smi/OID;)[Lorg/snmp4j/smi/VariableBinding;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/snmp4j/PDU;->addAll([Lorg/snmp4j/smi/VariableBinding;)V

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 12
    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/uri/SnmpURI;->sendSnmpRequest(Lorg/snmp4j/uri/SnmpURI$Request;Lorg/snmp4j/PDU;Ljava/net/URI;Lorg/snmp4j/uri/SnmpUriCallback;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getDefaultUserInfo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpURI;->defaultUserInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getPduFactory()Lorg/snmp4j/util/PDUFactory;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpURI;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    return-object v0
.end method

.method public getRetries()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/uri/SnmpURI;->retries:I

    return v0
.end method

.method public getSecurityModel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/uri/SnmpURI;->securityModel:I

    return v0
.end method

.method public getTimeout()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/uri/SnmpURI;->timeout:J

    return-wide v0
.end method

.method public getUsm()Lorg/snmp4j/security/USM;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/uri/SnmpURI;->usm:Lorg/snmp4j/security/USM;

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/uri/SnmpURI;->version:I

    return v0
.end method

.method public sendByBinding(Ljava/net/URI;Ljava/util/List;I)Lorg/snmp4j/uri/SnmpUriResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Ljava/util/List<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;I)",
            "Lorg/snmp4j/uri/SnmpUriResponse;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/snmp4j/uri/SnmpURI;->createSnmpRequest(Ljava/net/URI;)Lorg/snmp4j/uri/SnmpURI$Request;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getPdu()Lorg/snmp4j/PDU;

    move-result-object v0

    invoke-virtual {v0, p3}, Lorg/snmp4j/PDU;->setType(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0, p3}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v0}, Lorg/snmp4j/uri/SnmpURI;->sendSnmpRequest(Lorg/snmp4j/uri/SnmpURI$Request;Lorg/snmp4j/PDU;)Lorg/snmp4j/uri/SnmpUriResponse;

    move-result-object p1

    return-object p1
.end method

.method public setDefaultUserInfo(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->defaultUserInfo:Ljava/lang/String;

    return-void
.end method

.method public setPduFactory(Lorg/snmp4j/util/PDUFactory;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    return-void
.end method

.method public setRetries(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/uri/SnmpURI;->retries:I

    return-void
.end method

.method public setSecurityModel(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/uri/SnmpURI;->securityModel:I

    return-void
.end method

.method public setSnmp(Lorg/snmp4j/Session;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->snmp:Lorg/snmp4j/Session;

    return-void
.end method

.method public setTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lorg/snmp4j/uri/SnmpURI;->timeout:J

    return-void
.end method

.method public setUsm(Lorg/snmp4j/security/USM;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/uri/SnmpURI;->usm:Lorg/snmp4j/security/USM;

    return-void
.end method

.method public setVersion(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/uri/SnmpURI;->version:I

    return-void
.end method

.method public updateByBinding(Ljava/net/URI;Ljava/util/List;)Lorg/snmp4j/uri/SnmpUriResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Ljava/util/List<",
            "Lorg/snmp4j/smi/VariableBinding;",
            ">;)",
            "Lorg/snmp4j/uri/SnmpUriResponse;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    const/16 v0, -0x5d

    invoke-virtual {p0, p1, p2, v0}, Lorg/snmp4j/uri/SnmpURI;->sendByBinding(Ljava/net/URI;Ljava/util/List;I)Lorg/snmp4j/uri/SnmpUriResponse;

    move-result-object p1

    return-object p1
.end method

.method public updateByValue(Ljava/net/URI;Ljava/util/List;)Lorg/snmp4j/uri/SnmpUriResponse;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Ljava/util/List<",
            "Lorg/snmp4j/smi/Variable;",
            ">;)",
            "Lorg/snmp4j/uri/SnmpUriResponse;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lorg/snmp4j/uri/SnmpURI;->createSnmpRequest(Ljava/net/URI;)Lorg/snmp4j/uri/SnmpURI$Request;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getPdu()Lorg/snmp4j/PDU;

    move-result-object v0

    const/16 v1, -0x5d

    invoke-virtual {v0, v1}, Lorg/snmp4j/PDU;->setType(I)V

    invoke-virtual {p1}, Lorg/snmp4j/uri/SnmpURI$Request;->getOIDs()[Lorg/snmp4j/smi/OID;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    new-instance v3, Lorg/snmp4j/smi/VariableBinding;

    aget-object v4, v1, v2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/snmp4j/smi/Variable;

    invoke-direct {v3, v4, v5}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v0, v3}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v0}, Lorg/snmp4j/uri/SnmpURI;->sendSnmpRequest(Lorg/snmp4j/uri/SnmpURI$Request;Lorg/snmp4j/PDU;)Lorg/snmp4j/uri/SnmpUriResponse;

    move-result-object p1

    return-object p1
.end method
