.class public Lorg/snmp4j/transport/DummyTransport;
.super Lorg/snmp4j/transport/AbstractTransportMapping;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/transport/DummyTransport$MessageContainer;,
        Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;,
        Lorg/snmp4j/transport/DummyTransport$QueueProcessor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Lorg/snmp4j/smi/IpAddress;",
        ">",
        "Lorg/snmp4j/transport/AbstractTransportMapping<",
        "TA;>;"
    }
.end annotation


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private listenAddress:Lorg/snmp4j/smi/IpAddress;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field private listenThread:Lorg/snmp4j/util/WorkerTask;

.field private listening:Z

.field private receiverAddress:Lorg/snmp4j/smi/IpAddress;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field private final requests:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lorg/snmp4j/transport/DummyTransport<",
            "TA;>.MessageContainer;>;"
        }
    .end annotation
.end field

.field private final responses:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lorg/snmp4j/transport/DummyTransport<",
            "TA;>.MessageContainer;>;"
        }
    .end annotation
.end field

.field private sessionID:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/transport/DummyTransport;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/DummyTransport;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->requests:Ljava/util/Queue;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->responses:Ljava/util/Queue;

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport;->listening:Z

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/IpAddress;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;-><init>()V

    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->requests:Ljava/util/Queue;

    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->responses:Ljava/util/Queue;

    const-wide/16 v0, 0x0

    .line 9
    iput-wide v0, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    .line 10
    iput-object p1, p0, Lorg/snmp4j/transport/DummyTransport;->listenAddress:Lorg/snmp4j/smi/IpAddress;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/IpAddress;Lorg/snmp4j/smi/IpAddress;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;TA;)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;-><init>()V

    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->requests:Ljava/util/Queue;

    .line 13
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->responses:Ljava/util/Queue;

    const-wide/16 v0, 0x0

    .line 14
    iput-wide v0, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    .line 15
    iput-object p1, p0, Lorg/snmp4j/transport/DummyTransport;->listenAddress:Lorg/snmp4j/smi/IpAddress;

    .line 16
    iput-object p2, p0, Lorg/snmp4j/transport/DummyTransport;->receiverAddress:Lorg/snmp4j/smi/IpAddress;

    return-void
.end method

.method static synthetic access$000(Lorg/snmp4j/transport/DummyTransport;)Lorg/snmp4j/smi/IpAddress;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/DummyTransport;->listenAddress:Lorg/snmp4j/smi/IpAddress;

    return-object p0
.end method

.method static synthetic access$100(Lorg/snmp4j/transport/DummyTransport;)J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    return-wide v0
.end method

.method static synthetic access$108(Lorg/snmp4j/transport/DummyTransport;)J
    .locals 4

    iget-wide v0, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    return-wide v0
.end method

.method static synthetic access$200()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    sget-object v0, Lorg/snmp4j/transport/DummyTransport;->logger:Lorg/snmp4j/log/LogAdapter;

    return-object v0
.end method

.method static synthetic access$300(Lorg/snmp4j/transport/DummyTransport;)Lorg/snmp4j/smi/IpAddress;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/DummyTransport;->receiverAddress:Lorg/snmp4j/smi/IpAddress;

    return-object p0
.end method

.method static synthetic access$400(Lorg/snmp4j/transport/DummyTransport;)Ljava/util/Queue;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/DummyTransport;->responses:Ljava/util/Queue;

    return-object p0
.end method

.method static synthetic access$500(Lorg/snmp4j/transport/DummyTransport;)Ljava/util/Queue;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/transport/DummyTransport;->requests:Ljava/util/Queue;

    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport;->listening:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport;->listening:Z

    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->listenThread:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->listenThread:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->responses:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public bridge synthetic getListenAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/transport/DummyTransport;->getListenAddress()Lorg/snmp4j/smi/IpAddress;

    move-result-object v0

    return-object v0
.end method

.method public getListenAddress()Lorg/snmp4j/smi/IpAddress;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->listenAddress:Lorg/snmp4j/smi/IpAddress;

    return-object v0
.end method

.method public getResponder(Lorg/snmp4j/smi/IpAddress;)Lorg/snmp4j/transport/AbstractTransportMapping;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)",
            "Lorg/snmp4j/transport/AbstractTransportMapping<",
            "TA;>;"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/DummyTransport;->receiverAddress:Lorg/snmp4j/smi/IpAddress;

    new-instance p1, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;

    invoke-direct {p1, p0}, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;-><init>(Lorg/snmp4j/transport/DummyTransport;)V

    return-object p1
.end method

.method public getSupportedAddressClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;"
        }
    .end annotation

    const-class v0, Lorg/snmp4j/smi/IpAddress;

    return-object v0
.end method

.method public isListening()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport;->listening:Z

    return v0
.end method

.method public listen()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport;->listening:Z

    iget-wide v1, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    new-instance v1, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;

    iget-object v2, p0, Lorg/snmp4j/transport/DummyTransport;->responses:Ljava/util/Queue;

    invoke-direct {v1, p0, v2, p0}, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;-><init>(Lorg/snmp4j/transport/DummyTransport;Ljava/util/Queue;Lorg/snmp4j/transport/AbstractTransportMapping;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getThreadFactory()Lorg/snmp4j/util/ThreadFactory;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DummyTransportMapping_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/DummyTransport;->getListenAddress()Lorg/snmp4j/smi/IpAddress;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1, v0}, Lorg/snmp4j/util/ThreadFactory;->createWorkerThread(Ljava/lang/String;Lorg/snmp4j/util/WorkerTask;Z)Lorg/snmp4j/util/WorkerTask;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->listenThread:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public bridge synthetic sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/DummyTransport;->sendMessage(Lorg/snmp4j/smi/IpAddress;[BLorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public sendMessage(Lorg/snmp4j/smi/IpAddress;[BLorg/snmp4j/TransportStateReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;[B",
            "Lorg/snmp4j/TransportStateReference;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object p3, p0, Lorg/snmp4j/transport/DummyTransport;->requests:Ljava/util/Queue;

    monitor-enter p3

    .line 3
    :try_start_0
    sget-object v0, Lorg/snmp4j/transport/DummyTransport;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Send request message to \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\': "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v2, p2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport;->requests:Ljava/util/Queue;

    new-instance v1, Lorg/snmp4j/transport/DummyTransport$MessageContainer;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v2, p2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-direct {v1, p0, p1, v2}, Lorg/snmp4j/transport/DummyTransport$MessageContainer;-><init>(Lorg/snmp4j/transport/DummyTransport;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 6
    monitor-exit p3

    return-void

    :goto_1
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setListenAddress(Lorg/snmp4j/smi/IpAddress;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/DummyTransport;->listenAddress:Lorg/snmp4j/smi/IpAddress;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DummyTransport{requests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport;->requests:Ljava/util/Queue;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", responses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport;->responses:Ljava/util/Queue;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", listening="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lorg/snmp4j/transport/DummyTransport;->listening:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", listenAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport;->listenAddress:Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receiverAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport;->receiverAddress:Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", listenThread="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport;->listenThread:Lorg/snmp4j/util/WorkerTask;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sessionID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/snmp4j/transport/DummyTransport;->sessionID:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
