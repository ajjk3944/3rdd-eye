.class Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:[B

.field private c:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

.field private d:Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->b:[B

    iput-object p3, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->c:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    iput-object p4, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->d:Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    return-void
.end method


# virtual methods
.method a()[B
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->b:[B

    return-object v0
.end method

.method b()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->c:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    return-object v0
.end method

.method c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->a:Ljava/lang/String;

    return-object v0
.end method

.method d()Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQueueMessage;->d:Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;

    return-object v0
.end method
