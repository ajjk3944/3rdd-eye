.class public abstract Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error;
.super Lcom/ubnt/teleport/unifi/cloud/api/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenNotFound;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenNotRegistered;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenInvalidForRequestType;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenExpired;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenRegistrationFailed;
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
    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error;-><init>()V

    return-void
.end method
