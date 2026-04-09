.class public Lorg/snmp4j/util/ThreadPool;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/WorkerPool;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/util/ThreadPool$TaskManager;
    }
.end annotation


# static fields
.field private static final DEFAULT_TASK_MANAGER_BUSY_TIMEOUT_MILLIS:I = 0x14


# instance fields
.field protected name:Ljava/lang/String;

.field protected respawnThreads:Z

.field protected volatile stop:Z

.field protected taskManagers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/util/ThreadPool$TaskManager;",
            ">;"
        }
    .end annotation
.end field

.field protected taskManagersBusyTimeoutMillis:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ThreadPool"

    iput-object v0, p0, Lorg/snmp4j/util/ThreadPool;->name:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/snmp4j/util/ThreadPool;->stop:Z

    iput-boolean v0, p0, Lorg/snmp4j/util/ThreadPool;->respawnThreads:Z

    const/16 v0, 0x14

    iput v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagersBusyTimeoutMillis:I

    return-void
.end method

.method public static create(Ljava/lang/String;I)Lorg/snmp4j/util/ThreadPool;
    .locals 1

    new-instance v0, Lorg/snmp4j/util/ThreadPool;

    invoke-direct {v0}, Lorg/snmp4j/util/ThreadPool;-><init>()V

    invoke-virtual {v0, p0, p1}, Lorg/snmp4j/util/ThreadPool;->setup(Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/util/ThreadPool;->stop:Z

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/ThreadPool$TaskManager;

    invoke-virtual {v1}, Lorg/snmp4j/util/ThreadPool$TaskManager;->terminate()V

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public execute(Lorg/snmp4j/util/WorkerTask;)V
    .locals 3

    :goto_0
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/ThreadPool$TaskManager;

    iget-boolean v2, p0, Lorg/snmp4j/util/ThreadPool;->respawnThreads:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v1, Lorg/snmp4j/util/ThreadPool$TaskManager;

    iget-object v2, p0, Lorg/snmp4j/util/ThreadPool;->name:Ljava/lang/String;

    invoke-virtual {p0, v2, v0}, Lorg/snmp4j/util/ThreadPool;->getTaskManagerName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lorg/snmp4j/util/ThreadPool$TaskManager;-><init>(Lorg/snmp4j/util/ThreadPool;Ljava/lang/String;)V

    iget-object v2, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v2, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :cond_0
    invoke-virtual {v1}, Lorg/snmp4j/util/ThreadPool$TaskManager;->isIdle()Z

    move-result v2

    if-eqz v2, :cond_2

    monitor-enter p0

    :try_start_0
    invoke-virtual {v1}, Lorg/snmp4j/util/ThreadPool$TaskManager;->isIdle()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    :try_start_1
    invoke-virtual {v1, p1}, Lorg/snmp4j/util/ThreadPool$TaskManager;->execute(Lorg/snmp4j/util/WorkerTask;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :cond_1
    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_2
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    monitor-enter p0

    :try_start_3
    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/ThreadPool$TaskManager;

    invoke-virtual {v1}, Lorg/snmp4j/util/ThreadPool$TaskManager;->isIdle()Z

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_4

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_5
    :try_start_4
    iget v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagersBusyTimeoutMillis:I

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catch_1
    move-exception v0

    :try_start_5
    invoke-virtual {p0, v0, p1}, Lorg/snmp4j/util/ThreadPool;->handleInterruptedExceptionOnExecute(Ljava/lang/InterruptedException;Lorg/snmp4j/util/WorkerTask;)V

    :goto_4
    monitor-exit p0

    goto :goto_0

    :goto_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool;->name:Ljava/lang/String;

    return-object v0
.end method

.method protected getTaskManagerName(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getTaskManagersBusyTimeoutMillis()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagersBusyTimeoutMillis:I

    return v0
.end method

.method protected handleInterruptedExceptionOnExecute(Ljava/lang/InterruptedException;Lorg/snmp4j/util/WorkerTask;)V
    .locals 0

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public interrupt()V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/ThreadPool$TaskManager;

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public isIdle()Z
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/ThreadPool$TaskManager;

    invoke-virtual {v1}, Lorg/snmp4j/util/ThreadPool$TaskManager;->isIdle()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public isRespawnThreads()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/ThreadPool;->respawnThreads:Z

    return v0
.end method

.method public setRespawnThreads(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/ThreadPool;->respawnThreads:Z

    return-void
.end method

.method public setTaskManagersBusyTimeoutMillis(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/util/ThreadPool;->taskManagersBusyTimeoutMillis:I

    return-void
.end method

.method protected setup(Ljava/lang/String;I)V
    .locals 3

    iput-object p1, p0, Lorg/snmp4j/util/ThreadPool;->name:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    new-instance v1, Lorg/snmp4j/util/ThreadPool$TaskManager;

    invoke-virtual {p0, p1, v0}, Lorg/snmp4j/util/ThreadPool;->getTaskManagerName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lorg/snmp4j/util/ThreadPool$TaskManager;-><init>(Lorg/snmp4j/util/ThreadPool;Ljava/lang/String;)V

    iget-object v2, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lorg/snmp4j/util/ThreadPool;->stop:Z

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/ThreadPool$TaskManager;

    invoke-virtual {v1}, Lorg/snmp4j/util/ThreadPool$TaskManager;->terminate()V

    monitor-enter v1

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Thread;->join()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_0
    return-void

    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public tryToExecute(Lorg/snmp4j/util/WorkerTask;)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lorg/snmp4j/util/ThreadPool;->taskManagers:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/util/ThreadPool$TaskManager;

    iget-boolean v3, p0, Lorg/snmp4j/util/ThreadPool;->respawnThreads:Z

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v2, Lorg/snmp4j/util/ThreadPool$TaskManager;

    iget-object v3, p0, Lorg/snmp4j/util/ThreadPool;->name:Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Lorg/snmp4j/util/ThreadPool;->getTaskManagerName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lorg/snmp4j/util/ThreadPool$TaskManager;-><init>(Lorg/snmp4j/util/ThreadPool;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    :cond_0
    invoke-virtual {v2}, Lorg/snmp4j/util/ThreadPool$TaskManager;->isIdle()Z

    move-result v3

    if-eqz v3, :cond_1

    :try_start_0
    invoke-virtual {v2, p1}, Lorg/snmp4j/util/ThreadPool$TaskManager;->execute(Lorg/snmp4j/util/WorkerTask;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method
