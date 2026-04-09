.class public final LI7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI7/a;


# instance fields
.field private final b:Lcom/wireguard/android/backend/a;

.field private final c:Lcom/ubnt/teleport/unifi/stun/TeleportStun;

.field private final d:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

.field private final e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

.field private final f:Lcom/ubnt/teleport/TeleportTunnelManager;

.field private final g:Lcom/ubnt/teleport/TeleportTunnel$c;

.field private h:Lhg/c;

.field private final i:Lgg/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;LJ7/G;Lcom/ubnt/teleport/TeleportTunnelManager$Storage;Lokhttp3/OkHttpClient;)V
    .locals 7

    const-string/jumbo v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vpnServiceClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cloudParamsDelegate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tunnelStorage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/wireguard/android/backend/GoBackend;

    invoke-direct {v0, p1, p2}, Lcom/wireguard/android/backend/GoBackend;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, LI7/f;->b:Lcom/wireguard/android/backend/a;

    new-instance p1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    invoke-direct {p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;-><init>()V

    iput-object p1, p0, LI7/f;->c:Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    new-instance p2, LJ7/v;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, p2

    move-object v3, p3

    move-object v4, p5

    invoke-direct/range {v1 .. v6}, LJ7/v;-><init>(Ljava/lang/String;LJ7/G;Lokhttp3/OkHttpClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, LI7/f;->d:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    new-instance p2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    invoke-virtual {p0}, LI7/f;->d()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    move-result-object p3

    invoke-direct {p2, p1, v0, p3, p4}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;-><init>(Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/TeleportTunnelManager$Storage;)V

    iput-object p2, p0, LI7/f;->e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelManager;

    iput-object p2, p0, LI7/f;->f:Lcom/ubnt/teleport/TeleportTunnelManager;

    iput-object p2, p0, LI7/f;->g:Lcom/ubnt/teleport/TeleportTunnel$c;

    invoke-virtual {p0}, LI7/f;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/ubnt/teleport/TeleportTunnelManager;->a()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    sget-object p2, LI7/f$a;->a:LI7/f$a;

    new-instance p3, LI7/c;

    invoke-direct {p3, p2}, LI7/c;-><init>(Lmh/l;)V

    invoke-virtual {p1, p3}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "tunnelManager.main\n     \u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LI7/f;->i:Lgg/b;

    return-void
.end method

.method public static synthetic e()V
    .locals 0

    invoke-static {}, LI7/f;->k()V

    return-void
.end method

.method public static synthetic f(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/f;->i(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/f;->l(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(LI7/f;Lmh/l;)V
    .locals 0

    invoke-static {p0, p1}, LI7/f;->j(LI7/f;Lmh/l;)V

    return-void
.end method

.method private static final i(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final j(LI7/f;Lmh/l;)V
    .locals 3

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onTunnelRestoreError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LI7/f;->h:Lhg/c;

    if-nez v0, :cond_0

    iget-object v0, p0, LI7/f;->i:Lgg/b;

    new-instance v1, LI7/d;

    invoke-direct {v1}, LI7/d;-><init>()V

    new-instance v2, LI7/f$c;

    invoke-direct {v2, p1}, LI7/f$c;-><init>(Lmh/l;)V

    new-instance p1, LI7/e;

    invoke-direct {p1, v2}, LI7/e;-><init>(Lmh/l;)V

    invoke-virtual {v0, v1, p1}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object p1

    iput-object p1, p0, LI7/f;->h:Lhg/c;

    goto :goto_0

    :cond_0
    sget-object p0, LI7/f$d;->a:LI7/f$d;

    invoke-static {p0}, LN7/a;->b(Lmh/a;)V

    :goto_0
    return-void
.end method

.method private static final k()V
    .locals 1

    sget-object v0, LI7/f$b;->a:LI7/f$b;

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
.method public a()Lcom/ubnt/teleport/TeleportTunnelManager;
    .locals 1

    iget-object v0, p0, LI7/f;->f:Lcom/ubnt/teleport/TeleportTunnelManager;

    return-object v0
.end method

.method public b()Lcom/ubnt/teleport/TeleportTunnel$c;
    .locals 1

    iget-object v0, p0, LI7/f;->g:Lcom/ubnt/teleport/TeleportTunnel$c;

    return-object v0
.end method

.method public c(Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "onTunnelRestoreError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI7/b;

    invoke-direct {v0, p0, p1}, LI7/b;-><init>(LI7/f;Lmh/l;)V

    invoke-static {v0}, Lcom/wireguard/android/backend/GoBackend;->p(Lcom/wireguard/android/backend/GoBackend$b;)V

    return-void
.end method

.method public d()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;
    .locals 1

    iget-object v0, p0, LI7/f;->d:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    return-object v0
.end method
