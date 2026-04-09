.class public abstract Lorg/snmp4j/transport/AbstractTransportMapping;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/TransportMapping;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lorg/snmp4j/smi/Address;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/snmp4j/TransportMapping<",
        "TA;>;"
    }
.end annotation


# instance fields
.field protected asyncMsgProcessingSupported:Z

.field protected maxInboundMessageSize:I

.field protected transportListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/transport/TransportListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;

    const v0, 0xffff

    iput v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    iput-boolean v1, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->asyncMsgProcessingSupported:Z

    return-void
.end method


# virtual methods
.method public declared-synchronized addTransportListener(Lorg/snmp4j/transport/TransportListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;
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

.method public abstract close()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected fireProcessMessage(Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/transport/TransportListener;

    invoke-interface {v1, p0, p1, p2, p3}, Lorg/snmp4j/transport/TransportListener;->processMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getMaxInboundMessageSize()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    return v0
.end method

.method public abstract getSupportedAddressClass()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;"
        }
    .end annotation
.end method

.method public isAsyncMsgProcessingSupported()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->asyncMsgProcessingSupported:Z

    return v0
.end method

.method public abstract listen()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public declared-synchronized removeAllTransportListeners()V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized removeTransportListener(Lorg/snmp4j/transport/TransportListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iput-object v0, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->transportListener:Ljava/util/List;
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

.method public abstract sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
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
.end method

.method public setAsyncMsgProcessingSupported(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->asyncMsgProcessingSupported:Z

    return-void
.end method
