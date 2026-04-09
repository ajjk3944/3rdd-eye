.class public Lorg/snmp4j/CommandResponderEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1b549d74590a5871L


# instance fields
.field private maxSizeResponsePDU:I

.field private messageProcessingModel:I

.field private pdu:Lorg/snmp4j/PDU;

.field private pduHandle:Lorg/snmp4j/mp/PduHandle;

.field private peerAddress:Lorg/snmp4j/smi/Address;

.field private processed:Z

.field private securityLevel:I

.field private securityModel:I

.field private securityName:[B

.field private stateReference:Lorg/snmp4j/mp/StateReference;

.field private tmStateReference:Lorg/snmp4j/TransportStateReference;

.field private transient transportMapping:Lorg/snmp4j/TransportMapping;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lorg/snmp4j/CommandResponderEvent;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 13
    iget-object p1, p2, Lorg/snmp4j/CommandResponderEvent;->transportMapping:Lorg/snmp4j/TransportMapping;

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setTransportMapping(Lorg/snmp4j/TransportMapping;)V

    .line 14
    iget p1, p2, Lorg/snmp4j/CommandResponderEvent;->messageProcessingModel:I

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setMessageProcessingModel(I)V

    .line 15
    iget p1, p2, Lorg/snmp4j/CommandResponderEvent;->securityModel:I

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setSecurityModel(I)V

    .line 16
    iget-object p1, p2, Lorg/snmp4j/CommandResponderEvent;->securityName:[B

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setSecurityName([B)V

    .line 17
    iget p1, p2, Lorg/snmp4j/CommandResponderEvent;->securityLevel:I

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setSecurityLevel(I)V

    .line 18
    iget-object p1, p2, Lorg/snmp4j/CommandResponderEvent;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setPduHandle(Lorg/snmp4j/mp/PduHandle;)V

    .line 19
    iget-object p1, p2, Lorg/snmp4j/CommandResponderEvent;->pdu:Lorg/snmp4j/PDU;

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setPDU(Lorg/snmp4j/PDU;)V

    .line 20
    iget p1, p2, Lorg/snmp4j/CommandResponderEvent;->maxSizeResponsePDU:I

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setMaxSizeResponsePDU(I)V

    .line 21
    iget-object p1, p2, Lorg/snmp4j/CommandResponderEvent;->stateReference:Lorg/snmp4j/mp/StateReference;

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    .line 22
    invoke-virtual {p2}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/CommandResponderEvent;->setPeerAddress(Lorg/snmp4j/smi/Address;)V

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;II[BILorg/snmp4j/mp/PduHandle;Lorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0, p2}, Lorg/snmp4j/CommandResponderEvent;->setTransportMapping(Lorg/snmp4j/TransportMapping;)V

    .line 3
    invoke-virtual {p0, p4}, Lorg/snmp4j/CommandResponderEvent;->setMessageProcessingModel(I)V

    .line 4
    invoke-virtual {p0, p5}, Lorg/snmp4j/CommandResponderEvent;->setSecurityModel(I)V

    .line 5
    invoke-virtual {p0, p6}, Lorg/snmp4j/CommandResponderEvent;->setSecurityName([B)V

    .line 6
    invoke-virtual {p0, p7}, Lorg/snmp4j/CommandResponderEvent;->setSecurityLevel(I)V

    .line 7
    invoke-virtual {p0, p8}, Lorg/snmp4j/CommandResponderEvent;->setPduHandle(Lorg/snmp4j/mp/PduHandle;)V

    .line 8
    invoke-virtual {p0, p9}, Lorg/snmp4j/CommandResponderEvent;->setPDU(Lorg/snmp4j/PDU;)V

    .line 9
    invoke-virtual {p0, p10}, Lorg/snmp4j/CommandResponderEvent;->setMaxSizeResponsePDU(I)V

    .line 10
    invoke-virtual {p0, p11}, Lorg/snmp4j/CommandResponderEvent;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    .line 11
    invoke-virtual {p0, p3}, Lorg/snmp4j/CommandResponderEvent;->setPeerAddress(Lorg/snmp4j/smi/Address;)V

    return-void
.end method


# virtual methods
.method public getMaxSizeResponsePDU()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/CommandResponderEvent;->maxSizeResponsePDU:I

    return v0
.end method

.method public getMessageDispatcher()Lorg/snmp4j/MessageDispatcher;
    .locals 1

    invoke-super {p0}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/MessageDispatcher;

    return-object v0
.end method

.method public getMessageProcessingModel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/CommandResponderEvent;->messageProcessingModel:I

    return v0
.end method

.method public getPDU()Lorg/snmp4j/PDU;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CommandResponderEvent;->pdu:Lorg/snmp4j/PDU;

    return-object v0
.end method

.method public getPduHandle()Lorg/snmp4j/mp/PduHandle;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CommandResponderEvent;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    return-object v0
.end method

.method public getPeerAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CommandResponderEvent;->peerAddress:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public getSecurityLevel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/CommandResponderEvent;->securityLevel:I

    return v0
.end method

.method public getSecurityModel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/CommandResponderEvent;->securityModel:I

    return v0
.end method

.method public getSecurityName()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CommandResponderEvent;->securityName:[B

    return-object v0
.end method

.method public getStateReference()Lorg/snmp4j/mp/StateReference;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CommandResponderEvent;->stateReference:Lorg/snmp4j/mp/StateReference;

    return-object v0
.end method

.method public getTmStateReference()Lorg/snmp4j/TransportStateReference;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CommandResponderEvent;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    return-object v0
.end method

.method public getTransportMapping()Lorg/snmp4j/TransportMapping;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/CommandResponderEvent;->transportMapping:Lorg/snmp4j/TransportMapping;

    return-object v0
.end method

.method public isProcessed()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/CommandResponderEvent;->processed:Z

    return v0
.end method

.method public setMaxSizeResponsePDU(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/CommandResponderEvent;->maxSizeResponsePDU:I

    return-void
.end method

.method public setMessageProcessingModel(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/CommandResponderEvent;->messageProcessingModel:I

    return-void
.end method

.method public setPDU(Lorg/snmp4j/PDU;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/CommandResponderEvent;->pdu:Lorg/snmp4j/PDU;

    return-void
.end method

.method public setPduHandle(Lorg/snmp4j/mp/PduHandle;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/CommandResponderEvent;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    return-void
.end method

.method public setPeerAddress(Lorg/snmp4j/smi/Address;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/CommandResponderEvent;->peerAddress:Lorg/snmp4j/smi/Address;

    return-void
.end method

.method public setProcessed(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/CommandResponderEvent;->processed:Z

    return-void
.end method

.method public setSecurityLevel(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/CommandResponderEvent;->securityLevel:I

    return-void
.end method

.method public setSecurityModel(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/CommandResponderEvent;->securityModel:I

    return-void
.end method

.method public setSecurityName([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/CommandResponderEvent;->securityName:[B

    return-void
.end method

.method public setStateReference(Lorg/snmp4j/mp/StateReference;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/CommandResponderEvent;->stateReference:Lorg/snmp4j/mp/StateReference;

    return-void
.end method

.method public setTmStateReference(Lorg/snmp4j/TransportStateReference;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/CommandResponderEvent;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    return-void
.end method

.method protected setTransportMapping(Lorg/snmp4j/TransportMapping;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/CommandResponderEvent;->transportMapping:Lorg/snmp4j/TransportMapping;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CommandResponderEvent[securityModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/CommandResponderEvent;->securityModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", securityLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/CommandResponderEvent;->securityLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxSizeResponsePDU="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/CommandResponderEvent;->maxSizeResponsePDU:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pduHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/CommandResponderEvent;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stateReference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/CommandResponderEvent;->stateReference:Lorg/snmp4j/mp/StateReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pdu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/CommandResponderEvent;->pdu:Lorg/snmp4j/PDU;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageProcessingModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/CommandResponderEvent;->messageProcessingModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", securityName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    iget-object v2, p0, Lorg/snmp4j/CommandResponderEvent;->securityName:[B

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", processed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lorg/snmp4j/CommandResponderEvent;->processed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", peerAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/CommandResponderEvent;->peerAddress:Lorg/snmp4j/smi/Address;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transportMapping="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/CommandResponderEvent;->transportMapping:Lorg/snmp4j/TransportMapping;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tmStateReference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/CommandResponderEvent;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
