.class public final Lje/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/B$a;
    }
.end annotation


# static fields
.field public static final g:Lje/B$a;


# instance fields
.field private final a:Landroid/net/wifi/WifiManager;

.field private final b:Lje/a;

.field private final c:LT7/a;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lje/B$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lje/B$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lje/B;->g:Lje/B$a;

    return-void
.end method

.method public constructor <init>(Landroid/net/wifi/WifiManager;Lje/a;LT7/a;Lfe/u;)V
    .locals 7

    const-string v0, "wifiManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiInfoParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkVersion"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    iput-object p2, p0, Lje/B;->b:Lje/a;

    iput-object p3, p0, Lje/B;->c:LT7/a;

    new-instance p1, Lje/z;

    invoke-direct {p1, p0}, Lje/z;-><init>(Lje/B;)V

    sget-object p2, Lgg/a;->LATEST:Lgg/a;

    invoke-static {p1, p2}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-interface {p4}, Lfe/u;->a()Lgg/y;

    move-result-object p3

    invoke-virtual {p1, p3}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lje/B;->d:Lgg/i;

    new-instance p1, Lje/A;

    invoke-direct {p1, p0}, Lje/A;-><init>(Lje/B;)V

    invoke-static {p1, p2}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-interface {p4}, Lfe/u;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lje/B;->e:Lgg/i;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p4}, Lfe/u;->a()Lgg/y;

    move-result-object v6

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0xc8

    invoke-static/range {v1 .. v6}, Lgg/i;->G0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-interface {p4}, Lfe/u;->a()Lgg/y;

    move-result-object p2

    const/4 p4, 0x0

    invoke-virtual {p1, p2, p4, p3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance p2, Lje/B$b;

    invoke-direct {p2, p0}, Lje/B$b;-><init>(Lje/B;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lje/B;->f:Lgg/i;

    return-void
.end method

.method public static synthetic b(Lje/B;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lje/B;->i(Lje/B;Lgg/j;)V

    return-void
.end method

.method public static synthetic c(Lje/B;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lje/B;->j(Lje/B;Lgg/j;)V

    return-void
.end method

.method public static final synthetic d(Lje/B;)Lje/r;
    .locals 0

    invoke-direct {p0}, Lje/B;->h()Lje/r;

    move-result-object p0

    return-object p0
.end method

.method private final h()Lje/r;
    .locals 3

    iget-object v0, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lje/B;->b:Lje/a;

    iget-object v1, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    const-string v2, "getConnectionInfo(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lje/a;->a(Landroid/net/wifi/WifiInfo;)Lje/r$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lje/r$a;->a:Lje/r$a;

    :goto_0
    return-object v0
.end method

.method private static final i(Lje/B;Lgg/j;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, LS8/c;->GHZ_5:LS8/c;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lje/B;->c:LT7/a;

    const/16 v2, 0x1e

    invoke-virtual {v1, v2}, LT7/a;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p0, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    invoke-static {p0}, Lje/x;->a(Landroid/net/wifi/WifiManager;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, LS8/c;->GHZ_6:LS8/c;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Lje/B;Lgg/j;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lje/B;->c:LT7/a;

    const/16 v2, 0x1e

    invoke-virtual {v1, v2}, LT7/a;->b(I)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lje/y;->a(Landroid/net/wifi/WifiManager;I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LS8/a;->A:LS8/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, LS8/a;->B:LS8/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, LS8/a;->G:LS8/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lje/y;->a(Landroid/net/wifi/WifiManager;I)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, LS8/a;->N:LS8/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    const/4 v2, 0x5

    invoke-static {v1, v2}, Lje/y;->a(Landroid/net/wifi/WifiManager;I)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, LS8/a;->AC:LS8/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lje/y;->a(Landroid/net/wifi/WifiManager;I)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, LS8/a;->AX:LS8/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object p0, p0, Lje/B;->a:Landroid/net/wifi/WifiManager;

    const/16 v1, 0x8

    invoke-static {p0, v1}, Lje/y;->a(Landroid/net/wifi/WifiManager;I)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, LS8/a;->BE:LS8/a;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lje/B;->f:Lgg/i;

    return-object v0
.end method

.method public final e(LS8/j;LS8/j;)LS8/j;
    .locals 1

    const-string v0, "securityFromWifiInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "securityFromWifiScan"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lje/B;->b:Lje/a;

    invoke-interface {v0, p1, p2}, Lje/a;->b(LS8/j;LS8/j;)LS8/j;

    move-result-object p1

    return-object p1
.end method

.method public f()Lgg/i;
    .locals 1

    iget-object v0, p0, Lje/B;->d:Lgg/i;

    return-object v0
.end method

.method public g()Lgg/i;
    .locals 1

    iget-object v0, p0, Lje/B;->e:Lgg/i;

    return-object v0
.end method
