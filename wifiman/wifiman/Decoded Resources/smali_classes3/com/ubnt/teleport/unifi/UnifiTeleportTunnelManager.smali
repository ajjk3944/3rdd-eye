.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/teleport/TeleportTunnelManager;
.implements Lcom/ubnt/teleport/TeleportTunnel$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$Error;
    }
.end annotation


# instance fields
.field private final a:Lcom/ubnt/teleport/unifi/stun/TeleportStun;

.field private final b:Lcom/wireguard/android/backend/a;

.field private final c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

.field private final d:Lcom/ubnt/teleport/TeleportTunnelManager$Storage;

.field private final e:Ljava/util/HashMap;

.field private final f:Lgg/i;

.field private final g:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/TeleportTunnelManager$Storage;)V
    .locals 1

    const-string/jumbo v0, "stun"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wgBackend"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cloudFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tunnelStorage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->a:Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->b:Lcom/wireguard/android/backend/a;

    iput-object p3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    iput-object p4, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->d:Lcom/ubnt/teleport/TeleportTunnelManager$Storage;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->e:Ljava/util/HashMap;

    invoke-interface {p4}, Lcom/ubnt/teleport/TeleportTunnelManager$Storage;->d()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$a;

    invoke-direct {p2, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$a;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)V

    new-instance p3, LI7/G0;

    invoke-direct {p3, p2}, LI7/G0;-><init>(Lmh/l;)V

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$b;

    new-instance p3, LI7/H0;

    invoke-direct {p3, p2}, LI7/H0;-><init>(Lmh/l;)V

    invoke-virtual {p1, p3}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p3, "tunnelStorage.tunnels\n  \u2026)\n            .refCount()"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->f:Lgg/i;

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->getAll()Lgg/i;

    move-result-object p1

    invoke-interface {p4}, Lcom/ubnt/teleport/TeleportTunnelManager$Storage;->b()Lgg/i;

    move-result-object p3

    sget-object p4, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$e;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$e;

    new-instance v0, LI7/I0;

    invoke-direct {v0, p4}, LI7/I0;-><init>(Lmh/p;)V

    invoke-static {p1, p3, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$f;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$f;

    new-instance p4, LI7/J0;

    invoke-direct {p4, p3}, LI7/J0;-><init>(Lmh/l;)V

    invoke-virtual {p1, p4}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "combineLatest(\n         \u2026)\n            .refCount()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->g:Lgg/i;

    return-void
.end method

.method private static final C(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final D(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final F(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method public static synthetic f(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->F(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->C(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->D(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->z(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->u(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lmh/l;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->t(Lmh/l;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)Ll9/a;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->y(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)Ll9/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->x(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->w(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    return-object p0
.end method

.method public static final synthetic p(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/ubnt/teleport/unifi/stun/TeleportStun;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->a:Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    return-object p0
.end method

.method public static final synthetic q(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->e:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic r(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/ubnt/teleport/TeleportTunnelManager$Storage;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->d:Lcom/ubnt/teleport/TeleportTunnelManager$Storage;

    return-object p0
.end method

.method public static final synthetic s(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)Lcom/wireguard/android/backend/a;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->b:Lcom/wireguard/android/backend/a;

    return-object p0
.end method

.method private static final t(Lmh/l;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final u(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method private static final w(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final x(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final y(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)Ll9/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll9/a;

    return-object p0
.end method

.method private static final z(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method


# virtual methods
.method public A(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;

    invoke-direct {v0, p1, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$g;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public B(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;
    .locals 3

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;

    invoke-direct {v1, p1, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$h;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;)V

    new-instance v2, LI7/D0;

    invoke-direct {v2, v1}, LI7/D0;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$i;

    invoke-direct {v1, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$i;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    new-instance p1, LI7/E0;

    invoke-direct {p1, v1}, LI7/E0;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "override fun setMain(tun\u2026    }\n            }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public E(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;
    .locals 4

    const-string/jumbo v0, "tunnel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;

    invoke-direct {v0, p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$j;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->e:Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->d:Lcom/ubnt/teleport/TeleportTunnelManager$Storage;

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ubnt/teleport/TeleportTunnelManager$Storage;->e(Lcom/ubnt/teleport/TeleportTunnel$a;)Lgg/b;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v1, v3

    const/4 v0, 0x1

    aput-object v2, v1, v0

    invoke-static {v1}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$k;

    invoke-direct {v1, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$k;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    new-instance p1, LI7/F0;

    invoke-direct {p1, v1}, LI7/F0;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "tunnel: UnifiTeleportTun\u2026          }\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->g:Lgg/i;

    return-object v0
.end method

.method public bridge synthetic b(Lcom/ubnt/teleport/TeleportTunnel;)Lgg/b;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->B(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lcom/ubnt/teleport/TeleportTunnel;)Lgg/b;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->E(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/ubnt/teleport/TeleportTunnel$a;)Lgg/z;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->A(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/ubnt/teleport/TeleportTunnel;)Lgg/b;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->v(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public getAll()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->f:Lgg/i;

    return-object v0
.end method

.method public v(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/b;
    .locals 4

    const-string/jumbo v0, "tunnel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ubnt/teleport/TeleportTunnel;->close()Lgg/b;

    move-result-object v0

    sget-object v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$c;

    new-instance v2, LI7/B0;

    invoke-direct {v2, v1}, LI7/B0;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;->d:Lcom/ubnt/teleport/TeleportTunnelManager$Storage;

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ubnt/teleport/TeleportTunnelManager$Storage;->c(Ljava/lang/String;)Lgg/b;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$d;

    invoke-direct {v1, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager$d;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    new-instance p1, LI7/C0;

    invoke-direct {p1, v1}, LI7/C0;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "tunnel: UnifiTeleportTun\u2026          }\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
