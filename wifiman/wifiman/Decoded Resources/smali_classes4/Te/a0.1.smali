.class public abstract LTe/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LTe/a0;->e(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LTe/a0;->d()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;Lmh/a;LT/l;II)V
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    const/16 v0, 0x8

    const/16 v5, 0x10

    const/4 v7, 0x4

    const-string v8, "modifier"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "title"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "text"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v8, -0x5c693e21

    move-object/from16 v9, p5

    invoke-interface {v9, v8}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v13, 0x1

    and-int/lit8 v9, p7, 0x1

    const/4 v10, 0x2

    if-eqz v9, :cond_0

    or-int/lit8 v9, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v6, 0x6

    if-nez v9, :cond_2

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v7

    goto :goto_0

    :cond_1
    move v9, v10

    :goto_0
    or-int/2addr v9, v6

    goto :goto_1

    :cond_2
    move v9, v6

    :goto_1
    and-int/lit8 v11, p7, 0x2

    if-eqz v11, :cond_3

    or-int/lit8 v9, v9, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v6, 0x30

    if-nez v11, :cond_5

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x20

    goto :goto_2

    :cond_4
    move v11, v5

    :goto_2
    or-int/2addr v9, v11

    :cond_5
    :goto_3
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v9, v9, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_8

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v9, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v9, v9, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_b

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v9, v7

    :cond_b
    :goto_7
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_d

    or-int/lit16 v9, v9, 0x6000

    :cond_c
    move-object/from16 v11, p4

    :goto_8
    move v14, v9

    goto :goto_a

    :cond_d
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v15, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4000

    goto :goto_9

    :cond_e
    const/16 v12, 0x2000

    :goto_9
    or-int/2addr v9, v12

    goto :goto_8

    :goto_a
    and-int/lit16 v9, v14, 0x2493

    const/16 v12, 0x2492

    if-ne v9, v12, :cond_10

    invoke-interface {v15}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v15}, LT/l;->C()V

    move-object v5, v11

    move-object v0, v15

    goto/16 :goto_f

    :cond_10
    :goto_b
    if-eqz v7, :cond_12

    const v7, 0x1886ac00

    invoke-interface {v15, v7}, LT/l;->U(I)V

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_11

    new-instance v7, LTe/Y;

    invoke-direct {v7}, LTe/Y;-><init>()V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lmh/a;

    invoke-interface {v15}, LT/l;->J()V

    goto :goto_c

    :cond_12
    move-object v7, v11

    :goto_c
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_13

    const/4 v9, -0x1

    const-string v11, "com.ui.wifiman.ui.signal.components.SignalStrengthEmptyCard (SignalStrengthEmptyCard.kt:35)"

    invoke-static {v8, v14, v9, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_13
    const/16 v8, 0x64

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v1, v8, v11, v10, v12}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v10

    invoke-static {v8, v9, v10}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->b()Lz/c$f;

    move-result-object v9

    sget-object v10, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v10}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v10

    const/16 v0, 0x36

    invoke-static {v9, v10, v15, v0}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v9, 0x0

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_14

    invoke-static {}, LT/j;->c()V

    :cond_14
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_15

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_d

    :cond_15
    invoke-interface {v15}, LT/l;->I()V

    :goto_d
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v0, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v11, v9, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v11}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_16

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_17

    :cond_16
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_17
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v11, v8, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v8, 0x0

    const/4 v11, 0x0

    invoke-static {v0, v8, v13, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    shr-int/lit8 v9, v14, 0x3

    and-int/lit8 v9, v9, 0xe

    invoke-static {v2, v15, v9}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v9

    const/4 v12, 0x0

    sget-object v8, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v8, v15, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lpa/c;->a()Lpa/b;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lpa/b;->a()LL0/U;

    move-result-object v30

    invoke-virtual {v8, v15, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lma/a;->f()Lma/a$f;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lma/a$f;->a()J

    move-result-wide v17

    move-wide/from16 v11, v17

    sget-object v35, LW0/j;->b:LW0/j$a;

    invoke-virtual/range {v35 .. v35}, LW0/j$a;->a()I

    move-result v17

    invoke-static/range {v17 .. v17}, LW0/j;->h(I)LW0/j;

    move-result-object v21

    const/16 v33, 0x0

    const v34, 0x1fdf8

    const-wide/16 v17, 0x0

    move/from16 v37, v13

    move/from16 v36, v14

    move-wide/from16 v13, v17

    const/16 v16, 0x0

    move-object/from16 p4, v15

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x30

    move-object/from16 v31, p4

    invoke-static/range {v9 .. v34}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const/16 v9, 0x8

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v9

    move-object/from16 v15, p4

    const/4 v13, 0x0

    invoke-static {v9, v15, v13}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x1

    invoke-static {v0, v11, v14, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    shr-int/lit8 v9, v36, 0x6

    and-int/lit8 v9, v9, 0xe

    invoke-static {v3, v15, v9}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v9

    move/from16 v11, v37

    invoke-virtual {v8, v15, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lpa/c;->b()Lpa/b;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lpa/b;->f()LL0/U;

    move-result-object v30

    invoke-virtual {v8, v15, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->c()J

    move-result-wide v16

    const/4 v8, 0x0

    move-wide/from16 v11, v16

    invoke-virtual/range {v35 .. v35}, LW0/j$a;->a()I

    move-result v16

    invoke-static/range {v16 .. v16}, LW0/j;->h(I)LW0/j;

    move-result-object v21

    const-wide/16 v16, 0x0

    move v8, v13

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const/16 v17, 0x0

    invoke-static/range {v9 .. v34}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const v9, -0x14caf092

    move-object/from16 v15, p4

    invoke-interface {v15, v9}, LT/l;->U(I)V

    if-nez v4, :cond_18

    move-object v0, v15

    goto :goto_e

    :cond_18
    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v15, v8}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v5, 0x190

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v0, v9, v5, v8, v10}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v9, v8, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    shr-int/lit8 v0, v36, 0x9

    and-int/lit8 v5, v0, 0xe

    invoke-static {v4, v15, v5}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v5

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v18, v0, 0x6

    const/16 v19, 0xbc

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v10, v7

    move-object v0, v15

    move-object v15, v5

    move-object/from16 v17, v0

    invoke-static/range {v9 .. v19}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    :goto_e
    invoke-interface {v0}, LT/l;->J()V

    invoke-interface {v0}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    move-object v5, v7

    :goto_f
    invoke-interface {v0}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v9, LTe/Z;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LTe/Z;-><init>(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;Lmh/a;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method

.method private static final d()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;Lmh/a;IILT/l;I)LYg/J;
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

    invoke-static/range {v1 .. v8}, LTe/a0;->c(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;Lmh/a;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
