.class public interface abstract Lr/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/i;


# virtual methods
.method public a(Lr/s0;)Lr/A0;
    .locals 0

    .line 2
    new-instance p1, Lr/A0;

    invoke-direct {p1, p0}, Lr/A0;-><init>(Lr/I;)V

    return-object p1
.end method

.method public bridge synthetic a(Lr/s0;)Lr/v0;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lr/I;->a(Lr/s0;)Lr/A0;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(JFFF)F
.end method

.method public abstract c(FFF)J
.end method

.method public d(FFF)F
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Lr/I;->c(FFF)J

    move-result-wide v1

    move-object v0, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-interface/range {v0 .. v5}, Lr/I;->b(JFFF)F

    move-result p1

    return p1
.end method

.method public abstract e(JFFF)F
.end method
