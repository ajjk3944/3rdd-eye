.class public abstract LO/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:LE/g;

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F

.field private static final h:Lr/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LO/c;->a:F

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v0

    sput-object v0, LO/c;->b:LE/g;

    const-wide/high16 v0, 0x401e000000000000L    # 7.5

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LO/c;->c:F

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LO/c;->d:F

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LO/c;->e:F

    const/4 v0, 0x5

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LO/c;->f:F

    const/4 v0, 0x6

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LO/c;->g:F

    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0x12c

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v1, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v0

    sput-object v0, LO/c;->h:Lr/r0;

    return-void
.end method

.method private static final a(F)LO/a;
    .locals 8

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const v2, 0x3ecccccd    # 0.4f

    sub-float/2addr v1, v2

    const/4 v3, 0x0

    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v1

    const/4 v4, 0x5

    int-to-float v4, v4

    mul-float/2addr v1, v4

    const/4 v4, 0x3

    int-to-float v4, v4

    div-float/2addr v1, v4

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    sub-float/2addr p0, v0

    cmpg-float v4, p0, v3

    if-gez v4, :cond_0

    goto :goto_0

    :cond_0
    move v3, p0

    :goto_0
    const/high16 p0, 0x40000000    # 2.0f

    cmpl-float v4, v3, p0

    if-lez v4, :cond_1

    move v3, p0

    :cond_1
    float-to-double v4, v3

    const/4 p0, 0x2

    int-to-double v6, p0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float p0, v4

    const/4 v4, 0x4

    int-to-float v4, v4

    div-float/2addr p0, v4

    sub-float/2addr v3, p0

    const p0, 0x3f4ccccd    # 0.8f

    mul-float/2addr p0, v1

    const/high16 v4, -0x41800000    # -0.25f

    mul-float/2addr v2, v1

    add-float/2addr v2, v4

    add-float/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    const/16 v3, 0x168

    int-to-float v3, v3

    mul-float v4, v2, v3

    add-float/2addr p0, v2

    mul-float/2addr p0, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    new-instance v1, LO/a;

    invoke-direct {v1, v2, v4, p0, v0}, LO/a;-><init>(FFFF)V

    return-object v1
.end method

