.class final Lcom/ui/wifiman/model/teleport/b$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b;-><init>(LI7/a;LFd/D;LFd/C;Lcom/ui/wifiman/model/teleport/session/TeleportSession;LP7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$p;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$p;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/b;->g(Lcom/ui/wifiman/model/teleport/b;)LP7/a;

    move-result-object p1

    sget-object v0, LP7/c$p$c;->c:LP7/c$p$c;

    invoke-interface {p1, v0}, LP7/a;->b(LP7/c;)V

    const/4 p1, 0x1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    if-nez v0, :cond_2

    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$p;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Z

    move-result p1

    return p1
.end method
