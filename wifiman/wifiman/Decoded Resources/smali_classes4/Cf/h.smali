.class public abstract LCf/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LCf/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LCf/h;->f(Landroidx/compose/ui/e;LCf/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LCf/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LCf/h;->h(Landroidx/compose/ui/e;LCf/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;LCf/d;LT/l;II)V
    .locals 35

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, 0x3ccab386

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x1

    const/4 v12, 0x2

    if-eqz v4, :cond_0

    or-int/lit8 v5, v1, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v12

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v6, v15

    goto/16 :goto_6

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v14, v4

    goto :goto_5

    :cond_8
    move-object v14, v5

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wifi.network.Content (WifiNetworkDetailUi.kt:97)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v4, LQ/y;->a:LQ/y;

    sget v3, LQ/y;->g:I

    shl-int/lit8 v10, v3, 0xc

    const/16 v11, 0xf

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v15

    invoke-virtual/range {v4 .. v11}, LQ/y;->b(LQ/A;Lmh/a;Lr/i;Lr/z;LT/l;II)LQ/z;

    move-result-object v3

    const/4 v4, 0x3

    const/4 v13, 0x0

    invoke-static {v13, v13, v15, v13, v4}, LA/C;->c(IILT/l;II)LA/B;

    move-result-object v4

    const v5, 0x59a21ca9

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    sget-object v32, LT/l;->a:LT/l$a;

    invoke-virtual/range {v32 .. v32}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_a

    invoke-static {v13, v13, v13, v13}, Lz/h0;->a(IIII)Lz/f0;

    move-result-object v5

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v28, v5

    check-cast v28, Lz/f0;

    invoke-interface {v15}, LT/l;->J()V

    const v5, 0x59a22546

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual/range {v32 .. v32}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_b

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, LT/h1;->a(J)LT/o0;

    move-result-object v5

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v11, v5

    check-cast v11, LT/o0;

    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v3}, LQ/z;->a()Lx0/a;

    move-result-object v5

    const/4 v10, 0x0

    invoke-static {v14, v5, v10, v12, v10}, Landroidx/compose/ui/input/nestedscroll/a;->b(Landroidx/compose/ui/e;Lx0/a;Lx0/b;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->e()Lma/a$e;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$e;->a()J

    move-result-wide v23

    new-instance v6, LCf/h$a;

    invoke-direct {v6, v0, v3, v11}, LCf/h$a;-><init>(LCf/d;LQ/z;LT/o0;)V

    const v7, 0x667ac8cc

    const/4 v8, 0x1

    const/16 v9, 0x36

    invoke-static {v7, v8, v6, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    new-instance v6, LCf/h$b;

    invoke-direct {v6, v0, v4}, LCf/h$b;-><init>(LCf/d;LA/B;)V

    const v12, -0x71e8727b

    invoke-static {v12, v8, v6, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v27

    const/high16 v30, 0x6000000

    const v31, 0x2fff4

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v10, v12

    const/4 v12, 0x0

    move-object/from16 p0, v11

    move v11, v12

    const/16 v16, 0x0

    move-object/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v33, v14

    move/from16 v14, v16

    const/16 v16, 0x0

    move-object/from16 p2, v15

    move-object/from16 v15, v16

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v25, 0x0

    const/16 v29, 0xc06

    move-object/from16 v34, v4

    move-object/from16 v4, v28

    move-object/from16 v28, p2

    invoke-static/range {v4 .. v31}, LN/C0;->b(Lz/f0;Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static/range {p0 .. p0}, LCf/h;->d(LT/o0;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const v5, 0x59a50b85

    move-object/from16 v6, p2

    invoke-interface {v6, v5}, LT/l;->U(I)V

    move-object/from16 v5, v34

    invoke-interface {v6, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v6, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_c

    invoke-virtual/range {v32 .. v32}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_d

    :cond_c
    new-instance v8, LCf/h$c;

    const/4 v9, 0x0

    move-object/from16 v7, p0

    invoke-direct {v8, v5, v3, v7, v9}, LCf/h$c;-><init>(LA/B;LQ/z;LT/o0;Ldh/e;)V

    invoke-interface {v6, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lmh/p;

    invoke-interface {v6}, LT/l;->J()V

    const/4 v3, 0x0

    invoke-static {v4, v8, v6, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    move-object/from16 v5, v33

    :goto_6
    invoke-interface {v6}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, LCf/f;

    invoke-direct {v4, v5, v0, v1, v2}, LCf/f;-><init>(Landroidx/compose/ui/e;LCf/d;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final d(LT/o0;)J
    .locals 2

    invoke-interface {p0}, LT/f0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final e(LT/o0;J)V
    .locals 0

    invoke-interface {p0, p1, p2}, LT/o0;->m(J)V

    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;LCf/d;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LCf/h;->c(Landroidx/compose/ui/e;LCf/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/e;LCf/d;LT/l;II)V
    .locals 32

    move/from16 v0, p3

    move/from16 v1, p4

    const v2, -0x1755beb5

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

    if-nez v6, :cond_5

    and-int/lit8 v6, v1, 0x2

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v15, v6}, LT/l;->T(Ljava/lang/Object;)Z

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

    :goto_3
    move v11, v5

    goto :goto_4

    :cond_5
    move-object/from16 v6, p1

    goto :goto_3

    :goto_4
    and-int/lit8 v5, v11, 0x13

    const/16 v7, 0x12

    if-ne v5, v7, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v2, v15

    goto/16 :goto_a

    :cond_7
    :goto_5
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v5, v0, 0x1

    if-eqz v5, :cond_a

    invoke-interface {v15}, LT/l;->H()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v15}, LT/l;->C()V

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_9

    and-int/lit8 v11, v11, -0x71

    :cond_9
    move-object/from16 v30, v4

    move-object v3, v6

    goto/16 :goto_9

    :cond_a
    :goto_6
    if-eqz v3, :cond_b

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v12, v3

    goto :goto_7

    :cond_b
    move-object v12, v4

    :goto_7
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

    const-class v3, LCf/d;

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

    const/4 v4, 0x0

    invoke-static {v6, v8, v15, v4}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v3, LCf/d;

    and-int/lit8 v11, v11, -0x71

    :goto_8
    move-object/from16 v30, v12

    goto :goto_9

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object v3, v6

    goto :goto_8

    :goto_9
    invoke-interface {v15}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_10

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wifi.network.WifiNetworkDetailUi (WifiNetworkDetailUi.kt:69)"

    invoke-static {v2, v11, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->a()J

    move-result-wide v21

    new-instance v2, LCf/h$d;

    invoke-direct {v2, v3}, LCf/h$d;-><init>(LCf/d;)V

    const v4, 0x27ecd050

    const/4 v6, 0x1

    const/16 v7, 0x36

    invoke-static {v4, v6, v2, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    new-instance v2, LCf/h$e;

    invoke-direct {v2, v3}, LCf/h$e;-><init>(LCf/d;)V

    const v4, 0x73334789

    invoke-static {v4, v6, v2, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v25

    and-int/lit8 v2, v11, 0xe

    or-int/lit16 v2, v2, 0x180

    move/from16 v27, v2

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move-object v2, v15

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v23, 0x0

    move-object/from16 v31, v3

    move-object/from16 v3, v30

    move-object/from16 v26, v2

    invoke-static/range {v3 .. v29}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    move-object/from16 v4, v30

    move-object/from16 v6, v31

    :goto_a
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_12

    new-instance v3, LCf/e;

    invoke-direct {v3, v4, v6, v0, v1}, LCf/e;-><init>(Landroidx/compose/ui/e;LCf/d;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final h(Landroidx/compose/ui/e;LCf/d;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LCf/h;->g(Landroidx/compose/ui/e;LCf/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic i(Landroidx/compose/ui/e;LCf/d;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LCf/h;->c(Landroidx/compose/ui/e;LCf/d;LT/l;II)V

    return-void
.end method

.method public static final synthetic j(LT/o0;)J
    .locals 2

    invoke-static {p0}, LCf/h;->d(LT/o0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic k(LT/o0;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LCf/h;->e(LT/o0;J)V

    return-void
.end method
