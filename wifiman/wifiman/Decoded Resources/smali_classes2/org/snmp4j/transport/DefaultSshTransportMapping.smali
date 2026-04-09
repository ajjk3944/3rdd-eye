.class public Lorg/snmp4j/transport/DefaultSshTransportMapping;
.super Lorg/snmp4j/transport/AbstractTransportMapping;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/snmp4j/transport/AbstractTransportMapping<",
        "Lorg/snmp4j/smi/SshAddress;",
        ">;"
    }
.end annotation


# static fields
.field private static final logger:Lorg/snmp4j/log/LogAdapter;


# instance fields
.field private counterSupport:Lorg/snmp4j/mp/CounterSupport;

.field private final sessions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;",
            "Lorg/snmp4j/transport/ssh/SshSession;",
            ">;"
        }
    .end annotation
.end field

.field private transportAdapter:Lorg/snmp4j/transport/ssh/SshTransportAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/snmp4j/transport/DefaultSshTransportMapping;

    invoke-static {v0}, Lorg/snmp4j/log/LogFactory;->getLogger(Ljava/lang/Class;)Lorg/snmp4j/log/LogAdapter;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/transport/DefaultSshTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    return-void
.end method

.method public constructor <init>(Lorg/snmp4j/transport/ssh/SshTransportAdapter;)V
    .locals 1

    invoke-direct {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping;->sessions:Ljava/util/Map;

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping;->transportAdapter:Lorg/snmp4j/transport/ssh/SshTransportAdapter;

    invoke-static {}, Lorg/snmp4j/mp/CounterSupport;->getInstance()Lorg/snmp4j/mp/CounterSupport;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method protected fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping;->counterSupport:Lorg/snmp4j/mp/CounterSupport;

    invoke-virtual {v0, p1}, Lorg/snmp4j/mp/CounterSupport;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    return-void
.end method

.method public bridge synthetic getListenAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lorg/snmp4j/transport/DefaultSshTransportMapping;->getListenAddress()Lorg/snmp4j/smi/SshAddress;

    move-result-object v0

    return-object v0
.end method

.method public getListenAddress()Lorg/snmp4j/smi/SshAddress;
    .locals 1

    .line 1
    const/4 v0, 0x0

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

    const-class v0, Lorg/snmp4j/smi/SshAddress;

    return-object v0
.end method

.method public isListening()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public listen()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method protected openSession(Lorg/snmp4j/smi/SshAddress;Lorg/snmp4j/TransportStateReference;I)Lorg/snmp4j/transport/ssh/SshSession;
    .locals 1

    new-instance p1, Lorg/snmp4j/event/CounterEvent;

    sget-object v0, Lorg/snmp4j/mp/SnmpConstants;->snmpSshtmSessionOpens:Lorg/snmp4j/smi/OID;

    invoke-direct {p1, p0, v0}, Lorg/snmp4j/event/CounterEvent;-><init>(Ljava/lang/Object;Lorg/snmp4j/smi/OID;)V

    invoke-virtual {p0, p1}, Lorg/snmp4j/transport/DefaultSshTransportMapping;->fireIncrementCounter(Lorg/snmp4j/event/CounterEvent;)V

    iget-object p1, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping;->transportAdapter:Lorg/snmp4j/transport/ssh/SshTransportAdapter;

    invoke-interface {p1, p2, p3}, Lorg/snmp4j/transport/ssh/SshTransportAdapter;->openClientSession(Lorg/snmp4j/TransportStateReference;I)Lorg/snmp4j/transport/ssh/SshSession;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/snmp4j/smi/SshAddress;

    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/DefaultSshTransportMapping;->sendMessage(Lorg/snmp4j/smi/SshAddress;[BLorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public sendMessage(Lorg/snmp4j/smi/SshAddress;[BLorg/snmp4j/TransportStateReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    new-instance p2, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;

    invoke-virtual {p3}, Lorg/snmp4j/TransportStateReference;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object v0

    invoke-direct {p2, p0, v0, p1}, Lorg/snmp4j/transport/DefaultSshTransportMapping$SessionID;-><init>(Lorg/snmp4j/transport/DefaultSshTransportMapping;Lorg/snmp4j/smi/OctetString;Lorg/snmp4j/smi/SshAddress;)V

    .line 3
    iget-object v0, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping;->sessions:Ljava/util/Map;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/snmp4j/transport/DefaultSshTransportMapping;->sessions:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/snmp4j/transport/ssh/SshSession;

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    .line 6
    invoke-virtual {p3}, Lorg/snmp4j/TransportStateReference;->isSameSecurity()Z

    move-result p2

    if-nez p2, :cond_0

    .line 7
    iget p2, p0, Lorg/snmp4j/transport/AbstractTransportMapping;->maxInboundMessageSize:I

    invoke-virtual {p0, p1, p3, p2}, Lorg/snmp4j/transport/DefaultSshTransportMapping;->openSession(Lorg/snmp4j/smi/SshAddress;Lorg/snmp4j/TransportStateReference;I)Lorg/snmp4j/transport/ssh/SshSession;

    goto :goto_0

    .line 8
    :cond_0
    sget-object p2, Lorg/snmp4j/transport/DefaultSshTransportMapping;->logger:Lorg/snmp4j/log/LogAdapter;

    const-string v0, "Cannot (re)open session because tmStateReference requires \'sameSecurity\'"

    invoke-interface {p2, v0}, Lorg/snmp4j/log/LogAdapter;->warn(Ljava/io/Serializable;)V

    .line 9
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Session \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' for \'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lorg/snmp4j/TransportStateReference;->getSecurityName()Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' closed/unavailable"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
