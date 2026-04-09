.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->G(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)Lgg/v;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->p(Lmh/l;Ljava/lang/Object;)Lgg/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/p;Ljava/lang/Integer;Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->o(Lmh/p;Ljava/lang/Integer;Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)Lgg/v;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->n(Lmh/l;Ljava/lang/Object;)Lgg/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/net/DatagramSocket;)V
    .locals 0

    invoke-static {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->r(Ljava/net/DatagramSocket;)V

    return-void
.end method

.method private static final n(Lmh/l;Ljava/lang/Object;)Lgg/v;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/v;

    return-object p0
.end method

.method private static final o(Lmh/p;Ljava/lang/Integer;Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method private static final p(Lmh/l;Ljava/lang/Object;)Lgg/v;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/v;

    return-object p0
.end method

.method private static final r(Ljava/net/DatagramSocket;)V
    .locals 1

    sget-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$d;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$d;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    invoke-virtual {p0}, Ljava/net/DatagramSocket;->close()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/net/DatagramSocket;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->l(Ljava/net/DatagramSocket;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/net/DatagramSocket;)LDj/a;
    .locals 4

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    const-string/jumbo v1, "socket"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->p(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Ljava/net/DatagramSocket;)Lgg/s;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-static {v1, p1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->r(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->l0(Lgg/f;)Lgg/s;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;->d()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/s;->W0(JLjava/util/concurrent/TimeUnit;)Lgg/s;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$a;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-direct {v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V

    new-instance v2, Lcom/ubnt/teleport/unifi/a;

    invoke-direct {v2, v1}, Lcom/ubnt/teleport/unifi/a;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/s;->q0(Lkg/n;)Lgg/s;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;

    new-instance v3, Lcom/ubnt/teleport/unifi/b;

    invoke-direct {v3, v2}, Lcom/ubnt/teleport/unifi/b;-><init>(Lmh/p;)V

    invoke-virtual {v0, v1, v3}, Lgg/s;->B0(Ljava/lang/Object;Lkg/b;)Lgg/s;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lgg/s;->G0(J)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->v()Lgg/s;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-direct {v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$c;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V

    new-instance v2, Lcom/ubnt/teleport/unifi/c;

    invoke-direct {v2, v1}, Lcom/ubnt/teleport/unifi/c;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/s;->O0(Lkg/n;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->v()Lgg/s;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object v0

    sget-object v1, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {v0, v1}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/d;

    invoke-direct {v1, p1}, Lcom/ubnt/teleport/unifi/d;-><init>(Ljava/net/DatagramSocket;)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
