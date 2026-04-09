.class public abstract LT6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LT6/e;->e(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LT6/e;->i(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LT6/a;Landroidx/compose/ui/e;LS6/k;Lmh/q;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LT6/e;->g(LT6/a;Landroidx/compose/ui/e;LS6/k;Lmh/q;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;LT/l;I)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "imageOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x13ee64de

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    if-nez v2, :cond_5

    invoke-interface {p4, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p5, 0xc00

    if-nez v2, :cond_7

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-ne v2, v3, :cond_9

    invoke-interface {p4}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p4}, LT/l;->C()V

    goto :goto_8

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string/jumbo v3, "com.skydoves.landscapist.components.ComposeFailureStatePlugins (ImageComponentExtensions.kt:75)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    instance-of v0, p0, LT6/f;

    if-eqz v0, :cond_b

    move-object v0, p0

    check-cast v0, LT6/f;

    invoke-virtual {v0}, LT6/f;->a()Ljava/util/List;

    move-result-object v0

    goto :goto_6

    :cond_b
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_6
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_7

    :cond_c
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_8
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_e

    new-instance v6, LT6/b;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LT6/b;-><init>(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;I)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final e(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, LT6/e;->d(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final f(LT6/a;Landroidx/compose/ui/e;LS6/k;Lmh/q;LT/l;I)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "imageOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "executor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5f903d24

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    if-nez v2, :cond_5

    invoke-interface {p4, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p5, 0xc00

    if-nez v2, :cond_7

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-ne v2, v3, :cond_9

    invoke-interface {p4}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p4}, LT/l;->C()V

    goto :goto_8

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string/jumbo v3, "com.skydoves.landscapist.components.ComposeLoadingStatePlugins (ImageComponentExtensions.kt:43)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    instance-of v0, p0, LT6/f;

    if-eqz v0, :cond_b

    move-object v0, p0

    check-cast v0, LT6/f;

    invoke-virtual {v0}, LT6/f;->a()Ljava/util/List;

    move-result-object v0

    goto :goto_6

    :cond_b
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_6
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_7

    :cond_c
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_8
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_e

    new-instance v6, LT6/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LT6/d;-><init>(LT6/a;Landroidx/compose/ui/e;LS6/k;Lmh/q;I)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final g(LT6/a;Landroidx/compose/ui/e;LS6/k;Lmh/q;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, LT6/e;->f(LT6/a;Landroidx/compose/ui/e;LS6/k;Lmh/q;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final h(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;LT/l;I)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "imageOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7717a7a1

    invoke-interface {p5, v0}, LT/l;->r(I)LT/l;

    move-result-object p5

    and-int/lit8 v1, p6, 0x6

    if-nez v1, :cond_1

    invoke-interface {p5, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p6

    goto :goto_1

    :cond_1
    move v1, p6

    :goto_1
    and-int/lit8 v2, p6, 0x30

    if-nez v2, :cond_3

    invoke-interface {p5, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p6, 0x180

    if-nez v2, :cond_5

    invoke-interface {p5, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p6, 0xc00

    if-nez v2, :cond_7

    invoke-interface {p5, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, p6, 0x6000

    if-nez v2, :cond_9

    invoke-interface {p5, p4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    and-int/lit16 v2, v1, 0x2493

    const/16 v3, 0x2492

    if-ne v2, v3, :cond_b

    invoke-interface {p5}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {p5}, LT/l;->C()V

    goto :goto_9

    :cond_b
    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v2, -0x1

    const-string/jumbo v3, "com.skydoves.landscapist.components.ComposeSuccessStatePlugins (ImageComponentExtensions.kt:57)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    instance-of v0, p0, LT6/f;

    if-eqz v0, :cond_d

    move-object v0, p0

    check-cast v0, LT6/f;

    invoke-virtual {v0}, LT6/f;->a()Ljava/util/List;

    move-result-object v0

    goto :goto_7

    :cond_d
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_7
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_8

    :cond_e
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_9
    invoke-interface {p5}, LT/l;->z()LT/X0;

    move-result-object p5

    if-eqz p5, :cond_10

    new-instance v7, LT6/c;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, LT6/c;-><init>(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;I)V

    invoke-interface {p5, v7}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final i(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;ILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, LT/L0;->a(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, LT6/e;->h(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
