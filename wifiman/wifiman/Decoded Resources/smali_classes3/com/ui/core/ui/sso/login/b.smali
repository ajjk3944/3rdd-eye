.class public abstract Lcom/ui/core/ui/sso/login/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/core/ui/sso/login/b;->d(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/ui/core/ui/sso/login/b;->e(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;LT/l;II)V
    .locals 19

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move/from16 v11, p8

    const-string v0, "<this>"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sessionVM"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onMfaRequired"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x12ff1c1b

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    const/high16 v1, -0x80000000

    and-int v1, p9, v1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    invoke-interface {v12, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    invoke-interface {v12, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v11, 0x180

    if-nez v2, :cond_8

    invoke-interface {v12, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_8
    :goto_5
    and-int/lit8 v2, p9, 0x4

    if-eqz v2, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move/from16 v3, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_9

    move/from16 v3, p3

    invoke-interface {v12, v3}, LT/l;->c(Z)Z

    move-result v4

    if-eqz v4, :cond_b

    const/16 v4, 0x800

    goto :goto_6

    :cond_b
    const/16 v4, 0x400

    :goto_6
    or-int/2addr v1, v4

    :goto_7
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move/from16 v5, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v5, v11, 0x6000

    if-nez v5, :cond_c

    move/from16 v5, p4

    invoke-interface {v12, v5}, LT/l;->c(Z)Z

    move-result v6

    if-eqz v6, :cond_e

    const/16 v6, 0x4000

    goto :goto_8

    :cond_e
    const/16 v6, 0x2000

    :goto_8
    or-int/2addr v1, v6

    :goto_9
    and-int/lit8 v6, p9, 0x10

    const/high16 v7, 0x30000

    if-eqz v6, :cond_10

    or-int/2addr v1, v7

    :cond_f
    move-object/from16 v7, p5

    goto :goto_b

    :cond_10
    and-int/2addr v7, v11

    if-nez v7, :cond_f

    move-object/from16 v7, p5

    invoke-interface {v12, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v1, v13

    :goto_b
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x180000

    if-eqz v13, :cond_13

    or-int/2addr v1, v14

    :cond_12
    move-object/from16 v14, p6

    :goto_c
    move v15, v1

    goto :goto_e

    :cond_13
    and-int/2addr v14, v11

    if-nez v14, :cond_12

    move-object/from16 v14, p6

    invoke-interface {v12, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_14

    const/high16 v15, 0x100000

    goto :goto_d

    :cond_14
    const/high16 v15, 0x80000

    :goto_d
    or-int/2addr v1, v15

    goto :goto_c

    :goto_e
    const v1, 0x92493

    and-int/2addr v1, v15

    const v0, 0x92492

    if-ne v1, v0, :cond_16

    invoke-interface {v12}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_f

    :cond_15
    invoke-interface {v12}, LT/l;->C()V

    move v4, v3

    move-object v6, v7

    move-object v7, v14

    goto/16 :goto_13

    :cond_16
    :goto_f
    const/4 v1, 0x1

    if-eqz v2, :cond_17

    move/from16 v16, v1

    goto :goto_10

    :cond_17
    move/from16 v16, v3

    :goto_10
    if-eqz v4, :cond_18

    move/from16 v17, v1

    goto :goto_11

    :cond_18
    move/from16 v17, v5

    :goto_11
    const/4 v0, 0x0

    if-eqz v6, :cond_19

    move-object/from16 v18, v0

    goto :goto_12

    :cond_19
    move-object/from16 v18, v7

    :goto_12
    if-eqz v13, :cond_1a

    move-object v14, v0

    :cond_1a
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v0, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.login.UiLogin (UiLogin.kt:29)"

    const v3, -0x12ff1c1b

    invoke-static {v3, v15, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    const v0, -0x5596238f

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v12, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1c

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_1d

    :cond_1c
    new-instance v2, LT9/a;

    invoke-direct {v2, v8, v9}, LT9/a;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-interface {v12, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1d
    move-object v13, v2

    check-cast v13, Lmh/p;

    invoke-interface {v12}, LT/l;->J()V

    new-instance v7, Lcom/ui/core/ui/sso/login/b$a;

    move-object v0, v7

    move v6, v1

    move-object/from16 v1, p0

    move/from16 v2, v16

    move-object/from16 v3, v18

    move-object v4, v14

    move/from16 v5, v17

    move v9, v6

    move-object/from16 v6, p1

    move-object v10, v7

    move-object/from16 v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/ui/core/ui/sso/login/b$a;-><init>(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;)V

    const/16 v0, 0x36

    const v1, 0x33a2cb13

    invoke-static {v1, v9, v10, v12, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    and-int/lit8 v1, v15, 0xe

    or-int/lit16 v1, v1, 0x180

    invoke-static {v8, v13, v0, v12, v1}, LR9/i;->c(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    move-object v7, v14

    move/from16 v4, v16

    move/from16 v5, v17

    move-object/from16 v6, v18

    :goto_13
    invoke-interface {v12}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1f

    new-instance v12, LT9/b;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LT9/b;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;II)V

    invoke-interface {v10, v12}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void
.end method

.method private static final d(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 3

    const-string/jumbo v0, "savedStateRegistryOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arguments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lka/i;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p1()Landroid/content/Context;

    move-result-object p0

    const-string/jumbo v2, "requireContext(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0}, Lka/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    new-instance p0, LT9/l;

    invoke-direct {p0, p1, v1, p2, p3}, LT9/l;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Lka/a;Lq2/f;Landroid/os/Bundle;)V

    return-object p0
.end method

.method private static final e(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;IILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p9

    move/from16 v10, p8

    invoke-static/range {v1 .. v10}, Lcom/ui/core/ui/sso/login/b;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
