.class public abstract Lof/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lof/f$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/graphics/c;)LYg/J;
    .locals 0

    invoke-static {p0}, Lof/f;->i(Landroidx/compose/ui/graphics/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lof/a$c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lof/f;->g(Landroidx/compose/ui/e;Lof/a$c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lof/a$c;)LYg/J;
    .locals 0

    invoke-static {p0}, Lof/f;->f(Lof/a$c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, Lof/f;->j(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;Lof/a$c;LT/l;II)V
    .locals 22

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "vm"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x617b8c4a

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v4, v2, 0x1

    const/4 v5, 0x4

    const/4 v6, 0x2

    if-eqz v4, :cond_0

    or-int/lit8 v7, v1, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v1, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v13, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v5

    goto :goto_0

    :cond_1
    move v8, v6

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v1

    :goto_1
    and-int/lit8 v9, v2, 0x2

    const/16 v10, 0x20

    if-eqz v9, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v1, 0x30

    if-nez v9, :cond_5

    invoke-interface {v13, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    move v9, v10

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_5
    :goto_3
    and-int/lit8 v9, v8, 0x13

    const/16 v11, 0x12

    if-ne v9, v11, :cond_7

    invoke-interface {v13}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v13}, LT/l;->C()V

    goto/16 :goto_c

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v21, v4

    goto :goto_5

    :cond_8
    move-object/from16 v21, v7

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v7, "com.ui.wifiman.ui.sso.ViewUserAvatar (SSOAccount.kt:67)"

    invoke-static {v3, v8, v4, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    const v3, -0x5461068

    invoke-interface {v13, v3}, LT/l;->U(I)V

    and-int/lit8 v3, v8, 0x70

    const/4 v4, 0x0

    const/4 v7, 0x1

    if-ne v3, v10, :cond_a

    move v3, v7

    goto :goto_6

    :cond_a
    move v3, v4

    :goto_6
    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_b

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v8, v3, :cond_c

    :cond_b
    new-instance v8, Lof/d;

    invoke-direct {v8, v0}, Lof/d;-><init>(Lof/a$c;)V

    invoke-interface {v13, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v18, v8

    check-cast v18, Lmh/a;

    invoke-interface {v13}, LT/l;->J()V

    const/16 v19, 0x7

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v14, v21

    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lof/a$c;->o0()LLi/N;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v9, v13, v4, v7}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v8

    invoke-interface {v8}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ls9/c;

    sget-object v10, Lof/a$b;->a:Lof/a$b;

    invoke-virtual {v10}, Lof/a$b;->c()Ls9/a$b;

    move-result-object v11

    invoke-virtual {v10}, Lof/a$b;->b()I

    move-result v12

    int-to-float v12, v12

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lof/a$c;->n0()LLi/N;

    move-result-object v14

    invoke-static {v14, v9, v13, v4, v7}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v14

    invoke-interface {v14}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lof/a$a;

    sget-object v15, Lof/f$a;->a:[I

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v14, v15, v14

    const/4 v4, 0x5

    const/4 v9, 0x3

    if-eq v14, v7, :cond_f

    if-eq v14, v6, :cond_f

    if-eq v14, v9, :cond_f

    if-eq v14, v5, :cond_e

    if-ne v14, v4, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    :goto_7
    const/4 v14, 0x0

    goto :goto_8

    :cond_f
    move v14, v7

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lof/a$c;->n0()LLi/N;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v9, 0x0

    invoke-static {v4, v9, v13, v5, v7}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lof/a$a;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v15, v4

    if-eq v4, v7, :cond_13

    if-eq v4, v6, :cond_12

    const/4 v5, 0x3

    if-eq v4, v5, :cond_13

    const/4 v5, 0x4

    if-eq v4, v5, :cond_11

    const/4 v5, 0x5

    if-ne v4, v5, :cond_10

    goto :goto_9

    :cond_10
    const v0, -0x545c733

    invoke-interface {v13, v0}, LT/l;->U(I)V

    invoke-interface {v13}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_11
    :goto_9
    const v4, -0x5459dbf

    invoke-interface {v13, v4}, LT/l;->U(I)V

    invoke-virtual {v10}, Lof/a$b;->a()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v13, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$a;->f()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Ls/h;->a(FJ)Ls/g;

    move-result-object v4

    invoke-interface {v13}, LT/l;->J()V

    :goto_a
    move-object v9, v4

    goto :goto_b

    :cond_12
    const v4, -0x545bcde

    invoke-interface {v13, v4}, LT/l;->U(I)V

    invoke-virtual {v10}, Lof/a$b;->a()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v13, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$a;->f()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Ls/h;->a(FJ)Ls/g;

    move-result-object v4

    invoke-interface {v13}, LT/l;->J()V

    goto :goto_a

    :cond_13
    const v4, 0x5c959931

    invoke-interface {v13, v4}, LT/l;->U(I)V

    invoke-interface {v13}, LT/l;->J()V

    :goto_b
    const/16 v15, 0x6000

    const/16 v16, 0x0

    move-object v4, v3

    move-object v5, v8

    move-object v6, v11

    move v7, v14

    move v8, v12

    move-object v10, v13

    move v11, v15

    move/from16 v12, v16

    invoke-static/range {v4 .. v12}, Lof/f;->h(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    move-object/from16 v7, v21

    :goto_c
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_15

    new-instance v4, Lof/e;

    invoke-direct {v4, v7, v0, v1, v2}, Lof/e;-><init>(Landroidx/compose/ui/e;Lof/a$c;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_15
    return-void
.end method

.method private static final f(Lof/a$c;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lof/a$c;->r0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Lof/a$c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lof/f;->e(Landroidx/compose/ui/e;Lof/a$c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;LT/l;II)V
    .locals 33

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    move/from16 v14, p4

    move/from16 v15, p7

    const/16 v0, 0x10

    const/16 v1, 0x20

    const/4 v2, 0x2

    const/4 v3, 0x4

    const-string v4, "image"

    invoke-static {v11, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "placeholder"

    invoke-static {v12, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x2bfbc0a

    move-object/from16 v5, p6

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v10

    const/4 v9, 0x1

    and-int/lit8 v5, p8, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v6, v15, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v15, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v10, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    move v7, v2

    :goto_0
    or-int/2addr v7, v15

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v15

    :goto_1
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v15, 0x30

    if-nez v2, :cond_5

    invoke-interface {v10, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v1

    goto :goto_2

    :cond_4
    move v2, v0

    :goto_2
    or-int/2addr v7, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v7, v7, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v15, 0x180

    if-nez v2, :cond_8

    invoke-interface {v10, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v7, v2

    :cond_8
    :goto_5
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_9

    or-int/lit16 v7, v7, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v2, v15, 0xc00

    if-nez v2, :cond_b

    invoke-interface {v10, v13}, LT/l;->c(Z)Z

    move-result v2

    if-eqz v2, :cond_a

    const/16 v2, 0x800

    goto :goto_6

    :cond_a
    const/16 v2, 0x400

    :goto_6
    or-int/2addr v7, v2

    :cond_b
    :goto_7
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_c

    or-int/lit16 v7, v7, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v0, v15, 0x6000

    if-nez v0, :cond_e

    invoke-interface {v10, v14}, LT/l;->g(F)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v0, 0x4000

    goto :goto_8

    :cond_d
    const/16 v0, 0x2000

    :goto_8
    or-int/2addr v7, v0

    :cond_e
    :goto_9
    and-int/lit8 v0, p8, 0x20

    const/high16 v1, 0x30000

    if-eqz v0, :cond_10

    or-int/2addr v7, v1

    :cond_f
    move-object/from16 v1, p5

    goto :goto_b

    :cond_10
    and-int/2addr v1, v15

    if-nez v1, :cond_f

    move-object/from16 v1, p5

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    const/high16 v2, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v2, 0x10000

    :goto_a
    or-int/2addr v7, v2

    :goto_b
    const v2, 0x12493

    and-int/2addr v2, v7

    const v3, 0x12492

    if-ne v2, v3, :cond_13

    invoke-interface {v10}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v10}, LT/l;->C()V

    move-object v11, v10

    move-object/from16 v32, v6

    move-object v6, v1

    move-object/from16 v1, v32

    goto/16 :goto_11

    :cond_13
    :goto_c
    if-eqz v5, :cond_14

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v8, v2

    goto :goto_d

    :cond_14
    move-object v8, v6

    :goto_d
    if-eqz v0, :cond_15

    const/4 v5, 0x0

    goto :goto_e

    :cond_15
    move-object v5, v1

    :goto_e
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.sso.WifimanUiUserAvatar (SSOAccount.kt:106)"

    invoke-static {v4, v7, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_16
    const v0, -0x455d34f7

    invoke-interface {v10, v0}, LT/l;->U(I)V

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_17

    new-instance v0, Lof/b;

    invoke-direct {v0}, Lof/b;-><init>()V

    invoke-interface {v10, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v0, Lmh/l;

    invoke-interface {v10}, LT/l;->J()V

    invoke-static {v8, v0}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/r;->o(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->o()Lf0/c;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    invoke-static {v10, v4}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v10, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_18

    invoke-static {}, LT/j;->c()V

    :cond_18
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_19

    invoke-interface {v10, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_f

    :cond_19
    invoke-interface {v10}, LT/l;->I()V

    :goto_f
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v4, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v4, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_1a

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v4, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-static {v6, v4, v9, v3}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    if-eqz v5, :cond_1c

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v1

    invoke-static {v6, v5, v1}, Ls/e;->e(Landroidx/compose/ui/e;Ls/g;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    goto :goto_10

    :cond_1c
    move-object v1, v6

    :goto_10
    invoke-interface {v0, v1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    shr-int/lit8 v0, v7, 0x3

    and-int/lit8 v0, v0, 0xe

    and-int/lit16 v2, v7, 0x380

    or-int v16, v0, v2

    const/16 v17, 0x3c

    const/4 v7, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v22, v3

    move-object v3, v7

    const/4 v7, 0x0

    move-object/from16 v4, v18

    move-object/from16 v18, v5

    move/from16 v5, v19

    move-object/from16 v23, v6

    move-wide/from16 v6, v20

    move-object/from16 v19, v8

    move-object v8, v10

    move/from16 v9, v16

    move-object v11, v10

    move/from16 v10, v17

    invoke-static/range {v0 .. v10}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    const v0, 0x5e76f28a

    invoke-interface {v11, v0}, LT/l;->U(I)V

    if-nez v13, :cond_1d

    move-object/from16 v2, v23

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v23, Lm0/l0;->b:Lm0/l0$a;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v11, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->d()J

    move-result-wide v24

    const/16 v30, 0xe

    const/16 v31, 0x0

    const/high16 v26, 0x3f000000    # 0.5f

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v24 .. v31}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    invoke-static {v1, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v2, v11, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->d()J

    move-result-wide v24

    const v26, 0x3f4ccccd    # 0.8f

    invoke-static/range {v24 .. v31}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    invoke-static {v5, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [LYg/s;

    move-result-object v24

    const/16 v28, 0xe

    const/16 v29, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v23 .. v29}, Lm0/l0$a;->j(Lm0/l0$a;[LYg/s;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/e;Lm0/l0;Lm0/i1;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v11, v1}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    :cond_1d
    invoke-interface {v11}, LT/l;->J()V

    invoke-interface {v11}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    move-object/from16 v6, v18

    move-object/from16 v1, v19

    :goto_11
    invoke-interface {v11}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1f

    new-instance v10, Lof/c;

    move-object v0, v10

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lof/c;-><init>(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void
.end method

.method private static final i(Landroidx/compose/ui/graphics/c;)LYg/J;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/graphics/c;->I1(Lm0/i1;)V

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Landroidx/compose/ui/graphics/c;->G(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, Lof/f;->h(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;ZFLs/g;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final k(Lof/a;Ls9/c;Lof/a$a;Ljava/lang/String;Ljava/lang/String;)Lof/a$c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "avatar"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "accountState"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lof/f$b;

    invoke-direct {p0, p1, p2, p3, p4}, Lof/f$b;-><init>(Ls9/c;Lof/a$a;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic l(Lof/a;Ls9/c;Lof/a$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lof/a$c;
    .locals 2

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    new-instance p1, Ls9/c$a;

    sget p6, Lm8/a;->t0:I

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p1, p6, v0, v1, v0}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    sget-object p2, Lof/a$a;->LOGGED_IN:Lof/a$a;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const-string p3, "Robert Pera"

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const-string p4, "robert@ui.com"

    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, Lof/f;->k(Lof/a;Ls9/c;Lof/a$a;Ljava/lang/String;Ljava/lang/String;)Lof/a$c;

    move-result-object p0

    return-object p0
.end method
