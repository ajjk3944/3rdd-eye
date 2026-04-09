.class Lorg/snmp4j/Snmp$PendingRequest;
.super Ljava/util/TimerTask;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/mp/PduHandleCallback;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/Snmp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PendingRequest"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/TimerTask;",
        "Lorg/snmp4j/mp/PduHandleCallback<",
        "Lorg/snmp4j/PDU;",
        ">;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field private volatile cancelled:Z

.field private volatile finished:Z

.field private key:Lorg/snmp4j/mp/PduHandle;

.field protected listener:Lorg/snmp4j/event/ResponseListener;

.field private maxRequestStatus:I

.field private nextPDU:Lorg/snmp4j/PDU;

.field protected pdu:Lorg/snmp4j/PDU;

.field private volatile pendingRetry:Z

.field private requestStatus:I

.field private volatile responseReceived:Z

.field protected retryCount:I

.field protected target:Lorg/snmp4j/Target;

.field final synthetic this$0:Lorg/snmp4j/Snmp;

.field protected transport:Lorg/snmp4j/TransportMapping;

.field protected userObject:Ljava/lang/Object;

.field private waitTime:Lorg/snmp4j/event/CounterEvent;

.field private waitTimeTarget:Lorg/snmp4j/event/CounterEvent;


# direct methods
.method private constructor <init>(Lorg/snmp4j/Snmp;Lorg/snmp4j/Snmp$PendingRequest;)V
    .locals 1

    .line 24
    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const/4 p1, 0x0

    .line 25
    iput p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->requestStatus:I

    const/4 v0, 0x2

    .line 26
    iput v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->maxRequestStatus:I

    .line 27
    iput-boolean p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    .line 28
    iput-boolean p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    .line 29
    iput-boolean p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->pendingRetry:Z

    .line 30
    iput-boolean p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->cancelled:Z

    .line 31
    iget-object p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->userObject:Ljava/lang/Object;

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->userObject:Ljava/lang/Object;

    .line 32
    iget-object p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    .line 33
    iget p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->retryCount:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->retryCount:I

    .line 34
    iget-object p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    .line 35
    iget-object p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    .line 36
    iget p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->requestStatus:I

    iput p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->requestStatus:I

    .line 37
    iget-boolean p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    iput-boolean p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    .line 38
    iget-object p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->transport:Lorg/snmp4j/TransportMapping;

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->transport:Lorg/snmp4j/TransportMapping;

    .line 39
    iget-object p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->nextPDU:Lorg/snmp4j/PDU;

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->nextPDU:Lorg/snmp4j/PDU;

    .line 40
    iget-object p1, p2, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/Snmp;Lorg/snmp4j/event/ResponseListener;Ljava/lang/Object;Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->requestStatus:I

    const/4 v1, 0x2

    .line 3
    iput v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->maxRequestStatus:I

    .line 4
    iput-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    .line 5
    iput-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    .line 6
    iput-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->pendingRetry:Z

    .line 7
    iput-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->cancelled:Z

    .line 8
    iput-object p3, p0, Lorg/snmp4j/Snmp$PendingRequest;->userObject:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    .line 10
    invoke-interface {p5}, Lorg/snmp4j/Target;->getRetries()I

    move-result p2

    iput p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->retryCount:I

    .line 11
    iput-object p4, p0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    .line 12
    invoke-interface {p5}, Lorg/snmp4j/Target;->duplicate()Lorg/snmp4j/Target;

    move-result-object p2

    iput-object p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    .line 13
    iput-object p6, p0, Lorg/snmp4j/Snmp$PendingRequest;->transport:Lorg/snmp4j/TransportMapping;

    .line 14
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object p2

    sget-object p3, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->none:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-eq p2, p3, :cond_0

    .line 15
    new-instance p2, Lorg/snmp4j/event/CounterEvent;

    sget-object p3, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsRequestWaitTime:Lorg/snmp4j/smi/OID;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-direct {p2, p0, p3, v0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;J)V

    iput-object p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    .line 16
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object p2

    sget-object p3, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->extended:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-ne p2, p3, :cond_0

    .line 17
    new-instance p2, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsReqTableWaitTime:Lorg/snmp4j/smi/OID;

    .line 18
    invoke-interface {p5}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    move-object v0, p2

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;Ljava/lang/Object;J)V

    iput-object p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTimeTarget:Lorg/snmp4j/event/CounterEvent;

    .line 19
    :cond_0
    invoke-static {p1, p4}, Lorg/snmp4j/Snmp;->access$800(Lorg/snmp4j/Snmp;Lorg/snmp4j/PDU;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 20
    invoke-static {p1}, Lorg/snmp4j/Snmp;->access$900(Lorg/snmp4j/Snmp;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p5}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/smi/OctetString;

    if-eqz p2, :cond_1

    .line 21
    check-cast p4, Lorg/snmp4j/ScopedPDU;

    invoke-virtual {p4, p2}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    goto :goto_0

    .line 22
    :cond_1
    invoke-static {p1}, Lorg/snmp4j/Snmp;->access$1000(Lorg/snmp4j/Snmp;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 23
    invoke-direct {p0}, Lorg/snmp4j/Snmp$PendingRequest;->discoverContextEngineID()V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic access$000(Lorg/snmp4j/Snmp$PendingRequest;)I
    .locals 0

    iget p0, p0, Lorg/snmp4j/Snmp$PendingRequest;->maxRequestStatus:I

    return p0
.end method

.method static synthetic access$002(Lorg/snmp4j/Snmp$PendingRequest;I)I
    .locals 0

    iput p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->maxRequestStatus:I

    return p1
.end method

.method static synthetic access$100(Lorg/snmp4j/Snmp$PendingRequest;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    return p0
.end method

.method static synthetic access$302(Lorg/snmp4j/Snmp$PendingRequest;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    return p1
.end method

.method static synthetic access$400(Lorg/snmp4j/Snmp$PendingRequest;)Lorg/snmp4j/mp/PduHandle;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/Snmp$PendingRequest;->key:Lorg/snmp4j/mp/PduHandle;

    return-object p0
.end method

.method static synthetic access$402(Lorg/snmp4j/Snmp$PendingRequest;Lorg/snmp4j/mp/PduHandle;)Lorg/snmp4j/mp/PduHandle;
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->key:Lorg/snmp4j/mp/PduHandle;

    return-object p1
.end method

.method static synthetic access$700(Lorg/snmp4j/Snmp$PendingRequest;)I
    .locals 0

    iget p0, p0, Lorg/snmp4j/Snmp$PendingRequest;->requestStatus:I

    return p0
.end method

.method static synthetic access$708(Lorg/snmp4j/Snmp$PendingRequest;)I
    .locals 2

    iget v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->requestStatus:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->requestStatus:I

    return v0
.end method

.method private discoverContextEngineID()V
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$1100(Lorg/snmp4j/Snmp;)Lorg/snmp4j/MessageDispatcher;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    invoke-interface {v1}, Lorg/snmp4j/Target;->getVersion()I

    move-result v1

    invoke-interface {v0, v1}, Lorg/snmp4j/MessageDispatcher;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object v0

    instance-of v1, v0, Lorg/snmp4j/mp/MPv3;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    instance-of v2, v1, Lorg/snmp4j/SecureTarget;

    if-eqz v2, :cond_1

    check-cast v0, Lorg/snmp4j/mp/MPv3;

    check-cast v1, Lorg/snmp4j/SecureTarget;

    invoke-virtual {v1}, Lorg/snmp4j/AbstractTarget;->getSecurityModel()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/MPv3;->getSecurityModel(I)Lorg/snmp4j/security/SecurityModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lorg/snmp4j/security/SecurityModel;->supportsEngineIdDiscovery()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Performing RFC 5343 contextEngineID discovery on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_0
    new-instance v0, Lorg/snmp4j/ScopedPDU;

    invoke-direct {v0}, Lorg/snmp4j/ScopedPDU;-><init>()V

    sget-object v1, Lorg/snmp4j/mp/MPv3;->LOCAL_ENGINE_ID:Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0, v1}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    new-instance v1, Lorg/snmp4j/smi/VariableBinding;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmpEngineID:Lorg/snmp4j/smi/OID;

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v1}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/Snmp$PendingRequest;->insertFirstPDU(Lorg/snmp4j/PDU;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public cancel()Z
    .locals 11

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->cancelled:Z

    invoke-super {p0}, Ljava/util/TimerTask;->cancel()Z

    move-result v0

    iget-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    iget-object v2, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/Snmp$PendingRequest;->isResponseReceived()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-virtual {v2}, Lorg/snmp4j/Snmp;->getCounterSupport()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Lorg/snmp4j/event/CounterEvent;

    iget-object v4, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    sget-object v5, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsRequestTimeouts:Lorg/snmp4j/smi/OID;

    invoke-direct {v3, v4, v5}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v2, v3}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object v3

    sget-object v4, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->extended:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-ne v3, v4, :cond_0

    if-eqz v1, :cond_0

    new-instance v3, Lorg/snmp4j/event/CounterEvent;

    iget-object v6, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    sget-object v7, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsReqTableTimeouts:Lorg/snmp4j/smi/OID;

    invoke-interface {v1}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v8

    const-wide/16 v9, 0x1

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;Ljava/lang/Object;J)V

    invoke-virtual {v2, v3}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    :cond_0
    iget-boolean v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->pendingRetry:Z

    if-nez v1, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->key:Lorg/snmp4j/mp/PduHandle;

    iput-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iput-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    iput-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->transport:Lorg/snmp4j/TransportMapping;

    iput-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    iput-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->userObject:Ljava/lang/Object;

    :cond_1
    return v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getMaxRequestStatus()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->maxRequestStatus:I

    return v0
.end method

.method public getNextPDU()Lorg/snmp4j/PDU;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->nextPDU:Lorg/snmp4j/PDU;

    return-object v0
.end method

.method public insertFirstPDU(Lorg/snmp4j/PDU;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iput-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->nextPDU:Lorg/snmp4j/PDU;

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    return-void
.end method

.method public isResponseReceived()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    return v0
.end method

.method public bridge synthetic pduHandleAssigned(Lorg/snmp4j/mp/PduHandle;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lorg/snmp4j/PDU;

    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/Snmp$PendingRequest;->pduHandleAssigned(Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/PDU;)V

    return-void
.end method

.method public declared-synchronized pduHandleAssigned(Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/PDU;)V
    .locals 5

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->key:Lorg/snmp4j/mp/PduHandle;

    if-nez p2, :cond_3

    .line 3
    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->key:Lorg/snmp4j/mp/PduHandle;

    .line 4
    iget-object p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    if-eqz p2, :cond_3

    .line 5
    iget-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->cancelled:Z

    if-nez v0, :cond_3

    .line 6
    iget-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$600(Lorg/snmp4j/Snmp;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p0, p1}, Lorg/snmp4j/Snmp$PendingRequest;->registerRequest(Lorg/snmp4j/mp/PduHandle;)V

    .line 8
    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Running pending "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    instance-of v2, v2, Lorg/snmp4j/Snmp$SyncResponseListener;

    if-eqz v2, :cond_0

    const-string v2, "sync"

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const-string v2, "async"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " request with handle "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " and retry count left "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/snmp4j/Snmp$PendingRequest;->retryCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 10
    :cond_1
    iget-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    .line 11
    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$1200(Lorg/snmp4j/Snmp;)Lorg/snmp4j/TimeoutModel;

    move-result-object v0

    invoke-interface {p2}, Lorg/snmp4j/Target;->getRetries()I

    move-result v1

    iget v2, p0, Lorg/snmp4j/Snmp$PendingRequest;->retryCount:I

    sub-int/2addr v1, v2

    .line 12
    invoke-interface {p2}, Lorg/snmp4j/Target;->getRetries()I

    move-result v2

    .line 13
    invoke-interface {p2}, Lorg/snmp4j/Target;->getTimeout()J

    move-result-wide v3

    .line 14
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/snmp4j/TimeoutModel;->getRetryTimeout(IIJ)J

    move-result-wide v0

    .line 15
    iget-boolean p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    if-nez p2, :cond_2

    iget-boolean p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    if-nez p2, :cond_2

    iget-boolean p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->cancelled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_2

    .line 16
    :try_start_1
    iget-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {p1}, Lorg/snmp4j/Snmp;->access$1300(Lorg/snmp4j/Snmp;)Lorg/snmp4j/util/CommonTimer;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 17
    invoke-interface {p1, p0, v0, v1}, Lorg/snmp4j/util/CommonTimer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 18
    :cond_2
    :try_start_2
    iget-object p2, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {p2}, Lorg/snmp4j/Snmp;->access$600(Lorg/snmp4j/Snmp;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    :catch_0
    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method protected registerRequest(Lorg/snmp4j/mp/PduHandle;)V
    .locals 0

    return-void
.end method

.method public responseReceived()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    iget-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-virtual {v0}, Lorg/snmp4j/Snmp;->getCounterSupport()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-object v3, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    invoke-virtual {v3}, Lorg/snmp4j/event/CounterEvent;->getIncrement()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/32 v3, 0xf4240

    div-long/2addr v1, v3

    iget-object v3, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    invoke-virtual {v3, v1, v2}, Lorg/snmp4j/event/CounterEvent;->setIncrement(J)V

    iget-object v3, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    invoke-virtual {v0, v3}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    iget-object v3, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTimeTarget:Lorg/snmp4j/event/CounterEvent;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v1, v2}, Lorg/snmp4j/event/CounterEvent;->setIncrement(J)V

    iget-object v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->waitTimeTarget:Lorg/snmp4j/event/CounterEvent;

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    :cond_0
    return-void
.end method

.method public declared-synchronized run()V
    .locals 17

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    iget-object v2, v1, Lorg/snmp4j/Snmp$PendingRequest;->key:Lorg/snmp4j/mp/PduHandle;

    iget-object v6, v1, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iget-object v3, v1, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    iget-object v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->transport:Lorg/snmp4j/TransportMapping;

    iget-object v9, v1, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    iget-object v8, v1, Lorg/snmp4j/Snmp$PendingRequest;->userObject:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_6

    if-eqz v6, :cond_6

    if-eqz v3, :cond_6

    if-nez v9, :cond_0

    goto/16 :goto_5

    :cond_0
    :try_start_1
    iget-object v4, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v4}, Lorg/snmp4j/Snmp;->access$600(Lorg/snmp4j/Snmp;)Ljava/util/Map;

    move-result-object v4

    monitor-enter v4
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-boolean v5, v1, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    const/4 v7, 0x0

    const/4 v10, 0x1

    if-nez v5, :cond_1

    iget v5, v1, Lorg/snmp4j/Snmp$PendingRequest;->retryCount:I

    if-lez v5, :cond_1

    iget-boolean v5, v1, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived:Z

    if-nez v5, :cond_1

    move v5, v10

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_1
    move v5, v7

    :goto_0
    iput-boolean v5, v1, Lorg/snmp4j/Snmp$PendingRequest;->pendingRetry:Z

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-boolean v4, v1, Lorg/snmp4j/Snmp$PendingRequest;->pendingRetry:Z
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v4, :cond_2

    :try_start_4
    new-instance v4, Lorg/snmp4j/Snmp$PendingRequest;

    iget-object v5, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-direct {v4, v5, v1}, Lorg/snmp4j/Snmp$PendingRequest;-><init>(Lorg/snmp4j/Snmp;Lorg/snmp4j/Snmp$PendingRequest;)V

    iget-object v5, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-virtual {v5, v6, v3, v0, v4}, Lorg/snmp4j/Snmp;->sendMessage(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    iput-boolean v7, v1, Lorg/snmp4j/Snmp$PendingRequest;->pendingRetry:Z

    iget-object v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->waitTime:Lorg/snmp4j/event/CounterEvent;

    if-eqz v0, :cond_5

    iget-object v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-virtual {v0}, Lorg/snmp4j/Snmp;->getCounterSupport()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v4, Lorg/snmp4j/event/CounterEvent;

    iget-object v5, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    sget-object v7, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsRequestRetries:Lorg/snmp4j/smi/OID;

    invoke-direct {v4, v5, v7}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v4}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object v4

    sget-object v5, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->extended:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-ne v4, v5, :cond_5

    new-instance v4, Lorg/snmp4j/event/CounterEvent;

    iget-object v12, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    sget-object v13, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsReqTableRetries:Lorg/snmp4j/smi/OID;

    invoke-interface {v3}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v14

    const-wide/16 v15, 0x1

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;Ljava/lang/Object;J)V

    invoke-virtual {v0, v4}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_4

    :catch_2
    move-exception v0

    move-object v9, v0

    :try_start_5
    iget-object v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    iput-boolean v10, v1, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed to send SNMP message to "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ": "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    iget-object v4, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v4}, Lorg/snmp4j/Snmp;->access$1100(Lorg/snmp4j/Snmp;)Lorg/snmp4j/MessageDispatcher;

    move-result-object v4

    invoke-interface {v3}, Lorg/snmp4j/Target;->getVersion()I

    move-result v3

    invoke-interface {v4, v3, v2}, Lorg/snmp4j/MessageDispatcher;->releaseStateReference(ILorg/snmp4j/mp/PduHandle;)V

    if-eqz v0, :cond_5

    iget-object v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    new-instance v10, Lorg/snmp4j/event/ResponseEvent;

    iget-object v4, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lorg/snmp4j/event/ResponseEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;Ljava/lang/Exception;)V

    invoke-interface {v0, v10}, Lorg/snmp4j/event/ResponseListener;->onResponse(Lorg/snmp4j/event/ResponseEvent;)V

    goto :goto_1

    :cond_2
    iget-boolean v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    if-nez v0, :cond_4

    iput-boolean v10, v1, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    iget-object v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$600(Lorg/snmp4j/Snmp;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->cancelled:Z

    if-nez v0, :cond_5

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Request timed out: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/snmp4j/mp/PduHandle;->getTransactionID()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_3
    iget-object v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$1100(Lorg/snmp4j/Snmp;)Lorg/snmp4j/MessageDispatcher;

    move-result-object v0

    invoke-interface {v3}, Lorg/snmp4j/Target;->getVersion()I

    move-result v3

    invoke-interface {v0, v3, v2}, Lorg/snmp4j/MessageDispatcher;->releaseStateReference(ILorg/snmp4j/mp/PduHandle;)V

    new-instance v0, Lorg/snmp4j/event/ResponseEvent;

    iget-object v4, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lorg/snmp4j/event/ResponseEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;)V

    invoke-interface {v9, v0}, Lorg/snmp4j/event/ResponseListener;->onResponse(Lorg/snmp4j/event/ResponseEvent;)V

    goto :goto_1

    :cond_4
    iget-object v0, v1, Lorg/snmp4j/Snmp$PendingRequest;->this$0:Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/Snmp;->access$600(Lorg/snmp4j/Snmp;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_5
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v0
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_3
    :try_start_8
    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to process pending request "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " because "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2, v0}, Lorg/snmp4j/log/LogAdapter;->fatal(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    throw v0

    :goto_4
    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to process pending request "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " because "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    :goto_5
    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    invoke-interface {v4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {}, Lorg/snmp4j/Snmp;->access$500()Lorg/snmp4j/log/LogAdapter;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "PendingRequest canceled key="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", pdu="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", target="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", transport="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", listener="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :cond_7
    monitor-exit p0

    return-void

    :goto_6
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v0
.end method

.method public setFinished()Z
    .locals 2

    iget-boolean v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/snmp4j/Snmp$PendingRequest;->finished:Z

    return v0
.end method

.method public setMaxRequestStatus(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->maxRequestStatus:I

    return-void
.end method

.method public setNextPDU(Lorg/snmp4j/PDU;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/Snmp$PendingRequest;->nextPDU:Lorg/snmp4j/PDU;

    return-void
.end method

.method public useNextPDU()Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->nextPDU:Lorg/snmp4j/PDU;

    if-eqz v0, :cond_0

    iput-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/snmp4j/Snmp$PendingRequest;->nextPDU:Lorg/snmp4j/PDU;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
