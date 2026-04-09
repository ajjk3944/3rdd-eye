.class public final LZc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZc/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZc/g$a;,
        LZc/g$b;
    }
.end annotation


# static fields
.field public static final e:LZc/g$a;


# instance fields
.field private final a:Landroid/net/ConnectivityManager;

.field private final b:Lcom/ui/wifiman/model/support/a;

.field private final c:Lgg/i;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZc/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZc/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LZc/g;->e:LZc/g$a;

    return-void
.end method

.method public constructor <init>(Landroid/net/ConnectivityManager;Ltc/a;Lcom/ui/wifiman/model/support/a;)V
    .locals 4

    const-string v0, "connectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidSystemReceiverFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportFileDataCollector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZc/g;->a:Landroid/net/ConnectivityManager;

    iput-object p3, p0, LZc/g;->b:Lcom/ui/wifiman/model/support/a;

    new-instance p1, Landroid/content/IntentFilter;

    const-string p3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {p1, p3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ltc/a;->a(Landroid/content/IntentFilter;)Lgg/i;

    move-result-object p1

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x7d0

    invoke-static {v0, v1, v2, v3, p2}, Lgg/i;->F0(JJLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p3

    filled-new-array {p1, p3}, [Lgg/i;

    move-result-object p1

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lgg/i;->S0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p1

    const-wide/16 v0, 0x1f4

    invoke-virtual {p1, v0, v1, p2}, Lgg/i;->U1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance p2, LZc/g$c;

    invoke-direct {p2, p0}, LZc/g$c;-><init>(LZc/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, LZc/g$d;

    invoke-direct {p2, p0}, LZc/g$d;-><init>(LZc/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string p2, "subscribeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZc/g;->c:Lgg/i;

    iput-object p1, p0, LZc/g;->d:Lgg/i;

    return-void
.end method

.method public static final synthetic a(LZc/g;)Lcom/ui/wifiman/model/support/a;
    .locals 0

    iget-object p0, p0, LZc/g;->b:Lcom/ui/wifiman/model/support/a;

    return-object p0
.end method

.method public static final synthetic b(LZc/g;Landroid/net/Network;)LZc/e;
    .locals 0

    invoke-direct {p0, p1}, LZc/g;->g(Landroid/net/Network;)LZc/e;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/net/InterfaceAddress;Z)Ljava/lang/Integer;
    .locals 2

    invoke-virtual {p1}, Ljava/net/InterfaceAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v1, v0, Ljava/net/Inet4Address;

    if-eqz v1, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/net/InterfaceAddress;->getNetworkPrefixLength()S

    move-result p2

    const/16 v0, 0x20

    if-ne p2, v0, :cond_0

    const/16 p1, 0x18

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/net/InterfaceAddress;->getNetworkPrefixLength()S

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of p2, v0, Ljava/net/Inet6Address;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljava/net/InterfaceAddress;->getNetworkPrefixLength()S

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method private final d(Landroid/net/LinkProperties;Ljava/net/InetAddress;)Linet/ipaddr/g;
    .locals 2

    invoke-virtual {p1}, Landroid/net/LinkProperties;->getRoutes()Ljava/util/List;

    move-result-object p1

    const-string v0, "getRoutes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catch_0
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/RouteInfo;

    invoke-virtual {v0}, Landroid/net/RouteInfo;->getGateway()Ljava/net/InetAddress;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v1}, LZc/g;->h(Ljava/net/InetAddress;)Ljava/net/InetAddress;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v0, p2}, Landroid/net/RouteInfo;->matches(Ljava/net/InetAddress;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final g(Landroid/net/Network;)LZc/e;
    .locals 14

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, LZc/g;->a:Landroid/net/ConnectivityManager;

    invoke-virtual {v1, p1}, Landroid/net/ConnectivityManager;->getNetworkInfo(Landroid/net/Network;)Landroid/net/NetworkInfo;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getDetailedState()Landroid/net/NetworkInfo$DetailedState;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {p0, v1}, LZc/g;->i(Landroid/net/NetworkInfo$DetailedState;)LZc/e$b;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v3, v1

    goto :goto_3

    :cond_2
    :goto_2
    sget-object v1, LZc/e$b;->DISCONNECTED:LZc/e$b;

    goto :goto_1

    :goto_3
    if-eqz p1, :cond_3

    iget-object v1, p0, LZc/g;->a:Landroid/net/ConnectivityManager;

    invoke-virtual {v1, p1}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    move-result-object v1

    goto :goto_4

    :cond_3
    move-object v1, v0

    :goto_4
    if-eqz p1, :cond_4

    :try_start_0
    iget-object v2, p0, LZc/g;->a:Landroid/net/ConnectivityManager;

    invoke-virtual {v2, p1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    :cond_4
    move-object p1, v0

    :goto_5
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/net/LinkProperties;->getInterfaceName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    :try_start_1
    invoke-static {v2}, Ljava/net/NetworkInterface;->getByName(Ljava/lang/String;)Ljava/net/NetworkInterface;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    :cond_5
    move-object v2, v0

    :goto_6
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, LZc/e$b;->CONNECTED:LZc/e$b;

    if-ne v3, v5, :cond_7

    if-eqz p1, :cond_6

    invoke-virtual {p0, p1}, LZc/g;->f(Landroid/net/NetworkCapabilities;)Lb8/c;

    move-result-object v5

    if-nez v5, :cond_8

    :cond_6
    sget-object v5, Lb8/c;->UNKNOWN:Lb8/c;

    goto :goto_7

    :cond_7
    sget-object v5, Lb8/c;->DISCONNECTED:Lb8/c;

    :cond_8
    :goto_7
    const/4 v6, 0x0

    if-eqz p1, :cond_9

    const/4 v7, 0x4

    invoke-virtual {p1, v7}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v7

    move v9, v7

    goto :goto_8

    :cond_9
    move v9, v6

    :goto_8
    const/4 v7, 0x1

    if-eqz p1, :cond_a

    const/16 v8, 0xb

    invoke-virtual {p1, v8}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p1

    if-ne p1, v7, :cond_a

    move v6, v7

    :cond_a
    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getInterfaceAddresses()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_d

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/net/InterfaceAddress;

    invoke-virtual {v8}, Ljava/net/InterfaceAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v10

    const-string v11, "getAddress(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v10}, LZc/g;->h(Ljava/net/InetAddress;)Ljava/net/InetAddress;

    move-result-object v10

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v8, v9}, LZc/g;->c(Ljava/net/InterfaceAddress;Z)Ljava/lang/Integer;

    move-result-object v8

    if-eqz v10, :cond_b

    if-eqz v8, :cond_b

    invoke-static {v10}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v11

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-direct {p0, v1, v10}, LZc/g;->d(Landroid/net/LinkProperties;Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v12

    if-eqz v12, :cond_c

    invoke-static {v12, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_a

    :cond_c
    move-object v12, v0

    :goto_a
    new-instance v10, LZc/e$a;

    invoke-direct {v10, v11, v8, v12}, LZc/e$a;-><init>(Linet/ipaddr/g;ILinet/ipaddr/g;)V

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_d
    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_b

    :cond_e
    move-object p1, v0

    :goto_b
    if-eqz v2, :cond_f

    :try_start_2
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getHardwareAddress()[B

    move-result-object v8

    if-eqz v8, :cond_f

    sget-object v10, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v10, v8}, Lh9/a$b;->d([B)Lh9/a;

    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_c

    :catchall_0
    const-string v8, "Cannot obtain HW address for connected network interface"

    const/4 v10, 0x6

    invoke-static {v8, v0, v0, v10, v0}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_f
    move-object v8, v0

    :goto_c
    if-eqz v2, :cond_10

    if-nez v8, :cond_10

    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "HW Address of connected network interface ["

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] not available"

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x2

    invoke-static {v2, v0, v10, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_10
    sget-object v2, LYg/J;->a:LYg/J;

    const/16 v2, 0xa

    invoke-static {v4, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-static {v10}, LZg/U;->d(I)I

    move-result v10

    const/16 v11, 0x10

    invoke-static {v10, v11}, Lsh/m;->d(II)I

    move-result v10

    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11, v10}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, LZc/e$a;

    invoke-virtual {v12}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object v12

    invoke-virtual {v12}, Linet/ipaddr/g;->n0()Linet/ipaddr/g$a;

    move-result-object v12

    const-string v13, "getIPVersion(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_d

    :cond_11
    if-eqz v1, :cond_17

    invoke-virtual {v1}, Landroid/net/LinkProperties;->getDnsServers()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_17

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v2}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_13
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Linet/ipaddr/g;

    invoke-virtual {v12}, Linet/ipaddr/g;->g1()Z

    move-result v12

    if-nez v12, :cond_13

    invoke-interface {v1, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_15

    move-object v0, v1

    :cond_15
    if-nez v0, :cond_16

    goto :goto_10

    :cond_16
    move-object v4, v0

    :goto_10
    move-object v0, v4

    goto :goto_11

    :cond_17
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_11
    xor-int/lit8 v10, v6, 0x1

    new-instance v1, LZc/e;

    move-object v2, v1

    move-object v4, v5

    move-object v5, p1

    move-object v6, v8

    move-object v7, v11

    move-object v8, v0

    invoke-direct/range {v2 .. v10}, LZc/e;-><init>(LZc/e$b;Lb8/c;Ljava/lang/String;Lh9/a;Ljava/util/Map;Ljava/util/List;ZZ)V

    return-object v1
.end method

.method private final h(Ljava/net/InetAddress;)Ljava/net/InetAddress;
    .locals 4

    invoke-virtual {p1}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    const-string v1, "getAddress(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-byte v3, v0, v2

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final i(Landroid/net/NetworkInfo$DetailedState;)LZc/e$b;
    .locals 1

    sget-object v0, LZc/g$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    sget-object p1, LZc/e$b;->DISCONNECTED:LZc/e$b;

    goto :goto_0

    :cond_0
    sget-object p1, LZc/e$b;->CONNECTED:LZc/e$b;

    goto :goto_0

    :cond_1
    sget-object p1, LZc/e$b;->OBTAINING_IP:LZc/e$b;

    goto :goto_0

    :cond_2
    sget-object p1, LZc/e$b;->AUTHENTICATING:LZc/e$b;

    goto :goto_0

    :cond_3
    sget-object p1, LZc/e$b;->CONNECTING:LZc/e$b;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final e()Landroid/net/ConnectivityManager;
    .locals 1

    iget-object v0, p0, LZc/g;->a:Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method public final f(Landroid/net/NetworkCapabilities;)Lb8/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lb8/c;->WIFI:Lb8/c;

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lb8/c;->MOBILE:Lb8/c;

    return-object p1

    :cond_1
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lb8/c;->ETHERNET:Lb8/c;

    return-object p1

    :cond_2
    sget-object p1, Lb8/c;->UNKNOWN:Lb8/c;

    return-object p1
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, LZc/g;->d:Lgg/i;

    return-object v0
.end method
