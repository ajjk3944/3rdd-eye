.class public final Lo0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/a$a;
    }
.end annotation


# instance fields
.field private final a:Lo0/a$a;

.field private final b:Lo0/d;

.field private c:Lm0/S0;

.field private d:Lm0/S0;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lo0/a$a;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lo0/a$a;-><init>(LY0/d;LY0/t;Lm0/n0;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, p0, Lo0/a;->a:Lo0/a$a;

    new-instance v0, Lo0/a$b;

    invoke-direct {v0, p0}, Lo0/a$b;-><init>(Lo0/a;)V

    iput-object v0, p0, Lo0/a;->b:Lo0/d;

    return-void
.end method

.method static synthetic A(Lo0/a;Lm0/l0;FFIILm0/V0;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;
    .locals 12

    move/from16 v0, p11

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    sget-object v0, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {v0}, Lo0/f$a;->b()I

    move-result v0

    move v11, v0

    goto :goto_0

    :cond_0
    move/from16 v11, p10

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lo0/a;->z(Lm0/l0;FFIILm0/V0;FLm0/w0;II)Lm0/S0;

    move-result-object v0

    return-object v0
.end method

.method private final J(JF)J
    .locals 9

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p3, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lm0/v0;->n(J)F

    move-result v0

    mul-float v3, v0, p3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-wide v1, p1

    invoke-static/range {v1 .. v8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method private final L()Lm0/S0;
    .locals 2

    iget-object v0, p0, Lo0/a;->c:Lm0/S0;

    if-nez v0, :cond_0

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object v0

    sget-object v1, Lm0/T0;->a:Lm0/T0$a;

    invoke-virtual {v1}, Lm0/T0$a;->a()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->H(I)V

    iput-object v0, p0, Lo0/a;->c:Lm0/S0;

    :cond_0
    return-object v0
.end method

.method private final M()Lm0/S0;
    .locals 2

    iget-object v0, p0, Lo0/a;->d:Lm0/S0;

    if-nez v0, :cond_0

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object v0

    sget-object v1, Lm0/T0;->a:Lm0/T0$a;

    invoke-virtual {v1}, Lm0/T0$a;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->H(I)V

    iput-object v0, p0, Lo0/a;->d:Lm0/S0;

    :cond_0
    return-object v0
.end method

.method private final O(Lo0/g;)Lm0/S0;
    .locals 3

    sget-object v0, Lo0/j;->a:Lo0/j;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo0/a;->L()Lm0/S0;

    move-result-object p1

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, Lo0/k;

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lo0/a;->M()Lm0/S0;

    move-result-object v0

    invoke-interface {v0}, Lm0/S0;->L()F

    move-result v1

    check-cast p1, Lo0/k;

    invoke-virtual {p1}, Lo0/k;->f()F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo0/k;->f()F

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->K(F)V

    :goto_0
    invoke-interface {v0}, Lm0/S0;->F()I

    move-result v1

    invoke-virtual {p1}, Lo0/k;->b()I

    move-result v2

    invoke-static {v1, v2}, Lm0/k1;->e(II)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lo0/k;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->u(I)V

    :cond_2
    invoke-interface {v0}, Lm0/S0;->w()F

    move-result v1

    invoke-virtual {p1}, Lo0/k;->d()F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lo0/k;->d()F

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->A(F)V

    :goto_1
    invoke-interface {v0}, Lm0/S0;->s()I

    move-result v1

    invoke-virtual {p1}, Lo0/k;->c()I

    move-result v2

    invoke-static {v1, v2}, Lm0/l1;->e(II)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lo0/k;->c()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->G(I)V

    :cond_4
    invoke-interface {v0}, Lm0/S0;->J()Lm0/V0;

    move-result-object v1

    invoke-virtual {p1}, Lo0/k;->e()Lm0/V0;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1}, Lo0/k;->e()Lm0/V0;

    move-result-object p1

    invoke-interface {v0, p1}, Lm0/S0;->B(Lm0/V0;)V

    :cond_5
    move-object p1, v0

    :goto_2
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final b(JLo0/g;FLm0/w0;II)Lm0/S0;
    .locals 2

    invoke-direct {p0, p3}, Lo0/a;->O(Lo0/g;)Lm0/S0;

    move-result-object p3

    invoke-direct {p0, p1, p2, p4}, Lo0/a;->J(JF)J

    move-result-wide p1

    invoke-interface {p3}, Lm0/S0;->c()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lm0/v0;->m(JJ)Z

    move-result p4

    if-nez p4, :cond_0

    invoke-interface {p3, p1, p2}, Lm0/S0;->I(J)V

    :cond_0
    invoke-interface {p3}, Lm0/S0;->z()Landroid/graphics/Shader;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-interface {p3, p1}, Lm0/S0;->y(Landroid/graphics/Shader;)V

    :cond_1
    invoke-interface {p3}, Lm0/S0;->p()Lm0/w0;

    move-result-object p1

    invoke-static {p1, p5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {p3, p5}, Lm0/S0;->D(Lm0/w0;)V

    :cond_2
    invoke-interface {p3}, Lm0/S0;->r()I

    move-result p1

    invoke-static {p1, p6}, Lm0/d0;->E(II)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {p3, p6}, Lm0/S0;->v(I)V

    :cond_3
    invoke-interface {p3}, Lm0/S0;->E()I

    move-result p1

    invoke-static {p1, p7}, Lm0/E0;->d(II)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {p3, p7}, Lm0/S0;->C(I)V

    :cond_4
    return-object p3
.end method

.method static synthetic p(Lo0/a;JLo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;
    .locals 9

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    sget-object v0, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {v0}, Lo0/f$a;->b()I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lo0/a;->b(JLo0/g;FLm0/w0;II)Lm0/S0;

    move-result-object v0

    return-object v0
.end method

.method private final q(Lm0/l0;Lo0/g;FLm0/w0;II)Lm0/S0;
    .locals 4

    invoke-direct {p0, p2}, Lo0/a;->O(Lo0/g;)Lm0/S0;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lo0/f;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p2, p3}, Lm0/l0;->a(JLm0/S0;F)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lm0/S0;->z()Landroid/graphics/Shader;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lm0/S0;->y(Landroid/graphics/Shader;)V

    :cond_1
    invoke-interface {p2}, Lm0/S0;->c()J

    move-result-wide v0

    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lm0/S0;->I(J)V

    :cond_2
    invoke-interface {p2}, Lm0/S0;->b()F

    move-result p1

    cmpg-float p1, p1, p3

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p2, p3}, Lm0/S0;->a(F)V

    :goto_0
    invoke-interface {p2}, Lm0/S0;->p()Lm0/w0;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {p2, p4}, Lm0/S0;->D(Lm0/w0;)V

    :cond_4
    invoke-interface {p2}, Lm0/S0;->r()I

    move-result p1

    invoke-static {p1, p5}, Lm0/d0;->E(II)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-interface {p2, p5}, Lm0/S0;->v(I)V

    :cond_5
    invoke-interface {p2}, Lm0/S0;->E()I

    move-result p1

    invoke-static {p1, p6}, Lm0/E0;->d(II)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-interface {p2, p6}, Lm0/S0;->C(I)V

    :cond_6
    return-object p2
.end method

.method static synthetic r(Lo0/a;Lm0/l0;Lo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    sget-object p6, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {p6}, Lo0/f$a;->b()I

    move-result p6

    :cond_0
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lo0/a;->q(Lm0/l0;Lo0/g;FLm0/w0;II)Lm0/S0;

    move-result-object p0

    return-object p0
.end method

.method private final s(JFFIILm0/V0;FLm0/w0;II)Lm0/S0;
    .locals 3

    invoke-direct {p0}, Lo0/a;->M()Lm0/S0;

    move-result-object v0

    invoke-direct {p0, p1, p2, p8}, Lo0/a;->J(JF)J

    move-result-wide p1

    invoke-interface {v0}, Lm0/S0;->c()J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Lm0/v0;->m(JJ)Z

    move-result p8

    if-nez p8, :cond_0

    invoke-interface {v0, p1, p2}, Lm0/S0;->I(J)V

    :cond_0
    invoke-interface {v0}, Lm0/S0;->z()Landroid/graphics/Shader;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Lm0/S0;->y(Landroid/graphics/Shader;)V

    :cond_1
    invoke-interface {v0}, Lm0/S0;->p()Lm0/w0;

    move-result-object p1

    invoke-static {p1, p9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {v0, p9}, Lm0/S0;->D(Lm0/w0;)V

    :cond_2
    invoke-interface {v0}, Lm0/S0;->r()I

    move-result p1

    invoke-static {p1, p10}, Lm0/d0;->E(II)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {v0, p10}, Lm0/S0;->v(I)V

    :cond_3
    invoke-interface {v0}, Lm0/S0;->L()F

    move-result p1

    cmpg-float p1, p1, p3

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v0, p3}, Lm0/S0;->K(F)V

    :goto_0
    invoke-interface {v0}, Lm0/S0;->w()F

    move-result p1

    cmpg-float p1, p1, p4

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {v0, p4}, Lm0/S0;->A(F)V

    :goto_1
    invoke-interface {v0}, Lm0/S0;->F()I

    move-result p1

    invoke-static {p1, p5}, Lm0/k1;->e(II)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-interface {v0, p5}, Lm0/S0;->u(I)V

    :cond_6
    invoke-interface {v0}, Lm0/S0;->s()I

    move-result p1

    invoke-static {p1, p6}, Lm0/l1;->e(II)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-interface {v0, p6}, Lm0/S0;->G(I)V

    :cond_7
    invoke-interface {v0}, Lm0/S0;->J()Lm0/V0;

    move-result-object p1

    invoke-static {p1, p7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-interface {v0, p7}, Lm0/S0;->B(Lm0/V0;)V

    :cond_8
    invoke-interface {v0}, Lm0/S0;->E()I

    move-result p1

    invoke-static {p1, p11}, Lm0/E0;->d(II)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-interface {v0, p11}, Lm0/S0;->C(I)V

    :cond_9
    return-object v0
.end method

.method static synthetic v(Lo0/a;JFFIILm0/V0;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;
    .locals 13

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    sget-object v0, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {v0}, Lo0/f$a;->b()I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_0
    move/from16 v12, p11

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lo0/a;->s(JFFIILm0/V0;FLm0/w0;II)Lm0/S0;

    move-result-object v0

    return-object v0
.end method

.method private final z(Lm0/l0;FFIILm0/V0;FLm0/w0;II)Lm0/S0;
    .locals 3

    invoke-direct {p0}, Lo0/a;->M()Lm0/S0;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lo0/f;->c()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, v0, p7}, Lm0/l0;->a(JLm0/S0;F)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lm0/S0;->b()F

    move-result p1

    cmpg-float p1, p1, p7

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p7}, Lm0/S0;->a(F)V

    :goto_0
    invoke-interface {v0}, Lm0/S0;->p()Lm0/w0;

    move-result-object p1

    invoke-static {p1, p8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {v0, p8}, Lm0/S0;->D(Lm0/w0;)V

    :cond_2
    invoke-interface {v0}, Lm0/S0;->r()I

    move-result p1

    invoke-static {p1, p9}, Lm0/d0;->E(II)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {v0, p9}, Lm0/S0;->v(I)V

    :cond_3
    invoke-interface {v0}, Lm0/S0;->L()F

    move-result p1

    cmpg-float p1, p1, p2

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v0, p2}, Lm0/S0;->K(F)V

    :goto_1
    invoke-interface {v0}, Lm0/S0;->w()F

    move-result p1

    cmpg-float p1, p1, p3

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v0, p3}, Lm0/S0;->A(F)V

    :goto_2
    invoke-interface {v0}, Lm0/S0;->F()I

    move-result p1

    invoke-static {p1, p4}, Lm0/k1;->e(II)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-interface {v0, p4}, Lm0/S0;->u(I)V

    :cond_6
    invoke-interface {v0}, Lm0/S0;->s()I

    move-result p1

    invoke-static {p1, p5}, Lm0/l1;->e(II)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-interface {v0, p5}, Lm0/S0;->G(I)V

    :cond_7
    invoke-interface {v0}, Lm0/S0;->J()Lm0/V0;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-interface {v0, p6}, Lm0/S0;->B(Lm0/V0;)V

    :cond_8
    invoke-interface {v0}, Lm0/S0;->E()I

    move-result p1

    invoke-static {p1, p10}, Lm0/E0;->d(II)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-interface {v0, p10}, Lm0/S0;->C(I)V

    :cond_9
    return-object v0
.end method


# virtual methods
.method public final B()Lo0/a$a;
    .locals 1

    iget-object v0, p0, Lo0/a;->a:Lo0/a$a;

    return-object v0
.end method

.method public H1(Lm0/J0;JJJJFLo0/g;Lm0/w0;II)V
    .locals 19

    move-object/from16 v7, p0

    iget-object v0, v7, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v8

    const/4 v1, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p11

    move/from16 v3, p10

    move-object/from16 v4, p12

    move/from16 v5, p13

    move/from16 v6, p14

    invoke-direct/range {v0 .. v6}, Lo0/a;->q(Lm0/l0;Lo0/g;FLm0/w0;II)Lm0/S0;

    move-result-object v18

    move-object/from16 v9, p1

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    invoke-interface/range {v8 .. v18}, Lm0/n0;->s(Lm0/J0;JJJJLm0/S0;)V

    return-void
.end method

.method public U(Lm0/l0;FFZJJFLo0/g;Lm0/w0;I)V
    .locals 19

    move-object/from16 v9, p0

    iget-object v0, v9, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v10

    invoke-static/range {p5 .. p6}, Ll0/g;->m(J)F

    move-result v11

    invoke-static/range {p5 .. p6}, Ll0/g;->n(J)F

    move-result v12

    invoke-static/range {p5 .. p6}, Ll0/g;->m(J)F

    move-result v0

    invoke-static/range {p7 .. p8}, Ll0/m;->i(J)F

    move-result v1

    add-float v13, v0, v1

    invoke-static/range {p5 .. p6}, Ll0/g;->n(J)F

    move-result v0

    invoke-static/range {p7 .. p8}, Ll0/m;->g(J)F

    move-result v1

    add-float v14, v0, v1

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p10

    move/from16 v3, p9

    move-object/from16 v4, p11

    move/from16 v5, p12

    invoke-static/range {v0 .. v8}, Lo0/a;->r(Lo0/a;Lm0/l0;Lo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v18

    move/from16 v15, p2

    move/from16 v16, p3

    move/from16 v17, p4

    invoke-interface/range {v10 .. v18}, Lm0/n0;->g(FFFFFFZLm0/S0;)V

    return-void
.end method

.method public X0(JFFZJJFLo0/g;Lm0/w0;I)V
    .locals 16

    move-object/from16 v10, p0

    iget-object v0, v10, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v11

    invoke-static/range {p6 .. p7}, Ll0/g;->m(J)F

    move-result v12

    invoke-static/range {p6 .. p7}, Ll0/g;->n(J)F

    move-result v13

    invoke-static/range {p6 .. p7}, Ll0/g;->m(J)F

    move-result v0

    invoke-static/range {p8 .. p9}, Ll0/m;->i(J)F

    move-result v1

    add-float v14, v0, v1

    invoke-static/range {p6 .. p7}, Ll0/g;->n(J)F

    move-result v0

    invoke-static/range {p8 .. p9}, Ll0/m;->g(J)F

    move-result v1

    add-float v15, v0, v1

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p11

    move/from16 v4, p10

    move-object/from16 v5, p12

    move/from16 v6, p13

    invoke-static/range {v0 .. v9}, Lo0/a;->p(Lo0/a;JLo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v9

    move-object v1, v11

    move v2, v12

    move v3, v13

    move v4, v14

    move v5, v15

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    invoke-interface/range {v1 .. v9}, Lm0/n0;->g(FFFFFFZLm0/S0;)V

    return-void
.end method

.method public e1(Lm0/J0;JFLo0/g;Lm0/w0;I)V
    .locals 11

    move-object v9, p0

    iget-object v0, v9, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v10

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object/from16 v2, p5

    move v3, p4

    move-object/from16 v4, p6

    move/from16 v5, p7

    invoke-static/range {v0 .. v8}, Lo0/a;->r(Lo0/a;Lm0/l0;Lo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object v1, p1

    move-wide v2, p2

    invoke-interface {v10, p1, p2, p3, v0}, Lm0/n0;->q(Lm0/J0;JLm0/S0;)V

    return-void
.end method

.method public f1(Lm0/l0;JJFILm0/V0;FLm0/w0;I)V
    .locals 15

    move-object v13, p0

    iget-object v0, v13, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v14

    sget-object v0, Lm0/l1;->a:Lm0/l1$a;

    invoke-virtual {v0}, Lm0/l1$a;->b()I

    move-result v5

    const/16 v11, 0x200

    const/4 v12, 0x0

    const/high16 v3, 0x40800000    # 4.0f

    const/4 v10, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p6

    move/from16 v4, p7

    move-object/from16 v6, p8

    move/from16 v7, p9

    move-object/from16 v8, p10

    move/from16 v9, p11

    invoke-static/range {v0 .. v12}, Lo0/a;->A(Lo0/a;Lm0/l0;FFIILm0/V0;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object/from16 p6, v14

    move-wide/from16 p7, p2

    move-wide/from16 p9, p4

    move-object/from16 p11, v0

    invoke-interface/range {p6 .. p11}, Lm0/n0;->h(JJLm0/S0;)V

    return-void
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->f()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->g()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public j0(JJJFLo0/g;Lm0/w0;I)V
    .locals 16

    move-object/from16 v10, p0

    iget-object v0, v10, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v11

    invoke-static/range {p3 .. p4}, Ll0/g;->m(J)F

    move-result v12

    invoke-static/range {p3 .. p4}, Ll0/g;->n(J)F

    move-result v13

    invoke-static/range {p3 .. p4}, Ll0/g;->m(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ll0/m;->i(J)F

    move-result v1

    add-float v14, v0, v1

    invoke-static/range {p3 .. p4}, Ll0/g;->n(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ll0/m;->g(J)F

    move-result v1

    add-float v15, v0, v1

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p8

    move/from16 v4, p7

    move-object/from16 v5, p9

    move/from16 v6, p10

    invoke-static/range {v0 .. v9}, Lo0/a;->p(Lo0/a;JLo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object/from16 p1, v11

    move/from16 p2, v12

    move/from16 p3, v13

    move/from16 p4, v14

    move/from16 p5, v15

    move-object/from16 p6, v0

    invoke-interface/range {p1 .. p6}, Lm0/n0;->x(FFFFLm0/S0;)V

    return-void
.end method

.method public j1(JJJJLo0/g;FLm0/w0;I)V
    .locals 18

    move-object/from16 v10, p0

    iget-object v0, v10, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v11

    invoke-static/range {p3 .. p4}, Ll0/g;->m(J)F

    move-result v12

    invoke-static/range {p3 .. p4}, Ll0/g;->n(J)F

    move-result v13

    invoke-static/range {p3 .. p4}, Ll0/g;->m(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ll0/m;->i(J)F

    move-result v1

    add-float v14, v0, v1

    invoke-static/range {p3 .. p4}, Ll0/g;->n(J)F

    move-result v0

    invoke-static/range {p5 .. p6}, Ll0/m;->g(J)F

    move-result v1

    add-float v15, v0, v1

    invoke-static/range {p7 .. p8}, Ll0/a;->d(J)F

    move-result v16

    invoke-static/range {p7 .. p8}, Ll0/a;->e(J)F

    move-result v17

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p9

    move/from16 v4, p10

    move-object/from16 v5, p11

    move/from16 v6, p12

    invoke-static/range {v0 .. v9}, Lo0/a;->p(Lo0/a;JLo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object/from16 p1, v11

    move/from16 p2, v12

    move/from16 p3, v13

    move/from16 p4, v14

    move/from16 p5, v15

    move/from16 p6, v16

    move/from16 p7, v17

    move-object/from16 p8, v0

    invoke-interface/range {p1 .. p8}, Lm0/n0;->u(FFFFFFLm0/S0;)V

    return-void
.end method

.method public k1()Lo0/d;
    .locals 1

    iget-object v0, p0, Lo0/a;->b:Lo0/d;

    return-object v0
.end method

.method public l1(Lm0/U0;Lm0/l0;FLo0/g;Lm0/w0;I)V
    .locals 11

    move-object v9, p0

    iget-object v0, v9, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v10

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p4

    move v3, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    invoke-static/range {v0 .. v8}, Lo0/a;->r(Lo0/a;Lm0/l0;Lo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object v1, p1

    invoke-interface {v10, p1, v0}, Lm0/n0;->m(Lm0/U0;Lm0/S0;)V

    return-void
.end method

.method public m0(JFJFLo0/g;Lm0/w0;I)V
    .locals 12

    move-object v10, p0

    iget-object v0, v10, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v11

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object/from16 v3, p7

    move/from16 v4, p6

    move-object/from16 v5, p8

    move/from16 v6, p9

    invoke-static/range {v0 .. v9}, Lo0/a;->p(Lo0/a;JLo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move v1, p3

    move-wide/from16 v2, p4

    invoke-interface {v11, v2, v3, p3, v0}, Lm0/n0;->w(JFLm0/S0;)V

    return-void
.end method

.method public m1(Lm0/l0;JJJFLo0/g;Lm0/w0;I)V
    .locals 17

    move-object/from16 v9, p0

    iget-object v0, v9, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v10

    invoke-static/range {p2 .. p3}, Ll0/g;->m(J)F

    move-result v11

    invoke-static/range {p2 .. p3}, Ll0/g;->n(J)F

    move-result v12

    invoke-static/range {p2 .. p3}, Ll0/g;->m(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ll0/m;->i(J)F

    move-result v1

    add-float v13, v0, v1

    invoke-static/range {p2 .. p3}, Ll0/g;->n(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ll0/m;->g(J)F

    move-result v1

    add-float v14, v0, v1

    invoke-static/range {p6 .. p7}, Ll0/a;->d(J)F

    move-result v15

    invoke-static/range {p6 .. p7}, Ll0/a;->e(J)F

    move-result v16

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p9

    move/from16 v3, p8

    move-object/from16 v4, p10

    move/from16 v5, p11

    invoke-static/range {v0 .. v8}, Lo0/a;->r(Lo0/a;Lm0/l0;Lo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object/from16 p1, v10

    move/from16 p2, v11

    move/from16 p3, v12

    move/from16 p4, v13

    move/from16 p5, v14

    move/from16 p6, v15

    move/from16 p7, v16

    move-object/from16 p8, v0

    invoke-interface/range {p1 .. p8}, Lm0/n0;->u(FFFFFFLm0/S0;)V

    return-void
.end method

.method public p0(Lm0/l0;JJFLo0/g;Lm0/w0;I)V
    .locals 15

    move-object v9, p0

    iget-object v0, v9, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v10

    invoke-static/range {p2 .. p3}, Ll0/g;->m(J)F

    move-result v11

    invoke-static/range {p2 .. p3}, Ll0/g;->n(J)F

    move-result v12

    invoke-static/range {p2 .. p3}, Ll0/g;->m(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ll0/m;->i(J)F

    move-result v1

    add-float v13, v0, v1

    invoke-static/range {p2 .. p3}, Ll0/g;->n(J)F

    move-result v0

    invoke-static/range {p4 .. p5}, Ll0/m;->g(J)F

    move-result v1

    add-float v14, v0, v1

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p7

    move/from16 v3, p6

    move-object/from16 v4, p8

    move/from16 v5, p9

    invoke-static/range {v0 .. v8}, Lo0/a;->r(Lo0/a;Lm0/l0;Lo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object/from16 p1, v10

    move/from16 p2, v11

    move/from16 p3, v12

    move/from16 p4, v13

    move/from16 p5, v14

    move-object/from16 p6, v0

    invoke-interface/range {p1 .. p6}, Lm0/n0;->x(FFFFLm0/S0;)V

    return-void
.end method

.method public t0(Lm0/U0;JFLo0/g;Lm0/w0;I)V
    .locals 12

    move-object v10, p0

    iget-object v0, v10, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v11

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p2

    move-object/from16 v3, p5

    move/from16 v4, p4

    move-object/from16 v5, p6

    move/from16 v6, p7

    invoke-static/range {v0 .. v9}, Lo0/a;->p(Lo0/a;JLo0/g;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object v1, p1

    invoke-interface {v11, p1, v0}, Lm0/n0;->m(Lm0/U0;Lm0/S0;)V

    return-void
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->f()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method

.method public z0(JJJFILm0/V0;FLm0/w0;I)V
    .locals 16

    move-object/from16 v14, p0

    iget-object v0, v14, Lo0/a;->a:Lo0/a$a;

    invoke-virtual {v0}, Lo0/a$a;->e()Lm0/n0;

    move-result-object v15

    sget-object v0, Lm0/l1;->a:Lm0/l1$a;

    invoke-virtual {v0}, Lm0/l1$a;->b()I

    move-result v6

    const/16 v12, 0x200

    const/4 v13, 0x0

    const/high16 v4, 0x40800000    # 4.0f

    const/4 v11, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, p7

    move/from16 v5, p8

    move-object/from16 v7, p9

    move/from16 v8, p10

    move-object/from16 v9, p11

    move/from16 v10, p12

    invoke-static/range {v0 .. v13}, Lo0/a;->v(Lo0/a;JFFIILm0/V0;FLm0/w0;IIILjava/lang/Object;)Lm0/S0;

    move-result-object v0

    move-object/from16 p7, v15

    move-wide/from16 p8, p3

    move-wide/from16 p10, p5

    move-object/from16 p12, v0

    invoke-interface/range {p7 .. p12}, Lm0/n0;->h(JJLm0/S0;)V

    return-void
.end method
