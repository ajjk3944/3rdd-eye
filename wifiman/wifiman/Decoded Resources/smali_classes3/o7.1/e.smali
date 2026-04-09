.class public final Lo7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/b;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lo7/q;

.field private final d:LYg/m;

.field private final e:LYg/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo7/q;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "systemInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/e;->b:Landroid/content/Context;

    iput-object p2, p0, Lo7/e;->c:Lo7/q;

    new-instance p1, Lo7/e$a;

    invoke-direct {p1, p0}, Lo7/e$a;-><init>(Lo7/e;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lo7/e;->d:LYg/m;

    new-instance p1, Lo7/e$c;

    invoke-direct {p1, p0}, Lo7/e$c;-><init>(Lo7/e;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lo7/e;->e:LYg/m;

    return-void
.end method

.method public static synthetic d(Lo7/e;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lo7/e;->i(Lo7/e;Lgg/j;)V

    return-void
.end method

.method public static synthetic e(Lo7/e;Lo7/e$b;)V
    .locals 0

    invoke-static {p0, p1}, Lo7/e;->j(Lo7/e;Lo7/e$b;)V

    return-void
.end method

.method public static final synthetic f(Lo7/e;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lo7/e;->b:Landroid/content/Context;

    return-object p0
.end method

.method private final g()Z
    .locals 2

    iget-object v0, p0, Lo7/e;->c:Lo7/q;

    invoke-interface {v0}, Lo7/q;->c()I

    move-result v0

    const/16 v1, 0x16

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lo7/e;->h()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final h()Z
    .locals 3

    iget-object v0, p0, Lo7/e;->c:Lo7/q;

    invoke-interface {v0}, Lo7/q;->c()I

    move-result v0

    const/16 v1, 0x17

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lo7/e;->c:Lo7/q;

    invoke-interface {v0}, Lo7/q;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "6.0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo7/e;->c:Lo7/q;

    invoke-interface {v0}, Lo7/q;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method private static final i(Lo7/e;Lgg/j;)V
    .locals 3

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lo7/e;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lo7/e$b;

    invoke-direct {v0, p1}, Lo7/e$b;-><init>(Lgg/j;)V

    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v1

    invoke-virtual {p0}, Lo7/e;->b()Landroid/net/ConnectivityManager;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    new-instance v1, Lo7/d;

    invoke-direct {v1, p0, v0}, Lo7/d;-><init>(Lo7/e;Lo7/e$b;)V

    invoke-interface {p1, v1}, Lgg/j;->d(Lkg/e;)V

    goto :goto_0

    :cond_0
    sget-object p0, Lo7/a$c;->a:Lo7/a$c;

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    invoke-interface {p1}, Lgg/h;->a()V

    :goto_0
    return-void
.end method

.method private static final j(Lo7/e;Lo7/e$b;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo7/e;->b()Landroid/net/ConnectivityManager;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 2

    new-instance v0, Lo7/c;

    invoke-direct {v0, p0}, Lo7/c;-><init>(Lo7/e;)V

    sget-object v1, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v0, v1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "create<AndroidNetwork>({\u2026kpressureStrategy.LATEST)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Landroid/net/ConnectivityManager;
    .locals 1

    iget-object v0, p0, Lo7/e;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method public c()Landroid/net/wifi/WifiManager;
    .locals 1

    iget-object v0, p0, Lo7/e;->e:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    return-object v0
.end method
