.class public abstract LIi/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ldh/e;)Ljava/lang/Object;
    .locals 4

    invoke-interface {p0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0}, LIi/A0;->l(Ldh/i;)V

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    instance-of v2, v1, LNi/g;

    if-eqz v2, :cond_0

    check-cast v1, LNi/g;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_2

    :cond_1
    iget-object v2, v1, LNi/g;->d:LIi/J;

    invoke-static {v2, v0}, LNi/h;->d(LIi/J;Ldh/i;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, LYg/J;->a:LYg/J;

    invoke-virtual {v1, v0, v2}, LNi/g;->j(Ldh/i;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance v2, LIi/b1;

    invoke-direct {v2}, LIi/b1;-><init>()V

    invoke-interface {v0, v2}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object v0

    sget-object v3, LYg/J;->a:LYg/J;

    invoke-virtual {v1, v0, v3}, LNi/g;->j(Ldh/i;Ljava/lang/Object;)V

    iget-boolean v0, v2, LIi/b1;->b:Z

    if-eqz v0, :cond_4

    invoke-static {v1}, LNi/h;->e(LNi/g;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v3

    goto :goto_2

    :cond_4
    :goto_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_5
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p0

    if-ne v0, p0, :cond_6

    return-object v0

    :cond_6
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
