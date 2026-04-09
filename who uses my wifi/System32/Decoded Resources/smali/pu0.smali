.class public final synthetic Lpu0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lul0;
.implements Lmz;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpu0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lpu0;->g:Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lbw;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget v0, p1, Lbw;->b:I

    .line 4
    .line 5
    iget-object p1, p1, Lbw;->a:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, ": "

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "msg"

    .line 28
    .line 29
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lpu0;->g:Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;

    .line 33
    .line 34
    iget-object v0, p1, Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;->h0:Lf20;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    const-string v2, "googleMobileAdsConsentManager"

    .line 38
    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    iget-object v0, v0, Lf20;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lva4;

    .line 44
    .line 45
    invoke-virtual {v0}, Lva4;->b()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v3, 0x3

    .line 50
    if-ne v0, v3, :cond_4

    .line 51
    .line 52
    const-string v0, "key_privacy_settings"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lbm0;->N(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget-object v4, p1, Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;->h0:Lf20;

    .line 61
    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    iget-object v1, v4, Lf20;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lva4;

    .line 67
    .line 68
    invoke-virtual {v1}, Lva4;->b()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-ne v1, v3, :cond_1

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 v1, 0x0

    .line 77
    :goto_0
    iget-boolean v2, v0, Landroidx/preference/Preference;->B:Z

    .line 78
    .line 79
    if-eq v2, v1, :cond_3

    .line 80
    .line 81
    iput-boolean v1, v0, Landroidx/preference/Preference;->B:Z

    .line 82
    .line 83
    iget-object v1, v0, Landroidx/preference/Preference;->L:Lem0;

    .line 84
    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    iget-object v2, v1, Lem0;->m:Landroid/os/Handler;

    .line 88
    .line 89
    iget-object v1, v1, Lem0;->n:La9;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v1

    .line 102
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 103
    .line 104
    new-instance v1, Lpu0;

    .line 105
    .line 106
    const/4 v2, 0x5

    .line 107
    invoke-direct {v1, p1, v2}, Lpu0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;I)V

    .line 108
    .line 109
    .line 110
    iput-object v1, v0, Landroidx/preference/Preference;->k:Lul0;

    .line 111
    .line 112
    :cond_4
    return-void

    .line 113
    :cond_5
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1
.end method

