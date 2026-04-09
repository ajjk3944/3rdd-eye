.class public abstract LBe/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBe/C$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;IFLBe/z;JIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, LBe/C;->d(Landroidx/compose/ui/e;IFLBe/z;JIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lr/T$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LBe/C;->f(Lr/T$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;IFLBe/z;JLT/l;II)V
    .locals 21

    move/from16 v7, p7

    const/16 v1, 0x30

    const/4 v2, 0x6

    const/16 v3, 0x10

    const v4, 0x663a608a

    move-object/from16 v5, p6

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v5

    const/4 v6, 0x1

    and-int/lit8 v8, p8, 0x1

    const/4 v9, 0x2

    const/4 v10, 0x4

    if-eqz v8, :cond_0

    or-int/lit8 v11, v7, 0x6

    move v12, v11

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v11, v7, 0x6

    if-nez v11, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v5, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    move v12, v10

    goto :goto_0

    :cond_1
    move v12, v9

    :goto_0
    or-int/2addr v12, v7

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    move v12, v7

    :goto_1
    and-int/lit8 v13, p8, 0x2

    if-eqz v13, :cond_4

    or-int/2addr v12, v1

    :cond_3
    move/from16 v14, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v14, v7, 0x30

    if-nez v14, :cond_3

    move/from16 v14, p1

    invoke-interface {v5, v14}, LT/l;->i(I)Z

    move-result v15

    if-eqz v15, :cond_5

    const/16 v15, 0x20

    goto :goto_2

    :cond_5
    move v15, v3

    :goto_2
    or-int/2addr v12, v15

    :goto_3
    and-int/lit8 v15, p8, 0x4

    if-eqz v15, :cond_7

    or-int/lit16 v12, v12, 0x180

    :cond_6
    move/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v7, 0x180

    if-nez v10, :cond_6

    move/from16 v10, p2

    invoke-interface {v5, v10}, LT/l;->g(F)Z

    move-result v17

    if-eqz v17, :cond_8

    const/16 v17, 0x100

    goto :goto_4

    :cond_8
    const/16 v17, 0x80

    :goto_4
    or-int v12, v12, v17

    :goto_5
    and-int/lit8 v17, p8, 0x8

    if-eqz v17, :cond_a

    or-int/lit16 v12, v12, 0xc00

    :cond_9
    move-object/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v7, 0xc00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-interface {v5, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_b

    const/16 v18, 0x800

    goto :goto_6

    :cond_b
    const/16 v18, 0x400

    :goto_6
    or-int v12, v12, v18

    :goto_7
    and-int/lit16 v2, v7, 0x6000

    if-nez v2, :cond_e

    and-int/lit8 v2, p8, 0x10

    if-nez v2, :cond_c

    move-wide/from16 v1, p4

    invoke-interface {v5, v1, v2}, LT/l;->j(J)Z

    move-result v20

    if-eqz v20, :cond_d

    const/16 v20, 0x4000

    goto :goto_8

    :cond_c
    move-wide/from16 v1, p4

    :cond_d
    const/16 v20, 0x2000

    :goto_8
    or-int v12, v12, v20

    goto :goto_9

    :cond_e
    move-wide/from16 v1, p4

    :goto_9
    and-int/lit16 v4, v12, 0x2493

    const/16 v0, 0x2492

    if-ne v4, v0, :cond_11

    invoke-interface {v5}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v5}, LT/l;->C()V

    :cond_10
    :goto_a
    move-object v4, v9

    move v3, v10

    move-wide v8, v1

    move-object v1, v11

    move v2, v14

    goto/16 :goto_11

    :cond_11
    :goto_b
    invoke-interface {v5}, LT/l;->q()V

    and-int/lit8 v0, v7, 0x1

    const v4, -0xe001

    if-eqz v0, :cond_13

    invoke-interface {v5}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v5}, LT/l;->C()V

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_18

    and-int/2addr v12, v4

    goto :goto_d

    :cond_13
    :goto_c
    if-eqz v8, :cond_14

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v11, v0

    :cond_14
    if-eqz v13, :cond_15

    const/4 v14, 0x3

    :cond_15
    if-eqz v15, :cond_16

    const/4 v0, 0x3

    int-to-float v8, v0

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v0

    move v10, v0

    :cond_16
    if-eqz v17, :cond_17

    sget-object v0, LBe/z;->LTR:LBe/z;

    move-object v9, v0

    :cond_17
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_18

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v0

    invoke-interface {v5, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v0

    and-int/2addr v12, v4

    move-wide v1, v0

    :cond_18
    :goto_d
    invoke-interface {v5}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    const/4 v0, -0x1

    const-string v3, "com.ui.wifiman.ui.component.ProgressDots (ProgressDots.kt:49)"

    const v4, 0x663a608a

    invoke-static {v4, v12, v0, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_19
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3, v10}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, v0, v5, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v5, v3}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v5, v11}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v13

    sget-object v15, LE0/g;->K:LE0/g$a;

    invoke-virtual {v15}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_1a

    invoke-static {}, LT/j;->c()V

    :cond_1a
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_1b

    invoke-interface {v5, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_e

    :cond_1b
    invoke-interface {v5}, LT/l;->I()V

    :goto_e
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v15}, LE0/g$a;->e()Lmh/p;

    move-result-object v3

    invoke-static {v6, v0, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v6, v8, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v6}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_1c

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    :cond_1c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1d
    invoke-virtual {v15}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v6, v13, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    const-string v0, "ProgressDots"

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v5, v4, v3}, Lr/P;->c(Ljava/lang/String;LT/l;II)Lr/O;

    move-result-object v0

    const v4, -0x2d656701

    invoke-interface {v5, v4}, LT/l;->U(I)V

    invoke-static {v3, v14}, Lsh/m;->s(II)Lsh/i;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_22

    move-object v4, v3

    check-cast v4, LZg/Q;

    invoke-virtual {v4}, LZg/Q;->d()I

    move-result v4

    const v6, -0x2d655bb8

    invoke-interface {v5, v6}, LT/l;->U(I)V

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v8, LBe/C$a;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v8, v8, v13

    const/4 v13, 0x1

    if-eq v8, v13, :cond_21

    const/4 v13, 0x2

    if-eq v8, v13, :cond_20

    const/4 v15, 0x3

    if-eq v8, v15, :cond_1f

    const/4 v15, 0x4

    if-ne v8, v15, :cond_1e

    const v8, -0x798159e4

    invoke-interface {v5, v8}, LT/l;->U(I)V

    mul-int/lit16 v4, v4, 0x1f4

    sget v8, Lr/O;->f:I

    invoke-static {v0, v4, v5, v8}, LBe/C;->e(Lr/O;ILT/l;I)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v6, v4}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {v5}, LT/l;->J()V

    goto :goto_10

    :cond_1e
    const v0, -0x79818bae

    invoke-interface {v5, v0}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1f
    const/4 v15, 0x4

    const v8, -0x79816d73

    invoke-interface {v5, v8}, LT/l;->U(I)V

    sub-int v4, v14, v4

    const/4 v8, 0x1

    sub-int/2addr v4, v8

    mul-int/lit16 v4, v4, 0x1f4

    sget v8, Lr/O;->f:I

    invoke-static {v0, v4, v5, v8}, LBe/C;->e(Lr/O;ILT/l;I)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v6, v4}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {v5}, LT/l;->J()V

    goto :goto_10

    :cond_20
    const/4 v15, 0x4

    const v4, -0x7981787a

    invoke-interface {v5, v4}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->J()V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    goto :goto_10

    :cond_21
    const/4 v13, 0x2

    const/4 v15, 0x4

    const v4, -0x798183da

    invoke-interface {v5, v4}, LT/l;->U(I)V

    invoke-interface {v5}, LT/l;->J()V

    const v4, 0x3e99999a    # 0.3f

    invoke-static {v6, v4}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    :goto_10
    invoke-interface {v5}, LT/l;->J()V

    const/4 v6, 0x3

    shr-int/lit8 v8, v12, 0x3

    and-int/lit8 v8, v8, 0x70

    const/16 v16, 0x6

    shr-int/lit8 v6, v12, 0x6

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v6, v8

    const/4 v8, 0x0

    move-object/from16 p0, v4

    move/from16 p1, v10

    move-wide/from16 p2, v1

    move-object/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v8

    invoke-static/range {p0 .. p6}, LBe/i;->b(Landroidx/compose/ui/e;FJLT/l;II)V

    goto/16 :goto_f

    :cond_22
    invoke-interface {v5}, LT/l;->J()V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_a

    :goto_11
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_23

    new-instance v11, LBe/B;

    move-object v0, v11

    move-wide v5, v8

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LBe/B;-><init>(Landroidx/compose/ui/e;IFLBe/z;JII)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_23
    return-void
