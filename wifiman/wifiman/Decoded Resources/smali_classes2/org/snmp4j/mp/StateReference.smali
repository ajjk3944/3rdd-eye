.class public Lorg/snmp4j/mp/StateReference;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lorg/snmp4j/smi/Address;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x667d8e44122c8a6bL


# instance fields
.field private address:Lorg/snmp4j/smi/Address;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field private contextEngineID:[B

.field private contextName:[B

.field private errorCode:I

.field private matchedMsgID:I

.field private maxSizeResponseScopedPDU:I

.field private msgFlags:I

.field private msgID:Lorg/snmp4j/mp/MessageID;

.field private pduHandle:Lorg/snmp4j/mp/PduHandle;

.field private responseRuntimeNanos:J

.field protected retryMsgIDs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/mp/MessageID;",
            ">;"
        }
    .end annotation
.end field

.field private securityEngineID:[B

.field private securityLevel:I

.field private securityModel:Lorg/snmp4j/security/SecurityModel;

.field private securityName:[B

.field private securityStateReference:Lorg/snmp4j/security/SecurityStateReference;

.field private transient transportMapping:Lorg/snmp4j/TransportMapping;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/snmp4j/TransportMapping<",
            "-TA;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/snmp4j/mp/StateReference;->errorCode:I

    return-void
.end method

.method public constructor <init>(IIILorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;[BLorg/snmp4j/security/SecurityModel;[BI[B[BLorg/snmp4j/security/SecurityStateReference;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lorg/snmp4j/mp/PduHandle;",
            "TA;",
            "Lorg/snmp4j/TransportMapping<",
            "-TA;>;[B",
            "Lorg/snmp4j/security/SecurityModel;",
            "[BI[B[B",
            "Lorg/snmp4j/security/SecurityStateReference;",
            "I)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/snmp4j/mp/StateReference;->errorCode:I

    .line 6
    invoke-static {p1}, Lorg/snmp4j/mp/StateReference;->createMessageID(I)Lorg/snmp4j/mp/MessageID;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    .line 7
    iput p2, p0, Lorg/snmp4j/mp/StateReference;->msgFlags:I

    .line 8
    iput p3, p0, Lorg/snmp4j/mp/StateReference;->maxSizeResponseScopedPDU:I

    .line 9
    iput-object p4, p0, Lorg/snmp4j/mp/StateReference;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    .line 10
    iput-object p5, p0, Lorg/snmp4j/mp/StateReference;->address:Lorg/snmp4j/smi/Address;

    .line 11
    iput-object p6, p0, Lorg/snmp4j/mp/StateReference;->transportMapping:Lorg/snmp4j/TransportMapping;

    .line 12
    iput-object p7, p0, Lorg/snmp4j/mp/StateReference;->securityEngineID:[B

    .line 13
    iput-object p8, p0, Lorg/snmp4j/mp/StateReference;->securityModel:Lorg/snmp4j/security/SecurityModel;

    .line 14
    iput-object p9, p0, Lorg/snmp4j/mp/StateReference;->securityName:[B

    .line 15
    iput p10, p0, Lorg/snmp4j/mp/StateReference;->securityLevel:I

    .line 16
    iput-object p11, p0, Lorg/snmp4j/mp/StateReference;->contextEngineID:[B

    .line 17
    iput-object p12, p0, Lorg/snmp4j/mp/StateReference;->contextName:[B

    .line 18
    iput-object p13, p0, Lorg/snmp4j/mp/StateReference;->securityStateReference:Lorg/snmp4j/security/SecurityStateReference;

    .line 19
    iput p14, p0, Lorg/snmp4j/mp/StateReference;->errorCode:I

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/security/SecurityModel;[BI)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/mp/PduHandle;",
            "TA;",
            "Lorg/snmp4j/TransportMapping<",
            "-TA;>;",
            "Lorg/snmp4j/security/SecurityModel;",
            "[BI)V"
        }
    .end annotation

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0xffff

    const/4 v7, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v0, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v14, p6

    .line 3
    invoke-direct/range {v0 .. v14}, Lorg/snmp4j/mp/StateReference;-><init>(IIILorg/snmp4j/mp/PduHandle;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;[BLorg/snmp4j/security/SecurityModel;[BI[B[BLorg/snmp4j/security/SecurityStateReference;I)V

    return-void
.end method

.method public static createMessageID(I)Lorg/snmp4j/mp/MessageID;
    .locals 2

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getSnmp4jStatistics()Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    move-result-object v0

    sget-object v1, Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;->extended:Lorg/snmp4j/SNMP4JSettings$Snmp4jStatistics;

    if-ne v0, v1, :cond_0

    new-instance v0, Lorg/snmp4j/mp/TimedMessageID;

    invoke-direct {v0, p0}, Lorg/snmp4j/mp/TimedMessageID;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Lorg/snmp4j/mp/SimpleMessageID;

    invoke-direct {v0, p0}, Lorg/snmp4j/mp/SimpleMessageID;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized addMessageIDs(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/snmp4j/mp/MessageID;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
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

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lorg/snmp4j/mp/StateReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lorg/snmp4j/mp/StateReference;

    iget-object v0, p1, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    invoke-virtual {p0, v0}, Lorg/snmp4j/mp/StateReference;->isMatchingMessageID(Lorg/snmp4j/mp/MessageID;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lorg/snmp4j/mp/StateReference;->equalsExceptMsgID(Lorg/snmp4j/mp/StateReference;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public equalsExceptMsgID(Lorg/snmp4j/mp/StateReference;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/mp/StateReference<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    if-nez v0, :cond_0

    iget-object v1, p1, Lorg/snmp4j/mp/StateReference;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    if-eqz v1, :cond_1

    :cond_0
    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/PduHandle;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->securityEngineID:[B

    iget-object v1, p1, Lorg/snmp4j/mp/StateReference;->securityEngineID:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->securityModel:Lorg/snmp4j/security/SecurityModel;

    iget-object v1, p1, Lorg/snmp4j/mp/StateReference;->securityModel:Lorg/snmp4j/security/SecurityModel;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->securityName:[B

    iget-object v1, p1, Lorg/snmp4j/mp/StateReference;->securityName:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lorg/snmp4j/mp/StateReference;->securityLevel:I

    iget v1, p1, Lorg/snmp4j/mp/StateReference;->securityLevel:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->contextEngineID:[B

    iget-object v1, p1, Lorg/snmp4j/mp/StateReference;->contextEngineID:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->contextName:[B

    iget-object p1, p1, Lorg/snmp4j/mp/StateReference;->contextName:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getAddress()Lorg/snmp4j/smi/Address;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->address:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public getContextEngineID()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->contextEngineID:[B

    return-object v0
.end method

.method public getContextName()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->contextName:[B

    return-object v0
.end method

.method public getErrorCode()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/StateReference;->errorCode:I

    return v0
.end method

.method public getMaxSizeResponseScopedPDU()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/StateReference;->maxSizeResponseScopedPDU:I

    return v0
.end method

.method public declared-synchronized getMessageIDs()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/snmp4j/mp/MessageID;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    add-int/2addr v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getMsgFlags()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/StateReference;->msgFlags:I

    return v0
.end method

.method public getMsgID()Lorg/snmp4j/mp/MessageID;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    return-object v0
.end method

.method public getPduHandle()Lorg/snmp4j/mp/PduHandle;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    return-object v0
.end method

.method public getSecurityEngineID()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->securityEngineID:[B

    return-object v0
.end method

.method public getSecurityLevel()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/StateReference;->securityLevel:I

    return v0
.end method

.method public getSecurityModel()Lorg/snmp4j/security/SecurityModel;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->securityModel:Lorg/snmp4j/security/SecurityModel;

    return-object v0
.end method

.method public getSecurityName()[B
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->securityName:[B

    return-object v0
.end method

.method public getSecurityStateReference()Lorg/snmp4j/security/SecurityStateReference;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->securityStateReference:Lorg/snmp4j/security/SecurityStateReference;

    return-object v0
.end method

.method public getTransportMapping()Lorg/snmp4j/TransportMapping;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/snmp4j/TransportMapping<",
            "-TA;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->transportMapping:Lorg/snmp4j/TransportMapping;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    invoke-interface {v0}, Lorg/snmp4j/mp/MessageID;->getID()I

    move-result v0

    return v0
.end method

.method public isMatchingMessageID(I)Z
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    invoke-interface {v0}, Lorg/snmp4j/mp/MessageID;->getID()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 3
    iput p1, p0, Lorg/snmp4j/mp/StateReference;->matchedMsgID:I

    .line 4
    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    instance-of v0, v0, Lorg/snmp4j/mp/TimedMessageID;

    if-eqz v0, :cond_2

    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    check-cast v2, Lorg/snmp4j/mp/TimedMessageID;

    invoke-virtual {v2}, Lorg/snmp4j/mp/TimedMessageID;->getCreationNanoTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lorg/snmp4j/mp/StateReference;->responseRuntimeNanos:J

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/mp/MessageID;

    .line 8
    invoke-interface {v1}, Lorg/snmp4j/mp/MessageID;->getID()I

    move-result v1

    if-ne v1, p1, :cond_1

    .line 9
    iput p1, p0, Lorg/snmp4j/mp/StateReference;->matchedMsgID:I

    .line 10
    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    instance-of v0, v0, Lorg/snmp4j/mp/TimedMessageID;

    if-eqz v0, :cond_2

    .line 11
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    check-cast v2, Lorg/snmp4j/mp/TimedMessageID;

    invoke-virtual {v2}, Lorg/snmp4j/mp/TimedMessageID;->getCreationNanoTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lorg/snmp4j/mp/StateReference;->responseRuntimeNanos:J

    .line 12
    :cond_2
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    invoke-virtual {p0, v0}, Lorg/snmp4j/mp/StateReference;->updateRequestStatisticsPduHandle(Lorg/snmp4j/mp/PduHandle;)V

    .line 13
    iget v0, p0, Lorg/snmp4j/mp/StateReference;->matchedMsgID:I

    if-ne v0, p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method protected isMatchingMessageID(Lorg/snmp4j/mp/MessageID;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Lorg/snmp4j/mp/MessageID;->getID()I

    move-result p1

    invoke-virtual {p0, p1}, Lorg/snmp4j/mp/StateReference;->isMatchingMessageID(I)Z

    move-result p1

    return p1
.end method

.method public isReportable()Z
    .locals 1

    iget v0, p0, Lorg/snmp4j/mp/StateReference;->msgFlags:I

    and-int/lit8 v0, v0, 0x4

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAddress(Lorg/snmp4j/smi/Address;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->address:Lorg/snmp4j/smi/Address;

    return-void
.end method

.method public setContextEngineID([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->contextEngineID:[B

    return-void
.end method

.method public setContextName([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->contextName:[B

    return-void
.end method

.method public setErrorCode(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/mp/StateReference;->errorCode:I

    return-void
.end method

.method public setMaxSizeResponseScopedPDU(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/mp/StateReference;->maxSizeResponseScopedPDU:I

    return-void
.end method

.method public setMsgFlags(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/mp/StateReference;->msgFlags:I

    return-void
.end method

.method public setMsgID(I)V
    .locals 0

    .line 2
    invoke-static {p1}, Lorg/snmp4j/mp/StateReference;->createMessageID(I)Lorg/snmp4j/mp/MessageID;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    return-void
.end method

.method public setMsgID(Lorg/snmp4j/mp/MessageID;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    return-void
.end method

.method public setPduHandle(Lorg/snmp4j/mp/PduHandle;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    invoke-virtual {p0, p1}, Lorg/snmp4j/mp/StateReference;->updateRequestStatisticsPduHandle(Lorg/snmp4j/mp/PduHandle;)V

    return-void
.end method

.method public setSecurityEngineID([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->securityEngineID:[B

    return-void
.end method

.method public setSecurityLevel(I)V
    .locals 0

    iput p1, p0, Lorg/snmp4j/mp/StateReference;->securityLevel:I

    return-void
.end method

.method public setSecurityModel(Lorg/snmp4j/security/SecurityModel;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->securityModel:Lorg/snmp4j/security/SecurityModel;

    return-void
.end method

.method public setSecurityName([B)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->securityName:[B

    return-void
.end method

.method public setSecurityStateReference(Lorg/snmp4j/security/SecurityStateReference;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->securityStateReference:Lorg/snmp4j/security/SecurityStateReference;

    return-void
.end method

.method public setTransportMapping(Lorg/snmp4j/TransportMapping;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/TransportMapping<",
            "-TA;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/mp/StateReference;->transportMapping:Lorg/snmp4j/TransportMapping;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StateReference[msgID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",pduHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->pduHandle:Lorg/snmp4j/mp/PduHandle;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",securityEngineID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->securityEngineID:[B

    invoke-static {v1}, Lorg/snmp4j/smi/OctetString;->fromByteArray([B)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",securityModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->securityModel:Lorg/snmp4j/security/SecurityModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",securityName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->securityName:[B

    invoke-static {v1}, Lorg/snmp4j/smi/OctetString;->fromByteArray([B)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",securityLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/mp/StateReference;->securityLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",contextEngineID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->contextEngineID:[B

    invoke-static {v1}, Lorg/snmp4j/smi/OctetString;->fromByteArray([B)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",contextName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->contextName:[B

    invoke-static {v1}, Lorg/snmp4j/smi/OctetString;->fromByteArray([B)Lorg/snmp4j/smi/OctetString;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",retryMsgIDs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected updateRequestStatisticsPduHandle(Lorg/snmp4j/mp/PduHandle;)V
    .locals 5

    instance-of v0, p1, Lorg/snmp4j/mp/RequestStatistics;

    if-eqz v0, :cond_3

    check-cast p1, Lorg/snmp4j/mp/RequestStatistics;

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x1

    add-int/2addr v0, v2

    invoke-interface {p1, v0}, Lorg/snmp4j/mp/RequestStatistics;->setTotalMessagesSent(I)V

    iget-wide v3, p0, Lorg/snmp4j/mp/StateReference;->responseRuntimeNanos:J

    invoke-interface {p1, v3, v4}, Lorg/snmp4j/mp/RequestStatistics;->setResponseRuntimeNanos(J)V

    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->msgID:Lorg/snmp4j/mp/MessageID;

    invoke-interface {v0}, Lorg/snmp4j/mp/MessageID;->getID()I

    move-result v0

    iget v3, p0, Lorg/snmp4j/mp/StateReference;->matchedMsgID:I

    if-ne v0, v3, :cond_1

    invoke-interface {p1, v1}, Lorg/snmp4j/mp/RequestStatistics;->setIndexOfMessageResponded(I)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lorg/snmp4j/mp/StateReference;->retryMsgIDs:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/mp/MessageID;

    invoke-interface {v1}, Lorg/snmp4j/mp/MessageID;->getID()I

    move-result v1

    iget v3, p0, Lorg/snmp4j/mp/StateReference;->matchedMsgID:I

    if-ne v1, v3, :cond_2

    invoke-interface {p1, v2}, Lorg/snmp4j/mp/RequestStatistics;->setIndexOfMessageResponded(I)V

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method
