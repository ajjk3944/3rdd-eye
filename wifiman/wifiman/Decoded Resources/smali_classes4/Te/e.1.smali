.class public abstract LTe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;JZILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LTe/e;->h(Landroidx/compose/ui/e;JZILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LTe/a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTe/e;->e(Landroidx/compose/ui/e;LTe/a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLTe/f;JLo0/f;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LTe/e;->g(ZLTe/f;JLo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;LTe/a;LT/l;I)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/16 v3, 0x30

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "model"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x16bf846e

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x6

    and-int/lit8 v5, v2, 0x6

    const/4 v6, 0x2

    if-nez v5, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    const/16 v8, 0x10

    if-nez v7, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move v7, v8

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit8 v7, v5, 0x13

    const/16 v9, 0x12

    if-ne v7, v9, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v0, v15

    goto/16 :goto_f

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_6

    const/4 v7, -0x1

    const-string v9, "com.ui.wifiman.ui.signal.components.AccessPointRoamingItem (AccessPointRoamingItem.kt:77)"

    invoke-static {v4, v5, v7, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    int-to-float v4, v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static {v0, v4, v5, v6, v7}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v9, Lz/J;->Min:Lz/J;

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/i;->a(Landroidx/compose/ui/e;Lz/J;)Landroidx/compose/ui/e;

    move-result-object v4

    int-to-float v11, v8

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v4, v8, v5, v6, v7}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v12, Lz/c;->a:Lz/c;

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v12, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    sget-object v31, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v8

    const/16 v10, 0x36

    invoke-static {v6, v8, v15, v10}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v9, 0x0

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v32, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_8

    invoke-interface {v15, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v6, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v13, v10, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v13}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v13, v8, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v13, v4, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/Z;->a:Lz/Z;

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v13, 0x1

    invoke-static {v14, v5, v13, v7}, Landroidx/compose/foundation/layout/r;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v6

    invoke-virtual {v12}, Lz/c;->g()Lz/c$m;

    move-result-object v7

    invoke-static {v7, v6, v15, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v15, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_c
    invoke-interface {v15}, LT/l;->I()V

    :goto_5
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v8, v3, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_d

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, LTe/a;->b()Z

    move-result v5

    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v5, :cond_f

    const v5, 0x5e2c9c42

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-interface {v3, v14, v10, v13}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->a()Lma/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v6

    invoke-virtual {v6}, Lr9/a$b;->i()J

    move-result-wide v6

    const/4 v8, 0x0

    const/16 v18, 0x180

    move/from16 v19, v11

    move v11, v9

    move-object v9, v15

    move-object/from16 p2, v12

    move v12, v10

    move/from16 v10, v18

    invoke-static/range {v5 .. v10}, LTe/e;->f(Landroidx/compose/ui/e;JZLT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    goto :goto_6

    :cond_f
    move/from16 v19, v11

    move-object/from16 p2, v12

    move v11, v9

    move v12, v10

    const v5, 0x5e30337b

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-interface {v3, v14, v12, v13}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v15, v11}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    :goto_6
    invoke-virtual/range {p1 .. p1}, LTe/a;->d()Ls9/a;

    move-result-object v5

    const/16 v6, 0x28

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v14, v6}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    const/16 v18, 0x30

    const/16 v20, 0x3e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v21, 0x0

    move-wide/from16 v11, v21

    move-object v13, v15

    move-object/from16 v35, v14

    move/from16 v14, v18

    move-object v0, v15

    move/from16 v15, v20

    invoke-static/range {v5 .. v15}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    invoke-virtual/range {p1 .. p1}, LTe/a;->a()Z

    move-result v5

    if-eqz v5, :cond_10

    const v5, 0x5e340303

    invoke-interface {v0, v5}, LT/l;->U(I)V

    move-object/from16 v14, v35

    const/4 v11, 0x1

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-interface {v3, v14, v12, v11}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v3, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v3, v0, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->i()J

    move-result-wide v6

    const/4 v8, 0x1

    const/16 v10, 0x180

    move-object v9, v0

    invoke-static/range {v5 .. v10}, LTe/e;->f(Landroidx/compose/ui/e;JZLT/l;I)V

    invoke-interface {v0}, LT/l;->J()V

    const/4 v15, 0x0

    goto :goto_7

    :cond_10
    move-object/from16 v14, v35

    const/4 v11, 0x1

    const/high16 v12, 0x3f800000    # 1.0f

    const v5, 0x5e37967b

    invoke-interface {v0, v5}, LT/l;->U(I)V

    invoke-interface {v3, v14, v12, v11}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v15, 0x0

    invoke-static {v3, v0, v15}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {v0}, LT/l;->J()V

    :goto_7
    invoke-interface {v0}, LT/l;->R()V

    invoke-interface {v4, v14, v12, v11}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lz/c;->b()Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    const/4 v13, 0x6

    invoke-static {v4, v5, v0, v13}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v0, v15}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v0}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v0, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v0}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_11

    invoke-static {}, LT/j;->c()V

    :cond_11
    invoke-interface {v0}, LT/l;->u()V

    invoke-interface {v0}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v0, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_12
    invoke-interface {v0}, LT/l;->I()V

    :goto_8
    invoke-static {v0}, LT/E1;->a(LT/l;)LT/l;

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

    if-nez v6, :cond_13

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_14
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/4 v3, 0x4

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v14, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v0, v13}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/a;->e()Ls9/d;

    move-result-object v4

    const v5, -0x68509cf9

    invoke-interface {v0, v5}, LT/l;->U(I)V

    if-nez v4, :cond_15

    move-object/from16 v33, p2

    move-object v4, v14

    goto/16 :goto_a

    :cond_15
    invoke-static {v3}, LY0/h;->j(F)F

    move-result v4

    move-object/from16 v12, p2

    invoke-virtual {v12, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    const/16 v11, 0x36

    invoke-static {v4, v5, v0, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v0, v15}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v0}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v0, v14}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v0}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_16

    invoke-static {}, LT/j;->c()V

    :cond_16
    invoke-interface {v0}, LT/l;->u()V

    invoke-interface {v0}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_17

    invoke-interface {v0, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_17
    invoke-interface {v0}, LT/l;->I()V

    :goto_9
    invoke-static {v0}, LT/E1;->a(LT/l;)LT/l;

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

    if-nez v6, :cond_18

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    :cond_18
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_19
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v8, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, LN9/b;->a:LN9/b;

    invoke-virtual {v4}, LN9/b;->O()Ls9/b;

    move-result-object v5

    invoke-static/range {v19 .. v19}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v14, v4}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v4, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v4, v0, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->c()Lma/a$c;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$c;->a()J

    move-result-wide v7

    invoke-static {v7, v8}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v7

    const/16 v16, 0x30

    const/16 v17, 0x4

    const/4 v8, 0x0

    move-object v9, v0

    move v13, v10

    move/from16 v10, v16

    move/from16 v11, v17

    invoke-static/range {v5 .. v11}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LTe/a;->e()Ls9/d;

    move-result-object v5

    invoke-static {v5, v0, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    invoke-virtual {v4, v0, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->a()LL0/U;

    move-result-object v26

    invoke-virtual {v4, v0, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->c()J

    move-result-wide v7

    sget-object v4, LW0/t;->a:LW0/t$a;

    invoke-virtual {v4}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7fa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    move-object/from16 v33, v12

    move-object v12, v4

    const/4 v13, 0x0

    const/4 v4, 0x6

    const-wide/16 v16, 0x0

    move-object v4, v14

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

    move-object/from16 v27, v0

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v0}, LT/l;->R()V

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v5, v0, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object v5, LYg/J;->a:LYg/J;

    :goto_a
    invoke-interface {v0}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LTe/a;->g()Ls9/d;

    move-result-object v5

    const/4 v14, 0x0

    invoke-static {v5, v0, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    sget-object v15, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v15, v0, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->b()LL0/U;

    move-result-object v26

    invoke-virtual {v15, v0, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v7

    sget-object v34, LW0/t;->a:LW0/t$a;

    invoke-virtual/range {v34 .. v34}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7fa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move/from16 v36, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v37, v15

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

    move-object/from16 v27, v0

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LTe/a;->f()Ls9/d;

    move-result-object v5

    const v6, -0x68500f41

    invoke-interface {v0, v6}, LT/l;->U(I)V

    if-nez v5, :cond_1a

    move/from16 v38, v36

    move-object/from16 v39, v37

    goto :goto_b

    :cond_1a
    invoke-static {v3}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v5, v0, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/a;->f()Ls9/d;

    move-result-object v5

    const/4 v14, 0x0

    invoke-static {v5, v0, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move/from16 v13, v36

    move-object/from16 v15, v37

    invoke-virtual {v15, v0, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->a()LL0/U;

    move-result-object v26

    invoke-virtual {v15, v0, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->c()J

    move-result-wide v7

    invoke-virtual/range {v34 .. v34}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7fa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move/from16 v38, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v39, v15

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

    move-object/from16 v27, v0

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v5, LYg/J;->a:LYg/J;

    :goto_b
    invoke-interface {v0}, LT/l;->J()V

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v5, v0, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {v0}, LT/l;->R()V

    invoke-virtual/range {v33 .. v33}, Lz/c;->b()Lz/c$f;

    move-result-object v5

    invoke-virtual/range {v31 .. v31}, Lf0/c$a;->j()Lf0/c$b;

    move-result-object v6

    const/16 v7, 0x36

    invoke-static {v5, v6, v0, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v14, 0x0

    invoke-static {v0, v14}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v0}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v0, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {v32 .. v32}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v0}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_1b

    invoke-static {}, LT/j;->c()V

    :cond_1b
    invoke-interface {v0}, LT/l;->u()V

    invoke-interface {v0}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_1c

    invoke-interface {v0, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_c

    :cond_1c
    invoke-interface {v0}, LT/l;->I()V

    :goto_c
    invoke-static {v0}, LT/E1;->a(LT/l;)LT/l;

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

    if-nez v7, :cond_1d

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1e

    :cond_1d
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1e
    invoke-virtual/range {v32 .. v32}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v9, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v5, v0, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/a;->h()Ls9/d;

    move-result-object v5

    const v6, -0x684fb2ec

    invoke-interface {v0, v6}, LT/l;->U(I)V

    if-nez v5, :cond_1f

    move/from16 v40, v38

    move-object/from16 v41, v39

    goto :goto_d

    :cond_1f
    invoke-virtual/range {p1 .. p1}, LTe/a;->h()Ls9/d;

    move-result-object v5

    invoke-static {v5, v0, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move/from16 v13, v38

    move-object/from16 v15, v39

    invoke-virtual {v15, v0, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->b()LL0/U;

    move-result-object v26

    invoke-virtual {v15, v0, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x1fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move/from16 v40, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v41, v15

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

    move-object/from16 v27, v0

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v5, LYg/J;->a:LYg/J;

    :goto_d
    invoke-interface {v0}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LTe/a;->i()Ls9/d;

    move-result-object v5

    const v6, -0x684f9214

    invoke-interface {v0, v6}, LT/l;->U(I)V

    if-nez v5, :cond_20

    goto :goto_e

    :cond_20
    invoke-static {v3}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v5, v0, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, LTe/a;->i()Ls9/d;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v0, v6}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move/from16 v7, v40

    move-object/from16 v6, v41

    invoke-virtual {v6, v0, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->a()LL0/U;

    move-result-object v26

    invoke-virtual {v6, v0, v7}, Lla/a;->a(LT/l;I)Lma/a;

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

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

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

    move-object/from16 v27, v0

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v5, LYg/J;->a:LYg/J;

    :goto_e
    invoke-interface {v0}, LT/l;->J()V

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v3, v0, v4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {v0}, LT/l;->R()V

    invoke-interface {v0}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-static {}, LT/o;->P()V

    :cond_21
    :goto_f
    invoke-interface {v0}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_22

    new-instance v3, LTe/d;

    move-object/from16 v4, p0

    invoke-direct {v3, v4, v1, v2}, LTe/d;-><init>(Landroidx/compose/ui/e;LTe/a;I)V

    invoke-interface {v0, v3}, LT/X0;->a(Lmh/p;)V

    :cond_22
    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;LTe/a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LTe/e;->d(Landroidx/compose/ui/e;LTe/a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/e;JZLT/l;I)V
    .locals 21

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p5

    const/4 v0, 0x1

    const/4 v6, 0x0

    const v7, -0x5d33811a

    move-object/from16 v8, p4

    invoke-interface {v8, v7}, LT/l;->r(I)LT/l;

    move-result-object v8

    and-int/lit8 v9, v5, 0x6

    const/4 v10, 0x2

    if-nez v9, :cond_1

    invoke-interface {v8, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    move v9, v10

    :goto_0
    or-int/2addr v9, v5

    goto :goto_1

    :cond_1
    move v9, v5

    :goto_1
    and-int/lit8 v11, v5, 0x30

    if-nez v11, :cond_3

    invoke-interface {v8, v2, v3}, LT/l;->j(J)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v9, v11

    :cond_3
    and-int/lit16 v11, v5, 0x180

    if-nez v11, :cond_5

    invoke-interface {v8, v4}, LT/l;->c(Z)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v9, v11

    :cond_5
    and-int/lit16 v11, v9, 0x93

    const/16 v14, 0x92

    if-ne v11, v14, :cond_7

    invoke-interface {v8}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v8}, LT/l;->C()V

    goto/16 :goto_8

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_8

    const/4 v11, -0x1

    const-string v14, "com.ui.wifiman.ui.signal.components.ArrowConnectionHalf (AccessPointRoamingItem.kt:218)"

    invoke-static {v7, v9, v11, v14}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LY0/d;

    const v11, -0x33f6ac78    # -3.5999264E7f

    invoke-interface {v8, v11}, LT/l;->U(I)V

    invoke-interface {v8, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    const/high16 v15, 0x40400000    # 3.0f

    const/high16 v16, 0x40a00000    # 5.0f

    if-nez v11, :cond_9

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v14, v11, :cond_b

    :cond_9
    new-instance v14, LTe/f;

    invoke-interface {v7}, LY0/d;->getDensity()F

    move-result v11

    mul-float v11, v11, v16

    invoke-interface {v7}, LY0/d;->getDensity()F

    move-result v17

    mul-float v13, v17, v15

    const/high16 v17, 0x3f800000    # 1.0f

    invoke-interface {v7}, LY0/d;->getDensity()F

    move-result v18

    mul-float v15, v18, v17

    sget-object v12, Lm0/V0;->a:Lm0/V0$a;

    invoke-interface {v7}, LY0/d;->getDensity()F

    move-result v18

    const/high16 v19, 0x40600000    # 3.5f

    mul-float v18, v18, v19

    invoke-interface {v7}, LY0/d;->getDensity()F

    move-result v20

    mul-float v20, v20, v19

    new-array v5, v10, [F

    aput v18, v5, v6

    aput v20, v5, v0

    if-eqz v4, :cond_a

    const/4 v7, 0x0

    goto :goto_5

    :cond_a
    invoke-interface {v7}, LY0/d;->getDensity()F

    move-result v7

    mul-float v7, v7, v19

    :goto_5
    invoke-virtual {v12, v5, v7}, Lm0/V0$a;->b([FF)Lm0/V0;

    move-result-object v5

    invoke-direct {v14, v11, v13, v15, v5}, LTe/f;-><init>(FFFLm0/V0;)V

    invoke-interface {v8, v14}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v14, LTe/f;

    invoke-interface {v8}, LT/l;->J()V

    invoke-static/range {v16 .. v16}, LY0/h;->j(F)F

    move-result v5

    const/4 v7, 0x0

    const/4 v11, 0x0

    invoke-static {v1, v5, v11, v10, v7}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    const/high16 v12, 0x40400000    # 3.0f

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v12

    invoke-static {v5, v12, v11, v10, v7}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    const v7, -0x33f647ab    # -3.6102484E7f

    invoke-interface {v8, v7}, LT/l;->U(I)V

    and-int/lit16 v7, v9, 0x380

    const/16 v10, 0x100

    if-ne v7, v10, :cond_c

    move v7, v0

    goto :goto_6

    :cond_c
    move v7, v6

    :goto_6
    invoke-interface {v8, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v7, v10

    and-int/lit8 v9, v9, 0x70

    const/16 v10, 0x20

    if-ne v9, v10, :cond_d

    goto :goto_7

    :cond_d
    move v0, v6

    :goto_7
    or-int/2addr v0, v7

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_e

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v7, v0, :cond_f

    :cond_e
    new-instance v7, LTe/b;

    invoke-direct {v7, v4, v14, v2, v3}, LTe/b;-><init>(ZLTe/f;J)V

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v7, Lmh/l;

    invoke-interface {v8}, LT/l;->J()V

    invoke-static {v5, v7, v8, v6}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_8
    invoke-interface {v8}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v7, LTe/c;

    move-object v0, v7

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LTe/c;-><init>(Landroidx/compose/ui/e;JZI)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void
.end method

.method private static final g(ZLTe/f;JLo0/f;)LYg/J;
    .locals 18

    const-string v0, "$this$Canvas"

    move-object/from16 v10, p4

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v2

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/n;->b(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v1

    invoke-interface {v2, v1, v0}, Lm0/U0;->n(FF)V

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/n;->b(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v1

    invoke-virtual/range {p1 .. p1}, LTe/f;->b()F

    move-result v3

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float/2addr v3, v4

    add-float/2addr v1, v3

    invoke-virtual/range {p1 .. p1}, LTe/f;->a()F

    move-result v3

    invoke-interface {v2, v1, v3}, Lm0/U0;->u(FF)V

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/n;->b(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->m(J)F

    move-result v1

    invoke-virtual/range {p1 .. p1}, LTe/f;->b()F

    move-result v3

    div-float/2addr v3, v4

    sub-float/2addr v1, v3

    invoke-virtual/range {p1 .. p1}, LTe/f;->a()F

    move-result v3

    invoke-interface {v2, v1, v3}, Lm0/U0;->u(FF)V

    new-instance v3, Lm0/j1;

    const/4 v1, 0x0

    move-wide/from16 v11, p2

    invoke-direct {v3, v11, v12, v1}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p4

    invoke-static/range {v1 .. v9}, Lo0/f;->R0(Lo0/f;Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-wide/from16 v11, p2

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/n;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->g(J)F

    move-result v1

    invoke-static {v0, v1}, Ll0/h;->a(FF)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/n;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    invoke-virtual/range {p1 .. p1}, LTe/f;->a()F

    move-result v1

    invoke-static {v0, v1}, Ll0/h;->a(FF)J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, LTe/f;->c()Lm0/V0;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LTe/f;->d()F

    move-result v8

    const/16 v14, 0x1d0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v1, p4

    move-wide/from16 v2, p2

    move-object v10, v0

    move v11, v13

    move-object/from16 v12, v16

    move/from16 v13, v17

    invoke-static/range {v1 .. v15}, Lo0/f;->w1(Lo0/f;JJJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/n;->b(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {v1, v0}, Ll0/h;->a(FF)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/n;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->g(J)F

    move-result v1

    invoke-static {v0, v1}, Ll0/h;->a(FF)J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, LTe/f;->c()Lm0/V0;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LTe/f;->d()F

    move-result v8

    const/16 v14, 0x1d0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v1, p4

    move-wide/from16 v2, p2

    move-object v10, v0

    move v11, v13

    move-object/from16 v12, v16

    move/from16 v13, v17

    invoke-static/range {v1 .. v15}, Lo0/f;->w1(Lo0/f;JJJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V

    :goto_1
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final h(Landroidx/compose/ui/e;JZILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, LTe/e;->f(Landroidx/compose/ui/e;JZLT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
