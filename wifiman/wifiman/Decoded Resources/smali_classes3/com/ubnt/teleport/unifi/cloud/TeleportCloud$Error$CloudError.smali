.class public abstract Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;
.super Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "CloudError"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$TeleportDisabled;,
        Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;,
        Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$ClientInvalid;,
        Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;",
        "()V",
        "ClientInvalid",
        "SiteGatewayNotFound",
        "TeleportDisabled",
        "Unauthenticated",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$ClientInvalid;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$TeleportDisabled;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;",
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


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;-><init>()V

    return-void
.end method
