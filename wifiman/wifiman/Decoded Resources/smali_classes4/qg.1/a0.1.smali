.class public final Lqg/a0;
.super Ljg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/a0$a;,
        Lqg/a0$b;
    }
.end annotation


# instance fields
.field final b:LDj/a;

.field final c:I

.field final d:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(LDj/a;I)V
    .locals 0

    invoke-direct {p0}, Ljg/a;-><init>()V

    iput-object p1, p0, Lqg/a0;->b:LDj/a;

    iput p2, p0, Lqg/a0;->c:I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 4

    :goto_0
    iget-object v0, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/a0$b;

    if-nez v0, :cond_1

    new-instance v1, Lqg/a0$b;

    iget-object v2, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    iget v3, p0, Lqg/a0;->c:I

    invoke-direct {v1, v2, v3}, Lqg/a0$b;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    iget-object v2, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    new-instance v1, Lqg/a0$a;

    invoke-direct {v1, p1, v0}, Lqg/a0$a;-><init>(LDj/b;Lqg/a0$b;)V

    invoke-interface {p1, v1}, LDj/b;->j(LDj/c;)V

    invoke-virtual {v0, v1}, Lqg/a0$b;->c(Lqg/a0$a;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Lqg/a0$a;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v1}, Lqg/a0$b;->o(Lqg/a0$a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lqg/a0$b;->g()V

    :goto_1
    return-void

    :cond_3
    iget-object p1, v0, Lqg/a0$b;->i:Ljava/lang/Throwable;

    if-eqz p1, :cond_4

    iget-object v0, v1, Lqg/a0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    iget-object p1, v1, Lqg/a0$a;->a:LDj/b;

    invoke-interface {p1}, LDj/b;->a()V

    :goto_2
    return-void
.end method

.method public h2(Lkg/f;)V
    .locals 4

    :goto_0
    iget-object v0, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/a0$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqg/a0$b;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    new-instance v1, Lqg/a0$b;

    iget-object v2, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    iget v3, p0, Lqg/a0;->c:I

    invoke-direct {v1, v2, v3}, Lqg/a0$b;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    iget-object v2, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :cond_2
    iget-object v1, v0, Lqg/a0$b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    iget-object v1, v0, Lqg/a0$b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_3

    move v2, v3

    :cond_3
    :try_start_0
    invoke-interface {p1, v0}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    iget-object p1, p0, Lqg/a0;->b:LDj/a;

    invoke-interface {p1, v0}, LDj/a;->b(LDj/b;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public l2()V
    .locals 3

    iget-object v0, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqg/a0$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqg/a0$b;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lqg/a0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
