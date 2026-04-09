.class final Lqg/c$c;
.super Lxg/d;
.source "SourceFile"

# interfaces
.implements LDj/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/c$c$a;
    }
.end annotation


# instance fields
.field final h:Lkg/q;

.field final i:J

.field final j:J

.field final k:Ljava/util/concurrent/TimeUnit;

.field final l:Lgg/y$c;

.field final m:Ljava/util/List;

.field n:LDj/c;


# direct methods
.method constructor <init>(LDj/b;Lkg/q;JJLjava/util/concurrent/TimeUnit;Lgg/y$c;)V
    .locals 1

    new-instance v0, Lvg/a;

    invoke-direct {v0}, Lvg/a;-><init>()V

    invoke-direct {p0, p1, v0}, Lxg/d;-><init>(LDj/b;LDg/f;)V

    iput-object p2, p0, Lqg/c$c;->h:Lkg/q;

    iput-wide p3, p0, Lqg/c$c;->i:J

    iput-wide p5, p0, Lqg/c$c;->j:J

    iput-object p7, p0, Lqg/c$c;->k:Ljava/util/concurrent/TimeUnit;

    iput-object p8, p0, Lqg/c$c;->l:Lgg/y$c;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lqg/c$c;->m:Ljava/util/List;

    return-void
.end method

.method static synthetic u(Lqg/c$c;Ljava/lang/Object;ZLhg/c;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lxg/d;->q(Ljava/lang/Object;ZLhg/c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lqg/c$c;->m:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lqg/c$c;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    iget-object v2, p0, Lxg/d;->d:LDg/f;

    invoke-interface {v2, v1}, LDg/g;->offer(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/d;->f:Z

    invoke-virtual {p0}, Lxg/d;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxg/d;->d:LDg/f;

    iget-object v1, p0, Lxg/d;->c:LDj/b;

    const/4 v2, 0x0

    iget-object v3, p0, Lqg/c$c;->l:Lgg/y$c;

    invoke-static {v0, v1, v2, v3, p0}, Lzg/n;->b(LDg/f;LDj/b;ZLhg/c;Lzg/m;)V

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

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/d;->e:Z

    iget-object v0, p0, Lqg/c$c;->n:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/c$c;->l:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Lqg/c$c;->v()V

    return-void
.end method

.method public bridge synthetic g(LDj/b;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lqg/c$c;->t(LDj/b;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c$c;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j(LDj/c;)V
    .locals 10

    iget-object v0, p0, Lqg/c$c;->n:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lqg/c$c;->n:LDj/c;

    :try_start_0
    iget-object v0, p0, Lqg/c$c;->h:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The supplied buffer is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lqg/c$c;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v1, p0}, LDj/b;->j(LDj/c;)V

    const-wide v1, 0x7fffffffffffffffL

    invoke-interface {p1, v1, v2}, LDj/c;->request(J)V

    iget-object v3, p0, Lqg/c$c;->l:Lgg/y$c;

    iget-wide v7, p0, Lqg/c$c;->j:J

    iget-object v9, p0, Lqg/c$c;->k:Ljava/util/concurrent/TimeUnit;

    move-object v4, p0

    move-wide v5, v7

    invoke-virtual/range {v3 .. v9}, Lgg/y$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    iget-object p1, p0, Lqg/c$c;->l:Lgg/y$c;

    new-instance v1, Lqg/c$c$a;

    invoke-direct {v1, p0, v0}, Lqg/c$c$a;-><init>(Lqg/c$c;Ljava/util/Collection;)V

    iget-wide v2, p0, Lqg/c$c;->i:J

    iget-object v0, p0, Lqg/c$c;->k:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, v3, v0}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lqg/c$c;->l:Lgg/y$c;

    invoke-interface {v1}, Lhg/c;->dispose()V

    invoke-interface {p1}, LDj/c;->cancel()V

    iget-object p1, p0, Lxg/d;->c:LDj/b;

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/d;->f:Z

    iget-object v0, p0, Lqg/c$c;->l:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Lqg/c$c;->v()V

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public request(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxg/d;->s(J)V

    return-void
.end method

.method public run()V
    .locals 5

    iget-boolean v0, p0, Lxg/d;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lqg/c$c;->h:Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The supplied buffer is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-enter p0

    :try_start_1
    iget-boolean v1, p0, Lxg/d;->e:Z

    if-eqz v1, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lqg/c$c;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lqg/c$c;->l:Lgg/y$c;

    new-instance v2, Lqg/c$c$a;

    invoke-direct {v2, p0, v0}, Lqg/c$c$a;-><init>(Lqg/c$c;Ljava/util/Collection;)V

    iget-wide v3, p0, Lqg/c$c;->i:J

    iget-object v0, p0, Lqg/c$c;->k:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4, v0}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

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

    invoke-virtual {p0}, Lqg/c$c;->cancel()V

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

.method v()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqg/c$c;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
