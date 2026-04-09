.class public final LN/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/e;

.field private static final b:F

.field private static final c:F

.field private static final d:Lz/N;

.field private static final e:F

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:F

.field private static final j:F

.field private static final k:Lz/N;

.field public static final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LN/e;

    invoke-direct {v0}, LN/e;-><init>()V

    sput-object v0, LN/e;->a:LN/e;

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/e;->b:F

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    sput v2, LN/e;->c:F

    invoke-static {v0, v2, v0, v2}, Landroidx/compose/foundation/layout/o;->d(FFFF)Lz/N;

    move-result-object v0

    sput-object v0, LN/e;->d:Lz/N;

    const/16 v2, 0x40

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    sput v2, LN/e;->e:F

    const/16 v2, 0x24

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    sput v2, LN/e;->f:F

    const/16 v2, 0x12

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    sput v2, LN/e;->g:F

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    sput v2, LN/e;->h:F

    const/4 v2, 0x1

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    sput v2, LN/e;->i:F

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, LN/e;->j:F

    invoke-interface {v0}, Lz/N;->d()F

    move-result v2

    invoke-interface {v0}, Lz/N;->c()F

    move-result v0

    invoke-static {v1, v2, v1, v0}, Landroidx/compose/foundation/layout/o;->d(FFFF)Lz/N;

    move-result-object v0

    sput-object v0, LN/e;->k:Lz/N;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJJJLT/l;II)LN/d;
    .locals 17

    move-object/from16 v0, p9

    move/from16 v1, p10

    and-int/lit8 v2, p11, 0x1

    const/4 v3, 0x6

    if-eqz v2, :cond_0

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->j()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v2, p11, 0x2

    if-eqz v2, :cond_1

    and-int/lit8 v2, v1, 0xe

    invoke-static {v4, v5, v0, v2}, LN/n;->b(JLT/l;I)J

    move-result-wide v6

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v2, p11, 0x4

    if-eqz v2, :cond_2

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v8

    invoke-virtual {v8}, LN/m;->i()J

    move-result-wide v9

    const/16 v15, 0xe

    const/16 v16, 0x0

    const v11, 0x3df5c28f    # 0.12f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v8

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->n()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Lm0/x0;->g(JJ)J

    move-result-wide v8

    goto :goto_2

    :cond_2
    move-wide/from16 v8, p5

    :goto_2
    and-int/lit8 v2, p11, 0x8

    if-eqz v2, :cond_3

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->i()J

    move-result-wide v10

    sget-object v2, LN/r;->a:LN/r;

    invoke-virtual {v2, v0, v3}, LN/r;->b(LT/l;I)F

    move-result v0

    const/16 v2, 0xe

    const/4 v3, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide/from16 p1, v10

    move/from16 p3, v0

    move/from16 p4, v12

    move/from16 p5, v13

    move/from16 p6, v14

    move/from16 p7, v2

    move-object/from16 p8, v3

    invoke-static/range {p1 .. p8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    goto :goto_3

    :cond_3
    move-wide/from16 v2, p7

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v10, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:413)"

    const v11, 0x6f7b993e

    invoke-static {v11, v1, v0, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    new-instance v0, LN/u;

    const/4 v1, 0x0

    move-object/from16 p1, v0

    move-wide/from16 p2, v4

    move-wide/from16 p4, v6

    move-wide/from16 p6, v8

    move-wide/from16 p8, v2

    move-object/from16 p10, v1

    invoke-direct/range {p1 .. p10}, LN/u;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-object v0
.end method

.method public final b(FFFFFLT/l;II)LN/f;
    .locals 7

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x2

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    :cond_0
    move v1, p1

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    const/16 p1, 0x8

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p2

    :cond_1
    move v2, p2

    and-int/lit8 p1, p8, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    int-to-float p1, p2

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p3

    :cond_2
    move v3, p3

    and-int/lit8 p1, p8, 0x8

    const/4 p3, 0x4

    if-eqz p1, :cond_3

    int-to-float p1, p3

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p4

    :cond_3
    move v4, p4

    and-int/lit8 p1, p8, 0x10

    if-eqz p1, :cond_4

    int-to-float p1, p3

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p5

    :cond_4
    move v5, p5

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, -0x1

    const-string p4, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:378)"

    const p5, -0x2bf05456

    invoke-static {p5, p7, p1, p4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_5
    and-int/lit8 p1, p7, 0xe

    xor-int/lit8 p1, p1, 0x6

    const/4 p4, 0x1

    if-le p1, p3, :cond_6

    invoke-interface {p6, v1}, LT/l;->g(F)Z

    move-result p1

    if-nez p1, :cond_7

    :cond_6
    and-int/lit8 p1, p7, 0x6

    if-ne p1, p3, :cond_8

    :cond_7
    move p1, p4

    goto :goto_0

    :cond_8
    move p1, p2

    :goto_0
    and-int/lit8 p3, p7, 0x70

    xor-int/lit8 p3, p3, 0x30

    const/16 p5, 0x20

    if-le p3, p5, :cond_9

    invoke-interface {p6, v2}, LT/l;->g(F)Z

    move-result p3

    if-nez p3, :cond_a

    :cond_9
    and-int/lit8 p3, p7, 0x30

    if-ne p3, p5, :cond_b

    :cond_a
    move p3, p4

    goto :goto_1

    :cond_b
    move p3, p2

    :goto_1
    or-int/2addr p1, p3

    and-int/lit16 p3, p7, 0x380

    xor-int/lit16 p3, p3, 0x180

    const/16 p5, 0x100

    if-le p3, p5, :cond_c

    invoke-interface {p6, v3}, LT/l;->g(F)Z

    move-result p3

    if-nez p3, :cond_d

    :cond_c
    and-int/lit16 p3, p7, 0x180

    if-ne p3, p5, :cond_e

    :cond_d
    move p3, p4

    goto :goto_2

    :cond_e
    move p3, p2

    :goto_2
    or-int/2addr p1, p3

    and-int/lit16 p3, p7, 0x1c00

    xor-int/lit16 p3, p3, 0xc00

    const/16 p5, 0x800

    if-le p3, p5, :cond_f

    invoke-interface {p6, v4}, LT/l;->g(F)Z

    move-result p3

    if-nez p3, :cond_10

    :cond_f
    and-int/lit16 p3, p7, 0xc00

    if-ne p3, p5, :cond_11

    :cond_10
    move p3, p4

    goto :goto_3

    :cond_11
    move p3, p2

    :goto_3
    or-int/2addr p1, p3

    const p3, 0xe000

    and-int/2addr p3, p7

    xor-int/lit16 p3, p3, 0x6000

    const/16 p5, 0x4000

    if-le p3, p5, :cond_12

    invoke-interface {p6, v5}, LT/l;->g(F)Z

    move-result p3

    if-nez p3, :cond_13

    :cond_12
    and-int/lit16 p3, p7, 0x6000

    if-ne p3, p5, :cond_14

    :cond_13
    move p2, p4

    :cond_14
    or-int/2addr p1, p2

    invoke-interface {p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_15

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_16

    :cond_15
    new-instance p2, LN/v;

    const/4 v6, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, LN/v;-><init>(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p6, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast p2, LN/v;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_17

    invoke-static {}, LT/o;->P()V

    :cond_17
    return-object p2
.end method

.method public final c()Lz/N;
    .locals 1

    sget-object v0, LN/e;->d:Lz/N;

    return-object v0
.end method

.method public final d()F
    .locals 1

    sget v0, LN/e;->f:F

    return v0
.end method

.method public final e()F
    .locals 1

    sget v0, LN/e;->e:F

    return v0
.end method

.method public final f()Lz/N;
    .locals 1

    sget-object v0, LN/e;->k:Lz/N;

    return-object v0
.end method

.method public final g(JJJLT/l;II)LN/d;
    .locals 20

    move-object/from16 v0, p7

    and-int/lit8 v1, p9, 0x1

    const/4 v2, 0x6

    if-eqz v1, :cond_0

    sget-object v1, LN/f0;->a:LN/f0;

    invoke-virtual {v1, v0, v2}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v1

    invoke-virtual {v1}, LN/m;->n()J

    move-result-wide v3

    move-wide v10, v3

    goto :goto_0

    :cond_0
    move-wide/from16 v10, p1

    :goto_0
    and-int/lit8 v1, p9, 0x2

    if-eqz v1, :cond_1

    sget-object v1, LN/f0;->a:LN/f0;

    invoke-virtual {v1, v0, v2}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v1

    invoke-virtual {v1}, LN/m;->j()J

    move-result-wide v3

    move-wide v8, v3

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p3

    :goto_1
    and-int/lit8 v1, p9, 0x4

    if-eqz v1, :cond_2

    sget-object v1, LN/f0;->a:LN/f0;

    invoke-virtual {v1, v0, v2}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v1

    invoke-virtual {v1}, LN/m;->i()J

    move-result-wide v12

    sget-object v1, LN/r;->a:LN/r;

    invoke-virtual {v1, v0, v2}, LN/r;->b(LT/l;I)F

    move-result v14

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    move-wide v12, v0

    goto :goto_2

    :cond_2
    move-wide/from16 v12, p5

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:434)"

    const v2, -0x7e9fdd4d

    move/from16 v3, p8

    invoke-static {v2, v3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    new-instance v0, LN/u;

    const/4 v14, 0x0

    move-object v5, v0

    move-wide v6, v10

    invoke-direct/range {v5 .. v14}, LN/u;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object v0
.end method

.method public final h(JJJLT/l;II)LN/d;
    .locals 18

    move-object/from16 v0, p7

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->d()J

    move-result-wide v1

    move-wide v8, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v8, p1

    :goto_0
    and-int/lit8 v1, p9, 0x2

    const/4 v2, 0x6

    if-eqz v1, :cond_1

    sget-object v1, LN/f0;->a:LN/f0;

    invoke-virtual {v1, v0, v2}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v1

    invoke-virtual {v1}, LN/m;->j()J

    move-result-wide v3

    move-wide v6, v3

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, p9, 0x4

    if-eqz v1, :cond_2

    sget-object v1, LN/f0;->a:LN/f0;

    invoke-virtual {v1, v0, v2}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v1

    invoke-virtual {v1}, LN/m;->i()J

    move-result-wide v10

    sget-object v1, LN/r;->a:LN/r;

    invoke-virtual {v1, v0, v2}, LN/r;->b(LT/l;I)F

    move-result v12

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    move-wide v10, v0

    goto :goto_2

    :cond_2
    move-wide/from16 v10, p5

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:455)"

    const v2, 0xae46cc8

    move/from16 v3, p8

    invoke-static {v2, v3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    new-instance v0, LN/u;

    const/4 v12, 0x0

    move-object v3, v0

    move-wide v4, v8

    invoke-direct/range {v3 .. v12}, LN/u;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object v0
.end method
