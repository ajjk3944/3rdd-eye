.class public final LFg/e;
.super LFg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFg/e$a;
    }
.end annotation


# instance fields
.field final b:LDg/i;

.field final c:Ljava/util/concurrent/atomic/AtomicReference;

.field final d:Z

.field volatile e:Z

.field f:Ljava/lang/Throwable;

.field final g:Ljava/util/concurrent/atomic/AtomicReference;

.field volatile h:Z

.field final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final j:Lyg/a;

.field final k:Ljava/util/concurrent/atomic/AtomicLong;

.field l:Z


# direct methods
.method constructor <init>(ILjava/lang/Runnable;Z)V
    .locals 1

    invoke-direct {p0}, LFg/b;-><init>()V

    new-instance v0, LDg/i;

    invoke-direct {v0, p1}, LDg/i;-><init>(I)V

    iput-object v0, p0, LFg/e;->b:LDg/i;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LFg/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iput-boolean p3, p0, LFg/e;->d:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, LFg/e;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, LFg/e$a;

    invoke-direct {p1, p0}, LFg/e$a;-><init>(LFg/e;)V

    iput-object p1, p0, LFg/e;->j:Lyg/a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, LFg/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public static j2()LFg/e;
    .locals 4

    new-instance v0, LFg/e;

    invoke-static {}, Lgg/i;->i()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, LFg/e;-><init>(ILjava/lang/Runnable;Z)V

    return-object v0
.end method

.method public static k2(I)LFg/e;
    .locals 3

    const-string v0, "capacityHint"

    invoke-static {p0, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, LFg/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, LFg/e;-><init>(ILjava/lang/Runnable;Z)V

    return-object v0
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, LFg/e;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LFg/e;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LFg/e;->j:Lyg/a;

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    iget-object v0, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-boolean p1, p0, LFg/e;->h:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LFg/e;->m2()V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This processor allows only a single Subscriber"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    :goto_0
    return-void
.end method

.method public a()V
    .locals 1

    iget-boolean v0, p0, LFg/e;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LFg/e;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LFg/e;->e:Z

    invoke-virtual {p0}, LFg/e;->l2()V

    invoke-virtual {p0}, LFg/e;->m2()V

    :cond_1
    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "onNext called with a null value."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p0, LFg/e;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LFg/e;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LFg/e;->b:LDg/i;

    invoke-virtual {v0, p1}, LDg/i;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LFg/e;->m2()V

    :cond_1
    :goto_0
    return-void
.end method

.method i2(ZZZLDj/b;LDg/i;)Z
    .locals 3

    iget-boolean v0, p0, LFg/e;->h:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p5}, LDg/i;->clear()V

    iget-object p1, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return v1

    :cond_0
    if-eqz p2, :cond_3

    if-eqz p1, :cond_1

    iget-object p1, p0, LFg/e;->f:Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    invoke-virtual {p5}, LDg/i;->clear()V

    iget-object p1, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object p1, p0, LFg/e;->f:Ljava/lang/Throwable;

    invoke-interface {p4, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_1
    if-eqz p3, :cond_3

    iget-object p1, p0, LFg/e;->f:Ljava/lang/Throwable;

    iget-object p2, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, v2}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    invoke-interface {p4, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    invoke-interface {p4}, LDj/b;->a()V

    :goto_0
    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-boolean v0, p0, LFg/e;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LFg/e;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, LDj/c;->cancel()V

    :goto_1
    return-void
.end method

.method l2()V
    .locals 2

    iget-object v0, p0, LFg/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method m2()V
    .locals 2

    iget-object v0, p0, LFg/e;->j:Lyg/a;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDj/b;

    const/4 v1, 0x1

    :goto_0
    if-eqz v0, :cond_2

    iget-boolean v1, p0, LFg/e;->l:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, LFg/e;->n2(LDj/b;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0}, LFg/e;->o2(LDj/b;)V

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, LFg/e;->j:Lyg/a;

    neg-int v1, v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDj/b;

    goto :goto_0
.end method

.method n2(LDj/b;)V
    .locals 6

    iget-object v0, p0, LFg/e;->b:LDg/i;

    iget-boolean v1, p0, LFg/e;->d:Z

    const/4 v2, 0x1

    :cond_0
    iget-boolean v3, p0, LFg/e;->h:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object p1, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-boolean v3, p0, LFg/e;->e:Z

    if-nez v1, :cond_2

    if-eqz v3, :cond_2

    iget-object v5, p0, LFg/e;->f:Ljava/lang/Throwable;

    if-eqz v5, :cond_2

    invoke-virtual {v0}, LDg/i;->clear()V

    iget-object v0, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, LFg/e;->f:Ljava/lang/Throwable;

    invoke-interface {p1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    invoke-interface {p1, v4}, LDj/b;->h(Ljava/lang/Object;)V

    if-eqz v3, :cond_4

    iget-object v0, p0, LFg/e;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, LFg/e;->f:Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    invoke-interface {p1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    invoke-interface {p1}, LDj/b;->a()V

    :goto_0
    return-void

    :cond_4
    iget-object v3, p0, LFg/e;->j:Lyg/a;

    neg-int v2, v2

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v2

    if-nez v2, :cond_0

    return-void
.end method

.method o2(LDj/b;)V
    .locals 17

    move-object/from16 v6, p0

    iget-object v7, v6, LFg/e;->b:LDg/i;

    iget-boolean v0, v6, LFg/e;->d:Z

    const/4 v8, 0x1

    xor-int/lit8 v9, v0, 0x1

    move v10, v8

    :goto_0
    iget-object v0, v6, LFg/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v11

    const-wide/16 v4, 0x0

    :goto_1
    cmp-long v15, v11, v4

    if-eqz v15, :cond_3

    iget-boolean v2, v6, LFg/e;->e:Z

    invoke-virtual {v7}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    move/from16 v16, v8

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    move/from16 v16, v0

    :goto_2
    move-object/from16 v0, p0

    move v1, v9

    move-object v8, v3

    move/from16 v3, v16

    move-wide v13, v4

    move-object/from16 v4, p1

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, LFg/e;->i2(ZZZLDj/b;LDg/i;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    if-eqz v16, :cond_2

    :goto_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_2
    move-object/from16 v5, p1

    invoke-interface {v5, v8}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v0, 0x1

    add-long/2addr v0, v13

    move-wide v4, v0

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    move-wide v13, v4

    goto :goto_3

    :goto_4
    if-nez v15, :cond_4

    iget-boolean v2, v6, LFg/e;->e:Z

    invoke-virtual {v7}, LDg/i;->isEmpty()Z

    move-result v3

    move-object/from16 v0, p0

    move v1, v9

    move-object/from16 v4, p1

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, LFg/e;->i2(ZZZLDj/b;LDg/i;)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    const-wide/16 v0, 0x0

    cmp-long v0, v13, v0

    if-eqz v0, :cond_5

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, v11, v0

    if-eqz v0, :cond_5

    iget-object v0, v6, LFg/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v1, v13

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_5
    iget-object v0, v6, LFg/e;->j:Lyg/a;

    neg-int v1, v10

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v10

    if-nez v10, :cond_6

    return-void

    :cond_6
    const/4 v8, 0x1

    goto :goto_0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "onError called with a null Throwable."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p0, LFg/e;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LFg/e;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, LFg/e;->f:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, LFg/e;->e:Z

    invoke-virtual {p0}, LFg/e;->l2()V

    invoke-virtual {p0}, LFg/e;->m2()V

    return-void

    :cond_1
    :goto_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void
.end method
