.class final LFg/d;
.super LFg/b;
.source "SourceFile"


# instance fields
.field final b:LFg/b;

.field c:Z

.field d:Lzg/a;

.field volatile e:Z


# direct methods
.method constructor <init>(LFg/b;)V
    .locals 0

    invoke-direct {p0}, LFg/b;-><init>()V

    iput-object p1, p0, LFg/d;->b:LFg/b;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 1

    iget-object v0, p0, LFg/d;->b:LFg/b;

    invoke-virtual {v0, p1}, Lgg/i;->b(LDj/b;)V

    return-void
.end method

.method public a()V
    .locals 2

    iget-boolean v0, p0, LFg/d;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LFg/d;->e:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LFg/d;->e:Z

    iget-boolean v1, p0, LFg/d;->c:Z

    if-eqz v1, :cond_3

    iget-object v0, p0, LFg/d;->d:Lzg/a;

    if-nez v0, :cond_2

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LFg/d;->d:Lzg/a;

    :cond_2
    invoke-static {}, Lzg/j;->complete()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzg/a;->c(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    iput-boolean v0, p0, LFg/d;->c:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LFg/d;->b:LFg/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, LFg/d;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LFg/d;->e:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, LFg/d;->c:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LFg/d;->d:Lzg/a;

    if-nez v0, :cond_2

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LFg/d;->d:Lzg/a;

    :cond_2
    invoke-static {p1}, Lzg/j;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzg/a;->c(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, LFg/d;->c:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LFg/d;->b:LFg/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, LFg/d;->i2()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method i2()V
    .locals 2

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LFg/d;->d:Lzg/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LFg/d;->c:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, LFg/d;->d:Lzg/a;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LFg/d;->b:LFg/b;

    invoke-virtual {v0, v1}, Lzg/a;->a(LDj/b;)Z

    goto :goto_0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-boolean v0, p0, LFg/d;->e:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LFg/d;->e:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, LFg/d;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LFg/d;->d:Lzg/a;

    if-nez v0, :cond_1

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LFg/d;->d:Lzg/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {p1}, Lzg/j;->subscription(LDj/c;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzg/a;->c(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_2
    iput-boolean v1, p0, LFg/d;->c:Z

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

    invoke-interface {p1}, LDj/c;->cancel()V

    goto :goto_4

    :cond_4
    iget-object v0, p0, LFg/d;->b:LFg/b;

    invoke-interface {v0, p1}, Lgg/l;->j(LDj/c;)V

    invoke-virtual {p0}, LFg/d;->i2()V

    :goto_4
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-boolean v0, p0, LFg/d;->e:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LFg/d;->e:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean v1, p0, LFg/d;->e:Z

    iget-boolean v0, p0, LFg/d;->c:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LFg/d;->d:Lzg/a;

    if-nez v0, :cond_2

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LFg/d;->d:Lzg/a;

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
    iput-boolean v1, p0, LFg/d;->c:Z

    const/4 v1, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    iget-object v0, p0, LFg/d;->b:LFg/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
