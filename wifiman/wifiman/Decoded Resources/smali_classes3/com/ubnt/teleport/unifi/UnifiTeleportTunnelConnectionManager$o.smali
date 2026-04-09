.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$o;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$o;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)LDj/a;
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$o;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    const-string/jumbo v1, "config"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->q(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$o;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)LDj/a;

    move-result-object p1

    return-object p1
.end method
