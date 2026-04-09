.class public Lorg/snmp4j/util/TableUtils;
.super Lorg/snmp4j/util/AbstractSnmpUtility;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/util/TableUtils$InternalTableListener;,
        Lorg/snmp4j/util/TableUtils$Row;,
        Lorg/snmp4j/util/TableUtils$LastReceivedColumnInfo;,
        Lorg/snmp4j/util/TableUtils$LastReceived;,
        Lorg/snmp4j/util/TableUtils$DenseTableRequest;,
        Lorg/snmp4j/util/TableUtils$TableRequest;,
        Lorg/snmp4j/util/TableUtils$ColumnsOfRequest;
    }
.end annotation


# static fields
.field public static final ROWSTATUS_ACTIVE:I = 0x1

.field public static final ROWSTATUS_CREATEANDGO:I = 0x4

.field public static final ROWSTATUS_CREATEANDWAIT:I = 0x5

.field public static final ROWSTATUS_DESTROY:I = 0x6

.field public static final ROWSTATUS_NOTINSERVICE:I = 0x2

.field public static final ROWSTATUS_NOTREADY:I = 0x3

.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private checkLexicographicOrdering:Z

.field private ignoreMaxLexicographicRowOrderingErrors:I

.field private maxNumColumnsPerPDU:I

.field private maxNumOfRowsPerPDU:I

.field private sendColumnPDUsMultiThreaded:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/util/TableUtils;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/util/TableUtils;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/AbstractSnmpUtility;-><init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V

    const/16 p1, 0xa

    iput p1, p0, Lorg/snmp4j/util/TableUtils;->maxNumOfRowsPerPDU:I

    iput p1, p0, Lorg/snmp4j/util/TableUtils;->maxNumColumnsPerPDU:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/snmp4j/util/TableUtils;->checkLexicographicOrdering:Z

    const/4 p1, 0x3

    iput p1, p0, Lorg/snmp4j/util/TableUtils;->ignoreMaxLexicographicRowOrderingErrors:I

    return-void
.end method

.method static synthetic access$000(Lorg/snmp4j/util/TableUtils;)I
    .locals 0

    iget p0, p0, Lorg/snmp4j/util/TableUtils;->maxNumColumnsPerPDU:I

    return p0
.end method

.method static synthetic access$100(Lorg/snmp4j/util/TableUtils;)I
    .locals 0

    iget p0, p0, Lorg/snmp4j/util/TableUtils;->maxNumOfRowsPerPDU:I

    return p0
.end method

.method static synthetic access$200()Lorg/snmp4j/log/LogAdapter;
    .locals 1

    sget-object v0, Lorg/snmp4j/util/TableUtils;->logger:Lorg/snmp4j/log/LogAdapter;

    return-object v0
.end method

.method static synthetic access$600(Lorg/snmp4j/util/TableUtils;)I
    .locals 0

    iget p0, p0, Lorg/snmp4j/util/TableUtils;->ignoreMaxLexicographicRowOrderingErrors:I

    return p0
.end method


