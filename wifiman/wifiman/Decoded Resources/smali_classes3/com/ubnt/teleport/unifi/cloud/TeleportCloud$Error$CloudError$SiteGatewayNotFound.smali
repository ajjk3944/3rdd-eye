.class public final Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;
.super Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SiteGatewayNotFound"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;",
        "<init>",
        "()V",
        "",
        "b",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;

    const-string v0, "Cloud has not connection to site gateway"

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;->b:Ljava/lang/String;

    return-object v0
.end method
