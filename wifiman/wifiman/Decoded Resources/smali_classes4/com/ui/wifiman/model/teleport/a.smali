.class public final Lcom/ui/wifiman/model/teleport/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFd/v;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lgg/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ui/wifiman/model/teleport/TeleportConnection;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportConnector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/a;->a:Landroid/content/Context;

    invoke-interface {p2}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/teleport/a$a;->a:Lcom/ui/wifiman/model/teleport/a$a;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/teleport/a$b;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/teleport/a$b;-><init>(Lcom/ui/wifiman/model/teleport/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string p2, "ignoreElements(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/a;->b:Lgg/b;

    return-void
.end method

.method public static final synthetic b(Lcom/ui/wifiman/model/teleport/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/a;->c()V

    return-void
.end method

.method private final c()V
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/a;->a:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/a;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/a;->b:Lgg/b;

    return-object v0
.end method
