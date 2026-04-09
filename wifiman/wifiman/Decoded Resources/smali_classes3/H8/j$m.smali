.class final LH8/j$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/j;


# direct methods
.method constructor <init>(LH8/j;)V
    .locals 0

    iput-object p1, p0, LH8/j$m;->a:LH8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LFd/s$a;Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a;)Lcom/ui/wifiman/ui/teleport/b;
    .locals 1

    const-string/jumbo v0, "teleportAvailableState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deeplinkProcessingState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, p2, Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a$b;

    if-eqz p2, :cond_0

    sget-object p1, Lcom/ui/wifiman/ui/teleport/b$b;->a:Lcom/ui/wifiman/ui/teleport/b$b;

    goto :goto_0

    :cond_0
    iget-object p2, p0, LH8/j$m;->a:LH8/j;

    invoke-static {p2, p1}, LH8/j;->y0(LH8/j;LFd/s$a;)Lcom/ui/wifiman/ui/teleport/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFd/s$a;

    check-cast p2, Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a;

    invoke-virtual {p0, p1, p2}, LH8/j$m;->a(LFd/s$a;Lcom/ubnt/usurvey/ui/teleport/deeplink/a$a;)Lcom/ui/wifiman/ui/teleport/b;

    move-result-object p1

    return-object p1
.end method
