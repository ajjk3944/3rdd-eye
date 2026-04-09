.class public final LAb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAb/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAb/g$a;
    }
.end annotation


# static fields
.field public static final j:LAb/g$a;


# instance fields
.field private final a:LAb/h;

.field private final b:LGb/f;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:LCb/a;

.field private final f:LAb/i;

.field private final g:Lgg/y;

.field private final h:LFb/a;

.field private final i:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LAb/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAb/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAb/g;->j:LAb/g$a;

    return-void
.end method

.method public constructor <init>(LAb/h;LGb/f;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;LCb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LAb/i;Lgg/y;)V
    .locals 0

    const-string/jumbo p3, "ssoConfig"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "storage"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "clientAppName"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "clientAppVersion"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "trustedDeviceHelper"

    invoke-static {p7, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "httpLogLevel"

    invoke-static {p8, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "service"

    invoke-static {p9, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "io"

    invoke-static {p10, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LAb/g;->a:LAb/h;

    .line 3
    iput-object p2, p0, LAb/g;->b:LGb/f;

    .line 4
    iput-object p4, p0, LAb/g;->c:Ljava/lang/String;

    .line 5
    iput-object p5, p0, LAb/g;->d:Ljava/lang/String;

    .line 6
    iput-object p7, p0, LAb/g;->e:LCb/a;

    .line 7
    iput-object p9, p0, LAb/g;->f:LAb/i;

    .line 8
    iput-object p10, p0, LAb/g;->g:Lgg/y;

    .line 9
    new-instance p1, LFb/a;

    new-instance p2, LAb/d;

    invoke-direct {p2, p0}, LAb/d;-><init>(LAb/g;)V

    const/4 p3, 0x1

    invoke-direct {p1, p3, p2}, LFb/a;-><init>(ILmh/a;)V

    iput-object p1, p0, LAb/g;->h:LFb/a;

    .line 10
    new-instance p1, LAb/e;

    invoke-direct {p1, p0}, LAb/e;-><init>(LAb/g;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LAb/g;->i:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(LAb/h;LGb/f;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;LCb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LAb/i;Lgg/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p11

    const/4 v1, 0x1

    and-int/lit8 v2, v0, 0x20

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object/from16 v2, p6

    :goto_0
    and-int/lit16 v4, v0, 0x80

    if-eqz v4, :cond_1

    .line 11
    sget-object v4, Lokhttp3/logging/HttpLoggingInterceptor$Level;->BASIC:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    move-object/from16 v16, v4

    goto :goto_1

    :cond_1
    move-object/from16 v16, p8

    :goto_1
    and-int/lit16 v4, v0, 0x100

    if-eqz v4, :cond_2

    .line 12
    invoke-virtual/range {p1 .. p1}, LAb/h;->getSsoUrl()Ljava/lang/String;

    move-result-object v5

    .line 13
    new-instance v4, LDb/b;

    const-string v6, "/api/sso/v1/user/self/mfa/push/poll-login"

    invoke-direct {v4, v6}, LDb/b;-><init>(Ljava/lang/String;)V

    .line 14
    new-instance v6, Lzb/b;

    move-object/from16 v15, p4

    move-object/from16 v14, p5

    invoke-direct {v6, v15, v14}, Lzb/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    new-instance v7, LDb/a;

    move-object/from16 v13, p1

    move-object/from16 v12, p2

    invoke-direct {v7, v13, v12}, LDb/a;-><init>(LAb/h;LGb/f;)V

    .line 16
    new-instance v8, LDb/d;

    move-object/from16 v11, p7

    invoke-direct {v8, v11}, LDb/d;-><init>(LCb/a;)V

    const/4 v9, 0x4

    new-array v9, v9, [Lokhttp3/Interceptor;

    const/4 v10, 0x0

    aput-object v4, v9, v10

    aput-object v6, v9, v1

    const/4 v4, 0x2

    aput-object v7, v9, v4

    const/4 v4, 0x3

    aput-object v8, v9, v4

    .line 17
    invoke-static {v9}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 18
    new-instance v4, LAb/c;

    invoke-direct {v4}, LAb/c;-><init>()V

    invoke-static {v3, v4, v1, v3}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v1

    .line 19
    new-instance v3, Lwb/d;

    const/16 v17, 0x3a

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, v3

    move-object v11, v1

    move-object v12, v2

    move-object/from16 v13, v16

    move/from16 v14, v17

    move-object/from16 v15, v18

    invoke-direct/range {v4 .. v15}, Lwb/d;-><init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/HostnameVerifier;Laj/b;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    invoke-virtual {v3}, Lwb/d;->d()LMj/x;

    move-result-object v1

    .line 21
    const-class v3, LAb/i;

    invoke-virtual {v1, v3}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAb/i;

    move-object v13, v1

    goto :goto_2

    :cond_2
    move-object/from16 v13, p9

    :goto_2
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    .line 22
    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    move-object v14, v0

    goto :goto_3

    :cond_3
    move-object/from16 v14, p10

    :goto_3
    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object v10, v2

    move-object/from16 v11, p7

    move-object/from16 v12, v16

    .line 23
    invoke-direct/range {v4 .. v14}, LAb/g;-><init>(LAb/h;LGb/f;LAb/b;Ljava/lang/String;Ljava/lang/String;Lwb/a;LCb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LAb/i;Lgg/y;)V

    return-void
.end method

.method public static final synthetic A(LAb/g;)LAb/i;
    .locals 0

    iget-object p0, p0, LAb/g;->f:LAb/i;

    return-object p0
.end method

.method public static final synthetic B(LAb/g;)LGb/f;
    .locals 0

    iget-object p0, p0, LAb/g;->b:LGb/f;

    return-object p0
.end method

.method private static final C(LAb/g;)Lgg/f;
    .locals 6

    iget-object v0, p0, LAb/g;->b:LGb/f;

    invoke-interface {v0}, LGb/f;->s()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Ljava/net/HttpCookie;->parse(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/net/HttpCookie;

    invoke-virtual {v3}, Ljava/net/HttpCookie;->getName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, LAb/g;->a:LAb/h;

    invoke-virtual {v5}, LAb/h;->getUbicAuthCookieName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/net/HttpCookie;->hasExpired()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/net/HttpCookie;

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_3

    new-instance p0, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const/4 v0, 0x3

    invoke-direct {p0, v1, v1, v0, v1}, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p0

    goto :goto_2

    :cond_3
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    :goto_2
    return-object p0
.end method

.method private final D(LEb/r;)Lgg/z;
    .locals 1

    invoke-virtual {p1}, LEb/r;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/unifi/core/sso/exceptions/EmailNotVerifiedException;

    invoke-direct {p1}, Lcom/ui/unifi/core/sso/exceptions/EmailNotVerifiedException;-><init>()V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method private static final G(LAb/g;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method private final H(Lgg/D;)Lgg/z;
    .locals 1

    invoke-virtual {p0}, LAb/g;->o()Lgg/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    iget-object v0, p0, LAb/g;->h:LFb/a;

    invoke-virtual {p1, v0}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "retryWhen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final I(LAb/g;)LYg/J;
    .locals 0

    iget-object p0, p0, LAb/g;->b:LGb/f;

    invoke-interface {p0}, LGb/f;->u()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final K(Ljava/lang/String;Ljava/lang/String;Z)Lgg/z;
    .locals 10

    iget-object v0, p0, LAb/g;->f:LAb/i;

    new-instance v9, LEb/p;

    iget-object v1, p0, LAb/g;->e:LCb/a;

    invoke-interface {v1}, LCb/a;->b()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v8}, LEb/p;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, LAb/i;->m(LEb/p;)Lgg/z;

    move-result-object p1

    new-instance p2, LAb/g$j;

    invoke-direct {p2, p0}, LAb/g$j;-><init>(LAb/g;)V

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance p2, LAb/g$k;

    invoke-direct {p2, p0}, LAb/g$k;-><init>(LAb/g;)V

    invoke-virtual {p1, p2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "doOnSuccess(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LBb/g;->l(Lgg/z;)Lgg/z;

    move-result-object p1

    new-instance p2, LAb/g$l;

    invoke-direct {p2, p0}, LAb/g$l;-><init>(LAb/g;)V

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance p2, LAb/g$m;

    invoke-direct {p2, p0}, LAb/g$m;-><init>(LAb/g;)V

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    iget-object p2, p0, LAb/g;->g:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "subscribeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic u(LAb/g;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LAb/g;->G(LAb/g;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(LAb/g;)Lgg/f;
    .locals 0

    invoke-static {p0}, LAb/g;->C(LAb/g;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Laj/e;)LYg/J;
    .locals 0

    invoke-static {p0}, LAb/g;->y(Laj/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(LAb/g;)LYg/J;
    .locals 0

    invoke-static {p0}, LAb/g;->I(LAb/g;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final y(Laj/e;)LYg/J;
    .locals 2

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Laj/e;->d(Z)V

    invoke-virtual {p0, v0}, Laj/e;->f(Z)V

    new-instance v0, Lcj/f;

    invoke-direct {v0}, Lcj/f;-><init>()V

    sget-object v1, LEb/w;->Companion:LEb/w$b;

    invoke-virtual {v1}, LEb/w$b;->b()Lcj/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcj/f;->i(Lcj/e;)V

    invoke-virtual {v0}, Lcj/f;->h()Lcj/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Laj/e;->h(Lcj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic z(LAb/g;LEb/r;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LAb/g;->D(LEb/r;)Lgg/z;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public E(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_2

    check-cast p1, Lretrofit2/HttpException;

    invoke-virtual {p1}, Lretrofit2/HttpException;->d()LMj/w;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LMj/w;->d()Lokhttp3/ResponseBody;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->C()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    sget-object v0, Laj/b;->d:Laj/b$a;

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, LEb/b;->Companion:LEb/b$b;

    invoke-virtual {v1}, LEb/b$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEb/b;

    :cond_1
    new-instance v1, Lcom/ui/unifi/core/sso/exceptions/CreateAccountException;

    invoke-direct {v1, v0, p1}, Lcom/ui/unifi/core/sso/exceptions/CreateAccountException;-><init>(LEb/b;Ljava/lang/String;)V

    move-object p1, v1

    :cond_2
    return-object p1
.end method

.method public F(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 3

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lretrofit2/HttpException;

    invoke-virtual {v0}, Lretrofit2/HttpException;->d()LMj/w;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMj/w;->d()Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->C()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget-object v1, Laj/b;->d:Laj/b$a;

    invoke-virtual {v1}, Laj/b;->a()Lcj/e;

    sget-object v2, LEb/n;->Companion:LEb/n$b;

    invoke-virtual {v2}, LEb/n$b;->serializer()LVi/b;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEb/n;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LEb/n;->a()I

    move-result p1

    new-instance v0, Lcom/ui/unifi/core/sso/exceptions/ResendVerificationEmailException;

    invoke-direct {v0, p1}, Lcom/ui/unifi/core/sso/exceptions/ResendVerificationEmailException;-><init>(I)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    check-cast p1, Ljava/lang/Exception;

    :cond_2
    :goto_1
    return-object p1
.end method

.method public J(LEb/r;)V
    .locals 2

    const-string/jumbo v0, "ssoUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->b:LGb/f;

    invoke-virtual {p1}, LEb/r;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LGb/f;->k(Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->b:LGb/f;

    invoke-virtual {p1}, LEb/r;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LGb/f;->y(Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->b:LGb/f;

    invoke-virtual {p1}, LEb/r;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LGb/f;->q(Ljava/lang/String;)V

    return-void
.end method

.method public a()Lgg/z;
    .locals 1

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-interface {v0}, LAb/i;->a()Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;LEb/o;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "resendVerificationEmailRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-interface {v0, p1, p2}, LAb/i;->b(Ljava/lang/String;LEb/o;)Lgg/b;

    move-result-object p1

    new-instance p2, LAb/g$h;

    invoke-direct {p2, p0}, LAb/g$h;-><init>(LAb/g;)V

    invoke-virtual {p1, p2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "onErrorResumeNext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(LEb/l;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "passwordStrengthRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-interface {v0, p1}, LAb/i;->c(LEb/l;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d()Lgg/z;
    .locals 1

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-interface {v0}, LAb/i;->d()Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public e(LEb/c;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "ssoUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-interface {v0, p1}, LAb/i;->e(LEb/c;)Lgg/z;

    move-result-object v0

    new-instance v1, LAb/g$b;

    invoke-direct {v1, p0}, LAb/g$b;-><init>(LAb/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LAb/g$c;

    invoke-direct {v1, p0, p1}, LAb/g$c;-><init>(LAb/g;LEb/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LAb/g$d;

    invoke-direct {v0, p0}, LAb/g$d;-><init>(LAb/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f(Ljava/lang/String;LEb/h;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "usernameOrEmail"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "forgotPasswordRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-interface {v0, p1, p2}, LAb/i;->f(Ljava/lang/String;LEb/h;)Lgg/b;

    move-result-object p1

    iget-object p2, p0, LAb/g;->g:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lgg/b;->h0(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "toSingleDefault(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LBb/g;->j(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public g()Lgg/z;
    .locals 2

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-interface {v0}, LAb/i;->g()Lgg/z;

    move-result-object v0

    invoke-direct {p0, v0}, LAb/g;->H(Lgg/D;)Lgg/z;

    move-result-object v0

    new-instance v1, LAb/g$e;

    invoke-direct {v1, p0}, LAb/g$e;-><init>(LAb/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "doOnSuccess(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LAb/g;->b:LGb/f;

    invoke-interface {v0}, LGb/f;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/String;)Lgg/z;
    .locals 8

    const-string/jumbo v0, "twoFaToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    new-instance v7, LEb/q;

    iget-object v1, p0, LAb/g;->e:LCb/a;

    invoke-interface {v1}, LCb/a;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, LEb/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, LAb/i;->r(LEb/q;)Lgg/z;

    move-result-object p1

    new-instance v0, LAb/g$n;

    invoke-direct {v0, p0}, LAb/g$n;-><init>(LAb/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LAb/g$o;

    invoke-direct {v0, p0}, LAb/g$o;-><init>(LAb/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "doOnSuccess(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LBb/g;->l(Lgg/z;)Lgg/z;

    move-result-object p1

    new-instance v0, LAb/g$p;

    invoke-direct {v0, p0}, LAb/g$p;-><init>(LAb/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LAb/g$q;

    invoke-direct {v0, p0}, LAb/g$q;-><init>(LAb/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    iget-object v0, p0, LAb/g;->g:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public j(Ljava/lang/String;)Lgg/z;
    .locals 2

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-interface {v0}, LAb/i;->j()Lgg/z;

    move-result-object v0

    new-instance v1, LAb/g$f;

    invoke-direct {v1, p0}, LAb/g$f;-><init>(LAb/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LAb/g$g;

    invoke-direct {v1, p1, p0}, LAb/g$g;-><init>(Ljava/lang/String;LAb/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "doOnSuccess(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxb/e;->c(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/lang/String;)Lgg/b;
    .locals 2

    const-string/jumbo v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    new-instance v1, LEb/t;

    invoke-direct {v1, p1}, LEb/t;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LAb/i;->q(LEb/t;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public l(LEb/w$e;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "authenticator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-virtual {p1}, LEb/w$e;->f()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LAb/i;->o(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lxb/e;->b(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/lang/String;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    new-instance v1, LEb/i;

    invoke-direct {v1, p1}, LEb/i;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LAb/i;->p(LEb/i;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public n(LEb/w$c;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "authenticator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    invoke-virtual {p1}, LEb/w$c;->f()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LAb/i;->h(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lxb/e;->b(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public o()Lgg/b;
    .locals 2

    new-instance v0, LAb/f;

    invoke-direct {v0, p0}, LAb/f;-><init>(LAb/g;)V

    invoke-static {v0}, Lgg/b;->s(Lkg/q;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "defer(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public p()Lgg/b;
    .locals 5

    iget-object v0, p0, LAb/g;->f:LAb/i;

    new-instance v1, LEb/k;

    iget-object v2, p0, LAb/g;->e:LCb/a;

    invoke-interface {v2}, LCb/a;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, LEb/k;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, LAb/i;->l(LEb/k;)Lgg/b;

    move-result-object v0

    invoke-static {v0}, Lxb/e;->b(Lgg/b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;Ljava/lang/String;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "password"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g;->f:LAb/i;

    new-instance v1, LEb/e;

    invoke-direct {v1, p2}, LEb/e;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, p1, v1}, LAb/i;->k(Ljava/lang/String;LEb/e;)Lgg/z;

    move-result-object p1

    invoke-static {p1}, LBb/g;->i(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lgg/z;
    .locals 1

    const-string/jumbo v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "password"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    invoke-direct {p0, p1, p2, p4}, LAb/g;->K(Ljava/lang/String;Ljava/lang/String;Z)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p3}, LAb/g;->i(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    :goto_0
    new-instance p3, LAb/g$i;

    invoke-direct {p3, p0, p2}, LAb/g$i;-><init>(LAb/g;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "doOnSuccess(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public s(Ljava/lang/String;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAb/g;->j:LAb/g$a;

    iget-object v1, p0, LAb/g;->f:LAb/i;

    invoke-interface {v1, p1}, LAb/i;->i(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    iget-object v1, p0, LAb/g;->g:Lgg/y;

    invoke-virtual {p1, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lgg/b;->h0(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "toSingleDefault(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LBb/g;->m(Lgg/z;)Lgg/z;

    move-result-object p1

    invoke-static {v0, p1}, LAb/g$a;->a(LAb/g$a;Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAb/g;->j:LAb/g$a;

    iget-object v1, p0, LAb/g;->f:LAb/i;

    invoke-interface {v1, p1}, LAb/i;->n(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    iget-object v1, p0, LAb/g;->g:Lgg/y;

    invoke-virtual {p1, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lgg/b;->h0(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string/jumbo v1, "toSingleDefault(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LBb/g;->m(Lgg/z;)Lgg/z;

    move-result-object p1

    invoke-static {v0, p1}, LAb/g$a;->a(LAb/g$a;Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
