.class public abstract Lxe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lf2/w;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/e;->f(Lf2/w;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LN/o0;)Z
    .locals 0

    invoke-static {p0}, Lxe/e;->e(LN/o0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lxe/w0;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lxe/e;->h(Landroidx/compose/ui/e;Lxe/w0;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;Lxe/w0;LT/l;II)V
    .locals 30

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "params"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x64f6ff0f

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v11

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v5, v1, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v11, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

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

    invoke-interface {v11, v0}, LT/l;->T(Ljava/lang/Object;)Z

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

    invoke-interface {v11}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v11}, LT/l;->C()V

    goto/16 :goto_8

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v22, v4

    goto :goto_5

    :cond_8
    move-object/from16 v22, v5

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.WifimanAppUi (WiFiManAppUi.kt:63)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lxe/w0;->a()Lorg/kodein/di/DI;

    move-result-object v13

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v3

    invoke-interface {v11, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_a

    sget-object v4, Ldh/j;->a:Ldh/j;

    invoke-static {v4, v11}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v4

    new-instance v5, LT/A;

    invoke-direct {v5, v4}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    move-object v4, v5

    :cond_a
    check-cast v4, LT/A;

    invoke-virtual {v4}, LT/A;->a()LIi/N;

    move-result-object v16

    instance-of v4, v3, Landroidx/lifecycle/o;

    if-eqz v4, :cond_b

    move-object v4, v3

    check-cast v4, Landroidx/lifecycle/o;

    move-object v15, v4

    goto :goto_6

    :cond_b
    const/4 v15, 0x0

    :goto_6
    if-eqz v15, :cond_14

    const v4, -0xadbb7c

    invoke-interface {v11, v4}, LT/l;->U(I)V

    invoke-interface {v11, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_c

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_d

    :cond_c
    new-instance v5, Lvf/h;

    invoke-direct {v5, v3}, Lvf/h;-><init>(Landroid/content/Context;)V

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    move-object v3, v5

    check-cast v3, Lvf/h;

    invoke-interface {v11}, LT/l;->J()V

    const/4 v10, 0x0

    new-array v4, v10, [Lf2/D;

    invoke-static {v4, v11, v10}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v9

    new-array v4, v10, [Lf2/D;

    invoke-static {v4, v11, v10}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v8

    sget-object v4, LN/o0;->Hidden:LN/o0;

    const v5, -0xad91e5

    invoke-interface {v11, v5}, LT/l;->U(I)V

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_e

    new-instance v5, Lxe/b;

    invoke-direct {v5}, Lxe/b;-><init>()V

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v6, v5

    check-cast v6, Lmh/l;

    invoke-interface {v11}, LT/l;->J()V

    const/16 v17, 0xd86

    const/16 v18, 0x2

    const/4 v5, 0x0

    const/4 v7, 0x1

    move-object/from16 v23, v8

    move-object v8, v11

    move-object v14, v9

    move/from16 v9, v17

    move v0, v10

    move/from16 v10, v18

    invoke-static/range {v4 .. v10}, LN/m0;->j(LN/o0;Lr/i;Lmh/l;ZLT/l;II)LN/n0;

    move-result-object v4

    const v5, -0xad7cf2

    invoke-interface {v11, v5}, LT/l;->U(I)V

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_f

    new-instance v5, Lxe/f$c;

    new-instance v6, Lxe/c;

    invoke-direct {v6, v14}, Lxe/c;-><init>(Lf2/w;)V

    const/16 v28, 0x1

    const/16 v29, 0x0

    const-wide/16 v25, 0x0

    move-object/from16 v24, v5

    move-object/from16 v27, v6

    invoke-direct/range {v24 .. v29}, Lxe/f$c;-><init>(JLmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v5, Lxe/f$c;

    invoke-interface {v11}, LT/l;->J()V

    const v6, -0xad65a5

    invoke-interface {v11, v6}, LT/l;->U(I)V

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_10

    new-instance v6, Lxe/v0;

    invoke-static {v13}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v7

    invoke-interface {v7}, Lrj/n2;->g()Lrj/m2;

    move-result-object v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v9, Lxe/e$b;

    invoke-direct {v9}, Lxe/e$b;-><init>()V

    invoke-virtual {v9}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v9

    invoke-static {v9}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v9

    const-string v10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v10, LP7/a;

    invoke-direct {v8, v9, v10}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    invoke-interface {v7, v8, v9}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LP7/a;

    invoke-direct {v6, v7}, Lxe/v0;-><init>(LP7/a;)V

    invoke-virtual {v6, v14}, Lxe/v0;->d(Lf2/n;)V

    move-object/from16 v7, v23

    invoke-virtual {v6, v7}, Lxe/v0;->d(Lf2/n;)V

    invoke-interface {v11, v6}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_7

    :cond_10
    move-object/from16 v7, v23

    :goto_7
    check-cast v6, Lxe/v0;

    invoke-interface {v11}, LT/l;->J()V

    invoke-static {v11, v0}, LQe/i;->g(LT/l;I)LT/z1;

    move-result-object v19

    invoke-static {}, Lta/i;->c()LT/H0;

    move-result-object v0

    const v8, -0xad2474

    invoke-interface {v11, v8}, LT/l;->U(I)V

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v8, v9, :cond_11

    new-instance v8, LO9/d;

    new-instance v9, Lcom/bumptech/glide/request/f;

    invoke-direct {v9}, Lcom/bumptech/glide/request/f;-><init>()V

    sget-object v10, LE2/a;->e:LE2/a;

    invoke-virtual {v9, v10}, Lcom/bumptech/glide/request/a;->f(LE2/a;)Lcom/bumptech/glide/request/a;

    move-result-object v9

    move-object/from16 v25, v9

    check-cast v25, Lcom/bumptech/glide/request/f;

    const/16 v27, 0x5

    const/16 v28, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v23, v8

    invoke-direct/range {v23 .. v28}, LO9/d;-><init>(Lcom/bumptech/glide/i;Lcom/bumptech/glide/request/f;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v11, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v8, LO9/d;

    invoke-interface {v11}, LT/l;->J()V

    invoke-virtual {v0, v8}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v23

    invoke-static {}, Lze/c;->c()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v13}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v24

    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v5}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v25

    invoke-static {}, Lxe/B;->J()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v4}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v26

    invoke-static {}, Lxe/t0;->d()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v6}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v27

    invoke-static {}, Landroidx/compose/ui/platform/k0;->s()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v28

    invoke-static {}, LQe/i;->f()LT/H0;

    move-result-object v0

    invoke-static/range {v19 .. v19}, Lxe/e;->g(LT/z1;)LQe/d;

    move-result-object v3

    invoke-virtual {v0, v3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v29

    filled-new-array/range {v23 .. v29}, [LT/I0;

    move-result-object v0

    new-instance v3, Lxe/e$a;

    move-object v12, v3

    move-object v5, v14

    move-object v14, v15

    move-object v15, v4

    move-object/from16 v17, v5

    move-object/from16 v18, v7

    move-object/from16 v20, v22

    move-object/from16 v21, v6

    invoke-direct/range {v12 .. v21}, Lxe/e$a;-><init>(Lorg/kodein/di/DI;Landroidx/lifecycle/o;LN/n0;LIi/N;Lf2/w;Lf2/w;LT/z1;Landroidx/compose/ui/e;Lxe/r0;)V

    const/16 v4, 0x36

    const v5, 0x2658b24f

    const/4 v6, 0x1

    invoke-static {v5, v6, v3, v11, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    sget v4, LT/I0;->i:I

    or-int/lit8 v4, v4, 0x30

    invoke-static {v0, v3, v11, v4}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    move-object/from16 v5, v22

    :goto_8
    invoke-interface {v11}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v3, Lxe/d;

    move-object/from16 v4, p1

    invoke-direct {v3, v5, v4, v1, v2}, Lxe/d;-><init>(Landroidx/compose/ui/e;Lxe/w0;II)V

    invoke-interface {v0, v3}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void

    :cond_14
    new-instance v0, Ljava/lang/ClassCastException;

    const-string v1, "Local context is not lifecycle owner"

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final e(LN/o0;)Z
    .locals 2

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Modal bottom sheet state change: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final f(Lf2/w;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lf2/n;->Z()Z

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(LT/z1;)LQe/d;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LQe/d;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/e;Lxe/w0;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lxe/e;->d(Landroidx/compose/ui/e;Lxe/w0;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic i(LT/z1;)LQe/d;
    .locals 0

    invoke-static {p0}, Lxe/e;->g(LT/z1;)LQe/d;

    move-result-object p0

    return-object p0
.end method
