.class public final Lfb/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfb/r$a;
    }
.end annotation


# static fields
.field private static final b:Lfb/r$a;


# instance fields
.field private final a:Lfb/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfb/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfb/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfb/r;->b:Lfb/r$a;

    return-void
.end method

.method public constructor <init>(Lfb/s;)V
    .locals 1

    const-string/jumbo v0, "localLoginTokenStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/r;->a:Lfb/s;

    return-void
.end method

.method private final b(Lokhttp3/Request;)Z
    .locals 1

    invoke-virtual {p1}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/api/auth/nca"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "/api/oauth/token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "/api/auth/login"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 7

    const-string/jumbo v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->j()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->i()Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->j()Lokhttp3/Request;

    move-result-object v1

    invoke-direct {p0, v1}, Lfb/r;->b(Lokhttp3/Request;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lfb/r;->a:Lfb/s;

    invoke-virtual {v1}, Lfb/s;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string/jumbo v2, "TOKEN"

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    const-string v6, "Cookie"

    if-nez v2, :cond_1

    const-string/jumbo v2, "UOS_TOKEN"

    invoke-static {v1, v2, v3, v4, v5}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "TOKEN="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0, v6, v1}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    :cond_2
    :goto_1
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    sget-object v0, Lfb/r;->b:Lfb/r$a;

    invoke-virtual {p1}, Lokhttp3/Response;->J()Lokhttp3/Headers;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfb/r$a;->a(Lokhttp3/Headers;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lfb/r;->a:Lfb/s;

    invoke-virtual {v1, v0}, Lfb/s;->c(Ljava/lang/String;)V

    :cond_3
    return-object p1
.end method
