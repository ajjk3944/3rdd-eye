.class public abstract LBe/D0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LBe/B0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LBe/D0;->c(Landroidx/compose/ui/e;LBe/B0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LBe/B0;LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v9, p3

    const-string v1, "modifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "model"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x63a064c5

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v7

    and-int/lit8 v2, v9, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v7, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_3

    invoke-interface {v7, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_5

    invoke-interface {v7}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v7}, LT/l;->C()V

    move-object v12, v7

    goto/16 :goto_9

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.component.WirelessSignalBar (WirelessSignalBar.kt:52)"

    invoke-static {v1, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-virtual/range {p1 .. p1}, LBe/B0;->b()LW7/f;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    invoke-virtual {v1}, LW7/f;->g()F

    move-result v1

    :goto_4
    move v10, v1

    goto :goto_5

    :cond_7
    invoke-virtual/range {p1 .. p1}, LBe/B0;->a()Z

    move-result v1

    if-eqz v1, :cond_8

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_8
    move v10, v2

    :goto_5
    const/16 v16, 0xc00

    const/16 v17, 0x16

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "signal"

    const/4 v14, 0x0

    move-object v15, v7

    invoke-static/range {v10 .. v17}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LBe/B0;->c()LW7/f;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, LW7/f;->g()F

    move-result v1

    move v10, v1

    goto :goto_6

    :cond_9
    move v10, v2

    :goto_6
    const/16 v16, 0xc00

    const/16 v17, 0x16

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "signal max"

    const/4 v14, 0x0

    move-object v15, v7

    invoke-static/range {v10 .. v17}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v10

    const v1, -0x3bced2e6

    invoke-interface {v7, v1}, LT/l;->U(I)V

    const v1, 0xca3d8b5

    invoke-interface {v7, v1}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-interface {v7, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/d;

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_a

    new-instance v2, Lb1/z;

    invoke-direct {v2, v1}, Lb1/z;-><init>(LY0/d;)V

    invoke-interface {v7, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lb1/z;

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v1, v5, :cond_b

    new-instance v1, Lb1/l;

    invoke-direct {v1}, Lb1/l;-><init>()V

    invoke-interface {v7, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v5, v1

    check-cast v5, Lb1/l;

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    const/4 v15, 0x0

    if-ne v1, v11, :cond_c

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v15, v3, v15}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v7, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v1, LT/q0;

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v3, v11, :cond_d

    new-instance v3, Lb1/o;

    invoke-direct {v3, v5}, Lb1/o;-><init>(Lb1/l;)V

    invoke-interface {v7, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lb1/o;

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v11, v12, :cond_e

    sget-object v11, LYg/J;->a:LYg/J;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v12

    invoke-static {v11, v12}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v11

    invoke-interface {v7, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v17, v11

    check-cast v17, LT/q0;

    invoke-interface {v7, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    const/16 v14, 0x101

    invoke-interface {v7, v14}, LT/l;->i(I)Z

    move-result v12

    const/4 v13, 0x0

    const/4 v15, 0x1

    or-int/2addr v11, v12

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_10

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v12, v11, :cond_f

    goto :goto_7

    :cond_f
    move v9, v15

    const/4 v8, 0x0

    goto :goto_8

    :cond_10
    :goto_7
    new-instance v12, LBe/D0$a;

    move-object v11, v12

    move-object/from16 v18, v12

    move-object/from16 v12, v17

    move-object v13, v2

    move/from16 v16, v14

    move-object v14, v3

    move v9, v15

    const/4 v8, 0x0

    move/from16 v15, v16

    move-object/from16 v16, v1

    invoke-direct/range {v11 .. v16}, LBe/D0$a;-><init>(LT/q0;Lb1/z;Lb1/o;ILT/q0;)V

    move-object/from16 v11, v18

    invoke-interface {v7, v11}, LT/l;->K(Ljava/lang/Object;)V

    move-object v12, v11

    :goto_8
    move-object v11, v12

    check-cast v11, LC0/C;

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v12, v13, :cond_11

    new-instance v12, LBe/D0$b;

    invoke-direct {v12, v1, v3}, LBe/D0$b;-><init>(LT/q0;Lb1/o;)V

    invoke-interface {v7, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v12, Lmh/a;

    invoke-interface {v7, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_12

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_13

    :cond_12
    new-instance v3, LBe/D0$c;

    invoke-direct {v3, v2}, LBe/D0$c;-><init>(Lb1/z;)V

    invoke-interface {v7, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v3, Lmh/l;

    const/4 v1, 0x0

    invoke-static {v0, v1, v3, v9, v8}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    new-instance v13, LBe/D0$d;

    move-object v1, v13

    move-object/from16 v2, v17

    move-object v3, v5

    move-object v4, v12

    move-object/from16 v5, p1

    move-object v12, v7

    move-object v7, v10

    invoke-direct/range {v1 .. v7}, LBe/D0$d;-><init>(LT/q0;Lb1/l;Lmh/a;LBe/B0;LT/z1;LT/z1;)V

    const/16 v1, 0x36

    const v2, 0x478ef317

    invoke-static {v2, v9, v13, v12, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    const/16 v6, 0x30

    const/4 v7, 0x0

    move-object v2, v8

    move-object v4, v11

    move-object v5, v12

    invoke-static/range {v2 .. v7}, LC0/w;->a(Landroidx/compose/ui/e;Lmh/p;LC0/C;LT/l;II)V

    invoke-interface {v12}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    :goto_9
    invoke-interface {v12}, LT/l;->z()LT/X0;

    move-result-object v1

    if-eqz v1, :cond_15

    new-instance v2, LBe/C0;

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v2, v0, v3, v4}, LBe/C0;-><init>(Landroidx/compose/ui/e;LBe/B0;I)V

    invoke-interface {v1, v2}, LT/X0;->a(Lmh/p;)V

    :cond_15
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LBe/B0;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LBe/D0;->b(Landroidx/compose/ui/e;LBe/B0;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
