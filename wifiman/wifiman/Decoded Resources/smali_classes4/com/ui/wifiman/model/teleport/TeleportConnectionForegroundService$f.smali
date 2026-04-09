.class public final Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->j(Landroid/app/Notification;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

.field final synthetic b:Landroid/app/Notification;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;->b:Landroid/app/Notification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->b(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    sget-object v1, LO7/c;->TELEPORT:LO7/c;

    invoke-virtual {v1}, LO7/c;->getId()I

    move-result v1

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;->b:Landroid/app/Notification;

    const/16 v3, 0x10

    invoke-static {v0, v1, v2, v3}, LFd/u;->a(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;ILandroid/app/Notification;I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    sget-object v1, LO7/c;->TELEPORT:LO7/c;

    invoke-virtual {v1}, LO7/c;->getId()I

    move-result v1

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;->b:Landroid/app/Notification;

    invoke-virtual {v0, v1, v2}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->d(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Z)V

    :cond_1
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
