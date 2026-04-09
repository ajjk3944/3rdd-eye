.class public abstract LFf/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LFf/t;->d(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LFf/e;Lof/a$c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LFf/t;->g(Landroidx/compose/ui/e;LFf/e;Lof/a$c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;LT/l;I)V
    .locals 8

    const v0, 0x3ee84503

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

    const-string v3, "com.ui.wifiman.ui.wifi.scan.WifiScanToolbar (WifiScanUi.kt:120)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    new-instance v0, LFf/t$a;

    invoke-direct {v0, p1}, LFf/t$a;-><init>(LFf/e;)V

    const v2, 0x3003fbad

    const/4 v3, 0x1

    const/16 v4, 0x36

    invoke-static {v2, v3, v0, p4, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    new-instance v2, LFf/t$b;

    invoke-direct {v2, p1, p3}, LFf/t$b;-><init>(LFf/e;LBe/b0;)V

    const v5, 0x28135e24

    invoke-static {v5, v3, v2, p4, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    and-int/lit8 v2, v1, 0xe

    or-int/lit16 v2, v2, 0xd80

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int v6, v2, v1

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, v0

    move-object v5, p4

    invoke-static/range {v1 .. v7}, LHe/m;->b(Landroidx/compose/ui/e;Lof/a$c;Lmh/p;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_6
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_c

    new-instance v6, LFf/s;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LFf/s;-><init>(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;I)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, LFf/t;->c(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LT/l;II)V
    .locals 35

    move/from16 v4, p4

    const v0, 0x13475ccb

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p5, 0x2

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
    or-int/2addr v5, v7

    goto :goto_3

    :cond_5
    move-object/from16 v6, p1

    :goto_3
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_7

    and-int/lit8 v7, p5, 0x4

    move-object/from16 v14, p2

    if-nez v7, :cond_6

    invoke-interface {v1, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    :goto_5
    move v15, v5

    goto :goto_6

    :cond_7
    move-object/from16 v14, p2

    goto :goto_5

    :goto_6
    and-int/lit16 v5, v15, 0x93

    const/16 v7, 0x92

    if-ne v5, v7, :cond_9

    invoke-interface {v1}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_7

    :cond_8
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v3

    move-object v3, v6

    goto/16 :goto_d

    :cond_9
    :goto_7
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v5, v4, 0x1

    const/4 v12, 0x0

    if-eqz v5, :cond_d

    invoke-interface {v1}, LT/l;->H()Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_9

    :cond_a
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_b

    and-int/lit8 v15, v15, -0x71

    :cond_b
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_c

    and-int/lit16 v15, v15, -0x381

    :cond_c
    move-object v2, v3

    move-object v3, v6

    move v0, v12

    move v12, v15

    :goto_8
    move-object v15, v14

    goto/16 :goto_c

    :cond_d
    :goto_9
    if-eqz v2, :cond_e

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_a

    :cond_e
    move-object v2, v3

    :goto_a
    and-int/lit8 v3, p5, 0x2

    const v11, 0x318a4a49

    const-string v10, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    const-string v9, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    const v8, -0x72e5f4af

    if-eqz v3, :cond_12

    invoke-interface {v1, v8}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v5, Lc2/a;->c:I

    invoke-virtual {v3, v1, v5}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v6

    if-eqz v6, :cond_11

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/P$c;

    const/16 v16, 0x0

    const/16 v17, 0x10

    const-class v5, LFf/e;

    const/4 v7, 0x0

    const/16 v18, 0x0

    move v13, v8

    move-object v8, v3

    move-object v3, v9

    move-object/from16 v9, v18

    move-object v0, v10

    move-object v10, v1

    move v13, v11

    move/from16 v11, v16

    move/from16 v12, v17

    invoke-static/range {v5 .. v12}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v5

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v6

    invoke-interface {v1, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v7

    invoke-interface {v1, v7}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v1, v13}, LT/l;->U(I)V

    invoke-interface {v1, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-interface {v1, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_f

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_10

    :cond_f
    new-instance v10, Lye/i;

    invoke-direct {v10, v5, v6, v7}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v10, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    const/4 v12, 0x0

    invoke-static {v8, v10, v1, v12}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v5, LFf/e;

    and-int/lit8 v15, v15, -0x71

    move v11, v15

    move-object v15, v5

    goto :goto_b

    :cond_11
    move-object v3, v9

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    move-object v3, v9

    move-object v0, v10

    move v13, v11

    move v11, v15

    move-object v15, v6

    :goto_b
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_16

    const v5, -0x72e5f4af

    invoke-interface {v1, v5}, LT/l;->U(I)V

    sget-object v5, Lc2/a;->a:Lc2/a;

    sget v6, Lc2/a;->c:I

    invoke-virtual {v5, v1, v6}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v6

    if-eqz v6, :cond_15

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Landroidx/lifecycle/P$c;

    const/4 v3, 0x0

    const/16 v14, 0x10

    const-class v5, Lof/a$c;

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v10, v1

    move/from16 v33, v11

    move v11, v3

    move v3, v12

    move v12, v14

    invoke-static/range {v5 .. v12}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v5

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v6

    invoke-interface {v1, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v7

    invoke-interface {v1, v7}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v13}, LT/l;->U(I)V

    invoke-interface {v1, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-interface {v1, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_13

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_14

    :cond_13
    new-instance v9, Lye/i;

    invoke-direct {v9, v5, v6, v7}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    check-cast v9, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    invoke-static {v0, v9, v1, v3}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    move-object v0, v5

    check-cast v0, Lof/a$c;

    move/from16 v5, v33

    and-int/lit16 v5, v5, -0x381

    move v12, v5

    move-object/from16 v34, v15

    move-object v15, v0

    move v0, v3

    move-object/from16 v3, v34

    goto :goto_c

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    move v5, v11

    move v0, v12

    move v12, v5

    move-object v3, v15

    goto/16 :goto_8

    :goto_c
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_17

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.wifi.scan.WifiScanUi (WifiScanUi.kt:48)"

    const v7, 0x13475ccb

    invoke-static {v7, v12, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_17
    const v5, -0x4b55bc46

    invoke-interface {v1, v5}, LT/l;->U(I)V

    and-int/lit8 v5, v12, 0x70

    xor-int/lit8 v5, v5, 0x30

    const/4 v13, 0x1

    const/16 v6, 0x20

    if-le v5, v6, :cond_18

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_19

    :cond_18
    and-int/lit8 v5, v12, 0x30

    if-ne v5, v6, :cond_1a

    :cond_19
    move v0, v13

    :cond_1a
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_1b

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v5, v0, :cond_1c

    :cond_1b
    new-instance v5, LFf/t$e;

    invoke-direct {v5, v3}, LFf/t$e;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1c
    check-cast v5, Lth/g;

    invoke-interface {v1}, LT/l;->J()V

    move-object v8, v5

    check-cast v8, Lmh/l;

    const/16 v10, 0x30

    const/4 v11, 0x5

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v9, v1

    invoke-static/range {v5 .. v11}, LBe/m0;->n(ZZLR0/Q;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v1, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->e()Lma/a$e;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$e;->a()J

    move-result-wide v23

    new-instance v5, LFf/t$c;

    invoke-direct {v5, v0, v3, v15}, LFf/t$c;-><init>(LT/z1;LFf/e;Lof/a$c;)V

    const v6, -0x6620ecf0

    const/16 v8, 0x36

    invoke-static {v6, v13, v5, v1, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    new-instance v5, LFf/t$d;

    invoke-direct {v5, v3, v0}, LFf/t$d;-><init>(LFf/e;LT/z1;)V

    const v0, 0x54b81689

    invoke-static {v0, v13, v5, v1, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v27

    and-int/lit8 v0, v12, 0xe

    or-int/lit16 v0, v0, 0x180

    move/from16 v29, v0

    const/high16 v30, 0xc00000

    const v31, 0x17ffa

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v0, 0x0

    move-object/from16 v32, v15

    move-object v15, v0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v25, 0x0

    move-object v5, v2

    move-object/from16 v28, v1

    invoke-static/range {v5 .. v31}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, LT/o;->P()V

    :cond_1d
    move-object/from16 v14, v32

    :goto_d
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_1e

    new-instance v7, LFf/r;

    move-object v0, v7

    move-object v1, v2

    move-object v2, v3

    move-object v3, v14

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LFf/r;-><init>(Landroidx/compose/ui/e;LFf/e;Lof/a$c;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_1e
    return-void
.end method

.method private static final f(LT/z1;)LBe/b0;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBe/b0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;LFf/e;Lof/a$c;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LFf/t;->e(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic h(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;LT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LFf/t;->c(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;LT/l;I)V

    return-void
.end method

.method public static final synthetic i(LT/z1;)LBe/b0;
    .locals 0

    invoke-static {p0}, LFf/t;->f(LT/z1;)LBe/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LFf/d;LEe/g;LAf/H;LT/l;II)LFf/e;
    .locals 10

    const v0, -0x63aceac9

    invoke-interface {p3, v0}, LT/l;->U(I)V

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    sget-object p0, LFf/d$c;->a:LFf/d$c;

    :cond_0
    and-int/lit8 v1, p5, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    new-instance p1, LEe/g;

    new-instance v1, LEe/g$a$a;

    new-instance v3, LGf/i$c;

    const-string v4, "1"

    const/4 v5, 0x0

    invoke-static {v5, p3, v5, v2}, LGf/t;->s(ILT/l;II)LGf/j;

    move-result-object v6

    invoke-direct {v3, v4, v6}, LGf/i$c;-><init>(Ljava/lang/String;LGf/j;)V

    new-instance v4, LGf/i$c;

    const-string v6, "2"

    invoke-static {v5, p3, v5, v2}, LGf/t;->s(ILT/l;II)LGf/j;

    move-result-object v7

    invoke-direct {v4, v6, v7}, LGf/i$c;-><init>(Ljava/lang/String;LGf/j;)V

    new-instance v6, LGf/i$c;

    const-string v7, "3"

    invoke-static {v5, p3, v5, v2}, LGf/t;->s(ILT/l;II)LGf/j;

    move-result-object v5

    invoke-direct {v6, v7, v5}, LGf/i$c;-><init>(Ljava/lang/String;LGf/j;)V

    filled-new-array {v3, v4, v6}, [LGf/i$c;

    move-result-object v3

    invoke-static {v3}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x6

    const/4 v9, 0x0

    const-string v4, "ubiquiti"

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v1}, LEe/g;-><init>(Ljava/util/List;)V

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    new-instance p2, LAf/H$a;

    const p5, 0x3f333333    # 0.7f

    invoke-static {p5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p5

    invoke-direct {p2, p5, v2}, LAf/H$a;-><init>(Ljava/lang/Float;Z)V

    :cond_2
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_3

    const/4 p5, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.scan.previewWifiScanVM (WifiScanUi.kt:173)"

    invoke-static {v0, p4, p5, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    new-instance p4, LFf/t$f;

    invoke-direct {p4, p0, p1, p3, p2}, LFf/t$f;-><init>(LFf/d;LEe/g;LT/l;LAf/H;)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p3}, LT/l;->J()V

    return-object p4
.end method
