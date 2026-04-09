.class public abstract LL0/T;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(I)J
    .locals 2

    invoke-static {p0, p0}, LL0/T;->b(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final b(II)J
    .locals 0

    invoke-static {p0, p1}, LL0/T;->d(II)J

    move-result-wide p0

    invoke-static {p0, p1}, LL0/S;->c(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final c(JII)J
    .locals 2

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result v0

    invoke-static {v0, p2, p3}, Lsh/m;->k(III)I

    move-result v0

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result v1

    invoke-static {v1, p2, p3}, Lsh/m;->k(III)I

    move-result p2

    invoke-static {p0, p1}, LL0/S;->n(J)I

    move-result p3

    if-ne v0, p3, :cond_1

    invoke-static {p0, p1}, LL0/S;->i(J)I

    move-result p3

    if-eq p2, p3, :cond_0

    goto :goto_0

    :cond_0
    return-wide p0

    :cond_1
    :goto_0
    invoke-static {v0, p2}, LL0/T;->b(II)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final d(II)J
    .locals 4

    const/16 v0, 0x5d

    const-string v1, ", end: "

    if-ltz p0, :cond_1

    if-ltz p1, :cond_0

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "end cannot be negative. [start: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start cannot be negative. [start: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final e(Ljava/lang/CharSequence;J)Ljava/lang/String;
    .locals 1

    invoke-static {p1, p2}, LL0/S;->l(J)I

    move-result v0

    invoke-static {p1, p2}, LL0/S;->k(J)I

    move-result p1

    invoke-interface {p0, v0, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
