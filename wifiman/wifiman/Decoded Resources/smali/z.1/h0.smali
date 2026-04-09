.class public abstract Lz/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IIII)Lz/f0;
    .locals 1

    new-instance v0, Lz/q;

    invoke-direct {v0, p0, p1, p2, p3}, Lz/q;-><init>(IIII)V

    return-object v0
.end method

.method public static final b(FFFF)Lz/f0;
    .locals 7

    new-instance v6, Lz/p;

    const/4 v5, 0x0

    move-object v0, v6

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lz/p;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public static synthetic c(FFFFILjava/lang/Object;)Lz/f0;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    int-to-float p0, v0

    invoke-static {p0}, LY0/h;->j(F)F

    move-result p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    int-to-float p1, v0

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    int-to-float p2, v0

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    int-to-float p3, v0

    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    :cond_3
    invoke-static {p0, p1, p2, p3}, Lz/h0;->b(FFFF)Lz/f0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lz/f0;Lz/f0;)Lz/f0;
    .locals 1

    new-instance v0, Lz/a;

    invoke-direct {v0, p0, p1}, Lz/a;-><init>(Lz/f0;Lz/f0;)V

    return-object v0
.end method

.method public static final e(Lz/N;)Lz/f0;
    .locals 1

    new-instance v0, Lz/Q;

    invoke-direct {v0, p0}, Lz/Q;-><init>(Lz/N;)V

    return-object v0
.end method

.method public static final f(Lz/f0;LY0/d;)Lz/N;
    .locals 1

    new-instance v0, Lz/G;

    invoke-direct {v0, p0, p1}, Lz/G;-><init>(Lz/f0;LY0/d;)V

    return-object v0
.end method

.method public static final g(Lz/f0;Lz/f0;)Lz/f0;
    .locals 1

    new-instance v0, Lz/o;

    invoke-direct {v0, p0, p1}, Lz/o;-><init>(Lz/f0;Lz/f0;)V

    return-object v0
.end method

.method public static final h(Lz/f0;Lz/f0;)Lz/f0;
    .locals 1

    new-instance v0, Lz/c0;

    invoke-direct {v0, p0, p1}, Lz/c0;-><init>(Lz/f0;Lz/f0;)V

    return-object v0
.end method
