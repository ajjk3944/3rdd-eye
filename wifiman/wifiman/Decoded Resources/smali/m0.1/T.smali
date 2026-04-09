.class public final Lm0/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/U0;


# instance fields
.field private final b:Landroid/graphics/Path;

.field private c:Landroid/graphics/RectF;

.field private d:[F

.field private e:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm0/T;->b:Landroid/graphics/Path;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/graphics/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lm0/T;-><init>(Landroid/graphics/Path;)V

    return-void
.end method

.method private final w(Ll0/i;)V
    .locals 1

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const-string p1, "Invalid rectangle, make sure no value is NaN"

    invoke-static {p1}, Lm0/Y;->d(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    return-void
.end method

.method public b(FFFF)V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->isConvex()Z

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method public e(FF)V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->rMoveTo(FF)V

    return-void
.end method

.method public f(FFFFFF)V
    .locals 7

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    return-void
.end method

.method public getBounds()Ll0/i;
    .locals 5

    iget-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    :cond_0
    iget-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Lm0/T;->b:Landroid/graphics/Path;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    new-instance v1, Ll0/i;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    iget v3, v0, Landroid/graphics/RectF;->top:F

    iget v4, v0, Landroid/graphics/RectF;->right:F

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v1, v2, v3, v4, v0}, Ll0/i;-><init>(FFFF)V

    return-object v1
.end method

.method public h(I)V
    .locals 2

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    sget-object v1, Lm0/W0;->a:Lm0/W0$a;

    invoke-virtual {v1}, Lm0/W0$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Lm0/W0;->d(II)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_0

    :cond_0
    sget-object p1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    return-void
.end method

.method public i(Ll0/i;Lm0/U0$b;)V
    .locals 4

    invoke-direct {p0, p1}, Lm0/T;->w(Ll0/i;)V

    iget-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    :cond_0
    iget-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v2

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v3

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result p1

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Lm0/T;->b:Landroid/graphics/Path;

    iget-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p2}, Lm0/Y;->b(Lm0/U0$b;)Landroid/graphics/Path$Direction;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public j(FFFF)V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Path;->quadTo(FFFF)V

    return-void
.end method

.method public k(Lm0/U0;Lm0/U0;I)Z
    .locals 3

    sget-object v0, Lm0/Y0;->a:Lm0/Y0$a;

    invoke-virtual {v0}, Lm0/Y0$a;->a()I

    move-result v1

    invoke-static {p3, v1}, Lm0/Y0;->f(II)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p3, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm0/Y0$a;->b()I

    move-result v1

    invoke-static {p3, v1}, Lm0/Y0;->f(II)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p3, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lm0/Y0$a;->c()I

    move-result v1

    invoke-static {p3, v1}, Lm0/Y0;->f(II)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p3, Landroid/graphics/Path$Op;->REVERSE_DIFFERENCE:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lm0/Y0$a;->d()I

    move-result v0

    invoke-static {p3, v0}, Lm0/Y0;->f(II)Z

    move-result p3

    if-eqz p3, :cond_3

    sget-object p3, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_3
    sget-object p3, Landroid/graphics/Path$Op;->XOR:Landroid/graphics/Path$Op;

    :goto_0
    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    instance-of v1, p1, Lm0/T;

    const-string v2, "Unable to obtain android.graphics.Path"

    if-eqz v1, :cond_5

    check-cast p1, Lm0/T;

    invoke-virtual {p1}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object p1

    instance-of v1, p2, Lm0/T;

    if-eqz v1, :cond_4

    check-cast p2, Lm0/T;

    invoke-virtual {p2}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    move-result p1

    return p1

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public l()I
    .locals 2

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    move-result-object v0

    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    if-ne v0, v1, :cond_0

    sget-object v0, Lm0/W0;->a:Lm0/W0$a;

    invoke-virtual {v0}, Lm0/W0$a;->a()I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, Lm0/W0;->a:Lm0/W0$a;

    invoke-virtual {v0}, Lm0/W0$a;->b()I

    move-result v0

    :goto_0
    return v0
.end method

.method public m(Lm0/U0;J)V
    .locals 2

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    instance-of v1, p1, Lm0/T;

    if-eqz v1, :cond_0

    check-cast p1, Lm0/T;

    invoke-virtual {p1}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object p1

    invoke-static {p2, p3}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {p2, p3}, Ll0/g;->n(J)F

    move-result p2

    invoke-virtual {v0, p1, v1, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;FF)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(FF)V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    return-void
.end method

.method public o(FFFFFF)V
    .locals 7

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    return-void
.end method

.method public p(Ll0/k;Lm0/U0$b;)V
    .locals 5

    iget-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    :cond_0
    iget-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll0/k;->e()F

    move-result v1

    invoke-virtual {p1}, Ll0/k;->g()F

    move-result v2

    invoke-virtual {p1}, Ll0/k;->f()F

    move-result v3

    invoke-virtual {p1}, Ll0/k;->a()F

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lm0/T;->d:[F

    if-nez v0, :cond_1

    const/16 v0, 0x8

    new-array v0, v0, [F

    iput-object v0, p0, Lm0/T;->d:[F

    :cond_1
    iget-object v0, p0, Lm0/T;->d:[F

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll0/k;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {p1}, Ll0/k;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->e(J)F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-virtual {p1}, Ll0/k;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    invoke-virtual {p1}, Ll0/k;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->e(J)F

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    invoke-virtual {p1}, Ll0/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    invoke-virtual {p1}, Ll0/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->e(J)F

    move-result v1

    const/4 v2, 0x5

    aput v1, v0, v2

    invoke-virtual {p1}, Ll0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->d(J)F

    move-result v1

    const/4 v2, 0x6

    aput v1, v0, v2

    invoke-virtual {p1}, Ll0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/a;->e(J)F

    move-result p1

    const/4 v1, 0x7

    aput p1, v0, v1

    iget-object p1, p0, Lm0/T;->b:Landroid/graphics/Path;

    iget-object v0, p0, Lm0/T;->c:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Lm0/T;->d:[F

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p2}, Lm0/Y;->b(Lm0/U0$b;)Landroid/graphics/Path$Direction;

    move-result-object p2

    invoke-virtual {p1, v0, v1, p2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    return-void
.end method

.method public r(J)V
    .locals 2

    iget-object v0, p0, Lm0/T;->e:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lm0/T;->e:Landroid/graphics/Matrix;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    :goto_0
    iget-object v0, p0, Lm0/T;->e:Landroid/graphics/Matrix;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object p1, p0, Lm0/T;->b:Landroid/graphics/Path;

    iget-object p2, p0, Lm0/T;->e:Landroid/graphics/Matrix;

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public s(FF)V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->rLineTo(FF)V

    return-void
.end method

.method public u(FF)V
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method

.method public final v()Landroid/graphics/Path;
    .locals 1

    iget-object v0, p0, Lm0/T;->b:Landroid/graphics/Path;

    return-object v0
.end method
