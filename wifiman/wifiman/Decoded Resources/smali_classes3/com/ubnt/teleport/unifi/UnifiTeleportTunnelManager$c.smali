.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->v(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 1

    sget-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c$a;

    invoke-static {v0, p1}, LN7/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
