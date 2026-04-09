.class public abstract LF9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;IIILT/l;I)LYg/J;
    .locals 1

    invoke-static/range {p0 .. p23}, LF9/q;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;IIILT/l;I)LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(FLandroidx/compose/ui/layout/m;LC0/B;LY0/b;)LC0/D;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF9/q;->l(FLandroidx/compose/ui/layout/m;LC0/B;LY0/b;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p13}, LF9/q;->f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LF9/q;->m(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;LT/l;II)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v4, p2

    move/from16 v5, p8

    move/from16 v2, p11

    move/from16 v14, p12

    const/16 v3, 0x8

    const/16 v6, 0x80

    const/16 v7, 0x20

    const/16 v8, 0x10

    const/4 v9, 0x4

    const/16 v13, 0x30

    const/16 v27, 0x6

    const v10, 0x51d9c0d9

    move-object/from16 v11, p10

    invoke-interface {v11, v10}, LT/l;->r(I)LT/l;

    move-result-object v11

    and-int/lit8 v12, v14, 0x1

    const/4 v15, 0x2

    if-eqz v12, :cond_0

    or-int/lit8 v12, v2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v12, v2, 0x6

    if-nez v12, :cond_2

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    move v12, v9

    goto :goto_0

    :cond_1
    move v12, v15

    :goto_0
    or-int/2addr v12, v2

    goto :goto_1

    :cond_2
    move v12, v2

    :goto_1
    and-int/lit8 v16, v14, 0x2

    if-eqz v16, :cond_3

    or-int/2addr v12, v13

    goto :goto_3

    :cond_3
    and-int/lit8 v16, v2, 0x30

    if-nez v16, :cond_5

    invoke-interface {v11, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_4

    move/from16 v16, v7

    goto :goto_2

    :cond_4
    move/from16 v16, v8

    :goto_2
    or-int v12, v12, v16

    :cond_5
    :goto_3
    and-int/2addr v9, v14

    if-eqz v9, :cond_6

    or-int/lit16 v12, v12, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v2, 0x180

    if-nez v9, :cond_8

    invoke-interface {v11, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    move v9, v6

    :goto_4
    or-int/2addr v12, v9

    :cond_8
    :goto_5
    and-int/lit8 v9, v14, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v12, v12, 0xc00

    move-wide/from16 v3, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v2, 0xc00

    move-wide/from16 v3, p3

    if-nez v9, :cond_b

    invoke-interface {v11, v3, v4}, LT/l;->j(J)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v12, v12, v16

    :cond_b
    :goto_7
    and-int/lit8 v16, v14, 0x10

    if-eqz v16, :cond_c

    or-int/lit16 v12, v12, 0x6000

    move-wide/from16 v3, p5

    goto :goto_9

    :cond_c
    and-int/lit16 v9, v2, 0x6000

    move-wide/from16 v3, p5

    if-nez v9, :cond_e

    invoke-interface {v11, v3, v4}, LT/l;->j(J)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v12, v9

    :cond_e
    :goto_9
    and-int/2addr v7, v14

    const/high16 v9, 0x30000

    if-eqz v7, :cond_f

    or-int/2addr v12, v9

    move/from16 v9, p7

    goto :goto_b

    :cond_f
    and-int v7, v2, v9

    move/from16 v9, p7

    if-nez v7, :cond_11

    invoke-interface {v11, v9}, LT/l;->i(I)Z

    move-result v7

    if-eqz v7, :cond_10

    const/high16 v7, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v7, 0x10000

    :goto_a
    or-int/2addr v12, v7

    :cond_11
    :goto_b
    and-int/lit8 v7, v14, 0x40

    const/high16 v16, 0x180000

    if-eqz v7, :cond_12

    or-int v12, v12, v16

    goto :goto_d

    :cond_12
    and-int v7, v2, v16

    if-nez v7, :cond_14

    invoke-interface {v11, v5}, LT/l;->c(Z)Z

    move-result v7

    if-eqz v7, :cond_13

    const/high16 v7, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v7, 0x80000

    :goto_c
    or-int/2addr v12, v7

    :cond_14
    :goto_d
    and-int/2addr v6, v14

    const/high16 v7, 0xc00000

    if-eqz v6, :cond_16

    or-int/2addr v12, v7

    :cond_15
    move-object/from16 v7, p9

    goto :goto_f

    :cond_16
    and-int/2addr v7, v2

    if-nez v7, :cond_15

    move-object/from16 v7, p9

    invoke-interface {v11, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_17

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v16, 0x400000

    :goto_e
    or-int v12, v12, v16

    :goto_f
    const v16, 0x492493

    and-int v13, v12, v16

    const v15, 0x492492

    if-ne v13, v15, :cond_19

    invoke-interface {v11}, LT/l;->v()Z

    move-result v13

    if-nez v13, :cond_18

    goto :goto_10

    :cond_18
    invoke-interface {v11}, LT/l;->C()V

    move-object v10, v7

    move-object v3, v11

    goto/16 :goto_1a

    :cond_19
    :goto_10
    if-eqz v6, :cond_1a

    const/4 v6, 0x0

    move-object v13, v6

    goto :goto_11

    :cond_1a
    move-object v13, v7

    :goto_11
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_1b

    const/4 v6, -0x1

    const-string/jumbo v7, "com.ui.core.ui.component.settings.TitleContainer (UiSettingsBase.kt:196)"

    invoke-static {v10, v12, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    sget-object v28, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v28 .. v28}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    sget-object v10, Lz/c;->a:Lz/c;

    const/16 v7, 0x8

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v10, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v7

    const/16 v15, 0x36

    invoke-static {v7, v6, v11, v15}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v11, v7}, LT/j;->a(LT/l;I)I

    move-result v16

    invoke-interface {v11}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v11, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v29, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v11}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_1c

    invoke-static {}, LT/j;->c()V

    :cond_1c
    invoke-interface {v11}, LT/l;->u()V

    invoke-interface {v11}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_1d

    invoke-interface {v11, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_12

    :cond_1d
    invoke-interface {v11}, LT/l;->I()V

    :goto_12
    invoke-static {v11}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->e()Lmh/p;

    move-result-object v1

    invoke-static {v7, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v7, v15, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_1e

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v6, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    :cond_1e
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1f
    invoke-virtual/range {v29 .. v29}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v7, v8, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    invoke-interface {v1, v8, v6, v7}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v10}, Lz/c;->g()Lz/c$m;

    move-result-object v15

    invoke-virtual/range {v28 .. v28}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v2

    invoke-static {v15, v2, v11, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v11, v7}, LT/j;->a(LT/l;I)I

    move-result v15

    invoke-interface {v11}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v11, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface {v11}, LT/l;->x()LT/f;

    move-result-object v4

    if-nez v4, :cond_20

    invoke-static {}, LT/j;->c()V

    :cond_20
    invoke-interface {v11}, LT/l;->u()V

    invoke-interface {v11}, LT/l;->o()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-interface {v11, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_13

    :cond_21
    invoke-interface {v11}, LT/l;->I()V

    :goto_13
    invoke-static {v11}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->e()Lmh/p;

    move-result-object v4

    invoke-static {v3, v2, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v3, v7, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v3}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_22

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_23

    :cond_22
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_23
    invoke-virtual/range {v29 .. v29}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v3, v6, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    const v2, 0x13c84351

    invoke-interface {v11, v2}, LT/l;->U(I)V

    if-eqz p2, :cond_25

    const v2, 0x13c84ed8

    invoke-interface {v11, v2}, LT/l;->U(I)V

    if-eqz v5, :cond_24

    move-wide/from16 v30, p3

    goto :goto_14

    :cond_24
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v2

    invoke-interface {v11, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, p3

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    move-wide/from16 v30, v2

    :goto_14
    invoke-interface {v11}, LT/l;->J()V

    const/16 v2, 0x10

    invoke-static {v2}, LY0/w;->g(I)J

    move-result-wide v6

    const/4 v4, 0x0

    sget-object v2, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v2}, LQ0/A$a;->e()LQ0/A;

    move-result-object v2

    move-object v9, v2

    const/16 v2, 0x18

    invoke-static {v2}, LY0/w;->g(I)J

    move-result-wide v15

    const/4 v2, 0x2

    const/16 v3, 0x36

    invoke-static {v4}, LY0/w;->g(I)J

    move-result-wide v17

    move-object/from16 p9, v11

    move/from16 v32, v12

    move-wide/from16 v11, v17

    sget-object v17, LW0/t;->a:LW0/t$a;

    invoke-virtual/range {v17 .. v17}, LW0/t$a;->b()I

    move-result v17

    shr-int/lit8 v2, v32, 0x6

    and-int/lit8 v18, v2, 0xe

    const v19, 0xc30c00

    or-int v24, v18, v19

    and-int/lit16 v2, v2, 0x1c00

    or-int/lit8 v25, v2, 0x36

    const v26, 0x1d352

    const/4 v3, 0x0

    const/4 v2, 0x0

    move-object/from16 v33, v8

    move-object v8, v2

    move-object/from16 v34, v10

    move-object v10, v2

    move-object/from16 v35, v13

    move-object v13, v2

    move-object v14, v2

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v2, p2

    move/from16 p10, v4

    move-wide/from16 v4, v30

    move/from16 v19, p7

    move-object/from16 v23, p9

    invoke-static/range {v2 .. v26}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    goto :goto_15

    :cond_25
    move-object/from16 v33, v8

    move-object/from16 v34, v10

    move-object/from16 p9, v11

    move/from16 v32, v12

    move-object/from16 v35, v13

    const/16 p10, 0x0

    :goto_15
    invoke-interface/range {p9 .. p9}, LT/l;->J()V

    const v2, 0x13c88226

    move-object/from16 v15, p9

    invoke-interface {v15, v2}, LT/l;->U(I)V

    if-eqz v0, :cond_27

    const/4 v2, 0x2

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v4

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, v33

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const v2, 0x13c895fe

    invoke-interface {v15, v2}, LT/l;->U(I)V

    if-eqz p8, :cond_26

    move-wide/from16 v4, p5

    goto :goto_16

    :cond_26
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, p5

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    :goto_16
    invoke-interface {v15}, LT/l;->J()V

    const/16 v2, 0xc

    invoke-static {v2}, LY0/w;->g(I)J

    move-result-wide v6

    sget-object v2, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v2}, LQ0/A$a;->e()LQ0/A;

    move-result-object v9

    invoke-static/range {p10 .. p10}, LY0/w;->g(I)J

    move-result-wide v11

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->b()I

    move-result v17

    shr-int/lit8 v2, v32, 0x3

    and-int/lit8 v2, v2, 0xe

    const v8, 0xc30c30

    or-int v24, v2, v8

    const/16 v25, 0xc30

    const v26, 0x1d750

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v18, 0x0

    move-object v2, v15

    move-wide/from16 v15, v18

    const/16 v18, 0x0

    const/16 v19, 0x3

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 p9, v2

    move-object/from16 v2, p1

    move-object/from16 v23, p9

    invoke-static/range {v2 .. v26}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    goto :goto_17

    :cond_27
    move-object/from16 p9, v15

    :goto_17
    invoke-interface/range {p9 .. p9}, LT/l;->J()V

    invoke-interface/range {p9 .. p9}, LT/l;->R()V

    const v2, 0x6c8fb163

    move-object/from16 v3, p9

    invoke-interface {v3, v2}, LT/l;->U(I)V

    move-object/from16 v6, v35

    if-nez v6, :cond_28

    goto/16 :goto_19

    :cond_28
    invoke-virtual/range {v28 .. v28}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    invoke-virtual/range {v34 .. v34}, Lz/c;->f()Lz/c$e;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v4, v2, v3, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    move/from16 v4, p10

    invoke-static {v3, v4}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v5

    move-object/from16 v7, v33

    invoke-static {v3, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_29

    invoke-static {}, LT/j;->c()V

    :cond_29
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_2a

    invoke-interface {v3, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_18

    :cond_2a
    invoke-interface {v3}, LT/l;->I()V

    :goto_18
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v2, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v8, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_2b

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2c

    :cond_2b
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_2c
    invoke-virtual/range {v29 .. v29}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v8, v7, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v1, v3, v2}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3}, LT/l;->R()V

    sget-object v1, LYg/J;->a:LYg/J;

    :goto_19
    invoke-interface {v3}, LT/l;->J()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2d

    invoke-static {}, LT/o;->P()V

    :cond_2d
    move-object v10, v6

    :goto_1a
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_2e

    new-instance v14, LF9/o;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LF9/o;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_2e
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;IILT/l;I)LYg/J;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p12

    move/from16 v13, p11

    invoke-static/range {v1 .. v13}, LF9/q;->e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;LT/l;III)V
    .locals 32

    move/from16 v15, p20

    move/from16 v14, p21

    move/from16 v13, p22

    const v0, 0x682ca1b0

    move-object/from16 v1, p19

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v13, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v5, v15, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v15, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v15

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v15

    :goto_1
    and-int/lit8 v7, v13, 0x2

    if-eqz v7, :cond_4

    or-int/lit8 v6, v6, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v15, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v6, v10

    :goto_3
    and-int/lit8 v10, v13, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v3, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v15, 0x180

    if-nez v3, :cond_6

    move-object/from16 v3, p2

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v6, v6, v16

    :goto_5
    and-int/lit16 v4, v15, 0xc00

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-nez v4, :cond_a

    and-int/lit8 v4, v13, 0x8

    move-wide/from16 v8, p3

    if-nez v4, :cond_9

    invoke-interface {v1, v8, v9}, LT/l;->j(J)Z

    move-result v20

    if-eqz v20, :cond_9

    move/from16 v20, v18

    goto :goto_6

    :cond_9
    move/from16 v20, v17

    :goto_6
    or-int v6, v6, v20

    goto :goto_7

    :cond_a
    move-wide/from16 v8, p3

    :goto_7
    and-int/lit16 v4, v15, 0x6000

    const/16 v21, 0x2000

    const/16 v22, 0x4000

    if-nez v4, :cond_c

    and-int/lit8 v4, v13, 0x10

    move-wide/from16 v11, p5

    if-nez v4, :cond_b

    invoke-interface {v1, v11, v12}, LT/l;->j(J)Z

    move-result v24

    if-eqz v24, :cond_b

    move/from16 v24, v22

    goto :goto_8

    :cond_b
    move/from16 v24, v21

    :goto_8
    or-int v6, v6, v24

    goto :goto_9

    :cond_c
    move-wide/from16 v11, p5

    :goto_9
    const/high16 v24, 0x30000

    and-int v25, v15, v24

    const/high16 v26, 0x10000

    const/high16 v27, 0x20000

    if-nez v25, :cond_e

    and-int/lit8 v25, v13, 0x20

    move-wide/from16 v4, p7

    if-nez v25, :cond_d

    invoke-interface {v1, v4, v5}, LT/l;->j(J)Z

    move-result v28

    if-eqz v28, :cond_d

    move/from16 v28, v27

    goto :goto_a

    :cond_d
    move/from16 v28, v26

    :goto_a
    or-int v6, v6, v28

    goto :goto_b

    :cond_e
    move-wide/from16 v4, p7

    :goto_b
    and-int/lit8 v28, v13, 0x40

    const/high16 v29, 0x180000

    if-eqz v28, :cond_f

    or-int v6, v6, v29

    move/from16 v0, p9

    goto :goto_d

    :cond_f
    and-int v29, v15, v29

    move/from16 v0, p9

    if-nez v29, :cond_11

    invoke-interface {v1, v0}, LT/l;->i(I)Z

    move-result v30

    if-eqz v30, :cond_10

    const/high16 v30, 0x100000

    goto :goto_c

    :cond_10
    const/high16 v30, 0x80000

    :goto_c
    or-int v6, v6, v30

    :cond_11
    :goto_d
    and-int/lit16 v0, v13, 0x80

    const/high16 v30, 0xc00000

    if-eqz v0, :cond_12

    or-int v6, v6, v30

    move-object/from16 v3, p10

    goto :goto_f

    :cond_12
    and-int v30, v15, v30

    move-object/from16 v3, p10

    if-nez v30, :cond_14

    invoke-interface {v1, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_13

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_13
    const/high16 v30, 0x400000

    :goto_e
    or-int v6, v6, v30

    :cond_14
    :goto_f
    and-int/lit16 v3, v13, 0x100

    const/high16 v30, 0x6000000

    if-eqz v3, :cond_15

    or-int v6, v6, v30

    move-object/from16 v4, p11

    goto :goto_11

    :cond_15
    and-int v30, v15, v30

    move-object/from16 v4, p11

    if-nez v30, :cond_17

    invoke-interface {v1, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16

    const/high16 v5, 0x4000000

    goto :goto_10

    :cond_16
    const/high16 v5, 0x2000000

    :goto_10
    or-int/2addr v6, v5

    :cond_17
    :goto_11
    and-int/lit16 v5, v13, 0x200

    const/high16 v30, 0x30000000

    if-eqz v5, :cond_18

    or-int v6, v6, v30

    move-object/from16 v4, p12

    goto :goto_13

    :cond_18
    and-int v30, v15, v30

    move-object/from16 v4, p12

    if-nez v30, :cond_1a

    invoke-interface {v1, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_19

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_19
    const/high16 v30, 0x10000000

    :goto_12
    or-int v6, v6, v30

    :cond_1a
    :goto_13
    and-int/lit16 v4, v13, 0x400

    if-eqz v4, :cond_1b

    or-int/lit8 v16, v14, 0x6

    move-object/from16 v7, p13

    goto :goto_15

    :cond_1b
    and-int/lit8 v30, v14, 0x6

    move-object/from16 v7, p13

    if-nez v30, :cond_1d

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1c

    const/16 v16, 0x4

    goto :goto_14

    :cond_1c
    const/16 v16, 0x2

    :goto_14
    or-int v16, v14, v16

    goto :goto_15

    :cond_1d
    move/from16 v16, v14

    :goto_15
    and-int/lit8 v30, v14, 0x30

    if-nez v30, :cond_20

    and-int/lit16 v7, v13, 0x800

    if-nez v7, :cond_1e

    move-object/from16 v7, p14

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1f

    const/16 v19, 0x20

    goto :goto_16

    :cond_1e
    move-object/from16 v7, p14

    :cond_1f
    const/16 v19, 0x10

    :goto_16
    or-int v16, v16, v19

    :goto_17
    move/from16 v7, v16

    goto :goto_18

    :cond_20
    move-object/from16 v7, p14

    goto :goto_17

    :goto_18
    and-int/lit16 v8, v13, 0x1000

    if-eqz v8, :cond_22

    or-int/lit16 v7, v7, 0x180

    :cond_21
    move/from16 v9, p15

    goto :goto_1a

    :cond_22
    and-int/lit16 v9, v14, 0x180

    if-nez v9, :cond_21

    move/from16 v9, p15

    invoke-interface {v1, v9}, LT/l;->c(Z)Z

    move-result v16

    if-eqz v16, :cond_23

    const/16 v25, 0x100

    goto :goto_19

    :cond_23
    const/16 v25, 0x80

    :goto_19
    or-int v7, v7, v25

    :goto_1a
    and-int/lit16 v9, v13, 0x2000

    if-eqz v9, :cond_25

    or-int/lit16 v7, v7, 0xc00

    :cond_24
    move-object/from16 v11, p16

    goto :goto_1b

    :cond_25
    and-int/lit16 v11, v14, 0xc00

    if-nez v11, :cond_24

    move-object/from16 v11, p16

    invoke-interface {v1, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_26

    move/from16 v17, v18

    :cond_26
    or-int v7, v7, v17

    :goto_1b
    and-int/lit16 v12, v13, 0x4000

    if-eqz v12, :cond_28

    or-int/lit16 v7, v7, 0x6000

    :cond_27
    move-object/from16 v11, p17

    goto :goto_1c

    :cond_28
    and-int/lit16 v11, v14, 0x6000

    if-nez v11, :cond_27

    move-object/from16 v11, p17

    invoke-interface {v1, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_29

    move/from16 v21, v22

    :cond_29
    or-int v7, v7, v21

    :goto_1c
    const v16, 0x8000

    and-int v16, v13, v16

    if-eqz v16, :cond_2a

    or-int v7, v7, v24

    move-object/from16 v11, p18

    goto :goto_1d

    :cond_2a
    and-int v17, v14, v24

    move-object/from16 v11, p18

    if-nez v17, :cond_2c

    invoke-interface {v1, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2b

    move/from16 v26, v27

    :cond_2b
    or-int v7, v7, v26

    :cond_2c
    :goto_1d
    const v17, 0x12492493

    and-int v11, v6, v17

    const v14, 0x12492492

    if-ne v11, v14, :cond_2e

    const v11, 0x12493

    and-int/2addr v11, v7

    const v14, 0x12492

    if-ne v11, v14, :cond_2e

    invoke-interface {v1}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_2d

    goto :goto_1e

    :cond_2d
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    goto/16 :goto_34

    :cond_2e
    :goto_1e
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v11, v15, 0x1

    if-eqz v11, :cond_34

    invoke-interface {v1}, LT/l;->H()Z

    move-result v11

    if-eqz v11, :cond_2f

    goto :goto_1f

    :cond_2f
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v0, v13, 0x8

    if-eqz v0, :cond_30

    and-int/lit16 v6, v6, -0x1c01

    :cond_30
    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_31

    const v0, -0xe001

    and-int/2addr v6, v0

    :cond_31
    and-int/lit8 v0, v13, 0x20

    if-eqz v0, :cond_32

    const v0, -0x70001

    and-int/2addr v6, v0

    :cond_32
    and-int/lit16 v0, v13, 0x800

    if-eqz v0, :cond_33

    and-int/lit8 v7, v7, -0x71

    :cond_33
    move-object/from16 v0, p0

    move-object/from16 v10, p2

    move-wide/from16 v18, p3

    move-wide/from16 v20, p5

    move-wide/from16 v22, p7

    move/from16 v11, p9

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v5, p12

    move-object/from16 v4, p13

    move/from16 v8, p15

    move-object/from16 v9, p16

    move-object/from16 v12, p18

    move v14, v6

    move v13, v7

    move-object/from16 v6, p14

    move-object/from16 v7, p17

    goto/16 :goto_30

    :cond_34
    :goto_1f
    if-eqz v2, :cond_35

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_20

    :cond_35
    move-object/from16 v2, p0

    :goto_20
    if-eqz v10, :cond_36

    const/4 v10, 0x0

    goto :goto_21

    :cond_36
    move-object/from16 v10, p2

    :goto_21
    and-int/lit8 v17, v13, 0x8

    if-eqz v17, :cond_37

    sget-object v11, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v11, v1, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a;->f()Lma/a$f;

    move-result-object v11

    invoke-virtual {v11}, Lma/a$f;->a()J

    move-result-wide v18

    and-int/lit16 v6, v6, -0x1c01

    goto :goto_22

    :cond_37
    move-wide/from16 v18, p3

    :goto_22
    and-int/lit8 v11, v13, 0x10

    if-eqz v11, :cond_38

    sget-object v11, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v11, v1, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a;->f()Lma/a$f;

    move-result-object v11

    invoke-virtual {v11}, Lma/a$f;->a()J

    move-result-wide v20

    const v11, -0xe001

    and-int/2addr v6, v11

    goto :goto_23

    :cond_38
    move-wide/from16 v20, p5

    :goto_23
    and-int/lit8 v11, v13, 0x20

    if-eqz v11, :cond_39

    sget-object v11, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v11, v1, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a;->f()Lma/a$f;

    move-result-object v11

    invoke-virtual {v11}, Lma/a$f;->c()J

    move-result-wide v22

    const v11, -0x70001

    and-int/2addr v6, v11

    goto :goto_24

    :cond_39
    move-wide/from16 v22, p7

    :goto_24
    if-eqz v28, :cond_3a

    const/4 v11, 0x1

    goto :goto_25

    :cond_3a
    move/from16 v11, p9

    :goto_25
    if-eqz v0, :cond_3b

    const/4 v0, 0x0

    goto :goto_26

    :cond_3b
    move-object/from16 v0, p10

    :goto_26
    if-eqz v3, :cond_3c

    const/4 v3, 0x0

    goto :goto_27

    :cond_3c
    move-object/from16 v3, p11

    :goto_27
    if-eqz v5, :cond_3d

    const/4 v5, 0x0

    goto :goto_28

    :cond_3d
    move-object/from16 v5, p12

    :goto_28
    if-eqz v4, :cond_3e

    const/4 v4, 0x0

    goto :goto_29

    :cond_3e
    move-object/from16 v4, p13

    :goto_29
    and-int/lit16 v14, v13, 0x800

    if-eqz v14, :cond_3f

    sget-object v14, LF9/J;->a:LF9/J;

    move-object/from16 p2, v0

    const/4 v0, 0x6

    invoke-virtual {v14, v1, v0}, LF9/J;->a(LT/l;I)Lz/N;

    move-result-object v0

    and-int/lit8 v7, v7, -0x71

    goto :goto_2a

    :cond_3f
    move-object/from16 p2, v0

    move-object/from16 v0, p14

    :goto_2a
    if-eqz v8, :cond_40

    const/4 v8, 0x1

    goto :goto_2b

    :cond_40
    move/from16 v8, p15

    :goto_2b
    if-eqz v9, :cond_41

    const/4 v9, 0x0

    goto :goto_2c

    :cond_41
    move-object/from16 v9, p16

    :goto_2c
    if-eqz v12, :cond_43

    const v12, 0xaf55de9

    invoke-interface {v1, v12}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    sget-object v14, LT/l;->a:LT/l$a;

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v12, v14, :cond_42

    new-instance v12, LF9/l$b;

    const/4 v14, 0x0

    move-object/from16 p3, v0

    move-object/from16 p0, v2

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-direct {v12, v14, v0, v2}, LF9/l$b;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v12}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_42
    move-object/from16 p3, v0

    move-object/from16 p0, v2

    const/4 v2, 0x0

    :goto_2d
    move-object v0, v12

    check-cast v0, LF9/l$b;

    invoke-interface {v1}, LT/l;->J()V

    goto :goto_2e

    :cond_43
    move-object/from16 p3, v0

    move-object/from16 p0, v2

    const/4 v2, 0x0

    move-object/from16 v0, p17

    :goto_2e
    if-eqz v16, :cond_44

    move-object v12, v2

    move v14, v6

    move v13, v7

    move-object/from16 v2, p2

    :goto_2f
    move-object/from16 v6, p3

    move-object v7, v0

    move-object/from16 v0, p0

    goto :goto_30

    :cond_44
    move-object/from16 v2, p2

    move-object/from16 v12, p18

    move v14, v6

    move v13, v7

    goto :goto_2f

    :goto_30
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v16

    if-eqz v16, :cond_45

    const-string/jumbo v15, "com.ui.core.ui.component.settings.UiSettingsBase (UiSettingsBase.kt:82)"

    move-object/from16 p0, v7

    const v7, 0x682ca1b0

    invoke-static {v7, v14, v13, v15}, LT/o;->Q(IIILjava/lang/String;)V

    goto :goto_31

    :cond_45
    move-object/from16 p0, v7

    :goto_31
    if-eqz v8, :cond_46

    const v7, 0xaf5736e

    invoke-interface {v1, v7}, LT/l;->U(I)V

    sget-object v7, LN/r;->a:LN/r;

    sget v13, LN/r;->b:I

    invoke-virtual {v7, v1, v13}, LN/r;->c(LT/l;I)F

    move-result v7

    :goto_32
    invoke-interface {v1}, LT/l;->J()V

    goto :goto_33

    :cond_46
    const v7, 0xaf57652

    invoke-interface {v1, v7}, LT/l;->U(I)V

    sget-object v7, LN/r;->a:LN/r;

    sget v13, LN/r;->b:I

    invoke-virtual {v7, v1, v13}, LN/r;->b(LT/l;I)F

    move-result v7

    goto :goto_32

    :goto_33
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/4 v13, 0x0

    invoke-static {v7, v1, v13}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object v7

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v13

    invoke-static {v7}, LF9/q;->h(LT/z1;)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v13, v7}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v7

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v13

    invoke-static/range {v18 .. v19}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v14

    invoke-virtual {v13, v14}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v13

    filled-new-array {v7, v13}, [LT/I0;

    move-result-object v7

    new-instance v13, LF9/q$a;

    move-object/from16 p2, v13

    move-object/from16 p3, v0

    move-object/from16 p4, v12

    move-object/from16 p5, v9

    move/from16 p6, v8

    move-object/from16 p7, v6

    move-object/from16 p8, v4

    move-object/from16 p9, v2

    move-object/from16 p10, p1

    move-object/from16 p11, v3

    move-object/from16 p12, v10

    move-wide/from16 p13, v20

    move-wide/from16 p15, v22

    move/from16 p17, v11

    move-object/from16 p18, v5

    move-object/from16 p19, p0

    invoke-direct/range {p2 .. p19}, LF9/q$a;-><init>(Landroidx/compose/ui/e;Lmh/a;Ljava/lang/Boolean;ZLz/N;Lmh/q;Lmh/q;Ljava/lang/String;Lmh/q;Ljava/lang/String;JJILmh/q;LF9/l;)V

    const/16 v14, 0x36

    const v15, 0x376334f0

    move-object/from16 p2, v0

    const/4 v0, 0x1

    invoke-static {v15, v0, v13, v1, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v13, LT/I0;->i:I

    or-int/lit8 v13, v13, 0x30

    invoke-static {v7, v0, v1, v13}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_47

    invoke-static {}, LT/o;->P()V

    :cond_47
    move-object v14, v4

    move-object v13, v5

    move-object v15, v6

    move/from16 v16, v8

    move-object/from16 v17, v9

    move-wide/from16 v4, v18

    move-wide/from16 v6, v20

    move-wide/from16 v8, v22

    move-object/from16 v18, p0

    move-object/from16 v19, v12

    move-object v12, v3

    move-object v3, v10

    move v10, v11

    move-object v11, v2

    move-object/from16 v2, p2

    :goto_34
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v1

    if-eqz v1, :cond_48

    new-instance v0, LF9/m;

    move-object/from16 p0, v0

    move-object/from16 v31, v1

    move-object v1, v2

    move-object/from16 v2, p1

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    invoke-direct/range {v0 .. v22}, LF9/m;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;III)V

    move-object/from16 v1, p0

    move-object/from16 v0, v31

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_48
    return-void
.end method

.method private static final h(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;IIILT/l;I)LYg/J;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move/from16 v22, p21

    move-object/from16 v19, p22

    or-int/lit8 v20, p19, 0x1

    invoke-static/range {v20 .. v20}, LT/L0;->a(I)I

    move-result v20

    invoke-static/range {p20 .. p20}, LT/L0;->a(I)I

    move-result v21

    invoke-static/range {v0 .. v22}, LF9/q;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic j(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;LT/l;II)V
    .locals 0

    invoke-static/range {p0 .. p12}, LF9/q;->e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;LT/l;II)V

    return-void
.end method

.method public static final k(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF9/n;

    invoke-direct {v0, p1}, LF9/n;-><init>(F)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/g;->a(Landroidx/compose/ui/e;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final l(FLandroidx/compose/ui/layout/m;LC0/B;LY0/b;)LC0/D;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p0

    invoke-static {v0}, Loh/b;->e(F)I

    move-result p0

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result v0

    invoke-interface {p2, v0}, LC0/n;->S(I)I

    move-result v0

    invoke-static {v0, p0}, Lsh/m;->g(II)I

    move-result v2

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result p0

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->m(J)I

    move-result v0

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/b;->k(J)I

    move-result p3

    invoke-static {p0, v2, v0, p3}, LY0/c;->a(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    new-instance v5, LF9/p;

    invoke-direct {v5, p0}, LF9/p;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
