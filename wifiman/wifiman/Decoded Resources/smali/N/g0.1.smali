.class public abstract LN/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LN/m;LN/c1;LN/F0;Lmh/p;LT/l;II)V
    .locals 43

    move-object/from16 v4, p3

    move/from16 v5, p5

    const v0, -0x3521f1f7    # -7276292.5f

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, p6, 0x1

    if-nez v2, :cond_0

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p6, 0x2

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v6, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_8

    and-int/lit8 v7, p6, 0x4

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v7, p2

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    goto :goto_5

    :cond_8
    move-object/from16 v7, p2

    :goto_5
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_b

    invoke-interface {v1, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v3, v8

    :cond_b
    :goto_7
    and-int/lit16 v8, v3, 0x493

    const/16 v9, 0x492

    if-ne v8, v9, :cond_d

    invoke-interface {v1}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v6

    move-object v15, v7

    goto/16 :goto_c

    :cond_d
    :goto_8
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v8, v5, 0x1

    const/4 v13, 0x6

    if-eqz v8, :cond_12

    invoke-interface {v1}, LT/l;->H()Z

    move-result v8

    if-eqz v8, :cond_e

    goto :goto_a

    :cond_e
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v8, p6, 0x1

    if-eqz v8, :cond_f

    and-int/lit8 v3, v3, -0xf

    :cond_f
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_10

    and-int/lit8 v3, v3, -0x71

    :cond_10
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_11

    :goto_9
    and-int/lit16 v3, v3, -0x381

    :cond_11
    move-object v12, v7

    move-object/from16 v42, v6

    move v6, v3

    move-object/from16 v3, v42

    goto :goto_b

    :cond_12
    :goto_a
    and-int/lit8 v8, p6, 0x1

    if-eqz v8, :cond_13

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v1, v13}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    and-int/lit8 v3, v3, -0xf

    :cond_13
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_14

    sget-object v6, LN/f0;->a:LN/f0;

    invoke-virtual {v6, v1, v13}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object v6

    and-int/lit8 v3, v3, -0x71

    :cond_14
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_11

    sget-object v7, LN/f0;->a:LN/f0;

    invoke-virtual {v7, v1, v13}, LN/f0;->b(LT/l;I)LN/F0;

    move-result-object v7

    goto :goto_9

    :goto_b
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_15

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:59)"

    invoke-static {v0, v6, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_15
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_16

    const/16 v40, 0x1fff

    const/16 v41, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    move-object v14, v2

    invoke-static/range {v14 .. v41}, LN/m;->b(LN/m;JJJJJJJJJJJJZILjava/lang/Object;)LN/m;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast v0, LN/m;

    invoke-static {v0, v2}, LN/n;->g(LN/m;LN/m;)V

    const/4 v11, 0x0

    const/4 v14, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v10, v1

    move-object v15, v12

    move v12, v14

    invoke-static/range {v6 .. v12}, LN/A0;->g(ZFJLT/l;II)Ls/G;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v0, v1, v7}, LN/e0;->e(LN/m;LT/l;I)LM/K;

    move-result-object v7

    invoke-static {}, LN/n;->d()LT/H0;

    move-result-object v8

    invoke-virtual {v8, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v16

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v0

    sget-object v8, LN/r;->a:LN/r;

    invoke-virtual {v8, v1, v13}, LN/r;->c(LT/l;I)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v0, v8}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v17

    invoke-static {}, Landroidx/compose/foundation/j;->a()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v6}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v18

    invoke-static {}, LP/s;->d()LT/H0;

    move-result-object v0

    sget-object v6, LN/o;->b:LN/o;

    invoke-virtual {v0, v6}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v19

    invoke-static {}, LN/G0;->a()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v15}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v20

    invoke-static {}, LM/L;->b()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v7}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v21

    invoke-static {}, LN/d1;->c()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v22

    filled-new-array/range {v16 .. v22}, [LT/I0;

    move-result-object v0

    new-instance v6, LN/g0$a;

    invoke-direct {v6, v3, v4}, LN/g0$a;-><init>(LN/c1;Lmh/p;)V

    const/16 v7, 0x36

    const v8, -0x67b7dd37

    const/4 v9, 0x1

    invoke-static {v8, v9, v6, v1, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    sget v7, LT/I0;->i:I

    or-int/lit8 v7, v7, 0x30

    invoke-static {v0, v6, v1, v7}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LT/o;->P()V

    :cond_17
    :goto_c
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v8, LN/g0$b;

    move-object v0, v8

    move-object v1, v2

    move-object v2, v3

    move-object v3, v15

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LN/g0$b;-><init>(LN/m;LN/c1;LN/F0;Lmh/p;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_18
    return-void
.end method
