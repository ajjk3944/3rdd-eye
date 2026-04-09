.class public final LDb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LDb/a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LDb/a$a;Lokhttp3/Request;)Z
    .locals 0

    invoke-direct {p0, p1}, LDb/a$a;->g(Lokhttp3/Request;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(LDb/a$a;Lokhttp3/Request;)Z
    .locals 0

    invoke-direct {p0, p1}, LDb/a$a;->i(Lokhttp3/Request;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(LDb/a$a;Lokhttp3/Request;)Z
    .locals 0

    invoke-direct {p0, p1}, LDb/a$a;->k(Lokhttp3/Request;)Z

    move-result p0

    return p0
.end method

.method private final e(Lokhttp3/Request;)Z
    .locals 1

    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/api/sso/v1/login/token/setup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final f(Lokhttp3/Request;)Z
    .locals 1

    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/api/sso/v1/jwt/token/login"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final g(Lokhttp3/Request;)Z
    .locals 1

    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/api/sso/v1/login/2fa"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final h(Lokhttp3/Request;)Z
    .locals 1

    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/api/sso/v1/login"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final i(Lokhttp3/Request;)Z
    .locals 6

    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/api/sso/v1/user/self/mfa/sms"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    :goto_0
    move v2, v1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object v0

    const-string v5, "/api/sso/v1/user/self/mfa/email"

    invoke-static {v0, v5, v2, v3, v4}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object v0

    const-string v5, "/api/sso/v1/user/self/mfa/push"

    invoke-static {v0, v5, v2, v3, v4}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object v0

    const-string v3, "/api/sso/v1/user/self/mfa/webauthn/challenge"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/api/sso/v1/user/self/mfa/webauthn/login"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    return v2
.end method

.method private final j(Lokhttp3/Request;)Z
    .locals 1

    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/api/sso/v1/login/token/poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final k(Lokhttp3/Request;)Z
    .locals 2

    invoke-direct {p0, p1}, LDb/a$a;->i(Lokhttp3/Request;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LDb/a$a;->h(Lokhttp3/Request;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LDb/a$a;->g(Lokhttp3/Request;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LDb/a$a;->e(Lokhttp3/Request;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LDb/a$a;->j(Lokhttp3/Request;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, LDb/a$a;->f(Lokhttp3/Request;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v1

    :goto_1
    xor-int/2addr p1, v1

    return p1
.end method


# virtual methods
.method public final d(Lokhttp3/Request$Builder;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cookies"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lyb/a;->a(Lokhttp3/Request$Builder;Ljava/lang/String;)Lokhttp3/Request$Builder;

    return-void
.end method

.method public final l(Ljava/lang/String;LGb/f;Lokhttp3/Response;)V
    .locals 7

    const-string/jumbo v0, "storage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "response"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lyb/a;->b(Lokhttp3/Response;)Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_6

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/net/HttpCookie;->parse(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/HttpCookie;

    invoke-virtual {v3}, Ljava/net/HttpCookie;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v3}, Ljava/net/HttpCookie;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v4}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    move-object v4, v6

    :goto_1
    invoke-interface {p2, v4}, LGb/f;->m(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/HttpCookie;->getValue()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "getValue(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    move-object v6, v1

    :cond_3
    invoke-interface {p2, v6}, LGb/f;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string/jumbo v5, "UBIC_2FA"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ljava/net/HttpCookie;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, LGb/f;->C(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    check-cast p3, Ljava/util/List;

    :cond_6
    return-void
.end method
