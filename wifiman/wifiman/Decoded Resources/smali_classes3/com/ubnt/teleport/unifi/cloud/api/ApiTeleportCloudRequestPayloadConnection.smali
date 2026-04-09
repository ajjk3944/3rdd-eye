.class public final Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;
.super LK7/b;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0081\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J.\u0010\t\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u000c\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;",
        "LK7/b;",
        "",
        "clientName",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;",
        "clientInfo",
        "secret",
        "<init>",
        "(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;Ljava/lang/String;)V",
        "copy",
        "(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "c",
        "Ljava/lang/String;",
        "d",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;",
        "b",
        "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;",
        "e",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "client_name"
        .end annotation
    .end param
    .param p2    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;
        .annotation runtime LY6/g;
            name = "client_info"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "secret"
        .end annotation
    .end param

    const-string/jumbo v0, "clientName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clientInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "secret"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LK7/b;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    iput-object p3, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "client_name"
        .end annotation
    .end param
    .param p2    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;
        .annotation runtime LY6/g;
            name = "client_info"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "secret"
        .end annotation
    .end param

    const-string/jumbo v0, "clientName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clientInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "secret"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;

    invoke-direct {v0, p1, p2, p3}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->e:Ljava/lang/String;

    iget-object p1, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApiTeleportCloudRequestPayloadConnection(clientName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", clientInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secret="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
