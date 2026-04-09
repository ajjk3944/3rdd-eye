.class public Lmj/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final i:Ljava/lang/String; = "mj.g"


# instance fields
.field private a:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private b:Z

.field private c:Z

.field private final d:Ljava/lang/Object;

.field private e:Ljava/io/InputStream;

.field private f:Ljava/lang/Thread;

.field private volatile g:Z

.field private h:Ljava/io/PipedOutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/io/PipedInputStream;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string/jumbo v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lmj/g;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lmj/g;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lmj/g;->b:Z

    iput-boolean v0, p0, Lmj/g;->c:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lmj/g;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lmj/g;->f:Ljava/lang/Thread;

    iput-object p1, p0, Lmj/g;->e:Ljava/io/InputStream;

    new-instance p1, Ljava/io/PipedOutputStream;

    invoke-direct {p1}, Ljava/io/PipedOutputStream;-><init>()V

    iput-object p1, p0, Lmj/g;->h:Ljava/io/PipedOutputStream;

    invoke-virtual {p2, p1}, Ljava/io/PipedInputStream;->connect(Ljava/io/PipedOutputStream;)V

    return-void
.end method

.method private a()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lmj/g;->h:Ljava/io/PipedOutputStream;

    invoke-virtual {v0}, Ljava/io/PipedOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lmj/g;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lmj/g;->i:Ljava/lang/String;

    const-string/jumbo v2, "start"

    const-string v3, "855"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lmj/g;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lmj/g;->b:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lmj/g;->b:Z

    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v1, p0, Lmj/g;->f:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c()V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmj/g;->c:Z

    iget-object v1, p0, Lmj/g;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lmj/g;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v3, Lmj/g;->i:Ljava/lang/String;

    const-string/jumbo v4, "stop"

    const-string v5, "850"

    invoke-interface {v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v2, p0, Lmj/g;->b:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iput-boolean v3, p0, Lmj/g;->b:Z

    iput-boolean v3, p0, Lmj/g;->g:Z

    invoke-direct {p0}, Lmj/g;->a()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move v0, v3

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lmj/g;->f:Ljava/lang/Thread;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lmj/g;->f:Ljava/lang/Thread;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lmj/g;->f:Ljava/lang/Thread;

    iget-object v0, p0, Lmj/g;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lmj/g;->i:Ljava/lang/String;

    const-string/jumbo v2, "stop"

    const-string v3, "851"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public run()V
    .locals 5

    :catch_0
    :goto_0
    iget-boolean v0, p0, Lmj/g;->b:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lmj/g;->e:Ljava/io/InputStream;

    if-nez v0, :cond_0

    goto :goto_4

    :cond_0
    :try_start_0
    iget-object v0, p0, Lmj/g;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lmj/g;->i:Ljava/lang/String;

    const-string/jumbo v2, "run"

    const-string v3, "852"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lmj/g;->e:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lmj/g;->g:Z

    new-instance v0, Lmj/c;

    iget-object v2, p0, Lmj/g;->e:Ljava/io/InputStream;

    invoke-direct {v0, v2}, Lmj/c;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lmj/c;->g()Z

    move-result v2

    if-nez v2, :cond_3

    move v2, v1

    :goto_2
    invoke-virtual {v0}, Lmj/c;->f()[B

    move-result-object v3

    array-length v3, v3

    if-lt v2, v3, :cond_2

    iget-object v0, p0, Lmj/g;->h:Ljava/io/PipedOutputStream;

    invoke-virtual {v0}, Ljava/io/PipedOutputStream;->flush()V

    goto :goto_3

    :cond_2
    iget-object v3, p0, Lmj/g;->h:Ljava/io/PipedOutputStream;

    invoke-virtual {v0}, Lmj/c;->f()[B

    move-result-object v4

    aget-byte v4, v4, v2

    invoke-virtual {v3, v4}, Ljava/io/PipedOutputStream;->write(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    iget-boolean v0, p0, Lmj/g;->c:Z

    if-eqz v0, :cond_4

    :goto_3
    iput-boolean v1, p0, Lmj/g;->g:Z

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "Server sent a WebSocket Frame with the Stop OpCode"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :catch_1
    invoke-virtual {p0}, Lmj/g;->c()V

    goto :goto_0

    :cond_5
    :goto_4
    return-void
.end method
