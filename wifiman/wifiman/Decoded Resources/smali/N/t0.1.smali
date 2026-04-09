.class public abstract LN/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:Lr/x;

.field private static final e:Lr/x;

.field private static final f:Lr/x;

.field private static final g:Lr/x;

.field private static final h:Lr/x;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, LN/s0;->a:LN/s0;

    invoke-virtual {v0}, LN/s0;->a()F

    move-result v0

    sput v0, LN/t0;->a:F

    const/16 v0, 0xf0

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/t0;->b:F

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/t0;->c:F

    new-instance v0, Lr/x;

    const v1, 0x3e4ccccd    # 0.2f

    const/4 v2, 0x0

    const v3, 0x3f4ccccd    # 0.8f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, Lr/x;-><init>(FFFF)V

    sput-object v0, LN/t0;->d:Lr/x;

    new-instance v0, Lr/x;

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v2, v4, v4}, Lr/x;-><init>(FFFF)V

    sput-object v0, LN/t0;->e:Lr/x;

    new-instance v0, Lr/x;

    const v5, 0x3f266666    # 0.65f

    invoke-direct {v0, v2, v2, v5, v4}, Lr/x;-><init>(FFFF)V

    sput-object v0, LN/t0;->f:Lr/x;

    new-instance v0, Lr/x;

    const v5, 0x3dcccccd    # 0.1f

    const v6, 0x3ee66666    # 0.45f

    invoke-direct {v0, v5, v2, v6, v4}, Lr/x;-><init>(FFFF)V

    sput-object v0, LN/t0;->g:Lr/x;

    new-instance v0, Lr/x;

    invoke-direct {v0, v3, v2, v1, v4}, Lr/x;-><init>(FFFF)V

    sput-object v0, LN/t0;->h:Lr/x;

    return-void
.end method

