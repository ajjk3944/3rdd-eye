.class public final Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

.field final synthetic b:Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

.field final synthetic c:Landroid/app/Notification;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;Landroid/app/Notification;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->b:Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->c:Landroid/app/Notification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->d(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Z)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->b:Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;->b()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->c:Landroid/app/Notification;

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->f(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->a(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V

    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$e;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
