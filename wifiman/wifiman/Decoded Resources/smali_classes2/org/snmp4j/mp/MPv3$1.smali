.class Lorg/snmp4j/mp/MPv3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/util/PDUFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/mp/MPv3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/snmp4j/mp/MPv3;


# direct methods
.method constructor <init>(Lorg/snmp4j/mp/MPv3;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/mp/MPv3$1;->this$0:Lorg/snmp4j/mp/MPv3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createPDU(Lorg/snmp4j/Target;)Lorg/snmp4j/PDU;
    .locals 0

    .line 1
    new-instance p1, Lorg/snmp4j/ScopedPDU;

    invoke-direct {p1}, Lorg/snmp4j/ScopedPDU;-><init>()V

    return-object p1
.end method

.method public createPDU(Lorg/snmp4j/mp/MessageProcessingModel;)Lorg/snmp4j/PDU;
    .locals 0

    .line 2
    new-instance p1, Lorg/snmp4j/ScopedPDU;

    invoke-direct {p1}, Lorg/snmp4j/ScopedPDU;-><init>()V

    return-object p1
.end method
