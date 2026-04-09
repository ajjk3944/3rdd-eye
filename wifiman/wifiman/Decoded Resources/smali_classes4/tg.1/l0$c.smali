.class final Ltg/l0$c;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;
.implements Ltg/l0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Lkg/n;

.field final c:Llg/e;

.field final d:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(Lgg/x;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Ltg/l0$c;->a:Lgg/x;

    iput-object p2, p0, Ltg/l0$c;->b:Lkg/n;

    new-instance p1, Llg/e;

    invoke-direct {p1}, Llg/e;-><init>()V

    iput-object p1, p0, Ltg/l0$c;->c:Llg/e;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/l0$c;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/l0$c;->c:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    iget-object v0, p0, Ltg/l0$c;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/l0$c;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public d(J)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ltg/l0$c;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object p1, p0, Ltg/l0$c;->a:Lgg/x;

    new-instance p2, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p2}, Ljava/util/concurrent/TimeoutException;-><init>()V

    invoke-interface {p1, p2}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/l0$c;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/l0$c;->c:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    return-void
.end method

.method public g(JLjava/lang/Throwable;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ltg/l0$c;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object p1, p0, Ltg/l0$c;->a:Lgg/x;

    invoke-interface {p1, p3}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p3}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 6

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    const-wide/16 v4, 0x1

    add-long/2addr v4, v0

    invoke-virtual {p0, v0, v1, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltg/l0$c;->c:Llg/e;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_1
    iget-object v0, p0, Ltg/l0$c;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Ltg/l0$c;->b:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The itemTimeoutIndicator returned a null ObservableSource."

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Ltg/l0$a;

    invoke-direct {v0, v4, v5, p0}, Ltg/l0$a;-><init>(JLtg/l0$d;)V

    iget-object v1, p0, Ltg/l0$c;->c:Llg/e;

    invoke-virtual {v1, v0}, Llg/e;->a(Lhg/c;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Ltg/l0$c;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    iget-object v0, p0, Ltg/l0$c;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/l0$c;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-static {v0}, Llg/b;->isDisposed(Lhg/c;)Z

    move-result v0

    return v0
.end method

.method j(Lgg/v;)V
    .locals 3

    if-eqz p1, :cond_0

    new-instance v0, Ltg/l0$a;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, p0}, Ltg/l0$a;-><init>(JLtg/l0$d;)V

    iget-object v1, p0, Ltg/l0$c;->c:Llg/e;

    invoke-virtual {v1, v0}, Llg/e;->a(Lhg/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/l0$c;->c:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    iget-object v0, p0, Ltg/l0$c;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
