.class public abstract LN/O0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V
    .locals 26

    move/from16 v10, p10

    const v0, 0x542c837a

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p11, 0x1

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
    and-int/lit8 v5, p11, 0x2

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
    and-int/lit16 v7, v10, 0x180

    if-nez v7, :cond_8

    and-int/lit8 v7, p11, 0x4

    if-nez v7, :cond_6

    move-wide/from16 v7, p2

    invoke-interface {v1, v7, v8}, LT/l;->j(J)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v7, p2

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    goto :goto_5

    :cond_8
    move-wide/from16 v7, p2

    :goto_5
    and-int/lit16 v9, v10, 0xc00

    if-nez v9, :cond_a

    and-int/lit8 v9, p11, 0x8

    move-wide/from16 v11, p4

    if-nez v9, :cond_9

    invoke-interface {v1, v11, v12}, LT/l;->j(J)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_6

    :cond_9
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v4, v9

    goto :goto_7

    :cond_a
    move-wide/from16 v11, p4

    :goto_7
    and-int/lit8 v9, p11, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v4, v4, 0x6000

    :cond_b
    move-object/from16 v13, p6

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v10, 0x6000

    if-nez v13, :cond_b

    move-object/from16 v13, p6

    invoke-interface {v1, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v4, v14

    :goto_9
    and-int/lit8 v14, p11, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v4, v15

    :cond_e
    move/from16 v15, p7

    goto :goto_b

    :cond_f
    and-int/2addr v15, v10

    if-nez v15, :cond_e

    move/from16 v15, p7

    invoke-interface {v1, v15}, LT/l;->g(F)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v4, v4, v16

    :goto_b
    and-int/lit8 v16, p11, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_11

    or-int v4, v4, v17

    move-object/from16 v0, p8

    goto :goto_d

    :cond_11
    and-int v16, v10, v17

    move-object/from16 v0, p8

    if-nez v16, :cond_13

    invoke-interface {v1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v17, 0x80000

    :goto_c
    or-int v4, v4, v17

    :cond_13
    :goto_d
    const v17, 0x92493

    and-int v0, v4, v17

    const v3, 0x92492

    if-ne v0, v3, :cond_15

    invoke-interface {v1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_f

    :cond_14
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p0

    :goto_e
    move-wide v3, v7

    move-object v7, v13

    move v8, v15

    goto/16 :goto_13

    :cond_15
    :goto_f
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v0, v10, 0x1

    if-eqz v0, :cond_19

    invoke-interface {v1}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    goto :goto_10

    :cond_16
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v0, p11, 0x4

    if-eqz v0, :cond_17

    and-int/lit16 v4, v4, -0x381

    :cond_17
    and-int/lit8 v0, p11, 0x8

    if-eqz v0, :cond_18

    and-int/lit16 v4, v4, -0x1c01

    :cond_18
    move-object/from16 v0, p0

    goto :goto_12

    :cond_19
    :goto_10
    if-eqz v2, :cond_1a

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p0

    :goto_11
    if-eqz v5, :cond_1b

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v2

    move-object v6, v2

    :cond_1b
    and-int/lit8 v2, p11, 0x4

    if-eqz v2, :cond_1c

    sget-object v2, LN/f0;->a:LN/f0;

    const/4 v3, 0x6

    invoke-virtual {v2, v1, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->n()J

    move-result-wide v2

    and-int/lit16 v4, v4, -0x381

    move-wide v7, v2

    :cond_1c
    and-int/lit8 v2, p11, 0x8

    if-eqz v2, :cond_1d

    shr-int/lit8 v2, v4, 0x6

    and-int/lit8 v2, v2, 0xe

    invoke-static {v7, v8, v1, v2}, LN/n;->b(JLT/l;I)J

    move-result-wide v2

    and-int/lit16 v4, v4, -0x1c01

    move-wide v11, v2

    :cond_1d
    if-eqz v9, :cond_1e

    const/4 v2, 0x0

    move-object v13, v2

    :cond_1e
    if-eqz v14, :cond_1f

    const/4 v2, 0x0

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move v15, v2

    :cond_1f
    :goto_12
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_20

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.Surface (Surface.kt:108)"

    const v5, 0x542c837a

    invoke-static {v5, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_20
    invoke-static {}, LN/N;->c()LT/H0;

    move-result-object v2

    invoke-interface {v1, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/h;

    invoke-virtual {v2}, LY0/h;->s()F

    move-result v2

    add-float/2addr v2, v15

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v22

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v2

    invoke-static {v11, v12}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    invoke-virtual {v2, v3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v2

    invoke-static {}, LN/N;->c()LT/H0;

    move-result-object v3

    invoke-static/range {v22 .. v22}, LY0/h;->d(F)LY0/h;

    move-result-object v4

    invoke-virtual {v3, v4}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v3

    filled-new-array {v2, v3}, [LT/I0;

    move-result-object v2

    new-instance v3, LN/O0$a;

    move-object/from16 v17, v3

    move-object/from16 v18, v0

    move-object/from16 v19, v6

    move-wide/from16 v20, v7

    move-object/from16 v23, v13

    move/from16 v24, v15

    move-object/from16 v25, p8

    invoke-direct/range {v17 .. v25}, LN/O0$a;-><init>(Landroidx/compose/ui/e;Lm0/i1;JFLs/g;FLmh/p;)V

    const/16 v4, 0x36

    const v5, -0x6c9bf7c6

    const/4 v9, 0x1

    invoke-static {v5, v9, v3, v1, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    sget v4, LT/I0;->i:I

    or-int/lit8 v4, v4, 0x30

    invoke-static {v2, v3, v1, v4}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-static {}, LT/o;->P()V

    :cond_21
    move-object v2, v0

    goto/16 :goto_e

    :goto_13
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_22

    new-instance v14, LN/O0$b;

    move-object v0, v14

    move-object v1, v2

    move-object v2, v6

    move-wide v5, v11

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LN/O0$b;-><init>(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_22
    return-void
.end method

.method public static final b(Lmh/a;Landroidx/compose/ui/e;ZLm0/i1;JJLs/g;FLy/m;Lmh/p;LT/l;II)V
    .locals 28

    move/from16 v13, p13

    move/from16 v14, p14

    const v0, 0x5d0914cd

    move-object/from16 v1, p12

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v14, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v13, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v13, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->l(Ljava/lang/Object;)Z

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
    move-object/from16 v2, p0

    move v3, v13

    :goto_1
    and-int/lit8 v4, v14, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v13, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

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
    move/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v13, 0x180

    if-nez v7, :cond_6

    move/from16 v7, p2

    invoke-interface {v1, v7}, LT/l;->c(Z)Z

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
    and-int/lit16 v9, v13, 0xc00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-interface {v1, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v3, v10

    :goto_7
    and-int/lit16 v10, v13, 0x6000

    if-nez v10, :cond_e

    and-int/lit8 v10, v14, 0x10

    if-nez v10, :cond_c

    move-wide/from16 v10, p4

    invoke-interface {v1, v10, v11}, LT/l;->j(J)Z

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
    const/high16 v12, 0x30000

    and-int/2addr v12, v13

    if-nez v12, :cond_10

    and-int/lit8 v12, v14, 0x20

    move-wide/from16 v9, p6

    if-nez v12, :cond_f

    invoke-interface {v1, v9, v10}, LT/l;->j(J)Z

    move-result v11

    if-eqz v11, :cond_f

    const/high16 v11, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v11, 0x10000

    :goto_a
    or-int/2addr v3, v11

    goto :goto_b

    :cond_10
    move-wide/from16 v9, p6

    :goto_b
    and-int/lit8 v11, v14, 0x40

    const/high16 v12, 0x180000

    if-eqz v11, :cond_12

    or-int/2addr v3, v12

    :cond_11
    move-object/from16 v12, p8

    goto :goto_d

    :cond_12
    and-int/2addr v12, v13

    if-nez v12, :cond_11

    move-object/from16 v12, p8

    invoke-interface {v1, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v3, v15

    :goto_d
    and-int/lit16 v15, v14, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_14

    or-int v3, v3, v16

    move/from16 v0, p9

    goto :goto_f

    :cond_14
    and-int v16, v13, v16

    move/from16 v0, p9

    if-nez v16, :cond_16

    invoke-interface {v1, v0}, LT/l;->g(F)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v17, 0x400000

    :goto_e
    or-int v3, v3, v17

    :cond_16
    :goto_f
    and-int/lit16 v0, v14, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_17

    or-int v3, v3, v17

    move-object/from16 v2, p10

    goto :goto_11

    :cond_17
    and-int v17, v13, v17

    move-object/from16 v2, p10

    if-nez v17, :cond_19

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_18

    const/high16 v17, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v17, 0x2000000

    :goto_10
    or-int v3, v3, v17

    :cond_19
    :goto_11
    and-int/lit16 v2, v14, 0x200

    const/high16 v17, 0x30000000

    if-eqz v2, :cond_1b

    or-int v3, v3, v17

    :cond_1a
    move-object/from16 v2, p11

    goto :goto_13

    :cond_1b
    and-int v2, v13, v17

    if-nez v2, :cond_1a

    move-object/from16 v2, p11

    invoke-interface {v1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1c

    const/high16 v17, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v17, 0x10000000

    :goto_12
    or-int v3, v3, v17

    :goto_13
    const v17, 0x12492493

    and-int v2, v3, v17

    const v5, 0x12492492

    if-ne v2, v5, :cond_1e

    invoke-interface {v1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_1d

    goto :goto_14

    :cond_1d
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-object/from16 v11, p10

    move v3, v7

    move-wide v7, v9

    move-object v9, v12

    move/from16 v10, p9

    goto/16 :goto_1b

    :cond_1e
    :goto_14
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v2, v13, 0x1

    const v17, -0xe001

    if-eqz v2, :cond_23

    invoke-interface {v1}, LT/l;->H()Z

    move-result v2

    if-eqz v2, :cond_1f

    goto :goto_15

    :cond_1f
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v0, v14, 0x10

    if-eqz v0, :cond_20

    and-int v3, v3, v17

    :cond_20
    and-int/lit8 v0, v14, 0x20

    if-eqz v0, :cond_21

    const v0, -0x70001

    and-int/2addr v3, v0

    :cond_21
    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move/from16 v11, p9

    :cond_22
    move-object/from16 v0, p10

    goto :goto_1a

    :cond_23
    :goto_15
    if-eqz v4, :cond_24

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_16

    :cond_24
    move-object/from16 v2, p1

    :goto_16
    if-eqz v6, :cond_25

    const/4 v7, 0x1

    :cond_25
    if-eqz v8, :cond_26

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v4

    goto :goto_17

    :cond_26
    move-object/from16 v4, p3

    :goto_17
    and-int/lit8 v6, v14, 0x10

    if-eqz v6, :cond_27

    sget-object v6, LN/f0;->a:LN/f0;

    const/4 v8, 0x6

    invoke-virtual {v6, v1, v8}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v6

    invoke-virtual {v6}, LN/m;->n()J

    move-result-wide v18

    and-int v3, v3, v17

    move-wide/from16 v5, v18

    goto :goto_18

    :cond_27
    move-wide/from16 v5, p4

    :goto_18
    and-int/lit8 v17, v14, 0x20

    if-eqz v17, :cond_28

    shr-int/lit8 v9, v3, 0xc

    and-int/lit8 v9, v9, 0xe

    invoke-static {v5, v6, v1, v9}, LN/n;->b(JLT/l;I)J

    move-result-wide v9

    const v17, -0x70001

    and-int v3, v3, v17

    :cond_28
    const/16 v17, 0x0

    if-eqz v11, :cond_29

    move-object/from16 v12, v17

    :cond_29
    if-eqz v15, :cond_2a

    const/4 v11, 0x0

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    goto :goto_19

    :cond_2a
    move/from16 v11, p9

    :goto_19
    if-eqz v0, :cond_22

    move-object/from16 v0, v17

    :goto_1a
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v15

    if-eqz v15, :cond_2b

    const/4 v15, -0x1

    const-string v8, "androidx.compose.material.Surface (Surface.kt:218)"

    const v13, 0x5d0914cd

    invoke-static {v13, v3, v15, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2b
    invoke-static {}, LN/N;->c()LT/H0;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/h;

    invoke-virtual {v3}, LY0/h;->s()F

    move-result v3

    add-float/2addr v3, v11

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v20

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v3

    invoke-static {v9, v10}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v8

    invoke-virtual {v3, v8}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v3

    invoke-static {}, LN/N;->c()LT/H0;

    move-result-object v8

    invoke-static/range {v20 .. v20}, LY0/h;->d(F)LY0/h;

    move-result-object v13

    invoke-virtual {v8, v13}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v8

    filled-new-array {v3, v8}, [LT/I0;

    move-result-object v3

    new-instance v8, LN/O0$c;

    move-object v15, v8

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    move-wide/from16 v18, v5

    move-object/from16 v21, v12

    move/from16 v22, v11

    move-object/from16 v23, v0

    move/from16 v24, v7

    move-object/from16 v25, p0

    move-object/from16 v26, p11

    invoke-direct/range {v15 .. v26}, LN/O0$c;-><init>(Landroidx/compose/ui/e;Lm0/i1;JFLs/g;FLy/m;ZLmh/a;Lmh/p;)V

    const/16 v13, 0x36

    const v15, 0x7916180d

    move-object/from16 p2, v0

    const/4 v0, 0x1

    invoke-static {v15, v0, v8, v1, v13}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v8, LT/I0;->i:I

    or-int/lit8 v8, v8, 0x30

    invoke-static {v3, v0, v1, v8}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-static {}, LT/o;->P()V

    :cond_2c
    move v3, v7

    move-wide v7, v9

    move v10, v11

    move-object v9, v12

    move-object/from16 v11, p2

    :goto_1b
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_2d

    new-instance v13, LN/O0$d;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v12, p11

    move-object/from16 v27, v13

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, LN/O0$d;-><init>(Lmh/a;Landroidx/compose/ui/e;ZLm0/i1;JJLs/g;FLy/m;Lmh/p;II)V

    move-object/from16 v0, v27

    invoke-interface {v15, v0}, LT/X0;->a(Lmh/p;)V

    :cond_2d
    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/e;Lm0/i1;JLs/g;F)Landroidx/compose/ui/e;
    .locals 0

    invoke-static/range {p0 .. p5}, LN/O0;->e(Landroidx/compose/ui/e;Lm0/i1;JLs/g;F)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(JLN/M;FLT/l;I)J
    .locals 0

    invoke-static/range {p0 .. p5}, LN/O0;->f(JLN/M;FLT/l;I)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final e(Landroidx/compose/ui/e;Lm0/i1;JLs/g;F)Landroidx/compose/ui/e;
    .locals 10

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p0

    move v1, p5

    move-object v2, p1

    invoke-static/range {v0 .. v9}, Lj0/k;->b(Landroidx/compose/ui/e;FLm0/i1;ZJJILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    if-eqz p4, :cond_0

    sget-object p5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p5, p4, p1}, Ls/e;->e(Landroidx/compose/ui/e;Ls/g;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object p4

    goto :goto_0

    :cond_0
    sget-object p4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_0
    invoke-interface {p0, p4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    invoke-static {p0, p2, p3, p1}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object p0

    invoke-static {p0, p1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final f(JLN/M;FLT/l;I)J
    .locals 7

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:495)"

    const v2, 0x5d144bf8

    invoke-static {v2, p5, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LN/f0;->a:LN/f0;

    const/4 v1, 0x6

    invoke-virtual {v0, p4, v1}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v0

    invoke-virtual {v0}, LN/m;->n()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    const v0, 0x4080a154

    invoke-interface {p4, v0}, LT/l;->U(I)V

    and-int/lit8 v0, p5, 0xe

    shr-int/lit8 v1, p5, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    shl-int/lit8 p5, p5, 0x3

    and-int/lit16 p5, p5, 0x380

    or-int v6, v0, p5

    move-object v1, p2

    move-wide v2, p0

    move v4, p3

    move-object v5, p4

    invoke-interface/range {v1 .. v6}, LN/M;->a(JFLT/l;I)J

    move-result-wide p0

    invoke-interface {p4}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const p2, 0x4081ab5f

    invoke-interface {p4, p2}, LT/l;->U(I)V

    invoke-interface {p4}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-wide p0
.end method
