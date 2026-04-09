.class public abstract LY2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LC/C;ILandroidx/compose/ui/e;Lmh/l;JJFFFLm0/i1;LT/l;II)V
    .locals 36

    move-object/from16 v1, p0

    move/from16 v13, p13

    move/from16 v14, p14

    const-string v0, "pagerState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x33e217c3

    move-object/from16 v2, p12

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, v14, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v13, 0xe

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v13

    goto :goto_1

    :cond_2
    move v3, v13

    :goto_1
    and-int/lit8 v5, v14, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v13, 0x70

    if-nez v5, :cond_3

    move/from16 v5, p1

    invoke-interface {v2, v5}, LT/l;->i(I)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, v14, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v13, 0x380

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v2, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit8 v8, v14, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v13, 0x1c00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-interface {v2, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v3, v10

    :goto_7
    const v10, 0xe000

    and-int/2addr v10, v13

    if-nez v10, :cond_e

    and-int/lit8 v10, v14, 0x10

    if-nez v10, :cond_c

    move-wide/from16 v10, p4

    invoke-interface {v2, v10, v11}, LT/l;->j(J)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_c
    move-wide/from16 v10, p4

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v3, v12

    goto :goto_9

    :cond_e
    move-wide/from16 v10, p4

    :goto_9
    const/high16 v12, 0x70000

    and-int/2addr v12, v13

    if-nez v12, :cond_10

    and-int/lit8 v12, v14, 0x20

    move-wide/from16 v4, p6

    if-nez v12, :cond_f

    invoke-interface {v2, v4, v5}, LT/l;->j(J)Z

    move-result v12

    if-eqz v12, :cond_f

    const/high16 v12, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v12, 0x10000

    :goto_a
    or-int/2addr v3, v12

    goto :goto_b

    :cond_10
    move-wide/from16 v4, p6

    :goto_b
    and-int/lit8 v12, v14, 0x40

    if-eqz v12, :cond_12

    const/high16 v15, 0x180000

    or-int/2addr v3, v15

    :cond_11
    move/from16 v15, p8

    goto :goto_d

    :cond_12
    const/high16 v15, 0x380000

    and-int/2addr v15, v13

    if-nez v15, :cond_11

    move/from16 v15, p8

    invoke-interface {v2, v15}, LT/l;->g(F)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v3, v3, v16

    :goto_d
    const/high16 v16, 0x1c00000

    and-int v16, v13, v16

    if-nez v16, :cond_16

    and-int/lit16 v0, v14, 0x80

    if-nez v0, :cond_14

    move/from16 v0, p9

    invoke-interface {v2, v0}, LT/l;->g(F)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_14
    move/from16 v0, p9

    :cond_15
    const/high16 v17, 0x400000

    :goto_e
    or-int v3, v3, v17

    goto :goto_f

    :cond_16
    move/from16 v0, p9

    :goto_f
    const/high16 v17, 0xe000000

    and-int v17, v13, v17

    if-nez v17, :cond_19

    and-int/lit16 v0, v14, 0x100

    if-nez v0, :cond_17

    move/from16 v0, p10

    invoke-interface {v2, v0}, LT/l;->g(F)Z

    move-result v17

    if-eqz v17, :cond_18

    const/high16 v17, 0x4000000

    goto :goto_10

    :cond_17
    move/from16 v0, p10

    :cond_18
    const/high16 v17, 0x2000000

    :goto_10
    or-int v3, v3, v17

    goto :goto_11

    :cond_19
    move/from16 v0, p10

    :goto_11
    const/high16 v17, 0x70000000

    and-int v17, v13, v17

    if-nez v17, :cond_1c

    and-int/lit16 v0, v14, 0x200

    if-nez v0, :cond_1a

    move-object/from16 v0, p11

    invoke-interface {v2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1b

    const/high16 v17, 0x20000000

    goto :goto_12

    :cond_1a
    move-object/from16 v0, p11

    :cond_1b
    const/high16 v17, 0x10000000

    :goto_12
    or-int v3, v3, v17

    goto :goto_13

    :cond_1c
    move-object/from16 v0, p11

    :goto_13
    const v17, 0x5b6db6db

    and-int v0, v3, v17

    const v4, 0x12492492

    if-ne v0, v4, :cond_1e

    invoke-interface {v2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_14

    :cond_1d
    invoke-interface {v2}, LT/l;->C()V

    move-object/from16 v12, p11

    move-object v3, v7

    move-object v4, v9

    move-wide v5, v10

    move v9, v15

    move-wide/from16 v7, p6

    move/from16 v10, p9

    move/from16 v11, p10

    goto/16 :goto_1b

    :cond_1e
    :goto_14
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v0, v13, 0x1

    const v4, -0x70000001

    const v5, -0xe000001

    const v17, -0x1c00001

    const v18, -0x70001

    const v19, -0xe001

    if-eqz v0, :cond_25

    invoke-interface {v2}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_1f

    goto :goto_15

    :cond_1f
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit8 v0, v14, 0x10

    if-eqz v0, :cond_20

    and-int v3, v3, v19

    :cond_20
    and-int/lit8 v0, v14, 0x20

    if-eqz v0, :cond_21

    and-int v3, v3, v18

    :cond_21
    and-int/lit16 v0, v14, 0x80

    if-eqz v0, :cond_22

    and-int v3, v3, v17

    :cond_22
    and-int/lit16 v0, v14, 0x100

    if-eqz v0, :cond_23

    and-int/2addr v3, v5

    :cond_23
    and-int/lit16 v0, v14, 0x200

    if-eqz v0, :cond_24

    and-int/2addr v3, v4

    :cond_24
    move/from16 v5, p9

    move/from16 v6, p10

    move-object/from16 v8, p11

    move v12, v3

    move v0, v15

    move-wide/from16 v3, p6

    goto/16 :goto_19

    :cond_25
    :goto_15
    if-eqz v6, :cond_26

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v7, v0

    :cond_26
    if-eqz v8, :cond_27

    sget-object v0, LY2/a$a;->a:LY2/a$a;

    move-object v9, v0

    :cond_27
    and-int/lit8 v0, v14, 0x10

    if-eqz v0, :cond_28

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v0

    invoke-interface {v2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v20

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v0

    invoke-interface {v2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v22

    const/16 v26, 0xe

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v20 .. v27}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v10

    and-int v3, v3, v19

    :cond_28
    and-int/lit8 v0, v14, 0x20

    if-eqz v0, :cond_29

    sget-object v0, LN/r;->a:LN/r;

    sget v6, LN/r;->b:I

    invoke-virtual {v0, v2, v6}, LN/r;->b(LT/l;I)F

    move-result v21

    const/16 v25, 0xe

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-wide/from16 v19, v10

    invoke-static/range {v19 .. v26}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v19

    and-int v3, v3, v18

    goto :goto_16

    :cond_29
    move-wide/from16 v19, p6

    :goto_16
    if-eqz v12, :cond_2a

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    move v15, v0

    :cond_2a
    and-int/lit16 v0, v14, 0x80

    if-eqz v0, :cond_2b

    and-int v3, v3, v17

    move v0, v15

    goto :goto_17

    :cond_2b
    move/from16 v0, p9

    :goto_17
    and-int/lit16 v6, v14, 0x100

    if-eqz v6, :cond_2c

    and-int/2addr v3, v5

    move v5, v3

    move v3, v15

    goto :goto_18

    :cond_2c
    move v5, v3

    move/from16 v3, p10

    :goto_18
    and-int/lit16 v6, v14, 0x200

    if-eqz v6, :cond_2d

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v6

    and-int/2addr v4, v5

    move v5, v0

    move v12, v4

    move-object v8, v6

    move v0, v15

    move v6, v3

    move-wide/from16 v3, v19

    goto :goto_19

    :cond_2d
    move-object/from16 v8, p11

    move v6, v3

    move v12, v5

    move-wide/from16 v3, v19

    move v5, v0

    move v0, v15

    :goto_19
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v15

    if-eqz v15, :cond_2e

    const/4 v15, -0x1

    const-string v13, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:158)"

    const v14, 0x33e217c3

    invoke-static {v14, v12, v15, v13}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2e
    const v13, -0x5aaec5df

    invoke-interface {v2, v13}, LT/l;->e(I)V

    and-int/lit8 v13, v12, 0xe

    const/4 v14, 0x4

    if-ne v13, v14, :cond_2f

    const/4 v13, 0x1

    goto :goto_1a

    :cond_2f
    const/4 v13, 0x0

    :goto_1a
    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_30

    sget-object v13, LT/l;->a:LT/l$a;

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v14, v13, :cond_31

    :cond_30
    new-instance v14, LY2/a$f;

    invoke-direct {v14, v1}, LY2/a$f;-><init>(LC/C;)V

    invoke-interface {v2, v14}, LT/l;->K(Ljava/lang/Object;)V

    :cond_31
    move-object v15, v14

    check-cast v15, LY2/a$f;

    invoke-interface {v2}, LT/l;->P()V

    const v13, 0x7ffffff0

    and-int v28, v12, v13

    const/16 v29, 0x0

    move/from16 v16, p1

    move-object/from16 v17, v7

    move-object/from16 v18, v9

    move-wide/from16 v19, v10

    move-wide/from16 v21, v3

    move/from16 v23, v0

    move/from16 v24, v5

    move/from16 v25, v6

    move-object/from16 v26, v8

    move-object/from16 v27, v2

    invoke-static/range {v15 .. v29}, LY2/a;->b(LY2/b;ILandroidx/compose/ui/e;Lmh/l;JJFFFLm0/i1;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v12

    if-eqz v12, :cond_32

    invoke-static {}, LT/o;->P()V

    :cond_32
    move-object v12, v8

    move-object/from16 v31, v9

    move v9, v0

    move-wide/from16 v32, v10

    move v10, v5

    move v11, v6

    move-wide/from16 v5, v32

    move-wide/from16 v34, v3

    move-object v3, v7

    move-wide/from16 v7, v34

    move-object/from16 v4, v31

    :goto_1b
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_33

    new-instance v14, LY2/a$b;

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v13, p13

    move-object/from16 v30, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, LY2/a$b;-><init>(LC/C;ILandroidx/compose/ui/e;Lmh/l;JJFFFLm0/i1;II)V

    move-object/from16 v0, v30

    invoke-interface {v15, v0}, LT/X0;->a(Lmh/p;)V

    :cond_33
    return-void
.end method

.method private static final b(LY2/b;ILandroidx/compose/ui/e;Lmh/l;JJFFFLm0/i1;LT/l;II)V
    .locals 40

    move/from16 v2, p1

    move/from16 v13, p13

    move/from16 v14, p14

    const/16 v0, 0x8

    const/16 v1, 0x30

    const/4 v3, 0x2

    const/4 v4, 0x4

    const/16 v5, 0x80

    const/16 v7, 0x10

    const/16 v8, 0x20

    const v9, -0x5fae2106

    move-object/from16 v10, p12

    invoke-interface {v10, v9}, LT/l;->r(I)LT/l;

    move-result-object v10

    and-int/lit8 v11, v14, 0x1

    if-eqz v11, :cond_0

    or-int/lit8 v11, v13, 0x6

    move v12, v11

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v11, v13, 0xe

    if-nez v11, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v10, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    move v12, v4

    goto :goto_0

    :cond_1
    move v12, v3

    :goto_0
    or-int/2addr v12, v13

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    move v12, v13

    :goto_1
    and-int/2addr v3, v14

    if-eqz v3, :cond_3

    or-int/2addr v12, v1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v13, 0x70

    if-nez v3, :cond_5

    invoke-interface {v10, v2}, LT/l;->i(I)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v8

    goto :goto_2

    :cond_4
    move v3, v7

    :goto_2
    or-int/2addr v12, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v14, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v12, v12, 0x180

    :cond_6
    move-object/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v13, 0x380

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-interface {v10, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_8

    const/16 v15, 0x100

    goto :goto_4

    :cond_8
    move v15, v5

    :goto_4
    or-int/2addr v12, v15

    :goto_5
    and-int/lit8 v15, v14, 0x8

    if-eqz v15, :cond_a

    or-int/lit16 v12, v12, 0xc00

    :cond_9
    move-object/from16 v1, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v1, v13, 0x1c00

    if-nez v1, :cond_9

    move-object/from16 v1, p3

    invoke-interface {v10, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    const/16 v16, 0x800

    goto :goto_6

    :cond_b
    const/16 v16, 0x400

    :goto_6
    or-int v12, v12, v16

    :goto_7
    const v16, 0xe000

    and-int v16, v13, v16

    if-nez v16, :cond_d

    and-int/lit8 v16, v14, 0x10

    move-wide/from16 v0, p4

    if-nez v16, :cond_c

    invoke-interface {v10, v0, v1}, LT/l;->j(J)Z

    move-result v17

    if-eqz v17, :cond_c

    const/16 v17, 0x4000

    goto :goto_8

    :cond_c
    const/16 v17, 0x2000

    :goto_8
    or-int v12, v12, v17

    goto :goto_9

    :cond_d
    move-wide/from16 v0, p4

    :goto_9
    const/high16 v17, 0x70000

    and-int v17, v13, v17

    if-nez v17, :cond_f

    and-int/lit8 v17, v14, 0x20

    move-wide/from16 v8, p6

    if-nez v17, :cond_e

    invoke-interface {v10, v8, v9}, LT/l;->j(J)Z

    move-result v19

    if-eqz v19, :cond_e

    const/high16 v19, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v19, 0x10000

    :goto_a
    or-int v12, v12, v19

    goto :goto_b

    :cond_f
    move-wide/from16 v8, p6

    :goto_b
    and-int/lit8 v19, v14, 0x40

    if-eqz v19, :cond_10

    const/high16 v20, 0x180000

    or-int v12, v12, v20

    move/from16 v7, p8

    goto :goto_d

    :cond_10
    const/high16 v20, 0x380000

    and-int v20, v13, v20

    move/from16 v7, p8

    if-nez v20, :cond_12

    invoke-interface {v10, v7}, LT/l;->g(F)Z

    move-result v21

    if-eqz v21, :cond_11

    const/high16 v21, 0x100000

    goto :goto_c

    :cond_11
    const/high16 v21, 0x80000

    :goto_c
    or-int v12, v12, v21

    :cond_12
    :goto_d
    const/high16 v21, 0x1c00000

    and-int v21, v13, v21

    if-nez v21, :cond_15

    and-int/lit16 v6, v14, 0x80

    if-nez v6, :cond_13

    move/from16 v6, p9

    invoke-interface {v10, v6}, LT/l;->g(F)Z

    move-result v22

    if-eqz v22, :cond_14

    const/high16 v22, 0x800000

    goto :goto_e

    :cond_13
    move/from16 v6, p9

    :cond_14
    const/high16 v22, 0x400000

    :goto_e
    or-int v12, v12, v22

    goto :goto_f

    :cond_15
    move/from16 v6, p9

    :goto_f
    const/high16 v22, 0xe000000

    and-int v22, v13, v22

    if-nez v22, :cond_18

    const/16 v5, 0x100

    and-int/lit16 v0, v14, 0x100

    if-nez v0, :cond_16

    move/from16 v0, p10

    invoke-interface {v10, v0}, LT/l;->g(F)Z

    move-result v1

    if-eqz v1, :cond_17

    const/high16 v1, 0x4000000

    goto :goto_10

    :cond_16
    move/from16 v0, p10

    :cond_17
    const/high16 v1, 0x2000000

    :goto_10
    or-int/2addr v12, v1

    goto :goto_11

    :cond_18
    move/from16 v0, p10

    :goto_11
    const/high16 v1, 0x70000000

    and-int/2addr v1, v13

    if-nez v1, :cond_1b

    and-int/lit16 v1, v14, 0x200

    if-nez v1, :cond_19

    move-object/from16 v1, p11

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1a

    const/high16 v5, 0x20000000

    goto :goto_12

    :cond_19
    move-object/from16 v1, p11

    :cond_1a
    const/high16 v5, 0x10000000

    :goto_12
    or-int/2addr v12, v5

    goto :goto_13

    :cond_1b
    move-object/from16 v1, p11

    :goto_13
    const v5, 0x5b6db6db

    and-int/2addr v5, v12

    const v0, 0x12492492

    if-ne v5, v0, :cond_1d

    invoke-interface {v10}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-interface {v10}, LT/l;->C()V

    move/from16 v12, p10

    move-object v13, v1

    move-object v3, v4

    move v11, v6

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-wide/from16 v38, v8

    move v9, v7

    move-wide/from16 v7, v38

    goto/16 :goto_22

    :cond_1d
    :goto_14
    invoke-interface {v10}, LT/l;->q()V

    and-int/lit8 v0, v13, 0x1

    const v5, -0x70000001

    const v23, -0xe000001

    const v24, -0x1c00001

    const v25, -0x70001

    const v26, -0xe001

    if-eqz v0, :cond_24

    invoke-interface {v10}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_15

    :cond_1e
    invoke-interface {v10}, LT/l;->C()V

    const/16 v0, 0x10

    and-int/2addr v0, v14

    if-eqz v0, :cond_1f

    and-int v12, v12, v26

    :cond_1f
    const/16 v0, 0x20

    and-int/2addr v0, v14

    if-eqz v0, :cond_20

    and-int v12, v12, v25

    :cond_20
    const/16 v0, 0x80

    and-int/2addr v0, v14

    if-eqz v0, :cond_21

    and-int v12, v12, v24

    :cond_21
    const/16 v0, 0x100

    and-int/2addr v0, v14

    if-eqz v0, :cond_22

    and-int v12, v12, v23

    :cond_22
    and-int/lit16 v0, v14, 0x200

    if-eqz v0, :cond_23

    and-int/2addr v12, v5

    :cond_23
    move-object/from16 v0, p3

    move v3, v7

    move v15, v12

    move/from16 v7, p10

    move-object v12, v1

    move v1, v6

    move-wide/from16 v5, p4

    goto/16 :goto_1d

    :cond_24
    :goto_15
    if-eqz v3, :cond_25

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v4, v0

    :cond_25
    if-eqz v15, :cond_26

    sget-object v0, LY2/a$c;->a:LY2/a$c;

    :goto_16
    const/16 v3, 0x10

    goto :goto_17

    :cond_26
    move-object/from16 v0, p3

    goto :goto_16

    :goto_17
    and-int/2addr v3, v14

    if-eqz v3, :cond_27

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v3

    invoke-interface {v10, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->u()J

    move-result-wide v27

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v3

    invoke-interface {v10, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v29

    const/16 v33, 0xe

    const/16 v34, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v27 .. v34}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v27

    and-int v12, v12, v26

    :goto_18
    const/16 v3, 0x20

    goto :goto_19

    :cond_27
    move-wide/from16 v27, p4

    goto :goto_18

    :goto_19
    and-int/2addr v3, v14

    if-eqz v3, :cond_28

    sget-object v3, LN/r;->a:LN/r;

    sget v8, LN/r;->b:I

    invoke-virtual {v3, v10, v8}, LN/r;->b(LT/l;I)F

    move-result v31

    const/16 v35, 0xe

    const/16 v36, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-wide/from16 v29, v27

    invoke-static/range {v29 .. v36}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v8

    and-int v12, v12, v25

    :cond_28
    if-eqz v19, :cond_29

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    :goto_1a
    const/16 v7, 0x80

    goto :goto_1b

    :cond_29
    move v3, v7

    goto :goto_1a

    :goto_1b
    and-int/2addr v7, v14

    if-eqz v7, :cond_2a

    and-int v12, v12, v24

    move v6, v3

    :cond_2a
    const/16 v7, 0x100

    and-int/2addr v7, v14

    if-eqz v7, :cond_2b

    and-int v7, v12, v23

    move v12, v7

    move v7, v3

    goto :goto_1c

    :cond_2b
    move/from16 v7, p10

    :goto_1c
    and-int/lit16 v15, v14, 0x200

    if-eqz v15, :cond_2c

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v1

    and-int/2addr v12, v5

    :cond_2c
    move v15, v12

    move-object v12, v1

    move v1, v6

    move-wide/from16 v5, v27

    :goto_1d
    invoke-interface {v10}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v16

    if-eqz v16, :cond_2d

    const/4 v11, -0x1

    const-string v13, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:194)"

    const v14, -0x5fae2106

    invoke-static {v14, v15, v11, v13}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2d
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v11

    invoke-interface {v10, v11}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LY0/d;

    invoke-interface {v11, v3}, LY0/d;->x1(F)I

    move-result v11

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v13

    invoke-interface {v10, v13}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LY0/d;

    invoke-interface {v13, v7}, LY0/d;->x1(F)I

    move-result v13

    sget-object v14, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v14}, Lf0/c$a;->h()Lf0/c;

    move-result-object v15

    move-wide/from16 v16, v5

    const/4 v5, 0x0

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v6

    invoke-static {v10, v5}, LT/j;->a(LT/l;I)I

    move-result v15

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v5

    move/from16 p7, v11

    invoke-static {v10, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v18, LE0/g;->K:LE0/g$a;

    move-object/from16 v19, v4

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v20

    if-nez v20, :cond_2e

    invoke-static {}, LT/j;->c()V

    :cond_2e
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v20

    if-eqz v20, :cond_2f

    invoke-interface {v10, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_1e

    :cond_2f
    invoke-interface {v10}, LT/l;->I()V

    :goto_1e
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    move/from16 p6, v13

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v4, v6, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v4, v5, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v4}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_30

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v6, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    :cond_30
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_31
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v4, v11, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    invoke-virtual {v14}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v11, 0x30

    invoke-static {v4, v5, v10, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v10, v5}, LT/j;->a(LT/l;I)I

    move-result v11

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v10, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_32

    invoke-static {}, LT/j;->c()V

    :cond_32
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_33

    invoke-interface {v10, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_1f

    :cond_33
    invoke-interface {v10}, LT/l;->I()V

    :goto_1f
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v4, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v14, v5, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v14}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_34

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v5, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_35

    :cond_34
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v14, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v14, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_35
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v14, v13, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/Z;->a:Lz/Z;

    invoke-static {v6, v3, v1}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v8, v9, v12}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v4

    const v5, -0x1c57d49

    invoke-interface {v10, v5}, LT/l;->e(I)V

    const/4 v5, 0x0

    :goto_20
    if-ge v5, v2, :cond_36

    const/4 v6, 0x0

    invoke-static {v4, v10, v6}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_20

    :cond_36
    invoke-interface {v10}, LT/l;->P()V

    invoke-interface {v10}, LT/l;->R()V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v5, LY2/a$d;

    move-object/from16 p2, v5

    move-object/from16 p3, v0

    move-object/from16 p4, p0

    move/from16 p5, p1

    invoke-direct/range {p2 .. p7}, LY2/a$d;-><init>(Lmh/l;LY2/b;III)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/l;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v3, v1}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v5

    if-lez v2, :cond_37

    move-wide/from16 v13, v16

    invoke-static {v4, v13, v14, v12}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v4

    goto :goto_21

    :cond_37
    move-wide/from16 v13, v16

    :goto_21
    invoke-interface {v5, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v10, v5}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {v10}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_38

    invoke-static {}, LT/o;->P()V

    :cond_38
    move-object v4, v0

    move v11, v1

    move-wide v5, v13

    move-object v13, v12

    move v12, v7

    move-wide v7, v8

    move v9, v3

    move-object/from16 v3, v19

    :goto_22
    invoke-interface {v10}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_39

    new-instance v14, LY2/a$e;

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v2, p1

    move v10, v11

    move v11, v12

    move-object v12, v13

    move/from16 v13, p13

    move-object/from16 v37, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, LY2/a$e;-><init>(LY2/b;ILandroidx/compose/ui/e;Lmh/l;JJFFFLm0/i1;II)V

    move-object/from16 v0, v37

    invoke-interface {v15, v0}, LT/X0;->a(Lmh/p;)V

    :cond_39
    return-void
.end method

.method public static final synthetic c(LY2/b;ILandroidx/compose/ui/e;Lmh/l;JJFFFLm0/i1;LT/l;II)V
    .locals 0

    invoke-static/range {p0 .. p14}, LY2/a;->b(LY2/b;ILandroidx/compose/ui/e;Lmh/l;JJFFFLm0/i1;LT/l;II)V

    return-void
.end method
