.class public abstract LZe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LZe/c;->c(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LT/l;II)V
    .locals 36

    move/from16 v5, p5

    const v0, -0x27a78b39

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
    or-int/2addr v4, v7

    goto :goto_5

    :cond_7
    move-object/from16 v14, p2

    :goto_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_9

    and-int/lit8 v7, p6, 0x8

    move-object/from16 v15, p3

    if-nez v7, :cond_8

    invoke-interface {v1, v15}, LT/l;->T(Ljava/lang/Object;)Z

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
    move-object/from16 v15, p3

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

    move-object v2, v6

    move-object v4, v15

    goto/16 :goto_10

    :cond_b
    :goto_8
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v7, v5, 0x1

    if-eqz v7, :cond_10

    invoke-interface {v1}, LT/l;->H()Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_a

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
    move v7, v4

    move-object v4, v6

    :goto_9
    move-object v0, v14

    move-object v2, v15

    goto/16 :goto_f

    :cond_10
    :goto_a
    if-eqz v2, :cond_11

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_b

    :cond_11
    move-object v2, v3

    :goto_b
    and-int/lit8 v3, p6, 0x2

    const/4 v13, 0x0

    const v12, 0x318a4a49

    const-string v11, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    const-string v10, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    const v9, -0x72e5f4af

    if-eqz v3, :cond_15

    invoke-interface {v1, v9}, LT/l;->U(I)V

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

    const-class v6, LZe/a;

    const/4 v8, 0x0

    const/16 v18, 0x0

    move v0, v9

    move-object v9, v3

    move-object v3, v10

    move-object/from16 v10, v18

    move-object v0, v11

    move-object v11, v1

    move/from16 v12, v16

    move-object/from16 p0, v2

    move v2, v13

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

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v9

    invoke-interface {v1, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    const v13, 0x318a4a49

    invoke-interface {v1, v13}, LT/l;->U(I)V

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

    invoke-static {v9, v11, v1, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v6, LZe/a;

    and-int/lit8 v4, v4, -0x71

    :goto_c
    move v12, v4

    move-object v4, v6

    goto :goto_d

    :cond_14
    move-object v3, v10

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    move-object/from16 p0, v2

    move-object v3, v10

    move-object v0, v11

    move v2, v13

    move v13, v12

    goto :goto_c

    :goto_d
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

    const/4 v14, 0x0

    const/16 v16, 0x10

    const-class v6, Lof/a$c;

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v11, v1

    move/from16 v33, v12

    move v12, v14

    move v14, v13

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

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-static {v9, v11, v1, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    check-cast v6, Lof/a$c;

    move/from16 v7, v33

    and-int/lit16 v7, v7, -0x381

    move v12, v7

    move v13, v14

    move-object v14, v6

    goto :goto_e

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    move v7, v12

    :goto_e
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

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroidx/lifecycle/P$c;

    const/4 v3, 0x0

    const/16 v15, 0x10

    const-class v6, Lcom/ui/wifiman/ui/component/network/c$b;

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v11, v1

    move/from16 v34, v12

    move v12, v3

    move v3, v13

    move v13, v15

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

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v3}, LT/l;->U(I)V

    invoke-interface {v1, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v3, v9

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v3, v9

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_1a

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v9, v3, :cond_1b

    :cond_1a
    new-instance v9, Lye/i;

    invoke-direct {v9, v6, v7, v8}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v1, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    check-cast v9, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    invoke-static {v0, v9, v1, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v1}, LT/l;->J()V

    move-object v0, v6

    check-cast v0, Lcom/ui/wifiman/ui/component/network/c$b;

    move/from16 v7, v34

    and-int/lit16 v2, v7, -0x1c01

    move-object/from16 v3, p0

    move v7, v2

    move-object v2, v0

    move-object v0, v14

    goto :goto_f

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    move v7, v12

    move-object/from16 v3, p0

    goto/16 :goto_9

    :goto_f
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_1e

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.speed.SpeedTabUi (SpeedTabUi.kt:37)"

    const v9, -0x27a78b39

    invoke-static {v9, v7, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1e
    sget-object v6, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v6, v1, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->e()Lma/a$e;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$e;->b()J

    move-result-wide v24

    new-instance v6, LZe/c$a;

    invoke-direct {v6, v0, v2}, LZe/c$a;-><init>(Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;)V

    const v8, 0x167e61e2

    const/4 v9, 0x1

    const/16 v10, 0x36

    invoke-static {v8, v9, v6, v1, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    new-instance v6, LZe/c$b;

    invoke-direct {v6, v3, v4}, LZe/c$b;-><init>(Landroidx/compose/ui/e;LZe/a;)V

    const v11, -0x4ed574b7

    invoke-static {v11, v9, v6, v1, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v28

    and-int/lit8 v6, v7, 0xe

    or-int/lit16 v6, v6, 0x180

    move/from16 v30, v6

    const/high16 v31, 0xc00000

    const v32, 0x17ffa

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v26, 0x0

    move-object v6, v3

    move-object/from16 v29, v1

    invoke-static/range {v6 .. v32}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-static {}, LT/o;->P()V

    :cond_1f
    move-object v14, v0

    move-object/from16 v35, v4

    move-object v4, v2

    move-object/from16 v2, v35

    :goto_10
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_20

    new-instance v8, LZe/b;

    move-object v0, v8

    move-object v1, v3

    move-object v3, v14

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LZe/b;-><init>(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_20
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;
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

    invoke-static/range {v0 .. v6}, LZe/c;->b(Landroidx/compose/ui/e;LZe/a;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
