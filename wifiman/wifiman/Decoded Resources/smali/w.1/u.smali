.class public abstract Lw/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lw/y;FLr/i;Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lw/u$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lw/u$a;

    iget v1, v0, Lw/u$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/u$a;->c:I

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lw/u$a;

    invoke-direct {v0, p3}, Lw/u$a;-><init>(Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object p3, v4, Lw/u$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v4, Lw/u$a;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p0, v4, Lw/u$a;->a:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/K;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p3, Lkotlin/jvm/internal/K;

    invoke-direct {p3}, Lkotlin/jvm/internal/K;-><init>()V

    new-instance v3, Lw/u$b;

    const/4 v1, 0x0

    invoke-direct {v3, p1, p2, p3, v1}, Lw/u$b;-><init>(FLr/i;Lkotlin/jvm/internal/K;Ldh/e;)V

    iput-object p3, v4, Lw/u$a;->a:Ljava/lang/Object;

    iput v2, v4, Lw/u$a;->c:I

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lw/y;->b(Lw/y;Ls/L;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3

    return-object v0

    :cond_3
    move-object p0, p3

    :goto_2
    iget p0, p0, Lkotlin/jvm/internal/K;->a:F

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lw/y;FLdh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lw/u$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lw/u$c;

    iget v1, v0, Lw/u$c;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/u$c;->c:I

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lw/u$c;

    invoke-direct {v0, p2}, Lw/u$c;-><init>(Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object p2, v4, Lw/u$c;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v4, Lw/u$c;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p0, v4, Lw/u$c;->a:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/K;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/K;

    invoke-direct {p2}, Lkotlin/jvm/internal/K;-><init>()V

    new-instance v3, Lw/u$d;

    const/4 v1, 0x0

    invoke-direct {v3, p2, p1, v1}, Lw/u$d;-><init>(Lkotlin/jvm/internal/K;FLdh/e;)V

    iput-object p2, v4, Lw/u$c;->a:Ljava/lang/Object;

    iput v2, v4, Lw/u$c;->c:I

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lw/y;->b(Lw/y;Ls/L;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3

    return-object v0

    :cond_3
    move-object p0, p2

    :goto_2
    iget p0, p0, Lkotlin/jvm/internal/K;->a:F

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lw/y;Ls/L;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lw/u$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw/u$e;-><init>(Ldh/e;)V

    invoke-interface {p0, p1, v0, p2}, Lw/y;->c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
