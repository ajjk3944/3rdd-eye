.class public Lorg/snmp4j/event/AuthenticationFailureEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x77ad047c28fcabedL


# instance fields
.field private address:Lorg/snmp4j/smi/Address;

.field private error:I

.field private message:Lorg/snmp4j/asn1/BERInputStream;

.field private transient transport:Lorg/snmp4j/TransportMapping;


# direct methods
.method public constructor <init>(Lorg/snmp4j/transport/TransportListener;Lorg/snmp4j/smi/Address;Lorg/snmp4j/TransportMapping;ILorg/snmp4j/asn1/BERInputStream;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lorg/snmp4j/event/AuthenticationFailureEvent;->address:Lorg/snmp4j/smi/Address;

    iput-object p3, p0, Lorg/snmp4j/event/AuthenticationFailureEvent;->transport:Lorg/snmp4j/TransportMapping;

    iput p4, p0, Lorg/snmp4j/event/AuthenticationFailureEvent;->error:I

    iput-object p5, p0, Lorg/snmp4j/event/AuthenticationFailureEvent;->message:Lorg/snmp4j/asn1/BERInputStream;

    return-void
.end method


# virtual methods
.method public getAddress()Lorg/snmp4j/smi/Address;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/AuthenticationFailureEvent;->address:Lorg/snmp4j/smi/Address;

    return-object v0
.end method

.method public getError()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/event/AuthenticationFailureEvent;->error:I

    return v0
.end method

.method public getMessage()Lorg/snmp4j/asn1/BERInputStream;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/AuthenticationFailureEvent;->message:Lorg/snmp4j/asn1/BERInputStream;

    return-object v0
.end method

.method public getTransport()Lorg/snmp4j/TransportMapping;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/event/AuthenticationFailureEvent;->transport:Lorg/snmp4j/TransportMapping;

    return-object v0
.end method
