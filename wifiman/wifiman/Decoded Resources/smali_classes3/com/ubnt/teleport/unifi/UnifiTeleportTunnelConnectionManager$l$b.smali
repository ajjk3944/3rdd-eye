.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;->l(Ljava/net/DatagramSocket;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 2

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b$a;

    invoke-direct {v0, p2, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b$a;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    const-string/jumbo v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string/jumbo v1, "previous"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_0

    move-object p1, p2

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l$b;->a(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
