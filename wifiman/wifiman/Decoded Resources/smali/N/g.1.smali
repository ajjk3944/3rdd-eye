.class public abstract LN/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;LT/l;II)V
    .locals 40

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    const v0, -0x7e21a258

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    move-object/from16 v15, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    move-object/from16 v15, p0

    if-nez v1, :cond_2

    invoke-interface {v14, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-interface {v14, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_2

    :cond_5
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :goto_3
    and-int/lit8 v4, v12, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move/from16 v5, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_6

    move/from16 v5, p2

    invoke-interface {v14, v5}, LT/l;->c(Z)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_4

    :cond_8
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    :goto_5
    and-int/lit8 v6, v12, 0x8

    if-eqz v6, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v7, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_9

    move-object/from16 v7, p3

    invoke-interface {v14, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x800

    goto :goto_6

    :cond_b
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v1, v8

    :goto_7
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_e

    and-int/lit8 v8, v12, 0x10

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-interface {v14, v8}, LT/l;->T(Ljava/lang/Object;)Z

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
    const/high16 v9, 0x30000

    and-int/2addr v9, v11

    if-nez v9, :cond_10

    and-int/lit8 v9, v12, 0x20

    move-object/from16 v13, p5

    if-nez v9, :cond_f

    invoke-interface {v14, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    const/high16 v9, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v9, 0x10000

    :goto_a
    or-int/2addr v1, v9

    goto :goto_b

    :cond_10
    move-object/from16 v13, p5

    :goto_b
    and-int/lit8 v16, v12, 0x40

    const/high16 v9, 0x180000

    if-eqz v16, :cond_12

    or-int/2addr v1, v9

    :cond_11
    move-object/from16 v9, p6

    goto :goto_d

    :cond_12
    and-int/2addr v9, v11

    if-nez v9, :cond_11

    move-object/from16 v9, p6

    invoke-interface {v14, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x80000

    :goto_c
    or-int v1, v1, v17

    :goto_d
    const/high16 v17, 0xc00000

    and-int v17, v11, v17

    if-nez v17, :cond_16

    and-int/lit16 v0, v12, 0x80

    if-nez v0, :cond_14

    move-object/from16 v0, p7

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_14
    move-object/from16 v0, p7

    :cond_15
    const/high16 v17, 0x400000

    :goto_e
    or-int v1, v1, v17

    goto :goto_f

    :cond_16
    move-object/from16 v0, p7

    :goto_f
    and-int/lit16 v15, v12, 0x100

    const/high16 v17, 0x6000000

    if-eqz v15, :cond_18

    or-int v1, v1, v17

    :cond_17
    move/from16 v17, v15

    move-object/from16 v15, p8

    goto :goto_11

    :cond_18
    and-int v17, v11, v17

    if-nez v17, :cond_17

    move/from16 v17, v15

    move-object/from16 v15, p8

    invoke-interface {v14, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v1, v1, v18

    :goto_11
    and-int/lit16 v0, v12, 0x200

    const/high16 v26, 0x30000000

    if-eqz v0, :cond_1b

    or-int v1, v1, v26

    :cond_1a
    :goto_12
    move v0, v1

    goto :goto_14

    :cond_1b
    and-int v0, v11, v26

    if-nez v0, :cond_1a

    invoke-interface {v14, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const/high16 v0, 0x20000000

    goto :goto_13

    :cond_1c
    const/high16 v0, 0x10000000

    :goto_13
    or-int/2addr v1, v0

    goto :goto_12

    :goto_14
    const v1, 0x12492493

    and-int/2addr v1, v0

    const v3, 0x12492492

    if-ne v1, v3, :cond_1e

    invoke-interface {v14}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_1d

    goto :goto_15

    :cond_1d
    invoke-interface {v14}, LT/l;->C()V

    move-object/from16 v2, p1

    move v3, v5

    move-object v4, v7

    move-object v5, v8

    move-object v6, v13

    move-object v7, v14

    move-object/from16 v8, p7

    goto/16 :goto_23

    :cond_1e
    :goto_15
    invoke-interface {v14}, LT/l;->q()V

    and-int/lit8 v1, v11, 0x1

    const v27, -0x1c00001

    const v18, -0x70001

    const v19, -0xe001

    const/4 v3, 0x0

    const/4 v15, 0x1

    if-eqz v1, :cond_23

    invoke-interface {v14}, LT/l;->H()Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_16

    :cond_1f
    invoke-interface {v14}, LT/l;->C()V

    and-int/lit8 v1, v12, 0x10

    if-eqz v1, :cond_20

    and-int v0, v0, v19

    :cond_20
    and-int/lit8 v1, v12, 0x20

    if-eqz v1, :cond_21

    and-int v0, v0, v18

    :cond_21
    and-int/lit16 v1, v12, 0x80

    if-eqz v1, :cond_22

    and-int v0, v0, v27

    :cond_22
    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move v6, v0

    move-object/from16 v30, v7

    move-object v2, v13

    move-object v7, v14

    move v1, v15

    move-object/from16 v0, p1

    goto/16 :goto_1e

    :cond_23
    :goto_16
    if-eqz v2, :cond_24

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v28, v1

    goto :goto_17

    :cond_24
    move-object/from16 v28, p1

    :goto_17
    if-eqz v4, :cond_25

    move/from16 v29, v15

    goto :goto_18

    :cond_25
    move/from16 v29, v5

    :goto_18
    if-eqz v6, :cond_26

    move-object/from16 v30, v3

    goto :goto_19

    :cond_26
    move-object/from16 v30, v7

    :goto_19
    and-int/lit8 v1, v12, 0x10

    if-eqz v1, :cond_27

    sget-object v1, LN/e;->a:LN/e;

    const/high16 v8, 0x30000

    const/16 v20, 0x1f

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-object v7, v14

    move/from16 v9, v20

    invoke-virtual/range {v1 .. v9}, LN/e;->b(FFFFFLT/l;II)LN/f;

    move-result-object v1

    and-int v0, v0, v19

    move-object v8, v1

    :cond_27
    and-int/lit8 v1, v12, 0x20

    if-eqz v1, :cond_28

    sget-object v1, LN/f0;->a:LN/f0;

    const/4 v2, 0x6

    invoke-virtual {v1, v14, v2}, LN/f0;->b(LT/l;I)LN/F0;

    move-result-object v1

    invoke-virtual {v1}, LN/F0;->c()LE/a;

    move-result-object v1

    and-int v0, v0, v18

    goto :goto_1a

    :cond_28
    move-object v1, v13

    :goto_1a
    if-eqz v16, :cond_29

    const/4 v2, 0x0

    goto :goto_1b

    :cond_29
    move-object/from16 v2, p6

    :goto_1b
    and-int/lit16 v3, v12, 0x80

    if-eqz v3, :cond_2a

    sget-object v13, LN/e;->a:LN/e;

    const/16 v23, 0x6000

    const/16 v24, 0xf

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    move-object/from16 p1, v1

    move-object v7, v14

    move v1, v15

    move/from16 v9, v17

    move-wide v14, v3

    move-wide/from16 v16, v5

    move-object/from16 v22, v7

    invoke-virtual/range {v13 .. v24}, LN/e;->a(JJJJLT/l;II)LN/d;

    move-result-object v3

    and-int v0, v0, v27

    goto :goto_1c

    :cond_2a
    move-object/from16 p1, v1

    move-object v7, v14

    move v1, v15

    move/from16 v9, v17

    move-object/from16 v3, p7

    :goto_1c
    if-eqz v9, :cond_2b

    sget-object v4, LN/e;->a:LN/e;

    invoke-virtual {v4}, LN/e;->c()Lz/N;

    move-result-object v4

    :goto_1d
    move v6, v0

    move-object v9, v2

    move-object/from16 v0, v28

    move/from16 v5, v29

    move-object/from16 v2, p1

    goto :goto_1e

    :cond_2b
    move-object/from16 v4, p8

    goto :goto_1d

    :goto_1e
    invoke-interface {v7}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v13

    if-eqz v13, :cond_2c

    const/4 v13, -0x1

    const-string v14, "androidx.compose.material.Button (Button.kt:103)"

    const v15, -0x7e21a258

    invoke-static {v15, v6, v13, v14}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2c
    if-nez v30, :cond_2e

    const v13, 0x3e9e8ba3

    invoke-interface {v7, v13}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, LT/l;->a:LT/l$a;

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v13, v14, :cond_2d

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v13

    invoke-interface {v7, v13}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2d
    check-cast v13, Ly/m;

    invoke-interface {v7}, LT/l;->J()V

    move-object v15, v13

    goto :goto_1f

    :cond_2e
    const v13, -0xe7f064c

    invoke-interface {v7, v13}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->J()V

    move-object/from16 v15, v30

    :goto_1f
    shr-int/lit8 v13, v6, 0x6

    and-int/lit8 v14, v13, 0xe

    shr-int/lit8 v16, v6, 0x12

    and-int/lit8 v16, v16, 0x70

    or-int v14, v14, v16

    invoke-interface {v3, v5, v7, v14}, LN/d;->b(ZLT/l;I)LT/z1;

    move-result-object v1

    sget-object v11, LN/g$a;->a:LN/g$a;

    const/4 v12, 0x0

    move-object/from16 p2, v2

    move-object/from16 p1, v9

    const/4 v2, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v12, v11, v2, v9}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v11

    invoke-interface {v3, v5, v7, v14}, LN/d;->a(ZLT/l;I)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v17

    invoke-static {v1}, LN/g;->b(LT/z1;)J

    move-result-wide v31

    const/16 v37, 0xe

    const/16 v38, 0x0

    const/high16 v33, 0x3f800000    # 1.0f

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v31 .. v38}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v19

    if-nez v8, :cond_2f

    const v2, 0x3ea4c024

    invoke-interface {v7, v2}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->J()V

    goto :goto_20

    :cond_2f
    const v2, -0xe7ed083

    invoke-interface {v7, v2}, LT/l;->U(I)V

    and-int/lit16 v2, v13, 0x38e

    invoke-interface {v8, v5, v15, v7, v2}, LN/f;->a(ZLy/k;LT/l;I)LT/z1;

    move-result-object v2

    invoke-interface {v7}, LT/l;->J()V

    move-object v9, v2

    :goto_20
    if-eqz v9, :cond_30

    invoke-interface {v9}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/h;

    invoke-virtual {v2}, LY0/h;->s()F

    move-result v2

    :goto_21
    move/from16 v22, v2

    goto :goto_22

    :cond_30
    int-to-float v2, v12

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    goto :goto_21

    :goto_22
    new-instance v2, LN/g$b;

    invoke-direct {v2, v1, v4, v10}, LN/g$b;-><init>(LT/z1;Lz/N;Lmh/q;)V

    const/16 v1, 0x36

    const v9, 0x72cfaf

    const/4 v12, 0x1

    invoke-static {v9, v12, v2, v7, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v24

    and-int/lit8 v1, v6, 0xe

    or-int v1, v1, v26

    and-int/lit16 v2, v6, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v13, 0x1c00

    or-int/2addr v1, v2

    const/high16 v2, 0x380000

    and-int/2addr v2, v6

    or-int v26, v1, v2

    const/16 v27, 0x0

    move-object/from16 v13, p0

    move-object v14, v11

    move-object v1, v15

    move v15, v5

    move-object/from16 v16, p2

    move-object/from16 v21, p1

    move-object/from16 v23, v1

    move-object/from16 v25, v7

    invoke-static/range {v13 .. v27}, LN/O0;->b(Lmh/a;Landroidx/compose/ui/e;ZLm0/i1;JJLs/g;FLy/m;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_31

    invoke-static {}, LT/o;->P()V

    :cond_31
    move-object/from16 v9, p1

    move-object/from16 v6, p2

    move-object v2, v0

    move-object v15, v4

    move-object/from16 v4, v30

    move-object/from16 v39, v8

    move-object v8, v3

    move v3, v5

    move-object/from16 v5, v39

    :goto_23
    invoke-interface {v7}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_32

    new-instance v14, LN/g$c;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object v7, v9

    move-object v9, v15

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LN/g$c;-><init>(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_32
    return-void
.end method

.method private static final b(LT/z1;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final c(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;LT/l;II)V
    .locals 19

    move/from16 v0, p11

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_0

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    move v5, v2

    goto :goto_1

    :cond_1
    move/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v1, 0x8

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v6, v3

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_3

    move-object v7, v3

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_4

    sget-object v2, LN/f0;->a:LN/f0;

    const/4 v8, 0x6

    move-object/from16 v14, p10

    invoke-virtual {v2, v14, v8}, LN/f0;->b(LT/l;I)LN/F0;

    move-result-object v2

    invoke-virtual {v2}, LN/F0;->c()LE/a;

    move-result-object v2

    move-object v8, v2

    goto :goto_4

    :cond_4
    move-object/from16 v14, p10

    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_5

    move-object v2, v3

    goto :goto_5

    :cond_5
    move-object/from16 v2, p6

    :goto_5
    and-int/lit16 v3, v1, 0x80

    if-eqz v3, :cond_6

    sget-object v9, LN/e;->a:LN/e;

    const/16 v17, 0xc00

    const/16 v18, 0x7

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v15, 0x0

    move-wide v14, v15

    move-object/from16 v16, p10

    invoke-virtual/range {v9 .. v18}, LN/e;->h(JJJLT/l;II)LN/d;

    move-result-object v3

    move-object v10, v3

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_7

    sget-object v1, LN/e;->a:LN/e;

    invoke-virtual {v1}, LN/e;->f()Lz/N;

    move-result-object v1

    move-object v11, v1

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v3, "androidx.compose.material.TextButton (Button.kt:233)"

    const v9, 0x1136b375

    invoke-static {v9, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const v1, 0x7ffffffe

    and-int v14, v0, v1

    const/4 v15, 0x0

    move-object/from16 v3, p0

    move-object v9, v2

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    invoke-static/range {v3 .. v15}, LN/g;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/f;Lm0/i1;Ls/g;LN/d;Lz/N;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-void
.end method

.method public static final synthetic d(LT/z1;)J
    .locals 2

    invoke-static {p0}, LN/g;->b(LT/z1;)J

    move-result-wide v0

    return-wide v0
.end method
