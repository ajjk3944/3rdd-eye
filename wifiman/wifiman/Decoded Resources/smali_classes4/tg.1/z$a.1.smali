.class final Ltg/z$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/z$a$a;
    }
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Z

.field final c:Lhg/b;

.field final d:Ljava/util/concurrent/atomic/AtomicInteger;

.field final e:Lzg/c;

.field final f:Lkg/n;

.field final g:Ljava/util/concurrent/atomic/AtomicReference;

.field h:Lhg/c;

.field volatile i:Z


# direct methods
.method constructor <init>(Lgg/x;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/z$a;->a:Lgg/x;

    iput-object p2, p0, Ltg/z$a;->f:Lkg/n;

    iput-boolean p3, p0, Ltg/z$a;->b:Z

    new-instance p1, Lhg/b;

    invoke-direct {p1}, Lhg/b;-><init>()V

    iput-object p1, p0, Ltg/z$a;->c:Lhg/b;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Ltg/z$a;->e:Lzg/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Ltg/z$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/z$a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ltg/z$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    invoke-virtual {p0}, Ltg/z$a;->g()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/z$a;->h:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/z$a;->h:Lhg/c;

    iget-object p1, p0, Ltg/z$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method d()V
    .locals 1

    iget-object v0, p0, Ltg/z$a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDg/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDg/i;->clear()V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/z$a;->i:Z

    iget-object v0, p0, Ltg/z$a;->h:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/z$a;->c:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->dispose()V

    iget-object v0, p0, Ltg/z$a;->e:Lzg/c;

    invoke-virtual {v0}, Lzg/c;->h()V

    return-void
.end method

.method g()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ltg/z$a;->j()V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ltg/z$a;->f:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null SingleSource"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/D;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ltg/z$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    new-instance v0, Ltg/z$a$a;

    invoke-direct {v0, p0}, Ltg/z$a$a;-><init>(Ltg/z$a;)V

    iget-boolean v1, p0, Ltg/z$a;->i:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ltg/z$a;->c:Lhg/b;

    invoke-virtual {v1, v0}, Lhg/b;->a(Lhg/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lgg/D;->a(Lgg/B;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Ltg/z$a;->h:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0, p1}, Ltg/z$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ltg/z$a;->i:Z

    return v0
.end method

.method j()V
    .locals 8

    iget-object v0, p0, Ltg/z$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/z$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, p0, Ltg/z$a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v3, 0x1

    move v4, v3

    :cond_0
    :goto_0
    iget-boolean v5, p0, Ltg/z$a;->i:Z

    if-eqz v5, :cond_1

    invoke-virtual {p0}, Ltg/z$a;->d()V

    return-void

    :cond_1
    iget-boolean v5, p0, Ltg/z$a;->b:Z

    if-nez v5, :cond_2

    iget-object v5, p0, Ltg/z$a;->e:Lzg/c;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Throwable;

    if-eqz v5, :cond_2

    invoke-virtual {p0}, Ltg/z$a;->d()V

    iget-object v1, p0, Ltg/z$a;->e:Lzg/c;

    invoke-virtual {v1, v0}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_3

    move v5, v3

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LDg/i;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v7

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    :goto_2
    if-nez v7, :cond_5

    move v6, v3

    :cond_5
    if-eqz v5, :cond_6

    if-eqz v6, :cond_6

    iget-object v0, p0, Ltg/z$a;->e:Lzg/c;

    iget-object v1, p0, Ltg/z$a;->a:Lgg/x;

    invoke-virtual {v0, v1}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_6
    if-eqz v6, :cond_7

    neg-int v4, v4

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_7
    invoke-interface {v0, v7}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method m()LDg/i;
    .locals 3

    iget-object v0, p0, Ltg/z$a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDg/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LDg/i;

    invoke-static {}, Lgg/s;->e()I

    move-result v1

    invoke-direct {v0, v1}, LDg/i;-><init>(I)V

    iget-object v1, p0, Ltg/z$a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Ltg/z$a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDg/i;

    return-object v0
.end method

.method o(Ltg/z$a$a;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/z$a;->c:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->c(Lhg/c;)Z

    iget-object p1, p0, Ltg/z$a;->e:Lzg/c;

    invoke-virtual {p1, p2}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Ltg/z$a;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Ltg/z$a;->h:Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    iget-object p1, p0, Ltg/z$a;->c:Lhg/b;

    invoke-virtual {p1}, Lhg/b;->dispose()V

    :cond_0
    iget-object p1, p0, Ltg/z$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    invoke-virtual {p0}, Ltg/z$a;->g()V

    :cond_1
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/z$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object v0, p0, Ltg/z$a;->e:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Ltg/z$a;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Ltg/z$a;->c:Lhg/b;

    invoke-virtual {p1}, Lhg/b;->dispose()V

    :cond_0
    invoke-virtual {p0}, Ltg/z$a;->g()V

    :cond_1
    return-void
.end method

.method s(Ltg/z$a$a;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ltg/z$a;->c:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->c(Lhg/c;)Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ltg/z$a;->a:Lgg/x;

    invoke-interface {v1, p2}, Lgg/x;->h(Ljava/lang/Object;)V

    iget-object p2, p0, Ltg/z$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p2

    if-nez p2, :cond_0

    move p1, v0

    :cond_0
    iget-object p2, p0, Ltg/z$a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LDg/i;

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LDg/i;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, Ltg/z$a;->e:Lzg/c;

    iget-object p2, p0, Ltg/z$a;->a:Lgg/x;

    invoke-virtual {p1, p2}, Lzg/c;->n(Lgg/x;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_3
    invoke-virtual {p0}, Ltg/z$a;->m()LDg/i;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, p2}, LDg/i;->offer(Ljava/lang/Object;)Z

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ltg/z$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0}, Ltg/z$a;->j()V

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method
