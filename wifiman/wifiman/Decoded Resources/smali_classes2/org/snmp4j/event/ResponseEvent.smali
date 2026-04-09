.class public Lorg/snmp4j/event/ResponseEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x370ca8ae6f91b446L


# instance fields
.field private error:Ljava/lang/Exception;

.field private peerAddress:Lorg/snmp4j/smi/Address;

.field private request:Lorg/snmp4j/PDU;

.field private response:Lorg/snmp4j/PDU;

.field private userObject:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0, p2}, Lorg/snmp4j/event/ResponseEvent;->setPeerAddress(Lorg/snmp4j/smi/Address;)V

    .line 3
    invoke-virtual {p0, p3}, Lorg/snmp4j/event/ResponseEvent;->setRequest(Lorg/snmp4j/PDU;)V

    .line 4
    invoke-virtual {p0, p4}, Lorg/snmp4j/event/ResponseEvent;->setResponse(Lorg/snmp4j/PDU;)V

    .line 5
    invoke-virtual {p0, p5}, Lorg/snmp4j/event/ResponseEvent;->setUserObject(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;Ljava/lang/Exception;)V
    .locals 0

    .line 6
    invoke-direct/range {p0 .. p5}, Lorg/snmp4j/event/ResponseEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;)V

    .line 7
    iput-object p6, p0, Lorg/snmp4j/event/ResponseEvent;->error:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public getError()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/ResponseEvent;->error:Ljava/lang/Exception;

    return-object v0
.end method

.method public getPeerAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/ResponseEvent;->peerAddress:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public getRequest()Lorg/snmp4j/PDU;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/ResponseEvent;->request:Lorg/snmp4j/PDU;

    return-object v0
.end method

.method public getResponse()Lorg/snmp4j/PDU;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/ResponseEvent;->response:Lorg/snmp4j/PDU;

    return-object v0
.end method

.method public getUserObject()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/ResponseEvent;->userObject:Ljava/lang/Object;

    return-object v0
.end method

.method protected final setPeerAddress(Lorg/snmp4j/smi/Address;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/event/ResponseEvent;->peerAddress:Lorg/snmp4j/smi/Address;

    return-void
.end method

.method protected final setRequest(Lorg/snmp4j/PDU;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/event/ResponseEvent;->request:Lorg/snmp4j/PDU;

    return-void
.end method

.method protected final setResponse(Lorg/snmp4j/PDU;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/event/ResponseEvent;->response:Lorg/snmp4j/PDU;

    return-void
.end method

.method protected final setUserObject(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/event/ResponseEvent;->userObject:Ljava/lang/Object;

    return-void
.end method
