.class public Lmj/e;
.super Lkj/v;
.source "SourceFile"


# static fields
.field private static final p:Ljava/lang/String; = "mj.e"


# instance fields
.field private h:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:I

.field private l:Ljava/util/Properties;

.field private m:Ljava/io/PipedInputStream;

.field private n:Lmj/g;

.field private o:Ljava/io/ByteArrayOutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljavax/net/SocketFactory;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Properties;)V
    .locals 1

    invoke-direct {p0, p1, p3, p4, p5}, Lkj/v;-><init>(Ljavax/net/SocketFactory;Ljava/lang/String;ILjava/lang/String;)V

    const-string/jumbo p1, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v0, Lmj/e;->p:Ljava/lang/String;

    invoke-static {p1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object p1

    iput-object p1, p0, Lmj/e;->h:Lorg/eclipse/paho/client/mqttv3/logging/a;

    new-instance p1, Lmj/b;

    invoke-direct {p1, p0}, Lmj/b;-><init>(Lmj/e;)V

    iput-object p1, p0, Lmj/e;->o:Ljava/io/ByteArrayOutputStream;

    iput-object p2, p0, Lmj/e;->i:Ljava/lang/String;

    iput-object p3, p0, Lmj/e;->j:Ljava/lang/String;

    iput p4, p0, Lmj/e;->k:I

    iput-object p6, p0, Lmj/e;->l:Ljava/util/Properties;

    new-instance p1, Ljava/io/PipedInputStream;

    invoke-direct {p1}, Ljava/io/PipedInputStream;-><init>()V

    iput-object p1, p0, Lmj/e;->m:Ljava/io/PipedInputStream;

    iget-object p1, p0, Lmj/e;->h:Lorg/eclipse/paho/client/mqttv3/logging/a;

    invoke-interface {p1, p5}, Lorg/eclipse/paho/client/mqttv3/logging/a;->setResourceName(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/OutputStream;
    .locals 1

    iget-object v0, p0, Lmj/e;->o:Ljava/io/ByteArrayOutputStream;

    return-object v0
.end method

.method public b()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lmj/e;->m:Ljava/io/PipedInputStream;

    return-object v0
.end method

.method d()Ljava/io/InputStream;
    .locals 1

    invoke-super {p0}, Lkj/v;->b()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method e()Ljava/io/OutputStream;
    .locals 1

    invoke-super {p0}, Lkj/v;->a()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public getServerURI()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "ws://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lmj/e;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lmj/e;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public start()V
    .locals 8

    invoke-super {p0}, Lkj/v;->start()V

    new-instance v7, Lmj/d;

    invoke-virtual {p0}, Lmj/e;->d()Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {p0}, Lmj/e;->e()Ljava/io/OutputStream;

    move-result-object v2

    iget-object v3, p0, Lmj/e;->i:Ljava/lang/String;

    iget-object v4, p0, Lmj/e;->j:Ljava/lang/String;

    iget v5, p0, Lmj/e;->k:I

    iget-object v6, p0, Lmj/e;->l:Ljava/util/Properties;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lmj/d;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;ILjava/util/Properties;)V

    invoke-virtual {v7}, Lmj/d;->a()V

    new-instance v0, Lmj/g;

    invoke-virtual {p0}, Lmj/e;->d()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, p0, Lmj/e;->m:Ljava/io/PipedInputStream;

    invoke-direct {v0, v1, v2}, Lmj/g;-><init>(Ljava/io/InputStream;Ljava/io/PipedInputStream;)V

    iput-object v0, p0, Lmj/e;->n:Lmj/g;

    const-string/jumbo v1, "webSocketReceiver"

    invoke-virtual {v0, v1}, Lmj/g;->b(Ljava/lang/String;)V

    return-void
.end method

.method public stop()V
    .locals 4

    new-instance v0, Lmj/c;

    const-string v1, "1000"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const/16 v2, 0x8

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lmj/c;-><init>(BZ[B)V

    invoke-virtual {v0}, Lmj/c;->d()[B

    move-result-object v0

    invoke-virtual {p0}, Lmj/e;->e()Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p0}, Lmj/e;->e()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    iget-object v0, p0, Lmj/e;->n:Lmj/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmj/g;->c()V

    :cond_0
    invoke-super {p0}, Lkj/v;->stop()V

    return-void
.end method
