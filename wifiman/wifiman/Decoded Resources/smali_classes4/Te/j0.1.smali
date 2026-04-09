.class public abstract LTe/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/d;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LTe/j0;->e(Landroidx/compose/ui/e;Ls9/d;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LTe/j0;->d(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;II)V
    .locals 33

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "text"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClicked"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x503a2759

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v5, p5, 0x1

    const/4 v6, 0x4

    if-eqz v5, :cond_0

    or-int/lit8 v7, v4, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v4, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v6

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v4

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v4

    :goto_1
    and-int/lit8 v9, p5, 0x2

    if-eqz v9, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v4, 0x30

    if-nez v9, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_5
    :goto_3
    and-int/lit8 v9, p5, 0x4

    const/16 v10, 0x100

    if-eqz v9, :cond_6

    or-int/lit16 v8, v8, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_8

    invoke-interface {v1, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v10

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v8, v9

    :cond_8
    :goto_5
    and-int/lit16 v9, v8, 0x93

    const/16 v11, 0x92

    if-ne v9, v11, :cond_a

    invoke-interface {v1}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v30, v7

    goto/16 :goto_a

    :cond_a
    :goto_6
    if-eqz v5, :cond_b

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v30, v5

    goto :goto_7

    :cond_b
    move-object/from16 v30, v7

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, -0x1

    const-string v7, "com.ui.wifiman.ui.signal.components.SignalTabApComparisonButton (SignalTabApComparisonButton.kt:26)"

    invoke-static {v0, v8, v5, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    const v0, -0x550a8bd0

    invoke-interface {v1, v0}, LT/l;->U(I)V

    and-int/lit16 v0, v8, 0x380

    const/4 v5, 0x0

    if-ne v0, v10, :cond_d

    const/4 v0, 0x1

    goto :goto_8

    :cond_d
    move v0, v5

    :goto_8
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_e

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v7, v0, :cond_f

    :cond_e
    new-instance v7, LTe/h0;

    invoke-direct {v7, v3}, LTe/h0;-><init>(Lmh/a;)V

    invoke-interface {v1, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v15, v7

    check-cast v15, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v11, v30

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v7, Lz/c;->a:Lz/c;

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v7, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v7

    const/16 v9, 0x36

    invoke-static {v6, v7, v1, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v1, v5}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v10, LE0/g;->K:LE0/g$a;

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_10

    invoke-static {}, LT/j;->c()V

    :cond_10
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_11

    invoke-interface {v1, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_11
    invoke-interface {v1}, LT/l;->I()V

    :goto_9
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v6, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v11, v9, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v11}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_12

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    :cond_12
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_13
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v11, v0, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-interface {v0, v14, v6, v5}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v6

    shr-int/lit8 v0, v8, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v2, v1, v0}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lla/a;->a:Lla/a;

    sget v15, Lla/a;->b:I

    invoke-virtual {v0, v1, v15}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v0, v1, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->j()J

    move-result-wide v7

    sget-object v9, LW0/t;->a:LW0/t$a;

    invoke-virtual {v9}, LW0/t$a;->b()I

    move-result v20

    const/16 v28, 0xc30

    const v29, 0xd7f8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v31, v14

    move/from16 v32, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v1

    invoke-static/range {v5 .. v29}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    sget-object v5, LN9/b;->a:LN9/b;

    invoke-virtual {v5}, LN9/b;->e()Ls9/b;

    move-result-object v5

    const/16 v6, 0x14

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    move-object/from16 v7, v31

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    move/from16 v7, v32

    invoke-virtual {v0, v1, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->j()J

    move-result-wide v7

    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    const/16 v10, 0x30

    const/4 v11, 0x4

    const/4 v8, 0x0

    move-object v9, v1

    invoke-static/range {v5 .. v11}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    :goto_a
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_15

    new-instance v7, LTe/i0;

    move-object v0, v7

    move-object/from16 v1, v30

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LTe/i0;-><init>(Landroidx/compose/ui/e;Ls9/d;Lmh/a;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_15
    return-void
.end method

.method private static final d(Lmh/a;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ls9/d;Lmh/a;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LTe/j0;->c(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
