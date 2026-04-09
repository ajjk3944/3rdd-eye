.class public abstract LC/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LC/C;)J
    .locals 4

    invoke-virtual {p0}, LC/C;->v()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0}, LC/C;->H()I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v0, v2

    invoke-virtual {p0}, LC/C;->w()F

    move-result v2

    invoke-virtual {p0}, LC/C;->H()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr v2, p0

    invoke-static {v2}, Loh/b;->g(F)J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0
.end method
