.class public Lorg/snmp4j/mp/MPv3$Cache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/mp/MPv3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "Cache"
.end annotation


# instance fields
.field private entries:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/mp/PduHandle;",
            "Lorg/snmp4j/mp/StateReference<",
            "*>;>;"
        }
    .end annotation
.end field

.field private msgIdToPduHandleMapping:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/mp/MessageID;",
            "Ljava/lang/ref/WeakReference<",
            "Lorg/snmp4j/mp/PduHandle;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3$Cache;->entries:Ljava/util/Map;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    iput-object v0, p0, Lorg/snmp4j/mp/MPv3$Cache;->msgIdToPduHandleMapping:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public declared-synchronized addEntry(Lorg/snmp4j/mp/StateReference;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/mp/StateReference<",
            "*>;)I"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding cache entry: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$Cache;->entries:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/mp/StateReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/snmp4j/mp/StateReference;->setPduHandle(Lorg/snmp4j/mp/PduHandle;)V

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/StateReference;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Doubled message: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_1
    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/StateReference;->setPduHandle(Lorg/snmp4j/mp/PduHandle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/16 p1, -0x57c

    return p1

    :cond_2
    :try_start_1
    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/StateReference;->equalsExceptMsgID(Lorg/snmp4j/mp/StateReference;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Adding previous message IDs "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/mp/StateReference;->getMessageIDs()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " to new entry "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_3
    invoke-virtual {v0}, Lorg/snmp4j/mp/StateReference;->getMessageIDs()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/snmp4j/mp/StateReference;->addMessageIDs(Ljava/util/List;)V

    goto :goto_1

    :cond_4
    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    invoke-interface {v2}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "New entry does not match existing, although request ID is the same "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " != "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    :cond_5
    :goto_1
    invoke-virtual {v0, v1}, Lorg/snmp4j/mp/StateReference;->setPduHandle(Lorg/snmp4j/mp/PduHandle;)V

    :cond_6
    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getPduHandle()Lorg/snmp4j/mp/PduHandle;

    move-result-object v0

    invoke-virtual {p1, v1}, Lorg/snmp4j/mp/StateReference;->setPduHandle(Lorg/snmp4j/mp/PduHandle;)V

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3$Cache;->entries:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$Cache;->msgIdToPduHandleMapping:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getMsgID()Lorg/snmp4j/mp/MessageID;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getMessageIDs()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getMessageIDs()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/mp/MessageID;

    iget-object v2, p0, Lorg/snmp4j/mp/MPv3$Cache;->msgIdToPduHandleMapping:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_7
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized deleteEntry(Lorg/snmp4j/mp/PduHandle;)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$Cache;->entries:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/mp/StateReference;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$Cache;->msgIdToPduHandleMapping:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getMsgID()Lorg/snmp4j/mp/MessageID;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getMessageIDs()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/mp/StateReference;->getMessageIDs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/mp/MessageID;

    iget-object v2, p0, Lorg/snmp4j/mp/MPv3$Cache;->msgIdToPduHandleMapping:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    invoke-interface {v0}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lorg/snmp4j/mp/MPv3;->access$100()Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Removed cache entry: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    monitor-exit p0

    return p1

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized popEntry(Lorg/snmp4j/mp/MessageID;)Lorg/snmp4j/mp/StateReference;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/mp/MessageID;",
            ")",
            "Lorg/snmp4j/mp/StateReference<",
            "*>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/mp/MPv3$Cache;->msgIdToPduHandleMapping:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/mp/PduHandle;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/snmp4j/mp/MPv3$Cache;->entries:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/mp/StateReference;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lorg/snmp4j/mp/StateReference;->isMatchingMessageID(Lorg/snmp4j/mp/MessageID;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lorg/snmp4j/mp/MPv3$Cache;->deleteEntry(Lorg/snmp4j/mp/PduHandle;)Z

    iget-object p1, p0, Lorg/snmp4j/mp/MPv3$Cache;->entries:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lorg/snmp4j/mp/StateReference;->setPduHandle(Lorg/snmp4j/mp/PduHandle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
