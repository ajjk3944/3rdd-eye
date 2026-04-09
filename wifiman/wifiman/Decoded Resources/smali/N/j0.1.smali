.class public abstract LN/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    sput v1, LN/j0;->a:F

    const/16 v1, 0x30

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    sput v2, LN/j0;->b:F

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    sput v2, LN/j0;->c:F

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/j0;->d:F

    const/16 v0, 0x70

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/j0;->e:F

    const/16 v0, 0x118

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/j0;->f:F

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/j0;->g:F

    return-void
.end method

.method public static final a(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p6

    const v0, 0x19ef3fd5

    move-object/from16 v4, p5

    invoke-interface {v4, v0}, LT/l;->r(I)LT/l;

    move-result-object v4

    and-int/lit8 v7, p7, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v7, v6, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_3

    and-int/lit8 v7, v6, 0x8

    if-nez v7, :cond_1

    invoke-interface {v4, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_0

    :cond_1
    invoke-interface {v4, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    :goto_0
    if-eqz v7, :cond_2

    const/4 v7, 0x4

    goto :goto_1

    :cond_2
    const/4 v7, 0x2

    :goto_1
    or-int/2addr v7, v6

    goto :goto_2

    :cond_3
    move v7, v6

    :goto_2
    and-int/lit8 v8, p7, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v7, v7, 0x30

    goto :goto_4

    :cond_4
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_6

    invoke-interface {v4, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    :goto_4
    and-int/lit8 v8, p7, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v7, v7, 0x180

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_9

    invoke-interface {v4, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v7, v8

    :cond_9
    :goto_6
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_b

    or-int/lit16 v7, v7, 0xc00

    :cond_a
    move-object/from16 v9, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_a

    move-object/from16 v9, p3

    invoke-interface {v4, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x800

    goto :goto_7

    :cond_c
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v7, v10

    :goto_8
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_e

    or-int/lit16 v7, v7, 0x6000

    :cond_d
    :goto_9
    move v14, v7

    goto :goto_b

    :cond_e
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_d

    invoke-interface {v4, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    const/16 v10, 0x4000

    goto :goto_a

    :cond_f
    const/16 v10, 0x2000

    :goto_a
    or-int/2addr v7, v10

    goto :goto_9

    :goto_b
    and-int/lit16 v7, v14, 0x2493

    const/16 v10, 0x2492

    if-ne v7, v10, :cond_11

    invoke-interface {v4}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_10

    goto :goto_c

    :cond_10
    invoke-interface {v4}, LT/l;->C()V

    goto/16 :goto_13

    :cond_11
    :goto_c
    if-eqz v8, :cond_12

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v7

    goto :goto_d

    :cond_12
    move-object v13, v9

    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v7

    const/4 v12, -0x1

    if-eqz v7, :cond_13

    const-string v7, "androidx.compose.material.DropdownMenuContent (Menu.kt:64)"

    invoke-static {v0, v14, v12, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_13
    sget v0, Lr/W;->d:I

    or-int/lit8 v0, v0, 0x30

    and-int/lit8 v7, v14, 0xe

    or-int/2addr v0, v7

    const-string v7, "DropDownMenu"

    const/4 v11, 0x0

    invoke-static {v1, v7, v4, v0, v11}, Lr/p0;->f(Lr/q0;Ljava/lang/String;LT/l;II)Lr/o0;

    move-result-object v0

    sget-object v7, LN/j0$e;->a:LN/j0$e;

    sget-object v16, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static/range {v16 .. v16}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v17

    invoke-virtual {v0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const v9, 0x628098f1

    invoke-interface {v4, v9}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v10

    const-string v15, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:85)"

    if-eqz v10, :cond_14

    invoke-static {v9, v11, v12, v15}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    const v10, 0x3f4ccccd    # 0.8f

    const/high16 v18, 0x3f800000    # 1.0f

    if-eqz v8, :cond_15

    move/from16 v8, v18

    goto :goto_e

    :cond_15
    move v8, v10

    :goto_e
    invoke-static {}, LT/o;->H()Z

    move-result v19

    if-eqz v19, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    invoke-interface {v4}, LT/l;->J()V

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/Boolean;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v19

    invoke-interface {v4, v9}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v20

    if-eqz v20, :cond_17

    invoke-static {v9, v11, v12, v15}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_17
    if-eqz v19, :cond_18

    move/from16 v10, v18

    :cond_18
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    invoke-interface {v4}, LT/l;->J()V

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v7, v10, v4, v15}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lr/H;

    const-string v15, "FloatAnimation"

    const/16 v19, 0x0

    move-object v7, v0

    move-object/from16 v11, v17

    move-object v12, v15

    move-object v15, v13

    move-object v13, v4

    move/from16 v17, v14

    move/from16 v14, v19

    invoke-static/range {v7 .. v14}, Lr/p0;->d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;

    move-result-object v14

    sget-object v7, LN/j0$d;->a:LN/j0$d;

    invoke-static/range {v16 .. v16}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v11

    invoke-virtual {v0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const v9, 0x17212f05

    invoke-interface {v4, v9}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v10

    const-string v12, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:105)"

    if-eqz v10, :cond_1a

    const/4 v10, -0x1

    const/4 v13, 0x0

    invoke-static {v9, v13, v10, v12}, LT/o;->Q(IIILjava/lang/String;)V

    goto :goto_f

    :cond_1a
    const/4 v10, -0x1

    const/4 v13, 0x0

    :goto_f
    const/16 v16, 0x0

    if-eqz v8, :cond_1b

    move/from16 v8, v18

    goto :goto_10

    :cond_1b
    move/from16 v8, v16

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v20

    if-eqz v20, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    invoke-interface {v4}, LT/l;->J()V

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v20

    invoke-interface {v4, v9}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v21

    if-eqz v21, :cond_1d

    invoke-static {v9, v13, v10, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1d
    if-eqz v20, :cond_1e

    goto :goto_11

    :cond_1e
    move/from16 v18, v16

    :goto_11
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_1f

    invoke-static {}, LT/o;->P()V

    :cond_1f
    invoke-interface {v4}, LT/l;->J()V

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v7, v10, v4, v12}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lr/H;

    const-string v12, "FloatAnimation"

    move-object v7, v0

    move v0, v13

    move-object v13, v4

    move-object v0, v14

    move/from16 v14, v19

    invoke-static/range {v7 .. v14}, Lr/p0;->d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;

    move-result-object v7

    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {v4, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v4, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    and-int/lit8 v10, v17, 0x70

    const/4 v11, 0x1

    const/16 v12, 0x20

    if-ne v10, v12, :cond_20

    move/from16 v21, v11

    goto :goto_12

    :cond_20
    const/16 v21, 0x0

    :goto_12
    or-int v9, v9, v21

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_21

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_22

    :cond_21
    new-instance v10, LN/j0$a;

    invoke-direct {v10, v2, v0, v7}, LN/j0$a;-><init>(LT/q0;LT/z1;LT/z1;)V

    invoke-interface {v4, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_22
    check-cast v10, Lmh/l;

    invoke-static {v8, v10}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v7

    sget v14, LN/j0;->a:F

    new-instance v0, LN/j0$b;

    invoke-direct {v0, v15, v3, v5}, LN/j0$b;-><init>(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lmh/q;)V

    const/16 v8, 0x36

    const v9, 0x356116d2

    invoke-static {v9, v11, v0, v4, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/high16 v17, 0x1b0000

    const/16 v18, 0x1e

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v19, v15

    move-object v15, v0

    move-object/from16 v16, v4

    invoke-static/range {v7 .. v18}, LN/h;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {}, LT/o;->P()V

    :cond_23
    move-object/from16 v9, v19

    :goto_13
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_24

    new-instance v10, LN/j0$c;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v9

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LN/j0$c;-><init>(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;II)V

    invoke-interface {v8, v10}, LT/X0;->a(Lmh/p;)V

    :cond_24
    return-void
.end method

.method private static final b(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final c(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method public static final d(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;LT/l;II)V
    .locals 20

    move-object/from16 v6, p5

    move/from16 v7, p7

    const v0, 0x5319143

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

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    :goto_3
    and-int/lit8 v8, p8, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v7, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p2

    invoke-interface {v1, v9}, LT/l;->c(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v3, v10

    :goto_5
    and-int/lit8 v10, p8, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v3, v12

    :goto_7
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v13, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v7, 0x6000

    if-nez v13, :cond_c

    move-object/from16 v13, p4

    invoke-interface {v1, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v3, v14

    :goto_9
    and-int/lit8 v14, p8, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v3, v15

    goto :goto_b

    :cond_f
    and-int v14, v7, v15

    if-nez v14, :cond_11

    invoke-interface {v1, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v3, v14

    :cond_11
    :goto_b
    const v14, 0x12493

    and-int/2addr v14, v3

    const v15, 0x12492

    if-ne v14, v15, :cond_13

    invoke-interface {v1}, LT/l;->v()Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v1}, LT/l;->C()V

    move-object v4, v5

    move v3, v9

    move-object v8, v11

    move-object v5, v13

    goto/16 :goto_12

    :cond_13
    :goto_c
    if-eqz v4, :cond_14

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_14
    move-object v4, v5

    :goto_d
    const/4 v5, 0x1

    if-eqz v8, :cond_15

    move v15, v5

    goto :goto_e

    :cond_15
    move v15, v9

    :goto_e
    if-eqz v10, :cond_16

    sget-object v8, LN/i0;->a:LN/i0;

    invoke-virtual {v8}, LN/i0;->a()Lz/N;

    move-result-object v8

    move-object v14, v8

    goto :goto_f

    :cond_16
    move-object v14, v11

    :goto_f
    const/4 v10, 0x0

    if-eqz v12, :cond_17

    move-object/from16 v17, v10

    goto :goto_10

    :cond_17
    move-object/from16 v17, v13

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_18

    const/4 v8, -0x1

    const-string v9, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:140)"

    invoke-static {v0, v3, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    const/4 v13, 0x6

    const/4 v0, 0x6

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v11, 0x0

    move-object v3, v10

    move-wide v10, v11

    move-object v12, v1

    move-object/from16 v18, v14

    move v14, v0

    invoke-static/range {v8 .. v14}, LN/A0;->g(ZFJLT/l;II)Ls/G;

    move-result-object v10

    const/16 v0, 0x18

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v4

    move-object/from16 v9, v17

    move v11, v15

    move-object/from16 v14, p0

    move/from16 v19, v15

    move v15, v0

    invoke-static/range {v8 .. v16}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v0, v8, v5, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    sget v10, LN/j0;->e:F

    sget v12, LN/j0;->f:F

    sget v11, LN/j0;->g:F

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/r;->y(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v8, v18

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->f()Lz/c$e;

    move-result-object v9

    const/16 v10, 0x30

    invoke-static {v9, v3, v1, v10}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v1, v9}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_19

    invoke-static {}, LT/j;->c()V

    :cond_19
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_1a

    invoke-interface {v1, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_11

    :cond_1a
    invoke-interface {v1}, LT/l;->I()V

    :goto_11
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v3, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v13, v11, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v13}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_1b

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1c

    :cond_1b
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v13, v9, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1c
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v13, v0, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    sget-object v3, LN/f0;->a:LN/f0;

    const/4 v9, 0x6

    invoke-virtual {v3, v1, v9}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object v3

    invoke-virtual {v3}, LN/c1;->e()LL0/U;

    move-result-object v3

    new-instance v9, LN/j0$f;

    move/from16 v11, v19

    invoke-direct {v9, v11, v6, v0}, LN/j0$f;-><init>(ZLmh/q;Lz/Y;)V

    const/16 v0, 0x36

    const v12, 0x46f56d98

    invoke-static {v12, v5, v9, v1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    invoke-static {v3, v0, v1, v10}, LN/a1;->a(LL0/U;Lmh/p;LT/l;I)V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, LT/o;->P()V

    :cond_1d
    move v3, v11

    move-object/from16 v5, v17

    :goto_12
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1e

    new-instance v10, LN/j0$g;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v4, v8

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LN/j0$g;-><init>(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1e
    return-void
.end method

.method public static final synthetic e(LT/z1;)F
    .locals 0

    invoke-static {p0}, LN/j0;->b(LT/z1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic f(LT/z1;)F
    .locals 0

    invoke-static {p0}, LN/j0;->c(LT/z1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic g()F
    .locals 1

    sget v0, LN/j0;->c:F

    return v0
.end method

.method public static final h(LY0/p;LY0/p;)J
    .locals 5

    invoke-virtual {p1}, LY0/p;->f()I

    move-result v0

    invoke-virtual {p0}, LY0/p;->g()I

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    if-lt v0, v1, :cond_0

    :goto_0
    move v0, v3

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, LY0/p;->g()I

    move-result v0

    invoke-virtual {p0}, LY0/p;->f()I

    move-result v1

    if-gt v0, v1, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LY0/p;->j()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LY0/p;->f()I

    move-result v0

    invoke-virtual {p1}, LY0/p;->f()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, LY0/p;->g()I

    move-result v1

    invoke-virtual {p1}, LY0/p;->g()I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p1}, LY0/p;->f()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p1}, LY0/p;->j()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    :goto_1
    invoke-virtual {p1}, LY0/p;->h()I

    move-result v1

    invoke-virtual {p0}, LY0/p;->d()I

    move-result v4

    if-lt v1, v4, :cond_3

    :goto_2
    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, LY0/p;->d()I

    move-result v1

    invoke-virtual {p0}, LY0/p;->h()I

    move-result v4

    if-gt v1, v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, LY0/p;->e()I

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, LY0/p;->h()I

    move-result v1

    invoke-virtual {p1}, LY0/p;->h()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p0}, LY0/p;->d()I

    move-result p0

    invoke-virtual {p1}, LY0/p;->d()I

    move-result v2

    invoke-static {p0, v2}, Ljava/lang/Math;->min(II)I

    move-result p0

    add-int/2addr v1, p0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1}, LY0/p;->h()I

    move-result p0

    sub-int/2addr v1, p0

    int-to-float p0, v1

    invoke-virtual {p1}, LY0/p;->e()I

    move-result p1

    int-to-float p1, p1

    div-float v2, p0, p1

    :goto_3
    invoke-static {v0, v2}, Lm0/p1;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final i()F
    .locals 1

    sget v0, LN/j0;->d:F

    return v0
.end method

.method public static final j()F
    .locals 1

    sget v0, LN/j0;->b:F

    return v0
.end method
