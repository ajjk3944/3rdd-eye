.class final Lcom/ui/wifiman/quicksettings/TeleportTileService$d;
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

    iput-object p1, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService$d;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/quicksettings/a$a;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/quicksettings/TeleportTileService$d;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService;

    invoke-virtual {p1}, Landroid/service/quicksettings/TileService;->getQsTile()Landroid/service/quicksettings/Tile;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/service/quicksettings/Tile;->updateTile()V

    :cond_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wifiman/quicksettings/a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/quicksettings/TeleportTileService$d;->a(Lcom/ui/wifiman/quicksettings/a$a;)V

    return-void
.end method
