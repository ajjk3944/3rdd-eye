.class public abstract LLe/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LLe/s;->d(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LLe/s;->g(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;LT/l;I)V
    .locals 8

    const v0, 0x4869c2fb

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

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

    invoke-interface {p4, p2}, LT/l;->T(Ljava/lang/Object;)Z

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

    if-nez v2, :cond_7

    invoke-interface {p4, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-ne v2, v3, :cond_9

    invoke-interface {p4}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p4}, LT/l;->C()V

    goto :goto_6

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.discovery.DiscoveryHomeToolbar (DiscoveryHomeUi.kt:155)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    new-instance v0, LLe/s$a;

    invoke-direct {v0, p3}, LLe/s$a;-><init>(LBe/b0;)V

    const/16 v2, 0x36

    const v3, -0x64f50543

    const/4 v4, 0x1

    invoke-static {v3, v4, v0, p4, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    and-int/lit8 v0, v1, 0xe

    or-int/lit16 v0, v0, 0xc00

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x380

    or-int v6, v0, v1

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    invoke-static/range {v1 .. v7}, LHe/C;->b(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_6
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_c

    new-instance v6, LLe/q;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LLe/q;-><init>(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;I)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, LLe/s;->c(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LT/l;II)V
    .locals 37

    move/from16 v5, p5

    const v0, -0xf97afda

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p6, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v5, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p6, 0x2

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v6, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_7

    and-int/lit8 v7, p6, 0x4

    move-object/from16 v15, p2

    if-nez v7, :cond_6

    invoke-interface {v1, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    goto :goto_5

    :cond_7
    move-object/from16 v15, p2

    :goto_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_9

    and-int/lit8 v7, p6, 0x8

    move-object/from16 v13, p3

    if-nez v7, :cond_8

    invoke-interface {v1, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_6

    :cond_8
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v4, v7

    goto :goto_7

    :cond_9
    move-object/from16 v13, p3

    :goto_7
    and-int/lit16 v7, v4, 0x493

    const/16 v8, 0x492

    if-ne v7, v8, :cond_b

    invoke-interface {v1}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_8

    :cond_a
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v3

    move-object v4, v6

    move-object v3, v15

    goto/16 :goto_10

    :cond_b
    :goto_8
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v7, v5, 0x1

    const/4 v12, 0x0

    if-eqz v7, :cond_10

    invoke-interface {v1}, LT/l;->H()Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_d

    and-int/lit8 v4, v4, -0x71

    :cond_d
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_e

    and-int/lit16 v4, v4, -0x381

    :cond_e
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_f

    and-int/lit16 v4, v4, -0x1c01

    :cond_f
    move-object v2, v3

    move v3, v12

    move-object v0, v15

    move-object v15, v13

    move v13, v4

    move-object v4, v6

    goto/16 :goto_e

    :cond_10
    :goto_9
    if-eqz v2, :cond_11

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_a

    :cond_11
    move-object v2, v3

    :goto_a
    and-int/lit8 v3, p6, 0x2

    const v11, 0x318a4a49

    const-string v10, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    const-string v9, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    const v8, -0x72e5f4af

    if-eqz v3, :cond_15

    invoke-interface {v1, v8}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v6, Lc2/a;->c:I

    invoke-virtual {v3, v1, v6}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v7

    if-eqz v7, :cond_14

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/P$c;

    const/16 v16, 0x0

    const/16 v17, 0x10

    const-class v6, LLe/d;

    const/16 v18, 0x0

    const/16 v19, 0x0

    move v14, v8

    move-object/from16 v8, v18

    move-object v0, v9

    move-object v9, v3

    move-object v3, v10

    move-object/from16 v10, v19

    move v14, v11

    move-object v11, v1

    move/from16 v12, v16

    move/from16 v13, v17

    invoke-static/range {v6 .. v13}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v6

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v7

    invoke-interface {v1, v7}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v9

    invoke-interface {v1, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v1, v14}, LT/l;->U(I)V

    invoke-interface {v1, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_12

    sget-object v10, LT/l;->a:LT/l$a;

    invoke-virtual {v10}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_13

    :cond_12
    new-instance v11, Lye/i;

    invoke-direct {v11, v6, v7, v8}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v11, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    const/4 v13, 0x0

    invoke-static {v9, v11, v1, v13}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v6, LLe/d;

    and-int/lit8 v4, v4, -0x71

    :goto_b
    move v12, v4

    move-object v4, v6

    goto :goto_c

    :cond_14
    move-object v0, v9

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_15
    move-object v0, v9

    move-object v3, v10

    move v14, v11

    move v13, v12

    goto :goto_b

    :goto_c
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_19

    const v6, -0x72e5f4af

    invoke-interface {v1, v6}, LT/l;->U(I)V

    sget-object v6, Lc2/a;->a:Lc2/a;

    sget v7, Lc2/a;->c:I

    invoke-virtual {v6, v1, v7}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v7

    if-eqz v7, :cond_18

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v6

    invoke-interface {v1, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Landroidx/lifecycle/P$c;

    const/4 v15, 0x0

    const/16 v16, 0x10

    const-class v6, Lof/a$c;

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v11, v1

    move/from16 v34, v12

    move v12, v15

    move v15, v13

    move/from16 v13, v16

    invoke-static/range {v6 .. v13}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v6

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v7

    invoke-interface {v1, v7}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v9

    invoke-interface {v1, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v1, v14}, LT/l;->U(I)V

    invoke-interface {v1, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_16

    sget-object v10, LT/l;->a:LT/l$a;

    invoke-virtual {v10}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_17

    :cond_16
    new-instance v11, Lye/i;

    invoke-direct {v11, v6, v7, v8}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v11, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    invoke-static {v9, v11, v1, v15}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v6, Lof/a$c;

    move/from16 v7, v34

    and-int/lit16 v7, v7, -0x381

    move v12, v7

    move v13, v15

    move-object v15, v6

    goto :goto_d

    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    move v7, v12

    :goto_d
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_1d

    const v6, -0x72e5f4af

    invoke-interface {v1, v6}, LT/l;->U(I)V

    sget-object v6, Lc2/a;->a:Lc2/a;

    sget v7, Lc2/a;->c:I

    invoke-virtual {v6, v1, v7}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v7

    if-eqz v7, :cond_1c

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroidx/lifecycle/P$c;

    const/4 v0, 0x0

    const/16 v16, 0x10

    const-class v6, Lcom/ui/wifiman/ui/component/network/c$b;

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v11, v1

    move/from16 v35, v12

    move v12, v0

    move v0, v13

    move/from16 v13, v16

    invoke-static/range {v6 .. v13}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v6

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v7

    invoke-interface {v1, v7}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v14}, LT/l;->U(I)V

    invoke-interface {v1, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_1a

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_1b

    :cond_1a
    new-instance v10, Lye/i;

    invoke-direct {v10, v6, v7, v8}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    check-cast v10, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    invoke-static {v3, v10, v1, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    move-object v3, v6

    check-cast v3, Lcom/ui/wifiman/ui/component/network/c$b;

    move/from16 v7, v35

    and-int/lit16 v6, v7, -0x1c01

    move v13, v6

    move-object/from16 v36, v3

    move v3, v0

    move-object v0, v15

    move-object/from16 v15, v36

    goto :goto_e

    :cond_1c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1d
    move v7, v12

    move v3, v13

    move v13, v7

    move-object v0, v15

    move-object/from16 v15, p3

    :goto_e
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_1e

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi (DiscoveryHomeUi.kt:52)"

    const v8, -0xf97afda

    invoke-static {v8, v13, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1e
    const v6, -0x5facc207

    invoke-interface {v1, v6}, LT/l;->U(I)V

    and-int/lit8 v6, v13, 0x70

    xor-int/lit8 v6, v6, 0x30

    const/4 v14, 0x1

    const/16 v7, 0x20

    if-le v6, v7, :cond_1f

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    :cond_1f
    and-int/lit8 v6, v13, 0x30

    if-ne v6, v7, :cond_21

    :cond_20
    move v12, v14

    goto :goto_f

    :cond_21
    move v12, v3

    :goto_f
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v12, :cond_22

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v3, v6, :cond_23

    :cond_22
    new-instance v3, LLe/s$d;

    invoke-direct {v3, v4}, LLe/s$d;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_23
    check-cast v3, Lth/g;

    invoke-interface {v1}, LT/l;->J()V

    move-object v9, v3

    check-cast v9, Lmh/l;

    const/16 v11, 0x30

    const/4 v12, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v10, v1

    invoke-static/range {v6 .. v12}, LBe/m0;->n(ZZLR0/Q;Lmh/l;LT/l;II)LT/z1;

    move-result-object v3

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v1, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->e()Lma/a$e;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$e;->a()J

    move-result-wide v24

    new-instance v6, LLe/s$b;

    invoke-direct {v6, v3, v0, v15}, LLe/s$b;-><init>(LT/z1;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;)V

    const v7, -0x5ab04dff

    const/16 v9, 0x36

    invoke-static {v7, v14, v6, v1, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    new-instance v6, LLe/s$c;

    invoke-direct {v6, v3, v4}, LLe/s$c;-><init>(LT/z1;LLe/d;)V

    const v3, 0x6e47db28

    invoke-static {v3, v14, v6, v1, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v28

    and-int/lit8 v3, v13, 0xe

    or-int/lit16 v3, v3, 0x180

    move/from16 v30, v3

    const/high16 v31, 0xc00000

    const v32, 0x17ffa

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    move-object/from16 v33, v15

    move v15, v3

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v26, 0x0

    move-object v6, v2

    move-object/from16 v29, v1

    invoke-static/range {v6 .. v32}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_24

    invoke-static {}, LT/o;->P()V

    :cond_24
    move-object v3, v0

    move-object/from16 v13, v33

    :goto_10
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_25

    new-instance v8, LLe/p;

    move-object v0, v8

    move-object v1, v2

    move-object v2, v4

    move-object v4, v13

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LLe/p;-><init>(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_25
    return-void
.end method

.method private static final f(LT/z1;)LBe/b0;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBe/b0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LLe/s;->e(Landroidx/compose/ui/e;LLe/d;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic h(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;LT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LLe/s;->c(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LBe/b0;LT/l;I)V

    return-void
.end method

.method public static final synthetic i(LT/z1;)LBe/b0;
    .locals 0

    invoke-static {p0}, LLe/s;->f(LT/z1;)LBe/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(LLe/c;Lb8/c;LT/l;I)LJ9/j;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LLe/s;->k(LLe/c;Lb8/c;LT/l;I)LJ9/j;

    move-result-object p0

    return-object p0
.end method

.method private static final k(LLe/c;Lb8/c;LT/l;I)LJ9/j;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    const v4, -0x7a55dd36    # -1.5999503E-35f

    invoke-interface {v2, v4}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.discovery.rememberContentTabs (DiscoveryHomeUi.kt:173)"

    invoke-static {v4, v3, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v4, 0xdc69771

    invoke-interface {v2, v4}, LT/l;->U(I)V

    and-int/lit8 v4, v3, 0xe

    xor-int/lit8 v4, v4, 0x6

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-le v4, v5, :cond_1

    invoke-interface {v2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    and-int/lit8 v4, v3, 0x6

    if-ne v4, v5, :cond_3

    :cond_2
    move v4, v7

    goto :goto_0

    :cond_3
    move v4, v6

    :goto_0
    and-int/lit8 v5, v3, 0x70

    xor-int/lit8 v5, v5, 0x30

    const/16 v8, 0x20

    if-le v5, v8, :cond_4

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    and-int/lit8 v3, v3, 0x30

    if-ne v3, v8, :cond_6

    :cond_5
    move v3, v7

    goto :goto_1

    :cond_6
    move v3, v6

    :goto_1
    or-int/2addr v3, v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_a

    :cond_7
    new-instance v4, LJ9/j;

    new-instance v3, LJ9/a;

    const/4 v5, 0x0

    invoke-static {v1, v5, v7, v5}, Lcom/ui/wifiman/ui/component/network/p;->c(Lb8/c;Ljava/lang/String;ILjava/lang/Object;)Ls9/d;

    move-result-object v10

    invoke-static/range {p1 .. p1}, Lcom/ui/wifiman/ui/component/network/p;->a(Lb8/c;)Ls9/b;

    move-result-object v11

    sget-object v1, LLe/c;->LAN:LLe/c;

    if-ne v0, v1, :cond_8

    move v12, v7

    goto :goto_2

    :cond_8
    move v12, v6

    :goto_2
    const/16 v15, 0x30

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v8, v3

    invoke-direct/range {v8 .. v16}, LJ9/a;-><init>(ILs9/d;Ls9/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, LJ9/a;

    new-instance v5, Ls9/d$b;

    sget v8, Lm8/c;->x:I

    invoke-direct {v5, v8}, Ls9/d$b;-><init>(I)V

    sget-object v8, LPe/a;->a:LPe/a;

    invoke-virtual {v8}, LPe/a;->f()Ls9/b;

    move-result-object v20

    sget-object v8, LLe/c;->BLUETOOTH:LLe/c;

    if-ne v0, v8, :cond_9

    move/from16 v21, v7

    goto :goto_3

    :cond_9
    move/from16 v21, v6

    :goto_3
    const/16 v24, 0x30

    const/16 v25, 0x0

    const/16 v18, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v17, v1

    move-object/from16 v19, v5

    invoke-direct/range {v17 .. v25}, LJ9/a;-><init>(ILs9/d;Ls9/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3, v1}, [LJ9/a;

    move-result-object v0

    invoke-direct {v4, v0}, LJ9/j;-><init>([LJ9/a;)V

    invoke-interface {v2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, LJ9/j;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v4
.end method
