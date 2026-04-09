.class final Lqg/T$b;
.super Lqg/T$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final n:LDg/a;

.field o:J


# direct methods
.method constructor <init>(LDg/a;Lgg/y$c;ZI)V
    .locals 0

    invoke-direct {p0, p2, p3, p4}, Lqg/T$a;-><init>(Lgg/y$c;ZI)V

    iput-object p1, p0, Lqg/T$b;->n:LDg/a;

    return-void
.end method


# virtual methods
.method g()V
    .locals 14

    iget-object v0, p0, Lqg/T$b;->n:LDg/a;

    iget-object v1, p0, Lqg/T$a;->g:LDg/g;

    iget-wide v2, p0, Lqg/T$a;->l:J

    iget-wide v4, p0, Lqg/T$b;->o:J

    const/4 v6, 0x1

    move v7, v6

    :cond_0
    iget-object v8, p0, Lqg/T$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    :cond_1
    :goto_0
    cmp-long v10, v2, v8

    if-eqz v10, :cond_6

    iget-boolean v11, p0, Lqg/T$a;->i:Z

    :try_start_0
    invoke-interface {v1}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v12, :cond_2

    move v13, v6

    goto :goto_1

    :cond_2
    const/4 v13, 0x0

    :goto_1
    invoke-virtual {p0, v11, v13, v0}, Lqg/T$a;->d(ZZLDj/b;)Z

    move-result v11

    if-eqz v11, :cond_3

    return-void

    :cond_3
    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0, v12}, LDg/a;->m(Ljava/lang/Object;)Z

    move-result v10

    const-wide/16 v11, 0x1

    if-eqz v10, :cond_5

    add-long/2addr v2, v11

    :cond_5
    add-long/2addr v4, v11

    iget v10, p0, Lqg/T$a;->d:I

    int-to-long v10, v10

    cmp-long v10, v4, v10

    if-nez v10, :cond_1

    iget-object v10, p0, Lqg/T$a;->f:LDj/c;

    invoke-interface {v10, v4, v5}, LDj/c;->request(J)V

    const-wide/16 v4, 0x0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lig/a;->b(Ljava/lang/Throwable;)V

    iput-boolean v6, p0, Lqg/T$a;->h:Z

    iget-object v3, p0, Lqg/T$a;->f:LDj/c;

    invoke-interface {v3}, LDj/c;->cancel()V

    invoke-interface {v1}, LDg/g;->clear()V

    invoke-interface {v0, v2}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_6
    :goto_2
    if-nez v10, :cond_7

    iget-boolean v8, p0, Lqg/T$a;->i:Z

    invoke-interface {v1}, LDg/g;->isEmpty()Z

    move-result v9

    invoke-virtual {p0, v8, v9, v0}, Lqg/T$a;->d(ZZLDj/b;)Z

    move-result v8

    if-eqz v8, :cond_7

    return-void

    :cond_7
    iput-wide v2, p0, Lqg/T$a;->l:J

    iput-wide v4, p0, Lqg/T$b;->o:J

    neg-int v7, v7

    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v7

    if-nez v7, :cond_0

    return-void
.end method

