.class public abstract Lkf/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lkf/b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkf/o;->f(Landroidx/compose/ui/e;Lkf/b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LT/z1;)LYg/J;
    .locals 0

    invoke-static {p0}, Lkf/o;->e(LT/z1;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Lkf/b;LT/l;II)V
    .locals 32

    move/from16 v0, p3

    move/from16 v1, p4

    const v2, -0x53789613

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    const/16 v11, 0x20

    if-nez v6, :cond_5

    and-int/lit8 v6, v1, 0x2

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v15, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v11

    goto :goto_2

    :cond_3
    move-object/from16 v6, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :goto_3
    move v12, v5

    goto :goto_4

    :cond_5
    move-object/from16 v6, p1

    goto :goto_3

    :goto_4
    and-int/lit8 v5, v12, 0x13

    const/16 v7, 0x12

    if-ne v5, v7, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v5, v15

    goto/16 :goto_b

    :cond_7
    :goto_5
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v5, v0, 0x1

    const/4 v14, 0x0

    if-eqz v5, :cond_a

    invoke-interface {v15}, LT/l;->H()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_7

    :cond_8
    invoke-interface {v15}, LT/l;->C()V

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_9

    and-int/lit8 v12, v12, -0x71

    :cond_9
    move-object/from16 v30, v4

    :goto_6
    move-object v13, v6

    goto/16 :goto_9

    :cond_a
    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v3

    goto :goto_8

    :cond_b
    move-object v13, v4

    :goto_8
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_f

    const v3, -0x72e5f4af

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v4, Lc2/a;->c:I

    invoke-virtual {v3, v15, v4}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/lifecycle/P$c;

    const/4 v9, 0x0

    const/16 v10, 0x10

    const-class v3, Lkf/b;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v3 .. v10}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v5

    invoke-interface {v15, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v6

    invoke-interface {v15, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    const v7, 0x318a4a49

    invoke-interface {v15, v7}, LT/l;->U(I)V

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v15, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_c

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_d

    :cond_c
    new-instance v8, Lye/i;

    invoke-direct {v8, v3, v4, v5}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v15, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v6, v8, v15, v14}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v3, Lkf/b;

    and-int/lit8 v12, v12, -0x71

    move-object/from16 v30, v13

    move-object v13, v3

    goto :goto_9

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object/from16 v30, v13

    goto/16 :goto_6

    :goto_9
    invoke-interface {v15}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_10

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi (SpeedtestResultsUi.kt:30)"

    invoke-static {v2, v12, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    const v2, -0x7dc3bac6

    invoke-interface {v15, v2}, LT/l;->U(I)V

    and-int/lit8 v2, v12, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/4 v10, 0x1

    if-le v2, v11, :cond_11

    invoke-interface {v15, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    and-int/lit8 v2, v12, 0x30

    if-ne v2, v11, :cond_13

    :cond_12
    move v2, v10

    goto :goto_a

    :cond_13
    move v2, v14

    :goto_a
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_14

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_15

    :cond_14
    new-instance v3, Lkf/o$c;

    invoke-direct {v3, v13}, Lkf/o$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    check-cast v3, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    move-object v6, v3

    check-cast v6, Lmh/l;

    const/16 v8, 0x30

    const/4 v9, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v7, v15

    invoke-static/range {v3 .. v9}, LBe/m0;->n(ZZLR0/Q;Lmh/l;LT/l;II)LT/z1;

    move-result-object v2

    invoke-virtual {v13}, Lkf/b;->o0()LLi/N;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4, v15, v14, v10}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkf/a;

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v15, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->e()Lma/a$e;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$e;->a()J

    move-result-wide v21

    new-instance v4, Lkf/o$a;

    invoke-direct {v4, v2, v13, v3}, Lkf/o$a;-><init>(LT/z1;Lkf/b;Lkf/a;)V

    const v5, 0x4f08c0c8

    const/16 v6, 0x36

    invoke-static {v5, v10, v4, v15, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    new-instance v4, Lkf/o$b;

    invoke-direct {v4, v3, v13}, Lkf/o$b;-><init>(Lkf/a;Lkf/b;)V

    const v3, 0x2c34d2ef

    invoke-static {v3, v10, v4, v15, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v25

    and-int/lit8 v3, v12, 0xe

    or-int/lit16 v3, v3, 0x180

    move/from16 v27, v3

    const/high16 v28, 0xc00000

    const v29, 0x17ffa

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    move-object/from16 v31, v13

    move-object v13, v3

    const/4 v3, 0x0

    move v14, v3

    const-wide/16 v16, 0x0

    move-object v3, v15

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v23, 0x0

    move-object/from16 p0, v3

    move-object/from16 v3, v30

    move-object/from16 v26, p0

    invoke-static/range {v3 .. v29}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {v2}, Lkf/o;->d(LT/z1;)LBe/b0;

    move-result-object v3

    invoke-virtual {v3}, LBe/b0;->c()LT/q0;

    move-result-object v3

    invoke-interface {v3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const v4, -0x7dc1cdb4

    move-object/from16 v5, p0

    invoke-interface {v5, v4}, LT/l;->U(I)V

    invoke-interface {v5, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_16

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_17

    :cond_16
    new-instance v6, Lkf/l;

    invoke-direct {v6, v2}, Lkf/l;-><init>(LT/z1;)V

    invoke-interface {v5, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v6, Lmh/a;

    invoke-interface {v5}, LT/l;->J()V

    const/4 v2, 0x0

    invoke-static {v3, v6, v5, v2, v2}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    move-object/from16 v4, v30

    move-object/from16 v6, v31

    :goto_b
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_19

    new-instance v3, Lkf/m;

    invoke-direct {v3, v4, v6, v0, v1}, Lkf/m;-><init>(Landroidx/compose/ui/e;Lkf/b;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_19
    return-void
.end method

.method private static final d(LT/z1;)LBe/b0;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBe/b0;

    return-object p0
.end method

.method private static final e(LT/z1;)LYg/J;
    .locals 0

    invoke-static {p0}, Lkf/o;->d(LT/z1;)LBe/b0;

    move-result-object p0

    invoke-virtual {p0}, LBe/b0;->d()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/e;Lkf/b;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lkf/o;->c(Landroidx/compose/ui/e;Lkf/b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic g(LT/z1;)LBe/b0;
    .locals 0

    invoke-static {p0}, Lkf/o;->d(LT/z1;)LBe/b0;

    move-result-object p0

    return-object p0
.end method
