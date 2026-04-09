.class public abstract Lcom/ui/wifiman/ui/signal/P;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/ui/wifiman/ui/signal/P;->c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;LT/l;II)V
    .locals 36

    move/from16 v7, p7

    const v0, 0x7db9e87e

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v7, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v7, 0x6

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
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p8, 0x2

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v5, p1

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    goto :goto_3

    :cond_5
    move-object/from16 v5, p1

    :goto_3
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_8

    and-int/lit8 v6, p8, 0x4

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v6, p2

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit16 v8, v7, 0xc00

    if-nez v8, :cond_a

    and-int/lit8 v8, p8, 0x8

    move-object/from16 v15, p3

    if-nez v8, :cond_9

    invoke-interface {v1, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_6

    :cond_9
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v4, v8

    goto :goto_7

    :cond_a
    move-object/from16 v15, p3

    :goto_7
    and-int/lit16 v8, v7, 0x6000

    if-nez v8, :cond_c

    and-int/lit8 v8, p8, 0x10

    move-object/from16 v14, p4

    if-nez v8, :cond_b

    invoke-interface {v1, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x4000

    goto :goto_8

    :cond_b
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v4, v8

    goto :goto_9

    :cond_c
    move-object/from16 v14, p4

    :goto_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v7

    if-nez v8, :cond_e

    and-int/lit8 v8, p8, 0x20

    move-object/from16 v13, p5

    if-nez v8, :cond_d

    invoke-interface {v1, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/high16 v8, 0x20000

    goto :goto_a

    :cond_d
    const/high16 v8, 0x10000

    :goto_a
    or-int/2addr v4, v8

    goto :goto_b

    :cond_e
    move-object/from16 v13, p5

    :goto_b
    const v8, 0x12493

    and-int/2addr v8, v4

    const v9, 0x12492

    if-ne v8, v9, :cond_10

    invoke-interface {v1}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_c

    :cond_f
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v5

    move-object v5, v14

    move-object v4, v15

    goto/16 :goto_14

    :cond_10
    :goto_c
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v8, v7, 0x1

    const v16, -0x70001

    const v17, -0xe001

    if-eqz v8, :cond_17

    invoke-interface {v1}, LT/l;->H()Z

    move-result v8

    if-eqz v8, :cond_11

    goto :goto_d

    :cond_11
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_12

    and-int/lit8 v4, v4, -0x71

    :cond_12
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_13

    and-int/lit16 v4, v4, -0x381

    :cond_13
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_14

    and-int/lit16 v4, v4, -0x1c01

    :cond_14
    and-int/lit8 v2, p8, 0x10

    if-eqz v2, :cond_15

    and-int v4, v4, v17

    :cond_15
    and-int/lit8 v2, p8, 0x20

    if-eqz v2, :cond_16

    and-int v4, v4, v16

    :cond_16
    move v8, v4

    move-object v2, v13

    move-object v0, v14

    move-object v4, v15

    goto/16 :goto_13

    :cond_17
    :goto_d
    if-eqz v2, :cond_18

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_e

    :cond_18
    move-object v2, v3

    :goto_e
    and-int/lit8 v3, p8, 0x2

    const/4 v12, 0x0

    const v11, 0x318a4a49

    const-string v10, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    const-string v9, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    const v8, -0x72e5f4af

    if-eqz v3, :cond_1c

    invoke-interface {v1, v8}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v5, Lc2/a;->c:I

    invoke-virtual {v3, v1, v5}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v3

    if-eqz v3, :cond_1b

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v5

    invoke-interface {v1, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/lifecycle/P$c;

    const/16 v18, 0x0

    const/16 v19, 0x10

    const-class v20, Lcom/ui/wifiman/ui/signal/e;

    const/16 v21, 0x0

    const/16 v22, 0x0

    move v0, v8

    move-object/from16 v8, v20

    move-object v0, v9

    move-object v9, v3

    move-object v3, v10

    move-object/from16 v10, v21

    move-object v11, v5

    move v5, v12

    move-object/from16 v12, v22

    move-object v13, v1

    move/from16 v14, v18

    move/from16 v15, v19

    invoke-static/range {v8 .. v15}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v8

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v9

    invoke-interface {v1, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v10

    invoke-interface {v1, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v11

    invoke-interface {v1, v11}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v11

    const v15, 0x318a4a49

    invoke-interface {v1, v15}, LT/l;->U(I)V

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    invoke-interface {v1, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_19

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v13, v12, :cond_1a

    :cond_19
    new-instance v13, Lye/i;

    invoke-direct {v13, v8, v9, v10}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v13}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1a
    check-cast v13, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    invoke-static {v11, v13, v1, v5}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v8, Lcom/ui/wifiman/ui/signal/e;

    and-int/lit8 v4, v4, -0x71

    move v14, v5

    move-object v5, v8

    goto :goto_f

    :cond_1b
    move-object v0, v9

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1c
    move-object v0, v9

    move-object v3, v10

    move v15, v11

    move v14, v12

    :goto_f
    and-int/lit8 v8, p8, 0x4

    if-eqz v8, :cond_20

    const v8, -0x72e5f4af

    invoke-interface {v1, v8}, LT/l;->U(I)V

    sget-object v6, Lc2/a;->a:Lc2/a;

    sget v8, Lc2/a;->c:I

    invoke-virtual {v6, v1, v8}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v9

    if-eqz v9, :cond_1f

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v6

    invoke-interface {v1, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Landroidx/lifecycle/P$c;

    const/4 v6, 0x0

    const/16 v18, 0x10

    const-class v8, Lof/a$c;

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v13, v1

    move v14, v6

    move v6, v15

    move/from16 v15, v18

    invoke-static/range {v8 .. v15}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v8

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v9

    invoke-interface {v1, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v10

    invoke-interface {v1, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v11

    invoke-interface {v1, v11}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v1, v6}, LT/l;->U(I)V

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    invoke-interface {v1, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_1d

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v13, v12, :cond_1e

    :cond_1d
    new-instance v13, Lye/i;

    invoke-direct {v13, v8, v9, v10}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v13}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1e
    check-cast v13, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    const/4 v15, 0x0

    invoke-static {v11, v13, v1, v15}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v8, Lof/a$c;

    and-int/lit16 v4, v4, -0x381

    move v14, v6

    move-object v6, v8

    goto :goto_10

    :cond_1f
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    move/from16 v35, v15

    move v15, v14

    move/from16 v14, v35

    :goto_10
    and-int/lit8 v8, p8, 0x8

    if-eqz v8, :cond_24

    const v8, -0x72e5f4af

    invoke-interface {v1, v8}, LT/l;->U(I)V

    sget-object v8, Lc2/a;->a:Lc2/a;

    sget v9, Lc2/a;->c:I

    invoke-virtual {v8, v1, v9}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v9

    if-eqz v9, :cond_23

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Landroidx/lifecycle/P$c;

    const/16 v18, 0x0

    const/16 v19, 0x10

    const-class v8, Lcom/ui/wifiman/ui/component/network/c$b;

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v13, v1

    move/from16 v14, v18

    move-object/from16 p0, v2

    move v2, v15

    move/from16 v15, v19

    invoke-static/range {v8 .. v15}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v8

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v9

    invoke-interface {v1, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v10

    invoke-interface {v1, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v11

    invoke-interface {v1, v11}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v11

    const v15, 0x318a4a49

    invoke-interface {v1, v15}, LT/l;->U(I)V

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    invoke-interface {v1, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_21

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v13, v12, :cond_22

    :cond_21
    new-instance v13, Lye/i;

    invoke-direct {v13, v8, v9, v10}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v13}, LT/l;->K(Ljava/lang/Object;)V

    :cond_22
    check-cast v13, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    invoke-static {v11, v13, v1, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v8, Lcom/ui/wifiman/ui/component/network/c$b;

    and-int/lit16 v4, v4, -0x1c01

    move/from16 v18, v4

    move-object v4, v8

    goto :goto_11

    :cond_23
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_24
    move-object/from16 p0, v2

    move v2, v15

    move v15, v14

    move/from16 v18, v4

    move-object/from16 v4, p3

    :goto_11
    and-int/lit8 v8, p8, 0x10

    if-eqz v8, :cond_28

    const v8, -0x72e5f4af

    invoke-interface {v1, v8}, LT/l;->U(I)V

    sget-object v8, Lc2/a;->a:Lc2/a;

    sget v9, Lc2/a;->c:I

    invoke-virtual {v8, v1, v9}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v9

    if-eqz v9, :cond_27

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Landroidx/lifecycle/P$c;

    const/4 v14, 0x0

    const/16 v19, 0x10

    const-class v8, Lcom/ui/wifiman/ui/signal/N;

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v13, v1

    move v2, v15

    move/from16 v15, v19

    invoke-static/range {v8 .. v15}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v8

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v9

    invoke-interface {v1, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v10

    invoke-interface {v1, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v11

    invoke-interface {v1, v11}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    invoke-interface {v1, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_25

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v13, v12, :cond_26

    :cond_25
    new-instance v13, Lye/i;

    invoke-direct {v13, v8, v9, v10}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v13}, LT/l;->K(Ljava/lang/Object;)V

    :cond_26
    check-cast v13, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    const/4 v9, 0x0

    invoke-static {v11, v13, v1, v9}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v8, Lcom/ui/wifiman/ui/signal/N;

    and-int v9, v18, v17

    move-object/from16 v17, v8

    move/from16 v18, v9

    goto :goto_12

    :cond_27
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_28
    move v2, v15

    move-object/from16 v17, p4

    :goto_12
    and-int/lit8 v8, p8, 0x20

    if-eqz v8, :cond_2c

    const v8, -0x72e5f4af

    invoke-interface {v1, v8}, LT/l;->U(I)V

    sget-object v8, Lc2/a;->a:Lc2/a;

    sget v9, Lc2/a;->c:I

    invoke-virtual {v8, v1, v9}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v9

    if-eqz v9, :cond_2b

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroidx/lifecycle/P$c;

    const/4 v14, 0x0

    const/16 v15, 0x10

    const-class v8, Lcom/ui/wifiman/ui/signal/m;

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v13, v1

    invoke-static/range {v8 .. v15}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v9

    invoke-interface {v1, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-interface {v1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v2, v10

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v2, v10

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v2, :cond_29

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v10, v2, :cond_2a

    :cond_29
    new-instance v10, Lye/i;

    invoke-direct {v10, v0, v8, v9}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2a
    check-cast v10, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    const/4 v2, 0x0

    invoke-static {v3, v10, v1, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v0, Lcom/ui/wifiman/ui/signal/m;

    and-int v2, v18, v16

    move-object/from16 v3, p0

    move v8, v2

    move-object v2, v0

    move-object/from16 v0, v17

    goto :goto_13

    :cond_2b
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2c
    move-object/from16 v3, p0

    move-object/from16 v2, p5

    move-object/from16 v0, v17

    move/from16 v8, v18

    :goto_13
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_2d

    const/4 v9, -0x1

    const-string v10, "com.ui.wifiman.ui.signal.SignalTabUi (SignalTabUi.kt:42)"

    const v11, 0x7db9e87e

    invoke-static {v11, v8, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2d
    sget-object v9, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v9, v1, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->e()Lma/a$e;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$e;->a()J

    move-result-wide v26

    new-instance v9, Lcom/ui/wifiman/ui/signal/P$a;

    invoke-direct {v9, v6, v4, v5, v0}, Lcom/ui/wifiman/ui/signal/P$a;-><init>(Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/e;Lcom/ui/wifiman/ui/signal/N;)V

    const v10, 0x1aad89c3

    const/4 v11, 0x1

    const/16 v12, 0x36

    invoke-static {v10, v11, v9, v1, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    new-instance v9, Lcom/ui/wifiman/ui/signal/P$b;

    invoke-direct {v9, v5, v0, v2}, Lcom/ui/wifiman/ui/signal/P$b;-><init>(Lcom/ui/wifiman/ui/signal/e;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;)V

    const v13, -0x31d3fbc4

    invoke-static {v13, v11, v9, v1, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v30

    and-int/lit8 v8, v8, 0xe

    or-int/lit16 v8, v8, 0x180

    move/from16 v32, v8

    const/high16 v33, 0xc00000

    const v34, 0x17ffa

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v28, 0x0

    move-object v8, v3

    move-object/from16 v31, v1

    invoke-static/range {v8 .. v34}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_2e

    invoke-static {}, LT/o;->P()V

    :cond_2e
    move-object v13, v2

    move-object v2, v5

    move-object v5, v0

    :goto_14
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_2f

    new-instance v10, Lcom/ui/wifiman/ui/signal/O;

    move-object v0, v10

    move-object v1, v3

    move-object v3, v6

    move-object v6, v13

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/ui/wifiman/ui/signal/O;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_2f
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, Lcom/ui/wifiman/ui/signal/P;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/ui/signal/d;LT/l;I)LJ9/j;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/signal/P;->e(Lcom/ui/wifiman/ui/signal/d;LT/l;I)LJ9/j;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/ui/wifiman/ui/signal/d;LT/l;I)LJ9/j;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const v3, -0x1d85f39e

    invoke-interface {v1, v3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.rememberContentTabs (SignalTabUi.kt:143)"

    invoke-static {v3, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v3, 0x6f565c39

    invoke-interface {v1, v3}, LT/l;->U(I)V

    and-int/lit8 v3, v2, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-le v3, v4, :cond_1

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    and-int/lit8 v2, v2, 0x6

    if-ne v2, v4, :cond_3

    :cond_2
    move v2, v6

    goto :goto_0

    :cond_3
    move v2, v5

    :goto_0
    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_7

    :cond_4
    new-instance v3, LJ9/j;

    new-instance v2, LJ9/a;

    new-instance v9, Ls9/d$b;

    sget v4, Lm8/c;->E2:I

    invoke-direct {v9, v4}, Ls9/d$b;-><init>(I)V

    sget-object v4, LPe/a;->a:LPe/a;

    invoke-virtual {v4}, LPe/a;->K()Ls9/b;

    move-result-object v10

    sget-object v7, Lcom/ui/wifiman/ui/signal/d;->SIGNAL:Lcom/ui/wifiman/ui/signal/d;

    if-ne v0, v7, :cond_5

    move v11, v6

    goto :goto_1

    :cond_5
    move v11, v5

    :goto_1
    const/16 v14, 0x30

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v15}, LJ9/a;-><init>(ILs9/d;Ls9/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, LJ9/a;

    new-instance v8, Ls9/d$b;

    sget v9, Lm8/c;->D2:I

    invoke-direct {v8, v9}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v4}, LPe/a;->n()Ls9/b;

    move-result-object v19

    sget-object v4, Lcom/ui/wifiman/ui/signal/d;->FLOORPLAN:Lcom/ui/wifiman/ui/signal/d;

    if-ne v0, v4, :cond_6

    move/from16 v20, v6

    goto :goto_2

    :cond_6
    move/from16 v20, v5

    :goto_2
    const/16 v23, 0x30

    const/16 v24, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v16, v7

    move-object/from16 v18, v8

    invoke-direct/range {v16 .. v24}, LJ9/a;-><init>(ILs9/d;Ls9/b;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v2, v7}, [LJ9/a;

    move-result-object v0

    invoke-direct {v3, v0}, LJ9/j;-><init>([LJ9/a;)V

    invoke-interface {v1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, LJ9/j;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    return-object v3
.end method
