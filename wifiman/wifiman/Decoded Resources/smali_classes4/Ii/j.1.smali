.class abstract synthetic LIi/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ldh/i;Lmh/p;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    sget-object v1, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {p0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v1

    check-cast v1, Ldh/f;

    if-nez v1, :cond_0

    sget-object v1, LIi/U0;->a:LIi/U0;

    invoke-virtual {v1}, LIi/U0;->b()LIi/i0;

    move-result-object v1

    sget-object v2, LIi/s0;->a:LIi/s0;

    invoke-interface {p0, v1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    invoke-static {v2, p0}, LIi/H;->j(LIi/N;Ldh/i;)Ldh/i;

    move-result-object p0

    goto :goto_3

    :cond_0
    instance-of v2, v1, LIi/i0;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, LIi/i0;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {v1}, LIi/i0;->A0()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v3, v1

    :cond_2
    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v3

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v1, LIi/U0;->a:LIi/U0;

    invoke-virtual {v1}, LIi/U0;->a()LIi/i0;

    move-result-object v1

    :goto_2
    sget-object v2, LIi/s0;->a:LIi/s0;

    invoke-static {v2, p0}, LIi/H;->j(LIi/N;Ldh/i;)Ldh/i;

    move-result-object p0

    :goto_3
    new-instance v2, LIi/g;

    invoke-direct {v2, p0, v0, v1}, LIi/g;-><init>(Ldh/i;Ljava/lang/Thread;LIi/i0;)V

    sget-object p0, LIi/P;->DEFAULT:LIi/P;

    invoke-virtual {v2, p0, v2, p1}, LIi/a;->Q0(LIi/P;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v2}, LIi/g;->R0()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ldh/i;Lmh/p;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Ldh/j;->a:Ldh/j;

    :cond_0
    invoke-static {p0, p1}, LIi/i;->e(Ldh/i;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
