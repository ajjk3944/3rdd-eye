.class Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->L(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;


# direct methods
.method constructor <init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)V
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w()Lcom/amazonaws/logging/Log;

    move-result-object v0

    const-string v1, "onFailure: connection failed."

    invoke-interface {v0, v1, p2}, Lcom/amazonaws/logging/Log;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->m(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->n(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Reconnecting:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getSessionPresent()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {v0, p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    iget-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->o(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getSessionPresent()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {v0, p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    :goto_0
    iget-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getSessionPresent()Z

    move-result p1

    invoke-static {p2, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z

    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 2

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w()Lcom/amazonaws/logging/Log;

    move-result-object v0

    const-string v1, "onSuccess: mqtt connection is successful."

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Connected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->j(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Ljava/lang/Long;)Ljava/lang/Long;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getSessionPresent()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->l(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->O()V

    :cond_0
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$2;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d0()V

    return-void
.end method
