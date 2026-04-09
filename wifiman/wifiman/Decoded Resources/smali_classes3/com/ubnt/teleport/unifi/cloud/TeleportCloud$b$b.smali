.class public final enum Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

.field public static final enum CONNECTED:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

.field public static final enum DISCONNECTED:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

.field public static final enum UNSTABLE:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;


# direct methods
.method private static final synthetic $values()[Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;
    .locals 3

    sget-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->CONNECTED:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    sget-object v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->UNSTABLE:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    sget-object v2, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->DISCONNECTED:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    filled-new-array {v0, v1, v2}, [Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    const-string v1, "CONNECTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->CONNECTED:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    const-string/jumbo v1, "UNSTABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->UNSTABLE:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    const-string v1, "DISCONNECTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->DISCONNECTED:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    invoke-static {}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->$values()[Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    move-result-object v0

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->$VALUES:[Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;
    .locals 1

    const-class v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    return-object p0
.end method

.method public static values()[Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;
    .locals 1

    sget-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->$VALUES:[Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    return-object v0
.end method
