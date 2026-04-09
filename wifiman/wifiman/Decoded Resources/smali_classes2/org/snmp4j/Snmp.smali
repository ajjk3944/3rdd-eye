.class public Lorg/snmp4j/Snmp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/Session;
.implements Lorg/snmp4j/CommandResponder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/Snmp$NotificationDispatcher;,
        Lorg/snmp4j/Snmp$SyncResponseListener;,
        Lorg/snmp4j/Snmp$AsyncRequestKey;,
        Lorg/snmp4j/Snmp$AsyncPendingRequest;,
        Lorg/snmp4j/Snmp$PendingRequest;,
        Lorg/snmp4j/Snmp$ReportProcessor;,
        Lorg/snmp4j/Snmp$ReportHandler;
    }
.end annotation


# static fields
.field private static final DEFAULT_MAX_REQUEST_STATUS:I = 0x2

.field private static final ENGINE_ID_DISCOVERY_MAX_REQUEST_STATUS:I

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private final asyncRequests:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lorg/snmp4j/mp/PduHandle;",
            ">;"
        }
    .end annotation
.end field

.field private commandResponderListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/CommandResponder;",
            ">;"
        }
    .end annotation
.end field

.field private contextEngineIDs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/smi/OctetString;",
            ">;"
        }
    .end annotation
.end field

.field private contextEngineIdDiscoveryDisabled:Z

.field private counterSupport:Lorg/snmp4j/mp/CounterSupport;

.field private messageDispatcher:Lorg/snmp4j/MessageDispatcher;

.field private notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

.field private final pendingRequests:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/mp/PduHandle;",
            "Lorg/snmp4j/Snmp$PendingRequest;",
            ">;"
        }
    .end annotation
.end field

.field private reportHandler:Lorg/snmp4j/Snmp$ReportHandler;

.field private timeoutModel:Lorg/snmp4j/TimeoutModel;

.field private timer:Lorg/snmp4j/util/CommonTimer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/Snmp;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/Hashtable;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->asyncRequests:Ljava/util/Map;

    .line 4
    new-instance v0, Lorg/snmp4j/DefaultTimeoutModel;

    invoke-direct {v0}, Lorg/snmp4j/DefaultTimeoutModel;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->timeoutModel:Lorg/snmp4j/TimeoutModel;

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    .line 6
    new-instance v0, Lorg/snmp4j/Snmp$ReportProcessor;

    invoke-direct {v0, p0}, Lorg/snmp4j/Snmp$ReportProcessor;-><init>(Lorg/snmp4j/Snmp;)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->reportHandler:Lorg/snmp4j/Snmp$ReportHandler;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/Snmp;->contextEngineIDs:Ljava/util/Map;

    .line 9
    new-instance v0, Lorg/snmp4j/MessageDispatcherImpl;

    invoke-direct {v0}, Lorg/snmp4j/MessageDispatcherImpl;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    .line 10
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object v0

    sget-object v1, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->none:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-eq v0, v1, :cond_0

    .line 11
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/Snmp;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/MessageDispatcher;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/Hashtable;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    .line 30
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->asyncRequests:Ljava/util/Map;

    .line 31
    new-instance v0, Lorg/snmp4j/DefaultTimeoutModel;

    invoke-direct {v0}, Lorg/snmp4j/DefaultTimeoutModel;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->timeoutModel:Lorg/snmp4j/TimeoutModel;

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    .line 33
    new-instance v0, Lorg/snmp4j/Snmp$ReportProcessor;

    invoke-direct {v0, p0}, Lorg/snmp4j/Snmp$ReportProcessor;-><init>(Lorg/snmp4j/Snmp;)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->reportHandler:Lorg/snmp4j/Snmp$ReportHandler;

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 35
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/Snmp;->contextEngineIDs:Ljava/util/Map;

    .line 36
    iput-object p1, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    .line 37
    invoke-interface {p1, p0}, Lorg/snmp4j/MessageDispatcher;->addCommandResponder(Lorg/snmp4j/CommandResponder;)V

    .line 38
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object p1

    sget-object v0, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->none:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-eq p1, v0, :cond_0

    .line 39
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/Snmp;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/TransportMapping;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/MessageDispatcher;",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/Hashtable;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    .line 17
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->asyncRequests:Ljava/util/Map;

    .line 18
    new-instance v0, Lorg/snmp4j/DefaultTimeoutModel;

    invoke-direct {v0}, Lorg/snmp4j/DefaultTimeoutModel;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->timeoutModel:Lorg/snmp4j/TimeoutModel;

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    .line 20
    new-instance v0, Lorg/snmp4j/Snmp$ReportProcessor;

    invoke-direct {v0, p0}, Lorg/snmp4j/Snmp$ReportProcessor;-><init>(Lorg/snmp4j/Snmp;)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->reportHandler:Lorg/snmp4j/Snmp$ReportHandler;

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/Snmp;->contextEngineIDs:Ljava/util/Map;

    .line 23
    iput-object p1, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    .line 24
    invoke-interface {p1, p0}, Lorg/snmp4j/MessageDispatcher;->addCommandResponder(Lorg/snmp4j/CommandResponder;)V

    if-eqz p2, :cond_0

    .line 25
    invoke-virtual {p0, p2}, Lorg/snmp4j/Snmp;->addTransportMapping(Lorg/snmp4j/TransportMapping;)V

    .line 26
    :cond_0
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object p1

    sget-object p2, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->none:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-eq p1, p2, :cond_1

    .line 27
    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/Snmp;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    :cond_1
    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/TransportMapping;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Lorg/snmp4j/Snmp;-><init>()V

    .line 13
    invoke-virtual {p0}, Lorg/snmp4j/Snmp;->initMessageDispatcher()V

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p0, p1}, Lorg/snmp4j/Snmp;->addTransportMapping(Lorg/snmp4j/TransportMapping;)V

    :cond_0
    return-void
