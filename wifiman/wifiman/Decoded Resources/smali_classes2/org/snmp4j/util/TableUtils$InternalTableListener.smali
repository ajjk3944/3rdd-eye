.class Lorg/snmp4j/util/TableUtils$InternalTableListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/TableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/TableUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "InternalTableListener"
.end annotation


# instance fields
.field private volatile finished:Z

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TableEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/snmp4j/util/TableUtils;


# direct methods
.method constructor <init>(Lorg/snmp4j/util/TableUtils;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$InternalTableListener;->this$0:Lorg/snmp4j/util/TableUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/util/TableUtils$InternalTableListener;->rows:Ljava/util/List;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/snmp4j/util/TableUtils$InternalTableListener;->finished:Z

    return-void
.end method


# virtual methods
.method public declared-synchronized finished(Lorg/snmp4j/util/TableEvent;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lorg/snmp4j/util/RetrievalEvent;->getStatus()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lorg/snmp4j/util/TableEvent;->getIndex()Lorg/snmp4j/smi/OID;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$InternalTableListener;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/snmp4j/util/TableUtils$InternalTableListener;->finished:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
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

.method public getRows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/snmp4j/util/TableEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$InternalTableListener;->rows:Ljava/util/List;

    return-object v0
.end method

.method public isFinished()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/util/TableUtils$InternalTableListener;->finished:Z

    return v0
.end method

.method public next(Lorg/snmp4j/util/TableEvent;)Z
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/util/TableUtils$InternalTableListener;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method
