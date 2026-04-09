.class final LI7/P$y$d$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$y$d;->t(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

.field final synthetic c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;


# direct methods
.method constructor <init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;)V
    .locals 0

    iput-object p1, p0, LI7/P$y$d$d;->a:LI7/P;

    iput-object p2, p0, LI7/P$y$d$d;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    iput-object p3, p0, LI7/P$y$d$d;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)V
    .locals 4

    iget-object v0, p0, LI7/P$y$d$d;->a:LI7/P;

    iget-object v1, p0, LI7/P$y$d$d;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    iget-object v2, p0, LI7/P$y$d$d;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    const-string/jumbo v3, "connectionInfo"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "ipParams"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v2, p1}, LI7/P;->P(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    move-result-object p1

    invoke-static {v0, p1}, LI7/P;->X(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;)V

    new-instance p1, LI7/P$y$d$d$a;

    iget-object v0, p0, LI7/P$y$d$d;->a:LI7/P;

    invoke-direct {p1, v0}, LI7/P$y$d$d$a;-><init>(LI7/P;)V

    invoke-static {p1}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    invoke-virtual {p0, p1}, LI7/P$y$d$d;->a(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
