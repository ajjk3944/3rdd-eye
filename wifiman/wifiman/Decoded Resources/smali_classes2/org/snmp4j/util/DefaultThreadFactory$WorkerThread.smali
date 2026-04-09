.class public Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/WorkerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/DefaultThreadFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "WorkerThread"
.end annotation


# instance fields
.field private started:Z

.field private task:Lorg/snmp4j/util/WorkerTask;

.field final synthetic this$0:Lorg/snmp4j/util/DefaultThreadFactory;

.field private thread:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/DefaultThreadFactory;Ljava/lang/String;Lorg/snmp4j/util/WorkerTask;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->this$0:Lorg/snmp4j/util/DefaultThreadFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->started:Z

    new-instance p1, Ljava/lang/Thread;

    invoke-direct {p1, p3, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->thread:Ljava/lang/Thread;

    iput-object p3, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->task:Lorg/snmp4j/util/WorkerTask;

    return-void
.end method

.method static synthetic access$000(Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;)Ljava/lang/Thread;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->thread:Ljava/lang/Thread;

    return-object p0
.end method


# virtual methods
.method public interrupt()V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->task:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->interrupt()V

    iget-object v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public join()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->task:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->join()V

    iget-object v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->thread:Ljava/lang/Thread;

    iget-object v1, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->this$0:Lorg/snmp4j/util/DefaultThreadFactory;

    invoke-static {v1}, Lorg/snmp4j/util/DefaultThreadFactory;->access$100(Lorg/snmp4j/util/DefaultThreadFactory;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/Thread;->join(J)V

    return-void
.end method

.method public run()V
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->started:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->started:Z

    iget-object v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->run()V

    :goto_0
    return-void
.end method

.method public terminate()V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->task:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    return-void
.end method
