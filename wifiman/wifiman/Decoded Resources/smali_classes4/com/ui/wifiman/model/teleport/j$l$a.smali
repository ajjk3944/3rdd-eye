.class final Lcom/ui/wifiman/model/teleport/j$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/j$l;->a(Ljava/util/Set;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:Lcom/ui/wifiman/model/teleport/j;


# direct methods
.method constructor <init>(Ljava/util/Set;Lcom/ui/wifiman/model/teleport/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j$l$a;->a:Ljava/util/Set;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j$l$a;->b:Lcom/ui/wifiman/model/teleport/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 8

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j$l$a;->a:Ljava/util/Set;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, LKd/a;

    invoke-virtual {v5}, LKd/a;->f()Ljava/util/UUID;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, LKd/a;->f()Ljava/util/UUID;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {v5}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->a(Ljava/util/UUID;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    move-result-object v4

    :cond_1
    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKd/a;

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-interface {v6}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, LKd/a;->g()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/ubnt/teleport/TeleportTunnel$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_5
    move-object v5, v4

    :goto_2
    check-cast v5, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    if-eqz v5, :cond_3

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/j$l$a;->b:Lcom/ui/wifiman/model/teleport/j;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/j;->k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;

    move-result-object v3

    invoke-interface {v3}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object v3

    invoke-interface {v3, v2}, Lcom/ubnt/teleport/TeleportTunnelManager;->e(Lcom/ubnt/teleport/TeleportTunnel;)Lgg/b;

    move-result-object v3

    invoke-static {p1}, Lcom/ui/wifiman/model/teleport/j;->j(Lcom/ui/wifiman/model/teleport/j;)LKd/d;

    move-result-object v5

    invoke-interface {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, LKd/d;->b(Ljava/lang/String;)Lgg/b;

    move-result-object v2

    const/4 v5, 0x2

    new-array v5, v5, [Lgg/f;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v3, 0x1

    aput-object v2, v5, v3

    invoke-static {v5}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_8

    move-object v4, v1

    :cond_8
    if-eqz v4, :cond_9

    invoke-static {v4}, Lgg/b;->q(Ljava/lang/Iterable;)Lgg/b;

    move-result-object p1

    if-eqz p1, :cond_9

    goto :goto_4

    :cond_9
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j$l$a;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
