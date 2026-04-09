.class Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/WorkerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/util/MultiThreadedMessageDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MessageTask"
.end annotation


# instance fields
.field private incomingAddress:Lorg/snmp4j/smi/Address;

.field private sourceTransport:Lorg/snmp4j/TransportMapping;

.field final synthetic this$0:Lorg/snmp4j/util/MultiThreadedMessageDispatcher;

.field private tmStateReference:Lorg/snmp4j/TransportStateReference;

.field private wholeMessage:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Lorg/snmp4j/util/MultiThreadedMessageDispatcher;Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->this$0:Lorg/snmp4j/util/MultiThreadedMessageDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->sourceTransport:Lorg/snmp4j/TransportMapping;

    iput-object p3, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->incomingAddress:Lorg/snmp4j/smi/Address;

    iput-object p4, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->wholeMessage:Ljava/nio/ByteBuffer;

    iput-object p5, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    return-void
.end method


# virtual methods
.method public interrupt()V
    .locals 0

    return-void
.end method

.method public join()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    return-void
.end method

.method public run()V
    .locals 5

    iget-object v0, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->this$0:Lorg/snmp4j/util/MultiThreadedMessageDispatcher;

    invoke-static {v0}, Lorg/snmp4j/util/MultiThreadedMessageDispatcher;->access$000(Lorg/snmp4j/util/MultiThreadedMessageDispatcher;)Lorg/snmp4j/MessageDispatcher;

    move-result-object v0

    iget-object v1, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->sourceTransport:Lorg/snmp4j/TransportMapping;

    iget-object v2, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->incomingAddress:Lorg/snmp4j/smi/Address;

    iget-object v3, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->wholeMessage:Ljava/nio/ByteBuffer;

    iget-object v4, p0, Lorg/snmp4j/util/MultiThreadedMessageDispatcher$MessageTask;->tmStateReference:Lorg/snmp4j/TransportStateReference;

    invoke-interface {v0, v1, v2, v3, v4}, Lorg/snmp4j/MessageDispatcher;->processMessage(Lorg/snmp4j/TransportMapping;Lorg/snmp4j/smi/Address;Ljava/nio/ByteBuffer;Lorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public terminate()V
    .locals 0

    return-void
.end method
