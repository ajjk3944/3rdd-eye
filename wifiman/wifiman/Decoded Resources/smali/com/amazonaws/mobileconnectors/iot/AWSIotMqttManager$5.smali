.class Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->b0(Ljava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;

.field final synthetic b:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;


# direct methods
.method constructor <init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getSessionPresent()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;

    invoke-interface {p1, p2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getSessionPresent()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->k(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Z)Z

    iget-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$5;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;

    invoke-interface {p1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;->b()V

    return-void
.end method
