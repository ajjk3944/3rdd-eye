.class public final synthetic Lll0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lll0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lll0;->g:Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lll0;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lll0;->g:Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->K:I

    .line 11
    .line 12
    invoke-virtual {v3, v1}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->z(Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->K:I

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v3}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lh2;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/widget/FrameLayout;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Lll0;

    .line 33
    .line 34
    invoke-direct {v0, v3, v1}, Lll0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    .line 44
    .line 45
    :cond_0
    :goto_0
    return-void

    .line 46
    :pswitch_1
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->K:I

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, Landroid/app/Dialog;

    .line 52
    .line 53
    const v1, 0x7f13012f

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v3, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 60
    .line 61
    .line 62
    const v1, 0x7f0c003c

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 69
    .line 70
    .line 71
    const v1, 0x7f090094

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Landroid/widget/Button;

    .line 79
    .line 80
    new-instance v4, Luk0;

    .line 81
    .line 82
    invoke-direct {v4, v0, v2}, Luk0;-><init>(Landroid/app/Dialog;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Lvk0;

    .line 89
    .line 90
    invoke-direct {v1, v3, v2}, Lvk0;-><init>(Li5;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_2
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->K:I

    .line 101
    .line 102
    invoke-virtual {v3, v2}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->z(Z)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_3
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->K:I

    .line 107
    .line 108
    invoke-virtual {v3}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget-object v0, v0, Lh2;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Landroid/widget/FrameLayout;

    .line 115
    .line 116
    const/16 v1, 0x8

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
