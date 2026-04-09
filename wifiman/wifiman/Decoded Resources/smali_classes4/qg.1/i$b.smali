.class abstract Lqg/i$b;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lgg/j;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Llg/e;


# direct methods
.method constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/i$b;->a:LDj/b;

    new-instance p1, Llg/e;

    invoke-direct {p1}, Llg/e;-><init>()V

    iput-object p1, p0, Lqg/i$b;->b:Llg/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lqg/i$b;->j()V

    return-void
.end method

.method public final c(Ljava/lang/Throwable;)Z
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "tryOnError called with a null Throwable."

    invoke-static {p1}, Lzg/h;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lqg/i$b;->o(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lqg/i$b;->b:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    invoke-virtual {p0}, Lqg/i$b;->n()V

    return-void
.end method

.method public final d(Lkg/e;)V
    .locals 1

    new-instance v0, Llg/a;

    invoke-direct {v0, p1}, Llg/a;-><init>(Lkg/e;)V

    invoke-virtual {p0, v0}, Lqg/i$b;->g(Lhg/c;)V

    return-void
.end method

.method public final g(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lqg/i$b;->b:Llg/e;

    invoke-virtual {v0, p1}, Llg/e;->c(Lhg/c;)Z

    return-void
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lqg/i$b;->b:Llg/e;

    invoke-virtual {v0}, Llg/e;->isDisposed()Z

    move-result v0

    return v0
.end method

.method protected j()V
    .locals 2

    invoke-virtual {p0}, Lqg/i$b;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lqg/i$b;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqg/i$b;->b:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lqg/i$b;->b:Llg/e;

    invoke-virtual {v1}, Llg/e;->dispose()V

    throw v0
.end method

.method protected l(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lqg/i$b;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lqg/i$b;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lqg/i$b;->b:Llg/e;

    invoke-virtual {p1}, Llg/e;->dispose()V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lqg/i$b;->b:Llg/e;

    invoke-virtual {v0}, Llg/e;->dispose()V

    throw p1
.end method

.method m()V
    .locals 0

    return-void
.end method

.method n()V
    .locals 0

    return-void
.end method

.method public o(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lqg/i$b;->l(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "onError called with a null Throwable."

    invoke-static {p1}, Lzg/h;->b(Ljava/lang/String;)Ljava/lang/NullPointerException;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lqg/i$b;->o(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lzg/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lqg/i$b;->m()V

    :cond_0
    return-void
.end method

.method public final serialize()Lgg/j;
    .locals 1

    new-instance v0, Lqg/i$i;

    invoke-direct {v0, p0}, Lqg/i$i;-><init>(Lqg/i$b;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicLong;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s{%s}"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
