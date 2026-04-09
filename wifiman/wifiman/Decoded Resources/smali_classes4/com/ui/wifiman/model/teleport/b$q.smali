.class final Lcom/ui/wifiman/model/teleport/b$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


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

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$q;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$q;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/teleport/b;->m(Lcom/ui/wifiman/model/teleport/b;Ljava/lang/Throwable;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoVpnProfile;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoSSOAccount;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$q;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/b;->k(Lcom/ui/wifiman/model/teleport/b;)LFg/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$b$a;

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/b$b$a;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Cloud;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$q;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/b;->k(Lcom/ui/wifiman/model/teleport/b;)LFg/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$b$a;

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/b$b$a;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$q;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/b;->k(Lcom/ui/wifiman/model/teleport/b;)LFg/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$b$a;

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/b$b$a;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    const-string v0, "TeleportConnection - unexpected error occurred"

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$q;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/b;->k(Lcom/ui/wifiman/model/teleport/b;)LFg/a;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/teleport/b$b$b;->a:Lcom/ui/wifiman/model/teleport/b$b$b;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$q;->a(Ljava/lang/Throwable;)V

    return-void
.end method
