.class Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DefaultTcpTransportMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SocketEntry"
.end annotation


# instance fields
.field private volatile busyLoops:I

.field private lastUse:J

.field private message:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "[B>;"
        }
    .end annotation
.end field

.field private peerAddress:Lorg/snmp4j/smi/TcpAddress;

.field private readBuffer:Ljava/nio/ByteBuffer;

.field private volatile registrations:I

.field private socket:Ljava/net/Socket;

.field private socketTimeout:Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;

.field final synthetic this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/smi/TcpAddress;Ljava/net/Socket;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->message:Ljava/util/LinkedList;

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->readBuffer:Ljava/nio/ByteBuffer;

    const/4 p1, 0x0

    iput p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    iput p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->busyLoops:I

    iput-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->peerAddress:Lorg/snmp4j/smi/TcpAddress;

    iput-object p3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socket:Ljava/net/Socket;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    iput-wide p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->lastUse:J

    return-void
.end method

.method static synthetic access$400(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)Ljava/util/LinkedList;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->message:Ljava/util/LinkedList;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized addMessage([B)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->message:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized addRegistration(Ljava/nio/channels/Selector;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/nio/channels/ClosedChannelException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    and-int/2addr v0, p2

    if-nez v0, :cond_1

    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    or-int/2addr v0, p2

    iput v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding operation "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " for: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object p2

    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    invoke-virtual {p2, p1, v0, p0}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/channels/SelectableChannel;->isRegistered()Z

    move-result v0

    if-nez v0, :cond_3

    iput p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Registering new operation "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p0}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getLastUse()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->lastUse:J

    return-wide v0
.end method

.method public getPeerAddress()Lorg/snmp4j/smi/TcpAddress;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->peerAddress:Lorg/snmp4j/smi/TcpAddress;

    return-object v0
.end method

.method public getReadBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->readBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getSocket()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socket:Ljava/net/Socket;

    return-object v0
.end method

.method public getSocketTimeout()Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socketTimeout:Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;

    return-object v0
.end method

.method public declared-synchronized hasMessage()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->message:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 v0, v0, 0x1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized insertMessages(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->message:Ljava/util/LinkedList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/LinkedList;->addAll(ILjava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized isRegistered(I)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public nextBusyLoop()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->busyLoops:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->busyLoops:I

    return v0
.end method

.method public declared-synchronized nextMessage()[B
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->message:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->message:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized removeRegistration(Ljava/nio/channels/Selector;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/nio/channels/ClosedChannelException;
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    and-int/2addr v0, p2

    if-ne v0, p2, :cond_0

    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    not-int p2, p2

    and-int/2addr p2, v0

    iput p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object p2

    iget v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->registrations:I

    invoke-virtual {p2, p1, v0, p0}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;
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

.method public resetBusyLoops()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->busyLoops:I

    return-void
.end method

.method public setReadBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->readBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public setSocketTimeout(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socketTimeout:Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SocketEntry[peerAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->peerAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",socket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",lastUse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/util/Date;

    iget-wide v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->lastUse:J

    const-wide/32 v4, 0xf4240

    div-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",readBufferPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->readBuffer:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",socketTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->socketTimeout:Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketTimeout;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public used()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->lastUse:J

    return-void
.end method
