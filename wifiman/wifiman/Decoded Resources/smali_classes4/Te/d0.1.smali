.class public abstract LTe/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LTe/b0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTe/d0;->c(Landroidx/compose/ui/e;LTe/b0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LTe/b0;LT/l;I)V
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/16 v3, 0x30

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "model"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x328537dc

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v14

    const/4 v15, 0x6

    and-int/lit8 v5, v2, 0x6

    const/4 v13, 0x4

    const/4 v12, 0x2

    if-nez v5, :cond_1

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v13

    goto :goto_0

    :cond_0
    move v5, v12

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_3

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, v5, 0x13

    const/16 v8, 0x12

    if-ne v6, v8, :cond_5

    invoke-interface {v14}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v14}, LT/l;->C()V

    move-object/from16 v31, v14

    goto/16 :goto_d

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.signal.components.SignalMapperPlaceItem (SignalStrengthPlaceItem.kt:57)"

    invoke-static {v4, v5, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v3, v4, v12, v5}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v6, Lz/J;->Min:Lz/J;

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/i;->a(Landroidx/compose/ui/e;Lz/J;)Landroidx/compose/ui/e;

    move-result-object v3

    int-to-float v6, v7

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v3, v6, v4, v12, v5}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LTe/b0;->b()Z

    move-result v4

    if-eqz v4, :cond_7

    const v4, 0x642a2c02

    invoke-interface {v14, v4}, LT/l;->U(I)V

    sget-object v4, Ltf/a;->a:Ltf/a;

    invoke-virtual {v4, v14, v15}, Ltf/a;->b(LT/l;I)F

    move-result v4

    :goto_4
    invoke-interface {v14}, LT/l;->J()V

    goto :goto_5

    :cond_7
    const v4, 0x642a2f83

    invoke-interface {v14, v4}, LT/l;->U(I)V

    sget-object v4, Ltf/a;->a:Ltf/a;

    invoke-virtual {v4, v14, v15}, Ltf/a;->a(LT/l;I)F

    move-result v4

    goto :goto_4

    :goto_5
    invoke-static {v3, v4}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    sget-object v31, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    const/16 v11, 0x36

    invoke-static {v5, v6, v14, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v9, 0x0

    invoke-static {v14, v9}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v14, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v32, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v14, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_9
    invoke-interface {v14}, LT/l;->I()V

    :goto_6
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v8, v5, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v8, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v8}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_a

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v8, v3, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x1

    invoke-interface {v3, v10, v5, v6}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v4}, Lz/c;->b()Lz/c$f;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v6

    invoke-static {v5, v6, v14, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v14, v9}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v14, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_c

    invoke-static {}, LT/j;->c()V

    :cond_c
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_d

    invoke-interface {v14, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_d
    invoke-interface {v14}, LT/l;->I()V

    :goto_7
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v8, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v8, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v8}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_e

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    :cond_e
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_f
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v8, v3, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, LTe/b0;->e()Ls9/d;

    move-result-object v3

    invoke-static {v3, v14, v9}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    sget-object v3, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v3, v14, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->b()LL0/U;

    move-result-object v26

    invoke-virtual {v3, v14, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v7

    sget-object v33, LW0/t;->a:LW0/t$a;

    invoke-virtual/range {v33 .. v33}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7fa

    const/4 v6, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v34, v10

    move-wide/from16 v9, v16

    const/16 v16, 0x0

    move/from16 v35, v11

    move-object/from16 v11, v16

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 p2, v14

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

    move-object/from16 v27, p2

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LTe/b0;->d()Ls9/d;

    move-result-object v5

    const v6, -0x7f0706e3

    move-object/from16 v14, p2

    invoke-interface {v14, v6}, LT/l;->U(I)V

    if-nez v5, :cond_10

    move-object/from16 p2, v14

    move-object/from16 v36, v34

    move/from16 v37, v35

    goto/16 :goto_9

    :cond_10
    const/4 v15, 0x4

    int-to-float v5, v15

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    move-object/from16 v13, v34

    invoke-static {v13, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v12, 0x6

    invoke-static {v5, v14, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v5, 0x2

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    const/16 v11, 0x36

    invoke-static {v5, v6, v14, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v10, 0x0

    invoke-static {v14, v10}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v14, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_11

    invoke-static {}, LT/j;->c()V

    :cond_11
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_12

    invoke-interface {v14, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_12
    invoke-interface {v14}, LT/l;->I()V

    :goto_8
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v5, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v9, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_13

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    :cond_13
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_14
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v9, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {p1 .. p1}, LTe/b0;->a()Ls9/b;

    move-result-object v5

    const/16 v6, 0x14

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v13, v6}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    move/from16 v10, v35

    invoke-virtual {v3, v14, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->d()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->f()J

    move-result-wide v7

    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    const/16 v16, 0x30

    const/16 v17, 0x4

    const/4 v8, 0x0

    move-object v9, v14

    move-object/from16 v34, v13

    const/4 v15, 0x0

    move v13, v10

    move/from16 v10, v16

    move/from16 v11, v17

    invoke-static/range {v5 .. v11}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LTe/b0;->d()Ls9/d;

    move-result-object v5

    invoke-static {v5, v14, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    invoke-virtual {v3, v14, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v3, v14, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->b()J

    move-result-wide v7

    invoke-virtual/range {v33 .. v33}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7fa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, v16

    move/from16 v37, v13

    move-object/from16 v36, v34

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 p2, v14

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

    move-object/from16 v27, p2

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    sget-object v5, LYg/J;->a:LYg/J;

    :goto_9
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-virtual {v4}, Lz/c;->b()Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->j()Lf0/c$b;

    move-result-object v5

    move-object/from16 v14, p2

    const/16 v6, 0x36

    invoke-static {v4, v5, v14, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v15, 0x0

    invoke-static {v14, v15}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v14}, LT/l;->G()LT/x;

    move-result-object v6

    move-object/from16 v13, v36

    invoke-static {v14, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v14}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_15

    invoke-static {}, LT/j;->c()V

    :cond_15
    invoke-interface {v14}, LT/l;->u()V

    invoke-interface {v14}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v14, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_16
    invoke-interface {v14}, LT/l;->I()V

    :goto_a
    invoke-static {v14}, LT/E1;->a(LT/l;)LT/l;

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

    if-nez v6, :cond_17

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    :cond_17
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_18
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {p1 .. p1}, LTe/b0;->f()Ls9/d;

    move-result-object v4

    const v5, -0x7f068ba7

    invoke-interface {v14, v5}, LT/l;->U(I)V

    if-nez v4, :cond_19

    move-object/from16 v38, v13

    move-object/from16 p2, v14

    move/from16 v4, v37

    goto :goto_b

    :cond_19
    invoke-virtual/range {p1 .. p1}, LTe/b0;->f()Ls9/d;

    move-result-object v4

    invoke-static {v4, v14, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move/from16 v4, v37

    invoke-virtual {v3, v14, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->b()LL0/U;

    move-result-object v26

    invoke-virtual {v3, v14, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->c()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x1fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v38, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 p2, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, p2

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v5, LYg/J;->a:LYg/J;

    :goto_b
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LTe/b0;->g()Ls9/d;

    move-result-object v5

    const v6, -0x7f066ace

    move-object/from16 v14, p2

    invoke-interface {v14, v6}, LT/l;->U(I)V

    if-nez v5, :cond_1a

    move-object/from16 v31, v14

    goto :goto_c

    :cond_1a
    const/4 v5, 0x4

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    move-object/from16 v6, v38

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v5, v14, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/b0;->g()Ls9/d;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v14, v6}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    invoke-virtual {v3, v14, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v3, v14, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x1fffa

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v31

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v3, LYg/J;->a:LYg/J;

    :goto_c
    invoke-interface/range {v31 .. v31}, LT/l;->J()V

    invoke-interface/range {v31 .. v31}, LT/l;->R()V

    invoke-interface/range {v31 .. v31}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-static {}, LT/o;->P()V

    :cond_1b
    :goto_d
    invoke-interface/range {v31 .. v31}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_1c

    new-instance v4, LTe/c0;

    invoke-direct {v4, v0, v1, v2}, LTe/c0;-><init>(Landroidx/compose/ui/e;LTe/b0;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_1c
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LTe/b0;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LTe/d0;->b(Landroidx/compose/ui/e;LTe/b0;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
