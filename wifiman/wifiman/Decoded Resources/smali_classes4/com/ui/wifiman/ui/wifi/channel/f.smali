.class public abstract Lcom/ui/wifiman/ui/wifi/channel/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lcom/ui/wifiman/ui/wifi/channel/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/wifi/channel/f;->f(Lcom/ui/wifiman/ui/wifi/channel/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/wifi/channel/f;->d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;LT/l;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, 0x16222ae6

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v12, 0x2

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v12

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v32, v15

    goto/16 :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.wifi.channel.Content (WifiChannelDetailUi.kt:85)"

    invoke-static {v3, v4, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
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

    const v4, 0x2d5220be

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_7

    const/4 v4, 0x0

    invoke-static {v4, v4, v4, v4}, Lz/h0;->a(IIII)Lz/f0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lz/f0;

    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v3}, LQ/z;->a()Lx0/a;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v0, v5, v6, v12, v6}, Landroidx/compose/ui/input/nestedscroll/a;->b(Landroidx/compose/ui/e;Lx0/a;Lx0/b;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->e()Lma/a$e;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$e;->a()J

    move-result-wide v23

    new-instance v6, Lcom/ui/wifiman/ui/wifi/channel/f$a;

    invoke-direct {v6, v3, v1}, Lcom/ui/wifiman/ui/wifi/channel/f$a;-><init>(LQ/z;Lcom/ui/wifiman/ui/wifi/channel/c;)V

    const v3, 0x3fd2402c

    const/4 v8, 0x1

    const/16 v9, 0x36

    invoke-static {v3, v8, v6, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    new-instance v3, Lcom/ui/wifiman/ui/wifi/channel/f$b;

    invoke-direct {v3, v1}, Lcom/ui/wifiman/ui/wifi/channel/f$b;-><init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V

    const v6, 0x676f04e5

    invoke-static {v6, v8, v3, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v27

    const/high16 v30, 0x6000000

    const v31, 0x2fff4

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    move-object/from16 v32, v15

    move-object v15, v3

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v25, 0x0

    const/16 v29, 0xc06

    move-object/from16 v28, v32

    invoke-static/range {v4 .. v31}, LN/C0;->b(Lz/f0;Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_4
    invoke-interface/range {v32 .. v32}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v4, Lcom/ui/wifiman/ui/wifi/channel/e;

    invoke-direct {v4, v0, v1, v2}, Lcom/ui/wifiman/ui/wifi/channel/e;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_9
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/wifi/channel/f;->c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Lcom/ui/wifiman/ui/wifi/channel/c;LT/l;II)V
    .locals 31

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, -0x4a39e16f

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x1

    if-nez v3, :cond_0

    move-object/from16 v3, p0

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v3, p0

    :cond_1
    move v5, v4

    :goto_0
    or-int/2addr v5, v0

    move v11, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v11, v0

    :goto_1
    and-int/lit8 v5, v11, 0x3

    if-ne v5, v4, :cond_4

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v15}, LT/l;->C()V

    move-object v2, v15

    goto/16 :goto_6

    :cond_4
    :goto_2
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v4, v0, 0x1

    if-eqz v4, :cond_7

    invoke-interface {v15}, LT/l;->H()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v15}, LT/l;->C()V

    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_6

    :goto_3
    and-int/lit8 v11, v11, -0xf

    :cond_6
    move-object v14, v3

    goto/16 :goto_5

    :cond_7
    :goto_4
    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_6

    const v3, -0x72e5f4af

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v4, Lc2/a;->c:I

    invoke-virtual {v3, v15, v4}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/lifecycle/P$c;

    const/4 v9, 0x0

    const/16 v10, 0x10

    const-class v3, Lcom/ui/wifiman/ui/wifi/channel/c;

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

    if-nez v7, :cond_8

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_9

    :cond_8
    new-instance v8, Lye/i;

    invoke-direct {v8, v3, v4, v5}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v15, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    const/4 v4, 0x0

    invoke-static {v6, v8, v15, v4}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v3, Lcom/ui/wifiman/ui/wifi/channel/c;

    goto/16 :goto_3

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    invoke-interface {v15}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_b

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.wifi.channel.WifiChannelDetailUi (WifiChannelDetailUi.kt:55)"

    invoke-static {v2, v11, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-static {v2, v3, v6, v4}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->a()J

    move-result-wide v21

    new-instance v2, Lcom/ui/wifiman/ui/wifi/channel/f$c;

    invoke-direct {v2, v14}, Lcom/ui/wifiman/ui/wifi/channel/f$c;-><init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V

    const v4, -0x48b95a14

    const/16 v7, 0x36

    invoke-static {v4, v6, v2, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    new-instance v2, Lcom/ui/wifiman/ui/wifi/channel/f$d;

    invoke-direct {v2, v14}, Lcom/ui/wifiman/ui/wifi/channel/f$d;-><init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V

    const v4, 0x73977a93

    invoke-static {v4, v6, v2, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v25

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

    const/4 v2, 0x0

    move-object/from16 v30, v14

    move v14, v2

    const-wide/16 v16, 0x0

    move-object v2, v15

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v23, 0x0

    const/16 v27, 0x186

    move-object/from16 v26, v2

    invoke-static/range {v3 .. v29}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    move-object/from16 v3, v30

    :goto_6
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_d

    new-instance v4, Lcom/ui/wifiman/ui/wifi/channel/d;

    invoke-direct {v4, v3, v0, v1}, Lcom/ui/wifiman/ui/wifi/channel/d;-><init>(Lcom/ui/wifiman/ui/wifi/channel/c;II)V

    invoke-interface {v2, v4}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final f(Lcom/ui/wifiman/ui/wifi/channel/c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lcom/ui/wifiman/ui/wifi/channel/f;->e(Lcom/ui/wifiman/ui/wifi/channel/c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/wifi/channel/f;->c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;LT/l;I)V

    return-void
.end method
