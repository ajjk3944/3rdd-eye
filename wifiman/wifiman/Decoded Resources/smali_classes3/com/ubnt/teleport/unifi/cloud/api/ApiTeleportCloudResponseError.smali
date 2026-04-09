.class public abstract Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError;
.super Lcom/ubnt/teleport/unifi/cloud/api/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$RequestFailed;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$ClientNotFound;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$SiteGatewayNotFound;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$TeleportDisabled;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/cloud/api/a;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError;-><init>()V

    return-void
.end method
