.class public final Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;",
        "",
        "",
        "scanDoneId",
        "<init>",
        "(Ljava/lang/Integer;)V",
        "copy",
        "(Ljava/lang/Integer;)Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/Integer;",
        "()Ljava/lang/Integer;",
        "Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;",
        "b",
        "()Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;",
        "state",
        "wifiman-wizard_release"
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
.field private final a:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "scan_done"
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;->a:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public final b()Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;
    .locals 2

    sget-object v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;->Companion:Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a$a;

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a$a;->a()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;->a:Ljava/lang/Integer;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;)Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "scan_done"
        .end annotation
    .end param

    new-instance v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;

    invoke-direct {v0, p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;-><init>(Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;

    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;->a:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;->a:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;->a:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;->a:Ljava/lang/Integer;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ApiV1WifiScanDone(scanDoneId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
