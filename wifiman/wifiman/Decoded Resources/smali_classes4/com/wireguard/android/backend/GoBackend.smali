.class public final Lcom/wireguard/android/backend/GoBackend;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/wireguard/android/backend/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/wireguard/android/backend/GoBackend$d;,
        Lcom/wireguard/android/backend/GoBackend$c;,
        Lcom/wireguard/android/backend/GoBackend$b;
    }
.end annotation


# static fields
.field private static f:Lcom/wireguard/android/backend/GoBackend$b;

.field private static g:Lcom/wireguard/android/backend/GoBackend$c;

.field private static final h:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/wireguard/config/a;

.field private c:Lcom/wireguard/android/backend/c;

.field private d:I

.field private e:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/wireguard/android/backend/GoBackend$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/wireguard/android/backend/GoBackend$c;-><init>(Lcom/wireguard/android/backend/GoBackend$a;)V

    sput-object v0, Lcom/wireguard/android/backend/GoBackend;->g:Lcom/wireguard/android/backend/GoBackend$c;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/wireguard/android/backend/GoBackend;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    iput-object p1, p0, Lcom/wireguard/android/backend/GoBackend;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/wireguard/android/backend/GoBackend;->e:Ljava/lang/Class;

    return-void
.end method

.method static synthetic d()Lcom/wireguard/android/backend/GoBackend$c;
    .locals 1

    sget-object v0, Lcom/wireguard/android/backend/GoBackend;->g:Lcom/wireguard/android/backend/GoBackend$c;

    return-object v0
.end method

.method static synthetic e(Lcom/wireguard/android/backend/GoBackend$c;)Lcom/wireguard/android/backend/GoBackend$c;
    .locals 0

    sput-object p0, Lcom/wireguard/android/backend/GoBackend;->g:Lcom/wireguard/android/backend/GoBackend$c;

    return-object p0
.end method

.method static synthetic f(Lcom/wireguard/android/backend/GoBackend;)Lcom/wireguard/android/backend/c;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    return-object p0
.end method

.method static synthetic g(Lcom/wireguard/android/backend/GoBackend;Lcom/wireguard/android/backend/c;)Lcom/wireguard/android/backend/c;
    .locals 0

    iput-object p1, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    return-object p1
.end method

