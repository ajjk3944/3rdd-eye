.class final Lcom/ui/wifiman/model/teleport/l$p$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$p$a;->a(Ljava/util/Set;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Set;


# direct methods
.method constructor <init>(Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$p$a$a;->a:Ljava/util/Set;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/l$c;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$p$a$a;->a:Ljava/util/Set;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/l$p$a$a;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    instance-of v2, p1, Lcom/ui/wifiman/model/teleport/l$c$a;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/teleport/l$c$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/l$c$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    instance-of v2, p1, Lcom/ui/wifiman/model/teleport/l$c$b;

    if-eqz v2, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/teleport/l$c$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/l$c$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/l$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$p$a$a;->a(Lcom/ui/wifiman/model/teleport/l$c;)V

    return-void
.end method
