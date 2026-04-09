.class public abstract LI/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LI/b1;->a:F

    return-void
.end method

.method public static final synthetic a(LY0/d;Ll0/i;ZI)Ll0/i;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI/b1;->d(LY0/d;Ll0/i;ZI)Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lm0/l0;)Z
    .locals 0

    invoke-static {p0}, LI/b1;->e(Lm0/l0;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(F)F
    .locals 0

    invoke-static {p0}, LI/b1;->f(F)F

    move-result p0

    return p0
.end method

.method private static final d(LY0/d;Ll0/i;ZI)Ll0/i;
    .locals 8

    sget v0, LI/b1;->a:F

    invoke-interface {p0, v0}, LY0/d;->x1(F)I

    move-result p0

    if-eqz p2, :cond_0

    int-to-float v0, p3

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v1

    sub-float/2addr v0, v1

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v0

    goto :goto_0

    :goto_1
    if-eqz p2, :cond_1

    int-to-float p2, p3

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result p3

    sub-float/2addr p2, p3

    :goto_2
    int-to-float p0, p0

    add-float/2addr p2, p0

    move v4, p2

    goto :goto_3

    :cond_1
    invoke-virtual {p1}, Ll0/i;->k()F

    move-result p2

    goto :goto_2

    :goto_3
    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Ll0/i;->d(Ll0/i;FFFFILjava/lang/Object;)Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lm0/l0;)Z
    .locals 4

    instance-of v0, p0, Lm0/j1;

    if-eqz v0, :cond_0

    check-cast p0, Lm0/j1;

    invoke-virtual {p0}, Lm0/j1;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method private static final f(F)F
    .locals 2

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    :goto_0
    double-to-float p0, v0

    goto :goto_1

    :cond_1
    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    goto :goto_0

    :cond_2
    :goto_1
    return p0
.end method
