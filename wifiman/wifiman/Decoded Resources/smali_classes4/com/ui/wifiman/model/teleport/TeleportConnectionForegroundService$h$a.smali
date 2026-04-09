.class public final Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$a;
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

.field final synthetic b:Landroid/app/Notification;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$a;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$a;->b:Landroid/app/Notification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$a;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$a;->b:Landroid/app/Notification;

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->f(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
