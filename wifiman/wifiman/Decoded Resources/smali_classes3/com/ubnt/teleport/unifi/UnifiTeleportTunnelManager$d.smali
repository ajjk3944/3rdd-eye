.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$d;
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


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$d;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ubnt/teleport/TeleportTunnelManager$Storage$Error;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$Error$Storage;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Failed to delete tunnel "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$d;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$Error$Storage;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$d;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
