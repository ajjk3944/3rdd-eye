.class public final Lfb/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/g$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfb/n$a;
    }
.end annotation


# instance fields
.field private final b:Lfb/e;

.field private final c:Lmb/x;

.field private final d:Llb/c;

.field private final e:Lmh/a;


# direct methods
.method public constructor <init>(Lfb/e;Lmb/x;Llb/c;Lmh/a;)V
    .locals 1

    const-string/jumbo v0, "httpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "controller"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "meta"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onUnauthorised"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/n;->b:Lfb/e;

    iput-object p2, p0, Lfb/n;->c:Lmb/x;

    iput-object p3, p0, Lfb/n;->d:Llb/c;

    iput-object p4, p0, Lfb/n;->e:Lmh/a;

    return-void
.end method

.method public static final synthetic e(Lfb/n;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lfb/n;->h(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final f(Lgg/b;)Lgg/b;
    .locals 1

    invoke-static {p1}, Lxb/e;->b(Lgg/b;)Lgg/b;

    move-result-object p1

    new-instance v0, Lfb/n$b;

    invoke-direct {v0, p0}, Lfb/n$b;-><init>(Lfb/n;)V

    invoke-virtual {p1, v0}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "doOnError(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final g(Lgg/z;)Lgg/z;
    .locals 1

    invoke-static {p1}, Lxb/e;->c(Lgg/z;)Lgg/z;

    move-result-object p1

    new-instance v0, Lfb/n$c;

    invoke-direct {v0, p0}, Lfb/n$c;-><init>(Lfb/n;)V

    invoke-virtual {p1, v0}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "doOnError(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final h(Ljava/lang/Throwable;)V
    .locals 0

    instance-of p1, p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lfb/n;->e:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final i(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/b;
    .locals 2

    sget-object v0, Leb/g$c;->a:Leb/g$c$a;

    iget-object v1, p0, Lfb/n;->d:Llb/c;

    invoke-virtual {v0, p4, v1}, Leb/g$c$a;->a(Ljava/util/Map;Llb/c;)Ljava/util/Map;

    move-result-object p4

    sget-object v0, Lfb/n$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-interface {p2, p1, p4}, Lfb/p;->i(Ljava/lang/String;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-interface {p2, p1}, Lfb/p;->e(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    if-eqz p3, :cond_0

    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-static {p3}, Lub/f;->b(Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p3

    invoke-interface {p2, p1, p3, p4}, Lfb/p;->l(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-interface {p2, p1, p4}, Lfb/p;->g(Ljava/lang/String;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-interface {p2, p1, p4}, Lfb/p;->i(Ljava/lang/String;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    if-eqz p3, :cond_1

    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-static {p3}, Lub/f;->b(Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p3

    invoke-interface {p2, p1, p3, p4}, Lfb/p;->k(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-interface {p2, p1, p4}, Lfb/p;->q(Ljava/lang/String;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :pswitch_5
    if-eqz p3, :cond_2

    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-static {p3}, Lub/f;->b(Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p3

    invoke-interface {p2, p1, p3, p4}, Lfb/p;->p(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p2}, Lfb/e;->c()Lfb/p;

    move-result-object p2

    invoke-interface {p2, p1, p4}, Lfb/p;->h(Ljava/lang/String;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final j(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;
    .locals 2

    sget-object v0, Leb/g$c;->a:Leb/g$c$a;

    iget-object v1, p0, Lfb/n;->d:Llb/c;

    invoke-virtual {v0, p4, v1}, Leb/g$c$a;->a(Ljava/util/Map;Llb/c;)Ljava/util/Map;

    move-result-object p4

    sget-object v0, Lfb/n$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p3, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p3}, Lfb/e;->c()Lfb/p;

    move-result-object p3

    invoke-interface {p3, p1, p4}, Lfb/p;->a(Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p3

    goto :goto_0

    :pswitch_1
    iget-object p3, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p3}, Lfb/e;->c()Lfb/p;

    move-result-object p3

    invoke-interface {p3, p1}, Lfb/p;->b(Ljava/lang/String;)Lgg/z;

    move-result-object p3

    goto :goto_0

    :pswitch_2
    if-eqz p3, :cond_0

    iget-object v0, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {v0}, Lfb/e;->c()Lfb/p;

    move-result-object v0

    invoke-static {p3}, Lub/f;->b(Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p3

    invoke-interface {v0, p1, p3, p4}, Lfb/p;->j(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lgg/z;

    move-result-object p3

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p3}, Lfb/e;->c()Lfb/p;

    move-result-object p3

    invoke-interface {p3, p1, p4}, Lfb/p;->d(Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p3

    goto :goto_0

    :pswitch_3
    iget-object p3, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p3}, Lfb/e;->c()Lfb/p;

    move-result-object p3

    invoke-interface {p3, p1, p4}, Lfb/p;->a(Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p3

    goto :goto_0

    :pswitch_4
    if-eqz p3, :cond_1

    iget-object v0, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {v0}, Lfb/e;->c()Lfb/p;

    move-result-object v0

    invoke-static {p3}, Lub/f;->b(Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p3

    invoke-interface {v0, p1, p3, p4}, Lfb/p;->f(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lgg/z;

    move-result-object p3

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p3}, Lfb/e;->c()Lfb/p;

    move-result-object p3

    invoke-interface {p3, p1, p4}, Lfb/p;->c(Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p3

    goto :goto_0

    :pswitch_5
    if-eqz p3, :cond_2

    iget-object v0, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {v0}, Lfb/e;->c()Lfb/p;

    move-result-object v0

    invoke-static {p3}, Lub/f;->b(Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p3

    invoke-interface {v0, p1, p3, p4}, Lfb/p;->o(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;)Lgg/z;

    move-result-object p3

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p3}, Lfb/e;->c()Lfb/p;

    move-result-object p3

    invoke-interface {p3, p1, p4}, Lfb/p;->m(Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p3

    :goto_0
    new-instance p4, Lfb/n$e;

    invoke-direct {p4, p1, p2}, Lfb/n$e;-><init>(Ljava/lang/String;Lkb/o;)V

    invoke-virtual {p3, p4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final l(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "/"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    const-string/jumbo v1, "substring(...)"

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {v0}, Lfb/e;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {v0}, Lfb/e;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lfb/n;->k()Lmb/x;

    move-result-object v4

    invoke-virtual {v4}, Lmb/x;->e()Lmb/k;

    move-result-object v4

    invoke-virtual {v4}, Lmb/k;->b()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final m(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-static {p1}, Lsb/g;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {v0}, Lfb/e;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "/"

    const/4 v4, 0x0

    invoke-static {p1, v3, v1, v2, v4}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lfb/n;->k()Lmb/x;

    move-result-object v1

    invoke-virtual {v1}, Lmb/x;->e()Lmb/k;

    move-result-object v1

    invoke-virtual {v1}, Lmb/k;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    move-object v4, v1

    :cond_2
    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    move-object v3, v4

    :cond_4
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "wss://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;ZJ)Lgg/z;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Leb/g$c$b;->b(Leb/g$c;Ljava/lang/String;ZJ)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lfb/n;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3, p4}, Lfb/n;->j(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p1

    sget-object p2, Lfb/n$d;->a:Lfb/n$d;

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lfb/n;->g(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Leb/k;ZJ)Lgg/z;
    .locals 8

    const-string/jumbo p3, "path"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "listener"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lfb/q;

    invoke-direct {p0, p1}, Lfb/n;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p1}, Lfb/e;->a()Lfb/v;

    move-result-object v2

    iget-object p1, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p1}, Lfb/e;->e()Lfb/u;

    move-result-object v0

    invoke-virtual {p1, v0}, Lfb/e;->d(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    iget-object p1, p0, Lfb/n;->b:Lfb/e;

    invoke-virtual {p1}, Lfb/e;->e()Lfb/u;

    move-result-object v4

    move-object v0, p3

    move-object v5, p2

    move-wide v6, p4

    invoke-direct/range {v0 .. v7}, Lfb/q;-><init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljavax/net/ssl/SSLSocketFactory;Lfb/u;Leb/k;J)V

    invoke-static {p3}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "just(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lfb/n;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3, p4}, Lfb/n;->i(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lfb/n;->f(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public k()Lmb/x;
    .locals 1

    iget-object v0, p0, Lfb/n;->c:Lmb/x;

    return-object v0
.end method
