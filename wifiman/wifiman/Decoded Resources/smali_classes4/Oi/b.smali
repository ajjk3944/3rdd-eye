.class public abstract LOi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/p;Ljava/lang/Object;Ldh/e;)V
    .locals 3

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Ldh/e;)Ldh/e;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LNi/J;->i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->b(Ldh/e;)V

    instance-of v2, p0, Lkotlin/coroutines/jvm/internal/a;

    if-nez v2, :cond_0

    invoke-static {p0, p1, p2}, Leh/b;->e(Lmh/p;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    const/4 v2, 0x2

    invoke-static {p0, v2}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh/p;

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-static {v0, v1}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-eq p0, p1, :cond_1

    invoke-static {p0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void

    :catchall_1
    move-exception p0

    goto :goto_2

    :goto_1
    :try_start_3
    invoke-static {v0, v1}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    instance-of p1, p0, Lkotlinx/coroutines/DispatchException;

    if-eqz p1, :cond_2

    check-cast p0, Lkotlinx/coroutines/DispatchException;

    invoke-virtual {p0}, Lkotlinx/coroutines/DispatchException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    :cond_2
    sget-object p1, LYg/u;->b:LYg/u$a;

    invoke-static {p0}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public static final b(LNi/y;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x2

    :try_start_0
    instance-of v1, p2, Lkotlin/coroutines/jvm/internal/a;

    if-nez v1, :cond_0

    invoke-static {p2, p1, p0}, Leh/b;->e(Lmh/p;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p2, v0}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lmh/p;

    invoke-interface {p2, p1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    new-instance p2, LIi/C;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v1, v0, v2}, LIi/C;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, p2

    :goto_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p0

    goto :goto_2

    :cond_1
    invoke-virtual {p0, p1}, LIi/D0;->n0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LIi/E0;->b:LNi/C;

    if-ne p1, p2, :cond_2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, LNi/y;->R0()V

    instance-of p0, p1, LIi/C;

    if-nez p0, :cond_3

    invoke-static {p1}, LIi/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    return-object p0

    :cond_3
    check-cast p1, LIi/C;

    iget-object p0, p1, LIi/C;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final c(LNi/y;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x2

    :try_start_0
    instance-of v1, p2, Lkotlin/coroutines/jvm/internal/a;

    if-nez v1, :cond_0

    invoke-static {p2, p1, p0}, Leh/b;->e(Lmh/p;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p2, v0}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lmh/p;

    invoke-interface {p2, p1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    new-instance p2, LIi/C;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v1, v0, v2}, LIi/C;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, p2

    :goto_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p0

    goto :goto_3

    :cond_1
    invoke-virtual {p0, p1}, LIi/D0;->n0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LIi/E0;->b:LNi/C;

    if-ne p2, v0, :cond_2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p0

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, LNi/y;->R0()V

    instance-of v0, p2, LIi/C;

    if-eqz v0, :cond_5

    check-cast p2, LIi/C;

    iget-object p2, p2, LIi/C;->a:Ljava/lang/Throwable;

    instance-of v0, p2, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Lkotlinx/coroutines/TimeoutCancellationException;

    iget-object v0, v0, Lkotlinx/coroutines/TimeoutCancellationException;->a:LIi/y0;

    if-ne v0, p0, :cond_4

    instance-of p0, p1, LIi/C;

    if-nez p0, :cond_3

    goto :goto_2

    :cond_3
    check-cast p1, LIi/C;

    iget-object p0, p1, LIi/C;->a:Ljava/lang/Throwable;

    throw p0

    :cond_4
    throw p2

    :cond_5
    invoke-static {p2}, LIi/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    move-object p0, p1

    :goto_3
    return-object p0
.end method
