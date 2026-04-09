.class public abstract Lorg/snmp4j/transport/UdpTransportMapping;
.super Lorg/snmp4j/transport/AbstractTransportMapping;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/snmp4j/transport/AbstractTransportMapping<",
        "Lorg/snmp4j/smi/UdpAddress;",
        ">;"
    }
.end annotation


# instance fields
.field protected udpAddress:Lorg/snmp4j/smi/UdpAddress;


# direct methods
.method public constructor <init>(Lorg/snmp4j/smi/UdpAddress;)V
    .locals 0

    invoke-direct {p0}, Lorg/snmp4j/transport/AbstractTransportMapping;-><init>()V

    iput-object p1, p0, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    return-void
.end method


# virtual methods
.method public abstract close()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public getAddress()Lorg/snmp4j/smi/UdpAddress;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

    return-object v0
.end method

.method public bridge synthetic getListenAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/snmp4j/transport/UdpTransportMapping;->getListenAddress()Lorg/snmp4j/smi/UdpAddress;

    move-result-object v0

    return-object v0
.end method

.method public getListenAddress()Lorg/snmp4j/smi/UdpAddress;
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/snmp4j/transport/UdpTransportMapping;->udpAddress:Lorg/snmp4j/smi/UdpAddress;

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

    const-class v0, Lorg/snmp4j/smi/UdpAddress;

    return-object v0
.end method

.method public abstract listen()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public bridge synthetic sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lorg/snmp4j/smi/UdpAddress;

    invoke-virtual {p0, p1, p2, p3}, Lorg/snmp4j/transport/UdpTransportMapping;->sendMessage(Lorg/snmp4j/smi/UdpAddress;[BLorg/snmp4j/TransportStateReference;)V

    return-void
.end method

.method public abstract sendMessage(Lorg/snmp4j/smi/UdpAddress;[BLorg/snmp4j/TransportStateReference;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
