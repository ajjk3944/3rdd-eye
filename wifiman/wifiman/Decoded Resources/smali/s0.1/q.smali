.class public abstract Ls0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ls0/p;JJLjava/lang/String;Lm0/w0;Z)Ls0/p;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ls0/p;->y(J)V

    invoke-virtual {p0, p7}, Ls0/p;->u(Z)V

    invoke-virtual {p0, p6}, Ls0/p;->v(Lm0/w0;)V

    invoke-virtual {p0, p3, p4}, Ls0/p;->z(J)V

    invoke-virtual {p0, p5}, Ls0/p;->x(Ljava/lang/String;)V

    return-object p0
.end method

.method private static final b(JI)Lm0/w0;
    .locals 2

    const-wide/16 v0, 0x10

    cmp-long v0, p0, v0

    if-eqz v0, :cond_0

    sget-object v0, Lm0/w0;->b:Lm0/w0$a;

    invoke-virtual {v0, p0, p1, p2}, Lm0/w0$a;->a(JI)Lm0/w0;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final c(Ls0/c;Ls0/m;)Ls0/c;
    .locals 5

    invoke-virtual {p1}, Ls0/m;->u()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Ls0/m;->e(I)Ls0/o;

    move-result-object v2

    instance-of v3, v2, Ls0/r;

    if-eqz v3, :cond_0

    new-instance v3, Ls0/f;

    invoke-direct {v3}, Ls0/f;-><init>()V

    check-cast v2, Ls0/r;

    invoke-virtual {v2}, Ls0/r;->g()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls0/f;->k(Ljava/util/List;)V

    invoke-virtual {v2}, Ls0/r;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->l(I)V

    invoke-virtual {v2}, Ls0/r;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls0/f;->j(Ljava/lang/String;)V

    invoke-virtual {v2}, Ls0/r;->b()Lm0/l0;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls0/f;->h(Lm0/l0;)V

    invoke-virtual {v2}, Ls0/r;->e()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->i(F)V

    invoke-virtual {v2}, Ls0/r;->j()Lm0/l0;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls0/f;->m(Lm0/l0;)V

    invoke-virtual {v2}, Ls0/r;->k()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->n(F)V

    invoke-virtual {v2}, Ls0/r;->v()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->r(F)V

    invoke-virtual {v2}, Ls0/r;->q()I

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->o(I)V

    invoke-virtual {v2}, Ls0/r;->s()I

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->p(I)V

    invoke-virtual {v2}, Ls0/r;->u()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->q(F)V

    invoke-virtual {v2}, Ls0/r;->y()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->u(F)V

    invoke-virtual {v2}, Ls0/r;->w()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/f;->s(F)V

    invoke-virtual {v2}, Ls0/r;->x()F

    move-result v2

    invoke-virtual {v3, v2}, Ls0/f;->t(F)V

    invoke-virtual {p0, v1, v3}, Ls0/c;->i(ILs0/k;)V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Ls0/m;

    if-eqz v3, :cond_1

    new-instance v3, Ls0/c;

    invoke-direct {v3}, Ls0/c;-><init>()V

    check-cast v2, Ls0/m;

    invoke-virtual {v2}, Ls0/m;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls0/c;->p(Ljava/lang/String;)V

    invoke-virtual {v2}, Ls0/m;->k()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/c;->s(F)V

    invoke-virtual {v2}, Ls0/m;->q()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/c;->t(F)V

    invoke-virtual {v2}, Ls0/m;->s()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/c;->u(F)V

    invoke-virtual {v2}, Ls0/m;->v()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/c;->v(F)V

    invoke-virtual {v2}, Ls0/m;->w()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/c;->w(F)V

    invoke-virtual {v2}, Ls0/m;->i()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/c;->q(F)V

    invoke-virtual {v2}, Ls0/m;->j()F

    move-result v4

    invoke-virtual {v3, v4}, Ls0/c;->r(F)V

    invoke-virtual {v2}, Ls0/m;->f()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls0/c;->o(Ljava/util/List;)V

    invoke-static {v3, v2}, Ls0/q;->c(Ls0/c;Ls0/m;)Ls0/c;

    invoke-virtual {p0, v1, v3}, Ls0/c;->i(ILs0/k;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_2
    return-object p0
.end method

.method public static final d(LY0/d;Ls0/d;Ls0/c;)Ls0/p;
    .locals 10

    invoke-virtual {p1}, Ls0/d;->e()F

    move-result v0

    invoke-virtual {p1}, Ls0/d;->d()F

    move-result v1

    invoke-static {p0, v0, v1}, Ls0/q;->e(LY0/d;FF)J

    move-result-wide v3

    invoke-virtual {p1}, Ls0/d;->l()F

    move-result p0

    invoke-virtual {p1}, Ls0/d;->k()F

    move-result v0

    invoke-static {v3, v4, p0, v0}, Ls0/q;->f(JFF)J

    move-result-wide v5

    new-instance v2, Ls0/p;

    invoke-direct {v2, p2}, Ls0/p;-><init>(Ls0/c;)V

    invoke-virtual {p1}, Ls0/d;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Ls0/d;->j()J

    move-result-wide v0

    invoke-virtual {p1}, Ls0/d;->i()I

    move-result p0

    invoke-static {v0, v1, p0}, Ls0/q;->b(JI)Lm0/w0;

    move-result-object v8

    invoke-virtual {p1}, Ls0/d;->c()Z

    move-result v9

    invoke-static/range {v2 .. v9}, Ls0/q;->a(Ls0/p;JJLjava/lang/String;Lm0/w0;Z)Ls0/p;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LY0/d;FF)J
    .locals 0

    invoke-interface {p0, p1}, LY0/d;->d1(F)F

    move-result p1

    invoke-interface {p0, p2}, LY0/d;->d1(F)F

    move-result p0

    invoke-static {p1, p0}, Ll0/n;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final f(JFF)J
    .locals 1

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Ll0/m;->i(J)F

    move-result p2

    :cond_0
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Ll0/m;->g(J)F

    move-result p3

    :cond_1
    invoke-static {p2, p3}, Ll0/n;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final g(Ls0/d;LT/l;I)Ls0/p;
    .locals 6

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)"

    const v2, 0x544566b0

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LY0/d;

    invoke-virtual {p0}, Ls0/d;->f()I

    move-result v0

    int-to-float v0, v0

    invoke-interface {p2}, LY0/d;->getDensity()F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    invoke-interface {p1, v0, v1}, LT/l;->j(J)Z

    move-result v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v0, Ls0/c;

    invoke-direct {v0}, Ls0/c;-><init>()V

    invoke-virtual {p0}, Ls0/d;->h()Ls0/m;

    move-result-object v1

    invoke-static {v0, v1}, Ls0/q;->c(Ls0/c;Ls0/m;)Ls0/c;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-static {p2, p0, v0}, Ls0/q;->d(LY0/d;Ls0/d;Ls0/c;)Ls0/p;

    move-result-object v1

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Ls0/p;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-object v1
.end method
