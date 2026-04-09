.class public Lkj/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lorg/eclipse/paho/client/mqttv3/logging/a;

.field private c:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

.field private d:Ljava/util/ArrayList;

.field private final e:Ljava/lang/Object;

.field private f:Lkj/m;

.field private g:Lkj/l;

.field private h:I


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lkj/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkj/h;->a:Ljava/lang/String;

    const-string/jumbo v1, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    invoke-static {v1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/b;->a(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iput-object v0, p0, Lkj/h;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkj/h;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lkj/h;->h:I

    iput-object p1, p0, Lkj/h;->c:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lkj/h;->d:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lkj/h;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/h;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(I)Lorg/eclipse/paho/client/mqttv3/BufferedMessage;
    .locals 2

    iget-object v0, p0, Lkj/h;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/h;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Lkj/h;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lkj/h;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lkj/h;->c:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;->isPersistBuffer()Z

    move-result v0

    return v0
.end method

.method public e(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lnj/u;->t(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {p1}, Lnj/u;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Lkj/x;->y(I)V

    :cond_0
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    invoke-direct {v0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;-><init>(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    iget-object p1, p0, Lkj/h;->e:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lkj/h;->d:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    iget-object v1, p0, Lkj/h;->c:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;->getBufferSize()I

    move-result v1

    if-ge p2, v1, :cond_1

    iget-object p2, p0, Lkj/h;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lkj/h;->c:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;->isDeleteOldestMessages()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lkj/h;->g:Lkj/l;

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    iget-object p2, p0, Lkj/h;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    iget-object v2, p0, Lkj/h;->g:Lkj/l;

    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lnj/u;

    move-result-object p2

    invoke-interface {v2, p2}, Lkj/l;->a(Lnj/u;)V

    :cond_2
    iget-object p2, p0, Lkj/h;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object p2, p0, Lkj/h;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    monitor-exit p1

    return-void

    :cond_3
    new-instance p2, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 v0, 0x7dcb

    invoke-direct {p2, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    throw p2

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public f(Lkj/l;)V
    .locals 0

    iput-object p1, p0, Lkj/h;->g:Lkj/l;

    return-void
.end method

.method public g(Lkj/m;)V
    .locals 0

    iput-object p1, p0, Lkj/h;->f:Lkj/m;

    return-void
.end method

.method public run()V
    .locals 5

    iget-object v0, p0, Lkj/h;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v1, p0, Lkj/h;->a:Ljava/lang/String;

    const-string v2, "516"

    const-string/jumbo v3, "run"

    invoke-interface {v0, v1, v3, v2}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :catch_0
    :goto_0
    invoke-virtual {p0}, Lkj/h;->c()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lkj/h;->b(I)Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    move-result-object v1

    iget-object v2, p0, Lkj/h;->f:Lkj/m;

    invoke-interface {v2, v1}, Lkj/m;->a(Lorg/eclipse/paho/client/mqttv3/BufferedMessage;)V

    invoke-virtual {p0, v0}, Lkj/h;->a(I)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getReasonCode()I

    move-result v1

    const/16 v2, 0x7dca

    if-ne v1, v2, :cond_1

    const-wide/16 v0, 0x64

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lkj/h;->b:Lorg/eclipse/paho/client/mqttv3/logging/a;

    iget-object v2, p0, Lkj/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getReasonCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getMessage()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "519"

    invoke-interface {v1, v2, v3, v4, v0}, Lorg/eclipse/paho/client/mqttv3/logging/a;->severe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
