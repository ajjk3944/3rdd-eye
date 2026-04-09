.class public abstract Lu6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lu6/e;)F
    .locals 0

    invoke-interface {p0}, Lu6/e;->h()Z

    move-result p0

    if-eqz p0, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 p0, -0x40800000    # -1.0f

    :goto_0
    return p0
.end method

.method public static b(Lu6/e;F)F
    .locals 0

    invoke-interface {p0}, Lu6/e;->getDensity()F

    move-result p0

    mul-float/2addr p1, p0

    return p1
.end method

.method public static c(Lu6/e;F)I
    .locals 0

    invoke-interface {p0, p1}, Lu6/e;->g(F)F

    move-result p0

    float-to-int p0, p0

    return p0
.end method

.method public static d(Lu6/e;F)F
    .locals 0

    invoke-interface {p0}, Lu6/e;->y()F

    move-result p0

    mul-float/2addr p1, p0

    return p1
.end method

.method public static e(Lu6/e;F)F
    .locals 0

    invoke-interface {p0}, Lu6/e;->getDensity()F

    move-result p0

    mul-float/2addr p1, p0

    return p1
.end method
