.class public final LI7/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/P$b;,
        LI7/P$a;,
        LI7/P$c;
    }
.end annotation


# static fields
.field public static final u:LI7/P$a;


# instance fields
.field private final a:Lcom/ubnt/teleport/unifi/stun/TeleportStun;

.field private final b:Lcom/wireguard/android/backend/a;

.field private final c:LFg/a;

.field private final d:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

.field private final e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

.field private final f:LFg/a;

.field private final g:LFg/a;

.field private final h:LFg/a;

.field private i:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

.field private final j:LFg/a;

.field private final k:Lgg/i;

.field private final l:Lgg/z;

.field private final m:Lgg/b;

.field private final n:Lgg/i;

.field private final o:Lgg/b;

.field private final p:Lgg/z;

.field private final q:Lgg/z;

.field private r:Lhg/c;

.field private final s:LFg/c;

.field private final t:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI7/P$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI7/P$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LI7/P;->u:LI7/P$a;

    return-void
.end method

.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;)V
    .locals 4

    const-string/jumbo v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cloudFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "stun"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wgBackend"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LI7/P;->a:Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    iput-object p4, p0, LI7/P;->b:Lcom/wireguard/android/backend/a;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p4

    iput-object p4, p0, LI7/P;->c:LFg/a;

    invoke-virtual {p4}, LFg/a;->l2()Ljava/lang/Object;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p4, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    iput-object p4, p0, LI7/P;->d:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    new-instance p4, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    invoke-direct {p4}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;-><init>()V

    iput-object p4, p0, LI7/P;->e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    sget-object p4, LI7/P$b;->DOWN:LI7/P$b;

    invoke-static {p4}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p4

    iput-object p4, p0, LI7/P;->f:LFg/a;

    sget-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$b;

    invoke-static {v0}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    iput-object v0, p0, LI7/P;->g:LFg/a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v2

    iput-object v2, p0, LI7/P;->h:LFg/a;

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v1

    iput-object v1, p0, LI7/P;->j:LFg/a;

    invoke-virtual {v2}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    sget-object v2, LI7/P$i;->a:LI7/P$i;

    new-instance v3, LI7/A;

    invoke-direct {v3, v2}, LI7/A;-><init>(Lmh/l;)V

    invoke-virtual {v1, v3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    iput-object v1, p0, LI7/P;->k:Lgg/i;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;->b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;

    move-result-object p1

    iput-object p1, p0, LI7/P;->l:Lgg/z;

    invoke-virtual {p4}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    new-instance p2, LI7/P$M;

    invoke-direct {p2, p0}, LI7/P$M;-><init>(LI7/P;)V

    new-instance p4, LI7/B;

    invoke-direct {p4, p2}, LI7/B;-><init>(Lmh/l;)V

    invoke-virtual {p1, p4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance p2, LI7/P$N;

    invoke-direct {p2, p0}, LI7/P$N;-><init>(LI7/P;)V

    new-instance p4, LI7/C;

    invoke-direct {p4, p2}, LI7/C;-><init>(Lmh/l;)V

    invoke-virtual {p1, p4}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "wireguardTunnelStateProc\u2026Schedulers.computation())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LI7/P;->m:Lgg/b;

    sget-object p2, LAg/c;->a:LAg/c;

    const-string/jumbo p4, "isReconnecting"

    invoke-static {v1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object p4

    invoke-virtual {p4}, Lgg/i;->W()Lgg/i;

    move-result-object p4

    const-string/jumbo v0, "stateProcessor\n         \u2026  .distinctUntilChanged()"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v1, p4}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    sget-object p2, LI7/P$K;->a:LI7/P$K;

    new-instance p4, LI7/D;

    invoke-direct {p4, p2}, LI7/D;-><init>(Lmh/l;)V

    invoke-virtual {p1, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, LI7/E;

    invoke-direct {p2, p0}, LI7/E;-><init>(LI7/P;)V

    invoke-virtual {p1, p2}, Lgg/i;->r1(Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "Flowables.combineLatest(\u2026)\n            .refCount()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LI7/P;->n:Lgg/i;

    invoke-interface {p3}, Lcom/ubnt/teleport/unifi/stun/TeleportStun;->closePeer()Lgg/b;

    move-result-object p1

    invoke-interface {p3}, Lcom/ubnt/teleport/unifi/stun/TeleportStun;->closeConnection()Lgg/b;

    move-result-object p2

    new-instance p3, LI7/P$H;

    invoke-direct {p3, p0}, LI7/P$H;-><init>(LI7/P;)V

    invoke-static {p3}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p3

    const-string/jumbo p4, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v0, v0, [Lgg/f;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    aput-object p2, v0, v2

    const/4 p1, 0x2

    aput-object p3, v0, p1

    invoke-static {v0}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "concatArray(\n        stu\u2026figuration = null }\n    )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LI7/P;->o:Lgg/b;

    new-instance p1, LI7/P$I;

    invoke-direct {p1}, LI7/P$I;-><init>()V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LI7/P;->p:Lgg/z;

    new-instance p1, LI7/P$J;

    invoke-direct {p1}, LI7/P$J;-><init>()V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LI7/P;->q:Lgg/z;

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p1

    iput-object p1, p0, LI7/P;->s:LFg/c;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    sget-object p2, LI7/P$g;->a:LI7/P$g;

    new-instance p3, LI7/F;

    invoke-direct {p3, p2}, LI7/F;-><init>(Lmh/l;)V

    invoke-virtual {p1, p3}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "interruptedProcessor\n   \u2026        .ignoreElements()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LI7/P;->t:Lgg/b;

    return-void
.end method

.method public static synthetic A()V
    .locals 0

    invoke-static {}, LI7/P;->r0()V

    return-void
.end method

.method private static final A0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic B(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->j0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private final B0(Lcom/wireguard/crypto/b;Ljava/lang/String;)Lgg/z;
    .locals 2

    iget-object v0, p0, LI7/P;->l:Lgg/z;

    new-instance v1, LI7/P$C;

    invoke-direct {v1, p0, p2, p1}, LI7/P$C;-><init>(LI7/P;Ljava/lang/String;Lcom/wireguard/crypto/b;)V

    new-instance p1, LI7/q;

    invoke-direct {p1, v1}, LI7/q;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "private fun peerDescript\u2026          }\n            }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic C(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->a0(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method private static final C0(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method

.method public static synthetic D(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->y0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private final D0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
    .locals 5

    iget-object v0, p0, LI7/P;->t:Lgg/b;

    sget-object v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$c;

    invoke-direct {p0, v1}, LI7/P;->Z(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)Lgg/b;

    move-result-object v1

    invoke-direct {p0, p1}, LI7/P;->q0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;

    move-result-object p1

    new-instance v2, LI7/P$D;

    invoke-direct {v2, p0}, LI7/P$D;-><init>(LI7/P;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v2

    const-string/jumbo v3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x3

    new-array v3, v3, [Lgg/f;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object p1, v3, v1

    const/4 p1, 0x2

    aput-object v2, v3, p1

    invoke-static {v3}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {p1, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->X(Lgg/f;)Lgg/b;

    move-result-object p1

    sget-object v0, LI7/P$E;->a:LI7/P$E;

    new-instance v1, LI7/r;

    invoke-direct {v1, v0}, LI7/r;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/s;

    invoke-direct {v0}, LI7/s;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "connectionInterruptStrea\u2026reconnect() finished\" } }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static final synthetic E(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, LI7/P;->Z(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final E0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic F(LI7/P;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;
    .locals 0

    iget-object p0, p0, LI7/P;->e:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;

    return-object p0
.end method

.method private static final F0()V
    .locals 1

    sget-object v0, LI7/P$F;->a:LI7/P$F;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public static final synthetic G(LI7/P;)LFg/c;
    .locals 0

    iget-object p0, p0, LI7/P;->s:LFg/c;

    return-object p0
.end method

.method private static final G0(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    return-object p0
.end method

.method public static final synthetic H(LI7/P;)Lhg/c;
    .locals 0

    iget-object p0, p0, LI7/P;->r:Lhg/c;

    return-object p0
.end method

.method private static final H0(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, LI7/P$L;

    invoke-direct {p1, p0, p2}, LI7/P$L;-><init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V

    invoke-static {p1}, LN7/a;->b(Lmh/a;)V

    :cond_0
    return-object p2
.end method

.method public static final synthetic I(LI7/P;)LFg/a;
    .locals 0

    iget-object p0, p0, LI7/P;->j:LFg/a;

    return-object p0
.end method

.method private static final I0(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method public static final synthetic J(LI7/P;)Lcom/ubnt/teleport/unifi/stun/TeleportStun;
    .locals 0

    iget-object p0, p0, LI7/P;->a:Lcom/ubnt/teleport/unifi/stun/TeleportStun;

    return-object p0
.end method

.method private static final J0(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method public static final synthetic K(LI7/P;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;
    .locals 0

    iget-object p0, p0, LI7/P;->i:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    return-object p0
.end method

.method public static final synthetic L(LI7/P;)Lcom/wireguard/android/backend/a;
    .locals 0

    iget-object p0, p0, LI7/P;->b:Lcom/wireguard/android/backend/a;

    return-object p0
.end method

.method public static final synthetic M(LI7/P;)LFg/a;
    .locals 0

    iget-object p0, p0, LI7/P;->f:LFg/a;

    return-object p0
.end method

.method public static final synthetic N(LI7/P;)Lgg/b;
    .locals 0

    invoke-direct {p0}, LI7/P;->b0()Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O(LI7/P;)LFg/a;
    .locals 0

    iget-object p0, p0, LI7/P;->h:LFg/a;

    return-object p0
.end method

.method public static final synthetic P(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LI7/P;->e0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Q(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, LI7/P;->f0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic R(LI7/P;ILcom/wireguard/crypto/c;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/wireguard/config/a;
    .locals 0

    invoke-direct/range {p0 .. p11}, LI7/P;->h0(ILcom/wireguard/crypto/c;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/wireguard/config/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic S(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V
    .locals 0

    invoke-direct {p0, p1}, LI7/P;->k0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V

    return-void
.end method

.method public static final synthetic T(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, LI7/P;->q0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic U(LI7/P;Lcom/wireguard/crypto/b;Ljava/lang/String;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1, p2}, LI7/P;->B0(Lcom/wireguard/crypto/b;Ljava/lang/String;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic V(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, LI7/P;->D0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic W(LI7/P;Lhg/c;)V
    .locals 0

    iput-object p1, p0, LI7/P;->r:Lhg/c;

    return-void
.end method

.method public static final synthetic X(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;)V
    .locals 0

    iput-object p1, p0, LI7/P;->i:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    return-void
.end method

.method private static final Y(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private final Z(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)Lgg/b;
    .locals 4

    new-instance v0, LI7/P$e;

    invoke-direct {v0, p0}, LI7/P$e;-><init>(LI7/P;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LI7/P;->o:Lgg/b;

    new-instance v3, LI7/P$f;

    invoke-direct {v3, p0, p1}, LI7/P$f;-><init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)V

    invoke-static {v3}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    new-array v1, v1, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v1, v3

    const/4 v0, 0x1

    aput-object v2, v1, v0

    const/4 v0, 0x2

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "concatArray(\n           \u2026)\n            }\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final a0(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method private final b0()Lgg/b;
    .locals 2

    new-instance v0, LI7/P$h;

    invoke-direct {v0, p0}, LI7/P$h;-><init>(LI7/P;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$b;

    invoke-direct {p0, v1}, LI7/P;->Z(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "complete {\n            /\u2026State.Disconnected.Idle))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final c0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic d(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->m0(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method private final d0(Ljava/lang/String;Ljava/lang/Integer;)LYf/c;
    .locals 4

    if-eqz p2, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, ":"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "]:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYf/c;->c(Ljava/lang/String;)LYf/c;

    move-result-object p1

    const-string/jumbo p2, "{\n            InetEndpoi\u2026(\"[$ip]:$port\")\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3a

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYf/c;->c(Ljava/lang/String;)LYf/c;

    move-result-object p1

    const-string/jumbo p2, "{\n            InetEndpoi\u2026se(\"$ip:$port\")\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYf/c;->c(Ljava/lang/String;)LYf/c;

    move-result-object p1

    const-string/jumbo p2, "{\n            InetEndpoint.parse(ip)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public static synthetic e(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->I0(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method private final e0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;
    .locals 10

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a()I

    move-result v1

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->c()Ljava/net/InetAddress;

    move-result-object v6

    invoke-virtual {p3}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;->b()I

    move-result v3

    invoke-virtual {p3}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;->d()I

    move-result v5

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->a()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->d()Ljava/net/InetAddress;

    move-result-object v7

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->e()I

    move-result v8

    new-instance p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    move-object v0, p1

    invoke-direct/range {v0 .. v9}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;-><init>(ILjava/lang/String;ILjava/lang/String;ILjava/net/InetAddress;Ljava/net/InetAddress;ILjava/util/List;)V

    return-object p1
.end method

.method public static synthetic f(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->C0(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method private final f0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
    .locals 2

    iget-object v0, p0, LI7/P;->k:Lgg/i;

    new-instance v1, LI7/P$j;

    invoke-direct {v1, p0, p1}, LI7/P$j;-><init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V

    new-instance p1, LI7/p;

    invoke-direct {p1, v1}, LI7/p;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "private fun newTunnelRec\u2026    }\n            }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic g(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->E0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final g0(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->Y(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method private final h0(ILcom/wireguard/crypto/c;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/wireguard/config/a;
    .locals 2

    new-instance v0, Lcom/wireguard/config/a$b;

    invoke-direct {v0}, Lcom/wireguard/config/a$b;-><init>()V

    new-instance v1, Lcom/wireguard/config/b$b;

    invoke-direct {v1}, Lcom/wireguard/config/b$b;-><init>()V

    invoke-virtual {v1, p1}, Lcom/wireguard/config/b$b;->o(I)Lcom/wireguard/config/b$b;

    move-result-object p1

    :try_start_0
    invoke-static {p4}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p4
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_5

    invoke-virtual {p1, p4}, Lcom/wireguard/config/b$b;->m(Ljava/net/InetAddress;)Lcom/wireguard/config/b$b;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/wireguard/config/b$b;->n(I)Lcom/wireguard/config/b$b;

    move-result-object p1

    :try_start_1
    invoke-static {p8}, LYf/d;->c(Ljava/lang/String;)LYf/d;

    move-result-object p4
    :try_end_1
    .catch Lcom/wireguard/config/ParseException; {:try_start_1 .. :try_end_1} :catch_4

    invoke-virtual {p1, p4}, Lcom/wireguard/config/b$b;->i(LYf/d;)Lcom/wireguard/config/b$b;

    move-result-object p1

    const/16 p4, 0x2f

    :try_start_2
    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, LYf/d;->c(Ljava/lang/String;)LYf/d;

    move-result-object p4
    :try_end_2
    .catch Lcom/wireguard/config/ParseException; {:try_start_2 .. :try_end_2} :catch_3

    invoke-virtual {p1, p4}, Lcom/wireguard/config/b$b;->i(LYf/d;)Lcom/wireguard/config/b$b;

    move-result-object p1

    check-cast p11, Ljava/lang/Iterable;

    new-instance p4, Ljava/util/ArrayList;

    const/16 p5, 0xa

    invoke-static {p11, p5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p5

    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result p8

    if-eqz p8, :cond_0

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p8

    check-cast p8, Ljava/lang/String;

    :try_start_3
    invoke-static {p8}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p8
    :try_end_3
    .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_0

    invoke-interface {p4, p8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;

    const-string/jumbo p3, "Failed to set dns IP"

    invoke-direct {p2, p1, p3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p2

    :cond_0
    invoke-virtual {p1, p4}, Lcom/wireguard/config/b$b;->j(Ljava/util/Collection;)Lcom/wireguard/config/b$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/wireguard/config/b$b;->l(Lcom/wireguard/crypto/c;)Lcom/wireguard/config/b$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/wireguard/config/b$b;->k()Lcom/wireguard/config/b;

    move-result-object p1

    new-instance p2, Lcom/wireguard/config/c$b;

    invoke-direct {p2}, Lcom/wireguard/config/c$b;-><init>()V

    :try_start_4
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p0, p6, p4}, LI7/P;->d0(Ljava/lang/String;Ljava/lang/Integer;)LYf/c;

    move-result-object p4
    :try_end_4
    .catch Lcom/wireguard/config/ParseException; {:try_start_4 .. :try_end_4} :catch_2

    invoke-virtual {p2, p4}, Lcom/wireguard/config/c$b;->h(LYf/c;)Lcom/wireguard/config/c$b;

    move-result-object p2

    const-string p4, "0.0.0.0/0"

    invoke-static {p4}, LYf/d;->c(Ljava/lang/String;)LYf/d;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/wireguard/config/c$b;->f(LYf/d;)Lcom/wireguard/config/c$b;

    move-result-object p2

    const-string p4, "::0/0"

    invoke-static {p4}, LYf/d;->c(Ljava/lang/String;)LYf/d;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/wireguard/config/c$b;->f(LYf/d;)Lcom/wireguard/config/c$b;

    move-result-object p2

    :try_start_5
    invoke-static {p3}, Lcom/wireguard/crypto/b;->c(Ljava/lang/String;)Lcom/wireguard/crypto/b;

    move-result-object p3
    :try_end_5
    .catch Lcom/wireguard/crypto/KeyFormatException; {:try_start_5 .. :try_end_5} :catch_1

    invoke-virtual {p2, p3}, Lcom/wireguard/config/c$b;->i(Lcom/wireguard/crypto/b;)Lcom/wireguard/config/c$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/wireguard/config/c$b;->g()Lcom/wireguard/config/c;

    move-result-object p2

    invoke-virtual {v0, p1}, Lcom/wireguard/config/a$b;->e(Lcom/wireguard/config/b;)Lcom/wireguard/config/a$b;

    invoke-virtual {v0, p2}, Lcom/wireguard/config/a$b;->c(Lcom/wireguard/config/c;)Lcom/wireguard/config/a$b;

    invoke-virtual {v0}, Lcom/wireguard/config/a$b;->d()Lcom/wireguard/config/a;

    move-result-object p1

    const-string/jumbo p2, "builder.build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_1
    move-exception p1

    new-instance p2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;

    const-string/jumbo p3, "Failed to set remote public key"

    invoke-direct {p2, p1, p3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p2

    :catch_2
    move-exception p1

    new-instance p2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;

    const-string/jumbo p3, "Failed to set peer address"

    invoke-direct {p2, p1, p3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p2

    :catch_3
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "Failed to parse udp echo IP "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;

    invoke-direct {p3, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p3

    :catch_4
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "Failed to parse client IP "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;

    invoke-direct {p3, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p3

    :catch_5
    move-exception p1

    new-instance p2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;

    const-string/jumbo p3, "Failed to set interface IP"

    invoke-direct {p2, p1, p3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$Wireguard$Config;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p2
.end method

.method public static synthetic i(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->s0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final i0(LI7/P;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI7/P$m;

    invoke-direct {v0, p0}, LI7/P$m;-><init>(LI7/P;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public static synthetic j(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->g0(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method private static final j0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic k()V
    .locals 0

    invoke-static {}, LI7/P;->v0()V

    return-void
.end method

.method private final k0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)V
    .locals 1

    iget-object v0, p0, LI7/P;->g:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(LI7/P;)V
    .locals 0

    invoke-static {p0}, LI7/P;->z0(LI7/P;)V

    return-void
.end method

.method public static synthetic m(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->n0(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method private static final m0(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method public static synthetic n(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->A0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final n0(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method public static synthetic o(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->u0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final o0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic p(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->t0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final p0()V
    .locals 1

    sget-object v0, LI7/P$r;->a:LI7/P$r;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public static synthetic q(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->c0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private final q0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
    .locals 4

    iget-object v0, p0, LI7/P;->o:Lgg/b;

    new-instance v1, LI7/o;

    invoke-direct {v1}, LI7/o;-><init>()V

    invoke-virtual {v0, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object v0

    sget-object v1, LAg/e;->a:LAg/e;

    iget-object v2, p0, LI7/P;->p:Lgg/z;

    iget-object v3, p0, LI7/P;->q:Lgg/z;

    invoke-virtual {v1, v2, v3}, LAg/e;->a(Lgg/D;Lgg/D;)Lgg/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object v0

    sget-object v1, LI7/P$u;->a:LI7/P$u;

    new-instance v2, LI7/z;

    invoke-direct {v2, v1}, LI7/z;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LI7/P$v;

    invoke-direct {v1, p0}, LI7/P$v;-><init>(LI7/P;)V

    new-instance v2, LI7/H;

    invoke-direct {v2, v1}, LI7/H;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LI7/P$w;

    invoke-direct {v1, p0}, LI7/P$w;-><init>(LI7/P;)V

    new-instance v2, LI7/I;

    invoke-direct {v2, v1}, LI7/I;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LI7/J;

    invoke-direct {v1}, LI7/J;-><init>()V

    invoke-virtual {v0, v1}, Lgg/z;->l(Lkg/a;)Lgg/z;

    move-result-object v0

    new-instance v1, LI7/P$y;

    invoke-direct {v1, p0, p1}, LI7/P$y;-><init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V

    new-instance p1, LI7/K;

    invoke-direct {p1, v1}, LI7/K;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object v0, LI7/P$z;->a:LI7/P$z;

    new-instance v1, LI7/L;

    invoke-direct {v1, v0}, LI7/L;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/P$A;

    invoke-direct {v0, p0}, LI7/P$A;-><init>(LI7/P;)V

    new-instance v1, LI7/M;

    invoke-direct {v1, v0}, LI7/M;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/N;

    invoke-direct {v0, p0}, LI7/N;-><init>(LI7/P;)V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/P$t;

    invoke-direct {v0, p0}, LI7/P$t;-><init>(LI7/P;)V

    new-instance v1, LI7/O;

    invoke-direct {v1, v0}, LI7/O;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "private fun openConnecti\u2026id} ERROR\" }, it) }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic r(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->w0(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method private static final r0()V
    .locals 1

    sget-object v0, LI7/P$s;->a:LI7/P$s;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public static synthetic s(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->G0(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    move-result-object p0

    return-object p0
.end method

.method private static final s0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic t(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->J0(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method private static final t0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic u(LI7/P;)V
    .locals 0

    invoke-static {p0}, LI7/P;->i0(LI7/P;)V

    return-void
.end method

.method private static final u0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic v()V
    .locals 0

    invoke-static {}, LI7/P;->F0()V

    return-void
.end method

.method private static final v0()V
    .locals 1

    sget-object v0, LI7/P$x;->a:LI7/P$x;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public static synthetic w()V
    .locals 0

    invoke-static {}, LI7/P;->p0()V

    return-void
.end method

.method private static final w0(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method public static synthetic x(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LI7/P;->o0(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private static final x0(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method public static synthetic y(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, LI7/P;->x0(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method private static final y0(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic z(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;
    .locals 0

    invoke-static {p0, p1, p2}, LI7/P;->H0(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    move-result-object p0

    return-object p0
.end method

.method private static final z0(LI7/P;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI7/P$B;

    invoke-direct {v0, p0}, LI7/P$B;-><init>(LI7/P;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public a(ILcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;)Lgg/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$c;->a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;ILcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lcom/ubnt/teleport/TeleportTunnel$b;)Lgg/b;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-virtual {p0, p1}, LI7/P;->l0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/wireguard/android/backend/c$a;)V
    .locals 3

    const-string/jumbo v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI7/P$k;

    invoke-direct {v0, p1}, LI7/P$k;-><init>(Lcom/wireguard/android/backend/c$a;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    sget-object v0, LI7/P$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LI7/P;->h:LFg/a;

    invoke-virtual {p1}, LFg/a;->l2()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, LI7/P$l;

    invoke-direct {p1, p0}, LI7/P$l;-><init>(LI7/P;)V

    invoke-static {p1}, LN7/a;->b(Lmh/a;)V

    invoke-virtual {p0}, LI7/P;->close()Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    new-instance v0, LI7/t;

    invoke-direct {v0, p0}, LI7/t;-><init>(LI7/P;)V

    sget-object v1, LI7/P$n;->a:LI7/P$n;

    new-instance v2, LI7/u;

    invoke-direct {v2, v1}, LI7/u;-><init>(Lmh/l;)V

    invoke-virtual {p1, v0, v2}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    :cond_1
    iget-object p1, p0, LI7/P;->f:LFg/a;

    sget-object v0, LI7/P$b;->DOWN:LI7/P$b;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LI7/P;->f:LFg/a;

    sget-object v0, LI7/P$b;->UP:LI7/P$b;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public close()Lgg/b;
    .locals 3

    invoke-virtual {p0}, LI7/P;->getState()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LI7/P$d;

    invoke-direct {v1, p0}, LI7/P$d;-><init>(LI7/P;)V

    new-instance v2, LI7/G;

    invoke-direct {v2, v1}, LI7/G;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "override fun close(): Co\u2026          }\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LI7/P;

    if-eqz v0, :cond_0

    check-cast p1, LI7/P;

    invoke-virtual {p1}, LI7/P;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LI7/P;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;
    .locals 1

    iget-object v0, p0, LI7/P;->d:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "wgTunnel-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/P;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ubnt/teleport/TeleportTunnel$d;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, LI7/P;->n:Lgg/i;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LI7/P;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public l0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
    .locals 3

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LI7/P;->t:Lgg/b;

    invoke-virtual {p0}, LI7/P;->getState()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LI7/P$o;

    invoke-direct {v2, p0, p1}, LI7/P$o;-><init>(LI7/P;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V

    new-instance p1, LI7/v;

    invoke-direct {p1, v2}, LI7/v;-><init>(Lmh/l;)V

    invoke-virtual {v1, p1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->X(Lgg/f;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->c0()Lgg/i;

    move-result-object p1

    new-instance v0, LI7/P$p;

    invoke-direct {v0, p0}, LI7/P$p;-><init>(LI7/P;)V

    new-instance v1, LI7/w;

    invoke-direct {v1, v0}, LI7/w;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, LI7/P$q;->a:LI7/P$q;

    new-instance v1, LI7/x;

    invoke-direct {v1, v0}, LI7/x;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v0, LI7/y;

    invoke-direct {v0}, LI7/y;-><init>()V

    invoke-virtual {p1, v0}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "override fun open(params\u2026        .ignoreElements()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
