.class public final Ler0;
.super Landroid/webkit/WebViewClient;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ler0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ler0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Ler0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Ler0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lu82;

    .line 13
    .line 14
    sget v0, Lu82;->i:I

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    const-string v0, "consent://"

    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object p1, p1, Lu82;->g:Lgi1;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lgi1;->e(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Ler0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Ler0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lu82;

    .line 13
    .line 14
    iget-boolean p2, p1, Lu82;->h:Z

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    iput-boolean p2, p1, Lu82;->h:Z

    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Ler0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 28
    .line 29
    new-instance v0, Lr5;

    .line 30
    .line 31
    const/4 v1, 0x6

    .line 32
    invoke-direct {v0, p1, p2, v1}, Lr5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget-object p1, p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iget-object p1, p1, Lmc2;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 45
    .line 46
    const/16 p2, 0x8

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string p1, "binding"

    .line 53
    .line 54
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :catch_0
    :goto_0
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget v0, p0, Ler0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Ler0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 16
    .line 17
    sget p2, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->F:I

    .line 18
    .line 19
    :try_start_0
    iget-object p1, p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Lmc2;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p1, "binding"

    .line 33
    .line 34
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    :catch_0
    :goto_0
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget v0, p0, Ler0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1
    :pswitch_0
    iget-object p1, p0, Ler0;->b:Ljava/lang/Object;

    check-cast p1, Lu82;

    .line 2
    iget-object p1, p1, Lu82;->g:Lgi1;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    new-instance v0, Lah3;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "WebResourceError("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 6
    const-string p2, ", "

    .line 7
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    const-string p2, "): "

    .line 9
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    invoke-direct {v0, p2, p3}, Lah3;-><init>(Ljava/lang/String;I)V

    iget-object p1, p1, Lgi1;->l:Ljava/lang/Object;

    check-cast p1, Lbw1;

    .line 10
    iget-object p1, p1, Lbw1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    .line 11
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyu1;

    if-nez p1, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lah3;->a()Lbw;

    move-result-object p2

    invoke-virtual {p1, p2}, Lyu1;->j(Lbw;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 2

    iget v0, p0, Ler0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    return-void

    .line 13
    :pswitch_0
    iget-object p1, p0, Ler0;->b:Ljava/lang/Object;

    check-cast p1, Lpf4;

    .line 14
    iget-object p2, p1, Lpf4;->k:Ld32;

    .line 15
    const-string p3, "#007 Could not call remote method."

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v0, v1, v1}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    move-result-object v0

    .line 16
    invoke-interface {p2, v0}, Ld32;->W(Lnx2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 17
    invoke-static {p3, p2}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 18
    :cond_0
    :goto_0
    iget-object p1, p1, Lpf4;->k:Ld32;

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    .line 19
    :try_start_1
    invoke-interface {p1, p2}, Ld32;->I(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 20
    invoke-static {p3, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 4

    .line 1
    iget v0, p0, Ler0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-string v0, "view"

    .line 11
    .line 12
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string p1, "handler"

    .line 16
    .line 17
    invoke-static {p2, p1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string p1, "error"

    .line 21
    .line 22
    invoke-static {p3, p1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Ler0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_0
    new-instance v0, Lt3;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Lt3;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lt3;->b()Lu3;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, v0, Lu3;->k:Ls3;

    .line 47
    .line 48
    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    const-string v2, "getString(...)"

    .line 53
    .line 54
    if-eqz p3, :cond_4

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    if-eq p3, v3, :cond_3

    .line 58
    .line 59
    const/4 v3, 0x2

    .line 60
    if-eq p3, v3, :cond_2

    .line 61
    .line 62
    const/4 v3, 0x3

    .line 63
    if-eq p3, v3, :cond_1

    .line 64
    .line 65
    const-string p3, ""

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const p3, 0x7f12005b

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-static {p3, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    const p3, 0x7f120058

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-static {p3, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    const p3, 0x7f120057

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    invoke-static {p3, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    const p3, 0x7f120059

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    invoke-static {p3, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    const v2, 0x7f120122

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    new-instance v3, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p3, "\n"

    .line 127
    .line 128
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    const v2, 0x7f12005a

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v0, v2}, Lu3;->setTitle(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    iput-object p3, v1, Ls3;->e:Ljava/lang/CharSequence;

    .line 149
    .line 150
    iget-object v2, v1, Ls3;->v:Landroid/widget/TextView;

    .line 151
    .line 152
    if-eqz v2, :cond_5

    .line 153
    .line 154
    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    :cond_5
    const p3, 0x7f120033

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    new-instance v2, Ldr0;

    .line 165
    .line 166
    const/4 v3, 0x0

    .line 167
    invoke-direct {v2, p2, v3}, Ldr0;-><init>(Landroid/webkit/SslErrorHandler;I)V

    .line 168
    .line 169
    .line 170
    const/4 v3, -0x1

    .line 171
    invoke-virtual {v1, v3, p3, v2}, Ls3;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    const p3, 0x7f120031

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p3

    .line 181
    new-instance v2, Ldr0;

    .line 182
    .line 183
    const/4 v3, 0x1

    .line 184
    invoke-direct {v2, p2, v3}, Ldr0;-><init>(Landroid/webkit/SslErrorHandler;I)V

    .line 185
    .line 186
    .line 187
    const/4 p2, -0x2

    .line 188
    invoke-virtual {v1, p2, p3, v2}, Ls3;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-nez p1, :cond_6

    .line 196
    .line 197
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 198
    .line 199
    .line 200
    :cond_6
    :goto_1
    return-void

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 2

    .line 1
    iget v0, p0, Ler0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    add-int/lit8 p2, p2, 0x24

    .line 34
    .line 35
    add-int/2addr p2, v0

    .line 36
    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Ler0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p2, Luc3;

    .line 42
    .line 43
    invoke-virtual {p2}, Lsc3;->c()Landroid/webkit/WebView;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-ne v0, p1, :cond_0

    .line 48
    .line 49
    new-instance v0, Ldd3;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p2, Lsc3;->b:Ldd3;

    .line 56
    .line 57
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 1

    iget v0, p0, Ler0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    move-result p1

    return p1

    .line 1
    :pswitch_0
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ler0;->b:Ljava/lang/Object;

    check-cast p2, Lu82;

    .line 2
    sget v0, Lu82;->i:I

    if-eqz p1, :cond_0

    .line 3
    const-string v0, "consent://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p2, p2, Lu82;->g:Lgi1;

    .line 5
    invoke-virtual {p2, p1}, Lgi1;->e(Ljava/lang/String;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    iget v0, p0, Ler0;->a:I

    iget-object v1, p0, Ler0;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 6
    :pswitch_1
    check-cast v1, Lpf4;

    invoke-virtual {v1}, Lpf4;->C3()Ljava/lang/String;

    move-result-object p1

    iget-object v0, v1, Lpf4;->h:Landroid/content/Context;

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    move v2, v3

    goto/16 :goto_7

    :cond_0
    const-string p1, "gmsg://noAdLoaded"

    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v4, 0x0

    const-string v5, "#007 Could not call remote method."

    if-eqz p1, :cond_3

    .line 8
    iget-object p1, v1, Lpf4;->k:Ld32;

    const/4 p2, 0x3

    if-eqz p1, :cond_1

    .line 9
    :try_start_0
    invoke-static {p2, v4, v4}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Ld32;->W(Lnx2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    invoke-static {v5, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 12
    :cond_1
    :goto_0
    iget-object p1, v1, Lpf4;->k:Ld32;

    if-eqz p1, :cond_2

    .line 13
    :try_start_1
    invoke-interface {p1, p2}, Ld32;->I(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 14
    invoke-static {v5, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 15
    :cond_2
    :goto_1
    invoke-virtual {v1, v3}, Lpf4;->B3(I)V

    goto/16 :goto_7

    :cond_3
    const-string p1, "gmsg://scriptLoadFailed"

    .line 16
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 17
    iget-object p1, v1, Lpf4;->k:Ld32;

    if-eqz p1, :cond_4

    .line 18
    :try_start_2
    invoke-static {v2, v4, v4}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    move-result-object p2

    .line 19
    invoke-interface {p1, p2}, Ld32;->W(Lnx2;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 20
    invoke-static {v5, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    :cond_4
    :goto_2
    iget-object p1, v1, Lpf4;->k:Ld32;

    if-eqz p1, :cond_5

    .line 22
    :try_start_3
    invoke-interface {p1, v3}, Ld32;->I(I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    .line 23
    invoke-static {v5, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 24
    :cond_5
    :goto_3
    invoke-virtual {v1, v3}, Lpf4;->B3(I)V

    goto :goto_7

    :cond_6
    const-string p1, "gmsg://adResized"

    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 26
    iget-object p1, v1, Lpf4;->k:Ld32;

    if-eqz p1, :cond_7

    .line 27
    :try_start_4
    invoke-interface {p1}, Ld32;->c()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception p1

    .line 28
    invoke-static {v5, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 29
    :cond_7
    :goto_4
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "height"

    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_5

    .line 31
    :cond_8
    :try_start_5
    sget-object p2, Lsv1;->f:Lsv1;

    iget-object p2, p2, Lsv1;->a:Lj63;

    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {v0, p1}, Lj63;->b(Landroid/content/Context;I)I

    move-result v3
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    .line 33
    :catch_5
    :goto_5
    invoke-virtual {v1, v3}, Lpf4;->B3(I)V

    goto :goto_7

    :cond_9
    const-string p1, "gmsg://"

    .line 34
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_7

    .line 35
    :cond_a
    iget-object p1, v1, Lpf4;->k:Ld32;

    if-eqz p1, :cond_b

    .line 36
    :try_start_6
    invoke-interface {p1}, Ld32;->f()V

    .line 37
    iget-object p1, v1, Lpf4;->k:Ld32;

    .line 38
    invoke-interface {p1}, Ld32;->b()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception p1

    .line 39
    invoke-static {v5, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 40
    :cond_b
    :goto_6
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 41
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 42
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_7
    return v2

    .line 43
    :pswitch_2
    check-cast v1, Lu82;

    sget p1, Lu82;->i:I

    if-eqz p2, :cond_c

    .line 44
    const-string p1, "consent://"

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 45
    iget-object p1, v1, Lu82;->g:Lgi1;

    .line 46
    invoke-virtual {p1, p2}, Lgi1;->e(Ljava/lang/String;)V

    goto :goto_8

    :cond_c
    move v2, v3

    :goto_8
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
