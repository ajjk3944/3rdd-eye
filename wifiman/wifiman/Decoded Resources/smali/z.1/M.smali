.class public abstract Lz/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IIII)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, LY0/c;->a(IIII)J

    move-result-wide p0

    invoke-static {p0, p1}, Lz/M;->b(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static b(J)J
    .locals 0

    return-wide p0
.end method

.method public static c(JLz/K;)J
    .locals 4

    sget-object v0, Lz/K;->Horizontal:Lz/K;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, LY0/b;->n(J)I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LY0/b;->m(J)I

    move-result v1

    :goto_0
    if-ne p2, v0, :cond_1

    invoke-static {p0, p1}, LY0/b;->l(J)I

    move-result v2

    goto :goto_1

    :cond_1
    invoke-static {p0, p1}, LY0/b;->k(J)I

    move-result v2

    :goto_1
    if-ne p2, v0, :cond_2

    invoke-static {p0, p1}, LY0/b;->m(J)I

    move-result v3

    goto :goto_2

    :cond_2
    invoke-static {p0, p1}, LY0/b;->n(J)I

    move-result v3

    :goto_2
    if-ne p2, v0, :cond_3

    invoke-static {p0, p1}, LY0/b;->k(J)I

    move-result p0

    goto :goto_3

    :cond_3
    invoke-static {p0, p1}, LY0/b;->l(J)I

    move-result p0

    :goto_3
    invoke-static {v1, v2, v3, p0}, Lz/M;->a(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final d(JIIII)J
    .locals 0

    invoke-static {p2, p3, p4, p5}, Lz/M;->a(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic e(JIIIIILjava/lang/Object;)J
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    invoke-static {p0, p1}, LY0/b;->n(J)I

    move-result p2

    :cond_0
    move v2, p2

    and-int/lit8 p2, p6, 0x2

    if-eqz p2, :cond_1

    invoke-static {p0, p1}, LY0/b;->l(J)I

    move-result p3

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    invoke-static {p0, p1}, LY0/b;->m(J)I

    move-result p4

    :cond_2
    move v4, p4

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    invoke-static {p0, p1}, LY0/b;->k(J)I

    move-result p5

    :cond_3
    move v5, p5

    move-wide v0, p0

    invoke-static/range {v0 .. v5}, Lz/M;->d(JIIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final f(JLz/K;)J
    .locals 2

    sget-object v0, Lz/K;->Horizontal:Lz/K;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, LY0/b;->n(J)I

    move-result p2

    invoke-static {p0, p1}, LY0/b;->l(J)I

    move-result v0

    invoke-static {p0, p1}, LY0/b;->m(J)I

    move-result v1

    invoke-static {p0, p1}, LY0/b;->k(J)I

    move-result p0

    invoke-static {p2, v0, v1, p0}, LY0/c;->a(IIII)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LY0/b;->m(J)I

    move-result p2

    invoke-static {p0, p1}, LY0/b;->k(J)I

    move-result v0

    invoke-static {p0, p1}, LY0/b;->n(J)I

    move-result v1

    invoke-static {p0, p1}, LY0/b;->l(J)I

    move-result p0

    invoke-static {p2, v0, v1, p0}, LY0/c;->a(IIII)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method
