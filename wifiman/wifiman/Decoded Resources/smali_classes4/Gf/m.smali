.class public abstract LGf/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LGf/k;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LGf/m;->c(Landroidx/compose/ui/e;LGf/k;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LGf/k;LT/l;II)V
    .locals 35

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/4 v3, 0x2

    const/4 v4, 0x6

    const-string v5, "model"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x94e86ad

    move-object/from16 v6, p2

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v12, 0x1

    and-int/lit8 v6, v2, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v7, v1, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v1, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    move v8, v3

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v1

    :goto_1
    and-int/2addr v3, v2

    const/16 v9, 0x10

    if-eqz v3, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    move v3, v9

    :goto_2
    or-int/2addr v8, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v8, 0x13

    const/16 v10, 0x12

    if-ne v3, v10, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v15

    goto/16 :goto_b

    :cond_7
    :goto_4
    if-eqz v6, :cond_8

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_5

    :cond_8
    move-object v3, v7

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.wifi.scan.component.WifiScanNetworkItemExtended (WifiScanNetworkItemExtended.kt:56)"

    invoke-static {v5, v8, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    int-to-float v5, v9

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    const/16 v6, 0x8

    int-to-float v14, v6

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v3, v5, v6}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v11, Lz/c;->a:Lz/c;

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v11, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    sget-object v32, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v32 .. v32}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v7

    invoke-static {v6, v7, v15, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_b

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v4

    invoke-static {v9, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v9, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_c

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v9, v5, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/Z;->a:Lz/Z;

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const v6, -0x47dbdf17

    invoke-interface {v15, v6}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v6

    invoke-interface {v15, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LY0/d;

    sget-object v9, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v9, v15, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->a()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->a()LL0/U;

    move-result-object v8

    move/from16 v18, v14

    invoke-virtual {v8}, LL0/U;->s()J

    move-result-wide v13

    invoke-interface {v6, v13, v14}, LY0/l;->n0(J)F

    move-result v6

    invoke-static {v6}, LY0/h;->d(F)LY0/h;

    move-result-object v6

    invoke-virtual {v6}, LY0/h;->s()F

    move-result v6

    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {v32 .. v32}, Lf0/c$a;->e()Lf0/c;

    move-result-object v8

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v8

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v14

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_f

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_f
    invoke-interface {v15}, LT/l;->I()V

    :goto_7
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v10, v8, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v8

    invoke-static {v10, v14, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v8

    invoke-interface {v10}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_10

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_11

    :cond_10
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v10, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v10, v12, v8}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v8

    invoke-static {v10, v6, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v6, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual/range {p1 .. p1}, LGf/k;->b()J

    move-result-wide v12

    const/4 v10, 0x0

    const/4 v14, 0x1

    const/4 v6, 0x0

    move/from16 v33, v7

    move-wide v7, v12

    move-object v13, v9

    move-object v9, v15

    const/4 v12, 0x0

    move-object v12, v11

    move v11, v14

    invoke-static/range {v6 .. v11}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-interface {v15}, LT/l;->R()V

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    invoke-interface {v4, v5, v6, v7}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {v32 .. v32}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v7

    invoke-interface {v4, v6, v7}, Lz/Y;->c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v7, 0x4

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v8

    invoke-virtual {v12, v8}, Lz/c;->n(F)Lz/c$f;

    move-result-object v8

    invoke-virtual/range {v32 .. v32}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v9

    const/4 v10, 0x6

    invoke-static {v8, v9, v15, v10}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v8

    const/4 v14, 0x0

    invoke-static {v15, v14}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_12

    invoke-static {}, LT/j;->c()V

    :cond_12
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_13

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_13
    invoke-interface {v15}, LT/l;->I()V

    :goto_8
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v11, v8, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v8

    invoke-static {v11, v10, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v8

    invoke-interface {v11}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_14

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_15

    :cond_14
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9, v8}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_15
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v8

    invoke-static {v11, v6, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v6, Lz/k;->a:Lz/k;

    invoke-static/range {v18 .. v18}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v12, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v8

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v12, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v9

    new-instance v6, LGf/m$a;

    invoke-direct {v6, v0}, LGf/m$a;-><init>(LGf/k;)V

    const/16 v7, 0x36

    const v10, -0x74955054

    const/4 v11, 0x1

    invoke-static {v10, v11, v6, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v12

    const v14, 0x1801b0

    const/16 v16, 0x39

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object v7, v8

    move-object v8, v9

    move v9, v10

    move v10, v11

    move-object/from16 v11, v17

    move-object/from16 v34, v13

    move-object v13, v15

    move-object/from16 p0, v3

    move-object v3, v15

    move/from16 v15, v16

    invoke-static/range {v6 .. v15}, Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LGf/k;->a()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_16

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->M4:I

    invoke-virtual/range {p1 .. p1}, LGf/k;->a()Ljava/util/List;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljava/lang/Iterable;

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const-string v10, ", "

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Ls9/d$b;-><init>(ILjava/util/List;)V

    :goto_9
    const/4 v15, 0x0

    goto :goto_a

    :cond_16
    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->L4:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    goto :goto_9

    :goto_a
    invoke-static {v6, v3, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    move/from16 v8, v33

    move-object/from16 v7, v34

    invoke-virtual {v7, v3, v8}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v9

    invoke-virtual {v9}, Lpa/c;->b()Lpa/b;

    move-result-object v9

    invoke-virtual {v9}, Lpa/b;->a()LL0/U;

    move-result-object v27

    invoke-virtual {v7, v3, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->c()J

    move-result-wide v8

    sget-object v7, LW0/t;->a:LW0/t$a;

    invoke-virtual {v7}, LW0/t$a;->b()I

    move-result v21

    const/16 v30, 0xc30

    const v31, 0x1d7fa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v3

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-virtual/range {v32 .. v32}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lz/Y;->c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LGf/k;->e()Ls9/d;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v6, v7, v3, v8}, LGf/t;->q(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    invoke-virtual/range {v32 .. v32}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lz/Y;->c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v3, v8, v8}, LEe/K;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-static {}, LT/o;->P()V

    :cond_17
    move-object/from16 v7, p0

    :goto_b
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_18

    new-instance v4, LGf/l;

    invoke-direct {v4, v7, v0, v1, v2}, LGf/l;-><init>(Landroidx/compose/ui/e;LGf/k;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_18
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LGf/k;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LGf/m;->b(Landroidx/compose/ui/e;LGf/k;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final d(ILT/l;II)LGf/k;
    .locals 15

    const v0, -0x5b91058e

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, LT/l;->U(I)V

    const/4 v2, 0x1

    and-int/lit8 v3, p3, 0x1

    if-eqz v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, p0

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wifi.scan.component.previewNetworkItemExtendedModel (WifiScanNetworkItemExtended.kt:128)"

    move/from16 v6, p2

    invoke-static {v0, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->b()J

    move-result-wide v5

    new-instance v7, Ls9/d$c;

    const-string v0, "Very long SSID, UI WiFi"

    invoke-direct {v7, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v2, v4}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v12, Ls9/d$c;

    const-string v0, "41 dBm"

    invoke-direct {v12, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-static {v0, v3}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    new-instance v11, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    sget-object v2, LAf/v$a;->a:LAf/v$a;

    invoke-interface {v11, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    sget-object v13, LS8/c;->GHZ_2_4:LS8/c;

    new-instance v0, LGf/k;

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v14}, LGf/k;-><init>(JLs9/d;ZZLjava/util/List;Ljava/util/List;Ls9/d;LS8/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    return-object v0
.end method
