.class public abstract Lr/B;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lr/z;FF)F
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v0}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v0

    invoke-interface {p0, v0}, Lr/z;->a(Lr/s0;)Lr/x0;

    move-result-object p0

    invoke-static {p1}, Lr/r;->a(F)Lr/m;

    move-result-object p1

    invoke-static {p2}, Lr/r;->a(F)Lr/m;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lr/x0;->c(Lr/q;Lr/q;)Lr/q;

    move-result-object p0

    check-cast p0, Lr/m;

    invoke-virtual {p0}, Lr/m;->f()F

    move-result p0

    return p0
.end method

.method public static final b(Lr/J;)Lr/z;
    .locals 1

    new-instance v0, Lr/A;

    invoke-direct {v0, p0}, Lr/A;-><init>(Lr/J;)V

    return-object v0
.end method