.method public j(LDj/c;)V
    .locals 3

    iget-object v0, p0, Lqg/T$a;->f:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lqg/T$a;->f:LDj/c;

    instance-of v0, p1, LDg/d;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LDg/d;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, LDg/c;->requestFusion(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v2, p0, Lqg/T$a;->k:I

    iput-object v0, p0, Lqg/T$a;->g:LDg/g;

    iput-boolean v2, p0, Lqg/T$a;->i:Z

    iget-object p1, p0, Lqg/T$b;->n:LDg/a;

    invoke-interface {p1, p0}, Lgg/l;->j(LDj/c;)V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v2, p0, Lqg/T$a;->k:I

    iput-object v0, p0, Lqg/T$a;->g:LDg/g;

    iget-object v0, p0, Lqg/T$b;->n:LDg/a;

    invoke-interface {v0, p0}, Lgg/l;->j(LDj/c;)V

    iget v0, p0, Lqg/T$a;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    return-void

    :cond_1
    new-instance v0, LDg/h;

    iget v1, p0, Lqg/T$a;->c:I

    invoke-direct {v0, v1}, LDg/h;-><init>(I)V

    iput-object v0, p0, Lqg/T$a;->g:LDg/g;

    iget-object v0, p0, Lqg/T$b;->n:LDg/a;

    invoke-interface {v0, p0}, Lgg/l;->j(LDj/c;)V

    iget v0, p0, Lqg/T$a;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_2
    return-void
.end method

.method l()V
    .locals 5

    const/4 v0, 0x1

    move v1, v0

    :cond_0
    iget-boolean v2, p0, Lqg/T$a;->h:Z

    if-eqz v2, :cond_1

    return-void

    :cond_1
    iget-boolean v2, p0, Lqg/T$a;->i:Z

    iget-object v3, p0, Lqg/T$b;->n:LDg/a;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, LDj/b;->h(Ljava/lang/Object;)V

    if-eqz v2, :cond_3

    iput-boolean v0, p0, Lqg/T$a;->h:Z

    iget-object v0, p0, Lqg/T$a;->j:Ljava/lang/Throwable;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lqg/T$b;->n:LDg/a;

    invoke-interface {v1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lqg/T$b;->n:LDg/a;

    invoke-interface {v0}, LDj/b;->a()V

    :goto_0
    iget-object v0, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_3
    neg-int v1, v1

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    if-nez v1, :cond_0

    return-void
.end method

.method n()V
    .locals 10

    iget-object v0, p0, Lqg/T$b;->n:LDg/a;

    iget-object v1, p0, Lqg/T$a;->g:LDg/g;

    iget-wide v2, p0, Lqg/T$a;->l:J

    const/4 v4, 0x1

    move v5, v4

    :cond_0
    iget-object v6, p0, Lqg/T$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v6

    :cond_1
    :goto_0
    cmp-long v8, v2, v6

    if-eqz v8, :cond_4

    :try_start_0
    invoke-interface {v1}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v9, p0, Lqg/T$a;->h:Z

    if-eqz v9, :cond_2

    return-void

    :cond_2
    if-nez v8, :cond_3

    iput-boolean v4, p0, Lqg/T$a;->h:Z

    invoke-interface {v0}, LDj/b;->a()V

    iget-object v0, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_3
    invoke-interface {v0, v8}, LDg/a;->m(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const-wide/16 v8, 0x1

    add-long/2addr v2, v8

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iput-boolean v4, p0, Lqg/T$a;->h:Z

    iget-object v2, p0, Lqg/T$a;->f:LDj/c;

    invoke-interface {v2}, LDj/c;->cancel()V

    invoke-interface {v0, v1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_4
    iget-boolean v6, p0, Lqg/T$a;->h:Z

    if-eqz v6, :cond_5

    return-void

    :cond_5
    invoke-interface {v1}, LDg/g;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    iput-boolean v4, p0, Lqg/T$a;->h:Z

    invoke-interface {v0}, LDj/b;->a()V

    iget-object v0, p0, Lqg/T$a;->a:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_6
    iput-wide v2, p0, Lqg/T$a;->l:J

    neg-int v5, v5

    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v5

    if-nez v5, :cond_0

    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lqg/T$a;->g:LDg/g;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lqg/T$a;->k:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    iget-wide v1, p0, Lqg/T$b;->o:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iget v3, p0, Lqg/T$a;->d:I

    int-to-long v3, v3

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lqg/T$b;->o:J

    iget-object v3, p0, Lqg/T$a;->f:LDj/c;

    invoke-interface {v3, v1, v2}, LDj/c;->request(J)V

    goto :goto_0

    :cond_0
    iput-wide v1, p0, Lqg/T$b;->o:J

    :cond_1
    :goto_0
    return-object v0
.end method
