.class final LI7/P$p;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->l0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$p;->a:LI7/P;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 3

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LI7/P$p;->a:LI7/P;

    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;

    move-object v2, p1

    check-cast v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    invoke-direct {v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)V

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$b;

    :goto_1
    invoke-static {v0, v1}, LI7/P;->E(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)Lgg/b;

    move-result-object v0

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->h(LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LI7/P$p;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
