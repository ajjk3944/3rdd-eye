.class final LI7/P$o;
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

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;


# direct methods
.method constructor <init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V
    .locals 0

    iput-object p1, p0, LI7/P$o;->a:LI7/P;

    iput-object p2, p0, LI7/P$o;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, LI7/P$o;->j()V

    return-void
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$o;->l(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final j()V
    .locals 1

    sget-object v0, LI7/P$o$d;->a:LI7/P$o$d;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method private static final l(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lgg/f;
    .locals 5

    const/4 v0, 0x1

    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;

    if-eqz v1, :cond_0

    iget-object p1, p0, LI7/P$o;->a:LI7/P;

    invoke-static {p1}, LI7/P;->F(LI7/P;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->x()Lgg/b;

    move-result-object p1

    iget-object v1, p0, LI7/P$o;->a:LI7/P;

    iget-object v2, p0, LI7/P$o;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-static {v1, v2}, LI7/P;->T(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;

    move-result-object v1

    iget-object v2, p0, LI7/P$o;->a:LI7/P;

    iget-object v3, p0, LI7/P$o;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    new-instance v4, LI7/P$o$g;

    invoke-direct {v4, v2, v3}, LI7/P$o$g;-><init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V

    invoke-static {v4}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v2

    const-string/jumbo v3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LI7/Y;

    invoke-direct {v3}, LI7/Y;-><init>()V

    invoke-virtual {v2, v3}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object v2

    sget-object v3, LI7/P$o$e;->a:LI7/P$o$e;

    new-instance v4, LI7/Z;

    invoke-direct {v4, v3}, LI7/Z;-><init>(Lmh/l;)V

    invoke-virtual {v2, v4}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lgg/f;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    aput-object v1, v3, v0

    const/4 p1, 0x2

    aput-object v2, v3, p1

    invoke-static {v3}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    :goto_0
    if-eqz v0, :cond_2

    new-instance v0, LI7/P$o$f;

    invoke-direct {v0, p1}, LI7/P$o$f;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    invoke-virtual {p0, p1}, LI7/P$o;->h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
