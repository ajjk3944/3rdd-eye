.class public final Lu6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/e;
.implements Lu6/c;


# instance fields
.field private final a:Landroid/graphics/RectF;

.field private b:F

.field private c:F

.field private d:Z

.field private e:Z

.field private f:F

.field private final synthetic g:Lu6/a;

.field private final h:Lk6/c;


# direct methods
.method public constructor <init>(Landroid/graphics/RectF;FFZZF)V
    .locals 1

    const-string/jumbo v0, "canvasBounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/f;->a:Landroid/graphics/RectF;

    iput p2, p0, Lu6/f;->b:F

    iput p3, p0, Lu6/f;->c:F

    iput-boolean p4, p0, Lu6/f;->d:Z

    iput-boolean p5, p0, Lu6/f;->e:Z

    iput p6, p0, Lu6/f;->f:F

    new-instance p1, Lu6/a;

    invoke-direct {p1}, Lu6/a;-><init>()V

    iput-object p1, p0, Lu6/f;->g:Lu6/a;

    new-instance p1, Lk6/c;

    invoke-direct {p1}, Lk6/c;-><init>()V

    iput-object p1, p0, Lu6/f;->h:Lk6/c;

    return-void
.end method


# virtual methods
.method public b(F)F
    .locals 0

    invoke-static {p0, p1}, Lu6/e$a;->e(Lu6/e;F)F

    move-result p1

    return p1
.end method

.method public c()Lk6/c;
    .locals 1

    iget-object v0, p0, Lu6/f;->h:Lk6/c;

    return-object v0
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu6/f;->g:Lu6/a;

    invoke-virtual {v0, p1, p2}, Lu6/a;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lu6/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lu6/f;

    invoke-virtual {p0}, Lu6/f;->s()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {p1}, Lu6/f;->s()Landroid/graphics/RectF;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lu6/f;->getDensity()F

    move-result v1

    invoke-virtual {p1}, Lu6/f;->getDensity()F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lu6/f;->y()F

    move-result v1

    invoke-virtual {p1}, Lu6/f;->y()F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lu6/f;->h()Z

    move-result v1

    invoke-virtual {p1}, Lu6/f;->h()Z

    move-result v3

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lu6/f;->f()Z

    move-result v1

    invoke-virtual {p1}, Lu6/f;->f()Z

    move-result v3

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lu6/f;->l()F

    move-result v1

    invoke-virtual {p1}, Lu6/f;->l()F

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lu6/f;->e:Z

    return v0
.end method

.method public g(F)F
    .locals 0

    invoke-static {p0, p1}, Lu6/e$a;->b(Lu6/e;F)F

    move-result p1

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget v0, p0, Lu6/f;->b:F

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lu6/f;->d:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lu6/f;->s()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RectF;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lu6/f;->getDensity()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lu6/f;->y()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lu6/f;->h()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lu6/f;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lu6/f;->l()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j()F
    .locals 1

    invoke-static {p0}, Lu6/e$a;->a(Lu6/e;)F

    move-result v0

    return v0
.end method

.method public l()F
    .locals 1

    iget v0, p0, Lu6/f;->f:F

    return v0
.end method

.method public m(F)F
    .locals 0

    invoke-static {p0, p1}, Lu6/e$a;->d(Lu6/e;F)F

    move-result p1

    return p1
.end method

.method public o(F)I
    .locals 0

    invoke-static {p0, p1}, Lu6/e$a;->c(Lu6/e;F)I

    move-result p1

    return p1
.end method

.method public p(Ljava/lang/Object;)Z
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu6/f;->g:Lu6/a;

    invoke-virtual {v0, p1}, Lu6/a;->p(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu6/f;->g:Lu6/a;

    invoke-virtual {v0, p1}, Lu6/a;->q(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public r()V
    .locals 1

    iget-object v0, p0, Lu6/f;->g:Lu6/a;

    invoke-virtual {v0}, Lu6/a;->r()V

    return-void
.end method

.method public s()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lu6/f;->a:Landroid/graphics/RectF;

    return-object v0
.end method

.method public t()V
    .locals 1

    invoke-virtual {p0}, Lu6/f;->r()V

    invoke-virtual {p0}, Lu6/f;->c()Lk6/c;

    move-result-object v0

    invoke-virtual {v0}, Lk6/c;->c()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "MutableMeasureContext(canvasBounds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu6/f;->s()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu6/f;->getDensity()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fontScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu6/f;->y()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", isLtr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu6/f;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isHorizontalScrollEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu6/f;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", chartScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu6/f;->l()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(F)V
    .locals 0

    iput p1, p0, Lu6/f;->f:F

    return-void
.end method

.method public v(F)V
    .locals 0

    iput p1, p0, Lu6/f;->b:F

    return-void
.end method

.method public w(F)V
    .locals 0

    iput p1, p0, Lu6/f;->c:F

    return-void
.end method

.method public x(Z)V
    .locals 0

    iput-boolean p1, p0, Lu6/f;->e:Z

    return-void
.end method

.method public y()F
    .locals 1

    iget v0, p0, Lu6/f;->c:F

    return v0
.end method

.method public z(Z)V
    .locals 0

    iput-boolean p1, p0, Lu6/f;->d:Z

    return-void
.end method