# virtual methods
.method public createRow(Lorg/snmp4j/Target;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;[Lorg/snmp4j/smi/VariableBinding;)Lorg/snmp4j/event/ResponseEvent;
    .locals 5

    iget-object v0, p0, Lorg/snmp4j/util/AbstractSnmpUtility;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-interface {v0, p1}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object v0

    new-instance v1, Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p2}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, p3}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    new-instance p2, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {p2, v1}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    if-eqz p4, :cond_0

    new-instance v1, Lorg/snmp4j/smi/Integer32;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {p2, v1}, Lorg/snmp4j/smi/VariableBinding;->setVariable(Lorg/snmp4j/smi/Variable;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/snmp4j/smi/Integer32;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {p2, v1}, Lorg/snmp4j/smi/VariableBinding;->setVariable(Lorg/snmp4j/smi/Variable;)V

    :goto_0
    invoke-virtual {v0, p2}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    if-eqz p4, :cond_2

    array-length p2, p4

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p2, :cond_1

    aget-object v2, p4, v1

    new-instance v3, Lorg/snmp4j/smi/OID;

    invoke-virtual {v2}, Lorg/snmp4j/smi/VariableBinding;->getOid()Lorg/snmp4j/smi/OID;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v3, p3}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    invoke-virtual {v2, v3}, Lorg/snmp4j/smi/VariableBinding;->setOid(Lorg/snmp4j/smi/OID;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p4}, Lorg/snmp4j/PDU;->addAll([Lorg/snmp4j/smi/VariableBinding;)V

    :cond_2
    const/16 p2, -0x5d

    invoke-virtual {v0, p2}, Lorg/snmp4j/PDU;->setType(I)V

    :try_start_0
    iget-object p2, p0, Lorg/snmp4j/util/AbstractSnmpUtility;->session:Lorg/snmp4j/Session;

    invoke-interface {p2, v0, p1}, Lorg/snmp4j/Session;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object p2, Lorg/snmp4j/util/TableUtils;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected createTableRequest(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)Lorg/snmp4j/util/TableUtils$TableRequest;
    .locals 9

    new-instance v8, Lorg/snmp4j/util/TableUtils$TableRequest;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lorg/snmp4j/util/TableUtils$TableRequest;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V

    return-object v8
.end method

.method public destroyRow(Lorg/snmp4j/Target;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)Lorg/snmp4j/event/ResponseEvent;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/util/AbstractSnmpUtility;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-interface {v0, p1}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object v0

    new-instance v1, Lorg/snmp4j/smi/OID;

    invoke-direct {v1, p2}, Lorg/snmp4j/smi/OID;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v1, p3}, Lorg/snmp4j/smi/OID;->append(Lorg/snmp4j/smi/OID;)Lorg/snmp4j/smi/OID;

    new-instance p2, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {p2, v1}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    new-instance p3, Lorg/snmp4j/smi/Integer32;

    const/4 v1, 0x6

    invoke-direct {p3, v1}, Lorg/snmp4j/smi/Integer32;-><init>(I)V

    invoke-virtual {p2, p3}, Lorg/snmp4j/smi/VariableBinding;->setVariable(Lorg/snmp4j/smi/Variable;)V

    invoke-virtual {v0, p2}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    const/16 p2, -0x5d

    invoke-virtual {v0, p2}, Lorg/snmp4j/PDU;->setType(I)V

    :try_start_0
    iget-object p2, p0, Lorg/snmp4j/util/AbstractSnmpUtility;->session:Lorg/snmp4j/Session;

    invoke-interface {p2, v0, p1}, Lorg/snmp4j/Session;->send(Lorg/snmp4j/PDU;Lorg/snmp4j/Target;)Lorg/snmp4j/event/ResponseEvent;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object p2, Lorg/snmp4j/util/TableUtils;->logger:Lorg/snmp4j/log/LogAdapter;

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->error(Ljava/io/Serializable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getDenseTable(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V
    .locals 9

    if-eqz p2, :cond_0

    array-length v0, p2

    if-eqz v0, :cond_0

    new-instance v0, Lorg/snmp4j/util/TableUtils$TableRequest;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lorg/snmp4j/util/TableUtils$TableRequest;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$TableRequest;->sendNextChunk()Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No column OIDs specified"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getIgnoreMaxLexicographicRowOrderingErrors()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/TableUtils;->ignoreMaxLexicographicRowOrderingErrors:I

    return v0
.end method

.method public getMaxNumColumnsPerPDU()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/TableUtils;->maxNumColumnsPerPDU:I

    return v0
.end method

.method public getMaxNumRowsPerPDU()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/TableUtils;->maxNumOfRowsPerPDU:I

    return v0
.end method

.method public getTable(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/Target;",
            "[",
            "Lorg/snmp4j/smi/OID;",
            "Lorg/snmp4j/smi/OID;",
            "Lorg/snmp4j/smi/OID;",
            ")",
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TableEvent;",
            ">;"
        }
    .end annotation

    if-eqz p2, :cond_1

    .line 1
    array-length v0, p2

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Lorg/snmp4j/util/TableUtils$InternalTableListener;

    invoke-direct {v0, p0}, Lorg/snmp4j/util/TableUtils$InternalTableListener;-><init>(Lorg/snmp4j/util/TableUtils;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v0

    move-object v6, p3

    move-object v7, p4

    .line 3
    invoke-virtual/range {v1 .. v7}, Lorg/snmp4j/util/TableUtils;->createTableRequest(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)Lorg/snmp4j/util/TableUtils$TableRequest;

    move-result-object p1

    .line 4
    monitor-enter v0

    .line 5
    :try_start_0
    invoke-virtual {p1}, Lorg/snmp4j/util/TableUtils$TableRequest;->sendNextChunk()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 6
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$InternalTableListener;->isFinished()Z

    move-result p1

    if-nez p1, :cond_0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 8
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 9
    :cond_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$InternalTableListener;->getRows()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 11
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No column OIDs specified"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getTable(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V
    .locals 9

    if-eqz p2, :cond_1

    .line 13
    array-length v0, p2

    if-eqz v0, :cond_1

    .line 14
    new-instance v0, Lorg/snmp4j/util/TableUtils$TableRequest;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lorg/snmp4j/util/TableUtils$TableRequest;-><init>(Lorg/snmp4j/util/TableUtils;Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/util/TableListener;Ljava/lang/Object;Lorg/snmp4j/smi/OID;Lorg/snmp4j/smi/OID;)V

    .line 15
    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$TableRequest;->sendNextChunk()Z

    move-result p1

    .line 16
    :goto_0
    iget-boolean p2, p0, Lorg/snmp4j/util/TableUtils;->sendColumnPDUsMultiThreaded:Z

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 17
    invoke-virtual {v0}, Lorg/snmp4j/util/TableUtils$TableRequest;->sendNextChunk()Z

    move-result p1

    goto :goto_0

    :cond_0
    return-void

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No column OIDs specified"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isCheckLexicographicOrdering()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/TableUtils;->checkLexicographicOrdering:Z

    return v0
.end method

.method public isSendColumnPDUsMultiThreaded()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/TableUtils;->sendColumnPDUsMultiThreaded:Z

    return v0
.end method

.method public setCheckLexicographicOrdering(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/TableUtils;->checkLexicographicOrdering:Z

    return-void
.end method

.method public setIgnoreMaxLexicographicRowOrderingErrors(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/util/TableUtils;->ignoreMaxLexicographicRowOrderingErrors:I

    return-void
.end method

.method public setMaxNumColumnsPerPDU(I)V
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    iput p1, p0, Lorg/snmp4j/util/TableUtils;->maxNumColumnsPerPDU:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The number of columns per PDU must be > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMaxNumRowsPerPDU(I)V
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    iput p1, p0, Lorg/snmp4j/util/TableUtils;->maxNumOfRowsPerPDU:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The number of rows per PDU must be > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSendColumnPDUsMultiThreaded(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/TableUtils;->sendColumnPDUsMultiThreaded:Z

    return-void
.end method
