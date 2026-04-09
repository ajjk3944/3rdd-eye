.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$p;
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

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$p;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 1

    iget-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$p;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    sget-object v0, LI7/Q;->CONNECTED:LI7/Q;

    invoke-static {p1, v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->w(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;LI7/Q;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$p;->a(LDj/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
