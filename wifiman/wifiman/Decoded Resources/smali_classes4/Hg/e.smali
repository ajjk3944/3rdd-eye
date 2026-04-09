.class public final LHg/e;
.super LHg/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHg/e$a;
    }
.end annotation


# instance fields
.field final a:LDg/i;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;

.field final c:Ljava/util/concurrent/atomic/AtomicReference;

.field final d:Z

.field volatile e:Z

.field volatile f:Z

.field g:Ljava/lang/Throwable;

.field final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final i:Log/b;

.field j:Z


# direct methods
.method constructor <init>(ILjava/lang/Runnable;Z)V
    .locals 1

    invoke-direct {p0}, LHg/d;-><init>()V

    new-instance v0, LDg/i;

    invoke-direct {v0, p1}, LDg/i;-><init>(I)V

    iput-object v0, p0, LHg/e;->a:LDg/i;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LHg/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    iput-boolean p3, p0, LHg/e;->d:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, LHg/e;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, LHg/e$a;

    invoke-direct {p1, p0}, LHg/e$a;-><init>(LHg/e;)V

    iput-object p1, p0, LHg/e;->i:Log/b;

    return-void
.end method

.method public static j1(ILjava/lang/Runnable;)LHg/e;
    .locals 2

    const-string v0, "capacityHint"

    invoke-static {p0, v0}, Lmg/b;->b(ILjava/lang/String;)I

    const-string v0, "onTerminate"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, LHg/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, LHg/e;-><init>(ILjava/lang/Runnable;Z)V

    return-object v0
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 3

    iget-object v0, p0, LHg/e;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LHg/e;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LHg/e;->i:Log/b;

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object v0, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-boolean p1, p0, LHg/e;->e:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, LHg/e;->l1()V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only a single observer allowed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    :goto_0
    return-void
.end method

.method public a()V
    .locals 1

    iget-boolean v0, p0, LHg/e;->f:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LHg/e;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LHg/e;->f:Z

    invoke-virtual {p0}, LHg/e;->k1()V

    invoke-virtual {p0}, LHg/e;->l1()V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-boolean v0, p0, LHg/e;->f:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LHg/e;->e:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_1
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "onNext called with a null value."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p0, LHg/e;->f:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LHg/e;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LHg/e;->a:LDg/i;

    invoke-virtual {v0, p1}, LDg/i;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LHg/e;->l1()V

    :cond_1
    :goto_0
    return-void
.end method

.method k1()V
    .locals 3

    iget-object v0, p0, LHg/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, LHg/e;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method l1()V
    .locals 2

    iget-object v0, p0, LHg/e;->i:Log/b;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/x;

    const/4 v1, 0x1

    :goto_0
    if-eqz v0, :cond_2

    iget-boolean v1, p0, LHg/e;->j:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, LHg/e;->m1(Lgg/x;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0}, LHg/e;->n1(Lgg/x;)V

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, LHg/e;->i:Log/b;

    neg-int v1, v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/x;

    goto :goto_0
.end method

.method m1(Lgg/x;)V
    .locals 6

    iget-object v0, p0, LHg/e;->a:LDg/i;

    iget-boolean v1, p0, LHg/e;->d:Z

    const/4 v2, 0x1

    :cond_0
    iget-boolean v3, p0, LHg/e;->e:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object p1, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-boolean v3, p0, LHg/e;->f:Z

    if-nez v1, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {p0, v0, p1}, LHg/e;->p1(LDg/g;Lgg/x;)Z

    move-result v5

    if-eqz v5, :cond_2

    return-void

    :cond_2
    invoke-interface {p1, v4}, Lgg/x;->h(Ljava/lang/Object;)V

    if-eqz v3, :cond_3

    invoke-virtual {p0, p1}, LHg/e;->o1(Lgg/x;)V

    return-void

    :cond_3
    iget-object v3, p0, LHg/e;->i:Log/b;

    neg-int v2, v2

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v2

    if-nez v2, :cond_0

    return-void
.end method

.method n1(Lgg/x;)V
    .locals 9

    iget-object v0, p0, LHg/e;->a:LDg/i;

    iget-boolean v1, p0, LHg/e;->d:Z

    const/4 v2, 0x1

    move v3, v2

    move v4, v3

    :cond_0
    :goto_0
    iget-boolean v5, p0, LHg/e;->e:Z

    if-eqz v5, :cond_1

    iget-object p1, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-interface {v0}, LDg/g;->clear()V

    return-void

    :cond_1
    iget-boolean v5, p0, LHg/e;->f:Z

    iget-object v6, p0, LHg/e;->a:LDg/i;

    invoke-virtual {v6}, LDg/i;->poll()Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v6, :cond_2

    move v8, v2

    goto :goto_1

    :cond_2
    move v8, v7

    :goto_1
    if-eqz v5, :cond_5

    if-nez v1, :cond_4

    if-eqz v3, :cond_4

    invoke-virtual {p0, v0, p1}, LHg/e;->p1(LDg/g;Lgg/x;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-void

    :cond_3
    move v3, v7

    :cond_4
    if-eqz v8, :cond_5

    invoke-virtual {p0, p1}, LHg/e;->o1(Lgg/x;)V

    return-void

    :cond_5
    if-eqz v8, :cond_6

    iget-object v5, p0, LHg/e;->i:Log/b;

    neg-int v4, v4

    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_6
    invoke-interface {p1, v6}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method o1(Lgg/x;)V
    .locals 2

    iget-object v0, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, LHg/e;->g:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lgg/x;->a()V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "onError called with a null Throwable."

    invoke-static {p1, v0}, Lzg/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p0, LHg/e;->f:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LHg/e;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, LHg/e;->g:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, LHg/e;->f:Z

    invoke-virtual {p0}, LHg/e;->k1()V

    invoke-virtual {p0}, LHg/e;->l1()V

    return-void

    :cond_1
    :goto_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void
.end method

.method p1(LDg/g;Lgg/x;)Z
    .locals 3

    iget-object v0, p0, LHg/e;->g:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    iget-object v1, p0, LHg/e;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-interface {p1}, LDg/g;->clear()V

    invoke-interface {p2, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
