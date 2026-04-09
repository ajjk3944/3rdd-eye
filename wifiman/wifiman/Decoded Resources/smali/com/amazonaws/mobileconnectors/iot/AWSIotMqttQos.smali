.class public final enum Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

.field public static final enum QOS0:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

.field public static final enum QOS1:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    const-string v1, "QOS0"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->QOS0:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    new-instance v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    const-string v2, "QOS1"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->QOS1:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    filled-new-array {v0, v1}, [Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->$VALUES:[Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;
    .locals 1

    const-class v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->$VALUES:[Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    invoke-virtual {v0}, [Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    return-object v0
.end method


# virtual methods
.method public asInt()I
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;->QOS0:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttQos;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method
