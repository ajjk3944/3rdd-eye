.class public abstract LQi/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ldh/i;LLi/g;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2}, LQi/i;->f(Ldh/i;LLi/g;Lgg/t;)V

    return-void
.end method

.method public static final b(LLi/g;Ldh/i;)Lgg/i;
    .locals 0

    invoke-static {p0, p1}, LPi/e;->b(LLi/g;Ldh/i;)LDj/a;

    move-result-object p0

    invoke-static {p0}, Lgg/i;->B0(LDj/a;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Ldh/j;->a:Ldh/j;

    :cond_0
    invoke-static {p0, p1}, LQi/i;->b(LLi/g;Ldh/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LLi/g;Ldh/i;)Lgg/s;
    .locals 1

    new-instance v0, LQi/h;

    invoke-direct {v0, p1, p0}, LQi/h;-><init>(Ldh/i;LLi/g;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/s;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Ldh/j;->a:Ldh/j;

    :cond_0
    invoke-static {p0, p1}, LQi/i;->d(LLi/g;Ldh/i;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ldh/i;LLi/g;Lgg/t;)V
    .locals 4

    sget-object v0, LIi/s0;->a:LIi/s0;

    invoke-static {}, LIi/c0;->d()LIi/J;

    move-result-object v1

    invoke-virtual {v1, p0}, Ldh/a;->plus(Ldh/i;)Ldh/i;

    move-result-object p0

    sget-object v1, LIi/P;->ATOMIC:LIi/P;

    new-instance v2, LQi/i$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p2, v3}, LQi/i$a;-><init>(LLi/g;Lgg/t;Ldh/e;)V

    invoke-static {v0, p0, v1, v2}, LIi/i;->c(LIi/N;Ldh/i;LIi/P;Lmh/p;)LIi/y0;

    move-result-object p0

    new-instance p1, LQi/c;

    invoke-direct {p1, p0}, LQi/c;-><init>(LIi/y0;)V

    invoke-interface {p2, p1}, Lgg/t;->d(Lkg/e;)V

    return-void
.end method