.method public b(Landroidx/preference/Preference;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lpu0;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lpu0;->g:Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;

    .line 9
    .line 10
    iget-object v2, v0, Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;->h0:Lf20;

    .line 11
    .line 12
    if-eqz v2, :cond_7

    .line 13
    .line 14
    invoke-virtual {v0}, Liw;->F()Li5;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    new-instance v2, Llz;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v2, v3, v0}, Llz;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v5}, Lgi1;->c(Landroid/content/Context;)Lgi1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, Lgi1;->j:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lls2;

    .line 31
    .line 32
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lz42;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lok2;->a()V

    .line 42
    .line 43
    .line 44
    invoke-static {v5}, Lgi1;->c(Landroid/content/Context;)Lgi1;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v3, v3, Lgi1;->l:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Lls2;

    .line 51
    .line 52
    invoke-virtual {v3}, Lls2;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lva4;

    .line 57
    .line 58
    if-nez v3, :cond_0

    .line 59
    .line 60
    sget-object v0, Lok2;->a:Landroid/os/Handler;

    .line 61
    .line 62
    new-instance v3, La12;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-direct {v3, v2, v4}, La12;-><init>(Llz;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 69
    .line 70
    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_0
    iget-object v4, v3, Lva4;->c:Lz42;

    .line 74
    .line 75
    iget-object v4, v4, Lz42;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const/4 v6, 0x2

    .line 82
    if-eqz v4, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v3}, Lva4;->b()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-ne v4, v6, :cond_4

    .line 90
    .line 91
    :goto_0
    invoke-virtual {v3}, Lva4;->b()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-ne v3, v6, :cond_2

    .line 96
    .line 97
    sget-object v0, Lok2;->a:Landroid/os/Handler;

    .line 98
    .line 99
    new-instance v3, La12;

    .line 100
    .line 101
    const/4 v4, 0x2

    .line 102
    invoke-direct {v3, v2, v4}, La12;-><init>(Llz;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 106
    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :cond_2
    iget-object v3, v0, Lz42;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lbw1;

    .line 117
    .line 118
    if-nez v3, :cond_3

    .line 119
    .line 120
    sget-object v0, Lok2;->a:Landroid/os/Handler;

    .line 121
    .line 122
    new-instance v3, La12;

    .line 123
    .line 124
    const/4 v4, 0x3

    .line 125
    invoke-direct {v3, v2, v4}, La12;-><init>(Llz;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    invoke-virtual {v3, v5, v2}, Lbw1;->a(Li5;Llz;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, v0, Lz42;->b:Ljava/util/concurrent/Executor;

    .line 136
    .line 137
    new-instance v3, Lfu1;

    .line 138
    .line 139
    const/16 v4, 0x8

    .line 140
    .line 141
    invoke-direct {v3, v4, v0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    sget-object v0, Lok2;->a:Landroid/os/Handler;

    .line 149
    .line 150
    new-instance v4, La12;

    .line 151
    .line 152
    const/4 v6, 0x1

    .line 153
    invoke-direct {v4, v2, v6}, La12;-><init>(Llz;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Lva4;->c()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    iget-object v2, v3, Lva4;->e:Ljava/lang/Object;

    .line 166
    .line 167
    monitor-enter v2

    .line 168
    :try_start_0
    iget-boolean v0, v3, Lva4;->g:Z

    .line 169
    .line 170
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_5
    iget-object v4, v3, Lva4;->e:Ljava/lang/Object;

    .line 175
    .line 176
    monitor-enter v4

    .line 177
    const/4 v0, 0x1

    .line 178
    :try_start_1
    iput-boolean v0, v3, Lva4;->g:Z

    .line 179
    .line 180
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    iget-object v4, v3, Lva4;->b:Lgi1;

    .line 182
    .line 183
    iget-object v6, v3, Lva4;->h:Lfr;

    .line 184
    .line 185
    new-instance v7, Lrc3;

    .line 186
    .line 187
    const/4 v0, 0x4

    .line 188
    invoke-direct {v7, v0, v3}, Lrc3;-><init>(ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    new-instance v8, Lci3;

    .line 192
    .line 193
    const/4 v0, 0x3

    .line 194
    invoke-direct {v8, v0, v3}, Lci3;-><init>(ILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    new-instance v3, Lea1;

    .line 201
    .line 202
    const/4 v9, 0x6

    .line 203
    const/4 v10, 0x0

    .line 204
    invoke-direct/range {v3 .. v10}, Lea1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 205
    .line 206
    .line 207
    iget-object v0, v4, Lgi1;->h:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 210
    .line 211
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :catchall_0
    move-exception v0

    .line 216
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 217
    throw v0

    .line 218
    :catchall_1
    move-exception v0

    .line 219
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 220
    throw v0

    .line 221
    :cond_6
    :goto_1
    invoke-virtual {v3}, Lva4;->c()Z

    .line 222
    .line 223
    .line 224
    iget-object v2, v3, Lva4;->e:Ljava/lang/Object;

    .line 225
    .line 226
    monitor-enter v2

    .line 227
    :try_start_4
    monitor-exit v2

    .line 228
    :goto_2
    return-void

    .line 229
    :catchall_2
    move-exception v0

    .line 230
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 231
    throw v0

    .line 232
    :cond_7
    const-string v0, "googleMobileAdsConsentManager"

    .line 233
    .line 234
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    throw v0

    .line 239
    :pswitch_0
    iget-object v0, v1, Lpu0;->g:Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;

    .line 240
    .line 241
    invoke-virtual {v0}, Liw;->F()Li5;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    const v0, 0x7f1200f1

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    const-string v3, "getString(...)"

    .line 253
    .line 254
    invoke-static {v0, v3}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    :try_start_5
    new-instance v0, Lrl;

    .line 262
    .line 263
    invoke-direct {v0}, Lrl;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Lrl;->a()Ll92;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    iget-object v4, v0, Ll92;->f:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v4, Landroid/content/Intent;

    .line 273
    .line 274
    invoke-virtual {v4, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 275
    .line 276
    .line 277
    iget-object v0, v0, Ll92;->g:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, Landroid/os/Bundle;

    .line 280
    .line 281
    invoke-virtual {v2, v4, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_5
    .catch Landroid/content/ActivityNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :catch_0
    move-exception v0

    .line 286
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    const/4 v4, 0x1

    .line 291
    invoke-static {v2, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 296
    .line 297
    .line 298
    new-instance v0, Landroid/content/Intent;

    .line 299
    .line 300
    const-string v4, "android.intent.action.VIEW"

    .line 301
    .line 302
    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    const-string v3, "setData(...)"

    .line 310
    .line 311
    invoke-static {v0, v3}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    const/high16 v3, 0x10000000

    .line 315
    .line 316
    :try_start_6
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_6
    .catch Landroid/content/ActivityNotFoundException; {:try_start_6 .. :try_end_6} :catch_1

    .line 320
    .line 321
    .line 322
    goto :goto_3

    .line 323
    :catch_1
    move-exception v0

    .line 324
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 325
    .line 326
    .line 327
    :goto_3
    return-void

    .line 328
    :pswitch_1
    iget-object v0, v1, Lpu0;->g:Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;

    .line 329
    .line 330
    invoke-virtual {v0}, Liw;->G()Landroid/content/Context;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    new-instance v2, Landroid/content/Intent;

    .line 335
    .line 336
    const-string v3, "android.intent.action.SENDTO"

    .line 337
    .line 338
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const-string v3, "message/rfc822"

    .line 342
    .line 343
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 344
    .line 345
    .line 346
    const-string v3, "mailto:"

    .line 347
    .line 348
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 353
    .line 354
    .line 355
    const-string v3, "android.intent.extra.EMAIL"

    .line 356
    .line 357
    const-string v4, "phuongpndevteam@gmail.com"

    .line 358
    .line 359
    filled-new-array {v4}, [Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 364
    .line 365
    .line 366
    const-string v3, "android.intent.extra.SUBJECT"

    .line 367
    .line 368
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 369
    .line 370
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 371
    .line 372
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 373
    .line 374
    new-instance v7, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    const-string v8, "Feedback WhoUsesMyWiFi.v1.9.2 ("

    .line 377
    .line 378
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    const-string v4, " "

    .line 385
    .line 386
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    const-string v4, " OS"

    .line 393
    .line 394
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    const-string v4, ")"

    .line 401
    .line 402
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 410
    .line 411
    .line 412
    const/high16 v3, 0x10000000

    .line 413
    .line 414
    :try_start_7
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 415
    .line 416
    .line 417
    const-string v3, "Send feedback"

    .line 418
    .line 419
    invoke-static {v2, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 424
    .line 425
    .line 426
    goto :goto_4

    .line 427
    :catch_2
    move-exception v0

    .line 428
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 429
    .line 430
    .line 431
    :goto_4
    return-void

    .line 432
    :pswitch_2
    iget-object v0, v1, Lpu0;->g:Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;

    .line 433
    .line 434
    new-instance v2, Landroid/app/Dialog;

    .line 435
    .line 436
    invoke-virtual {v0}, Liw;->G()Landroid/content/Context;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    const v3, 0x7f13012f

    .line 441
    .line 442
    .line 443
    invoke-direct {v2, v0, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 444
    .line 445
    .line 446
    const/4 v0, 0x1

    .line 447
    invoke-virtual {v2, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 448
    .line 449
    .line 450
    const v3, 0x7f0c003b

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setContentView(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 457
    .line 458
    .line 459
    const v0, 0x7f09008f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    check-cast v0, Landroid/widget/Button;

    .line 467
    .line 468
    new-instance v3, Luk0;

    .line 469
    .line 470
    const/4 v4, 0x2

    .line 471
    invoke-direct {v3, v2, v4}, Luk0;-><init>(Landroid/app/Dialog;I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_3
    iget-object v0, v1, Lpu0;->g:Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;

    .line 482
    .line 483
    new-instance v2, Lq50;

    .line 484
    .line 485
    invoke-virtual {v0}, Liw;->g()Li5;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 490
    .line 491
    .line 492
    new-instance v3, Ljava/util/HashMap;

    .line 493
    .line 494
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 495
    .line 496
    .line 497
    iput-object v3, v2, Lq50;->b:Ljava/lang/Object;

    .line 498
    .line 499
    new-instance v3, Ljava/lang/StringBuilder;

    .line 500
    .line 501
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 502
    .line 503
    .line 504
    iput-object v3, v2, Lq50;->c:Ljava/io/Serializable;

    .line 505
    .line 506
    const-string v3, "Notices for files:"

    .line 507
    .line 508
    iput-object v3, v2, Lq50;->d:Ljava/io/Serializable;

    .line 509
    .line 510
    const/4 v3, -0x1

    .line 511
    iput v3, v2, Lq50;->a:I

    .line 512
    .line 513
    iput-object v0, v2, Lq50;->h:Ljava/lang/Object;

    .line 514
    .line 515
    instance-of v4, v0, Li5;

    .line 516
    .line 517
    if-eqz v4, :cond_1e

    .line 518
    .line 519
    new-instance v4, Lt3;

    .line 520
    .line 521
    if-eqz v0, :cond_1d

    .line 522
    .line 523
    const/4 v5, 0x0

    .line 524
    invoke-direct {v4, v0, v5}, Lt3;-><init>(Landroid/content/Context;I)V

    .line 525
    .line 526
    .line 527
    iput-object v4, v2, Lq50;->e:Ljava/lang/Object;

    .line 528
    .line 529
    new-instance v6, Landroid/webkit/WebView;

    .line 530
    .line 531
    invoke-direct {v6, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 532
    .line 533
    .line 534
    iput-object v6, v2, Lq50;->g:Ljava/lang/Object;

    .line 535
    .line 536
    new-instance v7, Landroid/widget/LinearLayout;

    .line 537
    .line 538
    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 539
    .line 540
    .line 541
    const/4 v0, 0x1

    .line 542
    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 543
    .line 544
    .line 545
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 546
    .line 547
    const/4 v9, -0x2

    .line 548
    invoke-direct {v8, v3, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 549
    .line 550
    .line 551
    const/16 v3, 0x10

    .line 552
    .line 553
    int-to-float v3, v3

    .line 554
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 555
    .line 556
    .line 557
    move-result-object v9

    .line 558
    const-string v10, "Resources.getSystem()"

    .line 559
    .line 560
    invoke-static {v9, v10}, Li30;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 564
    .line 565
    .line 566
    move-result-object v9

    .line 567
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 568
    .line 569
    mul-float/2addr v3, v9

    .line 570
    float-to-int v3, v3

    .line 571
    invoke-virtual {v8, v5, v3, v5, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    if-eqz v3, :cond_8

    .line 579
    .line 580
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 581
    .line 582
    .line 583
    :cond_8
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    if-eqz v3, :cond_9

    .line 588
    .line 589
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 590
    .line 591
    .line 592
    :cond_9
    const/4 v0, 0x2

    .line 593
    const/4 v3, 0x0

    .line 594
    invoke-virtual {v6, v0, v3}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    if-eqz v0, :cond_a

    .line 602
    .line 603
    invoke-virtual {v0, v5}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 604
    .line 605
    .line 606
    :cond_a
    new-instance v0, Lp50;

    .line 607
    .line 608
    invoke-direct {v0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v6, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v7, v6, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 615
    .line 616
    .line 617
    iget-object v0, v4, Lt3;->h:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v0, Lp3;

    .line 620
    .line 621
    iput-object v7, v0, Lp3;->o:Landroid/view/View;

    .line 622
    .line 623
    iget-object v0, v2, Lq50;->h:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v0, Landroid/content/Context;

    .line 626
    .line 627
    const-string v3, "Licenses"

    .line 628
    .line 629
    iget-object v4, v2, Lq50;->e:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v4, Lt3;

    .line 632
    .line 633
    if-eqz v4, :cond_b

    .line 634
    .line 635
    iget-object v4, v4, Lt3;->h:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v4, Lp3;

    .line 638
    .line 639
    iput-object v3, v4, Lp3;->d:Ljava/lang/CharSequence;

    .line 640
    .line 641
    :cond_b
    new-instance v3, Ln50;

    .line 642
    .line 643
    const-string v4, "Android Support Libraries"

    .line 644
    .line 645
    const-string v5, "https://developer.android.com/topic/libraries/support-library/index.html"

    .line 646
    .line 647
    sget-object v6, Lo50;->c:Lo50;

    .line 648
    .line 649
    invoke-direct {v3, v4, v5, v6}, Ln50;-><init>(Ljava/lang/String;Ljava/lang/String;Lo50;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v2, v3}, Lq50;->c(Ln50;)V

    .line 653
    .line 654
    .line 655
    new-instance v3, Ln50;

    .line 656
    .line 657
    const-string v4, "Licenser"

    .line 658
    .line 659
    const-string v5, "https://github.com/marcoscgdev/Licenser"

    .line 660
    .line 661
    sget-object v7, Lo50;->e:Lo50;

    .line 662
    .line 663
    invoke-direct {v3, v4, v5, v7}, Ln50;-><init>(Ljava/lang/String;Ljava/lang/String;Lo50;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v2, v3}, Lq50;->c(Ln50;)V

    .line 667
    .line 668
    .line 669
    new-instance v3, Ln50;

    .line 670
    .line 671
    const-string v4, "MP Android Chart"

    .line 672
    .line 673
    const-string v5, "https://github.com/PhilJay/MPAndroidChart"

    .line 674
    .line 675
    invoke-direct {v3, v4, v5, v6}, Ln50;-><init>(Ljava/lang/String;Ljava/lang/String;Lo50;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2, v3}, Lq50;->c(Ln50;)V

    .line 679
    .line 680
    .line 681
    new-instance v3, Ln50;

    .line 682
    .line 683
    const-string v4, "dnsjava"

    .line 684
    .line 685
    const-string v5, "https://github.com/dnsjava/dnsjava"

    .line 686
    .line 687
    sget-object v7, Lo50;->d:Lo50;

    .line 688
    .line 689
    invoke-direct {v3, v4, v5, v7}, Ln50;-><init>(Ljava/lang/String;Ljava/lang/String;Lo50;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v3}, Lq50;->c(Ln50;)V

    .line 693
    .line 694
    .line 695
    new-instance v3, Ln50;

    .line 696
    .line 697
    const-string v4, "Lottie"

    .line 698
    .line 699
    const-string v5, "https://github.com/airbnb/lottie-android"

    .line 700
    .line 701
    invoke-direct {v3, v4, v5, v6}, Ln50;-><init>(Ljava/lang/String;Ljava/lang/String;Lo50;)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v2, v3}, Lq50;->c(Ln50;)V

    .line 705
    .line 706
    .line 707
    new-instance v3, Lqu0;

    .line 708
    .line 709
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 710
    .line 711
    .line 712
    const/4 v4, 0x0

    .line 713
    if-eqz v0, :cond_c

    .line 714
    .line 715
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    if-eqz v5, :cond_c

    .line 720
    .line 721
    const v6, 0x104000a

    .line 722
    .line 723
    .line 724
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v5

    .line 728
    goto :goto_5

    .line 729
    :cond_c
    move-object v5, v4

    .line 730
    :goto_5
    iget-object v6, v2, Lq50;->e:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v6, Lt3;

    .line 733
    .line 734
    if-eqz v6, :cond_d

    .line 735
    .line 736
    invoke-virtual {v6, v5, v3}, Lt3;->g(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 737
    .line 738
    .line 739
    :cond_d
    iget-object v3, v2, Lq50;->g:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v3, Landroid/webkit/WebView;

    .line 742
    .line 743
    if-eqz v3, :cond_e

    .line 744
    .line 745
    invoke-virtual {v3}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v5

    .line 749
    goto :goto_6

    .line 750
    :cond_e
    move-object v5, v4

    .line 751
    :goto_6
    if-nez v5, :cond_19

    .line 752
    .line 753
    if-eqz v3, :cond_19

    .line 754
    .line 755
    iget-object v5, v2, Lq50;->c:Ljava/io/Serializable;

    .line 756
    .line 757
    check-cast v5, Ljava/lang/StringBuilder;

    .line 758
    .line 759
    iget v6, v2, Lq50;->a:I

    .line 760
    .line 761
    const/4 v7, 0x1

    .line 762
    const/4 v8, -0x1

    .line 763
    if-ne v6, v8, :cond_11

    .line 764
    .line 765
    if-eqz v0, :cond_10

    .line 766
    .line 767
    new-instance v6, Landroid/util/TypedValue;

    .line 768
    .line 769
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    const v9, 0x7f04010a

    .line 777
    .line 778
    .line 779
    invoke-virtual {v0, v9, v6, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 780
    .line 781
    .line 782
    move-result v0

    .line 783
    if-eqz v0, :cond_f

    .line 784
    .line 785
    iget v0, v6, Landroid/util/TypedValue;->data:I

    .line 786
    .line 787
    goto :goto_7

    .line 788
    :cond_f
    move v0, v8

    .line 789
    :goto_7
    iput v0, v2, Lq50;->a:I

    .line 790
    .line 791
    goto :goto_8

    .line 792
    :cond_10
    new-instance v0, Lb50;

    .line 793
    .line 794
    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    .line 795
    .line 796
    .line 797
    const-class v2, Li30;

    .line 798
    .line 799
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    invoke-static {v0, v2}, Li30;->Q(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    throw v0

    .line 807
    :cond_11
    :goto_8
    iget v0, v2, Lq50;->a:I

    .line 808
    .line 809
    const/4 v6, 0x3

    .line 810
    new-array v6, v6, [F

    .line 811
    .line 812
    invoke-static {v0, v6}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 813
    .line 814
    .line 815
    const/4 v0, 0x2

    .line 816
    aget v9, v6, v0

    .line 817
    .line 818
    const v10, 0x3f4ccccd    # 0.8f

    .line 819
    .line 820
    .line 821
    mul-float/2addr v9, v10

    .line 822
    aput v9, v6, v0

    .line 823
    .line 824
    invoke-static {v6}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    iget v6, v2, Lq50;->a:I

    .line 829
    .line 830
    const/16 v9, 0xff

    .line 831
    .line 832
    const/high16 v10, -0x1000000

    .line 833
    .line 834
    if-ne v6, v10, :cond_12

    .line 835
    .line 836
    goto :goto_9

    .line 837
    :cond_12
    if-eq v6, v8, :cond_15

    .line 838
    .line 839
    if-nez v6, :cond_13

    .line 840
    .line 841
    goto :goto_a

    .line 842
    :cond_13
    int-to-double v11, v7

    .line 843
    invoke-static {v6}, Landroid/graphics/Color;->red(I)I

    .line 844
    .line 845
    .line 846
    move-result v13

    .line 847
    int-to-double v13, v13

    .line 848
    const-wide v15, 0x3fd322d0e5604189L    # 0.299

    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    mul-double/2addr v13, v15

    .line 854
    invoke-static {v6}, Landroid/graphics/Color;->green(I)I

    .line 855
    .line 856
    .line 857
    move-result v15

    .line 858
    move-wide/from16 v16, v11

    .line 859
    .line 860
    int-to-double v10, v15

    .line 861
    const-wide v18, 0x3fe2c8b439581062L    # 0.587

    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    mul-double v10, v10, v18

    .line 867
    .line 868
    add-double/2addr v10, v13

    .line 869
    invoke-static {v6}, Landroid/graphics/Color;->blue(I)I

    .line 870
    .line 871
    .line 872
    move-result v6

    .line 873
    int-to-double v12, v6

    .line 874
    const-wide v14, 0x3fbd2f1a9fbe76c9L    # 0.114

    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    mul-double/2addr v12, v14

    .line 880
    add-double/2addr v12, v10

    .line 881
    int-to-double v10, v9

    .line 882
    div-double/2addr v12, v10

    .line 883
    sub-double v11, v16, v12

    .line 884
    .line 885
    const-wide v13, 0x3fd999999999999aL    # 0.4

    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    cmpg-double v6, v11, v13

    .line 891
    .line 892
    if-gez v6, :cond_14

    .line 893
    .line 894
    goto :goto_a

    .line 895
    :cond_14
    :goto_9
    iget v0, v2, Lq50;->a:I

    .line 896
    .line 897
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 898
    .line 899
    .line 900
    move-result v6

    .line 901
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 902
    .line 903
    .line 904
    move-result v10

    .line 905
    int-to-float v10, v10

    .line 906
    int-to-float v9, v9

    .line 907
    const v11, 0x3e19999a    # 0.15f

    .line 908
    .line 909
    .line 910
    mul-float/2addr v9, v11

    .line 911
    add-float/2addr v10, v9

    .line 912
    const/high16 v11, 0x437f0000    # 255.0f

    .line 913
    .line 914
    invoke-static {v11, v10}, Ljava/lang/Math;->min(FF)F

    .line 915
    .line 916
    .line 917
    move-result v10

    .line 918
    invoke-static {v10}, Lpu1;->l(F)I

    .line 919
    .line 920
    .line 921
    move-result v10

    .line 922
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 923
    .line 924
    .line 925
    move-result v12

    .line 926
    int-to-float v12, v12

    .line 927
    add-float/2addr v12, v9

    .line 928
    invoke-static {v11, v12}, Ljava/lang/Math;->min(FF)F

    .line 929
    .line 930
    .line 931
    move-result v12

    .line 932
    invoke-static {v12}, Lpu1;->l(F)I

    .line 933
    .line 934
    .line 935
    move-result v12

    .line 936
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    int-to-float v0, v0

    .line 941
    add-float/2addr v0, v9

    .line 942
    invoke-static {v11, v0}, Ljava/lang/Math;->min(FF)F

    .line 943
    .line 944
    .line 945
    move-result v0

    .line 946
    invoke-static {v0}, Lpu1;->l(F)I

    .line 947
    .line 948
    .line 949
    move-result v0

    .line 950
    invoke-static {v6, v10, v12, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 951
    .line 952
    .line 953
    move-result v0

    .line 954
    goto :goto_b

    .line 955
    :cond_15
    :goto_a
    const/high16 v8, -0x1000000

    .line 956
    .line 957
    :goto_b
    iget v6, v2, Lq50;->a:I

    .line 958
    .line 959
    const/4 v9, 0x0

    .line 960
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 961
    .line 962
    .line 963
    const-string v9, "<html><head>"

    .line 964
    .line 965
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 966
    .line 967
    .line 968
    const-string v9, "<meta charset=\"utf-8\">\n"

    .line 969
    .line 970
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 971
    .line 972
    .line 973
    const-string v9, "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n"

    .line 974
    .line 975
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 976
    .line 977
    .line 978
    const-string v9, "<style>body{font-family:sans-serif;margin:0;padding-left:8px;padding-right:8px;background-color:"

    .line 979
    .line 980
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 981
    .line 982
    .line 983
    invoke-static {v6}, Lum;->f(I)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v6

    .line 987
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    const-string v6, ";color:"

    .line 991
    .line 992
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 993
    .line 994
    .line 995
    invoke-static {v8}, Lum;->f(I)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v9

    .line 999
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    .line 1002
    const-string v9, ";}"

    .line 1003
    .line 1004
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    const-string v9, "a{color:"

    .line 1008
    .line 1009
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    .line 1012
    invoke-static {v8}, Lum;->f(I)Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v9

    .line 1016
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1017
    .line 1018
    .line 1019
    const-string v9, ";}li{margin:0 0 4px;}pre{padding:1em;white-space:pre-wrap;margin:0;background-color:"

    .line 1020
    .line 1021
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    invoke-static {v0}, Lum;->f(I)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1032
    .line 1033
    .line 1034
    invoke-static {v8}, Lum;->f(I)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1039
    .line 1040
    .line 1041
    const-string v0, ";}h3{margin-left:16px;}ul{margin-top:-12px;}</style>\n"

    .line 1042
    .line 1043
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1044
    .line 1045
    .line 1046
    const-string v0, "</head><body>"

    .line 1047
    .line 1048
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    .line 1051
    iget-object v0, v2, Lq50;->b:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v0, Ljava/util/HashMap;

    .line 1054
    .line 1055
    new-instance v6, Lbk;

    .line 1056
    .line 1057
    const/4 v8, 0x2

    .line 1058
    invoke-direct {v6, v8}, Lbk;-><init>(I)V

    .line 1059
    .line 1060
    .line 1061
    const-string v8, "<this>"

    .line 1062
    .line 1063
    invoke-static {v0, v8}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1064
    .line 1065
    .line 1066
    new-instance v8, Ljava/util/TreeMap;

    .line 1067
    .line 1068
    invoke-direct {v8, v6}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v8, v0}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v8}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    :cond_16
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v6

    .line 1086
    if-eqz v6, :cond_18

    .line 1087
    .line 1088
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v6

    .line 1092
    check-cast v6, Ljava/util/Map$Entry;

    .line 1093
    .line 1094
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v8

    .line 1098
    const-string v9, "lib.key"

    .line 1099
    .line 1100
    invoke-static {v8, v9}, Li30;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    check-cast v8, Lo50;

    .line 1104
    .line 1105
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v6

    .line 1109
    check-cast v6, Ljava/util/List;

    .line 1110
    .line 1111
    if-eqz v6, :cond_16

    .line 1112
    .line 1113
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1114
    .line 1115
    .line 1116
    move-result v9

    .line 1117
    if-nez v9, :cond_16

    .line 1118
    .line 1119
    const-string v9, "<h3>"

    .line 1120
    .line 1121
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    .line 1124
    iget-object v9, v2, Lq50;->d:Ljava/io/Serializable;

    .line 1125
    .line 1126
    check-cast v9, Ljava/lang/String;

    .line 1127
    .line 1128
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1129
    .line 1130
    .line 1131
    const-string v9, "</h3>"

    .line 1132
    .line 1133
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1134
    .line 1135
    .line 1136
    const-string v9, "<ul>"

    .line 1137
    .line 1138
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    .line 1141
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v6

    .line 1145
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1146
    .line 1147
    .line 1148
    move-result v9

    .line 1149
    if-eqz v9, :cond_17

    .line 1150
    .line 1151
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v9

    .line 1155
    check-cast v9, Ln50;

    .line 1156
    .line 1157
    iget-object v10, v9, Ln50;->a:Ljava/lang/String;

    .line 1158
    .line 1159
    iget-object v9, v9, Ln50;->b:Ljava/lang/String;

    .line 1160
    .line 1161
    const-string v11, "<li><a href=\""

    .line 1162
    .line 1163
    const-string v12, "\"><b>"

    .line 1164
    .line 1165
    invoke-static {v5, v11, v9, v12, v10}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1166
    .line 1167
    .line 1168
    const-string v9, "</b></a></li>"

    .line 1169
    .line 1170
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1171
    .line 1172
    .line 1173
    goto :goto_d

    .line 1174
    :cond_17
    const-string v6, "</ul>"

    .line 1175
    .line 1176
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1177
    .line 1178
    .line 1179
    const-string v6, "<pre>"

    .line 1180
    .line 1181
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1182
    .line 1183
    .line 1184
    iget-object v6, v8, Lo50;->b:Ljava/lang/String;

    .line 1185
    .line 1186
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1187
    .line 1188
    .line 1189
    const-string v6, "</pre>"

    .line 1190
    .line 1191
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1192
    .line 1193
    .line 1194
    goto :goto_c

    .line 1195
    :cond_18
    const-string v0, "</body></html>"

    .line 1196
    .line 1197
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    const-string v5, "stringBuilder.toString()"

    .line 1205
    .line 1206
    invoke-static {v0, v5}, Li30;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    sget-object v5, Lie;->a:Ljava/nio/charset/Charset;

    .line 1210
    .line 1211
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    const-string v5, "(this as java.lang.String).getBytes(charset)"

    .line 1216
    .line 1217
    invoke-static {v0, v5}, Li30;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    invoke-static {v0, v7}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    const-string v5, "text/html; charset=UTF-8"

    .line 1225
    .line 1226
    const-string v6, "base64"

    .line 1227
    .line 1228
    invoke-virtual {v3, v0, v5, v6}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    :cond_19
    iget-object v0, v2, Lq50;->f:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v0, Lu3;

    .line 1234
    .line 1235
    if-nez v0, :cond_1b

    .line 1236
    .line 1237
    iget-object v0, v2, Lq50;->e:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v0, Lt3;

    .line 1240
    .line 1241
    if-eqz v0, :cond_1a

    .line 1242
    .line 1243
    invoke-virtual {v0}, Lt3;->b()Lu3;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v4

    .line 1247
    :cond_1a
    iput-object v4, v2, Lq50;->f:Ljava/lang/Object;

    .line 1248
    .line 1249
    :cond_1b
    iget-object v0, v2, Lq50;->f:Ljava/lang/Object;

    .line 1250
    .line 1251
    check-cast v0, Lu3;

    .line 1252
    .line 1253
    if-eqz v0, :cond_1c

    .line 1254
    .line 1255
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 1256
    .line 1257
    .line 1258
    :cond_1c
    return-void

    .line 1259
    :cond_1d
    new-instance v0, Lb50;

    .line 1260
    .line 1261
    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    .line 1262
    .line 1263
    .line 1264
    const-class v2, Li30;

    .line 1265
    .line 1266
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v2

    .line 1270
    invoke-static {v0, v2}, Li30;->Q(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 1271
    .line 1272
    .line 1273
    throw v0

    .line 1274
    :cond_1e
    if-nez v0, :cond_1f

    .line 1275
    .line 1276
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1277
    .line 1278
    const-string v2, "There is no activity attached to context"

    .line 1279
    .line 1280
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    throw v0

    .line 1284
    :cond_1f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1285
    .line 1286
    const-string v2, "You need to use an AppCompatActivity"

    .line 1287
    .line 1288
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    throw v0

    .line 1292
    nop

    .line 1293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
