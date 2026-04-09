.class public Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;
.super Lorg/snmp4j/transport/AbstractTransportMapping;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DummyTransport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DummyTransportResponder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/snmp4j/transport/AbstractTransportMapping<",
        "TA;>;"
    }
.end annotation


# instance fields
.field private listenThread:Lorg/snmp4j/util/WorkerTask;

.field private listening:Z

.field final synthetic this$0:Lorg/snmp4j/transport/DummyTransport;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/DummyTransport;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-direct {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->listening:Z

    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->listenThread:Lorg/snmp4j/util/WorkerTask;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->terminate()V

    :try_start_0
    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->listenThread:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Lorg/snmp4j/util/WorkerTask;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-static {v0}, Lorg/snmp4j/transport/DummyTransport;->access$500(Lorg/snmp4j/transport/DummyTransport;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public bridge synthetic getListenAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->getListenAddress()Lorg/snmp4j/smi/IpAddress;

    move-result-object v0

    return-object v0
.end method

.method public getListenAddress()Lorg/snmp4j/smi/IpAddress;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-static {v0}, Lorg/snmp4j/transport/DummyTransport;->access$300(Lorg/snmp4j/transport/DummyTransport;)Lorg/snmp4j/smi/IpAddress;

    move-result-object v0

    return-object v0
.end method

.method public getSupportedAddressClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-virtual {v0}, Lorg/snmp4j/transport/DummyTransport;->getSupportedAddressClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public isListening()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->listening:Z

    return v0
.end method

.method public listen()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->listening:Z

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-static {v1}, Lorg/snmp4j/transport/DummyTransport;->access$108(Lorg/snmp4j/transport/DummyTransport;)J

    new-instance v1, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;

    iget-object v2, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-static {v2}, Lorg/snmp4j/transport/DummyTransport;->access$500(Lorg/snmp4j/transport/DummyTransport;)Ljava/util/Queue;

    move-result-object v3

    invoke-direct {v1, v2, v3, p0}, Lorg/snmp4j/transport/DummyTransport$QueueProcessor;-><init>(Lorg/snmp4j/transport/DummyTransport;Ljava/util/Queue;Lorg/snmp4j/transport/AbstractTransportMapping;)V

    invoke-static {}, Lorg/snmp4j/SNMP4JSettings;->getThreadFactory()Lorg/snmp4j/util/ThreadFactory;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DummyResponseTransportMapping_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->getListenAddress()Lorg/snmp4j/smi/IpAddress;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1, v0}, Lorg/snmp4j/util/ThreadFactory;->createWorkerThread(Ljava/lang/String;Lorg/snmp4j/util/WorkerTask;Z)Lorg/snmp4j/util/WorkerTask;

    move-result-object v0

    iput-object v0, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->listenThread:Lorg/snmp4j/util/WorkerTask;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public bridge synthetic sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/snmp4j/smi/IpAddress;

    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->sendMessage(Lorg/snmp4j/smi/IpAddress;[BLorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public sendMessage(Lorg/snmp4j/smi/IpAddress;[BLorg/snmp4j/TransportStateReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;[B",
            "Lorg/snmp4j/TransportStateReference;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-static {}, Lorg/snmp4j/transport/DummyTransport;->access$200()Lorg/snmp4j/log/LogAdapter;

    move-result-object p3

    invoke-interface {p3}, Lorg/snmp4j/log/LogAdapter;->isDebugEnabled()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 3
    invoke-static {}, Lorg/snmp4j/transport/DummyTransport;->access$200()Lorg/snmp4j/log/LogAdapter;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Send response message to \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\': "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v1, p2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-virtual {v1}, Lorg/snmp4j/smi/OctetString;->toHexString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0}, Lorg/snmp4j/log/LogAdapter;->debug(Ljava/io/Serializable;)V

    .line 4
    :cond_0
    iget-object p3, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-static {p3}, Lorg/snmp4j/transport/DummyTransport;->access$400(Lorg/snmp4j/transport/DummyTransport;)Ljava/util/Queue;

    move-result-object p3

    new-instance v0, Lorg/snmp4j/transport/DummyTransport$MessageContainer;

    iget-object v1, p0, Lorg/snmp4j/transport/DummyTransport$DummyTransportResponder;->this$0:Lorg/snmp4j/transport/DummyTransport;

    new-instance v2, Lorg/snmp4j/smi/OctetString;

    invoke-direct {v2, p2}, Lorg/snmp4j/smi/OctetString;-><init>([B)V

    invoke-direct {v0, v1, p1, v2}, Lorg/snmp4j/transport/DummyTransport$MessageContainer;-><init>(Lorg/snmp4j/transport/DummyTransport;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V

    invoke-interface {p3, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method
