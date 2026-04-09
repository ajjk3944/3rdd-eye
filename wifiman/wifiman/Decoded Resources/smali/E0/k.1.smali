.class public abstract LE0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LV/b;Landroidx/compose/ui/e$c;)V
    .locals 0

    invoke-static {p0, p1}, LE0/k;->c(LV/b;Landroidx/compose/ui/e$c;)V

    return-void
.end method

.method public static final synthetic b(LV/b;)Landroidx/compose/ui/e$c;
    .locals 0

    invoke-static {p0}, LE0/k;->g(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LV/b;Landroidx/compose/ui/e$c;)V
    .locals 2

    invoke-static {p1}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->w0()LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v0

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v1, p1, v0

    check-cast v1, LE0/G;

    invoke-virtual {v1}, LE0/G;->k0()LE0/a0;

    move-result-object v1

    invoke-virtual {v1}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {p0, v1}, LV/b;->b(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_0

    :cond_1
    return-void
.end method

.method public static final d(Landroidx/compose/ui/e$c;)LE0/B;
    .locals 4

    const/4 v0, 0x2

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v1, v2

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    instance-of v1, p0, LE0/B;

    if-eqz v1, :cond_0

    check-cast p0, LE0/B;

    return-object p0

    :cond_0
    instance-of v1, p0, LE0/m;

    if-eqz v1, :cond_3

    check-cast p0, LE0/m;

    invoke-virtual {p0}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_3

    instance-of v1, p0, LE0/B;

    if-eqz v1, :cond_1

    check-cast p0, LE0/B;

    return-object p0

    :cond_1
    instance-of v1, p0, LE0/m;

    if-eqz v1, :cond_2

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    check-cast p0, LE0/m;

    invoke-virtual {p0}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p0

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public static final e(LE0/j;I)Z
    .locals 0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->a2()I

    move-result p0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final f(LE0/j;)Z
    .locals 1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final g(LV/b;)Landroidx/compose/ui/e$c;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LV/b;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LV/b;->o()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LV/b;->z(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/e$c;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static final h(LE0/j;I)LE0/c0;
    .locals 2

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->c2()LE0/c0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v1

    if-eq v1, p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LE0/f0;->i(I)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final i(LE0/j;)LY0/d;
    .locals 0

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-virtual {p0}, LE0/G;->K()LY0/d;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LE0/j;)Lm0/H0;
    .locals 0

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object p0

    invoke-interface {p0}, LE0/m0;->getGraphicsContext()Lm0/H0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(LE0/j;)LC0/r;
    .locals 1

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cannot get LayoutCoordinates, Modifier.Node is not attached."

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object p0

    invoke-virtual {p0}, LE0/c0;->c1()LC0/r;

    move-result-object p0

    invoke-interface {p0}, LC0/r;->M()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "LayoutCoordinates is not attached."

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    return-object p0
.end method

.method public static final l(LE0/j;)LY0/t;
    .locals 0

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-virtual {p0}, LE0/G;->getLayoutDirection()LY0/t;

    move-result-object p0

    return-object p0
.end method

.method public static final m(LE0/j;)LE0/G;
    .locals 0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->c2()LE0/c0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LE0/c0;->G1()LE0/G;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "Cannot obtain node coordinator. Is the Modifier.Node attached?"

    invoke-static {p0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final n(LE0/j;)LE0/m0;
    .locals 0

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-virtual {p0}, LE0/G;->n0()LE0/m0;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "This node does not have an owner."

    invoke-static {p0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method
