.class public abstract LN/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/l$h;
    }
.end annotation


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/l;->a:F

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    sput v1, LN/l;->b:F

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, LN/l;->c:F

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    sput v1, LN/l;->d:F

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/l;->e:F

    return-void
.end method

.method public static final a(ZLmh/l;Landroidx/compose/ui/e;ZLy/m;LN/j;LT/l;II)V
    .locals 28

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v7, p7

    const v0, -0x7e483386

    move-object/from16 v3, p6

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, p8, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v7, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v7, 0x6

    if-nez v4, :cond_2

    invoke-interface {v3, v1}, LT/l;->c(Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move v4, v7

    :goto_1
    and-int/lit8 v6, p8, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_5

    invoke-interface {v3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, p8, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v3, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    :goto_5
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_9

    move/from16 v10, p3

    invoke-interface {v3, v10}, LT/l;->c(Z)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit8 v11, p8, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v7, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v3, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v4, v13

    :goto_9
    const/high16 v13, 0x30000

    and-int/2addr v13, v7

    if-nez v13, :cond_11

    and-int/lit8 v13, p8, 0x20

    if-nez v13, :cond_f

    move-object/from16 v13, p5

    invoke-interface {v3, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v13, p5

    :cond_10
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v4, v14

    goto :goto_b

    :cond_11
    move-object/from16 v13, p5

    :goto_b
    const v14, 0x12493

    and-int/2addr v14, v4

    const v15, 0x12492

    if-ne v14, v15, :cond_13

    invoke-interface {v3}, LT/l;->v()Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v3}, LT/l;->C()V

    move v4, v10

    move-object v5, v12

    move-object v6, v13

    goto/16 :goto_15

    :cond_13
    :goto_c
    invoke-interface {v3}, LT/l;->q()V

    and-int/lit8 v14, v7, 0x1

    const/16 v22, 0x0

    const v23, -0x70001

    const/16 v24, 0x1

    if-eqz v14, :cond_17

    invoke-interface {v3}, LT/l;->H()Z

    move-result v14

    if-eqz v14, :cond_14

    goto :goto_d

    :cond_14
    invoke-interface {v3}, LT/l;->C()V

    and-int/lit8 v6, p8, 0x20

    if-eqz v6, :cond_15

    and-int v4, v4, v23

    :cond_15
    move-object v6, v8

    move/from16 v25, v10

    move-object/from16 v26, v12

    :cond_16
    const/16 v5, 0x20

    move v8, v4

    move-object v4, v13

    goto :goto_11

    :cond_17
    :goto_d
    if-eqz v6, :cond_18

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_e

    :cond_18
    move-object v6, v8

    :goto_e
    if-eqz v9, :cond_19

    move/from16 v25, v24

    goto :goto_f

    :cond_19
    move/from16 v25, v10

    :goto_f
    if-eqz v11, :cond_1a

    move-object/from16 v26, v22

    goto :goto_10

    :cond_1a
    move-object/from16 v26, v12

    :goto_10
    and-int/lit8 v8, p8, 0x20

    if-eqz v8, :cond_16

    sget-object v8, LN/k;->a:LN/k;

    const/high16 v20, 0x30000

    const/16 v21, 0x1f

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v5, 0x20

    move-object/from16 v19, v3

    invoke-virtual/range {v8 .. v21}, LN/k;->a(JJJJJLT/l;II)LN/j;

    move-result-object v8

    and-int v4, v4, v23

    move-object/from16 v27, v8

    move v8, v4

    move-object/from16 v4, v27

    :goto_11
    invoke-interface {v3}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_1b

    const/4 v9, -0x1

    const-string v10, "androidx.compose.material.Checkbox (Checkbox.kt:91)"

    invoke-static {v0, v8, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    invoke-static/range {p0 .. p0}, LK0/b;->a(Z)LK0/a;

    move-result-object v0

    if-eqz v2, :cond_20

    const v9, -0x5672b3a8

    invoke-interface {v3, v9}, LT/l;->U(I)V

    and-int/lit8 v9, v8, 0x70

    const/4 v10, 0x0

    if-ne v9, v5, :cond_1c

    move/from16 v5, v24

    goto :goto_12

    :cond_1c
    move v5, v10

    :goto_12
    and-int/lit8 v9, v8, 0xe

    const/4 v11, 0x4

    if-ne v9, v11, :cond_1d

    goto :goto_13

    :cond_1d
    move/from16 v24, v10

    :goto_13
    or-int v5, v5, v24

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_1e

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v9, v5, :cond_1f

    :cond_1e
    new-instance v9, LN/l$a;

    invoke-direct {v9, v2, v1}, LN/l$a;-><init>(Lmh/l;Z)V

    invoke-interface {v3, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1f
    check-cast v9, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    goto :goto_14

    :cond_20
    const v5, -0x5672200c

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->J()V

    move-object/from16 v9, v22

    :goto_14
    const v5, 0x7ff80

    and-int v15, v8, v5

    const/16 v16, 0x0

    move-object v8, v0

    move-object v10, v6

    move/from16 v11, v25

    move-object/from16 v12, v26

    move-object v13, v4

    move-object v14, v3

    invoke-static/range {v8 .. v16}, LN/l;->h(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/j;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {}, LT/o;->P()V

    :cond_21
    move-object v8, v6

    move-object/from16 v5, v26

    move-object v6, v4

    move/from16 v4, v25

    :goto_15
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_22

    new-instance v10, LN/l$b;

    move-object v0, v10

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v8

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LN/l$b;-><init>(ZLmh/l;Landroidx/compose/ui/e;ZLy/m;LN/j;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_22
    return-void
.end method

.method private static final b(ZLK0/a;Landroidx/compose/ui/e;LN/j;LT/l;I)V
    .locals 34

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const v0, -0x7e4bc86f

    move-object/from16 v6, p4

    invoke-interface {v6, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v6, v5, 0x6

    const/4 v15, 0x2

    if-nez v6, :cond_1

    invoke-interface {v14, v1}, LT/l;->c(Z)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    move v6, v15

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    invoke-interface {v14, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-interface {v14, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    invoke-interface {v14, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    move v13, v6

    and-int/lit16 v6, v13, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_9

    invoke-interface {v14}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v14}, LT/l;->C()V

    goto/16 :goto_b

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v6

    const/4 v12, -0x1

    if-eqz v6, :cond_a

    const-string v6, "androidx.compose.material.CheckboxImpl (Checkbox.kt:262)"

    invoke-static {v0, v13, v12, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    shr-int/lit8 v0, v13, 0x3

    and-int/lit8 v11, v0, 0xe

    const/4 v10, 0x0

    invoke-static {v2, v10, v14, v11, v15}, Lr/p0;->g(Ljava/lang/Object;Ljava/lang/String;LT/l;II)Lr/o0;

    move-result-object v16

    sget-object v6, LN/l$f;->a:LN/l$f;

    sget-object v17, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static/range {v17 .. v17}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v18

    invoke-virtual/range {v16 .. v16}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LK0/a;

    const v8, -0x6b309374

    invoke-interface {v14, v8}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    const-string v10, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)"

    move/from16 v19, v13

    const/4 v13, 0x0

    if-eqz v9, :cond_b

    invoke-static {v8, v13, v12, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    sget-object v20, LN/l$h;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v20, v7

    const/4 v9, 0x1

    const/4 v12, 0x3

    const/16 v22, 0x0

    const/high16 v23, 0x3f800000    # 1.0f

    if-eq v7, v9, :cond_c

    if-eq v7, v15, :cond_e

    if-ne v7, v12, :cond_d

    :cond_c
    move/from16 v7, v23

    goto :goto_6

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    move/from16 v7, v22

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v24

    if-eqz v24, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    invoke-interface {v14}, LT/l;->J()V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, LK0/a;

    invoke-interface {v14, v8}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v25

    const/4 v12, -0x1

    if-eqz v25, :cond_10

    invoke-static {v8, v13, v12, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v20, v8

    if-eq v8, v9, :cond_13

    if-eq v8, v15, :cond_12

    const/4 v10, 0x3

    if-ne v8, v10, :cond_11

    :goto_7
    move/from16 v8, v23

    goto :goto_8

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_12
    const/4 v10, 0x3

    move/from16 v8, v22

    goto :goto_8

    :cond_13
    const/4 v10, 0x3

    goto :goto_7

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v21

    if-eqz v21, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    invoke-interface {v14}, LT/l;->J()V

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, Lr/o0;->n()Lr/o0$b;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v6, v9, v14, v10}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lr/H;

    const-string v24, "FloatAnimation"

    const/16 v26, 0x0

    move-object/from16 v6, v16

    const/4 v10, 0x1

    move v15, v10

    const/16 v21, 0x3

    move-object/from16 v10, v18

    move/from16 v18, v11

    move-object/from16 v11, v24

    move v15, v12

    move-object v12, v14

    move v5, v13

    move/from16 v13, v26

    invoke-static/range {v6 .. v13}, Lr/p0;->d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;

    move-result-object v13

    sget-object v6, LN/l$e;->a:LN/l$e;

    invoke-static/range {v17 .. v17}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LK0/a;

    const v8, -0x7d1b526b

    invoke-interface {v14, v8}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    const-string v11, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)"

    if-eqz v9, :cond_15

    invoke-static {v8, v5, v15, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_15
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v20, v7

    const/4 v9, 0x1

    if-eq v7, v9, :cond_17

    const/4 v9, 0x2

    if-eq v7, v9, :cond_17

    const/4 v9, 0x3

    if-ne v7, v9, :cond_16

    move/from16 v7, v23

    goto :goto_9

    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_17
    const/4 v9, 0x3

    move/from16 v7, v22

    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result v12

    if-eqz v12, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    invoke-interface {v14}, LT/l;->J()V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LK0/a;

    invoke-interface {v14, v8}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v17

    if-eqz v17, :cond_19

    invoke-static {v8, v5, v15, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_19
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v20, v8

    const/4 v11, 0x1

    if-eq v8, v11, :cond_1b

    const/4 v11, 0x2

    if-eq v8, v11, :cond_1b

    if-ne v8, v9, :cond_1a

    move/from16 v22, v23

    goto :goto_a

    :cond_1a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1b
    :goto_a
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    invoke-interface {v14}, LT/l;->J()V

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, Lr/o0;->n()Lr/o0$b;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v6, v9, v14, v11}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lr/H;

    const-string v11, "FloatAnimation"

    move-object/from16 v6, v16

    move-object v12, v14

    move-object v15, v13

    move/from16 v13, v26

    invoke-static/range {v6 .. v13}, Lr/p0;->d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;

    move-result-object v6

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_1d

    new-instance v7, LN/i;

    const/16 v24, 0x7

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v7

    invoke-direct/range {v20 .. v25}, LN/i;-><init>(Lm0/U0;Lm0/X0;Lm0/U0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v14, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v28, v7

    check-cast v28, LN/i;

    shr-int/lit8 v7, v19, 0x6

    and-int/lit8 v7, v7, 0x70

    or-int v7, v18, v7

    invoke-interface {v4, v2, v14, v7}, LN/j;->c(LK0/a;LT/l;I)LT/z1;

    move-result-object v7

    and-int/lit8 v9, v19, 0x7e

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v9

    invoke-interface {v4, v1, v2, v14, v0}, LN/j;->a(ZLK0/a;LT/l;I)LT/z1;

    move-result-object v9

    invoke-interface {v4, v1, v2, v14, v0}, LN/j;->b(ZLK0/a;LT/l;I)LT/z1;

    move-result-object v0

    sget-object v10, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v10}, Lf0/c$a;->e()Lf0/c;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static {v3, v10, v5, v11, v12}, Landroidx/compose/foundation/layout/r;->F(Landroidx/compose/ui/e;Lf0/c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    sget v11, LN/l;->c:F

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/r;->o(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-interface {v14, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v14, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v14, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v14, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_1e

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v12, v8, :cond_1f

    :cond_1e
    new-instance v12, LN/l$c;

    move-object/from16 v27, v12

    move-object/from16 v29, v9

    move-object/from16 v30, v0

    move-object/from16 v31, v7

    move-object/from16 v32, v15

    move-object/from16 v33, v6

    invoke-direct/range {v27 .. v33}, LN/l$c;-><init>(LN/i;LT/z1;LT/z1;LT/z1;LT/z1;LT/z1;)V

    invoke-interface {v14, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1f
    check-cast v12, Lmh/l;

    invoke-static {v10, v12, v14, v5}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LT/o;->P()V

    :cond_20
    :goto_b
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_21

    new-instance v7, LN/l$d;

    move-object v0, v7

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LN/l$d;-><init>(ZLK0/a;Landroidx/compose/ui/e;LN/j;I)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_21
    return-void
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

.method private static final d(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final e(LT/z1;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final f(LT/z1;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final g(LT/z1;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final h(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/j;LT/l;II)V
    .locals 24

    move-object/from16 v7, p1

    move/from16 v8, p7

    const v0, 0x79127e9a

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v6

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x6

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0x6

    move-object/from16 v5, p0

    if-nez v1, :cond_2

    invoke-interface {v6, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_2
    move v1, v8

    :goto_1
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v8, 0x30

    if-nez v2, :cond_5

    invoke-interface {v6, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v3, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v8, 0x180

    if-nez v3, :cond_6

    move-object/from16 v3, p2

    invoke-interface {v6, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x100

    goto :goto_4

    :cond_8
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :goto_5
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v8, 0xc00

    if-nez v9, :cond_9

    move/from16 v9, p3

    invoke-interface {v6, v9}, LT/l;->c(Z)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    :goto_7
    and-int/lit8 v10, p8, 0x10

    if-eqz v10, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move-object/from16 v11, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v11, v8, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v6, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4000

    goto :goto_8

    :cond_e
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v1, v12

    :goto_9
    const/high16 v12, 0x30000

    and-int/2addr v12, v8

    if-nez v12, :cond_11

    and-int/lit8 v12, p8, 0x20

    if-nez v12, :cond_f

    move-object/from16 v12, p5

    invoke-interface {v6, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_10

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v12, p5

    :cond_10
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v1, v13

    goto :goto_b

    :cond_11
    move-object/from16 v12, p5

    :goto_b
    const v13, 0x12493

    and-int/2addr v13, v1

    const v14, 0x12492

    if-ne v13, v14, :cond_13

    invoke-interface {v6}, LT/l;->v()Z

    move-result v13

    if-nez v13, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v6}, LT/l;->C()V

    move-object v10, v6

    move v4, v9

    move-object v5, v11

    move-object v6, v12

    goto/16 :goto_15

    :cond_13
    :goto_c
    invoke-interface {v6}, LT/l;->q()V

    and-int/lit8 v13, v8, 0x1

    const v23, -0x70001

    if-eqz v13, :cond_16

    invoke-interface {v6}, LT/l;->H()Z

    move-result v13

    if-eqz v13, :cond_14

    goto :goto_d

    :cond_14
    invoke-interface {v6}, LT/l;->C()V

    and-int/lit8 v2, p8, 0x20

    if-eqz v2, :cond_15

    and-int v1, v1, v23

    :cond_15
    move-object v4, v3

    move/from16 v16, v9

    move-object/from16 v17, v11

    move-object/from16 v18, v12

    move v3, v1

    goto :goto_12

    :cond_16
    :goto_d
    if-eqz v2, :cond_17

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_e

    :cond_17
    move-object v2, v3

    :goto_e
    if-eqz v4, :cond_18

    const/4 v3, 0x1

    goto :goto_f

    :cond_18
    move v3, v9

    :goto_f
    if-eqz v10, :cond_19

    const/4 v4, 0x0

    goto :goto_10

    :cond_19
    move-object v4, v11

    :goto_10
    and-int/lit8 v9, p8, 0x20

    if-eqz v9, :cond_1a

    sget-object v9, LN/k;->a:LN/k;

    const/high16 v21, 0x30000

    const/16 v22, 0x1f

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v20, v6

    invoke-virtual/range {v9 .. v22}, LN/k;->a(JJJJJLT/l;II)LN/j;

    move-result-object v9

    and-int v1, v1, v23

    move/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v9

    :goto_11
    move v3, v1

    move-object v4, v2

    goto :goto_12

    :cond_1a
    move/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v12

    goto :goto_11

    :goto_12
    invoke-interface {v6}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1b

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)"

    invoke-static {v0, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    if-eqz v7, :cond_1c

    const v0, 0x72ac1de9

    invoke-interface {v6, v0}, LT/l;->U(I)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v1, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v1}, LJ0/g$a;->b()I

    move-result v1

    sget v10, LN/l;->a:F

    const/16 v14, 0x36

    const/4 v15, 0x4

    const/4 v9, 0x0

    const-wide/16 v11, 0x0

    move-object v13, v6

    invoke-static/range {v9 .. v15}, LN/A0;->g(ZFJLT/l;II)Ls/G;

    move-result-object v9

    invoke-static {v1}, LJ0/g;->h(I)LJ0/g;

    move-result-object v10

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move v11, v3

    move-object v3, v9

    move-object v9, v4

    move/from16 v4, v16

    move-object v5, v10

    move-object v10, v6

    move-object/from16 v6, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/c;->c(Landroidx/compose/ui/e;LK0/a;Ly/m;Ls/G;ZLJ0/g;Lmh/a;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {v10}, LT/l;->J()V

    goto :goto_13

    :cond_1c
    move v11, v3

    move-object v9, v4

    move-object v10, v6

    const v0, 0x72b27833

    invoke-interface {v10, v0}, LT/l;->U(I)V

    invoke-interface {v10}, LT/l;->J()V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_13
    if-eqz v7, :cond_1d

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1}, LN/c0;->d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    goto :goto_14

    :cond_1d
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_14
    invoke-interface {v9, v1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget v1, LN/l;->b:F

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    shr-int/lit8 v0, v11, 0x9

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v1, v11, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    shr-int/lit8 v1, v11, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int v6, v0, v1

    move/from16 v1, v16

    move-object/from16 v2, p0

    move-object/from16 v4, v18

    move-object v5, v10

    invoke-static/range {v1 .. v6}, LN/l;->b(ZLK0/a;Landroidx/compose/ui/e;LN/j;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    move-object v3, v9

    move/from16 v4, v16

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    :goto_15
    invoke-interface {v10}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1f

    new-instance v10, LN/l$g;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LN/l$g;-><init>(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;LN/j;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void
.end method

.method public static final synthetic i(ZLK0/a;Landroidx/compose/ui/e;LN/j;LT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LN/l;->b(ZLK0/a;Landroidx/compose/ui/e;LN/j;LT/l;I)V

    return-void
.end method

.method public static final synthetic j(LT/z1;)F
    .locals 0

    invoke-static {p0}, LN/l;->c(LT/z1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic k(LT/z1;)F
    .locals 0

    invoke-static {p0}, LN/l;->d(LT/z1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic l(LT/z1;)J
    .locals 2

    invoke-static {p0}, LN/l;->e(LT/z1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic m(LT/z1;)J
    .locals 2

    invoke-static {p0}, LN/l;->f(LT/z1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic n(LT/z1;)J
    .locals 2

    invoke-static {p0}, LN/l;->g(LT/z1;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic o(Lo0/f;JJFF)V
    .locals 0

    invoke-static/range {p0 .. p6}, LN/l;->s(Lo0/f;JJFF)V

    return-void
.end method

.method public static final synthetic p(Lo0/f;JFFFLN/i;)V
    .locals 0

    invoke-static/range {p0 .. p6}, LN/l;->t(Lo0/f;JFFFLN/i;)V

    return-void
.end method

.method public static final synthetic q()F
    .locals 1

    sget v0, LN/l;->e:F

    return v0
.end method

.method public static final synthetic r()F
    .locals 1

    sget v0, LN/l;->d:F

    return v0
.end method

.method private static final s(Lo0/f;JJFF)V
    .locals 51

    move/from16 v0, p5

    move/from16 v9, p6

    const/high16 v1, 0x40000000    # 2.0f

    div-float v10, v9, v1

    new-instance v20, Lo0/k;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v20

    move/from16 v2, p6

    invoke-direct/range {v1 .. v8}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {p0 .. p0}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    invoke-static/range {p1 .. p4}, Lm0/v0;->m(JJ)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    invoke-static {v1, v1}, Ll0/n;->a(FF)J

    move-result-wide v26

    invoke-static {v0, v5, v4, v3}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v28

    sget-object v30, Lo0/j;->a:Lo0/j;

    const/16 v34, 0xe2

    const/16 v35, 0x0

    const-wide/16 v24, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v21, p0

    move-wide/from16 v22, p1

    invoke-static/range {v21 .. v35}, Lo0/f;->b1(Lo0/f;JJJJLo0/g;FLm0/w0;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v9, v9}, Ll0/h;->a(FF)J

    move-result-wide v39

    int-to-float v2, v4

    mul-float/2addr v2, v9

    sub-float v2, v1, v2

    invoke-static {v2, v2}, Ll0/n;->a(FF)J

    move-result-wide v41

    sub-float v2, v0, v9

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v2, v5, v4, v3}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v43

    sget-object v45, Lo0/j;->a:Lo0/j;

    const/16 v49, 0xe0

    const/16 v50, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    move-object/from16 v36, p0

    move-wide/from16 v37, p1

    invoke-static/range {v36 .. v50}, Lo0/f;->b1(Lo0/f;JJJJLo0/g;FLm0/w0;IILjava/lang/Object;)V

    invoke-static {v10, v10}, Ll0/h;->a(FF)J

    move-result-wide v14

    sub-float/2addr v1, v9

    invoke-static {v1, v1}, Ll0/n;->a(FF)J

    move-result-wide v16

    sub-float/2addr v0, v10

    invoke-static {v0, v5, v4, v3}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v18

    const/16 v24, 0xe0

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v11, p0

    move-wide/from16 v12, p3

    invoke-static/range {v11 .. v25}, Lo0/f;->b1(Lo0/f;JJJJLo0/g;FLm0/w0;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final t(Lo0/f;JFFFLN/i;)V
    .locals 11

    move v0, p4

    new-instance v9, Lo0/k;

    sget-object v1, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v1}, Lm0/k1$a;->c()I

    move-result v4

    const/16 v7, 0x1a

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    move/from16 v2, p5

    invoke-direct/range {v1 .. v8}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    const v2, 0x3ecccccd    # 0.4f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v2, v3, p4}, La1/b;->b(FFF)F

    move-result v2

    const v4, 0x3f333333    # 0.7f

    invoke-static {v4, v3, p4}, La1/b;->b(FFF)F

    move-result v4

    invoke-static {v3, v3, p4}, La1/b;->b(FFF)F

    move-result v5

    const v6, 0x3e99999a    # 0.3f

    invoke-static {v6, v3, p4}, La1/b;->b(FFF)F

    move-result v0

    invoke-virtual/range {p6 .. p6}, LN/i;->a()Lm0/U0;

    move-result-object v3

    invoke-interface {v3}, Lm0/U0;->a()V

    invoke-virtual/range {p6 .. p6}, LN/i;->a()Lm0/U0;

    move-result-object v3

    const v6, 0x3e4ccccd    # 0.2f

    mul-float/2addr v6, v1

    mul-float/2addr v5, v1

    invoke-interface {v3, v6, v5}, Lm0/U0;->n(FF)V

    invoke-virtual/range {p6 .. p6}, LN/i;->a()Lm0/U0;

    move-result-object v3

    mul-float/2addr v2, v1

    mul-float/2addr v4, v1

    invoke-interface {v3, v2, v4}, Lm0/U0;->u(FF)V

    invoke-virtual/range {p6 .. p6}, LN/i;->a()Lm0/U0;

    move-result-object v2

    const v3, 0x3f4ccccd    # 0.8f

    mul-float/2addr v3, v1

    mul-float/2addr v1, v0

    invoke-interface {v2, v3, v1}, Lm0/U0;->u(FF)V

    invoke-virtual/range {p6 .. p6}, LN/i;->b()Lm0/X0;

    move-result-object v0

    invoke-virtual/range {p6 .. p6}, LN/i;->a()Lm0/U0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lm0/X0;->a(Lm0/U0;Z)V

    invoke-virtual/range {p6 .. p6}, LN/i;->c()Lm0/U0;

    move-result-object v0

    invoke-interface {v0}, Lm0/U0;->a()V

    invoke-virtual/range {p6 .. p6}, LN/i;->b()Lm0/X0;

    move-result-object v0

    invoke-virtual/range {p6 .. p6}, LN/i;->b()Lm0/X0;

    move-result-object v1

    invoke-interface {v1}, Lm0/X0;->c()F

    move-result v1

    mul-float/2addr v1, p3

    invoke-virtual/range {p6 .. p6}, LN/i;->c()Lm0/U0;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v4, v1, v2, v3}, Lm0/X0;->b(FFLm0/U0;Z)Z

    invoke-virtual/range {p6 .. p6}, LN/i;->c()Lm0/U0;

    move-result-object v1

    const/16 v8, 0x34

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v5, v9

    move-object v9, v10

    invoke-static/range {v0 .. v9}, Lo0/f;->C1(Lo0/f;Lm0/U0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    return-void
.end method
