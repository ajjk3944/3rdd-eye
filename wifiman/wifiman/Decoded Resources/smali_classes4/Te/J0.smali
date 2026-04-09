.class public abstract LTe/J0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LTe/E0;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LTe/J0;->e(Landroidx/compose/ui/e;LTe/E0;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, LTe/J0;->g(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LTe/F0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTe/J0;->i(Landroidx/compose/ui/e;LTe/F0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/compose/ui/e;LTe/E0;LT/l;II)V
    .locals 33

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, -0x73f9a5eb

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x1

    const/4 v13, 0x2

    if-eqz v4, :cond_0

    or-int/lit8 v5, v1, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v13

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v15

    goto/16 :goto_c

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v4

    goto :goto_5

    :cond_8
    move-object v14, v5

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.components.Link (SignalTabStatsItemWifi.kt:172)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v3, v15, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v12, 0x0

    invoke-static {v15, v12}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v14}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v15, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v3, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_c

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v11, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v11, v15, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LTe/E0;->c()LTe/N;

    move-result-object v5

    invoke-virtual {v5, v4}, LTe/N;->getColor-vNxB06k(Lma/a;)J

    move-result-wide v5

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v4, 0x0

    move-object v7, v15

    invoke-static/range {v4 .. v9}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-virtual/range {p1 .. p1}, LTe/E0;->b()LS8/c;

    move-result-object v4

    invoke-static {v4}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v4

    invoke-static {v4, v15, v12}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v15, v10}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->f()LL0/U;

    move-result-object v24

    invoke-virtual {v11, v15, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->c()J

    move-result-wide v6

    sget-object v5, LW0/t;->a:LW0/t$a;

    invoke-virtual {v5}, LW0/t$a;->b()I

    move-result v19

    const/16 v27, 0xc30

    const v28, 0xd7fa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/16 v16, 0x0

    move/from16 v30, v10

    move-object/from16 v10, v16

    move-object/from16 v31, v11

    move-object/from16 v11, v16

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v32, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 p0, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, p0

    invoke-static/range {v4 .. v28}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LTe/E0;->a()LDe/g;

    move-result-object v4

    const v5, -0x639bfee8

    move-object/from16 v6, p0

    invoke-interface {v6, v5}, LT/l;->U(I)V

    const/4 v5, 0x0

    if-nez v4, :cond_e

    goto :goto_7

    :cond_e
    invoke-interface {v4, v6, v5}, LDe/g;->c(LT/l;I)V

    :goto_7
    invoke-interface {v6}, LT/l;->J()V

    sget-object v17, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v16 .. v21}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v6, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/E0;->d()LS8/l;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-static {v3, v4, v7, v8, v7}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v3

    invoke-static {v3, v6, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LTe/E0;->d()LS8/l;

    move-result-object v3

    if-eqz v3, :cond_f

    const v3, -0x639be529

    invoke-interface {v6, v3}, LT/l;->U(I)V

    move/from16 v5, v30

    move-object/from16 v3, v31

    invoke-virtual {v3, v6, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->a()Lpa/b;

    move-result-object v7

    :goto_8
    invoke-virtual {v7}, Lpa/b;->c()LL0/U;

    move-result-object v7

    invoke-interface {v6}, LT/l;->J()V

    move-object/from16 v25, v7

    goto :goto_9

    :cond_f
    move/from16 v5, v30

    move-object/from16 v3, v31

    const v7, -0x639be009

    invoke-interface {v6, v7}, LT/l;->U(I)V

    invoke-virtual {v3, v6, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    goto :goto_8

    :goto_9
    invoke-virtual/range {p1 .. p1}, LTe/E0;->d()LS8/l;

    move-result-object v7

    if-eqz v7, :cond_10

    const v7, -0x639bd68f

    invoke-interface {v6, v7}, LT/l;->U(I)V

    invoke-virtual {v3, v6, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v7

    :goto_a
    invoke-interface {v6}, LT/l;->J()V

    move-wide/from16 v30, v7

    goto :goto_b

    :cond_10
    const v7, -0x639bd30f

    invoke-interface {v6, v7}, LT/l;->U(I)V

    invoke-virtual {v3, v6, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v7

    goto :goto_a

    :goto_b
    const/16 v28, 0x0

    const v29, 0x1fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object v3, v6

    move-wide/from16 v6, v30

    move-object/from16 v26, v3

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    move-object/from16 v5, v32

    :goto_c
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_12

    new-instance v4, LTe/G0;

    invoke-direct {v4, v5, v0, v1, v2}, LTe/G0;-><init>(Landroidx/compose/ui/e;LTe/E0;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;LTe/E0;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LTe/J0;->d(Landroidx/compose/ui/e;LTe/E0;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;LT/l;II)V
    .locals 46

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    move-object/from16 v0, p4

    move-object/from16 v14, p5

    move/from16 v15, p7

    const/16 v1, 0x8

    const/16 v2, 0x10

    const/16 v3, 0x20

    const v4, 0x6eae22c8

    move-object/from16 v5, p6

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v10

    and-int/lit8 v5, p8, 0x1

    const/4 v6, 0x2

    const/4 v9, 0x4

    if-eqz v5, :cond_0

    or-int/lit8 v7, v15, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v15, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v10, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v9

    goto :goto_0

    :cond_1
    move v8, v6

    :goto_0
    or-int/2addr v8, v15

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v15

    :goto_1
    and-int/lit8 v16, p8, 0x2

    if-eqz v16, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v16, v15, 0x30

    if-nez v16, :cond_5

    invoke-interface {v10, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_4

    move/from16 v16, v3

    goto :goto_2

    :cond_4
    move/from16 v16, v2

    :goto_2
    or-int v8, v8, v16

    :cond_5
    :goto_3
    and-int/lit8 v16, p8, 0x4

    if-eqz v16, :cond_6

    or-int/lit16 v8, v8, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v15, 0x180

    if-nez v9, :cond_8

    invoke-interface {v10, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v8, v9

    :cond_8
    :goto_5
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v8, v8, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v15, 0xc00

    if-nez v9, :cond_b

    invoke-interface {v10, v13}, LT/l;->c(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v8, v9

    :cond_b
    :goto_7
    and-int/lit8 v2, p8, 0x10

    if-eqz v2, :cond_c

    or-int/lit16 v8, v8, 0x6000

    goto :goto_a

    :cond_c
    and-int/lit16 v9, v15, 0x6000

    if-nez v9, :cond_f

    const v9, 0x8000

    and-int/2addr v9, v15

    if-nez v9, :cond_d

    invoke-interface {v10, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_8

    :cond_d
    invoke-interface {v10, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    :goto_8
    if-eqz v9, :cond_e

    const/16 v9, 0x4000

    goto :goto_9

    :cond_e
    const/16 v9, 0x2000

    :goto_9
    or-int/2addr v8, v9

    :cond_f
    :goto_a
    and-int/lit8 v9, p8, 0x20

    const/high16 v16, 0x30000

    if-eqz v9, :cond_11

    or-int v8, v8, v16

    :cond_10
    :goto_b
    move v9, v8

    goto :goto_d

    :cond_11
    and-int v9, v15, v16

    if-nez v9, :cond_10

    invoke-interface {v10, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    const/high16 v9, 0x20000

    goto :goto_c

    :cond_12
    const/high16 v9, 0x10000

    :goto_c
    or-int/2addr v8, v9

    goto :goto_b

    :goto_d
    const v8, 0x12493

    and-int/2addr v8, v9

    const v3, 0x12492

    if-ne v8, v3, :cond_14

    invoke-interface {v10}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_13

    goto :goto_e

    :cond_13
    invoke-interface {v10}, LT/l;->C()V

    move-object v5, v0

    move-object v1, v7

    move-object v4, v10

    goto/16 :goto_17

    :cond_14
    :goto_e
    if-eqz v5, :cond_15

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v8, v3

    goto :goto_f

    :cond_15
    move-object v8, v7

    :goto_f
    if-eqz v2, :cond_16

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v0

    :cond_16
    move-object/from16 v42, v0

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_17

    const/4 v0, -0x1

    const-string v2, "com.ui.wifiman.ui.signal.components.OverallApInfo (SignalTabStatsItemWifi.kt:128)"

    invoke-static {v4, v9, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_17
    const/16 v0, 0x3c

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v8, v0, v2, v6, v3}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v6, Lz/c;->a:Lz/c;

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v6, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v1

    sget-object v17, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    const/16 v7, 0x36

    invoke-static {v1, v2, v10, v7}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v10, v5}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v10, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v18, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_18

    invoke-static {}, LT/j;->c()V

    :cond_18
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_19

    invoke-interface {v10, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_10

    :cond_19
    invoke-interface {v10}, LT/l;->I()V

    :goto_10
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v4, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v4, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_1a

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    :cond_1a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1b
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v4, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/Z;->a:Lz/Z;

    const v0, -0x57dbdca7

    invoke-interface {v10, v0}, LT/l;->U(I)V

    if-nez v11, :cond_1c

    move-object/from16 p0, v5

    move-object/from16 v43, v6

    move-object/from16 v44, v8

    move/from16 v45, v9

    move-object/from16 p4, v10

    goto :goto_11

    :cond_1c
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v1, 0x20

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    shr-int/lit8 v0, v9, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v16, v0, 0x30

    const/16 v19, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    move-object/from16 v0, p1

    move-object/from16 p0, v5

    move/from16 v5, v20

    move-object/from16 v43, v6

    move-wide/from16 v6, v21

    move-object/from16 v44, v8

    move-object v8, v10

    move/from16 v45, v9

    move/from16 v9, v16

    move-object/from16 p4, v10

    move/from16 v10, v19

    invoke-static/range {v0 .. v10}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_11
    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/high16 v21, 0x3f800000    # 1.0f

    const/16 v22, 0x0

    move-object/from16 v19, p0

    move-object/from16 v20, v0

    invoke-static/range {v19 .. v24}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move-object/from16 v3, v43

    invoke-virtual {v3, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    move-object/from16 v4, p4

    const/16 v5, 0x36

    invoke-static {v2, v3, v4, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v4, v3}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v4}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v4, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v4}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_1d

    invoke-static {}, LT/j;->c()V

    :cond_1d
    invoke-interface {v4}, LT/l;->u()V

    invoke-interface {v4}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_1e

    invoke-interface {v4, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_12

    :cond_1e
    invoke-interface {v4}, LT/l;->I()V

    :goto_12
    invoke-static {v4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v2, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v7, v6, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_1f

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    :cond_1f
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_20
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v7, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/high16 v1, 0x3f800000    # 1.0f

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1, v3}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v17

    shr-int/lit8 v0, v45, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v12, v4, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v16

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v4, v1}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->b()LL0/U;

    move-result-object v37

    if-eqz v13, :cond_21

    const v2, 0x1b7db3f4

    invoke-interface {v4, v2}, LT/l;->U(I)V

    invoke-virtual {v0, v4, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->a()J

    move-result-wide v0

    :goto_13
    invoke-interface {v4}, LT/l;->J()V

    move-wide/from16 v18, v0

    goto :goto_14

    :cond_21
    const v2, 0x1b7db774

    invoke-interface {v4, v2}, LT/l;->U(I)V

    invoke-virtual {v0, v4, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->c()J

    move-result-wide v0

    goto :goto_13

    :goto_14
    sget-object v0, LW0/t;->a:LW0/t$a;

    invoke-virtual {v0}, LW0/t$a;->b()I

    move-result v31

    const/16 v40, 0xc30

    const v41, 0x1d7f8

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x2

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    move-object/from16 v38, v4

    invoke-static/range {v16 .. v41}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const v0, 0x1b7dc60a

    invoke-interface {v4, v0}, LT/l;->U(I)V

    invoke-interface/range {v42 .. v42}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDe/g;

    invoke-interface {v1, v4, v3}, LDe/g;->c(LT/l;I)V

    goto :goto_15

    :cond_22
    invoke-interface {v4}, LT/l;->J()V

    invoke-interface {v4}, LT/l;->R()V

    const v0, -0x57db801c

    invoke-interface {v4, v0}, LT/l;->U(I)V

    if-nez v14, :cond_23

    goto :goto_16

    :cond_23
    shr-int/lit8 v0, v45, 0xf

    and-int/lit8 v0, v0, 0xe

    invoke-static {v14, v4, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v16

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v4, v1}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->f()LL0/U;

    move-result-object v37

    invoke-virtual {v0, v4, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->c()J

    move-result-wide v18

    sget-object v0, LW0/t;->a:LW0/t$a;

    invoke-virtual {v0}, LW0/t$a;->b()I

    move-result v31

    const/16 v40, 0xc30

    const v41, 0x1d7fa

    const/16 v17, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x1

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    move-object/from16 v38, v4

    invoke-static/range {v16 .. v41}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_16
    invoke-interface {v4}, LT/l;->J()V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-static {}, LT/o;->P()V

    :cond_24
    move-object/from16 v5, v42

    move-object/from16 v1, v44

    :goto_17
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_25

    new-instance v10, LTe/H0;

    move-object v0, v10

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LTe/H0;-><init>(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_25
    return-void
.end method

.method private static final g(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, LTe/J0;->f(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final h(Landroidx/compose/ui/e;LTe/F0;LT/l;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "model"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x49bce046

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v4, v2, 0x6

    const/4 v13, 0x4

    if-nez v4, :cond_1

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v13

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v14}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v14}, LT/l;->C()V

    goto/16 :goto_8

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.signal.components.SignalTabStatsItemWifi (SignalTabStatsItemWifi.kt:70)"

    invoke-static {v3, v4, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    const/4 v15, 0x0

    invoke-static {v3, v4, v14, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v14, v15}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v14, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v14, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v14}, LT/l;->I()V

    :goto_4
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v3, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x1

    invoke-static {v12, v4, v11, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LTe/F0;->c()Ls9/a;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LTe/F0;->g()Ls9/d;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LTe/F0;->h()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, LTe/F0;->a()LCi/c;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LTe/F0;->b()Ls9/d;

    move-result-object v9

    const/16 v16, 0x6

    const/16 v17, 0x0

    move-object v10, v14

    move v15, v11

    move/from16 v11, v16

    move-object v15, v12

    move/from16 v12, v17

    invoke-static/range {v4 .. v12}, LTe/J0;->f(Landroidx/compose/ui/e;Ls9/a;Ls9/d;ZLCi/c;Ls9/d;LT/l;II)V

    int-to-float v4, v13

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v4, v14, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/F0;->d()LTe/E0;

    move-result-object v4

    if-eqz v4, :cond_b

    const/4 v5, 0x1

    goto :goto_5

    :cond_b
    const/4 v5, 0x0

    :goto_5
    new-instance v4, LTe/J0$a;

    invoke-direct {v4, v1}, LTe/J0$a;-><init>(LTe/F0;)V

    const v6, 0x4c79e908    # 6.551248E7f

    const/16 v15, 0x36

    const/4 v7, 0x1

    invoke-static {v6, v7, v4, v14, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const/16 v13, 0x1e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v17, 0x180006

    move-object v4, v3

    move-object v11, v14

    move/from16 v12, v17

    invoke-static/range {v4 .. v13}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LTe/F0;->e()LTe/E0;

    move-result-object v4

    if-eqz v4, :cond_c

    const/4 v5, 0x1

    goto :goto_6

    :cond_c
    const/4 v5, 0x0

    :goto_6
    new-instance v4, LTe/J0$b;

    invoke-direct {v4, v1}, LTe/J0$b;-><init>(LTe/F0;)V

    const v6, 0xff31dbf

    const/4 v7, 0x1

    invoke-static {v6, v7, v4, v14, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const/16 v13, 0x1e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v3

    move-object v11, v14

    move/from16 v12, v17

    invoke-static/range {v4 .. v13}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LTe/F0;->f()LTe/E0;

    move-result-object v4

    if-eqz v4, :cond_d

    const/4 v5, 0x1

    goto :goto_7

    :cond_d
    const/4 v5, 0x0

    :goto_7
    new-instance v4, LTe/J0$c;

    invoke-direct {v4, v1}, LTe/J0$c;-><init>(LTe/F0;)V

    const v6, -0x5cb88380

    const/4 v7, 0x1

    invoke-static {v6, v7, v4, v14, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const/16 v13, 0x1e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v3

    move-object v11, v14

    move/from16 v12, v17

    invoke-static/range {v4 .. v13}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v14}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_8
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, LTe/I0;

    invoke-direct {v4, v0, v1, v2}, LTe/I0;-><init>(Landroidx/compose/ui/e;LTe/F0;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final i(Landroidx/compose/ui/e;LTe/F0;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LTe/J0;->h(Landroidx/compose/ui/e;LTe/F0;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic j(Landroidx/compose/ui/e;LTe/E0;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTe/J0;->d(Landroidx/compose/ui/e;LTe/E0;LT/l;II)V

    return-void
.end method
