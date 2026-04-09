.class public Lorg/snmp4j/util/DefaultThreadFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;
    }
.end annotation


# instance fields
.field private joinTimeout:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getThreadJoinTimeout()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/snmp4j/util/DefaultThreadFactory;->joinTimeout:J

    return-void
.end method

.method static synthetic access$100(Lorg/snmp4j/util/DefaultThreadFactory;)J
    .locals 2

    iget-wide v0, p0, Lorg/snmp4j/util/DefaultThreadFactory;->joinTimeout:J

    return-wide v0
.end method


# virtual methods
.method public createWorkerThread(Ljava/lang/String;Lorg/snmp4j/util/WorkerTask;Z)Lorg/snmp4j/util/WorkerTask;
    .locals 1

    new-instance v0, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;

    invoke-direct {v0, p0, p1, p2}, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;-><init>(Lorg/snmp4j/util/DefaultThreadFactory;Ljava/lang/String;Lorg/snmp4j/util/WorkerTask;)V

    invoke-static {v0}, Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;->access$000(Lorg/snmp4j/util/DefaultThreadFactory$WorkerThread;)Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method

.method public setThreadJoinTimeout(J)V
    .locals 0

    iput-wide p1, p0, Lorg/snmp4j/util/DefaultThreadFactory;->joinTimeout:J

    return-void
.end method
