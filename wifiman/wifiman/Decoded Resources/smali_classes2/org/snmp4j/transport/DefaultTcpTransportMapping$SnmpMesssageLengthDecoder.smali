.class public Lorg/snmp4j/transport/DefaultTcpTransportMapping$SnmpMesssageLengthDecoder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/snmp4j/transport/MessageLengthDecoder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/snmp4j/transport/DefaultTcpTransportMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SnmpMesssageLengthDecoder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMessageLength(Ljava/nio/ByteBuffer;)Lorg/snmp4j/transport/MessageLength;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/asn1/BER$MutableByte;

    invoke-direct {v0}, Lorg/snmp4j/asn1/BER$MutableByte;-><init>()V

    new-instance v1, Lorg/snmp4j/asn1/BERInputStream;

    invoke-direct {v1, p1}, Lorg/snmp4j/asn1/BERInputStream;-><init>(Ljava/nio/ByteBuffer;)V

    const/4 p1, 0x0

    invoke-static {v1, v0, p1}, Lorg/snmp4j/asn1/BER;->decodeHeader(Lorg/snmp4j/asn1/BERInputStream;Lorg/snmp4j/asn1/BER$MutableByte;Z)I

    move-result p1

    invoke-virtual {v1}, Lorg/snmp4j/asn1/BERInputStream;->getPosition()J

    move-result-wide v0

    long-to-int v0, v0

    new-instance v1, Lorg/snmp4j/transport/MessageLength;

    invoke-direct {v1, v0, p1}, Lorg/snmp4j/transport/MessageLength;-><init>(II)V

    return-object v1
.end method

.method public getMinHeaderLength()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method
