.class public abstract LBe/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LQ/A;Lr/h;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LBe/M;->i(LQ/A;Lr/h;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/internal/K;LQ/A;Lkotlin/jvm/internal/K;Lr/h;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LBe/M;->h(Lkotlin/jvm/internal/K;LQ/A;Lkotlin/jvm/internal/K;Lr/h;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p13}, LBe/M;->e(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;LT/l;II)V
    .locals 23

    move-object/from16 v9, p8

    move-object/from16 v8, p9

    move/from16 v7, p11

    move/from16 v6, p12

    const-string v0, "contentMeasurement"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x153c6e41

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v6, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v7, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v7, 0x6

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
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v7

    :goto_1
    and-int/lit8 v5, v6, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v7, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-interface {v1, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v4, v11

    :goto_3
    and-int/lit8 v11, v6, 0x4

    if-eqz v11, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v12, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v12, v7, 0x180

    if-nez v12, :cond_6

    move-object/from16 v12, p2

    invoke-interface {v1, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x100

    goto :goto_4

    :cond_8
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v4, v13

    :goto_5
    and-int/lit8 v13, v6, 0x8

    if-eqz v13, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v14, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v14, v7, 0xc00

    if-nez v14, :cond_9

    move-object/from16 v14, p3

    invoke-interface {v1, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    const/16 v15, 0x800

    goto :goto_6

    :cond_b
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v4, v15

    :goto_7
    and-int/lit8 v15, v6, 0x10

    if-eqz v15, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v0, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v0, v7, 0x6000

    if-nez v0, :cond_c

    move-object/from16 v0, p4

    invoke-interface {v1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_e

    const/16 v17, 0x4000

    goto :goto_8

    :cond_e
    const/16 v17, 0x2000

    :goto_8
    or-int v4, v4, v17

    :goto_9
    and-int/lit8 v17, v6, 0x20

    const/high16 v18, 0x30000

    if-eqz v17, :cond_f

    or-int v4, v4, v18

    move/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v18, v7, v18

    move/from16 v0, p5

    if-nez v18, :cond_11

    invoke-interface {v1, v0}, LT/l;->c(Z)Z

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
    and-int/lit8 v18, v6, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v4, v4, v19

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v19, v7, v19

    move-object/from16 v0, p6

    if-nez v19, :cond_14

    invoke-interface {v1, v0}, LT/l;->l(Ljava/lang/Object;)Z

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
    and-int/lit16 v0, v6, 0x80

    const/high16 v19, 0xc00000

    if-eqz v0, :cond_15

    or-int v4, v4, v19

    move/from16 v3, p7

    goto :goto_f

    :cond_15
    and-int v19, v7, v19

    move/from16 v3, p7

    if-nez v19, :cond_17

    invoke-interface {v1, v3}, LT/l;->c(Z)Z

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
    and-int/lit16 v3, v6, 0x100

    const/high16 v19, 0x6000000

    if-eqz v3, :cond_18

    or-int v4, v4, v19

    goto :goto_11

    :cond_18
    and-int v3, v7, v19

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
    and-int/lit16 v3, v6, 0x200

    const/high16 v19, 0x30000000

    if-eqz v3, :cond_1b

    or-int v4, v4, v19

    goto :goto_13

    :cond_1b
    and-int v3, v7, v19

    if-nez v3, :cond_1d

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    const/high16 v3, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v3, 0x10000000

    :goto_12
    or-int/2addr v4, v3

    :cond_1d
    :goto_13
    const v3, 0x12492493

    and-int/2addr v3, v4

    const v6, 0x12492492

    if-ne v3, v6, :cond_1f

    invoke-interface {v1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_1e

    goto :goto_14

    :cond_1e
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p0

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v22, p6

    move/from16 v11, p7

    move-object v3, v12

    move-object v4, v14

    goto/16 :goto_1d

    :cond_1f
    :goto_14
    if-eqz v2, :cond_20

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_15

    :cond_20
    move-object/from16 v2, p0

    :goto_15
    if-eqz v5, :cond_21

    const/4 v3, 0x0

    goto :goto_16

    :cond_21
    move-object v3, v10

    :goto_16
    if-eqz v11, :cond_22

    sget-object v5, LBe/g;->a:LBe/g;

    invoke-virtual {v5}, LBe/g;->a()Lmh/q;

    move-result-object v5

    goto :goto_17

    :cond_22
    move-object v5, v12

    :goto_17
    if-eqz v13, :cond_23

    sget-object v6, LBe/g;->a:LBe/g;

    invoke-virtual {v6}, LBe/g;->b()Lmh/q;

    move-result-object v6

    goto :goto_18

    :cond_23
    move-object v6, v14

    :goto_18
    if-eqz v15, :cond_24

    sget-object v10, LBe/g;->a:LBe/g;

    invoke-virtual {v10}, LBe/g;->c()Lmh/q;

    move-result-object v10

    move-object/from16 v20, v10

    goto :goto_19

    :cond_24
    move-object/from16 v20, p4

    :goto_19
    const/4 v15, 0x1

    if-eqz v17, :cond_25

    move/from16 v21, v15

    goto :goto_1a

    :cond_25
    move/from16 v21, p5

    :goto_1a
    if-eqz v18, :cond_26

    sget-object v10, LBe/g;->a:LBe/g;

    invoke-virtual {v10}, LBe/g;->d()Lmh/q;

    move-result-object v10

    move-object/from16 v22, v10

    goto :goto_1b

    :cond_26
    move-object/from16 v22, p6

    :goto_1b
    if-eqz v0, :cond_27

    move v0, v15

    goto :goto_1c

    :cond_27
    move/from16 v0, p7

    :goto_1c
    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_28

    const/4 v10, -0x1

    const-string v11, "com.ui.wifiman.ui.component.UiCardCollapsible (TopScrollCollapsibleContainer.kt:48)"

    const v12, -0x153c6e41

    invoke-static {v12, v4, v10, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_28
    new-instance v14, LBe/M$a;

    move-object v10, v14

    move v11, v0

    move-object v12, v3

    move-object v13, v2

    move/from16 p0, v0

    move-object v0, v14

    move-object v14, v5

    move-object/from16 p1, v3

    move v3, v15

    move-object v15, v6

    move-object/from16 v16, v20

    move/from16 v17, v21

    move-object/from16 v18, p9

    move-object/from16 v19, v22

    invoke-direct/range {v10 .. v19}, LBe/M$a;-><init>(ZLQ/z;Landroidx/compose/ui/e;Lmh/q;Lmh/q;Lmh/q;ZLmh/p;Lmh/q;)V

    const/16 v10, 0x36

    const v11, 0x5cb2db29

    invoke-static {v11, v3, v0, v1, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    and-int/lit8 v3, v4, 0xe

    or-int/lit16 v3, v3, 0x180

    shr-int/lit8 v4, v4, 0x15

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    invoke-static {v2, v9, v0, v1, v3}, Lqa/d;->d(Landroidx/compose/ui/e;Lmh/p;Lmh/r;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-static {}, LT/o;->P()V

    :cond_29
    move/from16 v11, p0

    move-object/from16 v10, p1

    move-object v3, v5

    move-object v4, v6

    move-object/from16 v5, v20

    move/from16 v6, v21

    :goto_1d
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_2a

    new-instance v14, LBe/H;

    move-object v0, v14

    move-object v1, v2

    move-object v2, v10

    move-object/from16 v7, v22

    move v8, v11

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LBe/H;-><init>(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_2a
    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;IILT/l;I)LYg/J;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p12

    move/from16 v13, p11

    invoke-static/range {v1 .. v13}, LBe/M;->d(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic f(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LBe/M;->g(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, LBe/M$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LBe/M$b;

    iget v3, v2, LBe/M$b;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, LBe/M$b;->e:I

    goto :goto_0

    :cond_0
    new-instance v2, LBe/M$b;

    invoke-direct {v2, v1}, LBe/M$b;-><init>(Ldh/e;)V

    :goto_0
    iget-object v1, v2, LBe/M$b;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v11

    iget v3, v2, LBe/M$b;->e:I

    const/4 v10, 0x2

    const/4 v4, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v10, :cond_1

    iget-object v0, v2, LBe/M$b;->a:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/K;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v2, LBe/M$b;->c:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/K;

    iget-object v3, v2, LBe/M$b;->b:Ljava/lang/Object;

    check-cast v3, Lr/i;

    iget-object v4, v2, LBe/M$b;->a:Ljava/lang/Object;

    check-cast v4, LQ/A;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v1, v0

    move-object v13, v3

    move-object v0, v4

    goto :goto_1

    :cond_3
    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LQ/A;->b()F

    move-result v1

    const v3, 0x3c23d70a    # 0.01f

    cmpg-float v1, v1, v3

    if-ltz v1, :cond_a

    invoke-virtual/range {p0 .. p0}, LQ/A;->b()F

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v3

    if-nez v1, :cond_4

    goto/16 :goto_5

    :cond_4
    new-instance v1, Lkotlin/jvm/internal/K;

    invoke-direct {v1}, Lkotlin/jvm/internal/K;-><init>()V

    move/from16 v5, p1

    iput v5, v1, Lkotlin/jvm/internal/K;->a:F

    if-eqz p2, :cond_6

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpl-float v3, v6, v3

    if-lez v3, :cond_6

    new-instance v3, Lkotlin/jvm/internal/K;

    invoke-direct {v3}, Lkotlin/jvm/internal/K;-><init>()V

    const/16 v20, 0x1c

    const/16 v21, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v14, p1

    invoke-static/range {v13 .. v21}, Lr/l;->c(FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v5

    new-instance v6, LBe/I;

    invoke-direct {v6, v3, v0, v1}, LBe/I;-><init>(Lkotlin/jvm/internal/K;LQ/A;Lkotlin/jvm/internal/K;)V

    iput-object v0, v2, LBe/M$b;->a:Ljava/lang/Object;

    move-object/from16 v13, p3

    iput-object v13, v2, LBe/M$b;->b:Ljava/lang/Object;

    iput-object v1, v2, LBe/M$b;->c:Ljava/lang/Object;

    iput v4, v2, LBe/M$b;->e:I

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v3, v5

    move-object/from16 v4, p2

    move v5, v7

    move-object v7, v2

    invoke-static/range {v3 .. v9}, Lr/m0;->h(Lr/k;Lr/z;ZLmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_5

    return-object v11

    :cond_5
    :goto_1
    move-object v5, v13

    goto :goto_2

    :cond_6
    move-object/from16 v13, p3

    goto :goto_1

    :goto_2
    if-eqz v5, :cond_9

    invoke-virtual {v0}, LQ/A;->d()F

    move-result v3

    cmpg-float v3, v3, v12

    if-gez v3, :cond_9

    invoke-virtual {v0}, LQ/A;->d()F

    move-result v3

    invoke-virtual {v0}, LQ/A;->e()F

    move-result v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_9

    invoke-virtual {v0}, LQ/A;->d()F

    move-result v13

    const/16 v20, 0x1e

    const/16 v21, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v13 .. v21}, Lr/l;->c(FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v3

    invoke-virtual {v0}, LQ/A;->b()F

    move-result v4

    const/high16 v6, 0x3f000000    # 0.5f

    cmpg-float v4, v4, v6

    if-gez v4, :cond_7

    move v4, v12

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, LQ/A;->e()F

    move-result v4

    :goto_3
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v4

    new-instance v7, LBe/J;

    invoke-direct {v7, v0}, LBe/J;-><init>(LQ/A;)V

    iput-object v1, v2, LBe/M$b;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v2, LBe/M$b;->b:Ljava/lang/Object;

    iput-object v0, v2, LBe/M$b;->c:Ljava/lang/Object;

    iput v10, v2, LBe/M$b;->e:I

    const/4 v6, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v8, v2

    invoke-static/range {v3 .. v10}, Lr/m0;->j(Lr/k;Ljava/lang/Object;Lr/i;ZLmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_8

    return-object v11

    :cond_8
    move-object v0, v1

    :goto_4
    move-object v1, v0

    :cond_9
    iget v0, v1, Lkotlin/jvm/internal/K;->a:F

    invoke-static {v12, v0}, LY0/z;->a(FF)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->b(J)LY0/y;

    move-result-object v0

    return-object v0

    :cond_a
    :goto_5
    sget-object v0, LY0/y;->b:LY0/y$a;

    invoke-virtual {v0}, LY0/y$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->b(J)LY0/y;

    move-result-object v0

    return-object v0
.end method

.method private static final h(Lkotlin/jvm/internal/K;LQ/A;Lkotlin/jvm/internal/K;Lr/h;)LYg/J;
    .locals 3

    const-string v0, "$this$animateDecay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v1, p0, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v0, v1

    invoke-virtual {p1}, LQ/A;->d()F

    move-result v1

    add-float v2, v1, v0

    invoke-virtual {p1, v2}, LQ/A;->g(F)V

    invoke-virtual {p1}, LQ/A;->d()F

    move-result p1

    sub-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-virtual {p3}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iput v1, p0, Lkotlin/jvm/internal/K;->a:F

    invoke-virtual {p3}, Lr/h;->f()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    iput p0, p2, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    const/high16 p1, 0x3f000000    # 0.5f

    cmpl-float p0, p0, p1

    if-lez p0, :cond_0

    invoke-virtual {p3}, Lr/h;->a()V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(LQ/A;Lr/h;)LYg/J;
    .locals 1

    const-string v0, "$this$animateTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LQ/A;->g(F)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
