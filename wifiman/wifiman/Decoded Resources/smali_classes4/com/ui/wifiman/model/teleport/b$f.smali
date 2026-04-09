.class final Lcom/ui/wifiman/model/teleport/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


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

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$f;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Lgg/f;
    .locals 1

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$f;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/b;->w()LI7/a;

    move-result-object p1

    invoke-interface {p1}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/ubnt/teleport/TeleportTunnelManager;->a()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/teleport/b$f$a;->a:Lcom/ui/wifiman/model/teleport/b$f$a;

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$f;->a(LYg/J;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
