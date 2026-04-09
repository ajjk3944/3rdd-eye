.class public interface abstract Lorg/snmp4j/MessageDispatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/transport/TransportListener;


# virtual methods
.method public abstract addCommandResponder(Lorg/snmp4j/CommandResponder;)V
.end method

.method public abstract addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V
.end method

.method public abstract addTransportMapping(Lorg/snmp4j/TransportMapping;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;
.end method

.method public abstract getNextRequestID()I
.end method

.method public abstract getTransport(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;
.end method

.method public abstract getTransportMappings()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/snmp4j/TransportMapping;",
            ">;"
        }
    .end annotation
.end method

.method public abstract processMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V
.end method

.method public abstract releaseStateReference(ILorg/snmp4j/mp/PduHandle;)V
.end method

.method public abstract removeCommandResponder(Lorg/snmp4j/CommandResponder;)V
.end method

.method public abstract removeMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V
.end method

.method public abstract removeTransportMapping(Lorg/snmp4j/TransportMapping;)Lorg/snmp4j/TransportMapping;
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
.end method

.method public abstract returnResponsePdu(II[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation
.end method

.method public abstract sendPdu(Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation
.end method

.method public abstract sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation
.end method

.method public abstract sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;
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
.end method
