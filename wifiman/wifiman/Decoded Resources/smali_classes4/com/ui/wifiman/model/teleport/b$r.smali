.class final Lcom/ui/wifiman/model/teleport/b$r;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$r;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/b$r;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/b;->k(Lcom/ui/wifiman/model/teleport/b;)LFg/a;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/teleport/b$b$c;->a:Lcom/ui/wifiman/model/teleport/b$b$c;

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$r;->a(Lhg/c;)V

    return-void
.end method
