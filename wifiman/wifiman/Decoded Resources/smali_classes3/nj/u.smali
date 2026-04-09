.class public abstract Lnj/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final e:Ljava/nio/charset/Charset;

.field private static final f:[Ljava/lang/String;


# instance fields
.field private a:B

.field protected b:I

.field protected c:Z

.field private d:Lorg/eclipse/paho/client/mqttv3/MqttToken;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    sput-object v0, Lnj/u;->e:Ljava/nio/charset/Charset;

    const-string/jumbo v14, "PINGRESP"

    const-string v15, "DISCONNECT"

    const-string/jumbo v1, "reserved"

    const-string v2, "CONNECT"

    const-string v3, "CONNACK"

    const-string/jumbo v4, "PUBLISH"

    const-string/jumbo v5, "PUBACK"

    const-string/jumbo v6, "PUBREC"

    const-string/jumbo v7, "PUBREL"

    const-string/jumbo v8, "PUBCOMP"

    const-string/jumbo v9, "SUBSCRIBE"

    const-string/jumbo v10, "SUBACK"

    const-string/jumbo v11, "UNSUBSCRIBE"

    const-string/jumbo v12, "UNSUBACK"

    const-string/jumbo v13, "PINGREQ"

    filled-new-array/range {v1 .. v15}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnj/u;->f:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnj/u;->c:Z

    iput-byte p1, p0, Lnj/u;->a:B

    iput v0, p0, Lnj/u;->b:I

    return-void
.end method

.method private static a(Ljava/io/InputStream;)Lnj/u;
    .locals 9

    :try_start_0
    new-instance v0, Lnj/a;

    invoke-direct {v0, p0}, Lnj/a;-><init>(Ljava/io/InputStream;)V

    new-instance p0, Ljava/io/DataInputStream;

    invoke-direct {p0, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v1

    shr-int/lit8 v2, v1, 0x4

    int-to-byte v2, v2

    and-int/lit8 v1, v1, 0xf

    int-to-byte v1, v1

    invoke-static {p0}, Lnj/u;->q(Ljava/io/DataInputStream;)Lnj/w;

    move-result-object v3

    invoke-virtual {v3}, Lnj/w;->a()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v0}, Lnj/a;->a()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v5, v3

    invoke-virtual {v0}, Lnj/a;->a()I

    move-result v0

    int-to-long v3, v0

    sub-long/2addr v5, v3

    const/4 v0, 0x0

    new-array v3, v0, [B

    const-wide/16 v7, 0x0

    cmp-long v4, v5, v7

    if-lez v4, :cond_0

    long-to-int v3, v5

    new-array v4, v3, [B

    invoke-virtual {p0, v4, v0, v3}, Ljava/io/DataInputStream;->readFully([BII)V

    move-object v3, v4

    goto :goto_0

    :catch_0
    move-exception p0

    goto/16 :goto_2

    :cond_0
    :goto_0
    const/4 p0, 0x1

    if-ne v2, p0, :cond_1

    new-instance p0, Lnj/d;

    invoke-direct {p0, v1, v3}, Lnj/d;-><init>(B[B)V

    goto/16 :goto_1

    :cond_1
    const/4 p0, 0x3

    if-ne v2, p0, :cond_2

    new-instance p0, Lnj/o;

    invoke-direct {p0, v1, v3}, Lnj/o;-><init>(B[B)V

    goto/16 :goto_1

    :cond_2
    const/4 p0, 0x4

    if-ne v2, p0, :cond_3

    new-instance p0, Lnj/k;

    invoke-direct {p0, v1, v3}, Lnj/k;-><init>(B[B)V

    goto/16 :goto_1

    :cond_3
    const/4 p0, 0x7

    if-ne v2, p0, :cond_4

    new-instance p0, Lnj/l;

    invoke-direct {p0, v1, v3}, Lnj/l;-><init>(B[B)V

    goto :goto_1

    :cond_4
    const/4 p0, 0x2

    if-ne v2, p0, :cond_5

    new-instance p0, Lnj/c;

    invoke-direct {p0, v1, v3}, Lnj/c;-><init>(B[B)V

    goto :goto_1

    :cond_5
    const/16 p0, 0xc

    if-ne v2, p0, :cond_6

    new-instance p0, Lnj/i;

    invoke-direct {p0, v1, v3}, Lnj/i;-><init>(B[B)V

    goto :goto_1

    :cond_6
    const/16 p0, 0xd

    if-ne v2, p0, :cond_7

    new-instance p0, Lnj/j;

    invoke-direct {p0, v1, v3}, Lnj/j;-><init>(B[B)V

    goto :goto_1

    :cond_7
    const/16 p0, 0x8

    if-ne v2, p0, :cond_8

    new-instance p0, Lnj/r;

    invoke-direct {p0, v1, v3}, Lnj/r;-><init>(B[B)V

    goto :goto_1

    :cond_8
    const/16 p0, 0x9

    if-ne v2, p0, :cond_9

    new-instance p0, Lnj/q;

    invoke-direct {p0, v1, v3}, Lnj/q;-><init>(B[B)V

    goto :goto_1

    :cond_9
    const/16 p0, 0xa

    if-ne v2, p0, :cond_a

    new-instance p0, Lnj/t;

    invoke-direct {p0, v1, v3}, Lnj/t;-><init>(B[B)V

    goto :goto_1

    :cond_a
    const/16 p0, 0xb

    if-ne v2, p0, :cond_b

    new-instance p0, Lnj/s;

    invoke-direct {p0, v1, v3}, Lnj/s;-><init>(B[B)V

    goto :goto_1

    :cond_b
    const/4 p0, 0x6

    if-ne v2, p0, :cond_c

    new-instance p0, Lnj/n;

    invoke-direct {p0, v1, v3}, Lnj/n;-><init>(B[B)V

    goto :goto_1

    :cond_c
    const/4 v0, 0x5

    if-ne v2, v0, :cond_d

    new-instance p0, Lnj/m;

    invoke-direct {p0, v1, v3}, Lnj/m;-><init>(B[B)V

    goto :goto_1

    :cond_d
    const/16 v0, 0xe

    if-ne v2, v0, :cond_e

    new-instance p0, Lnj/e;

    invoke-direct {p0, v1, v3}, Lnj/e;-><init>(B[B)V

    :goto_1
    return-object p0

    :cond_e
    invoke-static {p0}, Lkj/i;->a(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object p0

    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v0, p0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lnj/u;
    .locals 8

    invoke-interface {p0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getPayloadBytes()[B

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    :cond_0
    move-object v5, v0

    new-instance v0, Lnj/v;

    invoke-interface {p0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getHeaderBytes()[B

    move-result-object v2

    invoke-interface {p0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getHeaderOffset()I

    move-result v3

    invoke-interface {p0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getHeaderLength()I

    move-result v4

    invoke-interface {p0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getPayloadOffset()I

    move-result v6

    invoke-interface {p0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getPayloadLength()I

    move-result v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lnj/v;-><init>([BII[BII)V

    invoke-static {v0}, Lnj/u;->a(Ljava/io/InputStream;)Lnj/u;

    move-result-object p0

    return-object p0
.end method

.method public static c([B)Lnj/u;
    .locals 1

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v0}, Lnj/u;->a(Ljava/io/InputStream;)Lnj/u;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/io/DataInputStream;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Ljava/io/DataInputStream;->readFully([B)V

    new-instance p0, Ljava/lang/String;

    sget-object v1, Lnj/u;->e:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {p0}, Lnj/u;->u(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v0, p0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static e(J)[B
    .locals 6

    long-to-int v0, p0

    invoke-static {v0}, Lnj/u;->v(I)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    :cond_0
    const-wide/16 v2, 0x80

    rem-long v4, p0, v2

    long-to-int v4, v4

    int-to-byte v4, v4

    div-long/2addr p0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, p0, v2

    if-lez v2, :cond_1

    or-int/lit16 v3, v4, 0x80

    int-to-byte v4, v3

    :cond_1
    invoke-virtual {v0, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v1, v1, 0x1

    if-lez v2, :cond_2

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lnj/u;->u(Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lnj/u;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    array-length v0, p1

    ushr-int/lit8 v0, v0, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    array-length v1, p1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->write(I)V

    invoke-virtual {p0, v1}, Ljava/io/DataOutputStream;->write(I)V

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :goto_0
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {p1, p0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_1
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {p1, p0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static q(Ljava/io/DataInputStream;)Lnj/w;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    move v2, v0

    move v3, v1

    :cond_0
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result v4

    add-int/2addr v0, v1

    and-int/lit8 v5, v4, 0x7f

    mul-int/2addr v5, v3

    add-int/2addr v2, v5

    mul-int/lit16 v3, v3, 0x80

    and-int/lit16 v4, v4, 0x80

    if-nez v4, :cond_0

    if-ltz v2, :cond_1

    const p0, 0xfffffff

    if-gt v2, p0, :cond_1

    new-instance p0, Lnj/w;

    invoke-direct {p0, v2, v0}, Lnj/w;-><init>(II)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "This property must be a number between 0 and 268435455. Read value was: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static u(Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v1, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v3

    const v4, 0xfffe

    const/4 v5, 0x1

    if-eqz v3, :cond_5

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v1, v3, :cond_2

    :cond_1
    :goto_1
    move v3, v5

    goto :goto_2

    :cond_2
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_3
    and-int/lit16 v6, v2, 0x3ff

    shl-int/lit8 v6, v6, 0xa

    and-int/lit16 v3, v3, 0x3ff

    or-int/2addr v3, v6

    const v6, 0xffff

    and-int/2addr v3, v6

    if-eq v3, v6, :cond_1

    if-ne v3, v4, :cond_4

    goto :goto_1

    :cond_4
    move v3, v0

    goto :goto_2

    :cond_5
    invoke-static {v2}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_1

    :cond_6
    const v3, 0xfdd0

    if-lt v2, v3, :cond_4

    if-eq v2, v4, :cond_1

    if-ge v2, v3, :cond_1

    const v3, 0xfddf

    if-gt v2, v3, :cond_4

    goto :goto_1

    :goto_2
    if-nez v3, :cond_7

    add-int/2addr v1, v5

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "Invalid UTF-8 char: [%x]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static v(I)V
    .locals 1

    if-ltz p0, :cond_0

    const v0, 0xfffffff

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "This property must be a number between 0 and 268435455"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected f()[B
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iget v2, p0, Lnj/u;->b:I

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public h()[B
    .locals 7

    :try_start_0
    invoke-virtual {p0}, Lnj/u;->n()B

    move-result v0

    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0x4

    invoke-virtual {p0}, Lnj/u;->k()B

    move-result v1

    and-int/lit8 v1, v1, 0xf

    xor-int/2addr v0, v1

    invoke-virtual {p0}, Lnj/u;->o()[B

    move-result-object v1

    array-length v2, v1

    invoke-virtual {p0}, Lnj/u;->l()[B

    move-result-object v3

    array-length v3, v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v4, Ljava/io/DataOutputStream;

    invoke-direct {v4, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    int-to-long v5, v2

    invoke-static {v5, v6}, Lnj/u;->e(J)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public i()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lnj/u;->j()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lnj/u;->b:I

    return v0
.end method

.method protected abstract k()B
.end method

.method public l()[B
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public m()Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 1

    iget-object v0, p0, Lnj/u;->d:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    return-object v0
.end method

.method public n()B
    .locals 1

    iget-byte v0, p0, Lnj/u;->a:B

    return v0
.end method

.method protected abstract o()[B
.end method

.method public p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public r(Z)V
    .locals 0

    iput-boolean p1, p0, Lnj/u;->c:Z

    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Lnj/u;->b:I

    return-void
.end method

.method public t(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 0

    iput-object p1, p0, Lnj/u;->d:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lnj/u;->f:[Ljava/lang/String;

    iget-byte v1, p0, Lnj/u;->a:B

    aget-object v0, v0, v1

    return-object v0
.end method
