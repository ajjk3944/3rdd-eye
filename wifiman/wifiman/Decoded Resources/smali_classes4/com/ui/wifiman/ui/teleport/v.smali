.class public abstract Lcom/ui/wifiman/ui/teleport/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/teleport/v;->f(Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/teleport/v;->g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LL0/d;Lcom/ui/wifiman/ui/teleport/d;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/v;->e(LL0/d;Lcom/ui/wifiman/ui/teleport/d;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;LT/l;I)V
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

    const v4, 0x64d88b80

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

    const-string v9, "com.ui.wifiman.ui.teleport.TeleportHomeUnavailableUi (TeleportHomeUnavailableUi.kt:35)"

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

    invoke-static/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/v;->i(Lcom/ui/wifiman/ui/teleport/b$a;)Ls9/d;

    move-result-object v4

    invoke-static {v4, v15, v6}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v9, v10, v12, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v10, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v10, v15, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v13

    invoke-virtual {v13}, Lra/a;->a()Lra/b;

    move-result-object v13

    invoke-virtual {v13}, Lra/b;->a()Lra/b$a$a;

    move-result-object v13

    int-to-float v14, v7

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v14

    invoke-virtual {v13, v14}, Lra/b$a;->a(F)F

    move-result v13

    invoke-virtual {v10, v15, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v10

    invoke-virtual {v10}, Lra/a;->a()Lra/b;

    move-result-object v10

    invoke-virtual {v10}, Lra/b;->b()Lra/b$a$b;

    move-result-object v10

    invoke-virtual {v10}, Lra/b$a$b;->d()F

    move-result v10

    invoke-static {v9, v13, v10}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v10, LPe/a;->a:LPe/a;

    invoke-virtual {v10}, LPe/a;->U()Ls9/b;

    move-result-object v10

    invoke-static/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/v;->j(Lcom/ui/wifiman/ui/teleport/b$a;)Ls9/d;

    move-result-object v11

    invoke-static/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/v;->i(Lcom/ui/wifiman/ui/teleport/b$a;)Ls9/d;

    move-result-object v13

    const v14, -0x3f059a42

    invoke-interface {v15, v14}, LT/l;->U(I)V

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    and-int/lit16 v6, v5, 0x380

    if-ne v6, v8, :cond_d

    move/from16 v16, v12

    goto :goto_6

    :cond_d
    const/16 v16, 0x0

    :goto_6
    or-int v14, v14, v16

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v14, :cond_e

    sget-object v14, LT/l;->a:LT/l$a;

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v12, v14, :cond_f

    :cond_e
    new-instance v12, Lcom/ui/wifiman/ui/teleport/r;

    invoke-direct {v12, v4, v2}, Lcom/ui/wifiman/ui/teleport/r;-><init>(LL0/d;Lcom/ui/wifiman/ui/teleport/d;)V

    invoke-interface {v15, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v4, v12

    check-cast v4, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    invoke-static/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/v;->h(Lcom/ui/wifiman/ui/teleport/b$a;)Ls9/d;

    move-result-object v12

    const v14, -0x3f0545f6

    invoke-interface {v15, v14}, LT/l;->U(I)V

    and-int/lit8 v5, v5, 0x70

    if-ne v5, v7, :cond_10

    const/4 v5, 0x1

    goto :goto_7

    :cond_10
    const/4 v5, 0x0

    :goto_7
    if-ne v6, v8, :cond_11

    const/4 v6, 0x1

    goto :goto_8

    :cond_11
    const/4 v6, 0x0

    :goto_8
    or-int/2addr v5, v6

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_12

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_13

    :cond_12
    new-instance v6, Lcom/ui/wifiman/ui/teleport/s;

    invoke-direct {v6, v1, v2}, Lcom/ui/wifiman/ui/teleport/s;-><init>(Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    move-object v14, v6

    check-cast v14, Lmh/a;

    invoke-interface {v15}, LT/l;->J()V

    const v16, 0xc00030

    const/16 v17, 0x100

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v5, v9

    move-object v6, v10

    move-object v7, v11

    move-object v8, v13

    move-object v9, v4

    move-object v10, v12

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

    if-eqz v5, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    :goto_9
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_15

    new-instance v5, Lcom/ui/wifiman/ui/teleport/t;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/ui/wifiman/ui/teleport/t;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;I)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_15
    return-void
.end method

.method private static final e(LL0/d;Lcom/ui/wifiman/ui/teleport/d;I)LYg/J;
    .locals 1

    const-string v0, "noHosts"

    invoke-virtual {p0, v0, p2, p2}, LL0/d;->j(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/d$c;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/d;->v0()V

    goto :goto_0

    :cond_0
    const-string v0, "noSSO"

    invoke-virtual {p0, v0, p2, p2}, LL0/d;->j(Ljava/lang/String;II)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/d$c;

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/d;->v0()V

    :cond_1
    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;)LYg/J;
    .locals 1

    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$a;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$b;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/d;->u0()V

    goto :goto_0

    :cond_1
    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/b$a$d;

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/d;->q0()V

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/ui/wifiman/ui/teleport/v;->d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Lcom/ui/wifiman/ui/teleport/b$a;)Ls9/d;
    .locals 1

    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$a;

    if-nez v0, :cond_3

    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$b;

    if-eqz v0, :cond_1

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->i4:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_1
    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/b$a$d;

    if-eqz p0, :cond_2

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->I3:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method private static final i(Lcom/ui/wifiman/ui/teleport/b$a;)Ls9/d;
    .locals 2

    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$c;

    if-eqz v0, :cond_0

    new-instance p0, Ls9/d$a;

    const-string v0, "no_hosts"

    sget-object v1, Lcom/ui/wifiman/ui/teleport/v$a;->a:Lcom/ui/wifiman/ui/teleport/v$a;

    invoke-direct {p0, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$b;

    if-eqz v0, :cond_1

    new-instance p0, Ls9/d$a;

    const-string v0, "no_hosts_no_sso"

    sget-object v1, Lcom/ui/wifiman/ui/teleport/v$b;->a:Lcom/ui/wifiman/ui/teleport/v$b;

    invoke-direct {p0, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$d;

    if-eqz v0, :cond_2

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->J3:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/b$a$a;

    if-eqz p0, :cond_3

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->f4:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final j(Lcom/ui/wifiman/ui/teleport/b$a;)Ls9/d;
    .locals 1

    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$c;

    if-eqz v0, :cond_0

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->l4:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$b;

    if-eqz v0, :cond_1

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->j4:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/ui/wifiman/ui/teleport/b$a$d;

    if-eqz v0, :cond_2

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->K3:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/b$a$a;

    if-eqz p0, :cond_3

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->g4:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
