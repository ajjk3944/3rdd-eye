.class Lorg/snmp4j/transport/TLSTM$ServerThread;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/WorkerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/TLSTM;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ServerThread"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private inQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lorg/snmp4j/transport/TLSTM$SocketEntry;",
            ">;"
        }
    .end annotation
.end field

.field private lastError:Ljava/lang/Throwable;

.field private outQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lorg/snmp4j/transport/TLSTM$SocketEntry;",
            ">;"
        }
    .end annotation
.end field

.field private pending:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lorg/snmp4j/transport/TLSTM$SocketEntry;",
            ">;"
        }
    .end annotation
.end field

.field private selector:Ljava/nio/channels/Selector;

.field private ssc:Ljava/nio/channels/ServerSocketChannel;

.field private volatile stop:Z

.field final synthetic this$0:Lorg/snmp4j/transport/TLSTM;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/transport/TLSTM;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->lastError:Ljava/lang/Throwable;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    new-instance v1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->outQueue:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-static {}, Ljava/nio/channels/Selector;->open()Ljava/nio/channels/Selector;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM;->access$1000(Lorg/snmp4j/transport/TLSTM;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/nio/channels/ServerSocketChannel;->open()Ljava/nio/channels/ServerSocketChannel;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v1, v0}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    new-instance v0, Ljava/net/InetSocketAddress;

    iget-object v1, p1, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v1}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    iget-object v2, p1, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v2}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {v1}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/snmp4j/transport/TLSTM;->setSocketOptions(Ljava/net/ServerSocket;)V

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    invoke-virtual {p1}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;)V

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;

    :cond_0
    return-void
.end method

.method static synthetic access$100(Lorg/snmp4j/transport/TLSTM$ServerThread;)Ljava/nio/channels/ServerSocketChannel;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

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

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :goto_0
    return-void
.end method

.method private connectChannel(Ljava/nio/channels/SelectionKey;Lorg/snmp4j/smi/TcpAddress;)V
    .locals 5

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/TLSTM$SocketEntry;

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

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Connected to "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v1, v0}, Lorg/snmp4j/transport/TLSTM;->access$2200(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)V

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->removeRegistration(Ljava/nio/channels/Selector;I)V

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

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

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object p2

    :cond_2
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    const/4 v4, 0x1

    invoke-direct {v1, v2, p2, v4, v3}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {p2, v1}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1, p2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->closeChannel(Ljava/nio/channels/SelectableChannel;)V

    if-eqz v0, :cond_3

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    return-void
.end method

