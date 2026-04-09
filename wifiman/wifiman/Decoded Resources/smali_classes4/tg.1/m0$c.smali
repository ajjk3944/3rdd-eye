.class final Ltg/m0$c;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;
.implements Ltg/m0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y$c;

.field final e:Llg/e;

.field final f:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(Lgg/x;JLjava/util/concurrent/TimeUnit;Lgg/y$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Ltg/m0$c;->a:Lgg/x;

    iput-wide p2, p0, Ltg/m0$c;->b:J

    iput-object p4, p0, Ltg/m0$c;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Ltg/m0$c;->d:Lgg/y$c;

    new-instance p1, Llg/e;

    invoke-direct {p1}, Llg/e;-><init>()V

    iput-object p1, p0, Ltg/m0$c;->e:Llg/e;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/m0$c;->f:Ljava/util/concurrent/atomic/AtomicReference;

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

    iget-object v0, p0, Ltg/m0$c;->e:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    iget-object v0, p0, Ltg/m0$c;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    iget-object v0, p0, Ltg/m0$c;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/m0$c;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public d(J)V
    .locals 3

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ltg/m0$c;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object p1, p0, Ltg/m0$c;->a:Lgg/x;

    new-instance p2, Ljava/util/concurrent/TimeoutException;

    iget-wide v0, p0, Ltg/m0$c;->b:J

    iget-object v2, p0, Ltg/m0$c;->c:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lzg/h;->g(JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Ltg/m0$c;->d:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/m0$c;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Ltg/m0$c;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    invoke-virtual {p0, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltg/m0$c;->e:Llg/e;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/m0$c;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    invoke-virtual {p0, v2, v3}, Ltg/m0$c;->j(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/m0$c;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-static {v0}, Llg/b;->isDisposed(Lhg/c;)Z

    move-result v0

    return v0
.end method

.method j(J)V
    .locals 4

    iget-object v0, p0, Ltg/m0$c;->e:Llg/e;

    iget-object v1, p0, Ltg/m0$c;->d:Lgg/y$c;

    new-instance v2, Ltg/m0$e;

    invoke-direct {v2, p1, p2, p0}, Ltg/m0$e;-><init>(JLtg/m0$d;)V

    iget-wide p1, p0, Ltg/m0$c;->b:J

    iget-object v3, p0, Ltg/m0$c;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, p1, p2, v3}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Llg/e;->a(Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/m0$c;->e:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    iget-object v0, p0, Ltg/m0$c;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Ltg/m0$c;->d:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
