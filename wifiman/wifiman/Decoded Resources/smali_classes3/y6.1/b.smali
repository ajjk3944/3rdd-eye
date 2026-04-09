.class public abstract Ly6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IFFFF)I
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    mul-float/2addr p2, v0

    float-to-int p2, p2

    mul-float/2addr p3, v0

    float-to-int p3, p3

    mul-float/2addr p4, v0

    float-to-int p4, p4

    invoke-static {p0, p1, p2, p3, p4}, Ly6/b;->b(IIIII)I

    move-result p0

    return p0
.end method

.method public static final b(IIIII)I
    .locals 0

    shl-int/lit8 p0, p1, 0x18

    shl-int/lit8 p1, p2, 0x10

    or-int/2addr p0, p1

    shl-int/lit8 p1, p3, 0x8

    or-int/2addr p0, p1

    or-int/2addr p0, p4

    return p0
.end method

.method public static synthetic c(IFFFFILjava/lang/Object;)I
    .locals 2

    and-int/lit8 p6, p5, 0x1

    const/high16 v0, 0x437f0000    # 255.0f

    if-eqz p6, :cond_0

    const/16 p1, 0x18

    invoke-static {p0, p1}, Ly6/b;->d(II)I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/16 p2, 0x10

    invoke-static {p0, p2}, Ly6/b;->d(II)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/16 v1, 0x8

    if-eqz p6, :cond_2

    invoke-static {p0, v1}, Ly6/b;->d(II)I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p3, v0

    :cond_2
    and-int/2addr p5, v1

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    invoke-static {p0, p4}, Ly6/b;->d(II)I

    move-result p4

    int-to-float p4, p4

    div-float/2addr p4, v0

    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, Ly6/b;->a(IFFFF)I

    move-result p0

    return p0
.end method

.method private static final d(II)I
    .locals 0

    shr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final e(I)I
    .locals 1

    const/16 v0, 0x18

    invoke-static {p0, v0}, Ly6/b;->d(II)I

    move-result p0

    return p0
.end method
