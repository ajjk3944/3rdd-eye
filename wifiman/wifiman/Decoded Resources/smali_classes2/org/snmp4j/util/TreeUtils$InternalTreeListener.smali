.class Lorg/snmp4j/util/TreeUtils$InternalTreeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/TreeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TreeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "InternalTreeListener"
.end annotation


# instance fields
.field private collectedEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TreeEvent;",
            ">;"
        }
    .end annotation
.end field

.field private volatile finished:Z

.field final synthetic this$0:Lorg/snmp4j/util/TreeUtils;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/TreeUtils;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TreeEvent;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;->this$0:Lorg/snmp4j/util/TreeUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;->finished:Z

    iput-object p2, p0, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;->collectedEvents:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public declared-synchronized finished(Lorg/snmp4j/util/TreeEvent;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;->collectedEvents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;->finished:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
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

.method public getCollectedEvents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TreeEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;->collectedEvents:Ljava/util/List;

    return-object v0
.end method

.method public isFinished()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;->finished:Z

    return v0
.end method

.method public declared-synchronized next(Lorg/snmp4j/util/TreeEvent;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/util/TreeUtils$InternalTreeListener;->collectedEvents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
