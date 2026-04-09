.class final Lcom/ui/wifiman/model/teleport/j$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j;->f(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/j;

.field final synthetic b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

.field final synthetic c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$g;->a:Lcom/ui/wifiman/model/teleport/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j$g;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/j$g;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/D;
    .locals 5

    const-string v0, "tunnel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$g;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/j;->h(Lcom/ui/wifiman/model/teleport/j;)LKd/b;

    move-result-object v0

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$g;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ui/wifiman/model/teleport/j$g;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-interface {v0, v1, v2, v3, v4}, LKd/b;->b(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$g$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/j$g$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$g;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
