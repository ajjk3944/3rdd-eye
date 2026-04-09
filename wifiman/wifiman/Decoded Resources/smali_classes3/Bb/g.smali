.class public abstract LBb/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lxb/c;

.field private static final b:Lxb/c;

.field private static final c:Lxb/c;

.field private static final d:Lxb/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxb/c;

    new-instance v1, LBb/c;

    invoke-direct {v1}, LBb/c;-><init>()V

    invoke-direct {v0, v1}, Lxb/c;-><init>(Lmh/l;)V

    sput-object v0, LBb/g;->a:Lxb/c;

    new-instance v0, Lxb/c;

    new-instance v1, LBb/d;

    invoke-direct {v1}, LBb/d;-><init>()V

    invoke-direct {v0, v1}, Lxb/c;-><init>(Lmh/l;)V

    sput-object v0, LBb/g;->b:Lxb/c;

    new-instance v0, Lxb/c;

    new-instance v1, LBb/e;

    invoke-direct {v1}, LBb/e;-><init>()V

    invoke-direct {v0, v1}, Lxb/c;-><init>(Lmh/l;)V

    sput-object v0, LBb/g;->c:Lxb/c;

    new-instance v0, Lxb/c;

    new-instance v1, LBb/f;

    invoke-direct {v1}, LBb/f;-><init>()V

    invoke-direct {v0, v1}, Lxb/c;-><init>(Lmh/l;)V

    sput-object v0, LBb/g;->d:Lxb/c;

    return-void
.end method

