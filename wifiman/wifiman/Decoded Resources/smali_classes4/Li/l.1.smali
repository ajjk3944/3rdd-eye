.class abstract synthetic LLi/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LLi/g;Ldh/e;)Ljava/lang/Object;
    .locals 1

    sget-object v0, LMi/q;->a:LMi/q;

    invoke-interface {p0, v0, p1}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final b(LLi/g;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-static {p0, p1}, LLi/i;->E(LLi/g;Lmh/p;)LLi/g;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0, p1}, LLi/i;->d(LLi/g;ILKi/a;ILjava/lang/Object;)LLi/g;

    move-result-object p0

    invoke-static {p0, p2}, LLi/i;->h(LLi/g;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final c(LLi/h;LLi/g;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LLi/i;->v(LLi/h;)V

    invoke-interface {p1, p0, p2}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final d(LLi/g;LIi/N;)LIi/y0;
    .locals 6

    new-instance v3, LLi/l$a;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, LLi/l$a;-><init>(LLi/g;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p0

    return-object p0
.end method
