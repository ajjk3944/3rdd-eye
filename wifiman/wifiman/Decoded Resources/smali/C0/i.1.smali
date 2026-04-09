.class public abstract LC0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(JJ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, LC0/i;->e(JJ)F

    move-result p0

    return p0
.end method

.method public static final synthetic b(JJ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, LC0/i;->f(JJ)F

    move-result p0

    return p0
.end method

.method public static final synthetic c(JJ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, LC0/i;->g(JJ)F

    move-result p0

    return p0
.end method

.method public static final synthetic d(JJ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, LC0/i;->h(JJ)F

    move-result p0

    return p0
.end method

.method private static final e(JJ)F
    .locals 0

    invoke-static {p2, p3}, Ll0/m;->g(J)F

    move-result p2

    invoke-static {p0, p1}, Ll0/m;->g(J)F

    move-result p0

    div-float/2addr p2, p0

    return p2
.end method

.method private static final f(JJ)F
    .locals 1

    invoke-static {p0, p1, p2, p3}, LC0/i;->h(JJ)F

    move-result v0

    invoke-static {p0, p1, p2, p3}, LC0/i;->e(JJ)F

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    return p0
.end method

.method private static final g(JJ)F
    .locals 1

    invoke-static {p0, p1, p2, p3}, LC0/i;->h(JJ)F

    move-result v0

    invoke-static {p0, p1, p2, p3}, LC0/i;->e(JJ)F

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method

.method private static final h(JJ)F
    .locals 0

    invoke-static {p2, p3}, Ll0/m;->i(J)F

    move-result p2

    invoke-static {p0, p1}, Ll0/m;->i(J)F

    move-result p0

    div-float/2addr p2, p0

    return p2
.end method
