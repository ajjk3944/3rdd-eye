.class public final LUc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUc/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUc/i$a;,
        LUc/i$b;,
        LUc/i$c;
    }
.end annotation


# static fields
.field public static final e:LUc/i$a;


# instance fields
.field private final a:Landroid/net/wifi/WifiManager;

.field private final b:Lcom/ui/wifiman/model/vendor/d$b;

.field private final c:Lgg/z;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LUc/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LUc/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LUc/i;->e:LUc/i$a;

    return-void
.end method

.method public constructor <init>(Landroid/net/wifi/WifiManager;Lcom/ui/wifiman/model/vendor/d$b;)V
    .locals 1

    const-string v0, "wifiManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vendorManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUc/i;->a:Landroid/net/wifi/WifiManager;

    iput-object p2, p0, LUc/i;->b:Lcom/ui/wifiman/model/vendor/d$b;

    new-instance p1, LUc/i$q;

    invoke-direct {p1}, LUc/i$q;-><init>()V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    const-string p2, "cache(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUc/i;->c:Lgg/z;

    invoke-direct {p0}, LUc/i;->j()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->U()Lgg/i;

    move-result-object p1

    new-instance p2, LUc/i$o;

    invoke-direct {p2, p0}, LUc/i$o;-><init>(LUc/i;)V

    invoke-virtual {p1, p2}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "flatMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LUc/i;->i(Lgg/i;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUc/i;->d:Lgg/i;

    return-void
.end method

.method public static synthetic c(LUc/i;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, LUc/i;->k(LUc/i;Lgg/j;)V

    return-void
.end method

.method public static synthetic d()V
    .locals 0

    invoke-static {}, LUc/i;->m()V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-static {p0, p1, p2}, LUc/i;->l(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    return-void
.end method

.method public static final synthetic f(LUc/i;LUc/i$c;J)Lgg/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LUc/i;->n(LUc/i$c;J)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LUc/i;LUc/a;)LCc/b;
    .locals 0

    invoke-direct {p0, p1}, LUc/i;->o(LUc/a;)LCc/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LUc/i;)Lcom/ui/wifiman/model/vendor/d$b;
    .locals 0

    iget-object p0, p0, LUc/i;->b:Lcom/ui/wifiman/model/vendor/d$b;

    return-object p0
.end method

