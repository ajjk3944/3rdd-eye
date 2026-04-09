.class public abstract Lorg/snmp4j/transport/TcpTransportMapping;
.super Lorg/snmp4j/transport/AbstractTransportMapping;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/transport/ConnectionOrientedTransportMapping;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/snmp4j/transport/AbstractTransportMapping<",
        "Lorg/snmp4j/smi/TcpAddress;",
        ">;",
        "Lorg/snmp4j/transport/ConnectionOrientedTransportMapping<",
        "Lorg/snmp4j/smi/TcpAddress;",
        ">;"
    }
.end annotation


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field protected openSocketOnSending:Z

.field protected suspendedAddresses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lorg/snmp4j/smi/Address;",
            ">;"
        }
    .end annotation
.end field

.field protected tcpAddress:Lorg/snmp4j/smi/TcpAddress;

.field private transient transportStateListeners:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lorg/snmp4j/transport/TransportStateListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/transport/TcpTransportMapping;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/TcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/smi/TcpAddress;)V
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;-><init>()V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet(I)Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->suspendedAddresses:Ljava/util/Set;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->openSocketOnSending:Z

    iput-object p1, p0, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    return-void
.end method


# virtual methods
.method public declared-synchronized addTransportStateListener(Lorg/snmp4j/transport/TransportStateListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->transportStateListeners:Ljava/util/Vector;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Vector;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->transportStateListeners:Ljava/util/Vector;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->transportStateListeners:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected cancelNonServerSelectionKey(Ljava/nio/channels/SelectionKey;)V
    .locals 1

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->isAcceptable()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    :cond_0
    return-void
.end method

.method public abstract close()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected fireConnectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    .locals 3

    sget-object v0, Lorg/snmp4j/transport/TcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Firing transport state event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->transportStateListeners:Ljava/util/Vector;

    if-eqz v0, :cond_2

    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/transport/TransportStateListener;

    invoke-interface {v1, p1}, Lorg/snmp4j/transport/TransportStateListener;->connectionStateChanged(Lorg/snmp4j/transport/TransportStateEvent;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    sget-object v0, Lorg/snmp4j/transport/TcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in fireConnectionStateChanged: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    throw p1

    :cond_2
    :goto_2
    return-void
.end method

.method public getAddress()Lorg/snmp4j/smi/TcpAddress;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    return-object v0
.end method

.method public bridge synthetic getListenAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/transport/TcpTransportMapping;->getListenAddress()Lorg/snmp4j/smi/TcpAddress;

    move-result-object v0

    return-object v0
.end method

.method public getListenAddress()Lorg/snmp4j/smi/TcpAddress;
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->tcpAddress:Lorg/snmp4j/smi/TcpAddress;

    return-object v0
.end method

.method public abstract getMessageLengthDecoder()Lorg/snmp4j/transport/MessageLengthDecoder;
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

    const-class v0, Lorg/snmp4j/smi/TcpAddress;

    return-object v0
.end method

.method protected handleDroppedMessageToSend(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V
    .locals 2

    sget-object p3, Lorg/snmp4j/transport/TcpTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TCP message to be sent has been dropped, because transport mapping is closed: address="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", message="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lorg/snmp4j/smi/OctetString;->fromByteArray([B)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    return-void
.end method

.method public isOpenSocketOnSending()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->openSocketOnSending:Z

    return v0
.end method

.method public abstract listen()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method abstract removeSocketEntry(Lorg/snmp4j/smi/TcpAddress;)Ljava/lang/Object;
.end method

.method public declared-synchronized removeTransportStateListener(Lorg/snmp4j/transport/TransportStateListener;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->transportStateListeners:Ljava/util/Vector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z
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

.method public bridge synthetic resumeAddress(Lorg/snmp4j/smi/Address;)Z
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/TcpTransportMapping;->resumeAddress(Lorg/snmp4j/smi/TcpAddress;)Z

    move-result p1

    return p1
.end method

.method public resumeAddress(Lorg/snmp4j/smi/TcpAddress;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->suspendedAddresses:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
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

    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/TcpTransportMapping;->sendMessage(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public abstract sendMessage(Lorg/snmp4j/smi/TcpAddress;[BLorg/snmp4j/TransportStateReference;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract setConnectionTimeout(J)V
.end method

.method public abstract setMessageLengthDecoder(Lorg/snmp4j/transport/MessageLengthDecoder;)V
.end method

.method public setOpenSocketOnSending(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/transport/TcpTransportMapping;->openSocketOnSending:Z

    return-void
.end method

.method public bridge synthetic suspendAddress(Lorg/snmp4j/smi/Address;)V
    .locals 0

    .line 1
    check-cast p1, Lorg/snmp4j/smi/TcpAddress;

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/TcpTransportMapping;->suspendAddress(Lorg/snmp4j/smi/TcpAddress;)V

    return-void
.end method

.method public suspendAddress(Lorg/snmp4j/smi/TcpAddress;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/TcpTransportMapping;->suspendedAddresses:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
