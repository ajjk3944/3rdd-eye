.class public final Lfb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:LGb/f;

.field private final d:Lfb/u;

.field private final e:Ljava/lang/String;

.field private final f:Lfb/v;

.field private final g:Lfb/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LGb/f;Lfb/s;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p7

    const-string/jumbo v6, "ip"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "macAddress"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "storage"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "localLoginTokenStorage"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "httpLogLevel"

    move-object/from16 v15, p6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v6, "trustedDeviceHelper"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lfb/e;->a:Ljava/lang/String;

    iput-object v2, v0, Lfb/e;->b:Ljava/lang/String;

    iput-object v3, v0, Lfb/e;->c:LGb/f;

    new-instance v12, Lfb/u;

    invoke-direct {v12, v2, v3}, Lfb/u;-><init>(Ljava/lang/String;LGb/f;)V

    iput-object v12, v0, Lfb/e;->d:Lfb/u;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "https://"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v0, Lfb/e;->e:Ljava/lang/String;

    new-instance v9, Lfb/v;

    invoke-direct {v9}, Lfb/v;-><init>()V

    iput-object v9, v0, Lfb/e;->f:Lfb/v;

    sget-object v13, Lfb/a;->a:Lfb/a;

    new-instance v1, Lfb/d;

    invoke-direct {v1}, Lfb/d;-><init>()V

    new-instance v2, Lfb/r;

    invoke-direct {v2, v4}, Lfb/r;-><init>(Lfb/s;)V

    new-instance v4, LDb/a;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct {v4, v6, v3, v7, v6}, LDb/a;-><init>(LAb/h;LGb/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, LDb/b;

    const-string v6, "/api/auth/login/poll"

    invoke-direct {v3, v6}, LDb/b;-><init>(Ljava/lang/String;)V

    new-instance v6, LDb/d;

    invoke-direct {v6, v5}, LDb/d;-><init>(LCb/a;)V

    const/4 v5, 0x5

    new-array v5, v5, [Lokhttp3/Interceptor;

    const/4 v10, 0x0

    aput-object v1, v5, v10

    aput-object v2, v5, v7

    const/4 v1, 0x2

    aput-object v4, v5, v1

    const/4 v1, 0x3

    aput-object v3, v5, v1

    const/4 v1, 0x4

    aput-object v6, v5, v1

    invoke-static {v5}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-virtual {v0, v12}, Lfb/e;->d(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v11

    sget-object v1, Lub/c;->a:Lub/c;

    invoke-virtual {v1}, Lub/c;->d()Laj/b;

    move-result-object v14

    new-instance v1, Lwb/d;

    move-object v7, v1

    move-object/from16 v15, p5

    move-object/from16 v16, p6

    invoke-direct/range {v7 .. v16}, Lwb/d;-><init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/HostnameVerifier;Laj/b;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;)V

    invoke-virtual {v1}, Lwb/d;->d()LMj/x;

    move-result-object v1

    const-class v2, Lfb/p;

    invoke-virtual {v1, v2}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v2, "create(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lfb/p;

    iput-object v1, v0, Lfb/e;->g:Lfb/p;

    return-void
.end method


# virtual methods
.method public final a()Lfb/v;
    .locals 1

    iget-object v0, p0, Lfb/e;->f:Lfb/v;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfb/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lfb/p;
    .locals 1

    iget-object v0, p0, Lfb/e;->g:Lfb/p;

    return-object v0
.end method

.method public final d(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 4

    const/4 v0, 0x0

    const-string/jumbo v1, "trustManager"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    const-string/jumbo v2, "SSL"

    invoke-static {v2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljavax/net/ssl/X509TrustManager;

    aput-object p1, v3, v0

    check-cast v3, [Ljavax/net/ssl/TrustManager;

    invoke-virtual {v2, v1, v3, v1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v2}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object v2, LSj/a;->a:LSj/a$b;

    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v3, "error while creating ssl context"

    invoke-virtual {v2, p1, v3, v0}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public final e()Lfb/u;
    .locals 1

    iget-object v0, p0, Lfb/e;->d:Lfb/u;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfb/e;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final g([Ljava/security/cert/Certificate;)V
    .locals 2

    const-string/jumbo v0, "certificates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfb/e;->c:LGb/f;

    iget-object v1, p0, Lfb/e;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, LGb/f;->g(Ljava/lang/String;[Ljava/security/cert/Certificate;)V

    return-void
.end method
