.class Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/WorkerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DefaultUdpTransportMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ListenThread"
.end annotation


# instance fields
.field private buf:[B

.field private volatile stop:Z

.field final synthetic this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/DefaultUdpTransportMapping;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    invoke-virtual {p1}, Lorg/snmp4j/transport/AbstractTransportMapping;->getMaxInboundMessageSize()I

    move-result p1

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->buf:[B

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    return-void
.end method

.method public interrupt()V
    .locals 3

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

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
    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->close()V

    return-void
.end method

.method public join()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

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
    .locals 15

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iget-object v1, v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    :try_start_0
    invoke-virtual {v0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->getSocketTimeout()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-static {v0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$000(Lorg/snmp4j/transport/DefaultUdpTransportMapping;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-static {v0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$000(Lorg/snmp4j/transport/DefaultUdpTransportMapping;)I

    move-result v0

    iget-object v3, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iget v3, v3, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/net/DatagramSocket;->setReceiveBufferSize(I)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UDP receive buffer size for socket "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-virtual {v4}, Lorg/snmp4j/transport/UdpTransportMapping;->getAddress()Lorg/snmp4j/smi/UdpAddress;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " is set to: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->getReceiveBufferSize()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-virtual {v0, v2}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->setSocketTimeout(I)V

    :catch_1
    :cond_1
    :goto_2
    iget-boolean v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_e

    new-instance v0, Ljava/net/DatagramPacket;

    iget-object v5, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->buf:[B

    array-length v6, v5

    iget-object v7, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iget-object v7, v7, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {v7}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v7

    iget-object v8, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iget-object v8, v8, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {v8}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result v8

    invoke-direct {v0, v5, v6, v7, v8}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    :try_start_1
    iget-object v5, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iget-object v1, v5, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/PortUnreachableException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    if-nez v1, :cond_2

    :try_start_2
    iput-boolean v4, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z
    :try_end_2
    .catch Ljava/io/InterruptedIOException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/net/PortUnreachableException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    goto/16 :goto_6

    :catch_3
    move-exception v0

    goto/16 :goto_7

    :catch_4
    move-exception v0

    goto/16 :goto_a

    :catch_5
    move-exception v5

    goto :goto_3

    :cond_2
    :try_start_3
    invoke-virtual {v1, v0}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/InterruptedIOException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/net/PortUnreachableException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_4

    :goto_3
    :try_start_4
    iget v5, v5, Ljava/io/InterruptedIOException;->bytesTransferred:I

    if-gtz v5, :cond_3

    goto :goto_2

    :cond_3
    :goto_4
    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    invoke-interface {v5}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Received message from "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getPort()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " with length "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getLength()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v8

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getLength()I

    move-result v9

    invoke-direct {v7, v8, v2, v9}, Lorg/snmp4j/smi/OctetString;-><init>([BII)V

    invoke-virtual {v7}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_4
    iget-object v5, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-virtual {v5}, Lorg/snmp4j/transport/AbstractTransportMapping;->isAsyncMsgProcessingSupported()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getLength()I

    move-result v5

    new-array v6, v5, [B

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v7

    invoke-static {v7, v2, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v6}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v5

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v5

    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v5

    :goto_5
    new-instance v14, Lorg/snmp4j/TransportStateReference;

    iget-object v7, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iget-object v8, v7, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    sget-object v11, Lorg/snmp4j/security/SecurityLevel;->undefined:Lorg/snmp4j/security/SecurityLevel;

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v6, v14

    move-object v10, v11

    move-object v13, v1

    invoke-direct/range {v6 .. v13}, Lorg/snmp4j/TransportStateReference;-><init>(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/SecurityLevel;Lorg/snmp4j/security/SecurityLevel;ZLjava/lang/Object;)V

    iget-object v6, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    new-instance v7, Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v8

    invoke-virtual {v0}, Ljava/net/DatagramPacket;->getPort()I

    move-result v0

    invoke-direct {v7, v8, v0}, Lorg/snmp4j/smi/UdpAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v6, v7, v5, v14}, Lorg/snmp4j/transport/AbstractTransportMapping;->fireProcessMessage(Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/net/PortUnreachableException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/net/SocketException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_2

    :goto_6
    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    invoke-interface {v3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    iget-boolean v3, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    if-nez v3, :cond_1

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_2

    :cond_7
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_7
    iget-boolean v5, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    if-nez v5, :cond_8

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Socket for transport mapping "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " error: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :cond_8
    iget-boolean v5, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    if-nez v5, :cond_a

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_8

    :cond_9
    iput-boolean v4, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_a
    :goto_8
    iget-boolean v5, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    if-nez v5, :cond_1

    :try_start_5
    iget-object v5, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    invoke-virtual {v5, v0, v1}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->renewSocketAfterException(Ljava/net/SocketException;Ljava/net/DatagramSocket;)Ljava/net/DatagramSocket;

    move-result-object v5

    if-eqz v5, :cond_b

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iput-object v5, v0, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    goto/16 :goto_2

    :catch_6
    move-exception v0

    goto :goto_9

    :cond_b
    throw v0
    :try_end_5
    .catch Ljava/net/SocketException; {:try_start_5 .. :try_end_5} :catch_6

    :goto_9
    iput-boolean v4, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    iget-object v4, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iput-object v3, v4, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Socket renewal for transport mapping "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " failed with: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    goto/16 :goto_2

    :goto_a
    iget-object v5, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    monitor-enter v5

    :try_start_6
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iput-object v3, v1, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_c
    iget-boolean v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    if-nez v1, :cond_e

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_b

    :cond_d
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_0
    move-exception v0

    :try_start_7
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v0

    :cond_e
    :goto_b
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    monitor-enter v0

    :try_start_8
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iput-object v3, v1, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->listener:Lorg/snmp4j/util/WorkerTask;

    iput-boolean v4, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->stop:Z

    iget-object v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iget-object v1, v1, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_f

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->close()V

    goto :goto_c

    :catchall_1
    move-exception v1

    goto :goto_d

    :cond_f
    :goto_c
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->this$0:Lorg/snmp4j/transport/DefaultUdpTransportMapping;

    iput-object v3, v1, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->socket:Ljava/net/DatagramSocket;

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Worker task stopped:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_10
    return-void

    :goto_d
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v1
.end method

.method public terminate()V
    .locals 3

    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultUdpTransportMapping$ListenThread;->close()V

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/DefaultUdpTransportMapping;->access$100()Lorg/snmp4j/log/LogAdapter;

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
