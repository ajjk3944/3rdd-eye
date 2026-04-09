.class public Lnj/g;
.super Ljava/io/OutputStream;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String; = "nj.g"


# instance fields
.field private a:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private b:Lkj/b;

.field private c:Ljava/io/BufferedOutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkj/b;Ljava/io/OutputStream;)V
    .locals 2

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-string/jumbo v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    sget-object v1, Lnj/g;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lnj/g;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iput-object p1, p0, Lnj/g;->b:Lkj/b;

    new-instance p1, Ljava/io/BufferedOutputStream;

    invoke-direct {p1, p2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p1, p0, Lnj/g;->c:Ljava/io/BufferedOutputStream;

    return-void
.end method


# virtual methods
.method public a(Lnj/u;)V
    .locals 5

    invoke-virtual {p1}, Lnj/u;->h()[B

    move-result-object v0

    invoke-virtual {p1}, Lnj/u;->l()[B

    move-result-object v1

    iget-object v2, p0, Lnj/g;->c:Ljava/io/BufferedOutputStream;

    array-length v3, v0

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v3}, Ljava/io/BufferedOutputStream;->write([BII)V

    iget-object v2, p0, Lnj/g;->b:Lkj/b;

    array-length v0, v0

    invoke-virtual {v2, v0}, Lkj/b;->D(I)V

    :goto_0
    array-length v0, v1

    if-lt v4, v0, :cond_0

    iget-object v0, p0, Lnj/g;->a:Lorg/eclipse/paho/client/mqttv3/logging/a;

    sget-object v1, Lnj/g;->d:Ljava/lang/String;

    const-string v2, "529"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v3, "write"

    invoke-interface {v0, v1, v3, v2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    array-length v0, v1

    sub-int/2addr v0, v4

    const/16 v2, 0x400

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v2, p0, Lnj/g;->c:Ljava/io/BufferedOutputStream;

    invoke-virtual {v2, v1, v4, v0}, Ljava/io/BufferedOutputStream;->write([BII)V

    add-int/lit16 v4, v4, 0x400

    iget-object v2, p0, Lnj/g;->b:Lkj/b;

    invoke-virtual {v2, v0}, Lkj/b;->D(I)V

    goto :goto_0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lnj/g;->c:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lnj/g;->c:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    return-void
.end method

.method public write(I)V
    .locals 1

    .line 5
    iget-object v0, p0, Lnj/g;->c:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/BufferedOutputStream;->write(I)V

    return-void
.end method

.method public write([B)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnj/g;->c:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 2
    iget-object v0, p0, Lnj/g;->b:Lkj/b;

    array-length p1, p1

    invoke-virtual {v0, p1}, Lkj/b;->D(I)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    .line 3
    iget-object v0, p0, Lnj/g;->c:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 4
    iget-object p1, p0, Lnj/g;->b:Lkj/b;

    invoke-virtual {p1, p3}, Lkj/b;->D(I)V

    return-void
.end method
