.class public Lorg/snmp4j/mp/MPv3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/mp/MessageProcessingModel;
.implements Lorg/snmp4j/mp/EngineIdCacheSize;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/mp/MPv3$LimitedCapacityEngineIdCacheFactory;,
        Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;,
        Lorg/snmp4j/mp/MPv3$HeaderData;,
        Lorg/snmp4j/mp/MPv3$Cache;,
        Lorg/snmp4j/mp/MPv3$CacheEntry;
    }
.end annotation


# static fields
.field public static final ID:I = 0x3

.field private static final INT_LOW_16BIT_MASK:I = 0xffff

.field public static final LOCAL_ENGINE_ID:Lorg/snmp4j/smi/OctetString;

.field public static final MAXLEN_ENGINE_ID:I = 0x20

.field private static final MAX_HEADER_LENGTH:I

.field private static final MAX_HEADER_PAYLOAD_LENGTH:I

.field public static final MAX_MESSAGE_ID:I = 0x7fffffff

.field public static final MINLEN_ENGINE_ID:I = 0x5

.field public static final MPv3_REPORTABLE_FLAG:I = 0x4

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private cache:Lorg/snmp4j/mp/MPv3$Cache;

.field private counterSupport:Lorg/snmp4j/mp/CounterSupport;

.field private currentMsgID:I

.field private engineIDs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/smi/OctetString;",
            ">;"
        }
    .end annotation
.end field

.field protected engineIdCacheFactory:Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;

.field protected incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

