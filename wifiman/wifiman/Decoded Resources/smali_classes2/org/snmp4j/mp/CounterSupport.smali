.class public Lorg/snmp4j/mp/CounterSupport;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static instance:Lorg/snmp4j/mp/CounterSupport;


# instance fields
.field private transient counterListeners:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lorg/snmp4j/event/CounterListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lorg/snmp4j/mp/CounterSupport;
    .locals 1

    sget-object v0, Lorg/snmp4j/mp/CounterSupport;->instance:Lorg/snmp4j/mp/CounterSupport;

    if-nez v0, :cond_0

    new-instance v0, Lorg/snmp4j/mp/CounterSupport;

    invoke-direct {v0}, Lorg/snmp4j/mp/CounterSupport;-><init>()V

    sput-object v0, Lorg/snmp4j/mp/CounterSupport;->instance:Lorg/snmp4j/mp/CounterSupport;

    :cond_0
    sget-object v0, Lorg/snmp4j/mp/CounterSupport;->instance:Lorg/snmp4j/mp/CounterSupport;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized addCounterListener(Lorg/snmp4j/event/CounterListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/CounterSupport;->counterListeners:Ljava/util/Vector;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Vector;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/mp/CounterSupport;->counterListeners:Ljava/util/Vector;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/mp/CounterSupport;->counterListeners:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/snmp4j/mp/CounterSupport;->counterListeners:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/mp/CounterSupport;->counterListeners:Ljava/util/Vector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/event/CounterListener;

    invoke-interface {v1, p1}, Lorg/snmp4j/event/CounterListener;->incrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public declared-synchronized removeCounterListener(Lorg/snmp4j/event/CounterListener;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/CounterSupport;->counterListeners:Ljava/util/Vector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/mp/CounterSupport;->counterListeners:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z
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
