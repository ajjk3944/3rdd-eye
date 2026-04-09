.class public final LCg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# instance fields
.field final a:Lgg/x;

.field final b:Z

.field c:Lhg/c;

.field d:Z

.field e:Lzg/a;

.field volatile f:Z


# direct methods
.method public constructor <init>(Lgg/x;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LCg/c;-><init>(Lgg/x;Z)V

    return-void
.end method

.method public constructor <init>(Lgg/x;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LCg/c;->a:Lgg/x;

    .line 4
    iput-boolean p2, p0, LCg/c;->b:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, LCg/c;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LCg/c;->f:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, LCg/c;->d:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, LCg/c;->e:Lzg/a;

    if-nez v0, :cond_2

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LCg/c;->e:Lzg/a;

    :cond_2
    invoke-static {}, Lzg/j;->complete()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzg/a;->c(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, LCg/c;->f:Z

    iput-boolean v0, p0, LCg/c;->d:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LCg/c;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method b()V
    .locals 2

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LCg/c;->e:Lzg/a;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, LCg/c;->d:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, LCg/c;->e:Lzg/a;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LCg/c;->a:Lgg/x;

    invoke-virtual {v0, v1}, Lzg/a;->b(Lgg/x;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, LCg/c;->c:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, LCg/c;->c:Lhg/c;

    iget-object p1, p0, LCg/c;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LCg/c;->f:Z

    iget-object v0, p0, LCg/c;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, LCg/c;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, LCg/c;->c:Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    const-string p1, "onNext called with a null value."

    invoke-static {p1}, Lzg/h;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    move-result-object p1

    invoke-virtual {p0, p1}, LCg/c;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LCg/c;->f:Z

    if-eqz v0, :cond_2

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, LCg/c;->d:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, LCg/c;->e:Lzg/a;

    if-nez v0, :cond_3

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LCg/c;->e:Lzg/a;

    :cond_3
    invoke-static {p1}, Lzg/j;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzg/a;->c(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, LCg/c;->d:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LCg/c;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, LCg/c;->b()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, LCg/c;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-boolean v0, p0, LCg/c;->f:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LCg/c;->f:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    iget-boolean v0, p0, LCg/c;->d:Z

    if-eqz v0, :cond_4

    iput-boolean v1, p0, LCg/c;->f:Z

    iget-object v0, p0, LCg/c;->e:Lzg/a;

    if-nez v0, :cond_2

    new-instance v0, Lzg/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lzg/a;-><init>(I)V

    iput-object v0, p0, LCg/c;->e:Lzg/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_0
    invoke-static {p1}, Lzg/j;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    iget-boolean v1, p0, LCg/c;->b:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0, p1}, Lzg/a;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0, p1}, Lzg/a;->e(Ljava/lang/Object;)V

    :goto_1
    monitor-exit p0

    return-void

    :cond_4
    iput-boolean v1, p0, LCg/c;->f:Z

    iput-boolean v1, p0, LCg/c;->d:Z

    const/4 v1, 0x0

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_5

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_5
    iget-object v0, p0, LCg/c;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
