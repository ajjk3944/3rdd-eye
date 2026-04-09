.class final Lqg/y0$b;
.super Lyg/f;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lqg/y0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final i:LDj/b;

.field final j:J

.field final k:Ljava/util/concurrent/TimeUnit;

.field final l:Lgg/y$c;

.field final m:Llg/e;

.field final n:Ljava/util/concurrent/atomic/AtomicReference;

.field final o:Ljava/util/concurrent/atomic/AtomicLong;

.field p:J

.field q:LDj/a;


# direct methods
.method constructor <init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;LDj/a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lyg/f;-><init>(Z)V

    iput-object p1, p0, Lqg/y0$b;->i:LDj/b;

    iput-wide p2, p0, Lqg/y0$b;->j:J

    iput-object p4, p0, Lqg/y0$b;->k:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/y0$b;->l:Lgg/y$c;

    iput-object p6, p0, Lqg/y0$b;->q:LDj/a;

    new-instance p1, Llg/e;

    invoke-direct {p1}, Llg/e;-><init>()V

    iput-object p1, p0, Lqg/y0$b;->m:Llg/e;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/y0$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/y0$b;->o:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lqg/y0$b;->o:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/y0$b;->m:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    iget-object v0, p0, Lqg/y0$b;->i:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    iget-object v0, p0, Lqg/y0$b;->l:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lyg/f;->cancel()V

    iget-object v0, p0, Lqg/y0$b;->l:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public d(J)V
    .locals 3

    iget-object v0, p0, Lqg/y0$b;->o:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, p1, p2, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lqg/y0$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-wide p1, p0, Lqg/y0$b;->p:J

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lyg/f;->p(J)V

    :cond_0
    iget-object p1, p0, Lqg/y0$b;->q:LDj/a;

    const/4 p2, 0x0

    iput-object p2, p0, Lqg/y0$b;->q:LDj/a;

    new-instance p2, Lqg/y0$a;

    iget-object v0, p0, Lqg/y0$b;->i:LDj/b;

    invoke-direct {p2, v0, p0}, Lqg/y0$a;-><init>(LDj/b;Lyg/f;)V

    invoke-interface {p1, p2}, LDj/a;->b(LDj/b;)V

    iget-object p1, p0, Lqg/y0$b;->l:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_1
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lqg/y0$b;->o:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lqg/y0$b;->o:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v3, 0x1

    add-long v5, v0, v3

    invoke-virtual {v2, v0, v1, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/y0$b;->m:Llg/e;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-wide v0, p0, Lqg/y0$b;->p:J

    add-long/2addr v0, v3

    iput-wide v0, p0, Lqg/y0$b;->p:J

    iget-object v0, p0, Lqg/y0$b;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    invoke-virtual {p0, v5, v6}, Lqg/y0$b;->s(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/y0$b;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lyg/g;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lyg/f;->r(LDj/c;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lqg/y0$b;->o:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/y0$b;->m:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    iget-object v0, p0, Lqg/y0$b;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lqg/y0$b;->l:Lgg/y$c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method s(J)V
    .locals 4

    iget-object v0, p0, Lqg/y0$b;->m:Llg/e;

    iget-object v1, p0, Lqg/y0$b;->l:Lgg/y$c;

    new-instance v2, Lqg/y0$e;

    invoke-direct {v2, p1, p2, p0}, Lqg/y0$e;-><init>(JLqg/y0$d;)V

    iget-wide p1, p0, Lqg/y0$b;->j:J

    iget-object v3, p0, Lqg/y0$b;->k:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, p1, p2, v3}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Llg/e;->a(Lhg/c;)Z

    return-void
.end method
