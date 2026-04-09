.class public final Ls6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:I

.field private e:Z

.field private f:F

.field private g:F

.field private h:F

.field private i:I

.field private j:F


# direct methods
.method public constructor <init>(FFFIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ls6/a;->a:F

    .line 3
    iput p2, p0, Ls6/a;->b:F

    .line 4
    iput p3, p0, Ls6/a;->c:F

    .line 5
    iput p4, p0, Ls6/a;->d:I

    .line 6
    iput-boolean p5, p0, Ls6/a;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(FFFIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p7, v0

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    move v2, p2

    goto :goto_3

    :cond_3
    move v2, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move p6, p2

    goto :goto_4

    :cond_4
    move p6, p5

    :goto_4
    move-object p1, p0

    move p2, p7

    move p3, v1

    move p4, v0

    move p5, v2

    .line 7
    invoke-direct/range {p1 .. p6}, Ls6/a;-><init>(FFFIZ)V

    return-void
.end method

.method private final b(Lu6/b;)Z
    .locals 2

    iget v0, p0, Ls6/a;->a:F

    iget v1, p0, Ls6/a;->f:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ls6/a;->b:F

    iget v1, p0, Ls6/a;->g:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ls6/a;->c:F

    iget v1, p0, Ls6/a;->h:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ls6/a;->d:I

    iget v1, p0, Ls6/a;->i:I

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lu6/e;->getDensity()F

    move-result v0

    iget v1, p0, Ls6/a;->j:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget v0, p0, Ls6/a;->a:F

    iput v0, p0, Ls6/a;->f:F

    iget v0, p0, Ls6/a;->b:F

    iput v0, p0, Ls6/a;->g:F

    iget v0, p0, Ls6/a;->c:F

    iput v0, p0, Ls6/a;->h:F

    iget v0, p0, Ls6/a;->d:I

    iput v0, p0, Ls6/a;->i:I

    invoke-interface {p1}, Lu6/e;->getDensity()F

    move-result p1

    iput p1, p0, Ls6/a;->j:F

    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method private final c(Lu6/b;Landroid/graphics/Paint;I)V
    .locals 3

    iget v0, p0, Ls6/a;->d:I

    if-eqz v0, :cond_2

    iget v0, p0, Ls6/a;->a:F

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-nez v2, :cond_0

    iget v2, p0, Ls6/a;->b:F

    cmpg-float v2, v2, v1

    if-nez v2, :cond_0

    iget v2, p0, Ls6/a;->c:F

    cmpg-float v1, v2, v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Ls6/a;->e:Z

    if-eqz v1, :cond_1

    invoke-static {p1, p3, v0}, Ly6/c;->a(Lu6/b;IF)I

    move-result p3

    :cond_1
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    iget p3, p0, Ls6/a;->a:F

    invoke-interface {p1, p3}, Lu6/e;->g(F)F

    move-result p3

    iget v0, p0, Ls6/a;->b:F

    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result v0

    iget v1, p0, Ls6/a;->c:F

    invoke-interface {p1, v1}, Lu6/e;->g(F)F

    move-result p1

    iget v1, p0, Ls6/a;->d:I

    invoke-virtual {p2, p3, v0, p1, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p2}, Landroid/graphics/Paint;->clearShadowLayer()V

    :goto_1
    return-void
.end method


# virtual methods
.method public final a(Lu6/b;Landroid/graphics/Paint;I)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "paint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ls6/a;->b(Lu6/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Ls6/a;->c(Lu6/b;Landroid/graphics/Paint;I)V

    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls6/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls6/a;

    iget v1, p0, Ls6/a;->a:F

    iget v3, p1, Ls6/a;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ls6/a;->b:F

    iget v3, p1, Ls6/a;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Ls6/a;->c:F

    iget v3, p1, Ls6/a;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Ls6/a;->d:I

    iget v3, p1, Ls6/a;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Ls6/a;->e:Z

    iget-boolean p1, p1, Ls6/a;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Ls6/a;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls6/a;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls6/a;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls6/a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls6/a;->e:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ComponentShadow(radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ls6/a;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", dx="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ls6/a;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", dy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ls6/a;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ls6/a;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", applyElevationOverlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ls6/a;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
