.class public abstract Lda/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lda/f;->d(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, Lda/f;->e(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;LT/l;II)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p7

    const-string v0, "<this>"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sessionVM"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x259f3efe

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v10

    const/high16 v1, -0x80000000

    and-int v1, p8, v1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_2

    invoke-interface {v10, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_2
    move v1, v9

    :goto_1
    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v9, 0x30

    if-nez v2, :cond_5

    invoke-interface {v10, v8}, LT/l;->l(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    move/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v9, 0x180

    move/from16 v11, p2

    if-nez v2, :cond_8

    invoke-interface {v10, v11}, LT/l;->c(Z)Z

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
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v2, v9, 0xc00

    move/from16 v12, p3

    if-nez v2, :cond_b

    invoke-interface {v10, v12}, LT/l;->c(Z)Z

    move-result v2

    if-eqz v2, :cond_a

    const/16 v2, 0x800

    goto :goto_6

    :cond_a
    const/16 v2, 0x400

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    :goto_7
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move-object/from16 v3, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v3, v9, 0x6000

    if-nez v3, :cond_c

    move-object/from16 v3, p4

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/16 v4, 0x4000

    goto :goto_8

    :cond_e
    const/16 v4, 0x2000

    :goto_8
    or-int/2addr v1, v4

    :goto_9
    and-int/lit8 v4, p8, 0x10

    const/high16 v5, 0x30000

    if-eqz v4, :cond_10

    or-int/2addr v1, v5

    :cond_f
    move-object/from16 v5, p5

    :goto_a
    move v13, v1

    goto :goto_c

    :cond_10
    and-int/2addr v5, v9

    if-nez v5, :cond_f

    move-object/from16 v5, p5

    invoke-interface {v10, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    const/high16 v6, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v6, 0x10000

    :goto_b
    or-int/2addr v1, v6

    goto :goto_a

    :goto_c
    const v1, 0x12493

    and-int/2addr v1, v13

    const v6, 0x12492

    if-ne v1, v6, :cond_13

    invoke-interface {v10}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_d

    :cond_12
    invoke-interface {v10}, LT/l;->C()V

    move-object v6, v5

    move-object v5, v3

    goto/16 :goto_10

    :cond_13
    :goto_d
    const/4 v1, 0x0

    if-eqz v2, :cond_14

    move-object v14, v1

    goto :goto_e

    :cond_14
    move-object v14, v3

    :goto_e
    if-eqz v4, :cond_15

    move-object v15, v1

    goto :goto_f

    :cond_15
    move-object v15, v5

    :goto_f
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_16

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.register.UiRegister (UiRegister.kt:33)"

    invoke-static {v0, v13, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_16
    const v0, 0x3ddea7d

    invoke-interface {v10, v0}, LT/l;->U(I)V

    invoke-interface {v10, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v10, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_17

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_18

    :cond_17
    new-instance v1, Lda/c;

    invoke-direct {v1, v7, v8}, Lda/c;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-interface {v10, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_18
    move-object v6, v1

    check-cast v6, Lmh/p;

    invoke-interface {v10}, LT/l;->J()V

    new-instance v5, Lda/f$a;

    move-object v0, v5

    move-object/from16 v1, p0

    move/from16 v2, p2

    move-object v3, v14

    move-object v4, v15

    move-object v8, v5

    move/from16 v5, p3

    move-object v9, v6

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Lda/f$a;-><init>(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;)V

    const/16 v0, 0x36

    const v1, -0xa91c3ec

    const/4 v2, 0x1

    invoke-static {v1, v2, v8, v10, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    and-int/lit8 v1, v13, 0xe

    or-int/lit16 v1, v1, 0x180

    invoke-static {v7, v9, v0, v10, v1}, LR9/i;->c(Landroidx/fragment/app/Fragment;Lmh/p;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    move-object v5, v14

    move-object v6, v15

    :goto_10
    invoke-interface {v10}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v10, Lda/d;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lda/d;-><init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method

.method private static final d(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;
    .locals 2

    const-string/jumbo v0, "savedStateRegistryOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arguments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o1()Landroidx/fragment/app/j;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p0

    const-string/jumbo v1, "getApplication(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    sget-object v0, LYg/J;->a:LYg/J;

    new-instance v0, Lda/v;

    invoke-direct {v0, p0, p1, p2, p3}, Lda/v;-><init>(Landroid/app/Application;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)V

    return-object v0
.end method

.method private static final e(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, Lda/f;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
