.class public abstract LLe/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;ZLLe/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LLe/m;->e(Landroidx/compose/ui/e;ZLLe/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LLe/d;LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LLe/m;->d(LLe/d;LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;ZLLe/d;LT/l;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "vm"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7fa6bea2

    move-object/from16 v5, p3

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v5, v3, 0x6

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
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    if-nez v7, :cond_3

    invoke-interface {v15, v1}, LT/l;->c(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    const/16 v12, 0x100

    if-nez v7, :cond_5

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v12

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v5, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v14, v15

    goto/16 :goto_8

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, -0x1

    const-string v8, "com.ui.wifiman.ui.discovery.DiscoveryHomeResults (DiscoveryHomeResults.kt:34)"

    invoke-static {v4, v5, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const v4, -0x24fc5c55

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v13, LT/l;->a:LT/l$a;

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    const/4 v14, 0x0

    if-ne v4, v7, :cond_9

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4, v14, v6, v14}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, LT/q0;

    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v4}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const v7, -0x24fc498b

    invoke-interface {v15, v7}, LT/l;->U(I)V

    and-int/lit16 v11, v5, 0x380

    const/4 v10, 0x0

    const/4 v9, 0x1

    if-ne v11, v12, :cond_a

    move v5, v9

    goto :goto_5

    :cond_a
    move v5, v10

    :goto_5
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_b

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_c

    :cond_b
    new-instance v7, LLe/k;

    invoke-direct {v7, v2, v4}, LLe/k;-><init>(LLe/d;LT/q0;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lmh/a;

    invoke-interface {v15}, LT/l;->J()V

    const/16 v16, 0x0

    const/16 v17, 0xc

    const/4 v8, 0x0

    const/16 v18, 0x0

    move v5, v6

    move-object v6, v7

    move v7, v8

    move/from16 v8, v18

    move v12, v9

    move-object v9, v15

    move v12, v10

    move/from16 v10, v16

    move/from16 v19, v11

    move/from16 v11, v17

    invoke-static/range {v5 .. v11}, LO/h;->a(ZLmh/a;FFLT/l;II)LO/g;

    move-result-object v11

    invoke-interface {v4}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v5

    const v6, -0x24fc2e2f

    invoke-interface {v15, v6}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_d

    new-instance v6, LLe/m$a;

    invoke-direct {v6, v4, v14}, LLe/m$a;-><init>(LT/q0;Ldh/e;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lmh/p;

    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v5, v6, v15, v12}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static/range {p0 .. p0}, Lj0/e;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v11, v1}, LO/e;->b(Landroidx/compose/ui/e;LO/g;Z)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->o()Lf0/c;

    move-result-object v6

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v6

    invoke-static {v15, v12}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_f

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_f
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v10, v6, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v10, v8, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_10

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    :cond_10
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v10, v5, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v12, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x0

    const/4 v5, 0x1

    invoke-static {v10, v9, v5, v14}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, LLe/d;->n0()LLi/N;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v14, v15, v8, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v7

    invoke-interface {v7}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, LEe/g;

    const v5, 0x53fade8f

    invoke-interface {v15, v5}, LT/l;->U(I)V

    move/from16 v8, v19

    const/16 v5, 0x100

    if-ne v8, v5, :cond_12

    const/4 v5, 0x1

    goto :goto_7

    :cond_12
    const/4 v5, 0x0

    :goto_7
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_13

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v8, v5, :cond_14

    :cond_13
    new-instance v8, LLe/m$b;

    invoke-direct {v8, v2}, LLe/m$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    check-cast v8, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    move-object v13, v8

    check-cast v13, Lmh/l;

    new-instance v5, LLe/m$c;

    invoke-direct {v5, v2}, LLe/m$c;-><init>(LLe/d;)V

    const v8, -0x276278ec

    const/16 v14, 0x36

    move-object/from16 v19, v10

    const/4 v10, 0x1

    invoke-static {v8, v10, v5, v15, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v18

    const v20, 0xc00006

    const/16 v21, 0x3c

    const/4 v8, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    const/16 v17, 0x0

    move/from16 v8, v22

    move/from16 v9, v23

    move-object/from16 v25, v19

    move/from16 v19, v10

    move-object/from16 v10, v24

    move-object/from16 v22, v11

    move-object v11, v13

    move-object/from16 v26, v12

    move/from16 v13, v17

    move-object/from16 v12, v18

    move-object v13, v15

    move/from16 v14, v20

    move-object/from16 p3, v15

    move/from16 v15, v21

    invoke-static/range {v5 .. v15}, LEe/z;->L(Landroidx/compose/ui/e;LEe/g;LA/B;ZZLmh/r;Lmh/l;Lmh/r;LT/l;II)V

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->m()Lf0/c;

    move-result-object v5

    move-object/from16 v14, v25

    move-object/from16 v15, v26

    invoke-interface {v15, v14, v5}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-interface {v4}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    sget v4, LO/g;->j:I

    const/4 v13, 0x3

    shl-int/2addr v4, v13

    const/16 v17, 0x38

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v6, v22

    move-object/from16 v13, p3

    move-object/from16 v27, v14

    move v14, v4

    move-object v4, v15

    move/from16 v15, v17

    invoke-static/range {v5 .. v15}, LO/c;->d(ZLO/g;Landroidx/compose/ui/e;JJZLT/l;II)V

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    move-object/from16 v14, p3

    invoke-virtual {v5, v14, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->e()Lma/a$e;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$e;->a()J

    move-result-wide v6

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v5, 0x0

    move-object v8, v14

    invoke-static/range {v5 .. v10}, LEe/B;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-virtual/range {p2 .. p2}, LLe/d;->p0()LLi/N;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v5, v6, v14, v7, v8}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LLe/b;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->b()Lf0/c;

    move-result-object v7

    move-object/from16 v9, v27

    invoke-interface {v4, v9, v7}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v4

    instance-of v7, v5, LLe/b$b;

    const/4 v9, 0x0

    const/4 v10, 0x3

    invoke-static {v6, v9, v10, v6}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v11

    invoke-static {v6, v9, v10, v6}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v9

    new-instance v6, LLe/m$d;

    invoke-direct {v6, v5}, LLe/m$d;-><init>(LLe/b;)V

    const v5, -0x35eaaa7c    # -2446689.0f

    const/16 v10, 0x36

    invoke-static {v5, v8, v6, v14, v10}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const v12, 0x30d80

    const/16 v13, 0x10

    const/4 v15, 0x0

    move v5, v7

    move-object v6, v4

    move-object v7, v11

    move-object v8, v9

    move-object v9, v15

    move-object v11, v14

    invoke-static/range {v5 .. v13}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v14}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    :goto_8
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_16

    new-instance v5, LLe/l;

    invoke-direct {v5, v0, v1, v2, v3}, LLe/l;-><init>(Landroidx/compose/ui/e;ZLLe/d;I)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final d(LLe/d;LT/q0;)LYg/J;
    .locals 0

    invoke-virtual {p0}, LLe/d;->x0()V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;ZLLe/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LLe/m;->c(Landroidx/compose/ui/e;ZLLe/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
