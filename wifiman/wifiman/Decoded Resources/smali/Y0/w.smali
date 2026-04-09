.class public abstract LY0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(FJ)J
    .locals 0

    invoke-static {p1, p2, p0}, LY0/w;->j(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b(J)V
    .locals 0

    invoke-static {p0, p1}, LY0/w;->h(J)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot perform operation for Unspecified type."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(JJ)V
    .locals 4

    invoke-static {p0, p1}, LY0/w;->h(J)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2, p3}, LY0/w;->h(J)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0, p1}, LY0/v;->g(J)J

    move-result-wide v0

    invoke-static {p2, p3}, LY0/v;->g(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/x;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot perform operation for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, LY0/v;->g(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/x;->i(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, LY0/v;->g(J)J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/x;->i(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot perform operation for Unspecified type."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(D)J
    .locals 2

    const-wide v0, 0x200000000L

    double-to-float p0, p0

    invoke-static {v0, v1, p0}, LY0/w;->j(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(D)J
    .locals 2

    const-wide v0, 0x100000000L

    double-to-float p0, p0

    invoke-static {v0, v1, p0}, LY0/w;->j(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final f(F)J
    .locals 2

    const-wide v0, 0x100000000L

    invoke-static {v0, v1, p0}, LY0/w;->j(JF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final g(I)J
    .locals 2

    const-wide v0, 0x100000000L

    int-to-float p0, p0

    invoke-static {v0, v1, p0}, LY0/w;->j(JF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final h(J)Z
    .locals 2

    invoke-static {p0, p1}, LY0/v;->f(J)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final i(JJF)J
    .locals 2

    invoke-static {p0, p1, p2, p3}, LY0/w;->c(JJ)V

    invoke-static {p0, p1}, LY0/v;->f(J)J

    move-result-wide v0

    invoke-static {p0, p1}, LY0/v;->h(J)F

    move-result p0

    invoke-static {p2, p3}, LY0/v;->h(J)F

    move-result p1

    invoke-static {p0, p1, p4}, La1/b;->b(FFF)F

    move-result p0

    invoke-static {v0, v1, p0}, LY0/w;->j(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final j(JF)J
    .locals 4

    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p0, v0

    invoke-static {p0, p1}, LY0/v;->c(J)J

    move-result-wide p0

    return-wide p0
.end method
