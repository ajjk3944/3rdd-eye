.class final Lqg/i$i;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation


# instance fields
.field final a:Lqg/i$b;

.field final b:Lzg/c;

.field final c:LDg/f;

.field volatile d:Z


# direct methods
.method constructor <init>(Lqg/i$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/i$i;->a:Lqg/i$b;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lqg/i$i;->b:Lzg/c;

    new-instance p1, LDg/i;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, LDg/i;-><init>(I)V

    iput-object p1, p0, Lqg/i$i;->c:LDg/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    invoke-virtual {v0}, Lqg/i$b;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lqg/i$i;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqg/i$i;->d:Z

    invoke-virtual {p0}, Lqg/i$i;->j()V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Throwable;)Z
    .locals 2

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    invoke-virtual {v0}, Lqg/i$b;->isCancelled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lqg/i$i;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "onError called with a null Throwable."

    invoke-static {p1}, Lzg/h;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Lqg/i$i;->b:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->d(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/i$i;->d:Z

    invoke-virtual {p0}, Lqg/i$i;->j()V

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public d(Lkg/e;)V
    .locals 1

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    invoke-virtual {v0, p1}, Lqg/i$b;->d(Lkg/e;)V

    return-void
.end method

.method public g(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    invoke-virtual {v0, p1}, Lqg/i$b;->g(Lhg/c;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    invoke-virtual {v0}, Lqg/i$b;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lqg/i$i;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const-string p1, "onNext called with a null value."

    invoke-static {p1}, Lzg/h;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqg/i$i;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    invoke-interface {v0, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_3

    return-void

    :cond_2
    iget-object v0, p0, Lqg/i$i;->c:LDg/f;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p0}, Lqg/i$i;->l()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_4
    :goto_0
    return-void
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    invoke-virtual {v0}, Lqg/i$b;->isCancelled()Z

    move-result v0

    return v0
.end method

.method j()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lqg/i$i;->l()V

    :cond_0
    return-void
.end method

.method l()V
    .locals 8

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    iget-object v1, p0, Lqg/i$i;->c:LDg/f;

    iget-object v2, p0, Lqg/i$i;->b:Lzg/c;

    const/4 v3, 0x1

    move v4, v3

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lqg/i$b;->isCancelled()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, LDg/g;->clear()V

    return-void

    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, LDg/g;->clear()V

    invoke-virtual {v2, v0}, Lzg/c;->m(Lgg/h;)V

    return-void

    :cond_2
    iget-boolean v5, p0, Lqg/i$i;->d:Z

    invoke-interface {v1}, LDg/f;->poll()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_3

    move v7, v3

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    if-eqz v5, :cond_4

    if-eqz v7, :cond_4

    invoke-virtual {v0}, Lqg/i$b;->a()V

    return-void

    :cond_4
    if-eqz v7, :cond_5

    neg-int v4, v4

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_5
    invoke-interface {v0, v6}, Lgg/h;->h(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0, p1}, Lqg/i$i;->c(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public serialize()Lgg/j;
    .locals 0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqg/i$i;->a:Lqg/i$b;

    invoke-virtual {v0}, Lqg/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
