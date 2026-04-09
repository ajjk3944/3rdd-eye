.class public interface abstract Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/mp/MPv3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "EngineIdCacheFactory"
.end annotation


# virtual methods
.method public abstract createEngineIdMap(Lorg/snmp4j/mp/EngineIdCacheSize;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/snmp4j/mp/EngineIdCacheSize;",
            ")",
            "Ljava/util/Map<",
            "Lorg/snmp4j/smi/Address;",
            "Lorg/snmp4j/smi/OctetString;",
            ">;"
        }
    .end annotation
.end method
