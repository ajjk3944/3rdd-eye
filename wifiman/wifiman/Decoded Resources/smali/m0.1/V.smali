.class public abstract Lm0/V;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(F)Lm0/V0;
    .locals 2

    new-instance v0, Lm0/U;

    new-instance v1, Landroid/graphics/CornerPathEffect;

    invoke-direct {v1, p0}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-direct {v0, v1}, Lm0/U;-><init>(Landroid/graphics/PathEffect;)V

    return-object v0
.end method

.method public static final b([FF)Lm0/V0;
    .locals 2

    new-instance v0, Lm0/U;

    new-instance v1, Landroid/graphics/DashPathEffect;

    invoke-direct {v1, p0, p1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v0, v1}, Lm0/U;-><init>(Landroid/graphics/PathEffect;)V

    return-object v0
.end method

.method public static final c(Lm0/V0;)Landroid/graphics/PathEffect;
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lm0/U;

    invoke-virtual {p0}, Lm0/U;->a()Landroid/graphics/PathEffect;

    move-result-object p0

    return-object p0
.end method
