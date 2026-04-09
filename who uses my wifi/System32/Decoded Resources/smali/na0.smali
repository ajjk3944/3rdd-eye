.class public final synthetic Lna0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;


# direct methods
.method public synthetic constructor <init>(ZLcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V
    .locals 0

    .line 1
    iput p3, p0, Lna0;->f:I

    .line 2
    .line 3
    iput-boolean p1, p0, Lna0;->g:Z

    .line 4
    .line 5
    iput-object p2, p0, Lna0;->h:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lna0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-boolean v1, p0, Lna0;->g:Z

    .line 8
    .line 9
    iget-object v2, p0, Lna0;->h:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 10
    .line 11
    const-string v3, "binding"

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v0, v1, Lf2;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lxi;

    .line 22
    .line 23
    iget-object v0, v0, Lxi;->c:Landroid/widget/ImageView;

    .line 24
    .line 25
    const v1, 0x7f0800c0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    iget-object v1, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-object v0, v1, Lf2;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lxi;

    .line 43
    .line 44
    iget-object v0, v0, Lxi;->c:Landroid/widget/ImageView;

    .line 45
    .line 46
    const v1, 0x7f0800bf

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void

    .line 53
    :cond_2
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :pswitch_0
    const/4 v0, 0x0

    .line 58
    iget-boolean v1, p0, Lna0;->g:Z

    .line 59
    .line 60
    iget-object v2, p0, Lna0;->h:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 61
    .line 62
    const/16 v3, 0x8

    .line 63
    .line 64
    const-string v4, "binding"

    .line 65
    .line 66
    if-eqz v1, :cond_7

    .line 67
    .line 68
    iget-object v1, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 69
    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    iget-object v1, v1, Lf2;->g:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 75
    .line 76
    new-instance v5, Lea0;

    .line 77
    .line 78
    const/4 v6, 0x2

    .line 79
    invoke-direct {v5, v2, v6}, Lea0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    const v5, 0x7f0800b3

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageResource(I)V

    .line 89
    .line 90
    .line 91
    iget-object v1, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    iget-object v1, v1, Lf2;->i:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 98
    .line 99
    const/4 v5, 0x0

    .line 100
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    iget-object v1, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 104
    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    iget-object v1, v1, Lf2;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Lcom/google/android/material/card/MaterialCardView;

    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-ne v1, v3, :cond_8

    .line 116
    .line 117
    iget-object v1, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 118
    .line 119
    if-eqz v1, :cond_3

    .line 120
    .line 121
    iget-object v0, v1, Lf2;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lcom/google/android/material/card/MaterialCardView;

    .line 124
    .line 125
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_4
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_5
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_6
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_7
    iget-object v1, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 146
    .line 147
    if-eqz v1, :cond_a

    .line 148
    .line 149
    iget-object v1, v1, Lf2;->g:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 152
    .line 153
    new-instance v5, Lea0;

    .line 154
    .line 155
    const/4 v6, 0x3

    .line 156
    invoke-direct {v5, v2, v6}, Lea0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    const v5, 0x7f0800f6

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageResource(I)V

    .line 166
    .line 167
    .line 168
    iget-object v1, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 169
    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    iget-object v0, v1, Lf2;->i:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 175
    .line 176
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    .line 179
    :cond_8
    :goto_1
    return-void

    .line 180
    :cond_9
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :cond_a
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v0

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
