.class public final Lwc3;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwc3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget v0, p0, Lwc3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwb4;->b:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    const/4 p2, 0x0

    .line 10
    :try_start_0
    sput-boolean p2, Lwb4;->c:Z

    .line 11
    .line 12
    sput-boolean p2, Lwb4;->d:Z

    .line 13
    .line 14
    const-string p2, "Ad debug logging enablement is out of date."

    .line 15
    .line 16
    invoke-static {p2}, Lgi2;->i0(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-static {p1}, Lob1;->u(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1

    .line 27
    :pswitch_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "android.media.action.HDMI_AUDIO_PLUG"

    .line 32
    .line 33
    if-ne p1, v0, :cond_1

    .line 34
    .line 35
    const-string p1, "android.media.extra.AUDIO_PLUG_STATE"

    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/4 p2, 0x1

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    sput p2, Lou1;->v:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    if-ne p1, p2, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x2

    .line 51
    sput p1, Lou1;->v:I

    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
