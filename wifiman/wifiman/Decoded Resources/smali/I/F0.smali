.class public abstract LI/F0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final A(I)Z
    .locals 2

    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/16 v1, 0xe

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    const/16 v0, 0xa

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final B(I)Z
    .locals 1

    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    const/16 v0, 0x17

    if-eq p0, v0, :cond_1

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x16

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1d

    if-eq p0, v0, :cond_1

    const/16 v0, 0x18

    if-eq p0, v0, :cond_1

    const/16 v0, 0x15

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final C(I)Z
    .locals 1

    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0xa0

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final D(I)Z
    .locals 1

    invoke-static {p0}, LI/F0;->C(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LI/F0;->A(I)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final E(Ljava/lang/CharSequence;I)J
    .locals 3

    move v0, p1

    :goto_0
    if-lez v0, :cond_1

    invoke-static {p0, v0}, LI/n;->c(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, LI/F0;->C(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-static {p0, p1}, LI/n;->b(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, LI/F0;->C(I)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v1}, LI/n;->a(I)I

    move-result v1

    add-int/2addr p1, v1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-static {v0, p1}, LL0/T;->b(II)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final F(Landroid/graphics/PointF;)J
    .locals 2

    iget v0, p0, Landroid/graphics/PointF;->x:F

    iget p0, p0, Landroid/graphics/PointF;->y:F

    invoke-static {v0, p0}, Ll0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic a(JLjava/lang/CharSequence;)J
    .locals 0

    invoke-static {p0, p1, p2}, LI/F0;->m(JLjava/lang/CharSequence;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final varargs synthetic b([LR0/i;)LR0/i;
    .locals 0

    invoke-static {p0}, LI/F0;->n([LR0/i;)LR0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LF/E;JLandroidx/compose/ui/platform/w1;)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI/F0;->q(LF/E;JLandroidx/compose/ui/platform/w1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic d(LI/l1;JLandroidx/compose/ui/platform/w1;)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI/F0;->r(LI/l1;JLandroidx/compose/ui/platform/w1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic e(LL0/M;JJLC0/r;Landroidx/compose/ui/platform/w1;)J
    .locals 0

    invoke-static/range {p0 .. p6}, LI/F0;->t(LL0/M;JJLC0/r;Landroidx/compose/ui/platform/w1;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic f(LF/E;Ll0/i;ILL0/J;)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI/F0;->v(LF/E;Ll0/i;ILL0/J;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic g(LI/l1;Ll0/i;ILL0/J;)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI/F0;->w(LI/l1;Ll0/i;ILL0/J;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic h(LF/E;Ll0/i;Ll0/i;ILL0/J;)J
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LI/F0;->x(LF/E;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic i(LI/l1;Ll0/i;Ll0/i;ILL0/J;)J
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LI/F0;->y(LI/l1;Ll0/i;Ll0/i;ILL0/J;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic j(LL0/M;I)Z
    .locals 0

    invoke-static {p0, p1}, LI/F0;->z(LL0/M;I)Z

    move-result p0

    return p0
.end method

.method public static final synthetic k(Ljava/lang/CharSequence;I)J
    .locals 0

    invoke-static {p0, p1}, LI/F0;->E(Ljava/lang/CharSequence;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic l(Landroid/graphics/PointF;)J
    .locals 2

    invoke-static {p0}, LI/F0;->F(Landroid/graphics/PointF;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final m(JLjava/lang/CharSequence;)J
    .locals 5

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result v1

    const/16 v2, 0xa

    if-lez v0, :cond_0

    invoke-static {p2, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v1, v4, :cond_1

    invoke-static {p2, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    :cond_1
    invoke-static {v3}, LI/F0;->D(I)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {v2}, LI/F0;->C(I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v2}, LI/F0;->B(I)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_2
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result p0

    sub-int/2addr v0, p0

    if-eqz v0, :cond_3

    invoke-static {p2, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    invoke-static {v3}, LI/F0;->D(I)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_3
    invoke-static {v0, v1}, LL0/T;->b(II)J

    move-result-wide p0

    return-wide p0

    :cond_4
    invoke-static {v2}, LI/F0;->D(I)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {v3}, LI/F0;->C(I)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static {v3}, LI/F0;->B(I)Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_5
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result p0

    add-int/2addr v1, p0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-eq v1, p0, :cond_6

    invoke-static {p2, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    invoke-static {v2}, LI/F0;->D(I)Z

    move-result p0

    if-nez p0, :cond_5

    :cond_6
    invoke-static {v0, v1}, LL0/T;->b(II)J

    move-result-wide p0

    :cond_7
    return-wide p0
.end method

.method private static final varargs n([LR0/i;)LR0/i;
    .locals 1

    new-instance v0, LI/F0$a;

    invoke-direct {v0, p0}, LI/F0$a;-><init>([LR0/i;)V

    return-object v0
.end method

.method private static final o(JJ)J
    .locals 1

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-static {p2, p3}, LL0/S;->i(J)I

    move-result p1

    invoke-static {p2, p3}, LL0/S;->i(J)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, LL0/T;->b(II)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final p(LL0/k;JLandroidx/compose/ui/platform/w1;)I
    .locals 4

    if-eqz p3, :cond_0

    invoke-interface {p3}, Landroidx/compose/ui/platform/w1;->h()F

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v0

    invoke-virtual {p0, v0}, LL0/k;->p(F)I

    move-result v0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v1

    invoke-virtual {p0, v0}, LL0/k;->t(I)F

    move-result v2

    sub-float/2addr v2, p3

    cmpg-float v1, v1, v2

    const/4 v2, -0x1

    if-ltz v1, :cond_3

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v1

    invoke-virtual {p0, v0}, LL0/k;->l(I)F

    move-result v3

    add-float/2addr v3, p3

    cmpl-float v1, v1, v3

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    neg-float v3, p3

    cmpg-float v1, v1, v3

    if-ltz v1, :cond_3

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p1

    invoke-virtual {p0}, LL0/k;->A()F

    move-result p0

    add-float/2addr p0, p3

    cmpl-float p0, p1, p0

    if-lez p0, :cond_2

    goto :goto_1

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v2
.end method

.method private static final q(LF/E;JLandroidx/compose/ui/platform/w1;)I
    .locals 1

    invoke-virtual {p0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/j0;->f()LL0/M;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LL0/M;->w()LL0/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF/E;->i()LC0/r;

    move-result-object p0

    invoke-static {v0, p1, p2, p0, p3}, LI/F0;->s(LL0/k;JLC0/r;Landroidx/compose/ui/platform/w1;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method private static final r(LI/l1;JLandroidx/compose/ui/platform/w1;)I
    .locals 1

    invoke-virtual {p0}, LI/l1;->f()LL0/M;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LL0/M;->w()LL0/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI/l1;->j()LC0/r;

    move-result-object p0

    invoke-static {v0, p1, p2, p0, p3}, LI/F0;->s(LL0/k;JLC0/r;Landroidx/compose/ui/platform/w1;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method private static final s(LL0/k;JLC0/r;Landroidx/compose/ui/platform/w1;)I
    .locals 7

    const/4 v0, -0x1

    if-eqz p3, :cond_1

    invoke-interface {p3, p1, p2}, LC0/r;->r(J)J

    move-result-wide v1

    invoke-static {p0, v1, v2, p4}, LI/F0;->p(LL0/k;JLandroidx/compose/ui/platform/w1;)I

    move-result p1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, LL0/k;->t(I)F

    move-result p2

    invoke-virtual {p0, p1}, LL0/k;->l(I)F

    move-result p1

    add-float/2addr p2, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float v4, p2, p1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ll0/g;->g(JFFILjava/lang/Object;)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LL0/k;->u(J)I

    move-result p0

    return p0

    :cond_1
    return v0
.end method

.method private static final t(LL0/M;JJLC0/r;Landroidx/compose/ui/platform/w1;)J
    .locals 3

    if-eqz p0, :cond_4

    if-nez p5, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p5, p1, p2}, LC0/r;->r(J)J

    move-result-wide p1

    invoke-interface {p5, p3, p4}, LC0/r;->r(J)J

    move-result-wide p3

    invoke-virtual {p0}, LL0/M;->w()LL0/k;

    move-result-object p5

    invoke-static {p5, p1, p2, p6}, LI/F0;->p(LL0/k;JLandroidx/compose/ui/platform/w1;)I

    move-result p5

    invoke-virtual {p0}, LL0/M;->w()LL0/k;

    move-result-object v0

    invoke-static {v0, p3, p4, p6}, LI/F0;->p(LL0/k;JLandroidx/compose/ui/platform/w1;)I

    move-result p6

    const/4 v0, -0x1

    if-ne p5, v0, :cond_1

    if-ne p6, v0, :cond_3

    sget-object p0, LL0/S;->b:LL0/S$a;

    invoke-virtual {p0}, LL0/S$a;->a()J

    move-result-wide p0

    return-wide p0

    :cond_1
    if-ne p6, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p5, p6}, Ljava/lang/Math;->min(II)I

    move-result p5

    :goto_0
    move p6, p5

    :cond_3
    invoke-virtual {p0, p6}, LL0/M;->v(I)F

    move-result p5

    invoke-virtual {p0, p6}, LL0/M;->m(I)F

    move-result p6

    add-float/2addr p5, p6

    const/4 p6, 0x2

    int-to-float p6, p6

    div-float/2addr p5, p6

    new-instance p6, Ll0/i;

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v0

    invoke-static {p3, p4}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    sub-float v2, p5, v1

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p1

    invoke-static {p3, p4}, Ll0/g;->m(J)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    add-float/2addr p5, v1

    invoke-direct {p6, v0, v2, p1, p5}, Ll0/i;-><init>(FFFF)V

    invoke-virtual {p0}, LL0/M;->w()LL0/k;

    move-result-object p0

    sget-object p1, LL0/F;->a:LL0/F$a;

    invoke-virtual {p1}, LL0/F$a;->a()I

    move-result p1

    sget-object p2, LL0/J;->a:LL0/J$a;

    invoke-virtual {p2}, LL0/J$a;->g()LL0/J;

    move-result-object p2

    invoke-virtual {p0, p6, p1, p2}, LL0/k;->z(Ll0/i;ILL0/J;)J

    move-result-wide p0

    return-wide p0

    :cond_4
    :goto_1
    sget-object p0, LL0/S;->b:LL0/S$a;

    invoke-virtual {p0}, LL0/S$a;->a()J

    move-result-wide p0

    return-wide p0
.end method

.method private static final u(LL0/k;Ll0/i;LC0/r;ILL0/J;)J
    .locals 2

    if-eqz p0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LC0/r;->r(J)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll0/i;->x(J)Ll0/i;

    move-result-object p1

    invoke-virtual {p0, p1, p3, p4}, LL0/k;->z(Ll0/i;ILL0/J;)J

    move-result-wide p0

    return-wide p0

    :cond_1
    :goto_0
    sget-object p0, LL0/S;->b:LL0/S$a;

    invoke-virtual {p0}, LL0/S$a;->a()J

    move-result-wide p0

    return-wide p0
.end method

.method private static final v(LF/E;Ll0/i;ILL0/J;)J
    .locals 1

    invoke-virtual {p0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/j0;->f()LL0/M;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LL0/M;->w()LL0/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, LF/E;->i()LC0/r;

    move-result-object p0

    invoke-static {v0, p1, p0, p2, p3}, LI/F0;->u(LL0/k;Ll0/i;LC0/r;ILL0/J;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final w(LI/l1;Ll0/i;ILL0/J;)J
    .locals 1

    invoke-virtual {p0}, LI/l1;->f()LL0/M;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LL0/M;->w()LL0/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, LI/l1;->j()LC0/r;

    move-result-object p0

    invoke-static {v0, p1, p0, p2, p3}, LI/F0;->u(LL0/k;Ll0/i;LC0/r;ILL0/J;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final x(LF/E;Ll0/i;Ll0/i;ILL0/J;)J
    .locals 2

    invoke-static {p0, p1, p3, p4}, LI/F0;->v(LF/E;Ll0/i;ILL0/J;)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, LL0/S;->b:LL0/S$a;

    invoke-virtual {p0}, LL0/S$a;->a()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-static {p0, p2, p3, p4}, LI/F0;->v(LF/E;Ll0/i;ILL0/J;)J

    move-result-wide p0

    invoke-static {p0, p1}, LL0/S;->h(J)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p0, LL0/S;->b:LL0/S$a;

    invoke-virtual {p0}, LL0/S$a;->a()J

    move-result-wide p0

    return-wide p0

    :cond_1
    invoke-static {v0, v1, p0, p1}, LI/F0;->o(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final y(LI/l1;Ll0/i;Ll0/i;ILL0/J;)J
    .locals 2

    invoke-static {p0, p1, p3, p4}, LI/F0;->w(LI/l1;Ll0/i;ILL0/J;)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, LL0/S;->b:LL0/S$a;

    invoke-virtual {p0}, LL0/S$a;->a()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-static {p0, p2, p3, p4}, LI/F0;->w(LI/l1;Ll0/i;ILL0/J;)J

    move-result-wide p0

    invoke-static {p0, p1}, LL0/S;->h(J)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p0, LL0/S;->b:LL0/S$a;

    invoke-virtual {p0}, LL0/S$a;->a()J

    move-result-wide p0

    return-wide p0

    :cond_1
    invoke-static {v0, v1, p0, p1}, LI/F0;->o(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final z(LL0/M;I)Z
    .locals 5

    invoke-virtual {p0, p1}, LL0/M;->q(I)I

    move-result v0

    invoke-virtual {p0, v0}, LL0/M;->u(I)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v0, v3, v1, v4}, LL0/M;->p(LL0/M;IZILjava/lang/Object;)I

    move-result v0

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, LL0/M;->c(I)LW0/i;

    move-result-object v0

    sub-int/2addr p1, v2

    invoke-virtual {p0, p1}, LL0/M;->c(I)LW0/i;

    move-result-object p0

    if-eq v0, p0, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    return v2

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, LL0/M;->y(I)LW0/i;

    move-result-object v0

    invoke-virtual {p0, p1}, LL0/M;->c(I)LW0/i;

    move-result-object p0

    if-eq v0, p0, :cond_3

    goto :goto_2

    :cond_3
    move v2, v3

    :goto_2
    return v2
.end method
