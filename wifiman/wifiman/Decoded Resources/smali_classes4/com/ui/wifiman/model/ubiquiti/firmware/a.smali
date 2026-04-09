.class public final Lcom/ui/wifiman/model/ubiquiti/firmware/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

.field private final c:Lcom/ui/common/semver/SemVer;

.field private final d:Ljava/lang/String;

.field private final e:J

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "semVer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checksum"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->b:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c:Lcom/ui/common/semver/SemVer;

    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->d:Ljava/lang/String;

    iput-wide p5, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->e:J

    iput-object p7, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/common/semver/SemVer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c:Lcom/ui/common/semver/SemVer;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->e:J

    return-wide v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->b:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->b:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c:Lcom/ui/common/semver/SemVer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c:Lcom/ui/common/semver/SemVer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->e:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->g:Ljava/lang/String;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->b:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c:Lcom/ui/common/semver/SemVer;

    invoke-virtual {v1}, Lcom/ui/common/semver/SemVer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->b:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->c:Lcom/ui/common/semver/SemVer;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->d:Ljava/lang/String;

    iget-wide v4, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->e:J

    iget-object v6, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->f:Ljava/lang/String;

    iget-object v7, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->g:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "UbiquitiFirmware(id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", channel="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", semVer="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", product="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", sizeBytes="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", checksum="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
