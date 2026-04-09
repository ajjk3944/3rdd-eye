.class public final Lcom/ui/wifiman/quicksettings/TeleportTileService;
.super Landroid/service/quicksettings/TileService;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J\u000f\u0010\u000c\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0010R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0010R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d\u00b2\u0006\u000c\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/ui/wifiman/quicksettings/TeleportTileService;",
        "Landroid/service/quicksettings/TileService;",
        "<init>",
        "()V",
        "Lcom/ui/wifiman/quicksettings/a$a;",
        "",
        "c",
        "(Lcom/ui/wifiman/quicksettings/a$a;)I",
        "LYg/J;",
        "onCreate",
        "onTileAdded",
        "onTileRemoved",
        "onDestroy",
        "onClick",
        "Lhg/c;",
        "a",
        "Lhg/c;",
        "disposable",
        "b",
        "disposableState",
        "tileAddDisposableState",
        "d",
        "tileRemoveDisposableState",
        "Lcom/ui/wifiman/quicksettings/a;",
        "e",
        "Lcom/ui/wifiman/quicksettings/a;",
        "teleportManager",
        "Lorg/kodein/di/DI;",
        "di",
        "app-quick-settings_release"
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
.field static final synthetic f:[Lth/l;


# instance fields
.field private a:Lhg/c;

.field private b:Lhg/c;

.field private c:Lhg/c;

.field private d:Lhg/c;

.field private e:Lcom/ui/wifiman/quicksettings/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/D;

    const-string v1, "<v#0>"

    const/4 v2, 0x0

    const-class v3, Lcom/ui/wifiman/quicksettings/TeleportTileService;

    const-string v4, "di"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lcom/ui/wifiman/quicksettings/TeleportTileService;->f:[Lth/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/service/quicksettings/TileService;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/ui/wifiman/quicksettings/TeleportTileService;Lcom/ui/wifiman/quicksettings/a$a;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/quicksettings/TeleportTileService;->c(Lcom/ui/wifiman/quicksettings/a$a;)I

    move-result p0

    return p0
.end method

.method private static final b(LYg/m;)Lorg/kodein/di/DI;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/kodein/di/DI;

    return-object p0
.end method

.method private final c(Lcom/ui/wifiman/quicksettings/a$a;)I
    .locals 1

    sget-object v0, Lcom/ui/wifiman/quicksettings/a$a$a;->a:Lcom/ui/wifiman/quicksettings/a$a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/ui/wifiman/quicksettings/a$a$b$a;->a:Lcom/ui/wifiman/quicksettings/a$a$b$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ui/wifiman/quicksettings/a$a$c;->a:Lcom/ui/wifiman/quicksettings/a$a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    instance-of p1, p1, Lcom/ui/wifiman/quicksettings/a$a$d;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    const/4 p1, 0x2

    :goto_1
    return p1
.end method


# virtual methods
.method public onClick()V
    .locals 2

    invoke-super {p0}, Landroid/service/quicksettings/TileService;->onClick()V

    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->e:Lcom/ui/wifiman/quicksettings/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/ui/wifiman/quicksettings/a;->a(Landroid/content/Context;)Lgg/b;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/ui/wifiman/quicksettings/TeleportTileService$a;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService$a;

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgg/b;->S()Lhg/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->a:Lhg/c;

    return-void
.end method

.method public onCreate()V
    .locals 6

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "TileService - TileService Service onCreate"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {p0}, Lsj/a;->d(Landroid/content/Context;)Lsj/d;

    move-result-object v0

    sget-object v3, Lcom/ui/wifiman/quicksettings/TeleportTileService;->f:[Lth/l;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v0, v1, v3}, Lsj/d;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    invoke-static {v0}, Lcom/ui/wifiman/quicksettings/TeleportTileService;->b(LYg/m;)Lorg/kodein/di/DI;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v0

    invoke-interface {v0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v0

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, Lcom/ui/wifiman/quicksettings/TeleportTileService$b;

    invoke-direct {v4}, Lcom/ui/wifiman/quicksettings/TeleportTileService$b;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/quicksettings/a;

    invoke-direct {v3, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v3, v1}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/quicksettings/a;

    iput-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->e:Lcom/ui/wifiman/quicksettings/a;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/ui/wifiman/quicksettings/a;->getState()Lgg/i;

    move-result-object v0

    new-instance v3, Lcom/ui/wifiman/quicksettings/TeleportTileService$c;

    invoke-direct {v3, p0}, Lcom/ui/wifiman/quicksettings/TeleportTileService$c;-><init>(Lcom/ui/wifiman/quicksettings/TeleportTileService;)V

    invoke-virtual {v0, v3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v3, Lcom/ui/wifiman/quicksettings/TeleportTileService$d;

    invoke-direct {v3, p0}, Lcom/ui/wifiman/quicksettings/TeleportTileService$d;-><init>(Lcom/ui/wifiman/quicksettings/TeleportTileService;)V

    invoke-virtual {v0, v3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    sget-object v3, Lcom/ui/wifiman/quicksettings/TeleportTileService$e;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService$e;

    invoke-virtual {v0, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v3, Lcom/ui/wifiman/quicksettings/TeleportTileService$f;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService$f;

    invoke-virtual {v0, v3}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->A1()Lhg/c;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->b:Lhg/c;

    const-string v0, "TileService - Tile Service Created"

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/service/quicksettings/TileService;->onDestroy()V

    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->a:Lhg/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->b:Lhg/c;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_1
    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->c:Lhg/c;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_2
    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->d:Lhg/c;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_3
    return-void
.end method

.method public onTileAdded()V
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->e:Lcom/ui/wifiman/quicksettings/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ui/wifiman/quicksettings/a;->c(Z)Lgg/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgg/b;->S()Lhg/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->c:Lhg/c;

    return-void
.end method

.method public onTileRemoved()V
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->e:Lcom/ui/wifiman/quicksettings/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ui/wifiman/quicksettings/a;->c(Z)Lgg/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgg/b;->S()Lhg/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService;->d:Lhg/c;

    return-void
.end method
