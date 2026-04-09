.class final LI7/P$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->f0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
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

    iput-object p1, p0, LI7/P$j;->a:LI7/P;

    iput-object p2, p0, LI7/P$j;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, LI7/P$j;->o(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$j;->v(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P$j;->t(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P$j;->p(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$j;->r(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final o(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method private static final p(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final r(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final t(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final v(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LI7/P$j;->n(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljava/lang/Boolean;)Lgg/f;
    .locals 2

    new-instance v0, LI7/P$j$a;

    invoke-direct {v0, p1}, LI7/P$j$a;-><init>(Ljava/lang/Boolean;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    const-string/jumbo v0, "reconnecting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LI7/P$j;->a:LI7/P;

    iget-object v0, p0, LI7/P$j;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-static {p1, v0}, LI7/P;->V(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/P$j$b;

    iget-object v1, p0, LI7/P$j;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-direct {v0, v1}, LI7/P$j$b;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V

    new-instance v1, LI7/S;

    invoke-direct {v1, v0}, LI7/S;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->Q(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/P$j$c;

    iget-object v1, p0, LI7/P$j;->a:LI7/P;

    invoke-direct {v0, v1}, LI7/P$j$c;-><init>(LI7/P;)V

    new-instance v1, LI7/T;

    invoke-direct {v1, v0}, LI7/T;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object v0, LI7/P$j$d;->a:LI7/P$j$d;

    new-instance v1, LI7/U;

    invoke-direct {v1, v0}, LI7/U;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, LAg/c;->a:LAg/c;

    iget-object v0, p0, LI7/P$j;->a:LI7/P;

    invoke-static {v0}, LI7/P;->M(LI7/P;)LFg/a;

    move-result-object v0

    const-string/jumbo v1, "wireguardTunnelStateProcessor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LI7/P$j;->a:LI7/P;

    invoke-static {v1}, LI7/P;->F(LI7/P;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->D()Lgg/i;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance v0, LI7/P$j$e;

    iget-object v1, p0, LI7/P$j;->a:LI7/P;

    invoke-direct {v0, v1}, LI7/P$j$e;-><init>(LI7/P;)V

    new-instance v1, LI7/V;

    invoke-direct {v1, v0}, LI7/V;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object v0, LI7/P$j$f;->a:LI7/P$j$f;

    new-instance v1, LI7/W;

    invoke-direct {v1, v0}, LI7/W;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
