.class public abstract LF/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;LT/l;II)V
    .locals 24

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0xeb2f629

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v10, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v9, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v4, v9

    :goto_1
    and-int/lit8 v5, v10, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, v10, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v9, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v1, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v4, v12

    :goto_5
    and-int/lit8 v12, v10, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_9

    move/from16 v13, p3

    invoke-interface {v1, v13}, LT/l;->c(Z)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v4, v14

    :goto_7
    and-int/lit8 v14, v10, 0x10

    if-eqz v14, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v9, 0x6000

    if-nez v15, :cond_c

    move/from16 v15, p4

    invoke-interface {v1, v15}, LT/l;->i(I)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    :goto_9
    and-int/lit8 v16, v10, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v4, v4, v17

    move/from16 v3, p5

    goto :goto_b

    :cond_f
    and-int v17, v9, v17

    move/from16 v3, p5

    if-nez v17, :cond_11

    invoke-interface {v1, v3}, LT/l;->i(I)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v4, v4, v17

    :cond_11
    :goto_b
    and-int/lit8 v17, v10, 0x40

    const/high16 v19, 0x180000

    if-eqz v17, :cond_12

    or-int v4, v4, v19

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v19, v9, v19

    move-object/from16 v0, p6

    if-nez v19, :cond_14

    invoke-interface {v1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v4, v4, v20

    :cond_14
    :goto_d
    and-int/lit16 v0, v10, 0x80

    const/high16 v20, 0xc00000

    if-eqz v0, :cond_15

    or-int v4, v4, v20

    goto :goto_f

    :cond_15
    and-int v0, v9, v20

    if-nez v0, :cond_17

    invoke-interface {v1, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/high16 v0, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v0, 0x400000

    :goto_e
    or-int/2addr v4, v0

    :cond_17
    :goto_f
    const v0, 0x492493

    and-int/2addr v0, v4

    const v2, 0x492492

    if-ne v0, v2, :cond_19

    invoke-interface {v1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_10

    :cond_18
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v7, p6

    move-object v2, v6

    move v4, v13

    move v5, v15

    move v6, v3

    move-object v3, v11

    goto/16 :goto_16

    :cond_19
    :goto_10
    if-eqz v5, :cond_1a

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v6, v0

    :cond_1a
    if-eqz v7, :cond_1b

    sget-object v0, LL0/U;->d:LL0/U$a;

    invoke-virtual {v0}, LL0/U$a;->a()LL0/U;

    move-result-object v0

    goto :goto_11

    :cond_1b
    move-object v0, v11

    :goto_11
    if-eqz v12, :cond_1c

    const/4 v5, 0x1

    goto :goto_12

    :cond_1c
    move v5, v13

    :goto_12
    if-eqz v14, :cond_1d

    sget-object v7, LW0/t;->a:LW0/t$a;

    invoke-virtual {v7}, LW0/t$a;->a()I

    move-result v7

    goto :goto_13

    :cond_1d
    move v7, v15

    :goto_13
    if-eqz v16, :cond_1e

    const v3, 0x7fffffff

    :cond_1e
    if-eqz v17, :cond_1f

    sget-object v11, LF/h$a;->a:LF/h$a;

    move-object v15, v11

    goto :goto_14

    :cond_1f
    move-object/from16 v15, p6

    :goto_14
    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_20

    const/4 v11, -0x1

    const-string v12, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)"

    const v13, -0xeb2f629

    invoke-static {v13, v4, v11, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_20
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    const/4 v14, 0x0

    if-ne v11, v13, :cond_21

    const/4 v13, 0x2

    invoke-static {v14, v14, v13, v14}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v11

    invoke-interface {v1, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    check-cast v11, LT/q0;

    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v16, 0x1c00000

    and-int v2, v4, v16

    const/16 v16, 0x0

    const/high16 v14, 0x800000

    if-ne v2, v14, :cond_22

    const/4 v2, 0x1

    goto :goto_15

    :cond_22
    move/from16 v2, v16

    :goto_15
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    if-nez v2, :cond_23

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v14, v2, :cond_24

    :cond_23
    new-instance v14, LF/h$d;

    const/4 v2, 0x0

    invoke-direct {v14, v11, v8, v2}, LF/h$d;-><init>(LT/q0;Lmh/l;Ldh/e;)V

    invoke-interface {v1, v14}, LT/l;->K(Ljava/lang/Object;)V

    :cond_24
    check-cast v14, Lmh/p;

    invoke-static {v13, v8, v14}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-interface {v6, v2}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    const/high16 v13, 0x380000

    and-int v14, v4, v13

    const/high16 v13, 0x100000

    if-ne v14, v13, :cond_25

    const/16 v16, 0x1

    :cond_25
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    if-nez v16, :cond_26

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v13, v12, :cond_27

    :cond_26
    new-instance v13, LF/h$b;

    invoke-direct {v13, v11, v15}, LF/h$b;-><init>(LT/q0;Lmh/l;)V

    invoke-interface {v1, v13}, LT/l;->K(Ljava/lang/Object;)V

    :cond_27
    move-object v14, v13

    check-cast v14, Lmh/l;

    const v11, 0xe38e

    and-int/2addr v11, v4

    const/high16 v12, 0x70000

    shl-int/lit8 v13, v4, 0x6

    and-int/2addr v12, v13

    or-int/2addr v11, v12

    shl-int/lit8 v4, v4, 0x3

    const/high16 v12, 0x380000

    and-int/2addr v4, v12

    or-int v22, v11, v4

    const/16 v23, 0x380

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v11, p0

    move-object v12, v2

    move-object v13, v0

    move-object v2, v15

    move v15, v7

    move/from16 v16, v5

    move/from16 v17, v3

    move-object/from16 v21, v1

    invoke-static/range {v11 .. v23}, LF/g;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILjava/util/Map;Lm0/y0;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_28

    invoke-static {}, LT/o;->P()V

    :cond_28
    move v4, v5

    move v5, v7

    move-object v7, v2

    move-object v2, v6

    move v6, v3

    move-object v3, v0

    :goto_16
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v11

    if-eqz v11, :cond_29

    new-instance v12, LF/h$c;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LF/h$c;-><init>(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;II)V

    invoke-interface {v11, v12}, LT/X0;->a(Lmh/p;)V

    :cond_29
    return-void
.end method
