.class public final Lwb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwb/d$a;
    }
.end annotation


# static fields
.field public static final i:Lwb/d$a;

.field private static final j:LNj/g;

.field private static final k:LQj/k;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lokhttp3/CookieJar;

.field private final c:Ljava/util/List;

.field private final d:Ljavax/net/ssl/SSLSocketFactory;

.field private final e:Ljavax/net/ssl/X509TrustManager;

.field private final f:Ljavax/net/ssl/HostnameVerifier;

.field private final g:Laj/b;

.field private final h:Lokhttp3/logging/HttpLoggingInterceptor$Level;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwb/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwb/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwb/d;->i:Lwb/d$a;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-static {v0}, LNj/g;->f(Lgg/y;)LNj/g;

    move-result-object v0

    const-string/jumbo v1, "createWithScheduler(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lwb/d;->j:LNj/g;

    invoke-static {}, LQj/k;->f()LQj/k;

    move-result-object v0

    const-string/jumbo v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lwb/d;->k:LQj/k;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/HostnameVerifier;Laj/b;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;)V
    .locals 0

    const-string/jumbo p8, "url"

    invoke-static {p1, p8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p8, "cookieJar"

    invoke-static {p2, p8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p8, "interceptors"

    invoke-static {p3, p8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p8, "json"

    invoke-static {p7, p8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p8, "httpLogLevel"

    invoke-static {p9, p8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwb/d;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lwb/d;->b:Lokhttp3/CookieJar;

    .line 4
    iput-object p3, p0, Lwb/d;->c:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lwb/d;->d:Ljavax/net/ssl/SSLSocketFactory;

    .line 6
    iput-object p5, p0, Lwb/d;->e:Ljavax/net/ssl/X509TrustManager;

    .line 7
    iput-object p6, p0, Lwb/d;->f:Ljavax/net/ssl/HostnameVerifier;

    .line 8
    iput-object p7, p0, Lwb/d;->g:Laj/b;

    .line 9
    iput-object p9, p0, Lwb/d;->h:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/HostnameVerifier;Laj/b;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 10
    sget-object v1, Lokhttp3/CookieJar;->b:Lokhttp3/CookieJar;

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_1

    .line 11
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v3, v4

    goto :goto_2

    :cond_2
    move-object v3, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    move-object v5, v4

    goto :goto_3

    :cond_3
    move-object v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    move-object v6, v4

    goto :goto_4

    :cond_4
    move-object v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_5

    .line 12
    new-instance v7, Lwb/c;

    invoke-direct {v7}, Lwb/c;-><init>()V

    const/4 v8, 0x1

    invoke-static {v4, v7, v8, v4}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v7

    goto :goto_5

    :cond_5
    move-object/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v4, p8

    :goto_6
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_7

    .line 13
    sget-object v0, Lokhttp3/logging/HttpLoggingInterceptor$Level;->BASIC:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    goto :goto_7

    :cond_7
    move-object/from16 v0, p9

    :goto_7
    move-object p2, p0

    move-object p3, p1

    move-object p4, v1

    move-object p5, v2

    move-object p6, v3

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    move-object/from16 p10, v4

    move-object/from16 p11, v0

    .line 14
    invoke-direct/range {p2 .. p11}, Lwb/d;-><init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/HostnameVerifier;Laj/b;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;)V

    return-void
.end method

.method public static synthetic a(Laj/e;)LYg/J;
    .locals 0

    invoke-static {p0}, Lwb/d;->c(Laj/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwb/d;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lwb/d;->f(Lwb/d;Ljava/lang/String;)V

    return-void
.end method

.method private static final c(Laj/e;)LYg/J;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Laj/e;->d(Z)V

    invoke-virtual {p0, v0}, Laj/e;->f(Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {p0, v0}, Laj/e;->c(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final e()Lokhttp3/OkHttpClient;
    .locals 4

    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    iget-object v1, p0, Lwb/d;->d:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lwb/d;->e:Ljavax/net/ssl/X509TrustManager;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->P(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;

    :cond_0
    iget-object v1, p0, Lwb/d;->f:Ljavax/net/ssl/HostnameVerifier;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->L(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;

    :cond_1
    iget-object v1, p0, Lwb/d;->b:Lokhttp3/CookieJar;

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->f(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;

    iget-object v1, p0, Lwb/d;->c:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/Interceptor;

    invoke-virtual {v0, v2}, Lokhttp3/OkHttpClient$Builder;->a(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    goto :goto_0

    :cond_2
    new-instance v1, Lwb/b;

    invoke-direct {v1, p0}, Lwb/b;-><init>(Lwb/d;)V

    new-instance v2, Lokhttp3/logging/HttpLoggingInterceptor;

    invoke-direct {v2, v1}, Lokhttp3/logging/HttpLoggingInterceptor;-><init>(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V

    iget-object v1, p0, Lwb/d;->h:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    invoke-virtual {v2, v1}, Lokhttp3/logging/HttpLoggingInterceptor;->c(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V

    invoke-virtual {v0, v2}, Lokhttp3/OkHttpClient$Builder;->a(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    new-instance v2, Lzb/a;

    invoke-direct {v2}, Lzb/a;-><init>()V

    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->a(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->e(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->O(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->c()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method private static final f(Lwb/d;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method private final g()LMj/x;
    .locals 4

    new-instance v0, LMj/x$b;

    invoke-direct {v0}, LMj/x$b;-><init>()V

    iget-object v1, p0, Lwb/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, LMj/x$b;->c(Ljava/lang/String;)LMj/x$b;

    move-result-object v0

    sget-object v1, Lwb/d;->k:LQj/k;

    invoke-virtual {v0, v1}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object v0

    iget-object v1, p0, Lwb/d;->g:Laj/b;

    sget-object v2, Lokhttp3/MediaType;->e:Lokhttp3/MediaType$Companion;

    const-string/jumbo v3, "application/json"

    invoke-virtual {v2, v3}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v2

    invoke-static {v1, v2}, LH5/c;->a(LVi/A;Lokhttp3/MediaType;)LMj/h$a;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object v0

    sget-object v1, Lwb/d;->j:LNj/g;

    invoke-virtual {v0, v1}, LMj/x$b;->a(LMj/e$a;)LMj/x$b;

    move-result-object v0

    invoke-direct {p0}, Lwb/d;->e()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->g(Lokhttp3/OkHttpClient;)LMj/x$b;

    move-result-object v0

    invoke-virtual {v0}, LMj/x$b;->e()LMj/x;

    move-result-object v0

    const-string/jumbo v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final d()LMj/x;
    .locals 1

    invoke-direct {p0}, Lwb/d;->g()LMj/x;

    move-result-object v0

    return-object v0
.end method
