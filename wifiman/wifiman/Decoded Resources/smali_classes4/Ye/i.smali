.class public abstract LYe/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LYe/f;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LYe/i;->f(Landroidx/compose/ui/e;LYe/f;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LYe/f;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LYe/i;->d(Landroidx/compose/ui/e;LYe/f;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;LYe/f;LT/l;II)V
    .locals 23

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/4 v3, 0x6

    const v4, -0x474959a9

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v14

    const/4 v13, 0x1

    and-int/lit8 v5, v2, 0x1

    const/4 v15, 0x2

    if-eqz v5, :cond_0

    or-int/lit8 v6, v1, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v1, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v14, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v15

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v2, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_5

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v8, v7, 0x13

    const/16 v9, 0x12

    if-ne v8, v9, :cond_7

    invoke-interface {v14}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v14}, LT/l;->C()V

    goto/16 :goto_e

    :cond_7
    :goto_4
    if-eqz v5, :cond_8

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v12, v5

    goto :goto_5

    :cond_8
    move-object v12, v6

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanContainer (FloorplanMapperAvailableUi.kt:130)"

    invoke-static {v4, v7, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->o()Lf0/c;

    move-result-object v5

    const/4 v10, 0x0

    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v5

    invoke-static {v14, v10}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v14, v12}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_b

    invoke-interface {v14, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v14}, LT/l;->I()V

    :goto_6
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v5, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v9, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_c

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v9, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v10, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v8, 0x0

    const/4 v7, 0x0

    invoke-static {v9, v8, v13, v7}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LYe/f;->q0()LUe/g;

    move-result-object v6

    const/16 v17, 0x186

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v15, v7

    move/from16 v7, v19

    move-object/from16 v19, v12

    move v12, v8

    move-object v8, v14

    move-object v3, v9

    move/from16 v9, v17

    move-object v11, v10

    move/from16 v10, v18

    invoke-static/range {v5 .. v10}, LUe/o;->h(Landroidx/compose/ui/e;LUe/g;ZLT/l;II)V

    invoke-static {v3, v12, v13, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v4}, Lf0/c$a;->b()Lf0/c;

    move-result-object v6

    invoke-interface {v11, v5, v6}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v10, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v10, v14, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v6

    invoke-virtual {v6}, Lra/a;->a()Lra/b;

    move-result-object v6

    invoke-virtual {v6}, Lra/b;->a()Lra/b$a$a;

    move-result-object v6

    invoke-virtual {v6}, Lra/b$a$a;->c()F

    move-result v6

    invoke-virtual {v10, v14, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->b()Lra/b$a$b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$b;->c()F

    move-result v7

    invoke-static {v5, v6, v7}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v8, 0x3

    invoke-static {v5, v15, v15, v8, v15}, Landroidx/compose/animation/f;->b(Landroidx/compose/ui/e;Lr/H;Lmh/p;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v4}, Lf0/c$a;->a()Lf0/c$c;

    move-result-object v6

    sget-object v7, Lz/c;->a:Lz/c;

    const/16 v8, 0x10

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v12

    invoke-virtual {v7, v12}, Lz/c;->n(F)Lz/c$f;

    move-result-object v12

    move-object/from16 v18, v11

    const/16 v11, 0x36

    invoke-static {v12, v6, v14, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v12, 0x0

    invoke-static {v14, v12}, LT/j;->a(LT/l;I)I

    move-result v20

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v14, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v21

    if-nez v21, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v21

    if-eqz v21, :cond_f

    invoke-interface {v14, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_f
    invoke-interface {v14}, LT/l;->I()V

    :goto_7
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v12, v6, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v12, v11, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v12}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_10

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_11

    :cond_10
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v12, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v12, v11, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v12, v5, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/Z;->a:Lz/Z;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-interface {v5, v3, v6, v13}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v6

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v5, v11, v6, v13, v12}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v7, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    invoke-virtual {v4}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v7

    const/4 v8, 0x6

    invoke-static {v6, v7, v14, v8}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v14, v7}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v14, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_12

    invoke-static {}, LT/j;->c()V

    :cond_12
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_13

    invoke-interface {v14, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_13
    invoke-interface {v14}, LT/l;->I()V

    :goto_8
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v6, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v11, v7, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v11}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_14

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    :cond_14
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_15
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v11, v5, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, LYe/f;->s0()LLi/N;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v5, v7, v14, v6, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LTe/W;

    const v6, 0x55ed56c8

    invoke-interface {v14, v6}, LT/l;->U(I)V

    if-nez v5, :cond_16

    const/4 v12, 0x0

    goto :goto_9

    :cond_16
    const/4 v12, 0x0

    invoke-static {v3, v12, v13, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v8, 0x6

    invoke-static {v6, v5, v14, v8}, LTe/D;->n(Landroidx/compose/ui/e;LTe/W;LT/l;I)V

    sget-object v5, LYg/J;->a:LYg/J;

    :goto_9
    invoke-interface {v14}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LYe/f;->n0()LLi/N;

    move-result-object v5

    const/4 v15, 0x0

    invoke-static {v5, v7, v14, v15, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYe/c;

    const v6, 0x55ed7eb0

    invoke-interface {v14, v6}, LT/l;->U(I)V

    if-nez v5, :cond_17

    move-object v13, v10

    move v1, v15

    move-object/from16 v22, v18

    move-object/from16 v16, v19

    move v15, v9

    goto/16 :goto_d

    :cond_17
    instance-of v6, v5, LYe/c$a;

    if-eqz v6, :cond_19

    const v6, -0x36975f1e

    invoke-interface {v14, v6}, LT/l;->U(I)V

    check-cast v5, LYe/c$a;

    instance-of v5, v5, LYe/c$a$a;

    if-eqz v5, :cond_18

    new-instance v11, Ls9/d$b;

    sget v5, Lm8/c;->Y0:I

    invoke-direct {v11, v5}, Ls9/d$b;-><init>(I)V

    sget-object v5, LN9/b;->a:LN9/b;

    invoke-virtual {v5}, LN9/b;->A()Ls9/b;

    move-result-object v8

    invoke-virtual {v10, v14, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->d()Lr9/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$a;->f()J

    move-result-wide v6

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/4 v5, 0x0

    const/4 v15, 0x3

    move v15, v9

    move-object v9, v11

    move-object v11, v10

    move-object v10, v14

    move-object v13, v11

    move-object/from16 v22, v18

    move/from16 v11, v16

    move-object/from16 v16, v19

    const/4 v1, 0x0

    move/from16 v12, v17

    invoke-static/range {v5 .. v12}, LBe/y;->b(Landroidx/compose/ui/e;JLs9/b;Ls9/d;LT/l;II)V

    invoke-interface {v14}, LT/l;->J()V

    goto/16 :goto_c

    :cond_18
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_19
    move-object v13, v10

    move v1, v15

    move-object/from16 v22, v18

    move-object/from16 v16, v19

    move v15, v9

    instance-of v6, v5, LYe/c$b;

    if-eqz v6, :cond_22

    const v6, -0x368ef8bc    # -987252.25f

    invoke-interface {v14, v6}, LT/l;->U(I)V

    check-cast v5, LYe/c$b;

    instance-of v6, v5, LYe/c$b$a;

    if-eqz v6, :cond_1a

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->N0:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    :goto_a
    move-object v9, v5

    goto :goto_b

    :cond_1a
    instance-of v6, v5, LYe/c$b$b;

    if-eqz v6, :cond_1b

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->O0:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    goto :goto_a

    :cond_1b
    instance-of v6, v5, LYe/c$b$c;

    if-eqz v6, :cond_1c

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->P0:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    goto :goto_a

    :cond_1c
    instance-of v6, v5, LYe/c$b$d;

    if-eqz v6, :cond_1d

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->Q0:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    goto :goto_a

    :cond_1d
    instance-of v5, v5, LYe/c$b$e;

    if-eqz v5, :cond_21

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->R0:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    goto :goto_a

    :goto_b
    sget-object v5, LN9/b;->a:LN9/b;

    invoke-virtual {v5}, LN9/b;->A()Ls9/b;

    move-result-object v8

    invoke-virtual {v13, v14, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$a;->f()J

    move-result-wide v6

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v5, 0x0

    move-object v10, v14

    invoke-static/range {v5 .. v12}, LBe/y;->b(Landroidx/compose/ui/e;JLs9/b;Ls9/d;LT/l;II)V

    invoke-interface {v14}, LT/l;->J()V

    :goto_c
    sget-object v5, LYg/J;->a:LYg/J;

    :goto_d
    invoke-interface {v14}, LT/l;->J()V

    invoke-interface {v14}, LT/l;->R()V

    invoke-virtual/range {p1 .. p1}, LYe/f;->v0()LLi/N;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v5, v7, v14, v1, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    new-instance v7, LYe/i$a;

    invoke-direct {v7, v0}, LYe/i$a;-><init>(LYe/f;)V

    const v8, -0xc942c32

    const/16 v12, 0x36

    invoke-static {v8, v6, v7, v14, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/16 v11, 0x6c00

    const/16 v17, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "FloorplanContainer"

    move-object v10, v14

    move/from16 v12, v17

    invoke-static/range {v5 .. v12}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v14}, LT/l;->R()V

    invoke-virtual/range {p1 .. p1}, LYe/f;->p0()LLi/N;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v5, v7, v14, v1, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LTe/k;

    invoke-virtual {v4}, Lf0/c$a;->e()Lf0/c;

    move-result-object v4

    move-object/from16 v6, v22

    invoke-interface {v6, v3, v4}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v13, v14, v15}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    const/4 v6, 0x2

    const/4 v8, 0x0

    invoke-static {v3, v4, v8, v6, v7}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    if-eqz v5, :cond_1e

    const/4 v1, 0x1

    :cond_1e
    const/4 v3, 0x3

    invoke-static {v7, v8, v3, v7}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v4

    invoke-static {v7, v8, v3, v7}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v8

    new-instance v3, LYe/i$b;

    invoke-direct {v3, v5, v0}, LYe/i$b;-><init>(LTe/k;LYe/f;)V

    const v5, -0x4d66c4c7

    const/4 v7, 0x1

    const/16 v9, 0x36

    invoke-static {v5, v7, v3, v14, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const v12, 0x30d80

    const/16 v13, 0x10

    const/4 v9, 0x0

    move v5, v1

    move-object v7, v4

    move-object v11, v14

    invoke-static/range {v5 .. v13}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v14}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-static {}, LT/o;->P()V

    :cond_1f
    move-object/from16 v6, v16

    :goto_e
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v1

    if-eqz v1, :cond_20

    new-instance v3, LYe/h;

    move/from16 v4, p3

    invoke-direct {v3, v6, v0, v4, v2}, LYe/h;-><init>(Landroidx/compose/ui/e;LYe/f;II)V

    invoke-interface {v1, v3}, LT/X0;->a(Lmh/p;)V

    :cond_20
    return-void

    :cond_21
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_22
    const v0, 0x488fbef4    # 294391.62f

    invoke-interface {v14, v0}, LT/l;->U(I)V

    invoke-interface {v14}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final d(Landroidx/compose/ui/e;LYe/f;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LYe/i;->c(Landroidx/compose/ui/e;LYe/f;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;LYe/f;LT/l;II)V
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "vm"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x1d6804ee

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x1

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
    const/4 v6, 0x2

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

    goto :goto_6

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

    const-string v5, "com.ui.wifiman.ui.signal.floorplan.scan.FloorplanMapperAvailableUi (FloorplanMapperAvailableUi.kt:49)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v14, v3, v5, v4}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v15, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->e()Lma/a$e;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$e;->b()J

    move-result-wide v6

    new-instance v3, LYe/i$c;

    invoke-direct {v3, v14, v0}, LYe/i$c;-><init>(Landroidx/compose/ui/e;LYe/f;)V

    const/16 v8, 0x36

    const v9, 0x3f366056

    invoke-static {v9, v5, v3, v15, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v12

    const/high16 v3, 0x180000

    const/16 v16, 0x3a

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v13, v15

    move-object/from16 v17, v14

    move v14, v3

    move-object v3, v15

    move/from16 v15, v16

    invoke-static/range {v4 .. v15}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    move-object/from16 v5, v17

    :goto_6
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, LYe/g;

    invoke-direct {v4, v5, v0, v1, v2}, LYe/g;-><init>(Landroidx/compose/ui/e;LYe/f;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;LYe/f;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LYe/i;->e(Landroidx/compose/ui/e;LYe/f;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;LYe/f;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LYe/i;->c(Landroidx/compose/ui/e;LYe/f;LT/l;II)V

    return-void
.end method
