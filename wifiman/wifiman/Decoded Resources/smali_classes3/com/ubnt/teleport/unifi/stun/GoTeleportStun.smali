.class public final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/teleport/unifi/stun/TeleportStun;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;,
        Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;,
        Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;,
        Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0004()*+B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0082 \u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0004H\u0082 \u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0082 \u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082 \u00a2\u0006\u0004\u0008\u0013\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u0012H\u0082 \u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u0012H\u0082 \u00a2\u0006\u0004\u0008\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008#\u0010\"J\u000f\u0010$\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006,"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;",
        "Lcom/ubnt/teleport/unifi/stun/TeleportStun;",
        "<init>",
        "()V",
        "",
        "iceConfig",
        "sessionSecret",
        "interfaceAddressesJson",
        "Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;",
        "bridgeCreateLocalPeerDesc",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;",
        "peerDescription",
        "Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;",
        "bridgeSetRemotePeerDesc",
        "(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;",
        "Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;",
        "bridgeTryGetConnection",
        "()Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;",
        "LYg/J;",
        "bridgeActivateConnection",
        "bridgeClosePeer",
        "bridgeCloseConnection",
        "getInterfaceAddressesJson",
        "()Ljava/lang/String;",
        "Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;",
        "params",
        "Lgg/z;",
        "createLocalPeerDescription",
        "(Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;)Lgg/z;",
        "Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;",
        "setupPeerConnection",
        "(Ljava/lang/String;)Lgg/z;",
        "Lgg/b;",
        "activateConnection",
        "()Lgg/b;",
        "closePeer",
        "closeConnection",
        "loadNativeLibLazily",
        "Lgg/b;",
        "Companion",
        "a",
        "CreateLocalPeerDescResult",
        "SetRemotePeerDescResult",
        "TryGetConnectionResult",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$a;

.field private static final GET_CONNECTION_RETRY_INTERVAL_MILLIS:J = 0x64L

.field private static final GET_CONNECTION_TIMEOUT_MILLIS:J = 0x9c40L


# instance fields
.field private final loadNativeLibLazily:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->Companion:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LN7/b;->a:LN7/b;

    invoke-virtual {v0}, LN7/b;->a()Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->l()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "NativeLibLoader.loadLazily\n            .cache()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->loadNativeLibLazily:Lgg/b;

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->activateConnection$lambda$14()V

    return-void
.end method

