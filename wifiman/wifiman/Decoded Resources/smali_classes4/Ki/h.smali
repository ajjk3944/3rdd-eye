.class public abstract LKi/h;
.super LIi/a;
.source "SourceFile"

# interfaces
.implements LKi/g;


# instance fields
.field private final d:LKi/g;


# direct methods
.method public constructor <init>(Ldh/i;LKi/g;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p3, p4}, LIi/a;-><init>(Ldh/i;ZZ)V

    iput-object p2, p0, LKi/h;->d:LKi/g;

    return-void
.end method


# virtual methods
.method public E(Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1, v0}, LIi/D0;->G0(LIi/D0;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0, p1}, LKi/v;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0, p1}, LIi/D0;->A(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final R0()LKi/g;
    .locals 0

    return-object p0
.end method

.method protected final S0()LKi/g;
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    return-object v0
.end method

.method public b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0, p1, p2}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0, p1}, LKi/v;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic cancel()V
    .locals 3

    .line 4
    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LIi/D0;->m(LIi/D0;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    .line 5
    invoke-virtual {p0, v0}, LKi/h;->E(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LIi/D0;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 2
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LIi/D0;->m(LIi/D0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    .line 3
    :cond_1
    invoke-virtual {p0, p1}, LKi/h;->E(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 2

    .line 6
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    invoke-static {p0}, LIi/D0;->m(LIi/D0;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LIi/y0;)V

    .line 7
    invoke-virtual {p0, p1}, LKi/h;->E(Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0}, LKi/v;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e(Lmh/l;)V
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0, p1}, LKi/w;->e(Lmh/l;)V

    return-void
.end method

.method public f(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0, p1}, LKi/w;->f(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public i(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0, p1}, LKi/v;->i(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    return-object p1
.end method

.method public iterator()LKi/i;
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0}, LKi/v;->iterator()LKi/i;

    move-result-object v0

    return-object v0
.end method

.method public k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0, p1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, LKi/h;->d:LKi/g;

    invoke-interface {v0}, LKi/w;->l()Z

    move-result v0

    return v0
.end method
