.class public final Lg6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg6/b;


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lg6/c;->a:F

    .line 3
    iput p2, p0, Lg6/c;->b:F

    .line 4
    iput p3, p0, Lg6/c;->c:F

    .line 5
    iput p4, p0, Lg6/c;->d:F

    return-void
.end method

.method public synthetic constructor <init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lg6/c;-><init>(FFFF)V

    return-void
.end method

.method public static synthetic l(Lg6/c;FFFFILjava/lang/Object;)Lg6/c;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lg6/c;->k(FFFF)Lg6/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(FF)V
    .locals 0

    iput p1, p0, Lg6/c;->a:F

    iput p2, p0, Lg6/c;->c:F

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lg6/c;->j(F)Lg6/c;

    return-void
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lg6/c;->d:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lg6/c;->c:F

    return v0
.end method

.method public final e(Z)F
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lg6/c;->a:F

    goto :goto_0

    :cond_0
    iget p1, p0, Lg6/c;->c:F

    :goto_0
    return p1
.end method

.method public final f(Z)F
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lg6/c;->c:F

    goto :goto_0

    :cond_0
    iget p1, p0, Lg6/c;->a:F

    :goto_0
    return p1
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lg6/c;->a:F

    return v0
.end method

.method public final h()F
    .locals 1

    iget v0, p0, Lg6/c;->b:F

    return v0
.end method

.method public final i()F
    .locals 2

    iget v0, p0, Lg6/c;->b:F

    iget v1, p0, Lg6/c;->d:F

    add-float/2addr v0, v1

    return v0
.end method

.method public final j(F)Lg6/c;
    .locals 0

    invoke-virtual {p0, p1, p1, p1, p1}, Lg6/c;->k(FFFF)Lg6/c;

    move-result-object p1

    return-object p1
.end method

.method public final k(FFFF)Lg6/c;
    .locals 0

    iput p1, p0, Lg6/c;->a:F

    iput p2, p0, Lg6/c;->b:F

    iput p3, p0, Lg6/c;->c:F

    iput p4, p0, Lg6/c;->d:F

    return-object p0
.end method

.method public final m(F)V
    .locals 0

    iput p1, p0, Lg6/c;->d:F

    return-void
.end method

.method public final n(F)Lg6/c;
    .locals 1

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Lg6/c;->a:F

    iput p1, p0, Lg6/c;->c:F

    return-object p0
.end method

.method public final o(F)V
    .locals 0

    iput p1, p0, Lg6/c;->b:F

    return-void
.end method

.method public final p(Lg6/c;)V
    .locals 2

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lg6/c;->a:F

    iget v1, p1, Lg6/c;->a:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lg6/c;->a:F

    iget v0, p0, Lg6/c;->b:F

    iget v1, p1, Lg6/c;->b:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lg6/c;->b:F

    iget v0, p0, Lg6/c;->c:F

    iget v1, p1, Lg6/c;->c:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lg6/c;->c:F

    iget v0, p0, Lg6/c;->d:F

    iget p1, p1, Lg6/c;->d:F

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lg6/c;->d:F

    return-void
.end method

.method public final q(F)Lg6/c;
    .locals 1

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Lg6/c;->b:F

    iput p1, p0, Lg6/c;->d:F

    return-object p0
.end method
