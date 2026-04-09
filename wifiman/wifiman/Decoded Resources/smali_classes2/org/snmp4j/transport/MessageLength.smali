.class public Lorg/snmp4j/transport/MessageLength;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x25c71f28af3a9976L


# instance fields
.field private headerLength:I

.field private payloadLength:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lorg/snmp4j/transport/MessageLength;->payloadLength:I

    iput p1, p0, Lorg/snmp4j/transport/MessageLength;->headerLength:I

    return-void
.end method


# virtual methods
.method public getHeaderLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/transport/MessageLength;->headerLength:I

    return v0
.end method

.method public getMessageLength()I
    .locals 2

    iget v0, p0, Lorg/snmp4j/transport/MessageLength;->headerLength:I

    iget v1, p0, Lorg/snmp4j/transport/MessageLength;->payloadLength:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getPayloadLength()I
    .locals 1

    iget v0, p0, Lorg/snmp4j/transport/MessageLength;->payloadLength:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lorg/snmp4j/transport/MessageLength;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[headerLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/transport/MessageLength;->headerLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",payloadLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/snmp4j/transport/MessageLength;->payloadLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
