.class public abstract LF/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LL0/N;)Z
    .locals 0

    invoke-static {p0}, LF/n0;->b(LL0/N;)Z

    move-result p0

    return p0
.end method

.method private static final b(LL0/N;)Z
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LL0/N;->d()LL0/D;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LL0/N;->a()LL0/D;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LL0/N;->b()LL0/D;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LL0/N;->c()LL0/D;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
