.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->l(Ljava/net/DatagramSocket;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/v;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_0

    new-instance p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$a$a;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-direct {p1, v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$a$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V

    invoke-static {p1}, LN7/a;->b(Lmh/a;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$a;->a(Ljava/lang/Throwable;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
