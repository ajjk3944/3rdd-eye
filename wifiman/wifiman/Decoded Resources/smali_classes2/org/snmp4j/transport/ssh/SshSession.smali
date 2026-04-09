.class public interface abstract Lorg/snmp4j/transport/ssh/SshSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract addTransportListener(Lorg/snmp4j/transport/TransportListener;)V
.end method

.method public abstract getID()Ljava/lang/Long;
.end method

.method public abstract getImplementation()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TI;"
        }
    .end annotation
.end method

.method public abstract getTransportStateReference()Lorg/snmp4j/TransportStateReference;
.end method

.method public abstract removeTransportListener(Lorg/snmp4j/transport/TransportListener;)V
.end method

.method public abstract setTransportStateReference(Lorg/snmp4j/TransportStateReference;)V
.end method
