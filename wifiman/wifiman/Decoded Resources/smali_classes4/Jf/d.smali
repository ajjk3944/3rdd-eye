.class public abstract LJf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JLT/z1;Lm0/U0;ZLs0/p;JLo0/f;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LJf/d;->d(JLT/z1;Lm0/U0;ZLs0/p;JLo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;FZIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LJf/d;->e(Landroidx/compose/ui/e;FZIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;FZLT/l;II)V
    .locals 26

    move/from16 v2, p1

    move/from16 v4, p4

    const v0, -0x66c56587

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_5

    invoke-interface {v1, v2}, LT/l;->g(F)Z

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
    and-int/lit8 v7, p5, 0x4

    const/16 v13, 0x100

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move/from16 v8, p2

    :goto_4
    move v14, v6

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_6

    move/from16 v8, p2

    invoke-interface {v1, v8}, LT/l;->c(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    move v9, v13

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v6, v9

    goto :goto_4

    :goto_6
    and-int/lit16 v6, v14, 0x93

    const/16 v9, 0x92

    if-ne v6, v9, :cond_a

    invoke-interface {v1}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v5

    goto/16 :goto_c

    :cond_a
    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_8

    :cond_b
    move-object v3, v5

    :goto_8
    const/4 v15, 0x0

    if-eqz v7, :cond_c

    move/from16 v25, v15

    goto :goto_9

    :cond_c
    move/from16 v25, v8

    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.wmw.common.WmwBatteryStatus (WmwBatteryStatus.kt:63)"

    invoke-static {v0, v14, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    const/4 v0, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v2, v0, v5}, Lz1/a;->a(FFF)F

    move-result v5

    const/16 v0, 0x1f4

    invoke-static {}, Lr/G;->c()Lr/E;

    move-result-object v6

    invoke-static {v0, v15, v6}, Lr/j;->k(IILr/E;)Lr/r0;

    move-result-object v6

    const/16 v11, 0xc00

    const/16 v12, 0x14

    const/4 v7, 0x0

    const-string v8, "WmwBatteryStatus"

    const/4 v9, 0x0

    move-object v10, v1

    invoke-static/range {v5 .. v12}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    sget-object v5, LJf/a;->a:LJf/a;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    const/16 v7, 0x30

    invoke-virtual {v5, v6, v1, v7}, LJf/a;->a(FLT/l;I)J

    move-result-wide v5

    sget-object v7, Ls0/d;->k:Ls0/d$b;

    sget v8, Lm8/a;->y:I

    const/4 v9, 0x6

    invoke-static {v7, v8, v1, v9}, LH0/g;->b(Ls0/d$b;ILT/l;I)Ls0/d;

    move-result-object v7

    invoke-static {v7, v1, v15}, Ls0/q;->g(Ls0/d;LT/l;I)Ls0/p;

    move-result-object v7

    const v8, 0x1f51555

    invoke-interface {v1, v8}, LT/l;->U(I)V

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    float-to-double v8, v8

    const-wide v10, 0x3fd999999999999aL    # 0.4

    cmpl-double v8, v8, v10

    if-lez v8, :cond_e

    sget-object v8, Lma/a$d;->a:Lma/a$d;

    invoke-virtual {v8}, Lma/a$d;->a()Lma/a$a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v8

    invoke-virtual {v8}, Lr9/a$b;->b()J

    move-result-wide v8

    goto :goto_a

    :cond_e
    sget-object v8, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v8, v1, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->a()Lma/a$a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v8

    invoke-virtual {v8}, Lr9/a$a;->f()J

    move-result-wide v8

    :goto_a
    invoke-interface {v1}, LT/l;->J()V

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v10

    const/16 v11, 0x1c

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v11

    const v12, 0x1f542db

    invoke-interface {v1, v12}, LT/l;->U(I)V

    invoke-interface {v1, v5, v6}, LT/l;->j(J)Z

    move-result v12

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    or-int v12, v12, v16

    invoke-interface {v1, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    or-int v12, v12, v16

    and-int/lit16 v14, v14, 0x380

    if-ne v14, v13, :cond_f

    const/4 v13, 0x1

    goto :goto_b

    :cond_f
    move v13, v15

    :goto_b
    or-int/2addr v12, v13

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1, v8, v9}, LT/l;->j(J)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_10

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v13, v12, :cond_11

    :cond_10
    new-instance v13, LJf/b;

    move-object/from16 v16, v13

    move-wide/from16 v17, v5

    move-object/from16 v19, v0

    move-object/from16 v20, v10

    move/from16 v21, v25

    move-object/from16 v22, v7

    move-wide/from16 v23, v8

    invoke-direct/range {v16 .. v24}, LJf/b;-><init>(JLT/z1;Lm0/U0;ZLs0/p;J)V

    invoke-interface {v1, v13}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    invoke-static {v11, v13, v1, v15}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    move/from16 v8, v25

    :goto_c
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v7, LJf/c;

    move-object v0, v7

    move-object v1, v3

    move/from16 v2, p1

    move v3, v8

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LJf/c;-><init>(Landroidx/compose/ui/e;FZII)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method private static final d(JLT/z1;Lm0/U0;ZLs0/p;JLo0/f;)LYg/J;
    .locals 37

    move-wide/from16 v3, p0

    move-object/from16 v2, p8

    const-string v0, "$this$Canvas"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p8 .. p8}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->h(J)F

    move-result v0

    const/16 v1, 0x1c

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-interface {v2, v1}, LY0/d;->d1(F)F

    move-result v1

    div-float/2addr v0, v1

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-interface {v2, v1}, LY0/d;->d1(F)F

    move-result v1

    mul-float/2addr v1, v0

    const/16 v5, 0xb

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-interface {v2, v5}, LY0/d;->d1(F)F

    move-result v5

    mul-float v15, v5, v0

    const/4 v5, 0x3

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-interface {v2, v5}, LY0/d;->d1(F)F

    move-result v5

    mul-float/2addr v5, v0

    const/16 v6, 0x10

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float v19, v6, v0

    const/4 v6, 0x7

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float v14, v6, v0

    const/4 v6, 0x1

    int-to-float v13, v6

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float v11, v6, v0

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float v12, v6, v0

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float v9, v6, v0

    const/4 v10, 0x2

    int-to-float v7, v10

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float v8, v6, v0

    invoke-interface/range {p8 .. p8}, Lo0/f;->D1()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ll0/g;->m(J)F

    move-result v6

    const/high16 v20, 0x40000000    # 2.0f

    div-float v21, v1, v20

    sub-float v6, v6, v21

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v10

    invoke-interface {v2, v10}, LY0/d;->d1(F)F

    move-result v10

    mul-float/2addr v10, v0

    sub-float/2addr v6, v10

    invoke-interface/range {p8 .. p8}, Lo0/f;->D1()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ll0/g;->n(J)F

    move-result v10

    div-float v17, v15, v20

    sub-float v10, v10, v17

    invoke-static {v6, v10}, Ll0/h;->a(FF)J

    move-result-wide v17

    invoke-static {v1, v15}, Ll0/n;->a(FF)J

    move-result-wide v22

    new-instance v1, Lo0/k;

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float v25, v6, v0

    const/16 v30, 0x1e

    const/16 v31, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v24, v1

    invoke-direct/range {v24 .. v31}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v5}, Ll0/b;->a(FF)J

    move-result-wide v24

    new-instance v6, Lm0/j1;

    const/4 v10, 0x0

    invoke-direct {v6, v3, v4, v10}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v26, 0xd0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v5, p8

    move/from16 v31, v7

    move/from16 v32, v8

    move-wide/from16 v7, v17

    move/from16 v33, v9

    move-wide/from16 v9, v22

    move/from16 v34, v11

    move/from16 v35, v12

    move-wide/from16 v11, v24

    move/from16 v22, v13

    move/from16 v13, v28

    move/from16 v36, v14

    move-object v14, v1

    move v1, v15

    move-object/from16 v15, v29

    move/from16 v16, v30

    move/from16 v17, v26

    move-object/from16 v18, v27

    invoke-static/range {v5 .. v18}, Lo0/f;->d0(Lo0/f;Lm0/l0;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    invoke-interface/range {p8 .. p8}, Lo0/f;->D1()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->m(J)F

    move-result v5

    div-float v6, v19, v20

    sub-float/2addr v5, v6

    invoke-static/range {v22 .. v22}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float/2addr v6, v0

    sub-float/2addr v5, v6

    invoke-interface/range {p8 .. p8}, Lo0/f;->D1()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/g;->n(J)F

    move-result v0

    move/from16 v6, v36

    div-float v14, v6, v20

    sub-float/2addr v0, v14

    invoke-static {v5, v0}, Ll0/h;->a(FF)J

    move-result-wide v7

    invoke-interface/range {p2 .. p2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    mul-float v0, v0, v19

    invoke-static {v0, v6}, Ll0/n;->a(FF)J

    move-result-wide v9

    move/from16 v6, v34

    invoke-static {v6, v6}, Ll0/b;->a(FF)J

    move-result-wide v11

    new-instance v6, Lm0/j1;

    const/4 v0, 0x0

    invoke-direct {v6, v3, v4, v0}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0xf0

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v5, p8

    invoke-static/range {v5 .. v18}, Lo0/f;->d0(Lo0/f;Lm0/l0;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    invoke-interface/range {p3 .. p3}, Lm0/U0;->a()V

    invoke-interface/range {p8 .. p8}, Lo0/f;->D1()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->m(J)F

    move-result v5

    add-float v5, v5, v21

    invoke-interface/range {p8 .. p8}, Lo0/f;->D1()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/g;->n(J)F

    move-result v6

    move/from16 v7, v33

    div-float v9, v7, v20

    sub-float/2addr v6, v9

    invoke-static {v5, v6}, Ll0/h;->a(FF)J

    move-result-wide v5

    move/from16 v11, v35

    invoke-static {v11, v7}, Ll0/n;->a(FF)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object v12

    move/from16 v6, v32

    invoke-static {v6, v6}, Ll0/b;->a(FF)J

    move-result-wide v15

    invoke-static {v6, v6}, Ll0/b;->a(FF)J

    move-result-wide v17

    const/16 v21, 0x12

    const/16 v22, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v19, 0x0

    invoke-static/range {v12 .. v22}, Ll0/l;->c(Ll0/i;JJJJILjava/lang/Object;)Ll0/k;

    move-result-object v5

    move-object/from16 v6, p3

    const/4 v7, 0x2

    invoke-static {v6, v5, v0, v7, v0}, Lm0/U0;->t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v12, v1

    move-object/from16 v1, p8

    move-object/from16 v2, p3

    move-object v6, v0

    invoke-static/range {v1 .. v10}, Lo0/f;->C1(Lo0/f;Lm0/U0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    if-eqz p4, :cond_0

    invoke-interface/range {p8 .. p8}, Lo0/f;->D1()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    div-float v15, v12, v31

    sub-float/2addr v0, v15

    sub-float v1, v0, v11

    invoke-interface/range {p8 .. p8}, Lo0/f;->D1()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v0

    sub-float v2, v0, v15

    invoke-interface/range {p8 .. p8}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->e()Lo0/h;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Lo0/h;->c(FF)V

    :try_start_0
    invoke-static {v12, v12}, Ll0/n;->a(FF)J

    move-result-wide v3

    sget-object v5, Lm0/w0;->b:Lm0/w0$a;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-wide/from16 v6, p6

    invoke-static/range {v5 .. v10}, Lm0/w0$a;->b(Lm0/w0$a;JIILjava/lang/Object;)Lm0/w0;

    move-result-object v0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 p0, p5

    move-object/from16 p1, p8

    move-wide/from16 p2, v3

    move/from16 p4, v7

    move-object/from16 p5, v0

    move/from16 p6, v5

    move-object/from16 p7, v6

    invoke-static/range {p0 .. p7}, Lr0/d;->k(Lr0/d;Lo0/f;JFLm0/w0;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface/range {p8 .. p8}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->e()Lo0/h;

    move-result-object v0

    neg-float v1, v1

    neg-float v2, v2

    invoke-interface {v0, v1, v2}, Lo0/h;->c(FF)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface/range {p8 .. p8}, Lo0/f;->k1()Lo0/d;

    move-result-object v3

    invoke-interface {v3}, Lo0/d;->e()Lo0/h;

    move-result-object v3

    neg-float v1, v1

    neg-float v2, v2

    invoke-interface {v3, v1, v2}, Lo0/h;->c(FF)V

    throw v0

    :cond_0
    :goto_0
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/e;FZIILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LJf/d;->c(Landroidx/compose/ui/e;FZLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
