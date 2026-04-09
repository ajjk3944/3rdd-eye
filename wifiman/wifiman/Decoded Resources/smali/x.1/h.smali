.class public abstract Lx/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x190

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Lx/h;->a:F

    return-void
.end method

.method public static final synthetic a(Lw/v;FLr/k;Lr/z;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Lx/h;->f(Lw/v;FLr/k;Lr/z;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lr/h;Lw/v;Lmh/l;F)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx/h;->g(Lr/h;Lw/v;Lmh/l;F)V

    return-void
.end method

.method public static final synthetic c(Lw/v;FFLr/k;Lr/i;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p6}, Lx/h;->h(Lw/v;FFLr/k;Lr/i;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lw/v;FFLx/b;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Lx/h;->i(Lw/v;FFLx/b;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(FF)F
    .locals 0

    invoke-static {p0, p1}, Lx/h;->j(FF)F

    move-result p0

    return p0
.end method

.method private static final f(Lw/v;FLr/k;Lr/z;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p5, Lx/h$a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lx/h$a;

    iget v1, v0, Lx/h$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/h$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/h$a;

    invoke-direct {v0, p5}, Lx/h$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object p5, v0, Lx/h$a;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/h$a;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lx/h$a;->a:F

    iget-object p0, v0, Lx/h$a;->c:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/K;

    iget-object p2, v0, Lx/h$a;->b:Ljava/lang/Object;

    check-cast p2, Lr/k;

    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p5, Lkotlin/jvm/internal/K;

    invoke-direct {p5}, Lkotlin/jvm/internal/K;-><init>()V

    invoke-virtual {p2}, Lr/k;->p()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v4, 0x0

    cmpg-float v2, v2, v4

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    xor-int/2addr v2, v3

    new-instance v4, Lx/h$b;

    invoke-direct {v4, p1, p5, p0, p4}, Lx/h$b;-><init>(FLkotlin/jvm/internal/K;Lw/v;Lmh/l;)V

    iput-object p2, v0, Lx/h$a;->b:Ljava/lang/Object;

    iput-object p5, v0, Lx/h$a;->c:Ljava/lang/Object;

    iput p1, v0, Lx/h$a;->a:F

    iput v3, v0, Lx/h$a;->e:I

    invoke-static {p2, p3, v2, v4, v0}, Lr/m0;->g(Lr/k;Lr/z;ZLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    move-object p0, p5

    :goto_2
    new-instance p3, Lx/a;

    iget p0, p0, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr p1, p0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p3, p0, p2}, Lx/a;-><init>(Ljava/lang/Object;Lr/k;)V

    return-object p3
.end method

.method private static final g(Lr/h;Lw/v;Lmh/l;F)V
    .locals 1

    invoke-interface {p1, p3}, Lw/v;->a(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sub-float/2addr p3, p1

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lr/h;->a()V

    :cond_0
    return-void
.end method

.method private static final h(Lw/v;FFLr/k;Lr/i;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 12

    move-object/from16 v0, p6

    instance-of v1, v0, Lx/h$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lx/h$c;

    iget v2, v1, Lx/h$c;->f:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lx/h$c;->f:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lx/h$c;

    invoke-direct {v1, v0}, Lx/h$c;-><init>(Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lx/h$c;->e:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v7, Lx/h$c;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget v1, v7, Lx/h$c;->b:F

    iget v2, v7, Lx/h$c;->a:F

    iget-object v3, v7, Lx/h$c;->d:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/K;

    iget-object v4, v7, Lx/h$c;->c:Ljava/lang/Object;

    check-cast v4, Lr/k;

    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    move v10, v2

    move-object v0, v4

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance v0, Lkotlin/jvm/internal/K;

    invoke-direct {v0}, Lkotlin/jvm/internal/K;-><init>()V

    invoke-virtual {p3}, Lr/k;->p()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {p3}, Lr/k;->p()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v5, 0x0

    cmpg-float v2, v2, v5

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    xor-int/lit8 v5, v2, 0x1

    new-instance v6, Lx/h$d;

    move-object v2, p0

    move v9, p2

    move-object/from16 v10, p5

    invoke-direct {v6, p2, v0, p0, v10}, Lx/h$d;-><init>(FLkotlin/jvm/internal/K;Lw/v;Lmh/l;)V

    move-object v9, p3

    iput-object v9, v7, Lx/h$c;->c:Ljava/lang/Object;

    iput-object v0, v7, Lx/h$c;->d:Ljava/lang/Object;

    move v10, p1

    iput v10, v7, Lx/h$c;->a:F

    iput v8, v7, Lx/h$c;->b:F

    iput v3, v7, Lx/h$c;->f:I

    move-object v2, p3

    move-object v3, v4

    move-object/from16 v4, p4

    invoke-static/range {v2 .. v7}, Lr/m0;->i(Lr/k;Ljava/lang/Object;Lr/i;ZLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v3, v0

    move v1, v8

    move-object v0, v9

    :goto_3
    invoke-virtual {v0}, Lr/k;->p()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2, v1}, Lx/h;->j(FF)F

    move-result v2

    new-instance v11, Lx/a;

    iget v1, v3, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v10, v1

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v10

    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lr/l;->g(Lr/k;FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v0

    invoke-direct {v11, v10, v0}, Lx/a;-><init>(Ljava/lang/Object;Lr/k;)V

    return-object v11
.end method

.method private static final i(Lw/v;FFLx/b;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 6

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object v3

    move-object v0, p3

    move-object v1, p0

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lx/b;->a(Lw/v;Ljava/lang/Object;Ljava/lang/Object;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final j(FF)F
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    invoke-static {p0, p1}, Lsh/m;->f(FF)F

    move-result p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Lsh/m;->c(FF)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static final k()F
    .locals 1

    sget v0, Lx/h;->a:F

    return v0
.end method

.method public static final l(Lx/i;Lr/z;Lr/i;)Lw/C;
    .locals 1

    new-instance v0, Lx/g;

    invoke-direct {v0, p0, p1, p2}, Lx/g;-><init>(Lx/i;Lr/z;Lr/i;)V

    return-object v0
.end method
