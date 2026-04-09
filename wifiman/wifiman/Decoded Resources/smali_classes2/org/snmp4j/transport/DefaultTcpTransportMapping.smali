.class public Lorg/snmp4j/transport/DefaultTcpTransportMapping;
.super Lorg/snmp4j/transport/TcpTransportMapping;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;,
        Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;,
        Lorg/snmp4j/transport/DefaultTcpTransportMapping$SnmpMesssageLengthDecoder;,
        Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;
    }
.end annotation


# static fields
.field public static final DEFAULT_MAX_BUSY_LOOPS:I = 0x64

.field private static final MIN_SNMP_HEADER_LENGTH:I = 0x6

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private connectionTimeout:J

.field private maxBusyLoops:I

.field protected messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

.field protected server:Lorg/snmp4j/util/WorkerTask;

.field private serverEnabled:Z

.field protected serverThread:Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;

.field protected socketCleaner:Lorg/snmp4j/util/CommonTimer;

.field protected sockets:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/snmp4j/smi/TcpAddress;

    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-direct {p0, v0}, Lorg/snmp4j/transport/TcpTransportMapping;-><init>(Lorg/snmp4j/smi/TcpAddress;)V

    .line 2
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    const-wide/32 v0, 0xea60

    .line 3
    iput-wide v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->connectionTimeout:J

    .line 4
    iput-boolean v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverEnabled:Z

    .line 5
    new-instance v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SnmpMesssageLengthDecoder;

    invoke-direct {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SnmpMesssageLengthDecoder;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

    const/16 v0, 0x64

    .line 6
    iput v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->maxBusyLoops:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/TcpAddress;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/TcpTransportMapping;-><init>(Lorg/snmp4j/smi/TcpAddress;)V

    .line 8
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    const-wide/32 v0, 0xea60

    .line 9
    iput-wide v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->connectionTimeout:J

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverEnabled:Z

    .line 11
    new-instance p1, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SnmpMesssageLengthDecoder;

    invoke-direct {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SnmpMesssageLengthDecoder;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

    const/16 p1, 0x64

    .line 12
    iput p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->maxBusyLoops:I

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverEnabled:Z

    return-void
.end method

.method static synthetic access$000()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    sget-object v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    return-object v0
.end method

.method static synthetic access$100(Lorg/snmp4j/transport/DefaultTcpTransportMapping;)J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->connectionTimeout:J

    return-wide v0
.end method

.method static synthetic access$300(Lorg/snmp4j/transport/DefaultTcpTransportMapping;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverEnabled:Z

    return p0
.end method

.method static synthetic access$500(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->timeoutSocket(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    return-void
.end method

.method private declared-synchronized timeoutSocket(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->connectionTimeout:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    new-instance v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;

    invoke-direct {v0, p0, p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;-><init>(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    invoke-virtual {p1, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->setSocketTimeout(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;)V

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    iget-wide v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->connectionTimeout:J

    invoke-interface {p1, v0, v1, v2}, Lorg/snmp4j/util/CommonTimer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method protected addBufferToReadBuffer(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/nio/ByteBuffer;)V
    .locals 3

    sget-object v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding data "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to read buffer "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getReadBuffer()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getReadBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getReadBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2, v2, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {p2, v1, v2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1, p2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->setReadBuffer(Ljava/nio/ByteBuffer;)V

    :goto_0
    return-void
.end method

.method public close()V
    .locals 8

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_4

    .line 3
    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    .line 4
    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->interrupt()V

    .line 5
    :try_start_0
    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    sget-object v1, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :goto_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    .line 8
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    .line 9
    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 10
    :try_start_1
    invoke-virtual {v3}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v4

    .line 11
    invoke-virtual {v3}, Ljava/net/Socket;->close()V

    .line 12
    sget-object v3, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    const-string v6, " closed"

    if-eqz v5, :cond_1

    .line 13
    :try_start_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Socket to "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_2

    :catch_1
    move-exception v2

    goto :goto_3

    :cond_1
    :goto_2
    if-eqz v4, :cond_0

    .line 14
    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 15
    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 16
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Socket channel to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 19
    :goto_3
    sget-object v3, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_1

    .line 20
    :cond_2
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 21
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    if-eqz v1, :cond_3

    .line 22
    invoke-interface {v1}, Lorg/snmp4j/util/CommonTimer;->cancel()V

    .line 23
    :cond_3
    iput-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    :cond_4
    return-void
.end method

.method public bridge synthetic close(Lorg/snmp4j/smi/Address;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->close(Lorg/snmp4j/smi/TcpAddress;)Z

    move-result p1

    return p1
.end method

.method public declared-synchronized close(Lorg/snmp4j/smi/TcpAddress;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 24
    :try_start_0
    sget-object v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closing socket for peer address "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    if-eqz v1, :cond_4

    .line 27
    invoke-virtual {v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocketTimeout()Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 28
    invoke-virtual {v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocketTimeout()Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;

    move-result-object v2

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;->cancel()Z

    .line 29
    :cond_1
    invoke-virtual {v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 30
    invoke-virtual {v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v2

    .line 31
    invoke-virtual {v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Socket;->close()V

    .line 32
    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Socket to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " closed"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 34
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 35
    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closed socket channel for peer address "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :cond_3
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    .line 38
    :cond_4
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getConnectionTimeout()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->connectionTimeout:J

    return-wide v0
.end method

.method public bridge synthetic getListenAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->getListenAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v0

    return-object v0
.end method

.method public getListenAddress()Lorg/snmp4j/smi/TcpAddress;
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v0

    .line 3
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverThread:Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;

    .line 4
    :try_start_0
    invoke-static {v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->access$200(Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;)Ljava/nio/channels/ServerSocketChannel;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/channels/ServerSocketChannel;->getLocalAddress()Ljava/net/SocketAddress;

    move-result-object v1

    check-cast v1, Ljava/net/InetSocketAddress;

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 6
    :catch_1
    :goto_0
    new-instance v1, Lorg/snmp4j/smi/TcpAddress;

    iget-object v2, p0, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v2}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/net/InetAddress;I)V

    return-object v1
.end method

.method protected getMaxBusyLoops()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->maxBusyLoops:I

    return v0
.end method

.method public getMaxInboundMessageSize()I
    .locals 1

    invoke-super {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;->getMaxInboundMessageSize()I

    move-result v0

    return v0
.end method

.method public getMessageLengthDecoder()Lorg/snmp4j/transport/MessageLengthDecoder;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

    return-object v0
.end method

.method public getPriority()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    instance-of v1, v0, Ljava/lang/Thread;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->getPriority()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x5

    return v0
.end method

.method public getThreadName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public isListening()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isServerEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverEnabled:Z

    return v0
.end method

.method public declared-synchronized listen()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    if-nez v0, :cond_2

    new-instance v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;

    invoke-direct {v0, p0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;-><init>(Lorg/snmp4j/transport/DefaultTcpTransportMapping;)V

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverThread:Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;

    sget-object v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TCP address "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->getListenAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " bound successfully"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getThreadFactory()Lorg/snmp4j/util/ThreadFactory;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DefaultTCPTransportMapping_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/TcpTransportMapping;->getAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverThread:Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lorg/snmp4j/util/ThreadFactory;->createWorkerThread(Ljava/lang/String;Lorg/snmp4j/util/WorkerTask;Z)Lorg/snmp4j/util/WorkerTask;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    iget-wide v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->connectionTimeout:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getTimerFactory()Lorg/snmp4j/util/TimerFactory;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/util/TimerFactory;->createTimer()Lorg/snmp4j/util/CommonTimer;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketCleaner:Lorg/snmp4j/util/CommonTimer;

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    new-instance v0, Ljava/net/SocketException;

    const-string v1, "Port already listening"

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sendMessage(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public sendMessage(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverThread:Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;

    if-nez v0, :cond_2

    .line 3
    :cond_0
    invoke-virtual {p0}, Lorg/snmp4j/transport/TcpTransportMapping;->isOpenSocketOnSending()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->listen()V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/TcpTransportMapping;->handleDroppedMessageToSend(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V

    .line 6
    :cond_2
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverThread:Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;

    if-eqz v0, :cond_4

    .line 7
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->suspendedAddresses:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->suspendedAddresses:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/TcpTransportMapping;->handleDroppedMessageToSend(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V

    goto :goto_1

    .line 9
    :cond_3
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverThread:Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;

    invoke-virtual {v0, p1, p2, p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public setConnectionTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->connectionTimeout:J

    return-void
.end method

.method protected setMaxBusyLoops(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->maxBusyLoops:I

    return-void
.end method

.method public setMaxInboundMessageSize(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    return-void
.end method

.method public setMessageLengthDecoder(Lorg/snmp4j/transport/MessageLengthDecoder;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

    return-void
.end method

.method public setPriority(I)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    instance-of v1, v0, Ljava/lang/Thread;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Thread;

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setPriority(I)V

    :cond_0
    return-void
.end method

.method public setServerEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->serverEnabled:Z

    return-void
.end method

.method protected setSocketOptions(Ljava/net/ServerSocket;)V
    .locals 0

    return-void
.end method

.method public setThreadName(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    instance-of v1, v0, Ljava/lang/Thread;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Thread;

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected socketClosedRemotely(Ljava/nio/channels/SelectionKey;Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "Socket closed remotely"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/TcpTransportMapping;->cancelNonServerSelectionKey(Ljava/nio/channels/SelectionKey;)V

    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    new-instance p1, Lorg/snmp4j/transport/TransportStateEvent;

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p0, p3, p2, v0}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V

    invoke-virtual {p0, p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;

    return-void
.end method
