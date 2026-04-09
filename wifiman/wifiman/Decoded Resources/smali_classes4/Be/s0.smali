.class public abstract LBe/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ljava/lang/String;ZIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LBe/s0;->l(Landroidx/compose/ui/e;Ljava/lang/String;ZIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/r;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LBe/s0;->h(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/r;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LBe/s0;->j(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LBe/s0;->f(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;LT/l;II)V
    .locals 15

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move/from16 v12, p6

    const-string v0, "items"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSelected"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x312519cb

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v12, 0x6

    move v3, v2

    move-object v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v12, 0x6

    if-nez v2, :cond_2

    move-object v2, p0

    invoke-interface {v13, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v12

    goto :goto_1

    :cond_2
    move-object v2, p0

    move v3, v12

    :goto_1
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v4, v12, 0x30

    if-nez v4, :cond_6

    and-int/lit8 v4, v12, 0x40

    if-nez v4, :cond_4

    invoke-interface {v13, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_4
    invoke-interface {v13, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_6
    :goto_4
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0x180

    goto :goto_7

    :cond_7
    and-int/lit16 v4, v12, 0x180

    if-nez v4, :cond_a

    and-int/lit16 v4, v12, 0x200

    if-nez v4, :cond_8

    invoke-interface {v13, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_5

    :cond_8
    invoke-interface {v13, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    :goto_5
    if-eqz v4, :cond_9

    const/16 v4, 0x100

    goto :goto_6

    :cond_9
    const/16 v4, 0x80

    :goto_6
    or-int/2addr v3, v4

    :cond_a
    :goto_7
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_b

    or-int/lit16 v3, v3, 0xc00

    goto :goto_9

    :cond_b
    and-int/lit16 v4, v12, 0xc00

    if-nez v4, :cond_d

    invoke-interface {v13, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/16 v4, 0x800

    goto :goto_8

    :cond_c
    const/16 v4, 0x400

    :goto_8
    or-int/2addr v3, v4

    :cond_d
    :goto_9
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_e

    or-int/lit16 v3, v3, 0x6000

    goto :goto_b

    :cond_e
    and-int/lit16 v4, v12, 0x6000

    if-nez v4, :cond_10

    invoke-interface {v13, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    const/16 v4, 0x4000

    goto :goto_a

    :cond_f
    const/16 v4, 0x2000

    :goto_a
    or-int/2addr v3, v4

    :cond_10
    :goto_b
    and-int/lit16 v4, v3, 0x2493

    const/16 v5, 0x2492

    if-ne v4, v5, :cond_12

    invoke-interface {v13}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_c

    :cond_11
    invoke-interface {v13}, LT/l;->C()V

    move-object v1, v2

    goto :goto_e

    :cond_12
    :goto_c
    if-eqz v1, :cond_13

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v1

    goto :goto_d

    :cond_13
    move-object v14, v2

    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.UiSelectorHorizontal (UiSelectorHorizontal.kt:44)"

    invoke-static {v0, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    new-instance v0, LBe/s0$a;

    invoke-direct {v0, v11, v3, v8}, LBe/s0$a;-><init>(Lmh/q;ILjava/lang/Object;)V

    const/16 v1, 0x36

    const v2, -0x4df89f42

    const/4 v4, 0x1

    invoke-static {v2, v4, v0, v13, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    and-int/lit8 v0, v3, 0xe

    or-int/lit16 v0, v0, 0x6000

    shr-int/lit8 v1, v3, 0x3

    and-int/lit8 v1, v1, 0x8

    shl-int/lit8 v2, v1, 0x3

    or-int/2addr v0, v2

    and-int/lit8 v2, v3, 0x70

    or-int/2addr v0, v2

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0x1c00

    or-int v6, v0, v1

    const/4 v7, 0x0

    move-object v0, v14

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v5, v13

    invoke-static/range {v0 .. v7}, LBe/s0;->g(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/r;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    move-object v1, v14

    :goto_e
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_16

    new-instance v14, LBe/p0;

    move-object v0, v14

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LBe/p0;-><init>(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LBe/s0;->e(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final g(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/r;LT/l;II)V
    .locals 22

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move/from16 v10, p6

    const-string v0, "items"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onItemSelected"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemContent"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x78c3bdc5

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v1, p7, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v4, v10, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v10, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    or-int/2addr v5, v10

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v10

    :goto_1
    and-int/lit8 v11, p7, 0x2

    if-eqz v11, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v11, v10, 0x30

    if-nez v11, :cond_6

    and-int/lit8 v11, v10, 0x40

    if-nez v11, :cond_4

    invoke-interface {v15, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_2

    :cond_4
    invoke-interface {v15, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    :goto_2
    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_3

    :cond_5
    const/16 v11, 0x10

    :goto_3
    or-int/2addr v5, v11

    :cond_6
    :goto_4
    and-int/lit8 v11, p7, 0x4

    if-eqz v11, :cond_7

    or-int/lit16 v5, v5, 0x180

    goto :goto_7

    :cond_7
    and-int/lit16 v11, v10, 0x180

    if-nez v11, :cond_a

    and-int/lit16 v11, v10, 0x200

    if-nez v11, :cond_8

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_5

    :cond_8
    invoke-interface {v15, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    :goto_5
    if-eqz v11, :cond_9

    const/16 v11, 0x100

    goto :goto_6

    :cond_9
    const/16 v11, 0x80

    :goto_6
    or-int/2addr v5, v11

    :cond_a
    :goto_7
    and-int/lit8 v11, p7, 0x8

    if-eqz v11, :cond_b

    or-int/lit16 v5, v5, 0xc00

    goto :goto_9

    :cond_b
    and-int/lit16 v11, v10, 0xc00

    if-nez v11, :cond_d

    invoke-interface {v15, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v11, 0x800

    goto :goto_8

    :cond_c
    const/16 v11, 0x400

    :goto_8
    or-int/2addr v5, v11

    :cond_d
    :goto_9
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_f

    or-int/lit16 v5, v5, 0x6000

    :cond_e
    :goto_a
    move v11, v5

    goto :goto_c

    :cond_f
    and-int/lit16 v11, v10, 0x6000

    if-nez v11, :cond_e

    invoke-interface {v15, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    const/16 v11, 0x4000

    goto :goto_b

    :cond_10
    const/16 v11, 0x2000

    :goto_b
    or-int/2addr v5, v11

    goto :goto_a

    :goto_c
    and-int/lit16 v5, v11, 0x2493

    const/16 v12, 0x2492

    if-ne v5, v12, :cond_12

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_11

    goto :goto_d

    :cond_11
    invoke-interface {v15}, LT/l;->C()V

    move-object v1, v15

    goto :goto_f

    :cond_12
    :goto_d
    if-eqz v1, :cond_13

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v21, v1

    goto :goto_e

    :cond_13
    move-object/from16 v21, v4

    :goto_e
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, -0x1

    const-string v4, "com.ui.wifiman.ui.component.UiSelectorHorizontalBase (UiSelectorHorizontal.kt:67)"

    invoke-static {v0, v11, v1, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    sget-object v0, Lz/c;->a:Lz/c;

    int-to-float v1, v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v12

    int-to-float v1, v3

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v0, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v13

    new-instance v14, LBe/s0$b;

    move-object v0, v14

    move-object/from16 v1, p2

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move v5, v11

    invoke-direct/range {v0 .. v5}, LBe/s0$b;-><init>(LCi/c;Ljava/lang/Object;Lmh/l;Lmh/r;I)V

    const/16 v0, 0x36

    const v1, 0x310c96a0

    const/4 v2, 0x1

    invoke-static {v1, v2, v14, v15, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v17

    and-int/lit8 v0, v11, 0xe

    const v1, 0x1801b0

    or-int v19, v0, v1

    const/16 v20, 0x38

    const/4 v14, 0x0

    const/4 v0, 0x0

    const/16 v16, 0x0

    move-object/from16 v11, v21

    move-object v1, v15

    move v15, v0

    move-object/from16 v18, v1

    invoke-static/range {v11 .. v20}, Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    move-object/from16 v4, v21

    :goto_f
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v11

    if-eqz v11, :cond_16

    new-instance v12, LBe/r0;

    move-object v0, v12

    move-object v1, v4

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LBe/r0;-><init>(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/r;II)V

    invoke-interface {v11, v12}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final h(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/r;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LBe/s0;->g(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/r;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;LT/l;II)V
    .locals 26

    move/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    const v0, 0x28b09477

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, p6, 0x1

    const/4 v14, 0x2

    const/4 v15, 0x4

    if-eqz v3, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v15

    goto :goto_0

    :cond_1
    move v7, v14

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, p6, 0x2

    const/16 v13, 0x10

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_5

    invoke-interface {v1, v2}, LT/l;->c(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    move v8, v13

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    move-object/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    move-object/from16 v12, p2

    if-nez v8, :cond_8

    invoke-interface {v1, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_8
    :goto_5
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v7, v7, 0xc00

    :cond_9
    :goto_6
    move v11, v7

    goto :goto_8

    :cond_a
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_9

    invoke-interface {v1, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x800

    goto :goto_7

    :cond_b
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v7, v8

    goto :goto_6

    :goto_8
    and-int/lit16 v7, v11, 0x493

    const/16 v8, 0x492

    if-ne v7, v8, :cond_d

    invoke-interface {v1}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v6

    goto/16 :goto_e

    :cond_d
    :goto_9
    if-eqz v3, :cond_e

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_a

    :cond_e
    move-object v3, v6

    :goto_a
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_f

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.component.UiSelectorHorizontalItem (UiSelectorHorizontal.kt:91)"

    invoke-static {v0, v11, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_f
    if-eqz v2, :cond_10

    const v0, -0x646bffdf

    invoke-interface {v1, v0}, LT/l;->U(I)V

    sget-object v0, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v0, v1, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v6

    :goto_b
    invoke-interface {v1}, LT/l;->J()V

    goto :goto_c

    :cond_10
    const v0, -0x646bfbf7

    invoke-interface {v1, v0}, LT/l;->U(I)V

    sget-object v0, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v0, v1, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->a()J

    move-result-wide v6

    goto :goto_b

    :goto_c
    const/16 v0, 0x180

    const/16 v16, 0xa

    const/4 v8, 0x0

    const-string v9, "selectorItemColor"

    const/4 v10, 0x0

    move/from16 v25, v11

    move-object v11, v1

    move v12, v0

    move v0, v13

    move/from16 v13, v16

    invoke-static/range {v6 .. v13}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v6

    const/16 v7, 0x40

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v3, v7, v8, v14, v9}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    invoke-static {v7, v0}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-interface {v6}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v9

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v6, 0xc

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    int-to-float v7, v15

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v0, v6, v7}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v16

    const v0, -0x646bad7a

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_11

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v17, v0

    check-cast v17, Ly/m;

    invoke-interface {v1}, LT/l;->J()V

    const/16 v23, 0x1c

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, p2

    invoke-static/range {v16 .. v24}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-virtual {v6}, Lz/c;->b()Lz/c$f;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v7

    move/from16 v8, v25

    and-int/lit16 v8, v8, 0x1c00

    or-int/lit16 v8, v8, 0x1b0

    const/16 v9, 0x36

    invoke-static {v6, v7, v1, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v1, v7}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v10, LE0/g;->K:LE0/g$a;

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_12

    invoke-static {}, LT/j;->c()V

    :cond_12
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_13

    invoke-interface {v1, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_d

    :cond_13
    invoke-interface {v1}, LT/l;->I()V

    :goto_d
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v6, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v11, v9, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v11}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_14

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    :cond_14
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_15
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v11, v0, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    shr-int/lit8 v6, v8, 0x6

    and-int/lit8 v6, v6, 0x70

    or-int/lit8 v6, v6, 0x6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v0, v1, v6}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    :goto_e
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v8, LBe/o0;

    move-object v0, v8

    move-object v1, v3

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LBe/o0;-><init>(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final j(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LBe/s0;->i(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/e;Ljava/lang/String;ZLT/l;II)V
    .locals 27

    move-object/from16 v1, p1

    move/from16 v0, p2

    move/from16 v13, p4

    const-string v2, "text"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x11a37dcc

    move-object/from16 v3, p3

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v4, v13, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v13, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v14, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v13

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v13

    :goto_1
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v13, 0x30

    if-nez v6, :cond_5

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    :goto_4
    move v11, v5

    goto :goto_6

    :cond_7
    and-int/lit16 v6, v13, 0x180

    if-nez v6, :cond_6

    invoke-interface {v14, v0}, LT/l;->c(Z)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_5

    :cond_8
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v5, v6

    goto :goto_4

    :goto_6
    and-int/lit16 v5, v11, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_a

    invoke-interface {v14}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v14}, LT/l;->C()V

    move-object v1, v4

    move-object/from16 v26, v14

    goto/16 :goto_b

    :cond_a
    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v25, v3

    goto :goto_8

    :cond_b
    move-object/from16 v25, v4

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.component.UiSelectorHorizontalText (UiSelectorHorizontal.kt:121)"

    invoke-static {v2, v11, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    const v2, -0x5270cfa0

    invoke-interface {v14, v2}, LT/l;->U(I)V

    if-eqz v0, :cond_d

    sget-object v2, Lma/a$b;->a:Lma/a$b;

    invoke-virtual {v2}, Lma/a$b;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->a()J

    move-result-wide v2

    :goto_9
    move-wide v3, v2

    goto :goto_a

    :cond_d
    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v14, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v2

    goto :goto_9

    :goto_a
    invoke-interface {v14}, LT/l;->J()V

    const/16 v9, 0x180

    const/16 v10, 0xa

    const/4 v5, 0x0

    const-string v6, "textColor"

    const/4 v7, 0x0

    move-object v8, v14

    invoke-static/range {v3 .. v10}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v2

    sget-object v3, LW0/j;->b:LW0/j$a;

    invoke-virtual {v3}, LW0/j$a;->a()I

    move-result v4

    sget-object v3, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v3, v14, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->f()LL0/U;

    move-result-object v20

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v2

    sget-object v5, LW0/t;->a:LW0/t$a;

    invoke-virtual {v5}, LW0/t$a;->a()I

    move-result v15

    invoke-static {v4}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    shr-int/lit8 v4, v11, 0x3

    and-int/lit8 v4, v4, 0xe

    shl-int/lit8 v5, v11, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int v22, v4, v5

    const/16 v23, 0xc30

    const v24, 0xd5f8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v26, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v25

    move-object/from16 v21, v26

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    move-object/from16 v1, v25

    :goto_b
    invoke-interface/range {v26 .. v26}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v7, LBe/q0;

    move-object v0, v7

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LBe/q0;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;ZII)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final l(Landroidx/compose/ui/e;Ljava/lang/String;ZIILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LBe/s0;->k(Landroidx/compose/ui/e;Ljava/lang/String;ZLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic m(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;LT/l;II)V
    .locals 0

    invoke-static/range {p0 .. p6}, LBe/s0;->i(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;LT/l;II)V

    return-void
.end method
