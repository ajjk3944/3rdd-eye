.class final Lqg/U$a;
.super Lyg/a;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:LDg/f;

.field final c:Z

.field final d:Lkg/a;

.field final e:Lkg/f;

.field f:LDj/c;

.field volatile g:Z

.field volatile h:Z

.field i:Ljava/lang/Throwable;

.field final j:Ljava/util/concurrent/atomic/AtomicLong;

.field k:Z


# direct methods
.method constructor <init>(LDj/b;IZZLkg/a;Lkg/f;)V
    .locals 1

    invoke-direct {p0}, Lyg/a;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lqg/U$a;->j:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Lqg/U$a;->a:LDj/b;

    iput-object p5, p0, Lqg/U$a;->d:Lkg/a;

    iput-boolean p4, p0, Lqg/U$a;->c:Z

    iput-object p6, p0, Lqg/U$a;->e:Lkg/f;

    if-eqz p3, :cond_0

    new-instance p1, LDg/i;

    invoke-direct {p1, p2}, LDg/i;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, LDg/h;

    invoke-direct {p1, p2}, LDg/h;-><init>(I)V

    :goto_0
    iput-object p1, p0, Lqg/U$a;->b:LDg/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/U$a;->h:Z

    iget-boolean v0, p0, Lqg/U$a;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/U$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lqg/U$a;->g()V

    :goto_0
    return-void
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lqg/U$a;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/U$a;->g:Z

    iget-object v0, p0, Lqg/U$a;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-boolean v0, p0, Lqg/U$a;->k:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg/U$a;->b:LDg/f;

    invoke-interface {v0}, LDg/g;->clear()V

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lqg/U$a;->b:LDg/f;

    invoke-interface {v0}, LDg/g;->clear()V

    return-void
.end method

.method d(ZZLDj/b;)Z
    .locals 2

    iget-boolean v0, p0, Lqg/U$a;->g:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lqg/U$a;->b:LDg/f;

    invoke-interface {p1}, LDg/g;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lqg/U$a;->c:Z

    if-eqz p1, :cond_2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lqg/U$a;->i:Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    invoke-interface {p3, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, LDj/b;->a()V

    :goto_0
    return v1

    :cond_2
    iget-object p1, p0, Lqg/U$a;->i:Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    iget-object p2, p0, Lqg/U$a;->b:LDg/f;

    invoke-interface {p2}, LDg/g;->clear()V

    invoke-interface {p3, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_3
    if-eqz p2, :cond_4

    invoke-interface {p3}, LDj/b;->a()V

    return v1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method g()V
    .locals 14

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lqg/U$a;->b:LDg/f;

    iget-object v1, p0, Lqg/U$a;->a:LDj/b;

    const/4 v2, 0x1

    move v3, v2

    :cond_0
    iget-boolean v4, p0, Lqg/U$a;->h:Z

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v5

    invoke-virtual {p0, v4, v5, v1}, Lqg/U$a;->d(ZZLDj/b;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-void

    :cond_1
    iget-object v4, p0, Lqg/U$a;->j:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    move-wide v8, v6

    :goto_0
    cmp-long v10, v8, v4

    if-eqz v10, :cond_5

    iget-boolean v11, p0, Lqg/U$a;->h:Z

    invoke-interface {v0}, LDg/f;->poll()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_2

    move v13, v2

    goto :goto_1

    :cond_2
    const/4 v13, 0x0

    :goto_1
    invoke-virtual {p0, v11, v13, v1}, Lqg/U$a;->d(ZZLDj/b;)Z

    move-result v11

    if-eqz v11, :cond_3

    return-void

    :cond_3
    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v1, v12}, LDj/b;->h(Ljava/lang/Object;)V

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    goto :goto_0

    :cond_5
    :goto_2
    if-nez v10, :cond_6

    iget-boolean v10, p0, Lqg/U$a;->h:Z

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v11

    invoke-virtual {p0, v10, v11, v1}, Lqg/U$a;->d(ZZLDj/b;)Z

    move-result v10

    if-eqz v10, :cond_6

    return-void

    :cond_6
    cmp-long v6, v8, v6

    if-eqz v6, :cond_7

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v4, v4, v6

    if-eqz v4, :cond_7

    iget-object v4, p0, Lqg/U$a;->j:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long v5, v8

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_7
    neg-int v3, v3

    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    if-nez v3, :cond_0

    :cond_8
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lqg/U$a;->b:LDg/f;

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqg/U$a;->f:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    new-instance v0, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    const-string v1, "Buffer is full"

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lqg/U$a;->d:Lkg/a;

    invoke-interface {v1}, Lkg/a;->run()V

    iget-object v1, p0, Lqg/U$a;->e:Lkg/f;

    invoke-interface {v1, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :goto_0
    invoke-virtual {p0, v0}, Lqg/U$a;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-boolean p1, p0, Lqg/U$a;->k:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lqg/U$a;->a:LDj/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LDj/b;->h(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lqg/U$a;->g()V

    :goto_1
    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lqg/U$a;->b:LDg/f;

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/U$a;->f:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/U$a;->f:LDj/c;

    iget-object v0, p0, Lqg/U$a;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iput-object p1, p0, Lqg/U$a;->i:Ljava/lang/Throwable;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/U$a;->h:Z

    iget-boolean v0, p0, Lqg/U$a;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/U$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lqg/U$a;->g()V

    :goto_0
    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqg/U$a;->b:LDg/f;

    invoke-interface {v0}, LDg/f;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public request(J)V
    .locals 1

    iget-boolean v0, p0, Lqg/U$a;->k:Z

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/U$a;->j:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lqg/U$a;->g()V

    :cond_0
    return-void
.end method

.method public requestFusion(I)I
    .locals 1

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/U$a;->k:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
