.class public LP6/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lkg/e;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final b:Lgg/t;

.field private final c:LO6/i;


# direct methods
.method public constructor <init>(Lgg/t;LO6/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LP6/F;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, LP6/F;->b:Lgg/t;

    iput-object p2, p0, LP6/F;->c:LO6/i;

    invoke-interface {p1, p0}, Lgg/t;->d(Lkg/e;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LP6/F;->c:LO6/i;

    invoke-interface {v0}, LO6/i;->release()V

    iget-object v0, p0, LP6/F;->b:Lgg/t;

    invoke-interface {v0}, Lgg/h;->a()V

    return-void
.end method

.method public declared-synchronized b()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP6/F;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public c(Lhg/c;)V
    .locals 0

    return-void
.end method

.method public declared-synchronized cancel()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP6/F;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
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

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LP6/F;->b:Lgg/t;

    invoke-interface {v0, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LP6/F;->c:LO6/i;

    invoke-interface {v0}, LO6/i;->release()V

    iget-object v0, p0, LP6/F;->b:Lgg/t;

    invoke-interface {v0, p1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    return-void
.end method
