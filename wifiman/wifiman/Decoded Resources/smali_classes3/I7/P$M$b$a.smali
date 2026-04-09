.class public final LI7/P$M$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$M$b;->a(Lcom/wireguard/android/backend/b;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;

.field final synthetic b:Lcom/wireguard/android/backend/b;


# direct methods
.method public constructor <init>(LI7/P;Lcom/wireguard/android/backend/b;)V
    .locals 0

    iput-object p1, p0, LI7/P$M$b$a;->a:LI7/P;

    iput-object p2, p0, LI7/P$M$b$a;->b:Lcom/wireguard/android/backend/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, LI7/P$M$b$a;->a:LI7/P;

    invoke-static {v0}, LI7/P;->K(LI7/P;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, LI7/P$M$b$a;->a:LI7/P;

    invoke-static {v2}, LI7/P;->I(LI7/P;)LFg/a;

    move-result-object v2

    invoke-virtual {v2}, LFg/a;->l2()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    iget-object v2, p0, LI7/P$M$b$a;->a:LI7/P;

    invoke-static {v2}, LI7/P;->F(LI7/P;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    move-result-object v2

    iget-object v3, p0, LI7/P$M$b$a;->b:Lcom/wireguard/android/backend/b;

    const-string/jumbo v4, "it"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LI7/P$M$b$a;->b:Lcom/wireguard/android/backend/b;

    invoke-virtual {v2, v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->Q(Lcom/wireguard/android/backend/b;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
