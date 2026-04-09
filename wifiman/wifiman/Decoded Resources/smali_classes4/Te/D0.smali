.class public abstract LTe/D0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LTe/B0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTe/D0;->c(Landroidx/compose/ui/e;LTe/B0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LTe/B0;LT/l;I)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "model"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x6f22f39c

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x6

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x2

    const/4 v13, 0x4

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v13

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v12, 0x20

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v12

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v15

    goto/16 :goto_15

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.signal.components.SignalTabStatsItem (SignalTabStatsItem.kt:61)"

    invoke-static {v3, v4, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/16 v3, 0x3c

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static {v0, v3, v4, v5, v6}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v11, Lz/c;->a:Lz/c;

    const/16 v4, 0x8

    int-to-float v10, v4

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v11, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    sget-object v30, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v30 .. v30}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    const/16 v9, 0x36

    invoke-static {v4, v5, v15, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v8, 0x0

    invoke-static {v15, v8}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v31, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v15, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v6, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v6, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v6}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_9

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v31 .. v31}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v6, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v8, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v8, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LTe/B0;->a()LTe/N;

    move-result-object v5

    const v6, -0x2d5b6f87

    invoke-interface {v15, v6}, LT/l;->U(I)V

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_b

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_d

    :cond_b
    invoke-virtual/range {p1 .. p1}, LTe/B0;->a()LTe/N;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-virtual {v5, v4}, LTe/N;->getColor-vNxB06k(Lma/a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    goto :goto_5

    :cond_c
    const/4 v6, 0x0

    :goto_5
    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lm0/v0;

    invoke-interface {v15}, LT/l;->J()V

    const/4 v5, 0x1

    if-eqz v6, :cond_e

    move/from16 v17, v5

    goto :goto_6

    :cond_e
    const/16 v17, 0x0

    :goto_6
    new-instance v4, LTe/D0$a;

    invoke-direct {v4, v6}, LTe/D0$a;-><init>(Lm0/v0;)V

    const v6, 0x4fa141a0

    invoke-static {v6, v5, v4, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v18

    const v19, 0x180006

    const/16 v20, 0x1e

    const/4 v6, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v4, v3

    move/from16 v5, v17

    move/from16 v33, v7

    move-object/from16 v7, v21

    move-object/from16 v35, v8

    move-object/from16 v8, v22

    move-object/from16 v9, v23

    move/from16 v16, v10

    move-object/from16 v10, v18

    move-object/from16 p2, v11

    move-object v11, v15

    move v14, v12

    move/from16 v12, v19

    move/from16 v13, v20

    invoke-static/range {v4 .. v13}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LTe/B0;->c()Ls9/a;

    move-result-object v4

    const v5, -0x2d5b4ee0

    invoke-interface {v15, v5}, LT/l;->U(I)V

    if-nez v4, :cond_f

    const/4 v0, 0x6

    goto :goto_7

    :cond_f
    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v6, v14

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/16 v13, 0x30

    const/16 v14, 0x3e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v12, v15

    const/4 v0, 0x6

    invoke-static/range {v4 .. v14}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    sget-object v4, LYg/J;->a:LYg/J;

    :goto_7
    invoke-interface {v15}, LT/l;->J()V

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    invoke-interface {v3, v6, v4, v5}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lz/c;->b()Lz/c$f;

    move-result-object v7

    invoke-virtual/range {v30 .. v30}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v8

    invoke-static {v7, v8, v15, v0}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v7

    const/4 v13, 0x0

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_10

    invoke-static {}, LT/j;->c()V

    :cond_10
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_11
    invoke-interface {v15}, LT/l;->I()V

    :goto_8
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v7, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v10, v9, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_12

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    :cond_12
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_13
    invoke-virtual/range {v31 .. v31}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v10, v5, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/k;->a:Lz/k;

    invoke-static/range {v16 .. v16}, LY0/h;->j(F)F

    move-result v5

    move-object/from16 v7, p2

    invoke-virtual {v7, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    invoke-virtual/range {v30 .. v30}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v8

    const/16 v14, 0x36

    invoke-static {v5, v8, v15, v14}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_14

    invoke-static {}, LT/j;->c()V

    :cond_14
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_15
    invoke-interface {v15}, LT/l;->I()V

    :goto_9
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v5, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v11, v9, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v11}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_16

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_17

    :cond_16
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_17
    invoke-virtual/range {v31 .. v31}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v11, v10, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-interface {v3, v6, v4, v13}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LTe/B0;->e()Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v13}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    move/from16 v12, v33

    move-object/from16 v3, v35

    invoke-virtual {v3, v15, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->b()LL0/U;

    move-result-object v25

    invoke-virtual/range {p1 .. p1}, LTe/B0;->g()Z

    move-result v8

    if-eqz v8, :cond_18

    const v8, 0x741f35da

    invoke-interface {v15, v8}, LT/l;->U(I)V

    invoke-virtual {v3, v15, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->a()J

    move-result-wide v8

    :goto_a
    invoke-interface {v15}, LT/l;->J()V

    move-wide/from16 v32, v8

    goto :goto_b

    :cond_18
    const v8, 0x741f395a

    invoke-interface {v15, v8}, LT/l;->U(I)V

    invoke-virtual {v3, v15, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->b()J

    move-result-wide v8

    goto :goto_a

    :goto_b
    sget-object v34, LW0/t;->a:LW0/t$a;

    invoke-virtual/range {v34 .. v34}, LW0/t$a;->b()I

    move-result v19

    const/16 v28, 0xc30

    const v29, 0x1d7f8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move/from16 v37, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move v0, v13

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 p2, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v38, v6

    move-object/from16 v36, v7

    move-wide/from16 v6, v32

    move-object/from16 v26, p2

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LTe/B0;->f()LDe/a;

    move-result-object v4

    const v5, 0x741f4b61

    move-object/from16 v15, p2

    invoke-interface {v15, v5}, LT/l;->U(I)V

    if-nez v4, :cond_19

    goto :goto_c

    :cond_19
    invoke-interface {v4, v15, v0}, LDe/a;->c(LT/l;I)V

    sget-object v4, LYg/J;->a:LYg/J;

    :goto_c
    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v15}, LT/l;->R()V

    invoke-virtual/range {p1 .. p1}, LTe/B0;->d()Ls9/d;

    move-result-object v4

    const v5, -0x60240113

    invoke-interface {v15, v5}, LT/l;->U(I)V

    if-nez v4, :cond_1a

    move-object/from16 p2, v15

    move/from16 v39, v37

    move-object/from16 v40, v38

    goto :goto_d

    :cond_1a
    const/4 v13, 0x4

    int-to-float v4, v13

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    move-object/from16 v14, v38

    invoke-static {v14, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v4, v15, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/B0;->d()Ls9/d;

    move-result-object v4

    invoke-static {v4, v15, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    move/from16 v12, v37

    invoke-virtual {v3, v15, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->f()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v15, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual/range {v34 .. v34}, LW0/t$a;->b()I

    move-result v19

    const/16 v28, 0xc30

    const v29, 0x1d7fa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move/from16 v39, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v40, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

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

    sget-object v4, LYg/J;->a:LYg/J;

    :goto_d
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-virtual/range {v36 .. v36}, Lz/c;->b()Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v30 .. v30}, Lf0/c$a;->j()Lf0/c$b;

    move-result-object v5

    move-object/from16 v6, p2

    const/16 v7, 0x36

    invoke-static {v4, v5, v6, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v6, v0}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v6}, LT/l;->G()LT/x;

    move-result-object v7

    move-object/from16 v15, v40

    invoke-static {v6, v15}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v6}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_1b

    invoke-static {}, LT/j;->c()V

    :cond_1b
    invoke-interface {v6}, LT/l;->u()V

    invoke-interface {v6}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_1c

    invoke-interface {v6, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_e

    :cond_1c
    invoke-interface {v6}, LT/l;->I()V

    :goto_e
    invoke-static {v6}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v4, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v9, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v31 .. v31}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_1d

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    :cond_1d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1e
    invoke-virtual/range {v31 .. v31}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v9, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {p1 .. p1}, LTe/B0;->h()Ls9/d;

    move-result-object v4

    const v5, -0x6023b9b7

    invoke-interface {v6, v5}, LT/l;->U(I)V

    if-nez v4, :cond_1f

    move-object/from16 p2, v6

    move-object v0, v15

    move/from16 v41, v39

    goto/16 :goto_13

    :cond_1f
    invoke-virtual/range {p1 .. p1}, LTe/B0;->h()Ls9/d;

    move-result-object v4

    invoke-static {v4, v6, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LTe/B0;->i()Z

    move-result v5

    if-nez v5, :cond_20

    const v5, 0x741faca0

    invoke-interface {v6, v5}, LT/l;->U(I)V

    move/from16 v7, v39

    invoke-virtual {v3, v6, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->a()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->c()LL0/U;

    move-result-object v5

    :goto_f
    invoke-interface {v6}, LT/l;->J()V

    move-object/from16 v25, v5

    goto :goto_10

    :cond_20
    move/from16 v7, v39

    const v5, 0x741fb1be

    invoke-interface {v6, v5}, LT/l;->U(I)V

    invoke-virtual {v3, v6, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v5

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p1}, LTe/B0;->i()Z

    move-result v5

    if-nez v5, :cond_21

    const v5, 0x741fbbba

    invoke-interface {v6, v5}, LT/l;->U(I)V

    invoke-virtual {v3, v6, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->a()J

    move-result-wide v8

    :goto_11
    invoke-interface {v6}, LT/l;->J()V

    move-wide/from16 v30, v8

    goto :goto_12

    :cond_21
    const v5, 0x741fbf3a

    invoke-interface {v6, v5}, LT/l;->U(I)V

    invoke-virtual {v3, v6, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->c()J

    move-result-wide v8

    goto :goto_11

    :goto_12
    const/16 v28, 0x0

    const v29, 0x1fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    move-object v0, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 p2, v6

    move/from16 v41, v7

    move-wide/from16 v6, v30

    move-object/from16 v26, p2

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v4, LYg/J;->a:LYg/J;

    :goto_13
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LTe/B0;->j()Ls9/d;

    move-result-object v4

    const v5, -0x60238b65

    move-object/from16 v15, p2

    invoke-interface {v15, v5}, LT/l;->U(I)V

    if-nez v4, :cond_22

    move-object v3, v15

    goto :goto_14

    :cond_22
    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v4, 0x6

    invoke-static {v0, v15, v4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/B0;->j()Ls9/d;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v0, v15, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    move/from16 v0, v41

    invoke-virtual {v3, v15, v0}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->f()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v15, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->c()J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x1fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v0, 0x0

    move-object v3, v15

    move-object v15, v0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v3

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_14
    invoke-interface {v3}, LT/l;->J()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {}, LT/o;->P()V

    :cond_23
    :goto_15
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_24

    new-instance v3, LTe/C0;

    move-object/from16 v4, p0

    invoke-direct {v3, v4, v1, v2}, LTe/C0;-><init>(Landroidx/compose/ui/e;LTe/B0;I)V

    invoke-interface {v0, v3}, LT/X0;->a(Lmh/p;)V

    :cond_24
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LTe/B0;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LTe/D0;->b(Landroidx/compose/ui/e;LTe/B0;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
