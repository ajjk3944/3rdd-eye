.class public Lorg/snmp4j/util/TableUtils$TableRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/event/ResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TableUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TableRequest"
.end annotation


# instance fields
.field private anyMatch:Z

.field columnOIDs:[Lorg/snmp4j/smi/OID;

.field volatile finished:Z

.field protected lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

.field private lastSent:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lorg/snmp4j/smi/OID;",
            ">;"
        }
    .end annotation
.end field

.field listener:Lorg/snmp4j/util/TableListener;

.field lowerBoundIndex:Lorg/snmp4j/smi/OID;

.field private numLexicographicErrors:I

.field private requestSerial:I

.field private requestSerialsPending:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private rowCache:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lorg/snmp4j/util/TableUtils$Row;",
            ">;"
        }
    .end annotation
.end field

.field private sent:I

.field target:Lorg/snmp4j/Target;

.field final synthetic this$0:Lorg/snmp4j/util/TableUtils;

.field upperBoundIndex:Lorg/snmp4j/smi/OID;

.field userObject:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V
    .locals 2

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->sent:I

    iput-boolean v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->anyMatch:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastSent:Ljava/util/Vector;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    const/high16 v1, -0x80000000

    iput v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->requestSerial:I

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->requestSerialsPending:Ljava/util/List;

    iput v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->numLexicographicErrors:I

    iput-boolean v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    iput-object p2, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->target:Lorg/snmp4j/Target;

    iput-object p3, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->columnOIDs:[Lorg/snmp4j/smi/OID;

    iput-object p4, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    iput-object p5, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    new-instance p2, Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lorg/snmp4j/util/TableUtils$LastReceived;-><init>(Lorg/snmp4j/util/TableUtils;Ljava/util/List;)V

    iput-object p2, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    iput-object p7, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->upperBoundIndex:Lorg/snmp4j/smi/OID;

    iput-object p6, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lowerBoundIndex:Lorg/snmp4j/smi/OID;

    if-eqz p6, :cond_0

    :goto_0
    iget-object p1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {p1}, Lorg/snmp4j/util/TableUtils$LastReceived;->size()I

    move-result p1

    if-ge v0, p1, :cond_0

    new-instance p1, Lorg/snmp4j/smi/OID;

    iget-object p2, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {p2, v0}, Lorg/snmp4j/util/TableUtils$LastReceived;->get(I)Lorg/snmp4j/smi/OID;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p1, p6}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    iget-object p2, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {p2, v0, p1}, Lorg/snmp4j/util/TableUtils$LastReceived;->set(ILorg/snmp4j/smi/OID;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private emptyCache()V
    .locals 3

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_3

    invoke-direct {p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->getTableEvent()Lorg/snmp4j/util/TableEvent;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v1

    const/4 v2, -0x2

    if-ne v1, v2, :cond_2

    iget v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->numLexicographicErrors:I

    iget-object v2, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-static {v2}, Lorg/snmp4j/util/TableUtils;->access$600(Lorg/snmp4j/util/TableUtils;)I

    move-result v2

    if-gt v1, v2, :cond_0

    :cond_2
    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    invoke-interface {v1, v0}, Lorg/snmp4j/util/TableListener;->next(Lorg/snmp4j/util/TableEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_3
    return-void
.end method

.method private getTableEvent()Lorg/snmp4j/util/TableEvent;
    .locals 5

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/util/TableUtils$Row;

    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->columnOIDs:[Lorg/snmp4j/smi/OID;

    array-length v1, v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/util/TableUtils$Row;->setNumComplete(I)Z

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    new-array v1, v1, [Lorg/snmp4j/smi/VariableBinding;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->copyInto([Ljava/lang/Object;)V

    new-instance v2, Lorg/snmp4j/util/TableEvent;

    iget-object v3, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$Row;->getRowIndex()Lorg/snmp4j/smi/OID;

    move-result-object v4

    invoke-direct {v2, p0, v3, v4, v1}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;Lorg/snmp4j/smi/OID;[Lorg/snmp4j/smi/VariableBinding;)V

    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$Row;->isOrderError()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x2

    iput v0, v2, Lorg/snmp4j/util/RetrievalEvent;->status:I

    iget v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->numLexicographicErrors:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->numLexicographicErrors:I

    :cond_1
    return-object v2
.end method


# virtual methods
.method protected checkResponse(Lorg/snmp4j/event/ResponseEvent;)Z
    .locals 3

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getError()Ljava/lang/Exception;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    invoke-direct {p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->emptyCache()V

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v1, Lorg/snmp4j/util/TableEvent;

    iget-object v2, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getError()Ljava/lang/Exception;

    move-result-object p1

    invoke-direct {v1, p0, v2, p1}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;Ljava/lang/Exception;)V

    invoke-interface {v0, v1}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v0

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    invoke-direct {p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->emptyCache()V

    iget-object p1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v0, Lorg/snmp4j/util/TableEvent;

    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    const/4 v2, -0x1

    invoke-direct {v0, p0, v1, v2}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    const/16 v2, -0x58

    if-ne v0, v2, :cond_2

    iput-boolean v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    invoke-direct {p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->emptyCache()V

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v1, Lorg/snmp4j/util/TableEvent;

    iget-object v2, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p1

    invoke-direct {v1, p0, v2, p1}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;Lorg/snmp4j/PDU;)V

    invoke-interface {v0, v1}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result v0

    if-eqz v0, :cond_3

    iput-boolean v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    invoke-direct {p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->emptyCache()V

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v1, Lorg/snmp4j/util/TableEvent;

    iget-object v2, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-virtual {p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object p1

    invoke-virtual {p1}, Lorg/snmp4j/PDU;->getErrorStatus()I

    move-result p1

    invoke-direct {v1, p0, v2, p1}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    return v1
.end method

.method public getNumLexicographicErrors()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->numLexicographicErrors:I

    return v0
.end method

.method public getRow(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/util/TableUtils$Row;
    .locals 3

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/TableUtils$Row;

    invoke-virtual {v1}, Lorg/snmp4j/util/TableUtils$Row;->getRowIndex()Lorg/snmp4j/smi/OID;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getTableStatus()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->numLexicographicErrors:I

    if-lez v0, :cond_0

    const/4 v0, -0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onResponse(Lorg/snmp4j/event/ResponseEvent;)V
    .locals 21

    move-object/from16 v1, p0

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    iget-object v0, v0, Lorg/snmp4j/util/AbstractSnmpUtility;->session:Lorg/snmp4j/Session;

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getRequest()Lorg/snmp4j/PDU;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Lorg/snmp4j/Session;->cancel(Lorg/snmp4j/PDU;Lorg/snmp4j/event/ResponseListener;)V

    iget-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lorg/snmp4j/util/TableUtils$TableRequest;->checkResponse(Lorg/snmp4j/event/ResponseEvent;)Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getUserObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;

    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->getRequestSerial()I

    move-result v2

    invoke-virtual {v1, v2}, Lorg/snmp4j/util/TableUtils$TableRequest;->removePending(I)Z

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getRequest()Lorg/snmp4j/PDU;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getResponse()Lorg/snmp4j/PDU;

    move-result-object v4

    invoke-virtual {v3}, Lorg/snmp4j/PDU;->size()I

    move-result v3

    invoke-virtual {v4}, Lorg/snmp4j/PDU;->size()I

    move-result v5

    div-int/2addr v5, v3

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v8, v5, :cond_14

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1
    if-ge v12, v3, :cond_13

    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->getColumnIDs()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    mul-int v15, v8, v3

    add-int/2addr v15, v12

    invoke-virtual {v4, v15}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v15

    invoke-virtual {v15}, Lorg/snmp4j/smi/VariableBinding;->isException()Z

    move-result v16

    if-eqz v16, :cond_1

    move/from16 v18, v3

    move-object/from16 v19, v4

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v15}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v6

    iget-object v7, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->columnOIDs:[Lorg/snmp4j/smi/OID;

    aget-object v7, v7, v14

    invoke-virtual {v6, v7}, Lorg/snmp4j/smi/OID;->startsWith(Lorg/snmp4j/smi/OID;)Z

    move-result v17

    if-eqz v17, :cond_12

    new-instance v11, Lorg/snmp4j/smi/OID;

    move/from16 v18, v3

    invoke-virtual {v6}, Lorg/snmp4j/smi/OID;->getValue()[I

    move-result-object v3

    move-object/from16 v19, v4

    invoke-virtual {v7}, Lorg/snmp4j/smi/OID;->size()I

    move-result v4

    invoke-virtual {v6}, Lorg/snmp4j/smi/OID;->size()I

    move-result v20

    invoke-virtual {v7}, Lorg/snmp4j/smi/OID;->size()I

    move-result v7

    sub-int v7, v20, v7

    invoke-direct {v11, v3, v4, v7}, Lorg/snmp4j/smi/OID;-><init>([III)V

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->upperBoundIndex:Lorg/snmp4j/smi/OID;

    if-eqz v3, :cond_2

    invoke-virtual {v11, v3}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v3

    if-lez v3, :cond_2

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_2
    if-eqz v10, :cond_3

    invoke-virtual {v11, v10}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v3

    if-gez v3, :cond_4

    :cond_3
    move-object v10, v11

    :cond_4
    if-eqz v13, :cond_5

    invoke-virtual {v13}, Lorg/snmp4j/util/TableUtils$Row;->getRowIndex()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v3, v11}, Lorg/snmp4j/smi/OID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_5
    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Lorg/snmp4j/util/TableUtils$Row;

    invoke-virtual {v13}, Lorg/snmp4j/util/TableUtils$Row;->getRowIndex()Lorg/snmp4j/smi/OID;

    move-result-object v4

    invoke-virtual {v11, v4}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v4

    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    if-lez v4, :cond_6

    :cond_8
    const/4 v13, 0x0

    :cond_9
    :goto_2
    if-nez v13, :cond_e

    new-instance v3, Lorg/snmp4j/util/TableUtils$Row;

    iget-object v4, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {v3, v4, v11}, Lorg/snmp4j/util/TableUtils$Row;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/smi/OID;)V

    iget-object v4, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v4

    if-nez v4, :cond_a

    iget-object v4, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v4, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    iget-object v4, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/snmp4j/util/TableUtils$Row;

    invoke-virtual {v4}, Lorg/snmp4j/util/TableUtils$Row;->getRowIndex()Lorg/snmp4j/smi/OID;

    move-result-object v4

    invoke-virtual {v4, v11}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v4

    if-ltz v4, :cond_b

    iget-object v4, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v4, v3}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_3

    :cond_b
    iget-object v4, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v7

    invoke-virtual {v4, v7}, Ljava/util/LinkedList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v4

    :cond_c
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/snmp4j/util/TableUtils$Row;

    invoke-static {v7}, Lorg/snmp4j/util/TableUtils$Row;->access$300(Lorg/snmp4j/util/TableUtils$Row;)Lorg/snmp4j/smi/OID;

    move-result-object v9

    invoke-virtual {v11, v9}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v9

    if-ltz v9, :cond_c

    invoke-interface {v4, v3}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    invoke-interface {v4, v7}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    :cond_d
    :goto_3
    move-object v13, v3

    :cond_e
    invoke-virtual {v13, v14}, Lorg/snmp4j/util/TableUtils$Row;->setNumComplete(I)Z

    invoke-virtual {v13}, Lorg/snmp4j/util/TableUtils$Row;->getNumComplete()I

    move-result v3

    if-ge v14, v3, :cond_f

    invoke-virtual {v13, v14, v15}, Ljava/util/AbstractList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_f
    invoke-virtual {v13, v15}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :goto_4
    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-virtual {v3}, Lorg/snmp4j/util/TableUtils;->isCheckLexicographicOrdering()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual/range {p1 .. p1}, Lorg/snmp4j/event/ResponseEvent;->getRequest()Lorg/snmp4j/PDU;

    move-result-object v3

    invoke-virtual {v3, v12}, Lorg/snmp4j/PDU;->get(I)Lorg/snmp4j/smi/VariableBinding;

    move-result-object v3

    invoke-virtual {v3}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v3

    invoke-virtual {v6, v3}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v3

    if-gtz v3, :cond_10

    invoke-static {v13}, Lorg/snmp4j/util/TableUtils$Row;->access$400(Lorg/snmp4j/util/TableUtils$Row;)Z

    move-result v3

    if-nez v3, :cond_11

    const/4 v3, 0x1

    invoke-static {v13, v3}, Lorg/snmp4j/util/TableUtils$Row;->access$402(Lorg/snmp4j/util/TableUtils$Row;Z)Z

    goto :goto_5

    :cond_10
    invoke-static {v0}, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->access$500(Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;)Lorg/snmp4j/util/TableUtils$LastReceived;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_11

    :try_start_1
    invoke-static {v0}, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->access$500(Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;)Lorg/snmp4j/util/TableUtils$LastReceived;

    move-result-object v3

    invoke-virtual {v3}, Lorg/snmp4j/util/TableUtils$LastReceived;->getColumnInfos()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;

    invoke-virtual {v3}, Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;->getBasedOn()Lorg/snmp4j/util/TableUtils$Row;

    move-result-object v3

    if-eqz v3, :cond_11

    invoke-virtual {v3}, Lorg/snmp4j/util/TableUtils$Row;->isOrderError()Z

    move-result v3

    if-eqz v3, :cond_11

    const/4 v3, 0x1

    invoke-static {v13, v3}, Lorg/snmp4j/util/TableUtils$Row;->access$402(Lorg/snmp4j/util/TableUtils$Row;Z)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_11
    :goto_5
    :try_start_2
    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {v15}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v4

    invoke-virtual {v3, v14, v4, v13}, Lorg/snmp4j/util/TableUtils$LastReceived;->set(ILorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableUtils$Row;)V

    const/4 v9, 0x1

    goto :goto_6

    :cond_12
    move/from16 v18, v3

    move-object/from16 v19, v4

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {v15}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v4

    invoke-virtual {v3, v14, v4}, Lorg/snmp4j/util/TableUtils$LastReceived;->set(ILorg/snmp4j/smi/OID;)V

    :goto_6
    add-int/lit8 v12, v12, 0x1

    move/from16 v3, v18

    move-object/from16 v4, v19

    goto/16 :goto_1

    :cond_13
    move/from16 v18, v3

    move-object/from16 v19, v4

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    :cond_14
    iget-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->anyMatch:Z

    or-int/2addr v0, v9

    iput-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->anyMatch:Z

    :cond_15
    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 v0, 0x0

    goto :goto_7

    :cond_16
    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->rowCache:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/util/TableUtils$Row;

    :goto_7
    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$Row;->getNumComplete()I

    move-result v3

    iget-object v4, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->columnOIDs:[Lorg/snmp4j/smi/OID;

    array-length v4, v4

    if-ne v3, v4, :cond_1b

    if-eqz v2, :cond_1b

    if-eqz v10, :cond_17

    invoke-static {v0}, Lorg/snmp4j/util/TableUtils$Row;->access$400(Lorg/snmp4j/util/TableUtils$Row;)Z

    move-result v3

    if-nez v3, :cond_17

    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$Row;->getRowIndex()Lorg/snmp4j/smi/OID;

    move-result-object v0

    invoke-virtual {v0, v10}, Lorg/snmp4j/smi/OID;->compareTo(Lorg/snmp4j/smi/Variable;)I

    move-result v0

    if-gez v0, :cond_1b

    :cond_17
    invoke-direct/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->getTableEvent()Lorg/snmp4j/util/TableEvent;

    move-result-object v0

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-virtual {v3}, Lorg/snmp4j/util/TableUtils;->isCheckLexicographicOrdering()Z

    move-result v3

    if-eqz v3, :cond_19

    if-eqz v0, :cond_19

    iget v3, v0, Lorg/snmp4j/util/RetrievalEvent;->status:I

    const/4 v4, -0x2

    if-ne v3, v4, :cond_19

    iget v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->numLexicographicErrors:I

    iget-object v5, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-static {v5}, Lorg/snmp4j/util/TableUtils;->access$600(Lorg/snmp4j/util/TableUtils;)I

    move-result v5

    if-lt v3, v5, :cond_19

    iget-object v2, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-static {v2}, Lorg/snmp4j/util/TableUtils;->access$600(Lorg/snmp4j/util/TableUtils;)I

    move-result v2

    if-lez v2, :cond_18

    iget-object v2, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    invoke-interface {v2, v0}, Lorg/snmp4j/util/TableListener;->next(Lorg/snmp4j/util/TableEvent;)Z

    :cond_18
    invoke-direct/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->emptyCache()V

    const/4 v0, 0x1

    iput-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v2, Lorg/snmp4j/util/TableEvent;

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v2, v1, v3, v4}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V

    monitor-exit p0

    return-void

    :cond_19
    if-eqz v0, :cond_1a

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    invoke-interface {v3, v0}, Lorg/snmp4j/util/TableListener;->next(Lorg/snmp4j/util/TableEvent;)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_1a
    invoke-direct/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->emptyCache()V

    const/4 v0, 0x1

    iput-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v2, Lorg/snmp4j/util/TableEvent;

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->getTableStatus()I

    move-result v4

    invoke-direct {v2, v1, v3, v4}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V

    monitor-exit p0

    return-void

    :cond_1b
    if-eqz v2, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->sendNextChunk()Z

    move-result v0

    if-nez v0, :cond_1d

    iget-boolean v2, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->anyMatch:Z

    if-eqz v2, :cond_1c

    const/4 v2, 0x0

    iput v2, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->sent:I

    iput-boolean v2, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->anyMatch:Z

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->sendNextChunk()Z

    move-result v0

    :cond_1c
    if-nez v0, :cond_1d

    invoke-direct/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->emptyCache()V

    const/4 v0, 0x1

    iput-boolean v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->finished:Z

    iget-object v0, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v2, Lorg/snmp4j/util/TableEvent;

    iget-object v3, v1, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lorg/snmp4j/util/TableUtils$TableRequest;->getTableStatus()I

    move-result v4

    invoke-direct {v2, v1, v3, v4}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;I)V

    invoke-interface {v0, v2}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V

    :cond_1d
    monitor-exit p0

    return-void

    :goto_8
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method protected declared-synchronized removePending(I)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->requestSerialsPending:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    monitor-exit p0

    return v1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public sendNextChunk()Z
    .locals 9

    iget v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->sent:I

    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {v1}, Lorg/snmp4j/util/TableUtils$LastReceived;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    iget-object v0, v0, Lorg/snmp4j/util/AbstractSnmpUtility;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->target:Lorg/snmp4j/Target;

    invoke-interface {v0, v1}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->target:Lorg/snmp4j/Target;

    invoke-interface {v1}, Lorg/snmp4j/Target;->getVersion()I

    move-result v1

    const/16 v3, -0x5b

    const/16 v4, -0x5f

    if-nez v1, :cond_1

    invoke-virtual {v0, v4}, Lorg/snmp4j/PDU;->setType(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v1

    if-eq v1, v4, :cond_2

    invoke-virtual {v0, v3}, Lorg/snmp4j/PDU;->setType(I)V

    :cond_2
    :goto_0
    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {v1}, Lorg/snmp4j/util/TableUtils$LastReceived;->size()I

    move-result v1

    iget v4, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->sent:I

    sub-int/2addr v1, v4

    iget-object v4, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-static {v4}, Lorg/snmp4j/util/TableUtils;->access$000(Lorg/snmp4j/util/TableUtils;)I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getType()I

    move-result v4

    if-ne v4, v3, :cond_4

    iget-object v3, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-static {v3}, Lorg/snmp4j/util/TableUtils;->access$100(Lorg/snmp4j/util/TableUtils;)I

    move-result v3

    if-lez v3, :cond_3

    iget-object v3, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-static {v3}, Lorg/snmp4j/util/TableUtils;->access$100(Lorg/snmp4j/util/TableUtils;)I

    move-result v3

    invoke-virtual {v0, v3}, Lorg/snmp4j/PDU;->setMaxRepetitions(I)V

    invoke-virtual {v0, v2}, Lorg/snmp4j/PDU;->setNonRepeaters(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v1}, Lorg/snmp4j/PDU;->setNonRepeaters(I)V

    invoke-virtual {v0, v2}, Lorg/snmp4j/PDU;->setMaxRepetitions(I)V

    :cond_4
    :goto_1
    new-instance v3, Ljava/util/Vector;

    add-int/lit8 v4, v1, 0x1

    invoke-direct {v3, v4}, Ljava/util/Vector;-><init>(I)V

    iput-object v3, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastSent:Ljava/util/Vector;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget v4, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->sent:I

    move v5, v2

    :goto_2
    iget v6, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->sent:I

    add-int/2addr v6, v1

    if-ge v4, v6, :cond_7

    iget-object v6, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {v6, v4}, Lorg/snmp4j/util/TableUtils$LastReceived;->get(I)Lorg/snmp4j/smi/OID;

    move-result-object v6

    iget-object v7, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->columnOIDs:[Lorg/snmp4j/smi/OID;

    aget-object v7, v7, v4

    invoke-virtual {v6, v7}, Lorg/snmp4j/smi/OID;->startsWith(Lorg/snmp4j/smi/OID;)Z

    move-result v7

    if-eqz v7, :cond_6

    new-instance v7, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v7, v6}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0, v7}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->getBERLength()I

    move-result v6

    iget-object v7, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->target:Lorg/snmp4j/Target;

    invoke-interface {v7}, Lorg/snmp4j/Target;->getMaxSizeRequestPDU()I

    move-result v7

    if-le v6, v7, :cond_5

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->trim()V

    goto :goto_4

    :cond_5
    iget-object v6, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastSent:Ljava/util/Vector;

    iget-object v7, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-virtual {v7, v4}, Lorg/snmp4j/util/TableUtils$LastReceived;->get(I)Lorg/snmp4j/smi/OID;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    add-int/lit8 v5, v5, 0x1

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_7
    :goto_4
    :try_start_0
    iget v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->sent:I

    add-int/2addr v1, v5

    iput v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->sent:I

    invoke-virtual {v0}, Lorg/snmp4j/PDU;->size()I

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    new-instance v1, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;

    iget-object v4, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    iget v5, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->requestSerial:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->requestSerial:I

    invoke-virtual {v4}, Lorg/snmp4j/util/TableUtils;->isCheckLexicographicOrdering()Z

    move-result v6

    if-eqz v6, :cond_9

    new-instance v6, Lorg/snmp4j/util/TableUtils$LastReceived;

    iget-object v7, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    iget-object v8, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->lastReceived:Lorg/snmp4j/util/TableUtils$LastReceived;

    invoke-direct {v6, v7, v8}, Lorg/snmp4j/util/TableUtils$LastReceived;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/util/TableUtils$LastReceived;)V

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_6

    :cond_9
    const/4 v6, 0x0

    :goto_5
    invoke-direct {v1, v4, v3, v5, v6}, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;-><init>(Lorg/snmp4j/util/TableUtils;Ljava/util/List;ILorg/snmp4j/util/TableUtils$LastReceived;)V

    iget-object v3, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->target:Lorg/snmp4j/Target;

    invoke-virtual {p0, v0, v3, v1}, Lorg/snmp4j/util/TableUtils$TableRequest;->sendRequest(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :goto_6
    invoke-static {}, Lorg/snmp4j/util/TableUtils;->access$200()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    invoke-static {}, Lorg/snmp4j/util/TableUtils;->access$200()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_a
    iget-object v1, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->listener:Lorg/snmp4j/util/TableListener;

    new-instance v3, Lorg/snmp4j/util/TableEvent;

    iget-object v4, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->userObject:Ljava/lang/Object;

    invoke-direct {v3, p0, v4, v0}, Lorg/snmp4j/util/TableEvent;-><init>(Lorg/snmp4j/util/TableUtils$TableRequest;Ljava/lang/Object;Ljava/lang/Exception;)V

    invoke-interface {v1, v3}, Lorg/snmp4j/util/TableListener;->finished(Lorg/snmp4j/util/TableEvent;)V

    return v2
.end method

.method protected sendRequest(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->requestSerialsPending:Ljava/util/List;

    invoke-virtual {p3}, Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;->getRequestSerial()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$TableRequest;->this$0:Lorg/snmp4j/util/TableUtils;

    iget-object v0, v0, Lorg/snmp4j/util/AbstractSnmpUtility;->session:Lorg/snmp4j/Session;

    invoke-interface {v0, p1, p2, p3, p0}, Lorg/snmp4j/Session;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/event/ResponseListener;)V

    return-void
.end method
