.class final Lcom/ui/wifiman/model/teleport/l$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l;-><init>(LFd/D;LI7/a;LKd/d;LKd/b;LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/l;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$m;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/l$c$a;)LDj/a;
    .locals 3

    const-string v0, "startEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$m;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/l;->f(Lcom/ui/wifiman/model/teleport/l;)LI7/a;

    move-result-object v0

    invoke-interface {v0}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ubnt/teleport/TeleportTunnelManager;->getAll()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/l$m$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/l$m$a;-><init>(Lcom/ui/wifiman/model/teleport/l$c$a;)V

    invoke-virtual {v0, v1}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/l$m$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/l$m;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/teleport/l$m$b;-><init>(Lcom/ui/wifiman/model/teleport/l;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/l$m;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-static {v1}, Lcom/ui/wifiman/model/teleport/l;->e(Lcom/ui/wifiman/model/teleport/l;)Lgg/i;

    move-result-object v1

    const-class v2, Lcom/ui/wifiman/model/teleport/l$c$b;

    invoke-virtual {v1, v2}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object v1

    const-string v2, "ofType(R::class.java)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/ui/wifiman/model/teleport/l$m$c;

    invoke-direct {v2, p1}, Lcom/ui/wifiman/model/teleport/l$m$c;-><init>(Lcom/ui/wifiman/model/teleport/l$c$a;)V

    invoke-virtual {v1, v2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/i;->Q1(LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/l$c$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$m;->a(Lcom/ui/wifiman/model/teleport/l$c$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
