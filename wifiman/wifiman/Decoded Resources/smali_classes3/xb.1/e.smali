.class public abstract Lxb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0}, Lxb/e;->d(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lgg/b;)Lgg/b;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/b;

    sget-object v1, Lxb/e$b;->a:Lxb/e$b;

    invoke-direct {v0, v1}, Lxb/b;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0}, Lgg/b;->n(Lgg/g;)Lgg/b;

    move-result-object p0

    const-string/jumbo v0, "compose(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lgg/z;)Lgg/z;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/d;

    sget-object v1, Lxb/e$a;->a:Lxb/e$a;

    invoke-direct {v0, v1}, Lxb/d;-><init>(Lmh/l;)V

    invoke-virtual {p0, v0}, Lgg/z;->h(Lgg/E;)Lgg/z;

    move-result-object p0

    const-string/jumbo v0, "compose(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final d(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 3

    invoke-virtual {p0}, Lretrofit2/HttpException;->a()I

    move-result v0

    const/16 v1, 0x191

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const/4 v1, 0x1

    invoke-direct {v0, v2, p0, v1, v2}, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v0

    :cond_0
    return-object v2
.end method
