.class Lorg/snmp4j/mp/MPv3$LimitedCapacityEngineIdCacheFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/mp/MPv3$EngineIdCacheFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/mp/MPv3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LimitedCapacityEngineIdCacheFactory"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/snmp4j/mp/MPv3$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/snmp4j/mp/MPv3$LimitedCapacityEngineIdCacheFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public createEngineIdMap(Lorg/snmp4j/mp/EngineIdCacheSize;)Ljava/util/Map;
    .locals 0
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

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
