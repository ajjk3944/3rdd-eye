.class public abstract LC/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LC/n;)I
    .locals 2

    invoke-interface {p0}, LC/n;->e()Lw/q;

    move-result-object v0

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, LC/n;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LC/n;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p0

    :goto_0
    return p0
.end method
