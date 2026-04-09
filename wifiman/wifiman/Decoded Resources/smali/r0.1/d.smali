.class public abstract Lr0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lm0/S0;

.field private b:Z

.field private c:Lm0/w0;

.field private d:F

.field private e:LY0/t;

.field private final f:Lmh/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lr0/d;->d:F

    sget-object v0, LY0/t;->Ltr:LY0/t;

    iput-object v0, p0, Lr0/d;->e:LY0/t;

    new-instance v0, Lr0/d$a;

    invoke-direct {v0, p0}, Lr0/d$a;-><init>(Lr0/d;)V

    iput-object v0, p0, Lr0/d;->f:Lmh/l;

    return-void
.end method

.method private final g(F)V
    .locals 1

    iget v0, p0, Lr0/d;->d:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0, p1}, Lr0/d;->a(F)Z

    move-result v0

    if-nez v0, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lr0/d;->a:Lm0/S0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lm0/S0;->a(F)V

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lr0/d;->b:Z

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lr0/d;->m()Lm0/S0;

    move-result-object v0

    invoke-interface {v0, p1}, Lm0/S0;->a(F)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr0/d;->b:Z

    :cond_3
    :goto_1
    iput p1, p0, Lr0/d;->d:F

    :goto_2
    return-void
.end method

.method private final h(Lm0/w0;)V
    .locals 2

    iget-object v0, p0, Lr0/d;->c:Lm0/w0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Lr0/d;->e(Lm0/w0;)Z

    move-result v0

    if-nez v0, :cond_2

    if-nez p1, :cond_1

    iget-object v0, p0, Lr0/d;->a:Lm0/S0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lm0/S0;->D(Lm0/w0;)V

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lr0/d;->b:Z

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lr0/d;->m()Lm0/S0;

    move-result-object v0

    invoke-interface {v0, p1}, Lm0/S0;->D(Lm0/w0;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr0/d;->b:Z

    :cond_2
    :goto_1
    iput-object p1, p0, Lr0/d;->c:Lm0/w0;

    :cond_3
    return-void
.end method

.method private final i(LY0/t;)V
    .locals 1

    iget-object v0, p0, Lr0/d;->e:LY0/t;

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, Lr0/d;->f(LY0/t;)Z

    iput-object p1, p0, Lr0/d;->e:LY0/t;

    :cond_0
    return-void
.end method

.method public static synthetic k(Lr0/d;Lo0/f;JFLm0/w0;ILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/high16 p4, 0x3f800000    # 1.0f

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x4

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Lr0/d;->j(Lo0/f;JFLm0/w0;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: draw-x_KDEd0"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final m()Lm0/S0;
    .locals 1

    iget-object v0, p0, Lr0/d;->a:Lm0/S0;

    if-nez v0, :cond_0

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object v0

    iput-object v0, p0, Lr0/d;->a:Lm0/S0;

    :cond_0
    return-object v0
.end method


# virtual methods
.method protected abstract a(F)Z
.end method

.method protected abstract e(Lm0/w0;)Z
.end method

.method protected f(LY0/t;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final j(Lo0/f;JFLm0/w0;)V
    .locals 4

    invoke-direct {p0, p4}, Lr0/d;->g(F)V

    invoke-direct {p0, p5}, Lr0/d;->h(Lm0/w0;)V

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object p5

    invoke-direct {p0, p5}, Lr0/d;->i(LY0/t;)V

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result p5

    invoke-static {p2, p3}, Ll0/m;->i(J)F

    move-result v0

    sub-float/2addr p5, v0

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v0

    invoke-static {p2, p3}, Ll0/m;->g(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v1

    invoke-interface {v1}, Lo0/d;->e()Lo0/h;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2, v2, p5, v0}, Lo0/h;->g(FFFF)V

    cmpl-float p4, p4, v2

    const/high16 v1, -0x80000000

    if-lez p4, :cond_1

    :try_start_0
    invoke-static {p2, p3}, Ll0/m;->i(J)F

    move-result p4

    cmpl-float p4, p4, v2

    if-lez p4, :cond_1

    invoke-static {p2, p3}, Ll0/m;->g(J)F

    move-result p4

    cmpl-float p4, p4, v2

    if-lez p4, :cond_1

    iget-boolean p4, p0, Lr0/d;->b:Z

    if-eqz p4, :cond_0

    sget-object p4, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p4}, Ll0/g$a;->c()J

    move-result-wide v2

    invoke-static {p2, p3}, Ll0/m;->i(J)F

    move-result p4

    invoke-static {p2, p3}, Ll0/m;->g(J)F

    move-result p2

    invoke-static {p4, p2}, Ll0/n;->a(FF)J

    move-result-wide p2

    invoke-static {v2, v3, p2, p3}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object p2

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p3

    invoke-interface {p3}, Lo0/d;->d()Lm0/n0;

    move-result-object p3

    invoke-direct {p0}, Lr0/d;->m()Lm0/S0;

    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p3, p2, p4}, Lm0/n0;->l(Ll0/i;Lm0/S0;)V

    invoke-virtual {p0, p1}, Lr0/d;->n(Lo0/f;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p3}, Lm0/n0;->r()V

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-interface {p3}, Lm0/n0;->r()V

    throw p2

    :cond_0
    invoke-virtual {p0, p1}, Lr0/d;->n(Lo0/f;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->e()Lo0/h;

    move-result-object p1

    neg-float p3, p5

    neg-float p4, v0

    invoke-interface {p1, v1, v1, p3, p4}, Lo0/h;->g(FFFF)V

    throw p2

    :cond_1
    :goto_1
    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->e()Lo0/h;

    move-result-object p1

    neg-float p2, p5

    neg-float p3, v0

    invoke-interface {p1, v1, v1, p2, p3}, Lo0/h;->g(FFFF)V

    return-void
.end method

.method public abstract l()J
.end method

.method protected abstract n(Lo0/f;)V
.end method
