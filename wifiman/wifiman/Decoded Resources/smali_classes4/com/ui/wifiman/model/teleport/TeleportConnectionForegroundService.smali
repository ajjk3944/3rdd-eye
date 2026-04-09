.class public final Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001dB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0003J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0003J)\u0010\u001a\u001a\u00020\u00172\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0016\u0010\'\u001a\u00020$8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102\u00a8\u00066\u00b2\u0006\u000c\u00105\u001a\u0002048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "Lgg/b;",
        "i",
        "()Lgg/b;",
        "Landroid/app/Notification;",
        "notification",
        "j",
        "(Landroid/app/Notification;)Lgg/b;",
        "l",
        "LYg/J;",
        "k",
        "(Landroid/app/Notification;)V",
        "g",
        "Landroid/content/Intent;",
        "intent",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "onCreate",
        "onDestroy",
        "",
        "flags",
        "startId",
        "onStartCommand",
        "(Landroid/content/Intent;II)I",
        "Landroid/app/NotificationManager;",
        "a",
        "Landroid/app/NotificationManager;",
        "notificationManager",
        "Lcom/ui/wifiman/model/teleport/TeleportConnection;",
        "b",
        "Lcom/ui/wifiman/model/teleport/TeleportConnection;",
        "teleportConnector",
        "Lcom/ui/wifiman/model/teleport/g;",
        "c",
        "Lcom/ui/wifiman/model/teleport/g;",
        "teleportStatusNotification",
        "",
        "d",
        "Z",
        "inForeground",
        "Lhg/c;",
        "e",
        "Lhg/c;",
        "disposable",
        "Lgg/y;",
        "f",
        "Lgg/y;",
        "notificationSingleThreadScheduler",
        "Lorg/kodein/di/DI;",
        "di",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$a;

.field static final synthetic h:[Lth/l;


# instance fields
.field private a:Landroid/app/NotificationManager;

.field private b:Lcom/ui/wifiman/model/teleport/TeleportConnection;

.field private c:Lcom/ui/wifiman/model/teleport/g;

.field private d:Z

.field private e:Lhg/c;

.field private final f:Lgg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/D;

    const-string v1, "<v#0>"

    const/4 v2, 0x0

    const-class v3, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;

    const-string v4, "di"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->h:[Lth/l;

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->g:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    sget-object v0, Lm9/c;->a:Lm9/c;

    const-string v1, "TeleportNotificationUpdate"

    invoke-virtual {v0, v1}, Lm9/c;->h(Ljava/lang/String;)Lgg/y;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->f:Lgg/y;

    return-void
.end method

.method public static final synthetic a(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->g()V

    return-void
.end method

.method public static final synthetic b(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->d:Z

    return p0
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)Lcom/ui/wifiman/model/teleport/g;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->c:Lcom/ui/wifiman/model/teleport/g;

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->d:Z

    return-void
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->j(Landroid/app/Notification;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->k(Landroid/app/Notification;)V

    return-void
.end method

.method private final g()V
    .locals 3

    const/4 v0, 0x2

    const-string v1, "TeleportConnectionForegroundService - Clearing teleport notification"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->a:Landroid/app/NotificationManager;

    if-nez v0, :cond_0

    const-string v0, "notificationManager"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    sget-object v0, LO7/c;->TELEPORT:LO7/c;

    invoke-virtual {v0}, LO7/c;->getId()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method

.method private static final h(LYg/m;)Lorg/kodein/di/DI;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/kodein/di/DI;

    return-object p0
.end method

.method private final i()Lgg/b;
    .locals 5

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$e;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$e;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->c:Lcom/ui/wifiman/model/teleport/g;

    if-nez v1, :cond_0

    const-string v1, "teleportStatusNotification"

    invoke-static {v1}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v1}, Lcom/ui/wifiman/model/teleport/g;->a()Lgg/b;

    move-result-object v1

    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->l()Lgg/b;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lgg/f;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v0

    const-string v1, "concatArray(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final j(Landroid/app/Notification;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$f;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;Landroid/app/Notification;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final k(Landroid/app/Notification;)V
    .locals 3

    const/4 v0, 0x2

    const-string v1, "TeleportConnectionForegroundService - Updating teleport notification"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->a:Landroid/app/NotificationManager;

    if-nez v0, :cond_0

    const-string v0, "notificationManager"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    sget-object v0, LO7/c;->TELEPORT:LO7/c;

    invoke-virtual {v0}, LO7/c;->getId()I

    move-result v0

    invoke-virtual {v2, v0, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method private final l()Lgg/b;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->b:Lcom/ui/wifiman/model/teleport/TeleportConnection;

    if-nez v0, :cond_0

    const-string v0, "teleportConnector"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->getState()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->f:Lgg/y;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;->a:Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$g;

    invoke-virtual {v0, v1}, Lgg/i;->X(Lkg/c;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$h;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;)V

    invoke-virtual {v0, v1}, Lgg/i;->D(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "concatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 7

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {p0}, Lsj/a;->d(Landroid/content/Context;)Lsj/d;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->h:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lsj/d;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->h(LYg/m;)Lorg/kodein/di/DI;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v1

    invoke-interface {v1}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$b;

    invoke-direct {v4}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$b;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Landroid/app/NotificationManager;

    invoke-direct {v3, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v3, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    iput-object v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->a:Landroid/app/NotificationManager;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->h(LYg/m;)Lorg/kodein/di/DI;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v1

    invoke-interface {v1}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$c;

    invoke-direct {v4}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$c;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    invoke-direct {v3, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v1, v3, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/teleport/TeleportConnection;

    iput-object v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->b:Lcom/ui/wifiman/model/teleport/TeleportConnection;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->h(LYg/m;)Lorg/kodein/di/DI;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v0

    invoke-interface {v0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v1, Lorg/kodein/type/d;

    new-instance v3, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$d;

    invoke-direct {v3}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService$d;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ui/wifiman/model/teleport/g;

    invoke-direct {v1, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/g;

    iput-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->c:Lcom/ui/wifiman/model/teleport/g;

    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->i()Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->S()Lhg/c;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->e:Lhg/c;

    const-string v0, "TeleportConnectionForegroundService - created"

    const/4 v1, 0x2

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;->e:Lhg/c;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lhg/c;->dispose()V

    :cond_0
    const-string v1, "TeleportConnectionForegroundService - destroyed"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    const/4 p1, 0x0

    const/4 p2, 0x2

    const-string p3, "TeleportConnectionForegroundService - onStartCommand"

    invoke-static {p3, p1, p2, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
