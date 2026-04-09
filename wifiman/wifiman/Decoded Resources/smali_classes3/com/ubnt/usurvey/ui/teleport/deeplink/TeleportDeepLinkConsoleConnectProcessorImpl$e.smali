.class final Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;->s(Li8/s$f;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e;->a:Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e$a;

    invoke-direct {v0, p1}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$e;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
