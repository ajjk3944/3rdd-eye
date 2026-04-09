.class final Lcom/ui/wifiman/model/teleport/j$i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j$i;->a(LLd/e;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/j;

.field final synthetic b:LLd/e;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;LLd/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$i$c;->a:Lcom/ui/wifiman/model/teleport/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j$i$c;->b:LLd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/D;
    .locals 4

    const-string v0, "tunnel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$i$c;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/j;->k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;

    move-result-object v0

    invoke-interface {v0}, LI7/a;->d()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    move-result-object v0

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;->b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/j$i$c$a;->a:Lcom/ui/wifiman/model/teleport/j$i$c$a;

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$i$c$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$i$c;->a:Lcom/ui/wifiman/model/teleport/j;

    iget-object v3, p0, Lcom/ui/wifiman/model/teleport/j$i$c;->b:LLd/e;

    invoke-direct {v1, v2, p1, v3}, Lcom/ui/wifiman/model/teleport/j$i$c$b;-><init>(Lcom/ui/wifiman/model/teleport/j;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;LLd/e;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$i$c$c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/j$i$c$c;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$i$c;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
