.class public abstract LBe/H0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/platform/h0;LL0/d;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LBe/H0;->f(Landroidx/compose/ui/platform/h0;LL0/d;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LBe/H0;->g()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LBe/A0;ZIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LBe/H0;->e(Landroidx/compose/ui/e;LBe/A0;ZIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;LBe/A0;ZLT/l;II)V
    .locals 41

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    move/from16 v9, p4

    const/4 v0, 0x2

    const/16 v2, 0x30

    const/4 v10, 0x6

    const-string v3, "modifier"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "model"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x2f8e89dc

    move-object/from16 v4, p3

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v7

    const/4 v6, 0x1

    and-int/lit8 v4, p5, 0x1

    const/4 v5, 0x4

    if-eqz v4, :cond_0

    or-int/lit8 v4, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v9, 0x6

    if-nez v4, :cond_2

    invoke-interface {v7, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v0

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move v4, v9

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_3

    or-int/2addr v4, v2

    goto :goto_3

    :cond_3
    and-int/lit8 v0, v9, 0x30

    if-nez v0, :cond_5

    invoke-interface {v7, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x20

    goto :goto_2

    :cond_4
    const/16 v0, 0x10

    :goto_2
    or-int/2addr v4, v0

    :cond_5
    :goto_3
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v9, 0x180

    if-nez v11, :cond_6

    move/from16 v11, p2

    invoke-interface {v7, v11}, LT/l;->c(Z)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v4, v12

    :goto_5
    and-int/lit16 v12, v4, 0x93

    const/16 v13, 0x92

    if-ne v12, v13, :cond_a

    invoke-interface {v7}, LT/l;->v()Z

    move-result v12

    if-nez v12, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v7}, LT/l;->C()V

    move-object v3, v7

    goto/16 :goto_f

    :cond_a
    :goto_6
    const/4 v14, 0x0

    if-eqz v0, :cond_b

    move v0, v14

    goto :goto_7

    :cond_b
    move v0, v11

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_c

    const/4 v11, -0x1

    const-string v12, "com.ui.wifiman.ui.component.WirelessSignal (WirelessSignal.kt:59)"

    invoke-static {v3, v4, v11, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    sget-object v37, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v37 .. v37}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    const/16 v11, 0x8

    int-to-float v13, v11

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v11

    invoke-virtual {v4, v11}, Lz/c;->n(F)Lz/c$f;

    move-result-object v11

    const/16 v12, 0x36

    invoke-static {v11, v3, v7, v12}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v7, v14}, LT/j;->a(LT/l;I)I

    move-result v11

    invoke-interface {v7}, LT/l;->G()LT/x;

    move-result-object v14

    invoke-static {v7, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v15

    sget-object v38, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v7}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_d

    invoke-static {}, LT/j;->c()V

    :cond_d
    invoke-interface {v7}, LT/l;->u()V

    invoke-interface {v7}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_e

    invoke-interface {v7, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_e
    invoke-interface {v7}, LT/l;->I()V

    :goto_8
    invoke-static {v7}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v10, v3, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v10, v14, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v10}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v5, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    :cond_f
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v10, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v10, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_10
    invoke-virtual/range {v38 .. v38}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v10, v15, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v10, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, LBe/A0;->e()Ls9/a;

    move-result-object v3

    if-eqz v3, :cond_11

    move v3, v6

    goto :goto_9

    :cond_11
    const/4 v3, 0x0

    :goto_9
    new-instance v5, LBe/H0$a;

    invoke-direct {v5, v8}, LBe/H0$a;-><init>(LBe/A0;)V

    const v11, 0x4950fc20    # 856002.0f

    invoke-static {v11, v6, v5, v7, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v17

    const v19, 0x180006

    const/16 v20, 0x1e

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    move-object v11, v10

    move v2, v12

    move v12, v3

    move v3, v13

    move-object v13, v5

    const/4 v5, 0x0

    move-object/from16 v16, v18

    move-object/from16 v18, v7

    invoke-static/range {v11 .. v20}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-interface {v10, v15, v14, v6}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v11

    invoke-virtual/range {v37 .. v37}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v12

    const/4 v13, 0x5

    int-to-float v13, v13

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v13

    invoke-virtual {v4, v13}, Lz/c;->n(F)Lz/c$f;

    move-result-object v13

    invoke-static {v13, v12, v7, v2}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v12

    invoke-static {v7, v5}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface {v7}, LT/l;->G()LT/x;

    move-result-object v2

    invoke-static {v7, v11}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v7}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_12

    invoke-static {}, LT/j;->c()V

    :cond_12
    invoke-interface {v7}, LT/l;->u()V

    invoke-interface {v7}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_13

    invoke-interface {v7, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_13
    invoke-interface {v7}, LT/l;->I()V

    :goto_a
    invoke-static {v7}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v14, v12, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v14, v2, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v14}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_14

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    :cond_14
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v14, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v14, v5, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_15
    invoke-virtual/range {v38 .. v38}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v14, v11, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->f()LT/H0;

    move-result-object v2

    invoke-interface {v7, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroidx/compose/ui/platform/h0;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v2

    invoke-interface {v7, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/content/Context;

    const/4 v13, 0x0

    const/4 v12, 0x0

    invoke-static {v15, v13, v6, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v37 .. v37}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    invoke-virtual {v4}, Lz/c;->f()Lz/c$e;

    move-result-object v12

    const/16 v13, 0x30

    invoke-static {v12, v5, v7, v13}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v12, 0x0

    invoke-static {v7, v12}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface {v7}, LT/l;->G()LT/x;

    move-result-object v12

    invoke-static {v7, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {v7}, LT/l;->x()LT/f;

    move-result-object v20

    if-nez v20, :cond_16

    invoke-static {}, LT/j;->c()V

    :cond_16
    invoke-interface {v7}, LT/l;->u()V

    invoke-interface {v7}, LT/l;->o()Z

    move-result v20

    if-eqz v20, :cond_17

    invoke-interface {v7, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_b

    :cond_17
    invoke-interface {v7}, LT/l;->I()V

    :goto_b
    invoke-static {v7}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->e()Lmh/p;

    move-result-object v1

    invoke-static {v6, v5, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v6, v12, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v6}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_18

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_19

    :cond_18
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_19
    invoke-virtual/range {v38 .. v38}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v6, v2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {p1 .. p1}, LBe/A0;->h()Ls9/d;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v1, v7, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    const/4 v6, 0x1

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-interface {v10, v15, v13, v6}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v12

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v4, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v19

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v4, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v20

    new-instance v3, LBe/H0$b;

    move-object/from16 p2, v15

    const/16 v15, 0x36

    move-object v2, v3

    move-object v13, v3

    move v3, v0

    move-object/from16 v39, v4

    move-object v4, v14

    move-object v5, v1

    move v1, v6

    move-object v6, v11

    move-object v11, v7

    move-object/from16 v7, p1

    invoke-direct/range {v2 .. v7}, LBe/H0$b;-><init>(ZLandroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;LBe/A0;)V

    const v2, 0x4f4dd319

    invoke-static {v2, v1, v13, v11, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    const v3, 0x1801b0

    const/16 v4, 0x38

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v13, v11

    move-object v11, v12

    move-object/from16 v12, v19

    move-object/from16 p3, v13

    const/high16 v16, 0x3f800000    # 1.0f

    move-object/from16 v13, v20

    move-object/from16 v40, v14

    move v14, v5

    move-object/from16 v5, p2

    move v15, v6

    move-object/from16 v16, v7

    move-object/from16 v17, v2

    move-object/from16 v18, p3

    move/from16 v19, v3

    move/from16 v20, v4

    invoke-static/range {v11 .. v20}, Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LBe/A0;->k()Ls9/d;

    move-result-object v2

    move-object/from16 v3, p3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v11

    sget-object v2, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v2, v3, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->b()LL0/U;

    move-result-object v32

    invoke-virtual {v2, v3, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v13

    const/16 v35, 0x0

    const v36, 0x1fffa

    const/4 v12, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    move-object/from16 v33, v3

    invoke-static/range {v11 .. v36}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    const v7, 0x648c1b9a

    invoke-interface {v3, v7}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LBe/A0;->b()Z

    move-result v7

    if-eqz v7, :cond_1a

    sget-object v7, LAf/p$a;->a:LAf/p$a;

    const/4 v11, 0x6

    invoke-virtual {v7, v3, v11}, LAf/p$a;->c(LT/l;I)V

    :cond_1a
    invoke-interface {v3}, LT/l;->J()V

    const/4 v7, 0x0

    const/4 v11, 0x0

    invoke-static {v5, v7, v1, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v12

    invoke-virtual/range {v37 .. v37}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v13

    const/16 v14, 0x10

    int-to-float v14, v14

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v14

    move-object/from16 v15, v39

    invoke-virtual {v15, v14}, Lz/c;->n(F)Lz/c$f;

    move-result-object v14

    const/16 v15, 0x36

    invoke-static {v14, v13, v3, v15}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v13

    invoke-static {v3, v4}, LT/j;->a(LT/l;I)I

    move-result v14

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v3, v12}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v12

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_1b

    invoke-static {}, LT/j;->c()V

    :cond_1b
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_1c

    invoke-interface {v3, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_c

    :cond_1c
    invoke-interface {v3}, LT/l;->I()V

    :goto_c
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v11, v13, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v11, v15, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v38 .. v38}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v11}, LT/l;->o()Z

    move-result v13

    if-nez v13, :cond_1d

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v13, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1e

    :cond_1d
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v11, v13}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v11, v13, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1e
    invoke-virtual/range {v38 .. v38}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v11, v12, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {p1 .. p1}, LBe/A0;->a()Ls9/d;

    move-result-object v7

    const v11, 0x3af84e8b

    invoke-interface {v3, v11}, LT/l;->U(I)V

    if-nez v7, :cond_1f

    const/4 v7, 0x0

    goto/16 :goto_d

    :cond_1f
    invoke-virtual/range {p1 .. p1}, LBe/A0;->a()Ls9/d;

    move-result-object v7

    invoke-static {v7, v3, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v11

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-interface {v10, v5, v7, v1}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v16

    const v7, 0x2e7eb521

    invoke-interface {v3, v7}, LT/l;->U(I)V

    move-object/from16 v7, v40

    invoke-interface {v3, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v3, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_20

    sget-object v10, LT/l;->a:LT/l$a;

    invoke-virtual {v10}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v12, v10, :cond_21

    :cond_20
    new-instance v12, LBe/E0;

    invoke-direct {v12, v7, v11}, LBe/E0;-><init>(Landroidx/compose/ui/platform/h0;LL0/d;)V

    invoke-interface {v3, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    move-object/from16 v21, v12

    check-cast v21, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    const v7, 0x2e7ec7cb

    invoke-interface {v3, v7}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    sget-object v10, LT/l;->a:LT/l$a;

    invoke-virtual {v10}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v7, v10, :cond_22

    new-instance v7, LBe/F0;

    invoke-direct {v7}, LBe/F0;-><init>()V

    invoke-interface {v3, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_22
    move-object/from16 v23, v7

    check-cast v23, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    const/16 v24, 0x2e

    const/16 v25, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move/from16 v17, v0

    invoke-static/range {v16 .. v25}, Landroidx/compose/foundation/d;->h(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v12

    invoke-virtual {v2, v3, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->f()LL0/U;

    move-result-object v32

    invoke-virtual {v2, v3, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->c()J

    move-result-wide v13

    sget-object v7, LW0/t;->a:LW0/t$a;

    invoke-virtual {v7}, LW0/t$a;->b()I

    move-result v26

    const/16 v35, 0xc30

    const v36, 0x1d7f8

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v20, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    const/4 v7, 0x0

    move-object/from16 v33, v3

    invoke-static/range {v11 .. v36}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v10, LYg/J;->a:LYg/J;

    :goto_d
    invoke-interface {v3}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LBe/A0;->f()Ls9/d;

    move-result-object v10

    const v11, 0x3af8c26e

    invoke-interface {v3, v11}, LT/l;->U(I)V

    if-nez v10, :cond_23

    goto :goto_e

    :cond_23
    invoke-virtual/range {p1 .. p1}, LBe/A0;->f()Ls9/d;

    move-result-object v10

    invoke-static {v10, v3, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v11

    invoke-virtual {v2, v3, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->b()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->f()LL0/U;

    move-result-object v32

    invoke-virtual {v2, v3, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v13

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->b()I

    move-result v26

    const/16 v35, 0xc30

    const v36, 0x1d7fa

    const/4 v12, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    move-object/from16 v33, v3

    invoke-static/range {v11 .. v36}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v2, LYg/J;->a:LYg/J;

    :goto_e
    invoke-interface {v3}, LT/l;->J()V

    invoke-interface {v3}, LT/l;->R()V

    const/4 v2, 0x0

    invoke-static {v5, v2, v1, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, LBe/B0;

    invoke-virtual/range {p1 .. p1}, LBe/A0;->i()LW7/f;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LBe/A0;->j()LW7/f;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LBe/A0;->b()Z

    move-result v6

    invoke-direct {v2, v4, v5, v6}, LBe/B0;-><init>(LW7/f;LW7/f;Z)V

    const/4 v4, 0x6

    invoke-static {v1, v2, v3, v4}, LBe/D0;->b(Landroidx/compose/ui/e;LBe/B0;LT/l;I)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-static {}, LT/o;->P()V

    :cond_24
    move v11, v0

    :goto_f
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_25

    new-instance v7, LBe/G0;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v3, v11

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LBe/G0;-><init>(Landroidx/compose/ui/e;LBe/A0;ZII)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_25
    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;LBe/A0;ZIILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LBe/H0;->d(Landroidx/compose/ui/e;LBe/A0;ZLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/platform/h0;LL0/d;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
