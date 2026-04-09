.class final Lcom/ui/wifiman/quicksettings/TeleportTileService$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/quicksettings/TeleportTileService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/quicksettings/TeleportTileService;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/quicksettings/TeleportTileService;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService$c;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/quicksettings/a$a;)V
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TileService - new state of manager : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService$c;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService;

    invoke-virtual {v0}, Landroid/service/quicksettings/TileService;->getQsTile()Landroid/service/quicksettings/Tile;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService$c;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService;

    invoke-virtual {p1}, Lcom/ui/wifiman/quicksettings/a$a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lte/b;->a(Landroid/service/quicksettings/Tile;Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService$c;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService;

    invoke-virtual {v0}, Landroid/service/quicksettings/TileService;->getQsTile()Landroid/service/quicksettings/Tile;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService$c;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService;

    invoke-static {v1, p1}, Lcom/ui/wifiman/quicksettings/TeleportTileService;->a(Lcom/ui/wifiman/quicksettings/TeleportTileService;Lcom/ui/wifiman/quicksettings/a$a;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/service/quicksettings/Tile;->setState(I)V

    :cond_1
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wifiman/quicksettings/a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/quicksettings/TeleportTileService$c;->a(Lcom/ui/wifiman/quicksettings/a$a;)V

    return-void
.end method
