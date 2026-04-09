.class final Lcom/ui/wifiman/model/teleport/b$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


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

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$n;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Lcom/ui/wifiman/model/teleport/b$b;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInitiatedConnectionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;

    if-eqz v0, :cond_0

    iget-object p2, p0, Lcom/ui/wifiman/model/teleport/b$n;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p2, p1}, Lcom/ui/wifiman/model/teleport/b;->e(Lcom/ui/wifiman/model/teleport/b;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/b$b$a;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$n;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p1, p2}, Lcom/ui/wifiman/model/teleport/b;->f(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/b$b;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    if-nez v1, :cond_9

    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;

    if-nez v1, :cond_4

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    instance-of v1, p2, Lcom/ui/wifiman/model/teleport/b$b$b;

    if-eqz v1, :cond_6

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;

    if-eqz p1, :cond_5

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$n;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/teleport/b;->e(Lcom/ui/wifiman/model/teleport/b;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$n;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p1, p2}, Lcom/ui/wifiman/model/teleport/b;->f(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/b$b;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p1

    goto :goto_3

    :cond_6
    instance-of p1, p2, Lcom/ui/wifiman/model/teleport/b$b$c;

    if-nez p1, :cond_8

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_1
    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$n;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p1, p2}, Lcom/ui/wifiman/model/teleport/b;->f(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/b$b;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p1

    goto :goto_3

    :cond_9
    :goto_2
    iget-object p2, p0, Lcom/ui/wifiman/model/teleport/b$n;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p2, p1}, Lcom/ui/wifiman/model/teleport/b;->e(Lcom/ui/wifiman/model/teleport/b;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lcom/ui/wifiman/model/teleport/b$b;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/teleport/b$n;->a(Ll9/a;Lcom/ui/wifiman/model/teleport/b$b;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p1

    return-object p1
.end method