.method static synthetic h(Lcom/wireguard/android/backend/GoBackend;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/android/backend/GoBackend;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic i(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lcom/wireguard/android/backend/GoBackend;->o(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic j(Lcom/wireguard/android/backend/GoBackend;)I
    .locals 0

    iget p0, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    return p0
.end method

.method static synthetic k(Lcom/wireguard/android/backend/GoBackend;I)I
    .locals 0

    iput p1, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    return p1
.end method

.method static synthetic l(I)V
    .locals 0

    invoke-static {p0}, Lcom/wireguard/android/backend/GoBackend;->wgTurnOff(I)V

    return-void
.end method

.method static synthetic m(Lcom/wireguard/android/backend/GoBackend;Lcom/wireguard/config/a;)Lcom/wireguard/config/a;
    .locals 0

    iput-object p1, p0, Lcom/wireguard/android/backend/GoBackend;->b:Lcom/wireguard/config/a;

    return-object p1
.end method

.method static synthetic n()Lcom/wireguard/android/backend/GoBackend$b;
    .locals 1

    sget-object v0, Lcom/wireguard/android/backend/GoBackend;->f:Lcom/wireguard/android/backend/GoBackend$b;

    return-object v0
.end method

.method private static o(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/wireguard/android/backend/GoBackend;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "WireGuard/GoBackend"

    const-string v2, "Loading WG native lib "

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "wg-go"

    invoke-static {p0, v1}, LXf/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    const-string p0, "WireGuard/GoBackend"

    const-string v1, "WG native lib loaded"

    invoke-static {p0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static p(Lcom/wireguard/android/backend/GoBackend$b;)V
    .locals 0

    sput-object p0, Lcom/wireguard/android/backend/GoBackend;->f:Lcom/wireguard/android/backend/GoBackend$b;

    return-void
.end method

.method private q(Lcom/wireguard/android/backend/c;Lcom/wireguard/config/a;Lcom/wireguard/android/backend/c$a;)V
    .locals 12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bringing tunnel "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/wireguard/android/backend/c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WireGuard/GoBackend"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/wireguard/android/backend/GoBackend;->o(Landroid/content/Context;)V

    sget-object v0, Lcom/wireguard/android/backend/c$a;->UP:Lcom/wireguard/android/backend/c$a;

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne p3, v0, :cond_15

    const/4 v0, 0x0

    if-eqz p2, :cond_14

    iget-object v4, p0, Lcom/wireguard/android/backend/GoBackend;->a:Landroid/content/Context;

    invoke-static {v4}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v4

    if-nez v4, :cond_13

    sget-object v4, Lcom/wireguard/android/backend/GoBackend;->g:Lcom/wireguard/android/backend/GoBackend$c;

    invoke-virtual {v4}, Lcom/wireguard/android/backend/GoBackend$c;->c()Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Requesting to start VpnService ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/wireguard/android/backend/GoBackend;->e:Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5d

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v4, p0, Lcom/wireguard/android/backend/GoBackend;->a:Landroid/content/Context;

    new-instance v5, Landroid/content/Intent;

    iget-object v6, p0, Lcom/wireguard/android/backend/GoBackend;->a:Landroid/content/Context;

    iget-object v7, p0, Lcom/wireguard/android/backend/GoBackend;->e:Ljava/lang/Class;

    invoke-direct {v5, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v4, v5}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_0
    :try_start_0
    sget-object v4, Lcom/wireguard/android/backend/GoBackend;->g:Lcom/wireguard/android/backend/GoBackend$c;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x2

    invoke-virtual {v4, v6, v7, v5}, Lcom/wireguard/android/backend/GoBackend$c;->b(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/wireguard/android/backend/GoBackend$d;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v4, p0}, Lcom/wireguard/android/backend/GoBackend$d;->b(Lcom/wireguard/android/backend/GoBackend;)V

    iget v5, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    if-eq v5, v2, :cond_1

    const-string p1, "Tunnel already up"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    move v2, v0

    :goto_0
    const/16 v5, 0xa

    if-ge v2, v5, :cond_5

    invoke-virtual {p2}, Lcom/wireguard/config/a;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/wireguard/config/c;

    invoke-virtual {v6}, Lcom/wireguard/config/c;->f()Ljava/util/Optional;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LYf/c;

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, LYf/c;->b()Ljava/util/Optional;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_2

    const/16 v5, 0x9

    if-ge v2, v5, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DNS host \""

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, LYf/c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\" failed to resolve; trying again"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v5, 0x3e8

    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Lcom/wireguard/android/backend/BackendException;

    sget-object p2, Lcom/wireguard/android/backend/BackendException$a;->DNS_RESOLUTION_FAILURE:Lcom/wireguard/android/backend/BackendException$a;

    invoke-virtual {v6}, LYf/c;->a()Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/wireguard/android/backend/BackendException;-><init>(Lcom/wireguard/android/backend/BackendException$a;[Ljava/lang/Object;)V

    throw p1

    :cond_5
    invoke-virtual {p2}, Lcom/wireguard/config/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lcom/wireguard/android/backend/GoBackend$d;->a()Landroid/net/VpnService$Builder;

    move-result-object v5

    invoke-interface {p1}, Lcom/wireguard/android/backend/c;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    invoke-virtual {p2}, Lcom/wireguard/config/a;->a()Lcom/wireguard/config/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/wireguard/config/b;->g()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5, v7}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    goto :goto_2

    :cond_6
    invoke-virtual {p2}, Lcom/wireguard/config/a;->a()Lcom/wireguard/config/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/wireguard/config/b;->h()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5, v7}, Landroid/net/VpnService$Builder;->addAllowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    goto :goto_3

    :cond_7
    invoke-virtual {p2}, Lcom/wireguard/config/a;->a()Lcom/wireguard/config/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/wireguard/config/b;->e()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LYf/d;

    invoke-virtual {v7}, LYf/d;->a()Ljava/net/InetAddress;

    move-result-object v8

    invoke-virtual {v7}, LYf/d;->b()I

    move-result v7

    invoke-virtual {v5, v8, v7}, Landroid/net/VpnService$Builder;->addAddress(Ljava/net/InetAddress;I)Landroid/net/VpnService$Builder;

    goto :goto_4

    :cond_8
    invoke-virtual {p2}, Lcom/wireguard/config/a;->a()Lcom/wireguard/config/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/wireguard/config/b;->f()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/net/InetAddress;

    invoke-virtual {v7}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Lcom/wireguard/config/a;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v0

    :cond_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/wireguard/config/c;

    invoke-virtual {v8}, Lcom/wireguard/config/c;->e()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LYf/d;

    invoke-virtual {v10}, LYf/d;->b()I

    move-result v11

    if-nez v11, :cond_b

    move v7, v9

    :cond_b
    invoke-virtual {v10}, LYf/d;->a()Ljava/net/InetAddress;

    move-result-object v11

    invoke-virtual {v10}, LYf/d;->b()I

    move-result v10

    invoke-virtual {v5, v11, v10}, Landroid/net/VpnService$Builder;->addRoute(Ljava/net/InetAddress;I)Landroid/net/VpnService$Builder;

    goto :goto_6

    :cond_c
    if-eqz v7, :cond_d

    invoke-virtual {p2}, Lcom/wireguard/config/a;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-eq v6, v9, :cond_e

    :cond_d
    sget v6, Landroid/system/OsConstants;->AF_INET:I

    invoke-virtual {v5, v6}, Landroid/net/VpnService$Builder;->allowFamily(I)Landroid/net/VpnService$Builder;

    sget v6, Landroid/system/OsConstants;->AF_INET6:I

    invoke-virtual {v5, v6}, Landroid/net/VpnService$Builder;->allowFamily(I)Landroid/net/VpnService$Builder;

    :cond_e
    invoke-virtual {p2}, Lcom/wireguard/config/a;->a()Lcom/wireguard/config/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/wireguard/config/b;->i()Ljava/util/Optional;

    move-result-object v6

    const/16 v7, 0x500

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1d

    if-lt v6, v7, :cond_f

    invoke-static {v5, v0}, LWf/a;->a(Landroid/net/VpnService$Builder;Z)Landroid/net/VpnService$Builder;

    :cond_f
    invoke-virtual {v4, v3}, Landroid/net/VpnService;->setUnderlyingNetworks([Landroid/net/Network;)Z

    invoke-virtual {v5, v9}, Landroid/net/VpnService$Builder;->setBlocking(Z)Landroid/net/VpnService$Builder;

    invoke-virtual {v5}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    move-result-object v3

    if-eqz v3, :cond_11

    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Go backend "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/wireguard/android/backend/GoBackend;->wgVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p1}, Lcom/wireguard/android/backend/c;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result v1

    invoke-static {v0, v1, v2}, Lcom/wireguard/android/backend/GoBackend;->wgTurnOn(Ljava/lang/String;ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/wireguard/android/backend/GoBackend;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v3}, Landroid/os/ParcelFileDescriptor;->close()V

    iget v0, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    if-ltz v0, :cond_10

    iput-object p1, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    iput-object p2, p0, Lcom/wireguard/android/backend/GoBackend;->b:Lcom/wireguard/config/a;

    invoke-static {v0}, Lcom/wireguard/android/backend/GoBackend;->wgGetSocketV4(I)I

    move-result p2

    invoke-virtual {v4, p2}, Landroid/net/VpnService;->protect(I)Z

    iget p2, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    invoke-static {p2}, Lcom/wireguard/android/backend/GoBackend;->wgGetSocketV6(I)I

    move-result p2

    invoke-virtual {v4, p2}, Landroid/net/VpnService;->protect(I)Z

    goto :goto_9

    :cond_10
    new-instance p1, Lcom/wireguard/android/backend/BackendException;

    sget-object p2, Lcom/wireguard/android/backend/BackendException$a;->GO_ACTIVATION_ERROR_CODE:Lcom/wireguard/android/backend/BackendException$a;

    iget p3, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/wireguard/android/backend/BackendException;-><init>(Lcom/wireguard/android/backend/BackendException$a;[Ljava/lang/Object;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_7

    :cond_11
    :try_start_2
    new-instance p1, Lcom/wireguard/android/backend/BackendException;

    sget-object p2, Lcom/wireguard/android/backend/BackendException$a;->TUN_CREATION_ERROR:Lcom/wireguard/android/backend/BackendException$a;

    new-array p3, v0, [Ljava/lang/Object;

    invoke-direct {p1, p2, p3}, Lcom/wireguard/android/backend/BackendException;-><init>(Lcom/wireguard/android/backend/BackendException$a;[Ljava/lang/Object;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_7
    if-eqz v3, :cond_12

    :try_start_3
    invoke-virtual {v3}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_12
    :goto_8
    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Lcom/wireguard/android/backend/BackendException;

    sget-object p3, Lcom/wireguard/android/backend/BackendException$a;->UNABLE_TO_START_VPN:Lcom/wireguard/android/backend/BackendException$a;

    new-array v0, v0, [Ljava/lang/Object;

    invoke-direct {p2, p3, v0}, Lcom/wireguard/android/backend/BackendException;-><init>(Lcom/wireguard/android/backend/BackendException$a;[Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :cond_13
    new-instance p1, Lcom/wireguard/android/backend/BackendException;

    sget-object p2, Lcom/wireguard/android/backend/BackendException$a;->VPN_NOT_AUTHORIZED:Lcom/wireguard/android/backend/BackendException$a;

    new-array p3, v0, [Ljava/lang/Object;

    invoke-direct {p1, p2, p3}, Lcom/wireguard/android/backend/BackendException;-><init>(Lcom/wireguard/android/backend/BackendException$a;[Ljava/lang/Object;)V

    throw p1

    :cond_14
    new-instance p1, Lcom/wireguard/android/backend/BackendException;

    sget-object p2, Lcom/wireguard/android/backend/BackendException$a;->TUNNEL_MISSING_CONFIG:Lcom/wireguard/android/backend/BackendException$a;

    new-array p3, v0, [Ljava/lang/Object;

    invoke-direct {p1, p2, p3}, Lcom/wireguard/android/backend/BackendException;-><init>(Lcom/wireguard/android/backend/BackendException$a;[Ljava/lang/Object;)V

    throw p1

    :cond_15
    iget p2, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    if-ne p2, v2, :cond_16

    const-string p1, "Tunnel already down"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_16
    iput-object v3, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    iput v2, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    iput-object v3, p0, Lcom/wireguard/android/backend/GoBackend;->b:Lcom/wireguard/config/a;

    invoke-static {p2}, Lcom/wireguard/android/backend/GoBackend;->wgTurnOff(I)V

    :try_start_4
    sget-object p2, Lcom/wireguard/android/backend/GoBackend;->g:Lcom/wireguard/android/backend/GoBackend$c;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x0

    invoke-virtual {p2, v1, v2, v0}, Lcom/wireguard/android/backend/GoBackend$c;->b(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/wireguard/android/backend/GoBackend$d;

    invoke-virtual {p2}, Landroid/app/Service;->stopSelf()V
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    :goto_9
    invoke-interface {p1, p3}, Lcom/wireguard/android/backend/c;->c(Lcom/wireguard/android/backend/c$a;)V

    return-void
.end method

.method private static native wgGetConfig(I)Ljava/lang/String;
.end method

.method private static native wgGetSocketV4(I)I
.end method

.method private static native wgGetSocketV6(I)I
.end method

.method private static native wgTurnOff(I)V
.end method

.method private static native wgTurnOn(Ljava/lang/String;ILjava/lang/String;)I
.end method

.method private static native wgVersion()Ljava/lang/String;
.end method


# virtual methods
.method public a(Lcom/wireguard/android/backend/c;Lcom/wireguard/android/backend/c$a;Lcom/wireguard/config/a;)Lcom/wireguard/android/backend/c$a;
    .locals 4

    invoke-virtual {p0, p1}, Lcom/wireguard/android/backend/GoBackend;->b(Lcom/wireguard/android/backend/c;)Lcom/wireguard/android/backend/c$a;

    move-result-object v0

    sget-object v1, Lcom/wireguard/android/backend/c$a;->TOGGLE:Lcom/wireguard/android/backend/c$a;

    if-ne p2, v1, :cond_0

    sget-object p2, Lcom/wireguard/android/backend/c$a;->UP:Lcom/wireguard/android/backend/c$a;

    if-ne v0, p2, :cond_0

    sget-object p2, Lcom/wireguard/android/backend/c$a;->DOWN:Lcom/wireguard/android/backend/c$a;

    :cond_0
    if-ne p2, v0, :cond_1

    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    if-ne p1, v1, :cond_1

    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend;->b:Lcom/wireguard/config/a;

    if-ne p3, v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lcom/wireguard/android/backend/c$a;->UP:Lcom/wireguard/android/backend/c$a;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_4

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend;->b:Lcom/wireguard/config/a;

    iget-object v2, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    if-eqz v2, :cond_2

    sget-object v3, Lcom/wireguard/android/backend/c$a;->DOWN:Lcom/wireguard/android/backend/c$a;

    invoke-direct {p0, v2, v1, v3}, Lcom/wireguard/android/backend/GoBackend;->q(Lcom/wireguard/android/backend/c;Lcom/wireguard/config/a;Lcom/wireguard/android/backend/c$a;)V

    :cond_2
    :try_start_0
    invoke-direct {p0, p1, p3, p2}, Lcom/wireguard/android/backend/GoBackend;->q(Lcom/wireguard/android/backend/c;Lcom/wireguard/config/a;Lcom/wireguard/android/backend/c$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    if-eqz v2, :cond_3

    sget-object p2, Lcom/wireguard/android/backend/c$a;->UP:Lcom/wireguard/android/backend/c$a;

    invoke-direct {p0, v2, v0, p2}, Lcom/wireguard/android/backend/GoBackend;->q(Lcom/wireguard/android/backend/c;Lcom/wireguard/config/a;Lcom/wireguard/android/backend/c$a;)V

    :cond_3
    throw p1

    :cond_4
    sget-object p3, Lcom/wireguard/android/backend/c$a;->DOWN:Lcom/wireguard/android/backend/c$a;

    if-ne p2, p3, :cond_5

    iget-object p2, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    if-ne p1, p2, :cond_5

    invoke-direct {p0, p1, v1, p3}, Lcom/wireguard/android/backend/GoBackend;->q(Lcom/wireguard/android/backend/c;Lcom/wireguard/config/a;Lcom/wireguard/android/backend/c$a;)V

    :cond_5
    :goto_0
    invoke-virtual {p0, p1}, Lcom/wireguard/android/backend/GoBackend;->b(Lcom/wireguard/android/backend/c;)Lcom/wireguard/android/backend/c$a;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/wireguard/android/backend/c;)Lcom/wireguard/android/backend/c$a;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    if-ne v0, p1, :cond_0

    sget-object p1, Lcom/wireguard/android/backend/c$a;->UP:Lcom/wireguard/android/backend/c$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/wireguard/android/backend/c$a;->DOWN:Lcom/wireguard/android/backend/c$a;

    :goto_0
    return-object p1
.end method

.method public c(Lcom/wireguard/android/backend/c;)Lcom/wireguard/android/backend/b;
    .locals 14

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/wireguard/android/backend/GoBackend;->o(Landroid/content/Context;)V

    new-instance v0, Lcom/wireguard/android/backend/b;

    invoke-direct {v0}, Lcom/wireguard/android/backend/b;-><init>()V

    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend;->c:Lcom/wireguard/android/backend/c;

    if-ne p1, v1, :cond_9

    iget p1, p0, Lcom/wireguard/android/backend/GoBackend;->d:I

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {p1}, Lcom/wireguard/android/backend/GoBackend;->wgGetConfig(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    const-string v1, "\\n"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v7, p1

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v1, 0x0

    move v11, v1

    move-object v2, v8

    move-wide v3, v9

    move-wide v5, v3

    :goto_0
    if-ge v11, v7, :cond_8

    aget-object v12, p1, v11

    const-string v1, "public_key="

    invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v2, :cond_2

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Lcom/wireguard/android/backend/b;->a(Lcom/wireguard/crypto/b;JJ)V

    :cond_2
    const/16 v1, 0xb

    :try_start_0
    invoke-virtual {v12, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/wireguard/crypto/b;->d(Ljava/lang/String;)Lcom/wireguard/crypto/b;

    move-result-object v2
    :try_end_0
    .catch Lcom/wireguard/crypto/KeyFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-wide v3, v9

    move-wide v5, v3

    goto :goto_2

    :catch_0
    move-object v2, v8

    goto :goto_1

    :cond_3
    const-string v1, "rx_bytes="

    invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/16 v13, 0x9

    if-eqz v1, :cond_5

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    :try_start_1
    invoke-virtual {v12, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-wide v3, v9

    goto :goto_2

    :cond_5
    const-string v1, "tx_bytes="

    invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    :try_start_2
    invoke-virtual {v12, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-wide v5, v9

    :cond_7
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_8
    if-eqz v2, :cond_9

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Lcom/wireguard/android/backend/b;->a(Lcom/wireguard/crypto/b;JJ)V

    :cond_9
    :goto_3
    return-object v0
.end method
