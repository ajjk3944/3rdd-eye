.class public abstract LIi/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LIi/y0;)LIi/x;
    .locals 1

    new-instance v0, LIi/y;

    invoke-direct {v0, p0}, LIi/y;-><init>(LIi/y0;)V

    return-object v0
.end method

.method public static synthetic b(LIi/y0;ILjava/lang/Object;)LIi/x;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LIi/z;->a(LIi/y0;)LIi/x;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LIi/x;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p1}, LYg/u;->h(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, LIi/x;->S(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, LIi/x;->a(Ljava/lang/Throwable;)Z

    move-result p0

    :goto_0
    return p0
.end method
