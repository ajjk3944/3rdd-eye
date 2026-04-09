.class final Lqg/x0$b;
.super Lyg/f;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lqg/x0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final i:LDj/b;

.field final j:Lkg/n;

.field final k:Llg/e;

.field final l:Ljava/util/concurrent/atomic/AtomicReference;

.field final m:Ljava/util/concurrent/atomic/AtomicLong;

.field n:LDj/a;

.field o:J


# direct methods
.method constructor <init>(LDj/b;Lkg/n;LDj/a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lyg/f;-><init>(Z)V

    iput-object p1, p0, Lqg/x0$b;->i:LDj/b;

    iput-object p2, p0, Lqg/x0$b;->j:Lkg/n;

    new-instance p1, Llg/e;

    invoke-direct {p1}, Llg/e;-><init>()V

    iput-object p1, p0, Lqg/x0$b;->k:Llg/e;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/x0$b;->l:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lqg/x0$b;->n:LDj/a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/x0$b;->m:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lqg/x0$b;->m:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/x0$b;->k:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    iget-object v0, p0, Lqg/x0$b;->i:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    iget-object v0, p0, Lqg/x0$b;->k:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lyg/f;->cancel()V

    iget-object v0, p0, Lqg/x0$b;->k:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    return-void
.end method

.method public d(J)V
    .locals 4

    iget-object v0, p0, Lqg/x0$b;->m:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, p1, p2, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lqg/x0$b;->l:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object p1, p0, Lqg/x0$b;->n:LDj/a;

    const/4 p2, 0x0

    iput-object p2, p0, Lqg/x0$b;->n:LDj/a;

    iget-wide v0, p0, Lqg/x0$b;->o:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    invoke-virtual {p0, v0, v1}, Lyg/f;->p(J)V

    :cond_0
    new-instance p2, Lqg/y0$a;

    iget-object v0, p0, Lqg/x0$b;->i:LDj/b;

    invoke-direct {p2, v0, p0}, Lqg/y0$a;-><init>(LDj/b;Lyg/f;)V

    invoke-interface {p1, p2}, LDj/a;->b(LDj/b;)V

    :cond_1
    return-void
.end method

.method public g(JLjava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lqg/x0$b;->m:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, p1, p2, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lqg/x0$b;->l:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object p1, p0, Lqg/x0$b;->i:LDj/b;

    invoke-interface {p1, p3}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p3}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 9

    iget-object v0, p0, Lqg/x0$b;->m:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    iget-object v4, p0, Lqg/x0$b;->m:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v5, 0x1

    add-long v7, v0, v5

    invoke-virtual {v4, v0, v1, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/x0$b;->k:Llg/e;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_1
    iget-wide v0, p0, Lqg/x0$b;->o:J

    add-long/2addr v0, v5

    iput-wide v0, p0, Lqg/x0$b;->o:J

    iget-object v0, p0, Lqg/x0$b;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lqg/x0$b;->j:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The itemTimeoutIndicator returned a null Publisher."

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, LDj/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lqg/x0$a;

    invoke-direct {v0, v7, v8, p0}, Lqg/x0$a;-><init>(JLqg/x0$c;)V

    iget-object v1, p0, Lqg/x0$b;->k:Llg/e;

    invoke-virtual {v1, v0}, Llg/e;->a(Lhg/c;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, LDj/a;->b(LDj/b;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqg/x0$b;->l:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/x0$b;->m:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    iget-object v0, p0, Lqg/x0$b;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/x0$b;->l:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lyg/g;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lyg/f;->r(LDj/c;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lqg/x0$b;->m:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/x0$b;->k:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    iget-object v0, p0, Lqg/x0$b;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lqg/x0$b;->k:Llg/e;

    invoke-virtual {p1}, Llg/e;->dispose()V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method s(LDj/a;)V
    .locals 3

    if-eqz p1, :cond_0

    new-instance v0, Lqg/x0$a;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, p0}, Lqg/x0$a;-><init>(JLqg/x0$c;)V

    iget-object v1, p0, Lqg/x0$b;->k:Llg/e;

    invoke-virtual {v1, v0}, Llg/e;->a(Lhg/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, LDj/a;->b(LDj/b;)V

    :cond_0
    return-void
.end method
