.class public interface abstract Lorg/snmp4j/TransportMapping;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lorg/snmp4j/smi/Address;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract addTransportListener(Lorg/snmp4j/transport/TransportListener;)V
.end method

.method public abstract close()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getListenAddress()Lorg/snmp4j/smi/Address;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation
.end method

.method public abstract getMaxInboundMessageSize()I
.end method

.method public abstract getSupportedAddressClass()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isListening()Z
.end method

.method public abstract listen()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract removeTransportListener(Lorg/snmp4j/transport/TransportListener;)V
.end method

.method public abstract sendMessage(Lorg/snmp4j/smi/Address;[BLorg/snmp4j/TransportStateReference;)V
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
.end method
