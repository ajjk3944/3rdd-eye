.class final Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;-><init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;LLd/f;LFd/D;Lcom/ui/wifiman/model/teleport/TeleportConnection;Li8/a;Lhc/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$p;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$p;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$p;->a:Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$p;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a$b;->a:Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a$b;

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a$a;->a:Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a$a;

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$p;->a(Ljava/lang/Boolean;)Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a;

    move-result-object p1

    return-object p1
.end method
