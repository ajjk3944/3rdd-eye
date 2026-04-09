.class public abstract Lcom/ui/wifiman/ui/signal/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/ui/wifiman/ui/signal/t;->c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;LT/l;II)V
    .locals 19

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const/4 v0, 0x4

    const-string v1, "reason"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "vm"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x5d02d563

    move-object/from16 v5, p3

    invoke-interface {v5, v1}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v5, 0x1

    and-int/lit8 v6, p5, 0x1

    const/4 v7, 0x2

    if-eqz v6, :cond_0

    or-int/lit8 v8, v4, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v4, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v15, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v0

    goto :goto_0

    :cond_1
    move v9, v7

    :goto_0
    or-int/2addr v9, v4

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v4

    :goto_1
    and-int/lit8 v10, p5, 0x2

    const/16 v11, 0x20

    if-eqz v10, :cond_3

    or-int/lit8 v9, v9, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v4, 0x30

    if-nez v10, :cond_5

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    move v10, v11

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :cond_5
    :goto_3
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_6

    or-int/lit16 v9, v9, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v0, v4, 0x180

    if-nez v0, :cond_8

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v0, 0x100

    goto :goto_4

    :cond_7
    const/16 v0, 0x80

    :goto_4
    or-int/2addr v9, v0

    :cond_8
    :goto_5
    and-int/lit16 v0, v9, 0x93

    const/16 v12, 0x92

    if-ne v0, v12, :cond_a

    invoke-interface {v15}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v15}, LT/l;->C()V

    move-object v1, v15

    goto/16 :goto_10

    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_7

    :cond_b
    move-object v0, v8

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_c

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.signal.SignalTabFloorplanUiEmpty (SignalTabFloorplanUiEmpty.kt:22)"

    invoke-static {v1, v9, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    const/4 v1, 0x0

    const/4 v6, 0x0

    invoke-static {v0, v1, v5, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v12, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v12}, Lf0/c$a;->e()Lf0/c;

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v12

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v14

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v15, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_d

    invoke-static {}, LT/j;->c()V

    :cond_d
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_e

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_e
    invoke-interface {v15}, LT/l;->I()V

    :goto_8
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v10, v12, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v10, v13, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v10}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_f

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    :cond_f
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v10, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v10, v12, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_10
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v10, v8, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v7, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v7, v1, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v7, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v7, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v10

    invoke-virtual {v10}, Lra/a;->a()Lra/b;

    move-result-object v10

    invoke-virtual {v10}, Lra/b;->a()Lra/b$a$a;

    move-result-object v10

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-virtual {v10, v11}, Lra/b$a;->a(F)F

    move-result v10

    invoke-virtual {v7, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->b()Lra/b$a$b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$b;->d()F

    move-result v7

    invoke-static {v1, v10, v7}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    instance-of v7, v2, Lcom/ui/wifiman/ui/signal/l$b$b$a;

    if-eqz v7, :cond_11

    new-instance v8, Ls9/c$a;

    sget v10, Lm8/a;->n0:I

    const/4 v11, 0x2

    invoke-direct {v8, v10, v6, v11, v6}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_11
    instance-of v8, v2, Lcom/ui/wifiman/ui/signal/l$b$a;

    if-nez v8, :cond_13

    instance-of v8, v2, Lcom/ui/wifiman/ui/signal/l$b$b$b;

    if-nez v8, :cond_13

    instance-of v8, v2, Lcom/ui/wifiman/ui/signal/l$b$b$d;

    if-nez v8, :cond_13

    instance-of v8, v2, Lcom/ui/wifiman/ui/signal/l$b$b$c;

    if-nez v8, :cond_13

    instance-of v8, v2, Lcom/ui/wifiman/ui/signal/l$b$b$e;

    if-eqz v8, :cond_12

    goto :goto_9

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_13
    :goto_9
    sget-object v8, LN9/b;->a:LN9/b;

    invoke-virtual {v8}, LN9/b;->c()Ls9/b;

    move-result-object v8

    :goto_a
    instance-of v10, v2, Lcom/ui/wifiman/ui/signal/l$b$a;

    if-eqz v10, :cond_14

    new-instance v11, Ls9/d$b;

    sget v12, Lm8/c;->v2:I

    invoke-direct {v11, v12}, Ls9/d$b;-><init>(I)V

    goto :goto_b

    :cond_14
    instance-of v11, v2, Lcom/ui/wifiman/ui/signal/l$b$b;

    if-eqz v11, :cond_2a

    new-instance v11, Ls9/d$b;

    sget v12, Lm8/c;->w2:I

    invoke-direct {v11, v12}, Ls9/d$b;-><init>(I)V

    :goto_b
    if-eqz v10, :cond_15

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->u2:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    goto :goto_c

    :cond_15
    instance-of v12, v2, Lcom/ui/wifiman/ui/signal/l$b$b$d$a;

    if-eqz v12, :cond_16

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->y2:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    goto :goto_c

    :cond_16
    instance-of v12, v2, Lcom/ui/wifiman/ui/signal/l$b$b$b;

    if-eqz v12, :cond_17

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->H0:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    goto :goto_c

    :cond_17
    instance-of v12, v2, Lcom/ui/wifiman/ui/signal/l$b$b$d$c;

    if-eqz v12, :cond_18

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->X0:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    goto :goto_c

    :cond_18
    instance-of v12, v2, Lcom/ui/wifiman/ui/signal/l$b$b$d$b;

    if-eqz v12, :cond_19

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->V0:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    goto :goto_c

    :cond_19
    if-eqz v7, :cond_1a

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->E0:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    goto :goto_c

    :cond_1a
    instance-of v12, v2, Lcom/ui/wifiman/ui/signal/l$b$b$c;

    if-eqz v12, :cond_1b

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->L0:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    goto :goto_c

    :cond_1b
    instance-of v12, v2, Lcom/ui/wifiman/ui/signal/l$b$b$e;

    if-eqz v12, :cond_29

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->S0:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    :goto_c
    if-eqz v10, :cond_1c

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->s2:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    :goto_d
    move-object v10, v6

    goto :goto_e

    :cond_1c
    instance-of v10, v2, Lcom/ui/wifiman/ui/signal/l$b$b$d$a;

    if-eqz v10, :cond_1d

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->x2:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    goto :goto_d

    :cond_1d
    instance-of v10, v2, Lcom/ui/wifiman/ui/signal/l$b$b$b;

    if-eqz v10, :cond_1e

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->G0:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    goto :goto_d

    :cond_1e
    instance-of v10, v2, Lcom/ui/wifiman/ui/signal/l$b$b$d$c;

    if-eqz v10, :cond_1f

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->W0:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    goto :goto_d

    :cond_1f
    instance-of v10, v2, Lcom/ui/wifiman/ui/signal/l$b$b$d$b;

    if-eqz v10, :cond_20

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->U0:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    goto :goto_d

    :cond_20
    if-eqz v7, :cond_21

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->D0:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    goto :goto_d

    :cond_21
    instance-of v7, v2, Lcom/ui/wifiman/ui/signal/l$b$b$c;

    if-eqz v7, :cond_22

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->K0:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    goto :goto_d

    :cond_22
    instance-of v7, v2, Lcom/ui/wifiman/ui/signal/l$b$b$e;

    if-eqz v7, :cond_28

    goto :goto_d

    :goto_e
    const v6, 0x3b2746b3

    invoke-interface {v15, v6}, LT/l;->U(I)V

    and-int/lit16 v6, v9, 0x380

    const/16 v7, 0x100

    if-ne v6, v7, :cond_23

    goto :goto_f

    :cond_23
    const/4 v5, 0x0

    :goto_f
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_24

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_25

    :cond_24
    new-instance v6, Lcom/ui/wifiman/ui/signal/t$a;

    invoke-direct {v6, v3}, Lcom/ui/wifiman/ui/signal/t$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_25
    check-cast v6, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    move-object v13, v6

    check-cast v13, Lmh/a;

    const/16 v16, 0x0

    const/16 v17, 0x190

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    move-object v5, v1

    move-object v6, v8

    move-object v7, v11

    move-object v8, v12

    move-object v11, v13

    move-object v12, v14

    move-object/from16 v13, v18

    move-object v14, v15

    move-object v1, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v5 .. v16}, LBe/o;->f(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Ls9/d;Lmh/l;Ls9/d;Lmh/a;Ls9/d;Lmh/a;LT/l;II)V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_26

    invoke-static {}, LT/o;->P()V

    :cond_26
    move-object v8, v0

    :goto_10
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_27

    new-instance v7, Lcom/ui/wifiman/ui/signal/s;

    move-object v0, v7

    move-object v1, v8

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/ui/signal/s;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_27
    return-void

    :cond_28
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_29
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/ui/wifiman/ui/signal/t;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
