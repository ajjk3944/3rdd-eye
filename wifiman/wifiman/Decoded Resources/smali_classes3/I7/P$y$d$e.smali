.class final LI7/P$y$d$e;
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
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

.field final synthetic b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

.field final synthetic c:LI7/P;

.field final synthetic d:Lcom/wireguard/crypto/c;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;LI7/P;Lcom/wireguard/crypto/c;)V
    .locals 0

    iput-object p1, p0, LI7/P$y$d$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    iput-object p2, p0, LI7/P$y$d$e;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    iput-object p3, p0, LI7/P$y$d$e;->c:LI7/P;

    iput-object p4, p0, LI7/P$y$d$e;->d:Lcom/wireguard/crypto/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, LI7/P$y$d$e;->t()V

    return-void
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P$y$d$e;->v(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y$d$e;->r(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y$d$e;->p(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P$y$d$e;->o(Lmh/l;Ljava/lang/Object;)V

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

.method private static final r(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final t()V
    .locals 1

    sget-object v0, LI7/P$y$d$e$e;->a:LI7/P$y$d$e$e;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method private static final v(Lmh/l;Ljava/lang/Object;)Lgg/f;
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

    check-cast p1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    invoke-virtual {p0, p1}, LI7/P$y$d$e;->n(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lgg/f;
    .locals 7

    iget-object v1, p0, LI7/P$y$d$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    iget-object v2, p0, LI7/P$y$d$e;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    iget-object v4, p0, LI7/P$y$d$e;->c:LI7/P;

    iget-object v5, p0, LI7/P$y$d$e;->d:Lcom/wireguard/crypto/c;

    new-instance v6, LI7/P$y$d$e$g;

    move-object v0, v6

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, LI7/P$y$d$e$g;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;LI7/P;Lcom/wireguard/crypto/c;)V

    invoke-static {v6}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI7/P$y$d$e$b;->a:LI7/P$y$d$e$b;

    new-instance v1, LI7/n0;

    invoke-direct {v1, v0}, LI7/n0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object v0, LI7/P$y$d$e$c;->a:LI7/P$y$d$e$c;

    new-instance v1, LI7/o0;

    invoke-direct {v1, v0}, LI7/o0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LI7/P$y$d$e$d;

    iget-object v1, p0, LI7/P$y$d$e;->c:LI7/P;

    invoke-direct {v0, v1}, LI7/P$y$d$e$d;-><init>(LI7/P;)V

    new-instance v1, LI7/p0;

    invoke-direct {v1, v0}, LI7/p0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LI7/q0;

    invoke-direct {v0}, LI7/q0;-><init>()V

    invoke-virtual {p1, v0}, Lgg/z;->l(Lkg/a;)Lgg/z;

    move-result-object p1

    new-instance v0, LI7/P$y$d$e$f;

    iget-object v1, p0, LI7/P$y$d$e;->c:LI7/P;

    invoke-direct {v0, v1}, LI7/P$y$d$e$f;-><init>(LI7/P;)V

    new-instance v1, LI7/r0;

    invoke-direct {v1, v0}, LI7/r0;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
