.class public abstract LE9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JLr/a;LT/q0;JLo0/f;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LE9/l;->f(JLr/a;LT/q0;JLo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LT/q0;Lr/a;Ljava/lang/Float;Ljava/lang/Float;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LE9/l;->h(LT/q0;Lr/a;Ljava/lang/Float;Ljava/lang/Float;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0}, LE9/l;->i(LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;LE9/f;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LE9/l;->g(Landroidx/compose/ui/e;LE9/f;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;LE9/f;LT/l;II)V
    .locals 29

    move/from16 v0, p3

    move/from16 v1, p4

    const v2, -0x7bf018e7

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, v1, 0x1

    const/4 v5, 0x2

    if-eqz v4, :cond_0

    or-int/lit8 v6, v0, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v3, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v5

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v0

    :goto_1
    and-int/lit8 v8, v1, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    move-object/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v3, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :goto_3
    and-int/lit8 v10, v7, 0x13

    const/16 v11, 0x12

    if-ne v10, v11, :cond_7

    invoke-interface {v3}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v3}, LT/l;->C()V

    move-object v4, v6

    goto/16 :goto_8

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_5

    :cond_8
    move-object v4, v6

    :goto_5
    const/4 v6, 0x0

    if-eqz v8, :cond_9

    move-object v9, v6

    :cond_9
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_a

    const/4 v8, -0x1

    const-string/jumbo v10, "com.ui.core.ui.component.progress.UiRadarDiscovery (UiRadarDiscovery.kt:79)"

    invoke-static {v2, v7, v8, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v2, v8, :cond_b

    sget-object v2, Ldh/j;->a:Ldh/j;

    invoke-static {v2, v3}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v2

    new-instance v8, LT/A;

    invoke-direct {v8, v2}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v3, v8}, LT/l;->K(Ljava/lang/Object;)V

    move-object v2, v8

    :cond_b
    check-cast v2, LT/A;

    invoke-virtual {v2}, LT/A;->a()LIi/N;

    move-result-object v2

    sget-object v8, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v8, v3, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a;->a()Lma/a$a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v11

    invoke-virtual {v11}, Lr9/a$a;->f()J

    move-result-wide v14

    invoke-virtual {v8, v3, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->a()Lma/a$a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v8

    invoke-virtual {v8}, Lr9/a$a;->e()J

    move-result-wide v12

    const v8, -0x6c0ca360

    invoke-interface {v3, v8}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    if-ne v8, v10, :cond_c

    invoke-static {v11, v11, v5, v6}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object v8

    invoke-interface {v3, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lr/a;

    invoke-interface {v3}, LT/l;->J()V

    const v10, -0x6c0c97ab

    invoke-interface {v3, v10}, LT/l;->U(I)V

    invoke-interface {v3, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_d

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_e

    :cond_d
    new-instance v11, LE9/l$a;

    invoke-direct {v11, v8, v6}, LE9/l$a;-><init>(Lr/a;Ldh/e;)V

    invoke-interface {v3, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v11, Lmh/p;

    invoke-interface {v3}, LT/l;->J()V

    sget v10, Lr/a;->m:I

    invoke-static {v8, v11, v3, v10}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    const v10, -0x6c0c6bfb

    invoke-interface {v3, v10}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v10, v11, :cond_f

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v10

    invoke-static {v10, v6, v5, v6}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v10

    invoke-interface {v3, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v11, v10

    check-cast v11, LT/q0;

    invoke-interface {v3}, LT/l;->J()V

    const v10, -0x6c0c5c5b

    invoke-interface {v3, v10}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v10, v5, :cond_10

    new-instance v10, LE9/g;

    invoke-direct {v10, v11, v8}, LE9/g;-><init>(LT/q0;Lr/a;)V

    invoke-interface {v3, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v10, Lmh/p;

    invoke-interface {v3}, LT/l;->J()V

    const v5, -0x6c0c3a24

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_11

    new-instance v5, LE9/h;

    invoke-direct {v5, v11}, LE9/h;-><init>(LT/q0;)V

    invoke-interface {v3, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    if-eqz v9, :cond_12

    invoke-virtual {v9, v10}, LE9/f;->d(Lmh/p;)V

    :cond_12
    if-eqz v9, :cond_13

    invoke-virtual {v9, v5}, LE9/f;->c(Lmh/a;)V

    :cond_13
    const v5, -0x6c0c2144

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-interface {v11}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LE9/a;

    const v10, -0x6c0c1e43

    invoke-interface {v3, v10}, LT/l;->U(I)V

    invoke-virtual {v7}, LE9/a;->a()Lr/a;

    move-result-object v10

    move-object/from16 p0, v5

    move-object/from16 p1, v9

    if-nez v10, :cond_16

    const/4 v5, 0x0

    const/4 v10, 0x2

    invoke-static {v5, v5, v10, v6}, Lr/b;->b(FFILjava/lang/Object;)Lr/a;

    move-result-object v9

    invoke-virtual {v7, v9}, LE9/a;->d(Lr/a;)V

    const v7, 0x242cc7e3

    invoke-interface {v3, v7}, LT/l;->U(I)V

    invoke-interface {v3, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v7, :cond_14

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_15

    :cond_14
    new-instance v5, LE9/l$b;

    invoke-direct {v5, v9, v6}, LE9/l$b;-><init>(Lr/a;Ldh/e;)V

    invoke-interface {v3, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    check-cast v5, Lmh/p;

    invoke-interface {v3}, LT/l;->J()V

    const/4 v7, 0x3

    const/4 v9, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v19, v10

    move-object v10, v2

    move-object/from16 v24, v11

    const/16 v16, 0x0

    move-object/from16 v11, v17

    move-wide/from16 v25, v12

    move-object/from16 v12, v18

    move-object v13, v5

    move-wide/from16 v27, v14

    move v14, v7

    move-object v15, v9

    invoke-static/range {v10 .. v15}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_7

    :cond_16
    move-object/from16 v24, v11

    move-wide/from16 v25, v12

    move-wide/from16 v27, v14

    const/16 v16, 0x0

    const/16 v19, 0x2

    :goto_7
    invoke-interface {v3}, LT/l;->J()V

    move-object/from16 v5, p0

    move-object/from16 v9, p1

    move-object/from16 v11, v24

    move-wide/from16 v12, v25

    move-wide/from16 v14, v27

    goto :goto_6

    :cond_17
    move-object/from16 p1, v9

    move-object/from16 v24, v11

    move-wide/from16 v25, v12

    move-wide/from16 v27, v14

    invoke-interface {v3}, LT/l;->J()V

    const/high16 v2, 0x43830000    # 262.0f

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v10, Lm0/l0;->b:Lm0/l0$a;

    const/16 v22, 0xe

    const/16 v23, 0x0

    const v18, 0x3c23d70a    # 0.01f

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, v25

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    const v18, 0x3e3e76c9    # 0.186f

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    const v18, 0x3c23d70a    # 0.01f

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    filled-new-array {v2, v5, v6}, [Lm0/v0;

    move-result-object v2

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/16 v16, 0xe

    const/16 v17, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lm0/l0$a;->f(Lm0/l0$a;Ljava/util/List;JFIILjava/lang/Object;)Lm0/l0;

    move-result-object v10

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/e;Lm0/l0;Lm0/i1;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const v5, -0x6c0b9ce8

    invoke-interface {v3, v5}, LT/l;->U(I)V

    move-wide/from16 v5, v27

    invoke-interface {v3, v5, v6}, LT/l;->j(J)Z

    move-result v7

    invoke-interface {v3, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    move-wide/from16 v9, v25

    invoke-interface {v3, v9, v10}, LT/l;->j(J)Z

    move-result v11

    or-int/2addr v7, v11

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_18

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v11, v7, :cond_19

    :cond_18
    new-instance v11, LE9/i;

    move-object v12, v11

    move-wide v13, v5

    move-object v15, v8

    move-object/from16 v16, v24

    move-wide/from16 v17, v9

    invoke-direct/range {v12 .. v18}, LE9/i;-><init>(JLr/a;LT/q0;J)V

    invoke-interface {v3, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v11, Lmh/l;

    invoke-interface {v3}, LT/l;->J()V

    const/4 v5, 0x0

    invoke-static {v2, v11, v3, v5}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-static {}, LT/o;->P()V

    :cond_1a
    move-object/from16 v9, p1

    :goto_8
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_1b

    new-instance v3, LE9/j;

    invoke-direct {v3, v4, v9, v0, v1}, LE9/j;-><init>(Landroidx/compose/ui/e;LE9/f;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_1b
    return-void
.end method

.method private static final f(JLr/a;LT/q0;JLo0/f;)LYg/J;
    .locals 31

    move-object/from16 v0, p6

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->h(J)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v3, 0x40a00000    # 5.0f

    div-float v15, v1, v3

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/m;->h(J)F

    move-result v1

    div-float/2addr v1, v2

    sub-float v13, v1, v15

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->d1(F)F

    move-result v4

    sget-object v8, Lo0/j;->a:Lo0/j;

    const/16 v11, 0x6c

    const/4 v12, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p6

    move-wide/from16 v2, p0

    invoke-static/range {v1 .. v12}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    const/high16 v1, 0x40f00000    # 7.5f

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->d1(F)F

    move-result v4

    new-instance v14, Lo0/k;

    const/high16 v16, 0x3f800000    # 1.0f

    invoke-static/range {v16 .. v16}, LY0/h;->j(F)F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->d1(F)F

    move-result v6

    const/16 v11, 0x1e

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v14

    invoke-direct/range {v5 .. v12}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x6c

    const-wide/16 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p6

    move-object v8, v14

    invoke-static/range {v1 .. v12}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    new-instance v1, Lsh/i;

    const/4 v2, 0x1

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lsh/i;-><init>(II)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v14

    check-cast v1, LZg/Q;

    invoke-virtual {v1}, LZg/Q;->d()I

    move-result v1

    int-to-float v1, v1

    mul-float v4, v1, v15

    new-instance v17, Lo0/k;

    invoke-static/range {v16 .. v16}, LY0/h;->j(F)F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->d1(F)F

    move-result v6

    const/16 v11, 0x1e

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, v17

    invoke-direct/range {v5 .. v12}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x6c

    const-wide/16 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p6

    move-wide/from16 v2, p0

    move-object/from16 v8, v17

    invoke-static/range {v1 .. v12}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const/high16 v17, 0x43b40000    # 360.0f

    mul-float v1, v1, v17

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v2

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v3

    invoke-static {v2, v3}, Ll0/h;->a(FF)J

    move-result-wide v2

    invoke-interface/range {p6 .. p6}, Lo0/f;->k1()Lo0/d;

    move-result-object v14

    invoke-interface {v14}, Lo0/d;->c()J

    move-result-wide v11

    invoke-interface {v14}, Lo0/d;->d()Lm0/n0;

    move-result-object v4

    invoke-interface {v4}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v14}, Lo0/d;->e()Lo0/h;

    move-result-object v4

    invoke-interface {v4, v1, v2, v3}, Lo0/h;->i(FJ)V

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v1

    sub-float/2addr v1, v13

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v2

    sub-float/2addr v2, v13

    invoke-static {v1, v2}, Ll0/h;->a(FF)J

    move-result-wide v6

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float/2addr v13, v1

    invoke-static {v13, v13}, Ll0/n;->a(FF)J

    move-result-wide v8

    sget-object v18, Lm0/l0;->b:Lm0/l0$a;

    const/16 v25, 0xe

    const/16 v26, 0x0

    const v21, 0x3f666666    # 0.9f

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-wide/from16 v19, p4

    invoke-static/range {v19 .. v26}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    const/16 v25, 0xe

    const/16 v26, 0x0

    const v21, 0x3c23d70a    # 0.01f

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-wide/from16 v19, p4

    invoke-static/range {v19 .. v26}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    filled-new-array {v1, v2}, [Lm0/v0;

    move-result-object v1

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    neg-float v1, v15

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v21

    const/16 v23, 0x8

    const/16 v24, 0x0

    const/16 v22, 0x0

    move/from16 v20, v1

    invoke-static/range {v18 .. v24}, Lm0/l0$a;->i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/16 v18, 0x3c0

    const/16 v19, 0x0

    const/high16 v3, 0x43340000    # 180.0f

    const/high16 v4, 0x42b40000    # 90.0f

    const/4 v5, 0x1

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, p6

    move-wide/from16 v27, v11

    move-object v11, v13

    move-object/from16 v12, v20

    move/from16 v13, v21

    move-object/from16 p2, v14

    move/from16 v14, v18

    move v0, v15

    move-object/from16 v15, v19

    :try_start_1
    invoke-static/range {v1 .. v15}, Lo0/f;->B0(Lo0/f;Lm0/l0;FFZJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {v1, v0}, Ll0/h;->a(FF)J

    move-result-wide v4

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v6

    invoke-static/range {v16 .. v16}, LY0/h;->j(F)F

    move-result v1

    move/from16 v16, v0

    move-object/from16 v0, p6

    invoke-interface {v0, v1}, LY0/d;->d1(F)F

    move-result v8

    const/16 v14, 0x1f0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p6

    move-wide/from16 v2, p0

    invoke-static/range {v1 .. v15}, Lo0/f;->w1(Lo0/f;JJJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    invoke-interface/range {p2 .. p2}, Lo0/d;->d()Lm0/n0;

    move-result-object v1

    invoke-interface {v1}, Lm0/n0;->r()V

    move-object/from16 v1, p2

    move-wide/from16 v2, v27

    invoke-interface {v1, v2, v3}, Lo0/d;->f(J)V

    invoke-interface/range {p3 .. p3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE9/a;

    invoke-virtual {v1}, LE9/a;->c()F

    move-result v2

    mul-float v2, v2, v17

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v3

    invoke-interface/range {p6 .. p6}, Lo0/f;->k1()Lo0/d;

    move-result-object v14

    invoke-interface {v14}, Lo0/d;->c()J

    move-result-wide v11

    invoke-interface {v14}, Lo0/d;->d()Lm0/n0;

    move-result-object v5

    invoke-interface {v5}, Lm0/n0;->j()V

    :try_start_2
    invoke-interface {v14}, Lo0/d;->e()Lo0/h;

    move-result-object v5

    invoke-interface {v5, v2, v3, v4}, Lo0/h;->i(FJ)V

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v18

    invoke-interface/range {p6 .. p6}, Lo0/f;->D1()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v2

    sub-float v2, v2, v16

    sub-float v2, v2, v16

    invoke-virtual {v1}, LE9/a;->b()F

    move-result v3

    mul-float/2addr v2, v3

    add-float v21, v2, v16

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v20, 0x0

    invoke-static/range {v18 .. v23}, Ll0/g;->g(JFFILjava/lang/Object;)J

    move-result-wide v5

    const/high16 v2, 0x40600000    # 3.5f

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-interface {v0, v2}, LY0/d;->d1(F)F

    move-result v4

    invoke-virtual {v1}, LE9/a;->a()Lr/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    :goto_2
    move v7, v1

    goto :goto_3

    :catchall_0
    move-exception v0

    move-wide v1, v11

    goto :goto_4

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :goto_3
    sget-object v8, Lo0/j;->a:Lo0/j;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/16 v15, 0x60

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p6

    move-wide/from16 v2, p0

    move-wide/from16 v29, v11

    move v11, v15

    move-object/from16 v12, v18

    :try_start_3
    invoke-static/range {v1 .. v12}, Lo0/f;->P1(Lo0/f;JFJFLo0/g;Lm0/w0;IILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-interface {v14}, Lo0/d;->d()Lm0/n0;

    move-result-object v1

    invoke-interface {v1}, Lm0/n0;->r()V

    move-wide/from16 v1, v29

    invoke-interface {v14, v1, v2}, Lo0/d;->f(J)V

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    move-wide/from16 v1, v29

    :goto_4
    invoke-interface {v14}, Lo0/d;->d()Lm0/n0;

    move-result-object v3

    invoke-interface {v3}, Lm0/n0;->r()V

    invoke-interface {v14, v1, v2}, Lo0/d;->f(J)V

    throw v0

    :cond_2
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :catchall_2
    move-exception v0

    move-object/from16 v1, p2

    move-wide/from16 v2, v27

    goto :goto_5

    :catchall_3
    move-exception v0

    move-wide v2, v11

    move-object v1, v14

    :goto_5
    invoke-interface {v1}, Lo0/d;->d()Lm0/n0;

    move-result-object v4

    invoke-interface {v4}, Lm0/n0;->r()V

    invoke-interface {v1, v2, v3}, Lo0/d;->f(J)V

    throw v0
.end method

.method private static final g(Landroidx/compose/ui/e;LE9/f;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LE9/l;->e(Landroidx/compose/ui/e;LE9/f;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(LT/q0;Lr/a;Ljava/lang/Float;Ljava/lang/Float;)LYg/J;
    .locals 8

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v7, LE9/a;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    :goto_0
    move v2, p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    goto :goto_0

    :goto_1
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p1

    :goto_2
    move v3, p1

    goto :goto_3

    :cond_1
    sget-object p1, Lqh/c;->a:Lqh/c$a;

    invoke-virtual {p1}, Lqh/c$a;->c()F

    move-result p1

    goto :goto_2

    :goto_3
    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LE9/a;-><init>(FFLr/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v7}, LZg/v;->N0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(LT/q0;)LYg/J;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {p0, v0}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final j(LT/l;I)LE9/f;
    .locals 3

    const v0, -0xb83aa81

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.progress.rememberUiRadarDiscoveryController (UiRadarDiscovery.kt:55)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, 0x5ea6c3e9

    invoke-interface {p0, p1}, LT/l;->U(I)V

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    new-instance p1, LE9/f;

    invoke-direct {p1}, LE9/f;-><init>()V

    invoke-interface {p0, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, LE9/f;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p0}, LT/l;->J()V

    return-object p1
.end method
