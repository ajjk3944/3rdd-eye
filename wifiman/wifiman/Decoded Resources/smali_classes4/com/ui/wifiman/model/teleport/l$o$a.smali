.class final Lcom/ui/wifiman/model/teleport/l$o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$o;->a(LYg/s;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/ui/wifiman/model/teleport/l$d;

.field final synthetic c:Lcom/ui/wifiman/model/teleport/l;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/ui/wifiman/model/teleport/l$d;Lcom/ui/wifiman/model/teleport/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$o$a;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/l$o$a;->b:Lcom/ui/wifiman/model/teleport/l$d;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/l$o$a;->c:Lcom/ui/wifiman/model/teleport/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKd/a$a;)Lgg/f;
    .locals 2

    const-string v0, "console"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$o$a;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/l$o$a;->b:Lcom/ui/wifiman/model/teleport/l$d;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/teleport/l$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$o$a;->c:Lcom/ui/wifiman/model/teleport/l;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/l;->d(Lcom/ui/wifiman/model/teleport/l;)LKd/d;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/l$o$a;->b:Lcom/ui/wifiman/model/teleport/l$d;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/teleport/l$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, LKd/d;->d(Ljava/lang/String;LKd/a$a;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKd/a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$o$a;->a(LKd/a$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
