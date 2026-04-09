.class public abstract LYc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYc/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYc/g$a;
    }
.end annotation


# static fields
.field public static final c:LYc/g$a;


# instance fields
.field private final a:Landroid/net/ConnectivityManager;

.field private final b:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYc/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYc/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYc/g;->c:LYc/g$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LYc/g;->a:Landroid/net/ConnectivityManager;

    invoke-direct {p0, p1, p2}, LYc/g;->d(Ljava/lang/String;Landroid/net/NetworkRequest;)Lgg/i;

    move-result-object p1

    iput-object p1, p0, LYc/g;->b:Lgg/i;

    return-void
.end method

.method public static synthetic a(Landroid/net/NetworkRequest;LYc/g;Ljava/lang/String;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LYc/g;->f(Landroid/net/NetworkRequest;LYc/g;Ljava/lang/String;Lgg/j;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, LYc/g;->h(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(LYc/g;LYc/g$b;)V
    .locals 0

    invoke-static {p0, p1}, LYc/g;->g(LYc/g;LYc/g$b;)V

    return-void
.end method

.method private final d(Ljava/lang/String;Landroid/net/NetworkRequest;)Lgg/i;
    .locals 3

    new-instance v0, LYc/d;

    invoke-direct {v0, p2, p0, p1}, LYc/d;-><init>(Landroid/net/NetworkRequest;LYc/g;Ljava/lang/String;)V

    sget-object p2, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v0, p2}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p2

    new-instance v0, LYc/g$c;

    invoke-direct {v0, p1}, LYc/g$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p2

    new-instance v0, LYc/e;

    invoke-direct {v0, p1}, LYc/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p2, v0}, Lgg/i;->g2(Lgg/y;)Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p2, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p2

    sget-object v0, LYc/g$d;->a:LYc/g$d;

    invoke-virtual {p2, v0}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p2, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    new-instance v0, LYc/g$e;

    invoke-direct {v0, p1}, LYc/g$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final f(Landroid/net/NetworkRequest;LYc/g;Ljava/lang/String;Lgg/j;)V
    .locals 1

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYc/g$b;

    invoke-direct {v0, p3, p2}, LYc/g$b;-><init>(Lgg/j;Ljava/lang/String;)V

    new-instance p2, LYc/f;

    invoke-direct {p2, p1, v0}, LYc/f;-><init>(LYc/g;LYc/g$b;)V

    invoke-interface {p3, p2}, Lgg/j;->d(Lkg/e;)V

    if-eqz p0, :cond_0

    iget-object p1, p1, LYc/g;->a:Landroid/net/ConnectivityManager;

    const/16 p2, 0x7d0

    invoke-virtual {p1, p0, v0, p2}, Landroid/net/ConnectivityManager;->requestNetwork(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;I)V

    goto :goto_0

    :cond_0
    iget-object p0, p1, LYc/g;->a:Landroid/net/ConnectivityManager;

    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    new-instance p0, Ll9/a;

    iget-object p1, p1, LYc/g;->a:Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object p1

    invoke-direct {p0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p3, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final g(LYc/g;LYc/g$b;)V
    .locals 2

    :try_start_0
    iget-object p0, p0, LYc/g;->a:Landroid/net/ConnectivityManager;

    invoke-virtual {p0, p1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "Failed to unregister network callback"

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {p1, p0, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final h(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AndroidNetwork "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " - Finished"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, LYc/g;->b:Lgg/i;

    return-object v0
.end method
