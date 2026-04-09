.class public abstract Ll0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JJ)Ll0/i;
    .locals 2

    new-instance v0, Ll0/i;

    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result p0

    invoke-static {p2, p3}, Ll0/g;->m(J)F

    move-result p1

    invoke-static {p2, p3}, Ll0/g;->n(J)F

    move-result p2

    invoke-direct {v0, v1, p0, p1, p2}, Ll0/i;-><init>(FFFF)V

    return-object v0
.end method

.method public static final b(JJ)Ll0/i;
    .locals 5

    new-instance v0, Ll0/i;

    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result v2

    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v3

    invoke-static {p2, p3}, Ll0/m;->i(J)F

    move-result v4

    add-float/2addr v3, v4

    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result p0

    invoke-static {p2, p3}, Ll0/m;->g(J)F

    move-result p1

    add-float/2addr p0, p1

    invoke-direct {v0, v1, v2, v3, p0}, Ll0/i;-><init>(FFFF)V

    return-object v0
.end method
