.class final Lcom/ui/wifiman/model/teleport/l$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l;->i(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/l;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/l;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$i;->a:Lcom/ui/wifiman/model/teleport/l;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/l$i;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)LDj/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$i;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/l;->g(Lcom/ui/wifiman/model/teleport/l;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/l$i$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/l$i$a;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/teleport/l$i$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/l$i;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/l$i$b;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$i;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$f;)LDj/a;

    move-result-object p1

    return-object p1
.end method
