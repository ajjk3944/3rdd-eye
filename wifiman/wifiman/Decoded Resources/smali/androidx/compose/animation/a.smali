.class public abstract Landroidx/compose/animation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;LT/l;II)V
    .locals 18

    move-object/from16 v1, p0

    move/from16 v8, p8

    const v0, 0x7f1ebc6d

    move-object/from16 v2, p7

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v8, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_3

    and-int/lit8 v3, v8, 0x8

    if-nez v3, :cond_1

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_1
    invoke-interface {v2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_2

    const/4 v3, 0x4

    goto :goto_1

    :cond_2
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v8

    goto :goto_2

    :cond_3
    move v3, v8

    :goto_2
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_5

    or-int/lit8 v3, v3, 0x30

    :cond_4
    move-object/from16 v5, p1

    goto :goto_4

    :cond_5
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_4

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x20

    goto :goto_3

    :cond_6
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    :goto_4
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_8

    or-int/lit16 v3, v3, 0x180

    :cond_7
    move-object/from16 v7, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_7

    move-object/from16 v7, p2

    invoke-interface {v2, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x100

    goto :goto_5

    :cond_9
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v3, v9

    :goto_6
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_b

    or-int/lit16 v3, v3, 0xc00

    :cond_a
    move-object/from16 v10, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_a

    move-object/from16 v10, p3

    invoke-interface {v2, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/16 v11, 0x800

    goto :goto_7

    :cond_c
    const/16 v11, 0x400

    :goto_7
    or-int/2addr v3, v11

    :goto_8
    and-int/lit8 v11, p9, 0x10

    if-eqz v11, :cond_e

    or-int/lit16 v3, v3, 0x6000

    :cond_d
    move-object/from16 v12, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_d

    move-object/from16 v12, p4

    invoke-interface {v2, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    const/16 v13, 0x4000

    goto :goto_9

    :cond_f
    const/16 v13, 0x2000

    :goto_9
    or-int/2addr v3, v13

    :goto_a
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_11

    or-int/2addr v3, v14

    :cond_10
    move-object/from16 v14, p5

    goto :goto_c

    :cond_11
    and-int/2addr v14, v8

    if-nez v14, :cond_10

    move-object/from16 v14, p5

    invoke-interface {v2, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    const/high16 v15, 0x20000

    goto :goto_b

    :cond_12
    const/high16 v15, 0x10000

    :goto_b
    or-int/2addr v3, v15

    :goto_c
    and-int/lit8 v15, p9, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_14

    or-int v3, v3, v16

    :cond_13
    move-object/from16 v15, p6

    goto :goto_e

    :cond_14
    and-int v15, v8, v16

    if-nez v15, :cond_13

    move-object/from16 v15, p6

    invoke-interface {v2, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_15

    const/high16 v16, 0x100000

    goto :goto_d

    :cond_15
    const/high16 v16, 0x80000

    :goto_d
    or-int v3, v3, v16

    :goto_e
    const v16, 0x92493

    and-int v0, v3, v16

    const v5, 0x92492

    if-ne v0, v5, :cond_17

    invoke-interface {v2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_f

    :cond_16
    invoke-interface {v2}, LT/l;->C()V

    move-object/from16 v3, p1

    move-object v4, v10

    move-object v5, v12

    move-object v6, v14

    goto/16 :goto_14

    :cond_17
    :goto_f
    if-eqz v4, :cond_18

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_10

    :cond_18
    move-object/from16 v0, p1

    :goto_10
    if-eqz v6, :cond_19

    sget-object v4, Landroidx/compose/animation/a$a;->a:Landroidx/compose/animation/a$a;

    move-object v7, v4

    :cond_19
    if-eqz v9, :cond_1a

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->o()Lf0/c;

    move-result-object v4

    goto :goto_11

    :cond_1a
    move-object v4, v10

    :goto_11
    if-eqz v11, :cond_1b

    const-string v5, "AnimatedContent"

    goto :goto_12

    :cond_1b
    move-object v5, v12

    :goto_12
    if-eqz v13, :cond_1c

    sget-object v6, Landroidx/compose/animation/a$b;->a:Landroidx/compose/animation/a$b;

    goto :goto_13

    :cond_1c
    move-object v6, v14

    :goto_13
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_1d

    const/4 v9, -0x1

    const-string v10, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)"

    const v11, 0x7f1ebc6d

    invoke-static {v11, v3, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1d
    and-int/lit8 v9, v3, 0xe

    shr-int/lit8 v10, v3, 0x9

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v9, v10

    const/4 v10, 0x0

    invoke-static {v1, v5, v2, v9, v10}, Lr/p0;->g(Ljava/lang/Object;Ljava/lang/String;LT/l;II)Lr/o0;

    move-result-object v9

    and-int/lit16 v10, v3, 0x1ff0

    shr-int/lit8 v3, v3, 0x3

    const v11, 0xe000

    and-int/2addr v11, v3

    or-int/2addr v10, v11

    const/high16 v11, 0x70000

    and-int/2addr v3, v11

    or-int v16, v10, v3

    const/16 v17, 0x0

    move-object v10, v0

    move-object v11, v7

    move-object v12, v4

    move-object v13, v6

    move-object/from16 v14, p6

    move-object v15, v2

    invoke-static/range {v9 .. v17}, Landroidx/compose/animation/a;->b(Lr/o0;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Lmh/l;Lmh/r;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    move-object v3, v0

    :goto_14
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1f

    new-instance v11, Landroidx/compose/animation/a$c;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v7

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/animation/a$c;-><init>(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void
.end method

.method public static final b(Lr/o0;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Lmh/l;Lmh/r;LT/l;II)V
    .locals 20

    move-object/from16 v7, p0

    move/from16 v8, p7

    const v0, -0x6d60584

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v9

    const/high16 v1, -0x80000000

    and-int v1, p8, v1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_2

    invoke-interface {v9, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_2
    move v1, v8

    :goto_1
    and-int/lit8 v3, p8, 0x1

    if-eqz v3, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-interface {v9, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :goto_3
    and-int/lit8 v5, p8, 0x2

    if-eqz v5, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-interface {v9, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v1, v10

    :goto_5
    and-int/lit8 v10, p8, 0x4

    if-eqz v10, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v9, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v1, v12

    :goto_7
    and-int/lit8 v12, p8, 0x8

    if-eqz v12, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move-object/from16 v13, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_c

    move-object/from16 v13, p4

    invoke-interface {v9, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v1, v14

    :goto_9
    and-int/lit8 v14, p8, 0x10

    const/high16 v15, 0x30000

    if-eqz v14, :cond_10

    or-int/2addr v1, v15

    :cond_f
    move-object/from16 v14, p5

    goto :goto_b

    :cond_10
    and-int v14, v8, v15

    if-nez v14, :cond_f

    move-object/from16 v14, p5

    invoke-interface {v9, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v1, v15

    :goto_b
    const v15, 0x12493

    and-int/2addr v15, v1

    const v2, 0x12492

    if-ne v15, v2, :cond_13

    invoke-interface {v9}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v9}, LT/l;->C()V

    move-object v2, v4

    move-object v3, v6

    move-object v4, v11

    move-object v5, v13

    goto/16 :goto_1c

    :cond_13
    :goto_c
    if-eqz v3, :cond_14

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v15, v2

    goto :goto_d

    :cond_14
    move-object v15, v4

    :goto_d
    if-eqz v5, :cond_15

    sget-object v2, Landroidx/compose/animation/a$d;->a:Landroidx/compose/animation/a$d;

    move-object v6, v2

    :cond_15
    if-eqz v10, :cond_16

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    move-object v11, v2

    :cond_16
    if-eqz v12, :cond_17

    sget-object v2, Landroidx/compose/animation/a$e;->a:Landroidx/compose/animation/a$e;

    move-object v13, v2

    :cond_17
    invoke-static {}, LT/o;->H()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_18

    const-string v2, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)"

    invoke-static {v0, v1, v3, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v0

    invoke-interface {v9, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/t;

    and-int/lit8 v1, v1, 0xe

    const/4 v10, 0x0

    const/4 v12, 0x1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_19

    move v2, v12

    goto :goto_e

    :cond_19
    move v2, v10

    :goto_e
    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1a

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_1b

    :cond_1a
    new-instance v4, Landroidx/compose/animation/e;

    invoke-direct {v4, v7, v11, v0}, Landroidx/compose/animation/e;-><init>(Lr/o0;Lf0/c;LY0/t;)V

    invoke-interface {v9, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    move-object v5, v4

    check-cast v5, Landroidx/compose/animation/e;

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1c

    move v2, v12

    goto :goto_f

    :cond_1c
    move v2, v10

    :goto_f
    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1d

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_1e

    :cond_1d
    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LT/o1;->g([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/k;

    move-result-object v4

    invoke-interface {v9, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1e
    check-cast v4, Landroidx/compose/runtime/snapshots/k;

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1f

    move v1, v12

    goto :goto_10

    :cond_1f
    move v1, v10

    :goto_10
    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_20

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_21

    :cond_20
    invoke-static {}, Lo/S;->d()Lo/H;

    move-result-object v2

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    check-cast v2, Lo/H;

    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/runtime/snapshots/k;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/k;->clear()V

    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    :cond_22
    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/k;->size()I

    move-result v1

    if-ne v1, v12, :cond_23

    invoke-virtual {v4, v10}, Landroidx/compose/runtime/snapshots/k;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    :cond_23
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/k;->clear()V

    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    :cond_24
    invoke-virtual {v2}, Lo/Q;->e()I

    move-result v1

    if-ne v1, v12, :cond_25

    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Lo/Q;->b(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    :cond_25
    invoke-virtual {v2}, Lo/H;->i()V

    :cond_26
    invoke-virtual {v5, v11}, Landroidx/compose/animation/e;->v(Lf0/c;)V

    invoke-virtual {v5, v0}, Landroidx/compose/animation/e;->w(LY0/t;)V

    :cond_27
    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroidx/compose/runtime/snapshots/k;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v1, v10

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v13, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v13, v10}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_28

    const/4 v0, -0x1

    goto :goto_12

    :cond_28
    add-int/lit8 v1, v1, 0x1

    const/4 v10, 0x0

    goto :goto_11

    :cond_29
    const/4 v0, -0x1

    const/4 v1, -0x1

    :goto_12
    if-ne v1, v0, :cond_2a

    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroidx/compose/runtime/snapshots/k;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_2a
    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v1, v0}, Landroidx/compose/runtime/snapshots/k;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2b
    :goto_13
    invoke-virtual/range {p0 .. p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/Q;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual/range {p0 .. p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/Q;->b(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto :goto_14

    :cond_2c
    const v0, 0x3691f797    # 4.35016E-6f

    invoke-interface {v9, v0}, LT/l;->U(I)V

    invoke-interface {v9}, LT/l;->J()V

    move-object/from16 p4, v4

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    goto :goto_16

    :cond_2d
    :goto_14
    const v0, 0x366a3a81

    invoke-interface {v9, v0}, LT/l;->U(I)V

    invoke-virtual {v2}, Lo/H;->i()V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v10

    const/4 v3, 0x0

    :goto_15
    if-ge v3, v10, :cond_2e

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v0, Landroidx/compose/animation/a$f;

    move-object/from16 p1, v0

    move-object/from16 p3, v1

    move-object/from16 v1, p0

    move-object/from16 v16, v2

    move-object/from16 v2, p3

    move/from16 v17, v3

    move-object v3, v6

    move-object/from16 p4, v4

    move-object v4, v5

    move-object/from16 v18, v5

    move-object/from16 v5, p4

    move-object/from16 v19, v6

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/animation/a$f;-><init>(Lr/o0;Ljava/lang/Object;Lmh/l;Landroidx/compose/animation/e;Landroidx/compose/runtime/snapshots/k;Lmh/r;)V

    const/16 v0, 0x36

    const v1, 0x34c9ce26

    move-object/from16 v2, p1

    invoke-static {v1, v12, v2, v9, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    move-object/from16 v1, p3

    move-object/from16 v2, v16

    invoke-virtual {v2, v1, v0}, Lo/H;->s(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v3, v17, 0x1

    move-object/from16 v4, p4

    move-object/from16 v5, v18

    move-object/from16 v6, v19

    goto :goto_15

    :cond_2e
    move-object/from16 p4, v4

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    invoke-interface {v9}, LT/l;->J()V

    :goto_16
    invoke-virtual/range {p0 .. p0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v0

    move-object/from16 v4, v18

    invoke-interface {v9, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v9, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v1

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2f

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_30

    :cond_2f
    move-object/from16 v6, v19

    goto :goto_17

    :cond_30
    move-object/from16 v6, v19

    goto :goto_18

    :goto_17
    invoke-interface {v6, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lq/i;

    invoke-interface {v9, v1}, LT/l;->K(Ljava/lang/Object;)V

    :goto_18
    check-cast v1, Lq/i;

    const/4 v0, 0x0

    invoke-virtual {v4, v1, v9, v0}, Landroidx/compose/animation/e;->k(Lq/i;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {v15, v1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_31

    new-instance v1, Landroidx/compose/animation/b;

    invoke-direct {v1, v4}, Landroidx/compose/animation/b;-><init>(Landroidx/compose/animation/e;)V

    invoke-interface {v9, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_31
    check-cast v1, Landroidx/compose/animation/b;

    const/4 v3, 0x0

    invoke-static {v9, v3}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v9}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v9, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v9}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_32

    invoke-static {}, LT/j;->c()V

    :cond_32
    invoke-interface {v9}, LT/l;->u()V

    invoke-interface {v9}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_33

    invoke-interface {v9, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_19

    :cond_33
    invoke-interface {v9}, LT/l;->I()V

    :goto_19
    invoke-static {v9}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v10, v1, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v10, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v10}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_34

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v3, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_35

    :cond_34
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v10, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v10, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_35
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v10, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const v0, -0x58dee1d6

    invoke-interface {v9, v0}, LT/l;->U(I)V

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_1a
    if-ge v1, v0, :cond_37

    move-object/from16 v4, p4

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const v5, 0x71be94bd

    invoke-interface {v13, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v9, v5, v10}, LT/l;->s(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmh/p;

    if-nez v3, :cond_36

    const v3, -0x39eb2590

    invoke-interface {v9, v3}, LT/l;->U(I)V

    invoke-interface {v9}, LT/l;->J()V

    const/4 v5, 0x0

    goto :goto_1b

    :cond_36
    const v5, 0x71be9bb1

    invoke-interface {v9, v5}, LT/l;->U(I)V

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v9, v10}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v9}, LT/l;->J()V

    :goto_1b
    invoke-interface {v9}, LT/l;->N()V

    add-int/lit8 v1, v1, 0x1

    move-object/from16 p4, v4

    goto :goto_1a

    :cond_37
    invoke-interface {v9}, LT/l;->J()V

    invoke-interface {v9}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-static {}, LT/o;->P()V

    :cond_38
    move-object v3, v6

    move-object v4, v11

    move-object v5, v13

    move-object v2, v15

    :goto_1c
    invoke-interface {v9}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_39

    new-instance v10, Landroidx/compose/animation/a$g;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/a$g;-><init>(Lr/o0;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Lmh/l;Lmh/r;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_39
    return-void
.end method

.method public static final c(ZLmh/p;)Lq/v;
    .locals 1

    new-instance v0, Landroidx/compose/animation/n;

    invoke-direct {v0, p0, p1}, Landroidx/compose/animation/n;-><init>(ZLmh/p;)V

    return-object v0
.end method

.method public static synthetic d(ZLmh/p;ILjava/lang/Object;)Lq/v;
    .locals 0

    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    const/4 p0, 0x1

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    sget-object p1, Landroidx/compose/animation/a$h;->a:Landroidx/compose/animation/a$h;

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(ZLmh/p;)Lq/v;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)Lq/i;
    .locals 8

    new-instance v7, Lq/i;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lq/i;-><init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;FLq/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method