.method private final i(Lgg/i;)Lgg/i;
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, LUc/i$d;->a:LUc/i$d;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object v0, LUc/i$e;->a:LUc/i$e;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final j()Lgg/i;
    .locals 3

    new-instance v0, LUc/h;

    invoke-direct {v0, p0}, LUc/h;-><init>(LUc/i;)V

    sget-object v1, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v0, v1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v0

    sget-object v1, Lm9/c;->a:Lm9/c;

    const-string v2, "UPNPDiscoveryReceive"

    invoke-virtual {v1, v2}, Lm9/c;->h(Ljava/lang/String;)Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v0

    sget-object v1, LUc/i$j;->a:LUc/i$j;

    invoke-virtual {v0, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v0

    sget-object v1, LUc/i$k;->a:LUc/i$k;

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    sget-object v1, LUc/i$l;->a:LUc/i$l;

    invoke-virtual {v0, v1}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, LUc/i$m;->a:LUc/i$m;

    invoke-virtual {v0, v1}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object v0

    const-string v1, "repeatWhen(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final k(LUc/i;Lgg/j;)V
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v3, LUc/f;

    invoke-direct {v3, v2, v1, v0}, LUc/f;-><init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    invoke-interface {p1, v3}, Lgg/j;->d(Lkg/e;)V

    :try_start_0
    iget-object p0, p0, LUc/i;->a:Landroid/net/wifi/WifiManager;

    const-string v3, "UPNP"

    invoke-virtual {p0, v3}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    move-result-object p0

    iput-object p0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string p0, "UPNP Multicast lock acquire error"

    const/4 v0, 0x6

    const/4 v3, 0x0

    invoke-static {p0, v3, v3, v0, v3}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    :try_start_1
    new-instance p0, Ljava/net/DatagramSocket;

    invoke-direct {p0}, Ljava/net/DatagramSocket;-><init>()V

    iput-object p0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    new-instance p0, LUc/i$n;

    invoke-direct {p0, v1}, LUc/i$n;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {p0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p0

    const-string v3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LUc/i$f;->a:LUc/i$f;

    invoke-virtual {p0, v3}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p0

    sget-object v3, Lm9/c;->a:Lm9/c;

    const-string v4, "UPNPDiscoverySend"

    invoke-virtual {v3, v4}, Lm9/c;->h(Ljava/lang/String;)Lgg/y;

    move-result-object v3

    invoke-virtual {p0, v3}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p0

    sget-object v3, LUc/i$g;->a:LUc/i$g;

    invoke-virtual {p0, v3}, Lgg/b;->Q(Lkg/n;)Lgg/b;

    move-result-object p0

    sget-object v3, LUc/i$h;->a:LUc/i$h;

    invoke-virtual {p0, v3}, Lgg/b;->P(Lkg/n;)Lgg/b;

    move-result-object p0

    new-instance v3, LUc/g;

    invoke-direct {v3}, LUc/g;-><init>()V

    sget-object v4, LUc/i$i;->a:LUc/i$i;

    invoke-virtual {p0, v3, v4}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object p0

    iput-object p0, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const/16 p0, 0x400

    new-array v3, p0, [B

    :cond_0
    :goto_1
    new-instance v4, Ljava/net/DatagramPacket;

    invoke-direct {v4, v3, p0}, Ljava/net/DatagramPacket;-><init>([BI)V

    iget-object v5, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v5, Ljava/net/DatagramSocket;

    invoke-virtual {v5, v4}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    invoke-virtual {v4}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v5

    const-string v6, "getData(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/DatagramPacket;->getLength()I

    move-result v6

    new-instance v7, Ljava/lang/String;

    sget-object v8, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    const/4 v9, 0x0

    invoke-direct {v7, v5, v9, v6, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string v5, "HTTP/1.1 200"

    invoke-static {v7, v5, v0}, Lkotlin/text/t;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v5, LUc/i$c;

    invoke-virtual {v4}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v4

    const-string v6, "getAddress(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v4

    invoke-direct {v5, v4, v7}, LUc/i$c;-><init>(Linet/ipaddr/g;Ljava/lang/String;)V

    invoke-interface {p1, v5}, Lgg/h;->h(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    iget-object p1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p1, Ljava/net/DatagramSocket;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/net/DatagramSocket;->close()V

    :cond_1
    iget-object p1, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p1, Lhg/c;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_2
    throw p0
.end method

.method private static final l(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V
    .locals 1

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Lhg/c;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lhg/c;->dispose()V

    :cond_0
    :try_start_0
    iget-object p0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Ljava/net/DatagramSocket;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/net/DatagramSocket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    iget-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_2

    :try_start_1
    iget-object p0, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    const-string p1, "UPNP error"

    const/4 p2, 0x4

    const/4 v0, 0x0

    invoke-static {p1, p0, v0, p2, v0}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private static final m()V
    .locals 0

    return-void
.end method

.method private final n(LUc/i$c;J)Lgg/i;
    .locals 2

    invoke-virtual {p1}, LUc/i$c;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LUc/i;->c:Lgg/z;

    new-instance v1, LUc/i$p;

    invoke-direct {v1, p1, p0, p2, p3}, LUc/i$p;-><init>(LUc/i$c;LUc/i;J)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    const-string p2, "empty(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method private final o(LUc/a;)LCc/b;
    .locals 3

    invoke-interface {p1}, LUc/a;->getType()LUc/b;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    invoke-virtual {p1}, LUc/b;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "schemas-upnp-org"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_9

    invoke-virtual {p1}, LUc/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v1, "SensorManagement"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object v0, LCc/b$e$b;->b:LCc/b$e$b;

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "Printer"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, LCc/b$j;->b:LCc/b$j;

    goto :goto_1

    :sswitch_2
    const-string v1, "InternetGatewayDevice"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, LCc/b$g$b;->b:LCc/b$g$b;

    goto :goto_1

    :sswitch_3
    const-string v1, "DigitalSecurityCamera"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    sget-object v0, LCc/b$c;->b:LCc/b$c;

    goto :goto_1

    :sswitch_4
    const-string v1, "TelephonyClient"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    sget-object v0, LCc/b$i;->b:LCc/b$i;

    goto :goto_1

    :sswitch_5
    const-string v1, "BinaryLight"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :sswitch_6
    const-string v1, "DimmableLight"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    sget-object v0, LCc/b$e$a;->b:LCc/b$e$a;

    goto :goto_1

    :sswitch_7
    const-string v1, "Scanner"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    sget-object v0, LCc/b$k;->b:LCc/b$k;

    goto :goto_1

    :sswitch_8
    const-string v1, "WLANAccessPointDevice"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    sget-object v0, LCc/b$g$a;->b:LCc/b$g$a;

    :cond_9
    :goto_1
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x526f95a0 -> :sswitch_8
        -0x2ae07222 -> :sswitch_7
        -0x20b43389 -> :sswitch_6
        0x8303975 -> :sswitch_5
        0x877d9e3 -> :sswitch_4
        0x2585369d -> :sswitch_3
        0x2e51d7d9 -> :sswitch_2
        0x50765ffa -> :sswitch_1
        0x776b0bbd -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LUc/i;->d:Lgg/i;

    return-object v0
.end method
