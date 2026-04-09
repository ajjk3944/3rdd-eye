.class public abstract LAf/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LAf/c;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LAf/l;->k(Landroidx/compose/ui/e;LAf/c;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LAf/c;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LAf/l;->h(Landroidx/compose/ui/e;LAf/c;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LAf/c$a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LAf/l;->m(Landroidx/compose/ui/e;LAf/c$a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lh9/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LAf/l;->j(Lh9/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lh9/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LAf/l;->g(Lh9/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/e;LAf/c;Lmh/l;LT/l;II)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    move/from16 v9, p4

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x512ba985

    move-object/from16 v2, p3

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v7

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_2

    invoke-interface {v7, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_2
    move v2, v9

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_5

    invoke-interface {v7, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v9, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-interface {v7, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x100

    goto :goto_4

    :cond_8
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v2, v5

    :goto_5
    and-int/lit16 v5, v2, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_a

    invoke-interface {v7}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v7}, LT/l;->C()V

    move-object v3, v4

    move-object v0, v7

    goto/16 :goto_a

    :cond_a
    :goto_6
    if-eqz v3, :cond_c

    const v3, 0x50525e93

    invoke-interface {v7, v3}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_b

    new-instance v3, LAf/g;

    invoke-direct {v3}, LAf/g;-><init>()V

    invoke-interface {v7, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lmh/l;

    invoke-interface {v7}, LT/l;->J()V

    move-object/from16 v20, v3

    goto :goto_7

    :cond_c
    move-object/from16 v20, v4

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_d

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.wifi.component.WifiAccessPoint (WifiAccessPoint.kt:71)"

    invoke-static {v0, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v0

    sget-object v3, Lz/c;->a:Lz/c;

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v3, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    const/16 v4, 0x36

    invoke-static {v3, v0, v7, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v7, v3}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v7}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v7, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    sget-object v11, LE0/g;->K:LE0/g$a;

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v7}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v7}, LT/l;->u()V

    invoke-interface {v7}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-interface {v7, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_f
    invoke-interface {v7}, LT/l;->I()V

    :goto_8
    invoke-static {v7}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v12, v0, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v12, v6, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v12}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_10

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v6, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v12, v5, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v12, v10, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, LAf/c;->c()Ls9/a;

    move-result-object v5

    const/4 v6, 0x1

    if-eqz v5, :cond_12

    move v11, v6

    goto :goto_9

    :cond_12
    move v11, v3

    :goto_9
    new-instance v3, LAf/l$a;

    invoke-direct {v3, v8}, LAf/l$a;-><init>(LAf/c;)V

    const v5, 0x626fc3bf

    invoke-static {v5, v6, v3, v7, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    const v18, 0x180006

    const/16 v19, 0x1e

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v0

    move-object/from16 v17, v7

    invoke-static/range {v10 .. v19}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-interface {v0, v3, v4, v6}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v0

    and-int/lit16 v6, v2, 0x3f0

    const/4 v10, 0x0

    move-object v2, v0

    move-object/from16 v3, p1

    move-object/from16 v4, v20

    move-object v5, v7

    move-object v0, v7

    move v7, v10

    invoke-static/range {v2 .. v7}, LAf/l;->i(Landroidx/compose/ui/e;LAf/c;Lmh/l;LT/l;II)V

    invoke-interface {v0}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    move-object/from16 v3, v20

    :goto_a
    invoke-interface {v0}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v7, LAf/h;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LAf/h;-><init>(Landroidx/compose/ui/e;LAf/c;Lmh/l;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method private static final g(Lh9/a;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/e;LAf/c;Lmh/l;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LAf/l;->f(Landroidx/compose/ui/e;LAf/c;Lmh/l;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/e;LAf/c;Lmh/l;LT/l;II)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const v0, -0x3c4bedcc

    move-object/from16 v3, p3

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v5, p5, 0x1

    const/4 v6, 0x4

    if-eqz v5, :cond_0

    or-int/lit8 v5, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    invoke-interface {v3, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v6

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move v5, v4

    :goto_1
    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_5

    invoke-interface {v3, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v3, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v5, v9

    :goto_5
    and-int/lit16 v9, v5, 0x93

    const/16 v10, 0x92

    if-ne v9, v10, :cond_a

    invoke-interface {v3}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v3}, LT/l;->C()V

    goto/16 :goto_12

    :cond_a
    :goto_6
    if-eqz v7, :cond_c

    const v7, 0x48fe0d2a

    invoke-interface {v3, v7}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_b

    new-instance v7, LAf/i;

    invoke-direct {v7}, LAf/i;-><init>()V

    invoke-interface {v3, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lmh/l;

    invoke-interface {v3}, LT/l;->J()V

    goto :goto_7

    :cond_c
    move-object v7, v8

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_d

    const/4 v8, -0x1

    const-string v9, "com.ui.wifiman.ui.wifi.component.WifiAccessPointContent (WifiAccessPoint.kt:96)"

    invoke-static {v0, v5, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    sget-object v0, Lz/c;->a:Lz/c;

    invoke-virtual {v0}, Lz/c;->g()Lz/c$m;

    move-result-object v5

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v9

    const/4 v14, 0x0

    invoke-static {v5, v9, v3, v14}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v3, v14}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v3, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_f

    invoke-interface {v3, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_f
    invoke-interface {v3}, LT/l;->I()V

    :goto_8
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v13, v5, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v13, v10, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v13}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_10

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    :cond_10
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v13, v9, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v13, v11, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v31, Lz/k;->a:Lz/k;

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x1

    invoke-static {v5, v9, v15, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    invoke-virtual {v8}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v8

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v0, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v0

    const/16 v6, 0x36

    invoke-static {v0, v8, v3, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    invoke-static {v3, v14}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v3, v9}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_12

    invoke-static {}, LT/j;->c()V

    :cond_12
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-interface {v3, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_13
    invoke-interface {v3}, LT/l;->I()V

    :goto_9
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v11, v0, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v11, v10, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v11}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_14

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_15

    :cond_14
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_15
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v11, v9, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-interface {v0, v5, v8, v14}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LAf/c;->e()Ls9/d;

    move-result-object v5

    invoke-static {v5, v3, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    sget-object v8, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v8, v3, v9}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v10

    invoke-virtual {v10}, Lpa/c;->b()Lpa/b;

    move-result-object v10

    invoke-virtual {v10}, Lpa/b;->b()LL0/U;

    move-result-object v26

    invoke-virtual/range {p1 .. p1}, LAf/c;->b()Z

    move-result v10

    if-ne v10, v15, :cond_16

    const v10, 0x3622d568    # 2.42641E-6f

    invoke-interface {v3, v10}, LT/l;->U(I)V

    invoke-virtual {v8, v3, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->a()J

    move-result-wide v8

    invoke-interface {v3}, LT/l;->J()V

    :goto_a
    move-wide/from16 v32, v8

    goto :goto_b

    :cond_16
    if-nez v10, :cond_20

    const v10, 0x3622dbe8

    invoke-interface {v3, v10}, LT/l;->U(I)V

    invoke-virtual {v8, v3, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->c()J

    move-result-wide v8

    invoke-interface {v3}, LT/l;->J()V

    goto :goto_a

    :goto_b
    sget-object v8, LW0/t;->a:LW0/t$a;

    invoke-virtual {v8}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7f8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    move v8, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object v6, v0

    move-object v0, v7

    move-wide/from16 v7, v32

    move-object/from16 v27, v3

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const v5, 0x3622ed9e

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LAf/c;->d()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LDe/g;

    const/4 v15, 0x0

    invoke-interface {v6, v3, v15}, LDe/g;->c(LT/l;I)V

    goto :goto_c

    :cond_17
    const/4 v15, 0x0

    invoke-interface {v3}, LT/l;->J()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-virtual/range {p1 .. p1}, LAf/c;->f()LAf/c$a;

    move-result-object v5

    if-eqz v5, :cond_18

    const/4 v6, 0x1

    goto :goto_d

    :cond_18
    move v6, v15

    :goto_d
    new-instance v5, LAf/l$b;

    invoke-direct {v5, v2, v0}, LAf/l$b;-><init>(LAf/c;Lmh/l;)V

    const v7, 0x7c721202

    const/16 v13, 0x36

    const/4 v14, 0x1

    invoke-static {v7, v14, v5, v3, v13}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const/16 v16, 0x1e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v17, 0x180006

    move-object/from16 v5, v31

    move-object v12, v3

    move v15, v13

    move/from16 v13, v17

    move v1, v14

    move/from16 v14, v16

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LAf/c;->f()LAf/c$a;

    move-result-object v5

    if-eqz v5, :cond_1a

    invoke-virtual/range {p1 .. p1}, LAf/c;->g()LAf/c$a;

    move-result-object v5

    if-nez v5, :cond_19

    invoke-virtual/range {p1 .. p1}, LAf/c;->h()LAf/c$a;

    move-result-object v5

    if-eqz v5, :cond_1a

    :cond_19
    move v6, v1

    goto :goto_e

    :cond_1a
    const/4 v6, 0x0

    :goto_e
    sget-object v16, LAf/a;->a:LAf/a;

    invoke-virtual/range {v16 .. v16}, LAf/a;->a()Lmh/q;

    move-result-object v11

    const/16 v14, 0x1e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, v31

    move-object v12, v3

    move/from16 v13, v17

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LAf/c;->g()LAf/c$a;

    move-result-object v5

    if-eqz v5, :cond_1b

    move v6, v1

    goto :goto_f

    :cond_1b
    const/4 v6, 0x0

    :goto_f
    new-instance v5, LAf/l$c;

    invoke-direct {v5, v2, v0}, LAf/l$c;-><init>(LAf/c;Lmh/l;)V

    const v7, -0x6b285086

    invoke-static {v7, v1, v5, v3, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const/16 v14, 0x1e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, v31

    move-object v12, v3

    move/from16 v13, v17

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LAf/c;->h()LAf/c$a;

    move-result-object v5

    if-eqz v5, :cond_1c

    invoke-virtual/range {p1 .. p1}, LAf/c;->g()LAf/c$a;

    move-result-object v5

    if-eqz v5, :cond_1c

    move v6, v1

    goto :goto_10

    :cond_1c
    const/4 v6, 0x0

    :goto_10
    invoke-virtual/range {v16 .. v16}, LAf/a;->b()Lmh/q;

    move-result-object v11

    const/16 v14, 0x1e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, v31

    move-object v12, v3

    move/from16 v13, v17

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LAf/c;->h()LAf/c$a;

    move-result-object v5

    if-eqz v5, :cond_1d

    move v6, v1

    goto :goto_11

    :cond_1d
    const/4 v6, 0x0

    :goto_11
    new-instance v5, LAf/l$d;

    invoke-direct {v5, v2, v0}, LAf/l$d;-><init>(LAf/c;Lmh/l;)V

    const v7, -0x2650d84

    invoke-static {v7, v1, v5, v3, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const/16 v14, 0x1e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v5, v31

    move-object v12, v3

    move/from16 v13, v17

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    move-object v8, v0

    :goto_12
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_1f

    new-instance v7, LAf/j;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v8

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LAf/j;-><init>(Landroidx/compose/ui/e;LAf/c;Lmh/l;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void

    :cond_20
    const v0, 0x3622ccb8

    invoke-interface {v3, v0}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final j(Lh9/a;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/e;LAf/c;Lmh/l;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LAf/l;->i(Landroidx/compose/ui/e;LAf/c;Lmh/l;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/e;LAf/c$a;LT/l;I)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, 0x46e3dd13

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v13, 0x6

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v8, 0x12

    if-ne v6, v8, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v6, v15

    goto/16 :goto_b

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.wifi.component.WifiAccessPointSignal (WifiAccessPoint.kt:167)"

    invoke-static {v3, v4, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    int-to-float v3, v5

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v4

    const/4 v12, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    invoke-static {v0, v12, v4, v11, v10}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    sget-object v8, Lz/c;->a:Lz/c;

    const/16 v9, 0x8

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    invoke-virtual {v8, v9}, Lz/c;->n(F)Lz/c$f;

    move-result-object v9

    const/16 v13, 0x36

    invoke-static {v9, v6, v15, v13}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v9, 0x0

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v16

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v18, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_8

    invoke-interface {v15, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v12, v6, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v12, v10, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v12}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v12, v4, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/Z;->a:Lz/Z;

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v26, 0x2

    const/16 v27, 0x0

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    move-object/from16 v22, v4

    move-object/from16 v23, v6

    invoke-static/range {v22 .. v27}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual {v8}, Lz/c;->g()Lz/c$m;

    move-result-object v12

    invoke-virtual {v5}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v14

    invoke-static {v12, v14, v15, v9}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v12

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v14

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v15, v10}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_c

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_c
    invoke-interface {v15}, LT/l;->I()V

    :goto_5
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v9, v12, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v12

    invoke-static {v9, v11, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v11

    invoke-interface {v9}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_d

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    :cond_d
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v9, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v9, v12, v11}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v11

    invoke-static {v9, v10, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v9, Lz/k;->a:Lz/k;

    invoke-virtual {v5}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v9

    int-to-float v13, v7

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v8, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v7

    const/16 v10, 0x36

    invoke-static {v7, v9, v15, v10}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v7

    const/4 v9, 0x0

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_f

    invoke-static {}, LT/j;->c()V

    :cond_f
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_10

    invoke-interface {v15, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_10
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v12, v7, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v12, v9, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v12}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_11

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v12, v9, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_12
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v12, v11, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v11, 0x1

    invoke-interface {v4, v6, v14, v11}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual {v5}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v8, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    const/16 v12, 0x36

    invoke-static {v3, v5, v15, v12}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_13

    invoke-static {}, LT/j;->c()V

    :cond_13
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_14
    invoke-interface {v15}, LT/l;->I()V

    :goto_7
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v3, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v9, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v9}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_15

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    :cond_15
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_16
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/4 v3, 0x0

    invoke-interface {v4, v6, v14, v3}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->a()LS8/c;

    move-result-object v4

    invoke-static {v4}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v4

    invoke-static {v4, v15, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v15, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->f()LL0/U;

    move-result-object v25

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v6

    sget-object v8, LW0/t;->a:LW0/t$a;

    invoke-virtual {v8}, LW0/t$a;->b()I

    move-result v19

    const/16 v28, 0xc30

    const v29, 0x1d7f8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    move-object/from16 v11, v16

    move/from16 v17, v12

    move-object/from16 v12, v16

    const-wide/16 v22, 0x0

    move/from16 v30, v13

    move-wide/from16 v13, v22

    move-object/from16 p2, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, p2

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const v4, 0x4e01008d    # 5.4107424E8f

    move-object/from16 v15, p2

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->e()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LDe/g;

    invoke-interface {v5, v15, v3}, LDe/g;->c(LT/l;I)V

    goto :goto_8

    :cond_17
    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v15}, LT/l;->R()V

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->f()LW7/f;

    move-result-object v4

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x1

    invoke-static {v4, v14, v12, v13, v12}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v4

    invoke-static {v4, v15, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v11, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v11, v15, v10}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->b()LL0/U;

    move-result-object v25

    invoke-virtual {v11, v15, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->a()J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x1fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/16 v16, 0x0

    move/from16 v31, v10

    move-object/from16 v10, v16

    move-object/from16 v32, v11

    move-object/from16 v11, v16

    move-object v3, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 p2, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, p2

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-static {v15, v13, v14, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-static/range {v30 .. v30}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v6, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    move-object/from16 v12, p2

    const/16 v7, 0x36

    invoke-static {v6, v5, v12, v7}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v12, v6}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v12}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v12, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v12}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_18

    invoke-static {}, LT/j;->c()V

    :cond_18
    invoke-interface {v12}, LT/l;->u()V

    invoke-interface {v12}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_19

    invoke-interface {v12, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_19
    invoke-interface {v12}, LT/l;->I()V

    :goto_9
    invoke-static {v12}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v5, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v9, v6, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_1a

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    :cond_1a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1b
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v9, v4, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/Z;->a:Lz/Z;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v4, v15, v5, v14}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->c()Lh9/a;

    move-result-object v4

    invoke-virtual {v4}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object v4

    move/from16 v10, v31

    move-object/from16 v11, v32

    invoke-virtual {v11, v12, v10}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->f()LL0/U;

    move-result-object v24

    invoke-virtual {v11, v12, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->c()J

    move-result-wide v6

    sget-object v29, LW0/t;->a:LW0/t$a;

    invoke-virtual/range {v29 .. v29}, LW0/t$a;->b()I

    move-result v19

    const/16 v27, 0xc30

    const v28, 0xd7f8

    const-wide/16 v8, 0x0

    const/16 v16, 0x0

    move v3, v10

    move-object/from16 v10, v16

    move-object/from16 v33, v11

    move-object/from16 v11, v16

    move-object/from16 p2, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v34, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, p2

    invoke-static/range {v4 .. v28}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->b()LS8/d;

    move-result-object v4

    const-string v5, "format(...)"

    if-eqz v4, :cond_1c

    const v4, -0x4be4205b

    move-object/from16 v15, p2

    invoke-interface {v15, v4}, LT/l;->U(I)V

    sget v4, Lm8/c;->R4:I

    const/4 v6, 0x0

    invoke-static {v4, v15, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->d()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->b()LS8/d;

    move-result-object v7

    invoke-virtual {v7}, LS8/d;->getWidth()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v6, v7}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v15}, LT/l;->J()V

    move-object/from16 v5, v33

    const/4 v13, 0x1

    goto :goto_a

    :cond_1c
    move-object/from16 v15, p2

    const v4, -0x4be408f2

    invoke-interface {v15, v4}, LT/l;->U(I)V

    sget v4, Lm8/c;->Q4:I

    const/4 v6, 0x0

    invoke-static {v4, v15, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->d()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v13, 0x1

    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v15}, LT/l;->J()V

    move-object/from16 v5, v33

    :goto_a
    invoke-virtual {v5, v15, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->f()LL0/U;

    move-result-object v24

    invoke-virtual {v5, v15, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual/range {v29 .. v29}, LW0/t$a;->b()I

    move-result v19

    const/16 v27, 0xc30

    const v28, 0xd7fa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move v3, v13

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 p2, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, p2

    invoke-static/range {v4 .. v28}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    move-object/from16 v6, v34

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v6, v4, v3, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    new-instance v5, LBe/B0;

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->f()LW7/f;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LAf/c$a;->g()LW7/f;

    move-result-object v8

    const/4 v10, 0x4

    const/4 v9, 0x0

    move-object v6, v5

    invoke-direct/range {v6 .. v11}, LBe/B0;-><init>(LW7/f;LW7/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, p2

    const/4 v7, 0x6

    invoke-static {v4, v5, v6, v7}, LBe/D0;->b(Landroidx/compose/ui/e;LBe/B0;LT/l;I)V

    invoke-interface {v6}, LT/l;->R()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v6, v5, v3}, LEe/K;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v6}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-static {}, LT/o;->P()V

    :cond_1d
    :goto_b
    invoke-interface {v6}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_1e

    new-instance v4, LAf/k;

    invoke-direct {v4, v0, v1, v2}, LAf/k;-><init>(Landroidx/compose/ui/e;LAf/c$a;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_1e
    return-void
.end method

.method private static final m(Landroidx/compose/ui/e;LAf/c$a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LAf/l;->l(Landroidx/compose/ui/e;LAf/c$a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic n(Landroidx/compose/ui/e;LAf/c$a;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LAf/l;->l(Landroidx/compose/ui/e;LAf/c$a;LT/l;I)V

    return-void
.end method

.method public static final o(Ljava/lang/String;Ls9/a;Ls9/d;ZLjava/util/List;LAf/c$a;LAf/c$a;LAf/c$a;LT/l;II)LAf/c;
    .locals 21

    move/from16 v0, p10

    const v1, -0x43fde809

    move-object/from16 v2, p8

    invoke-interface {v2, v1}, LT/l;->U(I)V

    and-int/lit8 v3, v0, 0x1

    if-eqz v3, :cond_0

    const-string v3, ""

    move-object v5, v3

    goto :goto_0

    :cond_0
    move-object/from16 v5, p0

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    new-instance v3, Ls9/c$a;

    sget v4, Lm8/a;->i:I

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-direct {v3, v4, v6, v7, v6}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v3

    goto :goto_1

    :cond_1
    move-object/from16 v6, p1

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    new-instance v3, Ls9/d$c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Device "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v7, v3

    goto :goto_2

    :cond_2
    move-object/from16 v7, p2

    :goto_2
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    move v8, v3

    goto :goto_3

    :cond_3
    move/from16 v8, p3

    :goto_3
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_4

    sget-object v3, LAf/v$a;->a:LAf/v$a;

    invoke-static {v3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object v9, v3

    goto :goto_4

    :cond_4
    move-object/from16 v9, p4

    :goto_4
    and-int/lit8 v3, v0, 0x20

    const/16 v4, -0x1e

    const/16 v10, -0x2a

    const-string v11, "00:01:02:03:04:05"

    if-eqz v3, :cond_5

    sget-object v13, LS8/c;->GHZ_2_4:LS8/c;

    sget-object v17, LS8/d;->MHZ_20:LS8/d;

    sget-object v3, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v3, v11}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v14

    invoke-static {v14}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v15

    sget-object v3, LS8/l;->f:LS8/l$a;

    invoke-virtual {v3, v10}, LS8/l$a;->a(I)LS8/l;

    move-result-object v18

    invoke-virtual {v3, v4}, LS8/l$a;->a(I)LS8/l;

    move-result-object v19

    new-instance v3, LAf/c$a;

    const/16 v16, 0x20

    move-object v12, v3

    invoke-direct/range {v12 .. v19}, LAf/c$a;-><init>(LS8/c;Lh9/a;Ljava/util/List;ILS8/d;LW7/f;LW7/f;)V

    goto :goto_5

    :cond_5
    move-object/from16 v3, p5

    :goto_5
    and-int/lit8 v12, v0, 0x40

    if-eqz v12, :cond_6

    sget-object v14, LS8/c;->GHZ_5:LS8/c;

    sget-object v18, LS8/d;->MHZ_20:LS8/d;

    sget-object v12, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v12, v11}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v12, LAf/p$a;->a:LAf/p$a;

    invoke-static {v12}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    sget-object v12, LS8/l;->f:LS8/l$a;

    invoke-virtual {v12, v10}, LS8/l$a;->a(I)LS8/l;

    move-result-object v19

    invoke-virtual {v12, v4}, LS8/l$a;->a(I)LS8/l;

    move-result-object v20

    new-instance v12, LAf/c$a;

    const/16 v17, 0x20

    move-object v13, v12

    invoke-direct/range {v13 .. v20}, LAf/c$a;-><init>(LS8/c;Lh9/a;Ljava/util/List;ILS8/d;LW7/f;LW7/f;)V

    goto :goto_6

    :cond_6
    move-object/from16 v12, p6

    :goto_6
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    sget-object v0, LS8/c;->GHZ_6:LS8/c;

    sget-object v13, LS8/d;->MHZ_20:LS8/d;

    sget-object v14, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v14, v11}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v14

    sget-object v15, LS8/l;->f:LS8/l$a;

    invoke-virtual {v15, v10}, LS8/l$a;->a(I)LS8/l;

    move-result-object v10

    invoke-virtual {v15, v4}, LS8/l$a;->a(I)LS8/l;

    move-result-object v4

    new-instance v15, LAf/c$a;

    const/16 v16, 0x20

    move-object/from16 p0, v15

    move-object/from16 p1, v0

    move-object/from16 p2, v11

    move-object/from16 p3, v14

    move/from16 p4, v16

    move-object/from16 p5, v13

    move-object/from16 p6, v10

    move-object/from16 p7, v4

    invoke-direct/range {p0 .. p7}, LAf/c$a;-><init>(LS8/c;Lh9/a;Ljava/util/List;ILS8/d;LW7/f;LW7/f;)V

    goto :goto_7

    :cond_7
    move-object/from16 v15, p7

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, -0x1

    const-string v4, "com.ui.wifiman.ui.wifi.component.previewWifiAccessPoint (WifiAccessPoint.kt:286)"

    move/from16 v10, p9

    invoke-static {v1, v10, v0, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    new-instance v0, LAf/c;

    move-object v4, v0

    move-object v10, v3

    move-object v11, v12

    move-object v12, v15

    invoke-direct/range {v4 .. v12}, LAf/c;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;ZLjava/util/List;LAf/c$a;LAf/c$a;LAf/c$a;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    invoke-interface/range {p8 .. p8}, LT/l;->J()V

    return-object v0
.end method
