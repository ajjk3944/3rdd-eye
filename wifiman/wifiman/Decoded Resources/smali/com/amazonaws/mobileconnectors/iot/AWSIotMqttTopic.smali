.class Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

.field private c:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    iput-object p3, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->c:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;

    return-void
.end method


# virtual methods
.method public a()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->c:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttNewMessageCallback;

    return-object v0
.end method

.method public b()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->b:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttTopic;->a:Ljava/lang/String;

    return-object v0
.end method
