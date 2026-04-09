.class public abstract Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;
.super Lcom/ubnt/teleport/TeleportTunnel$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Stun;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\u0008\t\n\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;",
        "Lcom/ubnt/teleport/TeleportTunnel$Error;",
        "()V",
        "Cloud",
        "InterruptedByUser",
        "ReconnectionFailed",
        "Stun",
        "Wireguard",
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Cloud;",
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;",
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;",
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Stun;",
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;",
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
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/ubnt/teleport/TeleportTunnel$Error;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;-><init>()V

    return-void
.end method