.method public static synthetic a(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, LBb/g;->p(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, LBb/g;->g(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, LBb/g;->n(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, LBb/g;->k(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, LBb/g;->o(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, LBb/g;->h(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 2

    const-string/jumbo v0, "httpException"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lretrofit2/HttpException;->a()I

    move-result p0

    const/16 v0, 0x191

    const/4 v1, 0x0

    if-eq p0, v0, :cond_1

    const/16 v0, 0x193

    if-eq p0, v0, :cond_1

    const/16 v0, 0x194

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/ui/unifi/core/sso/exceptions/UserNotFoundException;

    invoke-direct {v1}, Lcom/ui/unifi/core/sso/exceptions/UserNotFoundException;-><init>()V

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const/4 v0, 0x3

    invoke-direct {p0, v1, v1, v0, v1}, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p0

    :goto_0
    return-object v1
.end method

.method private static final h(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 3

    const-string/jumbo v0, "httpException"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lretrofit2/HttpException;->a()I

    move-result v0

    const/16 v1, 0x191

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/16 v1, 0x193

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1f3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LBb/g;->q(Lretrofit2/HttpException;)Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    move-result-object v2

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/ui/unifi/core/http/exceptions/LoginFailedException;

    const/4 v1, 0x1

    invoke-direct {v0, v2, p0, v1, v2}, Lcom/ui/unifi/core/http/exceptions/LoginFailedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v0

    :goto_0
    return-object v2
.end method

.method public static final i(Lgg/z;)Lgg/z;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/f;

    sget-object v1, LBb/g;->d:Lxb/c;

    invoke-direct {v0, v1}, Lxb/f;-><init>(Lxb/a;)V

    invoke-virtual {p0, v0}, Lgg/z;->h(Lgg/E;)Lgg/z;

    move-result-object p0

    const-string/jumbo v0, "compose(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final j(Lgg/z;)Lgg/z;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/f;

    new-instance v1, Lxb/c;

    new-instance v2, LBb/b;

    invoke-direct {v2}, LBb/b;-><init>()V

    invoke-direct {v1, v2}, Lxb/c;-><init>(Lmh/l;)V

    invoke-direct {v0, v1}, Lxb/f;-><init>(Lxb/a;)V

    invoke-virtual {p0, v0}, Lgg/z;->h(Lgg/E;)Lgg/z;

    move-result-object p0

    const-string/jumbo v0, "compose(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final k(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 1

    const-string/jumbo v0, "httpException"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lretrofit2/HttpException;->a()I

    move-result p0

    const/16 v0, 0x190

    if-eq p0, v0, :cond_1

    const/16 v0, 0x194

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/ui/unifi/core/sso/exceptions/UserNotFoundException;

    invoke-direct {p0}, Lcom/ui/unifi/core/sso/exceptions/UserNotFoundException;-><init>()V

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/ui/unifi/core/sso/exceptions/MissingCaptchaException;

    invoke-direct {p0}, Lcom/ui/unifi/core/sso/exceptions/MissingCaptchaException;-><init>()V

    :goto_0
    return-object p0
.end method

.method public static final l(Lgg/z;)Lgg/z;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/f;

    sget-object v1, LBb/g;->c:Lxb/c;

    invoke-direct {v0, v1}, Lxb/f;-><init>(Lxb/a;)V

    invoke-virtual {p0, v0}, Lgg/z;->h(Lgg/E;)Lgg/z;

    move-result-object p0

    const-string/jumbo v0, "compose(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final m(Lgg/z;)Lgg/z;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/f;

    new-instance v1, Lxb/c;

    new-instance v2, LBb/a;

    invoke-direct {v2}, LBb/a;-><init>()V

    invoke-direct {v1, v2}, Lxb/c;-><init>(Lmh/l;)V

    invoke-direct {v0, v1}, Lxb/f;-><init>(Lxb/a;)V

    invoke-virtual {p0, v0}, Lgg/z;->h(Lgg/E;)Lgg/z;

    move-result-object p0

    const-string/jumbo v0, "compose(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final n(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 1

    const-string/jumbo v0, "httpException"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lretrofit2/HttpException;->a()I

    move-result p0

    const/16 v0, 0x194

    if-ne p0, v0, :cond_0

    new-instance p0, Lcom/ui/unifi/core/sso/exceptions/UserNotFoundException;

    invoke-direct {p0}, Lcom/ui/unifi/core/sso/exceptions/UserNotFoundException;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final o(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 2

    const-string/jumbo v0, "httpException"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lretrofit2/HttpException;->a()I

    move-result p0

    const/16 v0, 0x190

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    new-instance p0, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const/4 v0, 0x3

    invoke-direct {p0, v1, v1, v0, v1}, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p0

    :cond_0
    return-object v1
.end method

.method private static final p(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 3

    const-string/jumbo v0, "httpException"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lretrofit2/HttpException;->a()I

    move-result v0

    const/16 v1, 0x191

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/16 v1, 0x193

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1f3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LBb/g;->q(Lretrofit2/HttpException;)Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    move-result-object v2

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const/4 v0, 0x3

    invoke-direct {p0, v2, v2, v0, v2}, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, p0

    :goto_0
    return-object v2
.end method

.method private static final q(Lretrofit2/HttpException;)Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;
    .locals 4

    invoke-virtual {p0}, Lretrofit2/HttpException;->d()LMj/w;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LMj/w;->d()Lokhttp3/ResponseBody;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lokhttp3/ResponseBody;->C()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    :try_start_0
    sget-object v1, LEb/z;->Companion:LEb/z$b;

    invoke-virtual {v1, p0}, LEb/z$b;->a(Ljava/lang/String;)LEb/z;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p0

    goto :goto_0

    :catch_0
    :try_start_1
    sget-object v1, LEb/B;->Companion:LEb/B$b;

    invoke-virtual {v1, p0}, LEb/B$b;->a(Ljava/lang/String;)LEb/B;

    move-result-object v1

    invoke-virtual {v1}, LEb/B;->c()LEb/z;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    sget-object v1, LSj/a;->a:LSj/a$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not decode TwoFaRequiredResponse from response body: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    new-instance p0, Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;

    invoke-direct {p0, v0}, Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;-><init>(LEb/z;)V

    return-object p0
.end method
