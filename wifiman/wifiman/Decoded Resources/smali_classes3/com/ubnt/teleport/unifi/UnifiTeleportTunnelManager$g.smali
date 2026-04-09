.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->A(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 5

    :try_start_0
    new-instance v0, LI7/P;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-static {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->o(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    move-result-object v2

    iget-object v3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-static {v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->p(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    move-result-object v3

    iget-object v4, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-static {v4}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->s(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/wireguard/android/backend/a;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, LI7/P;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
