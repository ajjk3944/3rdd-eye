.class Lorg/snmp4j/security/Salt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static instance:Lorg/snmp4j/security/Salt;

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private salt:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/Salt;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/Salt;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method protected constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    :try_start_0
    const-string v1, "SHA1PRNG"

    invoke-static {v1}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v1, Lorg/snmp4j/security/Salt;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v2, "Could not use SecureRandom. Using Random instead."

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    :goto_0
    const/4 v1, 0x0

    aget-byte v2, v0, v1

    int-to-long v2, v2

    iput-wide v2, p0, Lorg/snmp4j/security/Salt;->salt:J

    :goto_1
    const/4 v2, 0x7

    if-ge v1, v2, :cond_0

    iget-wide v2, p0, Lorg/snmp4j/security/Salt;->salt:J

    const-wide/16 v4, 0x100

    mul-long/2addr v2, v4

    aget-byte v4, v0, v1

    int-to-long v4, v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x80

    add-long/2addr v2, v4

    iput-wide v2, p0, Lorg/snmp4j/security/Salt;->salt:J

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    sget-object v0, Lorg/snmp4j/security/Salt;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Initialized Salt to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lorg/snmp4j/security/Salt;->salt:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    return-void
.end method

.method public static getInstance()Lorg/snmp4j/security/Salt;
    .locals 1

    sget-object v0, Lorg/snmp4j/security/Salt;->instance:Lorg/snmp4j/security/Salt;

    if-nez v0, :cond_0

    new-instance v0, Lorg/snmp4j/security/Salt;

    invoke-direct {v0}, Lorg/snmp4j/security/Salt;-><init>()V

    sput-object v0, Lorg/snmp4j/security/Salt;->instance:Lorg/snmp4j/security/Salt;

    :cond_0
    sget-object v0, Lorg/snmp4j/security/Salt;->instance:Lorg/snmp4j/security/Salt;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized getNext()J
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lorg/snmp4j/security/Salt;->salt:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lorg/snmp4j/security/Salt;->salt:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
