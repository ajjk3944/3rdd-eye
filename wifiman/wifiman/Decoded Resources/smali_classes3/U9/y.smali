.class public abstract LU9/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final A(LIi/N;LN/n0;)LYg/J;
    .locals 6

    new-instance v3, LU9/y$j;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LU9/y$j;-><init>(LN/n0;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final B(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, LU9/y;->y(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final C(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;LT/l;I)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move/from16 v12, p6

    const-string v0, "<this>"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sessionVM"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "mfaController"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onCreateAccountClicked"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onStartTrustedDeviceFlow"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x91abccf

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v1, v12, 0x6

    if-nez v1, :cond_1

    invoke-interface {v13, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v12

    goto :goto_1

    :cond_1
    move v1, v12

    :goto_1
    and-int/lit8 v2, v12, 0x30

    if-nez v2, :cond_3

    invoke-interface {v13, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v12, 0x180

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
    and-int/lit16 v2, v12, 0xc00

    const/16 v3, 0x800

    if-nez v2, :cond_7

    invoke-interface {v13, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move v2, v3

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v12, 0x6000

    if-nez v2, :cond_9

    invoke-interface {v13, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    move v14, v1

    and-int/lit16 v1, v14, 0x2493

    const/16 v2, 0x2492

    if-ne v1, v2, :cond_b

    invoke-interface {v13}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v13}, LT/l;->C()V

    goto/16 :goto_a

    :cond_b
    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.mfa.UiMFA (UiMFA.kt:63)"

    invoke-static {v0, v14, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    invoke-virtual/range {p1 .. p1}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->d()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$d;->a()LU9/b;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {v0}, LU9/b;->b()LEb/w;

    move-result-object v0

    if-eqz v0, :cond_18

    instance-of v1, v0, LEb/w$a;

    if-eqz v1, :cond_d

    sget-object v0, LU9/f$e;->a:LU9/f$e;

    :goto_7
    move-object v2, v0

    goto :goto_8

    :cond_d
    instance-of v1, v0, LEb/w$c;

    if-eqz v1, :cond_e

    sget-object v0, LU9/f$b;->a:LU9/f$b;

    goto :goto_7

    :cond_e
    instance-of v1, v0, LEb/w$d;

    if-eqz v1, :cond_f

    sget-object v0, LU9/f$d;->a:LU9/f$d;

    goto :goto_7

    :cond_f
    instance-of v1, v0, LEb/w$e;

    if-eqz v1, :cond_10

    sget-object v0, LU9/f$f;->a:LU9/f$f;

    goto :goto_7

    :cond_10
    instance-of v1, v0, LEb/w$g;

    if-eqz v1, :cond_16

    sget-object v0, LU9/f$a;->a:LU9/f$a;

    goto :goto_7

    :goto_8
    sget-object v6, LU9/f$c;->a:LU9/f$c;

    const v0, 0x43a625e0

    invoke-interface {v13, v0}, LT/l;->U(I)V

    invoke-interface {v13, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v13, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {v13, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    and-int/lit16 v1, v14, 0x1c00

    const/4 v15, 0x1

    if-ne v1, v3, :cond_11

    move v1, v15

    goto :goto_9

    :cond_11
    const/4 v1, 0x0

    :goto_9
    or-int/2addr v0, v1

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_12

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_13

    :cond_12
    new-instance v1, LU9/u;

    invoke-direct {v1, v8, v9, v7, v10}, LU9/u;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Landroidx/fragment/app/Fragment;Lmh/a;)V

    invoke-interface {v13, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    move-object v5, v1

    check-cast v5, Lmh/p;

    invoke-interface {v13}, LT/l;->J()V

    new-instance v4, LU9/y$l;

    move-object v0, v4

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object v8, v4

    move-object/from16 v4, p2

    move-object/from16 v16, v5

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v6}, LU9/y$l;-><init>(Landroidx/fragment/app/Fragment;LU9/f;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/l;LU9/f;)V

    const/16 v0, 0x36

    const v1, 0x54cac2e1

    invoke-static {v1, v15, v8, v13, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    and-int/lit8 v1, v14, 0xe

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v2, v16

    invoke-static {v7, v2, v0, v13, v1}, LR9/i;->c(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    :goto_a
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_15

    new-instance v13, LU9/v;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LU9/v;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;I)V

    invoke-interface {v8, v13}, LT/X0;->a(Lmh/p;)V

    :cond_15
    return-void

    :cond_16
    instance-of v0, v0, LEb/w$h;

    if-eqz v0, :cond_17

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Unknown method unsupported as Primary Auth method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "MFA screen requires set MFA methods as params"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final D(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Landroidx/fragment/app/Fragment;Lmh/a;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 9

    const-string/jumbo v0, "owner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arguments"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LU9/g;

    invoke-virtual {p0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v2

    new-instance v4, Lka/i;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->p1()Landroid/content/Context;

    move-result-object p0

    const-string/jumbo v1, "requireContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p0}, Lka/i;-><init>(Landroid/content/Context;)V

    new-instance v5, Lha/c;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->p1()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, p0}, Lha/c;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    move-object v3, p1

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, LU9/g;-><init>(Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;Lmh/a;Lq2/f;Landroid/os/Bundle;)V

    return-object v0
.end method

.method private static final E(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;ILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, LT/L0;->a(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, LU9/y;->C(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic a(LN/o0;)Z
    .locals 0

    invoke-static {p0}, LU9/y;->x(LN/o0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b()LQ9/j;
    .locals 1

    invoke-static {}, LU9/y;->o()LQ9/j;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LU9/y;->E(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/app/Activity;LN/n0;Ljava/lang/String;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LU9/y;->q(Landroid/app/Activity;LN/n0;Ljava/lang/String;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/app/Activity;Ljava/lang/String;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LU9/y;->t(Landroid/app/Activity;Ljava/lang/String;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()LQ9/j;
    .locals 1

    invoke-static {}, LU9/y;->z()LQ9/j;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(LIi/N;LN/n0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LU9/y;->p(LIi/N;LN/n0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(LIi/N;LN/n0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LU9/y;->A(LIi/N;LN/n0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Landroidx/fragment/app/Fragment;Lmh/a;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 0

    invoke-static/range {p0 .. p5}, LU9/y;->D(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Landroidx/fragment/app/Fragment;Lmh/a;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(LIi/N;LN/n0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LU9/y;->v(LIi/N;LN/n0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()LQ9/j;
    .locals 1

    invoke-static {}, LU9/y;->s()LQ9/j;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LU9/y;->B(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LU9/y;->w(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Landroid/app/Activity;LN/n0;Ljava/lang/String;LT/l;I)V
    .locals 10

    const-string/jumbo v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bsSheetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "startDestination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1fbc1eaf

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_4

    and-int/lit8 v2, p4, 0x40

    if-nez v2, :cond_2

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_6

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_6
    and-int/lit16 v2, v1, 0x93

    const/16 v4, 0x92

    if-ne v2, v4, :cond_8

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p3}, LT/l;->C()V

    goto/16 :goto_8

    :cond_8
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v2, -0x1

    const-string/jumbo v4, "com.ui.core.ui.sso.mfa.LostAccessSheetContent (UiMFA.kt:458)"

    invoke-static {v0, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v0, v4, :cond_a

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, p3}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v4, LT/A;

    invoke-direct {v4, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p3, v4}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v4

    :cond_a
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v0

    const v4, 0x6402875f

    invoke-interface {p3, v4}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_b

    new-instance v4, LU9/r;

    invoke-direct {v4}, LU9/r;-><init>()V

    invoke-interface {p3, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const v5, 0x64028f00

    invoke-interface {p3, v5}, LT/l;->U(I)V

    invoke-interface {p3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v6, v1, 0x70

    if-eq v6, v3, :cond_d

    and-int/lit8 v3, v1, 0x40

    if-eqz v3, :cond_c

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_6

    :cond_c
    const/4 v3, 0x0

    goto :goto_7

    :cond_d
    :goto_6
    const/4 v3, 0x1

    :goto_7
    or-int/2addr v3, v5

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_e

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_f

    :cond_e
    new-instance v5, LU9/s;

    invoke-direct {v5, v0, p1}, LU9/s;-><init>(LIi/N;LN/n0;)V

    invoke-interface {p3, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v0, v5

    check-cast v0, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    sget-object v2, LU9/a;->a:LU9/a;

    invoke-virtual {v2}, LU9/a;->g()Lmh/q;

    move-result-object v6

    and-int/lit8 v2, v1, 0xe

    const v3, 0x30030

    or-int/2addr v2, v3

    and-int/lit16 v1, v1, 0x380

    or-int v8, v2, v1

    const/16 v9, 0x10

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, v4

    move-object v3, p2

    move-object v4, v0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, LQ9/h;->g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_8
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_11

    new-instance v0, LU9/t;

    invoke-direct {v0, p0, p1, p2, p4}, LU9/t;-><init>(Landroid/app/Activity;LN/n0;Ljava/lang/String;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void
.end method

.method private static final o()LQ9/j;
    .locals 1

    new-instance v0, LU9/y$a;

    invoke-direct {v0}, LU9/y$a;-><init>()V

    return-object v0
.end method

.method private static final p(LIi/N;LN/n0;)LYg/J;
    .locals 6

    new-instance v3, LU9/y$b;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LU9/y$b;-><init>(LN/n0;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final q(Landroid/app/Activity;LN/n0;Ljava/lang/String;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LU9/y;->n(Landroid/app/Activity;LN/n0;Ljava/lang/String;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final r(Landroid/app/Activity;Ljava/lang/String;LT/l;I)V
    .locals 10

    const-string/jumbo v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "startDestination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6479982f

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.mfa.MainContent (UiMFA.kt:179)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v0}, Lz/j0;->d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0}, Lz/j0;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, p2, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {p2, v4}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {p2, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {p2, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {p2}, LT/l;->I()V

    :goto_4
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v2, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v7, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v7, v0, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    new-array v0, v4, [Lf2/D;

    invoke-static {v0, p2, v4}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v5

    const v0, 0x60e3cb62

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_b

    new-instance v0, LU9/n;

    invoke-direct {v0}, LU9/n;-><init>()V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v2, v0

    check-cast v2, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    new-instance v0, LU9/y$d;

    invoke-direct {v0, p1}, LU9/y$d;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x36

    const v4, -0x3a19f064

    const/4 v6, 0x1

    invoke-static {v4, v6, v0, p2, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    and-int/lit8 v0, v1, 0xe

    const v3, 0x30030

    or-int/2addr v0, v3

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v8, v0, v1

    const/16 v9, 0x8

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v7, p2

    invoke-static/range {v1 .. v9}, LQ9/h;->g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, LU9/o;

    invoke-direct {v0, p0, p1, p3}, LU9/o;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final s()LQ9/j;
    .locals 1

    new-instance v0, LU9/y$c;

    invoke-direct {v0}, LU9/y$c;-><init>()V

    return-object v0
.end method

.method private static final t(Landroid/app/Activity;Ljava/lang/String;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LU9/y;->r(Landroid/app/Activity;Ljava/lang/String;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final u(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;LT/l;I)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string/jumbo v0, "activity"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "startDestination"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bottomSheetNavController"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bottomSheetState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "mfaController"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3df063a4

    move-object/from16 v7, p5

    invoke-interface {v7, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x6

    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_1

    invoke-interface {v15, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_3

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_8

    and-int/lit16 v8, v6, 0x1000

    if-nez v8, :cond_6

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_4

    :cond_6
    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    :goto_4
    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_5

    :cond_7
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v7, v8

    :cond_8
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_a

    invoke-interface {v15, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x4000

    goto :goto_6

    :cond_9
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v7, v8

    :cond_a
    move v13, v7

    and-int/lit16 v7, v13, 0x2493

    const/16 v8, 0x2492

    if-ne v7, v8, :cond_c

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_7

    :cond_b
    invoke-interface {v15}, LT/l;->C()V

    move-object v8, v15

    goto/16 :goto_9

    :cond_c
    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_d

    const/4 v7, -0x1

    const-string/jumbo v8, "com.ui.core.ui.sso.mfa.ModalSheet (UiMFA.kt:280)"

    invoke-static {v0, v13, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v23, LT/l;->a:LT/l$a;

    invoke-virtual/range {v23 .. v23}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v0, v7, :cond_e

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, v15}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v7, LT/A;

    invoke-direct {v7, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v7

    :cond_e
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v0

    sget-object v7, LN/o0;->Hidden:LN/o0;

    sget-object v8, LN/P0;->a:LN/P0;

    invoke-virtual {v8}, LN/P0;->a()Lr/h0;

    move-result-object v8

    const v9, -0x34fe8149    # -8486583.0f

    invoke-interface {v15, v9}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual/range {v23 .. v23}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_f

    new-instance v9, LU9/w;

    invoke-direct {v9}, LU9/w;-><init>()V

    invoke-interface {v15, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v9, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    const/16 v12, 0xd86

    const/16 v16, 0x0

    const/4 v10, 0x1

    move-object v11, v15

    move/from16 v24, v13

    move/from16 v13, v16

    invoke-static/range {v7 .. v13}, LN/m0;->j(LN/o0;Lr/i;Lmh/l;ZLT/l;II)LN/n0;

    move-result-object v13

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const v8, -0x34fe6778    # -8493192.0f

    invoke-interface {v15, v8}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v8

    invoke-interface {v15, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LY0/d;

    sget-object v9, Lz/f0;->a:Lz/f0$a;

    invoke-static {v9, v15, v14}, Lz/k0;->b(Lz/f0$a;LT/l;I)Lz/f0;

    move-result-object v9

    invoke-interface {v9, v8}, Lz/f0;->c(LY0/d;)I

    move-result v9

    int-to-float v9, v9

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f()LT/H0;

    move-result-object v10

    invoke-interface {v15, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/res/Configuration;

    iget v10, v10, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v10, v10

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    invoke-interface {v8, v10}, LY0/d;->d1(F)F

    move-result v8

    div-float/2addr v9, v8

    invoke-interface {v15}, LT/l;->J()V

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float/2addr v8, v9

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/r;->c(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v12, 0x0

    invoke-static {v7, v8, v9, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->o()Lf0/c;

    move-result-object v8

    const/4 v11, 0x0

    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v8

    invoke-static {v15, v11}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v15, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_10

    invoke-static {}, LT/j;->c()V

    :cond_10
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_11

    invoke-interface {v15, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_11
    invoke-interface {v15}, LT/l;->I()V

    :goto_8
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v12, v8, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v8

    invoke-static {v12, v11, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v8

    invoke-interface {v12}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_12

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_13

    :cond_12
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v12, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10, v8}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_13
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v8

    invoke-static {v12, v7, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v7, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v7, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v7, v15, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->e()Lma/a$e;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$e;->a()J

    move-result-wide v19

    new-instance v7, LU9/y$e;

    invoke-direct {v7, v1, v13, v2}, LU9/y$e;-><init>(Landroid/app/Activity;LN/n0;Ljava/lang/String;)V

    const v8, -0x8c4d858

    const/16 v10, 0x36

    invoke-static {v8, v9, v7, v15, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    new-instance v8, LU9/y$f;

    invoke-direct {v8, v1, v2, v3, v4}, LU9/y$f;-><init>(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;)V

    const v11, 0x3be93e0f

    invoke-static {v11, v9, v8, v15, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v21

    sget v8, LN/n0;->e:I

    const/4 v14, 0x6

    shl-int/2addr v8, v14

    const v9, 0x30000006

    or-int v22, v8, v9

    const/16 v25, 0x1ba

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    move-object v9, v13

    move-object/from16 v31, v13

    move/from16 v30, v14

    move-wide/from16 v13, v19

    move-object/from16 p5, v15

    move-wide/from16 v15, v26

    move-wide/from16 v17, v28

    move-object/from16 v19, v21

    move-object/from16 v20, p5

    move/from16 v21, v22

    move/from16 v22, v25

    invoke-static/range {v7 .. v22}, LN/m0;->b(Lmh/q;Landroidx/compose/ui/e;LN/n0;ZLm0/i1;FJJJLmh/p;LT/l;II)V

    invoke-interface/range {p5 .. p5}, LT/l;->R()V

    const v7, -0x34fdf10f    # -8523505.0f

    move-object/from16 v8, p5

    invoke-interface {v8, v7}, LT/l;->U(I)V

    invoke-interface {v8, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    move-object/from16 v9, v31

    invoke-interface {v8, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v7, v10

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_14

    invoke-virtual/range {v23 .. v23}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v10, v7, :cond_15

    :cond_14
    new-instance v10, LU9/y$g;

    const/4 v7, 0x0

    invoke-direct {v10, v5, v9, v7}, LU9/y$g;-><init>(LU9/h;LN/n0;Ldh/e;)V

    invoke-interface {v8, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    check-cast v10, Lmh/p;

    invoke-interface {v8}, LT/l;->J()V

    shr-int/lit8 v7, v24, 0x6

    and-int/lit8 v7, v7, 0xe

    invoke-static {v3, v10, v8, v7}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual {v9}, LN/n0;->k()Z

    move-result v7

    const v10, -0x34fda718    # -8542440.0f

    invoke-interface {v8, v10}, LT/l;->U(I)V

    invoke-interface {v8, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v8, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_16

    invoke-virtual/range {v23 .. v23}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_17

    :cond_16
    new-instance v11, LU9/x;

    invoke-direct {v11, v0, v9}, LU9/x;-><init>(LIi/N;LN/n0;)V

    invoke-interface {v8, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v11, Lmh/a;

    invoke-interface {v8}, LT/l;->J()V

    const/4 v0, 0x0

    invoke-static {v7, v11, v8, v0, v0}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    :goto_9
    invoke-interface {v8}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v8, LU9/m;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LU9/m;-><init>(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;I)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_19
    return-void
.end method

.method private static final v(LIi/N;LN/n0;)LYg/J;
    .locals 6

    new-instance v3, LU9/y$h;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LU9/y$h;-><init>(LN/n0;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final w(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;ILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, LT/L0;->a(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, LU9/y;->u(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final x(LN/o0;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final y(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LT/l;I)V
    .locals 10

    const-string/jumbo v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "startDestination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bsSheetController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bsSheetState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2b69bc6f

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    if-nez v2, :cond_5

    invoke-interface {p4, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p5, 0xc00

    const/16 v3, 0x800

    if-nez v2, :cond_8

    and-int/lit16 v2, p5, 0x1000

    if-nez v2, :cond_6

    invoke-interface {p4, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_4

    :cond_6
    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    :goto_4
    if-eqz v2, :cond_7

    move v2, v3

    goto :goto_5

    :cond_7
    const/16 v2, 0x400

    :goto_5
    or-int/2addr v1, v2

    :cond_8
    and-int/lit16 v2, v1, 0x493

    const/16 v4, 0x492

    if-ne v2, v4, :cond_a

    invoke-interface {p4}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {p4}, LT/l;->C()V

    goto/16 :goto_9

    :cond_a
    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v2, -0x1

    const-string/jumbo v4, "com.ui.core.ui.sso.mfa.ModalSheetContent (UiMFA.kt:346)"

    invoke-static {v0, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v0, v4, :cond_c

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, p4}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v4, LT/A;

    invoke-direct {v4, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p4, v4}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v4

    :cond_c
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v0

    const v4, -0x7d6f7f56

    invoke-interface {p4, v4}, LT/l;->U(I)V

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_d

    new-instance v4, LU9/l;

    invoke-direct {v4}, LU9/l;-><init>()V

    invoke-interface {p4, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lmh/a;

    invoke-interface {p4}, LT/l;->J()V

    const v5, -0x7d6f8ef5

    invoke-interface {p4, v5}, LT/l;->U(I)V

    invoke-interface {p4, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit16 v6, v1, 0x1c00

    const/4 v7, 0x1

    if-eq v6, v3, :cond_f

    and-int/lit16 v3, v1, 0x1000

    if-eqz v3, :cond_e

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_7

    :cond_e
    const/4 v3, 0x0

    goto :goto_8

    :cond_f
    :goto_7
    move v3, v7

    :goto_8
    or-int/2addr v3, v5

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_10

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_11

    :cond_10
    new-instance v5, LU9/p;

    invoke-direct {v5, v0, p3}, LU9/p;-><init>(LIi/N;LN/n0;)V

    invoke-interface {p4, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    move-object v0, v5

    check-cast v0, Lmh/a;

    invoke-interface {p4}, LT/l;->J()V

    new-instance v2, LU9/y$k;

    invoke-direct {v2, p1}, LU9/y$k;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x36

    const v5, 0x4dd044a6    # 4.3677E8f

    invoke-static {v5, v7, v2, p4, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    and-int/lit8 v2, v1, 0xe

    const v3, 0x30030

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    const v3, 0xe000

    shl-int/lit8 v1, v1, 0x6

    and-int/2addr v1, v3

    or-int v8, v2, v1

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, v4

    move-object v3, p1

    move-object v4, v0

    move-object v5, p2

    move-object v7, p4

    invoke-static/range {v1 .. v9}, LQ9/h;->g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    :goto_9
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_13

    new-instance v6, LU9/q;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LU9/q;-><init>(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;I)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final z()LQ9/j;
    .locals 1

    new-instance v0, LU9/y$i;

    invoke-direct {v0}, LU9/y$i;-><init>()V

    return-object v0
.end method
