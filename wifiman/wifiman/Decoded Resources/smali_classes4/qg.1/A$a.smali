.class final Lqg/A$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/A$a$a;
    }
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Z

.field final c:I

.field final d:Ljava/util/concurrent/atomic/AtomicLong;

.field final e:Lhg/b;

.field final f:Ljava/util/concurrent/atomic/AtomicInteger;

.field final g:Lzg/c;

.field final h:Lkg/n;

.field final i:Ljava/util/concurrent/atomic/AtomicReference;

.field j:LDj/c;

.field volatile k:Z


# direct methods
.method constructor <init>(LDj/b;Lkg/n;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/A$a;->a:LDj/b;

    iput-object p2, p0, Lqg/A$a;->h:Lkg/n;

    iput-boolean p3, p0, Lqg/A$a;->b:Z

    iput p4, p0, Lqg/A$a;->c:I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/A$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Lhg/b;

    invoke-direct {p1}, Lhg/b;-><init>()V

    iput-object p1, p0, Lqg/A$a;->e:Lhg/b;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/A$a;->g:Lzg/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lqg/A$a;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/A$a;->i:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/A$a;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    invoke-virtual {p0}, Lqg/A$a;->d()V

    return-void
.end method

.method c()V
    .locals 1

    iget-object v0, p0, Lqg/A$a;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDg/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDg/i;->clear()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/A$a;->k:Z

    iget-object v0, p0, Lqg/A$a;->j:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/A$a;->e:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    iget-object v0, p0, Lqg/A$a;->g:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method d()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqg/A$a;->g()V

    :cond_0
    return-void
.end method

.method g()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lqg/A$a;->a:LDj/b;

    iget-object v2, v0, Lqg/A$a;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v3, v0, Lqg/A$a;->i:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v4, 0x1

    move v5, v4

    :cond_0
    iget-object v6, v0, Lqg/A$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    move-wide v10, v8

    :goto_0
    cmp-long v12, v10, v6

    const/4 v13, 0x0

    if-eqz v12, :cond_8

    iget-boolean v14, v0, Lqg/A$a;->k:Z

    if-eqz v14, :cond_1

    invoke-virtual/range {p0 .. p0}, Lqg/A$a;->c()V

    return-void

    :cond_1
    iget-boolean v14, v0, Lqg/A$a;->b:Z

    if-nez v14, :cond_2

    iget-object v14, v0, Lqg/A$a;->g:Lzg/c;

    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Throwable;

    if-eqz v14, :cond_2

    invoke-virtual/range {p0 .. p0}, Lqg/A$a;->c()V

    iget-object v1, v0, Lqg/A$a;->g:Lzg/c;

    iget-object v2, v0, Lqg/A$a;->a:LDj/b;

    invoke-virtual {v1, v2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v14

    if-nez v14, :cond_3

    move v14, v4

    goto :goto_1

    :cond_3
    move v14, v13

    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LDg/i;

    if-eqz v15, :cond_4

    invoke-virtual {v15}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v15

    goto :goto_2

    :cond_4
    const/4 v15, 0x0

    :goto_2
    if-nez v15, :cond_5

    move/from16 v16, v4

    goto :goto_3

    :cond_5
    move/from16 v16, v13

    :goto_3
    if-eqz v14, :cond_6

    if-eqz v16, :cond_6

    iget-object v2, v0, Lqg/A$a;->g:Lzg/c;

    invoke-virtual {v2, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_6
    if-eqz v16, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {v1, v15}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v12, 0x1

    add-long/2addr v10, v12

    goto :goto_0

    :cond_8
    :goto_4
    if-nez v12, :cond_e

    iget-boolean v6, v0, Lqg/A$a;->k:Z

    if-eqz v6, :cond_9

    invoke-virtual/range {p0 .. p0}, Lqg/A$a;->c()V

    return-void

    :cond_9
    iget-boolean v6, v0, Lqg/A$a;->b:Z

    if-nez v6, :cond_a

    iget-object v6, v0, Lqg/A$a;->g:Lzg/c;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    if-eqz v6, :cond_a

    invoke-virtual/range {p0 .. p0}, Lqg/A$a;->c()V

    iget-object v2, v0, Lqg/A$a;->g:Lzg/c;

    invoke-virtual {v2, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_a
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    if-nez v6, :cond_b

    move v6, v4

    goto :goto_5

    :cond_b
    move v6, v13

    :goto_5
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LDg/i;

    if-eqz v7, :cond_c

    invoke-virtual {v7}, LDg/i;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_d

    :cond_c
    move v13, v4

    :cond_d
    if-eqz v6, :cond_e

    if-eqz v13, :cond_e

    iget-object v2, v0, Lqg/A$a;->g:Lzg/c;

    invoke-virtual {v2, v1}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_e
    cmp-long v6, v10, v8

    if-eqz v6, :cond_f

    iget-object v6, v0, Lqg/A$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v6, v10, v11}, Lzg/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget v6, v0, Lqg/A$a;->c:I

    const v7, 0x7fffffff

    if-eq v6, v7, :cond_f

    iget-object v6, v0, Lqg/A$a;->j:LDj/c;

    invoke-interface {v6, v10, v11}, LDj/c;->request(J)V

    :cond_f
    neg-int v5, v5

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v5

    if-nez v5, :cond_0

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lqg/A$a;->h:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null SingleSource"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/D;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqg/A$a;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    new-instance v0, Lqg/A$a$a;

    invoke-direct {v0, p0}, Lqg/A$a$a;-><init>(Lqg/A$a;)V

    iget-boolean v1, p0, Lqg/A$a;->k:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lqg/A$a;->e:Lhg/b;

    invoke-virtual {v1, v0}, Lhg/b;->a(Lhg/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lgg/D;->a(Lgg/B;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/A$a;->j:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, p1}, Lqg/A$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/A$a;->j:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lqg/A$a;->j:LDj/c;

    iget-object v0, p0, Lqg/A$a;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    iget v0, p0, Lqg/A$a;->c:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :cond_0
    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method l()LDg/i;
    .locals 3

    iget-object v0, p0, Lqg/A$a;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDg/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LDg/i;

    invoke-static {}, Lgg/i;->i()I

    move-result v1

    invoke-direct {v0, v1}, LDg/i;-><init>(I)V

    iget-object v1, p0, Lqg/A$a;->i:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lqg/A$a;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDg/i;

    return-object v0
.end method

.method n(Lqg/A$a$a;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/A$a;->e:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->c(Lhg/c;)Z

    iget-object p1, p0, Lqg/A$a;->g:Lzg/c;

    invoke-virtual {p1, p2}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lqg/A$a;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/A$a;->j:LDj/c;

    invoke-interface {p1}, LDj/c;->cancel()V

    iget-object p1, p0, Lqg/A$a;->e:Lhg/b;

    invoke-virtual {p1}, Lhg/b;->dispose()V

    goto :goto_0

    :cond_0
    iget p1, p0, Lqg/A$a;->c:I

    const p2, 0x7fffffff

    if-eq p1, p2, :cond_1

    iget-object p1, p0, Lqg/A$a;->j:LDj/c;

    const-wide/16 v0, 0x1

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lqg/A$a;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    invoke-virtual {p0}, Lqg/A$a;->d()V

    :cond_2
    return-void
.end method

.method o(Lqg/A$a$a;Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lqg/A$a;->e:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->c(Lhg/c;)Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_5

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lqg/A$a;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_0

    move p1, v0

    :cond_0
    iget-object v0, p0, Lqg/A$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqg/A$a;->a:LDj/b;

    invoke-interface {v0, p2}, LDj/b;->h(Ljava/lang/Object;)V

    iget-object p2, p0, Lqg/A$a;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LDg/i;

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LDg/i;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, Lqg/A$a;->g:Lzg/c;

    iget-object p2, p0, Lqg/A$a;->a:LDj/b;

    invoke-virtual {p1, p2}, Lzg/c;->j(LDj/b;)V

    return-void

    :cond_2
    iget-object p1, p0, Lqg/A$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x1

    invoke-static {p1, v0, v1}, Lzg/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget p1, p0, Lqg/A$a;->c:I

    const p2, 0x7fffffff

    if-eq p1, p2, :cond_4

    iget-object p1, p0, Lqg/A$a;->j:LDj/c;

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lqg/A$a;->l()LDg/i;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, p2}, LDg/i;->offer(Ljava/lang/Object;)Z

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_6

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2

    :cond_5
    invoke-virtual {p0}, Lqg/A$a;->l()LDg/i;

    move-result-object p1

    monitor-enter p1

    :try_start_2
    invoke-virtual {p1, p2}, LDg/i;->offer(Ljava/lang/Object;)Z

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p1, p0, Lqg/A$a;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_6

    return-void

    :cond_6
    invoke-virtual {p0}, Lqg/A$a;->g()V

    return-void

    :catchall_1
    move-exception p2

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p2
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/A$a;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object v0, p0, Lqg/A$a;->g:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lqg/A$a;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lqg/A$a;->e:Lhg/b;

    invoke-virtual {p1}, Lhg/b;->dispose()V

    :cond_0
    invoke-virtual {p0}, Lqg/A$a;->d()V

    :cond_1
    return-void
.end method

.method public request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/A$a;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lqg/A$a;->d()V

    :cond_0
    return-void
.end method
