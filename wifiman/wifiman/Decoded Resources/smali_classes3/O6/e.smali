.class public LO6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO6/d;
.implements LK6/n;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LK6/B;

.field private c:LCg/a;

.field final d:LO6/h;

.field private final e:Ljava/util/concurrent/Future;

.field volatile f:Z

.field private g:Lcom/polidea/rxandroidble3/exceptions/BleException;


# direct methods
.method constructor <init>(Ljava/lang/String;LK6/B;Ljava/util/concurrent/ExecutorService;Lgg/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LO6/h;

    invoke-direct {v0}, LO6/h;-><init>()V

    iput-object v0, p0, LO6/e;->d:LO6/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, LO6/e;->f:Z

    const/4 v0, 0x0

    iput-object v0, p0, LO6/e;->g:Lcom/polidea/rxandroidble3/exceptions/BleException;

    iput-object p1, p0, LO6/e;->a:Ljava/lang/String;

    iput-object p2, p0, LO6/e;->b:LK6/B;

    new-instance p2, LO6/e$a;

    invoke-direct {p2, p0, p4, p1}, LO6/e$a;-><init>(LO6/e;Lgg/y;Ljava/lang/String;)V

    invoke-interface {p3, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, LO6/e;->e:Ljava/util/concurrent/Future;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(LM6/j;)Lgg/s;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LO6/e;->f:Z

    if-nez v0, :cond_0

    iget-object p1, p0, LO6/e;->g:Lcom/polidea/rxandroidble3/exceptions/BleException;

    invoke-static {p1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

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
    new-instance v0, LO6/e$b;

    invoke-direct {v0, p0, p1}, LO6/e$b;-><init>(LO6/e;LM6/j;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, LO6/e;->c:LCg/a;

    invoke-virtual {v0}, LCg/a;->dispose()V

    const/4 v0, 0x0

    iput-object v0, p0, LO6/e;->c:LCg/a;

    new-instance v0, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;

    iget-object v1, p0, LO6/e;->a:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, LO6/e;->e(Lcom/polidea/rxandroidble3/exceptions/BleException;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LO6/e;->b:LK6/B;

    invoke-interface {v0}, LK6/B;->a()Lgg/s;

    move-result-object v0

    new-instance v1, LO6/e$c;

    invoke-direct {v1, p0}, LO6/e$c;-><init>(LO6/e;)V

    invoke-virtual {v0, v1}, Lgg/s;->N0(Lgg/x;)Lgg/x;

    move-result-object v0

    check-cast v0, LCg/a;

    iput-object v0, p0, LO6/e;->c:LCg/a;

    return-void
.end method

.method declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :goto_0
    :try_start_0
    iget-object v0, p0, LO6/e;->d:LO6/h;

    invoke-virtual {v0}, LO6/h;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LO6/e;->d:LO6/h;

    invoke-virtual {v0}, LO6/h;->e()LO6/g;

    move-result-object v0

    iget-object v0, v0, LO6/g;->c:Lgg/t;

    iget-object v1, p0, LO6/e;->g:Lcom/polidea/rxandroidble3/exceptions/BleException;

    invoke-interface {v0, v1}, Lgg/t;->c(Ljava/lang/Throwable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized e(Lcom/polidea/rxandroidble3/exceptions/BleException;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LO6/e;->g:Lcom/polidea/rxandroidble3/exceptions/BleException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "Connection operations queue to be terminated (%s)"

    iget-object v1, p0, LO6/e;->a:Ljava/lang/String;

    invoke-static {v1}, LL6/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v0, v1}, LI6/q;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LO6/e;->f:Z

    iput-object p1, p0, LO6/e;->g:Lcom/polidea/rxandroidble3/exceptions/BleException;

    iget-object p1, p0, LO6/e;->e:Ljava/util/concurrent/Future;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
