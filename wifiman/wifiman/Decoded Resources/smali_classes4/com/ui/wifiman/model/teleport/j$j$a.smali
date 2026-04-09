.class final Lcom/ui/wifiman/model/teleport/j$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j$j;->a(Ll9/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/j;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$j$a;->a:Lcom/ui/wifiman/model/teleport/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j$j$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgg/f;
    .locals 4

    const-string v0, "tunnels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$j$a;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/j;->k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;

    move-result-object v0

    invoke-interface {v0}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j$j$a;->b:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-interface {v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v3

    if-nez v1, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    invoke-static {v3, v1}, Lcom/ubnt/teleport/TeleportTunnel$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    check-cast v2, Lcom/ubnt/teleport/TeleportTunnel;

    invoke-interface {v0, v2}, Lcom/ubnt/teleport/TeleportTunnelManager;->b(Lcom/ubnt/teleport/TeleportTunnel;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$j$a;->a(Ljava/util/List;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
