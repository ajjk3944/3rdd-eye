.class public Lorg/snmp4j/security/UsmTimeTable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final TIME_PRECISION:J = 0x3b9aca00L

.field private static final logger:Lorg/snmp4j/log/LogAdapter;

.field private static final serialVersionUID:J = -0x1559374c184b1065L


# instance fields
.field private lastLocalTimeChange:J

.field private localTime:Lorg/snmp4j/security/UsmTimeEntry;

.field private table:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Lorg/snmp4j/smi/Variable;",
            "Lorg/snmp4j/security/UsmTimeEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/security/UsmTimeTable;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/security/UsmTimeTable;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/OctetString;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Hashtable;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->table:Ljava/util/Hashtable;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/snmp4j/security/UsmTimeTable;->lastLocalTimeChange:J

    new-instance v0, Lorg/snmp4j/security/UsmTimeEntry;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lorg/snmp4j/security/UsmTimeEntry;-><init>(Lorg/snmp4j/smi/OctetString;II)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/security/UsmTimeTable;->setLocalTime(Lorg/snmp4j/security/UsmTimeEntry;)V

    return-void
.end method


# virtual methods
.method public addEntry(Lorg/snmp4j/security/UsmTimeEntry;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->table:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public declared-synchronized checkEngineID(Lorg/snmp4j/smi/OctetString;ZII)I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->table:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    if-eqz p2, :cond_1

    :try_start_1
    new-instance p2, Lorg/snmp4j/security/UsmTimeEntry;

    invoke-direct {p2, p1, p3, p4}, Lorg/snmp4j/security/UsmTimeEntry;-><init>(Lorg/snmp4j/smi/OctetString;II)V

    invoke-virtual {p0, p2}, Lorg/snmp4j/security/UsmTimeTable;->addEntry(Lorg/snmp4j/security/UsmTimeEntry;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/16 p1, 0x582

    return p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized checkTime(Lorg/snmp4j/security/UsmTimeEntry;)I
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/32 v2, 0x3b9aca00

    div-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x583

    const/4 v3, 0x0

    const/16 v4, 0x96

    const v5, 0x7fffffff

    if-eqz v1, :cond_5

    iget-object v1, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v1

    if-eq v1, v5, :cond_2

    iget-object v1, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v1

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v5

    if-ne v1, v5, :cond_2

    iget-object v1, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getTimeDiff()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result v5

    sub-int/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le v1, v4, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lorg/snmp4j/security/UsmTimeTable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "CheckTime: time ok (authoritative)"

    invoke-interface {p1, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    :goto_0
    monitor-exit p0

    return v3

    :cond_2
    :goto_1
    :try_start_1
    sget-object v1, Lorg/snmp4j/security/UsmTimeTable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CheckTime: received message outside time window (authoritative):"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v4}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v4

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v5

    if-eq v4, v5, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "engineBoots differ "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v4}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "!="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v5}, Lorg/snmp4j/security/UsmTimeEntry;->getTimeDiff()I

    move-result v5

    add-int/2addr v0, v5

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " > 150"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    monitor-exit p0

    return v2

    :cond_5
    :try_start_2
    iget-object v1, p0, Lorg/snmp4j/security/UsmTimeTable;->table:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/security/UsmTimeEntry;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v1, :cond_6

    monitor-exit p0

    const/16 p1, 0x582

    return p1

    :cond_6
    :try_start_3
    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v6

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v7

    if-gt v6, v7, :cond_7

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v6

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v7

    if-ne v6, v7, :cond_8

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result v6

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result v7

    if-le v6, v7, :cond_8

    :cond_7
    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v6

    invoke-virtual {v1, v6}, Lorg/snmp4j/security/UsmTimeEntry;->setEngineBoots(I)V

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result v6

    invoke-virtual {v1, v6}, Lorg/snmp4j/security/UsmTimeEntry;->setLatestReceivedTime(I)V

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result v6

    sub-int/2addr v6, v0

    invoke-virtual {v1, v6}, Lorg/snmp4j/security/UsmTimeEntry;->setTimeDiff(I)V

    :cond_8
    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v0

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v6

    if-lt v0, v6, :cond_c

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v0

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v6

    if-ne v0, v6, :cond_9

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result v0

    invoke-virtual {p1}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result p1

    add-int/2addr p1, v4

    if-gt v0, p1, :cond_c

    :cond_9
    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result p1

    if-ne p1, v5, :cond_a

    goto :goto_3

    :cond_a
    sget-object p1, Lorg/snmp4j/security/UsmTimeTable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "CheckTime: time ok (non authoritative)"

    invoke-interface {p1, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_b
    monitor-exit p0

    return v3

    :cond_c
    :goto_3
    :try_start_4
    sget-object p1, Lorg/snmp4j/security/UsmTimeTable;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "CheckTime: received message outside time window (non authoritative)"

    invoke-interface {p1, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_d
    monitor-exit p0

    return v2

    :goto_4
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public getEngineBoots()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v0

    return v0
.end method

.method public getEngineTime()I
    .locals 4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Lorg/snmp4j/security/UsmTimeTable;->lastLocalTimeChange:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x3b9aca00

    div-long/2addr v0, v2

    iget-object v2, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v2}, Lorg/snmp4j/security/UsmTimeEntry;->getLatestReceivedTime()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide v2, 0x80000000L

    rem-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public getEntry(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmTimeEntry;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->table:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/security/UsmTimeEntry;

    return-object p1
.end method

.method public getLocalTime()Lorg/snmp4j/security/UsmTimeEntry;
    .locals 4

    new-instance v0, Lorg/snmp4j/security/UsmTimeEntry;

    iget-object v1, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v1}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    iget-object v2, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v2}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v2

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmTimeTable;->getEngineTime()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lorg/snmp4j/security/UsmTimeEntry;-><init>(Lorg/snmp4j/smi/OctetString;II)V

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmTimeEntry;->getTimeDiff()I

    move-result v1

    mul-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v2}, Lorg/snmp4j/security/UsmTimeEntry;->getTimeDiff()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lorg/snmp4j/security/UsmTimeEntry;->setTimeDiff(I)V

    return-object v0
.end method

.method public declared-synchronized getTime(Lorg/snmp4j/smi/OctetString;)Lorg/snmp4j/security/UsmTimeEntry;
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/snmp4j/smi/OctetString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/security/UsmTimeTable;->getLocalTime()Lorg/snmp4j/security/UsmTimeEntry;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->table:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/security/UsmTimeEntry;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_1
    :try_start_2
    new-instance v1, Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmTimeEntry;->getEngineBoots()I

    move-result v2

    invoke-virtual {v0}, Lorg/snmp4j/security/UsmTimeEntry;->getTimeDiff()I

    move-result v0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    const-wide/32 v5, 0x3b9aca00

    div-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v0, v3

    invoke-direct {v1, p1, v2, v0}, Lorg/snmp4j/security/UsmTimeEntry;-><init>(Lorg/snmp4j/smi/OctetString;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v1

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public removeEntry(Lorg/snmp4j/smi/OctetString;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->table:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public reset()V
    .locals 0

    return-void
.end method

.method public setEngineBoots(I)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-virtual {v0, p1}, Lorg/snmp4j/security/UsmTimeEntry;->setEngineBoots(I)V

    return-void
.end method

.method public setLocalTime(Lorg/snmp4j/security/UsmTimeEntry;)V
    .locals 2

    iput-object p1, p0, Lorg/snmp4j/security/UsmTimeTable;->localTime:Lorg/snmp4j/security/UsmTimeEntry;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/snmp4j/security/UsmTimeTable;->lastLocalTimeChange:J

    return-void
.end method
