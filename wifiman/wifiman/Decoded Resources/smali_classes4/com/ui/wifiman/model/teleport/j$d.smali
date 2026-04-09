.class final Lcom/ui/wifiman/model/teleport/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j;->g(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/j;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$d;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/f;
    .locals 3

    const-string v0, "tunnelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$d;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/j;->k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;

    move-result-object v0

    invoke-interface {v0}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ubnt/teleport/TeleportTunnelManager;->getAll()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$d$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/j$d$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$d$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$d;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/teleport/j$d$b;-><init>(Lcom/ui/wifiman/model/teleport/j;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j$d;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v1}, Lcom/ui/wifiman/model/teleport/j;->j(Lcom/ui/wifiman/model/teleport/j;)LKd/d;

    move-result-object v1

    invoke-static {p1}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, LKd/d;->b(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/TeleportTunnel$d;

    invoke-virtual {p1}, Lcom/ubnt/teleport/TeleportTunnel$d;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$d;->a(Ljava/lang/String;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