.end method

.method private static final d(Landroidx/compose/ui/e;IFLBe/z;JIILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, LBe/C;->c(Landroidx/compose/ui/e;IFLBe/z;JLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Lr/O;ILT/l;I)LT/z1;
    .locals 8

    const v1, 0x5d2c521d

    invoke-interface {p2, v1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.component.animateAlphaWithDelay (ProgressDots.kt:77)"

    invoke-static {v1, p3, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v1, -0xa28e5bd

    invoke-interface {p2, v1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    new-instance v1, LBe/A;

    invoke-direct {v1}, LBe/A;-><init>()V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {v1}, Lr/j;->f(Lmh/l;)Lr/T;

    move-result-object v2

    sget-object v1, Lr/l0;->a:Lr/l0$a;

    invoke-virtual {v1}, Lr/l0$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Lr/k0;->a(II)J

    move-result-wide v4

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v3

    sget v1, Lr/O;->f:I

    or-int/lit16 v1, v1, 0x61b0

    and-int/lit8 v0, p3, 0xe

    or-int/2addr v0, v1

    sget v1, Lr/N;->d:I

    shl-int/lit8 v1, v1, 0x9

    or-int v6, v0, v1

    const/4 v7, 0x0

    const v1, 0x3e99999a    # 0.3f

    const v2, 0x3e99999a    # 0.3f

    const-string v4, "animateAlphaWithDelay"

    move-object v0, p0

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lr/P;->a(Lr/O;FFLr/N;Ljava/lang/String;LT/l;II)LT/z1;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-object v0
.end method

.method private static final f(Lr/T$b;)LYg/J;
    .locals 2

    const-string v0, "$this$keyframes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x5dc

    invoke-virtual {p0, v0}, Lr/U;->d(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0xfa

    invoke-virtual {p0, v0, v1}, Lr/T$b;->f(Ljava/lang/Object;I)Lr/T$a;

    move-result-object v0

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lr/U;->e(Lr/S;Lr/E;)Lr/S;

    const v0, 0x3e99999a    # 0.3f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x1f4

    invoke-virtual {p0, v0, v1}, Lr/T$b;->f(Ljava/lang/Object;I)Lr/T$a;

    move-result-object v0

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lr/U;->e(Lr/S;Lr/E;)Lr/S;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
