.class Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a0()V
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

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public connectionLost(Ljava/lang/Throwable;)V
    .locals 4

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w()Lcom/amazonaws/logging/Log;

    move-result-object v0

    const-string v1, "connection is Lost"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->e(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->m(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->n(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->h(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->s(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->y()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->j(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->U()V

    :cond_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->r(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    sget-object v1, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {v0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public deliveryComplete(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)V
    .locals 4

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w()Lcom/amazonaws/logging/Log;

    move-result-object v0

    const-string v1, "delivery is complete"

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getUserContext()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->a()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;

    move-result-object v1

    sget-object v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;->Success:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;

    invoke-virtual {p1}, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->b()Ljava/lang/Object;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->M(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback$MessageDeliveryStatus;Ljava/lang/Object;Ljava/lang/RuntimeException;)V

    :cond_0
    return-void
.end method

.method public messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    .locals 3

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w()Lcom/amazonaws/logging/Log;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "message arrived on topic: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->b(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getPayload()[B

    move-result-object p2

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->t(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->K(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$7;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->t(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->a()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->a()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;->a(Ljava/lang/String;[B)V

    goto :goto_0

    :cond_1
    return-void
.end method
