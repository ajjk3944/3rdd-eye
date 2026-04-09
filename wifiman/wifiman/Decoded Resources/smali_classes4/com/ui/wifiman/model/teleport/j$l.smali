.class final Lcom/ui/wifiman/model/teleport/j$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j;->c()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/j;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$l;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lgg/f;
    .locals 3

    const-string v0, "allSsoAccountIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAg/c;->a:LAg/c;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j$l;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v1}, Lcom/ui/wifiman/model/teleport/j;->j(Lcom/ui/wifiman/model/teleport/j;)LKd/d;

    move-result-object v1

    invoke-interface {v1}, LKd/d;->getAll()Lgg/i;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$l;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-static {v2}, Lcom/ui/wifiman/model/teleport/j;->k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;

    move-result-object v2

    invoke-interface {v2}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object v2

    invoke-interface {v2}, Lcom/ubnt/teleport/TeleportTunnelManager;->getAll()Lgg/i;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$l$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/j$l;->a:Lcom/ui/wifiman/model/teleport/j;

    invoke-direct {v1, p1, v2}, Lcom/ui/wifiman/model/teleport/j$l$a;-><init>(Ljava/util/Set;Lcom/ui/wifiman/model/teleport/j;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$l;->a(Ljava/util/Set;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
