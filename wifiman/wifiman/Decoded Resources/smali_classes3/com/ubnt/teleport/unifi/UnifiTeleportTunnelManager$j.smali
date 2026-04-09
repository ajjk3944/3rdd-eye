.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->E(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->q(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Ljava/util/HashMap;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-static {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->q(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-interface {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v2

    iget-object v3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0

    invoke-interface {p1}, Lgg/c;->a()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
