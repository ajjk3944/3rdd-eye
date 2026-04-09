.class public interface abstract Lorg/snmp4j/transport/ssh/SshTransportAdapter;
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
.method public abstract closeSession(Ljava/lang/Long;)Z
.end method

.method public abstract openClientSession(Lorg/snmp4j/TransportStateReference;I)Lorg/snmp4j/transport/ssh/SshSession;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/TransportStateReference;",
            "I)",
            "Lorg/snmp4j/transport/ssh/SshSession<",
            "TI;>;"
        }
    .end annotation
.end method

.method public abstract openServerSession(Lorg/snmp4j/TransportStateReference;I)Lorg/snmp4j/transport/ssh/SshSession;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/TransportStateReference;",
            "I)",
            "Lorg/snmp4j/transport/ssh/SshSession<",
            "TI;>;"
        }
    .end annotation
.end method
