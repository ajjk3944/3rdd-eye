.class public abstract LF/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL0/d;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILjava/util/Map;Lm0/y0;LT/l;II)V
    .locals 52

    move-object/from16 v14, p0

    move/from16 v15, p11

    move/from16 v13, p12

    const v0, -0x3f70023c

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v15, 0x6

    if-nez v1, :cond_2

    invoke-interface {v12, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v15

    goto :goto_1

    :cond_2
    move v1, v15

    :goto_1
    and-int/lit8 v4, v13, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v15, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v12, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :goto_3
    and-int/lit8 v6, v13, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v15, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v12, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v1, v8

    :goto_5
    and-int/lit8 v8, v13, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v15, 0xc00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-interface {v12, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    :goto_7
    and-int/lit8 v10, v13, 0x10

    if-eqz v10, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move/from16 v11, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v11, v15, 0x6000

    if-nez v11, :cond_c

    move/from16 v11, p4

    invoke-interface {v12, v11}, LT/l;->i(I)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v1, v1, v16

    :goto_9
    and-int/lit8 v16, v13, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v1, v1, v17

    move/from16 v2, p5

    goto :goto_b

    :cond_f
    and-int v17, v15, v17

    move/from16 v2, p5

    if-nez v17, :cond_11

    invoke-interface {v12, v2}, LT/l;->c(Z)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v1, v1, v17

    :cond_11
    :goto_b
    and-int/lit8 v17, v13, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_12

    or-int v1, v1, v18

    move/from16 v3, p6

    goto :goto_d

    :cond_12
    and-int v18, v15, v18

    move/from16 v3, p6

    if-nez v18, :cond_14

    invoke-interface {v12, v3}, LT/l;->i(I)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v19, 0x80000

    :goto_c
    or-int v1, v1, v19

    :cond_14
    :goto_d
    and-int/lit16 v0, v13, 0x80

    const/high16 v20, 0xc00000

    if-eqz v0, :cond_15

    or-int v1, v1, v20

    move/from16 v2, p7

    goto :goto_f

    :cond_15
    and-int v20, v15, v20

    move/from16 v2, p7

    if-nez v20, :cond_17

    invoke-interface {v12, v2}, LT/l;->i(I)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v1, v1, v20

    :cond_17
    :goto_f
    and-int/lit16 v2, v13, 0x100

    const/high16 v20, 0x6000000

    if-eqz v2, :cond_18

    or-int v1, v1, v20

    move-object/from16 v3, p8

    goto :goto_11

    :cond_18
    and-int v20, v15, v20

    move-object/from16 v3, p8

    if-nez v20, :cond_1a

    invoke-interface {v12, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_19

    const/high16 v20, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v20, 0x2000000

    :goto_10
    or-int v1, v1, v20

    :cond_1a
    :goto_11
    and-int/lit16 v3, v13, 0x200

    const/high16 v20, 0x30000000

    if-eqz v3, :cond_1b

    or-int v1, v1, v20

    move-object/from16 v5, p9

    goto :goto_13

    :cond_1b
    and-int v20, v15, v20

    move-object/from16 v5, p9

    if-nez v20, :cond_1d

    invoke-interface {v12, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1c

    const/high16 v20, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v20, 0x10000000

    :goto_12
    or-int v1, v1, v20

    :cond_1d
    :goto_13
    const v20, 0x12492493

    and-int v5, v1, v20

    const v7, 0x12492492

    if-ne v5, v7, :cond_1f

    invoke-interface {v12}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_1e

    goto :goto_14

    :cond_1e
    invoke-interface {v12}, LT/l;->C()V

    move-object/from16 v43, p1

    move-object/from16 v3, p2

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v10, p9

    move-object v4, v9

    move v5, v11

    move-object v2, v12

    move-object/from16 v9, p8

    goto/16 :goto_21

    :cond_1f
    :goto_14
    if-eqz v4, :cond_20

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v43, v4

    goto :goto_15

    :cond_20
    move-object/from16 v43, p1

    :goto_15
    if-eqz v6, :cond_21

    sget-object v4, LL0/U;->d:LL0/U$a;

    invoke-virtual {v4}, LL0/U$a;->a()LL0/U;

    move-result-object v4

    move-object/from16 v44, v4

    goto :goto_16

    :cond_21
    move-object/from16 v44, p2

    :goto_16
    const/4 v4, 0x0

    if-eqz v8, :cond_22

    move-object/from16 v45, v4

    goto :goto_17

    :cond_22
    move-object/from16 v45, v9

    :goto_17
    if-eqz v10, :cond_23

    sget-object v5, LW0/t;->a:LW0/t$a;

    invoke-virtual {v5}, LW0/t$a;->a()I

    move-result v5

    move/from16 v46, v5

    goto :goto_18

    :cond_23
    move/from16 v46, v11

    :goto_18
    const/4 v5, 0x1

    if-eqz v16, :cond_24

    move/from16 v47, v5

    goto :goto_19

    :cond_24
    move/from16 v47, p5

    :goto_19
    if-eqz v17, :cond_25

    const v6, 0x7fffffff

    move v11, v6

    goto :goto_1a

    :cond_25
    move/from16 v11, p6

    :goto_1a
    if-eqz v0, :cond_26

    move v10, v5

    goto :goto_1b

    :cond_26
    move/from16 v10, p7

    :goto_1b
    if-eqz v2, :cond_27

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v48, v0

    goto :goto_1c

    :cond_27
    move-object/from16 v48, p8

    :goto_1c
    if-eqz v3, :cond_28

    move-object/from16 v49, v4

    goto :goto_1d

    :cond_28
    move-object/from16 v49, p9

    :goto_1d
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_29

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.BasicText (BasicText.kt:191)"

    const v3, -0x3f70023c

    invoke-static {v3, v1, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_29
    invoke-static {v10, v11}, LF/r;->b(II)V

    invoke-static {}, LM/C;->a()LT/H0;

    move-result-object v0

    invoke-interface {v12, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    const v0, -0x5e710e46

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->J()V

    invoke-static/range {p0 .. p0}, LF/b;->b(LL0/d;)Z

    move-result v19

    invoke-static/range {p0 .. p0}, LL/h;->a(LL0/d;)Z

    move-result v0

    const/4 v9, 0x0

    const/16 v50, 0x0

    if-nez v19, :cond_2e

    if-nez v0, :cond_2e

    const v0, -0x5e6e6a35

    invoke-interface {v12, v0}, LT/l;->U(I)V

    const v41, 0x1ffff

    const/16 v42, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    move-object/from16 v20, v43

    invoke-static/range {v20 .. v42}, Landroidx/compose/ui/graphics/b;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLm0/i1;ZLm0/d1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/platform/k0;->i()LT/H0;

    move-result-object v1

    invoke-interface {v12, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LQ0/k$b;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, v44

    move-object/from16 v3, v45

    move/from16 v4, v46

    move/from16 v5, v47

    move v6, v11

    move v7, v10

    move-object/from16 v9, v18

    move/from16 v34, v10

    move-object/from16 v10, v16

    move/from16 v35, v11

    move-object/from16 v11, v50

    move-object/from16 v51, v12

    move-object/from16 v12, v49

    move-object/from16 v13, v17

    invoke-static/range {v0 .. v13}, LF/g;->j(Landroidx/compose/ui/e;LL0/d;LL0/U;Lmh/l;IZIILQ0/k$b;Ljava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, LF/o;->a:LF/o;

    move-object/from16 v2, v51

    const/4 v3, 0x0

    invoke-static {v2, v3}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-static {v2, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v2}, LT/l;->G()LT/x;

    move-result-object v4

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {v2}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_2a

    invoke-static {}, LT/j;->c()V

    :cond_2a
    invoke-interface {v2}, LT/l;->u()V

    invoke-interface {v2}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_2b

    invoke-interface {v2, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_1e

    :cond_2b
    invoke-interface {v2}, LT/l;->I()V

    :goto_1e
    invoke-static {v2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v1, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v6, v4, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v6, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v6}, LT/l;->o()Z

    move-result v1

    if-nez v1, :cond_2c

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    :cond_2c
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_2d
    invoke-interface {v2}, LT/l;->R()V

    invoke-interface {v2}, LT/l;->J()V

    goto/16 :goto_20

    :cond_2e
    move v3, v9

    move/from16 v34, v10

    move/from16 v35, v11

    move-object v2, v12

    const v0, -0x5e60a490

    invoke-interface {v2, v0}, LT/l;->U(I)V

    and-int/lit8 v0, v1, 0xe

    const/4 v6, 0x4

    if-ne v0, v6, :cond_2f

    goto :goto_1f

    :cond_2f
    move v5, v3

    :goto_1f
    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez v5, :cond_30

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_31

    :cond_30
    const/4 v0, 0x2

    invoke-static {v14, v4, v0, v4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {v2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_31
    check-cast v0, LT/q0;

    invoke-static {v0}, LF/g;->c(LT/q0;)LL0/d;

    move-result-object v17

    invoke-static {}, Landroidx/compose/ui/platform/k0;->i()LT/H0;

    move-result-object v3

    invoke-interface {v2, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v26, v3

    check-cast v26, LQ0/k$b;

    invoke-interface {v2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_32

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_33

    :cond_32
    new-instance v4, LF/g$b;

    invoke-direct {v4, v0}, LF/g$b;-><init>(LT/q0;)V

    invoke-interface {v2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_33
    move-object/from16 v29, v4

    check-cast v29, Lmh/l;

    shr-int/lit8 v0, v1, 0x3

    and-int/lit16 v0, v0, 0x38e

    shr-int/lit8 v3, v1, 0xc

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x9

    const/high16 v4, 0x70000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x6

    const/high16 v4, 0x380000

    and-int/2addr v4, v3

    or-int/2addr v0, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v4, v3

    or-int/2addr v0, v4

    const/high16 v4, 0xe000000

    and-int/2addr v4, v3

    or-int/2addr v0, v4

    const/high16 v4, 0x70000000

    and-int/2addr v3, v4

    or-int v31, v0, v3

    shr-int/lit8 v0, v1, 0x15

    and-int/lit16 v0, v0, 0x380

    move/from16 v32, v0

    const/16 v33, 0x0

    move-object/from16 v16, v43

    move-object/from16 v18, v45

    move-object/from16 v20, v48

    move-object/from16 v21, v44

    move/from16 v22, v46

    move/from16 v23, v47

    move/from16 v24, v35

    move/from16 v25, v34

    move-object/from16 v27, v50

    move-object/from16 v28, v49

    move-object/from16 v30, v2

    invoke-static/range {v16 .. v33}, LF/g;->e(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;LT/l;III)V

    invoke-interface {v2}, LT/l;->J()V

    :goto_20
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-static {}, LT/o;->P()V

    :cond_34
    move/from16 v8, v34

    move/from16 v7, v35

    move-object/from16 v3, v44

    move-object/from16 v4, v45

    move/from16 v5, v46

    move/from16 v6, v47

    move-object/from16 v9, v48

    move-object/from16 v10, v49

    :goto_21
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_35

    new-instance v12, LF/g$c;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, v43

    move/from16 v11, p11

    move-object v14, v12

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LF/g$c;-><init>(LL0/d;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILjava/util/Map;Lm0/y0;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_35
    return-void
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILm0/y0;LT/l;II)V
    .locals 42

    move/from16 v10, p10

    move/from16 v11, p11

    const v0, -0x46bd8e2e

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v11, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v10, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v10

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v10, 0x30

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
    and-int/lit8 v6, v11, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v10, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit8 v8, v11, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v10, 0xc00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v3, v12

    :goto_7
    and-int/lit8 v12, v11, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move/from16 v13, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v10, 0x6000

    if-nez v13, :cond_c

    move/from16 v13, p4

    invoke-interface {v1, v13}, LT/l;->i(I)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v3, v14

    :goto_9
    and-int/lit8 v14, v11, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_10

    or-int/2addr v3, v15

    :cond_f
    move/from16 v15, p5

    goto :goto_b

    :cond_10
    and-int/2addr v15, v10

    if-nez v15, :cond_f

    move/from16 v15, p5

    invoke-interface {v1, v15}, LT/l;->c(Z)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v16, 0x10000

    :goto_a
    or-int v3, v3, v16

    :goto_b
    and-int/lit8 v16, v11, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v3, v3, v17

    move/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v17, v10, v17

    move/from16 v0, p6

    if-nez v17, :cond_14

    invoke-interface {v1, v0}, LT/l;->i(I)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v3, v3, v18

    :cond_14
    :goto_d
    and-int/lit16 v0, v11, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_15

    or-int v3, v3, v18

    move/from16 v2, p7

    goto :goto_f

    :cond_15
    and-int v18, v10, v18

    move/from16 v2, p7

    if-nez v18, :cond_17

    invoke-interface {v1, v2}, LT/l;->i(I)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v18, 0x400000

    :goto_e
    or-int v3, v3, v18

    :cond_17
    :goto_f
    and-int/lit16 v2, v11, 0x100

    const/high16 v18, 0x6000000

    if-eqz v2, :cond_18

    or-int v3, v3, v18

    move-object/from16 v5, p8

    goto :goto_11

    :cond_18
    and-int v18, v10, v18

    move-object/from16 v5, p8

    if-nez v18, :cond_1a

    invoke-interface {v1, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v3, v3, v18

    :cond_1a
    :goto_11
    const v18, 0x2492493

    and-int v5, v3, v18

    const v7, 0x2492492

    if-ne v5, v7, :cond_1c

    invoke-interface {v1}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p6

    move/from16 v8, p7

    move-object v4, v9

    move v5, v13

    move v6, v15

    move-object/from16 v9, p8

    goto/16 :goto_1c

    :cond_1c
    :goto_12
    if-eqz v4, :cond_1d

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_13

    :cond_1d
    move-object/from16 v4, p1

    :goto_13
    if-eqz v6, :cond_1e

    sget-object v5, LL0/U;->d:LL0/U$a;

    invoke-virtual {v5}, LL0/U$a;->a()LL0/U;

    move-result-object v5

    goto :goto_14

    :cond_1e
    move-object/from16 v5, p2

    :goto_14
    const/4 v6, 0x0

    if-eqz v8, :cond_1f

    move-object v9, v6

    :cond_1f
    if-eqz v12, :cond_20

    sget-object v7, LW0/t;->a:LW0/t$a;

    invoke-virtual {v7}, LW0/t$a;->a()I

    move-result v7

    goto :goto_15

    :cond_20
    move v7, v13

    :goto_15
    const/4 v8, 0x1

    if-eqz v14, :cond_21

    move/from16 v41, v8

    goto :goto_16

    :cond_21
    move/from16 v41, v15

    :goto_16
    if-eqz v16, :cond_22

    const v12, 0x7fffffff

    move v15, v12

    goto :goto_17

    :cond_22
    move/from16 v15, p6

    :goto_17
    if-eqz v0, :cond_23

    goto :goto_18

    :cond_23
    move/from16 v8, p7

    :goto_18
    if-eqz v2, :cond_24

    goto :goto_19

    :cond_24
    move-object/from16 v6, p8

    :goto_19
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_25

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.BasicText (BasicText.kt:96)"

    const v12, -0x46bd8e2e

    invoke-static {v12, v3, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_25
    invoke-static {v8, v15}, LF/r;->b(II)V

    invoke-static {}, LM/C;->a()LT/H0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    const v0, -0x5eb16ea6

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->J()V

    if-eqz v9, :cond_26

    const v0, -0x5eaf9054

    invoke-interface {v1, v0}, LT/l;->U(I)V

    const v39, 0x1ffff

    const/16 v40, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    move-object/from16 v18, v4

    invoke-static/range {v18 .. v40}, Landroidx/compose/ui/graphics/b;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLm0/i1;ZLm0/d1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v18

    new-instance v19, LL0/d;

    const/4 v0, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x0

    move-object/from16 p1, v19

    move-object/from16 p2, p0

    move-object/from16 p3, v3

    move-object/from16 p4, v12

    move/from16 p5, v0

    move-object/from16 p6, v2

    invoke-direct/range {p1 .. p6}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->i()LT/H0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, LQ0/k$b;

    const/16 v28, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v20, v5

    move-object/from16 v21, v9

    move/from16 v22, v7

    move/from16 v23, v41

    move/from16 v24, v15

    move/from16 v25, v8

    move-object/from16 v30, v6

    invoke-static/range {v18 .. v31}, LF/g;->j(Landroidx/compose/ui/e;LL0/d;LL0/U;Lmh/l;IZIILQ0/k$b;Ljava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v1}, LT/l;->J()V

    move/from16 v22, v15

    goto :goto_1a

    :cond_26
    const v0, -0x5ea4eadf

    invoke-interface {v1, v0}, LT/l;->U(I)V

    const v39, 0x1ffff

    const/16 v40, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    move-object/from16 v18, v4

    invoke-static/range {v18 .. v40}, Landroidx/compose/ui/graphics/b;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLm0/i1;ZLm0/d1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    new-instance v2, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->i()LT/H0;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LQ0/k$b;

    const/16 v21, 0x0

    move-object v12, v2

    move-object/from16 v13, p0

    move-object v14, v5

    move/from16 v22, v15

    move-object v15, v3

    move/from16 v16, v7

    move/from16 v17, v41

    move/from16 v18, v22

    move/from16 v19, v8

    move-object/from16 v20, v6

    invoke-direct/range {v12 .. v21}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;-><init>(Ljava/lang/String;LL0/U;LQ0/k$b;IZIILm0/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v1}, LT/l;->J()V

    :goto_1a
    sget-object v2, LF/o;->a:LF/o;

    const/4 v3, 0x0

    invoke-static {v1, v3}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-static {v1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v12

    sget-object v13, LE0/g;->K:LE0/g$a;

    invoke-virtual {v13}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_27

    invoke-static {}, LT/j;->c()V

    :cond_27
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_28

    invoke-interface {v1, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_1b

    :cond_28
    invoke-interface {v1}, LT/l;->I()V

    :goto_1b
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v13}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v2, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v14, v12, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v14, v0, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v14}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_29

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v2, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2a

    :cond_29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v14, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v14, v2, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_2a
    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-static {}, LT/o;->P()V

    :cond_2b
    move-object v2, v4

    move-object v3, v5

    move v5, v7

    move-object v4, v9

    move/from16 v7, v22

    move-object v9, v6

    move/from16 v6, v41

    :goto_1c
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_2c

    new-instance v13, LF/g$a;

    move-object v0, v13

    move-object/from16 v1, p0

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LF/g$a;-><init>(Ljava/lang/String;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILm0/y0;II)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_2c
    return-void
.end method

.method private static final c(LT/q0;)LL0/d;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/d;

    return-object p0
.end method

.method private static final d(LT/q0;LL0/d;)V
    .locals 0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;LT/l;III)V
    .locals 46

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v15, p15

    move/from16 v14, p16

    move/from16 v13, p17

    const/16 v8, 0x100

    const/16 v9, 0x80

    const/16 v10, 0x20

    const/16 v11, 0x10

    const v12, 0x2673e498

    move-object/from16 v5, p14

    invoke-interface {v5, v12}, LT/l;->r(I)LT/l;

    move-result-object v5

    const/16 v17, 0x1

    and-int/lit8 v18, v13, 0x1

    const/16 v19, 0x4

    const/4 v12, 0x2

    if-eqz v18, :cond_0

    or-int/lit8 v18, v15, 0x6

    move-object/from16 v6, p0

    move/from16 v21, v18

    goto :goto_1

    :cond_0
    and-int/lit8 v18, v15, 0x6

    move-object/from16 v6, p0

    if-nez v18, :cond_2

    invoke-interface {v5, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1

    move/from16 v21, v19

    goto :goto_0

    :cond_1
    move/from16 v21, v12

    :goto_0
    or-int v21, v15, v21

    goto :goto_1

    :cond_2
    move/from16 v21, v15

    :goto_1
    and-int/lit8 v22, v13, 0x2

    if-eqz v22, :cond_4

    or-int/lit8 v21, v21, 0x30

    :cond_3
    :goto_2
    move/from16 v12, v21

    goto :goto_4

    :cond_4
    and-int/lit8 v22, v15, 0x30

    if-nez v22, :cond_3

    invoke-interface {v5, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_5

    move/from16 v22, v10

    goto :goto_3

    :cond_5
    move/from16 v22, v11

    :goto_3
    or-int v21, v21, v22

    goto :goto_2

    :goto_4
    and-int/lit8 v21, v13, 0x4

    if-eqz v21, :cond_6

    or-int/lit16 v12, v12, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v15, 0x180

    if-nez v7, :cond_8

    invoke-interface {v5, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v8

    goto :goto_5

    :cond_7
    move v7, v9

    :goto_5
    or-int/2addr v12, v7

    :cond_8
    :goto_6
    and-int/lit8 v7, v13, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v12, v12, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v15, 0xc00

    if-nez v7, :cond_b

    invoke-interface {v5, v4}, LT/l;->c(Z)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_7

    :cond_a
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v12, v7

    :cond_b
    :goto_8
    and-int/lit8 v7, v13, 0x10

    if-eqz v7, :cond_d

    or-int/lit16 v12, v12, 0x6000

    :cond_c
    move-object/from16 v11, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v11, v15, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v5, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_e

    const/16 v23, 0x4000

    goto :goto_9

    :cond_e
    const/16 v23, 0x2000

    :goto_9
    or-int v12, v12, v23

    :goto_a
    and-int/lit8 v23, v13, 0x20

    const/high16 v24, 0x30000

    if-eqz v23, :cond_f

    or-int v12, v12, v24

    move-object/from16 v10, p5

    goto :goto_c

    :cond_f
    and-int v23, v15, v24

    move-object/from16 v10, p5

    if-nez v23, :cond_11

    invoke-interface {v5, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_10

    const/high16 v24, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v24, 0x10000

    :goto_b
    or-int v12, v12, v24

    :cond_11
    :goto_c
    and-int/lit8 v24, v13, 0x40

    const/high16 v25, 0x180000

    if-eqz v24, :cond_12

    or-int v12, v12, v25

    move/from16 v0, p6

    goto :goto_e

    :cond_12
    and-int v24, v15, v25

    move/from16 v0, p6

    if-nez v24, :cond_14

    invoke-interface {v5, v0}, LT/l;->i(I)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v25, 0x80000

    :goto_d
    or-int v12, v12, v25

    :cond_14
    :goto_e
    and-int/lit16 v1, v13, 0x80

    const/high16 v26, 0xc00000

    if-eqz v1, :cond_16

    or-int v12, v12, v26

    :cond_15
    move/from16 v1, p7

    goto :goto_10

    :cond_16
    and-int v1, v15, v26

    if-nez v1, :cond_15

    move/from16 v1, p7

    invoke-interface {v5, v1}, LT/l;->c(Z)Z

    move-result v26

    if-eqz v26, :cond_17

    const/high16 v26, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v26, 0x400000

    :goto_f
    or-int v12, v12, v26

    :goto_10
    and-int/lit16 v9, v13, 0x100

    if-eqz v9, :cond_19

    const/high16 v9, 0x6000000

    or-int/2addr v12, v9

    :cond_18
    move/from16 v9, p8

    goto :goto_12

    :cond_19
    const/high16 v9, 0x6000000

    and-int/2addr v9, v15

    if-nez v9, :cond_18

    move/from16 v9, p8

    invoke-interface {v5, v9}, LT/l;->i(I)Z

    move-result v25

    if-eqz v25, :cond_1a

    const/high16 v25, 0x4000000

    goto :goto_11

    :cond_1a
    const/high16 v25, 0x2000000

    :goto_11
    or-int v12, v12, v25

    :goto_12
    and-int/lit16 v8, v13, 0x200

    if-eqz v8, :cond_1c

    const/high16 v8, 0x30000000

    or-int/2addr v12, v8

    :cond_1b
    move/from16 v8, p9

    :goto_13
    const/16 v0, 0x400

    goto :goto_15

    :cond_1c
    const/high16 v8, 0x30000000

    and-int/2addr v8, v15

    if-nez v8, :cond_1b

    move/from16 v8, p9

    invoke-interface {v5, v8}, LT/l;->i(I)Z

    move-result v24

    if-eqz v24, :cond_1d

    const/high16 v24, 0x20000000

    goto :goto_14

    :cond_1d
    const/high16 v24, 0x10000000

    :goto_14
    or-int v12, v12, v24

    goto :goto_13

    :goto_15
    and-int/lit16 v1, v13, 0x400

    if-eqz v1, :cond_1e

    or-int/lit8 v1, v14, 0x6

    move/from16 v19, v1

    :goto_16
    const/16 v0, 0x800

    goto :goto_18

    :cond_1e
    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_20

    move-object/from16 v1, p10

    invoke-interface {v5, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    goto :goto_17

    :cond_1f
    const/16 v19, 0x2

    :goto_17
    or-int v19, v14, v19

    goto :goto_16

    :cond_20
    move-object/from16 v1, p10

    move/from16 v19, v14

    goto :goto_16

    :goto_18
    and-int/lit16 v1, v13, 0x800

    if-eqz v1, :cond_22

    or-int/lit8 v19, v19, 0x30

    :cond_21
    move-object/from16 v1, p11

    :goto_19
    move/from16 v0, v19

    goto :goto_1b

    :cond_22
    and-int/lit8 v1, v14, 0x30

    if-nez v1, :cond_21

    move-object/from16 v1, p11

    invoke-interface {v5, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_23

    const/16 v22, 0x20

    goto :goto_1a

    :cond_23
    const/16 v22, 0x10

    :goto_1a
    or-int v19, v19, v22

    goto :goto_19

    :goto_1b
    and-int/lit16 v1, v13, 0x1000

    if-eqz v1, :cond_24

    or-int/lit16 v0, v0, 0x180

    :goto_1c
    const/16 v1, 0x2000

    goto :goto_1e

    :cond_24
    and-int/lit16 v1, v14, 0x180

    if-nez v1, :cond_26

    move-object/from16 v1, p12

    invoke-interface {v5, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_25

    const/16 v26, 0x100

    goto :goto_1d

    :cond_25
    const/16 v26, 0x80

    :goto_1d
    or-int v0, v0, v26

    goto :goto_1c

    :cond_26
    move-object/from16 v1, p12

    goto :goto_1c

    :goto_1e
    and-int/2addr v1, v13

    if-eqz v1, :cond_28

    or-int/lit16 v0, v0, 0xc00

    :cond_27
    move-object/from16 v1, p13

    goto :goto_20

    :cond_28
    and-int/lit16 v1, v14, 0xc00

    if-nez v1, :cond_27

    move-object/from16 v1, p13

    invoke-interface {v5, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_29

    const/16 v18, 0x800

    goto :goto_1f

    :cond_29
    const/16 v18, 0x400

    :goto_1f
    or-int v0, v0, v18

    :goto_20
    const v16, 0x12492493

    and-int v1, v12, v16

    const v6, 0x12492492

    if-ne v1, v6, :cond_2b

    and-int/lit16 v1, v0, 0x493

    const/16 v6, 0x492

    if-ne v1, v6, :cond_2b

    invoke-interface {v5}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_2a

    goto :goto_21

    :cond_2a
    invoke-interface {v5}, LT/l;->C()V

    move-object/from16 v20, v11

    goto/16 :goto_33

    :cond_2b
    :goto_21
    if-eqz v7, :cond_2c

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    goto :goto_22

    :cond_2c
    move-object v1, v11

    :goto_22
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_2d

    const-string v6, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:536)"

    const v7, 0x2673e498

    invoke-static {v7, v12, v0, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2d
    invoke-static/range {p1 .. p1}, LL/h;->a(LL0/d;)Z

    move-result v0

    const/4 v7, 0x0

    if-eqz v0, :cond_31

    const v0, -0x24ea1f1f

    invoke-interface {v5, v0}, LT/l;->U(I)V

    and-int/lit8 v0, v12, 0x70

    const/16 v11, 0x20

    if-ne v0, v11, :cond_2e

    move/from16 v0, v17

    goto :goto_23

    :cond_2e
    const/4 v0, 0x0

    :goto_23
    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v0, :cond_2f

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v11, v0, :cond_30

    :cond_2f
    new-instance v11, LF/m0;

    invoke-direct {v11, v2}, LF/m0;-><init>(LL0/d;)V

    invoke-interface {v5, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_30
    check-cast v11, LF/m0;

    invoke-interface {v5}, LT/l;->J()V

    goto :goto_24

    :cond_31
    const v0, -0x24e93cae

    invoke-interface {v5, v0}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->J()V

    move-object v11, v7

    :goto_24
    invoke-static/range {p1 .. p1}, LL/h;->a(LL0/d;)Z

    move-result v0

    if-eqz v0, :cond_35

    const v0, -0x24e653f3

    invoke-interface {v5, v0}, LT/l;->U(I)V

    and-int/lit8 v0, v12, 0x70

    const/16 v6, 0x20

    if-ne v0, v6, :cond_32

    move/from16 v0, v17

    goto :goto_25

    :cond_32
    const/4 v0, 0x0

    :goto_25
    invoke-interface {v5, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_33

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v6, v0, :cond_34

    :cond_33
    new-instance v6, LF/g$j;

    invoke-direct {v6, v11, v2}, LF/g$j;-><init>(LF/m0;LL0/d;)V

    invoke-interface {v5, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_34
    check-cast v6, Lmh/a;

    invoke-interface {v5}, LT/l;->J()V

    goto :goto_27

    :cond_35
    const v0, -0x24e4ad55

    invoke-interface {v5, v0}, LT/l;->U(I)V

    and-int/lit8 v0, v12, 0x70

    const/16 v6, 0x20

    if-ne v0, v6, :cond_36

    move/from16 v0, v17

    goto :goto_26

    :cond_36
    const/4 v0, 0x0

    :goto_26
    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_37

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v6, v0, :cond_38

    :cond_37
    new-instance v6, LF/g$k;

    invoke-direct {v6, v2}, LF/g$k;-><init>(LL0/d;)V

    invoke-interface {v5, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_38
    check-cast v6, Lmh/a;

    invoke-interface {v5}, LT/l;->J()V

    :goto_27
    if-eqz v4, :cond_39

    invoke-static {v2, v1}, LF/b;->c(LL0/d;Ljava/util/Map;)LYg/s;

    move-result-object v0

    goto :goto_28

    :cond_39
    new-instance v0, LYg/s;

    invoke-direct {v0, v7, v7}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_28
    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/List;

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v4, :cond_3b

    const v7, -0x24e02e56

    invoke-interface {v5, v7}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    sget-object v19, LT/l;->a:LT/l$a;

    move-object/from16 v20, v1

    invoke-virtual/range {v19 .. v19}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_3a

    const/4 v1, 0x2

    const/4 v7, 0x0

    invoke-static {v7, v7, v1, v7}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v5, v1}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_29

    :cond_3a
    move-object/from16 p14, v7

    const/4 v7, 0x0

    move-object/from16 v1, p14

    :goto_29
    check-cast v1, LT/q0;

    invoke-interface {v5}, LT/l;->J()V

    goto :goto_2a

    :cond_3b
    move-object/from16 v20, v1

    const v1, -0x24def58e

    invoke-interface {v5, v1}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->J()V

    move-object v1, v7

    :goto_2a
    if-eqz v4, :cond_3e

    const v7, -0x24dda945

    invoke-interface {v5, v7}, LT/l;->U(I)V

    invoke-interface {v5, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_3c

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_3d

    :cond_3c
    new-instance v8, LF/g$i;

    invoke-direct {v8, v1}, LF/g$i;-><init>(LT/q0;)V

    invoke-interface {v5, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3d
    check-cast v8, Lmh/l;

    invoke-interface {v5}, LT/l;->J()V

    move-object v7, v8

    goto :goto_2b

    :cond_3e
    const v8, -0x24dcb04e

    invoke-interface {v5, v8}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->J()V

    :goto_2b
    const v42, 0x1ffff

    const/16 v43, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    move-object/from16 v21, p0

    invoke-static/range {v21 .. v43}, Landroidx/compose/ui/graphics/b;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLm0/i1;ZLm0/d1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v24

    invoke-interface {v6}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v25, v6

    check-cast v25, LL0/d;

    invoke-interface {v5, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    and-int/lit16 v8, v12, 0x380

    const/16 v9, 0x100

    if-ne v8, v9, :cond_3f

    goto :goto_2c

    :cond_3f
    const/16 v17, 0x0

    :goto_2c
    or-int v6, v6, v17

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_40

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_41

    :cond_40
    new-instance v8, LF/g$d;

    invoke-direct {v8, v11, v3}, LF/g$d;-><init>(LF/m0;Lmh/l;)V

    invoke-interface {v5, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_41
    move-object/from16 v27, v8

    check-cast v27, Lmh/l;

    move-object/from16 v26, p5

    move/from16 v28, p6

    move/from16 v29, p7

    move/from16 v30, p8

    move/from16 v31, p9

    move-object/from16 v32, p10

    move-object/from16 v33, v16

    move-object/from16 v34, v7

    move-object/from16 v35, p11

    move-object/from16 v36, p12

    move-object/from16 v37, p13

    invoke-static/range {v24 .. v37}, LF/g;->j(Landroidx/compose/ui/e;LL0/d;LL0/U;Lmh/l;IZIILQ0/k$b;Ljava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v6

    if-nez v4, :cond_44

    const v1, -0x24cc35a3

    invoke-interface {v5, v1}, LT/l;->U(I)V

    invoke-interface {v5, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_42

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_43

    :cond_42
    new-instance v7, LF/g$e;

    invoke-direct {v7, v11}, LF/g$e;-><init>(LF/m0;)V

    invoke-interface {v5, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_43
    check-cast v7, Lmh/a;

    new-instance v1, LF/G;

    invoke-direct {v1, v7}, LF/G;-><init>(Lmh/a;)V

    invoke-interface {v5}, LT/l;->J()V

    :goto_2d
    const/4 v7, 0x0

    goto :goto_2e

    :cond_44
    const v7, -0x24c9c1c4

    invoke-interface {v5, v7}, LT/l;->U(I)V

    invoke-interface {v5, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_45

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_46

    :cond_45
    new-instance v8, LF/g$f;

    invoke-direct {v8, v11}, LF/g$f;-><init>(LF/m0;)V

    invoke-interface {v5, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_46
    check-cast v8, Lmh/a;

    invoke-interface {v5, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_47

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_48

    :cond_47
    new-instance v9, LF/g$g;

    invoke-direct {v9, v1}, LF/g$g;-><init>(LT/q0;)V

    invoke-interface {v5, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_48
    check-cast v9, Lmh/a;

    new-instance v1, LF/o0;

    invoke-direct {v1, v8, v9}, LF/o0;-><init>(Lmh/a;Lmh/a;)V

    invoke-interface {v5}, LT/l;->J()V

    goto :goto_2d

    :goto_2e
    invoke-static {v5, v7}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v5, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_49

    invoke-static {}, LT/j;->c()V

    :cond_49
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_4a

    invoke-interface {v5, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_2f

    :cond_4a
    invoke-interface {v5}, LT/l;->I()V

    :goto_2f
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v4

    invoke-static {v3, v1, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v3, v7, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v3}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_4b

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4c

    :cond_4b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4c
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v3, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    if-nez v11, :cond_4d

    const v1, -0x1eb99bdb

    invoke-interface {v5, v1}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->J()V

    goto :goto_30

    :cond_4d
    const v1, 0x200a875c

    invoke-interface {v5, v1}, LT/l;->U(I)V

    const/4 v1, 0x0

    invoke-virtual {v11, v5, v1}, LF/m0;->b(LT/l;I)V

    invoke-interface {v5}, LT/l;->J()V

    sget-object v1, LYg/J;->a:LYg/J;

    :goto_30
    if-nez v0, :cond_4e

    const v0, -0x1eb8d21d

    invoke-interface {v5, v0}, LT/l;->U(I)V

    :goto_31
    invoke-interface {v5}, LT/l;->J()V

    goto :goto_32

    :cond_4e
    const v1, -0x1eb8d21c

    invoke-interface {v5, v1}, LT/l;->U(I)V

    shr-int/lit8 v1, v12, 0x3

    and-int/lit8 v1, v1, 0xe

    invoke-static {v2, v0, v5, v1}, LF/b;->a(LL0/d;Ljava/util/List;LT/l;I)V

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_31

    :goto_32
    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4f

    invoke-static {}, LT/o;->P()V

    :cond_4f
    :goto_33
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_50

    new-instance v11, LF/g$h;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, v20

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v44, v11

    move-object/from16 v11, p10

    move-object/from16 v45, v12

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    invoke-direct/range {v0 .. v17}, LF/g$h;-><init>(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;III)V

    move-object/from16 v1, v44

    move-object/from16 v0, v45

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_50
    return-void
.end method

.method public static final synthetic f(LT/q0;LL0/d;)V
    .locals 0

    invoke-static {p0, p1}, LF/g;->d(LT/q0;LL0/d;)V

    return-void
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;LT/l;III)V
    .locals 0

    invoke-static/range {p0 .. p17}, LF/g;->e(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;LT/l;III)V

    return-void
.end method

.method public static final synthetic h(Ljava/util/List;Lmh/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LF/g;->i(Ljava/util/List;Lmh/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ljava/util/List;Lmh/a;)Ljava/util/List;
    .locals 10

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LF/r0;

    invoke-direct {p1}, LF/r0;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC0/B;

    invoke-interface {v3}, LC0/n;->b()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LF/s0;

    invoke-virtual {v4}, LF/s0;->a()LF/t0;

    move-result-object v4

    invoke-interface {v4, p1}, LF/t0;->a(LF/r0;)LF/q0;

    move-result-object v4

    sget-object v5, LY0/b;->b:LY0/b$a;

    invoke-virtual {v4}, LF/q0;->c()I

    move-result v6

    invoke-virtual {v4}, LF/q0;->c()I

    move-result v7

    invoke-virtual {v4}, LF/q0;->a()I

    move-result v8

    invoke-virtual {v4}, LF/q0;->a()I

    move-result v9

    invoke-virtual {v5, v6, v7, v8, v9}, LY0/b$a;->b(IIII)J

    move-result-wide v5

    invoke-interface {v3, v5, v6}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v3

    new-instance v5, LYg/s;

    invoke-virtual {v4}, LF/q0;->b()Lmh/a;

    move-result-object v4

    invoke-direct {v5, v3, v4}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method private static final j(Landroidx/compose/ui/e;LL0/d;LL0/U;Lmh/l;IZIILQ0/k$b;Ljava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;)Landroidx/compose/ui/e;
    .locals 16

    new-instance v15, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v0, v15

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p8

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;-><init>(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v0, v15}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    return-object v0
.end method
