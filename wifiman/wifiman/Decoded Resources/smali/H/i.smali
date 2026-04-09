.class public abstract LH/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LH/h;)Ljava/lang/CharSequence;
    .locals 3

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v0

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    invoke-virtual {p0, v0, v1}, LH/h;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LH/h;I)Ljava/lang/CharSequence;
    .locals 3

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result v0

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, LH/h;->length()I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p0, v0, p1}, LH/h;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LH/h;I)Ljava/lang/CharSequence;
    .locals 2

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v0

    sub-int/2addr v0, p1

    const/4 p1, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v0

    invoke-virtual {p0, p1, v0}, LH/h;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method
