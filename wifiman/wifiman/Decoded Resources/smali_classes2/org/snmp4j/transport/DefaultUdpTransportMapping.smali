.class public Lorg/snmp4j/transport/DefaultUdpTransportMapping;
.super Lorg/snmp4j/transport/UdpTransportMapping;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;
    }
.end annotation


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field protected listener:Lorg/snmp4j/util/WorkerTask;

.field protected listenerThread:Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;

.field private receiveBufferSize:I

.field protected socket:Ljava/net/DatagramSocket;

.field private socketTimeout:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/snmp4j/smi/UdpAddress;

    const-string v1, "0.0.0.0/0"

    invoke-direct {v0, v1}, Lorg/snmp4j/smi/UdpAddress;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/snmp4j/transport/UdpTransportMapping;-><init>(Lorg/snmp4j/smi/UdpAddress;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    .line 4
    iput v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->receiveBufferSize:I

    .line 5
    new-instance v0, Ljava/net/DatagramSocket;

    iget-object v1, p0, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {v1}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/net/DatagramSocket;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/UdpAddress;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/UdpTransportMapping;-><init>(Lorg/snmp4j/smi/UdpAddress;)V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    .line 18
    iput v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->receiveBufferSize:I

    .line 19
    new-instance v0, Ljava/net/DatagramSocket;

    invoke-virtual {p1}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v1

    .line 20
    invoke-virtual {p1}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/net/DatagramSocket;-><init>(ILjava/net/InetAddress;)V

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/UdpAddress;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1}, Lorg/snmp4j/transport/UdpTransportMapping;-><init>(Lorg/snmp4j/smi/UdpAddress;)V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    .line 9
    iput v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->receiveBufferSize:I

    .line 10
    new-instance v1, Ljava/net/DatagramSocket;

    invoke-direct {v1, v0}, Ljava/net/DatagramSocket;-><init>(Ljava/net/SocketAddress;)V

    iput-object v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    .line 11
    invoke-virtual {v1, p2}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    .line 12
    new-instance p2, Ljava/net/InetSocketAddress;

    .line 13
    invoke-virtual {p1}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p1}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result p1

    invoke-direct {p2, v0, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 14
    iget-object p1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    invoke-virtual {p1, p2}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V

    return-void
.end method

.method static synthetic access$000(Lorg/snmp4j/transport/DefaultUdpTransportMapping;)I
    .locals 0

    iget p0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->receiveBufferSize:I

    return p0
.end method

.method static synthetic access$100()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    sget-object v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    return-object v0
.end method

.method private declared-synchronized ensureSocket()Ljava/net/DatagramSocket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    if-nez v0, :cond_0

    new-instance v0, Ljava/net/DatagramSocket;

    iget-object v1, p0, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {v1}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/net/DatagramSocket;-><init>(I)V

    iget v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->interrupt()V

    iget v4, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    if-lez v4, :cond_0

    :try_start_0
    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v4, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v4, v3}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    move v3, v2

    :cond_0
    :goto_0
    iput-object v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    :cond_1
    iget-object v4, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Ljava/net/DatagramSocket;->close()V

    :cond_2
    iput-object v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_3

    iget v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    if-gtz v1, :cond_3

    :try_start_1
    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    sget-object v1, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v3

    :goto_2
    if-eqz v2, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    return-void
.end method

.method public bridge synthetic getListenAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->getListenAddress()Lorg/snmp4j/smi/UdpAddress;

    move-result-object v0

    return-object v0
.end method

.method public getListenAddress()Lorg/snmp4j/smi/UdpAddress;
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getLocalPort()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lorg/snmp4j/smi/UdpAddress;-><init>(Ljava/net/InetAddress;I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public getPriority()I
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

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

.method public getReceiveBufferSize()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->receiveBufferSize:I

    return v0
.end method

.method public getSocketTimeout()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    return v0
.end method

.method public getThreadName()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    instance-of v1, v0, Ljava/lang/Thread;

    if-eqz v1, :cond_0

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

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
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
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->ensureSocket()Ljava/net/DatagramSocket;

    new-instance v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;

    invoke-direct {v0, p0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;-><init>(Lorg/snmp4j/transport/DefaultUdpTransportMapping;)V

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listenerThread:Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getThreadFactory()Lorg/snmp4j/util/ThreadFactory;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DefaultUDPTransportMapping_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/UdpTransportMapping;->getAddress()Lorg/snmp4j/smi/UdpAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listenerThread:Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lorg/snmp4j/util/ThreadFactory;->createWorkerThread(Ljava/lang/String;Lorg/snmp4j/util/WorkerTask;Z)Lorg/snmp4j/util/WorkerTask;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/net/SocketException;

    const-string v1, "Port already listening"

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected renewSocketAfterException(Ljava/net/SocketException;Ljava/net/DatagramSocket;)Ljava/net/DatagramSocket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p2}, Ljava/net/DatagramSocket;->close()V

    :cond_0
    new-instance p1, Ljava/net/DatagramSocket;

    iget-object p2, p0, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {p2}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result p2

    iget-object v0, p0, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {v0}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Ljava/net/DatagramSocket;-><init>(ILjava/net/InetAddress;)V

    iget p2, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    invoke-virtual {p1, p2}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

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
    check-cast p1, Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->sendMessage(Lorg/snmp4j/smi/UdpAddress;[BLorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public sendMessage(Lorg/snmp4j/smi/UdpAddress;[BLorg/snmp4j/TransportStateReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    new-instance p3, Ljava/net/InetSocketAddress;

    .line 3
    invoke-virtual {p1}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v1

    invoke-direct {p3, v0, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 5
    sget-object v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending message to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " with length "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p2

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {p1, p2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    .line 7
    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 9
    :cond_0
    invoke-direct {p0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->ensureSocket()Ljava/net/DatagramSocket;

    move-result-object p1

    .line 10
    new-instance v0, Ljava/net/DatagramPacket;

    array-length v1, p2

    invoke-direct {v0, p2, v1, p3}, Ljava/net/DatagramPacket;-><init>([BILjava/net/SocketAddress;)V

    invoke-virtual {p1, v0}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    return-void
.end method

.method public setMaxInboundMessageSize(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    return-void
.end method

.method public setPriority(I)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    instance-of v1, v0, Ljava/lang/Thread;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Thread;

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setPriority(I)V

    :cond_0
    return-void
.end method

.method public setReceiveBufferSize(I)V
    .locals 1

    if-lez p1, :cond_0

    iput p1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->receiveBufferSize:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Receive buffer size must be > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSocketTimeout(I)V
    .locals 1

    iput p1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socketTimeout:I

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/net/DatagramSocket;->setSoTimeout(I)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public setThreadName(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    instance-of v1, v0, Ljava/lang/Thread;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Thread;

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
