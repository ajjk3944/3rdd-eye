.class public interface abstract LK7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\u0008\u0008\u0001\u0010\u000e\u001a\u00020\tH\'\u00a2\u0006\u0004\u0008\u0010\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "LK7/a;",
        "",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;",
        "request",
        "Lgg/z;",
        "LMj/w;",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;",
        "c",
        "(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)Lgg/z;",
        "",
        "requestId",
        "Lcom/ubnt/teleport/unifi/cloud/api/a;",
        "a",
        "(Ljava/lang/String;)Lgg/z;",
        "token",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;",
        "b",
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


# virtual methods
.method public abstract a(Ljava/lang/String;)Lgg/z;
    .param p1    # Ljava/lang/String;
        .annotation runtime LRj/s;
            value = "requestId"
        .end annotation
    .end param
    .annotation runtime LRj/f;
        value = "/teleport/{requestId}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lgg/z<",
            "LMj/w<",
            "Lcom/ubnt/teleport/unifi/cloud/api/a;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lgg/z;
    .param p1    # Ljava/lang/String;
        .annotation runtime LRj/t;
            value = "token"
        .end annotation
    .end param
    .annotation runtime LRj/f;
        value = "/teleport/metadata"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lgg/z<",
            "LMj/w<",
            "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)Lgg/z;
    .param p1    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;
        .annotation runtime LRj/a;
        .end annotation
    .end param
    .annotation runtime LRj/o;
        value = "/teleport"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;",
            ")",
            "Lgg/z<",
            "LMj/w<",
            "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;",
            ">;>;"
        }
    .end annotation
.end method
