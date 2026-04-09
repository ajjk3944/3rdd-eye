.class public abstract Lq/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/p;Lq/s;Lmh/q;LT/l;II)V
    .locals 24

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p5

    move-object/from16 v0, p6

    move-object/from16 v10, p7

    move/from16 v11, p9

    move/from16 v12, p10

    const v1, -0x352a56be    # -7001249.0f

    move-object/from16 v2, p8

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v2, v12, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    invoke-interface {v15, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v11

    goto :goto_1

    :cond_2
    move v2, v11

    :goto_1
    and-int/lit8 v3, v12, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_5

    invoke-interface {v15, v7}, LT/l;->l(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, v12, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_8

    invoke-interface {v15, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v2, v3

    :cond_8
    :goto_5
    and-int/lit8 v3, v12, 0x8

    if-eqz v3, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v14, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v3, v11, 0xc00

    move-object/from16 v14, p3

    if-nez v3, :cond_b

    invoke-interface {v15, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/16 v3, 0x800

    goto :goto_6

    :cond_a
    const/16 v3, 0x400

    :goto_6
    or-int/2addr v2, v3

    :cond_b
    :goto_7
    and-int/lit8 v3, v12, 0x10

    if-eqz v3, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move-object/from16 v5, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v3, v11, 0x6000

    move-object/from16 v5, p4

    if-nez v3, :cond_e

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    const/16 v3, 0x4000

    goto :goto_8

    :cond_d
    const/16 v3, 0x2000

    :goto_8
    or-int/2addr v2, v3

    :cond_e
    :goto_9
    and-int/lit8 v3, v12, 0x20

    const/high16 v4, 0x30000

    if-eqz v3, :cond_f

    or-int/2addr v2, v4

    goto :goto_b

    :cond_f
    and-int v3, v11, v4

    if-nez v3, :cond_11

    invoke-interface {v15, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const/high16 v3, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v3, 0x10000

    :goto_a
    or-int/2addr v2, v3

    :cond_11
    :goto_b
    and-int/lit8 v3, v12, 0x40

    const/high16 v21, 0x200000

    const/high16 v16, 0x180000

    if-eqz v3, :cond_12

    :goto_c
    or-int v2, v2, v16

    goto :goto_e

    :cond_12
    and-int v16, v11, v16

    if-nez v16, :cond_15

    and-int v16, v11, v21

    if-nez v16, :cond_13

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    goto :goto_d

    :cond_13
    invoke-interface {v15, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    :goto_d
    if-eqz v16, :cond_14

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_14
    const/high16 v16, 0x80000

    goto :goto_c

    :cond_15
    :goto_e
    and-int/lit16 v4, v12, 0x80

    const/high16 v16, 0xc00000

    if-eqz v4, :cond_17

    or-int v2, v2, v16

    :cond_16
    :goto_f
    move v4, v2

    goto :goto_11

    :cond_17
    and-int v4, v11, v16

    if-nez v4, :cond_16

    invoke-interface {v15, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    const/high16 v4, 0x800000

    goto :goto_10

    :cond_18
    const/high16 v4, 0x400000

    :goto_10
    or-int/2addr v2, v4

    goto :goto_f

    :goto_11
    const v2, 0x492493

    and-int/2addr v2, v4

    const v13, 0x492492

    if-ne v2, v13, :cond_1a

    invoke-interface {v15}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_19

    goto :goto_12

    :cond_19
    invoke-interface {v15}, LT/l;->C()V

    move-object v11, v0

    move-object v0, v15

    goto/16 :goto_1f

    :cond_1a
    :goto_12
    if-eqz v3, :cond_1b

    const/4 v3, 0x0

    goto :goto_13

    :cond_1b
    move-object v3, v0

    :goto_13
    invoke-static {}, LT/o;->H()Z

    move-result v0

    const/4 v2, -0x1

    if-eqz v0, :cond_1c

    const-string v0, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)"

    invoke-static {v1, v4, v2, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1c
    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lr/o0;->u()Z

    move-result v0

    if-nez v0, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lr/o0;->j()Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_14

    :cond_1d
    const v0, 0x6ab53bda

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->J()V

    move-object v2, v3

    move-object v0, v15

    goto/16 :goto_1e

    :cond_1e
    :goto_14
    const v0, 0x6a9260d1

    invoke-interface {v15, v0}, LT/l;->U(I)V

    and-int/lit8 v1, v4, 0xe

    or-int/lit8 v0, v1, 0x30

    and-int/lit8 v13, v0, 0xe

    xor-int/lit8 v2, v13, 0x6

    const/16 v22, 0x1

    const/4 v11, 0x4

    if-le v2, v11, :cond_1f

    invoke-interface {v15, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    :cond_1f
    and-int/lit8 v0, v0, 0x6

    if-ne v0, v11, :cond_21

    :cond_20
    move/from16 v0, v22

    goto :goto_15

    :cond_21
    const/4 v0, 0x0

    :goto_15
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_22

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_23

    :cond_22
    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_23
    invoke-virtual/range {p0 .. p0}, Lr/o0;->u()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v2

    :cond_24
    const v0, -0x1bd001fd

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_25

    const-string v11, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)"

    move/from16 v18, v1

    move-object/from16 v19, v3

    const/4 v1, -0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v11}, LT/o;->Q(IIILjava/lang/String;)V

    goto :goto_16

    :cond_25
    move/from16 v18, v1

    move-object/from16 v19, v3

    :goto_16
    and-int/lit8 v1, v4, 0x7e

    invoke-static {v6, v7, v2, v15, v1}, Lq/d;->k(Lr/o0;Lmh/l;Ljava/lang/Object;LT/l;I)Lq/k;

    move-result-object v2

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_26

    invoke-static {}, LT/o;->P()V

    :cond_26
    invoke-interface {v15}, LT/l;->J()V

    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_27

    const-string v11, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)"

    move/from16 v20, v4

    const/4 v4, -0x1

    const/4 v5, 0x0

    invoke-static {v0, v5, v4, v11}, LT/o;->Q(IIILjava/lang/String;)V

    goto :goto_17

    :cond_27
    move/from16 v20, v4

    :goto_17
    invoke-static {v6, v7, v3, v15, v1}, Lq/d;->k(Lr/o0;Lmh/l;Ljava/lang/Object;LT/l;I)Lq/k;

    move-result-object v3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-static {}, LT/o;->P()V

    :cond_28
    invoke-interface {v15}, LT/l;->J()V

    or-int/lit16 v5, v13, 0xc00

    const-string v4, "EnterExitTransition"

    move-object/from16 v0, p0

    move/from16 v11, v18

    move-object v1, v2

    move-object v2, v3

    move-object/from16 v13, v19

    move-object v3, v4

    move/from16 v23, v20

    const/high16 v6, 0x100000

    move-object v4, v15

    invoke-static/range {v0 .. v5}, Lr/p0;->b(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LT/l;I)Lr/o0;

    move-result-object v0

    shr-int/lit8 v1, v23, 0xf

    and-int/lit8 v1, v1, 0xe

    invoke-static {v9, v15, v1}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object v1

    invoke-virtual {v0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v9, v2, v3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_29

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_2a

    :cond_29
    new-instance v4, Lq/d$c;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v3}, Lq/d$c;-><init>(Lr/o0;LT/z1;Ldh/e;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2a
    check-cast v4, Lmh/p;

    const/4 v1, 0x0

    invoke-static {v2, v4, v15, v1}, LT/o1;->l(Ljava/lang/Object;Lmh/p;LT/l;I)LT/z1;

    move-result-object v2

    invoke-static {v0}, Lq/d;->j(Lr/o0;)Z

    move-result v1

    if-eqz v1, :cond_2c

    invoke-static {v2}, Lq/d;->c(LT/z1;)Z

    move-result v1

    if-nez v1, :cond_2b

    goto :goto_18

    :cond_2b
    const v0, 0x6ab5249a

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->J()V

    move-object v2, v13

    move-object v0, v15

    goto/16 :goto_1d

    :cond_2c
    :goto_18
    const v1, 0x6a9ffbb7

    invoke-interface {v15, v1}, LT/l;->U(I)V

    const/4 v1, 0x4

    if-ne v11, v1, :cond_2d

    move/from16 v3, v22

    goto :goto_19

    :cond_2d
    const/4 v3, 0x0

    :goto_19
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v3, :cond_2e

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2f

    :cond_2e
    new-instance v1, Lq/f;

    invoke-direct {v1, v0}, Lq/f;-><init>(Lr/o0;)V

    invoke-interface {v15, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2f
    check-cast v1, Lq/f;

    shr-int/lit8 v2, v23, 0x6

    and-int/lit8 v3, v2, 0x70

    or-int/lit16 v3, v3, 0x6000

    and-int/lit16 v2, v2, 0x380

    or-int v19, v3, v2

    const/16 v20, 0x4

    const/16 v16, 0x0

    const-string v17, "Built-in"

    move-object v2, v13

    move-object v13, v0

    move-object/from16 v14, p3

    move-object v0, v15

    move-object/from16 v15, p4

    move-object/from16 v18, v0

    invoke-static/range {v13 .. v20}, Landroidx/compose/animation/g;->g(Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/a;Ljava/lang/String;LT/l;II)Landroidx/compose/ui/e;

    move-result-object v3

    if-eqz v2, :cond_34

    const v4, 0x6aa57161    # 1.0000409E26f

    invoke-interface {v0, v4}, LT/l;->U(I)V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v5, 0x380000

    and-int v5, v23, v5

    if-eq v5, v6, :cond_31

    and-int v5, v23, v21

    if-eqz v5, :cond_30

    invoke-interface {v0, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_30

    goto :goto_1a

    :cond_30
    const/16 v22, 0x0

    :cond_31
    :goto_1a
    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v22, :cond_32

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_33

    :cond_32
    new-instance v5, Lq/d$a;

    invoke-direct {v5, v2}, Lq/d$a;-><init>(Lq/s;)V

    invoke-interface {v0, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_33
    check-cast v5, Lmh/q;

    invoke-static {v4, v5}, Landroidx/compose/ui/layout/g;->a(Landroidx/compose/ui/e;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {v0}, LT/l;->J()V

    goto :goto_1b

    :cond_34
    const v4, 0x5e47d710    # 3.599999E18f

    invoke-interface {v0, v4}, LT/l;->U(I)V

    invoke-interface {v0}, LT/l;->J()V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_1b
    invoke-interface {v3, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-interface {v8, v3}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_35

    new-instance v4, Lq/c;

    invoke-direct {v4, v1}, Lq/c;-><init>(Lq/f;)V

    invoke-interface {v0, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_35
    check-cast v4, Lq/c;

    const/4 v5, 0x0

    invoke-static {v0, v5}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v0}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v0, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v11, LE0/g;->K:LE0/g$a;

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v0}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_36

    invoke-static {}, LT/j;->c()V

    :cond_36
    invoke-interface {v0}, LT/l;->u()V

    invoke-interface {v0}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_37

    invoke-interface {v0, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_1c

    :cond_37
    invoke-interface {v0}, LT/l;->I()V

    :goto_1c
    invoke-static {v0}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v4, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v13, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v13}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_38

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v6, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_39

    :cond_38
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v13, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v13, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_39
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v13, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    shr-int/lit8 v3, v23, 0x12

    and-int/lit8 v3, v3, 0x70

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v10, v1, v0, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, LT/l;->R()V

    invoke-interface {v0}, LT/l;->J()V

    :goto_1d
    invoke-interface {v0}, LT/l;->J()V

    :goto_1e
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3a

    invoke-static {}, LT/o;->P()V

    :cond_3a
    move-object v11, v2

    :goto_1f
    invoke-interface {v0}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_3b

    new-instance v14, Lq/d$b;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object v7, v11

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lq/d$b;-><init>(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/p;Lq/s;Lmh/q;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_3b
    return-void
.end method

.method private static final b(LT/z1;)Lmh/p;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh/p;

    return-object p0
.end method

.method private static final c(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V
    .locals 22

    move/from16 v8, p8

    const v0, 0x694ab2be

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v8, 0x30

    move v3, v2

    move/from16 v2, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x30

    if-nez v2, :cond_2

    move/from16 v2, p1

    invoke-interface {v1, v2}, LT/l;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_0

    :cond_1
    const/16 v3, 0x10

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move/from16 v2, p1

    move v3, v8

    :goto_1
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_4

    or-int/lit16 v3, v3, 0x180

    :cond_3
    move-object/from16 v5, p2

    goto :goto_3

    :cond_4
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_3

    move-object/from16 v5, p2

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_2

    :cond_5
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move-object/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v8, 0xc00

    if-nez v7, :cond_6

    move-object/from16 v7, p3

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_4

    :cond_8
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v3, v3, 0x6000

    :cond_9
    move-object/from16 v10, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v8, 0x6000

    if-nez v10, :cond_9

    move-object/from16 v10, p4

    invoke-interface {v1, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_6

    :cond_b
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit8 v11, p9, 0x10

    const/high16 v12, 0x30000

    if-eqz v11, :cond_d

    or-int/2addr v3, v12

    :cond_c
    move-object/from16 v12, p5

    goto :goto_9

    :cond_d
    and-int/2addr v12, v8

    if-nez v12, :cond_c

    move-object/from16 v12, p5

    invoke-interface {v1, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/high16 v13, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v13, 0x10000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x180000

    if-eqz v13, :cond_f

    or-int/2addr v3, v14

    move-object/from16 v15, p6

    goto :goto_b

    :cond_f
    and-int v13, v8, v14

    move-object/from16 v15, p6

    if-nez v13, :cond_11

    invoke-interface {v1, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    const/high16 v13, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v13, 0x80000

    :goto_a
    or-int/2addr v3, v13

    :cond_11
    :goto_b
    const v13, 0x92491

    and-int/2addr v13, v3

    const v14, 0x92490

    if-ne v13, v14, :cond_13

    invoke-interface {v1}, LT/l;->v()Z

    move-result v13

    if-nez v13, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v5

    move-object v4, v7

    move-object v5, v10

    move-object v6, v12

    goto/16 :goto_11

    :cond_13
    :goto_c
    if-eqz v4, :cond_14

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_14
    move-object v4, v5

    :goto_d
    const/4 v5, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    if-eqz v6, :cond_15

    invoke-static {v14, v5, v13, v14}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v6

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/g;->m(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object v6

    goto :goto_e

    :cond_15
    move-object v6, v7

    :goto_e
    if-eqz v9, :cond_16

    invoke-static {v14, v5, v13, v14}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v5

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/g;->y(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroidx/compose/animation/k;->c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;

    move-result-object v5

    goto :goto_f

    :cond_16
    move-object v5, v10

    :goto_f
    if-eqz v11, :cond_17

    const-string v7, "AnimatedVisibility"

    goto :goto_10

    :cond_17
    move-object v7, v12

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_18

    const/4 v9, -0x1

    const-string v10, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)"

    invoke-static {v0, v3, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    shr-int/lit8 v9, v3, 0x3

    and-int/lit8 v10, v9, 0xe

    shr-int/lit8 v11, v3, 0xc

    and-int/lit8 v11, v11, 0x70

    or-int/2addr v10, v11

    const/4 v11, 0x0

    invoke-static {v0, v7, v1, v10, v11}, Lr/p0;->g(Ljava/lang/Object;Ljava/lang/String;LT/l;II)Lr/o0;

    move-result-object v0

    sget-object v10, Lq/d$h;->a:Lq/d$h;

    and-int/lit16 v11, v3, 0x380

    or-int/lit8 v11, v11, 0x30

    and-int/lit16 v12, v3, 0x1c00

    or-int/2addr v11, v12

    const v12, 0xe000

    and-int/2addr v3, v12

    or-int/2addr v3, v11

    const/high16 v11, 0x70000

    and-int/2addr v9, v11

    or-int v16, v3, v9

    move-object v9, v0

    move-object v11, v4

    move-object v12, v6

    move-object v13, v5

    move-object/from16 v14, p6

    move-object v15, v1

    invoke-static/range {v9 .. v16}, Lq/d;->g(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    move-object v3, v4

    move-object v4, v6

    move-object v6, v7

    :goto_11
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1a

    new-instance v11, Lq/d$i;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lq/d$i;-><init>(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method

.method public static final e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V
    .locals 22

    move/from16 v8, p8

    const v0, -0x67cad85a

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v8, 0x30

    move v3, v2

    move/from16 v2, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x30

    if-nez v2, :cond_2

    move/from16 v2, p1

    invoke-interface {v1, v2}, LT/l;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_0

    :cond_1
    const/16 v3, 0x10

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move/from16 v2, p1

    move v3, v8

    :goto_1
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_4

    or-int/lit16 v3, v3, 0x180

    :cond_3
    move-object/from16 v5, p2

    goto :goto_3

    :cond_4
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_3

    move-object/from16 v5, p2

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_2

    :cond_5
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move-object/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v8, 0xc00

    if-nez v7, :cond_6

    move-object/from16 v7, p3

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_4

    :cond_8
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v3, v3, 0x6000

    :cond_9
    move-object/from16 v10, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v8, 0x6000

    if-nez v10, :cond_9

    move-object/from16 v10, p4

    invoke-interface {v1, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_6

    :cond_b
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit8 v11, p9, 0x10

    const/high16 v12, 0x30000

    if-eqz v11, :cond_d

    or-int/2addr v3, v12

    :cond_c
    move-object/from16 v12, p5

    goto :goto_9

    :cond_d
    and-int/2addr v12, v8

    if-nez v12, :cond_c

    move-object/from16 v12, p5

    invoke-interface {v1, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/high16 v13, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v13, 0x10000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x180000

    if-eqz v13, :cond_f

    or-int/2addr v3, v14

    move-object/from16 v15, p6

    goto :goto_b

    :cond_f
    and-int v13, v8, v14

    move-object/from16 v15, p6

    if-nez v13, :cond_11

    invoke-interface {v1, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    const/high16 v13, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v13, 0x80000

    :goto_a
    or-int/2addr v3, v13

    :cond_11
    :goto_b
    const v13, 0x92491

    and-int/2addr v13, v3

    const v14, 0x92490

    if-ne v13, v14, :cond_13

    invoke-interface {v1}, LT/l;->v()Z

    move-result v13

    if-nez v13, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v5

    move-object v4, v7

    move-object v5, v10

    move-object v6, v12

    goto/16 :goto_11

    :cond_13
    :goto_c
    if-eqz v4, :cond_14

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_14
    move-object v4, v5

    :goto_d
    const/4 v5, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    if-eqz v6, :cond_15

    invoke-static {v14, v5, v13, v14}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v6

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/g;->i(Lr/H;Lf0/c$b;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object v6

    goto :goto_e

    :cond_15
    move-object v6, v7

    :goto_e
    if-eqz v9, :cond_16

    invoke-static {v14, v5, v13, v14}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v5

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/g;->u(Lr/H;Lf0/c$b;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroidx/compose/animation/k;->c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;

    move-result-object v5

    goto :goto_f

    :cond_16
    move-object v5, v10

    :goto_f
    if-eqz v11, :cond_17

    const-string v7, "AnimatedVisibility"

    goto :goto_10

    :cond_17
    move-object v7, v12

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_18

    const/4 v9, -0x1

    const-string v10, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)"

    invoke-static {v0, v3, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    shr-int/lit8 v9, v3, 0x3

    and-int/lit8 v10, v9, 0xe

    shr-int/lit8 v11, v3, 0xc

    and-int/lit8 v11, v11, 0x70

    or-int/2addr v10, v11

    const/4 v11, 0x0

    invoke-static {v0, v7, v1, v10, v11}, Lr/p0;->g(Ljava/lang/Object;Ljava/lang/String;LT/l;II)Lr/o0;

    move-result-object v0

    sget-object v10, Lq/d$f;->a:Lq/d$f;

    and-int/lit16 v11, v3, 0x380

    or-int/lit8 v11, v11, 0x30

    and-int/lit16 v12, v3, 0x1c00

    or-int/2addr v11, v12

    const v12, 0xe000

    and-int/2addr v3, v12

    or-int/2addr v3, v11

    const/high16 v11, 0x70000

    and-int/2addr v9, v11

    or-int v16, v3, v9

    move-object v9, v0

    move-object v11, v4

    move-object v12, v6

    move-object v13, v5

    move-object/from16 v14, p6

    move-object v15, v1

    invoke-static/range {v9 .. v16}, Lq/d;->g(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    move-object v3, v4

    move-object v4, v6

    move-object v6, v7

    :goto_11
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1a

    new-instance v11, Lq/d$g;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lq/d$g;-><init>(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method

.method public static final f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V
    .locals 22

    move/from16 v7, p7

    const v0, 0x7c7f8c4e

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v7, 0x6

    move v3, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v7

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v3, v7

    :goto_1
    and-int/lit8 v4, p8, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, p8, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v1, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-interface {v1, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit8 v11, p8, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v7, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v1, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit8 v13, p8, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_f

    or-int/2addr v3, v14

    move-object/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int v13, v7, v14

    move-object/from16 v15, p5

    if-nez v13, :cond_11

    invoke-interface {v1, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v3, v13

    :cond_11
    :goto_b
    const v13, 0x12493

    and-int/2addr v13, v3

    const v14, 0x12492

    if-ne v13, v14, :cond_13

    invoke-interface {v1}, LT/l;->v()Z

    move-result v13

    if-nez v13, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v1}, LT/l;->C()V

    move-object v4, v5

    move-object v3, v8

    move-object v5, v12

    goto/16 :goto_11

    :cond_13
    :goto_c
    if-eqz v4, :cond_14

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_14
    move-object v4, v5

    :goto_d
    const/4 v5, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    if-eqz v6, :cond_15

    invoke-static {v14, v5, v13, v14}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v6

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/g;->k(Lr/H;Lf0/c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object v6

    goto :goto_e

    :cond_15
    move-object v6, v8

    :goto_e
    if-eqz v9, :cond_16

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/g;->w(Lr/H;Lf0/c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v8

    invoke-static {v14, v5, v13, v14}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v5

    invoke-virtual {v8, v5}, Landroidx/compose/animation/k;->c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;

    move-result-object v5

    goto :goto_f

    :cond_16
    move-object v5, v10

    :goto_f
    if-eqz v11, :cond_17

    const-string v8, "AnimatedVisibility"

    move-object v14, v8

    goto :goto_10

    :cond_17
    move-object v14, v12

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_18

    const/4 v8, -0x1

    const-string v9, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)"

    invoke-static {v0, v3, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    and-int/lit8 v8, v3, 0xe

    shr-int/lit8 v9, v3, 0x9

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v8, v9

    const/4 v9, 0x0

    invoke-static {v0, v14, v1, v8, v9}, Lr/p0;->g(Ljava/lang/Object;Ljava/lang/String;LT/l;II)Lr/o0;

    move-result-object v8

    sget-object v9, Lq/d$d;->a:Lq/d$d;

    shl-int/lit8 v0, v3, 0x3

    and-int/lit16 v10, v0, 0x380

    or-int/lit8 v10, v10, 0x30

    and-int/lit16 v11, v0, 0x1c00

    or-int/2addr v10, v11

    const v11, 0xe000

    and-int/2addr v0, v11

    or-int/2addr v0, v10

    const/high16 v10, 0x70000

    and-int/2addr v3, v10

    or-int/2addr v0, v3

    move-object v10, v4

    move-object v11, v6

    move-object v12, v5

    move-object/from16 v13, p5

    move-object v3, v14

    move-object v14, v1

    move v15, v0

    invoke-static/range {v8 .. v15}, Lq/d;->g(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    move-object v10, v5

    move-object v5, v3

    move-object v3, v6

    :goto_11
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v11, Lq/d$e;

    move-object v0, v11

    move/from16 v1, p0

    move-object v2, v4

    move-object v4, v10

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lq/d$e;-><init>(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;II)V

    invoke-interface {v9, v11}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method

.method public static final g(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;LT/l;I)V
    .locals 18

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move/from16 v14, p7

    const v0, 0x19a0f3eb

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v1, v14, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-interface {v15, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_1
    move v1, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-interface {v15, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v14, 0x180

    if-nez v3, :cond_5

    invoke-interface {v15, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v14, 0xc00

    move-object/from16 v10, p3

    if-nez v3, :cond_7

    invoke-interface {v15, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v1, v3

    :cond_7
    and-int/lit16 v3, v14, 0x6000

    move-object/from16 v9, p4

    if-nez v3, :cond_9

    invoke-interface {v15, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v1, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int v5, v14, v3

    move-object/from16 v8, p5

    if-nez v5, :cond_b

    invoke-interface {v15, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/high16 v5, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v5, 0x10000

    :goto_6
    or-int/2addr v1, v5

    :cond_b
    const v5, 0x12493

    and-int/2addr v5, v1

    const v6, 0x12492

    if-ne v5, v6, :cond_d

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_7

    :cond_c
    invoke-interface {v15}, LT/l;->C()V

    goto/16 :goto_9

    :cond_d
    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_e

    const/4 v5, -0x1

    const-string v6, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)"

    invoke-static {v0, v1, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    and-int/lit8 v0, v1, 0x70

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v0, v4, :cond_f

    move v4, v6

    goto :goto_8

    :cond_f
    move v4, v5

    :goto_8
    and-int/lit8 v7, v1, 0xe

    if-ne v7, v2, :cond_10

    move v5, v6

    :cond_10
    or-int v2, v4, v5

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_11

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_12

    :cond_11
    new-instance v4, Lq/d$j;

    invoke-direct {v4, v12, v11}, Lq/d$j;-><init>(Lmh/l;Lr/o0;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lmh/q;

    invoke-static {v13, v4}, Landroidx/compose/ui/layout/g;->a(Landroidx/compose/ui/e;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v5, Lq/d$k;->a:Lq/d$k;

    or-int/2addr v3, v7

    or-int/2addr v0, v3

    and-int/lit16 v3, v1, 0x1c00

    or-int/2addr v0, v3

    const v3, 0xe000

    and-int/2addr v3, v1

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    shl-int/lit8 v1, v1, 0x6

    and-int/2addr v1, v3

    or-int v16, v0, v1

    const/16 v17, 0x40

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v7, p5

    move-object v8, v15

    move/from16 v9, v16

    move/from16 v10, v17

    invoke-static/range {v0 .. v10}, Lq/d;->a(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/p;Lq/s;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_9
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v9, Lq/d$l;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lq/d$l;-><init>(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;I)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method public static final synthetic h(LT/z1;)Lmh/p;
    .locals 0

    invoke-static {p0}, Lq/d;->b(LT/z1;)Lmh/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lr/o0;)Z
    .locals 0

    invoke-static {p0}, Lq/d;->j(Lr/o0;)Z

    move-result p0

    return p0
.end method

.method private static final j(Lr/o0;)Z
    .locals 2

    invoke-virtual {p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lq/k;->PostExit:Lq/k;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final k(Lr/o0;Lmh/l;Ljava/lang/Object;LT/l;I)Lq/k;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)"

    const v2, 0x158d233e

    invoke-static {v2, p4, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p4, -0x35c429c8

    invoke-interface {p3, p4, p0}, LT/l;->s(ILjava/lang/Object;)V

    invoke-virtual {p0}, Lr/o0;->u()Z

    move-result p4

    if-eqz p4, :cond_3

    const p4, 0x7d3f3e2b

    invoke-interface {p3, p4}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p0, Lq/k;->Visible:Lq/k;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lq/k;->PostExit:Lq/k;

    goto :goto_1

    :cond_2
    sget-object p0, Lq/k;->PreEnter:Lq/k;

    goto :goto_1

    :cond_3
    const p4, 0x7d42cf94

    invoke-interface {p3, p4}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p4, v0, :cond_4

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p4, v1, v0, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p4

    invoke-interface {p3, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast p4, LT/q0;

    invoke-virtual {p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p4, p0}, LT/q0;->setValue(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_6

    sget-object p0, Lq/k;->Visible:Lq/k;

    goto :goto_0

    :cond_6
    invoke-interface {p4}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_7

    sget-object p0, Lq/k;->PostExit:Lq/k;

    goto :goto_0

    :cond_7
    sget-object p0, Lq/k;->PreEnter:Lq/k;

    :goto_0
    invoke-interface {p3}, LT/l;->J()V

    :goto_1
    invoke-interface {p3}, LT/l;->N()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-object p0
.end method
