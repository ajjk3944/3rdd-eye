.class public abstract LGf/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LGf/j;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LGf/t;->j(Landroidx/compose/ui/e;LGf/j;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LGf/t;->p(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LGf/t;->n(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LGf/t;->r(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;LGf/j;LGf/u;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LGf/t;->l(Landroidx/compose/ui/e;LGf/j;LGf/u;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/e;LGf/j;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LGf/t;->h(Landroidx/compose/ui/e;LGf/j;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/e;LGf/j;LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/16 v3, 0x30

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "model"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x6c5a0bd8

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v5

    const/4 v6, 0x6

    and-int/lit8 v7, v2, 0x6

    if-nez v7, :cond_1

    invoke-interface {v5, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v2

    goto :goto_1

    :cond_1
    move v7, v2

    :goto_1
    and-int/lit8 v9, v2, 0x30

    const/16 v10, 0x10

    if-nez v9, :cond_3

    invoke-interface {v5, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    move v9, v10

    :goto_2
    or-int/2addr v7, v9

    :cond_3
    and-int/lit8 v9, v7, 0x13

    const/16 v11, 0x12

    if-ne v9, v11, :cond_5

    invoke-interface {v5}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v5}, LT/l;->C()V

    goto/16 :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_6

    const/4 v9, -0x1

    const-string v11, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemMultiLine (WifiScanNetworkItem.kt:176)"

    invoke-static {v4, v7, v9, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/4 v4, 0x0

    const/4 v9, 0x1

    const/4 v11, 0x0

    invoke-static {v0, v4, v3, v9, v11}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    int-to-float v4, v10

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/16 v10, 0x8

    int-to-float v10, v10

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v12

    invoke-static {v3, v4, v12}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v12

    sget-object v13, Lz/c;->a:Lz/c;

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v14

    invoke-virtual {v13, v14}, Lz/c;->n(F)Lz/c$f;

    move-result-object v14

    const/16 v15, 0x36

    invoke-static {v14, v12, v5, v15}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v12

    const/4 v14, 0x0

    invoke-static {v5, v14}, LT/j;->a(LT/l;I)I

    move-result v15

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v5, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-interface {v5, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v5}, LT/l;->I()V

    :goto_4
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v12, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v9

    invoke-static {v8, v6, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v8}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_9

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v8, v3, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/high16 v21, 0x3f800000    # 1.0f

    const/16 v22, 0x0

    move-object/from16 v19, v3

    move-object/from16 v20, v6

    invoke-static/range {v19 .. v24}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual {v13}, Lz/c;->g()Lz/c$m;

    move-result-object v9

    invoke-virtual {v4}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v12

    invoke-static {v9, v12, v5, v14}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v9

    invoke-static {v5, v14}, LT/j;->a(LT/l;I)I

    move-result v12

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v5, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v15

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_c

    invoke-interface {v5, v15}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_c
    invoke-interface {v5}, LT/l;->I()V

    :goto_5
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v15

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v15, v9, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v9

    invoke-static {v15, v13, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v9

    invoke-interface {v15}, LT/l;->o()Z

    move-result v13

    if-nez v13, :cond_d

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_e

    :cond_d
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v15, v13}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v15, v12, v9}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v9

    invoke-static {v15, v8, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v8, Lz/k;->a:Lz/k;

    and-int/lit8 v7, v7, 0x70

    const/4 v8, 0x1

    invoke-static {v11, v1, v5, v7, v8}, LGf/t;->i(Landroidx/compose/ui/e;LGf/j;LT/l;II)V

    const/4 v7, 0x2

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v8, 0x6

    invoke-static {v7, v5, v8}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v8

    add-float/2addr v7, v8

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v20

    const/16 v24, 0xe

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v19, v6

    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    new-instance v8, Ls9/d$c;

    invoke-virtual/range {p1 .. p1}, LGf/j;->a()Ljava/util/List;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/Iterable;

    const/16 v17, 0x3e

    const/16 v18, 0x0

    const-string v11, ", "

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v18}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v9, 0x6

    invoke-static {v7, v8, v5, v9}, LGf/t;->m(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    invoke-interface {v5}, LT/l;->R()V

    invoke-virtual/range {p1 .. p1}, LGf/j;->f()Ls9/d;

    move-result-object v7

    invoke-static {v6, v7, v5, v9}, LGf/t;->q(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    invoke-virtual {v4}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v4

    invoke-interface {v3, v6, v4}, Lz/Y;->c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v5, v4, v4}, LEe/K;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_6
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_10

    new-instance v4, LGf/r;

    invoke-direct {v4, v0, v1, v2}, LGf/r;-><init>(Landroidx/compose/ui/e;LGf/j;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final h(Landroidx/compose/ui/e;LGf/j;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LGf/t;->g(Landroidx/compose/ui/e;LGf/j;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/e;LGf/j;LT/l;II)V
    .locals 30

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "model"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x2f9a0999

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

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

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

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

    move-object v3, v5

    move-object v5, v15

    goto/16 :goto_b

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v4

    goto :goto_5

    :cond_8
    move-object v13, v5

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemNameAndBadges (WifiScanNetworkItem.kt:55)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v3, v15, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v14, 0x0

    invoke-static {v15, v14}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v15, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v3, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_c

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, LGf/j;->b()J

    move-result-wide v5

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v4, 0x0

    move-object v7, v15

    invoke-static/range {v4 .. v9}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v3, v4, v5, v14}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LGf/j;->g()Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LGf/j;->e()Z

    move-result v3

    if-eqz v3, :cond_e

    const v3, -0x4ee025a1

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v15, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->a()Lpa/b;

    move-result-object v3

    :goto_7
    invoke-virtual {v3}, Lpa/b;->a()LL0/U;

    move-result-object v3

    invoke-interface {v15}, LT/l;->J()V

    move-object/from16 v25, v3

    goto :goto_8

    :cond_e
    const v3, -0x4ee020c1

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v15, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    goto :goto_7

    :goto_8
    invoke-virtual/range {p1 .. p1}, LGf/j;->c()Z

    move-result v3

    if-nez v3, :cond_f

    const v3, 0x72dcd413

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v15, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v6

    invoke-interface {v15}, LT/l;->J()V

    goto :goto_9

    :cond_f
    const v3, 0x72ddbc93

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v15, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->d()J

    move-result-wide v6

    invoke-interface {v15}, LT/l;->J()V

    :goto_9
    sget-object v3, LW0/t;->a:LW0/t$a;

    invoke-virtual {v3}, LW0/t$a;->b()I

    move-result v19

    const/16 v28, 0xc30

    const v29, 0x1d7f8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-object v3, v13

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 p0, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, p0

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const v4, -0x4edffeef

    move-object/from16 v5, p0

    invoke-interface {v5, v4}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LGf/j;->d()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LDe/g;

    const/4 v7, 0x0

    invoke-interface {v6, v5, v7}, LDe/g;->c(LT/l;I)V

    goto :goto_a

    :cond_10
    invoke-interface {v5}, LT/l;->J()V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_b
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_12

    new-instance v5, LGf/o;

    invoke-direct {v5, v3, v0, v1, v2}, LGf/o;-><init>(Landroidx/compose/ui/e;LGf/j;II)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final j(Landroidx/compose/ui/e;LGf/j;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LGf/t;->i(Landroidx/compose/ui/e;LGf/j;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/e;LGf/j;LGf/u;LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "model"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "config"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x644aa551    # -3.000254E-22f

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v5

    and-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_1

    invoke-interface {v5, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v3

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    const/16 v8, 0x10

    if-nez v7, :cond_3

    invoke-interface {v5, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move v7, v8

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    if-nez v7, :cond_5

    invoke-interface {v5, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v6, 0x93

    const/16 v9, 0x92

    if-ne v7, v9, :cond_7

    invoke-interface {v5}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v5}, LT/l;->C()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, -0x1

    const-string v9, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemSingleLine (WifiScanNetworkItem.kt:140)"

    invoke-static {v4, v6, v7, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const/16 v4, 0x30

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v0, v9, v4, v10, v7}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    int-to-float v7, v8

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    const/16 v8, 0x8

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v4, v7, v9}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v9

    sget-object v11, Lz/c;->a:Lz/c;

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-virtual {v11, v8}, Lz/c;->n(F)Lz/c$f;

    move-result-object v8

    const/16 v11, 0x36

    invoke-static {v8, v9, v5, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v5, v9}, LT/j;->a(LT/l;I)I

    move-result v11

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v12

    invoke-static {v5, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v13, LE0/g;->K:LE0/g$a;

    invoke-virtual {v13}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v5, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_a
    invoke-interface {v5}, LT/l;->I()V

    :goto_5
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v13}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v8, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->g()Lmh/p;

    move-result-object v8

    invoke-static {v14, v12, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->b()Lmh/p;

    move-result-object v8

    invoke-interface {v14}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_b

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    :cond_b
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v14, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11, v8}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual {v13}, LE0/g$a;->f()Lmh/p;

    move-result-object v8

    invoke-static {v14, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/Z;->a:Lz/Z;

    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-interface {v4, v8, v11, v10}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v10

    and-int/lit8 v6, v6, 0x70

    invoke-static {v10, v1, v5, v6, v9}, LGf/t;->i(Landroidx/compose/ui/e;LGf/j;LT/l;II)V

    invoke-virtual/range {p2 .. p2}, LGf/u;->a()F

    move-result v6

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    new-instance v10, Ls9/d$c;

    invoke-virtual/range {p1 .. p1}, LGf/j;->a()Ljava/util/List;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljava/lang/Iterable;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const-string v13, ", "

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v12 .. v20}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v6, v10, v5, v9}, LGf/t;->m(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    invoke-virtual/range {p2 .. p2}, LGf/u;->b()F

    move-result v6

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LGf/j;->f()Ls9/d;

    move-result-object v10

    invoke-static {v6, v10, v5, v9, v9}, LGf/t;->o(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    invoke-virtual {v7}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    invoke-interface {v4, v8, v6}, Lz/Y;->c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v5, v9, v9}, LEe/K;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_6
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_e

    new-instance v5, LGf/s;

    invoke-direct {v5, v0, v1, v2, v3}, LGf/s;-><init>(Landroidx/compose/ui/e;LGf/j;LGf/u;I)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method private static final l(Landroidx/compose/ui/e;LGf/j;LGf/u;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LGf/t;->k(Landroidx/compose/ui/e;LGf/j;LGf/u;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v13, p1

    move/from16 v14, p3

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5429cec1

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_1

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_3

    invoke-interface {v12, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    move v4, v2

    and-int/lit8 v2, v4, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {v12}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v12}, LT/l;->C()V

    move-object/from16 v26, v12

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemTextChannels (WifiScanNetworkItem.kt:91)"

    invoke-static {v0, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    shr-int/lit8 v0, v4, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v13, v12, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v12, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v21

    invoke-virtual {v2, v12, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v2

    sget-object v5, LW0/t;->a:LW0/t$a;

    invoke-virtual {v5}, LW0/t$a;->b()I

    move-result v15

    shl-int/lit8 v4, v4, 0x3

    and-int/lit8 v23, v4, 0x70

    const/16 v24, 0xc30

    const v25, 0x1d7f8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move-object/from16 v26, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v1, p0

    move-object/from16 v22, v26

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    invoke-interface/range {v26 .. v26}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, LGf/q;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v3, v4}, LGf/q;-><init>(Landroidx/compose/ui/e;Ls9/d;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final n(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LGf/t;->m(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final o(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V
    .locals 31

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "value"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x59118c97

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v5

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v6, v1, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v1, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v5, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v2, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    :goto_2
    move v8, v7

    goto :goto_4

    :cond_4
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_3

    invoke-interface {v5, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    goto :goto_2

    :goto_4
    and-int/lit8 v7, v8, 0x13

    const/16 v9, 0x12

    if-ne v7, v9, :cond_7

    invoke-interface {v5}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v5}, LT/l;->C()V

    move-object v3, v5

    goto :goto_7

    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v30, v4

    goto :goto_6

    :cond_8
    move-object/from16 v30, v6

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v6, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemTextSignal (WifiScanNetworkItem.kt:106)"

    invoke-static {v3, v8, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    shr-int/lit8 v3, v8, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v0, v5, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v5, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->c()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v5, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v6

    shl-int/lit8 v3, v8, 0x3

    and-int/lit8 v27, v3, 0x70

    const/16 v28, 0xc00

    const v29, 0x1dff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v3, v5

    move-object/from16 v5, v30

    move-object/from16 v26, v3

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    move-object/from16 v6, v30

    :goto_7
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, LGf/p;

    invoke-direct {v4, v6, v0, v1, v2}, LGf/p;-><init>(Landroidx/compose/ui/e;Ls9/d;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final p(Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LGf/t;->o(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final q(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V
    .locals 6

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2ac39c1e

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemTextSignalWithMinimalWidth (WifiScanNetworkItem.kt:120)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, LGf/a;->a:LGf/a;

    invoke-virtual {v0}, LGf/a;->a()Lmh/p;

    move-result-object v0

    new-instance v2, LGf/t$a;

    invoke-direct {v2, p1}, LGf/t$a;-><init>(Ls9/d;)V

    const/16 v3, 0x36

    const v4, 0x6992a9f4

    const/4 v5, 0x1

    invoke-static {v4, v5, v2, p2, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x1b0

    invoke-static {p0, v0, v2, p2, v1}, Lqa/d;->d(Landroidx/compose/ui/e;Lmh/p;Lmh/r;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, LGf/n;

    invoke-direct {v0, p0, p1, p3}, LGf/n;-><init>(Landroidx/compose/ui/e;Ls9/d;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method private static final r(Landroidx/compose/ui/e;Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LGf/t;->q(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final s(ILT/l;II)LGf/j;
    .locals 12

    const v0, 0x514faa87

    invoke-interface {p1, v0}, LT/l;->U(I)V

    const/4 v1, 0x1

    and-int/2addr p3, v1

    if-eqz p3, :cond_0

    move p0, v1

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.scan.component.previewNetworkListItem (WifiScanNetworkItem.kt:214)"

    invoke-static {v0, p2, p3, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    sget-object p2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p2}, Lm0/v0$a;->b()J

    move-result-wide v3

    new-instance v5, Ls9/d$c;

    const-string p2, "Very long SSID, UI WiFi long long long"

    invoke-direct {v5, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p2, p3, v0}, [Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v10, Ls9/d$c;

    const-string p2, "41 dBm"

    invoke-direct {v10, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    invoke-static {p2, p0}, Lsh/m;->s(II)Lsh/i;

    move-result-object p0

    new-instance v9, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p0, p2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    move-object p2, p0

    check-cast p2, LZg/Q;

    invoke-virtual {p2}, LZg/Q;->d()I

    sget-object p2, LAf/v$a;->a:LAf/v$a;

    invoke-interface {v9, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p0, LGf/j;

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v11}, LGf/j;-><init>(JLs9/d;ZZLjava/util/List;Ljava/util/List;Ls9/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-object p0
.end method
