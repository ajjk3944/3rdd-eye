.class public interface abstract Lorg/snmp4j/Target;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# virtual methods
.method public abstract clone()Ljava/lang/Object;
.end method

.method public abstract duplicate()Lorg/snmp4j/Target;
.end method

.method public abstract getAddress()Lorg/snmp4j/smi/Address;
.end method

.method public abstract getMaxSizeRequestPDU()I
.end method

.method public abstract getPreferredTransports()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/snmp4j/TransportMapping<",
            "+",
            "Lorg/snmp4j/smi/Address;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getRetries()I
.end method

.method public abstract getSecurityLevel()I
.end method

.method public abstract getSecurityModel()I
.end method

.method public abstract getSecurityName()Lorg/snmp4j/smi/OctetString;
.end method

.method public abstract getTimeout()J
.end method

.method public abstract getVersion()I
.end method

.method public abstract setAddress(Lorg/snmp4j/smi/Address;)V
.end method

.method public abstract setMaxSizeRequestPDU(I)V
.end method

.method public abstract setRetries(I)V
.end method

.method public abstract setSecurityLevel(I)V
.end method

.method public abstract setSecurityModel(I)V
.end method

.method public abstract setSecurityName(Lorg/snmp4j/smi/OctetString;)V
.end method

.method public abstract setTimeout(J)V
.end method

.method public abstract setVersion(I)V
.end method
