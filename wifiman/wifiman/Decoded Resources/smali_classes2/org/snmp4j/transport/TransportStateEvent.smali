.class public Lorg/snmp4j/transport/TransportStateEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# static fields
.field public static final STATE_CLOSED:I = 0x4

.field public static final STATE_CONNECTED:I = 0x1

.field public static final STATE_DISCONNECTED_REMOTELY:I = 0x2

.field public static final STATE_DISCONNECTED_TIMEOUT:I = 0x3

.field public static final STATE_UNKNOWN:I = 0x0

.field private static final serialVersionUID:J = 0x595ff85e6b9b09a7L


# instance fields
.field private cancelled:Z

.field private causingException:Ljava/io/IOException;

.field private discardedMessages:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation
.end field

.field private newState:I

.field private peerAddress:Lorg/snmp4j/smi/Address;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lorg/snmp4j/transport/TransportStateEvent;->cancelled:Z

    .line 3
    iput p3, p0, Lorg/snmp4j/transport/TransportStateEvent;->newState:I

    .line 4
    iput-object p2, p0, Lorg/snmp4j/transport/TransportStateEvent;->peerAddress:Lorg/snmp4j/smi/Address;

    .line 5
    iput-object p4, p0, Lorg/snmp4j/transport/TransportStateEvent;->causingException:Ljava/io/IOException;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/transport/TcpTransportMapping;",
            "Lorg/snmp4j/smi/Address;",
            "I",
            "Ljava/io/IOException;",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/snmp4j/transport/TransportStateEvent;-><init>(Lorg/snmp4j/transport/TcpTransportMapping;Lorg/snmp4j/smi/Address;ILjava/io/IOException;)V

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lorg/snmp4j/transport/TransportStateEvent;->discardedMessages:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getCausingException()Ljava/io/IOException;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TransportStateEvent;->causingException:Ljava/io/IOException;

    return-object v0
.end method

.method public getDiscardedMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/transport/TransportStateEvent;->discardedMessages:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getNewState()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/transport/TransportStateEvent;->newState:I

    return v0
.end method

.method public getPeerAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/TransportStateEvent;->peerAddress:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/snmp4j/transport/TransportStateEvent;->cancelled:Z

    return v0
.end method

.method public setCancelled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/snmp4j/transport/TransportStateEvent;->cancelled:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lorg/snmp4j/transport/TransportStateEvent;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljava/util/EventObject;->source:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",peerAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/TransportStateEvent;->peerAddress:Lorg/snmp4j/smi/Address;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",newState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/transport/TransportStateEvent;->newState:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",cancelled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lorg/snmp4j/transport/TransportStateEvent;->cancelled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",causingException="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/snmp4j/transport/TransportStateEvent;->causingException:Ljava/io/IOException;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
