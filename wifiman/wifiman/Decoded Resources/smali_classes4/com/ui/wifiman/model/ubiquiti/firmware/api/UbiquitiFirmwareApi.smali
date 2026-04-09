.class public interface abstract Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Error;,
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a;,
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;,
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;,
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;,
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008`\u0018\u00002\u00020\u0001:\u0006\u0006\u000f\u0010\u0011\u0012\u0013J\u001f\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J1\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00042\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0001\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH\'\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi;",
        "",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;",
        "request",
        "Lgg/z;",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;",
        "a",
        "(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;)Lgg/z;",
        "",
        "token",
        "",
        "filter",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;",
        "b",
        "(Ljava/lang/String;Ljava/util/List;)Lgg/z;",
        "Error",
        "Firmwares",
        "FwList",
        "TokenRequest",
        "TokenResponse",
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


# virtual methods
.method public abstract a(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;)Lgg/z;
    .param p1    # Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;
        .annotation runtime LRj/a;
        .end annotation
    .end param
    .annotation runtime LRj/o;
        value = "api/v1/sso-token"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;",
            ")",
            "Lgg/z<",
            "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Ljava/util/List;)Lgg/z;
    .param p1    # Ljava/lang/String;
        .annotation runtime LRj/i;
            value = "Authorization"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime LRj/t;
            value = "filter"
        .end annotation
    .end param
    .annotation runtime LRj/f;
        value = "api/firmware-latest"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lgg/z<",
            "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$Firmwares;",
            ">;"
        }
    .end annotation
.end method
