.class final Lcom/ui/wifiman/model/teleport/j$f;
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


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$f;->a:Lcom/ui/wifiman/model/teleport/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j$f;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)Lgg/D;
    .locals 4

    const-string v0, "cloud"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$f;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/j;->k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;

    move-result-object v0

    invoke-interface {v0}, LI7/a;->b()Lcom/ubnt/teleport/TeleportTunnel$c;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$f;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/ubnt/teleport/TeleportTunnel$d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object p1

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lcom/ubnt/teleport/TeleportTunnel$c;->d(Lcom/ubnt/teleport/TeleportTunnel$a;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$f;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
