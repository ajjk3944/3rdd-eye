.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b;->j(Ljava/net/DatagramPacket;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/net/DatagramSocket;

.field final synthetic b:Ljava/net/DatagramPacket;


# direct methods
.method constructor <init>(Ljava/net/DatagramSocket;Ljava/net/DatagramPacket;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a;->a:Ljava/net/DatagramSocket;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a;->b:Ljava/net/DatagramPacket;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 3

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a$a;

    invoke-direct {v0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-wide/16 v0, 0x2710

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lgg/b;->t(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a;->a:Ljava/net/DatagramSocket;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a;->b:Ljava/net/DatagramPacket;

    new-instance v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a$b;

    invoke-direct {v2, v0, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a$b;-><init>(Ljava/net/DatagramSocket;Ljava/net/DatagramPacket;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$b$a;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
