.class public abstract Ljj/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, Ljj/c;->a:F

    const/16 v1, 0x12

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sput v1, Ljj/c;->b:F

    div-float/2addr v0, v1

    sput v0, Ljj/c;->c:F

    return-void
.end method

.method public static final synthetic a(Ly0/n;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Ljj/c;->c(Ly0/n;J)Z

    move-result p0

    return p0
.end method

.method public static final b(Ly0/G;Ly0/y;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Ljj/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljj/c$a;

    iget v1, v0, Ljj/c$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljj/c$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljj/c$a;

    invoke-direct {v0, p2}, Ljj/c$a;-><init>(Ldh/e;)V

    :goto_0
    iget-object p2, v0, Ljj/c$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ljj/c$a;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Ljj/c$a;->b:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/N;

    iget-object p1, v0, Ljj/c$a;->a:Ljava/lang/Object;

    check-cast p1, Ly0/y;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/N;

    invoke-direct {p2}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    iput-object p1, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {p0}, Ly0/G;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v5

    invoke-interface {v5}, Landroidx/compose/ui/platform/w1;->c()J

    move-result-wide v5

    :try_start_1
    new-instance v7, Ljj/c$b;

    invoke-direct {v7, p0, v2, p2, v3}, Ljj/c$b;-><init>(Ly0/G;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Ldh/e;)V

    iput-object p1, v0, Ljj/c$a;->a:Ljava/lang/Object;

    iput-object p2, v0, Ljj/c$a;->b:Ljava/lang/Object;

    iput v4, v0, Ljj/c$a;->d:I

    invoke-static {v5, v6, v7, v0}, LIi/W0;->c(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_4

    return-object v1

    :catch_0
    move-object p0, p2

    :catch_1
    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Ly0/y;

    if-nez p0, :cond_3

    move-object v3, p1

    goto :goto_1

    :cond_3
    move-object v3, p0

    :cond_4
    :goto_1
    return-object v3
.end method

.method private static final c(Ly0/n;J)Z
    .locals 6

    invoke-virtual {p0}, Ly0/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ly0/y;

    invoke-virtual {v4}, Ly0/y;->f()J

    move-result-wide v4

    invoke-static {v4, v5, p1, p2}, Ly0/x;->d(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Ly0/y;

    const/4 p0, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ly0/y;->i()Z

    move-result p1

    if-ne p1, p0, :cond_2

    move v1, p0

    :cond_2
    xor-int/2addr p0, v1

    return p0
.end method
