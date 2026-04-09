.class public abstract Lu9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, Lu9/k;->m(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p13}, Lu9/k;->k(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, Lu9/k;->n(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lu9/k;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p12}, Lu9/k;->i(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, Lu9/k;->h(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;LT/l;I)V
    .locals 48

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v11, p11

    const v0, 0x1d400275

    move-object/from16 v2, p10

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v6, v11, 0x6

    if-nez v6, :cond_1

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v11

    goto :goto_1

    :cond_1
    move v6, v11

    :goto_1
    and-int/lit8 v8, v11, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-interface {v2, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    goto :goto_3

    :cond_3
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v11, 0x180

    if-nez v9, :cond_5

    invoke-interface {v2, v3}, LT/l;->i(I)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_4

    :cond_4
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    :cond_5
    and-int/lit16 v9, v11, 0xc00

    if-nez v9, :cond_7

    invoke-interface {v2, v4}, LT/l;->c(Z)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_5

    :cond_6
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v6, v9

    :cond_7
    and-int/lit16 v9, v11, 0x6000

    if-nez v9, :cond_9

    invoke-interface {v2, v5}, LT/l;->c(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_6

    :cond_8
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v6, v9

    :cond_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v11

    move-wide/from16 v13, p5

    if-nez v9, :cond_b

    invoke-interface {v2, v13, v14}, LT/l;->j(J)Z

    move-result v9

    if-eqz v9, :cond_a

    const/high16 v9, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v9, 0x10000

    :goto_7
    or-int/2addr v6, v9

    :cond_b
    const/high16 v9, 0x180000

    and-int/2addr v9, v11

    if-nez v9, :cond_d

    move/from16 v9, p7

    invoke-interface {v2, v9}, LT/l;->i(I)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v12, 0x80000

    :goto_8
    or-int/2addr v6, v12

    goto :goto_9

    :cond_d
    move/from16 v9, p7

    :goto_9
    const/high16 v12, 0xc00000

    and-int/2addr v12, v11

    if-nez v12, :cond_f

    move/from16 v12, p8

    invoke-interface {v2, v12}, LT/l;->c(Z)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v16, 0x400000

    :goto_a
    or-int v6, v6, v16

    goto :goto_b

    :cond_f
    move/from16 v12, p8

    :goto_b
    const/high16 v16, 0x6000000

    and-int v16, v11, v16

    move-object/from16 v10, p9

    if-nez v16, :cond_11

    invoke-interface {v2, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v16, 0x2000000

    :goto_c
    or-int v6, v6, v16

    :cond_11
    const v16, 0x2492493

    and-int v15, v6, v16

    const v7, 0x2492492

    if-ne v15, v7, :cond_13

    invoke-interface {v2}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_12

    goto :goto_d

    :cond_12
    invoke-interface {v2}, LT/l;->C()V

    goto/16 :goto_17

    :cond_13
    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v7

    const/4 v15, -0x1

    if-eqz v7, :cond_14

    const-string/jumbo v7, "com.ui.core.ui.component.authcode.AuthLetterField (UiAuthCodeField.kt:287)"

    invoke-static {v0, v6, v15, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    invoke-static/range {p8 .. p8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    shr-int/lit8 v7, v6, 0x15

    and-int/lit8 v7, v7, 0xe

    or-int/lit8 v7, v7, 0x30

    const-string/jumbo v15, "errorTransition"

    const/4 v8, 0x0

    invoke-static {v0, v15, v2, v7, v8}, Lr/p0;->g(Ljava/lang/Object;Ljava/lang/String;LT/l;II)Lr/o0;

    move-result-object v0

    sget-object v7, Lu9/k$a;->a:Lu9/k$a;

    invoke-virtual {v0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    const v8, 0x2fd66b36

    invoke-interface {v2, v8}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v18

    const-string/jumbo v9, "com.ui.core.ui.component.authcode.AuthLetterField.<anonymous> (UiAuthCodeField.kt:290)"

    if-eqz v18, :cond_15

    const/4 v10, -0x1

    const/4 v11, 0x0

    invoke-static {v8, v11, v10, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_15
    if-eqz v15, :cond_16

    invoke-virtual/range {p9 .. p9}, Lu9/a;->a()J

    move-result-wide v10

    goto :goto_e

    :cond_16
    invoke-virtual/range {p9 .. p9}, Lu9/a;->b()J

    move-result-wide v10

    :goto_e
    invoke-static {}, LT/o;->H()Z

    move-result v15

    if-eqz v15, :cond_17

    invoke-static {}, LT/o;->P()V

    :cond_17
    invoke-interface {v2}, LT/l;->J()V

    invoke-static {v10, v11}, Lm0/v0;->p(J)Ln0/c;

    move-result-object v10

    invoke-interface {v2, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v15

    if-nez v11, :cond_18

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v15, v11, :cond_19

    :cond_18
    sget-object v11, Lm0/v0;->b:Lm0/v0$a;

    invoke-static {v11}, Lq/h;->a(Lm0/v0$a;)Lmh/l;

    move-result-object v11

    invoke-interface {v11, v10}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v15, v10

    check-cast v15, Lr/s0;

    invoke-interface {v2, v15}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    move-object v10, v15

    check-cast v10, Lr/s0;

    invoke-virtual {v0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    invoke-interface {v2, v8}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v15

    if-eqz v15, :cond_1a

    const/4 v12, 0x0

    const/4 v15, -0x1

    invoke-static {v8, v12, v15, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1a
    if-eqz v11, :cond_1b

    invoke-virtual/range {p9 .. p9}, Lu9/a;->a()J

    move-result-wide v11

    goto :goto_f

    :cond_1b
    invoke-virtual/range {p9 .. p9}, Lu9/a;->b()J

    move-result-wide v11

    :goto_f
    invoke-static {}, LT/o;->H()Z

    move-result v15

    if-eqz v15, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    invoke-interface {v2}, LT/l;->J()V

    invoke-static {v11, v12}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v11

    invoke-virtual {v0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-interface {v2, v8}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v15

    if-eqz v15, :cond_1d

    const/4 v13, 0x0

    const/4 v15, -0x1

    invoke-static {v8, v13, v15, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1d
    if-eqz v12, :cond_1e

    invoke-virtual/range {p9 .. p9}, Lu9/a;->a()J

    move-result-wide v8

    goto :goto_10

    :cond_1e
    invoke-virtual/range {p9 .. p9}, Lu9/a;->b()J

    move-result-wide v8

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v12

    if-eqz v12, :cond_1f

    invoke-static {}, LT/o;->P()V

    :cond_1f
    invoke-interface {v2}, LT/l;->J()V

    invoke-static {v8, v9}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v14

    invoke-virtual {v0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v7, v8, v2, v12}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v15, v7

    check-cast v15, Lr/H;

    const/high16 v19, 0x30000

    const-string/jumbo v7, "errorColor"

    move-object v12, v0

    move-object v13, v11

    const/16 v0, 0x4000

    move-object/from16 v16, v10

    move-object/from16 v17, v7

    move-object/from16 v18, v2

    invoke-static/range {v12 .. v19}, Lr/p0;->d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;

    move-result-object v7

    sget-object v8, Lpa/a;->a:Lpa/a;

    invoke-virtual {v8}, Lpa/a;->a()LQ0/k;

    move-result-object v24

    invoke-virtual/range {p9 .. p9}, Lu9/a;->c()J

    move-result-wide v17

    const/16 v8, 0x18

    invoke-static {v8}, LY0/w;->g(I)J

    move-result-wide v19

    const/16 v8, 0x38

    invoke-static {v8}, LY0/w;->g(I)J

    move-result-wide v38

    sget-object v9, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v9}, LQ0/A$a;->b()LQ0/A;

    move-result-object v21

    new-instance v9, LL0/U;

    move-object/from16 v16, v9

    const v46, 0xfd7f58

    const/16 v47, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    move-wide/from16 v26, p5

    move/from16 v36, p7

    invoke-direct/range {v16 .. v47}, LL0/U;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shr-int/lit8 v10, v6, 0x6

    and-int/lit8 v10, v10, 0xe

    invoke-static {v3, v9, v2, v10}, Lu9/k;->t(ILL0/U;LT/l;I)F

    move-result v10

    const/16 v11, 0xa

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v12

    const/4 v13, 0x2

    int-to-float v13, v13

    mul-float/2addr v13, v12

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v12

    add-float/2addr v10, v12

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v10, v8}, Lsh/m;->c(FF)F

    move-result v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v8

    const/4 v10, 0x1

    int-to-float v12, v10

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v12

    invoke-interface {v7}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm0/v0;

    invoke-virtual {v7}, Lm0/v0;->u()J

    move-result-wide v13

    const v7, 0x22660c4e

    invoke-interface {v2, v7}, LT/l;->U(I)V

    and-int/lit16 v7, v6, 0x1c00

    const/16 v15, 0x800

    if-ne v7, v15, :cond_20

    move v7, v10

    goto :goto_11

    :cond_20
    const/4 v7, 0x0

    :goto_11
    const v15, 0xe000

    and-int/2addr v15, v6

    if-ne v15, v0, :cond_21

    goto :goto_12

    :cond_21
    const/4 v10, 0x0

    :goto_12
    or-int v0, v7, v10

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_22

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v7, v0, :cond_27

    :cond_22
    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    if-eqz v4, :cond_23

    move v10, v0

    const/4 v7, 0x0

    goto :goto_13

    :cond_23
    const/4 v7, 0x0

    int-to-float v10, v7

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    :goto_13
    if-eqz v4, :cond_24

    move v15, v0

    goto :goto_14

    :cond_24
    int-to-float v15, v7

    invoke-static {v15}, LY0/h;->j(F)F

    move-result v15

    :goto_14
    if-eqz v5, :cond_25

    move/from16 p10, v0

    goto :goto_15

    :cond_25
    move/from16 p10, v0

    int-to-float v0, v7

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    :goto_15
    if-eqz v5, :cond_26

    move/from16 v7, p10

    goto :goto_16

    :cond_26
    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    :goto_16
    invoke-static {v10, v0, v7, v15}, LE/h;->e(FFFF)LE/g;

    move-result-object v7

    invoke-interface {v2, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_27
    check-cast v7, LE/g;

    invoke-interface {v2}, LT/l;->J()V

    invoke-static {v8, v12, v13, v14, v7}, Ls/e;->f(Landroidx/compose/ui/e;FJLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v0, v7, v8}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v14

    const v0, 0x226666a2

    invoke-interface {v2, v0}, LT/l;->U(I)V

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v0, v7, :cond_28

    new-instance v0, Lu9/i;

    invoke-direct {v0}, Lu9/i;-><init>()V

    invoke-interface {v2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_28
    move-object v13, v0

    check-cast v13, Lmh/l;

    invoke-interface {v2}, LT/l;->J()V

    shr-int/lit8 v0, v6, 0x3

    and-int/lit8 v0, v0, 0xe

    const v6, 0x6000c30

    or-int v29, v0, v6

    const/16 v30, 0x0

    const v31, 0xfed0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v12, p1

    move-object/from16 v17, v9

    move-object/from16 v28, v2

    invoke-static/range {v12 .. v31}, LF/f;->d(Ljava/lang/String;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-static {}, LT/o;->P()V

    :cond_29
    :goto_17
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_2a

    new-instance v13, Lu9/j;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lu9/j;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;I)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_2a
    return-void
.end method

.method private static final h(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;ILT/l;I)LYg/J;
    .locals 13

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p11

    invoke-static/range {v1 .. v12}, Lu9/k;->g(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;LT/l;I)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final j(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
    .locals 28

    move-object/from16 v14, p1

    move/from16 v15, p11

    move/from16 v13, p12

    const-string/jumbo v0, "params"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x24c487c9

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v15, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v15, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v15

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v15

    :goto_1
    and-int/lit8 v5, v13, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v15, 0x30

    if-nez v5, :cond_5

    invoke-interface {v12, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v13, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v15, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-interface {v12, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    :goto_5
    and-int/lit8 v7, v13, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v8, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v8, v15, 0xc00

    if-nez v8, :cond_9

    move-object/from16 v8, p3

    invoke-interface {v12, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x800

    goto :goto_6

    :cond_b
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v4, v9

    :goto_7
    and-int/lit8 v9, v13, 0x10

    if-eqz v9, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v10, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v10, v15, 0x6000

    if-nez v10, :cond_c

    move-object/from16 v10, p4

    invoke-interface {v12, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/16 v11, 0x4000

    goto :goto_8

    :cond_e
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v4, v11

    :goto_9
    and-int/lit8 v11, v13, 0x20

    const/high16 v16, 0x30000

    if-eqz v11, :cond_f

    or-int v4, v4, v16

    move/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v16, v15, v16

    move/from16 v0, p5

    if-nez v16, :cond_11

    invoke-interface {v12, v0}, LT/l;->i(I)Z

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
    and-int/lit8 v17, v13, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_12

    or-int v4, v4, v18

    move-object/from16 v2, p6

    goto :goto_d

    :cond_12
    and-int v18, v15, v18

    move-object/from16 v2, p6

    if-nez v18, :cond_14

    invoke-interface {v12, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v4, v4, v18

    :cond_14
    :goto_d
    and-int/lit16 v0, v13, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_15

    or-int v4, v4, v18

    move-object/from16 v2, p7

    goto :goto_f

    :cond_15
    and-int v18, v15, v18

    move-object/from16 v2, p7

    if-nez v18, :cond_17

    invoke-interface {v12, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v18, 0x400000

    :goto_e
    or-int v4, v4, v18

    :cond_17
    :goto_f
    and-int/lit16 v2, v13, 0x100

    const/high16 v18, 0x6000000

    if-eqz v2, :cond_18

    or-int v4, v4, v18

    move-object/from16 v3, p8

    goto :goto_11

    :cond_18
    and-int v18, v15, v18

    move-object/from16 v3, p8

    if-nez v18, :cond_1a

    invoke-interface {v12, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v4, v4, v18

    :cond_1a
    :goto_11
    and-int/lit16 v3, v13, 0x200

    const/high16 v18, 0x30000000

    if-eqz v3, :cond_1b

    or-int v4, v4, v18

    move-object/from16 v6, p9

    goto :goto_13

    :cond_1b
    and-int v18, v15, v18

    move-object/from16 v6, p9

    if-nez v18, :cond_1d

    invoke-interface {v12, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1c

    const/high16 v18, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v18, 0x10000000

    :goto_12
    or-int v4, v4, v18

    :cond_1d
    :goto_13
    const v18, 0x12492493

    and-int v6, v4, v18

    const v8, 0x12492492

    if-ne v6, v8, :cond_1f

    invoke-interface {v12}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_1e

    goto :goto_14

    :cond_1e
    invoke-interface {v12}, LT/l;->C()V

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object v5, v10

    move-object v2, v12

    move-object/from16 v10, p9

    goto/16 :goto_1f

    :cond_1f
    :goto_14
    if-eqz v1, :cond_20

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v8, v1

    goto :goto_15

    :cond_20
    move-object/from16 v8, p0

    :goto_15
    const/4 v1, 0x0

    if-eqz v5, :cond_22

    const v5, -0x55fd1bf0

    invoke-interface {v12, v5}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_21

    new-instance v5, LR0/Q;

    const/16 v23, 0x6

    const/16 v24, 0x0

    const-string v19, ""

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v18, v5

    invoke-direct/range {v18 .. v24}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x2

    invoke-static {v5, v1, v6, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v5

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    check-cast v5, LT/q0;

    invoke-interface {v12}, LT/l;->J()V

    move-object/from16 v18, v5

    goto :goto_16

    :cond_22
    move-object/from16 v18, p2

    :goto_16
    if-eqz v7, :cond_23

    move-object/from16 v19, v1

    goto :goto_17

    :cond_23
    move-object/from16 v19, p3

    :goto_17
    if-eqz v9, :cond_25

    const v5, -0x55fd0d02

    invoke-interface {v12, v5}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_24

    new-instance v5, Landroidx/compose/ui/focus/o;

    invoke-direct {v5}, Landroidx/compose/ui/focus/o;-><init>()V

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_24
    check-cast v5, Landroidx/compose/ui/focus/o;

    invoke-interface {v12}, LT/l;->J()V

    move-object/from16 v20, v5

    goto :goto_18

    :cond_25
    move-object/from16 v20, v10

    :goto_18
    if-eqz v11, :cond_26

    sget-object v5, LR0/y;->b:LR0/y$a;

    invoke-virtual {v5}, LR0/y$a;->h()I

    move-result v5

    move/from16 v21, v5

    goto :goto_19

    :cond_26
    move/from16 v21, p5

    :goto_19
    if-eqz v17, :cond_27

    invoke-static {}, LCi/a;->d()LCi/h;

    move-result-object v5

    move-object/from16 v17, v5

    goto :goto_1a

    :cond_27
    move-object/from16 v17, p6

    :goto_1a
    if-eqz v0, :cond_29

    const v0, -0x55fcf52d

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v0, v5, :cond_28

    new-instance v0, Lu9/e;

    invoke-direct {v0}, Lu9/e;-><init>()V

    invoke-interface {v12, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_28
    check-cast v0, Lmh/l;

    invoke-interface {v12}, LT/l;->J()V

    move-object/from16 v22, v0

    goto :goto_1b

    :cond_29
    move-object/from16 v22, p7

    :goto_1b
    if-eqz v2, :cond_2b

    const v0, -0x55fcedfd

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_2a

    new-instance v0, Lu9/f;

    invoke-direct {v0}, Lu9/f;-><init>()V

    invoke-interface {v12, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2a
    check-cast v0, Lmh/l;

    invoke-interface {v12}, LT/l;->J()V

    move-object/from16 v23, v0

    goto :goto_1c

    :cond_2b
    move-object/from16 v23, p8

    :goto_1c
    if-eqz v3, :cond_2d

    const v0, -0x55fce8bd

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_2c

    new-instance v0, Lu9/g;

    invoke-direct {v0}, Lu9/g;-><init>()V

    invoke-interface {v12, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2c
    check-cast v0, Lmh/l;

    invoke-interface {v12}, LT/l;->J()V

    move-object/from16 v24, v0

    goto :goto_1d

    :cond_2d
    move-object/from16 v24, p9

    :goto_1d
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2e

    const/4 v0, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.authcode.UiAuthCodeField (UiAuthCodeField.kt:108)"

    const v3, 0x24c487c9

    invoke-static {v3, v4, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2e
    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, v12, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    const v2, -0x55fc8033

    invoke-interface {v12, v2}, LT/l;->U(I)V

    invoke-interface {v12, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2f

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_31

    :cond_2f
    new-instance v3, Lu9/a;

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v4

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v6

    instance-of v2, v0, Lma/a$d;

    if-eqz v2, :cond_30

    check-cast v0, Lma/a$d;

    invoke-virtual {v0}, Lma/a$d;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->h()J

    move-result-wide v9

    goto :goto_1e

    :cond_30
    instance-of v2, v0, Lma/a$b;

    if-eqz v2, :cond_3e

    check-cast v0, Lma/a$b;

    invoke-virtual {v0}, Lma/a$b;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->f()J

    move-result-wide v9

    :goto_1e
    const/4 v0, 0x0

    move-object/from16 p2, v3

    move-wide/from16 p3, v4

    move-wide/from16 p5, v6

    move-wide/from16 p7, v9

    move-object/from16 p9, v0

    invoke-direct/range {p2 .. p9}, Lu9/a;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v12, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_31
    move-object v5, v3

    check-cast v5, Lu9/a;

    invoke-interface {v12}, LT/l;->J()V

    const v0, -0x3bced2e6

    invoke-interface {v12, v0}, LT/l;->U(I)V

    const v0, 0xca3d8b5

    invoke-interface {v12, v0}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v0

    invoke-interface {v12, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/d;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_32

    new-instance v2, Lb1/z;

    invoke-direct {v2, v0}, Lb1/z;-><init>(LY0/d;)V

    invoke-interface {v12, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_32
    check-cast v2, Lb1/z;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v0, v4, :cond_33

    new-instance v0, Lb1/l;

    invoke-direct {v0}, Lb1/l;-><init>()V

    invoke-interface {v12, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_33
    move-object v4, v0

    check-cast v4, Lb1/l;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_34

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v6, 0x2

    invoke-static {v0, v1, v6, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {v12, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_34
    check-cast v0, LT/q0;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_35

    new-instance v6, Lb1/o;

    invoke-direct {v6, v4}, Lb1/o;-><init>(Lb1/l;)V

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_35
    check-cast v6, Lb1/o;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_36

    sget-object v7, LYg/J;->a:LYg/J;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v9

    invoke-static {v7, v9}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v7

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_36
    check-cast v7, LT/q0;

    invoke-interface {v12, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    const/16 v10, 0x101

    invoke-interface {v12, v10}, LT/l;->i(I)Z

    move-result v11

    const/4 v1, 0x1

    or-int/2addr v9, v11

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_37

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v11, v9, :cond_38

    :cond_37
    new-instance v11, Lu9/k$g;

    move-object/from16 p2, v11

    move-object/from16 p3, v7

    move-object/from16 p4, v2

    move-object/from16 p5, v6

    move/from16 p6, v10

    move-object/from16 p7, v0

    invoke-direct/range {p2 .. p7}, Lu9/k$g;-><init>(LT/q0;Lb1/z;Lb1/o;ILT/q0;)V

    invoke-interface {v12, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_38
    move-object/from16 v16, v11

    check-cast v16, LC0/C;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_39

    new-instance v9, Lu9/k$h;

    invoke-direct {v9, v0, v6}, Lu9/k$h;-><init>(LT/q0;Lb1/o;)V

    invoke-interface {v12, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_39
    move-object v6, v9

    check-cast v6, Lmh/a;

    invoke-interface {v12, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_3a

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v9, v0, :cond_3b

    :cond_3a
    new-instance v9, Lu9/k$i;

    invoke-direct {v9, v2}, Lu9/k$i;-><init>(Lb1/z;)V

    invoke-interface {v12, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3b
    check-cast v9, Lmh/l;

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static {v8, v2, v9, v1, v0}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v25

    new-instance v11, Lu9/k$j;

    move-object v0, v11

    move v10, v1

    move-object v1, v7

    move-object v2, v4

    move-object v3, v6

    move-object/from16 v4, v19

    move-object/from16 v6, p1

    move-object/from16 v7, v18

    move-object/from16 v26, v8

    move-object/from16 v8, v17

    move-object/from16 v9, v22

    move v14, v10

    move-object/from16 v10, v23

    move-object v15, v11

    move-object/from16 v11, v20

    move-object/from16 v27, v12

    move/from16 v12, v21

    move-object/from16 v13, v24

    invoke-direct/range {v0 .. v13}, Lu9/k$j;-><init>(LT/q0;Lb1/l;Lmh/a;Ljava/lang/String;Lu9/a;Lu9/c;LT/q0;LCi/e;Lmh/l;Lmh/l;Landroidx/compose/ui/focus/o;ILmh/l;)V

    const/16 v0, 0x36

    const v1, 0x478ef317

    move-object/from16 v2, v27

    invoke-static {v1, v14, v15, v2, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v3, 0x0

    move-object/from16 p2, v25

    move-object/from16 p3, v0

    move-object/from16 p4, v16

    move-object/from16 p5, v2

    move/from16 p6, v1

    move/from16 p7, v3

    invoke-static/range {p2 .. p7}, LC0/w;->a(Landroidx/compose/ui/e;Lmh/p;LC0/C;LT/l;II)V

    invoke-interface {v2}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3c

    invoke-static {}, LT/o;->P()V

    :cond_3c
    move-object/from16 v7, v17

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move/from16 v6, v21

    move-object/from16 v8, v22

    move-object/from16 v9, v23

    move-object/from16 v10, v24

    move-object/from16 v1, v26

    :goto_1f
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_3d

    new-instance v14, Lu9/h;

    move-object v0, v14

    move-object/from16 v2, p1

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lu9/h;-><init>(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_3d
    return-void

    :cond_3e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final k(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;IILT/l;I)LYg/J;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p12

    move/from16 v13, p11

    invoke-static/range {v1 .. v13}, Lu9/k;->j(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final l(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final m(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final o(Ljava/lang/String;)LR0/Q;
    .locals 8

    new-instance v7, LR0/Q;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, LL0/T;->b(II)J

    move-result-wide v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method private static final p(LT/q0;Lmh/l;Lu9/c;Lmh/l;LR0/Q;)V
    .locals 7

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p4}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2}, Lu9/c;->a()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/text/t;->x1(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p4

    move-object v1, p1

    invoke-static/range {v0 .. v6}, LR0/Q;->e(LR0/Q;Ljava/lang/String;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object p2

    invoke-interface {p0, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final synthetic q(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;LT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p11}, Lu9/k;->g(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;LT/l;I)V

    return-void
.end method

.method public static final synthetic r(Ljava/lang/String;)LR0/Q;
    .locals 0

    invoke-static {p0}, Lu9/k;->o(Ljava/lang/String;)LR0/Q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(LT/q0;Lmh/l;Lu9/c;Lmh/l;LR0/Q;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu9/k;->p(LT/q0;Lmh/l;Lu9/c;Lmh/l;LR0/Q;)V

    return-void
.end method

.method private static final t(ILL0/U;LT/l;I)F
    .locals 19

    move/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const v3, 0xc8378fc

    invoke-interface {v1, v3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.component.authcode.measureTokenTextWidth (UiAuthCodeField.kt:337)"

    invoke-static {v3, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v3, v1, v3, v4}, LL0/P;->a(ILT/l;II)LL0/O;

    move-result-object v5

    const v6, -0x4a68120d

    invoke-interface {v1, v6}, LT/l;->U(I)V

    and-int/lit8 v6, v2, 0xe

    xor-int/lit8 v6, v6, 0x6

    const/4 v7, 0x4

    if-le v6, v7, :cond_1

    invoke-interface {v1, v0}, LT/l;->i(I)Z

    move-result v6

    if-nez v6, :cond_2

    :cond_1
    and-int/lit8 v6, v2, 0x6

    if-ne v6, v7, :cond_3

    :cond_2
    move v6, v4

    goto :goto_0

    :cond_3
    move v6, v3

    :goto_0
    and-int/lit8 v7, v2, 0x70

    xor-int/lit8 v7, v7, 0x30

    const/16 v8, 0x20

    if-le v7, v8, :cond_4

    move-object/from16 v7, p1

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_1

    :cond_4
    move-object/from16 v7, p1

    :goto_1
    and-int/lit8 v2, v2, 0x30

    if-ne v2, v8, :cond_6

    :cond_5
    move v3, v4

    :cond_6
    or-int v2, v6, v3

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_8

    :cond_7
    const-string v2, "0"

    invoke-static {v2, v0}, Lkotlin/text/t;->H(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v6

    const/16 v17, 0x3fc

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v5 .. v18}, LL0/O;->b(LL0/O;Ljava/lang/String;LL0/U;IZIJLY0/t;LY0/d;LQ0/k$b;ZILjava/lang/Object;)LL0/M;

    move-result-object v0

    invoke-virtual {v0}, LL0/M;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {v1, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    invoke-interface {v2, v0}, LY0/d;->x(I)F

    move-result v0

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return v0
.end method
