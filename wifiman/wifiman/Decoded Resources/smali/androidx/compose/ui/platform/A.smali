.class public abstract Landroidx/compose/ui/platform/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LJ0/a;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/A;->g(LJ0/a;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(LJ0/n;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/A;->h(LJ0/n;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(LJ0/n;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/A;->i(LJ0/n;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(LE0/G;Lmh/l;)LE0/G;
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/A;->j(LE0/G;Lmh/l;)LE0/G;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LJ0/n;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/A;->k(LJ0/n;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(LJ0/n;LJ0/j;)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/A;->l(LJ0/n;LJ0/j;)Z

    move-result p0

    return p0
.end method

.method private static final g(LJ0/a;Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LJ0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v1

    check-cast p1, LJ0/a;

    invoke-virtual {p1}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, LJ0/a;->a()LYg/i;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, LJ0/a;->a()LYg/i;

    move-result-object v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LJ0/a;->a()LYg/i;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p1}, LJ0/a;->a()LYg/i;

    move-result-object p0

    if-nez p0, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method private static final h(LJ0/n;)Z
    .locals 1

    invoke-virtual {p0}, LJ0/n;->n()LJ0/j;

    move-result-object p0

    sget-object v0, LJ0/q;->a:LJ0/q;

    invoke-virtual {v0}, LJ0/q;->f()LJ0/v;

    move-result-object v0

    invoke-virtual {p0, v0}, LJ0/j;->f(LJ0/v;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final i(LJ0/n;)Z
    .locals 4

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->g()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v1}, LJ0/q;->i()LJ0/v;

    move-result-object v3

    invoke-static {v0, v3}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, LJ0/n;->q()LE0/G;

    move-result-object p0

    sget-object v0, Landroidx/compose/ui/platform/A$a;->a:Landroidx/compose/ui/platform/A$a;

    invoke-static {p0, v0}, Landroidx/compose/ui/platform/A;->j(LE0/G;Lmh/l;)LE0/G;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, LE0/G;->I()LJ0/j;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {v1}, LJ0/q;->i()LJ0/v;

    move-result-object v1

    invoke-static {p0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_1
    move p0, v0

    :goto_0
    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    return v2
.end method

.method private static final j(LE0/G;Lmh/l;)LE0/G;
    .locals 1

    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final k(LJ0/n;)Z
    .locals 1

    invoke-virtual {p0}, LJ0/n;->p()LC0/v;

    move-result-object p0

    invoke-interface {p0}, LC0/v;->getLayoutDirection()LY0/t;

    move-result-object p0

    sget-object v0, LY0/t;->Rtl:LY0/t;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final l(LJ0/n;LJ0/j;)Z
    .locals 2

    invoke-virtual {p1}, LJ0/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0}, LJ0/n;->n()LJ0/j;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/v;

    invoke-virtual {v1, v0}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
