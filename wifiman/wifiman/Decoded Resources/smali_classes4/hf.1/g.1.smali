.class public abstract Lhf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf/g$a;
    }
.end annotation


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lhf/g;->a:F

    const/16 v0, 0xf0

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lhf/g;->b:F

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lhf/g;->c:F

    return-void
.end method

.method public static synthetic a(Lhf/K;FLo0/f;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lhf/g;->d(Lhf/K;FLo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;FLff/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Lhf/g;->e(Landroidx/compose/ui/e;FLff/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;FLff/a;LT/l;II)V
    .locals 14

    move v6, p1

    move-object/from16 v7, p2

    move/from16 v8, p4

    const-string v0, "direction"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f27f506

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v9

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move-object v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move-object v2, p0

    invoke-interface {v9, p0}, LT/l;->T(Ljava/lang/Object;)Z

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
    move-object v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, p5, 0x2

    const/16 v10, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_5

    invoke-interface {v9, p1}, LT/l;->g(F)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v10

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    :goto_4
    move v11, v3

    goto :goto_6

    :cond_7
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_6

    invoke-interface {v9, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x100

    goto :goto_5

    :cond_8
    const/16 v4, 0x80

    :goto_5
    or-int/2addr v3, v4

    goto :goto_4

    :goto_6
    and-int/lit16 v3, v11, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_a

    invoke-interface {v9}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v9}, LT/l;->C()V

    move-object v1, v2

    goto/16 :goto_a

    :cond_a
    :goto_7
    if-eqz v1, :cond_b

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v12, v1

    goto :goto_8

    :cond_b
    move-object v12, v2

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.component.SpeedtestResultSpeedIndicator (SpeedtesResultSpeedIndicator.kt:60)"

    invoke-static {v0, v11, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    shr-int/lit8 v0, v11, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v7, v9, v0}, Lhf/g;->h(Lff/a;LT/l;I)Lhf/K;

    move-result-object v13

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v12

    move v1, p1

    invoke-static/range {v0 .. v5}, Ls/Y;->c(Landroidx/compose/ui/e;FLsh/e;IILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget v1, Lhf/g;->b:F

    sget v2, Lhf/g;->a:F

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v0

    sget v1, Lhf/g;->c:F

    invoke-static {v1}, LE/h;->d(F)LE/g;

    move-result-object v1

    invoke-static {v0, v1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v0

    const v1, 0x4a81e193    # 4255945.5f

    invoke-interface {v9, v1}, LT/l;->U(I)V

    invoke-interface {v9, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v2, v11, 0x70

    if-ne v2, v10, :cond_d

    const/4 v2, 0x1

    goto :goto_9

    :cond_d
    move v2, v3

    :goto_9
    or-int/2addr v1, v2

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_e

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_f

    :cond_e
    new-instance v2, Lhf/e;

    invoke-direct {v2, v13, p1}, Lhf/e;-><init>(Lhf/K;F)V

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lmh/l;

    invoke-interface {v9}, LT/l;->J()V

    invoke-static {v0, v2, v9, v3}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    move-object v1, v12

    :goto_a
    invoke-interface {v9}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_11

    new-instance v10, Lhf/f;

    move-object v0, v10

    move v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lhf/f;-><init>(Landroidx/compose/ui/e;FLff/a;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void
.end method

.method private static final d(Lhf/K;FLo0/f;)LYg/J;
    .locals 3

    const-string v0, "$this$Canvas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v0

    invoke-virtual {p0}, Lhf/K;->a()J

    move-result-wide v1

    invoke-static {p2, v1, v2, v0}, Lhf/g;->g(Lo0/f;JF)V

    const/4 v1, 0x0

    invoke-virtual {p0}, Lhf/K;->b()Lm0/l0;

    move-result-object p0

    invoke-static {p2, v1, p1, p0, v0}, Lhf/g;->f(Lo0/f;FFLm0/l0;F)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;FLff/a;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, Lhf/g;->c(Landroidx/compose/ui/e;FLff/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
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

    invoke-static {p0, p2, v0, p1, p3}, Lhf/g;->f(Lo0/f;FFLm0/l0;F)V

    return-void
.end method

.method private static final h(Lff/a;LT/l;I)Lhf/K;
    .locals 8

    const v0, 0x7c65b54a

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.component.rememberColors (SpeedtesResultSpeedIndicator.kt:33)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p1, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    const v1, 0x25512faf

    invoke-interface {p1, v1}, LT/l;->U(I)V

    invoke-interface {p1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v2, p2, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x1

    const/4 v4, 0x4

    if-le v2, v4, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v4, :cond_3

    :cond_2
    move p2, v3

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p2, v1

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_7

    :cond_4
    sget-object p2, Lhf/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x0

    if-eq p0, v3, :cond_6

    const/4 v1, 0x2

    if-ne p0, v1, :cond_5

    new-instance p0, Lhf/K;

    sget-object v1, Lm0/l0;->b:Lm0/l0$a;

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->k()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->k()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    filled-new-array {v2, v3}, [Lm0/v0;

    move-result-object v2

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lm0/l0$a;->b(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v1

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->f()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3, p2}, Lhf/K;-><init>(Lm0/l0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v1, p0

    goto :goto_2

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    new-instance p0, Lhf/K;

    sget-object v1, Lm0/l0;->b:Lm0/l0$a;

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->a()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    filled-new-array {v2, v3}, [Lm0/v0;

    move-result-object v2

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lm0/l0$a;->b(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;

    move-result-object v1

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->f()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3, p2}, Lhf/K;-><init>(Lm0/l0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :goto_2
    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lhf/K;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    invoke-interface {p1}, LT/l;->J()V

    return-object v1
.end method
