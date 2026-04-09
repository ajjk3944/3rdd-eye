.class public abstract LF/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(JLl0/i;)J
    .locals 0

    invoke-static {p0, p1, p2}, LF/k0;->b(JLl0/i;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final b(JLl0/i;)J
    .locals 3

    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v0

    invoke-virtual {p2}, Ll0/i;->k()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-virtual {p2}, Ll0/i;->k()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v0

    invoke-virtual {p2}, Ll0/i;->l()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-virtual {p2}, Ll0/i;->l()F

    move-result v0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v0

    :goto_0
    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result v1

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result p0

    goto :goto_1

    :cond_2
    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result v1

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_3

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result p0

    goto :goto_1

    :cond_3
    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result p0

    :goto_1
    invoke-static {v0, p0}, Ll0/h;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method
