.class public final Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;
.super Lcom/ui/wifiman/model/ubiquiti/console/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/ui/common/semver/SemVer;

.field private final b:LRd/a;


# direct methods
.method public constructor <init>(Lcom/ui/common/semver/SemVer;LRd/a;)V
    .locals 1

    const-string v0, "teleportStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a:Lcom/ui/common/semver/SemVer;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b:LRd/a;

    return-void
.end method


# virtual methods
.method public final a()LRd/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b:LRd/a;

    return-object v0
.end method

.method public final b()Lcom/ui/common/semver/SemVer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a:Lcom/ui/common/semver/SemVer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a:Lcom/ui/common/semver/SemVer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a:Lcom/ui/common/semver/SemVer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b:LRd/a;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b:LRd/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a:Lcom/ui/common/semver/SemVer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/ui/common/semver/SemVer;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b:LRd/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a:Lcom/ui/common/semver/SemVer;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b:LRd/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Network(version="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", teleportStatus="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
