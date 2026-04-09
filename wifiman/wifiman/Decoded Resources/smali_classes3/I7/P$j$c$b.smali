.class public final LI7/P$j$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$j$c;->a(Ljava/lang/Throwable;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;

.field final synthetic b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(LI7/P;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LI7/P$j$c$b;->a:LI7/P;

    iput-object p2, p0, LI7/P$j$c$b;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    sget-object v0, LI7/P$j$c$a;->a:LI7/P$j$c$a;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    iget-object v0, p0, LI7/P$j$c$b;->a:LI7/P;

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;

    iget-object v2, p0, LI7/P$j$c$b;->b:Ljava/lang/Throwable;

    const-string/jumbo v3, "error"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LI7/P$j$c$b;->b:Ljava/lang/Throwable;

    check-cast v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    invoke-direct {v1, v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)V

    invoke-static {v0, v1}, LI7/P;->S(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V

    iget-object v0, p0, LI7/P$j$c$b;->a:LI7/P;

    invoke-static {v0}, LI7/P;->O(LI7/P;)LFg/a;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    iget-object v0, p0, LI7/P$j$c$b;->a:LI7/P;

    invoke-static {v0}, LI7/P;->H(LI7/P;)Lhg/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhg/c;->dispose()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
