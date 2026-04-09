.class public abstract Lr/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(F)Lr/m;
    .locals 1

    new-instance v0, Lr/m;

    invoke-direct {v0, p0}, Lr/m;-><init>(F)V

    return-object v0
.end method

.method public static final b(FF)Lr/n;
    .locals 1

    new-instance v0, Lr/n;

    invoke-direct {v0, p0, p1}, Lr/n;-><init>(FF)V

    return-object v0
.end method

.method public static final c(FFF)Lr/o;
    .locals 1

    new-instance v0, Lr/o;

    invoke-direct {v0, p0, p1, p2}, Lr/o;-><init>(FFF)V

    return-object v0
.end method

.method public static final d(FFFF)Lr/p;
    .locals 1

    new-instance v0, Lr/p;

    invoke-direct {v0, p0, p1, p2, p3}, Lr/p;-><init>(FFFF)V

    return-object v0
.end method

.method public static final e(Lr/q;)Lr/q;
    .locals 4

    invoke-static {p0}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v0

    invoke-virtual {v0}, Lr/q;->b()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p0, v2}, Lr/q;->a(I)F

    move-result v3

    invoke-virtual {v0, v2, v3}, Lr/q;->e(IF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final f(Lr/q;Lr/q;)V
    .locals 3

    invoke-virtual {p0}, Lr/q;->b()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Lr/q;->a(I)F

    move-result v2

    invoke-virtual {p0, v1, v2}, Lr/q;->e(IF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final g(Lr/q;)Lr/q;
    .locals 1

    invoke-virtual {p0}, Lr/q;->c()Lr/q;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
