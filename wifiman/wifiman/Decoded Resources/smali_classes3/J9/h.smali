.class public abstract LJ9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ9/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(FLT/z1;LT/z1;Lo0/f;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LJ9/h;->l(FLT/z1;LT/z1;Lo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p13}, LJ9/h;->o(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LJ9/h;->i(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lmh/l;LJ9/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LJ9/h;->h(Lmh/l;LJ9/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LJ9/h;->m(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FLT/l;II)V
    .locals 27

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v15, p3

    move-object/from16 v13, p4

    move/from16 v14, p7

    move/from16 v12, p9

    move/from16 v1, p11

    move/from16 v11, p12

    const/16 v7, 0x80

    const/16 v9, 0x10

    const/16 v4, 0x20

    const v10, 0x1115366c

    move-object/from16 v3, p10

    invoke-interface {v3, v10}, LT/l;->r(I)LT/l;

    move-result-object v3

    const/4 v10, 0x1

    and-int/lit8 v20, v11, 0x1

    const/4 v10, 0x2

    const/4 v5, 0x4

    if-eqz v20, :cond_0

    or-int/lit8 v22, v1, 0x6

    move-object/from16 v6, p0

    move/from16 v23, v22

    goto :goto_1

    :cond_0
    and-int/lit8 v22, v1, 0x6

    move-object/from16 v6, p0

    if-nez v22, :cond_2

    invoke-interface {v3, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1

    move/from16 v23, v5

    goto :goto_0

    :cond_1
    move/from16 v23, v10

    :goto_0
    or-int v23, v1, v23

    goto :goto_1

    :cond_2
    move/from16 v23, v1

    :goto_1
    and-int/lit8 v24, v11, 0x2

    if-eqz v24, :cond_4

    or-int/lit8 v23, v23, 0x30

    :cond_3
    :goto_2
    move/from16 v10, v23

    goto :goto_4

    :cond_4
    and-int/lit8 v24, v1, 0x30

    if-nez v24, :cond_3

    invoke-interface {v3, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_5

    move/from16 v24, v4

    goto :goto_3

    :cond_5
    move/from16 v24, v9

    :goto_3
    or-int v23, v23, v24

    goto :goto_2

    :goto_4
    and-int/lit8 v23, v11, 0x4

    if-eqz v23, :cond_6

    or-int/lit16 v10, v10, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_8

    invoke-interface {v3, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_5

    :cond_7
    move v5, v7

    :goto_5
    or-int/2addr v10, v5

    :cond_8
    :goto_6
    and-int/lit8 v5, v11, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v10, v10, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v5, v1, 0xc00

    if-nez v5, :cond_b

    invoke-interface {v3, v15}, LT/l;->c(Z)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x800

    goto :goto_7

    :cond_a
    const/16 v5, 0x400

    :goto_7
    or-int/2addr v10, v5

    :cond_b
    :goto_8
    and-int/lit8 v5, v11, 0x10

    if-eqz v5, :cond_c

    or-int/lit16 v10, v10, 0x6000

    goto :goto_a

    :cond_c
    and-int/lit16 v5, v1, 0x6000

    if-nez v5, :cond_e

    invoke-interface {v3, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/16 v5, 0x4000

    goto :goto_9

    :cond_d
    const/16 v5, 0x2000

    :goto_9
    or-int/2addr v10, v5

    :cond_e
    :goto_a
    and-int/lit8 v5, v11, 0x20

    const/high16 v24, 0x30000

    if-eqz v5, :cond_10

    or-int v10, v10, v24

    :cond_f
    move-object/from16 v5, p5

    goto :goto_c

    :cond_10
    and-int v5, v1, v24

    if-nez v5, :cond_f

    move-object/from16 v5, p5

    invoke-interface {v3, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_11

    const/high16 v24, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v24, 0x10000

    :goto_b
    or-int v10, v10, v24

    :goto_c
    and-int/lit8 v24, v11, 0x40

    const/high16 v25, 0x180000

    if-eqz v24, :cond_12

    or-int v10, v10, v25

    move-object/from16 v9, p6

    goto :goto_e

    :cond_12
    and-int v24, v1, v25

    move-object/from16 v9, p6

    if-nez v24, :cond_14

    invoke-interface {v3, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_13

    const/high16 v24, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v24, 0x80000

    :goto_d
    or-int v10, v10, v24

    :cond_14
    :goto_e
    and-int/2addr v7, v11

    const/high16 v24, 0xc00000

    if-eqz v7, :cond_16

    or-int v10, v10, v24

    :cond_15
    :goto_f
    const/16 v7, 0x100

    goto :goto_11

    :cond_16
    and-int v7, v1, v24

    if-nez v7, :cond_15

    invoke-interface {v3, v14}, LT/l;->c(Z)Z

    move-result v7

    if-eqz v7, :cond_17

    const/high16 v7, 0x800000

    goto :goto_10

    :cond_17
    const/high16 v7, 0x400000

    :goto_10
    or-int/2addr v10, v7

    goto :goto_f

    :goto_11
    and-int/2addr v7, v11

    if-eqz v7, :cond_19

    const/high16 v7, 0x6000000

    or-int/2addr v10, v7

    :cond_18
    move-object/from16 v7, p8

    goto :goto_13

    :cond_19
    const/high16 v7, 0x6000000

    and-int/2addr v7, v1

    if-nez v7, :cond_18

    move-object/from16 v7, p8

    invoke-interface {v3, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1a

    const/high16 v22, 0x4000000

    goto :goto_12

    :cond_1a
    const/high16 v22, 0x2000000

    :goto_12
    or-int v10, v10, v22

    :goto_13
    and-int/lit16 v4, v11, 0x200

    if-eqz v4, :cond_1b

    const/high16 v4, 0x30000000

    :goto_14
    or-int/2addr v10, v4

    goto :goto_15

    :cond_1b
    const/high16 v4, 0x30000000

    and-int/2addr v4, v1

    if-nez v4, :cond_1d

    invoke-interface {v3, v12}, LT/l;->g(F)Z

    move-result v4

    if-eqz v4, :cond_1c

    const/high16 v4, 0x20000000

    goto :goto_14

    :cond_1c
    const/high16 v4, 0x10000000

    goto :goto_14

    :cond_1d
    :goto_15
    const v4, 0x12492493

    and-int/2addr v4, v10

    const v8, 0x12492492

    if-ne v4, v8, :cond_1f

    invoke-interface {v3}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_16

    :cond_1e
    invoke-interface {v3}, LT/l;->C()V

    move-object/from16 v26, v3

    move-object v1, v6

    goto/16 :goto_25

    :cond_1f
    :goto_16
    if-eqz v20, :cond_20

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v8, v4

    goto :goto_17

    :cond_20
    move-object v8, v6

    :goto_17
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_21

    const/4 v4, -0x1

    const-string/jumbo v6, "com.ui.core.ui.component.tablayout.UiTab (UiTabLayout.kt:300)"

    const v1, 0x1115366c

    invoke-static {v1, v10, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_21
    const v1, 0x5862705d

    invoke-interface {v3, v1}, LT/l;->U(I)V

    and-int/lit16 v1, v10, 0x1c00

    const/16 v4, 0x800

    if-ne v1, v4, :cond_22

    const/4 v4, 0x1

    goto :goto_18

    :cond_22
    const/4 v4, 0x0

    :goto_18
    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_23

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_25

    :cond_23
    if-eqz v15, :cond_24

    invoke-virtual/range {p5 .. p5}, LJ9/b;->c()J

    move-result-wide v19

    goto :goto_19

    :cond_24
    invoke-virtual/range {p5 .. p5}, LJ9/b;->g()J

    move-result-wide v19

    :goto_19
    invoke-static/range {v19 .. v20}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    invoke-interface {v3, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_25
    check-cast v6, Lm0/v0;

    invoke-virtual {v6}, Lm0/v0;->u()J

    move-result-wide v19

    invoke-interface {v3}, LT/l;->J()V

    const/16 v25, 0x180

    const/16 v26, 0xa

    const/16 v21, 0x0

    const-string/jumbo v22, "backgroundColorAnimation"

    const/16 v23, 0x0

    move-object/from16 v24, v3

    invoke-static/range {v19 .. v26}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v4

    sget-object v6, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v6, v3, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-static {v5}, LJ9/h;->s(Lma/a;)J

    move-result-wide v5

    move-wide/from16 v19, v5

    const v5, 0x58629bb7

    invoke-interface {v3, v5}, LT/l;->U(I)V

    const/16 v6, 0x800

    if-ne v1, v6, :cond_26

    const/4 v5, 0x1

    goto :goto_1a

    :cond_26
    const/4 v5, 0x0

    :goto_1a
    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_27

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_29

    :cond_27
    if-eqz v15, :cond_28

    invoke-virtual/range {p5 .. p5}, LJ9/b;->d()J

    move-result-wide v5

    goto :goto_1b

    :cond_28
    move-wide/from16 v5, v19

    :goto_1b
    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    invoke-interface {v3, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_29
    check-cast v6, Lm0/v0;

    invoke-virtual {v6}, Lm0/v0;->u()J

    move-result-wide v19

    invoke-interface {v3}, LT/l;->J()V

    const/16 v25, 0x180

    const/16 v26, 0xa

    const/16 v21, 0x0

    const-string/jumbo v22, "boarderColorAnimation"

    const/16 v23, 0x0

    move-object/from16 v24, v3

    invoke-static/range {v19 .. v26}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v9, 0x0

    invoke-static {v8, v9, v7, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v11

    move-object/from16 v17, v8

    const/4 v7, 0x0

    const/4 v8, 0x3

    invoke-static {v11, v6, v7, v8, v6}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v11

    const/16 v7, 0x20

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    const/4 v8, 0x2

    invoke-static {v11, v7, v9, v8, v6}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-static/range {p9 .. p9}, LE/h;->d(F)LE/g;

    move-result-object v8

    invoke-static {v7, v8}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v7

    const v8, 0x5862d592

    invoke-interface {v3, v8}, LT/l;->U(I)V

    invoke-interface {v3, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    const/high16 v9, 0x70000000

    and-int/2addr v9, v10

    const/high16 v11, 0x20000000

    if-ne v9, v11, :cond_2a

    const/4 v9, 0x1

    goto :goto_1c

    :cond_2a
    const/4 v9, 0x0

    :goto_1c
    or-int/2addr v8, v9

    invoke-interface {v3, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_2b

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_2c

    :cond_2b
    new-instance v9, LJ9/e;

    invoke-direct {v9, v12, v4, v5}, LJ9/e;-><init>(FLT/z1;LT/z1;)V

    invoke-interface {v3, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2c
    check-cast v9, Lmh/l;

    invoke-interface {v3}, LT/l;->J()V

    invoke-static {v7, v9}, Landroidx/compose/ui/draw/b;->b(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v4

    const v5, 0x58630910

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    sget-object v16, LT/l;->a:LT/l$a;

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_2d

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v5

    invoke-interface {v3, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2d
    check-cast v5, Ly/m;

    invoke-interface {v3}, LT/l;->J()V

    invoke-virtual/range {p5 .. p5}, LJ9/b;->b()J

    move-result-wide v21

    const/16 v23, 0x3

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v19 .. v24}, LN/A0;->f(ZFJILjava/lang/Object;)Ls/I;

    move-result-object v7

    const v8, 0x58631a36

    invoke-interface {v3, v8}, LT/l;->U(I)V

    const v8, 0xe000

    and-int/2addr v8, v10

    const/16 v9, 0x4000

    if-ne v8, v9, :cond_2e

    const/4 v8, 0x1

    goto :goto_1d

    :cond_2e
    const/4 v8, 0x0

    :goto_1d
    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_2f

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_30

    :cond_2f
    new-instance v9, LJ9/f;

    invoke-direct {v9, v13}, LJ9/f;-><init>(Lmh/a;)V

    invoke-interface {v3, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_30
    check-cast v9, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    const/16 v11, 0x18

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/16 v20, 0x0

    move-object v13, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v7

    const/4 v7, 0x0

    const/16 v21, 0x800

    move/from16 v6, p7

    const/16 v22, 0x1

    move-object v7, v8

    move-object/from16 v25, v17

    const/16 v17, 0x3

    move-object/from16 v8, v20

    move/from16 v18, v10

    move/from16 v17, v22

    move v10, v11

    move-object/from16 v11, v19

    invoke-static/range {v3 .. v11}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->e()Lf0/c;

    move-result-object v5

    const/4 v10, 0x0

    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v5

    invoke-static {v13, v10}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v13, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_31

    invoke-static {}, LT/j;->c()V

    :cond_31
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_32

    invoke-interface {v13, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_1e

    :cond_32
    invoke-interface {v13}, LT/l;->I()V

    :goto_1e
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v9, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v9, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_33

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_34

    :cond_33
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_34
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v9, v3, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const v3, 0x7084d91c

    invoke-interface {v13, v3}, LT/l;->U(I)V

    const/16 v3, 0x800

    if-ne v1, v3, :cond_35

    move/from16 v1, v17

    goto :goto_1f

    :cond_35
    move v1, v10

    :goto_1f
    const/high16 v3, 0x1c00000

    and-int v3, v18, v3

    const/high16 v5, 0x800000

    if-ne v3, v5, :cond_36

    goto :goto_20

    :cond_36
    move/from16 v17, v10

    :goto_20
    or-int v1, v1, v17

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_37

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_39

    :cond_37
    if-eqz v15, :cond_38

    invoke-virtual/range {p5 .. p5}, LJ9/b;->e()J

    move-result-wide v5

    invoke-static {v5, v6, v14}, LJ9/h;->t(JZ)J

    move-result-wide v5

    goto :goto_21

    :cond_38
    invoke-virtual/range {p5 .. p5}, LJ9/b;->f()J

    move-result-wide v5

    invoke-static {v5, v6, v14}, LJ9/h;->t(JZ)J

    move-result-wide v5

    :goto_21
    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_39
    check-cast v3, Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->u()J

    move-result-wide v20

    invoke-interface {v13}, LT/l;->J()V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x3

    const/4 v11, 0x0

    invoke-static {v1, v11, v10, v9, v11}, Landroidx/compose/foundation/layout/r;->H(Landroidx/compose/ui/e;Lf0/c$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v11, v10, v9, v11}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v0}, LJ9/h;->n(Landroidx/compose/ui/e;Ls9/b;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v5, Lz/c;->a:Lz/c;

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v5, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    invoke-virtual {v4}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v4

    const/16 v6, 0x36

    invoke-static {v5, v4, v13, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v13, v10}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v13, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_3a

    invoke-static {}, LT/j;->c()V

    :cond_3a
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_3b

    invoke-interface {v13, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_22

    :cond_3b
    invoke-interface {v13}, LT/l;->I()V

    :goto_22
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v7, v4, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_3c

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3d

    :cond_3c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_3d
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    const v3, -0x457ae261

    invoke-interface {v13, v3}, LT/l;->U(I)V

    if-nez v0, :cond_3e

    const/4 v0, 0x3

    goto :goto_23

    :cond_3e
    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static/range {v20 .. v21}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    shr-int/lit8 v3, v18, 0x6

    and-int/lit8 v3, v3, 0xe

    or-int/lit8 v3, v3, 0x30

    shr-int/lit8 v6, v18, 0xf

    and-int/lit16 v6, v6, 0x1c00

    or-int v8, v3, v6

    const/4 v9, 0x0

    move-object/from16 v3, p2

    move-object/from16 v6, p8

    move-object v7, v13

    const/4 v0, 0x3

    invoke-static/range {v3 .. v9}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    sget-object v3, LYg/J;->a:LYg/J;

    :goto_23
    invoke-interface {v13}, LT/l;->J()V

    const v3, -0x457ac8c4

    invoke-interface {v13, v3}, LT/l;->U(I)V

    if-eqz v2, :cond_3f

    invoke-static {v1, v11, v10, v0, v11}, Landroidx/compose/foundation/layout/r;->H(Landroidx/compose/ui/e;Lf0/c$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v11, v10, v0, v11}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, LW0/j;->b:LW0/j$a;

    invoke-virtual {v3}, LW0/j$a;->a()I

    move-result v3

    invoke-static {v3}, LW0/j;->h(I)LW0/j;

    move-result-object v3

    move-object v12, v3

    shr-int/lit8 v0, v18, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v22, v0, 0x30

    const/high16 v0, 0x380000

    and-int v0, v18, v0

    or-int/lit16 v0, v0, 0xc00

    move/from16 v23, v0

    const v24, 0xddf8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v26, v13

    move-wide/from16 v13, v16

    const/4 v0, 0x0

    move v15, v0

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p1

    move-wide/from16 v2, v20

    move-object/from16 v20, p6

    move-object/from16 v21, v26

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    goto :goto_24

    :cond_3f
    move-object/from16 v26, v13

    :goto_24
    invoke-interface/range {v26 .. v26}, LT/l;->J()V

    invoke-interface/range {v26 .. v26}, LT/l;->R()V

    invoke-interface/range {v26 .. v26}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_40

    invoke-static {}, LT/o;->P()V

    :cond_40
    move-object/from16 v1, v25

    :goto_25
    invoke-interface/range {v26 .. v26}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_41

    new-instance v14, LJ9/g;

    move-object v0, v14

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LJ9/g;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FII)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_41
    return-void
.end method

.method public static final g(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;LT/l;II)V
    .locals 32

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/4 v3, 0x6

    const-string/jumbo v4, "tabs"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v4, "onClick"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x11620f13

    move-object/from16 v7, p5

    invoke-interface {v7, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x1

    and-int/lit8 v7, p7, 0x1

    const/4 v8, 0x4

    if-eqz v7, :cond_0

    or-int/lit8 v9, v6, 0x6

    move v10, v9

    move-object/from16 v9, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v6, 0x6

    if-nez v9, :cond_2

    move-object/from16 v9, p0

    invoke-interface {v15, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    move v10, v8

    goto :goto_0

    :cond_1
    move v10, v1

    :goto_0
    or-int/2addr v10, v6

    goto :goto_1

    :cond_2
    move-object/from16 v9, p0

    move v10, v6

    :goto_1
    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v10, v10, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v1, v6, 0x30

    if-nez v1, :cond_5

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x20

    goto :goto_2

    :cond_4
    move v1, v0

    :goto_2
    or-int/2addr v10, v1

    :cond_5
    :goto_3
    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_7

    or-int/lit16 v10, v10, 0x180

    :cond_6
    move/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v6, 0x180

    if-nez v11, :cond_6

    move/from16 v11, p2

    invoke-interface {v15, v11}, LT/l;->c(Z)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v10, v12

    :goto_5
    and-int/lit8 v12, p7, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v10, v10, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v6, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-interface {v15, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    const/16 v16, 0x800

    goto :goto_6

    :cond_b
    const/16 v16, 0x400

    :goto_6
    or-int v10, v10, v16

    :goto_7
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_d

    or-int/lit16 v10, v10, 0x6000

    :cond_c
    :goto_8
    move v0, v10

    goto :goto_a

    :cond_d
    and-int/lit16 v0, v6, 0x6000

    if-nez v0, :cond_c

    invoke-interface {v15, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/16 v0, 0x4000

    goto :goto_9

    :cond_e
    const/16 v0, 0x2000

    :goto_9
    or-int/2addr v10, v0

    goto :goto_8

    :goto_a
    and-int/lit16 v10, v0, 0x2493

    const/16 v3, 0x2492

    if-ne v10, v3, :cond_10

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v15}, LT/l;->C()V

    move-object v1, v9

    move v3, v11

    move-object v4, v13

    move-object/from16 v28, v15

    goto/16 :goto_13

    :cond_10
    :goto_b
    if-eqz v7, :cond_11

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_c

    :cond_11
    move-object v3, v9

    :goto_c
    if-eqz v1, :cond_12

    move v1, v14

    goto :goto_d

    :cond_12
    move v1, v11

    :goto_d
    if-eqz v12, :cond_13

    sget-object v7, LJ9/i;->DEFAULT:LJ9/i;

    move-object v13, v7

    :cond_13
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_14

    const/4 v7, -0x1

    const-string/jumbo v9, "com.ui.core.ui.component.tablayout.UiTabLayout (UiTabLayout.kt:241)"

    invoke-static {v4, v0, v7, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    shr-int/lit8 v4, v0, 0x9

    and-int/lit8 v4, v4, 0xe

    invoke-static {v13, v15, v4}, LJ9/h;->q(LJ9/i;LT/l;I)LJ9/b;

    move-result-object v20

    invoke-static {v13, v15, v4}, LJ9/h;->r(LJ9/i;LT/l;I)LL0/U;

    move-result-object v21

    invoke-static {v13, v15, v4}, LJ9/h;->p(LJ9/i;LT/l;I)F

    move-result v4

    const/4 v12, 0x0

    const/4 v11, 0x0

    invoke-static {v3, v12, v14, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v10, 0x0

    const/4 v9, 0x3

    invoke-static {v7, v11, v10, v9, v11}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v8, v15, v9}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v8

    invoke-virtual {v8}, Loa/a;->a()LE/a;

    move-result-object v8

    invoke-static {v7, v8}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v22

    invoke-virtual/range {v20 .. v20}, LJ9/b;->a()J

    move-result-wide v23

    const/16 v26, 0x2

    const/16 v27, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->o()Lf0/c;

    move-result-object v9

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v9

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v18

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v15, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v19, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v22

    if-nez v22, :cond_15

    invoke-static {}, LT/j;->c()V

    :cond_15
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v22

    if-eqz v22, :cond_16

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_e

    :cond_16
    invoke-interface {v15}, LT/l;->I()V

    :goto_e
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v9, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->g()Lmh/p;

    move-result-object v9

    invoke-static {v11, v10, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->b()Lmh/p;

    move-result-object v9

    invoke-interface {v11}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_17

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    :cond_17
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10, v9}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_18
    invoke-virtual/range {v19 .. v19}, LE0/g$a;->f()Lmh/p;

    move-result-object v9

    invoke-static {v11, v7, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v7, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v7, v9, v14, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v11, 0x3

    invoke-static {v7, v10, v9, v11, v10}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/high16 v10, 0x40a00000    # 5.0f

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v10, Lz/c;->a:Lz/c;

    const/4 v11, 0x4

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-virtual {v10, v11}, Lz/c;->n(F)Lz/c$f;

    move-result-object v10

    invoke-virtual {v8}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v8

    const/4 v11, 0x6

    invoke-static {v10, v8, v15, v11}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v8

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_19

    invoke-static {}, LT/j;->c()V

    :cond_19
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_1a

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_f

    :cond_1a
    invoke-interface {v15}, LT/l;->I()V

    :goto_f
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v8, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->g()Lmh/p;

    move-result-object v8

    invoke-static {v11, v9, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->b()Lmh/p;

    move-result-object v8

    invoke-interface {v11}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_1b

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1c

    :cond_1b
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9, v8}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1c
    invoke-virtual/range {v19 .. v19}, LE0/g$a;->f()Lmh/p;

    move-result-object v8

    invoke-static {v11, v7, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v29, Lz/Z;->a:Lz/Z;

    const v7, -0x4b64b862

    invoke-interface {v15, v7}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LJ9/j;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v30

    :goto_10
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJ9/a;

    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v8, v12, v14, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x3

    invoke-static {v8, v11, v9, v10, v11}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v24

    const/16 v27, 0x2

    const/16 v28, 0x0

    const/high16 v25, 0x3f800000    # 1.0f

    const/16 v26, 0x0

    move-object/from16 v23, v29

    invoke-static/range {v23 .. v28}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual {v7}, LJ9/a;->e()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_1d

    invoke-virtual {v7}, LJ9/a;->e()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, LJ9/a;->d()Z

    move-result v10

    invoke-static {v8, v9, v10}, LM9/i;->h(Landroidx/compose/ui/e;Ljava/lang/String;Z)Landroidx/compose/ui/e;

    move-result-object v8

    :cond_1d
    invoke-virtual {v7}, LJ9/a;->f()Ls9/d;

    move-result-object v9

    const v10, -0x4b647762

    invoke-interface {v15, v10}, LT/l;->U(I)V

    if-nez v9, :cond_1e

    move-object v9, v11

    const/4 v10, 0x0

    goto :goto_11

    :cond_1e
    const/4 v10, 0x0

    invoke-static {v9, v15, v10}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v9

    :goto_11
    invoke-interface {v15}, LT/l;->J()V

    invoke-virtual {v7}, LJ9/a;->a()Ls9/b;

    move-result-object v16

    invoke-virtual {v7}, LJ9/a;->d()Z

    move-result v17

    const v10, 0x720bb900

    invoke-interface {v15, v10}, LT/l;->U(I)V

    const v10, 0xe000

    and-int/2addr v10, v0

    const/16 v2, 0x4000

    if-ne v10, v2, :cond_1f

    move v10, v14

    goto :goto_12

    :cond_1f
    const/4 v10, 0x0

    :goto_12
    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    or-int v10, v10, v18

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v10, :cond_20

    sget-object v10, LT/l;->a:LT/l$a;

    invoke-virtual {v10}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v2, v10, :cond_21

    :cond_20
    new-instance v2, LJ9/c;

    invoke-direct {v2, v5, v7}, LJ9/c;-><init>(Lmh/l;LJ9/a;)V

    invoke-interface {v15, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    check-cast v2, Lmh/a;

    invoke-interface {v15}, LT/l;->J()V

    invoke-virtual {v7}, LJ9/a;->b()Ljava/lang/String;

    move-result-object v18

    shl-int/lit8 v7, v0, 0xf

    const/high16 v10, 0x1c00000

    and-int v19, v7, v10

    const/16 v22, 0x0

    move-object v7, v8

    move-object v8, v9

    const/16 v23, 0x3

    move-object/from16 v9, v16

    const/16 v24, 0x0

    move/from16 v10, v17

    move-object/from16 v25, v11

    move-object v11, v2

    move v2, v12

    move-object/from16 v12, v20

    move-object/from16 v26, v13

    move-object/from16 v13, v21

    move/from16 v27, v14

    move v14, v1

    move-object/from16 v28, v15

    move-object/from16 v15, v18

    move/from16 v16, v4

    move-object/from16 v17, v28

    move/from16 v18, v19

    move/from16 v19, v22

    invoke-static/range {v7 .. v19}, LJ9/h;->f(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FLT/l;II)V

    move-object/from16 v2, p1

    move-object/from16 v13, v26

    move/from16 v14, v27

    move-object/from16 v15, v28

    goto/16 :goto_10

    :cond_22
    move-object/from16 v26, v13

    move-object/from16 v28, v15

    invoke-interface/range {v28 .. v28}, LT/l;->J()V

    invoke-interface/range {v28 .. v28}, LT/l;->R()V

    invoke-interface/range {v28 .. v28}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {}, LT/o;->P()V

    :cond_23
    move-object/from16 v4, v26

    move-object/from16 v31, v3

    move v3, v1

    move-object/from16 v1, v31

    :goto_13
    invoke-interface/range {v28 .. v28}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_24

    new-instance v9, LJ9/d;

    move-object v0, v9

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LJ9/d;-><init>(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_24
    return-void
.end method

.method private static final h(Lmh/l;LJ9/a;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LJ9/h;->g(Landroidx/compose/ui/e;LJ9/j;ZLJ9/i;Lmh/l;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final j(LT/z1;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final k(LT/z1;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final l(FLT/z1;LT/z1;Lo0/f;)LYg/J;
    .locals 22

    move-object/from16 v13, p3

    const-string v0, "$this$drawBehind"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, LJ9/h;->j(LT/z1;)J

    move-result-wide v1

    const/16 v11, 0x7e

    const/4 v12, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v0, p3

    invoke-static/range {v0 .. v12}, Lo0/f;->u0(Lo0/f;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    move/from16 v0, p0

    invoke-interface {v13, v0}, LY0/d;->d1(F)F

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v7

    invoke-static/range {p2 .. p2}, LJ9/h;->k(LT/z1;)J

    move-result-wide v1

    new-instance v9, Lo0/k;

    const/4 v0, 0x1

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-interface {v13, v0}, LY0/d;->d1(F)F

    move-result v15

    const/16 v20, 0x1e

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v14, v9

    invoke-direct/range {v14 .. v21}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0xe6

    const/4 v15, 0x0

    const-wide/16 v3, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, p3

    move v13, v14

    move-object v14, v15

    invoke-static/range {v0 .. v14}, Lo0/f;->b1(Lo0/f;JJJJLo0/g;FLm0/w0;IILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final m(Lmh/a;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/e;Ls9/b;)Landroidx/compose/ui/e;
    .locals 3

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x6

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, p1, v0, v1}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FIILT/l;I)LYg/J;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p12

    move/from16 v13, p11

    invoke-static/range {v1 .. v13}, LJ9/h;->f(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final p(LJ9/i;LT/l;I)F
    .locals 4

    const v0, -0x4c489721

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.tablayout.rememberUiTabCornerRadius (UiTabLayout.kt:223)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x2851b405

    invoke-interface {p1, v0}, LT/l;->U(I)V

    and-int/lit8 v0, p2, 0xe

    const/4 v1, 0x6

    xor-int/2addr v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v0, v3, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/2addr p2, v1

    if-ne p2, v3, :cond_3

    :cond_2
    move p2, v2

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_9

    :cond_4
    sget-object p2, LJ9/h$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    if-eq p0, v2, :cond_8

    const/4 p2, 0x2

    if-eq p0, p2, :cond_7

    const/4 p2, 0x3

    if-eq p0, p2, :cond_6

    if-ne p0, v3, :cond_5

    const/16 p0, 0x8

    int-to-float p0, p0

    invoke-static {p0}, LY0/h;->j(F)F

    move-result p0

    goto :goto_1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    int-to-float p0, v1

    invoke-static {p0}, LY0/h;->j(F)F

    move-result p0

    goto :goto_1

    :cond_7
    int-to-float p0, v1

    invoke-static {p0}, LY0/h;->j(F)F

    move-result p0

    goto :goto_1

    :cond_8
    int-to-float p0, v1

    invoke-static {p0}, LY0/h;->j(F)F

    move-result p0

    :goto_1
    invoke-static {p0}, LY0/h;->d(F)LY0/h;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, LY0/h;

    invoke-virtual {v0}, LY0/h;->s()F

    move-result p0

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    invoke-interface {p1}, LT/l;->J()V

    return p0
.end method

.method private static final q(LJ9/i;LT/l;I)LJ9/b;
    .locals 19

    move-object/from16 v0, p1

    move/from16 v1, p2

    const v2, -0x5751bacb

    invoke-interface {v0, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.tablayout.rememberUiTabLayoutColors (UiTabLayout.kt:90)"

    invoke-static {v2, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v0, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    const v3, 0x22307763

    invoke-interface {v0, v3}, LT/l;->U(I)V

    invoke-interface {v0, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v4, v1, 0xe

    xor-int/lit8 v4, v4, 0x6

    const/4 v5, 0x1

    const/4 v6, 0x4

    if-le v4, v6, :cond_1

    move-object/from16 v4, p0

    invoke-interface {v0, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_0

    :cond_1
    move-object/from16 v4, p0

    :goto_0
    and-int/lit8 v1, v1, 0x6

    if-ne v1, v6, :cond_3

    :cond_2
    move v1, v5

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    or-int/2addr v1, v3

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_4

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_10

    :cond_4
    sget-object v1, LJ9/h$a;->a:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v1, v1, v3

    if-eq v1, v5, :cond_e

    const/4 v3, 0x2

    if-eq v1, v3, :cond_b

    const/4 v3, 0x3

    if-eq v1, v3, :cond_8

    if-ne v1, v6, :cond_7

    sget-object v1, Lma/a$d;->a:Lma/a$d;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, LJ9/b;

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v4

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v8

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v10

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->g()J

    move-result-wide v12

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v14

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->a()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, LJ9/b;-><init>(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_5
    sget-object v1, Lma/a$b;->a:Lma/a$b;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, LJ9/b;

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v4

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v8

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v10

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->g()J

    move-result-wide v12

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v14

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->a()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, LJ9/b;-><init>(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    sget-object v1, Lma/a$d;->a:Lma/a$d;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v1, LJ9/b;

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->a()J

    move-result-wide v4

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    sget-object v3, Lma/a$b;->a:Lma/a$b;

    invoke-virtual {v3}, Lma/a$b;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v8

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v10

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->g()J

    move-result-wide v12

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v14

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->a()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, LJ9/b;-><init>(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_9
    sget-object v1, Lma/a$b;->a:Lma/a$b;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v1, LJ9/b;

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->e()J

    move-result-wide v4

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v8

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v10

    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->a()J

    move-result-wide v12

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v14

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->e()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, LJ9/b;-><init>(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    sget-object v1, Lma/a$d;->a:Lma/a$d;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, LJ9/b;

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->e()J

    move-result-wide v4

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v8

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->a()J

    move-result-wide v10

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->g()J

    move-result-wide v12

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v14

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->e()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, LJ9/b;-><init>(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_c
    sget-object v1, Lma/a$b;->a:Lma/a$b;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, LJ9/b;

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->e()J

    move-result-wide v4

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v8

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->a()J

    move-result-wide v10

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->g()J

    move-result-wide v12

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v14

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->e()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, LJ9/b;-><init>(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    sget-object v1, Lma/a$d;->a:Lma/a$d;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance v1, LJ9/b;

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->a()J

    move-result-wide v4

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v8

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->b()J

    move-result-wide v10

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->g()J

    move-result-wide v12

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v14

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->a()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, LJ9/b;-><init>(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_f
    sget-object v1, Lma/a$b;->a:Lma/a$b;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, LJ9/b;

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->b()J

    move-result-wide v4

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v6

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v8

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->a()J

    move-result-wide v10

    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->a()J

    move-result-wide v12

    invoke-static {v2}, LJ9/h;->s(Lma/a;)J

    move-result-wide v14

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->b()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v18}, LJ9/b;-><init>(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    invoke-interface {v0, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, LJ9/b;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    return-object v3

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final r(LJ9/i;LT/l;I)LL0/U;
    .locals 4

    const v0, -0x5ee6d876

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.tablayout.rememberUiTabTextStyle (UiTabLayout.kt:209)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p1, v1}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v0

    const v1, -0x6fd63dfd

    invoke-interface {p1, v1}, LT/l;->U(I)V

    and-int/lit8 v1, p2, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v1, v3, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v3, :cond_3

    :cond_2
    move p2, v2

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_9

    :cond_4
    sget-object p2, LJ9/h$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    if-eq p0, v2, :cond_8

    const/4 p2, 0x2

    if-eq p0, p2, :cond_7

    const/4 p2, 0x3

    if-eq p0, p2, :cond_6

    if-ne p0, v3, :cond_5

    invoke-virtual {v0}, Lpa/c;->b()Lpa/b;

    move-result-object p0

    invoke-virtual {p0}, Lpa/b;->a()LL0/U;

    move-result-object p0

    :goto_1
    move-object v1, p0

    goto :goto_2

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    invoke-virtual {v0}, Lpa/c;->a()Lpa/b;

    move-result-object p0

    invoke-virtual {p0}, Lpa/b;->a()LL0/U;

    move-result-object p0

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Lpa/c;->b()Lpa/b;

    move-result-object p0

    invoke-virtual {p0}, Lpa/b;->a()LL0/U;

    move-result-object p0

    goto :goto_1

    :cond_8
    invoke-virtual {v0}, Lpa/c;->b()Lpa/b;

    move-result-object p0

    invoke-virtual {p0}, Lpa/b;->a()LL0/U;

    move-result-object p0

    goto :goto_1

    :goto_2
    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, LL0/U;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    invoke-interface {p1}, LT/l;->J()V

    return-object v1
.end method

.method private static final s(Lma/a;)J
    .locals 8

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$b;->a()J

    move-result-wide v0

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final t(JZ)J
    .locals 8

    if-eqz p2, :cond_0

    return-wide p0

    :cond_0
    const/16 v6, 0xe

    const/4 v7, 0x0

    const v2, 0x3e99999a    # 0.3f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v0, p0

    invoke-static/range {v0 .. v7}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method
