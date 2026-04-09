.class public final Ljb/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LGb/f;

.field private final b:LFb/a;

.field private final c:Lsb/a;

.field private final d:Ljb/n;

.field private e:Llb/b;

.field private f:Lgg/z;


# direct methods
.method public constructor <init>(Lcb/a;Llb/o;Ljava/lang/String;Ljava/lang/String;LGb/f;Lwb/a;LCb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    const-string/jumbo v5, "environment"

    move-object/from16 v6, p1

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "unifiCloudAccess"

    move-object/from16 v7, p2

    invoke-static {v7, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "clientAppName"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "clientAppVersion"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "storage"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "trustedDeviceHelper"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "httpLogLevel"

    move-object/from16 v15, p8

    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v3, v0, Ljb/g;->a:LGb/f;

    new-instance v5, LFb/a;

    new-instance v8, Ljb/e;

    invoke-direct {v8, v0}, Ljb/e;-><init>(Ljb/g;)V

    const/4 v9, 0x1

    invoke-direct {v5, v9, v8}, LFb/a;-><init>(ILmh/a;)V

    iput-object v5, v0, Ljb/g;->b:LFb/a;

    new-instance v5, Lsb/a;

    invoke-direct {v5}, Lsb/a;-><init>()V

    iput-object v5, v0, Ljb/g;->c:Lsb/a;

    new-instance v18, Lwb/d;

    invoke-virtual/range {p2 .. p2}, Llb/o;->a()Llb/e;

    move-result-object v7

    invoke-virtual {v7}, Llb/e;->a()Ljava/lang/String;

    move-result-object v7

    new-instance v8, LDb/a;

    invoke-virtual/range {p1 .. p1}, Lcb/a;->getSsoConfig()LAb/h;

    move-result-object v6

    invoke-direct {v8, v6, v3}, LDb/a;-><init>(LAb/h;LGb/f;)V

    new-instance v3, Lzb/b;

    invoke-direct {v3, v1, v2}, Lzb/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, LDb/d;

    invoke-direct {v1, v4}, LDb/d;-><init>(LCb/a;)V

    const/4 v2, 0x4

    new-array v2, v2, [Lokhttp3/Interceptor;

    const/4 v4, 0x0

    aput-object v5, v2, v4

    aput-object v8, v2, v9

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v3, 0x3

    aput-object v1, v2, v3

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    sget-object v1, Lub/c;->a:Lub/c;

    invoke-virtual {v1}, Lub/c;->d()Laj/b;

    move-result-object v13

    const/16 v16, 0x3a

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v6, v18

    move-object/from16 v14, p6

    invoke-direct/range {v6 .. v17}, Lwb/d;-><init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/HostnameVerifier;Laj/b;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {v18 .. v18}, Lwb/d;->d()LMj/x;

    move-result-object v1

    const-class v2, Ljb/n;

    invoke-virtual {v1, v2}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v2, "create(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljb/n;

    iput-object v1, v0, Ljb/g;->d:Ljb/n;

    return-void
.end method

.method public static synthetic a(Ljb/g;)Lgg/D;
    .locals 0

    invoke-static {p0}, Ljb/g;->p(Ljb/g;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb/g;)V
    .locals 0

    invoke-static {p0}, Ljb/g;->i(Ljb/g;)V

    return-void
.end method

.method public static synthetic c(Ljb/g;)LYg/J;
    .locals 0

    invoke-static {p0}, Ljb/g;->s(Ljb/g;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ZLjb/g;)Llb/b;
    .locals 0

    invoke-static {p0, p1}, Ljb/g;->j(ZLjb/g;)Llb/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ljb/g;Llb/b;)V
    .locals 0

    invoke-direct {p0, p1}, Ljb/g;->q(Llb/b;)V

    return-void
.end method

.method private final h(Z)Lgg/z;
    .locals 3

    iget-object v0, p0, Ljb/g;->d:Ljb/n;

    new-instance v1, Llb/d;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Llb/d;-><init>(ZZ)V

    invoke-interface {v0, v1}, Ljb/n;->b(Llb/d;)Lgg/z;

    move-result-object p1

    new-instance v0, Ljb/g$a;

    invoke-direct {v0, p0}, Ljb/g$a;-><init>(Ljb/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    new-instance v0, Ljb/d;

    invoke-direct {v0, p0}, Ljb/d;-><init>(Ljb/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->l(Lkg/a;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "doFinally(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljb/g;->f:Lgg/z;

    return-object p1
.end method

.method private static final i(Ljb/g;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ljb/g;->f:Lgg/z;

    return-void
.end method

.method private static final j(ZLjb/g;)Llb/b;
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    iput-object p0, p1, Ljb/g;->e:Llb/b;

    :cond_0
    iget-object p0, p1, Ljb/g;->e:Llb/b;

    return-object p0
.end method

.method public static synthetic l(Ljb/g;ZILjava/lang/Object;)Lgg/z;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Ljb/g;->k(Z)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final o()Lgg/z;
    .locals 2

    new-instance v0, Ljb/c;

    invoke-direct {v0, p0}, Ljb/c;-><init>(Ljb/g;)V

    invoke-static {v0}, Lgg/z;->j(Lkg/q;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "defer(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final p(Ljb/g;)Lgg/D;
    .locals 1

    iget-object v0, p0, Ljb/g;->f:Lgg/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljb/g;->h(Z)Lgg/z;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private final q(Llb/b;)V
    .locals 1

    iput-object p1, p0, Ljb/g;->e:Llb/b;

    iget-object v0, p0, Ljb/g;->c:Lsb/a;

    invoke-virtual {v0, p1}, Lsb/a;->b(Llb/b;)V

    return-void
.end method

.method private final r(Lgg/D;)Lgg/z;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Ljb/g;->l(Ljb/g;ZILjava/lang/Object;)Lgg/z;

    move-result-object v0

    new-instance v1, Ljb/g$d;

    invoke-direct {v1, p1}, Ljb/g$d;-><init>(Lgg/D;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    iget-object v0, p0, Ljb/g;->b:LFb/a;

    invoke-virtual {p1, v0}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "retryWhen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final s(Ljb/g;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Ljb/g;->g()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final f()Lgg/b;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Ljb/g;->l(Ljb/g;ZILjava/lang/Object;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->y()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "ignoreElement(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ljb/g;->e:Llb/b;

    return-void
.end method

.method public final k(Z)Lgg/z;
    .locals 1

    new-instance v0, Ljb/f;

    invoke-direct {v0, p1, p0}, Ljb/f;-><init>(ZLjb/g;)V

    invoke-static {v0}, Lgg/n;->m(Ljava/util/concurrent/Callable;)Lgg/n;

    move-result-object p1

    invoke-direct {p0}, Ljb/g;->o()Lgg/z;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/n;->x(Lgg/D;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "switchIfEmpty(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final m()Lgg/z;
    .locals 2

    invoke-virtual {p0}, Ljb/g;->n()Lgg/z;

    move-result-object v0

    sget-object v1, Ljb/g$b;->a:Ljb/g$b;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final n()Lgg/z;
    .locals 2

    iget-object v0, p0, Ljb/g;->d:Ljb/n;

    invoke-interface {v0}, Ljb/n;->a()Lgg/z;

    move-result-object v0

    invoke-direct {p0, v0}, Ljb/g;->r(Lgg/D;)Lgg/z;

    move-result-object v0

    sget-object v1, Ljb/g$c;->a:Ljb/g$c;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
