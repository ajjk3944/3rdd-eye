.class public abstract Ly6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lu6/b;IF)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lu6/b;->a()J

    move-result-wide v0

    invoke-static {v0, v1, p2}, Ly6/c;->b(JF)I

    move-result p0

    invoke-static {p1, p0}, Ly6/d;->d(II)I

    move-result p0

    return p0
.end method

.method private static final b(JF)I
    .locals 9

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p2, v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    move v3, v1

    goto :goto_1

    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_1

    const p2, 0x3d4ccccd    # 0.05f

    :goto_0
    move v3, p2

    goto :goto_1

    :cond_1
    const/high16 v0, 0x40400000    # 3.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_2

    const p2, 0x3d8f5c29    # 0.07f

    goto :goto_0

    :cond_2
    const/high16 v0, 0x40800000    # 4.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_3

    const p2, 0x3da3d70a    # 0.08f

    goto :goto_0

    :cond_3
    const/high16 v0, 0x40c00000    # 6.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_4

    const p2, 0x3db851ec    # 0.09f

    goto :goto_0

    :cond_4
    const/high16 v0, 0x41000000    # 8.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_5

    const p2, 0x3de147ae    # 0.11f

    goto :goto_0

    :cond_5
    const/high16 v0, 0x41400000    # 12.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_6

    const p2, 0x3df5c28f    # 0.12f

    goto :goto_0

    :cond_6
    const/high16 v0, 0x41800000    # 16.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_7

    const p2, 0x3e0f5c29    # 0.14f

    goto :goto_0

    :cond_7
    const/high16 v0, 0x41c00000    # 24.0f

    cmpg-float p2, p2, v0

    if-gez p2, :cond_8

    const p2, 0x3e19999a    # 0.15f

    goto :goto_0

    :cond_8
    const p2, 0x3e23d70a    # 0.16f

    goto :goto_0

    :goto_1
    invoke-static {p0, p1}, Ly6/d;->c(J)F

    move-result p2

    cmpg-float p2, p2, v1

    if-nez p2, :cond_9

    const/4 p0, 0x0

    goto :goto_2

    :cond_9
    long-to-int v2, p0

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Ly6/b;->c(IFFFFILjava/lang/Object;)I

    move-result p0

    :goto_2
    return p0
.end method
