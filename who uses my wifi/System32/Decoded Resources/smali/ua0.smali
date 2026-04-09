.class public final Lua0;
.super Ljava/util/TimerTask;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;


# direct methods
.method public constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lua0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    new-instance v0, Lla0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    iget-object v2, p0, Lua0;->f:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
