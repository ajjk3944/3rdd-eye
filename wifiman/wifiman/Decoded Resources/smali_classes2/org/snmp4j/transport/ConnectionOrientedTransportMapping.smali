.class public interface abstract Lorg/snmp4j/transport/ConnectionOrientedTransportMapping;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/TransportMapping;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lorg/snmp4j/smi/Address;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/snmp4j/TransportMapping<",
        "TA;>;"
    }
.end annotation


# virtual methods
.method public abstract addTransportStateListener(Lorg/snmp4j/transport/TransportStateListener;)V
.end method

.method public abstract close(Lorg/snmp4j/smi/Address;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getMessageLengthDecoder()Lorg/snmp4j/transport/MessageLengthDecoder;
.end method

.method public abstract removeTransportStateListener(Lorg/snmp4j/transport/TransportStateListener;)V
.end method

.method public abstract resumeAddress(Lorg/snmp4j/smi/Address;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)Z"
        }
    .end annotation
.end method

.method public abstract setConnectionTimeout(J)V
.end method

.method public abstract setMessageLengthDecoder(Lorg/snmp4j/transport/MessageLengthDecoder;)V
.end method

.method public abstract suspendAddress(Lorg/snmp4j/smi/Address;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)V"
        }
    .end annotation
.end method
