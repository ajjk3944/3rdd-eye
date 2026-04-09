.class public abstract LIi/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLdh/e;)Ljava/lang/Object;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_0
    new-instance v0, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    const-wide v1, 0x7fffffffffffffffL

    cmp-long v1, p0, v1

    if-gez v1, :cond_1

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v1

    invoke-static {v1}, LIi/Y;->b(Ldh/i;)LIi/X;

    move-result-object v1

    invoke-interface {v1, p0, p1, v0}, LIi/X;->J(JLIi/n;)V

    :cond_1
    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_2
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final b(Ldh/i;)LIi/X;
    .locals 1

    sget-object v0, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {p0, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p0

    instance-of v0, p0, LIi/X;

    if-eqz v0, :cond_0

    check-cast p0, LIi/X;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, LIi/U;->a()LIi/X;

    move-result-object p0

    :cond_1
    return-object p0
.end method
