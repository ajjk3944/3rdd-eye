.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->I(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

.field final synthetic c:Ljava/net/DatagramSocket;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;Ljava/net/DatagramSocket;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    iput-object p3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->c:Ljava/net/DatagramSocket;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)Ljava/net/DatagramPacket;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->j(Lmh/l;Ljava/lang/Object;)Ljava/net/DatagramPacket;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->l(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lmh/l;Ljava/lang/Object;)Ljava/net/DatagramPacket;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/net/DatagramPacket;

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


# virtual methods
.method public final h(Ljava/lang/Integer;)Lgg/f;
    .locals 3

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    new-instance v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;

    invoke-direct {v2, v0, v1, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$c;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;Ljava/lang/Integer;)V

    invoke-static {v2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$a;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-direct {v0, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V

    new-instance v1, Lcom/ubnt/teleport/unifi/g;

    invoke-direct {v1, v0}, Lcom/ubnt/teleport/unifi/g;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->c:Ljava/net/DatagramSocket;

    invoke-direct {v0, v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;Ljava/net/DatagramSocket;)V

    new-instance v1, Lcom/ubnt/teleport/unifi/h;

    invoke-direct {v1, v0}, Lcom/ubnt/teleport/unifi/h;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;->h(Ljava/lang/Integer;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
