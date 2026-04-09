.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/net/wifi/WifiManager;

.field private final b:Linet/ipaddr/g;

.field private final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final d:LFg/a;

.field private e:LKg/a;

.field private f:Landroid/net/wifi/WifiManager$MulticastLock;

.field private final g:Lgg/z;


# direct methods
.method public constructor <init>(Landroid/net/wifi/WifiManager;Linet/ipaddr/g;)V
    .locals 1

    const-string v0, "wifiManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ip"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->a:Landroid/net/wifi/WifiManager;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->b:Linet/ipaddr/g;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {}, LFg/a;->j2()LFg/a;

    move-result-object p1

    const-string p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->d:LFg/a;

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    const-string p2, "firstOrError(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->g:Lgg/z;

    return-void
.end method


# virtual methods
.method public final a()Lgg/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->g:Lgg/z;

    return-object v0
.end method

.method public final b()V
    .locals 5

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JMDNS STARTING "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BonjourJMDNS"

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->b:Linet/ipaddr/g;

    invoke-virtual {v0}, Linet/ipaddr/g;->p1()Ljava/net/InetAddress;

    move-result-object v0

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->b:Linet/ipaddr/g;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JMDNS-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LKg/a;->f0(Ljava/net/InetAddress;Ljava/lang/String;)LKg/a;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->e:LKg/a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->a:Landroid/net/wifi/WifiManager;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->b:Linet/ipaddr/g;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BonjourJMDNS-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->f:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V

    const-string v0, "JMDNS multicast lock ACQUIRED"

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->d:LFg/a;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->e:LKg/a;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, LFg/a;->h(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JMDNS STARTED "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v2, "JMDNS failed to acquire multicast lock"

    invoke-static {v2, v0, v1}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->d:LFg/a;

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;

    const-string v3, "failed to create and acquire multicast lock"

    invoke-direct {v2, v3, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, LFg/a;->onError(Ljava/lang/Throwable;)V

    return-void

    :catch_0
    move-exception v0

    const-string v2, "JMDNS failed to create jmdns instance"

    invoke-static {v2, v0, v1}, LZ7/b;->i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->d:LFg/a;

    new-instance v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;

    const-string v3, "failed to create jmdns instance"

    invoke-direct {v2, v3, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$Error$InternalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, LFg/a;->onError(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JMDNS STOPPING "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BonjourJMDNS"

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->b:Linet/ipaddr/g;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JMDNS closing JMDNS instance on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->e:LKg/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->b:Linet/ipaddr/g;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JMDNS close JMDNS instance on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " took "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    const-string v2, "failed to close JMDNS instance"

    invoke-static {v2, v0, v1}, LZ7/b;->i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_2
    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->f:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;->f:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    const-string v2, "JMDNS failed to release multicast lock"

    invoke-static {v2, v0, v1}, LZ7/b;->i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JMDNS STOPPED "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
