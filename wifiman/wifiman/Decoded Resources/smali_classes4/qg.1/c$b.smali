.class final Lqg/c$b;
.super Lxg/d;
.source "SourceFile"

# interfaces
.implements LDj/c;
.implements Ljava/lang/Runnable;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final h:Lkg/q;

.field final i:J

.field final j:Ljava/util/concurrent/TimeUnit;

.field final k:Lgg/y;

.field l:LDj/c;

.field m:Ljava/util/Collection;

.field final n:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(LDj/b;Lkg/q;JLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 1

    new-instance v0, Lvg/a;

    invoke-direct {v0}, Lvg/a;-><init>()V

    invoke-direct {p0, p1, v0}, Lxg/d;-><init>(LDj/b;LDg/f;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/c$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lqg/c$b;->h:Lkg/q;

    iput-wide p3, p0, Lqg/c$b;->i:J

    iput-object p5, p0, Lqg/c$b;->j:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Lqg/c$b;->k:Lgg/y;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lqg/c$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c$b;->m:Ljava/util/Collection;

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lqg/c$b;->m:Ljava/util/Collection;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lxg/d;->d:LDg/f;

    invoke-interface {v2, v0}, LDg/g;->offer(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/d;->f:Z

    invoke-virtual {p0}, Lxg/d;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxg/d;->d:LDg/f;

    iget-object v2, p0, Lxg/d;->c:LDj/b;

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p0}, Lzg/n;->b(LDg/f;LDj/b;ZLhg/c;Lzg/m;)V

    :cond_1
    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/d;->e:Z

    iget-object v0, p0, Lqg/c$b;->l:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/c$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-virtual {p0}, Lqg/c$b;->cancel()V

    return-void
.end method

.method public bridge synthetic g(LDj/b;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lqg/c$b;->t(LDj/b;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c$b;->m:Ljava/util/Collection;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lqg/c$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(LDj/c;)V
    .locals 9

    iget-object v0, p0, Lqg/c$b;->l:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/c$b;->l:LDj/c;

    :try_start_0
    iget-object v0, p0, Lqg/c$b;->h:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The supplied buffer is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Lqg/c$b;->m:Ljava/util/Collection;

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    iget-boolean v0, p0, Lxg/d;->e:Z

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    iget-object v2, p0, Lqg/c$b;->k:Lgg/y;

    iget-wide v6, p0, Lqg/c$b;->i:J

    iget-object v8, p0, Lqg/c$b;->j:Ljava/util/concurrent/TimeUnit;

    move-object v3, p0

    move-wide v4, v6

    invoke-virtual/range {v2 .. v8}, Lgg/y;->g(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    iget-object v0, p0, Lqg/c$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lhg/c;->dispose()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lqg/c$b;->cancel()V

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    invoke-static {p1, v0}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/c$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lqg/c$b;->m:Ljava/util/Collection;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public request(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxg/d;->s(J)V

    return-void
.end method

.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lqg/c$b;->h:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The supplied buffer is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-enter p0

    :try_start_1
    iget-object v1, p0, Lqg/c$b;->m:Ljava/util/Collection;

    if-nez v1, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lqg/c$b;->m:Ljava/util/Collection;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0, p0}, Lxg/d;->o(Ljava/lang/Object;ZLhg/c;)V

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lqg/c$b;->cancel()V

    iget-object v1, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public t(LDj/b;Ljava/util/Collection;)Z
    .locals 0

    iget-object p1, p0, Lxg/d;->c:LDj/b;

    invoke-interface {p1, p2}, LDj/b;->h(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
