.class public final Lcom/ui/wifiman/model/wmw/g$c$b$a;
.super Lcom/ui/wifiman/model/wmw/g$c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/g$c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/common/semver/SemVer;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:F


# direct methods
.method public constructor <init>(Lcom/ui/common/semver/SemVer;JJJF)V
    .locals 1

    const-string v0, "fwVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/wmw/g$c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->a:Lcom/ui/common/semver/SemVer;

    iput-wide p2, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->b:J

    iput-wide p4, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->c:J

    iput-wide p6, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->d:J

    iput p8, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->e:F

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->e:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->a:Lcom/ui/common/semver/SemVer;

    iget-object v3, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;->a:Lcom/ui/common/semver/SemVer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->b:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->c:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->d:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->e:F

    iget p1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;->e:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->a:Lcom/ui/common/semver/SemVer;

    invoke-virtual {v0}, Lcom/ui/common/semver/SemVer;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->a:Lcom/ui/common/semver/SemVer;

    iget-wide v1, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->b:J

    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->c:J

    iget-wide v5, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->d:J

    iget v7, p0, Lcom/ui/wifiman/model/wmw/g$c$b$a;->e:F

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Download(fwVersion="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startedAt="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", totalBytes="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", downloadedBytes="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
