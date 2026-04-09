.class Lorg/snmp4j/transport/DummyTransport$MessageContainer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DummyTransport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MessageContainer"
.end annotation


# instance fields
.field private payload:Lorg/snmp4j/smi/OctetString;

.field private sourceAddress:Lorg/snmp4j/smi/Address;

.field final synthetic this$0:Lorg/snmp4j/transport/DummyTransport;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/DummyTransport;Lorg/snmp4j/smi/Address;Lorg/snmp4j/smi/OctetString;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/transport/DummyTransport$MessageContainer;->this$0:Lorg/snmp4j/transport/DummyTransport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lorg/snmp4j/transport/DummyTransport$MessageContainer;->payload:Lorg/snmp4j/smi/OctetString;

    iput-object p2, p0, Lorg/snmp4j/transport/DummyTransport$MessageContainer;->sourceAddress:Lorg/snmp4j/smi/Address;

    return-void
.end method


# virtual methods
.method public getPayload()Lorg/snmp4j/smi/OctetString;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport$MessageContainer;->payload:Lorg/snmp4j/smi/OctetString;

    return-object v0
.end method

.method public getSourceAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/transport/DummyTransport$MessageContainer;->sourceAddress:Lorg/snmp4j/smi/Address;

    return-object v0
.end method
