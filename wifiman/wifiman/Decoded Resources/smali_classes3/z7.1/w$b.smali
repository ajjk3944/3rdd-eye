.class final Lz7/w$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/w;-><init>(Ljava/util/List;Lgg/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lz7/w$b;->a:Ljava/util/List;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 8

    iget-object v0, p0, Lz7/w$b;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz7/j;

    new-instance v3, Ljava/net/DatagramPacket;

    invoke-virtual {v2}, Lz7/j;->b()[B

    move-result-object v4

    invoke-virtual {v2}, Lz7/j;->b()[B

    move-result-object v5

    array-length v5, v5

    new-instance v6, Ljava/net/InetSocketAddress;

    invoke-virtual {v2}, Lz7/j;->a()[B

    move-result-object v7

    invoke-static {v7}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v7

    invoke-virtual {v2}, Lz7/j;->c()I

    move-result v2

    invoke-direct {v6, v7, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-direct {v3, v4, v5, v6}, Ljava/net/DatagramPacket;-><init>([BILjava/net/SocketAddress;)V

    new-instance v2, Lz7/w$b$a;

    invoke-direct {v2, v3}, Lz7/w$b$a;-><init>(Ljava/net/DatagramPacket;)V

    invoke-static {v2}, Lx7/a;->c(Lmh/a;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz7/w$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
