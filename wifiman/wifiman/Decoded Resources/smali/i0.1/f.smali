.class public abstract Li0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/l;Li0/g;)Li0/d;
    .locals 2

    new-instance v0, Li0/e;

    new-instance v1, Li0/f$a;

    invoke-direct {v1, p0, p1}, Li0/f$a;-><init>(Lmh/l;Li0/g;)V

    invoke-direct {v0, v1}, Li0/e;-><init>(Lmh/l;)V

    return-object v0
.end method

.method public static final synthetic b(Li0/d;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Li0/f;->e(Li0/d;J)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Li0/g;Li0/b;)V
    .locals 0

    invoke-static {p0, p1}, Li0/f;->f(Li0/g;Li0/b;)V

    return-void
.end method

.method public static final synthetic d(LE0/A0;Lmh/l;)V
    .locals 0

    invoke-static {p0, p1}, Li0/f;->g(LE0/A0;Lmh/l;)V

    return-void
.end method

.method private static final e(Li0/d;J)Z
    .locals 5

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p0

    invoke-virtual {p0}, LE0/G;->c()LC0/r;

    move-result-object p0

    invoke-interface {p0}, LC0/r;->M()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-interface {p0}, LC0/r;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v0

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v2

    invoke-static {p0}, LC0/s;->e(LC0/r;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result p0

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v3

    int-to-float v0, v0

    add-float/2addr v0, p0

    int-to-float v2, v2

    add-float/2addr v2, v3

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v4

    cmpg-float p0, p0, v4

    if-gtz p0, :cond_2

    cmpg-float p0, v4, v0

    if-gtz p0, :cond_2

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p0

    cmpg-float p1, v3, p0

    if-gtz p1, :cond_2

    cmpg-float p0, p0, v2

    if-gtz p0, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method private static final f(Li0/g;Li0/b;)V
    .locals 0

    invoke-interface {p0, p1}, Li0/g;->T(Li0/b;)V

    invoke-interface {p0, p1}, Li0/g;->G0(Li0/b;)V

    return-void
.end method

.method private static final g(LE0/A0;Lmh/l;)V
    .locals 2

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LE0/z0;->ContinueTraversal:LE0/z0;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, LE0/B0;->f(LE0/A0;Lmh/l;)V

    return-void
.end method
