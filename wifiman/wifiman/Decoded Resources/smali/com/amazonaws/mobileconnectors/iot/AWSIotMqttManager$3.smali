.class Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->R()V
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

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w()Lcom/amazonaws/logging/Log;

    move-result-object v0

    const-string v1, "Reconnect failed "

    invoke-interface {v0, v1, p2}, Lcom/amazonaws/logging/Log;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getSessionPresent()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {p1, p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->r(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 2

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w()Lcom/amazonaws/logging/Log;

    move-result-object v0

    const-string v1, "Reconnect successful"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Connected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getSessionPresent()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->j(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->i(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Ljava/lang/Long;)Ljava/lang/Long;

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->q(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->V()V

    :cond_0
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->l(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->O()V

    :cond_1
    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$3;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d0()V

    return-void
.end method
