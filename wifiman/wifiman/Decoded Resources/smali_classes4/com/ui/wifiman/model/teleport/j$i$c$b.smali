.class final Lcom/ui/wifiman/model/teleport/j$i$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j$i$c;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/j;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

.field final synthetic c:LLd/e;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;LLd/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$i$c$b;->a:Lcom/ui/wifiman/model/teleport/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j$i$c$b;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/j$i$c$b;->c:LLd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/D;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$i$c$b;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/j;->h(Lcom/ui/wifiman/model/teleport/j;)LKd/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j$i$c$b;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-interface {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$i$c$b;->c:LLd/e;

    invoke-virtual {v2}, LLd/e;->a()Ljava/util/UUID;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2, p1}, LKd/b;->b(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$i$c$b;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
