.class public final Lq00;
.super Lt2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lex2;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lq00;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lq00;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Li5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq00;->f:I

    iput-object p1, p0, Lq00;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lu70;)V
    .locals 2

    .line 1
    iget v0, p0, Lq00;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq00;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lex2;

    .line 9
    .line 10
    invoke-static {p1}, Lex2;->F3(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lex2;->C3(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, Lq00;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p1, p1, Lh2;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Landroid/widget/FrameLayout;

    .line 36
    .line 37
    const/16 v0, 0x8

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :pswitch_1
    iget-object p1, p0, Lq00;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget-object p1, p1, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iget-object p1, p1, Lg2;->a:Landroid/widget/FrameLayout;

    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    :goto_1
    return-void

    .line 66
    :cond_2
    const-string p1, "binding"

    .line 67
    .line 68
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    throw p1

    .line 73
    :pswitch_2
    iget-object p1, p0, Lq00;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 76
    .line 77
    iget-object v0, p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    iget-object v0, v0, Lf2;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lcom/google/android/material/card/MaterialCardView;

    .line 84
    .line 85
    const/16 v1, 0x8

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Lla0;

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    invoke-direct {v0, p1, v1}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    const-string p1, "binding"

    .line 101
    .line 102
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    throw p1

    .line 107
    :pswitch_3
    iget-object p1, p0, Lq00;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;

    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    iget-object p1, p1, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 119
    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    iget-object p1, p1, Lp21;->f:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Landroid/widget/FrameLayout;

    .line 125
    .line 126
    const/16 v0, 0x8

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 129
    .line 130
    .line 131
    :goto_2
    return-void

    .line 132
    :cond_5
    const-string p1, "binding"

    .line 133
    .line 134
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    throw p1

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e()V
    .locals 5

    .line 1
    iget v0, p0, Lq00;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lq00;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->y()Lh2;

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
    const/16 v1, 0x8

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, Lq00;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v0, v0, Lg2;->a:Landroid/widget/FrameLayout;

    .line 48
    .line 49
    const/16 v1, 0x8

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    :goto_1
    return-void

    .line 55
    :cond_2
    const-string v0, "binding"

    .line 56
    .line 57
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    throw v0

    .line 62
    :pswitch_2
    iget-object v0, p0, Lq00;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 65
    .line 66
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    const-string v3, "binding"

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    iget-object v1, v1, Lf2;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lcom/google/android/material/card/MaterialCardView;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/16 v4, 0x8

    .line 82
    .line 83
    if-ne v1, v4, :cond_4

    .line 84
    .line 85
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    iget-object v1, v1, Lf2;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Lcom/google/android/material/card/MaterialCardView;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v2

    .line 102
    :cond_4
    :goto_2
    new-instance v1, Lla0;

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    invoke-direct {v1, v0, v2}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_5
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v2

    .line 116
    :pswitch_3
    iget-object v0, p0, Lq00;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;

    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/HelpActivity;->C:Lp21;

    .line 128
    .line 129
    if-eqz v0, :cond_7

    .line 130
    .line 131
    iget-object v0, v0, Lp21;->f:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Landroid/widget/FrameLayout;

    .line 134
    .line 135
    const/16 v1, 0x8

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    :goto_3
    return-void

    .line 141
    :cond_7
    const-string v0, "binding"

    .line 142
    .line 143
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    throw v0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
