.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;-><init>(Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/TeleportTunnelManager$Storage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Ljava/util/List;
    .locals 10

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->q(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    monitor-enter v0

    :try_start_0
    const-string/jumbo v2, "it"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-virtual {v4}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    invoke-static {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->q(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Ljava/util/HashMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ubnt/teleport/TeleportTunnel$d;

    invoke-virtual {v4}, Lcom/ubnt/teleport/TeleportTunnel$d;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_2
    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-static {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->q(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_3

    new-instance v6, LI7/P;

    invoke-static {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->o(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    move-result-object v7

    invoke-static {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->p(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    move-result-object v8

    invoke-static {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->s(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/wireguard/android/backend/a;

    move-result-object v9

    invoke-direct {v6, v3, v7, v8, v9}, LI7/P;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;)V

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    check-cast v6, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_4
    monitor-exit v0

    return-object v2

    :goto_3
    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$a;->a(Ljava/util/Set;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
