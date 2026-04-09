.class public Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/WorkerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DefaultTcpTransportMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "ServerThread"
.end annotation


# instance fields
.field protected buf:[B

.field private lastError:Ljava/lang/Throwable;

.field private pending:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;",
            ">;"
        }
    .end annotation
.end field

.field protected selector:Ljava/nio/channels/Selector;

.field private ssc:Ljava/nio/channels/ServerSocketChannel;

.field private volatile stop:Z

.field final synthetic this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/DefaultTcpTransportMapping;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->lastError:Ljava/lang/Throwable;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->getMaxInboundMessageSize()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->buf:[B

    invoke-static {}, Ljava/nio/channels/Selector;->open()Ljava/nio/channels/Selector;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-static {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$300(Lorg/snmp4j/transport/DefaultTcpTransportMapping;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/nio/channels/ServerSocketChannel;->open()Ljava/nio/channels/ServerSocketChannel;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    new-instance v0, Ljava/net/InetSocketAddress;

    iget-object v1, p1, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v1}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    iget-object v2, p1, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v2}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v1}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->setSocketOptions(Ljava/net/ServerSocket;)V

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v1}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;)V

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Socket bind failed for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :try_start_1
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v1

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Socket close failed after bind failure for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :goto_0
    throw v0

    :cond_0
    :goto_1
    return-void
.end method

.method static synthetic access$200(Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;)Ljava/nio/channels/ServerSocketChannel;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    return-object p0
.end method

.method private closeChannel(Ljava/nio/channels/SelectableChannel;)V
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :goto_0
    return-void
.end method

.method private connectChannel(Ljava/nio/channels/SelectionKey;Lorg/snmp4j/smi/TcpAddress;)V
    .locals 5

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v1

    check-cast v1, Ljava/nio/channels/SocketChannel;

    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->finishConnect()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Connected to "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-static {v1, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$500(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->removeRegistration(Ljava/nio/channels/Selector;I)V

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_0
    move-object v0, v3

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    if-nez p2, :cond_2

    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object p2

    :cond_2
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Fire connected event for "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    new-instance v1, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    const/4 v4, 0x1

    invoke-direct {v1, v2, p2, v4, v3}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p2, v1}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1, p2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p2, p1}, Lorg/snmp4j/transport/TcpTransportMapping;->cancelNonServerSelectionKey(Ljava/nio/channels/SelectionKey;)V

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->closeChannel(Ljava/nio/channels/SelectableChannel;)V

    if-eqz v0, :cond_3

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    return-void
.end method

