.class Lkj/a$b;
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
    name = "b"
.end annotation


# instance fields
.field a:Lnj/e;

.field b:J

.field c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

.field private d:Ljava/lang/String;

.field final synthetic e:Lkj/a;


# direct methods
.method constructor <init>(Lkj/a;Lnj/e;JLorg/eclipse/paho/client/mqttv3/MqttToken;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    iput-object p1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lkj/a$b;->a:Lnj/e;

    iput-wide p3, p0, Lkj/a$b;->b:J

    iput-object p5, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "MQTT Disc: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-virtual {v1}, Lkj/a;->B()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    move-result-object v1

    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkj/a$b;->d:Ljava/lang/String;

    iget-object v0, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->a(Lkj/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->a(Lkj/a;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public run()V
    .locals 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lkj/a$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object v0, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->b(Lkj/a;)Lorg/eclipse/paho/client/mqttv3/logging/a;

    move-result-object v0

    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->f(Lkj/a;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "disconnectBG:run"

    const-string v3, "221"

    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/a;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v0}, Lkj/a;->j(Lkj/a;)Lkj/b;

    move-result-object v0

    iget-wide v1, p0, Lkj/a$b;->b:J

    invoke-virtual {v0, v1, v2}, Lkj/b;->F(J)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    iget-object v2, p0, Lkj/a$b;->a:Lnj/e;

    iget-object v3, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {v1, v2, v3}, Lkj/a;->I(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v1

    invoke-virtual {v1}, Lkj/e;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v1, v1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v1}, Lkj/x;->E()V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v1, v1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v1, v0, v0}, Lkj/x;->q(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v1

    invoke-virtual {v1}, Lkj/e;->b()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    :goto_1
    iget-object v1, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v1, v1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v1}, Lkj/x;->r()V

    :cond_2
    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    iget-object v2, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {v1, v2, v0}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    goto :goto_3

    :goto_2
    iget-object v2, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v2, v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v2, v0, v0}, Lkj/x;->q(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object v2, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v2}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v2}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v2

    invoke-virtual {v2}, Lkj/e;->b()Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    iget-object v2, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v2, v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v2}, Lkj/x;->r()V

    :cond_4
    iget-object v2, p0, Lkj/a$b;->e:Lkj/a;

    iget-object v3, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    invoke-virtual {v2, v3, v0}, Lkj/a;->b0(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    throw v1

    :catch_0
    iget-object v1, p0, Lkj/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object v1, v1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lkj/x;

    invoke-virtual {v1, v0, v0}, Lkj/x;->q(Lnj/u;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lkj/a$b;->e:Lkj/a;

    invoke-static {v1}, Lkj/a;->c(Lkj/a;)Lkj/e;

    move-result-object v1

    invoke-virtual {v1}, Lkj/e;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :goto_3
    return-void
.end method
