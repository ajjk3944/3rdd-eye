.class public abstract LL9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LL9/q;->o(Lmh/p;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/q;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LL9/q;->j(Lmh/q;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p14}, LL9/q;->s(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LL9/q;->n(Lmh/p;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;JJFFLmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p11}, LL9/q;->l(Landroidx/compose/ui/e;JJFFLmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LL9/q;->q(Lmh/p;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lmh/q;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LL9/q;->i(Lmh/q;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lmh/q;LT/l;I)V
    .locals 5

    const v0, -0x1e22ccd7

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.toolbar.Actions (UiToolbarBase.kt:170)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    if-nez p0, :cond_7

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, LL9/m;

    invoke-direct {v0, p0, p2}, LL9/m;-><init>(Lmh/q;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void

    :cond_7
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v0

    sget-object v1, LN/r;->a:LN/r;

    sget v2, LN/r;->b:I

    invoke-virtual {v1, p1, v2}, LN/r;->c(LT/l;I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    new-instance v1, LL9/q$a;

    invoke-direct {v1, p0}, LL9/q$a;-><init>(Lmh/q;)V

    const/16 v2, 0x36

    const v3, 0x74f697e9

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p1, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p1, v2}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, LL9/n;

    invoke-direct {v0, p0, p2}, LL9/n;-><init>(Lmh/q;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_9
    return-void
.end method

.method private static final i(Lmh/q;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LL9/q;->h(Lmh/q;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Lmh/q;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LL9/q;->h(Lmh/q;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/e;JJFFLmh/q;LT/l;II)V
    .locals 22

    move-object/from16 v8, p7

    move/from16 v9, p9

    const v0, -0x3de14f7d

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p10, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v9, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v9

    :goto_1
    and-int/lit8 v5, p10, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-wide/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_3

    move-wide/from16 v5, p1

    invoke-interface {v1, v5, v6}, LT/l;->j(J)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, p10, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v4, v4, 0x180

    move-wide/from16 v14, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v9, 0x180

    move-wide/from16 v14, p3

    if-nez v7, :cond_8

    invoke-interface {v1, v14, v15}, LT/l;->j(J)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, p10, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v7, p5

    goto :goto_7

    :cond_a
    and-int/lit16 v7, v9, 0xc00

    if-nez v7, :cond_9

    move/from16 v7, p5

    invoke-interface {v1, v7}, LT/l;->g(F)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v4, v10

    :goto_7
    and-int/lit8 v10, p10, 0x10

    if-eqz v10, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v11, p6

    goto :goto_9

    :cond_d
    and-int/lit16 v11, v9, 0x6000

    if-nez v11, :cond_c

    move/from16 v11, p6

    invoke-interface {v1, v11}, LT/l;->g(F)Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4000

    goto :goto_8

    :cond_e
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v4, v12

    :goto_9
    and-int/lit8 v12, p10, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_f

    or-int/2addr v4, v13

    goto :goto_b

    :cond_f
    and-int v12, v9, v13

    if-nez v12, :cond_11

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v12, 0x10000

    :goto_a
    or-int/2addr v4, v12

    :cond_11
    :goto_b
    const v12, 0x12493

    and-int/2addr v12, v4

    const v13, 0x12492

    if-ne v12, v13, :cond_13

    invoke-interface {v1}, LT/l;->v()Z

    move-result v12

    if-nez v12, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v3

    goto :goto_f

    :cond_13
    :goto_c
    if-eqz v2, :cond_14

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_14
    move-object v2, v3

    :goto_d
    if-eqz v10, :cond_15

    sget-object v3, LL9/w;->a:LL9/w;

    invoke-virtual {v3}, LL9/w;->d()F

    move-result v3

    goto :goto_e

    :cond_15
    move v3, v11

    :goto_e
    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_16

    const/4 v10, -0x1

    const-string/jumbo v11, "com.ui.core.ui.component.toolbar.AppBar (UiToolbarBase.kt:191)"

    invoke-static {v0, v4, v10, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_16
    new-instance v0, LL9/q$b;

    invoke-direct {v0, v3, v8}, LL9/q$b;-><init>(FLmh/q;)V

    const/16 v10, 0x36

    const v11, 0x7d1f10bf

    const/4 v12, 0x1

    invoke-static {v11, v12, v0, v1, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v18

    and-int/lit8 v0, v4, 0xe

    const/high16 v10, 0x180000

    or-int/2addr v0, v10

    shl-int/lit8 v10, v4, 0x3

    and-int/lit16 v11, v10, 0x380

    or-int/2addr v0, v11

    and-int/lit16 v10, v10, 0x1c00

    or-int/2addr v0, v10

    const/high16 v10, 0x70000

    shl-int/lit8 v4, v4, 0x6

    and-int/2addr v4, v10

    or-int v20, v0, v4

    const/16 v21, 0x12

    const/4 v11, 0x0

    const/16 v16, 0x0

    move-object v10, v2

    move-wide/from16 v12, p1

    move-wide/from16 v14, p3

    move/from16 v17, p5

    move-object/from16 v19, v1

    invoke-static/range {v10 .. v21}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LT/o;->P()V

    :cond_17
    move v11, v3

    :goto_f
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_18

    new-instance v13, LL9/o;

    move-object v0, v13

    move-object v1, v2

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move v7, v11

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LL9/o;-><init>(Landroidx/compose/ui/e;JJFFLmh/q;II)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_18
    return-void
.end method

.method private static final l(Landroidx/compose/ui/e;JJFFLmh/q;IILT/l;I)LYg/J;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v10

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p10

    move/from16 v11, p9

    invoke-static/range {v1 .. v11}, LL9/q;->k(Landroidx/compose/ui/e;JJFFLmh/q;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final m(Lmh/p;LT/l;I)V
    .locals 8

    const v0, -0x729467a5

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.toolbar.Navigation (UiToolbarBase.kt:127)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    if-nez p0, :cond_7

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, LL9/k;

    invoke-direct {v0, p0, p2}, LL9/k;-><init>(Lmh/p;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void

    :cond_7
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->h()Lf0/c;

    move-result-object v0

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v0

    invoke-static {p1, v3}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {p1, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {p1, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_9
    invoke-interface {p1}, LT/l;->I()V

    :goto_3
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v0, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v6, v4, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_a

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v6, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v0

    sget-object v2, LN/r;->a:LN/r;

    sget v3, LN/r;->b:I

    invoke-virtual {v2, p1, v3}, LN/r;->c(LT/l;I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v2}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    sget v2, LT/I0;->i:I

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    invoke-static {v0, p0, p1, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_4
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, LL9/l;

    invoke-direct {v0, p0, p2}, LL9/l;-><init>(Lmh/p;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final n(Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LL9/q;->m(Lmh/p;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final o(Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LL9/q;->m(Lmh/p;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p(Lmh/p;LT/l;I)V
    .locals 5

    const v0, -0x5f14027d

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.toolbar.Title (UiToolbarBase.kt:140)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p1, v1}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v0

    invoke-virtual {v0}, Lpa/c;->a()Lpa/b;

    move-result-object v0

    invoke-virtual {v0}, Lpa/b;->c()LL0/U;

    move-result-object v0

    new-instance v1, LL9/q$c;

    invoke-direct {v1, p0}, LL9/q$c;-><init>(Lmh/p;)V

    const/16 v2, 0x36

    const v3, 0x766eb574

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p1, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    const/16 v2, 0x30

    invoke-static {v0, v1, p1, v2}, LN/a1;->a(LL0/U;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, LL9/p;

    invoke-direct {v0, p0, p2}, LL9/p;-><init>(Lmh/p;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void
.end method

.method private static final q(Lmh/p;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LL9/q;->p(Lmh/p;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final r(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FLT/l;II)V
    .locals 20

    move/from16 v12, p12

    move/from16 v13, p13

    const v0, -0x3c3875de

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v13, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v12, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v12

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v12

    :goto_1
    and-int/lit8 v5, v13, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v12, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit8 v8, v13, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v12, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, v13, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v12, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v4, v14

    :goto_7
    and-int/lit16 v14, v12, 0x6000

    if-nez v14, :cond_e

    and-int/lit8 v14, v13, 0x10

    if-nez v14, :cond_c

    move-wide/from16 v14, p4

    invoke-interface {v1, v14, v15}, LT/l;->j(J)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_c
    move-wide/from16 v14, p4

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    goto :goto_9

    :cond_e
    move-wide/from16 v14, p4

    :goto_9
    and-int/lit8 v16, v13, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v4, v4, v17

    move/from16 v0, p6

    goto :goto_b

    :cond_f
    and-int v18, v12, v17

    move/from16 v0, p6

    if-nez v18, :cond_11

    invoke-interface {v1, v0}, LT/l;->g(F)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v19, 0x10000

    :goto_a
    or-int v4, v4, v19

    :cond_11
    :goto_b
    const/high16 v19, 0x180000

    and-int v19, v12, v19

    if-nez v19, :cond_13

    and-int/lit8 v19, v13, 0x40

    move-wide/from16 v6, p7

    if-nez v19, :cond_12

    invoke-interface {v1, v6, v7}, LT/l;->j(J)Z

    move-result v19

    if-eqz v19, :cond_12

    const/high16 v19, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v19, 0x80000

    :goto_c
    or-int v4, v4, v19

    goto :goto_d

    :cond_13
    move-wide/from16 v6, p7

    :goto_d
    and-int/lit16 v0, v13, 0x80

    const/high16 v19, 0xc00000

    if-eqz v0, :cond_14

    or-int v4, v4, v19

    move-object/from16 v3, p9

    goto :goto_f

    :cond_14
    and-int v19, v12, v19

    move-object/from16 v3, p9

    if-nez v19, :cond_16

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_15

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v19, 0x400000

    :goto_e
    or-int v4, v4, v19

    :cond_16
    :goto_f
    and-int/lit16 v3, v13, 0x100

    const/high16 v19, 0x6000000

    if-eqz v3, :cond_17

    or-int v4, v4, v19

    move/from16 v6, p10

    goto :goto_11

    :cond_17
    and-int v19, v12, v19

    move/from16 v6, p10

    if-nez v19, :cond_19

    invoke-interface {v1, v6}, LT/l;->g(F)Z

    move-result v7

    if-eqz v7, :cond_18

    const/high16 v7, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v7, 0x2000000

    :goto_10
    or-int/2addr v4, v7

    :cond_19
    :goto_11
    const v7, 0x2492493

    and-int/2addr v7, v4

    const v6, 0x2492492

    if-ne v7, v6, :cond_1b

    invoke-interface {v1}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p0

    move-object/from16 v5, p1

    move/from16 v7, p6

    move-object/from16 v16, p9

    move/from16 v12, p10

    move-object v3, v9

    move-object v4, v11

    move-wide v10, v14

    move-wide/from16 v8, p7

    goto/16 :goto_1c

    :cond_1b
    :goto_12
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v6, v12, 0x1

    const v7, -0x380001

    const v19, -0xe001

    if-eqz v6, :cond_1f

    invoke-interface {v1}, LT/l;->H()Z

    move-result v6

    if-eqz v6, :cond_1c

    goto :goto_13

    :cond_1c
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_1d

    and-int v4, v4, v19

    :cond_1d
    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_1e

    and-int/2addr v4, v7

    :cond_1e
    move-object/from16 v2, p0

    move-object/from16 v5, p1

    move/from16 v8, p6

    move-object/from16 v0, p9

    move/from16 v3, p10

    move-object v6, v11

    move-wide v10, v14

    move-wide/from16 v14, p7

    goto/16 :goto_1b

    :cond_1f
    :goto_13
    if-eqz v2, :cond_20

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_14

    :cond_20
    move-object/from16 v2, p0

    :goto_14
    if-eqz v5, :cond_21

    sget-object v5, LL9/a;->a:LL9/a;

    invoke-virtual {v5}, LL9/a;->a()Lmh/p;

    move-result-object v5

    goto :goto_15

    :cond_21
    move-object/from16 v5, p1

    :goto_15
    const/4 v6, 0x0

    if-eqz v8, :cond_22

    move-object v9, v6

    :cond_22
    if-eqz v10, :cond_23

    goto :goto_16

    :cond_23
    move-object v6, v11

    :goto_16
    and-int/lit8 v8, v13, 0x10

    if-eqz v8, :cond_24

    sget-object v8, LL9/w;->a:LL9/w;

    const/4 v10, 0x6

    invoke-virtual {v8, v1, v10}, LL9/w;->e(LT/l;I)J

    move-result-wide v10

    and-int v4, v4, v19

    goto :goto_17

    :cond_24
    move-wide v10, v14

    :goto_17
    if-eqz v16, :cond_25

    sget-object v8, LL9/w;->a:LL9/w;

    invoke-virtual {v8}, LL9/w;->d()F

    move-result v8

    goto :goto_18

    :cond_25
    move/from16 v8, p6

    :goto_18
    and-int/lit8 v14, v13, 0x40

    if-eqz v14, :cond_26

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v14

    invoke-interface {v1, v14}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm0/v0;

    invoke-virtual {v14}, Lm0/v0;->u()J

    move-result-wide v14

    and-int/2addr v4, v7

    goto :goto_19

    :cond_26
    move-wide/from16 v14, p7

    :goto_19
    if-eqz v0, :cond_27

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/o;->a(F)Lz/N;

    move-result-object v0

    goto :goto_1a

    :cond_27
    move-object/from16 v0, p9

    :goto_1a
    if-eqz v3, :cond_28

    const/4 v3, 0x0

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    goto :goto_1b

    :cond_28
    move/from16 v3, p10

    :goto_1b
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_29

    const/4 v7, -0x1

    const-string/jumbo v12, "com.ui.core.ui.component.toolbar.UiToolbarBase (UiToolbarBase.kt:58)"

    const v13, -0x3c3875de

    invoke-static {v13, v4, v7, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_29
    new-instance v7, LL9/q$d;

    invoke-direct {v7, v0, v9, v6, v5}, LL9/q$d;-><init>(Lz/N;Lmh/p;Lmh/q;Lmh/p;)V

    const/16 v12, 0x36

    const v13, 0x238313b6

    move-object/from16 v16, v0

    const/4 v0, 0x1

    invoke-static {v13, v0, v7, v1, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    and-int/lit8 v7, v4, 0xe

    or-int v7, v7, v17

    shr-int/lit8 v12, v4, 0x9

    and-int/lit8 v12, v12, 0x70

    or-int/2addr v7, v12

    shr-int/lit8 v12, v4, 0xc

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v7, v12

    shr-int/lit8 v12, v4, 0xf

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v7, v12

    shr-int/lit8 v4, v4, 0x3

    const v12, 0xe000

    and-int/2addr v4, v12

    or-int/2addr v4, v7

    const/4 v7, 0x0

    move-object/from16 p0, v2

    move-wide/from16 p1, v10

    move-wide/from16 p3, v14

    move/from16 p5, v3

    move/from16 p6, v8

    move-object/from16 p7, v0

    move-object/from16 p8, v1

    move/from16 p9, v4

    move/from16 p10, v7

    invoke-static/range {p0 .. p10}, LL9/q;->k(Landroidx/compose/ui/e;JJFFLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-static {}, LT/o;->P()V

    :cond_2a
    move v12, v3

    move-object v4, v6

    move v7, v8

    move-object v3, v9

    move-wide v8, v14

    :goto_1c
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v14

    if-eqz v14, :cond_2b

    new-instance v15, LL9/j;

    move-object v0, v15

    move-object v1, v2

    move-object v2, v5

    move-wide v5, v10

    move-object/from16 v10, v16

    move v11, v12

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, LL9/j;-><init>(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FII)V

    invoke-interface {v14, v15}, LT/X0;->a(Lmh/p;)V

    :cond_2b
    return-void
.end method

.method private static final s(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FIILT/l;I)LYg/J;
    .locals 15

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v13

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p13

    move/from16 v14, p12

    invoke-static/range {v1 .. v14}, LL9/q;->r(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic t(Lmh/q;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LL9/q;->h(Lmh/q;LT/l;I)V

    return-void
.end method

.method public static final synthetic u(Lmh/p;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LL9/q;->m(Lmh/p;LT/l;I)V

    return-void
.end method

.method public static final synthetic v(Lmh/p;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LL9/q;->p(Lmh/p;LT/l;I)V

    return-void
.end method
