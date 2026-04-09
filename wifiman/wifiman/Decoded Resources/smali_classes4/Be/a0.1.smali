.class public abstract LBe/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LBe/a0;->e(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LBe/a0;->f(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LJ9/j;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LBe/a0;->h(Landroidx/compose/ui/e;LJ9/j;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;LT/l;II)V
    .locals 33

    move-object/from16 v3, p2

    move/from16 v5, p5

    const/4 v0, 0x2

    const/4 v1, 0x6

    const v2, 0x79b41fe8

    move-object/from16 v4, p4

    invoke-interface {v4, v2}, LT/l;->r(I)LT/l;

    move-result-object v4

    const/4 v6, 0x1

    and-int/lit8 v7, p6, 0x1

    const/4 v13, 0x4

    if-eqz v7, :cond_0

    or-int/lit8 v8, v5, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v5, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v4, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v13

    goto :goto_0

    :cond_1
    move v9, v0

    :goto_0
    or-int/2addr v9, v5

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v5

    :goto_1
    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_4

    or-int/lit8 v9, v9, 0x30

    :cond_3
    move-object/from16 v0, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v0, v5, 0x30

    if-nez v0, :cond_3

    move-object/from16 v0, p1

    invoke-interface {v4, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :goto_3
    and-int/lit8 v10, p6, 0x4

    const/16 v11, 0x100

    if-eqz v10, :cond_6

    or-int/lit16 v9, v9, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v5, 0x180

    if-nez v10, :cond_8

    invoke-interface {v4, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    move v10, v11

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v9, v10

    :cond_8
    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v9, v9, 0xc00

    move-object/from16 v15, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    move-object/from16 v15, p3

    if-nez v10, :cond_b

    invoke-interface {v4, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v9, v10

    :cond_b
    :goto_7
    and-int/lit16 v10, v9, 0x493

    const/16 v12, 0x492

    if-ne v10, v12, :cond_d

    invoke-interface {v4}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v4}, LT/l;->C()V

    move-object v1, v8

    goto/16 :goto_f

    :cond_d
    :goto_8
    if-eqz v7, :cond_e

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v32, v7

    goto :goto_9

    :cond_e
    move-object/from16 v32, v8

    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_f

    const/4 v7, -0x1

    const-string v8, "com.ui.wifiman.ui.component.NavigationTab (UiNavigationBar.kt:129)"

    invoke-static {v2, v9, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_f
    invoke-virtual/range {p1 .. p1}, LJ9/a;->d()Z

    move-result v2

    const v7, -0x10916e82

    invoke-interface {v4, v7}, LT/l;->U(I)V

    invoke-interface {v4, v2}, LT/l;->c(Z)Z

    move-result v2

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_10

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_12

    :cond_10
    invoke-virtual/range {p1 .. p1}, LJ9/a;->d()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual/range {p3 .. p3}, LBe/V;->c()J

    move-result-wide v7

    goto :goto_a

    :cond_11
    invoke-virtual/range {p3 .. p3}, LBe/V;->b()J

    move-result-wide v7

    :goto_a
    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    invoke-interface {v4, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v7, Lm0/v0;

    invoke-virtual {v7}, Lm0/v0;->u()J

    move-result-wide v27

    invoke-interface {v4}, LT/l;->J()V

    const v2, -0x10914c2d

    invoke-interface {v4, v2}, LT/l;->U(I)V

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v2, v8, :cond_13

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v2

    invoke-interface {v4, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v17, v2

    check-cast v17, Ly/m;

    invoke-interface {v4}, LT/l;->J()V

    invoke-virtual/range {p3 .. p3}, LBe/V;->d()J

    move-result-wide v20

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v18 .. v23}, LQ/o;->c(ZFJILjava/lang/Object;)Ls/I;

    move-result-object v18

    const v2, -0x109138e7

    invoke-interface {v4, v2}, LT/l;->U(I)V

    and-int/lit16 v2, v9, 0x380

    const/4 v14, 0x0

    if-ne v2, v11, :cond_14

    goto :goto_b

    :cond_14
    move v6, v14

    :goto_b
    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_15

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v2, v6, :cond_16

    :cond_15
    new-instance v2, LBe/X;

    invoke-direct {v2, v3}, LBe/X;-><init>(Lmh/a;)V

    invoke-interface {v4, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v22, v2

    check-cast v22, Lmh/a;

    invoke-interface {v4}, LT/l;->J()V

    const/16 v23, 0x1c

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v32

    invoke-static/range {v16 .. v24}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-virtual {v6}, Lz/c;->b()Lz/c$f;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v7

    const/16 v8, 0x36

    invoke-static {v6, v7, v4, v8}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v4, v14}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v4}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v4, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v4}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_17

    invoke-static {}, LT/j;->c()V

    :cond_17
    invoke-interface {v4}, LT/l;->u()V

    invoke-interface {v4}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-interface {v4, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_c

    :cond_18
    invoke-interface {v4}, LT/l;->I()V

    :goto_c
    invoke-static {v4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v6, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v10, v8, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_19

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1a

    :cond_19
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1a
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v10, v2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, LJ9/a;->a()Ls9/b;

    move-result-object v6

    const v2, -0x7bd7d410

    invoke-interface {v4, v2}, LT/l;->U(I)V

    if-nez v6, :cond_1b

    goto :goto_d

    :cond_1b
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v7, 0x18

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-static/range {v27 .. v28}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v8

    const/16 v11, 0x30

    const/4 v12, 0x4

    const/4 v9, 0x0

    move-object v10, v4

    invoke-static/range {v6 .. v12}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    :goto_d
    invoke-interface {v4}, LT/l;->J()V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v6, v13

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-static {v6, v4, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v1, 0x0

    const/4 v6, 0x3

    invoke-static {v2, v1, v14, v6, v1}, Landroidx/compose/foundation/layout/r;->H(Landroidx/compose/ui/e;Lf0/c$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1, v14, v6, v1}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v2, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v2, v4, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->f()LL0/U;

    move-result-object v2

    sget-object v6, LW0/j;->b:LW0/j$a;

    invoke-virtual {v6}, LW0/j$a;->a()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, LJ9/a;->f()Ls9/d;

    move-result-object v8

    const v9, -0x7bd7a24d

    invoke-interface {v4, v9}, LT/l;->U(I)V

    if-nez v8, :cond_1c

    goto :goto_e

    :cond_1c
    invoke-static {v8, v4, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    :goto_e
    invoke-interface {v4}, LT/l;->J()V

    if-nez v1, :cond_1d

    new-instance v1, LL0/d;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const-string v9, ""

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1d
    sget-object v8, LW0/t;->a:LW0/t$a;

    invoke-virtual {v8}, LW0/t$a;->b()I

    move-result v21

    invoke-static {v6}, LW0/j;->h(I)LW0/j;

    move-result-object v18

    const/16 v30, 0xc30

    const v31, 0x1d5f8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v8, 0x0

    move-wide v15, v8

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x30

    move-object v6, v1

    move-wide/from16 v8, v27

    move-object/from16 v27, v2

    move-object/from16 v28, v4

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    move-object/from16 v1, v32

    :goto_f
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v8, LBe/Y;

    move-object v0, v8

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LBe/Y;-><init>(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void
.end method

.method private static final e(Lmh/a;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LBe/a0;->d(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/e;LJ9/j;Lmh/l;LT/l;II)V
    .locals 22

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "tabs"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5d8ece2f

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v5, p5, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, p5, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_8

    invoke-interface {v1, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_8
    :goto_5
    and-int/lit16 v8, v7, 0x93

    const/16 v9, 0x92

    if-ne v8, v9, :cond_a

    invoke-interface {v1}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v1}, LT/l;->C()V

    goto/16 :goto_8

    :cond_a
    :goto_6
    if-eqz v5, :cond_b

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v15, v5

    goto :goto_7

    :cond_b
    move-object v15, v6

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.component.UiNavigationBarLayout (UiNavigationBar.kt:83)"

    invoke-static {v0, v7, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    const/4 v0, 0x0

    invoke-static {v1, v0}, LBe/a0;->j(LT/l;I)LBe/V;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v15, v6, v7, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v9, 0x3

    invoke-static {v6, v8, v0, v9, v8}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v16

    invoke-virtual {v5}, LBe/V;->a()J

    move-result-wide v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v5}, LBe/V;->a()J

    move-result-wide v8

    new-instance v6, LBe/a0$a;

    invoke-direct {v6, v15, v2, v3, v5}, LBe/a0$a;-><init>(Landroidx/compose/ui/e;LJ9/j;Lmh/l;LBe/V;)V

    const/16 v5, 0x36

    const v10, -0x483ba1eb

    invoke-static {v10, v7, v6, v1, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v13

    const/high16 v16, 0x180000

    const/16 v17, 0x3a

    const/4 v6, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v5, v0

    move-wide v7, v8

    move-wide v9, v10

    move-object v11, v12

    move v12, v14

    move-object v14, v1

    move-object v0, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v5 .. v16}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    move-object v6, v0

    :goto_8
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v8, LBe/W;

    move-object v0, v8

    move-object v1, v6

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LBe/W;-><init>(Landroidx/compose/ui/e;LJ9/j;Lmh/l;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final h(Landroidx/compose/ui/e;LJ9/j;Lmh/l;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LBe/a0;->g(Landroidx/compose/ui/e;LJ9/j;Lmh/l;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic i(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;LT/l;II)V
    .locals 0

    invoke-static/range {p0 .. p6}, LBe/a0;->d(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;LT/l;II)V

    return-void
.end method

.method private static final j(LT/l;I)LBe/V;
    .locals 11

    const v0, -0x5dbe53b9

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.rememberUiNavigationBarLayoutColors (UiNavigationBar.kt:50)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p1, p0, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    const v0, -0x1ae3b589

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-interface {p0, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_3

    :cond_1
    sget-object v0, Lma/a$d;->a:Lma/a$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, LBe/V;

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->a()J

    move-result-wide v2

    invoke-virtual {p1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->c()J

    move-result-wide v4

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v6

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$b;->g()J

    move-result-wide v8

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LBe/V;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lma/a$b;->a:Lma/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, LBe/V;

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->b()J

    move-result-wide v2

    invoke-virtual {p1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->c()J

    move-result-wide v4

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->b()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide v6

    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide v8

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LBe/V;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    invoke-interface {p0, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, LBe/V;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p0}, LT/l;->J()V

    return-object v1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
