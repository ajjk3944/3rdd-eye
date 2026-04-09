.class public abstract LAf/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LAf/u;->d(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LAf/r;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LAf/u;->f(Landroidx/compose/ui/e;LAf/r;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;LT/l;II)V
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const/16 v0, 0x10

    const/16 v2, 0x30

    const/4 v3, 0x6

    const v7, -0x6cb1710f

    move-object/from16 v8, p5

    invoke-interface {v8, v7}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v8, p7, 0x1

    const/4 v9, 0x2

    const/4 v14, 0x4

    if-eqz v8, :cond_0

    or-int/lit8 v8, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v6, 0x6

    if-nez v8, :cond_2

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v14

    goto :goto_0

    :cond_1
    move v8, v9

    :goto_0
    or-int/2addr v8, v6

    goto :goto_1

    :cond_2
    move v8, v6

    :goto_1
    and-int/lit8 v10, p7, 0x2

    if-eqz v10, :cond_4

    or-int/2addr v8, v2

    :cond_3
    move-object/from16 v11, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v11, v6, 0x30

    if-nez v11, :cond_3

    move-object/from16 v11, p1

    invoke-interface {v15, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const/16 v12, 0x20

    goto :goto_2

    :cond_5
    move v12, v0

    :goto_2
    or-int/2addr v8, v12

    :goto_3
    and-int/lit8 v12, p7, 0x4

    if-eqz v12, :cond_6

    or-int/lit16 v8, v8, 0x180

    move-object/from16 v13, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v6, 0x180

    move-object/from16 v13, p2

    if-nez v12, :cond_8

    invoke-interface {v15, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v8, v12

    :cond_8
    :goto_5
    and-int/lit8 v12, p7, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v8, v8, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v6, 0xc00

    if-nez v12, :cond_b

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v8, v12

    :cond_b
    :goto_7
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_d

    or-int/lit16 v8, v8, 0x6000

    :cond_c
    :goto_8
    move v0, v8

    goto :goto_a

    :cond_d
    and-int/lit16 v0, v6, 0x6000

    if-nez v0, :cond_c

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/16 v0, 0x4000

    goto :goto_9

    :cond_e
    const/16 v0, 0x2000

    :goto_9
    or-int/2addr v8, v0

    goto :goto_8

    :goto_a
    and-int/lit16 v8, v0, 0x2493

    const/16 v12, 0x2492

    if-ne v8, v12, :cond_10

    invoke-interface {v15}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v15}, LT/l;->C()V

    move-object v2, v11

    move-object v3, v15

    goto/16 :goto_f

    :cond_10
    :goto_b
    if-eqz v10, :cond_11

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->e()Lf0/c;

    move-result-object v8

    move-object v12, v8

    goto :goto_c

    :cond_11
    move-object v12, v11

    :goto_c
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_12

    const/4 v8, -0x1

    const-string v10, "com.ui.wifiman.ui.wifi.component.Item (WifiGeneralInfoHeader.kt:76)"

    invoke-static {v7, v0, v8, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    const/4 v7, 0x0

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v8

    invoke-static {v15, v7}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v14

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_13

    invoke-static {}, LT/j;->c()V

    :cond_13
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_14

    invoke-interface {v15, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_d

    :cond_14
    invoke-interface {v15}, LT/l;->I()V

    :goto_d
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v3, v8, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v3, v11, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v3}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_15

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_16

    :cond_15
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v3, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v3, v8, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_16
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v3, v14, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v7, 0x78

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static {v3, v7, v8, v9, v10}, Landroidx/compose/foundation/layout/r;->u(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v8

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->f()Lz/c$e;

    move-result-object v9

    invoke-static {v9, v8, v15, v2}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v8, 0x0

    invoke-static {v15, v8}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_17

    invoke-static {}, LT/j;->c()V

    :cond_17
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_e

    :cond_18
    invoke-interface {v15}, LT/l;->I()V

    :goto_e
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v2, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v10, v9, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_19

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1a

    :cond_19
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1a
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v10, v7, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/Z;->a:Lz/Z;

    const v2, -0x3e12eb36

    invoke-interface {v15, v2}, LT/l;->U(I)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    sget-object v7, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v7, v15, v14}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->f()LL0/U;

    move-result-object v8

    invoke-virtual {v8}, LL0/U;->s()J

    move-result-wide v8

    invoke-interface {v2, v8, v9}, LY0/l;->n0(J)F

    move-result v2

    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v9

    invoke-virtual {v7, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->c()Lma/a$c;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$c;->a()J

    move-result-wide v10

    invoke-static {v10, v11}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v10

    const/4 v2, 0x6

    shr-int/lit8 v8, v0, 0x6

    and-int/lit8 v2, v8, 0xe

    const/16 v16, 0x4

    const/4 v11, 0x0

    move-object/from16 v8, p2

    move-object/from16 v34, v12

    move-object v12, v15

    move v13, v2

    move/from16 v35, v14

    const/4 v2, 0x4

    move/from16 v14, v16

    invoke-static/range {v8 .. v14}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v8

    const/4 v9, 0x6

    invoke-static {v8, v15, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    shr-int/lit8 v8, v0, 0x9

    and-int/lit8 v8, v8, 0xe

    invoke-static {v4, v15, v8}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v8

    move/from16 v14, v35

    invoke-virtual {v7, v15, v14}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v9

    invoke-virtual {v9}, Lpa/c;->b()Lpa/b;

    move-result-object v9

    invoke-virtual {v9}, Lpa/b;->f()LL0/U;

    move-result-object v29

    invoke-virtual {v7, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->f()Lma/a$f;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$f;->b()J

    move-result-wide v10

    const/16 v32, 0x0

    const v33, 0x1fffa

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/16 v16, 0x0

    move/from16 v36, v14

    move-object/from16 v14, v16

    move-object/from16 p1, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x0

    move-object/from16 v30, p1

    invoke-static/range {v8 .. v33}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    move-object/from16 v3, p1

    const/4 v8, 0x6

    invoke-static {v2, v3, v8}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    shr-int/lit8 v0, v0, 0xc

    and-int/lit8 v0, v0, 0xe

    invoke-static {v5, v3, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v8

    move/from16 v0, v36

    invoke-virtual {v7, v3, v0}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->a()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->f()LL0/U;

    move-result-object v29

    invoke-virtual {v7, v3, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->b()J

    move-result-wide v10

    sget-object v0, LW0/t;->a:LW0/t$a;

    invoke-virtual {v0}, LW0/t$a;->b()I

    move-result v23

    const/16 v32, 0xc30

    const v33, 0x1d7fa

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v25, 0x2

    move-object/from16 v30, v3

    invoke-static/range {v8 .. v33}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, LT/o;->P()V

    :cond_1b
    move-object/from16 v2, v34

    :goto_f
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_1c

    new-instance v9, LAf/t;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LAf/t;-><init>(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_1c
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LAf/u;->c(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final e(Landroidx/compose/ui/e;LAf/r;LT/l;II)V
    .locals 22

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "model"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x2a2c6c8e

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v5, v1, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v12, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    invoke-interface {v12, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_7

    invoke-interface {v12}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v12}, LT/l;->C()V

    move-object v13, v5

    goto/16 :goto_a

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v4

    goto :goto_5

    :cond_8
    move-object v13, v5

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wifi.component.WifiGeneralInfoHeader (WifiGeneralInfoHeader.kt:47)"

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v3, v12, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v12, v4}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v12}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v12, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v12}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v12}, LT/l;->u()V

    invoke-interface {v12}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v12, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v12}, LT/l;->I()V

    :goto_6
    invoke-static {v12}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v3, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v9, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_c

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    const v5, -0x407848d8

    invoke-interface {v12, v5}, LT/l;->U(I)V

    invoke-virtual/range {p1 .. p1}, LAf/r;->a()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_7
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v21, v4, 0x1

    if-gez v4, :cond_e

    invoke-static {}, LZg/v;->v()V

    :cond_e
    check-cast v5, LAf/q;

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/high16 v16, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    move-object v14, v3

    invoke-static/range {v14 .. v19}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v5}, LAf/q;->a()Ls9/b;

    move-result-object v7

    invoke-virtual {v5}, LAf/q;->b()Ls9/d;

    move-result-object v8

    invoke-virtual {v5}, LAf/q;->c()Ls9/d;

    move-result-object v9

    if-nez v4, :cond_f

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->f()Lf0/c;

    move-result-object v4

    :goto_8
    move-object v5, v4

    goto :goto_9

    :cond_f
    invoke-virtual/range {p1 .. p1}, LAf/r;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ne v4, v5, :cond_10

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->h()Lf0/c;

    move-result-object v4

    goto :goto_8

    :cond_10
    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->e()Lf0/c;

    move-result-object v4

    goto :goto_8

    :goto_9
    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v12

    invoke-static/range {v4 .. v11}, LAf/u;->c(Landroidx/compose/ui/e;Lf0/c;Ls9/b;Ls9/d;Ls9/d;LT/l;II)V

    move/from16 v4, v21

    goto :goto_7

    :cond_11
    invoke-interface {v12}, LT/l;->J()V

    invoke-interface {v12}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    :goto_a
    invoke-interface {v12}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_13

    new-instance v4, LAf/s;

    invoke-direct {v4, v13, v0, v1, v2}, LAf/s;-><init>(Landroidx/compose/ui/e;LAf/r;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;LAf/r;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LAf/u;->e(Landroidx/compose/ui/e;LAf/r;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
