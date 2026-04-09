.class public final LDb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "mfaPollLoginPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDb/b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 8

    const-string/jumbo v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->j()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v1

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->j()Lokhttp3/Request;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/Request;->k()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LDb/b;->a:Ljava/lang/String;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v6, v4, v5}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    :goto_0
    invoke-virtual {v1}, Lokhttp3/Response;->p()I

    move-result v6

    const/16 v7, 0xca

    if-ne v6, v7, :cond_2

    invoke-static {}, LDb/c;->a()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-gtz v4, :cond_1

    invoke-static {v1}, Lokhttp3/internal/http/HttpHeaders;->b(Lokhttp3/Response;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1}, Lokhttp3/Response;->close()V

    :cond_0
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p1

    :cond_2
    return-object v1
.end method
