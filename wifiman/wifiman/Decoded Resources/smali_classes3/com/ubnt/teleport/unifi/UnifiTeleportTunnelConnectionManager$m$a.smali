.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$a;
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


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/net/DatagramPacket;
    .locals 4

    const-string/jumbo v0, "payloadString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string/jumbo v0, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/net/DatagramPacket;

    array-length v1, p1

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;->f()Ljava/net/InetAddress;

    move-result-object v2

    iget-object v3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;

    invoke-virtual {v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;->g()I

    move-result v3

    invoke-direct {v0, p1, v1, v2, v3}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m$a;->a(Ljava/lang/String;)Ljava/net/DatagramPacket;

    move-result-object p1

    return-object p1
.end method
