.class public Lorg/snmp4j/MessageDispatcherImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/MessageDispatcher;


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private transient authenticationFailureListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/event/AuthenticationFailureListener;",
            ">;"
        }
    .end annotation
.end field

.field private checkOutgoingMsg:Z

.field private transient commandResponderListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/CommandResponder;",
            ">;"
        }
    .end annotation
.end field

.field private transient counterListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/event/CounterListener;",
            ">;"
        }
    .end annotation
.end field

.field private mpm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/mp/MessageProcessingModel;",
            ">;"
        }
    .end annotation
.end field

.field private nextTransactionID:I

.field private transportMappings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;",
            "Ljava/util/List<",
            "Lorg/snmp4j/TransportMapping;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/MessageDispatcherImpl;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->mpm:Ljava/util/List;

    new-instance v0, Ljava/util/Hashtable;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->transportMappings:Ljava/util/Map;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const v1, 0x7ffffffd

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->nextTransactionID:I

    iput-boolean v1, p0, Lorg/snmp4j/MessageDispatcherImpl;->checkOutgoingMsg:Z

    return-void
.end method

.method private static checkListening4ConfirmedPDU(Lorg/snmp4j/PDU;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lorg/snmp4j/TransportMapping;->isListening()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending confirmed PDU "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " to target "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " although transport mapping "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not listening for a response"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized addAuthenticationFailureListener(Lorg/snmp4j/event/AuthenticationFailureListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->authenticationFailureListeners:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Vector;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->authenticationFailureListeners:Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->authenticationFailureListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->authenticationFailureListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
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

.method public declared-synchronized addCommandResponder(Lorg/snmp4j/CommandResponder;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->commandResponderListeners:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Vector;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->commandResponderListeners:Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->commandResponderListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->commandResponderListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
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

.method public declared-synchronized addCounterListener(Lorg/snmp4j/event/CounterListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->counterListeners:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Vector;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->counterListeners:Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->counterListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->counterListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
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

.method public declared-synchronized addMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V
    .locals 2

    monitor-enter p0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->mpm:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Lorg/snmp4j/mp/MessageProcessingModel;->getID()I

    move-result v1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->mpm:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->mpm:Ljava/util/List;

    invoke-interface {p1}, Lorg/snmp4j/mp/MessageProcessingModel;->getID()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->mpm:Ljava/util/List;

    invoke-interface {p1}, Lorg/snmp4j/mp/MessageProcessingModel;->getID()I

    move-result v1

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
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

.method public declared-synchronized addTransportMapping(Lorg/snmp4j/TransportMapping;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->transportMappings:Ljava/util/Map;

    invoke-interface {p1}, Lorg/snmp4j/TransportMapping;->getSupportedAddressClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iget-object v1, p0, Lorg/snmp4j/MessageDispatcherImpl;->transportMappings:Ljava/util/Map;

    invoke-interface {p1}, Lorg/snmp4j/TransportMapping;->getSupportedAddressClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
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

.method protected checkOutgoingMsg(Lorg/snmp4j/smi/Address;ILorg/snmp4j/PDU;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    iget-boolean v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->checkOutgoingMsg:Z

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isNoGetBulk()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-virtual {p3}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v1, -0x5b

    if-ne v0, v1, :cond_2

    if-nez p2, :cond_1

    sget-object p2, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Converting GETBULK PDU to GETNEXT for SNMPv1 target: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    goto :goto_0

    :cond_1
    sget-object p2, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Converting GETBULK PDU to GETNEXT for target: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :goto_0
    const/16 p1, -0x5f

    invoke-virtual {p3, p1}, Lorg/snmp4j/PDU;->setType(I)V

    instance-of p1, p3, Lorg/snmp4j/PDUv1;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Lorg/snmp4j/PDU;->setMaxRepetitions(I)V

    invoke-virtual {p3, p1}, Lorg/snmp4j/PDU;->setNonRepeaters(I)V

    :cond_2
    return-void
.end method

.method protected configureAuthoritativeEngineID(Lorg/snmp4j/Target;Lorg/snmp4j/mp/MessageProcessingModel;)V
    .locals 2

    instance-of v0, p1, Lorg/snmp4j/UserTarget;

    if-eqz v0, :cond_0

    instance-of v0, p2, Lorg/snmp4j/mp/MPv3;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lorg/snmp4j/UserTarget;

    invoke-virtual {v0}, Lorg/snmp4j/UserTarget;->getAuthoritativeEngineID()[B

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/snmp4j/UserTarget;->getAuthoritativeEngineID()[B

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_0

    check-cast p2, Lorg/snmp4j/mp/MPv3;

    invoke-interface {p1}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object p1

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-virtual {v0}, Lorg/snmp4j/UserTarget;->getAuthoritativeEngineID()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {p2, p1, v1}, Lorg/snmp4j/mp/MPv3;->addEngineID(Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)Z

    :cond_0
    return-void
.end method

.method protected createPduHandle()Lorg/snmp4j/mp/PduHandle;
    .locals 2

    new-instance v0, Lorg/snmp4j/mp/PduHandle;

    invoke-virtual {p0}, Lorg/snmp4j/MessageDispatcherImpl;->getNextRequestID()I

    move-result v1

    invoke-direct {v0, v1}, Lorg/snmp4j/mp/PduHandle;-><init>(I)V

    return-object v0
.end method

.method protected dispatchMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/MessageProcessingModel;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;)V
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v14, p0

    move-object/from16 v15, p1

    move-object/from16 v13, p3

    new-instance v16, Lorg/snmp4j/MutablePDU;

    invoke-direct/range {v16 .. v16}, Lorg/snmp4j/MutablePDU;-><init>()V

    new-instance v17, Lorg/snmp4j/smi/Integer32;

    invoke-direct/range {v17 .. v17}, Lorg/snmp4j/smi/Integer32;-><init>()V

    new-instance v18, Lorg/snmp4j/smi/Integer32;

    invoke-direct/range {v18 .. v18}, Lorg/snmp4j/smi/Integer32;-><init>()V

    new-instance v19, Lorg/snmp4j/smi/OctetString;

    invoke-direct/range {v19 .. v19}, Lorg/snmp4j/smi/OctetString;-><init>()V

    new-instance v20, Lorg/snmp4j/smi/Integer32;

    invoke-direct/range {v20 .. v20}, Lorg/snmp4j/smi/Integer32;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/MessageDispatcherImpl;->createPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v21

    new-instance v12, Lorg/snmp4j/smi/Integer32;

    invoke-interface/range {p1 .. p1}, Lorg/snmp4j/TransportMapping;->getMaxInboundMessageSize()I

    move-result v0

    invoke-direct {v12, v0}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    new-instance v11, Lorg/snmp4j/mp/StatusInformation;

    invoke-direct {v11}, Lorg/snmp4j/mp/StatusInformation;-><init>()V

    new-instance v10, Lorg/snmp4j/mp/MutableStateReference;

    invoke-direct {v10}, Lorg/snmp4j/mp/MutableStateReference;-><init>()V

    new-instance v0, Lorg/snmp4j/mp/StateReference;

    invoke-direct {v0}, Lorg/snmp4j/mp/StateReference;-><init>()V

    invoke-virtual {v0, v15}, Lorg/snmp4j/mp/StateReference;->setTransportMapping(Lorg/snmp4j/TransportMapping;)V

    invoke-virtual {v0, v13}, Lorg/snmp4j/mp/StateReference;->setAddress(Lorg/snmp4j/smi/Address;)V

    invoke-virtual {v10, v0}, Lorg/snmp4j/mp/MutableStateReference;->setStateReference(Lorg/snmp4j/mp/StateReference;)V

    move-object/from16 v0, p2

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    move-object/from16 v9, v16

    move-object/from16 v22, v10

    move-object/from16 v10, v21

    move-object/from16 p2, v11

    move-object v11, v12

    move-object/from16 v23, v12

    move-object/from16 v12, p2

    move-object/from16 v13, v22

    invoke-interface/range {v0 .. v13}, Lorg/snmp4j/mp/MessageProcessingModel;->prepareDataElements(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/MutablePDU;Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Integer32;Lorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/mp/MutableStateReference;)I

    move-result v6

    invoke-virtual/range {v22 .. v22}, Lorg/snmp4j/mp/MutableStateReference;->getStateReference()Lorg/snmp4j/mp/StateReference;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual/range {v22 .. v22}, Lorg/snmp4j/mp/MutableStateReference;->getStateReference()Lorg/snmp4j/mp/StateReference;

    move-result-object v0

    invoke-virtual {v0, v15}, Lorg/snmp4j/mp/StateReference;->setTransportMapping(Lorg/snmp4j/TransportMapping;)V

    :cond_0
    if-nez v6, :cond_2

    new-instance v12, Lorg/snmp4j/CommandResponderEvent;

    invoke-virtual/range {v17 .. v17}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v4

    invoke-virtual/range {v18 .. v18}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v5

    invoke-virtual/range {v19 .. v19}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v6

    invoke-virtual/range {v20 .. v20}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v7

    invoke-virtual/range {v16 .. v16}, Lorg/snmp4j/MutablePDU;->getPdu()Lorg/snmp4j/PDU;

    move-result-object v9

    invoke-virtual/range {v23 .. v23}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v10

    invoke-virtual/range {v22 .. v22}, Lorg/snmp4j/mp/MutableStateReference;->getStateReference()Lorg/snmp4j/mp/StateReference;

    move-result-object v11

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-object/from16 v8, v21

    invoke-direct/range {v0 .. v11}, Lorg/snmp4j/CommandResponderEvent;-><init>(Lorg/snmp4j/MessageDispatcher;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;II[BILorg/snmp4j/mp/PduHandle;Lorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object v0

    sget-object v1, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->none:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-eq v0, v1, :cond_1

    new-instance v6, Lorg/snmp4j/event/CounterEvent;

    sget-object v2, Lorg/snmp4j/mp/SnmpConstants;->snmp4jStatsResponseProcessTime:Lorg/snmp4j/smi/OID;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    move-object v0, v6

    move-object/from16 v1, p0

    move-object/from16 v3, p3

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;Ljava/lang/Object;J)V

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v14, v12}, Lorg/snmp4j/MessageDispatcherImpl;->fireProcessPdu(Lorg/snmp4j/CommandResponderEvent;)V

    if-eqz v6, :cond_4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-virtual {v6}, Lorg/snmp4j/event/CounterEvent;->getIncrement()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    invoke-virtual {v6, v0, v1}, Lorg/snmp4j/event/CounterEvent;->setIncrement(J)V

    invoke-virtual {v14, v6}, Lorg/snmp4j/MessageDispatcherImpl;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    goto :goto_2

    :cond_2
    const/16 v0, -0x586

    if-eq v6, v0, :cond_3

    const/16 v0, -0x584

    if-eq v6, v0, :cond_3

    const/16 v0, -0x57a

    if-eq v6, v0, :cond_3

    const/16 v0, 0x643

    if-eq v6, v0, :cond_3

    const/16 v0, 0x57b

    if-eq v6, v0, :cond_3

    const/16 v0, 0x57c

    if-eq v6, v0, :cond_3

    const/16 v0, 0x57f

    if-eq v6, v0, :cond_3

    const/16 v0, 0x580

    if-eq v6, v0, :cond_3

    packed-switch v6, :pswitch_data_0

    goto :goto_1

    :cond_3
    :pswitch_0
    new-instance v7, Lorg/snmp4j/event/AuthenticationFailureEvent;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p1

    move v4, v6

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/snmp4j/event/AuthenticationFailureEvent;-><init>(Lorg/snmp4j/transport/TransportListener;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;ILorg/snmp4j/asn1/BERInputStream;)V

    invoke-virtual {v14, v7}, Lorg/snmp4j/MessageDispatcherImpl;->fireAuthenticationFailure(Lorg/snmp4j/event/AuthenticationFailureEvent;)V

    :goto_1
    sget-object v0, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isInfoEnabled()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not dispatched, reason: statusInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", status="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->info(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x582
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected fireAuthenticationFailure(Lorg/snmp4j/event/AuthenticationFailureEvent;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->authenticationFailureListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/event/AuthenticationFailureListener;

    invoke-interface {v1, p1}, Lorg/snmp4j/event/AuthenticationFailureListener;->authenticationFailure(Lorg/snmp4j/event/AuthenticationFailureEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->counterListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/event/CounterListener;

    invoke-interface {v1, p1}, Lorg/snmp4j/event/CounterListener;->incrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected fireProcessPdu(Lorg/snmp4j/CommandResponderEvent;)V
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->commandResponderListeners:Ljava/util/List;

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

.method public getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->mpm:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/mp/MessageProcessingModel;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public declared-synchronized getNextRequestID()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->nextTransactionID:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/snmp4j/MessageDispatcherImpl;->nextTransactionID:I

    if-gtz v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->nextTransactionID:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getTransport(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->transportMappings:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/TransportMapping;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getTransportMappings()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/snmp4j/TransportMapping;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/snmp4j/MessageDispatcherImpl;->transportMappings:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lorg/snmp4j/MessageDispatcherImpl;->transportMappings:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lorg/snmp4j/MessageDispatcherImpl;->transportMappings:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit v1

    return-object v0

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public isCheckOutgoingMsg()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->checkOutgoingMsg:Z

    return v0
.end method

.method public processMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/snmp4j/asn1/BERInputStream;

    invoke-direct {v0, p3}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0, p1, p2, v0, p4}, Lorg/snmp4j/MessageDispatcherImpl;->processMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public processMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;)V
    .locals 8

    .line 2
    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpInPkts:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p0, v0}, Lorg/snmp4j/MessageDispatcherImpl;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    .line 3
    invoke-virtual {p3}, Lorg/snmp4j/asn1/BERInputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x10

    .line 4
    :try_start_0
    invoke-virtual {p3, v0}, Lorg/snmp4j/asn1/BERInputStream;->mark(I)V

    .line 5
    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    const/4 v1, 0x0

    .line 6
    invoke-static {p3, v0, v1}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;Z)I

    .line 7
    invoke-virtual {v0}, Lorg/snmp4j/asn1/BER$MutableByte;->getValue()B

    move-result v0

    const/16 v1, 0x30

    if-eq v0, v1, :cond_0

    .line 8
    sget-object v0, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v1, "ASN.1 parse error (message is not a sequence)"

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    .line 9
    new-instance v0, Lorg/snmp4j/event/CounterEvent;

    sget-object v1, Lorg/snmp4j/mp/SnmpConstants;->snmpInASNParseErrs:Lorg/snmp4j/smi/OID;

    invoke-direct {v0, p0, v1}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    .line 10
    invoke-virtual {p0, v0}, Lorg/snmp4j/MessageDispatcherImpl;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    goto/16 :goto_3

    .line 11
    :cond_0
    :goto_0
    new-instance v0, Lorg/snmp4j/smi/Integer32;

    invoke-direct {v0}, Lorg/snmp4j/smi/Integer32;-><init>()V

    .line 12
    invoke-virtual {v0, p3}, Lorg/snmp4j/smi/Integer32;->decodeBER(Lorg/snmp4j/asn1/BERInputStream;)V

    .line 13
    invoke-virtual {v0}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v1

    invoke-virtual {p0, v1}, Lorg/snmp4j/MessageDispatcherImpl;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object v4

    if-nez v4, :cond_1

    .line 14
    sget-object p1, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "SNMP version "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " is not supported"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 15
    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpInBadVersions:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    .line 16
    invoke-virtual {p0, p1}, Lorg/snmp4j/MessageDispatcherImpl;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    goto :goto_4

    .line 17
    :cond_1
    invoke-virtual {p3}, Lorg/snmp4j/asn1/BERInputStream;->reset()V

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    .line 18
    invoke-virtual/range {v2 .. v7}, Lorg/snmp4j/MessageDispatcherImpl;->dispatchMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/mp/MessageProcessingModel;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/TransportStateReference;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 19
    :goto_1
    sget-object p2, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    .line 20
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_4

    .line 21
    :cond_2
    throw p1

    .line 22
    :goto_2
    sget-object p2, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    .line 23
    invoke-interface {p2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    :cond_3
    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->isForwardRuntimeExceptions()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_4

    .line 26
    :cond_4
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 27
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    sget-object p2, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 29
    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object p2, Lorg/snmp4j/mp/SnmpConstants;->snmpInvalidMsgs:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, p2}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    .line 30
    invoke-virtual {p0, p1}, Lorg/snmp4j/MessageDispatcherImpl;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    :goto_4
    return-void

    .line 31
    :cond_5
    sget-object p1, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string p2, "Message stream must support marks"

    invoke-interface {p1, p2}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    .line 32
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public releaseStateReference(ILorg/snmp4j/mp/PduHandle;)V
    .locals 2

    invoke-virtual {p0, p1}, Lorg/snmp4j/MessageDispatcherImpl;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Lorg/snmp4j/mp/MessageProcessingModel;->releaseStateReference(Lorg/snmp4j/mp/PduHandle;)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported message processing model: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public declared-synchronized removeAuthenticationFailureListener(Lorg/snmp4j/event/AuthenticationFailureListener;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->authenticationFailureListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->authenticationFailureListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
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

.method public declared-synchronized removeCommandResponder(Lorg/snmp4j/CommandResponder;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->commandResponderListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->commandResponderListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
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

.method public declared-synchronized removeCounterListener(Lorg/snmp4j/event/CounterListener;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->counterListeners:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->counterListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
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

.method public declared-synchronized removeMessageProcessingModel(Lorg/snmp4j/mp/MessageProcessingModel;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->mpm:Ljava/util/List;

    invoke-interface {p1}, Lorg/snmp4j/mp/MessageProcessingModel;->getID()I

    move-result p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
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

.method public removeTransportMapping(Lorg/snmp4j/TransportMapping;)Lorg/snmp4j/TransportMapping;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/MessageDispatcherImpl;->transportMappings:Ljava/util/Map;

    invoke-interface {p1}, Lorg/snmp4j/TransportMapping;->getSupportedAddressClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public returnResponsePdu(II[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;)I
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v13, p1

    const-string v14, "Unsupported message processing model: "

    const/16 v15, 0x6a6

    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lorg/snmp4j/MessageDispatcherImpl;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/mp/StateReference;->getTransportMapping()Lorg/snmp4j/TransportMapping;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/mp/StateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/snmp4j/MessageDispatcherImpl;->getTransport(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_3

    :cond_0
    :goto_0
    if-eqz v0, :cond_3

    new-instance v16, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-direct/range {v16 .. v16}, Lorg/snmp4j/asn1/BEROutputStream;-><init>()V

    invoke-interface {v0}, Lorg/snmp4j/TransportMapping;->getMaxInboundMessageSize()I

    move-result v4

    move/from16 v3, p1

    move/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, v16

    invoke-interface/range {v2 .. v12}, Lorg/snmp4j/mp/MessageProcessingModel;->prepareResponseMessage(III[BILorg/snmp4j/PDU;ILorg/snmp4j/mp/StateReference;Lorg/snmp4j/mp/StatusInformation;Lorg/snmp4j/asn1/BEROutputStream;)I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/mp/StateReference;->getSecurityStateReference()Lorg/snmp4j/security/SecurityStateReference;

    move-result-object v3

    instance-of v3, v3, Lorg/snmp4j/security/TsmSecurityStateReference;

    if-eqz v3, :cond_1

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/mp/StateReference;->getSecurityStateReference()Lorg/snmp4j/security/SecurityStateReference;

    move-result-object v3

    check-cast v3, Lorg/snmp4j/security/TsmSecurityStateReference;

    invoke-virtual {v3}, Lorg/snmp4j/security/TsmSecurityStateReference;->getTmStateReference()Lorg/snmp4j/TransportStateReference;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/mp/StateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, Lorg/snmp4j/asn1/BEROutputStream;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    invoke-virtual {v1, v0, v4, v5, v3}, Lorg/snmp4j/MessageDispatcherImpl;->sendMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V

    :cond_2
    return v2

    :cond_3
    new-instance v0, Lorg/snmp4j/MessageException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported address class (transport mapping): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p7 .. p7}, Lorg/snmp4j/mp/StateReference;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x6a7

    invoke-direct {v0, v2, v3}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_4
    new-instance v0, Lorg/snmp4j/MessageException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v15}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;I)V

    throw v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance v2, Lorg/snmp4j/MessageException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x6a5

    invoke-direct {v2, v3, v4, v0}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2

    :goto_3
    new-instance v2, Lorg/snmp4j/MessageException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v15, v0}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2
.end method

.method protected sendMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_1

    instance-of v0, p2, Lorg/snmp4j/smi/GenericAddress;

    if-eqz v0, :cond_0

    check-cast p2, Lorg/snmp4j/smi/GenericAddress;

    invoke-virtual {p2}, Lorg/snmp4j/smi/GenericAddress;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object p2

    invoke-interface {p1, p2, p3, p4}, Lorg/snmp4j/TransportMapping;->sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2, p3, p4}, Lorg/snmp4j/TransportMapping;->sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "No transport mapping for address class: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "="

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public sendPdu(Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Lorg/snmp4j/MessageDispatcherImpl;->sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;

    move-result-object p1

    return-object p1
.end method

.method public sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;Z)Lorg/snmp4j/mp/PduHandle;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/MessageException;
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 48
    invoke-virtual/range {v0 .. v5}, Lorg/snmp4j/MessageDispatcherImpl;->sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;

    move-result-object p1

    return-object p1
.end method

.method public sendPdu(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/Target;Lorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandleCallback;)Lorg/snmp4j/mp/PduHandle;
    .locals 27
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

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v15, p3

    move-object/from16 v14, p5

    .line 2
    const-string v13, "Unsupported message processing model: "

    invoke-interface/range {p2 .. p2}, Lorg/snmp4j/Target;->getVersion()I

    move-result v12

    .line 3
    invoke-interface/range {p2 .. p2}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v11

    .line 4
    invoke-interface/range {p2 .. p2}, Lorg/snmp4j/Target;->getSecurityModel()I

    move-result v16

    .line 5
    invoke-interface/range {p2 .. p2}, Lorg/snmp4j/Target;->getSecurityLevel()I

    move-result v17

    const/16 v10, 0x6a6

    .line 6
    :try_start_0
    invoke-interface/range {p2 .. p2}, Lorg/snmp4j/Target;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v2

    invoke-virtual {v2}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v9

    .line 7
    invoke-virtual {v1, v12}, Lorg/snmp4j/MessageDispatcherImpl;->getMessageProcessingModel(I)Lorg/snmp4j/mp/MessageProcessingModel;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/snmp4j/MessageException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v8, :cond_b

    .line 8
    :try_start_1
    invoke-interface {v8, v12}, Lorg/snmp4j/mp/MessageProcessingModel;->isProtocolVersionSupported(I)Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_a
    .catch Lorg/snmp4j/MessageException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v2, :cond_a

    if-nez p1, :cond_0

    .line 9
    :try_start_2
    invoke-virtual {v1, v11}, Lorg/snmp4j/MessageDispatcherImpl;->getTransport(Lorg/snmp4j/smi/Address;)Lorg/snmp4j/TransportMapping;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/snmp4j/MessageException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v7, v2

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_a

    :catch_1
    move-exception v0

    goto/16 :goto_b

    :catch_2
    move-exception v0

    move v5, v10

    move v3, v12

    move-object v4, v13

    goto/16 :goto_c

    :cond_0
    move-object/from16 v7, p1

    :goto_0
    if-eqz v7, :cond_9

    .line 10
    :try_start_3
    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/PDU;->isConfirmedPdu()Z

    move-result v2
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Lorg/snmp4j/MessageException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v2, :cond_1

    .line 11
    :try_start_4
    invoke-interface/range {p2 .. p2}, Lorg/snmp4j/Target;->getAddress()Lorg/snmp4j/smi/Address;

    move-result-object v2

    invoke-static {v15, v2, v7}, Lorg/snmp4j/MessageDispatcherImpl;->checkListening4ConfirmedPDU(Lorg/snmp4j/PDU;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;)V
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lorg/snmp4j/MessageException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 12
    :cond_1
    :try_start_5
    invoke-virtual {v1, v11, v12, v15}, Lorg/snmp4j/MessageDispatcherImpl;->checkOutgoingMsg(Lorg/snmp4j/smi/Address;ILorg/snmp4j/PDU;)V

    .line 13
    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Lorg/snmp4j/MessageException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    if-eqz v2, :cond_2

    .line 14
    :try_start_6
    invoke-virtual {v2}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v2
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lorg/snmp4j/MessageException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    if-nez v2, :cond_3

    .line 15
    :cond_2
    :try_start_7
    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/PDU;->getType()I

    move-result v2
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Lorg/snmp4j/MessageException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    const/16 v3, -0x5e

    if-eq v2, v3, :cond_3

    .line 16
    :try_start_8
    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/MessageDispatcherImpl;->createPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v2
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Lorg/snmp4j/MessageException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    :goto_1
    move-object v6, v2

    goto :goto_2

    .line 17
    :cond_3
    :try_start_9
    new-instance v2, Lorg/snmp4j/mp/PduHandle;

    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/PDU;->getRequestID()Lorg/snmp4j/smi/Integer32;

    move-result-object v3

    invoke-virtual {v3}, Lorg/snmp4j/smi/Integer32;->getValue()I

    move-result v3

    invoke-direct {v2, v3}, Lorg/snmp4j/mp/PduHandle;-><init>(I)V

    goto :goto_1

    .line 18
    :goto_2
    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/PDU;->getType()I

    move-result v2
    :try_end_9
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_8
    .catch Lorg/snmp4j/MessageException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    const/16 v3, -0x5c

    if-eq v2, v3, :cond_4

    .line 19
    :try_start_a
    new-instance v2, Lorg/snmp4j/smi/Integer32;

    invoke-virtual {v6}, Lorg/snmp4j/mp/PduHandle;->getTransactionID()I

    move-result v3

    invoke-direct {v2, v3}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {v15, v2}, Lorg/snmp4j/PDU;->setRequestID(Lorg/snmp4j/smi/Integer32;)V
    :try_end_a
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_a .. :try_end_a} :catch_2
    .catch Lorg/snmp4j/MessageException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 20
    :cond_4
    :try_start_b
    new-instance v18, Lorg/snmp4j/smi/GenericAddress;

    invoke-direct/range {v18 .. v18}, Lorg/snmp4j/smi/GenericAddress;-><init>()V

    .line 21
    instance-of v2, v0, Lorg/snmp4j/CertifiedIdentity;
    :try_end_b
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_b .. :try_end_b} :catch_8
    .catch Lorg/snmp4j/MessageException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0

    if-eqz v2, :cond_5

    .line 22
    :try_start_c
    move-object v2, v0

    check-cast v2, Lorg/snmp4j/CertifiedIdentity;
    :try_end_c
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_c .. :try_end_c} :catch_2
    .catch Lorg/snmp4j/MessageException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0

    :goto_3
    move-object/from16 v19, v2

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    goto :goto_3

    .line 23
    :goto_4
    :try_start_d
    new-instance v5, Lorg/snmp4j/TransportStateReference;

    new-instance v4, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v4, v9}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    .line 24
    invoke-static/range {v17 .. v17}, Lorg/snmp4j/security/SecurityLevel;->get(I)Lorg/snmp4j/security/SecurityLevel;

    move-result-object v20

    sget-object v21, Lorg/snmp4j/security/SecurityLevel;->undefined:Lorg/snmp4j/security/SecurityLevel;

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v2, v5

    move-object v3, v7

    move-object/from16 v24, v4

    move-object v4, v11

    move-object/from16 p1, v5

    move-object/from16 v5, v24

    move-object/from16 v24, v6

    move-object/from16 v6, v20

    move-object/from16 v20, v7

    move-object/from16 v7, v21

    move-object v15, v8

    move/from16 v8, v22

    move-object/from16 v21, v9

    move-object/from16 v9, v23

    move-object/from16 v10, v19

    invoke-direct/range {v2 .. v10}, Lorg/snmp4j/TransportStateReference;-><init>(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/SecurityLevel;Lorg/snmp4j/security/SecurityLevel;ZLjava/lang/Object;Lorg/snmp4j/CertifiedIdentity;)V

    .line 25
    invoke-virtual/range {p3 .. p3}, Lorg/snmp4j/PDU;->isConfirmedPdu()Z

    move-result v2
    :try_end_d
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_d .. :try_end_d} :catch_8
    .catch Lorg/snmp4j/MessageException; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_0

    if-eqz v2, :cond_6

    .line 26
    :try_start_e
    invoke-virtual {v1, v0, v15}, Lorg/snmp4j/MessageDispatcherImpl;->configureAuthoritativeEngineID(Lorg/snmp4j/Target;Lorg/snmp4j/mp/MessageProcessingModel;)V
    :try_end_e
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_e .. :try_end_e} :catch_3
    .catch Lorg/snmp4j/MessageException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    goto :goto_6

    :catch_3
    move-exception v0

    move v3, v12

    move-object v4, v13

    :goto_5
    const/16 v5, 0x6a6

    goto/16 :goto_c

    .line 27
    :cond_6
    :goto_6
    :try_start_f
    new-instance v0, Lorg/snmp4j/asn1/BEROutputStream;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BEROutputStream;-><init>()V

    .line 28
    invoke-interface/range {v20 .. v20}, Lorg/snmp4j/TransportMapping;->getMaxInboundMessageSize()I

    move-result v4
    :try_end_f
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_f .. :try_end_f} :catch_8
    .catch Lorg/snmp4j/MessageException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_0

    move-object v2, v15

    move-object v3, v11

    move v5, v12

    move/from16 v6, v16

    move-object/from16 v7, v21

    move/from16 v8, v17

    move-object/from16 v9, p3

    move/from16 v10, p4

    move-object/from16 v16, v15

    move-object v15, v11

    move-object/from16 v11, v24

    move/from16 v25, v12

    move-object/from16 v12, v18

    move-object/from16 v26, v13

    move-object v13, v0

    move-object v1, v14

    move-object/from16 v14, p1

    .line 29
    :try_start_10
    invoke-interface/range {v2 .. v14}, Lorg/snmp4j/mp/MessageProcessingModel;->prepareOutgoingMessage(Lorg/snmp4j/smi/Address;III[BILorg/snmp4j/PDU;ZLorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/asn1/BEROutputStream;Lorg/snmp4j/TransportStateReference;)I

    move-result v2

    if-nez v2, :cond_8

    if-eqz v1, :cond_7

    move-object/from16 v2, p3

    move-object/from16 v3, v24

    .line 30
    invoke-interface {v1, v3, v2}, Lorg/snmp4j/mp/PduHandleCallback;->pduHandleAssigned(Lorg/snmp4j/mp/PduHandle;Ljava/lang/Object;)V

    goto :goto_9

    :catch_4
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_a

    :catch_5
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_b

    :catch_6
    move-exception v0

    move-object/from16 v1, p0

    :goto_7
    move/from16 v3, v25

    :goto_8
    move-object/from16 v4, v26

    goto :goto_5

    :cond_7
    move-object/from16 v3, v24

    .line 31
    :goto_9
    invoke-virtual {v0}, Lorg/snmp4j/asn1/BEROutputStream;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0
    :try_end_10
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_10 .. :try_end_10} :catch_6
    .catch Lorg/snmp4j/MessageException; {:try_start_10 .. :try_end_10} :catch_5
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_4

    move-object/from16 v1, p0

    move-object/from16 v4, p1

    move-object/from16 v2, v20

    .line 32
    :try_start_11
    invoke-virtual {v1, v2, v15, v0, v4}, Lorg/snmp4j/MessageDispatcherImpl;->sendMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V

    return-object v3

    :catch_7
    move-exception v0

    goto :goto_7

    :cond_8
    move-object/from16 v1, p0

    move-object/from16 v0, v16

    .line 33
    new-instance v3, Lorg/snmp4j/MessageException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Message processing model "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-interface {v0}, Lorg/snmp4j/mp/MessageProcessingModel;->getID()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " returned error: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    invoke-static {v2}, Lorg/snmp4j/mp/SnmpConstants;->mpErrorMessage(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, v2}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;I)V

    throw v3

    :catch_8
    move-exception v0

    move/from16 v25, v12

    move-object/from16 v26, v13

    goto :goto_7

    :cond_9
    move-object v15, v11

    move/from16 v25, v12

    move-object/from16 v26, v13

    .line 36
    new-instance v0, Lorg/snmp4j/transport/UnsupportedAddressClassException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported address class (transport mapping): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 38
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lorg/snmp4j/transport/UnsupportedAddressClassException;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    throw v0

    :cond_a
    move/from16 v25, v12

    move-object/from16 v26, v13

    .line 39
    new-instance v0, Lorg/snmp4j/MessageException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SNMP version "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_11
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_11 .. :try_end_11} :catch_7
    .catch Lorg/snmp4j/MessageException; {:try_start_11 .. :try_end_11} :catch_1
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_0

    move/from16 v3, v25

    :try_start_12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " is not supported by message processing model "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0x6a8

    invoke-direct {v0, v2, v4}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;I)V

    throw v0

    :catch_9
    move-exception v0

    goto/16 :goto_8

    :catch_a
    move-exception v0

    move v3, v12

    move-object/from16 v26, v13

    goto/16 :goto_8

    :cond_b
    move v3, v12

    move-object/from16 v26, v13

    .line 40
    new-instance v0, Lorg/snmp4j/MessageException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_12
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_12 .. :try_end_12} :catch_9
    .catch Lorg/snmp4j/MessageException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_0

    move-object/from16 v4, v26

    :try_start_13
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_13
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_13 .. :try_end_13} :catch_c
    .catch Lorg/snmp4j/MessageException; {:try_start_13 .. :try_end_13} :catch_1
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_0

    const/16 v5, 0x6a6

    :try_start_14
    invoke-direct {v0, v2, v5}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;I)V

    throw v0
    :try_end_14
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_14 .. :try_end_14} :catch_b
    .catch Lorg/snmp4j/MessageException; {:try_start_14 .. :try_end_14} :catch_1
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_0

    :catch_b
    move-exception v0

    goto :goto_c

    :catch_c
    move-exception v0

    goto/16 :goto_5

    .line 41
    :goto_a
    sget-object v2, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 42
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    :cond_c
    new-instance v2, Lorg/snmp4j/MessageException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x6a5

    invoke-direct {v2, v3, v4, v0}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2

    .line 44
    :goto_b
    sget-object v2, Lorg/snmp4j/MessageDispatcherImpl;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    :cond_d
    throw v0

    .line 47
    :goto_c
    new-instance v2, Lorg/snmp4j/MessageException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v5, v0}, Lorg/snmp4j/MessageException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v2
.end method

.method public setCheckOutgoingMsg(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/MessageDispatcherImpl;->checkOutgoingMsg:Z

    return-void
.end method
