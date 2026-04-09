.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->L(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$n;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$n;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$n;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->o(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)LFg/a;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$n;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
