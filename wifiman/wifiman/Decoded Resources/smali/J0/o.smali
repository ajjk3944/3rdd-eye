.class public abstract LJ0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LE0/G;Z)LJ0/n;
    .locals 10

    invoke-virtual {p0}, LE0/G;->k0()LE0/a0;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-static {v0}, LE0/a0;->c(LE0/a0;)I

    move-result v2

    and-int/2addr v2, v1

    const/4 v3, 0x0

    if-eqz v2, :cond_8

    invoke-virtual {v0}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_7

    move-object v2, v0

    move-object v4, v3

    :goto_1
    if-eqz v2, :cond_7

    instance-of v5, v2, LE0/v0;

    if-eqz v5, :cond_0

    move-object v3, v2

    goto :goto_4

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v5, v1

    if-eqz v5, :cond_6

    instance-of v5, v2, LE0/m;

    if-eqz v5, :cond_6

    move-object v5, v2

    check-cast v5, LE0/m;

    invoke-virtual {v5}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_2
    const/4 v8, 0x1

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v2, v5

    goto :goto_3

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, LV/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/e$c;

    invoke-direct {v4, v8, v6}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v4, v2}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v2, v3

    :cond_3
    invoke-virtual {v4, v5}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_2

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v4}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_8
    :goto_4
    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, LE0/v0;

    invoke-interface {v3}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {p0}, LE0/G;->I()LJ0/j;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v2, LJ0/n;

    invoke-direct {v2, v0, p1, p0, v1}, LJ0/n;-><init>(Landroidx/compose/ui/e$c;ZLE0/G;LJ0/j;)V

    return-object v2
.end method

.method public static final synthetic b(LJ0/n;)I
    .locals 0

    invoke-static {p0}, LJ0/o;->e(LJ0/n;)I

    move-result p0

    return p0
.end method

.method public static final synthetic c(LJ0/n;)LJ0/g;
    .locals 0

    invoke-static {p0}, LJ0/o;->h(LJ0/n;)LJ0/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LJ0/n;)I
    .locals 0

    invoke-static {p0}, LJ0/o;->i(LJ0/n;)I

    move-result p0

    return p0
.end method

.method private static final e(LJ0/n;)I
    .locals 1

    invoke-virtual {p0}, LJ0/n;->o()I

    move-result p0

    const v0, 0x77359400

    add-int/2addr p0, v0

    return p0
.end method

.method public static final f(LE0/G;Lmh/l;)LE0/G;
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

.method public static final g(LE0/G;)LE0/v0;
    .locals 9

    invoke-virtual {p0}, LE0/G;->k0()LE0/a0;

    move-result-object p0

    const/16 v0, 0x8

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {p0}, LE0/a0;->c(LE0/a0;)I

    move-result v1

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    invoke-virtual {p0}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_8

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move-object v1, p0

    move-object v3, v2

    :goto_1
    if-eqz v1, :cond_7

    instance-of v4, v1, LE0/v0;

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, LE0/v0;

    invoke-interface {v4}, LE0/v0;->S1()Z

    move-result v4

    if-eqz v4, :cond_6

    move-object v2, v1

    goto :goto_4

    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_6

    instance-of v4, v1, LE0/m;

    if-eqz v4, :cond_6

    move-object v4, v1

    check-cast v4, LE0/m;

    invoke-virtual {v4}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    const/4 v7, 0x1

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v1, v4

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, LV/b;

    const/16 v7, 0x10

    new-array v7, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v3, v7, v5}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v3, v1}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v1, v2

    :cond_3
    invoke-virtual {v3, v4}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_2

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v3}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p0

    goto :goto_0

    :cond_8
    :goto_4
    check-cast v2, LE0/v0;

    return-object v2
.end method

.method private static final h(LJ0/n;)LJ0/g;
    .locals 1

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object p0

    sget-object v0, LJ0/q;->a:LJ0/q;

    invoke-virtual {v0}, LJ0/q;->y()LJ0/v;

    move-result-object v0

    invoke-static {p0, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ0/g;

    return-object p0
.end method

.method private static final i(LJ0/n;)I
    .locals 1

    invoke-virtual {p0}, LJ0/n;->o()I

    move-result p0

    const v0, 0x3b9aca00

    add-int/2addr p0, v0

    return p0
.end method
