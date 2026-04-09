.class final Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;->x(Li8/s$f;J)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;J)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m;->a:Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;

    iput-wide p2, p0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 4

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m;->a:Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;->i(Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m$a;

    invoke-direct {v1, p1}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    iget-wide v1, p0, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m;->b:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m$b;

    invoke-direct {v1, p1}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->n()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/teleport/deeplink/TeleportDeepLinkConsoleConnectProcessorImpl$m;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
