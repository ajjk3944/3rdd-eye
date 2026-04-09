.class public abstract Lv9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JLT/z1;Lm0/U0;Lo0/f;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lv9/d;->d(JLT/z1;Lm0/U0;Lo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;FIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lv9/d;->e(Landroidx/compose/ui/e;FIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;FLT/l;II)V
    .locals 10

    const v0, 0x72faf1a7

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_5

    invoke-interface {p2, p1}, LT/l;->g(F)Z

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
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_7

    invoke-interface {p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :cond_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.battery.UiBatteryStatus (UiBatteryStatus.kt:57)"

    invoke-static {v0, v2, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lz1/a;->a(FFF)F

    move-result v1

    const/16 v0, 0x1f4

    invoke-static {}, Lr/G;->c()Lr/E;

    move-result-object v2

    const/4 v9, 0x0

    invoke-static {v0, v9, v2}, Lr/j;->k(IILr/E;)Lr/r0;

    move-result-object v2

    const/4 v7, 0x0

    const/16 v8, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    sget-object v1, Lv9/a;->a:Lv9/a;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/16 v3, 0x30

    invoke-virtual {v1, v2, p2, v3}, Lv9/a;->a(FLT/l;I)J

    move-result-wide v1

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v3

    const/16 v4, 0x18

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {p0, v4}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    const v5, 0x508e9313

    invoke-interface {p2, v5}, LT/l;->U(I)V

    invoke-interface {p2, v1, v2}, LT/l;->j(J)Z

    move-result v5

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {p2, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_a

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_b

    :cond_a
    new-instance v6, Lv9/b;

    invoke-direct {v6, v1, v2, v0, v3}, Lv9/b;-><init>(JLT/z1;Lm0/U0;)V

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {v4, v6, p2, v9}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, Lv9/c;

    invoke-direct {v0, p0, p1, p3, p4}, Lv9/c;-><init>(Landroidx/compose/ui/e;FII)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final d(JLT/z1;Lm0/U0;Lo0/f;)LYg/J;
    .locals 37

    move-wide/from16 v2, p0

    move-object/from16 v0, p4

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/m;->h(J)F

    move-result v1

    const/16 v4, 0x18

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-interface {v0, v4}, LY0/d;->d1(F)F

    move-result v4

    div-float/2addr v1, v4

    const/16 v4, 0x14

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-interface {v0, v4}, LY0/d;->d1(F)F

    move-result v4

    mul-float/2addr v4, v1

    const/16 v5, 0xb

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-interface {v0, v5}, LY0/d;->d1(F)F

    move-result v5

    mul-float/2addr v5, v1

    const/4 v6, 0x3

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v0, v6}, LY0/d;->d1(F)F

    move-result v6

    mul-float/2addr v6, v1

    const/16 v7, 0x10

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-interface {v0, v7}, LY0/d;->d1(F)F

    move-result v7

    mul-float v18, v7, v1

    const/4 v7, 0x7

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-interface {v0, v7}, LY0/d;->d1(F)F

    move-result v7

    mul-float v15, v7, v1

    const/4 v7, 0x1

    int-to-float v14, v7

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v7

    invoke-interface {v0, v7}, LY0/d;->d1(F)F

    move-result v7

    mul-float v13, v7, v1

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v7

    invoke-interface {v0, v7}, LY0/d;->d1(F)F

    move-result v7

    mul-float v12, v7, v1

    const/4 v7, 0x4

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-interface {v0, v7}, LY0/d;->d1(F)F

    move-result v7

    mul-float v10, v7, v1

    const/4 v11, 0x2

    int-to-float v7, v11

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-interface {v0, v7}, LY0/d;->d1(F)F

    move-result v7

    mul-float v8, v7, v1

    invoke-interface/range {p4 .. p4}, Lo0/f;->D1()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ll0/g;->m(J)F

    move-result v7

    const/high16 v19, 0x40000000    # 2.0f

    div-float v20, v4, v19

    sub-float v7, v7, v20

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v9

    invoke-interface {v0, v9}, LY0/d;->d1(F)F

    move-result v9

    mul-float/2addr v9, v1

    sub-float/2addr v7, v9

    invoke-interface/range {p4 .. p4}, Lo0/f;->D1()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ll0/g;->n(J)F

    move-result v9

    div-float v16, v5, v19

    sub-float v9, v9, v16

    invoke-static {v7, v9}, Ll0/h;->a(FF)J

    move-result-wide v16

    invoke-static {v4, v5}, Ll0/n;->a(FF)J

    move-result-wide v21

    new-instance v31, Lo0/k;

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v4

    invoke-interface {v0, v4}, LY0/d;->d1(F)F

    move-result v4

    mul-float v24, v4, v1

    const/16 v29, 0x1e

    const/16 v30, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v23, v31

    invoke-direct/range {v23 .. v30}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6, v6}, Ll0/b;->a(FF)J

    move-result-wide v23

    new-instance v5, Lm0/j1;

    const/4 v9, 0x0

    invoke-direct {v5, v2, v3, v9}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v25, 0xd0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v4, p4

    move-wide/from16 v6, v16

    move/from16 v32, v8

    move-wide/from16 v8, v21

    move/from16 v33, v10

    move-wide/from16 v10, v23

    move/from16 v34, v12

    move/from16 v12, v27

    move/from16 v35, v13

    move-object/from16 v13, v31

    move/from16 v21, v14

    move-object/from16 v14, v28

    move/from16 v36, v15

    move/from16 v15, v29

    move/from16 v16, v25

    move-object/from16 v17, v26

    invoke-static/range {v4 .. v17}, Lo0/f;->d0(Lo0/f;Lm0/l0;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    invoke-interface/range {p4 .. p4}, Lo0/f;->D1()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/g;->m(J)F

    move-result v4

    div-float v5, v18, v19

    sub-float/2addr v4, v5

    invoke-static/range {v21 .. v21}, LY0/h;->j(F)F

    move-result v5

    invoke-interface {v0, v5}, LY0/d;->d1(F)F

    move-result v5

    mul-float/2addr v5, v1

    sub-float/2addr v4, v5

    invoke-interface/range {p4 .. p4}, Lo0/f;->D1()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->n(J)F

    move-result v1

    move/from16 v7, v36

    div-float v15, v7, v19

    sub-float/2addr v1, v15

    invoke-static {v4, v1}, Ll0/h;->a(FF)J

    move-result-wide v8

    invoke-interface/range {p2 .. p2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    mul-float v1, v1, v18

    invoke-static {v1, v7}, Ll0/n;->a(FF)J

    move-result-wide v10

    move/from16 v7, v35

    invoke-static {v7, v7}, Ll0/b;->a(FF)J

    move-result-wide v12

    new-instance v5, Lm0/j1;

    const/4 v1, 0x0

    invoke-direct {v5, v2, v3, v1}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0xf0

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    move-object/from16 v4, p4

    move-wide v6, v8

    move-wide v8, v10

    move-wide v10, v12

    move v12, v14

    move-object v13, v15

    move-object/from16 v14, v18

    move/from16 v15, v21

    invoke-static/range {v4 .. v17}, Lo0/f;->d0(Lo0/f;Lm0/l0;JJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    invoke-interface/range {p3 .. p3}, Lm0/U0;->a()V

    invoke-interface/range {p4 .. p4}, Lo0/f;->D1()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/g;->m(J)F

    move-result v4

    add-float v4, v4, v20

    invoke-interface/range {p4 .. p4}, Lo0/f;->D1()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->n(J)F

    move-result v5

    move/from16 v7, v33

    div-float v10, v7, v19

    sub-float/2addr v5, v10

    invoke-static {v4, v5}, Ll0/h;->a(FF)J

    move-result-wide v4

    move/from16 v6, v34

    invoke-static {v6, v7}, Ll0/n;->a(FF)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object v8

    move/from16 v7, v32

    invoke-static {v7, v7}, Ll0/b;->a(FF)J

    move-result-wide v11

    invoke-static {v7, v7}, Ll0/b;->a(FF)J

    move-result-wide v13

    const/16 v17, 0x12

    const-wide/16 v9, 0x0

    const-wide/16 v15, 0x0

    invoke-static/range {v8 .. v18}, Ll0/l;->c(Ll0/i;JJJJILjava/lang/Object;)Ll0/k;

    move-result-object v4

    move-object/from16 v5, p3

    const/4 v6, 0x2

    invoke-static {v5, v4, v1, v6, v1}, Lm0/U0;->t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object/from16 v1, p3

    move-object v5, v6

    move-object v6, v7

    move v7, v10

    invoke-static/range {v0 .. v9}, Lo0/f;->C1(Lo0/f;Lm0/U0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/e;FIILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lv9/d;->c(Landroidx/compose/ui/e;FLT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
