.class public abstract Lx9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx9/h$c;
    }
.end annotation


# direct methods
.method public static synthetic a(Lmh/l;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lx9/h;->n(Lmh/l;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, Lx9/h;->o(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, Lx9/h;->j(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx9/a;LT/z1;LT/z1;LT/z1;LT/z1;LT/z1;Lo0/f;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Lx9/h;->i(Lx9/a;LT/z1;LT/z1;LT/z1;LT/z1;LT/z1;Lo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;LT/l;II)V
    .locals 32

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p5

    move/from16 v10, p7

    const v0, -0x1a93beef

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v1, p8, 0x1

    const/4 v14, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v1, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_2

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v14

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_2
    move v1, v10

    :goto_1
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_5

    invoke-interface {v15, v8}, LT/l;->l(Ljava/lang/Object;)Z

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
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_6

    move-object/from16 v3, p2

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

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
    move/from16 v5, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_9

    move/from16 v5, p3

    invoke-interface {v15, v5}, LT/l;->c(Z)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x800

    goto :goto_6

    :cond_b
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    :goto_7
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v6, v10, 0x6000

    move-object/from16 v12, p4

    if-nez v6, :cond_e

    invoke-interface {v15, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    const/16 v6, 0x4000

    goto :goto_8

    :cond_d
    const/16 v6, 0x2000

    :goto_8
    or-int/2addr v1, v6

    :cond_e
    :goto_9
    and-int/lit8 v6, p8, 0x20

    const/high16 v11, 0x30000

    if-eqz v6, :cond_10

    or-int/2addr v1, v11

    :cond_f
    :goto_a
    move v11, v1

    goto :goto_c

    :cond_10
    and-int v6, v10, v11

    if-nez v6, :cond_f

    invoke-interface {v15, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    const/high16 v6, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v6, 0x10000

    :goto_b
    or-int/2addr v1, v6

    goto :goto_a

    :goto_c
    const v1, 0x12493

    and-int/2addr v1, v11

    const v6, 0x12492

    if-ne v1, v6, :cond_13

    invoke-interface {v15}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_d

    :cond_12
    invoke-interface {v15}, LT/l;->C()V

    move v4, v5

    move-object v2, v15

    goto/16 :goto_17

    :cond_13
    :goto_d
    if-eqz v2, :cond_14

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v6, v1

    goto :goto_e

    :cond_14
    move-object v6, v3

    :goto_e
    const/4 v3, 0x1

    if-eqz v4, :cond_15

    move v5, v3

    :cond_15
    invoke-static {}, LT/o;->H()Z

    move-result v1

    const/4 v4, -0x1

    if-eqz v1, :cond_16

    const-string/jumbo v1, "com.ui.core.ui.component.checkbox.UiCheckBoxImpl (UiCheckbox.kt:192)"

    invoke-static {v0, v11, v4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_16
    if-eqz v8, :cond_17

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v1, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v1}, LJ0/g$a;->b()I

    move-result v1

    int-to-float v2, v14

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v17

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    invoke-static/range {v16 .. v21}, LN/A0;->f(ZFJILjava/lang/Object;)Ls/I;

    move-result-object v16

    invoke-static {v1}, LJ0/g;->h(I)LJ0/g;

    move-result-object v17

    move-object/from16 v1, p0

    move-object/from16 v2, p4

    move v13, v3

    move-object/from16 v3, v16

    move v13, v4

    move v4, v5

    move/from16 v22, v5

    move-object/from16 v5, v17

    move-object/from16 v23, v6

    move-object/from16 v6, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/c;->c(Landroidx/compose/ui/e;LK0/a;Ly/m;Ls/G;ZLJ0/g;Lmh/a;)Landroidx/compose/ui/e;

    move-result-object v0

    goto :goto_f

    :cond_17
    move v13, v4

    move/from16 v22, v5

    move-object/from16 v23, v6

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_f
    and-int/lit8 v1, v11, 0xe

    or-int/lit8 v1, v1, 0x30

    const-string/jumbo v2, "checkStateTransition"

    const/4 v3, 0x0

    invoke-static {v7, v2, v15, v1, v3}, Lr/p0;->g(Ljava/lang/Object;Ljava/lang/String;LT/l;II)Lr/o0;

    move-result-object v1

    sget-object v2, Lx9/h$b;->a:Lx9/h$b;

    sget-object v4, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v4}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v5

    invoke-virtual {v1}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LK0/a;

    const v14, 0x5939b7b6

    invoke-interface {v15, v14}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v18

    const-string/jumbo v10, "com.ui.core.ui.component.checkbox.UiCheckBoxImpl.<anonymous> (UiCheckbox.kt:221)"

    if-eqz v18, :cond_18

    invoke-static {v14, v3, v13, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    sget-object v19, Lx9/h$c;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v19, v6

    const/4 v3, 0x3

    const/high16 v20, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    if-eq v6, v13, :cond_19

    const/4 v13, 0x2

    if-eq v6, v13, :cond_1b

    if-ne v6, v3, :cond_1a

    :cond_19
    move/from16 v6, v20

    goto :goto_10

    :cond_1a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1b
    const/4 v6, 0x0

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v13

    if-eqz v13, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v1}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LK0/a;

    invoke-interface {v15, v14}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v21

    move/from16 v18, v11

    const/4 v3, -0x1

    if-eqz v21, :cond_1d

    const/4 v11, 0x0

    invoke-static {v14, v11, v3, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1d
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v19, v10

    const/4 v13, 0x1

    if-eq v10, v13, :cond_20

    const/4 v14, 0x2

    if-eq v10, v14, :cond_1f

    const/4 v11, 0x3

    if-ne v10, v11, :cond_1e

    :goto_11
    move/from16 v10, v20

    goto :goto_12

    :cond_1e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1f
    const/4 v10, 0x0

    goto :goto_12

    :cond_20
    const/4 v14, 0x2

    goto :goto_11

    :goto_12
    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-static {}, LT/o;->P()V

    :cond_21
    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v1}, Lr/o0;->n()Lr/o0$b;

    move-result-object v11

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v11, v15, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/H;

    const-string/jumbo v16, "checkFraction"

    const/high16 v3, 0x30000

    move/from16 v24, v18

    move-object v11, v1

    move-object v12, v6

    const/4 v6, -0x1

    move-object v13, v10

    move v10, v14

    move-object v14, v2

    move-object v2, v15

    move-object v15, v5

    move-object/from16 v17, v2

    move/from16 v18, v3

    invoke-static/range {v11 .. v18}, Lr/p0;->d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;

    move-result-object v5

    sget-object v11, Lx9/h$a;->a:Lx9/h$a;

    invoke-static {v4}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v15

    invoke-virtual {v1}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LK0/a;

    const v12, 0x17bace8d

    invoke-interface {v2, v12}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v13

    const-string/jumbo v14, "com.ui.core.ui.component.checkbox.UiCheckBoxImpl.<anonymous> (UiCheckbox.kt:238)"

    if-eqz v13, :cond_22

    const/4 v13, 0x0

    invoke-static {v12, v13, v6, v14}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_22
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v19, v4

    const/4 v13, 0x1

    if-eq v4, v13, :cond_24

    if-eq v4, v10, :cond_24

    const/4 v13, 0x3

    if-ne v4, v13, :cond_23

    move/from16 v13, v20

    goto :goto_13

    :cond_23
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_24
    const/4 v13, 0x0

    :goto_13
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-static {}, LT/o;->P()V

    :cond_25
    invoke-interface {v2}, LT/l;->J()V

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v1}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LK0/a;

    invoke-interface {v2, v12}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v16

    if-eqz v16, :cond_26

    const/4 v3, 0x0

    invoke-static {v12, v3, v6, v14}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_26
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v19, v3

    const/4 v6, 0x1

    if-eq v3, v6, :cond_28

    if-eq v3, v10, :cond_28

    const/4 v6, 0x3

    if-ne v3, v6, :cond_27

    goto :goto_14

    :cond_27
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_28
    const/16 v20, 0x0

    :goto_14
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-static {}, LT/o;->P()V

    :cond_29
    invoke-interface {v2}, LT/l;->J()V

    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-virtual {v1}, Lr/o0;->n()Lr/o0$b;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v3, v2, v12}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lr/H;

    const-string/jumbo v16, "checkGravitationShift"

    move-object v11, v1

    move-object v12, v4

    move-object/from16 v17, v2

    const/high16 v1, 0x30000

    move/from16 v18, v1

    invoke-static/range {v11 .. v18}, Lr/p0;->d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;

    move-result-object v1

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v3

    invoke-interface {v2, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/d;

    const v4, 0xdfcdef1

    invoke-interface {v2, v4}, LT/l;->U(I)V

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v4, v11, :cond_2a

    new-instance v4, Lx9/a;

    new-instance v19, Lo0/k;

    const-wide v11, 0x3ffccccccccccccdL    # 1.8

    double-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-interface {v3, v11}, LY0/d;->d1(F)F

    move-result v11

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v11

    double-to-float v12, v11

    const/16 v17, 0x1e

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v11, v19

    invoke-direct/range {v11 .. v18}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x4

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-interface {v3, v11}, LY0/d;->d1(F)F

    move-result v3

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v3, v12, v10, v11}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v17

    const/4 v3, 0x7

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v12, v4

    move-object/from16 v16, v19

    move/from16 v19, v3

    invoke-direct/range {v12 .. v20}, Lx9/a;-><init>(Lm0/U0;Lm0/X0;Lm0/U0;Lo0/k;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2a
    move-object/from16 v26, v4

    check-cast v26, Lx9/a;

    invoke-interface {v2}, LT/l;->J()V

    shr-int/lit8 v3, v24, 0x9

    and-int/lit8 v4, v3, 0xe

    const/4 v11, 0x3

    shl-int/lit8 v11, v24, 0x3

    and-int/lit8 v11, v11, 0x70

    or-int/2addr v4, v11

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v4

    move/from16 v4, v22

    invoke-interface {v9, v4, v7, v2, v3}, Lx9/c;->c(ZLK0/a;LT/l;I)LT/z1;

    move-result-object v11

    invoke-interface {v9, v4, v7, v2, v3}, Lx9/c;->a(ZLK0/a;LT/l;I)LT/z1;

    move-result-object v12

    invoke-interface {v9, v4, v7, v2, v3}, Lx9/c;->b(ZLK0/a;LT/l;I)LT/z1;

    move-result-object v3

    if-eqz v8, :cond_2b

    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v13}, LN/c0;->d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v13

    :goto_15
    move-object/from16 v14, v23

    goto :goto_16

    :cond_2b
    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_15

    :goto_16
    invoke-interface {v14, v13}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-interface {v13, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v13, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v13}, Lf0/c$a;->e()Lf0/c;

    move-result-object v13

    const/4 v15, 0x0

    move/from16 v22, v4

    const/4 v4, 0x0

    invoke-static {v0, v13, v4, v10, v15}, Landroidx/compose/foundation/layout/r;->F(Landroidx/compose/ui/e;Lf0/c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v4, 0x18

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/r;->o(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const v4, 0xdfd4563

    invoke-interface {v2, v4}, LT/l;->U(I)V

    invoke-interface {v2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v2, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    invoke-interface {v2, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v4, v10

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_2c

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v10, v4, :cond_2d

    :cond_2c
    new-instance v10, Lx9/f;

    move-object/from16 v25, v10

    move-object/from16 v27, v3

    move-object/from16 v28, v12

    move-object/from16 v29, v11

    move-object/from16 v30, v5

    move-object/from16 v31, v1

    invoke-direct/range {v25 .. v31}, Lx9/f;-><init>(Lx9/a;LT/z1;LT/z1;LT/z1;LT/z1;LT/z1;)V

    invoke-interface {v2, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2d
    check-cast v10, Lmh/l;

    invoke-interface {v2}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v0, v10, v2, v1}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {}, LT/o;->P()V

    :cond_2e
    move-object v3, v14

    move/from16 v4, v22

    :goto_17
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_2f

    new-instance v11, Lx9/g;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lx9/g;-><init>(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_2f
    return-void
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

.method private static final h(LT/z1;)J
    .locals 2

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm0/v0;

    invoke-virtual {p0}, Lm0/v0;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final i(Lx9/a;LT/z1;LT/z1;LT/z1;LT/z1;LT/z1;Lo0/f;)LYg/J;
    .locals 17

    const-string v0, "$this$Canvas"

    move-object/from16 v15, p6

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lx9/a;->e()Lo0/k;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lx9/h;->h(LT/z1;)J

    move-result-wide v2

    invoke-virtual {v0}, Lo0/k;->f()F

    move-result v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    invoke-virtual {v0}, Lo0/k;->f()F

    move-result v5

    div-float/2addr v5, v4

    invoke-static {v1, v5}, Ll0/h;->a(FF)J

    move-result-wide v4

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/m;->i(J)F

    move-result v1

    invoke-virtual {v0}, Lo0/k;->f()F

    move-result v6

    sub-float/2addr v1, v6

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/m;->g(J)F

    move-result v6

    invoke-virtual {v0}, Lo0/k;->f()F

    move-result v7

    sub-float/2addr v6, v7

    invoke-static {v1, v6}, Ll0/n;->a(FF)J

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lx9/a;->b()J

    move-result-wide v8

    const/16 v14, 0xe0

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p6

    move-object v10, v0

    move-object/from16 v15, v16

    invoke-static/range {v1 .. v15}, Lo0/f;->b1(Lo0/f;JJJJLo0/g;FLm0/w0;IILjava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Lx9/h;->g(LT/z1;)J

    move-result-wide v2

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/m;->i(J)F

    move-result v1

    invoke-interface/range {p6 .. p6}, Lo0/f;->c()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/m;->g(J)F

    move-result v4

    invoke-static {v1, v4}, Ll0/n;->a(FF)J

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lx9/a;->b()J

    move-result-wide v8

    sget-object v10, Lo0/j;->a:Lo0/j;

    const/16 v14, 0xe2

    const/4 v15, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v15}, Lo0/f;->b1(Lo0/f;JJJJLo0/g;FLm0/w0;IILjava/lang/Object;)V

    invoke-static/range {p3 .. p3}, Lx9/h;->f(LT/z1;)J

    move-result-wide v2

    invoke-static/range {p4 .. p4}, Lx9/h;->k(LT/z1;)F

    move-result v4

    invoke-static/range {p5 .. p5}, Lx9/h;->l(LT/z1;)F

    move-result v5

    invoke-virtual {v0}, Lo0/k;->f()F

    move-result v6

    move-object/from16 v7, p0

    invoke-static/range {v1 .. v7}, Lx9/h;->p(Lo0/f;JFFFLx9/a;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final j(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, Lx9/h;->e(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final k(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final l(LT/z1;)F
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method public static final m(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;LT/l;II)V
    .locals 18

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    const v0, -0x6cea3f17

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v4, p7, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v5, v6, 0x6

    move v7, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v6, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v7, v6

    :goto_1
    and-int/lit8 v8, p7, 0x2

    const/16 v9, 0x20

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_5

    invoke-interface {v1, v2}, LT/l;->c(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v9

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, p7, 0x4

    const/16 v10, 0x100

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_8

    invoke-interface {v1, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v10

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_8
    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v7, v7, 0xc00

    :cond_9
    move/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_9

    move/from16 v11, p3

    invoke-interface {v1, v11}, LT/l;->c(Z)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v7, v12

    :goto_7
    and-int/lit8 v12, p7, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v7, v7, 0x6000

    :cond_c
    move-object/from16 v13, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v6, 0x6000

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
    or-int/2addr v7, v14

    :goto_9
    and-int/lit16 v14, v7, 0x2493

    const/16 v15, 0x2492

    if-ne v14, v15, :cond_10

    invoke-interface {v1}, LT/l;->v()Z

    move-result v14

    if-nez v14, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v1}, LT/l;->C()V

    move-object v4, v5

    move-object v5, v13

    goto/16 :goto_11

    :cond_10
    :goto_a
    if-eqz v4, :cond_11

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_b

    :cond_11
    move-object v4, v5

    :goto_b
    const/4 v5, 0x1

    if-eqz v8, :cond_12

    move/from16 v16, v5

    goto :goto_c

    :cond_12
    move/from16 v16, v11

    :goto_c
    if-eqz v12, :cond_14

    const v8, -0x38cf5380    # -45228.5f

    invoke-interface {v1, v8}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v8, v11, :cond_13

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Ly/m;

    invoke-interface {v1}, LT/l;->J()V

    move-object/from16 v17, v8

    goto :goto_d

    :cond_14
    move-object/from16 v17, v13

    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_15

    const/4 v8, -0x1

    const-string/jumbo v11, "com.ui.core.ui.component.checkbox.UiCheckbox (UiCheckbox.kt:171)"

    invoke-static {v0, v7, v8, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_15
    invoke-static/range {p1 .. p1}, LK0/b;->a(Z)LK0/a;

    move-result-object v0

    const v8, -0x38cf43cb

    invoke-interface {v1, v8}, LT/l;->U(I)V

    const/4 v8, 0x0

    if-eqz v3, :cond_1a

    const v11, -0x38cf3eaa

    invoke-interface {v1, v11}, LT/l;->U(I)V

    and-int/lit16 v11, v7, 0x380

    if-ne v11, v10, :cond_16

    move v10, v5

    goto :goto_e

    :cond_16
    move v10, v8

    :goto_e
    and-int/lit8 v11, v7, 0x70

    if-ne v11, v9, :cond_17

    goto :goto_f

    :cond_17
    move v5, v8

    :goto_f
    or-int/2addr v5, v10

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_18

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v9, v5, :cond_19

    :cond_18
    new-instance v9, Lx9/d;

    invoke-direct {v9, v3, v2}, Lx9/d;-><init>(Lmh/l;Z)V

    invoke-interface {v1, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v9, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    goto :goto_10

    :cond_1a
    const/4 v5, 0x0

    move-object v9, v5

    :goto_10
    invoke-interface {v1}, LT/l;->J()V

    invoke-static {v1, v8}, Lx9/h;->q(LT/l;I)Lx9/c;

    move-result-object v12

    const-string/jumbo v5, "ui_checkbox"

    invoke-static {v4, v5, v2}, LM9/i;->h(Landroidx/compose/ui/e;Ljava/lang/String;Z)Landroidx/compose/ui/e;

    move-result-object v5

    const v8, 0xfc00

    and-int v14, v7, v8

    const/4 v15, 0x0

    move-object v7, v0

    move-object v8, v9

    move-object v9, v5

    move/from16 v10, v16

    move-object/from16 v11, v17

    move-object v13, v1

    invoke-static/range {v7 .. v15}, Lx9/h;->e(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, LT/o;->P()V

    :cond_1b
    move/from16 v11, v16

    move-object/from16 v5, v17

    :goto_11
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_1c

    new-instance v9, Lx9/e;

    move-object v0, v9

    move-object v1, v4

    move/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v11

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lx9/e;-><init>(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_1c
    return-void
.end method

.method private static final n(Lmh/l;Z)LYg/J;
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, Lx9/h;->m(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final p(Lo0/f;JFFFLx9/a;)V
    .locals 12

    move/from16 v0, p4

    new-instance v9, Lo0/k;

    sget-object v1, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v1}, Lm0/k1$a;->b()I

    move-result v4

    sget-object v1, Lm0/V0;->a:Lm0/V0$a;

    const/4 v10, 0x1

    int-to-float v2, v10

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move-object v11, p0

    invoke-interface {p0, v2}, LY0/d;->d1(F)F

    move-result v2

    invoke-virtual {v1, v2}, Lm0/V0$a;->a(F)Lm0/V0;

    move-result-object v6

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, v9

    move/from16 v2, p5

    invoke-direct/range {v1 .. v8}, Lo0/k;-><init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    const v2, 0x3ef53f7d    # 0.479f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v2, v3, v0}, La1/b;->b(FFF)F

    move-result v2

    const v4, 0x3f2b851f    # 0.67f

    invoke-static {v4, v3, v0}, La1/b;->b(FFF)F

    move-result v4

    const v5, 0x3f066666    # 0.525f

    invoke-static {v5, v3, v0}, La1/b;->b(FFF)F

    move-result v5

    const v6, 0x3eca3d71    # 0.395f

    invoke-static {v6, v3, v0}, La1/b;->b(FFF)F

    move-result v0

    invoke-virtual/range {p6 .. p6}, Lx9/a;->a()Lm0/U0;

    move-result-object v3

    invoke-interface {v3}, Lm0/U0;->a()V

    invoke-virtual/range {p6 .. p6}, Lx9/a;->a()Lm0/U0;

    move-result-object v3

    const v6, 0x3ea66666    # 0.325f

    mul-float/2addr v6, v1

    mul-float/2addr v5, v1

    invoke-interface {v3, v6, v5}, Lm0/U0;->n(FF)V

    invoke-virtual/range {p6 .. p6}, Lx9/a;->a()Lm0/U0;

    move-result-object v3

    mul-float/2addr v2, v1

    mul-float/2addr v4, v1

    invoke-interface {v3, v2, v4}, Lm0/U0;->u(FF)V

    invoke-virtual/range {p6 .. p6}, Lx9/a;->a()Lm0/U0;

    move-result-object v2

    const v3, 0x3f353f7d    # 0.708f

    mul-float/2addr v3, v1

    mul-float/2addr v1, v0

    invoke-interface {v2, v3, v1}, Lm0/U0;->u(FF)V

    invoke-virtual/range {p6 .. p6}, Lx9/a;->c()Lm0/X0;

    move-result-object v0

    invoke-virtual/range {p6 .. p6}, Lx9/a;->a()Lm0/U0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lm0/X0;->a(Lm0/U0;Z)V

    invoke-virtual/range {p6 .. p6}, Lx9/a;->d()Lm0/U0;

    move-result-object v0

    invoke-interface {v0}, Lm0/U0;->a()V

    invoke-virtual/range {p6 .. p6}, Lx9/a;->c()Lm0/X0;

    move-result-object v0

    invoke-virtual/range {p6 .. p6}, Lx9/a;->c()Lm0/X0;

    move-result-object v1

    invoke-interface {v1}, Lm0/X0;->c()F

    move-result v1

    mul-float/2addr v1, p3

    invoke-virtual/range {p6 .. p6}, Lx9/a;->d()Lm0/U0;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2, v10}, Lm0/X0;->b(FFLm0/U0;Z)Z

    invoke-virtual/range {p6 .. p6}, Lx9/a;->d()Lm0/U0;

    move-result-object v1

    const/16 v8, 0x34

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v5, v9

    move-object v9, v10

    invoke-static/range {v0 .. v9}, Lo0/f;->C1(Lo0/f;Lm0/U0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    return-void
.end method

.method private static final q(LT/l;I)Lx9/c;
    .locals 24

    move-object/from16 v0, p0

    const v1, 0x1cd1368f

    invoke-interface {v0, v1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.checkbox.rememberUiCheckboxColors (UiCheckbox.kt:147)"

    move/from16 v4, p1

    invoke-static {v1, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v0, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    const v2, 0x241801dd

    invoke-interface {v0, v2}, LT/l;->U(I)V

    invoke-interface {v0, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p0 .. p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Lx9/b;

    move-object v4, v3

    sget-object v2, Lma/a$d;->a:Lma/a$d;

    invoke-virtual {v2}, Lma/a$d;->a()Lma/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v5

    invoke-virtual {v5}, Lr9/a$b;->a()J

    move-result-wide v5

    invoke-virtual {v2}, Lma/a$d;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$b;->a()J

    move-result-wide v8

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-virtual {v2}, Lma/a$d;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->a()J

    move-result-wide v9

    const/16 v15, 0xe

    const/16 v16, 0x0

    const v11, 0x3ee147ae    # 0.44f

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v11

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->c()J

    move-result-wide v13

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v15

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v15

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->g()J

    move-result-wide v17

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v19

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->f()J

    move-result-wide v21

    const/16 v23, 0x0

    invoke-direct/range {v4 .. v23}, Lx9/b;-><init>(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lx9/b;

    invoke-interface/range {p0 .. p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface/range {p0 .. p0}, LT/l;->J()V

    return-object v3
.end method
