.class public abstract LIi/O;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ldh/i;)LIi/N;
    .locals 3

    new-instance v0, LNi/d;

    sget-object v1, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, LIi/A0;->b(LIi/y0;ILjava/lang/Object;)LIi/A;

    move-result-object v1

    invoke-interface {p0, v1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, LNi/d;-><init>(Ldh/i;)V

    return-object v0
.end method

.method public static final b()LIi/N;
    .locals 3

    new-instance v0, LNi/d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LIi/S0;->b(LIi/y0;ILjava/lang/Object;)LIi/A;

    move-result-object v1

    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v2

    invoke-interface {v1, v2}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object v1

    invoke-direct {v0, v1}, LNi/d;-><init>(Ldh/i;)V

    return-object v0
.end method

.method public static final c(LIi/N;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1, p2}, LIi/n0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-static {p0, p1}, LIi/O;->d(LIi/N;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final d(LIi/N;Ljava/util/concurrent/CancellationException;)V
    .locals 2

    invoke-interface {p0}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v0

    sget-object v1, LIi/y0;->O:LIi/y0$b;

    invoke-interface {v0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    check-cast v0, LIi/y0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic e(LIi/N;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LIi/O;->c(LIi/N;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic f(LIi/N;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LIi/O;->d(LIi/N;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final g(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LNi/y;

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LNi/y;-><init>(Ldh/i;Ldh/e;)V

    invoke-static {v0, v0, p0}, LOi/b;->b(LNi/y;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p0
.end method

.method public static final h(LIi/N;)V
    .locals 0

    invoke-interface {p0}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p0

    invoke-static {p0}, LIi/A0;->l(Ldh/i;)V

    return-void
.end method

.method public static final i(LIi/N;)Z
    .locals 1

    invoke-interface {p0}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p0

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p0

    check-cast p0, LIi/y0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LIi/y0;->isActive()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static final j(LIi/N;Ldh/i;)LIi/N;
    .locals 1

    new-instance v0, LNi/d;

    invoke-interface {p0}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p0

    invoke-interface {p0, p1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    invoke-direct {v0, p0}, LNi/d;-><init>(Ldh/i;)V

    return-object v0
.end method
