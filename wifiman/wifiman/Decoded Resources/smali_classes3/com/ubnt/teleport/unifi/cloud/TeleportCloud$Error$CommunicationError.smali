.class public abstract Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;
.super Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "CommunicationError"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$NetworkError;,
        Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\u0008\u0004\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0007\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0002\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "cause",
        "<init>",
        "(Ljava/lang/Exception;)V",
        "a",
        "Ljava/lang/Exception;",
        "()Ljava/lang/Exception;",
        "",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "NetworkError",
        "ResponseTimeout",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$NetworkError;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;",
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


# instance fields
.field private final a:Ljava/lang/Exception;


# direct methods
.method private constructor <init>(Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;->a:Ljava/lang/Exception;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Exception;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;-><init>(Ljava/lang/Exception;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;->a:Ljava/lang/Exception;

    return-object v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;->a()Ljava/lang/Exception;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;->a()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method
