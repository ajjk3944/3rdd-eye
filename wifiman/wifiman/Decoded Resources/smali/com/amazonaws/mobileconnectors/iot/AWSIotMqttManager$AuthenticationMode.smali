.class final enum Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "AuthenticationMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

.field public static final enum CUSTOM_AUTH:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

.field public static final enum IAM:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

.field public static final enum KEYSTORE:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

.field public static final enum USERNAME_PASSWORD:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    const-string v1, "KEYSTORE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->KEYSTORE:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    new-instance v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    const-string v2, "IAM"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->IAM:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    new-instance v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    const-string v3, "CUSTOM_AUTH"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->CUSTOM_AUTH:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    new-instance v3, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    const-string v4, "USERNAME_PASSWORD"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->USERNAME_PASSWORD:Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    filled-new-array {v0, v1, v2, v3}, [Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->$VALUES:[Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

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

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;
    .locals 1

    const-class v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->$VALUES:[Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    invoke-virtual {v0}, [Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager$AuthenticationMode;

    return-object v0
.end method
