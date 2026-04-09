.class public Lorg/snmp4j/mp/DefaultCounterListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/event/CounterListener;


# instance fields
.field private countRegisteredOnly:Z

.field private counters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/OID;",
            "Lorg/snmp4j/smi/Counter32;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/mp/DefaultCounterListener;->counters:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public declared-synchronized add(Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/Counter32;)Lorg/snmp4j/smi/Counter32;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/DefaultCounterListener;->counters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/Counter32;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v0

    invoke-virtual {p2}, Lorg/snmp4j/smi/UnsignedInteger32;->getValue()J

    move-result-wide v2

    add-long/2addr v2, v0

    invoke-virtual {p2, v2, v3}, Lorg/snmp4j/smi/UnsignedInteger32;->setValue(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/mp/DefaultCounterListener;->counters:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/Counter32;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized incrementCounter(Lorg/snmp4j/event/CounterEvent;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lorg/snmp4j/event/CounterEvent;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/mp/DefaultCounterListener;->counters:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/smi/Counter32;

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lorg/snmp4j/mp/DefaultCounterListener;->countRegisteredOnly:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v1, Lorg/snmp4j/smi/Counter32;

    invoke-virtual {p1}, Lorg/snmp4j/event/CounterEvent;->getIncrement()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lorg/snmp4j/smi/Counter32;-><init>(J)V

    iget-object v2, p0, Lorg/snmp4j/mp/DefaultCounterListener;->counters:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lorg/snmp4j/event/CounterEvent;->getIncrement()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lorg/snmp4j/smi/Counter32;->increment(J)J

    :goto_0
    invoke-virtual {v1}, Lorg/snmp4j/smi/Counter32;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/smi/Variable;

    invoke-virtual {p1, v0}, Lorg/snmp4j/event/CounterEvent;->setCurrentValue(Lorg/snmp4j/smi/Variable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public isCountRegisteredOnly()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/mp/DefaultCounterListener;->countRegisteredOnly:Z

    return v0
.end method

.method public declared-synchronized remove(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Counter32;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/DefaultCounterListener;->counters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/smi/Counter32;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setCountRegisteredOnly(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/mp/DefaultCounterListener;->countRegisteredOnly:Z

    return-void
.end method
