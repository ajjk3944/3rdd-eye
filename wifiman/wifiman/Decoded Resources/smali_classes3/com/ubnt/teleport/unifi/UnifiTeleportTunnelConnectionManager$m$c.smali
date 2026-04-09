.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->h(Ljava/lang/Integer;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

.field final synthetic c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    iput-object p3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;->c:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->k(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)LY6/h;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    iget-object v3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->m(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;->c:Ljava/lang/Integer;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v4}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;->c()J

    move-result-wide v4

    long-to-int v4, v4

    invoke-direct {v1, v2, v3, v4}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

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
