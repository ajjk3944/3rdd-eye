.class final Ll7/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private b:I

.field private c:F

.field private d:J

.field private e:Lmh/p;

.field private f:Z


# direct methods
.method public constructor <init>(IIFJLmh/p;Z)V
    .locals 1

    const-string/jumbo v0, "animationUpdater"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll7/f$b;->a:I

    iput p2, p0, Ll7/f$b;->b:I

    iput p3, p0, Ll7/f$b;->c:F

    iput-wide p4, p0, Ll7/f$b;->d:J

    iput-object p6, p0, Ll7/f$b;->e:Lmh/p;

    iput-boolean p7, p0, Ll7/f$b;->f:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ll7/f$b;->f:Z

    return v0
.end method

.method public final b()Lmh/p;
    .locals 1

    iget-object v0, p0, Ll7/f$b;->e:Lmh/p;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Ll7/f$b;->a:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ll7/f$b;->b:I

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Ll7/f$b;->c:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll7/f$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll7/f$b;

    iget v1, p0, Ll7/f$b;->a:I

    iget v3, p1, Ll7/f$b;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ll7/f$b;->b:I

    iget v3, p1, Ll7/f$b;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Ll7/f$b;->c:F

    iget v3, p1, Ll7/f$b;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Ll7/f$b;->d:J

    iget-wide v5, p1, Ll7/f$b;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ll7/f$b;->e:Lmh/p;

    iget-object v3, p1, Ll7/f$b;->e:Lmh/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Ll7/f$b;->f:Z

    iget-boolean p1, p1, Ll7/f$b;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f(Z)V
    .locals 0

    iput-boolean p1, p0, Ll7/f$b;->f:Z

    return-void
.end method

.method public final g(Lmh/p;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll7/f$b;->e:Lmh/p;

    return-void
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, Ll7/f$b;->b:I

    return-void
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ll7/f$b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll7/f$b;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll7/f$b;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll7/f$b;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll7/f$b;->e:Lmh/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ll7/f$b;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, Ll7/f$b;->d:J

    return-void
.end method

.method public final j(F)V
    .locals 0

    iput p1, p0, Ll7/f$b;->c:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Ll7/f$b;->a:I

    iget v1, p0, Ll7/f$b;->b:I

    iget v2, p0, Ll7/f$b;->c:F

    iget-wide v3, p0, Ll7/f$b;->d:J

    iget-object v5, p0, Ll7/f$b;->e:Lmh/p;

    iget-boolean v6, p0, Ll7/f$b;->f:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "TileRenderState(bufferIndex="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", zCoordinate="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", tileUpdateAt="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", animationUpdater="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", animating="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