.method private dispatchMessage(Lorg/snmp4j/smi/TcpAddress;Ljava/nio/ByteBuffer;JLjava/lang/Object;)V
    .locals 8

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received message from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " with length "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    long-to-int v5, p3

    invoke-direct {v3, v4, v1, v5}, Lorg/snmp4j/smi/OctetString;-><init>([BII)V

    invoke-virtual {v3}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v0}, Lorg/snmp4j/transport/AbstractTransportMapping;->isAsyncMsgProcessingSupported()Z

    move-result v0

    if-eqz v0, :cond_1

    long-to-int p3, p3

    new-array p4, p3, [B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-static {p2, v1, p4, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    long-to-int p3, p3

    invoke-static {p2, v1, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p2

    :goto_0
    new-instance p3, Lorg/snmp4j/TransportStateReference;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    sget-object v5, Lorg/snmp4j/security/SecurityLevel;->undefined:Lorg/snmp4j/security/SecurityLevel;

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p3

    move-object v2, p1

    move-object v4, v5

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lorg/snmp4j/TransportStateReference;-><init>(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/SecurityLevel;Lorg/snmp4j/security/SecurityLevel;ZLjava/lang/Object;)V

    iget-object p4, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p4, p1, p2, p3}, Lorg/snmp4j/transport/AbstractTransportMapping;->fireProcessMessage(Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method private processPending()V
    .locals 11

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Socket;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 v4, 0x4

    invoke-virtual {v2, v3, v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto/16 :goto_4

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :catch_0
    move-exception v3

    goto :goto_1

    :catch_1
    move-exception v3

    goto :goto_3

    :cond_0
    iget-object v3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/16 v4, 0x8

    invoke-virtual {v2, v3, v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V
    :try_end_1
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_4

    :goto_1
    :try_start_2
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    invoke-interface {v4, v3}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    iget-object v4, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v4, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    new-instance v10, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v5, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v6

    invoke-static {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->access$400(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)Ljava/util/LinkedList;

    move-result-object v9

    const/4 v7, 0x4

    move-object v4, v10

    move-object v8, v3

    invoke-direct/range {v4 .. v9}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;Ljava/util/List;)V

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v2, v10}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_2
    move-exception v2

    :try_start_4
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    invoke-interface {v4, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :goto_2
    iput-object v3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->lastError:Ljava/lang/Throwable;

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_4

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_3
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    invoke-interface {v4, v3}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    iget-object v3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    new-instance v3, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v5, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v6

    invoke-static {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->access$400(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)Ljava/util/LinkedList;

    move-result-object v9

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;Ljava/util/List;)V

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v2, v3}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_4

    :catch_3
    move-exception v2

    :try_start_6
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_2
    monitor-exit v0

    return-void

    :goto_5
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method

.method private queueNewMessage(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p1}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private writeData(Ljava/nio/channels/SelectionKey;Lorg/snmp4j/smi/TcpAddress;)Lorg/snmp4j/smi/TcpAddress;
    .locals 5

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v1

    check-cast v1, Ljava/nio/channels/SocketChannel;

    new-instance v2, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Socket;->getPort()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/net/InetAddress;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->hasMessage()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-object v3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    iget-object v3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 v4, 0x4

    invoke-virtual {v0, v3, v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->removeRegistration(Ljava/nio/channels/Selector;I)V

    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    invoke-direct {p0, v0, v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->writeMessage(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/nio/channels/SocketChannel;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v2, p2

    move-object p2, v0

    :goto_1
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0, p2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    new-instance v0, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, p2}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p2, v0}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->closeChannel(Ljava/nio/channels/SelectableChannel;)V

    :cond_1
    :goto_2
    return-object v2
.end method

.method private writeMessage(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/nio/channels/SocketChannel;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->nextMessage()[B

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sent message with length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v2, v0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 v0, 0x4

    invoke-virtual {p1, p2, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->removeRegistration(Ljava/nio/channels/Selector;I)V

    invoke-virtual {p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->hasMessage()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->isRegistered(I)Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p1, p2, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    const-string p2, "Waking up selector"

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p1}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v0, v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    :cond_0
    return-void
.end method

.method protected connectSocketToSendMessage(Lorg/snmp4j/smi/Address;[BLjava/net/Socket;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/smi/Address;",
            "[B",
            "Ljava/net/Socket;",
            "Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;",
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p5, p1, p4}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    const-string v1, "\', with "

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p4

    invoke-interface {p4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p4

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Concurrent connection attempt detected, canceling this one to "

    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-interface {p4, p5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    invoke-virtual {v0, p2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addMessage([B)V

    :try_start_0
    invoke-virtual {p3}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Failed to close recently opened socket for \'"

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p3, p4, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Socket;->isConnected()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p0, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->queueNewMessage(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    return-void

    :cond_1
    move-object p4, v0

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Socket;->isConnected()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-static {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->access$400(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)Ljava/util/LinkedList;

    move-result-object p2

    invoke-virtual {p4, p2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->insertMessages(Ljava/util/List;)V

    invoke-interface {p5, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p3

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to close socket for \'"

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-interface {p3, p5, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    invoke-direct {p0, p4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->queueNewMessage(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Trying to connect to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    return-void
.end method

.method public getLastError()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->lastError:Ljava/lang/Throwable;

    return-object v0
.end method

.method public interrupt()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Interrupting worker task: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    return-void
.end method

.method public join()V
    .locals 3

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Joining worker task: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    return-void
.end method

.method protected readMessage(Ljava/nio/channels/SelectionKey;Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v0, v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    :cond_0
    const-string v1, " bytes from "

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->used()V

    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getReadBuffer()Ljava/nio/ByteBuffer;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {p2, v4}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v5

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v6

    invoke-interface {v6}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Read "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    if-ltz v5, :cond_3

    invoke-virtual {v4}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v1

    iget-object v6, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v6, v6, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

    invoke-interface {v6}, Lorg/snmp4j/transport/MessageLengthDecoder;->getMinHeaderLength()I

    move-result v6

    if-ge v1, v6, :cond_3

    :cond_2
    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v0, p1, v3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto :goto_0

    :cond_3
    if-gez v5, :cond_4

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v1, p1, p2, p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketClosedRemotely(Ljava/nio/channels/SelectionKey;Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p2, p3, v0, v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->readSnmpMessagePayload(Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/nio/ByteBuffer;)V

    :goto_0
    if-eqz v5, :cond_5

    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->resetBusyLoops()V

    return v3

    :cond_5
    return v2

    :cond_6
    iget-object v4, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->buf:[B

    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    iget-object v5, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v5, v5, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

    invoke-interface {v5}, Lorg/snmp4j/transport/MessageLengthDecoder;->getMinHeaderLength()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    move-result v5

    const-string v6, "Read channel not open, no bytes read from "

    if-nez v5, :cond_8

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p2, p1}, Lorg/snmp4j/transport/TcpTransportMapping;->cancelNonServerSelectionKey(Ljava/nio/channels/SelectionKey;)V

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_7
    return v2

    :cond_8
    :try_start_0
    invoke-virtual {p2, v4}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v5

    int-to-long v7, v5

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    invoke-interface {v5}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Reading header "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_9
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v1

    iget-object v5, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v5, v5, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

    invoke-interface {v5}, Lorg/snmp4j/transport/MessageLengthDecoder;->getMinHeaderLength()I

    move-result v5

    const-wide/16 v9, 0x0

    if-lt v1, v5, :cond_a

    invoke-virtual {p0, p2, p3, v0, v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->readSnmpMessagePayload(Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/nio/ByteBuffer;)V

    goto :goto_1

    :cond_a
    cmp-long v1, v7, v9

    if-gez v1, :cond_b

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v1, p1, p2, p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketClosedRemotely(Ljava/nio/channels/SelectionKey;Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;)V

    goto :goto_1

    :cond_b
    if-eqz v0, :cond_c

    if-lez v1, :cond_c

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p1, v0, v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->addBufferToReadBuffer(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/nio/ByteBuffer;)V

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v0, p1, v3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto :goto_1

    :cond_c
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No socket entry found for incoming address "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " for incomplete message with length "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_d
    :goto_1
    if-eqz v0, :cond_e

    cmp-long p1, v7, v9

    if-eqz p1, :cond_e

    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->resetBusyLoops()V

    return v3

    :cond_e
    return v2

    :catch_0
    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p2, p1}, Lorg/snmp4j/transport/TcpTransportMapping;->cancelNonServerSelectionKey(Ljava/nio/channels/SelectionKey;)V

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_f
    return v2
.end method

.method protected readSnmpMessagePayload(Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/nio/ByteBuffer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v0, v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->messageLengthDecoder:Lorg/snmp4j/transport/MessageLengthDecoder;

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/transport/MessageLengthDecoder;->getMessageLength(Ljava/nio/ByteBuffer;)Lorg/snmp4j/transport/MessageLength;

    move-result-object v0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Message length is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    invoke-virtual {v0}, Lorg/snmp4j/transport/MessageLength;->getMessageLength()I

    move-result v1

    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->getMaxInboundMessageSize()I

    move-result v2

    if-gt v1, v2, :cond_b

    invoke-virtual {v0}, Lorg/snmp4j/transport/MessageLength;->getMessageLength()I

    move-result v1

    if-gtz v1, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v0}, Lorg/snmp4j/transport/MessageLength;->getMessageLength()I

    move-result v0

    invoke-virtual {p4}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-ge v1, v0, :cond_5

    invoke-virtual {p4}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    if-ge v1, v0, :cond_3

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Extending message buffer size according to message length to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    new-array v1, v0, [B

    invoke-virtual {p4}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    const/4 v3, 0x0

    invoke-virtual {p4, v1, v3, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p4

    invoke-virtual {p4, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    if-eqz p3, :cond_4

    invoke-virtual {p4, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p3, p4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->setReadBuffer(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p4, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_4
    :goto_0
    invoke-virtual {p1, p4}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    :cond_5
    move-object v3, p4

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result p1

    int-to-long v4, p1

    int-to-long v0, v0

    cmp-long p1, v4, v0

    if-ltz p1, :cond_8

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Message completed with "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " bytes and "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " buffer limit"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p1, p4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_6
    if-eqz p3, :cond_7

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->setReadBuffer(Ljava/nio/ByteBuffer;)V

    :cond_7
    move-object v1, p0

    move-object v2, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->dispatchMessage(Lorg/snmp4j/smi/TcpAddress;Ljava/nio/ByteBuffer;JLjava/lang/Object;)V

    goto :goto_1

    :cond_8
    if-eqz p3, :cond_a

    invoke-virtual {p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getReadBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    if-eq v3, p1, :cond_a

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Adding buffer content to read buffer of entry "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, ", buffer "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_9
    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p1, p3, v3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->addBufferToReadBuffer(Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;Ljava/nio/ByteBuffer;)V

    :cond_a
    :goto_1
    if-eqz p3, :cond_c

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 p2, 0x1

    invoke-virtual {p3, p1, p2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto :goto_3

    :cond_b
    :goto_2
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Received message length "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, " is greater than inboundBufferSize "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {p4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->getMaxInboundMessageSize()I

    move-result p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    if-eqz p3, :cond_c

    invoke-virtual {p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Socket to "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " closed due to an error"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_c
    :goto_3
    return-void
.end method

.method public run()V
    .locals 11

    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-boolean v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_9

    :try_start_1
    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v2}, Ljava/nio/channels/Selector;->select()I

    move-result v2

    if-lez v2, :cond_8

    iget-boolean v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v2}, Ljava/nio/channels/Selector;->selectedKeys()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v3, :cond_8

    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/channels/SelectionKey;

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->isAcceptable()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "Key is acceptable"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v4

    check-cast v4, Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v4}, Ljava/nio/channels/ServerSocketChannel;->accept()Ljava/nio/channels/SocketChannel;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    new-instance v6, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v4}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v7

    invoke-virtual {v4}, Ljava/net/Socket;->getPort()I

    move-result v8

    invoke-direct {v6, v7, v8}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/net/InetAddress;I)V

    new-instance v7, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    iget-object v8, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-direct {v7, v8, v6, v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;-><init>(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/smi/TcpAddress;Ljava/net/Socket;)V

    iget-object v8, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v7, v8, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    iget-object v8, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v8, v8, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    invoke-interface {v8, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-static {v8, v7}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$500(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;)V

    new-instance v7, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v8, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-direct {v7, v8, v6, v0, v1}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object v8, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v8, v7}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V

    invoke-virtual {v7}, Lorg/snmp4j/transport/TransportStateEvent;->isCancelled()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    const-string v7, "Incoming connection cancelled"

    invoke-interface {v5, v7}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    invoke-virtual {v4}, Ljava/net/Socket;->close()V

    iget-object v4, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v4, v6}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;

    goto :goto_2

    :catch_0
    move-exception v2

    goto/16 :goto_6

    :catch_1
    move-exception v2

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->isWritable()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "Key is writable"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-direct {p0, v3, v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->writeData(Ljava/nio/channels/SelectionKey;Lorg/snmp4j/smi/TcpAddress;)Lorg/snmp4j/smi/TcpAddress;

    move-result-object v6

    :goto_2
    move-object v5, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->isReadable()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "Key is readable"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/nio/channels/SocketChannel;

    new-instance v6, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v5}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v4

    invoke-virtual {v5}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v7

    invoke-virtual {v7}, Ljava/net/Socket;->getPort()I

    move-result v7

    invoke-direct {v6, v4, v7}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/net/InetAddress;I)V

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->isConnectable()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "Key is connectable"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-direct {p0, v3, v1}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->connectChannel(Ljava/nio/channels/SelectionKey;Lorg/snmp4j/smi/TcpAddress;)V

    :cond_5
    move-object v5, v1

    move-object v6, v5

    :cond_6
    :goto_3
    if-eqz v5, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v7, "Key is reading"

    invoke-interface {v4, v7}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_2
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {p0, v3, v5, v6}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->readMessage(Ljava/nio/channels/SelectionKey;Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    if-eqz v4, :cond_1

    iget-object v7, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v7}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->getMaxBusyLoops()I

    move-result v7

    if-lez v7, :cond_1

    invoke-virtual {v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->nextBusyLoop()I

    move-result v7

    iget-object v8, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v8}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->getMaxBusyLoops()I

    move-result v8

    if-le v7, v8, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v8

    invoke-interface {v8}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "After "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " read key has been removed: "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v7}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_7
    iget-object v7, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v4, v7, v0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->removeRegistration(Ljava/nio/channels/Selector;I)V

    invoke-virtual {v4}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->resetBusyLoops()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1

    :catch_2
    :try_start_4
    iget-object v4, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    invoke-virtual {v4, v3, v5, v6}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->socketClosedRemotely(Ljava/nio/channels/SelectionKey;Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;)V
    :try_end_4
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_1

    :catch_3
    :try_start_5
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    const-string v4, "Selection key cancelled, skipping it"

    invoke-interface {v3, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_1

    :goto_4
    :try_start_6
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    const-string v3, "NullPointerException within select()?"

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    iput-boolean v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z

    :cond_8
    invoke-direct {p0}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->processPending()V

    goto/16 :goto_0

    :cond_9
    :goto_5
    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    :cond_a
    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/nio/channels/Selector;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_7

    :goto_6
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    iput-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->lastError:Ljava/lang/Throwable;

    :cond_b
    :goto_7
    iget-boolean v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z

    if-nez v2, :cond_c

    iput-boolean v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    monitor-enter v0

    :try_start_7
    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iput-object v1, v2, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->server:Lorg/snmp4j/util/WorkerTask;

    monitor-exit v0

    goto :goto_8

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v1

    :cond_c
    :goto_8
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Worker task finished: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_d
    return-void
.end method

.method public sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object p3, p3, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Looking up connection for destination \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' returned: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object v1, v1, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    if-eqz p3, :cond_1

    monitor-enter p3

    :try_start_0
    invoke-virtual {p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->used()V

    invoke-virtual {p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v0

    monitor-exit p3

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Ljava/net/Socket;->isConnected()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p3, p2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addMessage([B)V

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter v1

    :try_start_1
    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {p1, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    const-string p2, "Waking up selector for new message"

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p1}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    goto/16 :goto_4

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_3
    :goto_1
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Socket for address \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\' is closed, opening it..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_4
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter v1

    :try_start_3
    iget-object v2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v2, p3}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    new-instance p3, Ljava/net/InetSocketAddress;

    move-object v1, p1

    check-cast v1, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v1}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v2}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v2

    invoke-direct {p3, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isConnectionPending()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0, p3}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_6
    :goto_2
    invoke-static {}, Ljava/nio/channels/SocketChannel;->open()Ljava/nio/channels/SocketChannel;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    invoke-virtual {v0, p3}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    :cond_7
    :goto_3
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object p3

    new-instance v0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    move-object v2, p1

    check-cast v2, Lorg/snmp4j/smi/TcpAddress;

    invoke-direct {v0, v1, v2, p3}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;-><init>(Lorg/snmp4j/transport/DefaultTcpTransportMapping;Lorg/snmp4j/smi/TcpAddress;Ljava/net/Socket;)V

    invoke-virtual {v0, p2}, Lorg/snmp4j/transport/DefaultTcpTransportMapping$SocketEntry;->addMessage([B)V

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->this$0:Lorg/snmp4j/transport/DefaultTcpTransportMapping;

    iget-object p2, p2, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->sockets:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    iget-object p3, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {p3, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    iget-object p2, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p2}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Trying to connect to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :goto_4
    return-void

    :catchall_2
    move-exception p1

    :try_start_7
    monitor-exit p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    :goto_5
    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    throw p1

    :catchall_3
    move-exception p1

    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    throw p1
.end method

.method public terminate()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DefaultTcpTransportMapping$ServerThread;->stop:Z

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultTcpTransportMapping;->access$000()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Terminated worker task: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    return-void
.end method
