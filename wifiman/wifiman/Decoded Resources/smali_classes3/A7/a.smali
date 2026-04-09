.class public abstract LA7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA7/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/net/InetAddress;[B)Ls7/g;
    .locals 7

    const-string/jumbo v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-virtual {p0}, LA7/a;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0}, LA7/a;->d()I

    move-result v1

    invoke-virtual {p0, p2, v0, v1}, LA7/a;->h([BII)LA7/c;

    move-result-object v0

    invoke-virtual {v0}, LA7/c;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LA7/c;->a()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p0}, LA7/a;->d()I

    move-result v1

    invoke-virtual {v0}, LA7/c;->a()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, LA7/a;->d()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p0}, LA7/a;->c()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {p0, p2, v2, v4}, LA7/a;->g([BII)LA7/b;

    move-result-object v5

    :try_start_0
    invoke-virtual {v5}, LA7/b;->a()I

    move-result v6

    add-int/2addr v6, v4

    invoke-static {p2, v4, v6}, LZg/n;->r([BII)[B

    move-result-object v4

    invoke-virtual {p0, v0, v5, v4}, LA7/a;->f(LA7/c;LA7/b;[B)Ls7/h;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/ubnt/discovery/server/lan/processing/parser/UnknownFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    sget-object v6, LA7/a$a;->a:LA7/a$a;

    invoke-static {v6, v4}, Lx7/a;->d(Lmh/a;Ljava/lang/Throwable;)V

    :catch_0
    :goto_1
    invoke-virtual {p0}, LA7/a;->c()I

    move-result v4

    invoke-virtual {v5}, LA7/b;->a()I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v2, v4

    goto :goto_0

    :cond_0
    new-instance p2, Ls7/g;

    invoke-virtual {p0, v3}, LA7/a;->e(Ljava/util/List;)Ls7/c;

    move-result-object v0

    sget-object v1, Ly7/d;->a:Ly7/d$a;

    invoke-virtual {v1, p1}, Ly7/d$a;->a(Ljava/net/InetAddress;)Ly7/d;

    move-result-object p1

    invoke-direct {p2, v0, p1, v3}, Ls7/g;-><init>(Ls7/c;Ls7/a;Ljava/util/List;)V

    return-object p2

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Ljava/net/DatagramPacket;)Ls7/g;
    .locals 0

    invoke-static {p0, p1}, LA7/d$a;->a(LA7/d;Ljava/net/DatagramPacket;)Ls7/g;

    move-result-object p1

    return-object p1
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method

.method public abstract e(Ljava/util/List;)Ls7/c;
.end method

.method public abstract f(LA7/c;LA7/b;[B)Ls7/h;
.end method

.method public abstract g([BII)LA7/b;
.end method

.method public abstract h([BII)LA7/c;
.end method
