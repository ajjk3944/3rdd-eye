.class public abstract LQ0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LQ0/A$a;)LQ0/A;
    .locals 0

    invoke-virtual {p0}, LQ0/A$a;->h()LQ0/A;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZZ)I
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    const/4 p0, 0x3

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const/4 p0, 0x2

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(LQ0/A;I)I
    .locals 1

    sget-object v0, LQ0/A;->b:LQ0/A$a;

    invoke-static {v0}, LQ0/e;->a(LQ0/A$a;)LQ0/A;

    move-result-object v0

    invoke-virtual {p0, v0}, LQ0/A;->n(LQ0/A;)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v0, LQ0/v;->b:LQ0/v$a;

    invoke-virtual {v0}, LQ0/v$a;->a()I

    move-result v0

    invoke-static {p1, v0}, LQ0/v;->f(II)Z

    move-result p1

    invoke-static {p0, p1}, LQ0/e;->b(ZZ)I

    move-result p0

    return p0
.end method
