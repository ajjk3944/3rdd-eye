.class public interface abstract Lr/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/z0;


# virtual methods
.method public b(Lr/q;Lr/q;Lr/q;)J
    .locals 2

    invoke-interface {p0}, Lr/y0;->e()I

    move-result p1

    invoke-interface {p0}, Lr/y0;->g()I

    move-result p2

    add-int/2addr p1, p2

    int-to-long p1, p1

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method public abstract e()I
.end method

.method public abstract g()I
.end method
