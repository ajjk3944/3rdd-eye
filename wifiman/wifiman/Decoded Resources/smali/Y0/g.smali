.class final LY0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/d;


# instance fields
.field private final a:F

.field private final b:F

.field private final c:LZ0/a;


# direct methods
.method public constructor <init>(FFLZ0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LY0/g;->a:F

    iput p2, p0, LY0/g;->b:F

    iput-object p3, p0, LY0/g;->c:LZ0/a;

    return-void
.end method


# virtual methods
.method public e0(F)J
    .locals 2

    iget-object v0, p0, LY0/g;->c:LZ0/a;

    invoke-interface {v0, p1}, LZ0/a;->a(F)F

    move-result p1

    invoke-static {p1}, LY0/w;->f(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LY0/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LY0/g;

    iget v1, p0, LY0/g;->a:F

    iget v3, p1, LY0/g;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LY0/g;->b:F

    iget v3, p1, LY0/g;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LY0/g;->c:LZ0/a;

    iget-object p1, p1, LY0/g;->c:LZ0/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getDensity()F
    .locals 1

    iget v0, p0, LY0/g;->a:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LY0/g;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY0/g;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LY0/g;->c:LZ0/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public n0(J)F
    .locals 4

    invoke-static {p1, p2}, LY0/v;->g(J)J

    move-result-wide v0

    sget-object v2, LY0/x;->b:LY0/x$a;

    invoke-virtual {v2}, LY0/x$a;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/x;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LY0/g;->c:LZ0/a;

    invoke-static {p1, p2}, LY0/v;->h(J)F

    move-result p1

    invoke-interface {v0, p1}, LZ0/a;->b(F)F

    move-result p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Only Sp can convert to Px"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DensityWithConverter(density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY0/g;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fontScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY0/g;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", converter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY0/g;->c:LZ0/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public y()F
    .locals 1

    iget v0, p0, LY0/g;->b:F

    return v0
.end method