.method private static final b(LO/g;JLandroidx/compose/ui/e;LT/l;I)V
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v7, p3

    move/from16 v8, p5

    const v0, -0x1cf807d5

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v5

    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_1

    invoke-interface {v5, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v2, v8, 0x30

    const/16 v3, 0x20

    move-wide/from16 v14, p1

    if-nez v2, :cond_3

    invoke-interface {v5, v14, v15}, LT/l;->j(J)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v8, 0x180

    if-nez v2, :cond_5

    invoke-interface {v5, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v4, 0x92

    if-ne v2, v4, :cond_7

    invoke-interface {v5}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v5}, LT/l;->C()V

    move-object v13, v5

    goto/16 :goto_8

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:134)"

    invoke-static {v0, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v0, v4, :cond_9

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v0

    sget-object v4, Lm0/W0;->a:Lm0/W0$a;

    invoke-virtual {v4}, Lm0/W0$a;->a()I

    move-result v4

    invoke-interface {v0, v4}, Lm0/U0;->h(I)V

    invoke-interface {v5, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v4, v0

    check-cast v4, Lm0/U0;

    invoke-interface {v5, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_a

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v9, v0, :cond_b

    :cond_a
    new-instance v0, LO/c$d;

    invoke-direct {v0, v6}, LO/c$d;-><init>(LO/g;)V

    invoke-static {v0}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v9

    invoke-interface {v5, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v9, LT/z1;

    invoke-static {v9}, LO/c;->c(LT/z1;)F

    move-result v9

    sget-object v10, LO/c;->h:Lr/r0;

    const/16 v0, 0x30

    const/16 v16, 0x1c

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v14, v5

    move v15, v0

    invoke-static/range {v9 .. v16}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v9

    sget-object v0, LO/c$a;->a:LO/c$a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v7, v11, v0, v12, v10}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-interface {v5, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v5, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v0, v13

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v3, :cond_c

    goto :goto_5

    :cond_c
    move v12, v11

    :goto_5
    or-int/2addr v0, v12

    invoke-interface {v5, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_e

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_d

    goto :goto_6

    :cond_d
    move-object v13, v5

    goto :goto_7

    :cond_e
    :goto_6
    new-instance v12, LO/c$b;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object v2, v9

    move-object v9, v4

    move-wide/from16 v3, p1

    move-object v13, v5

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, LO/c$b;-><init>(LO/g;LT/z1;JLm0/U0;)V

    invoke-interface {v13, v12}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, v12

    :goto_7
    check-cast v1, Lmh/l;

    invoke-static {v10, v1, v13, v11}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_8
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_10

    new-instance v10, LO/c$c;

    move-object v0, v10

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LO/c$c;-><init>(LO/g;JLandroidx/compose/ui/e;I)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_10
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

.method public static final d(ZLO/g;Landroidx/compose/ui/e;JJZLT/l;II)V
    .locals 29

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v9, p9

    const/16 v0, 0x20

    const/4 v3, 0x2

    const/4 v4, 0x6

    const/16 v5, 0x10

    const v6, 0x1266a45c

    move-object/from16 v7, p8

    invoke-interface {v7, v6}, LT/l;->r(I)LT/l;

    move-result-object v7

    const/4 v8, 0x1

    and-int/lit8 v10, p10, 0x1

    const/4 v11, 0x4

    if-eqz v10, :cond_0

    or-int/lit8 v10, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v9, 0x6

    if-nez v10, :cond_2

    invoke-interface {v7, v1}, LT/l;->c(Z)Z

    move-result v10

    if-eqz v10, :cond_1

    move v10, v11

    goto :goto_0

    :cond_1
    move v10, v3

    :goto_0
    or-int/2addr v10, v9

    goto :goto_1

    :cond_2
    move v10, v9

    :goto_1
    and-int/lit8 v3, p10, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v10, v10, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_5

    invoke-interface {v7, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v0

    goto :goto_2

    :cond_4
    move v3, v5

    :goto_2
    or-int/2addr v10, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p10, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v10, v10, 0x180

    :cond_6
    move-object/from16 v12, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v12, v9, 0x180

    if-nez v12, :cond_6

    move-object/from16 v12, p2

    invoke-interface {v7, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x100

    goto :goto_4

    :cond_8
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v10, v13

    :goto_5
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_b

    and-int/lit8 v13, p10, 0x8

    if-nez v13, :cond_9

    move-wide/from16 v13, p3

    invoke-interface {v7, v13, v14}, LT/l;->j(J)Z

    move-result v15

    if-eqz v15, :cond_a

    const/16 v15, 0x800

    goto :goto_6

    :cond_9
    move-wide/from16 v13, p3

    :cond_a
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v10, v15

    goto :goto_7

    :cond_b
    move-wide/from16 v13, p3

    :goto_7
    and-int/lit16 v15, v9, 0x6000

    if-nez v15, :cond_d

    and-int/lit8 v15, p10, 0x10

    move-wide/from16 v11, p5

    if-nez v15, :cond_c

    invoke-interface {v7, v11, v12}, LT/l;->j(J)Z

    move-result v15

    if-eqz v15, :cond_c

    const/16 v15, 0x4000

    goto :goto_8

    :cond_c
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v10, v15

    goto :goto_9

    :cond_d
    move-wide/from16 v11, p5

    :goto_9
    and-int/lit8 v0, p10, 0x20

    const/high16 v15, 0x30000

    if-eqz v0, :cond_f

    or-int/2addr v10, v15

    :cond_e
    move/from16 v15, p7

    goto :goto_b

    :cond_f
    and-int/2addr v15, v9

    if-nez v15, :cond_e

    move/from16 v15, p7

    invoke-interface {v7, v15}, LT/l;->c(Z)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v10, v10, v16

    :goto_b
    const v16, 0x12493

    and-int v6, v10, v16

    const v4, 0x12492

    if-ne v6, v4, :cond_12

    invoke-interface {v7}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_c

    :cond_11
    invoke-interface {v7}, LT/l;->C()V

    move-object/from16 v3, p2

    move-wide v4, v13

    move v8, v15

    goto/16 :goto_17

    :cond_12
    :goto_c
    invoke-interface {v7}, LT/l;->q()V

    and-int/lit8 v4, v9, 0x1

    const v6, -0xe001

    const/4 v8, 0x0

    if-eqz v4, :cond_17

    invoke-interface {v7}, LT/l;->H()Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_e

    :cond_13
    invoke-interface {v7}, LT/l;->C()V

    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_14

    and-int/lit16 v10, v10, -0x1c01

    :cond_14
    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_15

    and-int/2addr v10, v6

    :cond_15
    move-object/from16 v3, p2

    :cond_16
    move-wide v4, v13

    move v0, v15

    :goto_d
    move-wide v14, v11

    goto :goto_10

    :cond_17
    :goto_e
    if-eqz v3, :cond_18

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_f

    :cond_18
    move-object/from16 v3, p2

    :goto_f
    and-int/lit8 v4, p10, 0x8

    if-eqz v4, :cond_19

    sget-object v4, LN/f0;->a:LN/f0;

    const/4 v13, 0x6

    invoke-virtual {v4, v7, v13}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v4

    invoke-virtual {v4}, LN/m;->n()J

    move-result-wide v13

    and-int/lit16 v10, v10, -0x1c01

    :cond_19
    and-int/lit8 v4, p10, 0x10

    if-eqz v4, :cond_1a

    shr-int/lit8 v4, v10, 0x9

    and-int/lit8 v4, v4, 0xe

    invoke-static {v13, v14, v7, v4}, LN/n;->b(JLT/l;I)J

    move-result-wide v4

    and-int/2addr v6, v10

    move-wide v11, v4

    move v10, v6

    :cond_1a
    if-eqz v0, :cond_16

    move v0, v8

    move-wide v4, v13

    goto :goto_d

    :goto_10
    invoke-interface {v7}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_1b

    const/4 v6, -0x1

    const-string v11, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:82)"

    const v12, 0x1266a45c

    invoke-static {v12, v10, v6, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    and-int/lit8 v6, v10, 0xe

    const/4 v11, 0x4

    if-ne v6, v11, :cond_1c

    const/4 v11, 0x1

    goto :goto_11

    :cond_1c
    move v11, v8

    :goto_11
    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_1d

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v12, v11, :cond_1e

    :cond_1d
    new-instance v11, LO/c$g;

    invoke-direct {v11, v1, v2}, LO/c$g;-><init>(ZLO/g;)V

    invoke-static {v11}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v12

    invoke-interface {v7, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1e
    check-cast v12, LT/z1;

    invoke-static {}, LN/N;->d()LT/H0;

    move-result-object v11

    invoke-interface {v7, v11}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LN/M;

    if-nez v11, :cond_1f

    const v10, -0x5052eeab

    invoke-interface {v7, v10}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->J()V

    const/4 v10, 0x0

    goto :goto_12

    :cond_1f
    const v13, 0x6081742c

    invoke-interface {v7, v13}, LT/l;->U(I)V

    sget v13, LO/c;->g:F

    shr-int/lit8 v10, v10, 0x9

    and-int/lit8 v10, v10, 0xe

    or-int/lit8 v10, v10, 0x30

    move-object/from16 p2, v11

    move-wide/from16 p3, v4

    move/from16 p5, v13

    move-object/from16 p6, v7

    move/from16 p7, v10

    invoke-interface/range {p2 .. p7}, LN/M;->a(JFLT/l;I)J

    move-result-wide v10

    invoke-interface {v7}, LT/l;->J()V

    invoke-static {v10, v11}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v10

    :goto_12
    if-eqz v10, :cond_20

    invoke-virtual {v10}, Lm0/v0;->u()J

    move-result-wide v10

    goto :goto_13

    :cond_20
    move-wide v10, v4

    :goto_13
    sget v13, LO/c;->a:F

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-static {v13, v2, v0}, LO/d;->a(Landroidx/compose/ui/e;LO/g;Z)Landroidx/compose/ui/e;

    move-result-object v19

    invoke-static {v12}, LO/c;->e(LT/z1;)Z

    move-result v12

    if-eqz v12, :cond_21

    sget v12, LO/c;->g:F

    :goto_14
    move/from16 v20, v12

    goto :goto_15

    :cond_21
    int-to-float v12, v8

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v12

    goto :goto_14

    :goto_15
    sget-object v12, LO/c;->b:LE/g;

    const/16 v27, 0x18

    const/16 v28, 0x0

    const/16 v22, 0x1

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    move-object/from16 v21, v12

    invoke-static/range {v19 .. v28}, Lj0/k;->b(Landroidx/compose/ui/e;FLm0/i1;ZJJILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-static {v13, v10, v11, v12}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v10

    sget-object v11, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v11}, Lf0/c$a;->o()Lf0/c;

    move-result-object v11

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v11

    invoke-static {v7, v8}, LT/j;->a(LT/l;I)I

    move-result v12

    invoke-interface {v7}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v7, v10}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v7}, LT/l;->x()LT/f;

    move-result-object v20

    if-nez v20, :cond_22

    invoke-static {}, LT/j;->c()V

    :cond_22
    invoke-interface {v7}, LT/l;->u()V

    invoke-interface {v7}, LT/l;->o()Z

    move-result v20

    if-eqz v20, :cond_23

    invoke-interface {v7, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_16

    :cond_23
    invoke-interface {v7}, LT/l;->I()V

    :goto_16
    invoke-static {v7}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    move/from16 v20, v0

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v0

    invoke-static {v8, v11, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v8, v13, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v8}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_24

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_25

    :cond_24
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v8, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v8, v11, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_25
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v8, v10, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const/16 v0, 0x64

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    invoke-static {v0, v8, v11, v12, v11}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v12

    new-instance v0, LO/c$e;

    invoke-direct {v0, v14, v15, v2}, LO/c$e;-><init>(JLO/g;)V

    const/16 v8, 0x36

    const v11, 0x6e7db0f7

    const/4 v13, 0x1

    invoke-static {v11, v13, v0, v7, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    or-int/lit16 v6, v6, 0x6180

    const/16 v17, 0xa

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-wide/from16 v18, v14

    move-object v14, v0

    move-object v15, v7

    move/from16 v16, v6

    invoke-static/range {v10 .. v17}, Lq/j;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lr/H;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v7}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {}, LT/o;->P()V

    :cond_26
    move-wide/from16 v11, v18

    move/from16 v8, v20

    :goto_17
    invoke-interface {v7}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_27

    new-instance v14, LO/c$f;

    move-object v0, v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-wide v6, v11

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LO/c$f;-><init>(ZLO/g;Landroidx/compose/ui/e;JJZII)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_27
    return-void
.end method

.method private static final e(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(F)LO/a;
    .locals 0

    invoke-static {p0}, LO/c;->a(F)LO/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LO/g;JLandroidx/compose/ui/e;LT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LO/c;->b(LO/g;JLandroidx/compose/ui/e;LT/l;I)V

    return-void
.end method

.method public static final synthetic h(Lo0/f;Lm0/U0;Ll0/i;JFLO/a;)V
    .locals 0

    invoke-static/range {p0 .. p6}, LO/c;->k(Lo0/f;Lm0/U0;Ll0/i;JFLO/a;)V

    return-void
.end method

.method public static final synthetic i()F
    .locals 1

    sget v0, LO/c;->c:F

    return v0
.end method

.method public static final synthetic j()F
    .locals 1

    sget v0, LO/c;->d:F

    return v0
.end method

.method private static final k(Lo0/f;Lm0/U0;Ll0/i;JFLO/a;)V
    .locals 14

    move-object v0, p0

    move-object v2, p1

    invoke-interface {p1}, Lm0/U0;->a()V

    const/4 v1, 0x0

    invoke-interface {p1, v1, v1}, Lm0/U0;->n(FF)V

    sget v3, LO/c;->e:F

    invoke-interface {p0, v3}, LY0/d;->d1(F)F

    move-result v4

    invoke-virtual/range {p6 .. p6}, LO/a;->c()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-interface {p1, v4, v1}, Lm0/U0;->u(FF)V

    invoke-interface {p0, v3}, LY0/d;->d1(F)F

    move-result v1

    invoke-virtual/range {p6 .. p6}, LO/a;->c()F

    move-result v4

    mul-float/2addr v1, v4

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float/2addr v1, v4

    sget v4, LO/c;->f:F

    invoke-interface {p0, v4}, LY0/d;->d1(F)F

    move-result v4

    invoke-virtual/range {p6 .. p6}, LO/a;->c()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-interface {p1, v1, v4}, Lm0/U0;->u(FF)V

    invoke-virtual/range {p2 .. p2}, Ll0/i;->r()F

    move-result v1

    invoke-virtual/range {p2 .. p2}, Ll0/i;->j()F

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    invoke-interface {p0, v3}, LY0/d;->d1(F)F

    move-result v3

    invoke-virtual/range {p6 .. p6}, LO/a;->c()F

    move-result v5

    mul-float/2addr v3, v5

    div-float/2addr v3, v4

    invoke-virtual/range {p2 .. p2}, Ll0/i;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->m(J)F

    move-result v5

    add-float/2addr v1, v5

    sub-float/2addr v1, v3

    invoke-virtual/range {p2 .. p2}, Ll0/i;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->n(J)F

    move-result v3

    sget v5, LO/c;->d:F

    invoke-interface {p0, v5}, LY0/d;->d1(F)F

    move-result v5

    div-float/2addr v5, v4

    add-float/2addr v3, v5

    invoke-static {v1, v3}, Ll0/h;->a(FF)J

    move-result-wide v3

    invoke-interface {p1, v3, v4}, Lm0/U0;->r(J)V

    invoke-interface {p1}, Lm0/U0;->close()V

    invoke-virtual/range {p6 .. p6}, LO/a;->a()F

    move-result v1

    invoke-interface {p0}, Lo0/f;->D1()J

    move-result-wide v3

    invoke-interface {p0}, Lo0/f;->k1()Lo0/d;

    move-result-object v11

    invoke-interface {v11}, Lo0/d;->c()J

    move-result-wide v12

    invoke-interface {v11}, Lo0/d;->d()Lm0/n0;

    move-result-object v5

    invoke-interface {v5}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v11}, Lo0/d;->e()Lo0/h;

    move-result-object v5

    invoke-interface {v5, v1, v3, v4}, Lo0/h;->i(FJ)V

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide/from16 v3, p3

    move/from16 v5, p5

    invoke-static/range {v1 .. v10}, Lo0/f;->C1(Lo0/f;Lm0/U0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v11}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    invoke-interface {v11, v12, v13}, Lo0/d;->f(J)V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {v11}, Lo0/d;->d()Lm0/n0;

    move-result-object v1

    invoke-interface {v1}, Lm0/n0;->r()V

    invoke-interface {v11, v12, v13}, Lo0/d;->f(J)V

    throw v0
.end method
