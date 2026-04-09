.class Lorg/snmp4j/transport/TLSTM$SocketEntry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/TLSTM;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SocketEntry"
.end annotation


# instance fields
.field private handshakeFinished:Z

.field private inAppBuffer:Ljava/nio/ByteBuffer;

.field private inNetBuffer:Ljava/nio/ByteBuffer;

.field private final inboundLock:Ljava/lang/Object;

.field private lastUse:J

.field private message:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "[B>;"
        }
    .end annotation
.end field

.field private outAppBuffer:Ljava/nio/ByteBuffer;

.field private outNetBuffer:Ljava/nio/ByteBuffer;

.field private final outboundLock:Ljava/lang/Object;

.field private peerAddress:Lorg/snmp4j/smi/TcpAddress;

.field private volatile registrations:I

.field private sessionID:J

.field private socket:Ljava/net/Socket;

.field private socketTimeout:Lorg/snmp4j/transport/TLSTM$SocketTimeout;

.field private sslEngine:Ljavax/net/ssl/SSLEngine;

.field final synthetic this$0:Lorg/snmp4j/transport/TLSTM;

.field private tmStateReference:Lorg/snmp4j/TransportStateReference;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/smi/TcpAddress;Ljava/net/Socket;ZLorg/snmp4j/TransportStateReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->message:Ljava/util/LinkedList;

    const/4 v0, 0x0

    iput v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outboundLock:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inboundLock:Ljava/lang/Object;

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM;->getMaxInboundMessageSize()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inAppBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM;->getMaxInboundMessageSize()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inNetBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lorg/snmp4j/transport/TLSTM;->getMaxInboundMessageSize()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outNetBuffer:Ljava/nio/ByteBuffer;

    iput-object p2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->peerAddress:Lorg/snmp4j/smi/TcpAddress;

    iput-object p5, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    iput-object p3, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socket:Ljava/net/Socket;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->lastUse:J

    if-nez p5, :cond_0

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM;->access$200(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/mp/CounterSupport;

    move-result-object p3

    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionAccepts:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p3, v0}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    :cond_0
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM;->access$300(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;

    move-result-object p3

    invoke-interface {p3, p4, p5}, Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;->getSSLContext(ZLorg/snmp4j/TransportStateReference;)Ljavax/net/ssl/SSLContext;

    move-result-object p3

    invoke-virtual {p2}, Lorg/snmp4j/smi/IpAddress;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p5

    invoke-virtual {p5}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p2}, Lorg/snmp4j/smi/TransportIpAddress;->getPort()I

    move-result p2

    invoke-virtual {p3, p5, p2}, Ljavax/net/ssl/SSLContext;->createSSLEngine(Ljava/lang/String;I)Ljavax/net/ssl/SSLEngine;

    move-result-object p2

    iput-object p2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {p2, p4}, Ljavax/net/ssl/SSLEngine;->setUseClientMode(Z)V

    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM;->access$300(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;

    move-result-object p2

    iget-object p3, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-interface {p2, p3}, Lorg/snmp4j/transport/TLSTM$SSLEngineConfigurator;->configure(Ljavax/net/ssl/SSLEngine;)V

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lorg/snmp4j/transport/TLSTM;->access$408(Lorg/snmp4j/transport/TLSTM;)J

    move-result-wide p2

    iput-wide p2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sessionID:J

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method static synthetic access$1100(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inboundLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$1200(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inNetBuffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method static synthetic access$1300(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inAppBuffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method static synthetic access$1400(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngine;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sslEngine:Ljavax/net/ssl/SSLEngine;

    return-object p0
.end method

.method static synthetic access$1600(Lorg/snmp4j/transport/TLSTM$SocketEntry;)J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sessionID:J

    return-wide v0
.end method

.method static synthetic access$1700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Lorg/snmp4j/TransportStateReference;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    return-object p0
.end method

.method static synthetic access$1800(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/net/Socket;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socket:Ljava/net/Socket;

    return-object p0
.end method

.method static synthetic access$1900(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/util/LinkedList;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->message:Ljava/util/LinkedList;

    return-object p0
.end method

.method static synthetic access$2500(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outboundLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$2600(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outAppBuffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method static synthetic access$2602(Lorg/snmp4j/transport/TLSTM$SocketEntry;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outAppBuffer:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method static synthetic access$2700(Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outNetBuffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized addMessage([B)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->message:Ljava/util/LinkedList;

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
    iget v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    and-int/2addr v0, p2

    if-nez v0, :cond_1

    iget v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    or-int/2addr v0, p2

    iput v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding operation "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " for: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->toString()Ljava/lang/String;

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
    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object p2

    iget v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    invoke-virtual {p2, p1, v0, p0}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/channels/SelectableChannel;->isRegistered()Z

    move-result v0

    if-nez v0, :cond_3

    iput p2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Registering new operation "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/TLSTM$SocketEntry;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socket:Ljava/net/Socket;

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

.method public checkTransportStateReference()V
    .locals 9

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    if-nez v0, :cond_1

    new-instance v0, Lorg/snmp4j/TransportStateReference;

    iget-object v2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->this$0:Lorg/snmp4j/transport/TLSTM;

    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->peerAddress:Lorg/snmp4j/smi/TcpAddress;

    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4}, Lorg/snmp4j/smi/OctetString;-><init>()V

    sget-object v6, Lorg/snmp4j/security/SecurityLevel;->authPriv:Lorg/snmp4j/security/SecurityLevel;

    iget-wide v7, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sessionID:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v7, 0x1

    move-object v1, v0

    move-object v5, v6

    invoke-direct/range {v1 .. v8}, Lorg/snmp4j/TransportStateReference;-><init>(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/SecurityLevel;Lorg/snmp4j/security/SecurityLevel;ZLjava/lang/Object;)V

    iput-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$600(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$600(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v1

    invoke-interface {v1}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v1

    check-cast v1, [Ljava/security/cert/X509Certificate;

    invoke-interface {v0, v1}, Lorg/snmp4j/transport/tls/TlsTmSecurityCallback;->getSecurityName([Ljava/security/cert/Certificate;)Lorg/snmp4j/smi/OctetString;

    move-result-object v0
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SSL peer \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->peerAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\' is not verified: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sslEngine:Ljavax/net/ssl/SSLEngine;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLEngine;->setEnableSessionCreation(Z)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v1, v0}, Lorg/snmp4j/TransportStateReference;->setSecurityName(Lorg/snmp4j/smi/OctetString;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lorg/snmp4j/TransportStateReference;->getTransportSecurityLevel()Lorg/snmp4j/security/SecurityLevel;

    move-result-object v0

    sget-object v1, Lorg/snmp4j/security/SecurityLevel;->undefined:Lorg/snmp4j/security/SecurityLevel;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    sget-object v1, Lorg/snmp4j/security/SecurityLevel;->authPriv:Lorg/snmp4j/security/SecurityLevel;

    invoke-virtual {v0, v1}, Lorg/snmp4j/TransportStateReference;->setTransportSecurityLevel(Lorg/snmp4j/security/SecurityLevel;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public closeSession()V
    .locals 4

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closing TLSTM session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sessionID:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sslEngine:Ljavax/net/ssl/SSLEngine;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->closeOutbound()V

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0}, Lorg/snmp4j/transport/TLSTM;->access$200(Lorg/snmp4j/transport/TLSTM;)Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    new-instance v1, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmpTlstmSessionServerCloses:Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p0, v2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->this$0:Lorg/snmp4j/transport/TLSTM;

    invoke-static {v0, p0}, Lorg/snmp4j/transport/TLSTM;->access$700(Lorg/snmp4j/transport/TLSTM;Lorg/snmp4j/transport/TLSTM$SocketEntry;)Ljavax/net/ssl/SSLEngineResult;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    move-result-object v1

    sget-object v2, Ljavax/net/ssl/SSLEngineResult$Status;->CLOSED:Ljavax/net/ssl/SSLEngineResult$Status;

    if-eq v1, v2, :cond_2

    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    move-result-object v0

    sget-object v1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_WRAP:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v0, v1, :cond_1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lorg/snmp4j/transport/TLSTM;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException while closing outbound channel of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public getInAppBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inAppBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getInNetBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inNetBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getLastUse()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->lastUse:J

    return-wide v0
.end method

.method public getOutNetBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outNetBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getPeerAddress()Lorg/snmp4j/smi/TcpAddress;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->peerAddress:Lorg/snmp4j/smi/TcpAddress;

    return-object v0
.end method

.method public getSessionID()J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->sessionID:J

    return-wide v0
.end method

.method public getSocket()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socket:Ljava/net/Socket;

    return-object v0
.end method

.method public getSocketTimeout()Lorg/snmp4j/transport/TLSTM$SocketTimeout;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socketTimeout:Lorg/snmp4j/transport/TLSTM$SocketTimeout;

    return-object v0
.end method

.method public declared-synchronized hasMessage()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->message:Ljava/util/LinkedList;

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
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->message:Ljava/util/LinkedList;

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

.method public isAppOutPending()Z
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outboundLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outAppBuffer:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isHandshakeFinished()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->handshakeFinished:Z

    return v0
.end method

.method public declared-synchronized isRegistered(I)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I
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

.method public declared-synchronized nextMessage()[B
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->message:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->message:Ljava/util/LinkedList;

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
    iget v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    and-int/2addr v0, p2

    if-ne v0, p2, :cond_0

    iget v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    not-int p2, p2

    and-int/2addr p2, v0

    iput p2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

    iget-object p2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    move-result-object p2

    iget v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->registrations:I

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

.method public setHandshakeFinished(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->handshakeFinished:Z

    return-void
.end method

.method public setInAppBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inAppBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public setInNetBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inNetBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public setOutNetBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outNetBuffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public setSocketTimeout(Lorg/snmp4j/transport/TLSTM$SocketTimeout;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socketTimeout:Lorg/snmp4j/transport/TLSTM$SocketTimeout;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SocketEntry[peerAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->peerAddress:Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",socket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socket:Ljava/net/Socket;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",lastUse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/util/Date;

    iget-wide v2, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->lastUse:J

    const-wide/32 v4, 0xf4240

    div-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",inNetBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inNetBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",inAppBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->inAppBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",outNetBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->outNetBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",socketTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->socketTimeout:Lorg/snmp4j/transport/TLSTM$SocketTimeout;

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

    iput-wide v0, p0, Lorg/snmp4j/transport/TLSTM$SocketEntry;->lastUse:J

    return-void
.end method
