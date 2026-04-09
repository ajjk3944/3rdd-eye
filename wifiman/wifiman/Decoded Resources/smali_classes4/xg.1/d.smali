.class public abstract Lxg/d;
.super Lxg/h;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lzg/m;


# instance fields
.field protected final c:LDj/b;

.field protected final d:LDg/f;

.field protected volatile e:Z

.field protected volatile f:Z

.field protected g:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(LDj/b;LDg/f;)V
    .locals 0

    invoke-direct {p0}, Lxg/h;-><init>()V

    iput-object p1, p0, Lxg/d;->c:LDj/b;

    iput-object p2, p0, Lxg/d;->d:LDg/f;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lxg/d;->f:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lxg/d;->e:Z

    return v0
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Lxg/g;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(I)I
    .locals 1

    iget-object v0, p0, Lxg/i;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result p1

    return p1
.end method

.method public final error()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lxg/d;->g:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final f(J)J
    .locals 1

    iget-object v0, p0, Lxg/g;->b:Ljava/util/concurrent/atomic/AtomicLong;

    neg-long p1, p1

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public abstract g(LDj/b;Ljava/lang/Object;)Z
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lxg/i;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k()Z
    .locals 3

    iget-object v0, p0, Lxg/i;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lxg/i;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method protected final o(Ljava/lang/Object;ZLhg/c;)V
    .locals 6

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    iget-object v1, p0, Lxg/d;->d:LDg/f;

    invoke-virtual {p0}, Lxg/d;->k()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lxg/g;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, v0, p1}, Lxg/d;->g(LDj/b;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide v4, 0x7fffffffffffffffL

    cmp-long p1, v2, v4

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x1

    invoke-virtual {p0, v2, v3}, Lxg/d;->f(J)J

    :cond_0
    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lxg/d;->e(I)I

    move-result p1

    if-nez p1, :cond_3

    return-void

    :cond_1
    invoke-interface {p3}, Lhg/c;->dispose()V

    invoke-static {}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;->a()Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    move-result-object p1

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    invoke-interface {v1, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lxg/d;->i()Z

    move-result p1

    if-nez p1, :cond_3

    return-void

    :cond_3
    invoke-static {v1, v0, p2, p3, p0}, Lzg/n;->b(LDg/f;LDj/b;ZLhg/c;Lzg/m;)V

    return-void
.end method

.method protected final q(Ljava/lang/Object;ZLhg/c;)V
    .locals 6

    iget-object v0, p0, Lxg/d;->c:LDj/b;

    iget-object v1, p0, Lxg/d;->d:LDg/f;

    invoke-virtual {p0}, Lxg/d;->k()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lxg/g;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, LDg/g;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, v0, p1}, Lxg/d;->g(LDj/b;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide v4, 0x7fffffffffffffffL

    cmp-long p1, v2, v4

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x1

    invoke-virtual {p0, v2, v3}, Lxg/d;->f(J)J

    :cond_0
    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lxg/d;->e(I)I

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_1
    invoke-interface {v1, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lxg/d;->e:Z

    invoke-interface {p3}, Lhg/c;->dispose()V

    invoke-static {}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;->a()Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    move-result-object p1

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    invoke-interface {v1, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lxg/d;->i()Z

    move-result p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    :goto_0
    invoke-static {v1, v0, p2, p3, p0}, Lzg/n;->b(LDg/f;LDj/b;ZLhg/c;Lzg/m;)V

    return-void
.end method

.method public final s(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxg/g;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_0
    return-void
.end method
