.class public abstract LIi/S0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LIi/y0;)LIi/A;
    .locals 1

    new-instance v0, LIi/R0;

    invoke-direct {v0, p0}, LIi/R0;-><init>(LIi/y0;)V

    return-object v0
.end method

.method public static synthetic b(LIi/y0;ILjava/lang/Object;)LIi/A;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LIi/S0;->a(LIi/y0;)LIi/A;

    move-result-object p0

    return-object p0
.end method
