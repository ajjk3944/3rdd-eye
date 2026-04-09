.class public abstract LMi/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LLi/h;Ldh/i;)LLi/h;
    .locals 0

    invoke-static {p0, p1}, LMi/e;->d(LLi/h;Ldh/i;)LLi/h;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ldh/i;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-static {p0, p2}, LNi/J;->i(Ldh/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :try_start_0
    new-instance v0, LMi/y;

    invoke-direct {v0, p4, p0}, LMi/y;-><init>(Ldh/e;Ldh/i;)V

    instance-of v1, p3, Lkotlin/coroutines/jvm/internal/a;

    if-nez v1, :cond_0

    invoke-static {p3, p1, v0}, Leh/b;->e(Lmh/p;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x2

    invoke-static {p3, v1}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lmh/p;

    invoke-interface {p3, p1, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {p0, p2}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_1

    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_1
    return-object p1

    :goto_1
    invoke-static {p0, p2}, LNi/J;->f(Ldh/i;Ljava/lang/Object;)V

    throw p1
.end method

.method public static synthetic c(Ldh/i;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    invoke-static {p0}, LNi/J;->g(Ldh/i;)Ljava/lang/Object;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LMi/e;->b(Ldh/i;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LLi/h;Ldh/i;)LLi/h;
    .locals 1

    instance-of v0, p0, LMi/x;

    if-nez v0, :cond_1

    instance-of v0, p0, LMi/q;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LMi/A;

    invoke-direct {v0, p0, p1}, LMi/A;-><init>(LLi/h;Ldh/i;)V

    move-object p0, v0

    :cond_1
    :goto_0
    return-object p0
.end method
