.class public final Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$DeepLinkInvalid;
.super Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DeepLinkInvalid"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$DeepLinkInvalid;",
        "Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;",
        "Li8/s$f;",
        "deepLink",
        "<init>",
        "(Li8/s$f;)V",
        "a",
        "Li8/s$f;",
        "getDeepLink",
        "()Li8/s$f;",
        "",
        "b",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "app_release"
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
.field private final a:Li8/s$f;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Li8/s$f;)V
    .locals 2

    const-string/jumbo v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$DeepLinkInvalid;->a:Li8/s$f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Deep link data invalid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$DeepLinkInvalid;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$Error$DeepLinkInvalid;->b:Ljava/lang/String;

    return-object v0
.end method
