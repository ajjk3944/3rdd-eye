.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$i;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LY6/h;
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$i;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->j(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)LY6/r;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;

    invoke-virtual {v0, v1}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$i;->a()LY6/h;

    move-result-object v0

    return-object v0
.end method
