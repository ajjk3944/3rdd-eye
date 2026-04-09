.class public final Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$d;
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


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$d;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$d;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->a(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h$d;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

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
