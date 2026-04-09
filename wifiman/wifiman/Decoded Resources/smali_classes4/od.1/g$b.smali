.class public final Lod/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lod/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:J

.field private c:I


# direct methods
.method public constructor <init>(ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lod/g$b;->a:Z

    iput-wide p2, p0, Lod/g$b;->b:J

    sget-object p1, Lod/g;->c:Lod/g$a;

    invoke-virtual {p1}, Lod/g$a;->a()I

    move-result p1

    iput p1, p0, Lod/g$b;->c:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iput p1, p0, Lod/g$b;->c:I

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lod/g$b;->c:I

    return v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lod/g$b;->b:J

    return-wide v0
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Lod/g$b;->a:Z

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lod/g$b;->a:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lod/g$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lod/g$b;

    iget-boolean v1, p0, Lod/g$b;->a:Z

    iget-boolean v3, p1, Lod/g$b;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lod/g$b;->b:J

    iget-wide v5, p1, Lod/g$b;->b:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lod/g$b;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lod/g$b;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lod/g$b;->a:Z

    iget-wide v1, p0, Lod/g$b;->b:J

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Stats(discovered="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
