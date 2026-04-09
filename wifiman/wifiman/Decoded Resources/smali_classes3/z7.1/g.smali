.class public final Lz7/g;
.super Lu7/a;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;

.field private final c:LA7/d;

.field private final d:Ljava/lang/Integer;

.field private final e:Lz7/x;

.field private final f:Lmh/l;

.field private final g:Z

.field private final h:Lp7/b;

.field private final i:LYg/m;

.field private final j:LYg/m;

.field private final k:Lgg/i;

.field private final l:Lgg/b;

.field private final m:Lgg/i;

.field private final n:Lgg/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;)V
    .locals 1

    const-string/jumbo v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packetParser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "socketFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "resultTtlMs"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "schedulerProvider"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lu7/a;-><init>()V

    .line 4
    iput-object p1, p0, Lz7/g;->a:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lz7/g;->b:Ljava/util/List;

    .line 6
    iput-object p3, p0, Lz7/g;->c:LA7/d;

    .line 7
    iput-object p4, p0, Lz7/g;->d:Ljava/lang/Integer;

    .line 8
    iput-object p5, p0, Lz7/g;->e:Lz7/x;

    .line 9
    iput-object p6, p0, Lz7/g;->f:Lmh/l;

    .line 10
    iput-boolean p7, p0, Lz7/g;->g:Z

    .line 11
    iput-object p8, p0, Lz7/g;->h:Lp7/b;

    .line 12
    new-instance p1, Lz7/g$j;

    invoke-direct {p1, p0}, Lz7/g$j;-><init>(Lz7/g;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lz7/g;->i:LYg/m;

    .line 13
    new-instance p1, Lz7/g$i;

    invoke-direct {p1, p0}, Lz7/g$i;-><init>(Lz7/g;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lz7/g;->j:LYg/m;

    .line 14
    invoke-direct {p0}, Lz7/g;->n()Lgg/i;

    move-result-object p1

    .line 15
    new-instance p2, Lz7/g$e;

    invoke-direct {p2, p0}, Lz7/g$e;-><init>(Lz7/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 16
    new-instance p2, Lz7/g$f;

    invoke-direct {p2, p0}, Lz7/g$f;-><init>(Lz7/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 17
    sget-object p2, Lz7/g$g;->a:Lz7/g$g;

    invoke-virtual {p1, p2}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "socket\n            .swit\u2026 subscribed observer\" } }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lz7/g;->k:Lgg/i;

    .line 18
    invoke-direct {p0}, Lz7/g;->n()Lgg/i;

    move-result-object p1

    .line 19
    new-instance p2, Lz7/g$c;

    invoke-direct {p2, p0}, Lz7/g$c;-><init>(Lz7/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    .line 20
    sget-object p2, Lz7/g$d;->a:Lz7/g$d;

    invoke-virtual {p1, p2}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "socket\n            .swit\u2026 - subscribed sender\" } }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lz7/g;->l:Lgg/b;

    .line 21
    new-instance p2, Lz7/e;

    invoke-direct {p2, p0}, Lz7/e;-><init>(Lz7/g;)V

    .line 22
    sget-object p3, Lgg/a;->LATEST:Lgg/a;

    .line 23
    invoke-static {p2, p3}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p2

    const-string/jumbo p3, "create<Boolean>(\n       \u2026sureStrategy.LATEST\n    )"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lz7/g;->m:Lgg/i;

    .line 24
    new-instance p3, Lz7/g$h;

    invoke-direct {p3, p0}, Lz7/g$h;-><init>(Lz7/g;)V

    invoke-virtual {p2, p3}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p2

    .line 25
    invoke-virtual {p2, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    .line 26
    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    .line 28
    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "acquireMulticastLock\n   \u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lz7/g;->n:Lgg/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v9, v1

    goto :goto_1

    :cond_1
    move/from16 v9, p7

    :goto_1
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_2

    .line 1
    new-instance v0, Lp7/a;

    invoke-direct {v0}, Lp7/a;-><init>()V

    move-object v10, v0

    goto :goto_2

    :cond_2
    move-object/from16 v10, p8

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    .line 2
    invoke-direct/range {v2 .. v10}, Lz7/g;-><init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-static {p0}, Lz7/g;->j(Lkotlin/jvm/internal/N;)V

    return-void
.end method

.method public static synthetic d(Lz7/g;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1}, Lz7/g;->i(Lz7/g;Lgg/j;)V

    return-void
.end method

.method public static final synthetic e(Lz7/g;)LA7/d;
    .locals 0

    iget-object p0, p0, Lz7/g;->c:LA7/d;

    return-object p0
.end method

.method public static final synthetic f(Lz7/g;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lz7/g;->k:Lgg/i;

    return-object p0
.end method

.method public static final synthetic g(Lz7/g;)Lp7/b;
    .locals 0

    iget-object p0, p0, Lz7/g;->h:Lp7/b;

    return-object p0
.end method

.method public static final synthetic h(Lz7/g;)Lz7/w;
    .locals 0

    invoke-direct {p0}, Lz7/g;->l()Lz7/w;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lz7/g;Lgg/j;)V
    .locals 4

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    iget-boolean v1, p0, Lz7/g;->g:Z

    if-eqz v1, :cond_0

    :try_start_0
    invoke-direct {p0}, Lz7/g;->m()Lo7/b;

    move-result-object v1

    invoke-interface {v1}, Lo7/b;->c()Landroid/net/wifi/WifiManager;

    move-result-object v1

    sget-object v2, Lo7/o;->a:Lo7/o;

    invoke-virtual {v2}, Lo7/o;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/net/wifi/WifiManager$MulticastLock;->setReferenceCounted(Z)V

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    sget-object v1, Lz7/g$a;->a:Lz7/g$a;

    invoke-static {v1}, Lx7/a;->c(Lmh/a;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v1}, Lgg/h;->h(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-interface {p1, p0}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    goto :goto_0

    :catch_0
    new-instance v1, Ljava/lang/IllegalStateException;

    iget-object p0, p0, Lz7/g;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Insufficient permissions to acquire Multicast lock. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " Discovery Server needs to set Multicast to work reliably. Make sure you specified \'android.permission.CHANGE_WIFI_MULTICAST_STATE\' permission in app manifest."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lgg/j;->c(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    :goto_0
    new-instance p0, Lz7/f;

    invoke-direct {p0, v0}, Lz7/f;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-interface {p1, p0}, Lgg/j;->d(Lkg/e;)V

    return-void
.end method

.method private static final j(Lkotlin/jvm/internal/N;)V
    .locals 1

    const-string v0, "$multicastLock"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    :cond_0
    sget-object p0, Lz7/g$b;->a:Lz7/g$b;

    invoke-static {p0}, Lx7/a;->c(Lmh/a;)V

    return-void
.end method

.method private final l()Lz7/w;
    .locals 1

    iget-object v0, p0, Lz7/g;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz7/w;

    return-object v0
.end method

.method private final m()Lo7/b;
    .locals 1

    sget-object v0, Lo7/o;->a:Lo7/o;

    invoke-virtual {v0}, Lo7/o;->c()Lo7/b;

    move-result-object v0

    return-object v0
.end method

.method private final n()Lgg/i;
    .locals 1

    iget-object v0, p0, Lz7/g;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/i;

    return-object v0
.end method


# virtual methods
.method public a()Lmh/l;
    .locals 1

    iget-object v0, p0, Lz7/g;->f:Lmh/l;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lz7/g;->n:Lgg/i;

    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lz7/g;->b:Ljava/util/List;

    return-object v0
.end method

.method public final o()Lz7/x;
    .locals 1

    iget-object v0, p0, Lz7/g;->e:Lz7/x;

    return-object v0
.end method

.method public final p()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lz7/g;->d:Ljava/lang/Integer;

    return-object v0
.end method
