.class public final synthetic Ltr;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ltr;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ltr;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ltr;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ltr;->i:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ltr;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ltr;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lew0;

    .line 11
    .line 12
    iget-object v2, v1, Ltr;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/util/concurrent/CompletableFuture;

    .line 15
    .line 16
    iget-object v3, v1, Ltr;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lme0;

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0, v3}, Lew0;->d(Lme0;)Lme0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_0
    const-string v0, "5"

    .line 34
    .line 35
    const-string v2, "2.4"

    .line 36
    .line 37
    iget-object v3, v1, Ltr;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 40
    .line 41
    iget-object v4, v1, Ltr;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Landroid/net/DhcpInfo;

    .line 44
    .line 45
    iget-object v5, v1, Ltr;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Landroid/net/wifi/WifiInfo;

    .line 48
    .line 49
    sget-object v6, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 50
    .line 51
    const-string v6, ""

    .line 52
    .line 53
    const-string v7, "0.0.0.0"

    .line 54
    .line 55
    new-instance v8, Lna0;

    .line 56
    .line 57
    const/4 v9, 0x1

    .line 58
    invoke-direct {v8, v9, v3, v9}, Lna0;-><init>(ZLcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v8}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    iget-object v8, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 65
    .line 66
    if-eqz v8, :cond_9

    .line 67
    .line 68
    iget-object v8, v8, Lf2;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v8, Lxi;

    .line 71
    .line 72
    iget v9, v4, Landroid/net/DhcpInfo;->ipAddress:I

    .line 73
    .line 74
    invoke-static {v9}, Lum;->l(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    iput-object v9, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->R:Ljava/lang/String;

    .line 79
    .line 80
    iget v9, v4, Landroid/net/DhcpInfo;->gateway:I

    .line 81
    .line 82
    invoke-static {v9}, Lum;->l(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    iput-object v9, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->P:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v9, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->V:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-eqz v10, :cond_1

    .line 95
    .line 96
    :cond_0
    const/16 v11, 0x18

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    new-instance v10, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    const/4 v12, 0x0

    .line 112
    move v13, v12

    .line 113
    :cond_2
    if-ge v13, v9, :cond_0

    .line 114
    .line 115
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v14

    .line 119
    add-int/lit8 v13, v13, 0x1

    .line 120
    .line 121
    check-cast v14, Landroid/net/LinkAddress;

    .line 122
    .line 123
    invoke-virtual {v14}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    invoke-virtual {v15}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v15

    .line 131
    const-string v11, "toString(...)"

    .line 132
    .line 133
    invoke-static {v15, v11}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v11, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->R:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v15, v11, v12}, Lsy0;->y(Ljava/lang/String;Ljava/lang/CharSequence;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-eqz v11, :cond_2

    .line 143
    .line 144
    invoke-virtual {v14}, Landroid/net/LinkAddress;->getPrefixLength()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-ltz v9, :cond_0

    .line 149
    .line 150
    const/16 v10, 0x21

    .line 151
    .line 152
    if-ge v9, v10, :cond_0

    .line 153
    .line 154
    invoke-virtual {v14}, Landroid/net/LinkAddress;->getPrefixLength()I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    :goto_1
    iput v11, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Q:I

    .line 159
    .line 160
    iget-object v9, v8, Lxi;->f:Landroid/widget/TextView;

    .line 161
    .line 162
    iget-object v10, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->R:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    iget-object v9, v8, Lxi;->l:Landroid/widget/TextView;

    .line 168
    .line 169
    iget-object v10, v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->P:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    iget v9, v4, Landroid/net/DhcpInfo;->dns1:I

    .line 175
    .line 176
    invoke-static {v9}, Lum;->l(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    iget v4, v4, Landroid/net/DhcpInfo;->dns2:I

    .line 181
    .line 182
    invoke-static {v4}, Lum;->l(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v9, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-eqz v10, :cond_3

    .line 191
    .line 192
    move-object v9, v6

    .line 193
    :cond_3
    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-eqz v7, :cond_4

    .line 198
    .line 199
    move-object v4, v6

    .line 200
    :cond_4
    iget-object v7, v8, Lxi;->h:Landroid/widget/TextView;

    .line 201
    .line 202
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    iget-object v7, v8, Lxi;->i:Landroid/widget/TextView;

    .line 206
    .line 207
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    iget-object v4, v8, Lxi;->e:Landroid/view/View;

    .line 211
    .line 212
    const v7, 0x7f04012c

    .line 213
    .line 214
    .line 215
    const/high16 v9, -0x1000000

    .line 216
    .line 217
    invoke-static {v3, v7, v9}, Li41;->h(Landroid/content/Context;II)I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    invoke-virtual {v4, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 222
    .line 223
    .line 224
    iget-object v4, v8, Lxi;->d:Landroid/widget/ImageView;

    .line 225
    .line 226
    const v7, 0x7f0800b2

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 230
    .line 231
    .line 232
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 233
    .line 234
    const/16 v7, 0x1e

    .line 235
    .line 236
    if-lt v4, v7, :cond_5

    .line 237
    .line 238
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    const-string v4, "getApplicationContext(...)"

    .line 243
    .line 244
    invoke-static {v3, v4}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v3, v5}, Lum;->o(Landroid/content/Context;Landroid/net/wifi/WifiInfo;)Lf31;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    iget-object v4, v8, Lxi;->n:Landroid/widget/TextView;

    .line 252
    .line 253
    iget-object v3, v3, Lf31;->f:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v3, Ljava/lang/CharSequence;

    .line 256
    .line 257
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    .line 259
    .line 260
    :cond_5
    iget-object v3, v8, Lxi;->m:Landroid/widget/TextView;

    .line 261
    .line 262
    invoke-virtual {v5}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    const-string v7, "getSSID(...)"

    .line 267
    .line 268
    invoke-static {v4, v7}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v5}, Landroid/net/wifi/WifiInfo;->getFrequency()I

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    const-string v7, "Ghz)"

    .line 276
    .line 277
    const-string v8, "\""

    .line 278
    .line 279
    invoke-static {v4, v8, v6}, Lsy0;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    const-string v6, "<unknown ssid>"

    .line 284
    .line 285
    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    const/16 v8, 0x1388

    .line 290
    .line 291
    if-eqz v6, :cond_7

    .line 292
    .line 293
    if-ge v5, v8, :cond_6

    .line 294
    .line 295
    move-object v0, v2

    .line 296
    :cond_6
    const-string v2, "WiFi ("

    .line 297
    .line 298
    invoke-static {v2, v0, v7}, Lex0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    goto :goto_2

    .line 303
    :cond_7
    if-ge v5, v8, :cond_8

    .line 304
    .line 305
    move-object v0, v2

    .line 306
    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    const-string v4, " ("

    .line 315
    .line 316
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    :goto_2
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_9
    const-string v0, "binding"

    .line 334
    .line 335
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    const/4 v0, 0x0

    .line 339
    throw v0

    .line 340
    :pswitch_1
    iget-object v0, v1, Ltr;->g:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v0, Lnc3;

    .line 343
    .line 344
    iget-object v2, v1, Ltr;->h:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v2, Lou1;

    .line 347
    .line 348
    iget-object v3, v1, Ltr;->i:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 351
    .line 352
    :try_start_1
    iget-object v0, v0, Lnc3;->f:Landroid/content/Context;

    .line 353
    .line 354
    invoke-static {v0}, La30;->b(Landroid/content/Context;)Lmv;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    if-eqz v0, :cond_a

    .line 359
    .line 360
    iget-object v4, v0, Lnr;->b:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v4, Lqr;

    .line 363
    .line 364
    check-cast v4, Llv;

    .line 365
    .line 366
    iget-object v5, v4, Llv;->i:Ljava/lang/Object;

    .line 367
    .line 368
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    :try_start_2
    iput-object v3, v4, Llv;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 370
    .line 371
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 372
    :try_start_3
    iget-object v0, v0, Lnr;->b:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, Lqr;

    .line 375
    .line 376
    new-instance v4, Lur;

    .line 377
    .line 378
    invoke-direct {v4, v2, v3}, Lur;-><init>(Lou1;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v0, v4}, Lqr;->a(Lou1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 382
    .line 383
    .line 384
    goto :goto_4

    .line 385
    :catchall_0
    move-exception v0

    .line 386
    goto :goto_3

    .line 387
    :catchall_1
    move-exception v0

    .line 388
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 389
    :try_start_5
    throw v0

    .line 390
    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    .line 391
    .line 392
    const-string v4, "EmojiCompat font provider not available on this device."

    .line 393
    .line 394
    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 398
    :goto_3
    invoke-virtual {v2, v0}, Lou1;->r(Ljava/lang/Throwable;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v3}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 402
    .line 403
    .line 404
    :goto_4
    return-void

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
