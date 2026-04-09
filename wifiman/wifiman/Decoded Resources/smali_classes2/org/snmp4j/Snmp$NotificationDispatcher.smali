.class Lorg/snmp4j/Snmp$NotificationDispatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/CommandResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/Snmp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "NotificationDispatcher"
.end annotation


# instance fields
.field private notificationListeners:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/TransportMapping;",
            ">;"
        }
    .end annotation
.end field

.field private notificationTransports:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Lorg/snmp4j/TransportMapping;",
            "Lorg/snmp4j/CommandResponder;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/snmp4j/Snmp;


# direct methods
.method protected constructor <init>(Lorg/snmp4j/Snmp;)V
    .locals 1

    iput-object p1, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->this$0:Lorg/snmp4j/Snmp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/Hashtable;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Ljava/util/Hashtable;-><init>(I)V

    iput-object p1, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationListeners:Ljava/util/Hashtable;

    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1, v0}, Ljava/util/Hashtable;-><init>(I)V

    iput-object p1, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationTransports:Ljava/util/Hashtable;

    return-void
.end method


# virtual methods
.method public declared-synchronized addNotificationListener(Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/CommandResponder;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationListeners:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationTransports:Ljava/util/Hashtable;

    invoke-virtual {p1, p2, p3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

.method public declared-synchronized closeAll()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationTransports:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationListeners:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/TransportMapping;

    iget-object v2, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->this$0:Lorg/snmp4j/Snmp;

    invoke-virtual {v2, v1}, Lorg/snmp4j/Snmp;->closeTransportMapping(Lorg/snmp4j/TransportMapping;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationListeners:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getTransportMapping(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationListeners:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/TransportMapping;

    return-object p1
.end method

.method public processPdu(Lorg/snmp4j/CommandResponderEvent;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationTransports:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getTransportMapping()Lorg/snmp4j/TransportMapping;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/CommandResponder;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPDU()Lorg/snmp4j/PDU;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPDU()Lorg/snmp4j/PDU;

    move-result-object v1

    invoke-virtual {v1}, Lorg/snmp4j/PDU;->getType()I

    move-result v1

    const/16 v2, -0x5a

    if-ne v1, v2, :cond_0

    :try_start_1
    invoke-virtual {p0, p1}, Lorg/snmp4j/Snmp$NotificationDispatcher;->sendInformResponse(Lorg/snmp4j/CommandResponderEvent;)V
    :try_end_1
    .catch Lorg/snmp4j/MessageException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isWarnEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to send response on INFORM PDU event ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lorg/snmp4j/CommandResponder;->processPdu(Lorg/snmp4j/CommandResponderEvent;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized removeNotificationListener(Lorg/snmp4j/smi/Address;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationListeners:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/TransportMapping;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$1100(Lorg/snmp4j/Snmp;)Lorg/snmp4j/MessageDispatcher;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/snmp4j/TransportMapping;->removeTransportListener(Lorg/snmp4j/transport/TransportListener;)V

    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->notificationTransports:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->this$0:Lorg/snmp4j/Snmp;

    invoke-virtual {v0, p1}, Lorg/snmp4j/Snmp;->closeTransportMapping(Lorg/snmp4j/TransportMapping;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method protected sendInformResponse(Lorg/snmp4j/CommandResponderEvent;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPDU()Lorg/snmp4j/PDU;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lorg/snmp4j/PDU;

    const/16 v0, -0x5e

    invoke-virtual {v6, v0}, Lorg/snmp4j/PDU;->setType(I)V

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lorg/snmp4j/PDU;->setErrorStatus(I)V

    invoke-virtual {v6, v0}, Lorg/snmp4j/PDU;->setErrorIndex(I)V

    iget-object v0, p0, Lorg/snmp4j/Snmp$NotificationDispatcher;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$1100(Lorg/snmp4j/Snmp;)Lorg/snmp4j/MessageDispatcher;

    move-result-object v1

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getMessageProcessingModel()I

    move-result v2

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityModel()I

    move-result v3

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityName()[B

    move-result-object v4

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getSecurityLevel()I

    move-result v5

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getMaxSizeResponsePDU()I

    move-result v7

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getStateReference()Lorg/snmp4j/mp/StateReference;

    move-result-object v8

    new-instance v9, Lorg/snmp4j/mp/StatusInformation;

    invoke-direct {v9}, Lorg/snmp4j/mp/StatusInformation;-><init>()V

    invoke-interface/range {v1 .. v9}, Lorg/snmp4j/MessageDispatcher;->returnResponsePdu(II[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;)I

    return-void
.end method
