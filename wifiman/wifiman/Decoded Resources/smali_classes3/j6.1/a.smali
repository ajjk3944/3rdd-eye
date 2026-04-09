.class public final Lj6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# instance fields
.field private a:F

.field private b:F

.field private c:La6/a;


# direct methods
.method public constructor <init>(FFLa6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lj6/a;->a:F

    .line 3
    iput p2, p0, Lj6/a;->b:F

    .line 4
    iput-object p3, p0, Lj6/a;->c:La6/a;

    return-void
.end method

.method public synthetic constructor <init>(FFLa6/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lj6/a;-><init>(FFLa6/a;)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    invoke-static {p0}, Lj6/b$a;->c(Lj6/b;)F

    move-result v0

    return v0
.end method

.method public final b()F
    .locals 1

    invoke-virtual {p0}, Lj6/a;->e()F

    move-result v0

    return v0
.end method

.method public c(F)Lj6/b;
    .locals 0

    invoke-static {p0, p1}, Lj6/b$a;->d(Lj6/b;F)Lj6/b;

    move-result-object p1

    return-object p1
.end method

.method public d()La6/a;
    .locals 1

    iget-object v0, p0, Lj6/a;->c:La6/a;

    return-object v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lj6/a;->b:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj6/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj6/a;

    invoke-virtual {p0}, Lj6/a;->g()F

    move-result v1

    invoke-virtual {p1}, Lj6/a;->g()F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lj6/a;->e()F

    move-result v1

    invoke-virtual {p1}, Lj6/a;->e()F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lj6/a;->d()La6/a;

    move-result-object v1

    invoke-virtual {p1}, Lj6/a;->d()La6/a;

    move-result-object p1

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()F
    .locals 1

    invoke-virtual {p0}, Lj6/a;->g()F

    move-result v0

    return v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lj6/a;->a:F

    return v0
.end method

.method public final h(FFLa6/a;)Lj6/a;
    .locals 0

    invoke-virtual {p0, p1}, Lj6/a;->i(F)V

    invoke-virtual {p0, p2}, Lj6/a;->k(F)V

    invoke-virtual {p0, p3}, Lj6/a;->j(La6/a;)V

    return-object p0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lj6/a;->g()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lj6/a;->e()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lj6/a;->d()La6/a;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj6/a;->d()La6/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public i(F)V
    .locals 0

    iput p1, p0, Lj6/a;->a:F

    return-void
.end method

.method public j(La6/a;)V
    .locals 0

    iput-object p1, p0, Lj6/a;->c:La6/a;

    return-void
.end method

.method public k(F)V
    .locals 0

    iput p1, p0, Lj6/a;->b:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "MutableSegmentProperties(segmentWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj6/a;->a()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", contentWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj6/a;->g()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", marginWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj6/a;->e()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
