.class public final synthetic Lia0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lia0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lia0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lia0;->h:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lia0;->f:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lia0;->h:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v2, p0, Lia0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, Lp21;

    .line 12
    .line 13
    check-cast v1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 14
    .line 15
    sget p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->F:I

    .line 16
    .line 17
    iget-object p1, v2, Lp21;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 20
    .line 21
    invoke-virtual {p1}, Ln6;->getText()Landroid/text/Editable;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "http://"

    .line 30
    .line 31
    invoke-static {v2, v3, v0}, Lsy0;->y(Ljava/lang/String;Ljava/lang/CharSequence;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    const-string v4, "https://"

    .line 38
    .line 39
    invoke-static {v2, v4, v0}, Lsy0;->y(Ljava/lang/String;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_0
    invoke-static {p1}, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->y(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, v1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    const-string v4, "binding"

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p1, Lmc2;->j:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Landroid/webkit/WebView;

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    iget-object p1, v1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iget-object p1, p1, Lmc2;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :catch_0
    :goto_0
    return-void

    .line 83
    :cond_2
    invoke-static {v4}, Li30;->S(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v3

    .line 87
    :pswitch_0
    check-cast v2, Lc10;

    .line 88
    .line 89
    check-cast v1, Lol0;

    .line 90
    .line 91
    iget-object p1, v2, Lc10;->k:Lpy;

    .line 92
    .line 93
    check-cast p1, Lwk0;

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Lwk0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_1
    check-cast v2, Lc10;

    .line 100
    .line 101
    check-cast v1, Lzk0;

    .line 102
    .line 103
    iget-object p1, v2, Lc10;->k:Lpy;

    .line 104
    .line 105
    check-cast p1, Lwk0;

    .line 106
    .line 107
    invoke-virtual {p1, v1}, Lwk0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_2
    check-cast v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 112
    .line 113
    check-cast v1, Landroid/app/Dialog;

    .line 114
    .line 115
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 116
    .line 117
    const-string p1, "c"

    .line 118
    .line 119
    invoke-static {v2, p1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, Landroid/content/Intent;

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    new-instance v4, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v5, "market://details?id="

    .line 131
    .line 132
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const-string v4, "android.intent.action.VIEW"

    .line 147
    .line 148
    invoke-direct {p1, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 149
    .line 150
    .line 151
    const/high16 v3, 0x10000000

    .line 152
    .line 153
    :try_start_1
    invoke-virtual {p1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :catch_1
    move-exception p1

    .line 161
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 162
    .line 163
    .line 164
    :goto_1
    invoke-virtual {v2}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C()Landroid/content/SharedPreferences;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    const-string v2, "ratedialog"

    .line 173
    .line 174
    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 175
    .line 176
    .line 177
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 178
    .line 179
    .line 180
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
