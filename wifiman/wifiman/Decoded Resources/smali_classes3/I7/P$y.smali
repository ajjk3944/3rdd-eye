.class final LI7/P$y;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->q0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
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

    iput-object p1, p0, LI7/P$y;->a:LI7/P;

    iput-object p2, p0, LI7/P$y;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y;->n(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P$y;->r(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y;->p(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y;->o(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final n(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final o(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final p(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final r(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LI7/P$y;->l(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final l(LYg/s;)Lgg/f;
    .locals 5

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/wireguard/crypto/c;

    iget-object v1, p0, LI7/P$y;->a:LI7/P;

    invoke-virtual {p1}, Lcom/wireguard/crypto/c;->b()Lcom/wireguard/crypto/b;

    move-result-object v2

    const-string/jumbo v3, "encKeypar.publicKey"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v3, "stunSessionSecret"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v0}, LI7/P;->U(LI7/P;Lcom/wireguard/crypto/b;Ljava/lang/String;)Lgg/z;

    move-result-object v1

    sget-object v2, LI7/P$y$a;->a:LI7/P$y$a;

    new-instance v3, LI7/a0;

    invoke-direct {v3, v2}, LI7/a0;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v1

    new-instance v2, LI7/P$y$b;

    iget-object v3, p0, LI7/P$y;->a:LI7/P;

    invoke-direct {v2, v3}, LI7/P$y$b;-><init>(LI7/P;)V

    new-instance v3, LI7/b0;

    invoke-direct {v3, v2}, LI7/b0;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v1

    sget-object v2, LI7/P$y$c;->a:LI7/P$y$c;

    new-instance v3, LI7/c0;

    invoke-direct {v3, v2}, LI7/c0;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v1

    new-instance v2, LI7/P$y$d;

    iget-object v3, p0, LI7/P$y;->a:LI7/P;

    iget-object v4, p0, LI7/P$y;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-direct {v2, v3, v0, v4, p1}, LI7/P$y$d;-><init>(LI7/P;Ljava/lang/String;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/wireguard/crypto/c;)V

    new-instance p1, LI7/d0;

    invoke-direct {p1, v2}, LI7/d0;-><init>(Lmh/l;)V

    invoke-virtual {v1, p1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
