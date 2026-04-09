.class Lorg/snmp4j/transport/DummyTransport$QueueProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/WorkerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DummyTransport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "QueueProcessor"
.end annotation


# instance fields
.field private queue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lorg/snmp4j/transport/DummyTransport<",
            "TA;>.MessageContainer;>;"
        }
    .end annotation
.end field

.field private volatile stop:Z

.field final synthetic this$0:Lorg/snmp4j/transport/DummyTransport;

.field private tm:Lorg/snmp4j/transport/AbstractTransportMapping;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/DummyTransport;Ljava/util/Queue;Lorg/snmp4j/transport/AbstractTransportMapping;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue<",
            "Lorg/snmp4j/transport/DummyTransport<",
            "TA;>.MessageContainer;>;",
            "Lorg/snmp4j/transport/AbstractTransportMapping;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->queue:Ljava/util/Queue;

    iput-object p3, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->tm:Lorg/snmp4j/transport/AbstractTransportMapping;

    return-void
.end method


# virtual methods
.method public interrupt()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->stop:Z

    return-void
.end method

.method public join()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->stop:Z

    monitor-enter p0

    :try_start_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public run()V
    .locals 10

    :goto_0
    iget-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->stop:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->queue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/snmp4j/transport/DummyTransport$MessageContainer;

    if-eqz v0, :cond_0

    new-instance v9, Lorg/snmp4j/TransportStateReference;

    iget-object v2, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-static {v2}, Lorg/snmp4j/transport/DummyTransport;->access$000(Lorg/snmp4j/transport/DummyTransport;)Lorg/snmp4j/smi/IpAddress;

    move-result-object v3

    sget-object v6, Lorg/snmp4j/security/SecurityLevel;->undefined:Lorg/snmp4j/security/SecurityLevel;

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-static {v1}, Lorg/snmp4j/transport/DummyTransport;->access$100(Lorg/snmp4j/transport/DummyTransport;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v1, v9

    move-object v5, v6

    invoke-direct/range {v1 .. v8}, Lorg/snmp4j/TransportStateReference;-><init>(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/security/SecurityLevel;Lorg/snmp4j/security/SecurityLevel;ZLjava/lang/Object;)V

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->tm:Lorg/snmp4j/transport/AbstractTransportMapping;

    iget-object v2, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-static {v2}, Lorg/snmp4j/transport/DummyTransport;->access$000(Lorg/snmp4j/transport/DummyTransport;)Lorg/snmp4j/smi/IpAddress;

    move-result-object v2

    invoke-virtual {v0}, Lorg/snmp4j/transport/DummyTransport$MessageContainer;->getPayload()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-virtual {v0}, Lorg/snmp4j/smi/OctetString;->getValue()[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v1, v2, v0, v9}, Lorg/snmp4j/transport/AbstractTransportMapping;->fireProcessMessage(Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x32

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lorg/snmp4j/transport/DummyTransport;->access$200()Lorg/snmp4j/log/LogAdapter;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Interrupted QueueProcessor: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public terminate()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;->stop:Z

    return-void
.end method
