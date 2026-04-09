.class abstract synthetic LIi/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LIi/N;Ldh/i;LIi/P;Lmh/p;)LIi/V;
    .locals 1

    invoke-static {p0, p1}, LIi/H;->j(LIi/N;Ldh/i;)Ldh/i;

    move-result-object p0

    invoke-virtual {p2}, LIi/P;->isLazy()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LIi/F0;

    invoke-direct {p1, p0, p3}, LIi/F0;-><init>(Ldh/i;Lmh/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, LIi/W;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LIi/W;-><init>(Ldh/i;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LIi/a;->Q0(LIi/P;Ljava/lang/Object;Lmh/p;)V

    return-object p1
.end method

.method public static synthetic b(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/V;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Ldh/j;->a:Ldh/j;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, LIi/P;->DEFAULT:LIi/P;

    :cond_1
    invoke-static {p0, p1, p2, p3}, LIi/i;->a(LIi/N;Ldh/i;LIi/P;Lmh/p;)LIi/V;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LIi/N;Ldh/i;LIi/P;Lmh/p;)LIi/y0;
    .locals 1

    invoke-static {p0, p1}, LIi/H;->j(LIi/N;Ldh/i;)Ldh/i;

    move-result-object p0

    invoke-virtual {p2}, LIi/P;->isLazy()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LIi/G0;

    invoke-direct {p1, p0, p3}, LIi/G0;-><init>(Ldh/i;Lmh/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, LIi/Q0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LIi/Q0;-><init>(Ldh/i;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LIi/a;->Q0(LIi/P;Ljava/lang/Object;Lmh/p;)V

    return-object p1
.end method

.method public static synthetic d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Ldh/j;->a:Ldh/j;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, LIi/P;->DEFAULT:LIi/P;

    :cond_1
    invoke-static {p0, p1, p2, p3}, LIi/i;->c(LIi/N;Ldh/i;LIi/P;Lmh/p;)LIi/y0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0, p0}, LIi/H;->k(Ldh/i;Ldh/i;)Ldh/i;

    move-result-object p0

    invoke-static {p0}, LIi/A0;->l(Ldh/i;)V

    if-ne p0, v0, :cond_0

    new-instance v0, LNi/y;

    invoke-direct {v0, p0, p2}, LNi/y;-><init>(Ldh/i;Ldh/e;)V

    invoke-static {v0, v0, p1}, LOi/b;->b(LNi/y;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v1, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {p0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v2

    invoke-interface {v0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LIi/Y0;

    invoke-direct {v0, p0, p2}, LIi/Y0;-><init>(Ldh/i;Ldh/e;)V

    invoke-virtual {v0}, LIi/a;->getContext()Ldh/i;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v1}, LNi/J;->i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    invoke-static {v0, v0, p1}, LOi/b;->b(LNi/y;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v1}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p0, v1}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    throw p1

    :cond_1
    new-instance v0, LIi/Z;

    invoke-direct {v0, p0, p2}, LIi/Z;-><init>(Ldh/i;Ldh/e;)V

    invoke-static {p1, v0, v0}, LOi/a;->d(Lmh/p;Ljava/lang/Object;Ldh/e;)V

    invoke-virtual {v0}, LIi/Z;->S0()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_2
    return-object p0
.end method
