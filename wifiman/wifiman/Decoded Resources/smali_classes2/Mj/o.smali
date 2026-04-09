.class public abstract LMj/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LMj/d;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LMj/o$a;

    invoke-direct {v1, p0}, LMj/o$a;-><init>(LMj/d;)V

    invoke-interface {v0, v1}, LIi/n;->B(Lmh/l;)V

    new-instance v1, LMj/o$b;

    invoke-direct {v1, v0}, LMj/o$b;-><init>(LIi/n;)V

    invoke-interface {p0, v1}, LMj/d;->K0(LMj/f;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p0
.end method

.method public static final b(LMj/d;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LMj/o$c;

    invoke-direct {v1, p0}, LMj/o$c;-><init>(LMj/d;)V

    invoke-interface {v0, v1}, LIi/n;->B(Lmh/l;)V

    new-instance v1, LMj/o$d;

    invoke-direct {v1, v0}, LMj/o$d;-><init>(LIi/n;)V

    invoke-interface {p0, v1}, LMj/d;->K0(LMj/f;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p0
.end method

.method public static final c(LMj/d;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, LMj/o$e;

    invoke-direct {v1, p0}, LMj/o$e;-><init>(LMj/d;)V

    invoke-interface {v0, v1}, LIi/n;->B(Lmh/l;)V

    new-instance v1, LMj/o$f;

    invoke-direct {v1, v0}, LMj/o$f;-><init>(LIi/n;)V

    invoke-interface {p0, v1}, LMj/d;->K0(LMj/f;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p0
.end method

.method public static final d(LMj/d;Ldh/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LMj/o;->b(LMj/d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LMj/o$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LMj/o$g;

    iget v1, v0, LMj/o$g;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LMj/o$g;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LMj/o$g;

    invoke-direct {v0, p1}, LMj/o$g;-><init>(Ldh/e;)V

    :goto_0
    iget-object p1, v0, LMj/o$g;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LMj/o$g;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object p0, v0, LMj/o$g;->a:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LMj/o$g;->a:Ljava/lang/Object;

    iput v3, v0, LMj/o$g;->c:I

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object p1

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v2

    new-instance v3, LMj/o$h;

    invoke-direct {v3, v0, p0}, LMj/o$h;-><init>(Ldh/e;Ljava/lang/Throwable;)V

    invoke-virtual {p1, v2, v3}, LIi/J;->Y(Ldh/i;Ljava/lang/Runnable;)V

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method
