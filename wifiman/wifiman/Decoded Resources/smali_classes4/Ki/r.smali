.class public abstract LKi/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LKi/t;Lmh/a;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LKi/r$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LKi/r$a;

    iget v1, v0, LKi/r$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LKi/r$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LKi/r$a;

    invoke-direct {v0, p2}, LKi/r$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object p2, v0, LKi/r$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LKi/r$a;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LKi/r$a;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lmh/a;

    iget-object p0, v0, LKi/r$a;->a:Ljava/lang/Object;

    check-cast p0, LKi/t;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object p2

    sget-object v2, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p2, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p2

    if-ne p2, p0, :cond_5

    :try_start_1
    iput-object p0, v0, LKi/r$a;->a:Ljava/lang/Object;

    iput-object p1, v0, LKi/r$a;->b:Ljava/lang/Object;

    iput v3, v0, LKi/r$a;->d:I

    new-instance p2, LIi/p;

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v2

    invoke-direct {p2, v2, v3}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {p2}, LIi/p;->A()V

    new-instance v2, LKi/r$b;

    invoke-direct {v2, p2}, LKi/r$b;-><init>(LIi/n;)V

    invoke-interface {p0, v2}, LKi/w;->e(Lmh/l;)V

    invoke-virtual {p2}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p0, p2, :cond_3

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :goto_2
    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "awaitClose() can only be invoked from the producer context"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LIi/N;Ldh/i;ILKi/a;LIi/P;Lmh/l;Lmh/p;)LKi/v;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p2, p3, v0, v1, v0}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object p2

    invoke-static {p0, p1}, LIi/H;->j(LIi/N;Ldh/i;)Ldh/i;

    move-result-object p0

    new-instance p1, LKi/s;

    invoke-direct {p1, p0, p2}, LKi/s;-><init>(Ldh/i;LKi/g;)V

    if-eqz p5, :cond_0

    invoke-virtual {p1, p5}, LIi/D0;->invokeOnCompletion(Lmh/l;)LIi/e0;

    :cond_0
    invoke-virtual {p1, p4, p1, p6}, LIi/a;->Q0(LIi/P;Ljava/lang/Object;Lmh/p;)V

    return-object p1
.end method

.method public static final c(LIi/N;Ldh/i;ILmh/p;)LKi/v;
    .locals 7

    sget-object v3, LKi/a;->SUSPEND:LKi/a;

    sget-object v4, LIi/P;->DEFAULT:LIi/P;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, LKi/r;->b(LIi/N;Ldh/i;ILKi/a;LIi/P;Lmh/l;Lmh/p;)LKi/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LIi/N;Ldh/i;ILKi/a;LIi/P;Lmh/l;Lmh/p;ILjava/lang/Object;)LKi/v;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    sget-object p1, Ldh/j;->a:Ldh/j;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move v2, p2

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    sget-object p3, LKi/a;->SUSPEND:LKi/a;

    :cond_2
    move-object v3, p3

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    sget-object p4, LIi/P;->DEFAULT:LIi/P;

    :cond_3
    move-object v4, p4

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    const/4 p5, 0x0

    :cond_4
    move-object v5, p5

    move-object v0, p0

    move-object v6, p6

    invoke-static/range {v0 .. v6}, LKi/r;->b(LIi/N;Ldh/i;ILKi/a;LIi/P;Lmh/l;Lmh/p;)LKi/v;

    move-result-object p0

    return-object p0
.end method
