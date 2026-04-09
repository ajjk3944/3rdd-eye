.class public final synthetic Lgh0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lkh0;

.field public final synthetic b:Ljava/net/InetSocketAddress;

.field public final synthetic c:Ljava/util/concurrent/CompletableFuture;


# direct methods
.method public synthetic constructor <init>(Lkh0;Ljava/net/InetSocketAddress;Ljava/util/concurrent/CompletableFuture;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgh0;->a:Lkh0;

    .line 5
    .line 6
    iput-object p2, p0, Lgh0;->b:Ljava/net/InetSocketAddress;

    .line 7
    .line 8
    iput-object p3, p0, Lgh0;->c:Ljava/util/concurrent/CompletableFuture;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lgh0;->a:Lkh0;

    .line 2
    .line 3
    check-cast p1, Lhh0;

    .line 4
    .line 5
    sget-object p1, Lkh0;->k:Li80;

    .line 6
    .line 7
    const-string v1, "Opening async channel for l={}/r={}"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object v3, p0, Lgh0;->b:Ljava/net/InetSocketAddress;

    .line 11
    .line 12
    invoke-interface {p1, v1, v2, v3}, Li80;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {}, Ljava/nio/channels/SocketChannel;->open()Ljava/nio/channels/SocketChannel;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 19
    const/4 v1, 0x0

    .line 20
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v3}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    .line 24
    .line 25
    .line 26
    new-instance v1, Lih0;

    .line 27
    .line 28
    invoke-direct {v1, v0, p1}, Lih0;-><init>(Lkh0;Ljava/nio/channels/SocketChannel;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :catch_0
    move-exception v0

    .line 33
    goto :goto_0

    .line 34
    :catch_1
    move-exception v0

    .line 35
    move-object p1, v2

    .line 36
    :goto_0
    if-eqz p1, :cond_0

    .line 37
    .line 38
    :try_start_2
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 39
    .line 40
    .line 41
    :catch_2
    :cond_0
    iget-object p1, p0, Lgh0;->c:Ljava/util/concurrent/CompletableFuture;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 44
    .line 45
    .line 46
    return-object v2
.end method
