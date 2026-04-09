.class public Lorg/snmp4j/util/TaskScheduler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final DEFAULT_SCHEDULER_TIMEOUT:J = 0x5L


# instance fields
.field private logger:Lorg/snmp4j/log/LogAdapter;

.field protected schedulerTimeout:J

.field private stop:Z

.field private tasks:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lorg/snmp4j/util/SchedulerTask;",
            ">;"
        }
    .end annotation
.end field

.field private threadPool:Lorg/snmp4j/util/ThreadPool;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/ThreadPool;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lorg/snmp4j/util/TaskScheduler;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->tasks:Ljava/util/LinkedList;

    const-wide/16 v0, 0x5

    iput-wide v0, p0, Lorg/snmp4j/util/TaskScheduler;->schedulerTimeout:J

    iput-object p1, p0, Lorg/snmp4j/util/TaskScheduler;->threadPool:Lorg/snmp4j/util/ThreadPool;

    return-void
.end method


# virtual methods
.method public declared-synchronized addTask(Lorg/snmp4j/util/SchedulerTask;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->tasks:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized clear()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->tasks:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public isStop()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/TaskScheduler;->stop:Z

    return v0
.end method

.method public declared-synchronized removeTask(Lorg/snmp4j/util/SchedulerTask;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->tasks:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public run()V
    .locals 7

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lorg/snmp4j/util/TaskScheduler;->stop:Z

    if-nez v0, :cond_7

    monitor-enter p0

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    :try_start_0
    iget-object v2, p0, Lorg/snmp4j/util/TaskScheduler;->tasks:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v0, v2, :cond_5

    iget-object v2, p0, Lorg/snmp4j/util/TaskScheduler;->tasks:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/util/SchedulerTask;

    invoke-interface {v2}, Lorg/snmp4j/util/SchedulerTask;->isDone()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lorg/snmp4j/util/TaskScheduler;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lorg/snmp4j/util/TaskScheduler;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Task \'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' is done"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_1
    :goto_2
    iget-object v2, p0, Lorg/snmp4j/util/TaskScheduler;->tasks:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    goto :goto_4

    :cond_2
    invoke-interface {v2}, Lorg/snmp4j/util/SchedulerTask;->isReadyToRun()Z

    move-result v4

    if-eqz v4, :cond_4

    :goto_3
    iget-object v1, p0, Lorg/snmp4j/util/TaskScheduler;->threadPool:Lorg/snmp4j/util/ThreadPool;

    invoke-virtual {v1, v2}, Lorg/snmp4j/util/ThreadPool;->tryToExecute(Lorg/snmp4j/util/WorkerTask;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_3

    :try_start_1
    iget-object v1, p0, Lorg/snmp4j/util/TaskScheduler;->threadPool:Lorg/snmp4j/util/ThreadPool;

    monitor-enter v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v4, p0, Lorg/snmp4j/util/TaskScheduler;->threadPool:Lorg/snmp4j/util/ThreadPool;

    iget-wide v5, p0, Lorg/snmp4j/util/TaskScheduler;->schedulerTimeout:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/Object;->wait(J)V

    monitor-exit v1

    goto :goto_3

    :catchall_1
    move-exception v2

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v2
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_0
    :try_start_4
    iget-object v1, p0, Lorg/snmp4j/util/TaskScheduler;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v2, "Scheduler interrupted, aborting..."

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    iput-boolean v3, p0, Lorg/snmp4j/util/TaskScheduler;->stop:Z

    :cond_3
    iget-object v1, p0, Lorg/snmp4j/util/TaskScheduler;->tasks:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    move v1, v3

    :cond_4
    :goto_4
    add-int/2addr v0, v3

    goto :goto_1

    :cond_5
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v1, :cond_0

    :try_start_5
    iget-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->threadPool:Lorg/snmp4j/util/ThreadPool;

    invoke-virtual {v0}, Lorg/snmp4j/util/ThreadPool;->isIdle()Z

    move-result v0

    if-eqz v0, :cond_6

    monitor-enter p0
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1

    :try_start_6
    iget-wide v0, p0, Lorg/snmp4j/util/TaskScheduler;->schedulerTimeout:J

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    monitor-exit p0

    goto/16 :goto_0

    :catchall_2
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    throw v0

    :cond_6
    iget-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->threadPool:Lorg/snmp4j/util/ThreadPool;

    monitor-enter v0
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_1

    :try_start_8
    iget-object v1, p0, Lorg/snmp4j/util/TaskScheduler;->threadPool:Lorg/snmp4j/util/ThreadPool;

    iget-wide v4, p0, Lorg/snmp4j/util/TaskScheduler;->schedulerTimeout:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/Object;->wait(J)V

    monitor-exit v0

    goto/16 :goto_0

    :catchall_3
    move-exception v1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    throw v1
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_1

    :catch_1
    iget-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "Scheduler interrupted, aborting..."

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    iput-boolean v3, p0, Lorg/snmp4j/util/TaskScheduler;->stop:Z

    goto/16 :goto_0

    :goto_5
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    throw v0

    :cond_7
    iget-object v0, p0, Lorg/snmp4j/util/TaskScheduler;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "Scheduler stopped."

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setStop(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/TaskScheduler;->stop:Z

    return-void
.end method
