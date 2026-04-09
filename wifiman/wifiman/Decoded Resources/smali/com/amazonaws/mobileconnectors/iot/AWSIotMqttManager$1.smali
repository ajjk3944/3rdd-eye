.class Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->C(Lcom/amazonaws/auth/AWSCredentialsProvider;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttClientStatusCallback;)V
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

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    new-instance v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

    const-string v2, "iotdata"

    invoke-direct {v1, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->b(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;)Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->c(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->c(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s:443"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->p(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->p(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->u(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/regions/Region;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amazonaws/regions/Region;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->u(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/regions/Region;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amazonaws/regions/Region;->a()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s.iot.%s.%s:443"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    sget-object v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->IAM:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    invoke-static {v1, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->v(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->w()Lcom/amazonaws/logging/Log;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MQTT broker: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/amazonaws/logging/Log;->a(Ljava/lang/Object;)V

    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->a(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;

    move-result-object v1

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->x(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/auth/AWSCredentialsProvider;

    move-result-object v2

    invoke-interface {v2}, Lcom/amazonaws/auth/AWSCredentialsProvider;->a()Lcom/amazonaws/auth/AWSCredentials;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Lcom/amazonaws/SDKGlobalConfiguration;->a()J

    move-result-wide v6

    invoke-static {}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->y()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v8, v2

    mul-long/2addr v6, v8

    sub-long/2addr v4, v6

    iget-object v2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->u(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/regions/Region;

    move-result-object v6

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Lcom/amazonaws/mobileconnectors/iot/AWSIotWebSocketUrlSigner;->c(Ljava/lang/String;Lcom/amazonaws/auth/AWSCredentials;JLcom/amazonaws/regions/Region;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-direct {v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;-><init>()V

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setServerURIs([Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->z(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttLastWillAndTestament;

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v1}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->A(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    new-instance v3, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "wss://"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v4}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->d(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Loj/a;

    invoke-direct {v5}, Loj/a;-><init>()V

    invoke-direct {v3, v0, v4, v5}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;)V

    invoke-static {v1, v3}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->B(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-static {v0, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_2
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    sget-object v2, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-static {v1, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    invoke-virtual {v1, v0}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    goto :goto_4

    :goto_3
    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    sget-object v2, Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;->Disconnected:Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    invoke-static {v1, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->g(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;)Lcom/amazonaws/mobileconnectors/iot/MqttManagerConnectionState;

    iget-object v1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$1;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    new-instance v2, Lcom/amazonaws/AmazonClientException;

    const-string v3, "An error occurred in the MQTT client."

    invoke-direct {v2, v3, v0}, Lcom/amazonaws/AmazonClientException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;->e0(Ljava/lang/Throwable;)V

    :goto_4
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No valid endpoint information is available. Please pass in a valid endpoint in AWSIotMqttManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
