.class final LHg/c;
.super LHg/d;
.source "SourceFile"

# interfaces
.implements Lzg/a$a;


# instance fields
.field final a:LHg/d;

.field b:Z

.field c:Lzg/a;

.field volatile d:Z


# direct methods
.method constructor <init>(LHg/d;)V
    .locals 0

    invoke-direct {p0}, LHg/d;-><init>()V

    iput-object p1, p0, LHg/c;->a:LHg/d;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, LHg/c;->a:LHg/d;

    invoke-virtual {v0, p1}, Lgg/s;->d(Lgg/x;)V

    return-void
.end method

.method public a()V
    .locals 2

    iget-boolean v0, p0, LHg/c;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LHg/c;->d:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LHg/c;->d:Z

    iget-boolean v1, p0, LHg/c;->b:Z

    if-eqz v1, :cond_3

    iget-object v0, p0, LHg/c;->c:Lzg/a;

    if-nez v0, :cond_2

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LHg/c;->c:Lzg/a;

    :cond_2
    invoke-static {}, Lzg/j;->complete()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzg/a;->c(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    iput-boolean v0, p0, LHg/c;->b:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LHg/c;->a:LHg/d;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public c(Lhg/c;)V
    .locals 2

    iget-boolean v0, p0, LHg/c;->d:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LHg/c;->d:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, LHg/c;->b:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LHg/c;->c:Lzg/a;

    if-nez v0, :cond_1

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LHg/c;->c:Lzg/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {p1}, Lzg/j;->disposable(Lhg/c;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzg/a;->c(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_2
    iput-boolean v1, p0, LHg/c;->b:Z

    const/4 v1, 0x0

    :goto_1
    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_3
    if-eqz v1, :cond_4

    invoke-interface {p1}, Lhg/c;->dispose()V

    goto :goto_4

    :cond_4
    iget-object v0, p0, LHg/c;->a:LHg/d;

    invoke-interface {v0, p1}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {p0}, LHg/c;->j1()V

    :goto_4
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, LHg/c;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LHg/c;->d:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, LHg/c;->b:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LHg/c;->c:Lzg/a;

    if-nez v0, :cond_2

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LHg/c;->c:Lzg/a;

    :cond_2
    invoke-static {p1}, Lzg/j;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzg/a;->c(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, LHg/c;->b:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LHg/c;->a:LHg/d;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, LHg/c;->j1()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method j1()V
    .locals 2

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LHg/c;->c:Lzg/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LHg/c;->b:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, LHg/c;->c:Lzg/a;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, p0}, Lzg/a;->d(Lzg/a$a;)V

    goto :goto_0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-boolean v0, p0, LHg/c;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LHg/c;->d:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean v1, p0, LHg/c;->d:Z

    iget-boolean v0, p0, LHg/c;->b:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LHg/c;->c:Lzg/a;

    if-nez v0, :cond_2

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LHg/c;->c:Lzg/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    invoke-static {p1}, Lzg/j;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzg/a;->e(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    iput-boolean v1, p0, LHg/c;->b:Z

    const/4 v1, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    iget-object v0, p0, LHg/c;->a:LHg/d;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LHg/c;->a:LHg/d;

    invoke-static {p1, v0}, Lzg/j;->acceptFull(Ljava/lang/Object;Lgg/x;)Z

    move-result p1

    return p1
.end method
