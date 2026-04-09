.class public final Ltg/S;
.super LBg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/S$a;,
        Ltg/S$b;
    }
.end annotation


# instance fields
.field final a:Lgg/v;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Lgg/v;)V
    .locals 0

    invoke-direct {p0}, LBg/a;-><init>()V

    iput-object p1, p0, Ltg/S;->a:Lgg/v;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 3

    :goto_0
    iget-object v0, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/S$b;

    if-nez v0, :cond_1

    new-instance v1, Ltg/S$b;

    iget-object v2, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, v2}, Ltg/S$b;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    iget-object v2, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    new-instance v1, Ltg/S$a;

    invoke-direct {v1, p1, v0}, Ltg/S$a;-><init>(Lgg/x;Ltg/S$b;)V

    invoke-interface {p1, v1}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v0, v1}, Ltg/S$b;->d(Ltg/S$a;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ltg/S$a;->isDisposed()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v1}, Ltg/S$b;->g(Ltg/S$a;)V

    :cond_2
    return-void

    :cond_3
    iget-object v0, v0, Ltg/S$b;->d:Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    invoke-interface {p1, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Lgg/x;->a()V

    :goto_1
    return-void
.end method

.method public k1(Lkg/f;)V
    .locals 4

    :goto_0
    iget-object v0, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/S$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ltg/S$b;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    new-instance v1, Ltg/S$b;

    iget-object v2, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, v2}, Ltg/S$b;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    iget-object v2, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :cond_2
    iget-object v1, v0, Ltg/S$b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    iget-object v1, v0, Ltg/S$b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

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

    iget-object p1, p0, Ltg/S;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lzg/h;->h(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public o1()V
    .locals 3

    iget-object v0, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/S$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ltg/S$b;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ltg/S;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
