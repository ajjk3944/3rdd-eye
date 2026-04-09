.class public abstract Lfb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, Lfb/c;->c(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lgg/z;)Lgg/z;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/f;

    new-instance v1, Lxb/c;

    new-instance v2, Lfb/b;

    invoke-direct {v2}, Lfb/b;-><init>()V

    invoke-direct {v1, v2}, Lxb/c;-><init>(Lmh/l;)V

    invoke-direct {v0, v1}, Lxb/f;-><init>(Lxb/a;)V

    invoke-virtual {p0, v0}, Lgg/z;->h(Lgg/E;)Lgg/z;

    move-result-object p0

    const-string/jumbo v0, "compose(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final c(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 2

    const-string/jumbo v0, "httpException"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lretrofit2/HttpException;->a()I

    move-result v0

    const/16 v1, 0x191

    if-eq v0, v1, :cond_0

    const/16 v1, 0x193

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/unifi/core/base/net/client/http/InvalidNcaTokenException;

    invoke-direct {v0, p0}, Lcom/ui/unifi/core/base/net/client/http/InvalidNcaTokenException;-><init>(Ljava/lang/Throwable;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
