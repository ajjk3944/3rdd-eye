.class public abstract Llf/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Llf/k$b;Llf/l;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Llf/f;->c(Landroidx/compose/ui/e;Llf/k$b;Llf/l;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Llf/k$b;Llf/l;LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "reason"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "vm"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x61646299

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v6, v3, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v3, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_5

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v8

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v5, 0x93

    const/16 v9, 0x92

    if-ne v6, v9, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v4, v15

    goto/16 :goto_9

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_8

    const/4 v6, -0x1

    const-string v9, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerEmptyUi (SpeedtestInternetServerPickerEmptyUi.kt:20)"

    invoke-static {v4, v5, v6, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->e()Lf0/c;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v15, v6}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v15, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_a
    invoke-interface {v15}, LT/l;->I()V

    :goto_5
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v4, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v13, v10, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v13}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_b

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v13, v9, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v13, v11, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v4, v9, v10, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v9, Lla/a;->a:Lla/a;

    sget v12, Lla/a;->b:I

    invoke-virtual {v9, v15, v12}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v13

    invoke-virtual {v13}, Lra/a;->a()Lra/b;

    move-result-object v13

    invoke-virtual {v13}, Lra/b;->a()Lra/b$a$a;

    move-result-object v13

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v13, v7}, Lra/b$a;->a(F)F

    move-result v7

    invoke-virtual {v9, v15, v12}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v9

    invoke-virtual {v9}, Lra/a;->a()Lra/b;

    move-result-object v9

    invoke-virtual {v9}, Lra/b;->b()Lra/b$a$b;

    move-result-object v9

    invoke-virtual {v9}, Lra/b$a$b;->d()F

    move-result v9

    invoke-static {v4, v7, v9}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, LN9/b;->a:LN9/b;

    invoke-virtual {v7}, LN9/b;->J()Ls9/b;

    move-result-object v7

    instance-of v9, v1, Llf/k$b$a;

    if-eqz v9, :cond_d

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->A3:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    goto :goto_6

    :cond_d
    instance-of v12, v1, Llf/k$b$b;

    if-eqz v12, :cond_17

    new-instance v12, Ls9/d$b;

    sget v13, Lm8/c;->D3:I

    invoke-direct {v12, v13}, Ls9/d$b;-><init>(I)V

    :goto_6
    if-eqz v9, :cond_e

    new-instance v13, Ls9/d$b;

    sget v14, Lm8/c;->z3:I

    invoke-direct {v13, v14}, Ls9/d$b;-><init>(I)V

    goto :goto_7

    :cond_e
    instance-of v13, v1, Llf/k$b$b;

    if-eqz v13, :cond_16

    new-instance v13, Ls9/d$b;

    sget v14, Lm8/c;->C3:I

    invoke-direct {v13, v14}, Ls9/d$b;-><init>(I)V

    :goto_7
    if-eqz v9, :cond_f

    goto :goto_8

    :cond_f
    instance-of v9, v1, Llf/k$b$b;

    if-eqz v9, :cond_15

    new-instance v9, Ls9/d$b;

    sget v11, Lm8/c;->B3:I

    invoke-direct {v9, v11}, Ls9/d$b;-><init>(I)V

    move-object v11, v9

    :goto_8
    const v9, -0x5e98cafa

    invoke-interface {v15, v9}, LT/l;->U(I)V

    and-int/lit16 v5, v5, 0x380

    if-ne v5, v8, :cond_10

    move v6, v10

    :cond_10
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v6, :cond_11

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_12

    :cond_11
    new-instance v5, Llf/f$a;

    invoke-direct {v5, v2}, Llf/f$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v5, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    move-object v14, v5

    check-cast v14, Lmh/a;

    const/high16 v16, 0xc00000

    const/16 v17, 0x110

    const/4 v9, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v5, v4

    move-object v6, v7

    move-object v7, v12

    move-object v8, v13

    move-object v10, v11

    move-object v11, v14

    move-object/from16 v12, v18

    move-object/from16 v13, v19

    move-object v14, v15

    move-object v4, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v5 .. v16}, LBe/o;->f(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Ls9/d;Lmh/l;Ls9/d;Lmh/a;Ls9/d;Lmh/a;LT/l;II)V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_9
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_14

    new-instance v5, Llf/e;

    invoke-direct {v5, v0, v1, v2, v3}, Llf/e;-><init>(Landroidx/compose/ui/e;Llf/k$b;Llf/l;I)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void

    :cond_15
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_17
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final c(Landroidx/compose/ui/e;Llf/k$b;Llf/l;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Llf/f;->b(Landroidx/compose/ui/e;Llf/k$b;Llf/l;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
