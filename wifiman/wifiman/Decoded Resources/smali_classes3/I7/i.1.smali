.class public final synthetic LI7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# instance fields
.field public final synthetic a:Ljava/net/DatagramSocket;

.field public final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;


# direct methods
.method public synthetic constructor <init>(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/i;->a:Ljava/net/DatagramSocket;

    iput-object p2, p0, LI7/i;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    return-void
.end method


# virtual methods
.method public final a(Lgg/t;)V
    .locals 2

    iget-object v0, p0, LI7/i;->a:Ljava/net/DatagramSocket;

    iget-object v1, p0, LI7/i;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {v0, v1, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->b(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lgg/t;)V

    return-void
.end method
