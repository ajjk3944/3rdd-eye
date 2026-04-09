.class public final Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0003J)\u0010\u0010\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0003J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006(\u00b2\u0006\u000c\u0010\'\u001a\u00020&8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "Lcom/ui/wifiman/model/wmw/g$b;",
        "firmware",
        "LYg/J;",
        "g",
        "(Lcom/ui/wifiman/model/wmw/g$b;)V",
        "e",
        "onCreate",
        "Landroid/content/Intent;",
        "intent",
        "",
        "flags",
        "startId",
        "onStartCommand",
        "(Landroid/content/Intent;II)I",
        "onDestroy",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "Lhg/c;",
        "a",
        "Lhg/c;",
        "upgradeDisposable",
        "Lse/h;",
        "b",
        "Lse/h;",
        "upgradeProcessor",
        "Lcom/ui/wifiman/model/wmw/g;",
        "c",
        "Lcom/ui/wifiman/model/wmw/g;",
        "upgradeManager",
        "Lse/g;",
        "d",
        "Lse/g;",
        "notificationService",
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
.field public static final e:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;

.field static final synthetic f:[Lth/l;


# instance fields
.field private a:Lhg/c;

.field private b:Lse/h;

.field private c:Lcom/ui/wifiman/model/wmw/g;

.field private d:Lse/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/D;

    const-string v1, "<v#0>"

    const/4 v2, 0x0

    const-class v3, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;

    const-string v4, "di"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->f:[Lth/l;

    new-instance v0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->e:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->i(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;)V

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->j()V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->h()V

    return-void
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;)Lse/g;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->d:Lse/g;

    return-object p0
.end method

.method private final e()V
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->a:Lhg/c;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->a:Lhg/c;

    const-string v1, "WMW Upgrade Service - disposeUpgradeProcess"

    const/4 v2, 0x2

    invoke-static {v1, v0, v2, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->a:Lhg/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_1
    return-void
.end method

.method private static final f(LYg/m;)Lorg/kodein/di/DI;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/kodein/di/DI;

    return-object p0
.end method

.method private final g(Lcom/ui/wifiman/model/wmw/g$b;)V
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->a:Lhg/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "WMW - Upgrade already started"

    const/4 v0, 0x6

    invoke-static {p1, v1, v1, v0, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->b:Lse/h;

    if-nez v0, :cond_1

    const-string v0, "upgradeProcessor"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-interface {v0, p1}, Lse/h;->b(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$e;-><init>(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;)V

    invoke-virtual {p1, v0}, Lgg/i;->D(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$f;->a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$f;

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, Lse/d;

    invoke-direct {v0}, Lse/d;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    new-instance v0, Lse/e;

    invoke-direct {v0, p0}, Lse/e;-><init>(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;)V

    invoke-virtual {p1, v0}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    new-instance v0, Lse/f;

    invoke-direct {v0}, Lse/f;-><init>()V

    sget-object v2, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;->a:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$g;

    invoke-virtual {p1, v0, v2}, Lgg/b;->U(Lkg/a;Lkg/f;)Lhg/c;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->a:Lhg/c;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const-string v2, "notificationService"

    if-lt p1, v0, :cond_3

    sget-object p1, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->e:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;->c()I

    move-result p1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->d:Lse/g;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    invoke-interface {v1}, Lse/g;->d()Landroid/app/Notification;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {p0, p1, v0, v1}, Lse/c;->a(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;ILandroid/app/Notification;I)V

    goto :goto_2

    :cond_3
    sget-object p1, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->e:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;->c()I

    move-result p1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->d:Lse/g;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, v0

    :goto_1
    invoke-interface {v1}, Lse/g;->d()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_2
    return-void
.end method

.method private static final h()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "WMW Upgrade Service - FW Upgrade Service Process Completed"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final i(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;)V
    .locals 2

    invoke-direct {p0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->e()V

    const/4 p0, 0x0

    const/4 v0, 0x2

    const-string v1, "WMW Upgrade Service - FW Upgrade Service Process Finished"

    invoke-static {v1, p0, v0, p0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final j()V
    .locals 0

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 8

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "WMW Upgrade Service - FW Upgrade Service onCreate"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {p0}, Lsj/a;->d(Landroid/content/Context;)Lsj/d;

    move-result-object v0

    sget-object v3, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->f:[Lth/l;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v0, v1, v3}, Lsj/d;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->f(LYg/m;)Lorg/kodein/di/DI;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v3

    invoke-interface {v3}, Lrj/n2;->g()Lrj/m2;

    move-result-object v3

    new-instance v4, Lorg/kodein/type/d;

    new-instance v5, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$b;

    invoke-direct {v5}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$b;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lse/h;

    invoke-direct {v4, v5, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v3, v4, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lse/h;

    iput-object v3, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->b:Lse/h;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->f(LYg/m;)Lorg/kodein/di/DI;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v3

    invoke-interface {v3}, Lrj/n2;->g()Lrj/m2;

    move-result-object v3

    new-instance v4, Lorg/kodein/type/d;

    new-instance v5, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$c;

    invoke-direct {v5}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$c;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v7, Lcom/ui/wifiman/model/wmw/g;

    invoke-direct {v4, v5, v7}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v3, v4, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/wmw/g;

    iput-object v3, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->c:Lcom/ui/wifiman/model/wmw/g;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->f(LYg/m;)Lorg/kodein/di/DI;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v0

    invoke-interface {v0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$d;

    invoke-direct {v4}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$d;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lse/g;

    invoke-direct {v3, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v3, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lse/g;

    iput-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->d:Lse/g;

    if-nez v0, :cond_0

    const-string v0, "notificationService"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {v0}, Lse/g;->a()V

    const-string v0, "WMW Upgrade Service - FW Upgrade Service Created"

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    const-string v0, "WMW Upgrade Service - FW Upgrade Service onDestroy"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->a:Lhg/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->d:Lse/g;

    if-nez v0, :cond_1

    const-string v0, "notificationService"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-interface {v0}, Lse/g;->b()V

    const-string v0, "WMW Upgrade Service - FW Upgrade Service Destroyed"

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW Upgrade Service - FW Upgrade Service - onStartCommand action "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x2

    invoke-static {p3, p2, v0, p2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    :cond_1
    move-object p3, p2

    :goto_1
    if-eqz p3, :cond_6

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x5aad94c1

    if-eq v1, v2, :cond_4

    const v2, 0x2e9f9185

    if-eq v1, v2, :cond_2

    goto :goto_3

    :cond_2
    const-string v1, "com.ubnt.usurvey.wmw.fw.stop"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    goto :goto_3

    :cond_3
    invoke-direct {p0}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->e()V

    goto :goto_2

    :cond_4
    const-string v1, "com.ubnt.usurvey.wmw.fw.start"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    sget-object p3, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->e:Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;

    invoke-static {p3, p1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;->a(Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService$a;Landroid/content/Intent;)Lcom/ui/wifiman/model/wmw/g$b;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;->g(Lcom/ui/wifiman/model/wmw/g$b;)V

    goto :goto_2

    :cond_5
    const-string p1, "Firmware Upgrade service started with NULL firmware params. Can\'t continue with FW upgrade"

    const/4 p3, 0x6

    invoke-static {p1, p2, p2, p3, p2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_2
    return v0

    :cond_6
    :goto_3
    new-instance p3, Ljava/lang/IllegalStateException;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UpgradeForegroundService started with unknown action "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3
.end method
