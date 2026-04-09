.class public final LT0/g;
.super Landroid/text/TextPaint;
.source "SourceFile"


# instance fields
.field private a:Lm0/S0;

.field private b:LW0/k;

.field private c:I

.field private d:Lm0/g1;

.field private e:Lm0/l0;

.field private f:LT/z1;

.field private g:Ll0/m;

.field private h:Lo0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/text/TextPaint;-><init>(I)V

    iput p2, p0, Landroid/text/TextPaint;->density:F

    sget-object p1, LW0/k;->b:LW0/k$a;

    invoke-virtual {p1}, LW0/k$a;->c()LW0/k;

    move-result-object p1

    iput-object p1, p0, LT0/g;->b:LW0/k;

    sget-object p1, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {p1}, Lo0/f$a;->a()I

    move-result p1

    iput p1, p0, LT0/g;->c:I

    sget-object p1, Lm0/g1;->d:Lm0/g1$a;

    invoke-virtual {p1}, Lm0/g1$a;->a()Lm0/g1;

    move-result-object p1

    iput-object p1, p0, LT0/g;->d:Lm0/g1;

    return-void
.end method

.method private final a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LT0/g;->f:LT/z1;

    iput-object v0, p0, LT0/g;->e:Lm0/l0;

    iput-object v0, p0, LT0/g;->g:Ll0/m;

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

.method private final c()Lm0/S0;
    .locals 1

    iget-object v0, p0, LT0/g;->a:Lm0/S0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lm0/S;->b(Landroid/graphics/Paint;)Lm0/S0;

    move-result-object v0

    iput-object v0, p0, LT0/g;->a:Lm0/S0;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LT0/g;->c:I

    return v0
.end method

.method public final d(I)V
    .locals 1

    iget v0, p0, LT0/g;->c:I

    invoke-static {p1, v0}, Lm0/d0;->E(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, LT0/g;->c()Lm0/S0;

    move-result-object v0

    invoke-interface {v0, p1}, Lm0/S0;->v(I)V

    iput p1, p0, LT0/g;->c:I

    return-void
.end method

.method public final e(Lm0/l0;JF)V
    .locals 4

    if-nez p1, :cond_0

    invoke-direct {p0}, LT0/g;->a()V

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lm0/j1;

    if-eqz v0, :cond_1

    check-cast p1, Lm0/j1;

    invoke-virtual {p1}, Lm0/j1;->b()J

    move-result-wide p1

    invoke-static {p1, p2, p4}, LW0/m;->c(JF)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LT0/g;->f(J)V

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lm0/e1;

    if-eqz v0, :cond_7

    iget-object v0, p0, LT0/g;->e:Lm0/l0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, LT0/g;->g:Ll0/m;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ll0/m;->m()J

    move-result-wide v2

    invoke-static {v2, v3, p2, p3}, Ll0/m;->f(JJ)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_5

    :cond_3
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, p2, v2

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    if-eqz v1, :cond_5

    iput-object p1, p0, LT0/g;->e:Lm0/l0;

    invoke-static {p2, p3}, Ll0/m;->c(J)Ll0/m;

    move-result-object v0

    iput-object v0, p0, LT0/g;->g:Ll0/m;

    new-instance v0, LT0/g$a;

    invoke-direct {v0, p1, p2, p3}, LT0/g$a;-><init>(Lm0/l0;J)V

    invoke-static {v0}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LT0/g;->f:LT/z1;

    :cond_5
    invoke-direct {p0}, LT0/g;->c()Lm0/S0;

    move-result-object p1

    iget-object p2, p0, LT0/g;->f:LT/z1;

    if-eqz p2, :cond_6

    invoke-interface {p2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Shader;

    goto :goto_1

    :cond_6
    const/4 p2, 0x0

    :goto_1
    invoke-interface {p1, p2}, Lm0/S0;->y(Landroid/graphics/Shader;)V

    invoke-static {p0, p4}, LT0/h;->a(Landroid/text/TextPaint;F)V

    :cond_7
    :goto_2
    return-void
.end method

.method public final f(J)V
    .locals 2

    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lm0/x0;->j(J)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-direct {p0}, LT0/g;->a()V

    :cond_0
    return-void
.end method

.method public final g(Lo0/g;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LT0/g;->h:Lo0/g;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, LT0/g;->h:Lo0/g;

    sget-object v0, Lo0/j;->a:Lo0/j;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lo0/k;

    if-eqz v0, :cond_2

    invoke-direct {p0}, LT0/g;->c()Lm0/S0;

    move-result-object v0

    sget-object v1, Lm0/T0;->a:Lm0/T0$a;

    invoke-virtual {v1}, Lm0/T0$a;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->H(I)V

    invoke-direct {p0}, LT0/g;->c()Lm0/S0;

    move-result-object v0

    check-cast p1, Lo0/k;

    invoke-virtual {p1}, Lo0/k;->f()F

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->K(F)V

    invoke-direct {p0}, LT0/g;->c()Lm0/S0;

    move-result-object v0

    invoke-virtual {p1}, Lo0/k;->d()F

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->A(F)V

    invoke-direct {p0}, LT0/g;->c()Lm0/S0;

    move-result-object v0

    invoke-virtual {p1}, Lo0/k;->c()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->G(I)V

    invoke-direct {p0}, LT0/g;->c()Lm0/S0;

    move-result-object v0

    invoke-virtual {p1}, Lo0/k;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lm0/S0;->u(I)V

    invoke-direct {p0}, LT0/g;->c()Lm0/S0;

    move-result-object v0

    invoke-virtual {p1}, Lo0/k;->e()Lm0/V0;

    move-result-object p1

    invoke-interface {v0, p1}, Lm0/S0;->B(Lm0/V0;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final h(Lm0/g1;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LT0/g;->d:Lm0/g1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, LT0/g;->d:Lm0/g1;

    sget-object v0, Lm0/g1;->d:Lm0/g1$a;

    invoke-virtual {v0}, Lm0/g1$a;->a()Lm0/g1;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LT0/g;->d:Lm0/g1;

    invoke-virtual {p1}, Lm0/g1;->b()F

    move-result p1

    invoke-static {p1}, LU0/d;->b(F)F

    move-result p1

    iget-object v0, p0, LT0/g;->d:Lm0/g1;

    invoke-virtual {v0}, Lm0/g1;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    iget-object v1, p0, LT0/g;->d:Lm0/g1;

    invoke-virtual {v1}, Lm0/g1;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->n(J)F

    move-result v1

    iget-object v2, p0, LT0/g;->d:Lm0/g1;

    invoke-virtual {v2}, Lm0/g1;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Lm0/x0;->j(J)I

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final i(LW0/k;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LT0/g;->b:LW0/k;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, LT0/g;->b:LW0/k;

    sget-object v0, LW0/k;->b:LW0/k$a;

    invoke-virtual {v0}, LW0/k$a;->d()LW0/k;

    move-result-object v1

    invoke-virtual {p1, v1}, LW0/k;->d(LW0/k;)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    iget-object p1, p0, LT0/g;->b:LW0/k;

    invoke-virtual {v0}, LW0/k$a;->b()LW0/k;

    move-result-object v0

    invoke-virtual {p1, v0}, LW0/k;->d(LW0/k;)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    :cond_1
    return-void
.end method
