.class final Lcom/ui/wifiman/model/teleport/invitation/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;LI7/a;LFd/D;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/invitation/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$b;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ll9/a;
    .locals 4

    const-string v0, "tunnels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a$b;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-interface {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/invitation/a;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$b;->a(Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
