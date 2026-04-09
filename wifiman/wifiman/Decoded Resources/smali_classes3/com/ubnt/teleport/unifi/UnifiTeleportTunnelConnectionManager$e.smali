.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->x()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->s(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;J)V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->t(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;J)V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    sget-object v1, LI7/Q;->CONNECTED:LI7/Q;

    invoke-static {v0, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->w(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;LI7/Q;)V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->l(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->a()V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->n(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->a()V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->u(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;J)V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {v0, v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->v(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;J)V

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
