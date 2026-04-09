.class public abstract Landroidx/lifecycle/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Landroidx/lifecycle/k$b;->INITIALIZED:Landroidx/lifecycle/k$b;

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-ne v0, v1, :cond_0

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_0
    new-instance v0, Landroidx/lifecycle/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/lifecycle/A$a;-><init>(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)V

    invoke-static {v0, p3}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Landroidx/lifecycle/o;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p0

    invoke-static {p0, p1, p2, p3}, Landroidx/lifecycle/A;->a(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
