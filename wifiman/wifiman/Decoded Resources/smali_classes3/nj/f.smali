.class public Lnj/f;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private c:Lkj/b;

.field private d:Ljava/io/DataInputStream;

.field private e:Ljava/io/ByteArrayOutputStream;

.field private f:I

.field private g:I

.field private h:[B


# direct methods
.method public constructor <init>(Lkj/b;Ljava/io/InputStream;)V
    .locals 2

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-class v0, Lnj/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnj/f;->a:Ljava/lang/String;

    const-string/jumbo v1, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    invoke-static {v1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lnj/f;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iput-object p1, p0, Lnj/f;->c:Lkj/b;

    new-instance p1, Ljava/io/DataInputStream;

    invoke-direct {p1, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object p1, p0, Lnj/f;->d:Ljava/io/DataInputStream;

    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object p1, p0, Lnj/f;->e:Ljava/io/ByteArrayOutputStream;

    const/4 p1, -0x1

    iput p1, p0, Lnj/f;->f:I

    return-void
.end method

.method private a()V
    .locals 7

    iget-object v0, p0, Lnj/f;->e:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    iget v1, p0, Lnj/f;->g:I

    add-int/2addr v0, v1

    iget v2, p0, Lnj/f;->f:I

    sub-int/2addr v2, v1

    if-ltz v2, :cond_2

    const/4 v1, 0x0

    :goto_0
    if-lt v1, v2, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v3, p0, Lnj/f;->d:Ljava/io/DataInputStream;

    iget-object v4, p0, Lnj/f;->h:[B

    add-int v5, v0, v1

    sub-int v6, v2, v1

    invoke-virtual {v3, v4, v5, v6}, Ljava/io/DataInputStream;->read([BII)I

    move-result v3
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz v3, :cond_1

    iget-object v4, p0, Lnj/f;->c:Lkj/b;

    invoke-virtual {v4, v3}, Lkj/b;->z(I)V

    add-int/2addr v1, v3

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :catch_0
    move-exception v0

    iget v2, p0, Lnj/f;->g:I

    add-int/2addr v2, v1

    iput v2, p0, Lnj/f;->g:I

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method


# virtual methods
.method public available()I
    .locals 1

    iget-object v0, p0, Lnj/f;->d:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lnj/f;->d:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public g()Lnj/u;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget v1, p0, Lnj/f;->f:I

    const/4 v2, 0x0

    if-gez v1, :cond_1

    iget-object v1, p0, Lnj/f;->e:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    iget-object v1, p0, Lnj/f;->d:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readByte()B

    move-result v1

    iget-object v3, p0, Lnj/f;->c:Lkj/b;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lkj/b;->z(I)V

    ushr-int/lit8 v3, v1, 0x4

    and-int/lit8 v3, v3, 0xf

    int-to-byte v3, v3

    if-lt v3, v4, :cond_0

    const/16 v4, 0xe

    if-gt v3, v4, :cond_0

    iget-object v3, p0, Lnj/f;->d:Ljava/io/DataInputStream;

    invoke-static {v3}, Lnj/u;->q(Ljava/io/DataInputStream;)Lnj/w;

    move-result-object v3

    invoke-virtual {v3}, Lnj/w;->a()I

    move-result v3

    iput v3, p0, Lnj/f;->f:I

    iget-object v3, p0, Lnj/f;->e:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lnj/f;->e:Ljava/io/ByteArrayOutputStream;

    iget v3, p0, Lnj/f;->f:I

    int-to-long v3, v3

    invoke-static {v3, v4}, Lnj/u;->e(J)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lnj/f;->e:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    iget v3, p0, Lnj/f;->f:I

    add-int/2addr v1, v3

    new-array v1, v1, [B

    iput-object v1, p0, Lnj/f;->h:[B

    iput v2, p0, Lnj/f;->g:I

    goto :goto_0

    :cond_0
    const/16 v1, 0x7d6c

    invoke-static {v1}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v1

    throw v1

    :cond_1
    :goto_0
    iget v1, p0, Lnj/f;->f:I

    if-ltz v1, :cond_2

    invoke-direct {p0}, Lnj/f;->a()V

    const/4 v1, -0x1

    iput v1, p0, Lnj/f;->f:I

    iget-object v1, p0, Lnj/f;->e:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    iget-object v3, p0, Lnj/f;->h:[B

    array-length v4, v1

    invoke-static {v1, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lnj/f;->h:[B

    invoke-static {v1}, Lnj/u;->c([B)Lnj/u;

    move-result-object v0

    iget-object v1, p0, Lnj/f;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v2, p0, Lnj/f;->a:Ljava/lang/String;

    const-string/jumbo v3, "readMqttWireMessage"

    const-string v4, "301"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-object v0
.end method

.method public read()I
    .locals 1

    iget-object v0, p0, Lnj/f;->d:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0
.end method
