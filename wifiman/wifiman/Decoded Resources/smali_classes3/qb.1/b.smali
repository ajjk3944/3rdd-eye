.class public final Lqb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/unifi/core/base/net/traces/TracesClient;


# instance fields
.field private final a:Lqb/c;


# direct methods
.method public constructor <init>(Lcb/a;)V
    .locals 13

    const-string/jumbo v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwb/d;

    invoke-virtual {p1}, Lcb/a;->getTracesUrl()Ljava/lang/String;

    move-result-object v2

    new-instance p1, Lqb/a;

    invoke-direct {p1}, Lqb/a;-><init>()V

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static {v3, p1, v1, v3}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v8

    const/16 v11, 0x1be

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lwb/d;-><init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/HostnameVerifier;Laj/b;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lwb/d;->d()LMj/x;

    move-result-object p1

    const-class v0, Lqb/c;

    invoke-virtual {p1, v0}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lqb/c;

    iput-object p1, p0, Lqb/b;->a:Lqb/c;

    return-void
.end method

.method public static synthetic a(Laj/e;)LYg/J;
    .locals 0

    invoke-static {p0}, Lqb/b;->b(Laj/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Laj/e;)LYg/J;
    .locals 4

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Laj/e;->d(Z)V

    invoke-virtual {p0, v0}, Laj/e;->f(Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {p0, v0}, Laj/e;->c(Ljava/lang/String;)V

    new-instance v0, Lcj/f;

    invoke-direct {v0}, Lcj/f;-><init>()V

    const-class v1, Lrb/f;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    new-instance v2, Lcj/b;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcj/b;-><init>(Lth/d;LVi/b;)V

    const-class v1, Lrb/c;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    sget-object v3, Lrb/c;->Companion:Lrb/c$b;

    invoke-virtual {v3}, Lrb/c$b;->serializer()LVi/b;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcj/b;->c(Lth/d;LVi/b;)V

    invoke-virtual {v2, v0}, Lcj/b;->a(Lcj/f;)V

    invoke-virtual {v0}, Lcj/f;->h()Lcj/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Laj/e;->h(Lcj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public reportTrace(Lrb/g;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "tracesBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqb/b;->a:Lqb/c;

    invoke-interface {v0, p1}, Lqb/c;->reportTrace(Lrb/g;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
