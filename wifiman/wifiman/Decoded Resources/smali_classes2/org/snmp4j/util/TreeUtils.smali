.class public Lorg/snmp4j/util/TreeUtils;
.super Lorg/snmp4j/util/AbstractSnmpUtility;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/util/TreeUtils$InternalTreeListener;,
        Lorg/snmp4j/util/TreeUtils$TreeRequest;
    }
.end annotation


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private ignoreLexicographicOrder:Z

.field private maxRepetitions:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/util/TreeUtils;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/util/TreeUtils;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/snmp4j/util/AbstractSnmpUtility;-><init>(Lorg/snmp4j/Session;Lorg/snmp4j/util/PDUFactory;)V

    const/16 p1, 0xa

    iput p1, p0, Lorg/snmp4j/util/TreeUtils;->maxRepetitions:I

    return-void
.end method

.method static synthetic access$000(Lorg/snmp4j/util/TreeUtils;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/snmp4j/util/TreeUtils;->ignoreLexicographicOrder:Z

    return p0
.end method


# virtual methods
.method public getMaxRepetitions()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/util/TreeUtils;->maxRepetitions:I

    return v0
.end method

.method public getSubtree(Lorg/snmp4j/Target;Lorg/snmp4j/smi/OID;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/Target;",
            "Lorg/snmp4j/smi/OID;",
            ")",
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TreeEvent;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 2
    new-instance v1, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;

    invoke-direct {v1, p0, v0}, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;-><init>(Lorg/snmp4j/util/TreeUtils;Ljava/util/List;)V

    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    filled-new-array {p2}, [Lorg/snmp4j/smi/OID;

    move-result-object p2

    const/4 v2, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, v2, v1}, Lorg/snmp4j/util/TreeUtils;->walk(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Ljava/lang/Object;Lorg/snmp4j/util/TreeListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 7
    :try_start_2
    sget-object p2, Lorg/snmp4j/util/TreeUtils;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Tree retrieval interrupted: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 8
    :goto_0
    monitor-exit v1

    return-object v0

    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public getSubtree(Lorg/snmp4j/Target;Lorg/snmp4j/smi/OID;Ljava/lang/Object;Lorg/snmp4j/util/TreeListener;)V
    .locals 0

    .line 9
    filled-new-array {p2}, [Lorg/snmp4j/smi/OID;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/snmp4j/util/TreeUtils;->walk(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Ljava/lang/Object;Lorg/snmp4j/util/TreeListener;)V

    return-void
.end method

.method public isIgnoreLexicographicOrder()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/TreeUtils;->ignoreLexicographicOrder:Z

    return v0
.end method

.method public setIgnoreLexicographicOrder(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/util/TreeUtils;->ignoreLexicographicOrder:Z

    return-void
.end method

.method public setMaxRepetitions(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/util/TreeUtils;->maxRepetitions:I

    return-void
.end method

.method public walk(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/Target;",
            "[",
            "Lorg/snmp4j/smi/OID;",
            ")",
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TreeEvent;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 2
    new-instance v1, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;

    invoke-direct {v1, p0, v0}, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;-><init>(Lorg/snmp4j/util/TreeUtils;Ljava/util/List;)V

    .line 3
    monitor-enter v1

    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1, p2, v2, v1}, Lorg/snmp4j/util/TreeUtils;->walk(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Ljava/lang/Object;Lorg/snmp4j/util/TreeListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 6
    :try_start_2
    sget-object p2, Lorg/snmp4j/util/TreeUtils;->logger:Lorg/snmp4j/log/LogAdapter;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Tree retrieval interrupted: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 7
    :goto_0
    monitor-exit v1

    return-object v0

    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public walk(Lorg/snmp4j/Target;[Lorg/snmp4j/smi/OID;Ljava/lang/Object;Lorg/snmp4j/util/TreeListener;)V
    .locals 8

    .line 8
    iget-object v0, p0, Lorg/snmp4j/util/AbstractSnmpUtility;->pduFactory:Lorg/snmp4j/util/PDUFactory;

    invoke-interface {v0, p1}, Lorg/snmp4j/util/PDUFactory;->createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;

    move-result-object v7

    .line 9
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    .line 10
    new-instance v3, Lorg/snmp4j/smi/VariableBinding;

    invoke-direct {v3, v2}, Lorg/snmp4j/smi/VariableBinding;-><init>(Lorg/snmp4j/smi/OID;)V

    invoke-virtual {v7, v3}, Lorg/snmp4j/PDU;->add(Lorg/snmp4j/smi/VariableBinding;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_0
    invoke-interface {p1}, Lorg/snmp4j/Target;->getVersion()I

    move-result v0

    const/16 v1, -0x5f

    if-nez v0, :cond_1

    .line 12
    invoke-virtual {v7, v1}, Lorg/snmp4j/PDU;->setType(I)V

    goto :goto_1

    .line 13
    :cond_1
    invoke-virtual {v7}, Lorg/snmp4j/PDU;->getType()I

    move-result v0

    if-eq v0, v1, :cond_2

    const/16 v0, -0x5b

    .line 14
    invoke-virtual {v7, v0}, Lorg/snmp4j/PDU;->setType(I)V

    .line 15
    iget v0, p0, Lorg/snmp4j/util/TreeUtils;->maxRepetitions:I

    invoke-virtual {v7, v0}, Lorg/snmp4j/PDU;->setMaxRepetitions(I)V

    .line 16
    :cond_2
    :goto_1
    new-instance v0, Lorg/snmp4j/util/TreeUtils$TreeRequest;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p4

    move-object v4, p2

    move-object v5, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, Lorg/snmp4j/util/TreeUtils$TreeRequest;-><init>(Lorg/snmp4j/util/TreeUtils;Lorg/snmp4j/util/TreeListener;[Lorg/snmp4j/smi/OID;Lorg/snmp4j/Target;Ljava/lang/Object;Lorg/snmp4j/PDU;)V

    .line 17
    invoke-virtual {v0}, Lorg/snmp4j/util/TreeUtils$TreeRequest;->send()V

    return-void
.end method
