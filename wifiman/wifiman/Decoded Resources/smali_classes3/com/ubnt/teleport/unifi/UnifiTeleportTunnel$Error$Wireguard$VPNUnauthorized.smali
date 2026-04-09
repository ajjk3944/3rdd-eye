.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;
.super Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VPNUnauthorized"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;",
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;",
        "()V",
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


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$VPNUnauthorized;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
