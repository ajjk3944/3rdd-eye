.class public abstract Lcom/ui/wifiman/ui/teleport/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final A(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)LL0/U;
    .locals 3

    const v0, -0x2ef80ee9

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.textStyle (TeleportTunnelUi.kt:357)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, Lcom/ui/wifiman/ui/teleport/y$a;

    if-eqz p2, :cond_1

    const p0, -0x2befd734

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object p0

    invoke-virtual {p0}, Lpa/c;->a()Lpa/b;

    move-result-object p0

    invoke-virtual {p0}, Lpa/b;->f()LL0/U;

    move-result-object p0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_1

    :cond_1
    instance-of p2, p0, Lcom/ui/wifiman/ui/teleport/y$b;

    if-nez p2, :cond_3

    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/y$c;

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const p0, -0x2befe16e

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    const p0, -0x2befc5d4

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object p0

    invoke-virtual {p0}, Lpa/c;->b()Lpa/b;

    move-result-object p0

    invoke-virtual {p0}, Lpa/b;->f()LL0/U;

    move-result-object p0

    invoke-interface {p1}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p1}, LT/l;->J()V

    return-object p0
.end method

.method public static synthetic a(LL0/d;Lcom/ui/wifiman/ui/teleport/B;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/J;->k(LL0/d;Lcom/ui/wifiman/ui/teleport/B;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/x;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/J;->h(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/x;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/teleport/J;->j(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/J;->m(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/J;->q(Landroidx/compose/ui/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/teleport/J;->o(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/x;LT/l;I)V
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, -0x37c5dd05

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v11, 0x2

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v11

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x10

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v7, 0x12

    if-ne v5, v7, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object/from16 v30, v15

    goto/16 :goto_7

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v7, "com.ui.wifiman.ui.teleport.ConnectionSpeed (TeleportTunnelUi.kt:367)"

    invoke-static {v3, v4, v5, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    int-to-float v3, v6

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v3, v4, v11, v5}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v30, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v30 .. v30}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v4

    sget-object v31, Lz/c;->a:Lz/c;

    invoke-virtual/range {v31 .. v31}, Lz/c;->f()Lz/c$e;

    move-result-object v5

    const/16 v6, 0x30

    invoke-static {v5, v4, v15, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v13, 0x0

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v32, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    invoke-interface {v3, v14, v12, v10}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual/range {v31 .. v31}, Lz/c;->c()Lz/c$e;

    move-result-object v5

    invoke-virtual/range {v30 .. v30}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    const/16 v9, 0x36

    invoke-static {v5, v6, v15, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_c

    invoke-interface {v15, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_c
    invoke-interface {v15}, LT/l;->I()V

    :goto_5
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v5, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v8, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v8}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_d

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v8, v4, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v33, LPe/a;->a:LPe/a;

    invoke-virtual/range {v33 .. v33}, LPe/a;->d()Ls9/b;

    move-result-object v4

    const/16 v5, 0x14

    int-to-float v9, v5

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v14, v5}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v8, Lff/a;->DOWN:Lff/a;

    const/4 v7, 0x6

    invoke-static {v8, v15, v7}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v16, 0x36

    const/16 v17, 0x4

    const/16 v18, 0x0

    move v12, v7

    move-object/from16 v7, v18

    move-object/from16 v34, v8

    move-object v8, v15

    move/from16 v35, v9

    move/from16 v9, v16

    move/from16 v10, v17

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v14, v4}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v15, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/x;->a()Ls9/d;

    move-result-object v4

    invoke-static {v4, v15, v13}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v10, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v10, v15, v8}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v25

    move-object/from16 v5, v34

    invoke-static {v5, v15, v12}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x1fffa

    const/4 v5, 0x0

    const-wide/16 v16, 0x0

    move/from16 v36, v8

    move-wide/from16 v8, v16

    const/16 v16, 0x0

    move-object/from16 v37, v10

    move-object/from16 v10, v16

    move/from16 v34, v11

    move-object/from16 v11, v16

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v38, v14

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

    const/16 v4, 0x24

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    move-object/from16 v11, v38

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    move-object/from16 v15, p2

    const/4 v12, 0x6

    invoke-static {v4, v15, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    invoke-interface {v3, v11, v4, v5}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v31 .. v31}, Lz/c;->f()Lz/c$e;

    move-result-object v4

    invoke-virtual/range {v30 .. v30}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v4, v5, v15, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v13, 0x0

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_f

    invoke-static {}, LT/j;->c()V

    :cond_f
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_10
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_11

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    :cond_11
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_12
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v33 .. v33}, LPe/a;->e()Ls9/b;

    move-result-object v4

    invoke-static/range {v35 .. v35}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v3, Lff/a;->UP:Lff/a;

    invoke-static {v3, v15, v12}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v9, 0x36

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-static/range {v34 .. v34}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v15, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/teleport/x;->b()Ls9/d;

    move-result-object v4

    invoke-static {v4, v15, v13}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    move/from16 v6, v36

    move-object/from16 v5, v37

    invoke-virtual {v5, v15, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-static {v3, v15, v12}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x1fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v3, 0x0

    move-object/from16 v30, v15

    move-object v15, v3

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v30

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-interface/range {v30 .. v30}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_7
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_14

    new-instance v4, Lcom/ui/wifiman/ui/teleport/G;

    invoke-direct {v4, v0, v1, v2}, Lcom/ui/wifiman/ui/teleport/G;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/x;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method private static final h(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/x;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/teleport/J;->g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/x;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V
    .locals 68

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const/16 v4, 0x30

    const v5, -0x70f2838d

    move-object/from16 v6, p3

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x6

    and-int/lit8 v6, v3, 0x6

    if-nez v6, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

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

    const/16 v13, 0x10

    if-nez v7, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move v7, v13

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    if-nez v7, :cond_5

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    move v10, v6

    and-int/lit16 v6, v10, 0x93

    const/16 v7, 0x92

    if-ne v6, v7, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v4, v15

    goto/16 :goto_8

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_8

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.teleport.ErrorContent (TeleportTunnelUi.kt:300)"

    invoke-static {v5, v10, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v5

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-virtual {v6}, Lz/c;->g()Lz/c$m;

    move-result-object v6

    invoke-static {v6, v5, v15, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_a
    invoke-interface {v15}, LT/l;->I()V

    :goto_5
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v4, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v11, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v11}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_b

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    :cond_b
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v11, v6, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v11, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/k;->a:Lz/k;

    invoke-virtual/range {p0 .. p0}, Lcom/ui/wifiman/ui/teleport/A$a;->c()Ls9/d;

    move-result-object v4

    invoke-static {v4, v15, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    sget-object v4, Lla/a;->a:Lla/a;

    sget v12, Lla/a;->b:I

    invoke-virtual {v4, v15, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->a()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->a()LL0/U;

    move-result-object v27

    invoke-virtual {v4, v15, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v8

    sget-object v32, LW0/j;->b:LW0/j$a;

    invoke-virtual/range {v32 .. v32}, LW0/j$a;->a()I

    move-result v7

    invoke-static {v7}, LW0/j;->h(I)LW0/j;

    move-result-object v18

    const/16 v30, 0x0

    const v31, 0x1fdfa

    const/4 v7, 0x0

    const-wide/16 v16, 0x0

    move/from16 v33, v10

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move/from16 v34, v12

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    move v5, v14

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    move-object/from16 v35, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v35

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v15, v6}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    move-object/from16 v14, v35

    invoke-static {v6, v14, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/ui/wifiman/ui/teleport/A$a;->b()Ls9/d;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v14, v7}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    move/from16 v7, v34

    invoke-virtual {v4, v14, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->a()LL0/U;

    move-result-object v35

    invoke-virtual {v4, v14, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->b()J

    move-result-wide v36

    invoke-virtual/range {v32 .. v32}, LW0/j$a;->a()I

    move-result v55

    const v65, 0xff7ffe

    const/16 v66, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v56, 0x0

    const-wide/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    invoke-static/range {v35 .. v66}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v8

    const v4, -0x7ca28010

    invoke-interface {v14, v4}, LT/l;->U(I)V

    invoke-interface {v14, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    move/from16 v7, v33

    and-int/lit16 v13, v7, 0x380

    const/4 v12, 0x1

    const/16 v11, 0x100

    if-ne v13, v11, :cond_d

    move v7, v12

    goto :goto_6

    :cond_d
    const/4 v7, 0x0

    :goto_6
    or-int/2addr v4, v7

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_e

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_f

    :cond_e
    new-instance v7, Lcom/ui/wifiman/ui/teleport/H;

    invoke-direct {v7, v6, v2}, Lcom/ui/wifiman/ui/teleport/H;-><init>(LL0/d;Lcom/ui/wifiman/ui/teleport/B;)V

    invoke-interface {v14, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v4, v7

    check-cast v4, Lmh/l;

    invoke-interface {v14}, LT/l;->J()V

    const/16 v16, 0x0

    const/16 v17, 0x7a

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v11, v18

    move-object/from16 v12, v19

    move/from16 v67, v13

    move-object v13, v4

    move-object v4, v14

    move-object v5, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v6 .. v16}, LF/h;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;LT/l;II)V

    invoke-virtual/range {p0 .. p0}, Lcom/ui/wifiman/ui/teleport/A$a;->a()Ls9/d;

    move-result-object v6

    const v7, -0x7ca24fbe

    invoke-interface {v4, v7}, LT/l;->U(I)V

    if-nez v6, :cond_10

    goto :goto_7

    :cond_10
    const/16 v7, 0x10

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v8, 0x6

    invoke-static {v7, v4, v8}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v7, 0x190

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v5, v8, v7, v10, v9}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v8, v10, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v6, v4, v7}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v12

    const v6, 0x43ab960d

    invoke-interface {v4, v6}, LT/l;->U(I)V

    move/from16 v8, v67

    const/16 v6, 0x100

    if-ne v8, v6, :cond_11

    move v7, v10

    :cond_11
    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v7, :cond_12

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_13

    :cond_12
    new-instance v6, Lcom/ui/wifiman/ui/teleport/J$a;

    invoke-direct {v6, v2}, Lcom/ui/wifiman/ui/teleport/J$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v4, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v6, Lth/g;

    invoke-interface {v4}, LT/l;->J()V

    move-object v7, v6

    check-cast v7, Lmh/a;

    const/4 v15, 0x6

    const/16 v16, 0xbc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v6, v5

    move-object v14, v4

    invoke-static/range {v6 .. v16}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    :goto_7
    invoke-interface {v4}, LT/l;->J()V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    :goto_8
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_15

    new-instance v5, Lcom/ui/wifiman/ui/teleport/I;

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/ui/wifiman/ui/teleport/I;-><init>(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;I)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_15
    return-void
.end method

.method private static final j(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/ui/wifiman/ui/teleport/J;->i(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(LL0/d;Lcom/ui/wifiman/ui/teleport/B;I)LYg/J;
    .locals 1

    const-string v0, "report"

    invoke-virtual {p0, v0, p2, p2}, LL0/d;->j(Ljava/lang/String;II)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/d$c;

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/B;->p0()V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V
    .locals 10

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6b5e42dd

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

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.TeleportTunnelUi (TeleportTunnelUi.kt:259)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->o()Lf0/c;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v3

    invoke-static {p2, v4}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {p2, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {p2, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {p2}, LT/l;->I()V

    :goto_4
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v3, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v0, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/B;->n0()LLi/N;

    move-result-object v0

    invoke-static {v0, v2, p2, v4, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/ui/teleport/A;

    if-nez v0, :cond_b

    move v4, v1

    :cond_b
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/ui/teleport/J$b;

    invoke-direct {v3, v0, p1}, Lcom/ui/wifiman/ui/teleport/J$b;-><init>(Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;)V

    const/16 v0, 0x36

    const v4, -0x148bb158

    invoke-static {v4, v1, v3, p2, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const/4 v0, 0x0

    const/4 v3, 0x0

    const-string v4, "crossfade"

    move-object v1, v2

    move-object v2, v0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, Lcom/ui/wifiman/ui/teleport/D;

    invoke-direct {v0, p0, p1, p3}, Lcom/ui/wifiman/ui/teleport/D;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final m(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/teleport/J;->l(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V
    .locals 18

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v15, p4

    const v0, 0x7e6faa7e

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v11

    and-int/lit8 v1, v15, 0x6

    if-nez v1, :cond_1

    invoke-interface {v11, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v15

    goto :goto_1

    :cond_1
    move v1, v15

    :goto_1
    and-int/lit8 v2, v15, 0x30

    if-nez v2, :cond_3

    invoke-interface {v11, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v15, 0x180

    if-nez v2, :cond_5

    invoke-interface {v11, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {v11}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v11}, LT/l;->C()V

    move-object/from16 v17, v11

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.TunnelCard (TeleportTunnelUi.kt:64)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    new-instance v0, Lcom/ui/wifiman/ui/teleport/J$c;

    invoke-direct {v0, v13, v14, v12}, Lcom/ui/wifiman/ui/teleport/J$c;-><init>(Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;Landroidx/compose/ui/e;)V

    const/16 v2, 0x36

    const v3, -0x7ca0af4

    const/4 v4, 0x1

    invoke-static {v3, v4, v0, v11, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    and-int/lit8 v0, v1, 0xe

    const/high16 v1, 0x6000000

    or-int v10, v0, v1

    const/16 v16, 0xfe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object v9, v11

    move-object/from16 v17, v11

    move/from16 v11, v16

    invoke-static/range {v0 .. v11}, LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_5
    invoke-interface/range {v17 .. v17}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lcom/ui/wifiman/ui/teleport/E;

    invoke-direct {v1, v12, v13, v14, v15}, Lcom/ui/wifiman/ui/teleport/E;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final o(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/ui/wifiman/ui/teleport/J;->n(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/e;LT/l;I)V
    .locals 13

    const v0, 0x4db56ba4    # 3.804663E8f

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.TunnelCardEmpty (TeleportTunnelUi.kt:152)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    and-int/lit8 v0, v1, 0xe

    invoke-static {p0, p1, v0}, LH9/a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v0, Lcom/ui/wifiman/ui/teleport/a;->a:Lcom/ui/wifiman/ui/teleport/a;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/teleport/a;->a()Lmh/q;

    move-result-object v9

    const/high16 v11, 0x6000000

    const/16 v12, 0xfe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, p1

    invoke-static/range {v1 .. v12}, LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lcom/ui/wifiman/ui/teleport/F;

    invoke-direct {v0, p0, p2}, Lcom/ui/wifiman/ui/teleport/F;-><init>(Landroidx/compose/ui/e;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void
.end method

.method private static final q(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/ui/wifiman/ui/teleport/J;->p(Landroidx/compose/ui/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic r(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/x;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/J;->g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/x;LT/l;I)V

    return-void
.end method

.method public static final synthetic s(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/J;->i(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V

    return-void
.end method

.method public static final synthetic t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/teleport/J;->n(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V

    return-void
.end method

.method public static final synthetic u(Landroidx/compose/ui/e;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/J;->p(Landroidx/compose/ui/e;LT/l;I)V

    return-void
.end method

.method public static final synthetic v(LT/l;I)Lrf/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/teleport/J;->y(LT/l;I)Lrf/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)J
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/J;->z(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic x(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)LL0/U;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/J;->A(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)LL0/U;

    move-result-object p0

    return-object p0
.end method

.method private static final y(LT/l;I)Lrf/f;
    .locals 18

    const v0, 0x3fd7f837

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.previewTopologyState (TeleportTunnelUi.kt:413)"

    move/from16 v4, p1

    invoke-static {v0, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lrf/f;

    new-instance v8, Lrf/e;

    new-instance v4, Ls9/c$a;

    sget v9, Lm8/a;->l0:I

    const/4 v10, 0x0

    const/4 v11, 0x2

    invoke-direct {v4, v9, v10, v11, v10}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Ls9/d$c;

    const-string v2, "Console"

    invoke-direct {v5, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v6, Ls9/d$c;

    const-string v2, "Online"

    invoke-direct {v6, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object v7, Lcom/ui/wifiman/ui/teleport/z;->ONLINE:Lcom/ui/wifiman/ui/teleport/z;

    const-string v3, "0"

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lrf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;)V

    new-instance v2, Lrf/e;

    new-instance v14, Ls9/c$a;

    invoke-direct {v14, v9, v10, v11, v10}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Ls9/d$c;

    const-string v3, "Myself"

    invoke-direct {v15, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Ls9/d$c;

    const-string v4, "Your Device"

    invoke-direct {v3, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v17, 0x0

    const-string v13, "1"

    move-object v12, v2

    move-object/from16 v16, v3

    invoke-direct/range {v12 .. v17}, Lrf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;)V

    new-instance v3, Lcom/ui/wifiman/ui/teleport/y$b;

    const v4, 0x3f19999a    # 0.6f

    invoke-direct {v3, v4}, Lcom/ui/wifiman/ui/teleport/y$b;-><init>(F)V

    invoke-direct {v0, v8, v2, v3}, Lrf/f;-><init>(Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface/range {p0 .. p0}, LT/l;->J()V

    return-object v0
.end method

.method private static final z(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)J
    .locals 3

    const v0, 0x11a7ad04

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.textColor (TeleportTunnelUi.kt:350)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, Lcom/ui/wifiman/ui/teleport/y$a;

    if-eqz p2, :cond_1

    const p0, 0x7c6e6d19

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    instance-of p2, p0, Lcom/ui/wifiman/ui/teleport/y$b;

    if-eqz p2, :cond_2

    const p0, 0x7c6e7679

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->f()Lma/a$f;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$f;->a()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_2
    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/y$c;

    if-eqz p0, :cond_4

    const p0, 0x7c6e8019

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->f()Lma/a$f;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$f;->b()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0

    :cond_4
    const p0, 0x7c6e62ae

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
