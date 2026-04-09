.class public LH4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf5/a;

.field private volatile b:LJ4/a;

.field private volatile c:LK4/b;

.field private final d:Ljava/util/List;


# direct methods
.method public constructor <init>(Lf5/a;)V
    .locals 2

    .line 1
    new-instance v0, LK4/c;

    invoke-direct {v0}, LK4/c;-><init>()V

    new-instance v1, LJ4/f;

    invoke-direct {v1}, LJ4/f;-><init>()V

    invoke-direct {p0, p1, v0, v1}, LH4/d;-><init>(Lf5/a;LK4/b;LJ4/a;)V

    return-void
.end method

.method public constructor <init>(Lf5/a;LK4/b;LJ4/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LH4/d;->a:Lf5/a;

    .line 4
    iput-object p2, p0, LH4/d;->c:LK4/b;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LH4/d;->d:Ljava/util/List;

    .line 6
    iput-object p3, p0, LH4/d;->b:LJ4/a;

    .line 7
    invoke-direct {p0}, LH4/d;->f()V

    return-void
.end method

.method public static synthetic a(LH4/d;Lf5/b;)V
    .locals 0

    invoke-direct {p0, p1}, LH4/d;->i(Lf5/b;)V

    return-void
.end method

.method public static synthetic b(LH4/d;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LH4/d;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(LH4/d;LK4/a;)V
    .locals 0

    invoke-direct {p0, p1}, LH4/d;->h(LK4/a;)V

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, LH4/d;->a:Lf5/a;

    new-instance v1, LH4/c;

    invoke-direct {v1, p0}, LH4/c;-><init>(LH4/d;)V

    invoke-interface {v0, v1}, Lf5/a;->a(Lf5/a$a;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LH4/d;->b:LJ4/a;

    invoke-interface {v0, p1, p2}, LJ4/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private synthetic h(LK4/a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LH4/d;->c:LK4/b;

    instance-of v0, v0, LK4/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, LH4/d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, LH4/d;->c:LK4/b;

    invoke-interface {v0, p1}, LK4/b;->a(LK4/a;)V

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic i(Lf5/b;)V
    .locals 5

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "AnalyticsConnector now available."

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD4/a;

    new-instance v0, LJ4/e;

    invoke-direct {v0, p1}, LJ4/e;-><init>(LD4/a;)V

    new-instance v1, LH4/e;

    invoke-direct {v1}, LH4/e;-><init>()V

    invoke-static {p1, v1}, LH4/d;->j(LD4/a;LH4/e;)LD4/a$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string/jumbo v2, "Registered Firebase Analytics listener."

    invoke-virtual {p1, v2}, LI4/g;->b(Ljava/lang/String;)V

    new-instance p1, LJ4/d;

    invoke-direct {p1}, LJ4/d;-><init>()V

    new-instance v2, LJ4/c;

    const/16 v3, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v0, v3, v4}, LJ4/c;-><init>(LJ4/e;ILjava/util/concurrent/TimeUnit;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LH4/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LK4/a;

    invoke-virtual {p1, v3}, LJ4/d;->a(LK4/a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p1}, LH4/e;->d(LJ4/b;)V

    invoke-virtual {v1, v2}, LH4/e;->e(LJ4/b;)V

    iput-object p1, p0, LH4/d;->c:LK4/b;

    iput-object v2, p0, LH4/d;->b:LJ4/a;

    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string v0, "Could not register Firebase Analytics listener; a listener is already registered."

    invoke-virtual {p1, v0}, LI4/g;->k(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method private static j(LD4/a;LH4/e;)LD4/a$a;
    .locals 2

    const-string/jumbo v0, "clx"

    invoke-interface {p0, v0, p1}, LD4/a;->b(Ljava/lang/String;LD4/a$b;)LD4/a$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    const-string/jumbo v0, "crash"

    invoke-interface {p0, v0, p1}, LD4/a;->b(Ljava/lang/String;LD4/a$b;)LD4/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p0

    const-string p1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    invoke-virtual {p0, p1}, LI4/g;->k(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public d()LJ4/a;
    .locals 1

    new-instance v0, LH4/b;

    invoke-direct {v0, p0}, LH4/b;-><init>(LH4/d;)V

    return-object v0
.end method

.method public e()LK4/b;
    .locals 1

    new-instance v0, LH4/a;

    invoke-direct {v0, p0}, LH4/a;-><init>(LH4/d;)V

    return-object v0
.end method
