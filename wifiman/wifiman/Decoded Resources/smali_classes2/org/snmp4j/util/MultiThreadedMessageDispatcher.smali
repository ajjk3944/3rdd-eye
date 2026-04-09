.class public Lorg/snmp4j/util/MultiThreadedMessageDispatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/MessageDispatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;
    }
.end annotation


# instance fields
.field private dispatcher:Lorg/snmp4j/MessageDispatcher;

.field private threadPool:Lorg/snmp4j/util/WorkerPool;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/WorkerPool;Lorg/snmp4j/MessageDispatcher;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->threadPool:Lorg/snmp4j/util/WorkerPool;

    iput-object p2, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    return-void
.end method

.method static synthetic access$000(Lorg/snmp4j/util/MultiThreadedMessageDispatcher;)Lorg/snmp4j/MessageDispatcher;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    return-object p0
.end method


# virtual methods
.method public addCommandResponder(Lorg/snmp4j/CommandResponder;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->addCommandResponder(Lorg/snmp4j/CommandResponder;)V

    return-void
.end method

.method public addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    return-void
.end method

.method public addTransportMapping(Lorg/snmp4j/TransportMapping;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->addTransportMapping(Lorg/snmp4j/TransportMapping;)V

    return-void
.end method

.method public getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object p1

    return-object p1
.end method

.method public getNextRequestID()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0}, Lorg/snmp4j/MessageDispatcher;->getNextRequestID()I

    move-result v0

    return v0
.end method

.method public getTransport(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->getTransport(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;

    move-result-object p1

    return-object p1
.end method

.method public getTransportMappings()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/snmp4j/TransportMapping;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0}, Lorg/snmp4j/MessageDispatcher;->getTransportMappings()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public processMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V
    .locals 7

    new-instance v6, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;-><init>(Lorg/snmp4j/util/MultiThreadedMessageDispatcher;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V

    iget-object p1, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->threadPool:Lorg/snmp4j/util/WorkerPool;

    invoke-interface {p1, v6}, Lorg/snmp4j/util/WorkerPool;->execute(Lorg/snmp4j/util/WorkerTask;)V

    return-void
.end method

.method public releaseStateReference(ILorg/snmp4j/mp/PduHandle;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1, p2}, Lorg/snmp4j/MessageDispatcher;->releaseStateReference(ILorg/snmp4j/mp/PduHandle;)V

    return-void
.end method

.method public removeCommandResponder(Lorg/snmp4j/CommandResponder;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->removeCommandResponder(Lorg/snmp4j/CommandResponder;)V

    return-void
.end method

.method public removeMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->removeMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    return-void
.end method

.method public removeTransportMapping(Lorg/snmp4j/TransportMapping;)Lorg/snmp4j/TransportMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;)",
            "Lorg/snmp4j/TransportMapping;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->removeTransportMapping(Lorg/snmp4j/TransportMapping;)Lorg/snmp4j/TransportMapping;

    move-result-object p1

    return-object p1
.end method

.method public returnResponsePdu(II[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;)I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-interface/range {v1 .. v9}, Lorg/snmp4j/MessageDispatcher;->returnResponsePdu(II[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;)I

    move-result v1

    return v1
.end method

.method public sendPdu(Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1, p2, p3}, Lorg/snmp4j/MessageDispatcher;->sendPdu(Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;

    move-result-object p1

    return-object p1
.end method

.method public sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1, p2, p3, p4}, Lorg/snmp4j/MessageDispatcher;->sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;

    move-result-object p1

    return-object p1
.end method

.method public sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/TransportMapping;",
            "Lorg/snmp4j/Target;",
            "Lorg/snmp4j/PDU;",
            "Z",
            "Lorg/snmp4j/mp/PduHandleCallback<",
            "Lorg/snmp4j/PDU;",
            ">;)",
            "Lorg/snmp4j/mp/PduHandle;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->dispatcher:Lorg/snmp4j/MessageDispatcher;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/snmp4j/MessageDispatcher;->sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    move-result-object p1

    return-object p1
.end method
