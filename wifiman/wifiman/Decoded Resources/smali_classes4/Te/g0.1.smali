.class public abstract LTe/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LTe/e0;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LTe/g0;->c(Landroidx/compose/ui/e;LTe/e0;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LTe/e0;LT/l;II)V
    .locals 42

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/16 v3, 0x30

    const/4 v4, 0x6

    const-string v5, "model"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, -0x1054841c

    move-object/from16 v6, p2

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x1

    and-int/lit8 v6, v2, 0x1

    const/4 v13, 0x2

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
    move v8, v13

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v1

    :goto_1
    and-int/lit8 v9, v2, 0x2

    const/16 v10, 0x10

    if-eqz v9, :cond_3

    or-int/2addr v8, v3

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v1, 0x30

    if-nez v9, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    move v9, v10

    :goto_2
    or-int/2addr v8, v9

    :cond_5
    :goto_3
    and-int/lit8 v9, v8, 0x13

    const/16 v11, 0x12

    if-ne v9, v11, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v15

    goto/16 :goto_13

    :cond_7
    :goto_4
    if-eqz v6, :cond_8

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v11, v6

    goto :goto_5

    :cond_8
    move-object v11, v7

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.signal.components.SignalTabApComparisonApItem (SignalTabApComparisonApItem.kt:80)"

    invoke-static {v5, v8, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v6

    int-to-float v7, v10

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v11, v7, v6}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LTe/e0;->c()Z

    move-result v7

    if-eqz v7, :cond_a

    const v7, -0xecef148

    invoke-interface {v15, v7}, LT/l;->U(I)V

    sget-object v7, Ltf/a;->a:Ltf/a;

    invoke-virtual {v7, v15, v4}, Ltf/a;->b(LT/l;I)F

    move-result v7

    :goto_6
    invoke-interface {v15}, LT/l;->J()V

    goto :goto_7

    :cond_a
    const v7, -0xeceedc7

    invoke-interface {v15, v7}, LT/l;->U(I)V

    sget-object v7, Ltf/a;->a:Ltf/a;

    invoke-virtual {v7, v15, v4}, Ltf/a;->a(LT/l;I)F

    move-result v7

    goto :goto_6

    :goto_7
    invoke-static {v6, v7}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v31, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v7

    sget-object v10, Lz/c;->a:Lz/c;

    const/16 v8, 0xc

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-virtual {v10, v8}, Lz/c;->n(F)Lz/c$f;

    move-result-object v8

    const/16 v9, 0x36

    invoke-static {v8, v7, v15, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v15, v8}, LT/j;->a(LT/l;I)I

    move-result v16

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v32, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_c

    invoke-interface {v15, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_c
    invoke-interface {v15}, LT/l;->I()V

    :goto_8
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v12, v7, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v12, v8, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v12}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_d

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    :cond_d
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v12, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v12, v8, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v12, v6, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v12, Lz/Z;->a:Lz/Z;

    invoke-static {}, LN/c0;->b()LT/H0;

    move-result-object v6

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v6, v7}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v6

    new-instance v7, LTe/g0$a;

    invoke-direct {v7, v0}, LTe/g0$a;-><init>(LTe/e0;)V

    const v8, 0x6a042e08

    invoke-static {v8, v14, v7, v15, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    sget v8, LT/I0;->i:I

    or-int/2addr v8, v3

    invoke-static {v6, v7, v15, v8}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/e0;->e()Ls9/a;

    move-result-object v6

    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    const/16 v3, 0x30

    const/16 v16, 0x3e

    const/4 v8, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/4 v4, 0x0

    move v4, v9

    move-object/from16 v9, v18

    move-object v4, v10

    move-object/from16 v10, v19

    move-object/from16 v33, v11

    move/from16 v11, v20

    move-object/from16 p2, v12

    move-object/from16 v35, v13

    move-wide/from16 v12, v21

    move-object v14, v15

    move-object/from16 v36, v15

    move v15, v3

    invoke-static/range {v6 .. v16}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/high16 v20, 0x3f800000    # 1.0f

    const/16 v21, 0x0

    move-object/from16 v18, p2

    move-object/from16 v19, v35

    invoke-static/range {v18 .. v23}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v6

    const/4 v7, 0x4

    int-to-float v8, v7

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v4, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v7

    move-object/from16 v9, v36

    const/16 v10, 0x36

    invoke-static {v7, v6, v9, v10}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v9, v7}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v9}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v9, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v9}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_f

    invoke-static {}, LT/j;->c()V

    :cond_f
    invoke-interface {v9}, LT/l;->u()V

    invoke-interface {v9}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_10

    invoke-interface {v9, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_10
    invoke-interface {v9}, LT/l;->I()V

    :goto_9
    invoke-static {v9}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v6, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v11, v7, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v11}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_11

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    :cond_11
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_12
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v11, v3, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v4, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v3, v5, v9, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v9, v5}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v9}, LT/l;->G()LT/x;

    move-result-object v5

    move-object/from16 v7, v35

    invoke-static {v9, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v9}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_13

    invoke-static {}, LT/j;->c()V

    :cond_13
    invoke-interface {v9}, LT/l;->u()V

    invoke-interface {v9}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-interface {v9, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_14
    invoke-interface {v9}, LT/l;->I()V

    :goto_a
    invoke-static {v9}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v3, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v11, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v11}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_15

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    :cond_15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v11, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_16
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v11, v10, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/high16 v3, 0x3f800000    # 1.0f

    move-object/from16 v6, p2

    const/4 v5, 0x0

    invoke-interface {v6, v7, v3, v5}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LTe/e0;->g()LTe/e0$a;

    move-result-object v5

    instance-of v6, v5, LTe/e0$a$a;

    if-eqz v6, :cond_17

    invoke-virtual/range {p1 .. p1}, LTe/e0;->g()LTe/e0$a;

    move-result-object v5

    check-cast v5, LTe/e0$a$a;

    invoke-virtual {v5}, LTe/e0$a$a;->a()Ls9/d;

    move-result-object v5

    :goto_b
    const/4 v6, 0x0

    goto :goto_c

    :cond_17
    instance-of v5, v5, LTe/e0$a$b;

    if-eqz v5, :cond_24

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->Z:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    goto :goto_b

    :goto_c
    invoke-static {v5, v9, v6}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lla/a;->a:Lla/a;

    sget v15, Lla/a;->b:I

    invoke-virtual {v6, v9, v15}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v10

    invoke-virtual {v10}, Lpa/c;->b()Lpa/b;

    move-result-object v10

    invoke-virtual {v10}, Lpa/b;->b()LL0/U;

    move-result-object v26

    invoke-virtual/range {p1 .. p1}, LTe/e0;->g()LTe/e0$a;

    move-result-object v10

    instance-of v11, v10, LTe/e0$a$a;

    if-eqz v11, :cond_18

    const v10, -0x38853650

    invoke-interface {v9, v10}, LT/l;->U(I)V

    invoke-virtual {v6, v9, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v10

    invoke-virtual {v10}, Lma/a;->f()Lma/a$f;

    move-result-object v10

    invoke-virtual {v10}, Lma/a$f;->a()J

    move-result-wide v10

    invoke-interface {v9}, LT/l;->J()V

    :goto_d
    move-wide/from16 v36, v10

    goto :goto_e

    :cond_18
    instance-of v10, v10, LTe/e0$a$b;

    if-eqz v10, :cond_23

    const v10, -0x388529d0

    invoke-interface {v9, v10}, LT/l;->U(I)V

    invoke-virtual {v6, v9, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v10

    invoke-virtual {v10}, Lma/a;->f()Lma/a$f;

    move-result-object v10

    invoke-virtual {v10}, Lma/a$f;->b()J

    move-result-wide v10

    invoke-interface {v9}, LT/l;->J()V

    goto :goto_d

    :goto_e
    sget-object v34, LW0/t;->a:LW0/t$a;

    invoke-virtual/range {v34 .. v34}, LW0/t$a;->b()I

    move-result v21

    const/16 v29, 0xc30

    const v30, 0xd7f8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move/from16 v38, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v39, v6

    move-object v6, v5

    move-object v5, v7

    move-object v7, v3

    move/from16 v35, v8

    move-object v3, v9

    move-wide/from16 v8, v36

    move-object/from16 v27, v3

    invoke-static/range {v6 .. v30}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    const v6, -0x388516e9

    invoke-interface {v3, v6}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LTe/e0;->b()Z

    move-result v6

    if-eqz v6, :cond_19

    sget-object v6, LAf/p$a;->a:LAf/p$a;

    const/4 v7, 0x6

    invoke-virtual {v6, v3, v7}, LAf/p$a;->c(LT/l;I)V

    :cond_19
    invoke-interface {v3}, LT/l;->J()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-virtual/range {p1 .. p1}, LTe/e0;->f()Lh9/a;

    move-result-object v6

    const-string v7, ":"

    invoke-virtual {v6, v7}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move/from16 v14, v38

    move-object/from16 v15, v39

    invoke-virtual {v15, v3, v14}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v15, v3, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->c()J

    move-result-wide v8

    invoke-virtual/range {v34 .. v34}, LW0/t$a;->b()I

    move-result v21

    const/16 v29, 0xc30

    const v30, 0xd7fa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move/from16 v40, v14

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    move-object/from16 v41, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v3

    invoke-static/range {v6 .. v30}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->j()Lf0/c$b;

    move-result-object v6

    invoke-static/range {v35 .. v35}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v4, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    const/16 v7, 0x36

    invoke-static {v4, v6, v3, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v6, 0x0

    invoke-static {v3, v6}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v3, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_1a

    invoke-static {}, LT/j;->c()V

    :cond_1a
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v3, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_f

    :cond_1b
    invoke-interface {v3}, LT/l;->I()V

    :goto_f
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v4, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v8, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_1c

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1d

    :cond_1c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1d
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v5, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {p1 .. p1}, LTe/e0;->i()LS8/l;

    move-result-object v4

    const v5, -0x107930c9

    invoke-interface {v3, v5}, LT/l;->U(I)V

    const/4 v5, 0x0

    if-nez v4, :cond_1e

    move-object v4, v5

    const/4 v5, 0x0

    goto :goto_10

    :cond_1e
    const/4 v6, 0x1

    const/4 v7, 0x2

    invoke-static {v4, v6, v5, v7, v5}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v3, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    :goto_10
    invoke-interface {v3}, LT/l;->J()V

    const v6, -0x10793222

    invoke-interface {v3, v6}, LT/l;->U(I)V

    if-nez v4, :cond_1f

    new-instance v4, LL0/d;

    sget v6, Lm8/c;->L2:I

    invoke-static {v6, v3, v5}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1f
    move-object v6, v4

    invoke-interface {v3}, LT/l;->J()V

    move/from16 v5, v40

    move-object/from16 v4, v41

    invoke-virtual {v4, v3, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->a()LL0/U;

    move-result-object v27

    invoke-virtual/range {p1 .. p1}, LTe/e0;->i()LS8/l;

    move-result-object v7

    if-eqz v7, :cond_20

    const v7, -0x1079106f

    invoke-interface {v3, v7}, LT/l;->U(I)V

    invoke-virtual {v4, v3, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v7

    :goto_11
    invoke-interface {v3}, LT/l;->J()V

    move-wide v8, v7

    goto :goto_12

    :cond_20
    const v7, -0x10790cef

    invoke-interface {v3, v7}, LT/l;->U(I)V

    invoke-virtual {v4, v3, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->c()J

    move-result-wide v7

    goto :goto_11

    :goto_12
    const/16 v30, 0x0

    const v31, 0x1fffa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v3

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LTe/e0;->a()LS8/c;

    move-result-object v6

    invoke-static {v6}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v3, v7}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v3, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v4, v3, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->c()J

    move-result-wide v8

    const v30, 0xfffa

    const/4 v7, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v3

    invoke-static/range {v6 .. v30}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-static {}, LT/o;->P()V

    :cond_21
    move-object/from16 v7, v33

    :goto_13
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_22

    new-instance v4, LTe/f0;

    invoke-direct {v4, v7, v0, v1, v2}, LTe/f0;-><init>(Landroidx/compose/ui/e;LTe/e0;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_22
    return-void

    :cond_23
    move-object v3, v9

    const v0, -0x3885445e

    invoke-interface {v3, v0}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_24
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final c(Landroidx/compose/ui/e;LTe/e0;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LTe/g0;->b(Landroidx/compose/ui/e;LTe/e0;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
