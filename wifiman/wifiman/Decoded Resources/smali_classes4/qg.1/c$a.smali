.class final Lqg/c$a;
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
    name = "a"
.end annotation


# instance fields
.field final h:Lkg/q;

.field final i:J

.field final j:Ljava/util/concurrent/TimeUnit;

.field final k:I

.field final l:Z

.field final m:Lgg/y$c;

.field n:Ljava/util/Collection;

.field o:Lhg/c;

.field p:LDj/c;

.field q:J

.field r:J


# direct methods
.method constructor <init>(LDj/b;Lkg/q;JLjava/util/concurrent/TimeUnit;IZLgg/y$c;)V
    .locals 1

    new-instance v0, Lvg/a;

    invoke-direct {v0}, Lvg/a;-><init>()V

    invoke-direct {p0, p1, v0}, Lxg/d;-><init>(LDj/b;LDg/f;)V

    iput-object p2, p0, Lqg/c$a;->h:Lkg/q;

    iput-wide p3, p0, Lqg/c$a;->i:J

    iput-object p5, p0, Lqg/c$a;->j:Ljava/util/concurrent/TimeUnit;

    iput p6, p0, Lqg/c$a;->k:I

    iput-boolean p7, p0, Lqg/c$a;->l:Z

    iput-object p8, p0, Lqg/c$a;->m:Lgg/y$c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c$a;->n:Ljava/util/Collection;

    const/4 v1, 0x0

    iput-object v1, p0, Lqg/c$a;->n:Ljava/util/Collection;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lxg/d;->d:LDg/f;

    invoke-interface {v1, v0}, LDg/g;->offer(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/d;->f:Z

    invoke-virtual {p0}, Lxg/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxg/d;->d:LDg/f;

    iget-object v1, p0, Lxg/d;->c:LDj/b;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p0, p0}, Lzg/n;->b(LDg/f;LDj/b;ZLhg/c;Lzg/m;)V

    :cond_0
    iget-object v0, p0, Lqg/c$a;->m:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lxg/d;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/d;->e:Z

    invoke-virtual {p0}, Lqg/c$a;->dispose()V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lqg/c$a;->n:Ljava/util/Collection;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqg/c$a;->p:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/c$a;->m:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public bridge synthetic g(LDj/b;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lqg/c$a;->t(LDj/b;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public h(Ljava/lang/Object;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c$a;->n:Ljava/util/Collection;

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result p1

    iget v1, p0, Lqg/c$a;->k:I

    if-ge p1, v1, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lqg/c$a;->n:Ljava/util/Collection;

    iget-wide v1, p0, Lqg/c$a;->q:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lqg/c$a;->q:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean p1, p0, Lqg/c$a;->l:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lqg/c$a;->o:Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1, p0}, Lxg/d;->q(Ljava/lang/Object;ZLhg/c;)V

    :try_start_1
    iget-object p1, p0, Lqg/c$a;->h:Lkg/q;

    invoke-interface {p1}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The supplied buffer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    monitor-enter p0

    :try_start_2
    iput-object p1, p0, Lqg/c$a;->n:Ljava/util/Collection;

    iget-wide v0, p0, Lqg/c$a;->r:J

    add-long/2addr v0, v3

    iput-wide v0, p0, Lqg/c$a;->r:J

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-boolean p1, p0, Lqg/c$a;->l:Z

    if-eqz p1, :cond_3

    iget-object v0, p0, Lqg/c$a;->m:Lgg/y$c;

    iget-wide v4, p0, Lqg/c$a;->i:J

    iget-object v6, p0, Lqg/c$a;->j:Ljava/util/concurrent/TimeUnit;

    move-object v1, p0

    move-wide v2, v4

    invoke-virtual/range {v0 .. v6}, Lgg/y$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    iput-object p1, p0, Lqg/c$a;->o:Lhg/c;

    :cond_3
    return-void

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :catchall_2
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lqg/c$a;->cancel()V

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lqg/c$a;->m:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public j(LDj/c;)V
    .locals 8

    iget-object v0, p0, Lqg/c$a;->p:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lqg/c$a;->p:LDj/c;

    :try_start_0
    iget-object v0, p0, Lqg/c$a;->h:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The supplied buffer is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Lqg/c$a;->n:Ljava/util/Collection;

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    iget-object v1, p0, Lqg/c$a;->m:Lgg/y$c;

    iget-wide v5, p0, Lqg/c$a;->i:J

    iget-object v7, p0, Lqg/c$a;->j:Ljava/util/concurrent/TimeUnit;

    move-object v2, p0

    move-wide v3, v5

    invoke-virtual/range {v1 .. v7}, Lgg/y$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object v0

    iput-object v0, p0, Lqg/c$a;->o:Lhg/c;

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lqg/c$a;->m:Lgg/y$c;

    invoke-interface {v1}, Lhg/c;->dispose()V

    invoke-interface {p1}, LDj/c;->cancel()V

    iget-object p1, p0, Lxg/d;->c:LDj/b;

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lqg/c$a;->n:Ljava/util/Collection;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lqg/c$a;->m:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

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
    .locals 6

    :try_start_0
    iget-object v0, p0, Lqg/c$a;->h:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The supplied buffer is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-enter p0

    :try_start_1
    iget-object v1, p0, Lqg/c$a;->n:Ljava/util/Collection;

    if-eqz v1, :cond_1

    iget-wide v2, p0, Lqg/c$a;->q:J

    iget-wide v4, p0, Lqg/c$a;->r:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lqg/c$a;->n:Ljava/util/Collection;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0, p0}, Lxg/d;->q(Ljava/lang/Object;ZLhg/c;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_2
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lqg/c$a;->cancel()V

    iget-object v1, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public t(LDj/b;Ljava/util/Collection;)Z
    .locals 0

    invoke-interface {p1, p2}, LDj/b;->h(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
