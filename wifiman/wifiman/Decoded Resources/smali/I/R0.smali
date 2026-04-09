.class public abstract LI/R0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(JLl0/i;)F
    .locals 3

    invoke-static {p2, p0, p1}, LM/A;->a(Ll0/i;J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p2}, Ll0/i;->p()J

    move-result-wide v0

    invoke-static {v0, v1, p0, p1}, Ll0/g;->q(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->l(J)F

    move-result v0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v2, v0, v1

    if-gez v2, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-virtual {p2}, Ll0/i;->q()J

    move-result-wide v1

    invoke-static {v1, v2, p0, p1}, Ll0/g;->q(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->l(J)F

    move-result v1

    cmpg-float v2, v1, v0

    if-gez v2, :cond_2

    move v0, v1

    :cond_2
    invoke-virtual {p2}, Ll0/i;->g()J

    move-result-wide v1

    invoke-static {v1, v2, p0, p1}, Ll0/g;->q(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->l(J)F

    move-result v1

    cmpg-float v2, v1, v0

    if-gez v2, :cond_3

    move v0, v1

    :cond_3
    invoke-virtual {p2}, Ll0/i;->h()J

    move-result-wide v1

    invoke-static {v1, v2, p0, p1}, Ll0/g;->q(JJ)J

    move-result-wide p0

    invoke-static {p0, p1}, Ll0/g;->l(J)F

    move-result p0

    cmpg-float p1, p0, v0

    if-gez p1, :cond_4

    move v0, p0

    :cond_4
    return v0
.end method

.method public static final b(JLl0/i;Ll0/i;)I
    .locals 0

    invoke-static {p0, p1, p2}, LI/R0;->a(JLl0/i;)F

    move-result p2

    invoke-static {p0, p1, p3}, LI/R0;->a(JLl0/i;)F

    move-result p0

    cmpg-float p0, p2, p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-gez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    :goto_0
    return p0
.end method
