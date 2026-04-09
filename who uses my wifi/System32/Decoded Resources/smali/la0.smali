.class public final synthetic Lla0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lla0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

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
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lla0;->f:I

    .line 4
    .line 5
    const/high16 v2, -0x1000000

    .line 6
    .line 7
    const v3, 0x7f04012c

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v2, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 17
    .line 18
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 19
    .line 20
    monitor-enter v2

    .line 21
    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    iget-wide v6, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->J:J

    .line 26
    .line 27
    sub-long/2addr v3, v6

    .line 28
    invoke-static {}, Landroid/net/TrafficStats;->getTotalTxBytes()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v10

    .line 40
    iput-wide v10, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->J:J

    .line 41
    .line 42
    long-to-double v3, v3

    .line 43
    const-wide v10, 0x41cdcd6500000000L    # 1.0E9

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    div-double/2addr v3, v10

    .line 49
    iget-wide v10, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->K:J

    .line 50
    .line 51
    sub-long v10, v6, v10

    .line 52
    .line 53
    iget-wide v12, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->L:J

    .line 54
    .line 55
    sub-long v12, v8, v12

    .line 56
    .line 57
    long-to-double v10, v10

    .line 58
    div-double/2addr v10, v3

    .line 59
    long-to-double v12, v12

    .line 60
    div-double/2addr v12, v3

    .line 61
    iput-wide v6, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->K:J

    .line 62
    .line 63
    iput-wide v8, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->L:J

    .line 64
    .line 65
    iget-object v0, v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->I:Lt90;

    .line 66
    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    invoke-virtual {v0, v12, v13, v10, v11}, Lt90;->a(DD)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    monitor-exit v2

    .line 73
    return-void

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    :try_start_1
    const-string v0, "netTrafficChart"

    .line 77
    .line 78
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v5

    .line 82
    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    throw v0

    .line 84
    :pswitch_0
    iget-object v2, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 85
    .line 86
    sget-object v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 87
    .line 88
    new-instance v0, Lo7;

    .line 89
    .line 90
    invoke-direct {v0}, Lo7;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v3, "B3EEABB8EE11C2BE770B684D95219ECB"

    .line 94
    .line 95
    iget-object v5, v0, Lo7;->g:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v5, Ljava/util/HashSet;

    .line 98
    .line 99
    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    new-instance v3, Le13;

    .line 103
    .line 104
    invoke-direct {v3, v0}, Le13;-><init>(Lo7;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Lu2;

    .line 108
    .line 109
    const v5, 0x7f120025

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-direct {v0, v2, v5}, Lu2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v5, v0, Lu2;->b:Lx72;

    .line 120
    .line 121
    new-instance v7, Lda0;

    .line 122
    .line 123
    invoke-direct {v7, v2}, Lda0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V

    .line 124
    .line 125
    .line 126
    const/4 v8, 0x5

    .line 127
    :try_start_2
    new-instance v9, Lj32;

    .line 128
    .line 129
    invoke-direct {v9, v6, v7}, Lj32;-><init>(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v5, v9}, Lx72;->q1(Lz22;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catch_0
    invoke-static {v8}, Lgi2;->q0(I)Z

    .line 137
    .line 138
    .line 139
    :goto_1
    new-instance v7, Lq00;

    .line 140
    .line 141
    invoke-direct {v7, v2, v6}, Lq00;-><init>(Li5;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v7}, Lu2;->b(Lt2;)V

    .line 145
    .line 146
    .line 147
    new-instance v7, Lk51;

    .line 148
    .line 149
    invoke-direct {v7}, Lk51;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-boolean v6, v7, Lk51;->a:Z

    .line 153
    .line 154
    new-instance v6, Ll51;

    .line 155
    .line 156
    invoke-direct {v6, v7}, Ll51;-><init>(Lk51;)V

    .line 157
    .line 158
    .line 159
    :try_start_3
    new-instance v9, Lr12;

    .line 160
    .line 161
    new-instance v15, Lih3;

    .line 162
    .line 163
    invoke-direct {v15, v6}, Lih3;-><init>(Ll51;)V

    .line 164
    .line 165
    .line 166
    const/4 v14, 0x1

    .line 167
    add-int/lit8 v20, v14, -0x1

    .line 168
    .line 169
    const/4 v10, 0x4

    .line 170
    const/4 v12, -0x1

    .line 171
    const/4 v11, 0x0

    .line 172
    move v13, v11

    .line 173
    move/from16 v16, v11

    .line 174
    .line 175
    move/from16 v17, v11

    .line 176
    .line 177
    move/from16 v18, v11

    .line 178
    .line 179
    move/from16 v19, v11

    .line 180
    .line 181
    invoke-direct/range {v9 .. v20}, Lr12;-><init>(IZIZILih3;ZIIZI)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v5, v9}, Lx72;->w1(Lr12;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catch_1
    invoke-static {v8}, Lgi2;->q0(I)Z

    .line 189
    .line 190
    .line 191
    :goto_2
    invoke-virtual {v0}, Lu2;->a()Lv2;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v5, v0, Lv2;->a:Landroid/content/Context;

    .line 196
    .line 197
    invoke-static {v5}, Lmz1;->a(Landroid/content/Context;)V

    .line 198
    .line 199
    .line 200
    sget-object v6, Lq02;->c:Lso1;

    .line 201
    .line 202
    invoke-virtual {v6}, Lso1;->w()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    check-cast v6, Ljava/lang/Boolean;

    .line 207
    .line 208
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_2

    .line 213
    .line 214
    sget-object v6, Lmz1;->Wb:Liz1;

    .line 215
    .line 216
    sget-object v7, Ltw1;->e:Ltw1;

    .line 217
    .line 218
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 219
    .line 220
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    check-cast v6, Ljava/lang/Boolean;

    .line 225
    .line 226
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-nez v6, :cond_1

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_1
    sget-object v5, Luu1;->b:Ljava/util/concurrent/ExecutorService;

    .line 234
    .line 235
    new-instance v6, Ljq3;

    .line 236
    .line 237
    const/16 v7, 0x13

    .line 238
    .line 239
    invoke-direct {v6, v0, v3, v7}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_2
    :goto_3
    :try_start_4
    iget-object v0, v0, Lv2;->b:La62;

    .line 247
    .line 248
    invoke-static {v5, v3}, Lfr;->o(Landroid/content/Context;Le13;)Lpc4;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-interface {v0, v3}, La62;->Z(Lpc4;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_2

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :catch_2
    move-exception v0

    .line 257
    const-string v3, "Failed to load ad."

    .line 258
    .line 259
    invoke-static {v3, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    :goto_4
    new-instance v0, Landroid/os/Handler;

    .line 263
    .line 264
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 269
    .line 270
    .line 271
    new-instance v3, Lla0;

    .line 272
    .line 273
    invoke-direct {v3, v2, v4}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 274
    .line 275
    .line 276
    const-wide/16 v4, 0x1388

    .line 277
    .line 278
    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :pswitch_1
    iget-object v0, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 283
    .line 284
    sget-object v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 285
    .line 286
    :try_start_5
    new-instance v2, Ljava/net/URL;

    .line 287
    .line 288
    const-string v3, "https://api.ipify.org"

    .line 289
    .line 290
    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const-string v3, "openConnection(...)"

    .line 298
    .line 299
    invoke-static {v2, v3}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    const/16 v3, 0x3a98

    .line 303
    .line 304
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 305
    .line 306
    .line 307
    new-instance v3, Ljava/io/BufferedReader;

    .line 308
    .line 309
    new-instance v4, Ljava/io/InputStreamReader;

    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 316
    .line 317
    .line 318
    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 326
    .line 327
    .line 328
    new-instance v3, Lka0;

    .line 329
    .line 330
    invoke-direct {v3, v0, v2}, Lka0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :catch_3
    move-exception v0

    .line 338
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 339
    .line 340
    .line 341
    :goto_5
    return-void

    .line 342
    :pswitch_2
    iget-object v0, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 343
    .line 344
    sget-object v4, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 345
    .line 346
    new-instance v4, Lna0;

    .line 347
    .line 348
    invoke-direct {v4, v6, v0, v6}, Lna0;-><init>(ZLcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 352
    .line 353
    .line 354
    iget-object v4, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 355
    .line 356
    if-eqz v4, :cond_3

    .line 357
    .line 358
    iget-object v4, v4, Lf2;->f:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v4, Lxi;

    .line 361
    .line 362
    iget-object v5, v4, Lxi;->d:Landroid/widget/ImageView;

    .line 363
    .line 364
    const v6, 0x7f0800a9

    .line 365
    .line 366
    .line 367
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 368
    .line 369
    .line 370
    iget-object v5, v4, Lxi;->k:Landroid/widget/TextView;

    .line 371
    .line 372
    const v6, 0x7f12011d

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 380
    .line 381
    .line 382
    iget-object v4, v4, Lxi;->e:Landroid/view/View;

    .line 383
    .line 384
    invoke-static {v0, v3, v2}, Li41;->h(Landroid/content/Context;II)I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :cond_3
    const-string v0, "binding"

    .line 393
    .line 394
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v5

    .line 398
    :pswitch_3
    iget-object v0, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 399
    .line 400
    sget-object v4, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 401
    .line 402
    new-instance v4, Lna0;

    .line 403
    .line 404
    invoke-direct {v4, v6, v0, v6}, Lna0;-><init>(ZLcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 408
    .line 409
    .line 410
    iget-object v4, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 411
    .line 412
    if-eqz v4, :cond_4

    .line 413
    .line 414
    iget-object v4, v4, Lf2;->f:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v4, Lxi;

    .line 417
    .line 418
    iget-object v5, v4, Lxi;->d:Landroid/widget/ImageView;

    .line 419
    .line 420
    const v6, 0x7f0800f8

    .line 421
    .line 422
    .line 423
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 424
    .line 425
    .line 426
    iget-object v5, v4, Lxi;->k:Landroid/widget/TextView;

    .line 427
    .line 428
    const v6, 0x7f12011f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 436
    .line 437
    .line 438
    iget-object v4, v4, Lxi;->e:Landroid/view/View;

    .line 439
    .line 440
    invoke-static {v0, v3, v2}, Li41;->h(Landroid/content/Context;II)I

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 445
    .line 446
    .line 447
    return-void

    .line 448
    :cond_4
    const-string v0, "binding"

    .line 449
    .line 450
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    throw v5

    .line 454
    :pswitch_4
    iget-object v0, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 455
    .line 456
    const-string v2, "0.0.0.0"

    .line 457
    .line 458
    const-string v3, ""

    .line 459
    .line 460
    iget-object v4, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 461
    .line 462
    if-eqz v4, :cond_5

    .line 463
    .line 464
    iget-object v4, v4, Lf2;->f:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v4, Lxi;

    .line 467
    .line 468
    iget-object v5, v4, Lxi;->f:Landroid/widget/TextView;

    .line 469
    .line 470
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    .line 473
    iget-object v5, v4, Lxi;->l:Landroid/widget/TextView;

    .line 474
    .line 475
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 476
    .line 477
    .line 478
    iget-object v5, v4, Lxi;->k:Landroid/widget/TextView;

    .line 479
    .line 480
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 481
    .line 482
    .line 483
    iget-object v5, v4, Lxi;->h:Landroid/widget/TextView;

    .line 484
    .line 485
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    .line 487
    .line 488
    iget-object v5, v4, Lxi;->i:Landroid/widget/TextView;

    .line 489
    .line 490
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    .line 492
    .line 493
    iget-object v5, v4, Lxi;->m:Landroid/widget/TextView;

    .line 494
    .line 495
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 496
    .line 497
    .line 498
    iget-object v5, v4, Lxi;->n:Landroid/widget/TextView;

    .line 499
    .line 500
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    .line 502
    .line 503
    iget-object v3, v4, Lxi;->g:Landroid/widget/TextView;

    .line 504
    .line 505
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->B()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 510
    .line 511
    .line 512
    iget-object v3, v4, Lxi;->j:Landroid/widget/TextView;

    .line 513
    .line 514
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 515
    .line 516
    .line 517
    iget-object v2, v4, Lxi;->e:Landroid/view/View;

    .line 518
    .line 519
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    const v3, 0x7f060033

    .line 524
    .line 525
    .line 526
    invoke-static {v0, v3}, Lkj;->a(Landroid/content/Context;I)I

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 531
    .line 532
    .line 533
    iget-object v0, v4, Lxi;->d:Landroid/widget/ImageView;

    .line 534
    .line 535
    const v2, 0x7f0800ed

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 539
    .line 540
    .line 541
    return-void

    .line 542
    :cond_5
    const-string v0, "binding"

    .line 543
    .line 544
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    throw v5

    .line 548
    :pswitch_5
    iget-object v0, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 549
    .line 550
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->U:Lf10;

    .line 551
    .line 552
    if-eqz v0, :cond_6

    .line 553
    .line 554
    iget-object v0, v0, Lao0;->f:Lbo0;

    .line 555
    .line 556
    invoke-virtual {v0}, Lbo0;->b()V

    .line 557
    .line 558
    .line 559
    return-void

    .line 560
    :cond_6
    const-string v0, "hostTypeAdapter"

    .line 561
    .line 562
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    throw v5

    .line 566
    :pswitch_6
    iget-object v0, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 567
    .line 568
    const-string v2, "binding"

    .line 569
    .line 570
    iget-object v3, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 571
    .line 572
    if-eqz v3, :cond_a

    .line 573
    .line 574
    iget-object v3, v3, Lf2;->b:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v3, Lcom/google/android/material/card/MaterialCardView;

    .line 577
    .line 578
    invoke-static {v3}, Li30;->j(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 582
    .line 583
    .line 584
    move-result v6

    .line 585
    if-nez v6, :cond_7

    .line 586
    .line 587
    const/16 v6, 0x8

    .line 588
    .line 589
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 590
    .line 591
    .line 592
    :cond_7
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 593
    .line 594
    if-eqz v0, :cond_9

    .line 595
    .line 596
    iget-object v0, v0, Lf2;->g:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 599
    .line 600
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    if-eqz v2, :cond_8

    .line 605
    .line 606
    invoke-virtual {v0, v4}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 607
    .line 608
    .line 609
    :cond_8
    return-void

    .line 610
    :cond_9
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    throw v5

    .line 614
    :cond_a
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    throw v5

    .line 618
    :pswitch_7
    iget-object v0, v1, Lla0;->g:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 619
    .line 620
    sget-object v2, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 621
    .line 622
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    if-eqz v2, :cond_b

    .line 627
    .line 628
    goto :goto_6

    .line 629
    :cond_b
    new-instance v2, Lla0;

    .line 630
    .line 631
    invoke-direct {v2, v0, v6}, Lla0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;I)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 635
    .line 636
    .line 637
    :goto_6
    return-void

    .line 638
    nop

    .line 639
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
