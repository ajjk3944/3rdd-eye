.class public Lorg/snmp4j/asn1/BEROutputStream;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field private buffer:Ljava/nio/ByteBuffer;

.field private offset:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->offset:I

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->offset:I

    .line 6
    iput-object p1, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    .line 7
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    iput p1, p0, Lorg/snmp4j/asn1/BEROutputStream;->offset:I

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public flush()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public getBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public rewind()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    iget v1, p0, Lorg/snmp4j/asn1/BEROutputStream;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    iput p1, p0, Lorg/snmp4j/asn1/BEROutputStream;->offset:I

    return-void
.end method

.method public setFilledBuffer(Ljava/nio/ByteBuffer;)V
    .locals 1

    iput-object p1, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    iput v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->offset:I

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public write(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public write([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public write([BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lorg/snmp4j/asn1/BEROutputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    return-void
.end method
