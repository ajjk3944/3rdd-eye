.class public abstract LN/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZLmh/a;Landroidx/compose/ui/e;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/r;Lmh/q;LT/l;II)V
    .locals 24

    move/from16 v9, p9

    const v0, -0x7f470bfb

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v8

    and-int/lit8 v1, p10, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v9, 0x6

    move/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v9, 0x6

    move/from16 v10, p0

    if-nez v1, :cond_2

    invoke-interface {v8, v10}, LT/l;->c(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_2
    move v1, v9

    :goto_1
    and-int/lit8 v3, p10, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x30

    move-object/from16 v11, p1

    if-nez v3, :cond_5

    invoke-interface {v8, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p10, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v9, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x100

    goto :goto_4

    :cond_8
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v1, v5

    :goto_5
    and-int/lit8 v5, p10, 0x8

    if-eqz v5, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-wide/from16 v6, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v6, v9, 0xc00

    if-nez v6, :cond_9

    move-wide/from16 v6, p3

    invoke-interface {v8, v6, v7}, LT/l;->j(J)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v1, v12

    :goto_7
    and-int/lit16 v12, v9, 0x6000

    if-nez v12, :cond_e

    and-int/lit8 v12, p10, 0x10

    if-nez v12, :cond_c

    move-object/from16 v12, p5

    invoke-interface {v8, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v12, p5

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v1, v13

    goto :goto_9

    :cond_e
    move-object/from16 v12, p5

    :goto_9
    and-int/lit8 v13, p10, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_10

    or-int/2addr v1, v14

    :cond_f
    move-object/from16 v14, p6

    goto :goto_b

    :cond_10
    and-int/2addr v14, v9

    if-nez v14, :cond_f

    move-object/from16 v14, p6

    invoke-interface {v8, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v1, v15

    :goto_b
    and-int/lit8 v15, p10, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_13

    or-int v1, v1, v16

    :cond_12
    move-object/from16 v15, p7

    goto :goto_d

    :cond_13
    and-int v15, v9, v16

    if-nez v15, :cond_12

    move-object/from16 v15, p7

    invoke-interface {v8, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_14
    const/high16 v16, 0x80000

    :goto_c
    or-int v1, v1, v16

    :goto_d
    const v16, 0x92493

    and-int v2, v1, v16

    const v0, 0x92492

    if-ne v2, v0, :cond_16

    invoke-interface {v8}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v8}, LT/l;->C()V

    move-object v3, v4

    move-wide v4, v6

    move-object v6, v12

    move-object v7, v14

    goto/16 :goto_15

    :cond_16
    :goto_e
    invoke-interface {v8}, LT/l;->q()V

    and-int/lit8 v0, v9, 0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_1a

    invoke-interface {v8}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_10

    :cond_17
    invoke-interface {v8}, LT/l;->C()V

    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_18

    const v0, -0xe001

    and-int/2addr v1, v0

    :cond_18
    move-object v0, v4

    :cond_19
    move-object/from16 v23, v14

    :goto_f
    move-object v14, v12

    move-wide v12, v6

    goto :goto_12

    :cond_1a
    :goto_10
    if-eqz v3, :cond_1b

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_11

    :cond_1b
    move-object v0, v4

    :goto_11
    const/4 v3, 0x0

    if-eqz v5, :cond_1c

    int-to-float v4, v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v5, v4}, LY0/i;->a(FF)J

    move-result-wide v4

    move-wide v6, v4

    :cond_1c
    and-int/lit8 v4, p10, 0x10

    if-eqz v4, :cond_1d

    invoke-static {v3, v8, v3, v2}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v3

    const v4, -0xe001

    and-int/2addr v1, v4

    move-object v12, v3

    :cond_1d
    if-eqz v13, :cond_19

    new-instance v3, Landroidx/compose/ui/window/r;

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v3

    invoke-direct/range {v17 .. v23}, Landroidx/compose/ui/window/r;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v3

    goto :goto_f

    :goto_12
    invoke-interface {v8}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1e

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)"

    const v5, -0x7f470bfb

    invoke-static {v5, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1e
    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1f

    new-instance v3, Lr/W;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v3, v5}, Lr/W;-><init>(Ljava/lang/Object;)V

    invoke-interface {v8, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1f
    check-cast v3, Lr/W;

    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v5}, Lr/W;->h(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lr/W;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_21

    invoke-virtual {v3}, Lr/W;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_20

    goto :goto_13

    :cond_20
    const v1, 0x525ae7ac

    invoke-interface {v8, v1}, LT/l;->U(I)V

    invoke-interface {v8}, LT/l;->J()V

    goto/16 :goto_14

    :cond_21
    :goto_13
    const v5, 0x524e9de6

    invoke-interface {v8, v5}, LT/l;->U(I)V

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_22

    sget-object v5, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v5}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v5, v6, v7, v6}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_22
    check-cast v5, LT/q0;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v20, v6

    check-cast v20, LY0/d;

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_23

    new-instance v6, LN/c$c;

    invoke-direct {v6, v5}, LN/c$c;-><init>(LT/q0;)V

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_23
    move-object/from16 v21, v6

    check-cast v21, Lmh/p;

    new-instance v4, LN/J;

    const/16 v22, 0x0

    move-object/from16 v17, v4

    move-wide/from16 v18, v12

    invoke-direct/range {v17 .. v22}, LN/J;-><init>(JLY0/d;Lmh/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, LN/c$a;

    move-object/from16 v16, v6

    move-object/from16 v17, v3

    move-object/from16 v18, v5

    move-object/from16 v19, v14

    move-object/from16 v20, v0

    move-object/from16 v21, p7

    invoke-direct/range {v16 .. v21}, LN/c$a;-><init>(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;)V

    const/16 v3, 0x36

    const v5, -0x2d96d82

    invoke-static {v5, v2, v6, v8, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    and-int/lit8 v2, v1, 0x70

    or-int/lit16 v2, v2, 0xc00

    shr-int/lit8 v1, v1, 0x9

    and-int/lit16 v1, v1, 0x380

    or-int v6, v2, v1

    const/4 v7, 0x0

    move-object v1, v4

    move-object/from16 v2, p1

    move-object/from16 v3, v23

    move-object v4, v5

    move-object v5, v8

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V

    invoke-interface {v8}, LT/l;->J()V

    :goto_14
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-static {}, LT/o;->P()V

    :cond_24
    move-object v3, v0

    move-wide v4, v12

    move-object v6, v14

    move-object/from16 v7, v23

    :goto_15
    invoke-interface {v8}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_25

    new-instance v13, LN/c$b;

    move-object v0, v13

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LN/c$b;-><init>(ZLmh/a;Landroidx/compose/ui/e;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/r;Lmh/q;II)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_25
    return-void
.end method

.method public static final b(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;LT/l;II)V
    .locals 18

    move/from16 v7, p7

    const v0, -0x76870fcc

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v7, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->l(Ljava/lang/Object;)Z

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
    move-object/from16 v2, p0

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
    move/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_6

    move/from16 v8, p2

    invoke-interface {v1, v8}, LT/l;->c(Z)Z

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

    move v3, v8

    move-object v5, v12

    goto :goto_11

    :cond_13
    :goto_c
    if-eqz v4, :cond_14

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_14
    move-object v4, v5

    :goto_d
    if-eqz v6, :cond_15

    const/4 v5, 0x1

    goto :goto_e

    :cond_15
    move v5, v8

    :goto_e
    if-eqz v9, :cond_16

    sget-object v6, LN/i0;->a:LN/i0;

    invoke-virtual {v6}, LN/i0;->a()Lz/N;

    move-result-object v6

    goto :goto_f

    :cond_16
    move-object v6, v10

    :goto_f
    if-eqz v11, :cond_17

    const/4 v8, 0x0

    move-object/from16 v17, v8

    goto :goto_10

    :cond_17
    move-object/from16 v17, v12

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_18

    const/4 v8, -0x1

    const-string v9, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:174)"

    invoke-static {v0, v3, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    const v0, 0x7fffe

    and-int/2addr v0, v3

    const/16 v16, 0x0

    move-object/from16 v8, p0

    move-object v9, v4

    move v10, v5

    move-object v11, v6

    move-object/from16 v12, v17

    move-object/from16 v13, p5

    move-object v14, v1

    move v15, v0

    invoke-static/range {v8 .. v16}, LN/j0;->d(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    move v3, v5

    move-object v10, v6

    move-object/from16 v5, v17

    :goto_11
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v11, LN/c$d;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v4, v10

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LN/c$d;-><init>(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;II)V

    invoke-interface {v9, v11}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method
