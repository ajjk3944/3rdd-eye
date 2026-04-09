.class public abstract LRe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRe/e$c;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/d;Lmh/a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LRe/e;->f(Landroidx/compose/ui/e;Ls9/d;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LRe/a;Lof/a$c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LRe/e;->d(Landroidx/compose/ui/e;LRe/a;Lof/a$c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;LRe/a;Lof/a$c;LT/l;II)V
    .locals 23

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "vm"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountVM"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2031a006

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v5, p5, 0x1

    const/4 v14, 0x2

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
    move v7, v14

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

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

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

    move-object/from16 v18, v6

    goto/16 :goto_f

    :cond_a
    :goto_6
    if-eqz v5, :cond_b

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v5

    goto :goto_7

    :cond_b
    move-object v13, v6

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.settings.AppSettingsAccountLayout (AppSettingsAccountLayout.kt:49)"

    invoke-static {v0, v7, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v0, v5, :cond_d

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, v1}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v5, LT/A;

    invoke-direct {v5, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v1, v5}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v5

    :cond_d
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v0

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v1, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->a()Lra/b$a$a;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$a;->d()F

    move-result v7

    const/4 v8, 0x0

    const/4 v12, 0x0

    invoke-static {v13, v7, v8, v14, v12}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v9, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v9}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v9

    sget-object v10, Lz/c;->a:Lz/c;

    invoke-virtual {v10}, Lz/c;->g()Lz/c$m;

    move-result-object v10

    const/16 v11, 0x30

    invoke-static {v10, v9, v1, v11}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static {v1, v11}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v1, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_f

    invoke-interface {v1, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_f
    invoke-interface {v1}, LT/l;->I()V

    :goto_8
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v14, v9, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v9

    invoke-static {v14, v15, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v9

    invoke-interface {v14}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_10

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_11

    :cond_10
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v14, v10, v9}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v9

    invoke-static {v14, v7, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v15, Lz/k;->a:Lz/k;

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v14, 0x1

    invoke-static {v7, v8, v14, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual {v5, v1, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v8

    invoke-virtual {v8}, Lra/a;->a()Lra/b;

    move-result-object v8

    invoke-virtual {v8}, Lra/b;->a()Lra/b$a$a;

    move-result-object v8

    invoke-virtual {v8}, Lra/b$a$a;->c()F

    move-result v8

    invoke-virtual {v5, v1, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v9

    invoke-virtual {v9}, Lra/a;->a()Lra/b;

    move-result-object v9

    invoke-virtual {v9}, Lra/b;->a()Lra/b$a$a;

    move-result-object v9

    invoke-virtual {v9}, Lra/b$a$a;->c()F

    move-result v9

    invoke-virtual {v5, v1, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v10

    invoke-virtual {v10}, Lra/a;->a()Lra/b;

    move-result-object v10

    invoke-virtual {v10}, Lra/b;->b()Lra/b$a$b;

    move-result-object v10

    invoke-virtual {v10}, Lra/b$a$b;->d()F

    move-result v10

    invoke-virtual {v5, v1, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v11

    invoke-virtual {v11}, Lra/a;->a()Lra/b;

    move-result-object v11

    invoke-virtual {v11}, Lra/b;->b()Lra/b$a$b;

    move-result-object v11

    invoke-virtual {v11}, Lra/b$a$b;->d()F

    move-result v11

    invoke-static {v7, v8, v10, v9, v11}, Landroidx/compose/foundation/layout/o;->l(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lof/a$c;->o0()LLi/N;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v12, v1, v9, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v8

    invoke-interface {v8}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ls9/c;

    new-instance v10, Ls9/c$a;

    sget v11, Lm8/a;->t0:I

    const/4 v9, 0x2

    invoke-direct {v10, v11, v12, v9, v12}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p2 .. p2}, Lof/a$c;->n0()LLi/N;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static {v9, v12, v1, v11, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v9

    invoke-interface {v9}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lof/a$a;

    sget-object v16, LRe/e$c;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v16, v9

    const/4 v11, 0x5

    move-object/from16 v18, v13

    const/4 v13, 0x3

    if-eq v9, v14, :cond_14

    const/4 v12, 0x2

    if-eq v9, v12, :cond_14

    if-eq v9, v13, :cond_14

    const/4 v12, 0x4

    if-eq v9, v12, :cond_13

    if-ne v9, v11, :cond_12

    goto :goto_9

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_13
    :goto_9
    const/4 v9, 0x0

    goto :goto_a

    :cond_14
    move v9, v14

    :goto_a
    invoke-virtual/range {p2 .. p2}, Lof/a$c;->n0()LLi/N;

    move-result-object v12

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static {v12, v13, v1, v11, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v12

    invoke-interface {v12}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lof/a$a;

    const v11, -0x60c9e310

    invoke-interface {v1, v11}, LT/l;->U(I)V

    sget-object v11, Lof/a$a;->ERROR:Lof/a$a;

    if-eq v12, v11, :cond_18

    sget-object v11, Lof/a$a;->UNAUTHENTICATED:Lof/a$a;

    if-ne v12, v11, :cond_15

    goto :goto_c

    :cond_15
    sget-object v5, Lof/a$a;->LOGGED_IN:Lof/a$a;

    if-eq v12, v5, :cond_17

    sget-object v5, Lof/a$a;->IN_PROGRESS:Lof/a$a;

    if-eq v12, v5, :cond_17

    sget-object v5, Lof/a$a;->NO_ACCOUNT:Lof/a$a;

    if-ne v12, v5, :cond_16

    goto :goto_b

    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_17
    :goto_b
    move-object v11, v13

    goto :goto_d

    :cond_18
    :goto_c
    sget-object v11, Lof/a$b;->a:Lof/a$b;

    invoke-virtual {v11}, Lof/a$b;->a()I

    move-result v11

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-virtual {v5, v1, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$a;->f()J

    move-result-wide v5

    invoke-static {v11, v5, v6}, Ls/h;->a(FJ)Ls/g;

    move-result-object v5

    move-object v11, v5

    :goto_d
    invoke-interface {v1}, LT/l;->J()V

    const/16 v5, 0x60

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v12

    const/16 v21, 0x6000

    const/16 v22, 0x0

    move-object v5, v7

    move-object v6, v8

    move-object v7, v10

    move v8, v9

    move v9, v12

    move-object v10, v11

    const/4 v12, 0x0

    move-object v11, v1

    move v4, v12

    const/16 v17, 0x2

    move/from16 v12, v21

    move-object/from16 p0, v15

    move-object v15, v13

    move/from16 v13, v22

    invoke-static/range {v5 .. v13}, Lof/f;->h(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LRe/a;->o0()LLi/N;

    move-result-object v5

    invoke-static {v5, v15, v1, v4, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    new-instance v5, LRe/e$a;

    invoke-direct {v5, v3, v0, v2}, LRe/e$a;-><init>(Lof/a$c;LIi/N;LRe/a;)V

    const v7, 0x50167dec

    const/16 v13, 0x36

    invoke-static {v7, v14, v5, v1, v13}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const/16 v19, 0x1e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v20, 0x180006

    move-object/from16 v5, p0

    move-object v12, v1

    move/from16 v13, v20

    move v3, v14

    move/from16 v14, v19

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p2 .. p2}, Lof/a$c;->n0()LLi/N;

    move-result-object v5

    invoke-static {v5, v15, v1, v4, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lof/a$a;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v16, v6

    if-eq v6, v3, :cond_1b

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1b

    const/4 v7, 0x3

    if-eq v6, v7, :cond_19

    const/4 v4, 0x4

    if-eq v6, v4, :cond_19

    const/4 v4, 0x5

    if-ne v6, v4, :cond_1a

    :cond_19
    move v6, v3

    goto :goto_e

    :cond_1a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1b
    move v6, v4

    :goto_e
    new-instance v4, LRe/e$b;

    invoke-direct {v4, v5, v0, v2}, LRe/e$b;-><init>(Lof/a$a;LIi/N;LRe/a;)V

    const v0, -0x66a10d2b

    const/16 v5, 0x36

    invoke-static {v0, v3, v4, v1, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const/16 v14, 0x1e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, p0

    move-object v12, v1

    move/from16 v13, v20

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    :goto_f
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_1d

    new-instance v7, LRe/b;

    move-object v0, v7

    move-object/from16 v1, v18

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LRe/b;-><init>(Landroidx/compose/ui/e;LRe/a;Lof/a$c;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_1d
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;LRe/a;Lof/a$c;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LRe/e;->c(Landroidx/compose/ui/e;LRe/a;Lof/a$c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;I)V
    .locals 38

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p4

    const/16 v11, 0x30

    const v0, -0x387d1662

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_1

    invoke-interface {v13, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move v1, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_3

    invoke-interface {v13, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v10, 0x180

    if-nez v2, :cond_5

    invoke-interface {v13, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    move v12, v1

    and-int/lit16 v1, v12, 0x93

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {v13}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v13}, LT/l;->C()V

    move-object v3, v13

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.UserAccountDropdown (AppSettingsAccountLayout.kt:152)"

    invoke-static {v0, v12, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v4, p2

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->f()Lz/c$e;

    move-result-object v2

    invoke-static {v2, v1, v13, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v13, v2}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v13, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v13, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_a
    invoke-interface {v13}, LT/l;->I()V

    :goto_5
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_b

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    shr-int/lit8 v0, v12, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v8, v13, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v12

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v13, v1}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->b()LL0/U;

    move-result-object v33

    invoke-virtual {v0, v13, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v14

    const/16 v36, 0x0

    const v37, 0x1fffa

    const/4 v2, 0x0

    move-object v3, v13

    move-object v13, v2

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    move-object/from16 v34, v3

    invoke-static/range {v12 .. v37}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v2, LN9/b;->a:LN9/b;

    invoke-virtual {v2}, LN9/b;->f()Ls9/b;

    move-result-object v2

    invoke-virtual {v0, v3, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$b;->j()J

    move-result-wide v4

    const-string v6, "neutral8"

    invoke-static {v4, v5, v6}, Lta/c;->g(JLjava/lang/String;)Ls9/b$b;

    move-result-object v4

    invoke-virtual {v2, v4}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v12

    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v14

    const/16 v18, 0xe

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v4, 0x14

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v0, v3, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->b()J

    move-result-wide v0

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v4

    invoke-static {v2, v0, v1, v4}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v13

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v12 .. v18}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_6
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, LRe/c;

    invoke-direct {v1, v7, v8, v9, v10}, LRe/c;-><init>(Landroidx/compose/ui/e;Ls9/d;Lmh/a;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;Ls9/d;Lmh/a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LRe/e;->e(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LRe/e;->e(Landroidx/compose/ui/e;Ls9/d;Lmh/a;LT/l;I)V

    return-void
.end method
