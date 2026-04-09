.class public abstract Lkf/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lkf/a$b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkf/i;->c(Landroidx/compose/ui/e;Lkf/a$b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lkf/a$b;LT/l;II)V
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/4 v3, 0x2

    const-string v4, "reason"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x636afee5    # 4.3349052E21f

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v5, 0x1

    and-int/lit8 v6, v2, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v7, v1, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v1, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    move v8, v3

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v1

    :goto_1
    and-int/2addr v3, v2

    const/16 v9, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v9

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v8, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v8, 0x13

    const/16 v10, 0x12

    if-ne v3, v10, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v7

    move-object/from16 v17, v15

    goto/16 :goto_9

    :cond_7
    :goto_4
    if-eqz v6, :cond_8

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_5

    :cond_8
    move-object v3, v7

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsEmptyUi (SpeedtestResultsEmptyUi.kt:20)"

    invoke-static {v4, v8, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->e()Lf0/c;

    move-result-object v8

    const/4 v10, 0x0

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v8

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v15, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v15, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v8, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v8

    invoke-static {v13, v11, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v8

    invoke-interface {v13}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_c

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_d

    :cond_c
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10, v8}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v8

    invoke-static {v13, v7, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v7, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v7, v4, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v15, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->a()Lra/b$a$a;

    move-result-object v7

    int-to-float v8, v9

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-virtual {v7, v8}, Lra/b$a;->a(F)F

    move-result v7

    invoke-virtual {v5, v15, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->b()Lra/b$a$b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$b;->d()F

    move-result v5

    invoke-static {v4, v7, v5}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->P()Ls9/b;

    move-result-object v6

    instance-of v4, v0, Lkf/a$b$b;

    if-eqz v4, :cond_e

    new-instance v4, Ls9/d$b;

    sget v7, Lm8/c;->w3:I

    invoke-direct {v4, v7}, Ls9/d$b;-><init>(I)V

    :goto_7
    move-object v7, v4

    goto :goto_8

    :cond_e
    instance-of v4, v0, Lkf/a$b$a;

    if-eqz v4, :cond_11

    new-instance v4, Ls9/d$b;

    sget v7, Lm8/c;->v3:I

    invoke-direct {v4, v7}, Ls9/d$b;-><init>(I)V

    goto :goto_7

    :goto_8
    const v4, 0xc30c30

    const/16 v16, 0x150

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v14, v15

    move-object/from16 v17, v15

    move v15, v4

    invoke-static/range {v5 .. v16}, LBe/o;->f(Landroidx/compose/ui/e;Ls9/a;Ls9/d;Ls9/d;Lmh/l;Ls9/d;Lmh/a;Ls9/d;Lmh/a;LT/l;II)V

    invoke-interface/range {v17 .. v17}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_9
    invoke-interface/range {v17 .. v17}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_10

    new-instance v5, Lkf/h;

    invoke-direct {v5, v3, v0, v1, v2}, Lkf/h;-><init>(Landroidx/compose/ui/e;Lkf/a$b;II)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final c(Landroidx/compose/ui/e;Lkf/a$b;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lkf/i;->b(Landroidx/compose/ui/e;Lkf/a$b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
