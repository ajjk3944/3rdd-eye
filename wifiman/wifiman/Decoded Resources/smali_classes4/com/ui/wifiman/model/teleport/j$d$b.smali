.class final Lcom/ui/wifiman/model/teleport/j$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j$d;->a(Ljava/lang/String;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/j;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$d$b;->a:Lcom/ui/wifiman/model/teleport/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j$d$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j$d$b;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/j;->k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;

    move-result-object v0

    invoke-interface {v0}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ubnt/teleport/TeleportTunnelManager;->e(Lcom/ubnt/teleport/TeleportTunnel;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/j$d$b;->b:Ljava/lang/String;

    new-instance v0, Lcom/ui/wifiman/model/teleport/j$d$b$a;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/j$d$b$a;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$d$b;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
