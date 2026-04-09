.class Lkj/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Lkj/a;

.field b:Lorg/eclipse/paho/client/mqttv3/MqttToken;

.field c:Lnj/d;

.field private d:Ljava/lang/String;

.field final synthetic e:Lkj/a;


# direct methods
.method constructor <init>(Lkj/a;Lkj/a;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/d;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    iput-object p1, p0, Lkj/a$a;->e:Lkj/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lkj/a$a;->a:Lkj/a;

    iput-object p3, p0, Lkj/a$a;->b:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iput-object p4, p0, Lkj/a$a;->c:Lnj/d;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string/jumbo p3, "MQTT Con: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object p1

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lkj/a$a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->a(Lkj/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->a(Lkj/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public run()V
    .locals 8

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lkj/a$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->b(Lkj/a;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iget-object v1, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->f(Lkj/a;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "connectBG:run"

    const-string v3, "220"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->g(Lkj/a;)Lkj/f;

    move-result-object v0

    invoke-virtual {v0}, Lkj/f;->c()[Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-lt v2, v1, :cond_0

    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->g(Lkj/a;)Lkj/f;

    move-result-object v0

    iget-object v1, p0, Lkj/a$a;->b:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v2, p0, Lkj/a$a;->c:Lnj/d;

    invoke-virtual {v0, v1, v2}, Lkj/f;->m(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lnj/u;)V

    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->h(Lkj/a;)[Lkj/p;

    move-result-object v0

    iget-object v1, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->i(Lkj/a;)I

    move-result v1

    aget-object v0, v0, v1

    invoke-interface {v0}, Lkj/p;->start()V

    iget-object v1, p0, Lkj/a$a;->e:Lkj/a;

    new-instance v2, Lkj/d;

    iget-object v4, p0, Lkj/a$a;->a:Lkj/a;

    iget-object v5, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v5}, Lkj/a;->j(Lkj/a;)Lkj/b;

    move-result-object v5

    iget-object v6, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v6}, Lkj/a;->g(Lkj/a;)Lkj/f;

    move-result-object v6

    invoke-interface {v0}, Lkj/p;->b()Ljava/io/InputStream;

    move-result-object v7

    invoke-direct {v2, v4, v5, v6, v7}, Lkj/d;-><init>(Lkj/a;Lkj/b;Lkj/f;Ljava/io/InputStream;)V

    invoke-static {v1, v2}, Lkj/a;->k(Lkj/a;Lkj/d;)V

    iget-object v1, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->l(Lkj/a;)Lkj/d;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "MQTT Rec: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lkj/a$a;->e:Lkj/a;

    invoke-virtual {v4}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v4

    invoke-interface {v4}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v4}, Lkj/a;->a(Lkj/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lkj/d;->b(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V

    iget-object v1, p0, Lkj/a$a;->e:Lkj/a;

    new-instance v2, Lkj/e;

    iget-object v4, p0, Lkj/a$a;->a:Lkj/a;

    iget-object v5, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v5}, Lkj/a;->j(Lkj/a;)Lkj/b;

    move-result-object v5

    iget-object v6, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v6}, Lkj/a;->g(Lkj/a;)Lkj/f;

    move-result-object v6

    invoke-interface {v0}, Lkj/p;->a()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v2, v4, v5, v6, v0}, Lkj/e;-><init>(Lkj/a;Lkj/b;Lkj/f;Ljava/io/OutputStream;)V

    invoke-static {v1, v2}, Lkj/a;->m(Lkj/a;Lkj/e;)V

    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "MQTT Snd: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkj/a$a;->e:Lkj/a;

    invoke-virtual {v2}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v2

    invoke-interface {v2}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v2}, Lkj/a;->a(Lkj/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkj/e;->c(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V

    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->d(Lkj/a;)Lkj/c;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "MQTT Call: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkj/a$a;->e:Lkj/a;

    invoke-virtual {v2}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v2

    invoke-interface {v2}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v2}, Lkj/a;->a(Lkj/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkj/c;->u(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V

    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    iget-object v1, p0, Lkj/a$a;->c:Lnj/d;

    iget-object v2, p0, Lkj/a$a;->b:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {v0, v1, v2}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_0
    aget-object v4, v0, v2

    iget-object v4, v4, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v4, v3}, Lkj/x;->v(Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :goto_1
    iget-object v1, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->b(Lkj/a;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v1

    iget-object v2, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v2}, Lkj/a;->f(Lkj/a;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "209"

    const/4 v5, 0x0

    const-string/jumbo v3, "connectBG:run"

    move-object v6, v0

    invoke-interface/range {v1 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lkj/i;->b(Ljava/lang/Throwable;)Lorg/eclipse/paho/client/mqttv3/MqttException;

    move-result-object v3

    goto :goto_3

    :goto_2
    iget-object v1, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->b(Lkj/a;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v1

    iget-object v2, p0, Lkj/a$a;->e:Lkj/a;

    invoke-static {v2}, Lkj/a;->f(Lkj/a;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "212"

    const/4 v5, 0x0

    const-string/jumbo v3, "connectBG:run"

    move-object v6, v0

    invoke-interface/range {v1 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    move-object v3, v0

    :goto_3
    if-eqz v3, :cond_1

    iget-object v0, p0, Lkj/a$a;->e:Lkj/a;

    iget-object v1, p0, Lkj/a$a;->b:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {v0, v1, v3}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    :cond_1
    return-void
.end method
