.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->B(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 3

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h$a;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-direct {v0, p1, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ubnt/teleport/TeleportTunnel;->close()Lgg/b;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->r(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/ubnt/teleport/TeleportTunnelManager$Storage;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/ubnt/teleport/TeleportTunnelManager$Storage;->a(Ljava/lang/String;)Lgg/b;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    invoke-static {v1}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
