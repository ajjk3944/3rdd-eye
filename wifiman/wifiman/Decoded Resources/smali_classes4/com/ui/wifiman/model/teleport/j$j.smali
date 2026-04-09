.class final Lcom/ui/wifiman/model/teleport/j$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j;->b(Ljava/lang/String;)Lgg/b;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$j;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ubnt/teleport/TeleportTunnel$d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ubnt/teleport/TeleportTunnel$d;->g()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$j;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/j;->k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;

    move-result-object v0

    invoke-interface {v0}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ubnt/teleport/TeleportTunnelManager;->getAll()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$j$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$j;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/teleport/j$j$a;-><init>(Lcom/ui/wifiman/model/teleport/j;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$j;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