.method public static final a(FLandroidx/compose/ui/e;JFJILT/l;II)V
    .locals 25

    move/from16 v1, p0

    move/from16 v9, p9

    const v0, 0x681b4850

    move-object/from16 v2, p8

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, p10, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LT/l;->g(F)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move v3, v9

    :goto_1
    and-int/lit8 v4, p10, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit16 v6, v9, 0x180

    if-nez v6, :cond_7

    and-int/lit8 v6, p10, 0x4

    move-wide/from16 v10, p2

    if-nez v6, :cond_6

    invoke-interface {v2, v10, v11}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    goto :goto_5

    :cond_7
    move-wide/from16 v10, p2

    :goto_5
    and-int/lit8 v6, p10, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move/from16 v8, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v9, 0xc00

    if-nez v8, :cond_8

    move/from16 v8, p4

    invoke-interface {v2, v8}, LT/l;->g(F)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v3, v12

    :goto_7
    and-int/lit8 v12, p10, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move-wide/from16 v14, p5

    goto :goto_9

    :cond_c
    and-int/lit16 v14, v9, 0x6000

    if-nez v14, :cond_b

    move-wide/from16 v14, p5

    invoke-interface {v2, v14, v15}, LT/l;->j(J)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v3, v3, v16

    :goto_9
    const/high16 v16, 0x30000

    and-int v16, v9, v16

    if-nez v16, :cond_f

    and-int/lit8 v16, p10, 0x20

    move/from16 v7, p7

    if-nez v16, :cond_e

    invoke-interface {v2, v7}, LT/l;->i(I)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v16, 0x10000

    :goto_a
    or-int v3, v3, v16

    goto :goto_b

    :cond_f
    move/from16 v7, p7

    :goto_b
    const v16, 0x12493

    and-int v13, v3, v16

    const v0, 0x12492

    if-ne v13, v0, :cond_12

    invoke-interface {v2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_d

    :cond_10
    invoke-interface {v2}, LT/l;->C()V

    :cond_11
    :goto_c
    move-wide v3, v10

    move v10, v7

    move-wide v6, v14

    goto/16 :goto_13

    :cond_12
    :goto_d
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v0, v9, 0x1

    const v13, -0x70001

    if-eqz v0, :cond_15

    invoke-interface {v2}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_e

    :cond_13
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit8 v0, p10, 0x4

    if-eqz v0, :cond_14

    and-int/lit16 v3, v3, -0x381

    :cond_14
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_1a

    and-int/2addr v3, v13

    goto :goto_f

    :cond_15
    :goto_e
    if-eqz v4, :cond_16

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v5, v0

    :cond_16
    and-int/lit8 v0, p10, 0x4

    if-eqz v0, :cond_17

    sget-object v0, LN/f0;->a:LN/f0;

    const/4 v4, 0x6

    invoke-virtual {v0, v2, v4}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v0

    invoke-virtual {v0}, LN/m;->j()J

    move-result-wide v10

    and-int/lit16 v3, v3, -0x381

    :cond_17
    if-eqz v6, :cond_18

    sget-object v0, LN/s0;->a:LN/s0;

    invoke-virtual {v0}, LN/s0;->a()F

    move-result v0

    move v8, v0

    :cond_18
    if-eqz v12, :cond_19

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->d()J

    move-result-wide v14

    :cond_19
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_1a

    sget-object v0, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v0}, Lm0/k1$a;->a()I

    move-result v0

    and-int/2addr v3, v13

    move v7, v0

    :cond_1a
    :goto_f
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v0, -0x1

    const-string v4, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)"

    const v6, 0x681b4850

    invoke-static {v6, v3, v0, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    const/4 v0, 0x0

    cmpg-float v4, v1, v0

    if-gez v4, :cond_1c

    goto :goto_10

    :cond_1c
    move v0, v1

    :goto_10
    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v6, v0, v4

    if-lez v6, :cond_1d

    move v0, v4

    :cond_1d
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v4

    invoke-interface {v2, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LY0/d;

    new-instance v6, Lo0/k;

    invoke-interface {v4, v8}, LY0/d;->d1(F)F

    move-result v18

    const/16 v23, 0x1a

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v6

    move/from16 v20, v7

    invoke-direct/range {v17 .. v24}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x6

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 p1, v5

    move/from16 p2, v0

    move-object/from16 p3, v13

    move/from16 p4, v16

    move/from16 p5, v4

    move-object/from16 p6, v12

    invoke-static/range {p1 .. p6}, Ls/Y;->c(Landroidx/compose/ui/e;FLsh/e;IILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget v12, LN/t0;->c:F

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {v2, v0}, LT/l;->g(F)Z

    move-result v12

    const v13, 0xe000

    and-int/2addr v13, v3

    const/16 v16, 0x1

    const/16 v1, 0x4000

    if-ne v13, v1, :cond_1e

    move/from16 v1, v16

    goto :goto_11

    :cond_1e
    const/4 v1, 0x0

    :goto_11
    or-int/2addr v1, v12

    invoke-interface {v2, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v1, v12

    and-int/lit16 v12, v3, 0x380

    xor-int/lit16 v12, v12, 0x180

    const/16 v13, 0x100

    if-le v12, v13, :cond_1f

    invoke-interface {v2, v10, v11}, LT/l;->j(J)Z

    move-result v12

    if-nez v12, :cond_21

    :cond_1f
    and-int/lit16 v3, v3, 0x180

    if-ne v3, v13, :cond_20

    goto :goto_12

    :cond_20
    const/16 v16, 0x0

    :cond_21
    :goto_12
    or-int v1, v1, v16

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_22

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_23

    :cond_22
    new-instance v3, LN/t0$a;

    move-object/from16 p1, v3

    move/from16 p2, v0

    move-wide/from16 p3, v14

    move-object/from16 p5, v6

    move-wide/from16 p6, v10

    invoke-direct/range {p1 .. p7}, LN/t0$a;-><init>(FJLo0/k;J)V

    invoke-interface {v2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_23
    check-cast v3, Lmh/l;

    const/4 v0, 0x0

    invoke-static {v4, v3, v2, v0}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_c

    :goto_13
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v11

    if-eqz v11, :cond_24

    new-instance v12, LN/t0$b;

    move-object v0, v12

    move/from16 v1, p0

    move-object v2, v5

    move v5, v8

    move v8, v10

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LN/t0$b;-><init>(FLandroidx/compose/ui/e;JFJIII)V

    invoke-interface {v11, v12}, LT/X0;->a(Lmh/p;)V

    :cond_24
    return-void
.end method

.method public static final b(Landroidx/compose/ui/e;JFJILT/l;II)V
    .locals 33

    move/from16 v8, p8

    const v0, -0x42b466e0

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v4, v8, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v8

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v8

    :goto_1
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, p9, 0x2

    move-wide/from16 v9, p1

    if-nez v6, :cond_3

    invoke-interface {v1, v9, v10}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    goto :goto_3

    :cond_4
    move-wide/from16 v9, p1

    :goto_3
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move/from16 v11, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v8, 0x180

    if-nez v11, :cond_5

    move/from16 v11, p3

    invoke-interface {v1, v11}, LT/l;->g(F)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit8 v12, p9, 0x8

    if-eqz v12, :cond_8

    or-int/lit16 v5, v5, 0xc00

    move-wide/from16 v14, p4

    goto :goto_7

    :cond_8
    and-int/lit16 v13, v8, 0xc00

    move-wide/from16 v14, p4

    if-nez v13, :cond_a

    invoke-interface {v1, v14, v15}, LT/l;->j(J)Z

    move-result v13

    if-eqz v13, :cond_9

    const/16 v13, 0x800

    goto :goto_6

    :cond_9
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v5, v13

    :cond_a
    :goto_7
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_d

    and-int/lit8 v13, p9, 0x10

    if-nez v13, :cond_b

    move/from16 v13, p6

    invoke-interface {v1, v13}, LT/l;->i(I)Z

    move-result v17

    if-eqz v17, :cond_c

    const/16 v17, 0x4000

    goto :goto_8

    :cond_b
    move/from16 v13, p6

    :cond_c
    const/16 v17, 0x2000

    :goto_8
    or-int v5, v5, v17

    goto :goto_9

    :cond_d
    move/from16 v13, p6

    :goto_9
    and-int/lit16 v7, v5, 0x2493

    const/16 v3, 0x2492

    if-ne v7, v3, :cond_f

    invoke-interface {v1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_a

    :cond_e
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v4

    move v4, v11

    move v7, v13

    move-wide v5, v14

    goto/16 :goto_13

    :cond_f
    :goto_a
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v3, v8, 0x1

    const v7, -0xe001

    if-eqz v3, :cond_14

    invoke-interface {v1}, LT/l;->H()Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_c

    :cond_10
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_11

    and-int/lit8 v5, v5, -0x71

    :cond_11
    and-int/lit8 v2, p9, 0x10

    if-eqz v2, :cond_12

    and-int/2addr v5, v7

    :cond_12
    move-object v2, v4

    :cond_13
    move-wide v3, v9

    move/from16 v29, v13

    :goto_b
    move-wide v6, v14

    move v15, v5

    move v5, v11

    goto :goto_e

    :cond_14
    :goto_c
    if-eqz v2, :cond_15

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_15
    move-object v2, v4

    :goto_d
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_16

    sget-object v3, LN/f0;->a:LN/f0;

    const/4 v4, 0x6

    invoke-virtual {v3, v1, v4}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v3

    invoke-virtual {v3}, LN/m;->j()J

    move-result-wide v3

    and-int/lit8 v5, v5, -0x71

    move-wide v9, v3

    :cond_16
    if-eqz v6, :cond_17

    sget-object v3, LN/s0;->a:LN/s0;

    invoke-virtual {v3}, LN/s0;->a()F

    move-result v3

    move v11, v3

    :cond_17
    if-eqz v12, :cond_18

    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->d()J

    move-result-wide v3

    move-wide v14, v3

    :cond_18
    and-int/lit8 v3, p9, 0x10

    if-eqz v3, :cond_13

    sget-object v3, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v3}, Lm0/k1$a;->c()I

    move-result v3

    and-int/2addr v5, v7

    move/from16 v29, v3

    move-wide v3, v9

    goto :goto_b

    :goto_e
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_19

    const/4 v9, -0x1

    const-string v10, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:365)"

    invoke-static {v0, v15, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_19
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/d;

    new-instance v14, Lo0/k;

    invoke-interface {v0, v5}, LY0/d;->d1(F)F

    move-result v19

    const/16 v24, 0x1a

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v14

    move/from16 v21, v29

    invoke-direct/range {v18 .. v25}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x1

    invoke-static {v0, v1, v13, v12}, Lr/P;->c(Ljava/lang/String;LT/l;II)Lr/O;

    move-result-object v18

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v9, 0x5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sget-object v9, Lkotlin/jvm/internal/r;->a:Lkotlin/jvm/internal/r;

    invoke-static {v9}, Lr/u0;->g(Lkotlin/jvm/internal/r;)Lr/s0;

    move-result-object v17

    const/16 v9, 0x1a04

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v12

    const/4 v8, 0x2

    invoke-static {v9, v13, v12, v8, v0}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v9

    const/4 v8, 0x6

    const/4 v12, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    move-object/from16 p1, v9

    move-object/from16 p2, v19

    move-wide/from16 p3, v20

    move/from16 p5, v8

    move-object/from16 p6, v12

    invoke-static/range {p1 .. p6}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v8

    sget v12, Lr/O;->f:I

    or-int/lit16 v9, v12, 0x1b0

    sget v19, Lr/N;->d:I

    shl-int/lit8 v20, v19, 0xc

    or-int v20, v9, v20

    const/16 v21, 0x10

    const/16 v22, 0x0

    move-object/from16 v9, v18

    move/from16 v30, v12

    const/16 v23, 0x1

    move-object/from16 v12, v17

    move/from16 v31, v5

    move v5, v13

    move-object v13, v8

    move-object/from16 v32, v14

    const/16 v8, 0x800

    move-object/from16 v14, v22

    move v8, v15

    move-object v15, v1

    move/from16 v16, v20

    move/from16 v17, v21

    invoke-static/range {v9 .. v17}, Lr/P;->b(Lr/O;Ljava/lang/Object;Ljava/lang/Object;Lr/s0;Lr/N;Ljava/lang/String;LT/l;II)LT/z1;

    move-result-object v9

    const/16 v10, 0x534

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v11

    const/4 v12, 0x2

    invoke-static {v10, v5, v11, v12, v0}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v0

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 p0, v0

    move-object/from16 p1, v12

    move-wide/from16 p2, v13

    move/from16 p4, v10

    move-object/from16 p5, v11

    invoke-static/range {p0 .. p5}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v0

    move/from16 v10, v30

    or-int/lit16 v11, v10, 0x1b0

    shl-int/lit8 v12, v19, 0x9

    or-int/2addr v11, v12

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/high16 v14, 0x438f0000    # 286.0f

    const/4 v15, 0x0

    move-object/from16 p0, v18

    move/from16 p1, v13

    move/from16 p2, v14

    move-object/from16 p3, v0

    move-object/from16 p4, v15

    move-object/from16 p5, v1

    move/from16 p6, v11

    move/from16 p7, v12

    invoke-static/range {p0 .. p7}, Lr/P;->a(Lr/O;FFLr/N;Ljava/lang/String;LT/l;II)LT/z1;

    move-result-object v0

    sget-object v11, LN/t0$e;->a:LN/t0$e;

    invoke-static {v11}, Lr/j;->f(Lmh/l;)Lr/T;

    move-result-object v11

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 p0, v11

    move-object/from16 p1, v14

    move-wide/from16 p2, v15

    move/from16 p4, v12

    move-object/from16 p5, v13

    invoke-static/range {p0 .. p5}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v11

    or-int/lit16 v12, v10, 0x1b0

    shl-int/lit8 v13, v19, 0x9

    or-int/2addr v12, v13

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/high16 v15, 0x43910000    # 290.0f

    const/16 v16, 0x0

    move-object/from16 p0, v18

    move/from16 p1, v14

    move/from16 p2, v15

    move-object/from16 p3, v11

    move-object/from16 p4, v16

    move-object/from16 p5, v1

    move/from16 p6, v12

    move/from16 p7, v13

    invoke-static/range {p0 .. p7}, Lr/P;->a(Lr/O;FFLr/N;Ljava/lang/String;LT/l;II)LT/z1;

    move-result-object v11

    sget-object v12, LN/t0$f;->a:LN/t0$f;

    invoke-static {v12}, Lr/j;->f(Lmh/l;)Lr/T;

    move-result-object v12

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 p0, v12

    move-object/from16 p1, v15

    move-wide/from16 p2, v16

    move/from16 p4, v13

    move-object/from16 p5, v14

    invoke-static/range {p0 .. p5}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v12

    or-int/lit16 v10, v10, 0x1b0

    shl-int/lit8 v13, v19, 0x9

    or-int/2addr v10, v13

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/high16 v15, 0x43910000    # 290.0f

    const/16 v16, 0x0

    move-object/from16 p0, v18

    move/from16 p1, v14

    move/from16 p2, v15

    move-object/from16 p3, v12

    move-object/from16 p4, v16

    move-object/from16 p5, v1

    move/from16 p6, v10

    move/from16 p7, v13

    invoke-static/range {p0 .. p7}, Lr/P;->a(Lr/O;FFLr/N;Ljava/lang/String;LT/l;II)LT/z1;

    move-result-object v10

    invoke-static {v2}, Ls/Y;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v12

    sget v13, LN/t0;->c:F

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v12

    and-int/lit16 v13, v8, 0x1c00

    const/16 v14, 0x800

    if-ne v13, v14, :cond_1a

    move/from16 v13, v23

    :goto_f
    move-object/from16 v14, v32

    goto :goto_10

    :cond_1a
    move v13, v5

    goto :goto_f

    :goto_10
    invoke-interface {v1, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    invoke-interface {v1, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    invoke-interface {v1, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    invoke-interface {v1, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    and-int/lit16 v15, v8, 0x380

    const/16 v5, 0x100

    if-ne v15, v5, :cond_1b

    move/from16 v5, v23

    goto :goto_11

    :cond_1b
    const/4 v5, 0x0

    :goto_11
    or-int/2addr v5, v13

    and-int/lit8 v13, v8, 0x70

    xor-int/lit8 v13, v13, 0x30

    const/16 v15, 0x20

    if-le v13, v15, :cond_1c

    invoke-interface {v1, v3, v4}, LT/l;->j(J)Z

    move-result v13

    if-nez v13, :cond_1d

    :cond_1c
    and-int/lit8 v8, v8, 0x30

    if-ne v8, v15, :cond_1e

    :cond_1d
    move/from16 v13, v23

    goto :goto_12

    :cond_1e
    const/4 v13, 0x0

    :goto_12
    or-int/2addr v5, v13

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_1f

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v8, v5, :cond_20

    :cond_1f
    new-instance v8, LN/t0$c;

    move-object/from16 v18, v8

    move-wide/from16 v19, v6

    move-object/from16 v21, v14

    move/from16 v22, v31

    move-wide/from16 v23, v3

    move-object/from16 v25, v9

    move-object/from16 v26, v11

    move-object/from16 v27, v10

    move-object/from16 v28, v0

    invoke-direct/range {v18 .. v28}, LN/t0$c;-><init>(JLo0/k;FJLT/z1;LT/z1;LT/z1;LT/z1;)V

    invoke-interface {v1, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_20
    check-cast v8, Lmh/l;

    const/4 v0, 0x0

    invoke-static {v12, v8, v1, v0}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {}, LT/o;->P()V

    :cond_21
    move-wide v9, v3

    move-wide v5, v6

    move/from16 v7, v29

    move/from16 v4, v31

    :goto_13
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v11

    if-eqz v11, :cond_22

    new-instance v12, LN/t0$d;

    move-object v0, v12

    move-object v1, v2

    move-wide v2, v9

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LN/t0$d;-><init>(Landroidx/compose/ui/e;JFJIII)V

    invoke-interface {v11, v12}, LT/X0;->a(Lmh/p;)V

    :cond_22
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

.method private static final e(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final f(LT/z1;)I
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final g(FLandroidx/compose/ui/e;JJILT/l;II)V
    .locals 24

    move/from16 v1, p0

    move/from16 v8, p8

    const v0, -0x1fb571e0

    move-object/from16 v2, p7

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LT/l;->g(F)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move v3, v8

    :goto_1
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_7

    and-int/lit8 v6, p9, 0x4

    move-wide/from16 v9, p2

    if-nez v6, :cond_6

    invoke-interface {v2, v9, v10}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    goto :goto_5

    :cond_7
    move-wide/from16 v9, p2

    :goto_5
    and-int/lit16 v6, v8, 0xc00

    const/16 v11, 0x800

    if-nez v6, :cond_9

    and-int/lit8 v6, p9, 0x8

    move-wide/from16 v12, p4

    if-nez v6, :cond_8

    invoke-interface {v2, v12, v13}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_8

    move v6, v11

    goto :goto_6

    :cond_8
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v3, v6

    goto :goto_7

    :cond_9
    move-wide/from16 v12, p4

    :goto_7
    and-int/lit16 v6, v8, 0x6000

    const/16 v14, 0x4000

    if-nez v6, :cond_c

    and-int/lit8 v6, p9, 0x10

    if-nez v6, :cond_a

    move/from16 v6, p6

    invoke-interface {v2, v6}, LT/l;->i(I)Z

    move-result v15

    if-eqz v15, :cond_b

    move v15, v14

    goto :goto_8

    :cond_a
    move/from16 v6, p6

    :cond_b
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v3, v15

    goto :goto_9

    :cond_c
    move/from16 v6, p6

    :goto_9
    and-int/lit16 v15, v3, 0x2493

    const/16 v7, 0x2492

    if-ne v15, v7, :cond_f

    invoke-interface {v2}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_d

    goto :goto_b

    :cond_d
    invoke-interface {v2}, LT/l;->C()V

    move-object v4, v5

    :cond_e
    :goto_a
    move v7, v6

    move-wide v5, v12

    goto/16 :goto_15

    :cond_f
    :goto_b
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v7, v8, 0x1

    const v15, -0xe001

    if-eqz v7, :cond_14

    invoke-interface {v2}, LT/l;->H()Z

    move-result v7

    if-eqz v7, :cond_10

    goto :goto_c

    :cond_10
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_11

    and-int/lit16 v3, v3, -0x381

    :cond_11
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_12

    and-int/lit16 v3, v3, -0x1c01

    :cond_12
    and-int/lit8 v4, p9, 0x10

    if-eqz v4, :cond_13

    and-int/2addr v3, v15

    :cond_13
    move-object v4, v5

    goto :goto_e

    :cond_14
    :goto_c
    if-eqz v4, :cond_15

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_15
    move-object v4, v5

    :goto_d
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_16

    sget-object v5, LN/f0;->a:LN/f0;

    const/4 v7, 0x6

    invoke-virtual {v5, v2, v7}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v5

    invoke-virtual {v5}, LN/m;->j()J

    move-result-wide v9

    and-int/lit16 v3, v3, -0x381

    :cond_16
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_17

    const/16 v22, 0xe

    const/16 v23, 0x0

    const v18, 0x3e75c28f    # 0.24f

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, v9

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v12

    and-int/lit16 v3, v3, -0x1c01

    :cond_17
    and-int/lit8 v5, p9, 0x10

    if-eqz v5, :cond_18

    sget-object v5, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v5}, Lm0/k1$a;->a()I

    move-result v5

    and-int/2addr v3, v15

    move v6, v5

    :cond_18
    :goto_e
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_19

    const/4 v5, -0x1

    const-string v7, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:110)"

    invoke-static {v0, v3, v5, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_19
    const/4 v0, 0x0

    cmpg-float v5, v1, v0

    if-gez v5, :cond_1a

    goto :goto_f

    :cond_1a
    move v0, v1

    :goto_f
    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v7, v0, v5

    if-lez v7, :cond_1b

    move v0, v5

    :cond_1b
    invoke-static {v4}, LN/t0;->x(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v7, 0x6

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 p1, v5

    move/from16 p2, v0

    move-object/from16 p3, v16

    move/from16 p4, v17

    move/from16 p5, v7

    move-object/from16 p6, v15

    invoke-static/range {p1 .. p6}, Ls/Y;->c(Landroidx/compose/ui/e;FLsh/e;IILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget v7, LN/t0;->b:F

    sget v15, LN/t0;->a:F

    invoke-static {v5, v7, v15}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v5

    and-int/lit16 v7, v3, 0x1c00

    xor-int/lit16 v7, v7, 0xc00

    const/4 v15, 0x0

    const/16 v16, 0x1

    if-le v7, v11, :cond_1c

    invoke-interface {v2, v12, v13}, LT/l;->j(J)Z

    move-result v7

    if-nez v7, :cond_1d

    :cond_1c
    and-int/lit16 v7, v3, 0xc00

    if-ne v7, v11, :cond_1e

    :cond_1d
    move/from16 v7, v16

    goto :goto_10

    :cond_1e
    move v7, v15

    :goto_10
    const v11, 0xe000

    and-int/2addr v11, v3

    xor-int/lit16 v11, v11, 0x6000

    if-le v11, v14, :cond_1f

    invoke-interface {v2, v6}, LT/l;->i(I)Z

    move-result v11

    if-nez v11, :cond_20

    :cond_1f
    and-int/lit16 v11, v3, 0x6000

    if-ne v11, v14, :cond_21

    :cond_20
    move/from16 v11, v16

    goto :goto_11

    :cond_21
    move v11, v15

    :goto_11
    or-int/2addr v7, v11

    invoke-interface {v2, v0}, LT/l;->g(F)Z

    move-result v11

    or-int/2addr v7, v11

    and-int/lit16 v11, v3, 0x380

    xor-int/lit16 v11, v11, 0x180

    const/16 v14, 0x100

    if-le v11, v14, :cond_22

    invoke-interface {v2, v9, v10}, LT/l;->j(J)Z

    move-result v11

    if-nez v11, :cond_24

    :cond_22
    and-int/lit16 v3, v3, 0x180

    if-ne v3, v14, :cond_23

    goto :goto_12

    :cond_23
    move/from16 v16, v15

    :cond_24
    :goto_12
    or-int v3, v7, v16

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_26

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_25

    goto :goto_13

    :cond_25
    move v3, v15

    goto :goto_14

    :cond_26
    :goto_13
    new-instance v7, LN/t0$g;

    move v3, v15

    move-object v15, v7

    move-wide/from16 v16, v12

    move/from16 v18, v6

    move/from16 v19, v0

    move-wide/from16 v20, v9

    invoke-direct/range {v15 .. v21}, LN/t0$g;-><init>(JIFJ)V

    invoke-interface {v2, v7}, LT/l;->K(Ljava/lang/Object;)V

    :goto_14
    check-cast v7, Lmh/l;

    invoke-static {v5, v7, v2, v3}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_a

    :goto_15
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v11

    if-eqz v11, :cond_27

    new-instance v12, LN/t0$h;

    move-object v0, v12

    move/from16 v1, p0

    move-object v2, v4

    move-wide v3, v9

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LN/t0$h;-><init>(FLandroidx/compose/ui/e;JJIII)V

    invoke-interface {v11, v12}, LT/X0;->a(Lmh/p;)V

    :cond_27
    return-void
.end method

.method public static final synthetic h(LT/z1;)F
    .locals 0

    invoke-static {p0}, LN/t0;->c(LT/z1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic i(LT/z1;)F
    .locals 0

    invoke-static {p0}, LN/t0;->d(LT/z1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic j(LT/z1;)F
    .locals 0

    invoke-static {p0}, LN/t0;->e(LT/z1;)F

    move-result p0

    return p0
.end method

.method public static final synthetic k(LT/z1;)I
    .locals 0

    invoke-static {p0}, LN/t0;->f(LT/z1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic l(Lo0/f;JLo0/k;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LN/t0;->s(Lo0/f;JLo0/k;)V

    return-void
.end method

.method public static final synthetic m(Lo0/f;FFJLo0/k;)V
    .locals 0

    invoke-static/range {p0 .. p5}, LN/t0;->t(Lo0/f;FFJLo0/k;)V

    return-void
.end method

.method public static final synthetic n(Lo0/f;FFFJLo0/k;)V
    .locals 0

    invoke-static/range {p0 .. p6}, LN/t0;->u(Lo0/f;FFFJLo0/k;)V

    return-void
.end method

.method public static final synthetic o(Lo0/f;FFJFI)V
    .locals 0

    invoke-static/range {p0 .. p6}, LN/t0;->v(Lo0/f;FFJFI)V

    return-void
.end method

.method public static final synthetic p(Lo0/f;JFI)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LN/t0;->w(Lo0/f;JFI)V

    return-void
.end method

.method public static final synthetic q()Lr/x;
    .locals 1

    sget-object v0, LN/t0;->h:Lr/x;

    return-object v0
.end method

.method private static final r(Lo0/f;FFJLo0/k;)V
    .locals 19

    invoke-virtual/range {p5 .. p5}, Lo0/k;->f()F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-interface/range {p0 .. p0}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v2

    mul-float/2addr v1, v0

    sub-float/2addr v2, v1

    invoke-static {v0, v0}, Ll0/h;->a(FF)J

    move-result-wide v9

    invoke-static {v2, v2}, Ll0/n;->a(FF)J

    move-result-wide v11

    const/16 v17, 0x340

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v3, p0

    move-wide/from16 v4, p3

    move/from16 v6, p1

    move/from16 v7, p2

    move-object/from16 v14, p5

    invoke-static/range {v3 .. v18}, Lo0/f;->p1(Lo0/f;JFFZJJFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    return-void
.end method

.method private static final s(Lo0/f;JLo0/k;)V
    .locals 6

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    move-object v0, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LN/t0;->r(Lo0/f;FFJLo0/k;)V

    return-void
.end method

.method private static final t(Lo0/f;FFJLo0/k;)V
    .locals 0

    invoke-static/range {p0 .. p5}, LN/t0;->r(Lo0/f;FFJLo0/k;)V

    return-void
.end method

.method private static final u(Lo0/f;FFFJLo0/k;)V
    .locals 6

    invoke-virtual {p6}, Lo0/k;->b()I

    move-result v0

    sget-object v1, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v1}, Lm0/k1$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Lm0/k1;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    sget v0, LN/t0;->c:F

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    div-float/2addr p2, v0

    const v0, 0x42652ee1

    mul-float/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    :goto_0
    add-float v1, p1, p2

    const p1, 0x3dcccccd    # 0.1f

    invoke-static {p3, p1}, Ljava/lang/Math;->max(FF)F

    move-result v2

    move-object v0, p0

    move-wide v3, p4

    move-object v5, p6

    invoke-static/range {v0 .. v5}, LN/t0;->r(Lo0/f;FFJLo0/k;)V

    return-void
.end method

.method private static final v(Lo0/f;FFJFI)V
    .locals 22

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

    div-float v3, v1, v2

    invoke-interface/range {p0 .. p0}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v4

    sget-object v5, LY0/t;->Ltr:LY0/t;

    if-ne v4, v5, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v4, :cond_1

    move/from16 v6, p1

    goto :goto_1

    :cond_1
    sub-float v6, v5, p2

    :goto_1
    mul-float/2addr v6, v0

    if-eqz v4, :cond_2

    move/from16 v5, p2

    goto :goto_2

    :cond_2
    sub-float v5, v5, p1

    :goto_2
    mul-float/2addr v5, v0

    sget-object v4, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v4}, Lm0/k1$a;->a()I

    move-result v4

    move/from16 v15, p6

    invoke-static {v15, v4}, Lm0/k1;->e(II)Z

    move-result v4

    if-nez v4, :cond_4

    cmpl-float v1, v1, v0

    if-lez v1, :cond_3

    goto :goto_3

    :cond_3
    div-float v1, p5, v2

    sub-float/2addr v0, v1

    invoke-static {v1, v0}, Lsh/m;->b(FF)Lsh/e;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1, v0}, Lsh/m;->o(Ljava/lang/Comparable;Lsh/e;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v2, v0}, Lsh/m;->o(Ljava/lang/Comparable;Lsh/e;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sub-float v2, p2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/4 v4, 0x0

    cmpl-float v2, v2, v4

    if-lez v2, :cond_5

    invoke-static {v1, v3}, Ll0/h;->a(FF)J

    move-result-wide v10

    invoke-static {v0, v3}, Ll0/h;->a(FF)J

    move-result-wide v12

    const/16 v20, 0x1e0

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v7, p0

    move-wide/from16 v8, p3

    move/from16 v14, p5

    move/from16 v15, p6

    invoke-static/range {v7 .. v21}, Lo0/f;->w1(Lo0/f;JJJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V

    goto :goto_4

    :cond_4
    :goto_3
    invoke-static {v6, v3}, Ll0/h;->a(FF)J

    move-result-wide v10

    invoke-static {v5, v3}, Ll0/h;->a(FF)J

    move-result-wide v12

    const/16 v20, 0x1f0

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v7, p0

    move-wide/from16 v8, p3

    move/from16 v14, p5

    invoke-static/range {v7 .. v21}, Lo0/f;->w1(Lo0/f;JJJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V

    :cond_5
    :goto_4
    return-void
.end method

.method private static final w(Lo0/f;JFI)V
    .locals 7

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    move-object v0, p0

    move-wide v3, p1

    move v5, p3

    move v6, p4

    invoke-static/range {v0 .. v6}, LN/t0;->v(Lo0/f;FFJFI)V

    return-void
.end method

.method public static final x(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 4

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    new-instance v1, LN/t0$i;

    invoke-direct {v1, v0}, LN/t0$i;-><init>(F)V

    invoke-static {p0, v1}, Landroidx/compose/ui/layout/g;->a(Landroidx/compose/ui/e;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p0

    sget-object v1, LN/t0$j;->a:LN/t0$j;

    const/4 v2, 0x1

    invoke-static {p0, v2, v1}, LJ0/m;->b(Landroidx/compose/ui/e;ZLmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v1, v0, v2, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method
