.class final Lcom/ui/wifiman/quicksettings/TeleportTileService$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/quicksettings/TeleportTileService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/quicksettings/TeleportTileService$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/quicksettings/TeleportTileService$e;

    invoke-direct {v0}, Lcom/ui/wifiman/quicksettings/TeleportTileService$e;-><init>()V

    sput-object v0, Lcom/ui/wifiman/quicksettings/TeleportTileService$e;->a:Lcom/ui/wifiman/quicksettings/TeleportTileService$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/quicksettings/a$a;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/quicksettings/a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/quicksettings/TeleportTileService$e;->a(Lcom/ui/wifiman/quicksettings/a$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
