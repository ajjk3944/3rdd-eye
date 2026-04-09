.class public final synthetic Lxk0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxk0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lxk0;->g:Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

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
    .locals 6

    .line 1
    iget v0, p0, Lxk0;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "binding"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Lxk0;->g:Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 14
    .line 15
    invoke-virtual {v5, v4}, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->z(Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, v5, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lg2;->a:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    const/16 v1, 0x8

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v3

    .line 35
    :pswitch_1
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 36
    .line 37
    new-instance v0, Landroid/app/Dialog;

    .line 38
    .line 39
    const v2, 0x7f13012f

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v5, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 46
    .line 47
    .line 48
    const v2, 0x7f0c003c

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setContentView(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 55
    .line 56
    .line 57
    const v1, 0x7f090094

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Landroid/widget/Button;

    .line 65
    .line 66
    new-instance v2, Luk0;

    .line 67
    .line 68
    invoke-direct {v2, v0, v4}, Luk0;-><init>(Landroid/app/Dialog;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Lvk0;

    .line 75
    .line 76
    invoke-direct {v1, v5, v4}, Lvk0;-><init>(Li5;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_2
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 87
    .line 88
    :try_start_0
    iget-object v0, v5, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 89
    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    iget-object v0, v0, Lg2;->a:Landroid/widget/FrameLayout;

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_2

    .line 99
    .line 100
    new-instance v0, Lxk0;

    .line 101
    .line 102
    const/4 v1, 0x3

    .line 103
    invoke-direct {v0, v5, v1}, Lxk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catch_0
    move-exception v0

    .line 111
    goto :goto_0

    .line 112
    :cond_1
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 117
    .line 118
    .line 119
    :cond_2
    :goto_1
    return-void

    .line 120
    :pswitch_3
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 121
    .line 122
    invoke-virtual {v5, v1}, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->z(Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->x()V

    .line 126
    .line 127
    .line 128
    iget-object v0, v5, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->K:Lo9;

    .line 129
    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    iget-object v0, v0, Lo9;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Lg2;

    .line 135
    .line 136
    iget-object v1, v0, Lg2;->e:Lcom/github/mikephil/charting/charts/LineChart;

    .line 137
    .line 138
    invoke-virtual {v1}, Lje;->getData()Lle;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Lj60;

    .line 143
    .line 144
    iget-object v1, v1, Lle;->i:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, Lg2;->e:Lcom/github/mikephil/charting/charts/LineChart;

    .line 150
    .line 151
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_3
    const-string v0, "pingChart"

    .line 156
    .line 157
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v3

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
