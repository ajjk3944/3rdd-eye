.class final Lcom/ui/wifiman/model/teleport/l$m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$m;->a(Lcom/ui/wifiman/model/teleport/l$c$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/l;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$m$b;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)LDj/a;
    .locals 1

    const-string v0, "tunnel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$m$b;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/teleport/l;->h(Lcom/ui/wifiman/model/teleport/l;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$m$b;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)LDj/a;

    move-result-object p1

    return-object p1
.end method
