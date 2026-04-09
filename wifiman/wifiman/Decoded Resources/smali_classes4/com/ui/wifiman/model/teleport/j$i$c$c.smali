.class final Lcom/ui/wifiman/model/teleport/j$i$c$c;
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
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$i$c$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKd/a;)Lcom/ui/wifiman/model/teleport/n;
    .locals 2

    const-string v0, "tunnelRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/teleport/n;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j$i$c$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v1}, Lcom/ui/wifiman/model/teleport/n;-><init>(LKd/a;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKd/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$i$c$c;->a(LKd/a;)Lcom/ui/wifiman/model/teleport/n;

    move-result-object p1

    return-object p1
.end method
