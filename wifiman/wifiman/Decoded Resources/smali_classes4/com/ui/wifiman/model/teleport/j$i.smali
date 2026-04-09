.class final Lcom/ui/wifiman/model/teleport/j$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j;->e(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/j;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$i;->a:Lcom/ui/wifiman/model/teleport/j;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j$i;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LLd/e;)Lgg/D;
    .locals 5

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAg/e;->a:LAg/e;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j$i;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v1}, Lcom/ui/wifiman/model/teleport/j;->i(Lcom/ui/wifiman/model/teleport/j;)Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    move-result-object v1

    invoke-interface {v1}, LJ7/G;->getClientId()Lgg/z;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$i;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v2}, Lcom/ui/wifiman/model/teleport/j;->i(Lcom/ui/wifiman/model/teleport/j;)Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    move-result-object v2

    invoke-interface {v2}, LJ7/G;->f()Lgg/z;

    move-result-object v2

    invoke-virtual {p1}, LLd/e;->c()Lcom/ui/wifiman/model/ubiquiti/console/f;

    move-result-object v3

    iget-object v4, p0, Lcom/ui/wifiman/model/teleport/j$i;->b:Ljava/lang/String;

    invoke-interface {v3, v4}, Lcom/ui/wifiman/model/ubiquiti/console/f;->b(Ljava/lang/String;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3}, Lgg/i;->o0()Lgg/z;

    move-result-object v3

    const-string v4, "firstOrError(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, v3}, LAg/e;->b(Lgg/D;Lgg/D;Lgg/D;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/j$i$a;->a:Lcom/ui/wifiman/model/teleport/j$i$a;

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$i$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$i;->a:Lcom/ui/wifiman/model/teleport/j;

    iget-object v3, p0, Lcom/ui/wifiman/model/teleport/j$i;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/ui/wifiman/model/teleport/j$i$b;-><init>(Lcom/ui/wifiman/model/teleport/j;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$i$c;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$i;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/teleport/j$i$c;-><init>(Lcom/ui/wifiman/model/teleport/j;LLd/e;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLd/e;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$i;->a(LLd/e;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
