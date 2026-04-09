.class Lorg/snmp4j/util/TableUtils$DenseTableRequest;
.super Lorg/snmp4j/util/TableUtils$TableRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TableUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "DenseTableRequest"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/snmp4j/util/TableUtils;


# direct methods
.method protected constructor <init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$DenseTableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct/range {p0 .. p7}, Lorg/snmp4j/util/TableUtils$TableRequest;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized onResponse(Lorg/snmp4j/event/ResponseEvent;)V
    .locals 18

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$DenseTableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    iget-object v0, v0, Lorg/snmp4j/util/AbstractSnmpUtility;->session:Lorg/snmp4j/Session;

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getRequest()Lorg/snmp4j/PDU;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Lorg/snmp4j/Session;->cancel(Lorg/snmp4j/PDU;Lorg/snmp4j/event/ResponseListener;)V

    iget-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual/range {p0 .. p1}, Lorg/snmp4j/util/TableUtils$TableRequest;->checkResponse(Lorg/snmp4j/event/ResponseEvent;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getUserObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getRequest()Lorg/snmp4j/PDU;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v3

    invoke-virtual {v2}, Lorg/snmp4j/PDU;->size()I

    move-result v4

    invoke-virtual {v3}, Lorg/snmp4j/PDU;->size()I

    move-result v5

    div-int/2addr v5, v4

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v8, v5, :cond_a

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v2}, Lorg/snmp4j/PDU;->size()I

    move-result v13

    if-ge v11, v13, :cond_8

    add-int v13, v0, v11

    mul-int v14, v8, v4

    add-int/2addr v14, v11

    invoke-virtual {v3, v14}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v14

    invoke-virtual {v14}, Lorg/snmp4j/smi/VariableBinding;->isException()Z

    move-result v15

    if-eqz v15, :cond_2

    :cond_1
    move/from16 v17, v0

    goto :goto_3

    :cond_2
    invoke-virtual {v14}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v15

    iget-object v6, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->columnOIDs:[Lorg/snmp4j/smi/OID;

    aget-object v6, v6, v13

    invoke-virtual {v15, v6}, Lorg/snmp4j/smi/OID;->startsWith(Lorg/snmp4j/smi/OID;)Z

    move-result v16

    if-eqz v16, :cond_1

    new-instance v7, Lorg/snmp4j/smi/OID;

    invoke-virtual {v15}, Lorg/snmp4j/smi/OID;->getValue()[I

    move-result-object v10

    move/from16 v17, v0

    invoke-virtual {v6}, Lorg/snmp4j/smi/OID;->size()I

    move-result v0

    invoke-virtual {v15}, Lorg/snmp4j/smi/OID;->size()I

    move-result v15

    invoke-virtual {v6}, Lorg/snmp4j/smi/OID;->size()I

    move-result v6

    sub-int/2addr v15, v6

    invoke-direct {v7, v10, v0, v15}, Lorg/snmp4j/smi/OID;-><init>([III)V

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->upperBoundIndex:Lorg/snmp4j/smi/OID;

    if-eqz v0, :cond_3

    invoke-virtual {v7, v0}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    if-lez v0, :cond_3

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_3
    if-eqz v9, :cond_4

    invoke-virtual {v7, v9}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    if-gez v0, :cond_5

    :cond_4
    move-object v9, v7

    :cond_5
    if-nez v12, :cond_6

    new-instance v12, Lorg/snmp4j/util/TableUtils$Row;

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$DenseTableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {v12, v0, v7}, Lorg/snmp4j/util/TableUtils$Row;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/smi/OID;)V

    :cond_6
    invoke-virtual {v12, v13}, Lorg/snmp4j/util/TableUtils$Row;->setNumComplete(I)Z

    invoke-virtual {v12}, Lorg/snmp4j/util/TableUtils$Row;->getNumComplete()I

    move-result v0

    if-ge v13, v0, :cond_7

    invoke-virtual {v12, v13, v14}, Ljava/util/AbstractList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    invoke-virtual {v12, v14}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :goto_2
    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {v14}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v6

    invoke-virtual {v0, v13, v6}, Lorg/snmp4j/util/TableUtils$LastReceived;->set(ILorg/snmp4j/smi/OID;)V

    :goto_3
    add-int/lit8 v11, v11, 0x1

    move/from16 v0, v17

    goto :goto_1

    :cond_8
    move/from16 v17, v0

    if-eqz v12, :cond_9

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v6, Lorg/snmp4j/util/TableEvent;

    iget-object v7, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-virtual {v12}, Lorg/snmp4j/util/TableUtils$Row;->getRowIndex()Lorg/snmp4j/smi/OID;

    move-result-object v10

    invoke-virtual {v12}, Ljava/util/AbstractCollection;->size()I

    move-result v11

    new-array v11, v11, [Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v12, v11}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v6, v1, v7, v10, v11}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;Lorg/snmp4j/smi/OID;[Lorg/snmp4j/smi/VariableBinding;)V

    invoke-interface {v0, v6}, Lorg/snmp4j/util/TableListener;->next(Lorg/snmp4j/util/TableEvent;)Z

    move-result v0

    if-nez v0, :cond_9

    const/4 v0, 0x1

    iput-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v2, Lorg/snmp4j/util/TableEvent;

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v2, v1, v3}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_9
    add-int/lit8 v8, v8, 0x1

    move/from16 v0, v17

    goto/16 :goto_0

    :cond_a
    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->sendNextChunk()Z

    move-result v0

    if-nez v0, :cond_b

    const/4 v0, 0x1

    iput-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v2, Lorg/snmp4j/util/TableEvent;

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v2, v1, v3}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_b
    monitor-exit p0

    return-void

    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method
