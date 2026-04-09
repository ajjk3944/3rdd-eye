.class public final Lcom/ui/wifiman/model/wmw/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

.field private final b:Lcom/ui/common/semver/SemVer;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/firmware/a;)V
    .locals 1

    const-string v0, "firmware"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/g$b;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->a()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/g$b;->b:Lcom/ui/common/semver/SemVer;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/ubiquiti/firmware/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/g$b;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    return-object v0
.end method

.method public final c()Lcom/ui/common/semver/SemVer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/g$b;->b:Lcom/ui/common/semver/SemVer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/wmw/g$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/g$b;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    iget-object p1, p1, Lcom/ui/wifiman/model/wmw/g$b;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/g$b;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/firmware/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/g$b;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Firmware(firmware="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