.end method

.method static synthetic access$1000(Lorg/snmp4j/Snmp;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/snmp4j/Snmp;->contextEngineIdDiscoveryDisabled:Z

    return p0
.end method

.method static synthetic access$1100(Lorg/snmp4j/Snmp;)Lorg/snmp4j/MessageDispatcher;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    return-object p0
.end method

.method static synthetic access$1200(Lorg/snmp4j/Snmp;)Lorg/snmp4j/TimeoutModel;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/Snmp;->timeoutModel:Lorg/snmp4j/TimeoutModel;

    return-object p0
.end method

.method static synthetic access$1300(Lorg/snmp4j/Snmp;)Lorg/snmp4j/util/CommonTimer;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/Snmp;->timer:Lorg/snmp4j/util/CommonTimer;

    return-object p0
.end method

.method static synthetic access$1400(Lorg/snmp4j/Snmp;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/Snmp;->asyncRequests:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$500()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    sget-object v0, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    return-object v0
.end method

.method static synthetic access$600(Lorg/snmp4j/Snmp;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$800(Lorg/snmp4j/Snmp;Lorg/snmp4j/PDU;)Z
    .locals 0

    invoke-direct {p0, p1}, Lorg/snmp4j/Snmp;->isEmptyContextEngineID(Lorg/snmp4j/PDU;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$900(Lorg/snmp4j/Snmp;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lorg/snmp4j/Snmp;->contextEngineIDs:Ljava/util/Map;

    return-object p0
.end method

.method private declared-synchronized createPendingTimer()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->timer:Lorg/snmp4j/util/CommonTimer;

    if-nez v0, :cond_0

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getTimerFactory()Lorg/snmp4j/util/TimerFactory;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/util/TimerFactory;->createTimer()Lorg/snmp4j/util/CommonTimer;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/Snmp;->timer:Lorg/snmp4j/util/CommonTimer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

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

    throw v0
.end method

.method private getMPv3()Lorg/snmp4j/mp/MPv3;
    .locals 2

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lorg/snmp4j/Snmp;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/mp/MPv3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "MPv3 not available"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private isEmptyContextEngineID(Lorg/snmp4j/PDU;)Z
    .locals 2

    instance-of v0, p1, Lorg/snmp4j/ScopedPDU;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lorg/snmp4j/ScopedPDU;

    invoke-virtual {p1}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/ScopedPDU;->getContextEngineID()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->length()I

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;I)Lorg/snmp4j/event/ResponseEvent;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Lorg/snmp4j/PDU;->isConfirmedPdu()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p4, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/snmp4j/Snmp;->sendMessage(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    return-object p4

    .line 5
    :cond_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->timer:Lorg/snmp4j/util/CommonTimer;

    if-nez v0, :cond_1

    .line 6
    invoke-direct {p0}, Lorg/snmp4j/Snmp;->createPendingTimer()V

    .line 7
    :cond_1
    new-instance v0, Lorg/snmp4j/Snmp$SyncResponseListener;

    invoke-direct {v0}, Lorg/snmp4j/Snmp$SyncResponseListener;-><init>()V

    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    new-instance v8, Lorg/snmp4j/Snmp$PendingRequest;

    move-object v1, v8

    move-object v2, p0

    move-object v3, v0

    move-object v4, p2

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lorg/snmp4j/Snmp$PendingRequest;-><init>(Lorg/snmp4j/Snmp;Lorg/snmp4j/event/ResponseListener;Ljava/lang/Object;Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;)V

    .line 10
    invoke-static {v8, p4}, Lorg/snmp4j/Snmp$PendingRequest;->access$002(Lorg/snmp4j/Snmp$PendingRequest;I)I

    .line 11
    iget-object p4, v8, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    invoke-virtual {p0, p4, p2, p3, v8}, Lorg/snmp4j/Snmp;->sendMessage(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    move-result-object p3

    .line 12
    iget-object p4, p0, Lorg/snmp4j/Snmp;->timeoutModel:Lorg/snmp4j/TimeoutModel;

    .line 13
    invoke-interface {p2}, Lorg/snmp4j/Target;->getRetries()I

    move-result v1

    .line 14
    invoke-interface {p2}, Lorg/snmp4j/Target;->getTimeout()J

    move-result-wide v2

    .line 15
    invoke-interface {p4, v1, v2, v3}, Lorg/snmp4j/TimeoutModel;->getRequestTimeout(IJ)J

    move-result-wide v1

    .line 16
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-wide/32 v5, 0xf4240

    mul-long/2addr v1, v5

    add-long/2addr v3, v1

    .line 17
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Lorg/snmp4j/Snmp$SyncResponseListener;->getResponse()Lorg/snmp4j/event/ResponseEvent;

    move-result-object p2

    if-nez p2, :cond_2

    .line 18
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long v1, v3, v1

    div-long/2addr v1, v5

    const-wide/16 v9, 0x0

    cmp-long p2, v1, v9

    if-lez p2, :cond_2

    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p2

    goto :goto_2

    .line 20
    :cond_2
    iget-object p2, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {p2, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/Snmp$PendingRequest;

    .line 21
    sget-object p4, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p4}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Removed pending request with handle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p4, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 23
    :cond_3
    invoke-virtual {v8}, Lorg/snmp4j/Snmp$PendingRequest;->setFinished()Z

    .line 24
    invoke-virtual {v8}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :try_start_2
    invoke-static {v8}, Lorg/snmp4j/Snmp$PendingRequest;->access$100(Lorg/snmp4j/Snmp$PendingRequest;)Z

    move-result p4

    if-nez p4, :cond_5

    .line 26
    iget-object p2, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {p2, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/Snmp$PendingRequest;

    if-eqz p2, :cond_5

    .line 27
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->setFinished()Z

    .line 28
    :goto_1
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto/16 :goto_5

    .line 29
    :goto_2
    :try_start_3
    sget-object p4, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p4, p2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 30
    invoke-virtual {v8}, Lorg/snmp4j/Snmp$PendingRequest;->setFinished()Z

    .line 31
    invoke-virtual {v8}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z

    .line 32
    iget-object p2, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {p2, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/Snmp$PendingRequest;

    if-eqz p2, :cond_4

    .line 33
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->setFinished()Z

    .line 34
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z

    .line 35
    :cond_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Thread;->interrupt()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 36
    :try_start_4
    invoke-static {v8}, Lorg/snmp4j/Snmp$PendingRequest;->access$100(Lorg/snmp4j/Snmp$PendingRequest;)Z

    move-result p4

    if-nez p4, :cond_5

    .line 37
    iget-object p2, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {p2, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/Snmp$PendingRequest;

    if-eqz p2, :cond_5

    .line 38
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->setFinished()Z

    goto :goto_1

    .line 39
    :cond_5
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz p2, :cond_6

    .line 40
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->setFinished()Z

    .line 41
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z

    .line 42
    :cond_6
    invoke-virtual {v0}, Lorg/snmp4j/Snmp$SyncResponseListener;->getResponse()Lorg/snmp4j/event/ResponseEvent;

    move-result-object p2

    if-nez p2, :cond_7

    .line 43
    new-instance p2, Lorg/snmp4j/event/ResponseEvent;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    move-object v2, p0

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Lorg/snmp4j/event/ResponseEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;)V

    invoke-static {v0, p2}, Lorg/snmp4j/Snmp$SyncResponseListener;->access$202(Lorg/snmp4j/Snmp$SyncResponseListener;Lorg/snmp4j/event/ResponseEvent;)Lorg/snmp4j/event/ResponseEvent;

    .line 44
    :cond_7
    invoke-static {v0}, Lorg/snmp4j/Snmp$SyncResponseListener;->access$200(Lorg/snmp4j/Snmp$SyncResponseListener;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    return-object p1

    .line 45
    :goto_4
    :try_start_5
    invoke-static {v8}, Lorg/snmp4j/Snmp$PendingRequest;->access$100(Lorg/snmp4j/Snmp$PendingRequest;)Z

    move-result p2

    if-nez p2, :cond_8

    .line 46
    iget-object p2, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {p2, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/Snmp$PendingRequest;

    if-eqz p2, :cond_8

    .line 47
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->setFinished()Z

    .line 48
    invoke-virtual {p2}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z

    .line 49
    :cond_8
    throw p1

    .line 50
    :goto_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method


# virtual methods
.method public declared-synchronized addCommandResponder(Lorg/snmp4j/CommandResponder;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->commandResponderListeners:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/snmp4j/Snmp;->commandResponderListeners:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v0, p0, Lorg/snmp4j/Snmp;->commandResponderListeners:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized addNotificationListener(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/CommandResponder;)Z
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    instance-of v0, p1, Lorg/snmp4j/transport/ConnectionOrientedTransportMapping;

    if-eqz v0, :cond_0

    .line 2
    move-object v0, p1

    check-cast v0, Lorg/snmp4j/transport/ConnectionOrientedTransportMapping;

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Lorg/snmp4j/transport/ConnectionOrientedTransportMapping;->setConnectionTimeout(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 3
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {p1, v0}, Lorg/snmp4j/TransportMapping;->addTransportListener(Lorg/snmp4j/transport/TransportListener;)V

    .line 4
    iget-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lorg/snmp4j/Snmp$NotificationDispatcher;

    invoke-direct {v0, p0}, Lorg/snmp4j/Snmp$NotificationDispatcher;-><init>(Lorg/snmp4j/Snmp;)V

    iput-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    .line 6
    invoke-virtual {p0, v0}, Lorg/snmp4j/Snmp;->addCommandResponder(Lorg/snmp4j/CommandResponder;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    invoke-virtual {v0, p2, p1, p3}, Lorg/snmp4j/Snmp$NotificationDispatcher;->addNotificationListener(Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/CommandResponder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    :try_start_1
    invoke-interface {p1}, Lorg/snmp4j/TransportMapping;->listen()V

    .line 9
    sget-object p1, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 10
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Added notification listener for address: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    .line 11
    :cond_2
    :goto_1
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    .line 12
    :goto_2
    :try_start_2
    sget-object p3, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to initialize notification listener for address \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\': "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-interface {p3, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public declared-synchronized addNotificationListener(Lorg/snmp4j/smi/Address;Lorg/snmp4j/CommandResponder;)Z
    .locals 2

    monitor-enter p0

    .line 16
    :try_start_0
    invoke-static {}, Lorg/snmp4j/transport/TransportMappings;->getInstance()Lorg/snmp4j/transport/TransportMappings;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/snmp4j/transport/TransportMappings;->createTransportMapping(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;

    move-result-object v0

    if-nez v0, :cond_1

    .line 17
    sget-object p2, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to add notification listener for address: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    .line 20
    :cond_1
    :try_start_1
    invoke-virtual {p0, v0, p1, p2}, Lorg/snmp4j/Snmp;->addNotificationListener(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/CommandResponder;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
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

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->addTransportMapping(Lorg/snmp4j/TransportMapping;)V

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {p1, v0}, Lorg/snmp4j/TransportMapping;->addTransportListener(Lorg/snmp4j/transport/TransportListener;)V

    return-void
.end method

.method public cancel(Lorg/snmp4j/PDU;Lorg/snmp4j/event/ResponseListener;)V
    .locals 2

    new-instance v0, Lorg/snmp4j/Snmp$AsyncRequestKey;

    invoke-direct {v0, p1, p2}, Lorg/snmp4j/Snmp$AsyncRequestKey;-><init>(Lorg/snmp4j/PDU;Lorg/snmp4j/event/ResponseListener;)V

    iget-object p1, p0, Lorg/snmp4j/Snmp;->asyncRequests:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/mp/PduHandle;

    sget-object p2, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cancelling pending request with handle "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object p2, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/Snmp$PendingRequest;

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lorg/snmp4j/Snmp$PendingRequest;->setFinished()Z

    invoke-virtual {p1}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public close()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0}, Lorg/snmp4j/MessageDispatcher;->getTransportMappings()Ljava/util/Collection;

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

    invoke-interface {v1}, Lorg/snmp4j/TransportMapping;->close()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->timer:Lorg/snmp4j/util/CommonTimer;

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/snmp4j/Snmp;->timer:Lorg/snmp4j/util/CommonTimer;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lorg/snmp4j/util/CommonTimer;->cancel()V

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/snmp4j/Snmp$NotificationDispatcher;->closeAll()V

    :cond_2
    iget-object v0, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/Snmp$PendingRequest;

    invoke-virtual {v1}, Lorg/snmp4j/Snmp$PendingRequest;->cancel()Z

    new-instance v9, Lorg/snmp4j/event/ResponseEvent;

    iget-object v5, v1, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iget-object v7, v1, Lorg/snmp4j/Snmp$PendingRequest;->userObject:Ljava/lang/Object;

    new-instance v8, Ljava/lang/InterruptedException;

    const-string v2, "Snmp session has been closed"

    invoke-direct {v8, v2}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v2, v9

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Lorg/snmp4j/event/ResponseEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;Ljava/lang/Exception;)V

    iget-object v1, v1, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    if-eqz v1, :cond_3

    invoke-interface {v1, v9}, Lorg/snmp4j/event/ResponseListener;->onResponse(Lorg/snmp4j/event/ResponseEvent;)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lorg/snmp4j/Snmp;->asyncRequests:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method protected closeTransportMapping(Lorg/snmp4j/TransportMapping;)V
    .locals 1

    :try_start_0
    invoke-interface {p1}, Lorg/snmp4j/TransportMapping;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    sget-object v0, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public discoverAuthoritativeEngineID(Lorg/snmp4j/smi/Address;J)[B
    .locals 3

    invoke-direct {p0}, Lorg/snmp4j/Snmp;->getMPv3()Lorg/snmp4j/mp/MPv3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/MPv3;->removeEngineID(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lorg/snmp4j/Snmp;->getUSM()Lorg/snmp4j/security/USM;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lorg/snmp4j/security/USM;->removeEngineTime(Lorg/snmp4j/smi/OctetString;)V

    :cond_0
    new-instance v1, Lorg/snmp4j/ScopedPDU;

    invoke-direct {v1}, Lorg/snmp4j/ScopedPDU;-><init>()V

    const/16 v2, -0x60

    invoke-virtual {v1, v2}, Lorg/snmp4j/PDU;->setType(I)V

    new-instance v2, Lorg/snmp4j/UserTarget;

    invoke-direct {v2}, Lorg/snmp4j/UserTarget;-><init>()V

    invoke-virtual {v2, p2, p3}, Lorg/snmp4j/AbstractTarget;->setTimeout(J)V

    invoke-virtual {v2, p1}, Lorg/snmp4j/AbstractTarget;->setAddress(Lorg/snmp4j/smi/Address;)V

    const/4 p2, 0x1

    invoke-virtual {v2, p2}, Lorg/snmp4j/AbstractTarget;->setSecurityLevel(I)V

    const/4 p2, 0x0

    const/4 p3, 0x0

    :try_start_0
    invoke-direct {p0, v1, v2, p3, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;I)Lorg/snmp4j/event/ResponseEvent;

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/MPv3;->getEngineID(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p3

    :cond_1
    new-instance p2, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p1}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {p2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object p2, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IO error while trying to discover authoritative engine ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    return-object p3
.end method

.method protected fireProcessPdu(Lorg/snmp4j/CommandResponderEvent;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/Snmp;->commandResponderListeners:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/CommandResponder;

    invoke-interface {v1, p1}, Lorg/snmp4j/CommandResponder;->processPdu(Lorg/snmp4j/CommandResponderEvent;)V

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->isProcessed()Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    return-void
.end method

.method public get(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x60

    .line 1
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    return-object p1
.end method

.method public get(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x60

    .line 3
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V

    return-void
.end method

.method public getBulk(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x5b

    .line 1
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    return-object p1
.end method

.method public getBulk(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x5b

    .line 3
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V

    return-void
.end method

.method public getCounterSupport()Lorg/snmp4j/mp/CounterSupport;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-object v0
.end method

.method public getLocalEngineID()[B
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/Snmp;->getMPv3()Lorg/snmp4j/mp/MPv3;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/mp/MPv3;->getLocalEngineID()[B

    move-result-object v0

    return-object v0
.end method

.method public getMessageDispatcher()Lorg/snmp4j/MessageDispatcher;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    return-object v0
.end method

.method public getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object p1

    return-object p1
.end method

.method public getNext(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x5f

    .line 1
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    return-object p1
.end method

.method public getNext(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x5f

    .line 3
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V

    return-void
.end method

.method public getNextRequestID()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0}, Lorg/snmp4j/MessageDispatcher;->getNextRequestID()I

    move-result v0

    return v0
.end method

.method public getNotificationListenerTM(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/snmp4j/Snmp$NotificationDispatcher;->getTransportMapping(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getPendingAsyncRequestCount()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->asyncRequests:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public getPendingSyncRequestCount()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public getReportHandler()Lorg/snmp4j/Snmp$ReportHandler;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->reportHandler:Lorg/snmp4j/Snmp$ReportHandler;

    return-object v0
.end method

.method public getTimeoutModel()Lorg/snmp4j/TimeoutModel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/Snmp;->timeoutModel:Lorg/snmp4j/TimeoutModel;

    return-object v0
.end method

.method public getUSM()Lorg/snmp4j/security/USM;
    .locals 2

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lorg/snmp4j/Snmp;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/mp/MPv3;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lorg/snmp4j/mp/MPv3;->getSecurityModel(I)Lorg/snmp4j/security/SecurityModel;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/security/USM;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected handleInternalResponse(Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Lorg/snmp4j/smi/Address;)V
    .locals 2

    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpEngineID:Lorg/snmp4j/smi/OID;

    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->getVariable(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/Variable;

    move-result-object p1

    instance-of v0, p1, Lorg/snmp4j/smi/OctetString;

    if-eqz v0, :cond_0

    instance-of v0, p2, Lorg/snmp4j/ScopedPDU;

    if-eqz v0, :cond_0

    check-cast p2, Lorg/snmp4j/ScopedPDU;

    move-object v0, p1

    check-cast v0, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {p2, v0}, Lorg/snmp4j/ScopedPDU;->setContextEngineID(Lorg/snmp4j/smi/OctetString;)V

    sget-object p2, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Discovered contextEngineID \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' by RFC 5343 for "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public inform(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x5a

    .line 1
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    return-object p1
.end method

.method public inform(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x5a

    .line 3
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V

    return-void
.end method

.method protected final initMessageDispatcher()V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p0}, Lorg/snmp4j/MessageDispatcher;->addCommandResponder(Lorg/snmp4j/CommandResponder;)V

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    new-instance v1, Lorg/snmp4j/mp/MPv2c;

    invoke-direct {v1}, Lorg/snmp4j/mp/MPv2c;-><init>()V

    invoke-interface {v0, v1}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    new-instance v1, Lorg/snmp4j/mp/MPv1;

    invoke-direct {v1}, Lorg/snmp4j/mp/MPv1;-><init>()V

    invoke-interface {v0, v1}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    new-instance v1, Lorg/snmp4j/mp/MPv3;

    invoke-direct {v1}, Lorg/snmp4j/mp/MPv3;-><init>()V

    invoke-interface {v0, v1}, Lorg/snmp4j/MessageDispatcher;->addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V

    invoke-static {}, Lorg/snmp4j/security/SecurityProtocols;->getInstance()Lorg/snmp4j/security/SecurityProtocols;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/security/SecurityProtocols;->addDefaultProtocols()Lorg/snmp4j/security/SecurityProtocols;

    return-void
.end method

.method public isContextEngineIdDiscoveryDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/Snmp;->contextEngineIdDiscoveryDisabled:Z

    return v0
.end method

.method public listen()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0}, Lorg/snmp4j/MessageDispatcher;->getTransportMappings()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/TransportMapping;

    invoke-interface {v1}, Lorg/snmp4j/TransportMapping;->isListening()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Lorg/snmp4j/TransportMapping;->listen()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected lookupTransportMapping(Lorg/snmp4j/Target;)Lorg/snmp4j/TransportMapping;
    .locals 4

    invoke-interface {p1}, Lorg/snmp4j/Target;->getPreferredTransports()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/TransportMapping;

    invoke-interface {v1}, Lorg/snmp4j/TransportMapping;->getSupportedAddressClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {p1}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public notify(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p2}, Lorg/snmp4j/Target;->getVersion()I

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, -0x59

    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Notifications PDUs cannot be used with SNMPv1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public processPdu(Lorg/snmp4j/CommandResponderEvent;)V
    .locals 13

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v0

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object v1

    sget-object v2, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->extended:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-ne v1, v2, :cond_0

    instance-of v1, v0, Lorg/snmp4j/mp/RequestStatistics;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lorg/snmp4j/mp/RequestStatistics;

    iget-object v2, p0, Lorg/snmp4j/Snmp;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    new-instance v3, Lorg/snmp4j/event/CounterEvent;

    sget-object v4, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsRequestRuntime:Lorg/snmp4j/smi/OID;

    invoke-interface {v1}, Lorg/snmp4j/mp/RequestStatistics;->getResponseRuntimeNanos()J

    move-result-wide v5

    invoke-direct {v3, p0, v4, v5, v6}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;J)V

    invoke-virtual {v2, v3}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    new-instance v2, Lorg/snmp4j/event/CounterEvent;

    sget-object v9, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsReqTableRuntime:Lorg/snmp4j/smi/OID;

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object v10

    invoke-interface {v1}, Lorg/snmp4j/mp/RequestStatistics;->getResponseRuntimeNanos()J

    move-result-wide v11

    move-object v7, v2

    move-object v8, p0

    invoke-direct/range {v7 .. v12}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;Ljava/lang/Object;J)V

    iget-object v1, p0, Lorg/snmp4j/Snmp;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    invoke-virtual {v1, v2}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    :cond_0
    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPDU()Lorg/snmp4j/PDU;

    move-result-object v7

    invoke-virtual {v7}, Lorg/snmp4j/PDU;->getType()I

    move-result v1

    const/16 v2, -0x58

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {p1, v3}, Lorg/snmp4j/CommandResponderEvent;->setProcessed(Z)V

    iget-object v1, p0, Lorg/snmp4j/Snmp;->reportHandler:Lorg/snmp4j/Snmp$ReportHandler;

    invoke-interface {v1, v0, p1}, Lorg/snmp4j/Snmp$ReportHandler;->processReport(Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/CommandResponderEvent;)V

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v7}, Lorg/snmp4j/PDU;->getType()I

    move-result v1

    const/16 v2, -0x5e

    if-ne v1, v2, :cond_5

    invoke-virtual {p1, v3}, Lorg/snmp4j/CommandResponderEvent;->setProcessed(Z)V

    sget-object v1, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Looking up pending request with handle "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_2
    iget-object v2, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/Snmp$PendingRequest;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lorg/snmp4j/Snmp$PendingRequest;->responseReceived()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_4

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isWarnEnabled()Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received response that cannot be matched to any outstanding request, address="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", requestID="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v0, v7}, Lorg/snmp4j/Snmp;->resendRequest(Lorg/snmp4j/Snmp$PendingRequest;Lorg/snmp4j/PDU;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, v0, Lorg/snmp4j/Snmp$PendingRequest;->listener:Lorg/snmp4j/event/ResponseListener;

    if-eqz v1, :cond_7

    new-instance v2, Lorg/snmp4j/event/ResponseEvent;

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->getPeerAddress()Lorg/snmp4j/smi/Address;

    move-result-object v5

    iget-object v6, v0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iget-object v8, v0, Lorg/snmp4j/Snmp$PendingRequest;->userObject:Ljava/lang/Object;

    move-object v3, v2

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lorg/snmp4j/event/ResponseEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/Address;Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lorg/snmp4j/event/ResponseListener;->onResponse(Lorg/snmp4j/event/ResponseEvent;)V

    goto :goto_2

    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_5
    sget-object v0, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fire process PDU event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/CommandResponderEvent;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_6
    invoke-virtual {p0, p1}, Lorg/snmp4j/Snmp;->fireProcessPdu(Lorg/snmp4j/CommandResponderEvent;)V

    :cond_7
    :goto_2
    return-void
.end method

.method public declared-synchronized removeCommandResponder(Lorg/snmp4j/CommandResponder;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->commandResponderListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/snmp4j/Snmp;->commandResponderListeners:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iput-object v0, p0, Lorg/snmp4j/Snmp;->commandResponderListeners:Ljava/util/List;
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

.method public declared-synchronized removeNotificationListener(Lorg/snmp4j/smi/Address;)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    if-eqz v0, :cond_1

    sget-object v0, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Removing notification listener for address: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->notificationDispatcher:Lorg/snmp4j/Snmp$NotificationDispatcher;

    invoke-virtual {v0, p1}, Lorg/snmp4j/Snmp$NotificationDispatcher;->removeNotificationListener(Lorg/snmp4j/smi/Address;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public removeTransportMapping(Lorg/snmp4j/TransportMapping;)V
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

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v0, p1}, Lorg/snmp4j/MessageDispatcher;->removeTransportMapping(Lorg/snmp4j/TransportMapping;)Lorg/snmp4j/TransportMapping;

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {p1, v0}, Lorg/snmp4j/TransportMapping;->removeTransportListener(Lorg/snmp4j/transport/TransportListener;)V

    return-void
.end method

.method protected resendRequest(Lorg/snmp4j/Snmp$PendingRequest;Lorg/snmp4j/PDU;)Z
    .locals 4

    invoke-virtual {p1}, Lorg/snmp4j/Snmp$PendingRequest;->useNextPDU()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1, v1}, Lorg/snmp4j/Snmp$PendingRequest;->access$302(Lorg/snmp4j/Snmp$PendingRequest;Z)Z

    iget-object v0, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/Snmp;->pendingRequests:Ljava/util/Map;

    invoke-static {p1}, Lorg/snmp4j/Snmp$PendingRequest;->access$400(Lorg/snmp4j/Snmp$PendingRequest;)Lorg/snmp4j/mp/PduHandle;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lorg/snmp4j/Snmp$PendingRequest;->access$400(Lorg/snmp4j/Snmp$PendingRequest;)Lorg/snmp4j/mp/PduHandle;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v2}, Lorg/snmp4j/Snmp$PendingRequest;->access$402(Lorg/snmp4j/Snmp$PendingRequest;Lorg/snmp4j/mp/PduHandle;)Lorg/snmp4j/mp/PduHandle;

    iget-object v2, p1, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iget-object v3, p1, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    invoke-interface {v3}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v3

    invoke-virtual {p0, p2, v2, v3}, Lorg/snmp4j/Snmp;->handleInternalResponse(Lorg/snmp4j/PDU;Lorg/snmp4j/PDU;Lorg/snmp4j/smi/Address;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p2, p1, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    iget-object v2, p1, Lorg/snmp4j/Snmp$PendingRequest;->target:Lorg/snmp4j/Target;

    iget-object v3, p1, Lorg/snmp4j/Snmp$PendingRequest;->transport:Lorg/snmp4j/TransportMapping;

    invoke-virtual {p0, p2, v2, v3, p1}, Lorg/snmp4j/Snmp;->sendMessage(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    sget-object p2, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException while resending request after RFC 5343 context engine ID discovery: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    :goto_0
    sget-object p1, Lorg/snmp4j/Snmp;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Releasing PDU handle "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_0
    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    return v1
.end method

.method public send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    return-object p1
.end method

.method public send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;)Lorg/snmp4j/event/ResponseEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;I)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    return-object p1
.end method

.method public send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    .line 51
    invoke-virtual/range {v0 .. v5}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V

    return-void
.end method

.method public send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    invoke-virtual {p1}, Lorg/snmp4j/PDU;->isConfirmedPdu()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p4, 0x0

    .line 53
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/snmp4j/Snmp;->sendMessage(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    return-void

    .line 54
    :cond_0
    iget-object v0, p0, Lorg/snmp4j/Snmp;->timer:Lorg/snmp4j/util/CommonTimer;

    if-nez v0, :cond_1

    .line 55
    invoke-direct {p0}, Lorg/snmp4j/Snmp;->createPendingTimer()V

    .line 56
    :cond_1
    new-instance v0, Lorg/snmp4j/Snmp$AsyncPendingRequest;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p5

    move-object v4, p4

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Lorg/snmp4j/Snmp$AsyncPendingRequest;-><init>(Lorg/snmp4j/Snmp;Lorg/snmp4j/event/ResponseListener;Ljava/lang/Object;Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;)V

    .line 57
    iget-object p1, v0, Lorg/snmp4j/Snmp$PendingRequest;->pdu:Lorg/snmp4j/PDU;

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/snmp4j/Snmp;->sendMessage(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    return-void
.end method

.method protected sendMessage(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/PDU;",
            "Lorg/snmp4j/Target;",
            "Lorg/snmp4j/TransportMapping;",
            "Lorg/snmp4j/mp/PduHandleCallback<",
            "Lorg/snmp4j/PDU;",
            ">;)",
            "Lorg/snmp4j/mp/PduHandle;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p3, :cond_0

    invoke-virtual {p0, p2}, Lorg/snmp4j/Snmp;->lookupTransportMapping(Lorg/snmp4j/Target;)Lorg/snmp4j/TransportMapping;

    move-result-object p3

    :cond_0
    move-object v1, p3

    iget-object v0, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    const/4 v4, 0x1

    move-object v2, p2

    move-object v3, p1

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lorg/snmp4j/MessageDispatcher;->sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    move-result-object p1

    return-object p1
.end method

.method public set(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x5d

    .line 1
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1

    return-object p1
.end method

.method public set(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, -0x5d

    .line 3
    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V

    return-void
.end method

.method public setContextEngineIdDiscoveryDisabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/Snmp;->contextEngineIdDiscoveryDisabled:Z

    return-void
.end method

.method public setCounterSupport(Lorg/snmp4j/mp/CounterSupport;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/Snmp;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-void
.end method

.method public setLocalEngine([BII)V
    .locals 2

    invoke-direct {p0}, Lorg/snmp4j/Snmp;->getMPv3()Lorg/snmp4j/mp/MPv3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/MPv3;->setLocalEngineID([B)V

    invoke-static {p2}, Lorg/snmp4j/mp/MPv3;->randomMsgID(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/MPv3;->setCurrentMsgID(I)V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/MPv3;->getSecurityModel(I)Lorg/snmp4j/security/SecurityModel;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/security/USM;

    if-eqz v0, :cond_0

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v1, p1}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v0, v1, p2, p3}, Lorg/snmp4j/security/USM;->setLocalEngine(Lorg/snmp4j/smi/OctetString;II)V

    :cond_0
    return-void
.end method

.method public setMessageDispatcher(Lorg/snmp4j/MessageDispatcher;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iget-object v1, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lorg/snmp4j/MessageDispatcher;->getTransportMappings()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/snmp4j/TransportMapping;

    invoke-virtual {p0, v2}, Lorg/snmp4j/Snmp;->removeTransportMapping(Lorg/snmp4j/TransportMapping;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {v1, p0}, Lorg/snmp4j/MessageDispatcher;->removeCommandResponder(Lorg/snmp4j/CommandResponder;)V

    :cond_1
    iput-object p1, p0, Lorg/snmp4j/Snmp;->messageDispatcher:Lorg/snmp4j/MessageDispatcher;

    invoke-interface {p1, p0}, Lorg/snmp4j/MessageDispatcher;->addCommandResponder(Lorg/snmp4j/CommandResponder;)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/TransportMapping;

    invoke-virtual {p0, v0}, Lorg/snmp4j/Snmp;->addTransportMapping(Lorg/snmp4j/TransportMapping;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public setReportHandler(Lorg/snmp4j/Snmp$ReportHandler;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lorg/snmp4j/Snmp;->reportHandler:Lorg/snmp4j/Snmp$ReportHandler;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ReportHandler must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setTimeoutModel(Lorg/snmp4j/TimeoutModel;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lorg/snmp4j/Snmp;->timeoutModel:Lorg/snmp4j/TimeoutModel;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Timeout model cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public trap(Lorg/snmp4j/PDUv1;Lorg/snmp4j/Target;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p2}, Lorg/snmp4j/Target;->getVersion()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, -0x5c

    invoke-virtual {p1, v0}, Lorg/snmp4j/PDU;->setType(I)V

    invoke-virtual {p0, p1, p2}, Lorg/snmp4j/Snmp;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SNMPv1 trap PDU must be used with SNMPv1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
