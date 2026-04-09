.class public abstract Lz/S;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lz/V;)Lz/m;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lz/V;->a()Lz/m;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(Lz/V;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lz/V;->b()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static final c(LC0/n;)Lz/V;
    .locals 1

    invoke-interface {p0}, LC0/n;->b()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lz/V;

    if-eqz v0, :cond_0

    check-cast p0, Lz/V;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/layout/t;)Lz/V;
    .locals 1

    invoke-interface {p0}, LC0/E;->b()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lz/V;

    if-eqz v0, :cond_0

    check-cast p0, Lz/V;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final e(Lz/V;)F
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lz/V;->d()F

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final f(Lz/V;)Z
    .locals 0

    invoke-static {p0}, Lz/S;->a(Lz/V;)Lz/m;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lz/m;->c()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
