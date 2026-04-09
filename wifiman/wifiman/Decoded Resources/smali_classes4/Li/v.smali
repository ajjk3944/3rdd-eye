.class abstract synthetic LLi/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LLi/y;)LLi/D;
    .locals 2

    new-instance v0, LLi/A;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LLi/A;-><init>(LLi/D;LIi/y0;)V

    return-object v0
.end method

.method public static final b(LLi/z;)LLi/N;
    .locals 2

    new-instance v0, LLi/B;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LLi/B;-><init>(LLi/N;LIi/y0;)V

    return-object v0
.end method

.method private static final c(LLi/g;I)LLi/I;
    .locals 7

    sget-object v0, LKi/g;->P:LKi/g$a;

    invoke-virtual {v0}, LKi/g$a;->a()I

    move-result v0

    invoke-static {p1, v0}, Lsh/m;->d(II)I

    move-result v0

    sub-int/2addr v0, p1

    instance-of v1, p0, LMi/d;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, LMi/d;

    invoke-virtual {v1}, LMi/d;->k()LLi/g;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance p0, LLi/I;

    iget v3, v1, LMi/d;->b:I

    const/4 v4, -0x3

    if-eq v3, v4, :cond_0

    const/4 v4, -0x2

    if-eq v3, v4, :cond_0

    if-eqz v3, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    iget-object v4, v1, LMi/d;->c:LKi/a;

    sget-object v5, LKi/a;->SUSPEND:LKi/a;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_2

    if-nez v3, :cond_3

    :cond_1
    move v0, v6

    goto :goto_0

    :cond_2
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :cond_3
    :goto_0
    iget-object p1, v1, LMi/d;->c:LKi/a;

    iget-object v1, v1, LMi/d;->a:Ldh/i;

    invoke-direct {p0, v2, v0, p1, v1}, LLi/I;-><init>(LLi/g;ILKi/a;Ldh/i;)V

    return-object p0

    :cond_4
    new-instance p1, LLi/I;

    sget-object v1, LKi/a;->SUSPEND:LKi/a;

    sget-object v2, Ldh/j;->a:Ldh/j;

    invoke-direct {p1, p0, v0, v1, v2}, LLi/I;-><init>(LLi/g;ILKi/a;Ldh/i;)V

    return-object p1
.end method

.method private static final d(LIi/N;Ldh/i;LLi/g;LLi/y;LLi/J;Ljava/lang/Object;)LIi/y0;
    .locals 8

    sget-object v0, LLi/J;->a:LLi/J$a;

    invoke-virtual {v0}, LLi/J$a;->c()LLi/J;

    move-result-object v0

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LIi/P;->DEFAULT:LIi/P;

    goto :goto_0

    :cond_0
    sget-object v0, LIi/P;->UNDISPATCHED:LIi/P;

    :goto_0
    new-instance v7, LLi/v$a;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p4

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, LLi/v$a;-><init>(LLi/J;LLi/g;LLi/y;Ljava/lang/Object;Ldh/e;)V

    invoke-static {p0, p1, v0, v7}, LIi/i;->c(LIi/N;Ldh/i;LIi/P;Lmh/p;)LIi/y0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LLi/g;LIi/N;LLi/J;I)LLi/D;
    .locals 8

    invoke-static {p0, p3}, LLi/v;->c(LLi/g;I)LLi/I;

    move-result-object p0

    iget v0, p0, LLi/I;->b:I

    iget-object v1, p0, LLi/I;->c:LKi/a;

    invoke-static {p3, v0, v1}, LLi/F;->a(IILKi/a;)LLi/y;

    move-result-object p3

    iget-object v3, p0, LLi/I;->d:Ldh/i;

    iget-object v4, p0, LLi/I;->a:LLi/g;

    sget-object v7, LLi/F;->a:LNi/C;

    move-object v2, p1

    move-object v5, p3

    move-object v6, p2

    invoke-static/range {v2 .. v7}, LLi/v;->d(LIi/N;Ldh/i;LLi/g;LLi/y;LLi/J;Ljava/lang/Object;)LIi/y0;

    move-result-object p0

    new-instance p1, LLi/A;

    invoke-direct {p1, p3, p0}, LLi/A;-><init>(LLi/D;LIi/y0;)V

    return-object p1
.end method

.method public static synthetic f(LLi/g;LIi/N;LLi/J;IILjava/lang/Object;)LLi/D;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, LLi/i;->K(LLi/g;LIi/N;LLi/J;I)LLi/D;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LLi/g;LIi/N;LLi/J;Ljava/lang/Object;)LLi/N;
    .locals 7

    const/4 v0, 0x1

    invoke-static {p0, v0}, LLi/v;->c(LLi/g;I)LLi/I;

    move-result-object p0

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v6

    iget-object v1, p0, LLi/I;->d:Ldh/i;

    iget-object v2, p0, LLi/I;->a:LLi/g;

    move-object v0, p1

    move-object v3, v6

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LLi/v;->d(LIi/N;Ldh/i;LLi/g;LLi/y;LLi/J;Ljava/lang/Object;)LIi/y0;

    move-result-object p0

    new-instance p1, LLi/B;

    invoke-direct {p1, v6, p0}, LLi/B;-><init>(LLi/N;LIi/y0;)V

    return-object p1
.end method
