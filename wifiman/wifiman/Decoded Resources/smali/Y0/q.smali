.class public abstract LY0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JJ)LY0/p;
    .locals 5

    new-instance v0, LY0/p;

    invoke-static {p0, p1}, LY0/n;->h(J)I

    move-result v1

    invoke-static {p0, p1}, LY0/n;->i(J)I

    move-result v2

    invoke-static {p0, p1}, LY0/n;->h(J)I

    move-result v3

    invoke-static {p2, p3}, LY0/r;->g(J)I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {p0, p1}, LY0/n;->i(J)I

    move-result p0

    invoke-static {p2, p3}, LY0/r;->f(J)I

    move-result p1

    add-int/2addr p0, p1

    invoke-direct {v0, v1, v2, v3, p0}, LY0/p;-><init>(IIII)V

    return-object v0
.end method

.method public static final b(Ll0/i;)LY0/p;
    .locals 4

    new-instance v0, LY0/p;

    invoke-virtual {p0}, Ll0/i;->k()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {p0}, Ll0/i;->n()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {p0}, Ll0/i;->l()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {p0}, Ll0/i;->e()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, LY0/p;-><init>(IIII)V

    return-object v0
.end method
