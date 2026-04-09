.class public Lxg/k;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# instance fields
.field final a:LDj/b;

.field final b:Lzg/c;

.field final c:Ljava/util/concurrent/atomic/AtomicLong;

.field final d:Ljava/util/concurrent/atomic/AtomicReference;

.field final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field volatile f:Z


# direct methods
.method public constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lxg/k;->a:LDj/b;

    new-instance p1, Lzg/c;

    invoke-direct {p1}, Lzg/c;-><init>()V

    iput-object p1, p0, Lxg/k;->b:Lzg/c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lxg/k;->c:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lxg/k;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lxg/k;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/k;->f:Z

    iget-object v0, p0, Lxg/k;->a:LDj/b;

    iget-object v1, p0, Lxg/k;->b:Lzg/c;

    invoke-static {v0, p0, v1}, Lzg/i;->a(LDj/b;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lxg/k;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lxg/k;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lyg/g;->cancel(Ljava/util/concurrent/atomic/AtomicReference;)Z

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lxg/k;->a:LDj/b;

    iget-object v1, p0, Lxg/k;->b:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->f(LDj/b;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)Z

    return-void
.end method

.method public j(LDj/c;)V
    .locals 3

    iget-object v0, p0, Lxg/k;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxg/k;->a:LDj/b;

    invoke-interface {v0, p0}, LDj/b;->j(LDj/c;)V

    iget-object v0, p0, Lxg/k;->d:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lxg/k;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1}, Lyg/g;->deferredSetOnce(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;LDj/c;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LDj/c;->cancel()V

    invoke-virtual {p0}, Lxg/k;->cancel()V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "\u00a72.12 violated: onSubscribe must be called at most once"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lxg/k;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxg/k;->f:Z

    iget-object v0, p0, Lxg/k;->a:LDj/b;

    iget-object v1, p0, Lxg/k;->b:Lzg/c;

    invoke-static {v0, p1, p0, v1}, Lzg/i;->c(LDj/b;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lzg/c;)V

    return-void
.end method

.method public request(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Lxg/k;->cancel()V

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u00a73.9 violated: positive request amount required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lxg/k;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxg/k;->d:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lxg/k;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1, p2}, Lyg/g;->deferredRequest(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;J)V

    :goto_0
    return-void
.end method
