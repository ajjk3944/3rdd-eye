.class final Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->l()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lgg/f;
    .locals 9

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "state"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-static {v3}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->c(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)Lcom/ui/wifiman/model/teleport/g;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, "teleportStatusNotification"

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_0
    invoke-interface {v3, p1}, Lcom/ui/wifiman/model/teleport/g;->b(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Landroid/app/Notification;

    move-result-object v3

    iget-object v4, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-static {v4, v3}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->e(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)Lgg/b;

    move-result-object v4

    instance-of v5, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    const-string v6, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eqz v5, :cond_1

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    new-instance v5, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$a;

    invoke-direct {v5, p1, v3}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$a;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)V

    invoke-static {v5}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v5, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v5, :cond_2

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    new-instance v5, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$b;

    invoke-direct {v5, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$b;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V

    invoke-static {v5}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    new-instance v7, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$c;

    invoke-direct {v7, v5, v3}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$c;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)V

    invoke-static {v7}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v3

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v7, 0xbb8

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v7, v8, v5}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v5

    iget-object v7, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    new-instance v8, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$d;

    invoke-direct {v8, v7}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$d;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V

    invoke-static {v8}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    new-array v6, v6, [Lgg/f;

    aput-object p1, v6, v2

    aput-object v3, v6, v1

    aput-object v5, v6, v0

    const/4 p1, 0x3

    aput-object v7, v6, p1

    invoke-static {v6}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string v3, "concatArray(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of v5, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz v5, :cond_3

    iget-object v5, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    new-instance v7, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;

    invoke-direct {v7, v5, p1, v3}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;Landroid/app/Notification;)V

    invoke-static {v7}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    new-array v0, v0, [Lgg/f;

    aput-object v4, v0, v2

    aput-object p1, v0, v1

    invoke-static {v0}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
