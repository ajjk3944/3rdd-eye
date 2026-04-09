.class final Lcom/ui/wifiman/model/teleport/l$i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$i;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)LDj/a;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$i$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Lcom/ui/wifiman/model/teleport/l$d;
    .locals 3

    const-string v0, "fetchResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/teleport/l$d;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/l$i$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-interface {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/ui/wifiman/model/teleport/l$d;-><init>(Ljava/lang/String;LWc/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$i$b;->a(LWc/b;)Lcom/ui/wifiman/model/teleport/l$d;

    move-result-object p1

    return-object p1
.end method
