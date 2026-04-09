.class final Ltg/P$a;
.super Log/b;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Lgg/y$c;

.field final c:Z

.field final d:I

.field e:LDg/g;

.field f:Lhg/c;

.field g:Ljava/lang/Throwable;

.field volatile h:Z

.field volatile i:Z

.field j:I

.field k:Z


# direct methods
.method constructor <init>(Lgg/x;Lgg/y$c;ZI)V
    .locals 0

    invoke-direct {p0}, Log/b;-><init>()V

    iput-object p1, p0, Ltg/P$a;->a:Lgg/x;

    iput-object p2, p0, Ltg/P$a;->b:Lgg/y$c;

    iput-boolean p3, p0, Ltg/P$a;->c:Z

    iput p4, p0, Ltg/P$a;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Ltg/P$a;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/P$a;->h:Z

    invoke-virtual {p0}, Ltg/P$a;->m()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 2

    iget-object v0, p0, Ltg/P$a;->f:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Ltg/P$a;->f:Lhg/c;

    instance-of v0, p1, LDg/b;

    if-eqz v0, :cond_1

    check-cast p1, LDg/b;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, LDg/c;->requestFusion(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Ltg/P$a;->j:I

    iput-object p1, p0, Ltg/P$a;->e:LDg/g;

    iput-boolean v1, p0, Ltg/P$a;->h:Z

    iget-object p1, p0, Ltg/P$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {p0}, Ltg/P$a;->m()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Ltg/P$a;->j:I

    iput-object p1, p0, Ltg/P$a;->e:LDg/g;

    iget-object p1, p0, Ltg/P$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    return-void

    :cond_1
    new-instance p1, LDg/i;

    iget v0, p0, Ltg/P$a;->d:I

    invoke-direct {p1, v0}, LDg/i;-><init>(I)V

    iput-object p1, p0, Ltg/P$a;->e:LDg/g;

    iget-object p1, p0, Ltg/P$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_2
    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Ltg/P$a;->e:LDg/g;

    invoke-interface {v0}, LDg/g;->clear()V

    return-void
.end method

.method d(ZZLgg/x;)Z
    .locals 2

    iget-boolean v0, p0, Ltg/P$a;->i:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Ltg/P$a;->e:LDg/g;

    invoke-interface {p1}, LDg/g;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_4

    iget-object p1, p0, Ltg/P$a;->g:Ljava/lang/Throwable;

    iget-boolean v0, p0, Ltg/P$a;->c:Z

    if-eqz v0, :cond_2

    if-eqz p2, :cond_4

    iput-boolean v1, p0, Ltg/P$a;->i:Z

    if-eqz p1, :cond_1

    invoke-interface {p3, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Lgg/x;->a()V

    :goto_0
    iget-object p1, p0, Ltg/P$a;->b:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return v1

    :cond_2
    if-eqz p1, :cond_3

    iput-boolean v1, p0, Ltg/P$a;->i:Z

    iget-object p2, p0, Ltg/P$a;->e:LDg/g;

    invoke-interface {p2}, LDg/g;->clear()V

    invoke-interface {p3, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Ltg/P$a;->b:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return v1

    :cond_3
    if-eqz p2, :cond_4

    iput-boolean v1, p0, Ltg/P$a;->i:Z

    invoke-interface {p3}, Lgg/x;->a()V

    iget-object p1, p0, Ltg/P$a;->b:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    return v1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Ltg/P$a;->i:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/P$a;->i:Z

    iget-object v0, p0, Ltg/P$a;->f:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/P$a;->b:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-boolean v0, p0, Ltg/P$a;->k:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/P$a;->e:LDg/g;

    invoke-interface {v0}, LDg/g;->clear()V

    :cond_0
    return-void
.end method

.method g()V
    .locals 5

    const/4 v0, 0x1

    move v1, v0

    :cond_0
    iget-boolean v2, p0, Ltg/P$a;->i:Z

    if-eqz v2, :cond_1

    return-void

    :cond_1
    iget-boolean v2, p0, Ltg/P$a;->h:Z

    iget-object v3, p0, Ltg/P$a;->g:Ljava/lang/Throwable;

    iget-boolean v4, p0, Ltg/P$a;->c:Z

    if-nez v4, :cond_2

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    iput-boolean v0, p0, Ltg/P$a;->i:Z

    iget-object v0, p0, Ltg/P$a;->a:Lgg/x;

    iget-object v1, p0, Ltg/P$a;->g:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Ltg/P$a;->b:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_2
    iget-object v3, p0, Ltg/P$a;->a:Lgg/x;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Lgg/x;->h(Ljava/lang/Object;)V

    if-eqz v2, :cond_4

    iput-boolean v0, p0, Ltg/P$a;->i:Z

    iget-object v0, p0, Ltg/P$a;->g:Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    iget-object v1, p0, Ltg/P$a;->a:Lgg/x;

    invoke-interface {v1, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ltg/P$a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    :goto_0
    iget-object v0, p0, Ltg/P$a;->b:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :cond_4
    neg-int v1, v1

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    if-nez v1, :cond_0

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Ltg/P$a;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Ltg/P$a;->j:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Ltg/P$a;->e:LDg/g;

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Ltg/P$a;->m()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ltg/P$a;->i:Z

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Ltg/P$a;->e:LDg/g;

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v0

    return v0
.end method

.method j()V
    .locals 7

    iget-object v0, p0, Ltg/P$a;->e:LDg/g;

    iget-object v1, p0, Ltg/P$a;->a:Lgg/x;

    const/4 v2, 0x1

    move v3, v2

    :cond_0
    iget-boolean v4, p0, Ltg/P$a;->h:Z

    invoke-interface {v0}, LDg/g;->isEmpty()Z

    move-result v5

    invoke-virtual {p0, v4, v5, v1}, Ltg/P$a;->d(ZZLgg/x;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-void

    :cond_1
    :goto_0
    iget-boolean v4, p0, Ltg/P$a;->h:Z

    :try_start_0
    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_2

    move v6, v2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {p0, v4, v6, v1}, Ltg/P$a;->d(ZZLgg/x;)Z

    move-result v4

    if-eqz v4, :cond_3

    return-void

    :cond_3
    if-eqz v6, :cond_4

    neg-int v3, v3

    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    if-nez v3, :cond_0

    return-void

    :cond_4
    invoke-interface {v1, v5}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-static {v3}, Lig/a;->b(Ljava/lang/Throwable;)V

    iput-boolean v2, p0, Ltg/P$a;->i:Z

    iget-object v2, p0, Ltg/P$a;->f:Lhg/c;

    invoke-interface {v2}, Lhg/c;->dispose()V

    invoke-interface {v0}, LDg/g;->clear()V

    invoke-interface {v1, v3}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Ltg/P$a;->b:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method m()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/P$a;->b:Lgg/y$c;

    invoke-virtual {v0, p0}, Lgg/y$c;->b(Ljava/lang/Runnable;)Lhg/c;

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/P$a;->h:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Ltg/P$a;->g:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/P$a;->h:Z

    invoke-virtual {p0}, Ltg/P$a;->m()V

    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltg/P$a;->e:LDg/g;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public requestFusion(I)I
    .locals 1

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/P$a;->k:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public run()V
    .locals 1

    iget-boolean v0, p0, Ltg/P$a;->k:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ltg/P$a;->g()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ltg/P$a;->j()V

    :goto_0
    return-void
.end method
