.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->h(Ljava/lang/Integer;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

.field final synthetic b:Ljava/net/DatagramSocket;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;Ljava/net/DatagramSocket;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->b:Ljava/net/DatagramSocket;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->n(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->l(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->o(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final n(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final o(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/net/DatagramPacket;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->j(Ljava/net/DatagramPacket;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/net/DatagramPacket;)Lgg/f;
    .locals 4

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->b:Ljava/net/DatagramSocket;

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$d;

    invoke-direct {v1, v0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$d;-><init>(Ljava/net/DatagramSocket;Ljava/net/DatagramPacket;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->b:Ljava/net/DatagramSocket;

    invoke-direct {v1, v2, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a;-><init>(Ljava/net/DatagramSocket;Ljava/net/DatagramPacket;)V

    new-instance v2, Lcom/ubnt/teleport/unifi/i;

    invoke-direct {v2, v1}, Lcom/ubnt/teleport/unifi/i;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$b;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->b:Ljava/net/DatagramSocket;

    invoke-direct {v1, v2, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$b;-><init>(Ljava/net/DatagramSocket;Ljava/net/DatagramPacket;)V

    new-instance p1, Lcom/ubnt/teleport/unifi/j;

    invoke-direct {p1, v1}, Lcom/ubnt/teleport/unifi/j;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$c;

    new-instance v1, Lcom/ubnt/teleport/unifi/k;

    invoke-direct {v1, v0}, Lcom/ubnt/teleport/unifi/k;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;->a()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lgg/b;->u(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
