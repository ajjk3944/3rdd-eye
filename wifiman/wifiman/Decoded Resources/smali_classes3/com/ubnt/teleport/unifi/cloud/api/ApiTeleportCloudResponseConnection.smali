.class public final Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;
.super Lcom/ubnt/teleport/unifi/cloud/api/a;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0081\u0008\u0018\u00002\u00020\u0001B1\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0008\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ:\u0010\n\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\rR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0016\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;",
        "Lcom/ubnt/teleport/unifi/cloud/api/a;",
        "",
        "clientIp",
        "",
        "dns",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;",
        "remoteClientInfo",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)V",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;",
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
        "b",
        "d",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "e",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;",
        "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;",
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

.field private final d:Ljava/util/List;

.field private final e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "client_ip"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "dns_addrs"
        .end annotation
    .end param
    .param p3    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;
        .annotation runtime LY6/g;
            name = "server_info"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/cloud/api/a;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d:Ljava/util/List;

    iput-object p3, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "client_ip"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "dns_addrs"
        .end annotation
    .end param
    .param p3    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;
        .annotation runtime LY6/g;
            name = "server_info"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;",
            ")",
            "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;"
        }
    .end annotation

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;

    invoke-direct {v0, p1, p2, p3}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)V

    return-object v0
.end method

.method public final d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d:Ljava/util/List;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    iget-object p1, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApiTeleportCloudResponseConnection(clientIp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", remoteClientInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
