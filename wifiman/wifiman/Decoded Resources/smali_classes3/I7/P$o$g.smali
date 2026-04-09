.class public final LI7/P$o$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$o;->h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;


# direct methods
.method public constructor <init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V
    .locals 0

    iput-object p1, p0, LI7/P$o$g;->a:LI7/P;

    iput-object p2, p0, LI7/P$o$g;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 5

    :try_start_0
    sget-object v0, LI7/P$o$a;->a:LI7/P$o$a;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    iget-object v0, p0, LI7/P$o$g;->a:LI7/P;

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
    iget-object v0, p0, LI7/P$o$g;->a:LI7/P;

    iget-object v1, p0, LI7/P$o$g;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-static {v0, v1}, LI7/P;->Q(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;

    move-result-object v1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v1

    sget-object v2, LI7/P$o$b;->a:LI7/P$o$b;

    sget-object v3, LI7/P$o$c;->a:LI7/P$o$c;

    new-instance v4, LI7/P$G;

    invoke-direct {v4, v3}, LI7/P$G;-><init>(Lmh/l;)V

    invoke-virtual {v1, v2, v4}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object v1

    invoke-static {v0, v1}, LI7/P;->W(LI7/P;Lhg/c;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
