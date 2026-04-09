.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;
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

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)LI7/Q;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;->l(Lmh/l;Ljava/lang/Object;)LI7/Q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)LI7/Q;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;->j(Lmh/l;Ljava/lang/Object;)LI7/Q;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lmh/l;Ljava/lang/Object;)LI7/Q;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LI7/Q;

    return-object p0
.end method

.method private static final l(Lmh/l;Ljava/lang/Object;)LI7/Q;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LI7/Q;

    return-object p0
.end method


# virtual methods
.method public final h(Ljava/lang/Integer;)Lgg/v;
    .locals 5

    sget-object p1, LI7/Q;->CONNECTED:LI7/Q;

    invoke-static {p1}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;->b()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lgg/s;->b1(JLjava/util/concurrent/TimeUnit;)Lgg/s;

    move-result-object v0

    sget-object v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c$a;

    new-instance v3, Lcom/ubnt/teleport/unifi/e;

    invoke-direct {v3, v1}, Lcom/ubnt/teleport/unifi/e;-><init>(Lmh/l;)V

    invoke-virtual {v0, v3}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;->c()J

    move-result-wide v3

    invoke-static {v3, v4, v2}, Lgg/s;->b1(JLjava/util/concurrent/TimeUnit;)Lgg/s;

    move-result-object v1

    sget-object v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c$b;

    new-instance v3, Lcom/ubnt/teleport/unifi/f;

    invoke-direct {v3, v2}, Lcom/ubnt/teleport/unifi/f;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lgg/s;->k0(Lgg/v;Lgg/v;Lgg/v;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;->h(Ljava/lang/Integer;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
