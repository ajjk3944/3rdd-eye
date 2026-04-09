.class Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;

.field private b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;

    iput-object p2, p0, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method a()Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->a:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttMessageDeliveryCallback;

    return-object v0
.end method

.method b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/mobileconnectors/iot/PublishMessageUserData;->b:Ljava/lang/Object;

    return-object v0
.end method