.method public static final synthetic access$bridgeActivateConnection(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V
    .locals 0

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->bridgeActivateConnection()V

    return-void
.end method

.method public static final synthetic access$bridgeCloseConnection(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V
    .locals 0

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->bridgeCloseConnection()V

    return-void
.end method

.method public static final synthetic access$bridgeClosePeer(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V
    .locals 0

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->bridgeClosePeer()V

    return-void
.end method

.method public static final synthetic access$bridgeCreateLocalPeerDesc(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->bridgeCreateLocalPeerDesc(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$bridgeSetRemotePeerDesc(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->bridgeSetRemotePeerDesc(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$bridgeTryGetConnection(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;
    .locals 0

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->bridgeTryGetConnection()Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getInterfaceAddressesJson(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->getInterfaceAddressesJson()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final activateConnection$lambda$14()V
    .locals 1

    sget-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$c;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$c;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public static synthetic b(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection$lambda$7(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private final native bridgeActivateConnection()V
.end method

.method private final native bridgeCloseConnection()V
.end method

.method private final native bridgeClosePeer()V
.end method

.method private final native bridgeCreateLocalPeerDesc(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;
.end method

.method private final native bridgeSetRemotePeerDesc(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;
.end method

.method private final native bridgeTryGetConnection()Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection$lambda$8(Lmh/l;Ljava/lang/Object;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method private static final createLocalPeerDescription$lambda$2(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic d(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection$lambda$11(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection$lambda$12(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection$lambda$13(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->createLocalPeerDescription$lambda$2(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private final getInterfaceAddressesJson()Ljava/lang/String;
    .locals 4

    new-instance v0, LY6/r$a;

    invoke-direct {v0}, LY6/r$a;-><init>()V

    invoke-virtual {v0}, LY6/r$a;->c()LY6/r;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ljava/util/List;

    invoke-static {v2, v1}, LY6/v;->j(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v1

    invoke-virtual {v0, v1}, LY6/r;->d(Ljava/lang/reflect/Type;)LY6/h;

    move-result-object v0

    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v1

    const-string/jumbo v2, "getNetworkInterfaces()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LZg/v;->z(Ljava/util/Enumeration;)Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v1}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object v1

    sget-object v2, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$o;

    invoke-static {v1, v2}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v1

    invoke-static {v1}, Lzi/m;->j(Lzi/j;)Lzi/j;

    move-result-object v1

    invoke-static {v1}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "jsonAdapter.toJson(interfaceAddresses)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection$lambda$9(Lmh/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection$lambda$10(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    move-result-object p0

    return-object p0
.end method

.method private static final setupPeerConnection$lambda$10(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    return-object p0
.end method

.method private static final setupPeerConnection$lambda$11(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method

.method private static final setupPeerConnection$lambda$12(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method

.method private static final setupPeerConnection$lambda$13(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final setupPeerConnection$lambda$7(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final setupPeerConnection$lambda$8(Lmh/l;Ljava/lang/Object;)LDj/a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LDj/a;

    return-object p0
.end method

.method private static final setupPeerConnection$lambda$9(Lmh/l;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public activateConnection()Lgg/b;
    .locals 3

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->loadNativeLibLazily:Lgg/b;

    new-instance v1, LL7/h;

    invoke-direct {v1}, LL7/h;-><init>()V

    invoke-virtual {v0, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$b;

    invoke-direct {v1, p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$b;-><init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "loadNativeLibLazily\n    \u2026scribeOn(Schedulers.io())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public closeConnection()Lgg/b;
    .locals 3

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->loadNativeLibLazily:Lgg/b;

    new-instance v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$f;

    invoke-direct {v1, p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$f;-><init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "loadNativeLibLazily.andT\u2026scribeOn(Schedulers.io())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public closePeer()Lgg/b;
    .locals 3

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->loadNativeLibLazily:Lgg/b;

    new-instance v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$i;

    invoke-direct {v1, p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$i;-><init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "loadNativeLibLazily.andT\u2026scribeOn(Schedulers.io())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public createLocalPeerDescription(Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;)Lgg/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;",
            ")",
            "Lgg/z<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->loadNativeLibLazily:Lgg/b;

    new-instance v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;

    invoke-direct {v1, p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;-><init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$n;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$n;

    new-instance v1, LL7/i;

    invoke-direct {v1, v0}, LL7/i;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "loadNativeLibLazily\n    \u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setupPeerConnection(Ljava/lang/String;)Lgg/z;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lgg/z<",
            "Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;",
            ">;"
        }
    .end annotation

    const-string/jumbo v0, "peerDescription"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->loadNativeLibLazily:Lgg/b;

    new-instance v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$p;

    invoke-direct {v1, p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$p;-><init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;Ljava/lang/String;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$q;

    invoke-direct {v0, p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$q;-><init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$s;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$s;

    new-instance v2, LL7/a;

    invoke-direct {v2, v1}, LL7/a;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$t;

    new-instance v2, LL7/b;

    invoke-direct {v2, v1}, LL7/b;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;

    new-instance v2, LL7/c;

    invoke-direct {v2, v1}, LL7/c;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    const-wide/32 v1, 0x9c40

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;

    new-instance v2, LL7/d;

    invoke-direct {v2, v1}, LL7/d;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$w;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$w;

    new-instance v2, LL7/e;

    invoke-direct {v2, v1}, LL7/e;-><init>(Lmh/l;)V

    invoke-virtual {v0, v2}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x;

    invoke-direct {v0, p0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x;-><init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V

    new-instance v1, LL7/f;

    invoke-direct {v1, v0}, LL7/f;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$y;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$y;

    new-instance v1, LL7/g;

    invoke-direct {v1, v0}, LL7/g;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "override fun setupPeerCo\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
