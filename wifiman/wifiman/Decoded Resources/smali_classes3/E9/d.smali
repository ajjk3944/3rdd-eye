.class public abstract LE9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:Lr/x;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LE9/d;->a:F

    const/16 v0, 0xf0

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LE9/d;->b:F

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LE9/d;->c:F

    new-instance v0, Lr/x;

    const v1, 0x3f4ccccd    # 0.8f

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3e4ccccd    # 0.2f

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lr/x;-><init>(FFFF)V

    sput-object v0, LE9/d;->d:Lr/x;

    return-void
.end method

.method public static synthetic a(LE9/e;FLo0/f;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LE9/d;->d(LE9/e;FLo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;FLE9/e;FFIZIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, LE9/d;->e(Landroidx/compose/ui/e;FLE9/e;FFIZIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;FLE9/e;FFIZLT/l;II)V
    .locals 26

    move/from16 v8, p8

    const v0, -0x7f7b48a2

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v8, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v8

    :goto_1
    and-int/lit8 v5, p9, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_3

    move/from16 v5, p1

    invoke-interface {v1, v5}, LT/l;->g(F)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :goto_3
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_8

    and-int/lit8 v6, p9, 0x4

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v6, p2

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    goto :goto_5

    :cond_8
    move-object/from16 v6, p2

    :goto_5
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_9

    move/from16 v10, p3

    invoke-interface {v1, v10}, LT/l;->g(F)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit8 v11, p9, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_c

    move/from16 v12, p4

    invoke-interface {v1, v12}, LT/l;->g(F)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v4, v13

    :goto_9
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_10

    or-int/2addr v4, v14

    :cond_f
    move/from16 v14, p5

    goto :goto_b

    :cond_10
    and-int/2addr v14, v8

    if-nez v14, :cond_f

    move/from16 v14, p5

    invoke-interface {v1, v14}, LT/l;->i(I)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v4, v15

    :goto_b
    and-int/lit8 v15, p9, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_12

    or-int v4, v4, v16

    move/from16 v7, p6

    goto :goto_d

    :cond_12
    and-int v16, v8, v16

    move/from16 v7, p6

    if-nez v16, :cond_14

    invoke-interface {v1, v7}, LT/l;->c(Z)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v4, v4, v16

    :cond_14
    :goto_d
    const v16, 0x92493

    and-int v0, v4, v16

    const v3, 0x92492

    if-ne v0, v3, :cond_16

    invoke-interface {v1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p0

    move-object v3, v6

    move v4, v10

    move v6, v14

    goto/16 :goto_14

    :cond_16
    :goto_e
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v0, v8, 0x1

    const/4 v3, 0x0

    const/16 v18, 0x1

    if-eqz v0, :cond_1a

    invoke-interface {v1}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_f

    :cond_17
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v0, p9, 0x4

    if-eqz v0, :cond_18

    and-int/lit16 v4, v4, -0x381

    :cond_18
    move-object/from16 v0, p0

    :cond_19
    move v15, v4

    move/from16 v25, v7

    move v2, v10

    move v4, v12

    move v7, v14

    goto :goto_11

    :cond_1a
    :goto_f
    if-eqz v2, :cond_1b

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_10

    :cond_1b
    move-object/from16 v0, p0

    :goto_10
    and-int/lit8 v2, p9, 0x4

    if-eqz v2, :cond_1c

    invoke-static {v1, v3}, LE9/d;->h(LT/l;I)LE9/e;

    move-result-object v2

    and-int/lit16 v4, v4, -0x381

    move-object v6, v2

    :cond_1c
    if-eqz v9, :cond_1d

    sget v2, LE9/d;->c:F

    move v10, v2

    :cond_1d
    if-eqz v11, :cond_1e

    sget v2, LE9/d;->a:F

    move v12, v2

    :cond_1e
    if-eqz v13, :cond_1f

    const/16 v2, 0x5dc

    move v14, v2

    :cond_1f
    if-eqz v15, :cond_19

    move v15, v4

    move v2, v10

    move v4, v12

    move v7, v14

    move/from16 v25, v18

    :goto_11
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_20

    const/4 v9, -0x1

    const-string/jumbo v10, "com.ui.core.ui.component.progress.UiLinearProgressIndicator (UiLinearProgressIndicator.kt:93)"

    const v11, -0x7f7b48a2

    invoke-static {v11, v15, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_20
    const v9, 0x2b7f1c65

    invoke-interface {v1, v9}, LT/l;->U(I)V

    if-eqz v25, :cond_21

    invoke-static {}, Lr/G;->e()Lr/E;

    move-result-object v9

    invoke-static {v7, v3, v9}, Lr/j;->k(IILr/E;)Lr/r0;

    move-result-object v10

    shr-int/lit8 v9, v15, 0x3

    and-int/lit8 v16, v9, 0xe

    const/16 v17, 0x1c

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v9, p1

    move-object v14, v1

    move v3, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v9 .. v16}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v9

    invoke-interface {v9}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    goto :goto_12

    :cond_21
    move v3, v15

    move v9, v5

    :goto_12
    invoke-interface {v1}, LT/l;->J()V

    const/16 v23, 0x6

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v0

    move/from16 v20, v9

    invoke-static/range {v19 .. v24}, Ls/Y;->c(Landroidx/compose/ui/e;FLsh/e;IILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v2}, LE/h;->d(F)LE/g;

    move-result-object v11

    invoke-static {v10, v11}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v10

    const v11, 0x2b7f5985

    invoke-interface {v1, v11}, LT/l;->U(I)V

    and-int/lit16 v11, v3, 0x380

    xor-int/lit16 v11, v11, 0x180

    const/16 v12, 0x100

    if-le v11, v12, :cond_22

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_24

    :cond_22
    and-int/lit16 v3, v3, 0x180

    if-ne v3, v12, :cond_23

    goto :goto_13

    :cond_23
    const/16 v18, 0x0

    :cond_24
    :goto_13
    invoke-interface {v1, v9}, LT/l;->g(F)Z

    move-result v3

    or-int v3, v18, v3

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_25

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v11, v3, :cond_26

    :cond_25
    new-instance v11, LE9/b;

    invoke-direct {v11, v6, v9}, LE9/b;-><init>(LE9/e;F)V

    invoke-interface {v1, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_26
    check-cast v11, Lmh/l;

    invoke-interface {v1}, LT/l;->J()V

    const/4 v3, 0x0

    invoke-static {v10, v11, v1, v3}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_27

    invoke-static {}, LT/o;->P()V

    :cond_27
    move v12, v4

    move-object v3, v6

    move v6, v7

    move/from16 v7, v25

    move v4, v2

    move-object v2, v0

    :goto_14
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_28

    new-instance v11, LE9/c;

    move-object v0, v11

    move-object v1, v2

    move/from16 v2, p1

    move v5, v12

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LE9/c;-><init>(Landroidx/compose/ui/e;FLE9/e;FFIZII)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_28
    return-void
.end method

.method private static final d(LE9/e;FLo0/f;)LYg/J;
    .locals 4

    const-string v0, "$this$Canvas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LE9/e;->a()J

    move-result-wide v0

    invoke-interface {p2}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v2

    invoke-static {p2, v0, v1, v2}, LE9/d;->g(Lo0/f;JF)V

    invoke-virtual {p0}, LE9/e;->b()Lm0/l0;

    move-result-object p0

    invoke-interface {p2}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, p0, v0}, LE9/d;->f(Lo0/f;FFLm0/l0;F)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;FLE9/e;FFIZIILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v9

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p9

    move/from16 v10, p8

    invoke-static/range {v1 .. v10}, LE9/d;->c(Landroidx/compose/ui/e;FLE9/e;FFIZLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final f(Lo0/f;FFLm0/l0;F)V
    .locals 19

    invoke-interface/range {p0 .. p0}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result v0

    invoke-interface/range {p0 .. p0}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->g(J)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-interface/range {p0 .. p0}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v2

    sget-object v3, LY0/t;->Ltr:LY0/t;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v2, :cond_1

    move/from16 v4, p1

    goto :goto_1

    :cond_1
    sub-float v4, v3, p2

    :goto_1
    mul-float/2addr v4, v0

    if-eqz v2, :cond_2

    move/from16 v2, p2

    goto :goto_2

    :cond_2
    sub-float v2, v3, p1

    :goto_2
    mul-float/2addr v2, v0

    invoke-static {v4, v1}, Ll0/h;->a(FF)J

    move-result-wide v7

    invoke-static {v2, v1}, Ll0/h;->a(FF)J

    move-result-wide v9

    sget-object v0, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v0}, Lm0/k1$a;->b()I

    move-result v12

    const/16 v17, 0x1e0

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v5, p0

    move-object/from16 v6, p3

    move/from16 v11, p4

    invoke-static/range {v5 .. v18}, Lo0/f;->i0(Lo0/f;Lm0/l0;JJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V

    return-void
.end method

.method private static final g(Lo0/f;JF)V
    .locals 7

    sget-object v0, Lm0/l0;->b:Lm0/l0$a;

    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    filled-new-array {v1, p1}, [Lm0/v0;

    move-result-object p1

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lm0/l0$a;->b(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object p1

    const/4 p2, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p0, p2, v0, p1, p3}, LE9/d;->f(Lo0/f;FFLm0/l0;F)V

    return-void
.end method

.method private static final h(LT/l;I)LE9/e;
    .locals 9

    const v0, -0x1bebc930

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.progress.rememberUiProgressIndicatorColors (UiLinearProgressIndicator.kt:56)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p1, p0, v0}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    const v0, -0x17a3dc6a

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-interface {p0, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_3

    :cond_1
    sget-object v0, Lma/a$d;->a:Lma/a$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v0, LE9/e;

    sget-object v2, Lm0/l0;->b:Lm0/l0$a;

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->a()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v4

    filled-new-array {v3, v4}, [Lm0/v0;

    move-result-object v3

    invoke-static {v3}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lm0/l0$a;->b(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v2

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$b;->f()J

    move-result-wide v3

    invoke-direct {v0, v2, v3, v4, v1}, LE9/e;-><init>(Lm0/l0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_2
    sget-object v0, Lma/a$b;->a:Lma/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, LE9/e;

    sget-object v2, Lm0/l0;->b:Lm0/l0$a;

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->a()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v4

    filled-new-array {v3, v4}, [Lm0/v0;

    move-result-object v3

    invoke-static {v3}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lm0/l0$a;->b(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v2

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$b;->f()J

    move-result-wide v3

    invoke-direct {v0, v2, v3, v4, v1}, LE9/e;-><init>(Lm0/l0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :goto_1
    invoke-interface {p0, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, LE9/e;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p0}, LT/l;->J()V

    return-object v1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
