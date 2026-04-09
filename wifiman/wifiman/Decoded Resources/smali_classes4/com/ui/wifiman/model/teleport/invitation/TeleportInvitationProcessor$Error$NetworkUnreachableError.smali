.class public final Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$NetworkUnreachableError;
.super Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NetworkUnreachableError"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$NetworkUnreachableError;",
        "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;",
        "",
        "siteName",
        "<init>",
        "(Ljava/lang/String;)V",
        "a",
        "Ljava/lang/String;",
        "getSiteName",
        "()Ljava/lang/String;",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$Error$NetworkUnreachableError;->a:Ljava/lang/String;

    return-void
.end method