.method private createBufferCopy(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 3

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object p1
.end method

.method private dispatchMessage(Lorg/snmp4j/smi/TcpAddress;Ljava/nio/ByteBuffer;JLjava/lang/Object;Lorg/snmp4j/TransportStateReference;)V
    .locals 5

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p5

    invoke-interface {p5}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p5

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received message from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    long-to-int v4, p3

    invoke-direct {v2, v3, v0, v4}, Lorg/snmp4j/smi/OctetString;-><init>([BII)V

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p5, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    iget-object p5, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {p5}, Lorg/snmp4j/transport/AbstractTransportMapping;->isAsyncMsgProcessingSupported()Z

    move-result p5

    if-eqz p5, :cond_1

    long-to-int p3, p3

    new-array p4, p3, [B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-static {p2, v0, p4, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    long-to-int p3, p3

    invoke-static {p2, v0, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p2

    :goto_0
    iget-object p3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {p3, p1, p2, p6}, Lorg/snmp4j/transport/AbstractTransportMapping;->fireProcessMessage(Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method private isConnectionClosed(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/io/IOException;)Z
    .locals 4

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1400(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngine;

    move-result-object v0

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->isEngineClosed(Ljavax/net/ssl/SSLEngine;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TLS connection to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1800(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/snmp4j/transport/TLSTM$ServerThread;->closeChannel(Ljava/nio/channels/SelectableChannel;)V

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/transport/TLSTM;->removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    new-instance v1, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object p1

    const/4 v3, 0x4

    invoke-direct {v1, v2, p1, v3, p2}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private processPending()V
    .locals 7

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    if-ge v1, v2, :cond_5

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    invoke-virtual {v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->hasMessage()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Idle socket entry removed from pending message queue: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto/16 :goto_6

    :cond_0
    :goto_1
    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_5

    :cond_1
    const/4 v3, 0x4

    :try_start_1
    invoke-virtual {v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Socket;->isConnected()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->isHandshakeFinished()Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v2, v4, v3}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto/16 :goto_5

    :catch_0
    move-exception v4

    goto :goto_2

    :catch_1
    move-exception v4

    goto :goto_4

    :cond_2
    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/16 v5, 0x8

    invoke-virtual {v2, v4, v5}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V
    :try_end_1
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_2
    :try_start_2
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    invoke-interface {v5, v4}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    iget-object v5, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v5, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    new-instance v5, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v6, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    invoke-direct {v5, v6, v2, v3, v4}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {v2, v5}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catch_2
    move-exception v2

    :try_start_4
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :goto_3
    iput-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->lastError:Ljava/lang/Throwable;

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_5

    :cond_3
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_4
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    invoke-interface {v5, v4}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v4, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    new-instance v4, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v5, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v2

    const/4 v6, 0x0

    invoke-direct {v4, v5, v2, v3, v6}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {v2, v4}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_5

    :catch_3
    move-exception v2

    :try_start_6
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :cond_4
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_5
    monitor-exit v0

    return-void

    :goto_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method

.method private declared-synchronized processQueues()V
    .locals 12

    monitor-enter p0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_2
    :goto_0
    :try_start_1
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    :try_start_2
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/TLSTM$SocketEntry;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v2, v0}, Lorg/snmp4j/transport/TLSTM;->access$700(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v2, v0}, Lorg/snmp4j/transport/TLSTM$ServerThread;->runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;Lorg/snmp4j/transport/TLSTM$SocketEntry;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->isAppOutPending()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lorg/snmp4j/transport/TLSTM$ServerThread;->writeMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/channels/SocketChannel;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_3

    :cond_3
    :goto_1
    invoke-direct {p0, v0, v1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->isConnectionClosed(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/io/IOException;)Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_2
    move-exception v0

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_3

    :goto_2
    :try_start_4
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SSL processing interrupted: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :goto_3
    :try_start_5
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IO exception caught while SSL processing: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :goto_4
    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_4

    :cond_4
    :goto_5
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v0, :cond_0

    :try_start_6
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/TLSTM$SocketEntry;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1100(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getInNetBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v3

    const/4 v4, 0x1

    if-lez v3, :cond_a

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "TLS inNetBuffer = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1400(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngine;

    move-result-object v3

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Ljavax/net/ssl/SSLEngine;->unwrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object v3

    iget-object v5, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v5, v0, v3}, Lorg/snmp4j/transport/TLSTM;->access$1500(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljavax/net/ssl/SSLEngineResult;)V

    invoke-virtual {p0, v3, v0}, Lorg/snmp4j/transport/TLSTM$ServerThread;->runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;Lorg/snmp4j/transport/TLSTM$SocketEntry;)Z

    move-result v5

    if-eqz v5, :cond_c

    sget-object v5, Lorg/snmp4j/transport/TLSTM$1;->$SwitchMap$javax$net$ssl$SSLEngineResult$Status:[I

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    if-eq v3, v4, :cond_9

    const/4 v4, 0x3

    if-eq v3, v4, :cond_8

    const/4 v4, 0x4

    if-eq v3, v4, :cond_5

    goto/16 :goto_7

    :cond_5
    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->isAppOutPending()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v3

    invoke-direct {p0, v0, v3}, Lorg/snmp4j/transport/TLSTM$ServerThread;->writeMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/channels/SocketChannel;)V

    goto :goto_6

    :catchall_1
    move-exception v3

    goto/16 :goto_8

    :cond_6
    :goto_6
    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Dispatching inAppBuffer="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    move-result v3

    if-lez v3, :cond_7

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v5

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    move-result v3

    int-to-long v7, v3

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1600(Lorg/snmp4j/transport/TLSTM$SocketEntry;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Lorg/snmp4j/TransportStateReference;

    move-result-object v10

    move-object v4, p0

    invoke-direct/range {v4 .. v10}, Lorg/snmp4j/transport/TLSTM$ServerThread;->dispatchMessage(Lorg/snmp4j/smi/TcpAddress;Ljava/nio/ByteBuffer;JLjava/lang/Object;Lorg/snmp4j/TransportStateReference;)V

    :cond_7
    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_7

    :cond_8
    invoke-direct {p0, v0, v1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->isConnectionClosed(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/io/IOException;)Z

    monitor-exit v2

    goto/16 :goto_5

    :cond_9
    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v0, v3, v4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto :goto_7

    :cond_a
    invoke-direct {p0, v0, v1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->isConnectionClosed(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/io/IOException;)Z

    move-result v3

    if-eqz v3, :cond_b

    monitor-exit v2

    goto/16 :goto_5

    :cond_b
    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v0, v3, v4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    :cond_c
    :goto_7
    monitor-exit v2

    goto/16 :goto_5

    :goto_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw v3
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :catch_3
    move-exception v0

    goto :goto_9

    :catch_4
    move-exception v2

    goto :goto_a

    :catch_5
    move-exception v2

    move-object v0, v1

    goto :goto_a

    :goto_9
    :try_start_a
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SSL processing interrupted: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    monitor-exit p0

    return-void

    :goto_a
    :try_start_b
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "IO exception caught while SSL processing: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :goto_b
    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v3, v0}, Ljava/util/concurrent/BlockingQueue;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_b

    :cond_d
    invoke-direct {p0, v0, v2}, Lorg/snmp4j/transport/TLSTM$ServerThread;->isConnectionClosed(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/io/IOException;)Z

    goto/16 :goto_5

    :goto_c
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    throw v0
.end method

.method private queueNewMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

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

.method private readMessage(Ljava/nio/channels/SelectionKey;Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;Lorg/snmp4j/transport/TLSTM$SocketEntry;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p4, v0

    :goto_0
    if-nez p4, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    const-string v1, "SocketEntry null in readMessage"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    :cond_1
    invoke-virtual {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->used()V

    invoke-virtual {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getInNetBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getInAppBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    :try_start_0
    invoke-virtual {p2, v0}, Ljava/nio/channels/SocketChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v1

    int-to-long v1, v1

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    invoke-interface {v4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Read "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " bytes from "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "TLS inNetBuffer: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    const-wide/16 v4, 0x0

    cmp-long v1, v1, v4

    const/4 v2, 0x2

    if-gez v1, :cond_3

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p4

    const-string v0, "Socket closed remotely"

    invoke-interface {p4, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    new-instance p2, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object p4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    const/4 v0, 0x0

    invoke-direct {p2, p4, p3, v2, v0}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object p4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {p4, p2}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V

    return-void

    :cond_3
    if-lez v1, :cond_c

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1100(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/lang/Object;

    move-result-object p2

    monitor-enter p2
    :try_end_0
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_4
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1400(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngine;

    move-result-object v1

    invoke-virtual {v1, v0, v3}, Ljavax/net/ssl/SSLEngine;->unwrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object v1

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v4, p4, v1}, Lorg/snmp4j/transport/TLSTM;->access$1500(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljavax/net/ssl/SSLEngineResult;)V

    sget-object v4, Lorg/snmp4j/transport/TLSTM$1;->$SwitchMap$javax$net$ssl$SSLEngineResult$Status:[I

    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v2, :cond_b

    invoke-virtual {p0, v1, p4}, Lorg/snmp4j/transport/TLSTM$ServerThread;->runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;Lorg/snmp4j/transport/TLSTM$SocketEntry;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->bytesProduced()I

    move-result v1

    if-lez v1, :cond_8

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Reading inappBuffer="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_1

    :catchall_0
    move-exception p4

    goto/16 :goto_5

    :cond_5
    :goto_1
    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v4}, Lorg/snmp4j/transport/TLSTM;->access$2400(Lorg/snmp4j/transport/TLSTM;)I

    move-result v4

    rem-int/2addr v1, v4

    if-nez v1, :cond_7

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Checking PDU header for fragmented message: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_6
    :try_start_2
    new-instance v1, Lorg/snmp4j/asn1/BERInputStream;

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-direct {v1, v4}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    new-instance v4, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v4}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    const/4 v5, 0x1

    invoke-static {v1, v4, v5}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;Z)I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_3
    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    invoke-interface {v4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Waiting for rest of packet because: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", inAppBuffer="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_3

    :cond_7
    :goto_2
    invoke-virtual {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->checkTransportStateReference()V

    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    move-result v0

    int-to-long v4, v0

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1600(Lorg/snmp4j/transport/TLSTM$SocketEntry;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Lorg/snmp4j/TransportStateReference;

    move-result-object v7

    move-object v1, p0

    move-object v2, p3

    invoke-direct/range {v1 .. v7}, Lorg/snmp4j/transport/TLSTM$ServerThread;->dispatchMessage(Lorg/snmp4j/smi/TcpAddress;Ljava/nio/ByteBuffer;JLjava/lang/Object;Lorg/snmp4j/TransportStateReference;)V

    invoke-virtual {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getInAppBuffer()Ljava/nio/ByteBuffer;

    move-result-object p4

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_4

    :cond_8
    invoke-virtual {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->isAppOutPending()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v1

    invoke-direct {p0, p4, v1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->writeMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/channels/SocketChannel;)V

    :cond_9
    :goto_3
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-lez v1, :cond_a

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-gtz v1, :cond_4

    :cond_a
    :goto_4
    monitor-exit p2

    goto :goto_6

    :cond_b
    new-instance p4, Ljava/io/IOException;

    const-string v0, "BUFFER_OVERFLOW"

    invoke-direct {p4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p4

    :goto_5
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p4
    :try_end_4
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Read channel not open, no bytes read from "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_c
    :goto_6
    return-void
.end method

.method private writeData(Ljava/nio/channels/SelectionKey;Lorg/snmp4j/smi/TcpAddress;)Lorg/snmp4j/smi/TcpAddress;
    .locals 5

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/TLSTM$SocketEntry;

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
    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->hasMessage()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 v4, 0x4

    invoke-virtual {v0, v3, v4}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->removeRegistration(Ljava/nio/channels/Selector;I)V

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

    invoke-direct {p0, v0, v1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->writeMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/channels/SocketChannel;)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Key was writable for incoming address "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but SocketEntry is null, key is canceled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v2, p2

    move-object p2, v0

    :goto_1
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0, p2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    new-instance v0, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, p2}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {p2, v0}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->closeChannel(Ljava/nio/channels/SelectableChannel;)V

    :goto_2
    return-object v2
.end method

.method private writeMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/channels/SocketChannel;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2500(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :goto_0
    :try_start_0
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2600(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->nextMessage()[B

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {p1, v3}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2602(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Sending message with length "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v5, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getPeerAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v5, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v5, v1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v5}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :goto_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_1
    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    const/4 v1, 0x4

    invoke-virtual {p1, p2, v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->removeRegistration(Ljava/nio/channels/Selector;I)V

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->hasMessage()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1, v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->isRegistered(I)Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p1, p2, v1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    const-string v1, "Waking up selector"

    invoke-interface {p2, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p2}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    :cond_2
    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p1, p2, v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    monitor-exit v0

    return-void

    :cond_3
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2600(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    :goto_2
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1400(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngine;

    move-result-object v3

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2600(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljavax/net/ssl/SSLEngine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object v3

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v4

    sget-object v5, Ljavax/net/ssl/SSLEngineResult$Status;->OK:Ljavax/net/ssl/SSLEngineResult$Status;

    if-ne v4, v5, :cond_5

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->bytesProduced()I

    move-result v4

    if-lez v4, :cond_4

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {v4, p1, p2}, Lorg/snmp4j/transport/TLSTM;->writeNetBuffer(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/channels/SocketChannel;)V

    goto :goto_3

    :cond_4
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    invoke-interface {v4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SSL Engine status of wrap is ok, but 0 NET bytes produced, handshake status is "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_5
    :goto_3
    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v4

    sget-object v5, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_TASK:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-ne v4, v5, :cond_6

    invoke-virtual {p0, v3, p1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;Lorg/snmp4j/transport/TLSTM$SocketEntry;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "SSL session OK"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_6
    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->bytesConsumed()I

    move-result v4

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2600(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v5

    sub-int/2addr v5, v1

    if-lt v4, v5, :cond_7

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    const-string v1, "Payload sent completely"

    invoke-interface {p2, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$2602(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->bytesConsumed()I

    move-result v1

    if-lez v1, :cond_8

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Fragment of size "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngineResult;->bytesConsumed()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " sent: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto/16 :goto_0

    :cond_8
    :goto_4
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Message sent for "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p1, p2, v2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    return-void

    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$2300(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/util/WorkerTask;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    :cond_0
    return-void
.end method

.method protected connectSocketToSendMessage(Lorg/snmp4j/smi/Address;[BLjava/net/Socket;Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/smi/Address;",
            "[B",
            "Ljava/net/Socket;",
            "Lorg/snmp4j/transport/TLSTM$SocketEntry;",
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/transport/TLSTM$SocketEntry;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p5, p1, p4}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    const-string v1, "\', with "

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p4

    invoke-interface {p4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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
    invoke-virtual {v0, p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addMessage([B)V

    :try_start_0
    invoke-virtual {p3}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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
    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Socket;->isConnected()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p0, v0}, Lorg/snmp4j/transport/TLSTM$ServerThread;->queueNewMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;)V

    return-void

    :cond_1
    move-object p4, v0

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Socket;->isConnected()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1900(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/util/LinkedList;

    move-result-object p2

    invoke-virtual {p4, p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->insertMessages(Ljava/util/List;)V

    invoke-interface {p5, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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
    invoke-direct {p0, p4}, Lorg/snmp4j/transport/TLSTM$ServerThread;->queueNewMessage(Lorg/snmp4j/transport/TLSTM$SocketEntry;)V

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->lastError:Ljava/lang/Throwable;

    return-object v0
.end method

.method public interrupt()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    return-void
.end method

.method public join()V
    .locals 3

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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

.method public run()V
    .locals 14

    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-boolean v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_8

    :try_start_1
    invoke-direct {p0}, Lorg/snmp4j/transport/TLSTM$ServerThread;->processQueues()V

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v2}, Ljava/nio/channels/Selector;->select()I

    move-result v2

    if-lez v2, :cond_7

    iget-boolean v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

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

    if-eqz v3, :cond_7

    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/channels/SelectionKey;

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->isAcceptable()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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

    move-result-object v11

    const/4 v5, 0x0

    invoke-virtual {v11, v5}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    new-instance v12, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v4}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v5

    invoke-virtual {v4}, Ljava/net/Socket;->getPort()I

    move-result v6

    invoke-direct {v12, v5, v6}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/net/InetAddress;I)V

    new-instance v13, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    iget-object v6, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v13

    move-object v7, v12

    move-object v8, v4

    invoke-direct/range {v5 .. v10}, Lorg/snmp4j/transport/TLSTM$SocketEntry;-><init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/smi/TcpAddress;Ljava/net/Socket;ZLorg/snmp4j/TransportStateReference;)V

    iget-object v5, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {v13, v5, v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    iget-object v5, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v5}, Lorg/snmp4j/transport/TLSTM;->access$2000(Lorg/snmp4j/transport/TLSTM;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v5, v13}, Lorg/snmp4j/transport/TLSTM;->access$2200(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)V

    new-instance v5, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v6, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-direct {v5, v6, v12, v0, v1}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object v6, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {v6, v5}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V

    invoke-virtual {v5}, Lorg/snmp4j/transport/TransportStateEvent;->isCancelled()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    const-string v6, "Incoming connection cancelled"

    invoke-interface {v5, v6}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    invoke-virtual {v4}, Ljava/net/Socket;->close()V

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {v4, v12}, Lorg/snmp4j/transport/TLSTM;->removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;

    move-object v11, v1

    goto :goto_2

    :catch_0
    move-exception v2

    goto/16 :goto_6

    :catch_1
    move-exception v2

    goto/16 :goto_4

    :catch_2
    move-exception v3

    goto/16 :goto_3

    :cond_2
    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->isWritable()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "Key is writable"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-direct {p0, v3, v1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->writeData(Ljava/nio/channels/SelectionKey;Lorg/snmp4j/smi/TcpAddress;)Lorg/snmp4j/smi/TcpAddress;

    move-result-object v12

    move-object v11, v1

    move-object v13, v11

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->isReadable()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "Key is readable"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/nio/channels/SocketChannel;

    new-instance v12, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v11}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v4

    invoke-virtual {v11}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/Socket;->getPort()I

    move-result v5

    invoke-direct {v12, v4, v5}, Lorg/snmp4j/smi/TcpAddress;-><init>(Ljava/net/InetAddress;I)V

    move-object v13, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->isConnectable()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "Key is connectable"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-direct {p0, v3, v1}, Lorg/snmp4j/transport/TLSTM$ServerThread;->connectChannel(Ljava/nio/channels/SelectionKey;Lorg/snmp4j/smi/TcpAddress;)V

    :cond_5
    move-object v11, v1

    move-object v12, v11

    move-object v13, v12

    :cond_6
    :goto_2
    if-eqz v11, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    const-string v5, "Key is reading"

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_2
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-direct {p0, v3, v11, v12, v13}, Lorg/snmp4j/transport/TLSTM$ServerThread;->readMessage(Ljava/nio/channels/SelectionKey;Ljava/nio/channels/SocketChannel;Lorg/snmp4j/smi/TcpAddress;Lorg/snmp4j/transport/TLSTM$SocketEntry;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1

    :catch_3
    move-exception v4

    :try_start_4
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    invoke-interface {v5, v4}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-virtual {v3}, Ljava/nio/channels/SelectionKey;->cancel()V

    invoke-virtual {v11}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    new-instance v3, Lorg/snmp4j/transport/TransportStateEvent;

    iget-object v5, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    const/4 v6, 0x2

    invoke-direct {v3, v5, v12, v6, v4}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    iget-object v4, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {v4, v3}, Lorg/snmp4j/transport/TcpTransportMapping;->fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    :try_end_4
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_1

    :goto_3
    :try_start_5
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "NoSuchAlgorithm while reading from server socket: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    :catch_4
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    const-string v3, "NullPointerException within select()?"

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    iput-boolean v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z

    :cond_7
    invoke-direct {p0}, Lorg/snmp4j/transport/TLSTM$ServerThread;->processPending()V

    goto/16 :goto_0

    :cond_8
    :goto_5
    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->ssc:Ljava/nio/channels/ServerSocketChannel;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    :cond_9
    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/nio/channels/Selector;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_7

    :goto_6
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3, v2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    iput-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->lastError:Ljava/lang/Throwable;

    :cond_a
    :goto_7
    iget-boolean v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z

    if-nez v2, :cond_b

    iput-boolean v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    monitor-enter v0

    :try_start_7
    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v2, v1}, Lorg/snmp4j/transport/TLSTM;->access$2302(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/util/WorkerTask;)Lorg/snmp4j/util/WorkerTask;

    monitor-exit v0

    goto :goto_8

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v1

    :cond_b
    :goto_8
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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

    :cond_c
    return-void
.end method

.method public runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;Lorg/snmp4j/transport/TLSTM$SocketEntry;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Running delegated task on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_TASK:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-ne v0, v1, :cond_3

    :goto_0
    invoke-static {p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1400(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngine;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getDelegatedTask()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    const-string v2, "Running delegated task..."

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1400(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngine;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_TASK:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    if-eq v0, v1, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Handshake status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Inconsistent Handshake status"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    sget-object v1, Lorg/snmp4j/transport/TLSTM$1;->$SwitchMap$javax$net$ssl$SSLEngineResult$Status:[I

    invoke-virtual {p1}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_b

    const/4 v4, 0x3

    if-eq v1, v4, :cond_a

    sget-object v1, Lorg/snmp4j/transport/TLSTM$1;->$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v3, :cond_9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    if-eq v0, v4, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_5

    goto :goto_2

    :cond_4
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    const-string v1, "TLS handshake finished"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-virtual {p2, v3}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->setHandshakeFinished(Z)V

    :cond_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLEngineResult;->bytesProduced()I

    move-result p1

    if-lez p1, :cond_6

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-virtual {p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/snmp4j/transport/TLSTM;->writeNetBuffer(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/channels/SocketChannel;)V

    :cond_6
    return v3

    :cond_7
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NEED_UNRWAP processing with inNetBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_8
    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->inQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {p1, p2}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p2, p1, v3}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    goto :goto_2

    :cond_9
    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->outQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {p1, p2}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_2
    return v2

    :cond_b
    invoke-static {p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-static {p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p2, p1, v3}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addRegistration(Ljava/nio/channels/Selector;I)V

    return v2
.end method

.method public sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$2000(Lorg/snmp4j/transport/TLSTM;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Looking up connection for destination \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\' returned: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v2}, Lorg/snmp4j/transport/TLSTM;->access$2000(Lorg/snmp4j/transport/TLSTM;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    if-eqz v0, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lorg/snmp4j/TransportStateReference;->getSessionID()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p3}, Lorg/snmp4j/TransportStateReference;->getSessionID()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSessionID()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM;->access$200(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/mp/CounterSupport;

    move-result-object p1

    new-instance p2, Lorg/snmp4j/event/CounterEvent;

    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionNoSessions:Lorg/snmp4j/smi/OID;

    invoke-direct {p2, p0, v0}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p1, p2}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Session "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lorg/snmp4j/TransportStateReference;->getSessionID()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " not available"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->getSocket()Ljava/net/Socket;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v1}, Ljava/net/Socket;->isConnected()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Lorg/snmp4j/TransportStateReference;

    move-result-object v1

    invoke-static {p1, p3, v1}, Lorg/snmp4j/transport/TLSTM;->access$2100(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/TransportStateReference;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v0, p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addMessage([B)V

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {p2, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    const-string p2, "Waking up selector for new message"

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    iget-object p1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p1}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    goto/16 :goto_6

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2

    :cond_5
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TransportStateReferences refNew="

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ",refOld="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Lorg/snmp4j/TransportStateReference;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " do not match, message dropped"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "Transport state reference does not match existing reference for this session/target"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Socket for address \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\' is closed, opening it..."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_7
    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter v2

    :try_start_2
    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    new-instance v2, Ljava/net/InetSocketAddress;

    move-object v3, p1

    check-cast v3, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v3}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    move-object v4, p1

    check-cast v4, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v4}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v4

    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    const/4 v3, 0x0

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    move-result v4

    if-eqz v4, :cond_8

    goto/16 :goto_3

    :cond_8
    invoke-virtual {v1}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->isConnectionPending()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v1, v2}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$200(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    new-instance v2, Lorg/snmp4j/event/CounterEvent;

    sget-object v3, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpens:Lorg/snmp4j/smi/OID;

    invoke-direct {v2, p0, v3}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v2}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    goto :goto_4

    :catch_0
    move-exception p2

    goto/16 :goto_5

    :catch_1
    move-exception p1

    goto/16 :goto_7

    :cond_9
    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Lorg/snmp4j/TransportStateReference;

    move-result-object v2

    invoke-static {v1, p3, v2}, Lorg/snmp4j/transport/TLSTM;->access$2100(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/TransportStateReference;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0, p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addMessage([B)V

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter p2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_0

    :try_start_4
    iget-object p3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {p3, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p2}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_5 .. :try_end_5} :catch_0

    return-void

    :catchall_1
    move-exception p3

    :try_start_6
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    throw p3

    :cond_a
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TransportStateReferences refNew="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ",refOld="

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->access$1700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Lorg/snmp4j/TransportStateReference;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " do not match, message dropped"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance p2, Ljava/io/IOException;

    const-string p3, "Transport state reference does not match existing reference for this session/target"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    :goto_3
    invoke-static {}, Ljava/nio/channels/SocketChannel;->open()Ljava/nio/channels/SocketChannel;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    invoke-virtual {v1, v2}, Ljava/nio/channels/SocketChannel;->connect(Ljava/net/SocketAddress;)Z

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$200(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    new-instance v2, Lorg/snmp4j/event/CounterEvent;

    sget-object v3, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionOpens:Lorg/snmp4j/smi/OID;

    invoke-direct {v2, p0, v3}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v2}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    :goto_4
    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    move-result-object v5

    new-instance v0, Lorg/snmp4j/transport/TLSTM$SocketEntry;

    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    move-object v4, p1

    check-cast v4, Lorg/snmp4j/smi/TcpAddress;

    const/4 v6, 0x1

    move-object v2, v0

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lorg/snmp4j/transport/TLSTM$SocketEntry;-><init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/smi/TcpAddress;Ljava/net/Socket;ZLorg/snmp4j/TransportStateReference;)V

    invoke-virtual {v0, p2}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->addMessage([B)V

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {p2}, Lorg/snmp4j/transport/TLSTM;->access$2000(Lorg/snmp4j/transport/TLSTM;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    monitor-enter p2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_7 .. :try_end_7} :catch_0

    :try_start_8
    iget-object p3, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->pending:Ljava/util/LinkedList;

    invoke-virtual {p3, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    monitor-exit p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->selector:Ljava/nio/channels/Selector;

    invoke-virtual {p2}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Trying to connect to "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_9 .. :try_end_9} :catch_0

    goto :goto_6

    :catchall_2
    move-exception p3

    :try_start_a
    monitor-exit p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :try_start_b
    throw p3
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_b .. :try_end_b} :catch_0

    :goto_5
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NoSuchAlgorithmException while sending message to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :goto_6
    return-void

    :goto_7
    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object p2

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    throw p1

    :catchall_3
    move-exception p1

    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    throw p1
.end method

.method public terminate()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/TLSTM$ServerThread;->stop:Z

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

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
