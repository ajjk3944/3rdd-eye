.class public Lnj/d;
.super Lnj/u;
.source "SourceFile"


# instance fields
.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

.field private j:Ljava/lang/String;

.field private k:[C

.field private l:I

.field private m:Ljava/lang/String;

.field private n:I


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Lnj/u;-><init>(B)V

    .line 2
    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 3
    new-instance p2, Ljava/io/DataInputStream;

    invoke-direct {p2, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 4
    invoke-static {p2}, Lnj/u;->d(Ljava/io/DataInputStream;)Ljava/lang/String;

    .line 5
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readByte()B

    .line 6
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readByte()B

    .line 7
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result p1

    iput p1, p0, Lnj/d;->l:I

    .line 8
    invoke-static {p2}, Lnj/u;->d(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnj/d;->g:Ljava/lang/String;

    .line 9
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZILjava/lang/String;[CLorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, v0}, Lnj/u;-><init>(B)V

    .line 11
    iput-object p1, p0, Lnj/d;->g:Ljava/lang/String;

    .line 12
    iput-boolean p3, p0, Lnj/d;->h:Z

    .line 13
    iput p4, p0, Lnj/d;->l:I

    .line 14
    iput-object p5, p0, Lnj/d;->j:Ljava/lang/String;

    if-eqz p6, :cond_0

    .line 15
    invoke-virtual {p6}, [C->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [C

    iput-object p1, p0, Lnj/d;->k:[C

    .line 16
    :cond_0
    iput-object p7, p0, Lnj/d;->i:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 17
    iput-object p8, p0, Lnj/d;->m:Ljava/lang/String;

    .line 18
    iput p2, p0, Lnj/d;->n:I

    return-void
.end method


# virtual methods
.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "Con"

    return-object v0
.end method

.method protected k()B
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l()[B
    .locals 4

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iget-object v2, p0, Lnj/d;->g:Ljava/lang/String;

    invoke-static {v1, v2}, Lnj/u;->g(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    iget-object v2, p0, Lnj/d;->i:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lnj/d;->m:Ljava/lang/String;

    invoke-static {v1, v2}, Lnj/u;->g(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    iget-object v2, p0, Lnj/d;->i:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getPayload()[B

    move-result-object v2

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    iget-object v2, p0, Lnj/d;->i:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getPayload()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Lnj/d;->j:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-static {v1, v2}, Lnj/u;->g(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    iget-object v2, p0, Lnj/d;->k:[C

    if-eqz v2, :cond_1

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([C)V

    invoke-static {v1, v3}, Lnj/u;->g(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_1
    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected o()[B
    .locals 5

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iget v2, p0, Lnj/d;->n:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const-string/jumbo v2, "MQIsdp"

    invoke-static {v1, v2}, Lnj/u;->g(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    const/4 v4, 0x4

    if-ne v2, v4, :cond_1

    const-string/jumbo v2, "MQTT"

    invoke-static {v1, v2}, Lnj/u;->g(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget v2, p0, Lnj/d;->n:I

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->write(I)V

    iget-boolean v2, p0, Lnj/d;->h:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x2

    int-to-byte v2, v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    iget-object v4, p0, Lnj/d;->i:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x4

    int-to-byte v2, v2

    invoke-virtual {v4}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    move-result v4

    shl-int/lit8 v3, v4, 0x3

    or-int/2addr v2, v3

    int-to-byte v2, v2

    iget-object v3, p0, Lnj/d;->i:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    invoke-virtual {v3}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->isRetained()Z

    move-result v3

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x20

    int-to-byte v2, v2

    :cond_3
    iget-object v3, p0, Lnj/d;->j:Ljava/lang/String;

    if-eqz v3, :cond_4

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    iget-object v3, p0, Lnj/d;->k:[C

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x40

    int-to-byte v2, v2

    :cond_4
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->write(I)V

    iget v2, p0, Lnj/d;->l:I

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_2
    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-super {p0}, Lnj/u;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, " clientId "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnj/d;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " keepAliveInterval "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lnj/d;->l:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
