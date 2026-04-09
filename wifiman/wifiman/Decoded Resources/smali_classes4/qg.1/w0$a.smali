.class final Lqg/w0$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y$c;

.field final e:Z

.field final f:Ljava/util/concurrent/atomic/AtomicReference;

.field final g:Ljava/util/concurrent/atomic/AtomicLong;

.field final h:Lkg/f;

.field i:LDj/c;

.field volatile j:Z

.field k:Ljava/lang/Throwable;

.field volatile l:Z

.field volatile m:Z

.field n:J

.field o:Z


# direct methods
.method constructor <init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;ZLkg/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/w0$a;->a:LDj/b;

    iput-wide p2, p0, Lqg/w0$a;->b:J

    iput-object p4, p0, Lqg/w0$a;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/w0$a;->d:Lgg/y$c;

    iput-boolean p6, p0, Lqg/w0$a;->e:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/w0$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/w0$a;->g:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p7, p0, Lqg/w0$a;->h:Lkg/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/w0$a;->j:Z

    invoke-virtual {p0}, Lqg/w0$a;->d()V

    return-void
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Lqg/w0$a;->h:Lkg/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/w0$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v1, p0, Lqg/w0$a;->h:Lkg/f;

    invoke-interface {v1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/w0$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/w0$a;->l:Z

    iget-object v0, p0, Lqg/w0$a;->i:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/w0$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqg/w0$a;->c()V

    :cond_0
    return-void
.end method

.method d()V
    .locals 13

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqg/w0$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lqg/w0$a;->g:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v2, p0, Lqg/w0$a;->a:LDj/b;

    const/4 v3, 0x1

    move v4, v3

    :cond_1
    :goto_0
    iget-boolean v5, p0, Lqg/w0$a;->l:Z

    if-eqz v5, :cond_2

    invoke-virtual {p0}, Lqg/w0$a;->c()V

    return-void

    :cond_2
    iget-boolean v5, p0, Lqg/w0$a;->j:Z

    iget-object v6, p0, Lqg/w0$a;->k:Ljava/lang/Throwable;

    const/4 v7, 0x0

    if-eqz v5, :cond_5

    if-eqz v6, :cond_5

    iget-object v1, p0, Lqg/w0$a;->h:Lkg/f;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    :try_start_0
    iget-object v1, p0, Lqg/w0$a;->h:Lkg/f;

    invoke-interface {v1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lio/reactivex/rxjava3/exceptions/CompositeException;

    filled-new-array {v6, v0}, [Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v0}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    move-object v6, v1

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    invoke-interface {v2, v6}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/w0$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    const/4 v8, 0x0

    if-nez v6, :cond_6

    move v6, v3

    goto :goto_2

    :cond_6
    move v6, v8

    :goto_2
    const-wide/16 v9, 0x1

    if-eqz v5, :cond_b

    if-nez v6, :cond_a

    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-boolean v3, p0, Lqg/w0$a;->e:Z

    if-eqz v3, :cond_8

    iget-wide v3, p0, Lqg/w0$a;->n:J

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    add-long/2addr v3, v9

    iput-wide v3, p0, Lqg/w0$a;->n:J

    invoke-interface {v2, v0}, LDj/b;->h(Ljava/lang/Object;)V

    invoke-interface {v2}, LDj/b;->a()V

    goto :goto_4

    :cond_7
    invoke-virtual {p0, v0}, Lqg/w0$a;->g(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lqg/w0$a;->h:Lkg/f;

    if-eqz v1, :cond_9

    :try_start_1
    invoke-interface {v1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {v2, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/w0$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_9
    :goto_3
    invoke-interface {v2}, LDj/b;->a()V

    goto :goto_4

    :cond_a
    invoke-interface {v2}, LDj/b;->a()V

    :goto_4
    iget-object v0, p0, Lqg/w0$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_b
    if-eqz v6, :cond_c

    iget-boolean v5, p0, Lqg/w0$a;->m:Z

    if-eqz v5, :cond_d

    iput-boolean v8, p0, Lqg/w0$a;->o:Z

    iput-boolean v8, p0, Lqg/w0$a;->m:Z

    goto :goto_5

    :cond_c
    iget-boolean v5, p0, Lqg/w0$a;->o:Z

    if-eqz v5, :cond_e

    iget-boolean v5, p0, Lqg/w0$a;->m:Z

    if-eqz v5, :cond_d

    goto :goto_6

    :cond_d
    :goto_5
    neg-int v4, v4

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_1

    return-void

    :cond_e
    :goto_6
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iget-wide v6, p0, Lqg/w0$a;->n:J

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v11

    cmp-long v11, v6, v11

    if-eqz v11, :cond_f

    invoke-interface {v2, v5}, LDj/b;->h(Ljava/lang/Object;)V

    add-long/2addr v6, v9

    iput-wide v6, p0, Lqg/w0$a;->n:J

    iput-boolean v8, p0, Lqg/w0$a;->m:Z

    iput-boolean v3, p0, Lqg/w0$a;->o:Z

    iget-object v5, p0, Lqg/w0$a;->d:Lgg/y$c;

    iget-wide v6, p0, Lqg/w0$a;->b:J

    iget-object v8, p0, Lqg/w0$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, p0, v6, v7, v8}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    goto/16 :goto_0

    :cond_f
    iget-object v0, p0, Lqg/w0$a;->i:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    invoke-virtual {p0, v5}, Lqg/w0$a;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lqg/w0$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method g(Ljava/lang/Object;)V
    .locals 4

    invoke-static {}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;->a()Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    move-result-object v0

    iget-object v1, p0, Lqg/w0$a;->h:Lkg/f;

    if-eqz v1, :cond_0

    :try_start_0
    invoke-interface {v1, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lio/reactivex/rxjava3/exceptions/CompositeException;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Throwable;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    invoke-direct {v1, v2}, Lio/reactivex/rxjava3/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    move-object v0, v1

    :cond_0
    :goto_0
    iget-object p1, p0, Lqg/w0$a;->a:LDj/b;

    invoke-interface {p1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqg/w0$a;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lqg/w0$a;->h:Lkg/f;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/w0$a;->i:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iput-object p1, p0, Lqg/w0$a;->k:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/w0$a;->j:Z

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lqg/w0$a;->d()V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/w0$a;->i:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/w0$a;->i:LDj/c;

    iget-object v0, p0, Lqg/w0$a;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lqg/w0$a;->k:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/w0$a;->j:Z

    invoke-virtual {p0}, Lqg/w0$a;->d()V

    return-void
.end method

.method public request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/w0$a;->g:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_0
    return-void
.end method

.method public run()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/w0$a;->m:Z

    invoke-virtual {p0}, Lqg/w0$a;->d()V

    return-void
.end method
