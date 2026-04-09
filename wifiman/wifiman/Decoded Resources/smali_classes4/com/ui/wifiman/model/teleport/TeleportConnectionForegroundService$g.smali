.class final Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->l()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    check-cast p2, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;->b(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Z

    move-result p1

    return p1
.end method

.method public final b(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Z
    .locals 1

    const-string v0, "prev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz p1, :cond_0

    instance-of p1, p2, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
