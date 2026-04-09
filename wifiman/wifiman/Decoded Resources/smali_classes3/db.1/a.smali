.class public final Ldb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ldb/b;


# direct methods
.method public constructor <init>(Lcb/a;)V
    .locals 13

    const-string/jumbo v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwb/d;

    invoke-virtual {p1}, Lcb/a;->getCloudConfigUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lwb/d;-><init>(Ljava/lang/String;Lokhttp3/CookieJar;Ljava/util/List;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Ljavax/net/ssl/HostnameVerifier;Laj/b;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lwb/d;->d()LMj/x;

    move-result-object p1

    const-class v0, Ldb/b;

    invoke-virtual {p1, v0}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ldb/b;

    iput-object p1, p0, Ldb/a;->a:Ldb/b;

    return-void
.end method


# virtual methods
.method public final a()Lgg/z;
    .locals 2

    iget-object v0, p0, Ldb/a;->a:Ldb/b;

    invoke-interface {v0}, Ldb/b;->a()Lgg/z;

    move-result-object v0

    sget-object v1, Ldb/a$a;->a:Ldb/a$a;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
