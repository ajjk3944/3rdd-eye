.class public abstract LIi/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LIi/a0;I)V
    .locals 3

    invoke-virtual {p0}, LIi/a0;->c()Ldh/e;

    move-result-object v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    instance-of v2, v0, LNi/g;

    if-eqz v2, :cond_2

    invoke-static {p1}, LIi/b0;->b(I)Z

    move-result p1

    iget v2, p0, LIi/a0;->c:I

    invoke-static {v2}, LIi/b0;->b(I)Z

    move-result v2

    if-ne p1, v2, :cond_2

    check-cast v0, LNi/g;

    iget-object p1, v0, LNi/g;->d:LIi/J;

    invoke-virtual {v0}, LNi/g;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {p1, v0}, LNi/h;->d(LIi/J;Ldh/i;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, v0, p0}, LNi/h;->c(LIi/J;Ldh/i;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    invoke-static {p0}, LIi/b0;->e(LIi/a0;)V

    goto :goto_1

    :cond_2
    invoke-static {p0, v0, v1}, LIi/b0;->d(LIi/a0;Ldh/e;Z)V

    :goto_1
    return-void
.end method

.method public static final b(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final c(I)Z
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(LIi/a0;Ldh/e;Z)V
    .locals 3

    invoke-virtual {p0}, LIi/a0;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LIi/a0;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object p0, LYg/u;->b:LYg/u$a;

    invoke-static {v1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_0
    sget-object v1, LYg/u;->b:LYg/u$a;

    invoke-virtual {p0, v0}, LIi/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :goto_1
    if-eqz p2, :cond_5

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LNi/g;

    iget-object p2, p1, LNi/g;->e:Ldh/e;

    iget-object v0, p1, LNi/g;->g:Ljava/lang/Object;

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v1

    invoke-static {v1, v0}, LNi/J;->i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LNi/J;->a:LNi/C;

    if-eq v0, v2, :cond_1

    invoke-static {p2, v1, v0}, LIi/H;->m(Ldh/e;Ldh/i;Ljava/lang/Object;)LIi/Y0;

    move-result-object p2

    goto :goto_2

    :cond_1
    const/4 p2, 0x0

    :goto_2
    :try_start_0
    iget-object p1, p1, LNi/g;->e:Ldh/e;

    invoke-interface {p1, p0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, LIi/Y0;->S0()Z

    move-result p0

    if-eqz p0, :cond_6

    :cond_2
    invoke-static {v1, v0}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, LIi/Y0;->S0()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v0}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    :cond_4
    throw p0

    :cond_5
    invoke-interface {p1, p0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    return-void
.end method

.method private static final e(LIi/a0;)V
    .locals 3

    sget-object v0, LIi/U0;->a:LIi/U0;

    invoke-virtual {v0}, LIi/U0;->b()LIi/i0;

    move-result-object v0

    invoke-virtual {v0}, LIi/i0;->w0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, LIi/i0;->s0(LIi/a0;)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LIi/i0;->u0(Z)V

    :try_start_0
    invoke-virtual {p0}, LIi/a0;->c()Ldh/e;

    move-result-object v2

    invoke-static {p0, v2, v1}, LIi/b0;->d(LIi/a0;Ldh/e;Z)V

    :cond_1
    invoke-virtual {v0}, LIi/i0;->z0()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    :goto_0
    invoke-virtual {v0, v1}, LIi/i0;->p0(Z)V

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_1
    invoke-virtual {p0, v2}, LIi/a0;->f(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {v0, v1}, LIi/i0;->p0(Z)V

    throw p0
.end method
