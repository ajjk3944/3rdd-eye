.class public abstract Lef/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lef/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lef/j;->p(Landroidx/compose/ui/e;Lef/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LL0/d;Lmh/l;Ljava/lang/String;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lef/j;->n(LL0/d;Lmh/l;Ljava/lang/String;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, Lef/j;->l(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILjava/lang/String;)Lvf/d$a;
    .locals 0

    invoke-static {p0, p1}, Lef/j;->m(ILjava/lang/String;)Lvf/d$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Lef/j;->h(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Lef/j;->j(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;LT/l;II)V
    .locals 35

    move/from16 v4, p4

    const/4 v0, 0x2

    const/4 v1, 0x6

    const v2, 0x6117684f

    move-object/from16 v3, p3

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v3

    const/4 v14, 0x1

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

    invoke-interface {v3, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v6

    goto :goto_0

    :cond_1
    move v8, v0

    :goto_0
    or-int/2addr v8, v4

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v4

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_4

    or-int/lit8 v8, v8, 0x30

    :cond_3
    move-object/from16 v0, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v0, v4, 0x30

    if-nez v0, :cond_3

    move-object/from16 v0, p1

    invoke-interface {v3, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :goto_3
    and-int/lit8 v9, p5, 0x4

    if-eqz v9, :cond_7

    or-int/lit16 v8, v8, 0x180

    move-object/from16 v15, p2

    :cond_6
    :goto_4
    move v13, v8

    goto :goto_6

    :cond_7
    and-int/lit16 v9, v4, 0x180

    move-object/from16 v15, p2

    if-nez v9, :cond_6

    invoke-interface {v3, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v8, v9

    goto :goto_4

    :goto_6
    and-int/lit16 v8, v13, 0x93

    const/16 v9, 0x92

    if-ne v8, v9, :cond_a

    invoke-interface {v3}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v3}, LT/l;->C()V

    move-object v1, v7

    goto/16 :goto_b

    :cond_a
    :goto_7
    if-eqz v5, :cond_b

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v12, v5

    goto :goto_8

    :cond_b
    move-object v12, v7

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, -0x1

    const-string v7, "com.ui.wifiman.ui.speed.speedfactor.IssueKeyVal (SpeedFactorExplanationUi.kt:89)"

    invoke-static {v2, v13, v5, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    sget-object v2, Lz/c;->a:Lz/c;

    int-to-float v5, v6

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v2, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v8

    invoke-static {v6, v8, v3, v1}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v11, 0x0

    invoke-static {v3, v11}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v3, v12}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_d

    invoke-static {}, LT/j;->c()V

    :cond_d
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_e

    invoke-interface {v3, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_e
    invoke-interface {v3}, LT/l;->I()V

    :goto_9
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v1

    invoke-static {v14, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v14, v9, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v14}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_f

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    :cond_f
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v14, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v14, v6, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_10
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v14, v10, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v2, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v1

    invoke-virtual {v7}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v5, 0x36

    invoke-static {v1, v2, v3, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    invoke-static {v3, v11}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v3, v14}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_11

    invoke-static {}, LT/j;->c()V

    :cond_11
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v3, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_12
    invoke-interface {v3}, LT/l;->I()V

    :goto_a
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v1, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v7, v5, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_13

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    :cond_13
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_14
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v7, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    sget-object v1, LN9/b;->a:LN9/b;

    invoke-virtual {v1}, LN9/b;->v()Ls9/b;

    move-result-object v5

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lef/a$a;->c()LW7/e;

    move-result-object v1

    invoke-static {v1, v3, v11}, LNe/e;->b(LW7/e;LT/l;I)J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    const/16 v10, 0x30

    const/4 v1, 0x4

    const/4 v8, 0x0

    move-object v9, v3

    move v2, v11

    move v11, v1

    invoke-static/range {v5 .. v11}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, Lef/a$a;->d()Laf/O$b$a;

    move-result-object v1

    invoke-static {v1}, Laf/d0;->F(Laf/O$b$a;)I

    move-result v1

    invoke-static {v1, v3, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v5

    sget-object v1, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v1, v3, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v1, v3, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->b()J

    move-result-wide v7

    const/16 v28, 0x0

    const v29, 0xfffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/16 v16, 0x0

    move/from16 v31, v11

    move-object/from16 v11, v16

    move-object/from16 v32, v12

    move-object/from16 v12, v16

    move/from16 v33, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v34, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v3

    invoke-static/range {v5 .. v29}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, Lef/a$a;->e()Ls9/d;

    move-result-object v5

    invoke-static {v5, v3, v2}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move/from16 v6, v31

    invoke-virtual {v1, v3, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->a()LL0/U;

    move-result-object v26

    invoke-virtual/range {p1 .. p1}, Lef/a$a;->c()LW7/e;

    move-result-object v1

    invoke-static {v1, v3, v2}, LNe/e;->b(LW7/e;LT/l;I)J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x1fffa

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v25, 0x0

    move-object/from16 v27, v3

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v6, v34

    const/4 v5, 0x1

    invoke-static {v6, v1, v5, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lef/a$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lef/a$a;->b()Ls9/d;

    move-result-object v7

    sget-object v1, LW0/j;->b:LW0/j$a;

    invoke-virtual {v1}, LW0/j$a;->f()I

    move-result v8

    const v1, 0xe000

    const/4 v2, 0x6

    shl-int/lit8 v9, v33, 0x6

    and-int/2addr v1, v9

    or-int/lit8 v11, v1, 0x6

    const/4 v12, 0x0

    move-object/from16 v9, p2

    move-object v10, v3

    invoke-static/range {v5 .. v12}, Lef/j;->k(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;LT/l;II)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    move-object/from16 v1, v32

    :goto_b
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v7, Lef/e;

    move-object v0, v7

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lef/e;-><init>(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final h(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, Lef/j;->g(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;LT/l;II)V
    .locals 9

    const v0, 0x4ad4a2e1    # 6967664.5f

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_2

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p4

    goto :goto_1

    :cond_2
    move v2, p4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_5

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_8

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v2, v3

    :cond_8
    :goto_5
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_b

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LT/l;->C()V

    :cond_a
    :goto_6
    move-object v2, p0

    goto :goto_8

    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_c
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.speedfactor.IssueTextual (SpeedFactorExplanationUi.kt:129)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    invoke-virtual {p1}, Lef/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lef/a$b;->b()Ls9/d;

    move-result-object v3

    sget-object v1, LW0/j;->b:LW0/j$a;

    invoke-virtual {v1}, LW0/j$a;->a()I

    move-result v4

    and-int/lit8 v1, v2, 0xe

    const v5, 0xe000

    shl-int/lit8 v2, v2, 0x6

    and-int/2addr v2, v5

    or-int v7, v1, v2

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v1 .. v8}, Lef/j;->k(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    goto :goto_6

    :goto_8
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_e

    new-instance p3, Lef/f;

    move-object v1, p3

    move-object v3, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lef/f;-><init>(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;II)V

    invoke-interface {p0, p3}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final j(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, Lef/j;->i(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;LT/l;II)V
    .locals 43

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p6

    const v0, 0x1055ad80

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v4, p7, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v7, v6, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v6

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v6

    :goto_1
    and-int/lit8 v9, p7, 0x2

    if-eqz v9, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v6, 0x30

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
    and-int/lit8 v9, p7, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v8, v8, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_8

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v8, v8, 0xc00

    :cond_9
    move/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_9

    move/from16 v9, p3

    invoke-interface {v1, v9}, LT/l;->i(I)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v8, v11

    :goto_7
    and-int/lit8 v11, p7, 0x10

    const/16 v14, 0x4000

    if-eqz v11, :cond_c

    or-int/lit16 v8, v8, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_e

    invoke-interface {v1, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    move v11, v14

    goto :goto_8

    :cond_d
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v8, v11

    :cond_e
    :goto_9
    and-int/lit16 v11, v8, 0x2493

    const/16 v12, 0x2492

    if-ne v11, v12, :cond_10

    invoke-interface {v1}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v1}, LT/l;->C()V

    move-object v4, v7

    goto/16 :goto_d

    :cond_10
    :goto_a
    if-eqz v4, :cond_11

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_b

    :cond_11
    move-object v4, v7

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_12

    const/4 v7, -0x1

    const-string v11, "com.ui.wifiman.ui.speed.speedfactor.Message (SpeedFactorExplanationUi.kt:146)"

    invoke-static {v0, v8, v7, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    sget-object v15, Lvf/d;->a:Lvf/d;

    shr-int/lit8 v0, v8, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v1, v0}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v16

    const/4 v0, 0x6

    invoke-virtual {v15, v1, v0}, Lvf/d;->a(LT/l;I)J

    move-result-wide v17

    const v0, 0x30145fdb

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v0, v11, :cond_13

    new-instance v0, Lef/g;

    invoke-direct {v0}, Lef/g;-><init>()V

    invoke-interface {v1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v20, v0

    check-cast v20, Lmh/p;

    invoke-interface {v1}, LT/l;->J()V

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v19, 0x0

    invoke-static/range {v15 .. v22}, Lvf/d;->d(Lvf/d;Ljava/lang/String;JLjava/lang/String;Lmh/p;ILjava/lang/Object;)LL0/d;

    move-result-object v0

    sget-object v12, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v12, v1, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v11

    invoke-virtual {v11}, Lpa/c;->b()Lpa/b;

    move-result-object v11

    invoke-virtual {v11}, Lpa/b;->a()LL0/U;

    move-result-object v11

    invoke-virtual {v12, v1, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v12

    invoke-virtual {v12}, Lma/a;->f()Lma/a$f;

    move-result-object v12

    invoke-virtual {v12}, Lma/a$f;->b()J

    move-result-wide v12

    const v41, 0xff7ffe

    const/16 v42, 0x0

    const-wide/16 v15, 0x0

    move v10, v14

    move-wide v14, v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move/from16 v31, p3

    invoke-static/range {v11 .. v42}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v11

    const v12, 0x301494f9

    invoke-interface {v1, v12}, LT/l;->U(I)V

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    const v13, 0xe000

    and-int/2addr v13, v8

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-ne v13, v10, :cond_14

    move v10, v15

    goto :goto_c

    :cond_14
    move v10, v14

    :goto_c
    or-int/2addr v10, v12

    and-int/lit8 v12, v8, 0x70

    const/16 v13, 0x20

    if-ne v12, v13, :cond_15

    move v14, v15

    :cond_15
    or-int/2addr v10, v14

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_16

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v12, v7, :cond_17

    :cond_16
    new-instance v12, Lef/h;

    invoke-direct {v12, v0, v5, v2}, Lef/h;-><init>(LL0/d;Lmh/l;Ljava/lang/String;)V

    invoke-interface {v1, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    move-object v14, v12

    check-cast v14, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    shl-int/lit8 v7, v8, 0x3

    and-int/lit8 v16, v7, 0x70

    const/16 v17, 0x78

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object v7, v0

    move-object v8, v4

    move-object v9, v11

    move v11, v12

    move v12, v13

    move-object v13, v15

    move-object v15, v1

    invoke-static/range {v7 .. v17}, LF/h;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    :goto_d
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v9, Lef/i;

    move-object v0, v9

    move-object v1, v4

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lef/i;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_19
    return-void
.end method

.method private static final l(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, Lef/j;->k(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/d;ILmh/l;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final m(ILjava/lang/String;)Lvf/d$a;
    .locals 1

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lvf/d$a;

    const-string p1, "manage_in_unifi"

    const-string v0, ""

    invoke-direct {p0, p1, v0}, Lvf/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final n(LL0/d;Lmh/l;Ljava/lang/String;I)LYg/J;
    .locals 1

    const-string v0, "manage_in_unifi"

    invoke-virtual {p0, v0, p3, p3}, LL0/d;->j(Ljava/lang/String;II)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/d$c;

    if-eqz p0, :cond_0

    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final o(Landroidx/compose/ui/e;Lef/c;LT/l;II)V
    .locals 11

    const v0, -0x2aa0c621

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, p4, 0x2

    if-nez v3, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_4
    move v9, v2

    and-int/lit8 v2, v9, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_7

    :cond_6
    :goto_3
    invoke-interface {p2}, LT/l;->q()V

    and-int/lit8 v2, p3, 0x1

    if-eqz v2, :cond_8

    invoke-interface {p2}, LT/l;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p2}, LT/l;->C()V

    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_d

    :goto_4
    and-int/lit8 v9, v9, -0x71

    goto/16 :goto_6

    :cond_8
    :goto_5
    if-eqz v1, :cond_9

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_9
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_d

    const p1, -0x72e5f4af

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Lc2/a;->a:Lc2/a;

    sget v1, Lc2/a;->c:I

    invoke-virtual {p1, p2, v1}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Landroidx/lifecycle/P$c;

    const/4 v7, 0x0

    const/16 v8, 0x10

    const-class v1, Lef/c;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object p1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {p2, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const v4, 0x318a4a49

    invoke-interface {p2, v4}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_a

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_b

    :cond_a
    new-instance v5, Lye/i;

    invoke-direct {v5, p1, v1, v2}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v3, v5, p2, v1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    check-cast p1, Lef/c;

    goto/16 :goto_4

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    :goto_6
    invoke-interface {p2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speed.speedfactor.SpeedFactorExplanationUi (SpeedFactorExplanationUi.kt:45)"

    invoke-static {v0, v9, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p2, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->a()J

    move-result-wide v2

    new-instance v0, Lef/j$a;

    invoke-direct {v0, p1}, Lef/j$a;-><init>(Lef/c;)V

    const v1, -0x5a3a53a7

    const/4 v4, 0x1

    const/16 v5, 0x36

    invoke-static {v1, v4, v0, p2, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget-object v1, LY0/h;->b:LY0/h$a;

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v6

    new-instance v1, Lef/j$b;

    invoke-direct {v1, p1}, Lef/j$b;-><init>(Lef/c;)V

    const v7, 0x5ec949c

    invoke-static {v7, v4, v1, p2, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    and-int/lit8 v1, v9, 0xe

    const v4, 0x36180

    or-int v9, v1, v4

    const/16 v10, 0x8

    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, v0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, LFe/g;->b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_7
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_10

    new-instance v0, Lef/d;

    invoke-direct {v0, p0, p1, p3, p4}, Lef/d;-><init>(Landroidx/compose/ui/e;Lef/c;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final p(Landroidx/compose/ui/e;Lef/c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lef/j;->o(Landroidx/compose/ui/e;Lef/c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic q(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;LT/l;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lef/j;->g(Landroidx/compose/ui/e;Lef/a$a;Lmh/l;LT/l;II)V

    return-void
.end method

.method public static final synthetic r(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;LT/l;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lef/j;->i(Landroidx/compose/ui/e;Lef/a$b;Lmh/l;LT/l;II)V

    return-void
.end method
