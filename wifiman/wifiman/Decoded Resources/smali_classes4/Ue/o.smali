.class public abstract LUe/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LUe/g;LT/q0;Landroidx/lifecycle/o;ZLT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LUe/o;->i(LUe/g;LT/q0;Landroidx/lifecycle/o;ZLT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LT/q0;ZLandroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LUe/o;->l(LT/q0;ZLandroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public static synthetic c(LUe/g;Landroid/content/Context;)Lh7/j;
    .locals 0

    invoke-static {p0, p1}, LUe/o;->n(LUe/g;Landroid/content/Context;)Lh7/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;LUe/g;ZIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LUe/o;->m(Landroidx/compose/ui/e;LUe/g;ZIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LUe/g;LT/q0;Lh7/j;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LUe/o;->o(LUe/g;LT/q0;Lh7/j;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm7/d;)LYg/J;
    .locals 0

    invoke-static {p0}, LUe/o;->j(Lm7/d;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()LYg/J;
    .locals 1

    invoke-static {}, LUe/o;->k()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final h(Landroidx/compose/ui/e;LUe/g;ZLT/l;II)V
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p4

    const-string v0, "modifier"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controller"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x45c5df3b

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v9

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_2

    invoke-interface {v9, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_2
    move v1, v8

    :goto_1
    and-int/lit8 v3, p5, 0x2

    const/16 v10, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_6

    and-int/lit8 v3, v8, 0x40

    if-nez v3, :cond_4

    invoke-interface {v9, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_4
    invoke-interface {v9, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_5

    move v3, v10

    goto :goto_3

    :cond_5
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_6
    :goto_4
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_8

    or-int/lit16 v1, v1, 0x180

    :cond_7
    move/from16 v4, p2

    :goto_5
    move v12, v1

    goto :goto_7

    :cond_8
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_7

    move/from16 v4, p2

    invoke-interface {v9, v4}, LT/l;->c(Z)Z

    move-result v5

    if-eqz v5, :cond_9

    const/16 v5, 0x100

    goto :goto_6

    :cond_9
    const/16 v5, 0x80

    :goto_6
    or-int/2addr v1, v5

    goto :goto_5

    :goto_7
    and-int/lit16 v1, v12, 0x93

    const/16 v5, 0x92

    if-ne v1, v5, :cond_b

    invoke-interface {v9}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_8

    :cond_a
    invoke-interface {v9}, LT/l;->C()V

    move v3, v4

    goto/16 :goto_10

    :cond_b
    :goto_8
    if-eqz v3, :cond_c

    const/4 v14, 0x1

    goto :goto_9

    :cond_c
    move v14, v4

    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.signal.floorplan.component.ComposeFloorplanView (ComposeFloorplanView.kt:18)"

    invoke-static {v0, v12, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    const v0, -0x6788edb

    invoke-interface {v9, v0}, LT/l;->U(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v15, LT/l;->a:LT/l$a;

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_e

    const/4 v0, 0x0

    invoke-static {v0, v0, v2, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {v9, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v5, v0

    check-cast v5, LT/q0;

    invoke-interface {v9}, LT/l;->J()V

    const v0, -0x6787fe9

    invoke-interface {v9, v0}, LT/l;->U(I)V

    and-int/lit8 v4, v12, 0x70

    const/16 v16, 0x0

    if-eq v4, v10, :cond_10

    and-int/lit8 v0, v12, 0x40

    if-eqz v0, :cond_f

    invoke-interface {v9, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_a

    :cond_f
    move/from16 v0, v16

    goto :goto_b

    :cond_10
    :goto_a
    const/4 v0, 0x1

    :goto_b
    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_11

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_12

    :cond_11
    new-instance v1, LUe/h;

    invoke-direct {v1, v7}, LUe/h;-><init>(LUe/g;)V

    invoke-interface {v9, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    move-object v0, v1

    check-cast v0, Lmh/l;

    invoke-interface {v9}, LT/l;->J()V

    const v1, -0x67860ff

    invoke-interface {v9, v1}, LT/l;->U(I)V

    if-eq v4, v10, :cond_14

    and-int/lit8 v1, v12, 0x40

    if-eqz v1, :cond_13

    invoke-interface {v9, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    goto :goto_c

    :cond_13
    move/from16 v1, v16

    goto :goto_d

    :cond_14
    :goto_c
    const/4 v1, 0x1

    :goto_d
    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_15

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_16

    :cond_15
    new-instance v2, LUe/i;

    invoke-direct {v2, v7, v5}, LUe/i;-><init>(LUe/g;LT/q0;)V

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast v2, Lmh/l;

    invoke-interface {v9}, LT/l;->J()V

    shl-int/lit8 v3, v12, 0x3

    and-int/lit8 v17, v3, 0x70

    const/16 v18, 0x0

    move-object/from16 v1, p0

    move v13, v3

    move-object v3, v9

    move v11, v4

    move/from16 v4, v17

    move-object/from16 p2, v5

    move/from16 v5, v18

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/e;->a(Lmh/l;Landroidx/compose/ui/e;Lmh/l;LT/l;II)V

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v0

    invoke-interface {v9, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/o;

    invoke-interface/range {p2 .. p2}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    const v2, -0x6782d1b

    invoke-interface {v9, v2}, LT/l;->U(I)V

    if-eq v11, v10, :cond_18

    and-int/lit8 v2, v12, 0x40

    if-eqz v2, :cond_17

    invoke-interface {v9, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto :goto_e

    :cond_17
    move/from16 v2, v16

    goto :goto_f

    :cond_18
    :goto_e
    const/4 v2, 0x1

    :goto_f
    and-int/lit16 v3, v12, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_19

    const/16 v16, 0x1

    :cond_19
    or-int v2, v2, v16

    invoke-interface {v9, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1a

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_1b

    :cond_1a
    new-instance v3, LUe/j;

    move-object/from16 v2, p2

    invoke-direct {v3, v7, v2, v0, v14}, LUe/j;-><init>(LUe/g;LT/q0;Landroidx/lifecycle/o;Z)V

    invoke-interface {v9, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    check-cast v3, Lmh/l;

    invoke-interface {v9}, LT/l;->J()V

    and-int/lit16 v5, v13, 0x380

    move-object/from16 v2, p1

    move-object v4, v9

    invoke-static/range {v0 .. v5}, LT/O;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    move v3, v14

    :goto_10
    invoke-interface {v9}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1d

    new-instance v10, LUe/k;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LUe/k;-><init>(Landroidx/compose/ui/e;LUe/g;ZII)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1d
    return-void
.end method

.method private static final i(LUe/g;LT/q0;Landroidx/lifecycle/o;ZLT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lh7/j;

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lh7/j;->getGestureWrapper()Lm7/d;

    move-result-object p4

    if-eqz p4, :cond_0

    new-instance v0, LUe/l;

    invoke-direct {v0, p4}, LUe/l;-><init>(Lm7/d;)V

    goto :goto_0

    :cond_0
    new-instance v0, LUe/m;

    invoke-direct {v0}, LUe/m;-><init>()V

    :goto_0
    invoke-interface {p0, v0}, LUe/g;->e(Lmh/a;)V

    new-instance p0, LUe/n;

    invoke-direct {p0, p1, p3}, LUe/n;-><init>(LT/q0;Z)V

    invoke-interface {p2}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p3

    invoke-virtual {p3, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    new-instance p3, LUe/o$c;

    invoke-direct {p3, p1, p2, p0}, LUe/o$c;-><init>(LT/q0;Landroidx/lifecycle/o;Landroidx/lifecycle/m;)V

    return-object p3
.end method

.method private static final j(Lm7/d;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lm7/d;->o()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final l(LT/q0;ZLandroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "event"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    if-ne p3, p2, :cond_0

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh7/j;

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Lh7/j;->g(Z)V

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/k$a;->ON_PAUSE:Landroidx/lifecycle/k$a;

    if-ne p3, p1, :cond_1

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh7/j;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lh7/j;->f()V

    :cond_1
    :goto_0
    return-void
.end method

.method private static final m(Landroidx/compose/ui/e;LUe/g;ZIILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LUe/o;->h(Landroidx/compose/ui/e;LUe/g;ZLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(LUe/g;Landroid/content/Context;)Lh7/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh7/j;

    invoke-direct {v0, p1}, Lh7/j;-><init>(Landroid/content/Context;)V

    invoke-interface {p0}, LUe/g;->a()Lh7/g;

    move-result-object p1

    invoke-interface {p0}, LUe/g;->d()Lm7/e;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lh7/j;->h(Lh7/g;Lm7/e;)V

    return-object v0
.end method

.method private static final o(LUe/g;LT/q0;Lh7/j;)LYg/J;
    .locals 2

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lh7/j;->getSurfaceView()Li7/c;

    move-result-object v0

    invoke-virtual {v0}, Li7/c;->getController()Li7/b;

    move-result-object v0

    new-instance v1, LUe/o$a;

    invoke-direct {v1, p0}, LUe/o$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Li7/b;->b(Lmh/l;)V

    invoke-virtual {p2}, Lh7/j;->getSurfaceView()Li7/c;

    move-result-object v0

    invoke-virtual {v0}, Li7/c;->getController()Li7/b;

    move-result-object v0

    new-instance v1, LUe/o$b;

    invoke-direct {v1, p0}, LUe/o$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Li7/b;->a(Lmh/l;)V

    invoke-interface {p1, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
