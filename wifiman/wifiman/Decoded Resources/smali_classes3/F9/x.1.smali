.class public abstract LF9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p12}, LF9/x;->d(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LF9/x;->f(ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V
    .locals 27

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    const-string/jumbo v0, "content"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1b944da0

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v11, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v10, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

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
    or-int/2addr v4, v10

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v10

    :goto_1
    and-int/lit8 v5, v11, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v10, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, v11, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v10, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v1, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v4, v12

    :goto_5
    and-int/lit8 v12, v11, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v10, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-interface {v1, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v4, v14

    :goto_7
    and-int/lit8 v14, v11, 0x10

    if-eqz v14, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v10, 0x6000

    if-nez v15, :cond_c

    move-object/from16 v15, p4

    invoke-interface {v1, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    :goto_9
    and-int/lit8 v16, v11, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v4, v4, v17

    move-object/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v17, v10, v17

    move-object/from16 v0, p5

    if-nez v17, :cond_11

    invoke-interface {v1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v4, v4, v18

    :cond_11
    :goto_b
    and-int/lit8 v18, v11, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v4, v4, v19

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v19, v10, v19

    move-object/from16 v0, p6

    if-nez v19, :cond_14

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v19, 0x80000

    :goto_c
    or-int v4, v4, v19

    :cond_14
    :goto_d
    and-int/lit16 v0, v11, 0x80

    const/high16 v19, 0xc00000

    if-eqz v0, :cond_15

    or-int v4, v4, v19

    move-object/from16 v3, p7

    goto :goto_f

    :cond_15
    and-int v19, v10, v19

    move-object/from16 v3, p7

    if-nez v19, :cond_17

    invoke-interface {v1, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v19, 0x400000

    :goto_e
    or-int v4, v4, v19

    :cond_17
    :goto_f
    and-int/lit16 v3, v11, 0x100

    const/high16 v19, 0x6000000

    if-eqz v3, :cond_18

    or-int v4, v4, v19

    goto :goto_11

    :cond_18
    and-int v3, v10, v19

    if-nez v3, :cond_1a

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    const/high16 v3, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v3, 0x2000000

    :goto_10
    or-int/2addr v4, v3

    :cond_1a
    :goto_11
    const v3, 0x2492493

    and-int/2addr v3, v4

    const v6, 0x2492492

    if-ne v3, v6, :cond_1c

    invoke-interface {v1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p5

    move-object/from16 v25, p6

    move-object v3, v8

    move-object v4, v13

    move-object v7, v15

    move-object/from16 v8, p7

    goto/16 :goto_1a

    :cond_1c
    :goto_12
    if-eqz v2, :cond_1d

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_13

    :cond_1d
    move-object/from16 v2, p0

    :goto_13
    const/4 v3, 0x0

    if-eqz v5, :cond_1e

    move-object v5, v3

    goto :goto_14

    :cond_1e
    move-object/from16 v5, p1

    :goto_14
    if-eqz v7, :cond_1f

    move-object v8, v3

    :cond_1f
    if-eqz v12, :cond_20

    move-object v6, v3

    goto :goto_15

    :cond_20
    move-object v6, v13

    :goto_15
    if-eqz v14, :cond_21

    move-object v7, v3

    goto :goto_16

    :cond_21
    move-object v7, v15

    :goto_16
    if-eqz v16, :cond_22

    move-object/from16 v24, v3

    goto :goto_17

    :cond_22
    move-object/from16 v24, p5

    :goto_17
    if-eqz v18, :cond_23

    move-object/from16 v25, v3

    goto :goto_18

    :cond_23
    move-object/from16 v25, p6

    :goto_18
    if-eqz v0, :cond_24

    goto :goto_19

    :cond_24
    move-object/from16 v3, p7

    :goto_19
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_25

    const/4 v0, -0x1

    const-string/jumbo v12, "com.ui.core.ui.component.settings.UiSettingsCard (UiSettingsCard.kt:25)"

    const v13, -0x1b944da0

    invoke-static {v13, v4, v0, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_25
    new-instance v0, LF9/x$a;

    invoke-direct {v0, v9}, LF9/x$a;-><init>(Lmh/q;)V

    const/16 v12, 0x36

    const v13, 0x56fc4bee

    const/4 v14, 0x1

    invoke-static {v13, v14, v0, v1, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v20

    and-int/lit8 v0, v4, 0xe

    or-int v0, v0, v19

    and-int/lit8 v12, v4, 0x70

    or-int/2addr v0, v12

    shr-int/lit8 v12, v4, 0xc

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v0, v12

    shr-int/lit8 v12, v4, 0x3

    and-int/lit16 v13, v12, 0x1c00

    or-int/2addr v0, v13

    const v13, 0xe000

    and-int/2addr v12, v13

    or-int/2addr v0, v12

    const/high16 v12, 0x70000

    shr-int/lit8 v13, v4, 0x6

    and-int/2addr v12, v13

    or-int/2addr v0, v12

    shl-int/lit8 v4, v4, 0xc

    const/high16 v12, 0x380000

    and-int/2addr v12, v4

    or-int/2addr v0, v12

    const/high16 v12, 0x1c00000

    and-int/2addr v4, v12

    or-int v22, v0, v4

    const/16 v23, 0x0

    move-object v12, v2

    move-object v13, v5

    move-object/from16 v14, v25

    move-object v15, v7

    move-object/from16 v16, v24

    move-object/from16 v17, v3

    move-object/from16 v18, v8

    move-object/from16 v19, v6

    move-object/from16 v21, v1

    invoke-static/range {v12 .. v23}, LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {}, LT/o;->P()V

    :cond_26
    move-object v4, v6

    move-object/from16 v6, v24

    move-object/from16 v26, v8

    move-object v8, v3

    move-object/from16 v3, v26

    :goto_1a
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_27

    new-instance v13, LF9/v;

    move-object v0, v13

    move-object v1, v2

    move-object v2, v5

    move-object v5, v7

    move-object/from16 v7, v25

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LF9/v;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;II)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_27
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;IILT/l;I)LYg/J;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p11

    move/from16 v12, p10

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final e(LT/l;I)V
    .locals 10

    const v0, -0x35931797

    invoke-interface {p0, v0}, LT/l;->r(I)LT/l;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.settings.UiSettingsCardDivider (UiSettingsCard.kt:47)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, p0, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->b()J

    move-result-wide v4

    int-to-float v0, v3

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v6

    const/16 v8, 0xd86

    const/16 v9, 0x10

    const/4 v7, 0x0

    move-wide v2, v4

    move v4, v0

    move v5, v6

    move v6, v7

    move-object v7, p0

    invoke-static/range {v1 .. v9}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, LF9/w;

    invoke-direct {v0, p1}, LF9/w;-><init>(I)V

    invoke-interface {p0, v0}, LT/X0;->a(Lmh/p;)V

    :cond_4
    return-void
.end method

.method private static final f(ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, LT/L0;->a(I)I

    move-result p0

    invoke-static {p1, p0}, LF9/x;->e(LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
