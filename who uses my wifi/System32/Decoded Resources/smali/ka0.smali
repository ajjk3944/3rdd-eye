.class public final synthetic Lka0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lka0;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka0;->h:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    iput-object p2, p0, Lka0;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lka0;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka0;->g:Ljava/lang/String;

    iput-object p2, p0, Lka0;->h:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lka0;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lka0;->h:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    iget-object v2, p0, Lka0;->g:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 11
    .line 12
    const-wide/16 v3, 0x1f4

    .line 13
    .line 14
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcp0;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, ""

    .line 23
    .line 24
    iput-object v3, v0, Lcp0;->f:Ljava/lang/Object;

    .line 25
    .line 26
    :try_start_0
    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "getByName(...)"

    .line 31
    .line 32
    invoke-static {v3, v4}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v2}, Lyb;->o(Ljava/net/InetAddress;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, v0, Lcp0;->f:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    :goto_0
    new-instance v2, Lr5;

    .line 47
    .line 48
    const/4 v3, 0x2

    .line 49
    invoke-direct {v2, v0, v1, v3}, Lr5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_0
    iget-object v0, v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    iget-object v0, v0, Lf2;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lxi;

    .line 63
    .line 64
    iget-object v0, v0, Lxi;->j:Landroid/widget/TextView;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    const-string v0, "binding"

    .line 71
    .line 72
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    throw v0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
