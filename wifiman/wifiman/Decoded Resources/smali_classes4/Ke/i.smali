.class public abstract LKe/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LKe/i;->i()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LKe/a$a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LKe/i;->g(Landroidx/compose/ui/e;LKe/a$a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LKe/i;->j(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()LYg/J;
    .locals 1

    invoke-static {}, LKe/i;->k()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Landroidx/compose/ui/platform/h0;LL0/d;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LKe/i;->h(Landroidx/compose/ui/platform/h0;LL0/d;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/e;LKe/a$a;LT/l;I)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/16 v3, 0x30

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "model"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x30dba71c

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v5, 0x6

    and-int/lit8 v6, v2, 0x6

    if-nez v6, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v2

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    const/16 v8, 0x20

    const/16 v9, 0x10

    if-nez v7, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    move v7, v9

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit8 v7, v6, 0x13

    const/16 v10, 0x12

    if-ne v7, v10, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v4, v15

    goto/16 :goto_b

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_6

    const/4 v7, -0x1

    const-string v10, "com.ui.wifiman.ui.device.card.DeviceDetailCardHeader (DeviceDetailCardHeader.kt:36)"

    invoke-static {v4, v6, v7, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v4, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v4, v15, v14}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v6

    invoke-virtual {v6}, Lra/a;->a()Lra/b;

    move-result-object v6

    invoke-virtual {v6}, Lra/b;->a()Lra/b$a$a;

    move-result-object v6

    int-to-float v7, v8

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v6, v7}, Lra/b$a;->a(F)F

    move-result v6

    invoke-virtual {v4, v15, v14}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->b()Lra/b$a$b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$b;->c()F

    move-result v7

    invoke-static {v0, v6, v7}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v7

    sget-object v8, Lz/c;->a:Lz/c;

    invoke-virtual {v8}, Lz/c;->g()Lz/c$m;

    move-result-object v8

    invoke-static {v8, v7, v15, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v13, 0x0

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v10, LE0/g;->K:LE0/g$a;

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v3, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v11, v8, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v11}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_9

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v11, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, LKe/a$a;->e()Ls9/d;

    move-result-object v6

    invoke-static {v6, v15, v13}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, LKe/a$a;->b()Ls9/a;

    move-result-object v6

    const/16 v7, 0x51

    if-eqz v6, :cond_b

    const v5, 0x2958a456

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LKe/a$a;->b()Ls9/a;

    move-result-object v5

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v16

    int-to-float v6, v9

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v18

    const/16 v21, 0xd

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v11}, LL0/d;->k()Ljava/lang/String;

    move-result-object v9

    const/16 v16, 0x30

    const/16 v17, 0x36

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v31, v11

    move-wide/from16 v11, v18

    move-object v13, v15

    move/from16 v32, v14

    move/from16 v14, v16

    move-object/from16 p2, v15

    move/from16 v15, v17

    invoke-static/range {v5 .. v15}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object/from16 v8, p2

    goto :goto_5

    :cond_b
    move-object/from16 v31, v11

    move/from16 v32, v14

    move-object/from16 p2, v15

    const v6, 0x295d86c0

    move-object/from16 v8, p2

    invoke-interface {v8, v6}, LT/l;->U(I)V

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    int-to-float v6, v9

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v12

    const/16 v15, 0xd

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-static {v6, v8, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {v8}, LT/l;->J()V

    :goto_5
    invoke-static {}, Landroidx/compose/ui/platform/k0;->f()LT/H0;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Landroidx/compose/ui/platform/h0;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/content/Context;

    sget-object v33, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v11

    const/16 v14, 0xd

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, v33

    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v16

    const v9, 0x997e73e

    invoke-interface {v8, v9}, LT/l;->U(I)V

    invoke-interface {v8, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    move-object/from16 v14, v31

    invoke-interface {v8, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_c

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_d

    :cond_c
    new-instance v10, LKe/d;

    invoke-direct {v10, v7, v14}, LKe/d;-><init>(Landroidx/compose/ui/platform/h0;LL0/d;)V

    invoke-interface {v8, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v21, v10

    check-cast v21, Lmh/a;

    invoke-interface {v8}, LT/l;->J()V

    const v9, 0x997f549

    invoke-interface {v8, v9}, LT/l;->U(I)V

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    sget-object v31, LT/l;->a:LT/l$a;

    invoke-virtual/range {v31 .. v31}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_e

    new-instance v9, LKe/e;

    invoke-direct {v9}, LKe/e;-><init>()V

    invoke-interface {v8, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v23, v9

    check-cast v23, Lmh/a;

    invoke-interface {v8}, LT/l;->J()V

    const/16 v24, 0x2f

    const/16 v25, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v25}, Landroidx/compose/foundation/d;->h(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v26

    invoke-virtual/range {p1 .. p1}, LKe/a$a;->a()Z

    move-result v9

    if-eqz v9, :cond_f

    const v9, 0x9980b95

    invoke-interface {v8, v9}, LT/l;->U(I)V

    move/from16 v15, v32

    invoke-virtual {v4, v8, v15}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v9

    invoke-virtual {v9}, Lpa/c;->a()Lpa/b;

    move-result-object v9

    :goto_6
    invoke-virtual {v9}, Lpa/b;->c()LL0/U;

    move-result-object v9

    invoke-interface {v8}, LT/l;->J()V

    move-object/from16 v27, v9

    goto :goto_7

    :cond_f
    move/from16 v15, v32

    const v9, 0x99810b5

    invoke-interface {v8, v9}, LT/l;->U(I)V

    invoke-virtual {v4, v8, v15}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v9

    invoke-virtual {v9}, Lpa/c;->b()Lpa/b;

    move-result-object v9

    goto :goto_6

    :goto_7
    invoke-virtual/range {p1 .. p1}, LKe/a$a;->a()Z

    move-result v9

    if-eqz v9, :cond_10

    const v9, 0x9981a6f

    invoke-interface {v8, v9}, LT/l;->U(I)V

    invoke-virtual {v4, v8, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->f()Lma/a$f;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$f;->a()J

    move-result-wide v9

    :goto_8
    invoke-interface {v8}, LT/l;->J()V

    move-wide/from16 v34, v9

    goto :goto_9

    :cond_10
    const v9, 0x9981def

    invoke-interface {v8, v9}, LT/l;->U(I)V

    invoke-virtual {v4, v8, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->f()Lma/a$f;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$f;->c()J

    move-result-wide v9

    goto :goto_8

    :goto_9
    sget-object v32, LW0/t;->a:LW0/t$a;

    invoke-virtual/range {v32 .. v32}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7f8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v37, v14

    move/from16 v36, v15

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

    move/from16 v38, v5

    move-object/from16 v5, v37

    move-object/from16 v39, v6

    move-object/from16 v6, v26

    move-object/from16 v40, v7

    move-object/from16 p2, v8

    move-wide/from16 v7, v34

    move-object/from16 v26, v27

    move-object/from16 v27, p2

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LKe/a$a;->d()Ls9/d;

    move-result-object v5

    const v6, 0x9982e4a

    move-object/from16 v7, p2

    invoke-interface {v7, v6}, LT/l;->U(I)V

    if-nez v5, :cond_11

    move-object v4, v7

    goto/16 :goto_a

    :cond_11
    const/4 v6, 0x0

    invoke-static {v5, v7, v6}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    invoke-static/range {v38 .. v38}, LY0/h;->j(F)F

    move-result v11

    const/16 v14, 0xd

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, v33

    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v16

    const v6, -0x702360cf

    invoke-interface {v7, v6}, LT/l;->U(I)V

    move-object/from16 v6, v40

    invoke-interface {v7, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {v7, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    move-object/from16 v9, v39

    invoke-interface {v7, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_12

    invoke-virtual/range {v31 .. v31}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_13

    :cond_12
    new-instance v10, LKe/f;

    invoke-direct {v10, v6, v5, v9}, LKe/f;-><init>(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)V

    invoke-interface {v7, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v21, v10

    check-cast v21, Lmh/a;

    invoke-interface {v7}, LT/l;->J()V

    const v6, -0x70234810

    invoke-interface {v7, v6}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual/range {v31 .. v31}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_14

    new-instance v6, LKe/g;

    invoke-direct {v6}, LKe/g;-><init>()V

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v23, v6

    check-cast v23, Lmh/a;

    invoke-interface {v7}, LT/l;->J()V

    const/16 v24, 0x2f

    const/16 v25, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v25}, Landroidx/compose/foundation/d;->h(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    move/from16 v8, v36

    invoke-virtual {v4, v7, v8}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v9

    invoke-virtual {v9}, Lpa/c;->b()Lpa/b;

    move-result-object v9

    invoke-virtual {v9}, Lpa/b;->a()LL0/U;

    move-result-object v26

    invoke-virtual {v4, v7, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->c()J

    move-result-wide v8

    move-object v4, v7

    move-wide v7, v8

    invoke-virtual/range {v32 .. v32}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7f8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v4

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v5, LYg/J;->a:LYg/J;

    :goto_a
    invoke-interface {v4}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LKe/a$a;->c()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    const/4 v6, 0x1

    xor-int/lit8 v7, v5, 0x1

    new-instance v5, LKe/i$a;

    invoke-direct {v5, v1}, LKe/i$a;-><init>(LKe/a$a;)V

    const/16 v8, 0x36

    const v9, -0x5edc3af2

    invoke-static {v9, v6, v5, v4, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const v13, 0x180006

    const/16 v14, 0x1e

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v5, v3

    move v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v12

    move-object v12, v4

    invoke-static/range {v5 .. v14}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    :goto_b
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_16

    new-instance v4, LKe/h;

    invoke-direct {v4, v0, v1, v2}, LKe/h;-><init>(Landroidx/compose/ui/e;LKe/a$a;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final g(Landroidx/compose/ui/e;LKe/a$a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LKe/i;->f(Landroidx/compose/ui/e;LKe/a$a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/platform/h0;LL0/d;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final j(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    sget-object p0, Lvf/a;->a:Lvf/a;

    invoke-virtual {p0, p2}, Lvf/a;->a(Landroid/content/Context;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
