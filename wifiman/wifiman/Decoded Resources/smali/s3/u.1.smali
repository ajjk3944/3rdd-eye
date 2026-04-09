.class public abstract Ls3/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Ls3/v;
    .locals 1

    sget-object v0, Ls3/w;->c:Ls3/w;

    invoke-static {p0, v0}, Ls3/u;->b(Landroid/content/Context;Ls3/w;)Ls3/v;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ls3/w;)Ls3/v;
    .locals 1

    new-instance v0, Lu3/d;

    invoke-direct {v0, p0, p1}, Lu3/d;-><init>(Landroid/content/Context;Ls3/w;)V

    return-object v0
.end method