.field private localEngineID:[B

.field private maxEngineIdCacheSize:I

.field private securityModels:Lorg/snmp4j/security/SecurityModels;

.field private securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

.field transient snmpEngineListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/event/SnmpEngineListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "80:00:00:00:06"

    invoke-static {v0}, Lorg/snmp4j/smi/OctetString;->fromHexString(Ljava/lang/String;)Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/MPv3;->LOCAL_ENGINE_ID:Lorg/snmp4j/smi/OctetString;

    new-instance v0, Lorg/snmp4j/smi/OctetString;

    const-string v1, "\u0000"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/OctetString;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getBERLength()I

    move-result v0

    new-instance v1, Lorg/snmp4j/smi/Integer32;

    const v2, 0x7fffffff

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getBERLength()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    add-int/2addr v0, v1

    sput v0, Lorg/snmp4j/mp/MPv3;->MAX_HEADER_PAYLOAD_LENGTH:I

    invoke-static {v0}, Lorg/snmp4j/asn1/BER;->getBERLengthOfLength(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    sput v0, Lorg/snmp4j/mp/MPv3;->MAX_HEADER_LENGTH:I

    const-class v0, Lorg/snmp4j/mp/MPv3;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Lorg/snmp4j/mp/MPv3;->createLocalEngineID()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lorg/snmp4j/mp/MPv3;-><init>([BLorg/snmp4j/util/PDUFactory;)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/security/USM;)V
    .locals 7

    .line 7
    invoke-virtual {p1}, Lorg/snmp4j/security/SNMPv3SecurityModel;->getLocalEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v2

    .line 8
    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v4

    const/4 v0, 0x1

    new-array v0, v0, [Lorg/snmp4j/security/SecurityModel;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 9
    invoke-static {v0}, Lorg/snmp4j/security/SecurityModels;->getCollection([Lorg/snmp4j/security/SecurityModel;)Lorg/snmp4j/security/SecurityModels;

    move-result-object v5

    .line 10
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v6

    const/4 v3, 0x0

    move-object v1, p0

    .line 11
    invoke-direct/range {v1 .. v6}, Lorg/snmp4j/mp/MPv3;-><init>([BLorg/snmp4j/util/PDUFactory;Lorg/snmp4j/security/SecurityProtocols;Lorg/snmp4j/security/SecurityModels;Lorg/snmp4j/mp/CounterSupport;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lorg/snmp4j/mp/MPv3;-><init>([BLorg/snmp4j/util/PDUFactory;)V

    .line 3
    invoke-virtual {p0, p1}, Lorg/snmp4j/mp/MPv3;->setLocalEngineID([B)V

    return-void
.end method

.method public constructor <init>([BLorg/snmp4j/util/PDUFactory;)V
    .locals 6

    .line 4
    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v3

    .line 5
    invoke-static {}, Lorg/snmp4j/security/SecurityModels;->getInstance()Lorg/snmp4j/security/SecurityModels;

    move-result-object v4

    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 6
    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/mp/MPv3;-><init>([BLorg/snmp4j/util/PDUFactory;Lorg/snmp4j/security/SecurityProtocols;Lorg/snmp4j/security/SecurityModels;Lorg/snmp4j/mp/CounterSupport;)V

    return-void
.end method

.method public constructor <init>([BLorg/snmp4j/util/PDUFactory;Lorg/snmp4j/security/SecurityProtocols;Lorg/snmp4j/security/SecurityModels;Lorg/snmp4j/mp/CounterSupport;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getMaxEngineIdCacheSize()I

    move-result v0

    iput v0, p0, Lorg/snmp4j/mp/MPv3;->maxEngineIdCacheSize:I

    .line 14
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iput v0, p0, Lorg/snmp4j/mp/MPv3;->currentMsgID:I

    .line 15
    new-instance v0, Lorg/snmp4j/mp/MPv3$LimitedCapacityEngineIdCacheFactory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/snmp4j/mp/MPv3$LimitedCapacityEngineIdCacheFactory;-><init>(Lorg/snmp4j/mp/MPv3$1;)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIdCacheFactory:Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;

    .line 16
    new-instance v0, Lorg/snmp4j/mp/MPv3$1;

    invoke-direct {v0, p0}, Lorg/snmp4j/mp/MPv3$1;-><init>(Lorg/snmp4j/mp/MPv3;)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    if-eqz p2, :cond_0

    .line 17
    iput-object p2, p0, Lorg/snmp4j/mp/MPv3;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    .line 18
    :cond_0
    iget-object p2, p0, Lorg/snmp4j/mp/MPv3;->engineIdCacheFactory:Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;

    invoke-interface {p2, p0}, Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;->createEngineIdMap(Lorg/snmp4j/mp/EngineIdCacheSize;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    .line 19
    new-instance p2, Lorg/snmp4j/mp/MPv3$Cache;

    invoke-direct {p2}, Lorg/snmp4j/mp/MPv3$Cache;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/mp/MPv3;->cache:Lorg/snmp4j/mp/MPv3$Cache;

    .line 20
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iput-object p3, p0, Lorg/snmp4j/mp/MPv3;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    .line 22
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iput-object p4, p0, Lorg/snmp4j/mp/MPv3;->securityModels:Lorg/snmp4j/security/SecurityModels;

    .line 24
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iput-object p5, p0, Lorg/snmp4j/mp/MPv3;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    .line 26
    invoke-virtual {p0, p1}, Lorg/snmp4j/mp/MPv3;->setLocalEngineID([B)V

    .line 27
    new-instance p1, Lorg/snmp4j/smi/Integer32;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {p4, p1}, Lorg/snmp4j/security/SecurityModels;->getSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;

    move-result-object p1

    .line 28
    instance-of p2, p1, Lorg/snmp4j/security/USM;

    if-eqz p2, :cond_1

    .line 29
    check-cast p1, Lorg/snmp4j/security/USM;

    invoke-virtual {p1}, Lorg/snmp4j/security/USM;->getEngineBoots()I

    move-result p1

    invoke-static {p1}, Lorg/snmp4j/mp/MPv3;->randomMsgID(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/mp/MPv3;->setCurrentMsgID(I)V

    :cond_1
    return-void
.end method

.method static synthetic access$100()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    sget-object v0, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    return-object v0
.end method

.method public static createLocalEngineID()[B
    .locals 6

    .line 1
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getEnterpriseID()I

    move-result v0

    const/4 v1, 0x5

    .line 2
    new-array v1, v1, [B

    shr-int/lit8 v2, v0, 0x18

    and-int/lit16 v2, v2, 0xff

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    const/4 v3, 0x0

    .line 3
    aput-byte v2, v1, v3

    shr-int/lit8 v2, v0, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    const/4 v3, 0x1

    .line 4
    aput-byte v2, v1, v3

    shr-int/lit8 v2, v0, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    const/4 v4, 0x2

    .line 5
    aput-byte v2, v1, v4

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v2, 0x3

    .line 6
    aput-byte v0, v1, v2

    const/4 v0, 0x4

    .line 7
    aput-byte v4, v1, v0

    .line 8
    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v2}, Lorg/snmp4j/smi/OctetString;-><init>()V

    .line 9
    :try_start_0
    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v4

    .line 10
    array-length v5, v4

    if-ne v5, v0, :cond_0

    .line 11
    aput-byte v3, v1, v0

    .line 12
    :cond_0
    invoke-virtual {v2, v4}, Lorg/snmp4j/smi/OctetString;->setValue([B)V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 13
    :catch_0
    sget-object v3, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v4, "Local host cannot be determined for creation of local engine ID"

    invoke-interface {v3, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 14
    aput-byte v0, v1, v0

    .line 15
    const-string v3, "SNMP4J"

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OctetString;->setValue([B)V

    .line 16
    :goto_0
    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v3, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    .line 17
    new-instance v1, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    invoke-direct {v1, v4, v5}, Ljava/util/Random;-><init>(J)V

    .line 18
    new-array v0, v0, [B

    .line 19
    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    .line 20
    invoke-virtual {v3, v2}, Lorg/snmp4j/smi/OctetString;->append(Lorg/snmp4j/smi/OctetString;)V

    .line 21
    invoke-virtual {v3, v0}, Lorg/snmp4j/smi/OctetString;->append([B)V

    .line 22
    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    return-object v0
.end method

.method public static createLocalEngineID(Lorg/snmp4j/smi/OctetString;)[B
    .locals 6

    .line 23
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getEnterpriseID()I

    move-result v0

    shr-int/lit8 v1, v0, 0x18

    and-int/lit16 v1, v1, 0xff

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    shr-int/lit8 v2, v0, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    shr-int/lit8 v3, v0, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v4, 0x5

    .line 24
    new-array v4, v4, [B

    const/4 v5, 0x0

    aput-byte v1, v4, v5

    const/4 v1, 0x1

    aput-byte v2, v4, v1

    const/4 v1, 0x2

    aput-byte v3, v4, v1

    const/4 v1, 0x3

    aput-byte v0, v4, v1

    const/4 v0, 0x4

    aput-byte v0, v4, v0

    .line 25
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v0, v4}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    .line 26
    invoke-virtual {v0, p0}, Lorg/snmp4j/smi/OctetString;->append(Lorg/snmp4j/smi/OctetString;)V

    .line 27
    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p0

    return-object p0
.end method

.method public static randomMsgID(I)I
    .locals 2

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    and-int/2addr p0, v1

    shl-int/lit8 p0, p0, 0x10

    or-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public addEngineID(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)Z
    .locals 4

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->localEngineID:[B

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/mp/MPv3;->addEngineIdToCache(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    iget-object v2, p0, Lorg/snmp4j/mp/MPv3;->snmpEngineListeners:Ljava/util/List;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lorg/snmp4j/event/SnmpEngineEvent;

    invoke-direct {v0, p0, v3, p2, p1}, Lorg/snmp4j/event/SnmpEngineEvent;-><init>(Lorg/snmp4j/mp/MPv3;ILorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Address;)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/mp/MPv3;->fireEngineChanged(Lorg/snmp4j/event/SnmpEngineEvent;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return v3

    :catch_0
    new-instance v0, Lorg/snmp4j/event/SnmpEngineEvent;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v2, p2, p1}, Lorg/snmp4j/event/SnmpEngineEvent;-><init>(Lorg/snmp4j/mp/MPv3;ILorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Address;)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/mp/MPv3;->fireEngineChanged(Lorg/snmp4j/event/SnmpEngineEvent;)V

    :cond_2
    return v1
.end method

.method protected addEngineIdToCache(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/smi/OctetString;
    .locals 2

    iget v0, p0, Lorg/snmp4j/mp/MPv3;->maxEngineIdCacheSize:I

    if-lez v0, :cond_1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iget v1, p0, Lorg/snmp4j/mp/MPv3;->maxEngineIdCacheSize:I

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/OctetString;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MPv3: Failed to add engineID \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' for address \'"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' to local cache because its size limit of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lorg/snmp4j/mp/MPv3;->maxEngineIdCacheSize:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "has been reached"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/OctetString;

    return-object p1
.end method

.method public declared-synchronized addSnmpEngineListener(Lorg/snmp4j/event/SnmpEngineListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->snmpEngineListeners:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3;->snmpEngineListeners:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3;->snmpEngineListeners:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-interface {v0, p1}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object p1

    return-object p1
.end method

.method protected fireEngineChanged(Lorg/snmp4j/event/SnmpEngineEvent;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->snmpEngineListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/event/SnmpEngineListener;

    invoke-interface {v1, p1}, Lorg/snmp4j/event/SnmpEngineListener;->engineChanged(Lorg/snmp4j/event/SnmpEngineEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    :cond_0
    return-void
.end method

.method public getAuthProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/AuthenticationProtocol;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v0, p1}, Lorg/snmp4j/security/SecurityProtocols;->getAuthenticationProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/AuthenticationProtocol;

    move-result-object p1

    return-object p1
.end method

.method public getCounterSupport()Lorg/snmp4j/mp/CounterSupport;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-object v0
.end method

.method public getEngineID(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/OctetString;

    return-object p1
.end method

.method public getEngineIdCacheFactory()Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIdCacheFactory:Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;

    return-object v0
.end method

.method public getEngineIdCacheSize()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public getID()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getLocalEngineID()[B
    .locals 4

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->localEngineID:[B

    array-length v1, v0

    new-array v1, v1, [B

    const/4 v2, 0x0

    array-length v3, v0

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public getMaxEngineIdCacheSize()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/MPv3;->maxEngineIdCacheSize:I

    return v0
.end method

.method public declared-synchronized getNextMessageID()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lorg/snmp4j/mp/MPv3;->currentMsgID:I

    const v1, 0x7fffffff

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lorg/snmp4j/mp/MPv3;->currentMsgID:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget v0, p0, Lorg/snmp4j/mp/MPv3;->currentMsgID:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/snmp4j/mp/MPv3;->currentMsgID:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getNextMsgID()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/MPv3;->currentMsgID:I

    return v0
.end method

.method public getPrivProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/PrivacyProtocol;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v0, p1}, Lorg/snmp4j/security/SecurityProtocols;->getPrivacyProtocol(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/security/PrivacyProtocol;

    move-result-object p1

    return-object p1
.end method

.method public getSecurityModel(I)Lorg/snmp4j/security/SecurityModel;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->securityModels:Lorg/snmp4j/security/SecurityModels;

    new-instance v1, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v1, p1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/security/SecurityModels;->getSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;

    move-result-object p1

    return-object p1
.end method

.method public getSecurityModels()Lorg/snmp4j/security/SecurityModels;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->securityModels:Lorg/snmp4j/security/SecurityModels;

    return-object v0
.end method

.method public getSecurityProtocols()Lorg/snmp4j/security/SecurityProtocols;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    return-object v0
.end method

.method public initDefaults()V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    invoke-virtual {v0}, Lorg/snmp4j/security/SecurityProtocols;->addDefaultProtocols()Lorg/snmp4j/security/SecurityProtocols;

    return-void
.end method

.method public isProtocolVersionSupported(I)Z
    .locals 1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public prepareDataElements(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/MutablePDU;Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/mp/MutableStateReference;)I
    .locals 29

    move-object/from16 v10, p0

    move-object/from16 v1, p2

    move-object/from16 v0, p3

    move-object/from16 v2, p6

    move-object/from16 v6, p7

    move-object/from16 v3, p8

    move-object/from16 v4, p10

    move-object/from16 v5, p12

    move-object/from16 v7, p13

    const/16 v26, -0x580

    :try_start_0
    new-instance v8, Lorg/snmp4j/mp/StateReference;

    invoke-direct {v8}, Lorg/snmp4j/mp/StateReference;-><init>()V

    invoke-virtual/range {p13 .. p13}, Lorg/snmp4j/mp/MutableStateReference;->getStateReference()Lorg/snmp4j/mp/StateReference;

    move-result-object v9

    if-eqz v9, :cond_0

    invoke-virtual/range {p13 .. p13}, Lorg/snmp4j/mp/MutableStateReference;->getStateReference()Lorg/snmp4j/mp/StateReference;

    move-result-object v9

    invoke-virtual {v9}, Lorg/snmp4j/mp/StateReference;->getTransportMapping()Lorg/snmp4j/TransportMapping;

    move-result-object v9

    invoke-virtual {v8, v9}, Lorg/snmp4j/mp/StateReference;->setTransportMapping(Lorg/snmp4j/TransportMapping;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_15

    :cond_0
    :goto_0
    const/4 v9, 0x3

    move-object/from16 v11, p5

    invoke-virtual {v11, v9}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    const/16 v11, 0x10

    invoke-virtual {v0, v11}, Lorg/snmp4j/asn1/BERInputStream;->mark(I)V

    new-instance v11, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v11}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    invoke-static {v0, v11}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;)I

    move-result v12

    invoke-virtual {v11}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v11

    const/16 v13, 0x30

    if-eq v11, v13, :cond_1

    return v26

    :cond_1
    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v13

    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/asn1/BERInputStream;->reset()V

    invoke-virtual {v0, v12}, Lorg/snmp4j/asn1/BERInputStream;->mark(I)V

    invoke-virtual {v0, v13, v14}, Lorg/snmp4j/asn1/BERInputStream;->skip(J)J

    move-result-wide v11

    cmp-long v11, v11, v13

    if-eqz v11, :cond_2

    return v26

    :cond_2
    new-instance v11, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v11}, Lorg/snmp4j/smi/Integer32;-><init>()V

    invoke-virtual {v11, v0}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {v11}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v12

    if-ne v12, v9, :cond_26

    new-instance v15, Lorg/snmp4j/mp/MPv3$HeaderData;

    invoke-direct {v15}, Lorg/snmp4j/mp/MPv3$HeaderData;-><init>()V

    invoke-virtual {v15, v0}, Lorg/snmp4j/mp/MPv3$HeaderData;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {v15}, Lorg/snmp4j/mp/MPv3$HeaderData;->getSecurityModel()I

    move-result v12

    invoke-virtual {v2, v12}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    invoke-virtual {v15}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgID()I

    move-result v12

    invoke-virtual {v8, v12}, Lorg/snmp4j/mp/StateReference;->setMsgID(I)V

    invoke-virtual {v15}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgFlags()I

    move-result v12

    invoke-virtual {v8, v12}, Lorg/snmp4j/mp/StateReference;->setMsgFlags(I)V

    invoke-virtual {v8, v1}, Lorg/snmp4j/mp/StateReference;->setAddress(Lorg/snmp4j/smi/Address;)V

    invoke-virtual {v7, v8}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    iget-object v12, v15, Lorg/snmp4j/mp/MPv3$HeaderData;->msgMaxSize:Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v12}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v12

    sget v13, Lorg/snmp4j/mp/MPv3;->MAX_HEADER_LENGTH:I

    sub-int/2addr v12, v13

    move-object/from16 v14, p11

    invoke-virtual {v14, v12}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    iget-object v12, v10, Lorg/snmp4j/mp/MPv3;->incomingPDUFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-interface {v12, v10}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;

    move-result-object v12

    check-cast v12, Lorg/snmp4j/ScopedPDU;

    move-object/from16 v9, p9

    invoke-virtual {v9, v12}, Lorg/snmp4j/MutablePDU;->setPdu(Lorg/snmp4j/PDU;)V

    iget-object v9, v10, Lorg/snmp4j/mp/MPv3;->securityModels:Lorg/snmp4j/security/SecurityModels;

    invoke-virtual {v9, v2}, Lorg/snmp4j/security/SecurityModels;->getSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;

    move-result-object v9

    if-nez v9, :cond_3

    sget-object v0, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RFC3412 \u00a77.2.4 - Unsupported security model: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpUnknownSecurityModels:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v10, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v10, v0}, Lorg/snmp4j/mp/MPv3;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    const/16 v0, -0x57a

    return v0

    :cond_3
    invoke-virtual {v15}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgFlags()I

    move-result v2

    move-object/from16 p5, v12

    const/4 v12, 0x3

    and-int/2addr v2, v12

    const/4 v12, 0x1

    if-eqz v2, :cond_6

    if-eq v2, v12, :cond_5

    const/4 v14, 0x3

    if-eq v2, v14, :cond_4

    invoke-virtual {v3, v12}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    sget-object v0, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "RFC3412 \u00a77.2.5 - Invalid message (illegal msgFlags)"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpInvalidMsgs:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v10, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v10, v0}, Lorg/snmp4j/mp/MPv3;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    const/16 v0, -0x57d

    return v0

    :cond_4
    move v2, v14

    invoke-virtual {v3, v2}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    goto :goto_1

    :cond_5
    const/4 v2, 0x2

    invoke-virtual {v3, v2}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    goto :goto_1

    :cond_6
    invoke-virtual {v3, v12}, Lorg/snmp4j/smi/Integer32;->setValue(I)V

    :goto_1
    invoke-virtual {v5, v3}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    move v2, v13

    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v12

    long-to-int v12, v12

    invoke-interface {v9}, Lorg/snmp4j/security/SecurityModel;->newSecurityParametersInstance()Lorg/snmp4j/security/SecurityParameters;

    move-result-object v14

    invoke-interface {v14, v0}, Lorg/snmp4j/asn1/BERSerializable;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-interface {v14, v12}, Lorg/snmp4j/security/SecurityParameters;->setSecurityParametersPosition(I)V

    invoke-virtual {v15}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgFlags()I

    move-result v12

    and-int/lit8 v12, v12, 0x4

    const/4 v13, 0x0

    if-lez v12, :cond_7

    const/16 v25, 0x1

    goto :goto_2

    :cond_7
    move/from16 v25, v13

    :goto_2
    new-instance v12, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v12}, Lorg/snmp4j/smi/OctetString;-><init>()V

    invoke-interface {v9}, Lorg/snmp4j/security/SecurityModel;->newSecurityStateReference()Lorg/snmp4j/security/SecurityStateReference;

    move-result-object v7

    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/asn1/BERInputStream;->reset()V

    new-instance v27, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-direct/range {v27 .. v27}, Lorg/snmp4j/asn1/BEROutputStream;-><init>()V

    invoke-virtual {v11}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v16

    invoke-virtual {v15}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgMaxSize()I

    move-result v11

    sub-int v2, v11, v2

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v17

    move-object v11, v9

    move-object/from16 v0, p5

    move-object/from16 p5, v12

    move/from16 v12, v16

    move v6, v13

    move v13, v2

    move-object v2, v15

    move-object v15, v9

    move/from16 v16, v17

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    move-object/from16 v19, p5

    move-object/from16 v20, p7

    move-object/from16 v21, v27

    move-object/from16 v22, p11

    move-object/from16 v23, v7

    move-object/from16 v24, p12

    invoke-interface/range {v11 .. v24}, Lorg/snmp4j/security/SecurityModel;->processIncomingMsg(IILorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/security/SecurityModel;ILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/mp/StatusInformation;)I

    move-result v11

    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/asn1/BERInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v12, -0x58

    const/16 v13, -0x5e

    if-nez v11, :cond_c

    :try_start_1
    new-instance v14, Lorg/snmp4j/asn1/BERInputStream;

    invoke-virtual/range {v27 .. v27}, Lorg/snmp4j/asn1/BEROutputStream;->rewind()Ljava/nio/ByteBuffer;

    move-result-object v15

    invoke-direct {v14, v15}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, v14}, Lorg/snmp4j/ScopedPDU;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object v14

    invoke-virtual {v14}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v14

    invoke-virtual {v4, v14}, Lorg/snmp4j/mp/PduHandle;->setTransactionID(I)V

    invoke-virtual/range {p5 .. p5}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v14

    if-lez v14, :cond_8

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->isResponsePdu()Z

    move-result v14

    if-eqz v14, :cond_8

    move-object/from16 v14, p5

    invoke-virtual {v10, v1, v14}, Lorg/snmp4j/mp/MPv3;->addEngineID(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_5

    :cond_8
    move-object/from16 v14, p5

    :goto_3
    :try_start_2
    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v15

    if-eqz v15, :cond_9

    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v15

    invoke-virtual {v15}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v15

    if-nez v15, :cond_a

    :cond_9
    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v15

    if-eq v15, v13, :cond_a

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v15

    if-eq v15, v12, :cond_a

    new-instance v11, Lorg/snmp4j/event/CounterEvent;

    sget-object v15, Lorg/snmp4j/mp/SnmpConstants;->snmpUnknownPDUHandlers:Lorg/snmp4j/smi/OID;

    invoke-direct {v11, v10, v15}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v10, v11}, Lorg/snmp4j/mp/MPv3;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance v15, Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v11}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v12

    invoke-virtual {v11}, Lorg/snmp4j/event/CounterEvent;->getCurrentValue()Lorg/snmp4j/smi/Variable;

    move-result-object v11

    invoke-direct {v15, v12, v11}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v5, v15}, Lorg/snmp4j/mp/StatusInformation;->setErrorIndication(Lorg/snmp4j/smi/VariableBinding;)V

    const/16 v11, -0x587

    :cond_a
    :goto_4
    move/from16 v28, v11

    goto :goto_6

    :goto_5
    sget-object v1, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ASN.1 parse error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_b
    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpInASNParseErrs:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, v10, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v10, v0}, Lorg/snmp4j/mp/MPv3;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    return v26

    :cond_c
    move-object/from16 v14, p5

    goto :goto_4

    :goto_6
    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v11

    invoke-virtual {v8, v11}, Lorg/snmp4j/mp/StateReference;->setSecurityName([B)V

    invoke-virtual {v14}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v11

    invoke-virtual {v8, v11}, Lorg/snmp4j/mp/StateReference;->setSecurityEngineID([B)V

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v11

    invoke-virtual {v8, v11}, Lorg/snmp4j/mp/StateReference;->setSecurityLevel(I)V

    invoke-virtual {v8, v9}, Lorg/snmp4j/mp/StateReference;->setSecurityModel(Lorg/snmp4j/security/SecurityModel;)V

    invoke-virtual {v8, v7}, Lorg/snmp4j/mp/StateReference;->setSecurityStateReference(Lorg/snmp4j/security/SecurityStateReference;)V

    invoke-virtual {v8, v4}, Lorg/snmp4j/mp/StateReference;->setPduHandle(Lorg/snmp4j/mp/PduHandle;)V

    const/4 v12, 0x0

    if-eqz v28, :cond_11

    if-eqz v25, :cond_10

    invoke-virtual/range {p12 .. p12}, Lorg/snmp4j/mp/StatusInformation;->getErrorIndication()Lorg/snmp4j/smi/VariableBinding;

    move-result-object v11
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v11, :cond_10

    :try_start_3
    invoke-virtual/range {v27 .. v27}, Lorg/snmp4j/asn1/BEROutputStream;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v11

    if-eqz v11, :cond_d

    new-instance v11, Lorg/snmp4j/asn1/BERInputStream;

    invoke-virtual/range {v27 .. v27}, Lorg/snmp4j/asn1/BEROutputStream;->rewind()Ljava/nio/ByteBuffer;

    move-result-object v13

    invoke-direct {v11, v13}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, v11}, Lorg/snmp4j/ScopedPDU;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    move-object v12, v0

    goto :goto_7

    :catch_2
    move-exception v0

    goto :goto_8

    :cond_d
    :goto_7
    move-object v0, v12

    goto :goto_9

    :goto_8
    :try_start_4
    sget-object v11, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v11, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    goto :goto_7

    :goto_9
    new-instance v15, Lorg/snmp4j/mp/StateReference;

    invoke-virtual {v2}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgID()I

    move-result v12

    invoke-virtual {v2}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgFlags()I

    move-result v13

    invoke-virtual/range {p11 .. p11}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v2

    invoke-virtual {v14}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v18

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v20

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v21

    if-nez v0, :cond_e

    new-array v3, v6, [B

    :goto_a
    move-object/from16 v22, v3

    goto :goto_b

    :cond_e
    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v3

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v3

    goto :goto_a

    :goto_b
    if-nez v0, :cond_f

    new-array v3, v6, [B

    :goto_c
    move-object/from16 v23, v3

    goto :goto_d

    :cond_f
    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextName()Lorg/snmp4j/smi/OctetString;

    move-result-object v3

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v3

    goto :goto_c

    :goto_d
    const/16 v17, 0x0

    move-object v11, v15

    move v14, v2

    move-object v2, v15

    move-object/from16 v15, p10

    move-object/from16 v16, p2

    move-object/from16 v19, v9

    move-object/from16 v24, v7

    move/from16 v25, v28

    invoke-direct/range {v11 .. v25}, Lorg/snmp4j/mp/StateReference;-><init>(IIILorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;[BLorg/snmp4j/security/SecurityModel;[BI[B[BLorg/snmp4j/security/SecurityStateReference;I)V

    iget-object v1, v10, Lorg/snmp4j/mp/MPv3;->cache:Lorg/snmp4j/mp/MPv3$Cache;

    invoke-virtual {v1, v2}, Lorg/snmp4j/mp/MPv3$Cache;->addEntry(Lorg/snmp4j/mp/StateReference;)I

    invoke-virtual/range {p12 .. p12}, Lorg/snmp4j/mp/StatusInformation;->getSecurityLevel()Lorg/snmp4j/smi/Integer32;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v4

    invoke-interface {v9}, Lorg/snmp4j/security/SecurityModel;->getID()I

    move-result v6

    invoke-virtual/range {p11 .. p11}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v7

    invoke-virtual/range {p12 .. p12}, Lorg/snmp4j/mp/StatusInformation;->getErrorIndication()Lorg/snmp4j/smi/VariableBinding;

    move-result-object v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v0

    move v5, v6

    move-object/from16 v6, p7

    invoke-virtual/range {v1 .. v9}, Lorg/snmp4j/mp/MPv3;->sendReport(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/ScopedPDU;IILorg/snmp4j/smi/OctetString;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/smi/VariableBinding;)I

    move-result v0

    if-eqz v0, :cond_10

    sget-object v1, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Sending report failed with error code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :cond_10
    return v28

    :cond_11
    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    invoke-virtual {v8, v1}, Lorg/snmp4j/mp/StateReference;->setContextEngineID([B)V

    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextName()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v1

    invoke-virtual {v8, v1}, Lorg/snmp4j/mp/StateReference;->setContextName([B)V

    invoke-virtual/range {p11 .. p11}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v1

    invoke-virtual {v8, v1}, Lorg/snmp4j/mp/StateReference;->setMaxSizeResponseScopedPDU(I)V

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v1

    if-eq v1, v13, :cond_13

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v1

    const/16 v7, -0x58

    if-ne v1, v7, :cond_12

    goto :goto_e

    :cond_12
    sget-object v1, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RFC3412 \u00a77.2.10 - Received PDU is NOT a response or internal class message -> unchanged PduHandle = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    move v5, v6

    move-object/from16 v6, p13

    goto/16 :goto_13

    :cond_13
    :goto_e
    iget-object v1, v10, Lorg/snmp4j/mp/MPv3;->cache:Lorg/snmp4j/mp/MPv3$Cache;

    invoke-virtual {v2}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgID()I

    move-result v7

    invoke-static {v7}, Lorg/snmp4j/mp/StateReference;->createMessageID(I)Lorg/snmp4j/mp/MessageID;

    move-result-object v7

    invoke-virtual {v1, v7}, Lorg/snmp4j/mp/MPv3$Cache;->popEntry(Lorg/snmp4j/mp/MessageID;)Lorg/snmp4j/mp/StateReference;

    move-result-object v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    const-string v7, "RFC3412 \u00a77.2.10 - Received PDU (msgID="

    if-eqz v1, :cond_24

    :try_start_5
    sget-object v11, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v11}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v15

    if-eqz v15, :cond_14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgID()I

    move-result v2

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") is a response or an internal class message. PduHandle.transactionID = "

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v2

    invoke-virtual {v2}, Lorg/snmp4j/mp/PduHandle;->getTransactionID()I

    move-result v2

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v11, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_14
    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v2

    invoke-virtual {v4, v2}, Lorg/snmp4j/mp/PduHandle;->copyFrom(Lorg/snmp4j/mp/PduHandle;)V

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    const/16 v4, -0x582

    const-string v7, "MPv3 finished"

    const/16 v15, -0x58

    if-ne v2, v15, :cond_1a

    :try_start_6
    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v2

    invoke-virtual {v5, v2}, Lorg/snmp4j/mp/StatusInformation;->setContextEngineID([B)V

    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextName()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lorg/snmp4j/mp/StatusInformation;->setContextName([B)V

    invoke-virtual {v5, v3}, Lorg/snmp4j/mp/StatusInformation;->setSecurityLevel(Lorg/snmp4j/smi/Integer32;)V

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityEngineID()[B

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_16

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityEngineID()[B

    move-result-object v0

    invoke-virtual {v14, v0}, Lorg/snmp4j/smi/OctetString;->equalsValue([B)Z

    move-result v0

    if-eqz v0, :cond_15

    goto :goto_10

    :cond_15
    move-object/from16 v2, p7

    :goto_f
    move-object/from16 v6, p13

    goto :goto_11

    :cond_16
    :goto_10
    invoke-interface {v9}, Lorg/snmp4j/security/SecurityModel;->getID()I

    move-result v0

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityModel()Lorg/snmp4j/security/SecurityModel;

    move-result-object v2

    invoke-interface {v2}, Lorg/snmp4j/security/SecurityModel;->getID()I

    move-result v2

    if-ne v0, v2, :cond_15

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityName()[B

    move-result-object v0

    move-object/from16 v2, p7

    move v5, v6

    invoke-virtual {v2, v0}, Lorg/snmp4j/smi/OctetString;->equalsValue([B)Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_f

    :cond_17
    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v0

    invoke-virtual {v10, v0, v14}, Lorg/snmp4j/mp/MPv3;->addEngineID(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)Z

    move-result v0

    if-nez v0, :cond_18

    invoke-interface {v11}, Lorg/snmp4j/log/LogAdapter;->isWarnEnabled()Z

    move-result v0

    if-eqz v0, :cond_18

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Engine ID \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' could not be added to engine ID cache for target address \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' because engine ID matches local engine ID or cache size limit is reached"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v11, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :cond_18
    move-object/from16 v6, p13

    invoke-virtual {v6, v12}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    invoke-interface {v11, v7}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    return v5

    :goto_11
    invoke-interface {v11}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_19

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RFC 3412 \u00a77.2.11 - Received report message does not match sent message. Cache entry is: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", received secName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",secModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",secEngineID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v11, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_19
    invoke-virtual {v6, v12}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    return v4

    :cond_1a
    move-object/from16 v2, p7

    move v5, v6

    move-object/from16 v6, p13

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v15

    if-ne v15, v13, :cond_1f

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityEngineID()[B

    move-result-object v8

    invoke-virtual {v14, v8}, Lorg/snmp4j/smi/OctetString;->equalsValue([B)Z

    move-result v8

    if-nez v8, :cond_1b

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityEngineID()[B

    move-result-object v8

    array-length v8, v8

    if-nez v8, :cond_1e

    :cond_1b
    invoke-interface {v9}, Lorg/snmp4j/security/SecurityModel;->getID()I

    move-result v8

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityModel()Lorg/snmp4j/security/SecurityModel;

    move-result-object v9

    invoke-interface {v9}, Lorg/snmp4j/security/SecurityModel;->getID()I

    move-result v9

    if-ne v8, v9, :cond_1e

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityName()[B

    move-result-object v8

    invoke-virtual {v2, v8}, Lorg/snmp4j/smi/OctetString;->equalsValue([B)Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v2

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getSecurityLevel()I

    move-result v3

    if-ne v2, v3, :cond_1e

    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getContextEngineID()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/OctetString;->equalsValue([B)Z

    move-result v2

    if-nez v2, :cond_1c

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getContextEngineID()[B

    move-result-object v2

    array-length v2, v2

    if-nez v2, :cond_1e

    :cond_1c
    invoke-virtual {v0}, Lorg/snmp4j/ScopedPDU;->getContextName()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getContextName()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/snmp4j/smi/OctetString;->equalsValue([B)Z

    move-result v0

    if-nez v0, :cond_1d

    invoke-virtual {v1}, Lorg/snmp4j/mp/StateReference;->getContextName()[B

    move-result-object v0

    array-length v0, v0

    if-eqz v0, :cond_1d

    goto :goto_12

    :cond_1d
    invoke-virtual {v6, v12}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    invoke-interface {v11, v7}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    return v5

    :cond_1e
    :goto_12
    const-string v0, "RFC 3412 \u00a77.2.12.b - Received response message does not match sent message"

    invoke-interface {v11, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-virtual {v6, v12}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    return v4

    :cond_1f
    :goto_13
    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const/16 v0, -0x578

    return v0

    :pswitch_1
    invoke-virtual {v6, v12}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    return v5

    :pswitch_2
    invoke-virtual {v14}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v0

    if-nez v0, :cond_20

    sget-object v0, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "Received confirmed message with 0 length security engine ID"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_14

    :cond_20
    iget-object v0, v10, Lorg/snmp4j/mp/MPv3;->localEngineID:[B

    invoke-virtual {v14, v0}, Lorg/snmp4j/smi/OctetString;->equalsValue([B)Z

    move-result v0

    if-nez v0, :cond_22

    sget-object v0, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_21

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RFC3412 \u00a77.2.13.a - Security engine ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " does not match local engine ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    iget-object v3, v10, Lorg/snmp4j/mp/MPv3;->localEngineID:[B

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_21
    invoke-virtual {v6, v12}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    const/16 v0, -0x57e

    return v0

    :cond_22
    :goto_14
    iget-object v0, v10, Lorg/snmp4j/mp/MPv3;->cache:Lorg/snmp4j/mp/MPv3$Cache;

    invoke-virtual {v0, v8}, Lorg/snmp4j/mp/MPv3$Cache;->addEntry(Lorg/snmp4j/mp/StateReference;)I

    move-result v0

    const/16 v1, -0x57c

    if-ne v0, v1, :cond_23

    invoke-virtual {v6, v12}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    :cond_23
    return v5

    :cond_24
    sget-object v0, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_25

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/snmp4j/mp/MPv3$HeaderData;->getMsgID()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") is a response or internal class message, but cached information for the msgID could not be found"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_25
    const/16 v0, -0x581

    return v0

    :cond_26
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Internal error unexpected SNMP version read"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :goto_15
    sget-object v1, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MPv3 parse error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_27
    return v26

    nop

    :pswitch_data_0
    .packed-switch -0x60
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public prepareOutgoingMessage(Lorg/snmp4j/smi/Address;III[BILorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v1, p4

    move-object/from16 v2, p7

    instance-of v3, v2, Lorg/snmp4j/ScopedPDU;

    if-eqz v3, :cond_11

    move-object v3, v2

    check-cast v3, Lorg/snmp4j/ScopedPDU;

    iget-object v4, v0, Lorg/snmp4j/mp/MPv3;->securityModels:Lorg/snmp4j/security/SecurityModels;

    new-instance v5, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v5, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v4, v5}, Lorg/snmp4j/security/SecurityModels;->getSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;

    move-result-object v19

    if-nez v19, :cond_0

    const/16 v1, -0x57a

    return v1

    :cond_0
    invoke-interface/range {v19 .. v19}, Lorg/snmp4j/security/SecurityModel;->hasAuthoritativeEngineID()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    iget-object v4, v0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/snmp4j/smi/OctetString;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v7

    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v8

    invoke-virtual {v8}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v8

    if-nez v8, :cond_6

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/PDU;->getType()I

    move-result v8

    const/16 v9, -0x5a

    if-eq v8, v9, :cond_2

    const/16 v9, -0x59

    if-eq v8, v9, :cond_2

    sget-object v8, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v8}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v9

    if-eqz v9, :cond_1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Context engine ID of scoped PDU is empty! Setting it to authoritative engine ID: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v8, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4, v7}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v3, v4}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    goto :goto_0

    :cond_2
    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/mp/MPv3;->getLocalEngineID()[B

    move-result-object v8

    invoke-direct {v4, v8}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    sget-object v8, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v8}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v9

    if-eqz v9, :cond_3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Context engine ID of scoped PDU is empty! Setting it to local engine ID: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_3
    invoke-virtual {v3, v4}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    goto :goto_0

    :cond_4
    new-array v7, v5, [B

    goto :goto_0

    :cond_5
    new-array v7, v5, [B

    :cond_6
    :goto_0
    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/PDU;->isConfirmedPdu()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_a

    array-length v2, v7

    if-nez v2, :cond_c

    invoke-interface/range {v19 .. v19}, Lorg/snmp4j/security/SecurityModel;->supportsEngineIdDiscovery()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->clone()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lorg/snmp4j/ScopedPDU;

    invoke-virtual {v3}, Lorg/snmp4j/PDU;->clear()V

    move v2, v4

    goto :goto_3

    :cond_7
    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    if-nez v2, :cond_8

    goto :goto_1

    :cond_8
    sget-object v2, Lorg/snmp4j/mp/MPv3;->LOCAL_ENGINE_ID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v8

    invoke-virtual {v2, v8}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual/range {p0 .. p1}, Lorg/snmp4j/mp/MPv3;->getEngineID(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    if-nez v2, :cond_c

    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v0, v6, v2}, Lorg/snmp4j/mp/MPv3;->addEngineID(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)Z

    goto :goto_2

    :cond_9
    :goto_1
    sget-object v2, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v8, "ScopedPDU with empty context engine ID"

    invoke-interface {v2, v8}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    goto :goto_2

    :cond_a
    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result v2

    if-nez v2, :cond_c

    sget-object v2, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v8

    if-eqz v8, :cond_b

    const-string v8, "Context engine ID of unconfirmed scoped PDU is empty! Setting it to local engine ID"

    invoke-interface {v2, v8}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_b
    new-instance v2, Lorg/snmp4j/smi/OctetString;

    iget-object v8, v0, Lorg/snmp4j/mp/MPv3;->localEngineID:[B

    invoke-direct {v2, v8}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v3, v2}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    :cond_c
    :goto_2
    move/from16 v2, p6

    :goto_3
    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getBERLength()I

    move-result v8

    new-instance v9, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-direct {v9, v8}, Lorg/snmp4j/asn1/BEROutputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v3, v9}, Lorg/snmp4j/ScopedPDU;->encodeBER(Ljava/io/OutputStream;)V

    new-instance v8, Lorg/snmp4j/mp/MPv3$HeaderData;

    invoke-direct {v8}, Lorg/snmp4j/mp/MPv3$HeaderData;-><init>()V

    if-eq v2, v4, :cond_e

    const/4 v10, 0x2

    if-eq v2, v10, :cond_d

    const/4 v4, 0x3

    if-eq v2, v4, :cond_d

    goto :goto_4

    :cond_d
    move v5, v4

    :cond_e
    :goto_4
    invoke-virtual {v3}, Lorg/snmp4j/PDU;->isConfirmedPdu()Z

    move-result v4

    if-eqz v4, :cond_f

    or-int/lit8 v4, v5, 0x4

    move-object/from16 v20, v7

    goto :goto_5

    :cond_f
    iget-object v4, v0, Lorg/snmp4j/mp/MPv3;->localEngineID:[B

    move-object/from16 v20, v4

    move v4, v5

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/mp/MPv3;->getNextMessageID()I

    move-result v5

    invoke-virtual {v8, v4}, Lorg/snmp4j/mp/MPv3$HeaderData;->setMsgFlags(I)V

    invoke-virtual {v8, v5}, Lorg/snmp4j/mp/MPv3$HeaderData;->setMsgID(I)V

    move/from16 v15, p2

    invoke-virtual {v8, v15}, Lorg/snmp4j/mp/MPv3$HeaderData;->setMsgMaxSize(I)V

    invoke-virtual {v8, v1}, Lorg/snmp4j/mp/MPv3$HeaderData;->setSecurityModel(I)V

    invoke-virtual {v8}, Lorg/snmp4j/mp/MPv3$HeaderData;->getBERLength()I

    move-result v7

    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    new-instance v10, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-direct {v10, v7}, Lorg/snmp4j/asn1/BEROutputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v8, v10}, Lorg/snmp4j/mp/MPv3$HeaderData;->encodeBER(Ljava/io/OutputStream;)V

    new-instance v14, Lorg/snmp4j/asn1/BERInputStream;

    invoke-virtual {v9}, Lorg/snmp4j/asn1/BEROutputStream;->rewind()Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-direct {v14, v8}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-interface/range {v19 .. v19}, Lorg/snmp4j/security/SecurityModel;->newSecurityParametersInstance()Lorg/snmp4j/security/SecurityParameters;

    move-result-object v16

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    move-object/from16 v7, v19

    move/from16 v8, p3

    move/from16 v10, p2

    move/from16 v11, p4

    move-object/from16 v12, v20

    move-object/from16 v13, p5

    move-object v1, v14

    move v14, v2

    move-object v15, v1

    move-object/from16 v17, p11

    move-object/from16 v18, p12

    invoke-interface/range {v7 .. v18}, Lorg/snmp4j/security/SecurityModel;->generateRequestMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I

    move-result v16

    if-nez v16, :cond_10

    if-eqz p8, :cond_10

    iget-object v15, v0, Lorg/snmp4j/mp/MPv3;->cache:Lorg/snmp4j/mp/MPv3$Cache;

    new-instance v14, Lorg/snmp4j/mp/StateReference;

    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v12

    invoke-virtual {v3}, Lorg/snmp4j/ScopedPDU;->getContextName()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v13

    const/16 v17, 0x0

    const/4 v7, 0x0

    move-object v1, v14

    move v11, v2

    move v2, v5

    move v3, v4

    move/from16 v4, p2

    move-object/from16 v5, p9

    move-object/from16 v6, p1

    move-object/from16 v8, v20

    move-object/from16 v9, v19

    move-object/from16 v10, p5

    move-object/from16 v21, v14

    move-object/from16 v14, v17

    move-object v0, v15

    move/from16 v15, v16

    invoke-direct/range {v1 .. v15}, Lorg/snmp4j/mp/StateReference;-><init>(IIILorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;[BLorg/snmp4j/security/SecurityModel;[BI[B[BLorg/snmp4j/security/SecurityStateReference;I)V

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/MPv3$Cache;->addEntry(Lorg/snmp4j/mp/StateReference;)I

    :cond_10
    return v16

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MPv3 only accepts ScopedPDU instances as pdu parameter"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public prepareResponseMessage(III[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/asn1/BEROutputStream;)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p0

    move/from16 v5, p3

    move/from16 v8, p5

    move-object/from16 v1, p6

    iget-object v2, v0, Lorg/snmp4j/mp/MPv3;->cache:Lorg/snmp4j/mp/MPv3$Cache;

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/mp/StateReference;->getMsgID()Lorg/snmp4j/mp/MessageID;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/snmp4j/mp/MPv3$Cache;->popEntry(Lorg/snmp4j/mp/MessageID;)Lorg/snmp4j/mp/StateReference;

    move-result-object v2

    if-nez v2, :cond_0

    const/16 v1, -0x581

    return v1

    :cond_0
    invoke-virtual/range {p6 .. p6}, Lorg/snmp4j/PDU;->getBERLength()I

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x1

    move/from16 v7, p7

    if-le v3, v7, :cond_1

    new-instance v3, Lorg/snmp4j/ScopedPDU;

    move-object v7, v1

    check-cast v7, Lorg/snmp4j/ScopedPDU;

    invoke-direct {v3, v7}, Lorg/snmp4j/ScopedPDU;-><init>(Lorg/snmp4j/ScopedPDU;)V

    invoke-virtual {v3}, Lorg/snmp4j/PDU;->clear()V

    invoke-virtual/range {p6 .. p6}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object v7

    invoke-virtual {v3, v7}, Lorg/snmp4j/PDU;->setRequestID(Lorg/snmp4j/smi/Integer32;)V

    invoke-virtual {v3, v6}, Lorg/snmp4j/PDU;->setErrorStatus(I)V

    invoke-virtual {v3, v4}, Lorg/snmp4j/PDU;->setErrorIndex(I)V

    invoke-virtual {v3}, Lorg/snmp4j/PDU;->getBERLength()I

    move-result v7

    new-instance v9, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-direct {v9, v7}, Lorg/snmp4j/asn1/BEROutputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v3, v9}, Lorg/snmp4j/PDU;->encodeBER(Ljava/io/OutputStream;)V

    goto :goto_0

    :cond_1
    new-instance v9, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-direct {v9, v3}, Lorg/snmp4j/asn1/BEROutputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v1, v9}, Lorg/snmp4j/PDU;->encodeBER(Ljava/io/OutputStream;)V

    :goto_0
    new-instance v3, Lorg/snmp4j/mp/MPv3$HeaderData;

    invoke-direct {v3}, Lorg/snmp4j/mp/MPv3$HeaderData;-><init>()V

    if-eq v8, v6, :cond_3

    const/4 v7, 0x2

    if-eq v8, v7, :cond_2

    const/4 v6, 0x3

    if-eq v8, v6, :cond_2

    goto :goto_1

    :cond_2
    move v4, v6

    :cond_3
    :goto_1
    invoke-virtual {v3, v4}, Lorg/snmp4j/mp/MPv3$HeaderData;->setMsgFlags(I)V

    invoke-virtual/range {p8 .. p8}, Lorg/snmp4j/mp/StateReference;->getMsgID()Lorg/snmp4j/mp/MessageID;

    move-result-object v4

    invoke-interface {v4}, Lorg/snmp4j/mp/MessageID;->getID()I

    move-result v4

    invoke-virtual {v3, v4}, Lorg/snmp4j/mp/MPv3$HeaderData;->setMsgID(I)V

    move v4, p2

    invoke-virtual {v3, p2}, Lorg/snmp4j/mp/MPv3$HeaderData;->setMsgMaxSize(I)V

    invoke-virtual {v3, v5}, Lorg/snmp4j/mp/MPv3$HeaderData;->setSecurityModel(I)V

    invoke-virtual {v3}, Lorg/snmp4j/mp/MPv3$HeaderData;->getBERLength()I

    move-result v6

    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    new-instance v7, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-direct {v7, v6}, Lorg/snmp4j/asn1/BEROutputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v3, v7}, Lorg/snmp4j/mp/MPv3$HeaderData;->encodeBER(Ljava/io/OutputStream;)V

    invoke-virtual/range {p6 .. p6}, Lorg/snmp4j/PDU;->getType()I

    move-result v1

    const/16 v3, -0x5e

    if-eq v1, v3, :cond_4

    const/16 v3, -0x5c

    if-eq v1, v3, :cond_4

    const/16 v3, -0x59

    if-eq v1, v3, :cond_4

    const/16 v3, -0x58

    if-eq v1, v3, :cond_4

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v2}, Lorg/snmp4j/mp/StateReference;->getSecurityEngineID()[B

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    goto :goto_2

    :cond_4
    new-instance v1, Lorg/snmp4j/smi/OctetString;

    iget-object v3, v0, Lorg/snmp4j/mp/MPv3;->localEngineID:[B

    invoke-direct {v1, v3}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    :goto_2
    new-instance v10, Lorg/snmp4j/asn1/BERInputStream;

    invoke-virtual {v9}, Lorg/snmp4j/asn1/BEROutputStream;->rewind()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-direct {v10, v3}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    iget-object v3, v0, Lorg/snmp4j/mp/MPv3;->securityModels:Lorg/snmp4j/security/SecurityModels;

    new-instance v7, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v7, v5}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v3, v7}, Lorg/snmp4j/security/SecurityModels;->getSecurityModel(Lorg/snmp4j/smi/Integer32;)Lorg/snmp4j/security/SecurityModel;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/security/SecurityModel;->newSecurityParametersInstance()Lorg/snmp4j/security/SecurityParameters;

    move-result-object v11

    invoke-virtual {p0}, Lorg/snmp4j/mp/MPv3;->getID()I

    move-result v7

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v6

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v9

    invoke-virtual {v2}, Lorg/snmp4j/mp/StateReference;->getSecurityStateReference()Lorg/snmp4j/security/SecurityStateReference;

    move-result-object v12

    move-object v1, v3

    move v2, v7

    move-object v3, v6

    move v4, p2

    move/from16 v5, p3

    move-object v6, v9

    move-object/from16 v7, p4

    move/from16 v8, p5

    move-object v9, v10

    move-object v10, v12

    move-object/from16 v12, p10

    invoke-interface/range {v1 .. v12}, Lorg/snmp4j/security/SecurityModel;->generateResponseMessage(I[BII[B[BILorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/security/SecurityStateReference;Lorg/snmp4j/security/SecurityParameters;Lorg/snmp4j/asn1/BEROutputStream;)I

    move-result v1

    return v1
.end method

.method public releaseStateReference(Lorg/snmp4j/mp/PduHandle;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->cache:Lorg/snmp4j/mp/MPv3$Cache;

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/MPv3$Cache;->deleteEntry(Lorg/snmp4j/mp/PduHandle;)Z

    return-void
.end method

.method public removeEngineID(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/smi/OctetString;
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3;->snmpEngineListeners:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Lorg/snmp4j/event/SnmpEngineEvent;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2, v0, p1}, Lorg/snmp4j/event/SnmpEngineEvent;-><init>(Lorg/snmp4j/mp/MPv3;ILorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Address;)V

    invoke-virtual {p0, v1}, Lorg/snmp4j/mp/MPv3;->fireEngineChanged(Lorg/snmp4j/event/SnmpEngineEvent;)V

    :cond_0
    return-object v0
.end method

.method public declared-synchronized removeSnmpEngineListener(Lorg/snmp4j/event/SnmpEngineListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/MPv3;->snmpEngineListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iput-object v1, p0, Lorg/snmp4j/mp/MPv3;->snmpEngineListeners:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public sendReport(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/ScopedPDU;IILorg/snmp4j/smi/OctetString;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/smi/VariableBinding;)I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/MessageDispatcher;",
            "Lorg/snmp4j/ScopedPDU;",
            "II",
            "Lorg/snmp4j/smi/OctetString;",
            "I",
            "Lorg/snmp4j/mp/StateReference<",
            "*>;",
            "Lorg/snmp4j/smi/VariableBinding;",
            ")I"
        }
    .end annotation

    const-string v1, "Error while sending report: "

    new-instance v7, Lorg/snmp4j/ScopedPDU;

    invoke-direct {v7}, Lorg/snmp4j/ScopedPDU;-><init>()V

    const/16 v0, -0x58

    invoke-virtual {v7, v0}, Lorg/snmp4j/PDU;->setType(I)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v7, v0}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {p2}, Lorg/snmp4j/ScopedPDU;->getContextName()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v7, v0}, Lorg/snmp4j/ScopedPDU;->setContextName(Lorg/snmp4j/smi/OctetString;)V

    invoke-virtual {p2}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object v0

    invoke-virtual {v7, v0}, Lorg/snmp4j/PDU;->setRequestID(Lorg/snmp4j/smi/Integer32;)V

    :goto_0
    move-object/from16 v0, p8

    goto :goto_1

    :cond_0
    new-instance v0, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p0}, Lorg/snmp4j/mp/MPv3;->getLocalEngineID()[B

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v7, v0}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    goto :goto_0

    :goto_1
    invoke-virtual {v7, v0}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    new-instance v10, Lorg/snmp4j/mp/StatusInformation;

    invoke-direct {v10}, Lorg/snmp4j/mp/StatusInformation;-><init>()V

    const/16 v11, -0x578

    :try_start_0
    invoke-virtual {p0}, Lorg/snmp4j/mp/MPv3;->getID()I

    move-result v3

    invoke-virtual/range {p5 .. p5}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v5

    move-object v2, p1

    move/from16 v4, p4

    move v6, p3

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-interface/range {v2 .. v10}, Lorg/snmp4j/MessageDispatcher;->returnResponsePdu(II[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;)I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v2, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V
    :try_end_0
    .catch Lorg/snmp4j/MessageException; {:try_start_0 .. :try_end_0} :catch_0

    return v11

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    return v0

    :goto_2
    sget-object v2, Lorg/snmp4j/mp/MPv3;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return v11
.end method

.method public setCounterSupport(Lorg/snmp4j/mp/CounterSupport;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lorg/snmp4j/mp/MPv3;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-void
.end method

.method public setCurrentMsgID(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/mp/MPv3;->currentMsgID:I

    return-void
.end method

.method public setEngineIdCacheFactory(Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;)V
    .locals 1

    invoke-interface {p1, p0}, Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;->createEngineIdMap(Lorg/snmp4j/mp/EngineIdCacheSize;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3;->engineIDs:Ljava/util/Map;

    iput-object p1, p0, Lorg/snmp4j/mp/MPv3;->engineIdCacheFactory:Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;

    return-void
.end method

.method public setLocalEngineID([B)V
    .locals 2

    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    array-length v0, p1

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    iput-object p1, p0, Lorg/snmp4j/mp/MPv3;->localEngineID:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Illegal (local) engine ID"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMaxEngineIdCacheSize(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/mp/MPv3;->maxEngineIdCacheSize:I

    return-void
.end method

.method public setSecurityModels(Lorg/snmp4j/security/SecurityModels;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/MPv3;->securityModels:Lorg/snmp4j/security/SecurityModels;

    return-void
.end method

.method public setSecurityProtocols(Lorg/snmp4j/security/SecurityProtocols;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/MPv3;->securityProtocols:Lorg/snmp4j/security/SecurityProtocols;

    return-void
.end method
