.class public final Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Links"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;",
        "",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;",
        "data",
        "<init>",
        "(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;)V",
        "copy",
        "(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;",
        "()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;)V
    .locals 0
    .param p1    # Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;
        .annotation runtime LY6/g;
            name = "data"
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;

    return-object v0
.end method

.method public final copy(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;
    .locals 1
    .param p1    # Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;
        .annotation runtime LY6/g;
            name = "data"
        .end annotation
    .end param

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;-><init>(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Links(data="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
