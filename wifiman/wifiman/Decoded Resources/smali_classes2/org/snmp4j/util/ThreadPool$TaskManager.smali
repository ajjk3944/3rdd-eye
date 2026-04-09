.class Lorg/snmp4j/util/ThreadPool$TaskManager;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/ThreadPool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TaskManager"
.end annotation


# instance fields
.field private volatile run:Z

.field private task:Lorg/snmp4j/util/WorkerTask;

.field final synthetic this$0:Lorg/snmp4j/util/ThreadPool;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/ThreadPool;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->this$0:Lorg/snmp4j/util/ThreadPool;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->run:Z

    return-void
.end method


# virtual methods
.method public declared-synchronized execute(Lorg/snmp4j/util/WorkerTask;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    if-nez v0, :cond_0

    iput-object p1, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "TaskManager is not idle"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public isIdle()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->run:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isStopped()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->this$0:Lorg/snmp4j/util/ThreadPool;

    iget-boolean v0, v0, Lorg/snmp4j/util/ThreadPool;->stop:Z

    return v0
.end method

.method public run()V
    .locals 2

    :goto_0
    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->this$0:Lorg/snmp4j/util/ThreadPool;

    iget-boolean v0, v0, Lorg/snmp4j/util/ThreadPool;->stop:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->run:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->this$0:Lorg/snmp4j/util/ThreadPool;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->this$0:Lorg/snmp4j/util/ThreadPool;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_0
    monitor-enter p0

    :try_start_3
    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    :try_start_4
    monitor-exit p0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->this$0:Lorg/snmp4j/util/ThreadPool;

    iget-boolean v0, v0, Lorg/snmp4j/util/ThreadPool;->respawnThreads:Z

    iput-boolean v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->run:Z

    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    :cond_2
    :goto_3
    return-void
.end method

.method public terminate()V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->this$0:Lorg/snmp4j/util/ThreadPool;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lorg/snmp4j/util/ThreadPool;->stop:Z

    iget-object v0, p0, Lorg/snmp4j/util/ThreadPool$TaskManager;->task:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    :cond_0
    return-void
.end method
