.class public abstract LQ/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:Lr/x;

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    const/16 v2, 0xc

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    sub-float/2addr v1, v3

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, LQ/a;->a:F

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v4

    sub-float/2addr v3, v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    sput v3, LQ/a;->b:F

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v4

    sub-float/2addr v4, v1

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v1

    sput v1, LQ/a;->c:F

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v1

    sub-float/2addr v1, v3

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, LQ/a;->d:F

    new-instance v1, Lr/x;

    const/4 v2, 0x0

    const v3, 0x3e19999a    # 0.15f

    const v4, 0x3f4ccccd    # 0.8f

    invoke-direct {v1, v4, v2, v4, v3}, Lr/x;-><init>(FFFF)V

    sput-object v1, LQ/a;->e:Lr/x;

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, LQ/a;->f:F

    const/16 v1, 0x1c

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, LQ/a;->g:F

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, LQ/a;->h:F

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sub-float/2addr v0, v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LQ/a;->i:F

    return-void
.end method

.method public static final synthetic a(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LQ/a;->c(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(FFFLT/l;II)LQ/A;
    .locals 8

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    const p0, -0x800001

    :cond_0
    and-int/lit8 v0, p5, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move p1, v1

    :cond_1
    const/4 v0, 0x4

    and-int/2addr p5, v0

    if-eqz p5, :cond_2

    move p2, v1

    :cond_2
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_3

    const/4 p5, -0x1

    const-string v1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)"

    const v2, 0x6b67e0a2

    invoke-static {v2, p4, p5, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    const/4 p5, 0x0

    new-array v1, p5, [Ljava/lang/Object;

    sget-object v2, LQ/A;->d:LQ/A$c;

    invoke-virtual {v2}, LQ/A$c;->a()Lc0/k;

    move-result-object v2

    and-int/lit8 v3, p4, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x1

    if-le v3, v0, :cond_4

    invoke-interface {p3, p0}, LT/l;->g(F)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    and-int/lit8 v3, p4, 0x6

    if-ne v3, v0, :cond_6

    :cond_5
    move v0, v4

    goto :goto_0

    :cond_6
    move v0, p5

    :goto_0
    and-int/lit8 v3, p4, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v5, 0x20

    if-le v3, v5, :cond_7

    invoke-interface {p3, p1}, LT/l;->g(F)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    and-int/lit8 v3, p4, 0x30

    if-ne v3, v5, :cond_9

    :cond_8
    move v3, v4

    goto :goto_1

    :cond_9
    move v3, p5

    :goto_1
    or-int/2addr v0, v3

    and-int/lit16 v3, p4, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v5, 0x100

    if-le v3, v5, :cond_a

    invoke-interface {p3, p2}, LT/l;->g(F)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    and-int/lit16 p4, p4, 0x180

    if-ne p4, v5, :cond_c

    :cond_b
    move p5, v4

    :cond_c
    or-int p4, v0, p5

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_d

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne p5, p4, :cond_e

    :cond_d
    new-instance p5, LQ/a$a;

    invoke-direct {p5, p0, p1, p2}, LQ/a$a;-><init>(FFF)V

    invoke-interface {p3, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v4, p5

    check-cast v4, Lmh/a;

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v3, 0x0

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LQ/A;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    return-object p0
.end method

.method private static final c(LQ/A;FLr/z;Lr/i;Ldh/e;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, LQ/a$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, LQ/a$b;

    iget v3, v2, LQ/a$b;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, LQ/a$b;->e:I

    goto :goto_0

    :cond_0
    new-instance v2, LQ/a$b;

    invoke-direct {v2, v1}, LQ/a$b;-><init>(Ldh/e;)V

    :goto_0
    iget-object v1, v2, LQ/a$b;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v11

    iget v3, v2, LQ/a$b;->e:I

    const/4 v10, 0x2

    const/4 v4, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v10, :cond_1

    iget-object v0, v2, LQ/a$b;->a:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/K;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v2, LQ/a$b;->c:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/K;

    iget-object v3, v2, LQ/a$b;->b:Ljava/lang/Object;

    check-cast v3, Lr/i;

    iget-object v4, v2, LQ/a$b;->a:Ljava/lang/Object;

    check-cast v4, LQ/A;

    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v1, v0

    move-object v13, v3

    move-object v0, v4

    goto :goto_1

    :cond_3
    invoke-static {v1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LQ/A;->b()F

    move-result v1

    const v3, 0x3c23d70a    # 0.01f

    cmpg-float v1, v1, v3

    if-ltz v1, :cond_a

    invoke-virtual/range {p0 .. p0}, LQ/A;->b()F

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v3

    if-nez v1, :cond_4

    goto/16 :goto_5

    :cond_4
    new-instance v1, Lkotlin/jvm/internal/K;

    invoke-direct {v1}, Lkotlin/jvm/internal/K;-><init>()V

    move/from16 v5, p1

    iput v5, v1, Lkotlin/jvm/internal/K;->a:F

    if-eqz p2, :cond_6

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpl-float v3, v6, v3

    if-lez v3, :cond_6

    new-instance v3, Lkotlin/jvm/internal/K;

    invoke-direct {v3}, Lkotlin/jvm/internal/K;-><init>()V

    const/16 v20, 0x1c

    const/16 v21, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v14, p1

    invoke-static/range {v13 .. v21}, Lr/l;->c(FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v5

    new-instance v6, LQ/a$c;

    invoke-direct {v6, v3, v0, v1}, LQ/a$c;-><init>(Lkotlin/jvm/internal/K;LQ/A;Lkotlin/jvm/internal/K;)V

    iput-object v0, v2, LQ/a$b;->a:Ljava/lang/Object;

    move-object/from16 v13, p3

    iput-object v13, v2, LQ/a$b;->b:Ljava/lang/Object;

    iput-object v1, v2, LQ/a$b;->c:Ljava/lang/Object;

    iput v4, v2, LQ/a$b;->e:I

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v3, v5

    move-object/from16 v4, p2

    move v5, v7

    move-object v7, v2

    invoke-static/range {v3 .. v9}, Lr/m0;->h(Lr/k;Lr/z;ZLmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_5

    return-object v11

    :cond_5
    :goto_1
    move-object v5, v13

    goto :goto_2

    :cond_6
    move-object/from16 v13, p3

    goto :goto_1

    :goto_2
    if-eqz v5, :cond_9

    invoke-virtual {v0}, LQ/A;->d()F

    move-result v3

    cmpg-float v3, v3, v12

    if-gez v3, :cond_9

    invoke-virtual {v0}, LQ/A;->d()F

    move-result v3

    invoke-virtual {v0}, LQ/A;->e()F

    move-result v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_9

    invoke-virtual {v0}, LQ/A;->d()F

    move-result v13

    const/16 v20, 0x1e

    const/16 v21, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v13 .. v21}, Lr/l;->c(FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v3

    invoke-virtual {v0}, LQ/A;->b()F

    move-result v4

    const/high16 v6, 0x3f000000    # 0.5f

    cmpg-float v4, v4, v6

    if-gez v4, :cond_7

    move v4, v12

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, LQ/A;->e()F

    move-result v4

    :goto_3
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v4

    new-instance v7, LQ/a$d;

    invoke-direct {v7, v0}, LQ/a$d;-><init>(LQ/A;)V

    iput-object v1, v2, LQ/a$b;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v2, LQ/a$b;->b:Ljava/lang/Object;

    iput-object v0, v2, LQ/a$b;->c:Ljava/lang/Object;

    iput v10, v2, LQ/a$b;->e:I

    const/4 v6, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v8, v2

    invoke-static/range {v3 .. v10}, Lr/m0;->j(Lr/k;Ljava/lang/Object;Lr/i;ZLmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_8

    return-object v11

    :cond_8
    move-object v0, v1

    :goto_4
    move-object v1, v0

    :cond_9
    iget v0, v1, Lkotlin/jvm/internal/K;->a:F

    invoke-static {v12, v0}, LY0/z;->a(FF)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->b(J)LY0/y;

    move-result-object v0

    return-object v0

    :cond_a
    :goto_5
    sget-object v0, LY0/y;->b:LY0/y$a;

    invoke-virtual {v0}, LY0/y$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->b(J)LY0/y;

    move-result-object v0

    return-object v0
.end method
