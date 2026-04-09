.class public abstract LJ7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/n$a;
    }
.end annotation


# static fields
.field public static final g:LJ7/n$a;


# instance fields
.field private final a:Lokhttp3/OkHttpClient;

.field private final b:Lokhttp3/HttpUrl;

.field private final c:LYg/m;

.field private final d:LK7/a;

.field private final e:LY6/h;

.field private final f:LY6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ7/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ7/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJ7/n;->g:LJ7/n$a;

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/n;->a:Lokhttp3/OkHttpClient;

    sget-object p1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {p1, p2}, Lokhttp3/HttpUrl$Companion;->f(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, p0, LJ7/n;->b:Lokhttp3/HttpUrl;

    sget-object p2, LJ7/n$b;->a:LJ7/n$b;

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p2

    iput-object p2, p0, LJ7/n;->c:LYg/m;

    invoke-virtual {p0}, LJ7/n;->l()Lokhttp3/OkHttpClient;

    move-result-object p2

    new-instance v0, LMj/x$b;

    invoke-direct {v0}, LMj/x$b;-><init>()V

    invoke-virtual {v0, p1}, LMj/x$b;->d(Lokhttp3/HttpUrl;)LMj/x$b;

    move-result-object p1

    invoke-static {}, LNj/g;->d()LNj/g;

    move-result-object v0

    invoke-virtual {p1, v0}, LMj/x$b;->a(LMj/e$a;)LMj/x$b;

    move-result-object p1

    invoke-virtual {p0}, LJ7/n;->k()LY6/r;

    move-result-object v0

    invoke-static {v0}, LPj/a;->g(LY6/r;)LPj/a;

    move-result-object v0

    invoke-virtual {p1, v0}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object p1

    invoke-virtual {p1, p2}, LMj/x$b;->g(Lokhttp3/OkHttpClient;)LMj/x$b;

    move-result-object p1

    invoke-virtual {p1}, LMj/x$b;->e()LMj/x;

    move-result-object p1

    const-class p2, LK7/a;

    invoke-virtual {p1, p2}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK7/a;

    iput-object p1, p0, LJ7/n;->d:LK7/a;

    invoke-virtual {p0}, LJ7/n;->k()LY6/r;

    move-result-object p1

    const-class p2, Lcom/ubnt/teleport/unifi/cloud/api/a;

    invoke-virtual {p1, p2}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object p1

    iput-object p1, p0, LJ7/n;->e:LY6/h;

    invoke-virtual {p0}, LJ7/n;->k()LY6/r;

    move-result-object p1

    const-class p2, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;

    invoke-virtual {p1, p2}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object p1

    iput-object p1, p0, LJ7/n;->f:LY6/h;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Teleport Cloud URL is invalid - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic g(LJ7/n;)LK7/a;
    .locals 0

    invoke-virtual {p0}, LJ7/n;->j()LK7/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LJ7/n;)LY6/h;
    .locals 0

    iget-object p0, p0, LJ7/n;->f:LY6/h;

    return-object p0
.end method

.method public static final synthetic i(LJ7/n;)LY6/h;
    .locals 0

    iget-object p0, p0, LJ7/n;->e:LY6/h;

    return-object p0
.end method


# virtual methods
.method protected j()LK7/a;
    .locals 1

    iget-object v0, p0, LJ7/n;->d:LK7/a;

    return-object v0
.end method

.method protected final k()LY6/r;
    .locals 2

    iget-object v0, p0, LJ7/n;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-moshi>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LY6/r;

    return-object v0
.end method

.method protected final l()Lokhttp3/OkHttpClient;
    .locals 3

    iget-object v0, p0, LJ7/n;->a:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->E()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, LI7/g;->a:LI7/g;

    invoke-virtual {v1}, LI7/g;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lokhttp3/logging/HttpLoggingInterceptor;

    new-instance v2, LJ7/n$c;

    invoke-direct {v2}, LJ7/n$c;-><init>()V

    invoke-direct {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor;-><init>(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V

    sget-object v2, Lokhttp3/logging/HttpLoggingInterceptor$Level;->BODY:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    invoke-virtual {v1, v2}, Lokhttp3/logging/HttpLoggingInterceptor;->c(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->b(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    :cond_0
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->c()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public m(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;)V
    .locals 0

    invoke-static {p0, p1}, LK7/c$a;->a(LK7/c;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;)V

    return-void
.end method

.method public n(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;)V
    .locals 0

    invoke-static {p0, p1}, LK7/c$a;->b(LK7/c;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;)V

    return-void
.end method

.method public o(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)V
    .locals 0

    invoke-static {p0, p1}, LK7/c$a;->c(LK7/c;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)V

    return-void
.end method

.method public p(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;)V
    .locals 0

    invoke-static {p0, p1}, LK7/c$a;->d(LK7/c;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;)V

    return-void
.end method
