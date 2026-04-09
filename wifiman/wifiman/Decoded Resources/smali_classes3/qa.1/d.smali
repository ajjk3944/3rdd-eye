.class public abstract Lqa/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lmh/p;Lmh/r;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqa/d;->g(Landroidx/compose/ui/e;Lmh/p;Lmh/r;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/p;Lmh/r;LC0/U;LY0/b;)LC0/D;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqa/d;->e(Lmh/p;Lmh/r;LC0/U;LY0/b;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lqa/d;->f(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;Lmh/p;Lmh/r;LT/l;I)V
    .locals 6

    const-string/jumbo v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "measured"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x353e5486

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    const/16 v4, 0x100

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v4

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    if-ne v2, v5, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_7

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string/jumbo v5, "com.ui.core.ui.theme.util.WithMeasuredView (TextMeasurement.kt:13)"

    invoke-static {v0, v1, v2, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const v0, -0x216459b1

    invoke-interface {p3, v0}, LT/l;->U(I)V

    and-int/lit8 v0, v1, 0x70

    const/4 v2, 0x1

    const/4 v5, 0x0

    if-ne v0, v3, :cond_9

    move v0, v2

    goto :goto_5

    :cond_9
    move v0, v5

    :goto_5
    and-int/lit16 v3, v1, 0x380

    if-ne v3, v4, :cond_a

    goto :goto_6

    :cond_a
    move v2, v5

    :goto_6
    or-int/2addr v0, v2

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_b

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_c

    :cond_b
    new-instance v2, Lqa/a;

    invoke-direct {v2, p1, p2}, Lqa/a;-><init>(Lmh/p;Lmh/r;)V

    invoke-interface {p3, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    and-int/lit8 v0, v1, 0xe

    invoke-static {p0, v2, p3, v0, v5}, Landroidx/compose/ui/layout/w;->a(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_7
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_e

    new-instance v0, Lqa/b;

    invoke-direct {v0, p0, p1, p2, p4}, Lqa/b;-><init>(Landroidx/compose/ui/e;Lmh/p;Lmh/r;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final e(Lmh/p;Lmh/r;LC0/U;LY0/b;)LC0/D;
    .locals 8

    const-string v0, "$this$SubcomposeLayout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqa/d$b;

    invoke-direct {v0, p0}, Lqa/d$b;-><init>(Lmh/p;)V

    const p0, -0x6978be2d

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    const-string/jumbo v0, "sampleText"

    invoke-interface {p2, v0, p0}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC0/B;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {p0, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    invoke-interface {p2, v2}, LY0/d;->x(I)F

    move-result v2

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p0

    invoke-interface {p2, p0}, LY0/d;->x(I)F

    move-result p0

    new-instance v3, Lqa/d$a;

    invoke-direct {v3, p1, v2, p0}, Lqa/d$a;-><init>(Lmh/r;FF)V

    const p0, -0x31b6dab8    # -8.436659E8f

    invoke-static {p0, v1, v3}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p0

    const-string/jumbo p1, "content"

    invoke-interface {p2, p1, p0}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC0/B;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, Lqa/c;

    invoke-direct {v4, p0}, Lqa/c;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Lmh/p;Lmh/r;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lqa/d;->d(Landroidx/compose/ui/e;Lmh/p;Lmh/r;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
