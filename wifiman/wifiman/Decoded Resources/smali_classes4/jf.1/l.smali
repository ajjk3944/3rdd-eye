.class public abstract Ljf/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ljf/h;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljf/l;->f(Landroidx/compose/ui/e;Ljf/h;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ljf/g;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljf/l;->d(Landroidx/compose/ui/e;Ljf/g;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;Ljf/g;LT/l;II)V
    .locals 40

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/4 v3, 0x6

    const v4, 0x2e075ca1

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v14

    const/4 v15, 0x1

    and-int/lit8 v5, v2, 0x1

    const/4 v6, 0x4

    const/4 v7, 0x2

    if-eqz v5, :cond_0

    or-int/lit8 v8, v1, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v1, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v14, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v6

    goto :goto_0

    :cond_1
    move v9, v7

    :goto_0
    or-int/2addr v9, v1

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v1

    :goto_1
    and-int/lit8 v10, v2, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v9, v9, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v1, 0x30

    if-nez v10, :cond_5

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :cond_5
    :goto_3
    and-int/lit8 v10, v9, 0x13

    const/16 v12, 0x12

    if-ne v10, v12, :cond_7

    invoke-interface {v14}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v14}, LT/l;->C()V

    move-object/from16 v31, v14

    goto/16 :goto_9

    :cond_7
    :goto_4
    if-eqz v5, :cond_8

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v5

    goto :goto_5

    :cond_8
    move-object v13, v8

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, -0x1

    const-string v8, "com.ui.wifiman.ui.speedtest.result.Header (SpeedtestResultDetailContentUi.kt:209)"

    invoke-static {v4, v9, v5, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v4, Lz/c;->a:Lz/c;

    int-to-float v5, v7

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    sget-object v31, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v7

    invoke-static {v5, v7, v14, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v12, 0x0

    invoke-static {v14, v12}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v14, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v32, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v14, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v14}, LT/l;->I()V

    :goto_6
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v10, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_c

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    :cond_c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v10, v9, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/k;->a:Lz/k;

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v10, 0x0

    const/4 v9, 0x0

    invoke-static {v11, v10, v15, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    int-to-float v8, v6

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v4, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v7

    invoke-static {v6, v7, v14, v3}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v14, v12}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v14, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_f

    invoke-interface {v14, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_f
    invoke-interface {v14}, LT/l;->I()V

    :goto_7
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v10, v6, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v10, v9, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_10

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    :cond_10
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v10, v5, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v15, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, Ljf/g;->a()Ls9/b;

    move-result-object v5

    const/16 v6, 0x10

    int-to-float v10, v6

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v9, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v9, v14, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lma/a;->a()Lma/a$a;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lma/a$a;->d()Lr9/a$a;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lr9/a$a;->f()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v17

    const/16 v18, 0x30

    const/16 v19, 0x4

    const/16 v20, 0x0

    move v3, v7

    move-object/from16 v7, v17

    move/from16 v33, v8

    move-object/from16 v8, v20

    move-object/from16 v23, v13

    move-object v13, v9

    move-object v9, v14

    move/from16 v34, v10

    move/from16 v10, v18

    move-object/from16 p0, v11

    move/from16 v11, v19

    invoke-static/range {v5 .. v11}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    move-object/from16 v16, v15

    move-object/from16 v17, p0

    invoke-static/range {v16 .. v21}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Ljf/g;->b()Ls9/d;

    move-result-object v5

    invoke-static {v5, v14, v12}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    invoke-virtual {v13, v14, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->a()LL0/U;

    move-result-object v26

    invoke-virtual {v13, v14, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v7

    sget-object v35, LW0/t;->a:LW0/t$a;

    invoke-virtual/range {v35 .. v35}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7f8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    move-object v12, v15

    move-object/from16 v37, v13

    move-object/from16 v36, v23

    move-object v13, v15

    const-wide/16 v15, 0x0

    move-object/from16 p2, v14

    move-wide v14, v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, p2

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const v5, 0x3f333333    # 0.7f

    move-object/from16 v14, p0

    invoke-static {v14, v5}, Lwf/c;->c(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Ljf/g;->f()Ls9/d;

    move-result-object v5

    move-object/from16 v15, p2

    const/4 v13, 0x0

    invoke-static {v5, v15, v13}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move-object/from16 v12, v37

    invoke-virtual {v12, v15, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v12, v15, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->b()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x1fff8

    move-object/from16 v38, v12

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v39, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    move-object/from16 v6, v39

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v6, v7, v5, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static/range {v33 .. v33}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v4, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v7

    move-object/from16 v14, p2

    const/4 v8, 0x6

    invoke-static {v4, v7, v14, v8}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v14, v7}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v14, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_12

    invoke-static {}, LT/j;->c()V

    :cond_12
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_13

    invoke-interface {v14, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_13
    invoke-interface {v14}, LT/l;->I()V

    :goto_8
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v4, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v10, v9, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_14

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    :cond_14
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_15
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v10, v5, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static/range {v34 .. v34}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v4, v14, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, Ljf/g;->e()Ls9/d;

    move-result-object v4

    invoke-static {v4, v14, v7}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move-object/from16 v4, v38

    invoke-virtual {v4, v14, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v4, v14, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v7

    invoke-virtual/range {v35 .. v35}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7fa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v3, 0x0

    move-object/from16 v31, v14

    move-wide v14, v3

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v31

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {v31 .. v31}, LT/l;->R()V

    invoke-interface/range {v31 .. v31}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    move-object/from16 v8, v36

    :goto_9
    invoke-interface/range {v31 .. v31}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_17

    new-instance v4, Ljf/j;

    invoke-direct {v4, v8, v0, v1, v2}, Ljf/j;-><init>(Landroidx/compose/ui/e;Ljf/g;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;Ljf/g;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljf/l;->c(Landroidx/compose/ui/e;Ljf/g;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;Ljf/h;LT/l;II)V
    .locals 31

    move/from16 v0, p3

    move/from16 v1, p4

    const/4 v2, 0x6

    const v3, -0x9f889e2

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x1

    and-int/lit8 v4, v1, 0x1

    const/4 v12, 0x2

    if-eqz v4, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

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
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    const/16 v11, 0x10

    const/16 v10, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x2

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v10

    goto :goto_2

    :cond_3
    move-object/from16 v7, p1

    :cond_4
    move v8, v11

    :goto_2
    or-int/2addr v6, v8

    :goto_3
    move/from16 v16, v6

    goto :goto_4

    :cond_5
    move-object/from16 v7, p1

    goto :goto_3

    :goto_4
    and-int/lit8 v6, v16, 0x13

    const/16 v8, 0x12

    if-ne v6, v8, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v7

    goto/16 :goto_15

    :cond_7
    :goto_5
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v6, v0, 0x1

    const/4 v9, 0x0

    if-eqz v6, :cond_a

    invoke-interface {v15}, LT/l;->H()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v15}, LT/l;->C()V

    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_9

    and-int/lit8 v16, v16, -0x71

    :cond_9
    move-object v11, v5

    move-object v10, v7

    move v2, v9

    move/from16 v9, v16

    goto/16 :goto_9

    :cond_a
    :goto_6
    if-eqz v4, :cond_b

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v17, v4

    goto :goto_7

    :cond_b
    move-object/from16 v17, v5

    :goto_7
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_f

    const v4, -0x72e5f4af

    invoke-interface {v15, v4}, LT/l;->U(I)V

    sget-object v4, Lc2/a;->a:Lc2/a;

    sget v5, Lc2/a;->c:I

    invoke-virtual {v4, v15, v5}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v5

    if-eqz v5, :cond_e

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Landroidx/lifecycle/P$c;

    const/16 v18, 0x0

    const/16 v19, 0x10

    const-class v4, Ljf/h;

    const/4 v6, 0x0

    const/4 v8, 0x0

    move v2, v9

    move-object v9, v15

    move/from16 v10, v18

    move/from16 v11, v19

    invoke-static/range {v4 .. v11}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v4

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v5

    invoke-interface {v15, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v6

    invoke-interface {v15, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v7

    invoke-interface {v15, v7}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v7

    const v8, 0x318a4a49

    invoke-interface {v15, v8}, LT/l;->U(I)V

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {v15, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-interface {v15, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_c

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_d

    :cond_c
    new-instance v9, Lye/i;

    invoke-direct {v9, v4, v5, v6}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v15, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v9, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v7, v9, v15, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v4, Ljf/h;

    and-int/lit8 v16, v16, -0x71

    move-object v10, v4

    :goto_8
    move/from16 v9, v16

    move-object/from16 v11, v17

    goto :goto_9

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move v2, v9

    move-object v10, v7

    goto :goto_8

    :goto_9
    invoke-interface {v15}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_10

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailContentUi (SpeedtestResultDetailContentUi.kt:48)"

    invoke-static {v3, v9, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    const/4 v3, 0x0

    const/4 v8, 0x0

    invoke-static {v11, v3, v14, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v20

    invoke-static {v2, v15, v2, v14}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v21

    const/16 v25, 0xe

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-virtual {v7}, Lz/c;->g()Lz/c$m;

    move-result-object v5

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v6

    invoke-static {v5, v6, v15, v2}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v15, v2}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_11

    invoke-static {}, LT/j;->c()V

    :cond_11
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_12

    invoke-interface {v15, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_12
    invoke-interface {v15}, LT/l;->I()V

    :goto_a
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v3

    invoke-static {v12, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v12, v13, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v12}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_13

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    :cond_13
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v12, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_14
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v12, v4, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual {v10}, Ljf/h;->p0()LLi/N;

    move-result-object v4

    invoke-static {v4, v8, v15, v2, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljf/g;

    const v5, -0x3a4f9162

    invoke-interface {v15, v5}, LT/l;->U(I)V

    const/16 v13, 0x36

    if-nez v4, :cond_15

    move-object v2, v7

    move/from16 v21, v9

    move-object/from16 p1, v10

    move-object/from16 v22, v11

    move-object/from16 p2, v15

    goto :goto_b

    :cond_15
    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v6, 0x0

    invoke-static {v5, v6, v14, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v12, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v12, v15, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    const/4 v12, 0x2

    invoke-static {v5, v2, v6, v12, v8}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    new-instance v5, Ljf/l$a;

    invoke-direct {v5, v11, v4, v10}, Ljf/l$a;-><init>(Landroidx/compose/ui/e;Ljf/g;Ljf/h;)V

    const v4, 0x7298ed60

    invoke-static {v4, v14, v5, v15, v13}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v12

    const/high16 v18, 0x6000000

    const/16 v20, 0xfe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object v4, v2

    move-object v2, v7

    move-object/from16 v7, v21

    move-object/from16 v8, v22

    move/from16 v21, v9

    move-object/from16 v9, v23

    move-object/from16 p1, v10

    move-object/from16 v10, v24

    move-object/from16 v22, v11

    move-object/from16 v11, v25

    move-object v13, v15

    move/from16 v14, v18

    move-object/from16 p2, v15

    move/from16 v15, v20

    invoke-static/range {v4 .. v15}, LB9/h;->i(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ls9/a;Lmh/a;Lmh/a;LB9/b;LB9/b;Lmh/q;LT/l;II)V

    sget-object v4, LYg/J;->a:LYg/J;

    :goto_b
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, Ljf/h;->o0()LLi/N;

    move-result-object v4

    move-object/from16 v15, p2

    const/4 v5, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-static {v4, v13, v15, v5, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljf/e;

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    invoke-static {v11, v4, v14, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    if-eqz v12, :cond_16

    move v5, v14

    goto :goto_c

    :cond_16
    const/4 v5, 0x0

    :goto_c
    sget-object v4, Ljf/a;->a:Ljf/a;

    invoke-virtual {v4}, Ljf/a;->a()Lmh/q;

    move-result-object v10

    const/16 v18, 0x1c

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v20, 0x180186

    move-object v4, v3

    move-object/from16 v27, v11

    move-object v11, v15

    move-object/from16 v28, v12

    move/from16 v12, v20

    move-object v0, v13

    move/from16 v13, v18

    invoke-static/range {v4 .. v13}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    move-object/from16 v13, v27

    const/4 v4, 0x0

    invoke-static {v13, v4, v14, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    move-object/from16 v4, v28

    if-eqz v4, :cond_17

    move v5, v14

    goto :goto_d

    :cond_17
    const/4 v5, 0x0

    :goto_d
    new-instance v7, Ljf/l$b;

    move-object/from16 v12, p1

    invoke-direct {v7, v4, v12}, Ljf/l$b;-><init>(Ljf/e;Ljf/h;)V

    const v4, -0x15c66b5d

    const/16 v8, 0x36

    invoke-static {v4, v14, v7, v15, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const/16 v18, 0x1c

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v3

    move-object v11, v15

    move-object v3, v12

    move/from16 v12, v20

    move-object/from16 v29, v13

    move/from16 v13, v18

    invoke-static/range {v4 .. v13}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-virtual {v3}, Ljf/h;->n0()LLi/N;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v0, v15, v5, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v18, v4

    check-cast v18, Ljf/c;

    const v4, -0x3a4d5b67

    invoke-interface {v15, v4}, LT/l;->U(I)V

    if-nez v18, :cond_18

    move v2, v14

    goto/16 :goto_14

    :cond_18
    invoke-static {v0, v15, v5, v14}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    move-object/from16 v13, v29

    const/4 v4, 0x0

    invoke-static {v13, v4, v14, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    const/16 v4, 0x10

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v5, v4, v6}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v5, 0x4

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v2, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v2, v5, v15, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v15, v5}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_19

    invoke-static {}, LT/j;->c()V

    :cond_19
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_e

    :cond_1a
    invoke-interface {v15}, LT/l;->I()V

    :goto_e
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v2, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v7, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_1b

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1c

    :cond_1b
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1c
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v7, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const v2, 0xc278c78

    invoke-interface {v15, v2}, LT/l;->U(I)V

    invoke-virtual/range {v18 .. v18}, Ljf/c;->a()Z

    move-result v2

    if-eqz v2, :cond_22

    const/4 v2, 0x0

    invoke-static {v13, v2, v14, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget v2, Lm8/c;->d:I

    const/4 v5, 0x0

    invoke-static {v2, v15, v5}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v10

    const v2, 0xc27a7cc

    invoke-interface {v15, v2}, LT/l;->U(I)V

    and-int/lit8 v2, v21, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v12, 0x20

    if-le v2, v12, :cond_1d

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    :cond_1d
    and-int/lit8 v2, v21, 0x30

    if-ne v2, v12, :cond_1f

    :cond_1e
    move v2, v14

    goto :goto_f

    :cond_1f
    const/4 v2, 0x0

    :goto_f
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_20

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_21

    :cond_20
    new-instance v5, Ljf/l$c;

    invoke-direct {v5, v3}, Ljf/l$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    check-cast v5, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    check-cast v5, Lmh/a;

    const/4 v2, 0x6

    const/16 v16, 0xbc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v12, v15

    move-object/from16 v30, v13

    move v13, v2

    move v2, v14

    move/from16 v14, v16

    invoke-static/range {v4 .. v14}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    goto :goto_10

    :cond_22
    move-object/from16 v30, v13

    move v2, v14

    :goto_10
    invoke-interface {v15}, LT/l;->J()V

    const v4, 0xc27b24e

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-virtual/range {v18 .. v18}, Ljf/c;->c()Z

    move-result v4

    move-object/from16 v13, v30

    if-eqz v4, :cond_28

    const/4 v4, 0x0

    invoke-static {v13, v4, v2, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget v4, Lm8/c;->p3:I

    const/4 v6, 0x0

    invoke-static {v4, v15, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v9

    const v4, 0xc27d02d

    invoke-interface {v15, v4}, LT/l;->U(I)V

    and-int/lit8 v4, v21, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/16 v14, 0x20

    if-le v4, v14, :cond_23

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_24

    :cond_23
    and-int/lit8 v4, v21, 0x30

    if-ne v4, v14, :cond_25

    :cond_24
    move v4, v2

    goto :goto_11

    :cond_25
    const/4 v4, 0x0

    :goto_11
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_26

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_27

    :cond_26
    new-instance v6, Ljf/l$d;

    invoke-direct {v6, v3}, Ljf/l$d;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_27
    check-cast v6, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    check-cast v6, Lmh/a;

    const/4 v11, 0x6

    const/16 v12, 0x1c

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    move v7, v8

    move-object v8, v10

    move-object v10, v15

    invoke-static/range {v4 .. v12}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    goto :goto_12

    :cond_28
    const/16 v14, 0x20

    :goto_12
    invoke-interface {v15}, LT/l;->J()V

    const v4, 0xc27dadf

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-virtual/range {v18 .. v18}, Ljf/c;->b()Z

    move-result v4

    if-eqz v4, :cond_2e

    const/4 v4, 0x0

    invoke-static {v13, v4, v2, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget v5, Lm8/c;->o3:I

    const/4 v6, 0x0

    invoke-static {v5, v15, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v9

    const v5, 0xc27f9d5

    invoke-interface {v15, v5}, LT/l;->U(I)V

    and-int/lit8 v5, v21, 0x70

    xor-int/lit8 v5, v5, 0x30

    if-le v5, v14, :cond_29

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2a

    :cond_29
    and-int/lit8 v5, v21, 0x30

    if-ne v5, v14, :cond_2b

    :cond_2a
    move v14, v2

    goto :goto_13

    :cond_2b
    const/4 v14, 0x0

    :goto_13
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v14, :cond_2c

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_2d

    :cond_2c
    new-instance v5, Ljf/l$e;

    invoke-direct {v5, v3}, Ljf/l$e;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2d
    check-cast v5, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    check-cast v5, Lmh/a;

    const/4 v11, 0x6

    const/16 v12, 0x1c

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v15

    invoke-static/range {v4 .. v12}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    :cond_2e
    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v15}, LT/l;->R()V

    sget-object v4, LYg/J;->a:LYg/J;

    :goto_14
    invoke-interface {v15}, LT/l;->J()V

    const/4 v4, 0x0

    invoke-static {v0, v15, v4, v2}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v15}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, LT/o;->P()V

    :cond_2f
    move-object/from16 v5, v22

    :goto_15
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_30

    new-instance v2, Ljf/i;

    move/from16 v4, p3

    invoke-direct {v2, v5, v3, v4, v1}, Ljf/i;-><init>(Landroidx/compose/ui/e;Ljf/h;II)V

    invoke-interface {v0, v2}, LT/X0;->a(Lmh/p;)V

    :cond_30
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;Ljf/h;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljf/l;->e(Landroidx/compose/ui/e;Ljf/h;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;Ljf/g;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljf/l;->c(Landroidx/compose/ui/e;Ljf/g;LT/l;II)V

    return-void
.end method
