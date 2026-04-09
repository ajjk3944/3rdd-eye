.class public abstract Lta/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p12}, Lta/c;->f(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, Lta/c;->d(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V
    .locals 24

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "$this$Icon"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x639c219f

    move-object/from16 v2, p4

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    const/high16 v3, -0x80000000

    and-int v3, p6, v3

    if-eqz v3, :cond_0

    or-int/lit8 v3, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move v3, v5

    :goto_1
    and-int/lit8 v4, p6, 0x1

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v2, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :goto_3
    and-int/lit8 v7, p6, 0x2

    if-eqz v7, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v2, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit8 v9, p6, 0x4

    if-eqz v9, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-interface {v2, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit16 v11, v3, 0x493

    const/16 v12, 0x492

    if-ne v11, v12, :cond_d

    invoke-interface {v2}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v2}, LT/l;->C()V

    move-object v4, v6

    move-object v3, v8

    goto/16 :goto_12

    :cond_d
    :goto_8
    if-eqz v4, :cond_e

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_9

    :cond_e
    move-object v4, v6

    :goto_9
    const/4 v6, 0x0

    if-eqz v7, :cond_f

    move-object v14, v6

    goto :goto_a

    :cond_f
    move-object v14, v8

    :goto_a
    if-eqz v9, :cond_10

    move-object v15, v6

    goto :goto_b

    :cond_10
    move-object v15, v10

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_11

    const/4 v7, -0x1

    const-string/jumbo v8, "com.ui.core.ui.util.img.Icon (CommonDrawableUtils.kt:34)"

    invoke-static {v0, v3, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_11
    and-int/lit8 v0, v3, 0xe

    invoke-static {v1, v2, v0}, Lta/c;->i(Ls9/a$b;LT/l;I)Lr0/d;

    move-result-object v0

    const v7, 0x27b53dea

    invoke-interface {v2, v7}, LT/l;->U(I)V

    const/4 v7, 0x0

    if-nez v14, :cond_14

    invoke-virtual/range {p0 .. p0}, Ls9/b;->e()Ls9/b$b;

    move-result-object v8

    if-eqz v8, :cond_12

    invoke-virtual {v8}, Ls9/b$b;->a()Lmh/p;

    move-result-object v8

    goto :goto_c

    :cond_12
    move-object v8, v6

    :goto_c
    if-nez v8, :cond_13

    move-object v8, v6

    goto :goto_d

    :cond_13
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v2, v9}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm0/v0;

    goto :goto_d

    :cond_14
    move-object v8, v14

    :goto_d
    invoke-interface {v2}, LT/l;->J()V

    const v9, 0x27b53e2f

    invoke-interface {v2, v9}, LT/l;->U(I)V

    if-nez v8, :cond_15

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v8

    invoke-interface {v2, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm0/v0;

    invoke-virtual {v8}, Lm0/v0;->u()J

    move-result-wide v16

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v8

    invoke-interface {v2, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v8

    :goto_e
    move-wide v9, v8

    goto :goto_f

    :cond_15
    invoke-virtual {v8}, Lm0/v0;->u()J

    move-result-wide v8

    goto :goto_e

    :goto_f
    invoke-interface {v2}, LT/l;->J()V

    const v8, 0x27b550b4

    invoke-interface {v2, v8}, LT/l;->U(I)V

    if-nez v15, :cond_17

    invoke-interface/range {p0 .. p0}, Ls9/a;->getContentDescription()Ls9/d;

    move-result-object v8

    if-nez v8, :cond_16

    :goto_10
    move-object v7, v6

    goto :goto_11

    :cond_16
    invoke-static {v8, v2, v7}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_10

    :cond_17
    move-object v7, v15

    :goto_11
    invoke-interface {v2}, LT/l;->J()V

    shl-int/lit8 v3, v3, 0x3

    and-int/lit16 v12, v3, 0x380

    const/4 v13, 0x0

    move-object v6, v0

    move-object v8, v4

    move-object v11, v2

    invoke-static/range {v6 .. v13}, LN/a0;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    move-object v3, v14

    move-object v10, v15

    :goto_12
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v8, Lta/b;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v4, v10

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lta/b;-><init>(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_19
    return-void
.end method

.method private static final d(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V
    .locals 25

    move-object/from16 v12, p0

    move/from16 v13, p10

    move/from16 v14, p11

    const-string v0, "<this>"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x74aaa624

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/high16 v1, -0x80000000

    and-int/2addr v1, v14

    if-eqz v1, :cond_0

    or-int/lit8 v1, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v13, 0x6

    if-nez v1, :cond_2

    invoke-interface {v15, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_2
    move v1, v13

    :goto_1
    and-int/lit8 v2, v14, 0x1

    if-eqz v2, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v3, v13, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_2

    :cond_5
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :goto_3
    and-int/lit8 v4, v14, 0x2

    if-eqz v4, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v5, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v5, v13, 0x180

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_4

    :cond_8
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    :goto_5
    and-int/lit8 v6, v14, 0x4

    if-eqz v6, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v7, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v7, v13, 0xc00

    if-nez v7, :cond_9

    move-object/from16 v7, p3

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x800

    goto :goto_6

    :cond_b
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v1, v8

    :goto_7
    and-int/lit16 v8, v13, 0x6000

    if-nez v8, :cond_e

    and-int/lit8 v8, v14, 0x8

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-interface {v15, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v8, p4

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v1, v9

    goto :goto_9

    :cond_e
    move-object/from16 v8, p4

    :goto_9
    and-int/lit8 v9, v14, 0x10

    const/high16 v10, 0x30000

    if-eqz v9, :cond_10

    or-int/2addr v1, v10

    :cond_f
    move-object/from16 v10, p5

    goto :goto_b

    :cond_10
    and-int/2addr v10, v13

    if-nez v10, :cond_f

    move-object/from16 v10, p5

    invoke-interface {v15, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    const/high16 v11, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v11, 0x10000

    :goto_a
    or-int/2addr v1, v11

    :goto_b
    and-int/lit8 v11, v14, 0x20

    const/high16 v16, 0x180000

    if-eqz v11, :cond_12

    or-int v1, v1, v16

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v16, v13, v16

    move-object/from16 v0, p6

    if-nez v16, :cond_14

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x80000

    :goto_c
    or-int v1, v1, v17

    :cond_14
    :goto_d
    and-int/lit8 v17, v14, 0x40

    const/high16 v18, 0xc00000

    if-eqz v17, :cond_15

    or-int v1, v1, v18

    move/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v18, v13, v18

    move/from16 v0, p7

    if-nez v18, :cond_17

    invoke-interface {v15, v0}, LT/l;->g(F)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v18, 0x400000

    :goto_e
    or-int v1, v1, v18

    :cond_17
    :goto_f
    and-int/lit16 v0, v14, 0x80

    const/high16 v18, 0x6000000

    if-eqz v0, :cond_18

    or-int v1, v1, v18

    move-object/from16 v3, p8

    goto :goto_11

    :cond_18
    and-int v18, v13, v18

    move-object/from16 v3, p8

    if-nez v18, :cond_1a

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v1, v1, v18

    :cond_1a
    :goto_11
    const v18, 0x2492493

    and-int v3, v1, v18

    const v5, 0x2492492

    if-ne v3, v5, :cond_1c

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v9, p8

    move-object v4, v7

    move-object v5, v8

    move-object v6, v10

    move-object/from16 v7, p6

    move/from16 v8, p7

    goto/16 :goto_1e

    :cond_1c
    :goto_12
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v3, v13, 0x1

    const v5, -0xe001

    if-eqz v3, :cond_1f

    invoke-interface {v15}, LT/l;->H()Z

    move-result v3

    if-eqz v3, :cond_1d

    goto :goto_13

    :cond_1d
    invoke-interface {v15}, LT/l;->C()V

    and-int/lit8 v0, v14, 0x8

    if-eqz v0, :cond_1e

    and-int/2addr v1, v5

    :cond_1e
    move-object/from16 v17, p1

    move-object/from16 v18, p2

    move-object/from16 v22, p6

    move/from16 v23, p7

    move-object/from16 v24, p8

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move-object/from16 v21, v10

    goto/16 :goto_1c

    :cond_1f
    :goto_13
    if-eqz v2, :cond_20

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_14

    :cond_20
    move-object/from16 v2, p1

    :goto_14
    const/4 v3, 0x0

    if-eqz v4, :cond_21

    move-object v4, v3

    goto :goto_15

    :cond_21
    move-object/from16 v4, p2

    :goto_15
    if-eqz v6, :cond_22

    move-object v7, v3

    :cond_22
    and-int/lit8 v6, v14, 0x8

    if-eqz v6, :cond_24

    invoke-interface/range {p0 .. p0}, Ls9/a;->getContentDescription()Ls9/d;

    move-result-object v6

    if-nez v6, :cond_23

    move-object v6, v3

    goto :goto_16

    :cond_23
    const/4 v8, 0x0

    invoke-static {v6, v15, v8}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v6

    :goto_16
    and-int/2addr v1, v5

    goto :goto_17

    :cond_24
    move-object v6, v8

    :goto_17
    if-eqz v9, :cond_25

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->e()Lf0/c;

    move-result-object v5

    goto :goto_18

    :cond_25
    move-object v5, v10

    :goto_18
    if-eqz v11, :cond_26

    sget-object v8, LC0/h;->a:LC0/h$a;

    invoke-virtual {v8}, LC0/h$a;->b()LC0/h;

    move-result-object v8

    goto :goto_19

    :cond_26
    move-object/from16 v8, p6

    :goto_19
    if-eqz v17, :cond_27

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_1a

    :cond_27
    move/from16 v9, p7

    :goto_1a
    if-eqz v0, :cond_28

    move-object/from16 v17, v2

    move-object/from16 v24, v3

    :goto_1b
    move-object/from16 v18, v4

    move-object/from16 v21, v5

    move-object/from16 v20, v6

    move-object/from16 v19, v7

    move-object/from16 v22, v8

    move/from16 v23, v9

    goto :goto_1c

    :cond_28
    move-object/from16 v24, p8

    move-object/from16 v17, v2

    goto :goto_1b

    :goto_1c
    invoke-interface {v15}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_29

    const/4 v0, -0x1

    const-string/jumbo v2, "com.ui.core.ui.util.img.Image (CommonDrawableUtils.kt:63)"

    const v3, -0x74aaa624

    invoke-static {v3, v1, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_29
    invoke-static {}, Lta/i;->c()LT/H0;

    move-result-object v0

    invoke-interface {v15, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lta/d;

    const v2, -0x20d8d8c1

    invoke-interface {v15, v2}, LT/l;->U(I)V

    if-nez v24, :cond_2a

    and-int/lit8 v2, v1, 0xe

    invoke-static {v12, v15, v2}, Lta/c;->h(Ls9/a;LT/l;I)Lm0/w0;

    move-result-object v2

    move-object v9, v2

    goto :goto_1d

    :cond_2a
    move-object/from16 v9, v24

    :goto_1d
    invoke-interface {v15}, LT/l;->J()V

    const v2, 0x1fffffe

    and-int v11, v1, v2

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    move/from16 v8, v23

    move-object v10, v15

    invoke-interface/range {v0 .. v11}, Lta/d;->a(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-static {}, LT/o;->P()V

    :cond_2b
    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    move/from16 v8, v23

    move-object/from16 v9, v24

    :goto_1e
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_2c

    new-instance v11, Lta/a;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v10, p10

    move-object v12, v11

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lta/a;-><init>(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;II)V

    invoke-interface {v15, v12}, LT/X0;->a(Lmh/p;)V

    :cond_2c
    return-void
.end method

.method private static final f(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;IILT/l;I)LYg/J;
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

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p11

    move/from16 v12, p10

    invoke-static/range {v1 .. v12}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final g(JLjava/lang/String;)Ls9/b$b;
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/b$b;

    new-instance v1, Lta/c$a;

    invoke-direct {v1, p0, p1}, Lta/c$a;-><init>(J)V

    invoke-direct {v0, p2, v1}, Ls9/b$b;-><init>(Ljava/lang/String;Lmh/p;)V

    return-object v0
.end method

.method public static final h(Ls9/a;LT/l;I)Lm0/w0;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x52ab1e6d

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.util.img.colorFilterDefault (CommonDrawableUtils.kt:46)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, Ls9/b;

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    check-cast p0, Ls9/b;

    invoke-virtual {p0}, Ls9/b;->e()Ls9/b$b;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ls9/b$b;->a()Lmh/p;

    move-result-object p0

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_3

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object p0

    invoke-interface {p1, p0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    :goto_2
    move-wide v3, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v0

    goto :goto_2

    :goto_3
    sget-object v2, Lm0/w0;->b:Lm0/w0$a;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm0/w0$a;->b(Lm0/w0$a;JIILjava/lang/Object;)Lm0/w0;

    move-result-object v0

    goto :goto_4

    :cond_4
    instance-of p0, p0, Ls9/c;

    if-eqz p0, :cond_6

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p1}, LT/l;->J()V

    return-object v0

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string/jumbo p1, "Unsupported subtype of CommonDrawable"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(Ls9/a$b;LT/l;I)Lr0/d;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3528d040

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.util.img.painter (CommonDrawableUtils.kt:20)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, Ls9/a$b$a;

    if-eqz p2, :cond_2

    const p2, 0x18efcbaa

    invoke-interface {p1, p2}, LT/l;->U(I)V

    check-cast p0, Ls9/a$b$a;

    invoke-interface {p0}, Ls9/a$b$a;->d()I

    move-result p0

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, LH0/c;->c(ILT/l;I)Lr0/d;

    move-result-object p0

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p0

    :cond_2
    instance-of p0, p0, Ls9/a$a;

    if-eqz p0, :cond_3

    const p0, 0x18efd3c2

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string/jumbo p1, "painter() should be never called for Url or File source"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const p0, 0x18efe090

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string/jumbo p1, "Unsupported subtype of CommonDrawable"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
