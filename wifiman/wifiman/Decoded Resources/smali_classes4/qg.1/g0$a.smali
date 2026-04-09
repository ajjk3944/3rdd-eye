.class abstract Lqg/g0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lqg/g0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# instance fields
.field final a:Z

.field b:Lqg/g0$d;

.field c:I

.field d:J


# direct methods
.method constructor <init>(Z)V
    .locals 3

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-boolean p1, p0, Lqg/g0$a;->a:Z

    new-instance p1, Lqg/g0$d;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-direct {p1, v0, v1, v2}, Lqg/g0$d;-><init>(Ljava/lang/Object;J)V

    iput-object p1, p0, Lqg/g0$a;->b:Lqg/g0$d;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Throwable;)V
    .locals 5

    invoke-static {p1}, Lzg/j;->error(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lqg/g0$a;->c(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Lqg/g0$d;

    iget-wide v1, p0, Lqg/g0$a;->d:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lqg/g0$a;->d:J

    invoke-direct {v0, p1, v1, v2}, Lqg/g0$d;-><init>(Ljava/lang/Object;J)V

    invoke-virtual {p0, v0}, Lqg/g0$a;->a(Lqg/g0$d;)V

    invoke-virtual {p0}, Lqg/g0$a;->p()V

    return-void
.end method

.method public final S(Lqg/g0$c;)V
    .locals 13

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p1, Lqg/g0$c;->e:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p1, Lqg/g0$c;->f:Z

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    iput-boolean v1, p1, Lqg/g0$c;->e:Z

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide v4, 0x7fffffffffffffffL

    cmp-long v0, v2, v4

    const/4 v4, 0x0

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    invoke-virtual {p1}, Lqg/g0$c;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqg/g0$d;

    const-wide/16 v6, 0x0

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lqg/g0$a;->d()Lqg/g0$d;

    move-result-object v5

    iput-object v5, p1, Lqg/g0$c;->c:Ljava/lang/Object;

    iget-object v8, p1, Lqg/g0$c;->d:Ljava/util/concurrent/atomic/AtomicLong;

    iget-wide v9, v5, Lqg/g0$d;->b:J

    invoke-static {v8, v9, v10}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_2
    move-wide v8, v6

    :goto_2
    cmp-long v10, v2, v6

    const/4 v11, 0x0

    if-eqz v10, :cond_6

    invoke-virtual {p1}, Lqg/g0$c;->isDisposed()Z

    move-result v12

    if-eqz v12, :cond_3

    iput-object v11, p1, Lqg/g0$c;->c:Ljava/lang/Object;

    return-void

    :cond_3
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lqg/g0$d;

    if-eqz v12, :cond_6

    iget-object v5, v12, Lqg/g0$d;->a:Ljava/lang/Object;

    invoke-virtual {p0, v5}, Lqg/g0$a;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :try_start_1
    iget-object v10, p1, Lqg/g0$c;->b:LDj/b;

    invoke-static {v5, v10}, Lzg/j;->accept(Ljava/lang/Object;LDj/b;)Z

    move-result v10

    if-eqz v10, :cond_4

    iput-object v11, p1, Lqg/g0$c;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_4
    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    sub-long/2addr v2, v10

    move-object v5, v12

    goto :goto_2

    :goto_3
    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    iput-object v11, p1, Lqg/g0$c;->c:Ljava/lang/Object;

    invoke-virtual {p1}, Lqg/g0$c;->dispose()V

    invoke-static {v5}, Lzg/j;->isError(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {v5}, Lzg/j;->isComplete(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object p1, p1, Lqg/g0$c;->b:LDj/b;

    invoke-interface {p1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_5
    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_4
    return-void

    :cond_6
    if-nez v10, :cond_7

    invoke-virtual {p1}, Lqg/g0$c;->isDisposed()Z

    move-result v2

    if-eqz v2, :cond_7

    iput-object v11, p1, Lqg/g0$c;->c:Ljava/lang/Object;

    return-void

    :cond_7
    cmp-long v2, v8, v6

    if-eqz v2, :cond_8

    iput-object v5, p1, Lqg/g0$c;->c:Ljava/lang/Object;

    if-nez v0, :cond_8

    invoke-virtual {p1, v8, v9}, Lqg/g0$c;->c(J)J

    :cond_8
    monitor-enter p1

    :try_start_2
    iget-boolean v0, p1, Lqg/g0$c;->f:Z

    if-nez v0, :cond_9

    iput-boolean v4, p1, Lqg/g0$c;->e:Z

    monitor-exit p1

    return-void

    :catchall_2
    move-exception v0

    goto :goto_5

    :cond_9
    iput-boolean v4, p1, Lqg/g0$c;->f:Z

    monitor-exit p1

    goto/16 :goto_0

    :goto_5
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :goto_6
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method final a(Lqg/g0$d;)V
    .locals 1

    iget-object v0, p0, Lqg/g0$a;->b:Lqg/g0$d;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object p1, p0, Lqg/g0$a;->b:Lqg/g0$d;

    iget p1, p0, Lqg/g0$a;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lqg/g0$a;->c:I

    return-void
.end method

.method c(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method d()Lqg/g0$d;
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/g0$d;

    return-object v0
.end method

.method g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method final h()V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/g0$d;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/g0$d;

    if-eqz v0, :cond_0

    iget v1, p0, Lqg/g0$a;->c:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lqg/g0$a;->c:I

    invoke-virtual {p0, v0}, Lqg/g0$a;->j(Lqg/g0$d;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Empty list!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final j(Lqg/g0$d;)V
    .locals 4

    iget-boolean v0, p0, Lqg/g0$a;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lqg/g0$d;

    iget-wide v1, p1, Lqg/g0$d;->b:J

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lqg/g0$d;-><init>(Ljava/lang/Object;J)V

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method final l()V
    .locals 5

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/g0$d;

    iget-object v1, v0, Lqg/g0$d;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    new-instance v1, Lqg/g0$d;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-direct {v1, v2, v3, v4}, Lqg/g0$d;-><init>(Ljava/lang/Object;J)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final m()V
    .locals 6

    invoke-static {}, Lzg/j;->complete()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lqg/g0$a;->c(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lqg/g0$d;

    iget-wide v2, p0, Lqg/g0$a;->d:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lqg/g0$a;->d:J

    invoke-direct {v1, v0, v2, v3}, Lqg/g0$d;-><init>(Ljava/lang/Object;J)V

    invoke-virtual {p0, v1}, Lqg/g0$a;->a(Lqg/g0$d;)V

    invoke-virtual {p0}, Lqg/g0$a;->p()V

    return-void
.end method

.method abstract n()V
.end method

.method public final o(Ljava/lang/Object;)V
    .locals 5

    invoke-static {p1}, Lzg/j;->next(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lqg/g0$a;->c(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Lqg/g0$d;

    iget-wide v1, p0, Lqg/g0$a;->d:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lqg/g0$a;->d:J

    invoke-direct {v0, p1, v1, v2}, Lqg/g0$d;-><init>(Ljava/lang/Object;J)V

    invoke-virtual {p0, v0}, Lqg/g0$a;->a(Lqg/g0$d;)V

    invoke-virtual {p0}, Lqg/g0$a;->n()V

    return-void
.end method

.method p()V
    .locals 0

    invoke-virtual {p0}, Lqg/g0$a;->l()V

    return-void
.end method
