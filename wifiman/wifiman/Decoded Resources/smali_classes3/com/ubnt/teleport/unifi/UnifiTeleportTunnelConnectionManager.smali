.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoResponse;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$a;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$d;
    }
.end annotation


# static fields
.field public static final p:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$a;


# instance fields
.field private a:J

.field private b:J

.field private c:LI7/Q;

.field private d:Ljava/lang/Long;

.field private e:J

.field private f:J

.field private g:J

.field private h:J

.field private final i:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

.field private final j:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

.field private final k:LFg/a;

.field private final l:LYg/m;

.field private final m:LYg/m;

.field private final n:LYg/m;

.field private final o:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->p:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->i:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->j:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    invoke-static {}, LFg/a;->j2()LFg/a;

    move-result-object v0

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->k:LFg/a;

    sget-object v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->l:LYg/m;

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$i;

    invoke-direct {v1, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$i;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->m:LYg/m;

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$j;

    invoke-direct {v1, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$j;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->n:LYg/m;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$o;

    invoke-direct {v1, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$o;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V

    new-instance v2, LI7/l;

    invoke-direct {v2, v1}, LI7/l;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$p;

    invoke-direct {v1, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$p;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V

    new-instance v2, LI7/m;

    invoke-direct {v2, v1}, LI7/m;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$q;

    invoke-direct {v1, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$q;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V

    new-instance v2, LI7/n;

    invoke-direct {v2, v1}, LI7/n;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "udpEchoConfigProcessor\n \u2026)\n            .refCount()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->o:Lgg/i;

    return-void
.end method

.method private final A()LY6/h;
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->m:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-moshiEchoRequestAdapter>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LY6/h;

    return-object v0
.end method

.method private final B()LY6/h;
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->n:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-moshiEchoResponseAdapter>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LY6/h;

    return-object v0
.end method

.method private final C(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    sget-object v1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string/jumbo v1, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "encodeToString(hash, Base64.NO_WRAP)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final E(Ljava/net/DatagramSocket;)Lgg/s;
    .locals 1

    new-instance v0, LI7/i;

    invoke-direct {v0, p1, p0}, LI7/i;-><init>(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object p1

    const-string/jumbo v0, "create { emitter ->\n    \u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final F(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lgg/t;)V
    .locals 7

    const-string v0, "$this_listenEchoConfirmations"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x100

    new-array v1, v0, [B

    new-instance v2, Ljava/net/DatagramPacket;

    invoke-direct {v2, v1, v0}, Ljava/net/DatagramPacket;-><init>([BI)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v1

    const-string/jumbo v3, "packet.data"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/DatagramPacket;->getLength()I

    move-result v3

    sget-object v4, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    new-instance v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v5, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-direct {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->B()LY6/h;

    move-result-object v1

    iget-object v3, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoResponse;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoResponse;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v1}, Lgg/h;->h(Ljava/lang/Object;)V

    sget-object v1, LYg/J;->a:LYg/J;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-nez v1, :cond_0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$g;

    invoke-direct {v1, v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$g;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v1, v3}, LN7/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    sget-object p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$f;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$f;

    invoke-static {p0}, LN7/a;->b(Lmh/a;)V

    invoke-interface {p2}, Lgg/h;->a()V

    return-void
.end method

.method private final G(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/i;
    .locals 2

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$k;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$k;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;

    invoke-direct {v1, p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$l;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V

    new-instance p1, LI7/h;

    invoke-direct {p1, v1}, LI7/h;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "private fun newUdpEchoSt\u2026   }\n            }\n\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final H(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method private final I(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/b;
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v1, LI7/j;

    invoke-direct {v1, v0}, LI7/j;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-static {v1}, Lgg/i;->C0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;

    invoke-direct {v1, p0, p2, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$m;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;Ljava/net/DatagramSocket;)V

    new-instance p1, LI7/k;

    invoke-direct {p1, v1}, LI7/k;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/i;->D(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "private fun DatagramSock\u2026On(Schedulers.io())\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final J(Ljava/util/concurrent/atomic/AtomicInteger;Lgg/h;)V
    .locals 1

    const-string v0, "$indexField"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final K(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/f;

    return-object p0
.end method

.method private static final M(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method private static final N(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final O(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final P(LI7/Q;)V
    .locals 3

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->c:LI7/Q;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->c:LI7/Q;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->d:Ljava/lang/Long;

    iget-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->c:LI7/Q;

    sget-object v2, LI7/Q;->CONNECTED:LI7/Q;

    if-ne p1, v2, :cond_0

    iput-wide v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->b:J

    :cond_0
    new-instance p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$r;

    invoke-direct {p1, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$r;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V

    invoke-static {p1}, LN7/a;->b(Lmh/a;)V

    :cond_1
    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->M(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->F(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lgg/t;)V

    return-void
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->O(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Ljava/util/concurrent/atomic/AtomicInteger;Lgg/h;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->J(Ljava/util/concurrent/atomic/AtomicInteger;Lgg/h;)V

    return-void
.end method

.method public static synthetic e(Lmh/l;Ljava/lang/Object;)Lgg/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->K(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->N(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->H(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)J
    .locals 2

    iget-wide v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->a:J

    return-wide v0
.end method

.method public static final synthetic i(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)LI7/Q;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->c:LI7/Q;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)LY6/r;
    .locals 0

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->z()LY6/r;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)LY6/h;
    .locals 0

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->A()LY6/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->i:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    return-object p0
.end method

.method public static final synthetic m(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->j:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    return-object p0
.end method

.method public static final synthetic o(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)LFg/a;
    .locals 0

    iget-object p0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->k:LFg/a;

    return-object p0
.end method

.method public static final synthetic p(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Ljava/net/DatagramSocket;)Lgg/s;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->E(Ljava/net/DatagramSocket;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->G(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->I(Ljava/net/DatagramSocket;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;J)V
    .locals 0

    iput-wide p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->a:J

    return-void
.end method

.method public static final synthetic t(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;J)V
    .locals 0

    iput-wide p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->b:J

    return-void
.end method

.method public static final synthetic u(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;J)V
    .locals 0

    iput-wide p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->e:J

    return-void
.end method

.method public static final synthetic v(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;J)V
    .locals 0

    iput-wide p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->f:J

    return-void
.end method

.method public static final synthetic w(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;LI7/Q;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->P(LI7/Q;)V

    return-void
.end method

.method private final z()LY6/r;
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->l:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-moshi>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LY6/r;

    return-object v0
.end method


# virtual methods
.method public D()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->o:Lgg/i;

    return-object v0
.end method

.method public final L(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$n;

    invoke-direct {v0, p0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$n;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public Q(Lcom/wireguard/android/backend/b;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;
    .locals 2

    const-string/jumbo v0, "wgStats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/wireguard/android/backend/b;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->g:J

    invoke-virtual {p1}, Lcom/wireguard/android/backend/b;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->h:J

    iget-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->i:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    iget-wide v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->g:J

    invoke-virtual {p1, v0, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->c(J)V

    iget-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->j:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    iget-wide v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->h:J

    invoke-virtual {p1, v0, v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->c(J)V

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->y()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object p1

    return-object p1
.end method

.method public x()Lgg/b;
    .locals 2

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;

    invoke-direct {v0, p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$e;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public y()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;
    .locals 21

    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->a:J

    iget-wide v4, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->b:J

    iget-object v1, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->c:LI7/Q;

    const/4 v6, -0x1

    if-nez v1, :cond_0

    move v1, v6

    goto :goto_0

    :cond_0
    sget-object v7, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$d;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v7, v1

    :goto_0
    const-string/jumbo v7, "state is not null so update timestamp shouldn\'t be either"

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eq v1, v6, :cond_4

    if-eq v1, v10, :cond_2

    if-eq v1, v9, :cond_2

    if-ne v1, v8, :cond_1

    goto :goto_2

    :cond_1
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_2
    iget-wide v11, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->e:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    iget-object v1, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->d:Ljava/lang/Long;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v15

    sub-long/2addr v13, v15

    add-long/2addr v11, v13

    :goto_1
    move-wide/from16 v18, v11

    goto :goto_3

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_2
    iget-wide v11, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->e:J

    goto :goto_1

    :goto_3
    iget-object v1, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->c:LI7/Q;

    if-nez v1, :cond_5

    move v1, v6

    goto :goto_4

    :cond_5
    sget-object v11, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$d;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v11, v1

    :goto_4
    if-eq v1, v6, :cond_8

    if-eq v1, v10, :cond_8

    if-eq v1, v9, :cond_8

    if-ne v1, v8, :cond_7

    iget-wide v8, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->f:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    iget-object v1, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->d:Ljava/lang/Long;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    sub-long/2addr v10, v6

    add-long/2addr v8, v10

    goto :goto_5

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_8
    iget-wide v6, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->f:J

    move-wide v8, v6

    :goto_5
    iget-wide v10, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->g:J

    iget-wide v12, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->h:J

    iget-object v1, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->i:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->b()J

    move-result-wide v14

    iget-object v1, v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;->j:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->b()J

    move-result-wide v16

    new-instance v20, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-object/from16 v1, v20

    move-wide/from16 v6, v18

    invoke-direct/range {v1 .. v17}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;-><init>(JJJJJJJJ)V

    return-object v20
.end method
