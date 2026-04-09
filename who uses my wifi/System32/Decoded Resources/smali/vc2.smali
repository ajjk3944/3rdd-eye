.class public abstract Lvc2;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lwc2;


# static fields
.field public static final synthetic f:I


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 12

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.signals.ISignalCallback"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return v1

    .line 10
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-static {v5}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 39
    .line 40
    .line 41
    move-object p2, p0

    .line 42
    check-cast p2, Lcr1;

    .line 43
    .line 44
    sget-object v6, Lmz1;->Ea:Liz1;

    .line 45
    .line 46
    sget-object v7, Ltw1;->e:Ltw1;

    .line 47
    .line 48
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 49
    .line 50
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_0

    .line 61
    .line 62
    new-instance p1, Loi0;

    .line 63
    .line 64
    invoke-direct {p1, v3}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :cond_0
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Landroid/content/Context;

    .line 74
    .line 75
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lsl;

    .line 80
    .line 81
    invoke-static {v5}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Lil;

    .line 86
    .line 87
    iget-object v6, p2, Lcr1;->J:Lb02;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    if-eqz p1, :cond_6

    .line 93
    .line 94
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-nez v7, :cond_5

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iput-object p1, v6, Lb02;->l:Landroid/content/Context;

    .line 103
    .line 104
    iput-object v4, v6, Lb02;->h:Ljava/lang/String;

    .line 105
    .line 106
    iget-object p1, v6, Lb02;->d:Lpv2;

    .line 107
    .line 108
    new-instance v4, Lzz1;

    .line 109
    .line 110
    invoke-direct {v4, v6, v5, p1}, Lzz1;-><init>(Lb02;Lil;Lpv2;)V

    .line 111
    .line 112
    .line 113
    iput-object v4, v6, Lb02;->f:Lzz1;

    .line 114
    .line 115
    invoke-virtual {v0, v4}, Lsl;->b(Lil;)Lmc2;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, v6, Lb02;->g:Lmc2;

    .line 120
    .line 121
    if-nez v0, :cond_1

    .line 122
    .line 123
    const-string v0, "CustomTabsClient failed to create new session."

    .line 124
    .line 125
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_1
    new-instance v0, Landroid/util/Pair;

    .line 129
    .line 130
    const-string v4, "pe"

    .line 131
    .line 132
    const-string v5, "pact_init"

    .line 133
    .line 134
    invoke-direct {v0, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    filled-new-array {v0}, [Landroid/util/Pair;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v4, "pact_action"

    .line 142
    .line 143
    invoke-static {p1, v4, v0}, La30;->B(Lpv2;Ljava/lang/String;[Landroid/util/Pair;)V

    .line 144
    .line 145
    .line 146
    sget-object p1, Lx02;->e:Lso1;

    .line 147
    .line 148
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_2

    .line 159
    .line 160
    iget-object p1, p2, Lcr1;->K:Ljd4;

    .line 161
    .line 162
    monitor-enter p1

    .line 163
    :try_start_0
    invoke-virtual {p1, v2}, Ljd4;->c(Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v1}, Ljd4;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    .line 168
    .line 169
    monitor-exit p1

    .line 170
    goto :goto_0

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    move-object p2, v0

    .line 173
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    throw p2

    .line 175
    :cond_2
    :goto_0
    sget-object p1, Lx02;->c:Lso1;

    .line 176
    .line 177
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    check-cast p1, Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eqz p1, :cond_3

    .line 188
    .line 189
    iget-object p1, p2, Lcr1;->L:Lk63;

    .line 190
    .line 191
    invoke-virtual {p1, v3}, Lk63;->a(Landroid/webkit/WebView;)V

    .line 192
    .line 193
    .line 194
    :cond_3
    iget-object p1, v6, Lb02;->g:Lmc2;

    .line 195
    .line 196
    new-instance p2, Loi0;

    .line 197
    .line 198
    invoke-direct {p2, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    move-object p1, p2

    .line 202
    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 203
    .line 204
    .line 205
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 206
    .line 207
    .line 208
    return v2

    .line 209
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 210
    .line 211
    const-string p2, "CustomTabsClient parameter is null"

    .line 212
    .line 213
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 218
    .line 219
    const-string p2, "Origin parameter is empty or null"

    .line 220
    .line 221
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1

    .line 225
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 226
    .line 227
    const-string p2, "App Context parameter is null"

    .line 228
    .line 229
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p1

    .line 233
    :pswitch_1
    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 234
    .line 235
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-static {v1}, Li92;->B3(Landroid/os/IBinder;)Lj92;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 256
    .line 257
    .line 258
    move-object p2, p0

    .line 259
    check-cast p2, Lcr1;

    .line 260
    .line 261
    invoke-virtual {p2, p1, v0, v1, v2}, Lcr1;->C3(Ljava/util/ArrayList;Lu10;Lj92;Z)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 265
    .line 266
    .line 267
    return v2

    .line 268
    :pswitch_2
    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 269
    .line 270
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v1}, Li92;->B3(Landroid/os/IBinder;)Lj92;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 291
    .line 292
    .line 293
    move-object p2, p0

    .line 294
    check-cast p2, Lcr1;

    .line 295
    .line 296
    invoke-virtual {p2, p1, v0, v1, v2}, Lcr1;->B3(Ljava/util/ArrayList;Lu10;Lj92;Z)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 300
    .line 301
    .line 302
    return v2

    .line 303
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 312
    .line 313
    .line 314
    move-object p2, p0

    .line 315
    check-cast p2, Lcr1;

    .line 316
    .line 317
    sget-object v0, Lmz1;->qa:Liz1;

    .line 318
    .line 319
    sget-object v1, Ltw1;->e:Ltw1;

    .line 320
    .line 321
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 322
    .line 323
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_7

    .line 334
    .line 335
    goto/16 :goto_2

    .line 336
    .line 337
    :cond_7
    sget-object v0, Lmz1;->S7:Liz1;

    .line 338
    .line 339
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    check-cast v3, Ljava/lang/Boolean;

    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-nez v3, :cond_8

    .line 350
    .line 351
    invoke-virtual {p2}, Lcr1;->D3()V

    .line 352
    .line 353
    .line 354
    :cond_8
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    move-object v4, p1

    .line 359
    check-cast v4, Landroid/webkit/WebView;

    .line 360
    .line 361
    if-nez v4, :cond_9

    .line 362
    .line 363
    const-string p1, "The webView cannot be null."

    .line 364
    .line 365
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_2

    .line 369
    .line 370
    :cond_9
    iget-object v10, p2, Lcr1;->L:Lk63;

    .line 371
    .line 372
    new-instance v11, Lsa4;

    .line 373
    .line 374
    sget-object p1, Lmd2;->f:Lld2;

    .line 375
    .line 376
    invoke-direct {v11, v4, v10, p1}, Lsa4;-><init>(Landroid/webkit/WebView;Lk63;Lpq3;)V

    .line 377
    .line 378
    .line 379
    iget-object v5, p2, Lcr1;->i:Lvs1;

    .line 380
    .line 381
    iget-object v6, p2, Lcr1;->q:Lpv2;

    .line 382
    .line 383
    iget-object v7, p2, Lcr1;->r:Leb3;

    .line 384
    .line 385
    iget-object v8, p2, Lcr1;->j:Lm83;

    .line 386
    .line 387
    iget-object v9, p2, Lcr1;->K:Ljd4;

    .line 388
    .line 389
    new-instance v3, Li01;

    .line 390
    .line 391
    invoke-direct/range {v3 .. v11}, Li01;-><init>(Landroid/webkit/WebView;Lvs1;Lpv2;Leb3;Lm83;Ljd4;Lk63;Lsa4;)V

    .line 392
    .line 393
    .line 394
    const-string p1, "gmaSdk"

    .line 395
    .line 396
    invoke-virtual {v4, v3, p1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    sget-object p1, Lmz1;->Aa:Liz1;

    .line 400
    .line 401
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    check-cast p1, Ljava/lang/Boolean;

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 408
    .line 409
    .line 410
    move-result p1

    .line 411
    if-eqz p1, :cond_a

    .line 412
    .line 413
    sget-object p1, Lhg4;->C:Lhg4;

    .line 414
    .line 415
    iget-object p1, p1, Lhg4;->h:Lgd2;

    .line 416
    .line 417
    iget-object p1, p1, Lgd2;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 418
    .line 419
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 420
    .line 421
    .line 422
    :cond_a
    sget-object p1, Lx02;->c:Lso1;

    .line 423
    .line 424
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    check-cast p1, Ljava/lang/Boolean;

    .line 429
    .line 430
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 431
    .line 432
    .line 433
    move-result p1

    .line 434
    if-eqz p1, :cond_b

    .line 435
    .line 436
    invoke-virtual {v10, v4}, Lk63;->a(Landroid/webkit/WebView;)V

    .line 437
    .line 438
    .line 439
    sget-object p1, Lx02;->d:Lso1;

    .line 440
    .line 441
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    check-cast p1, Ljava/lang/Boolean;

    .line 446
    .line 447
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    if-eqz p1, :cond_b

    .line 452
    .line 453
    sget-object p1, Lmz1;->Ba:Liz1;

    .line 454
    .line 455
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    check-cast p1, Ljava/lang/Integer;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 462
    .line 463
    .line 464
    move-result p1

    .line 465
    sget-object v3, Lmd2;->d:Lkd2;

    .line 466
    .line 467
    new-instance v4, Ljt3;

    .line 468
    .line 469
    const/4 v5, 0x1

    .line 470
    invoke-direct {v4, v11, v5}, Ljt3;-><init>(Lsa4;I)V

    .line 471
    .line 472
    .line 473
    int-to-long v7, p1

    .line 474
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 475
    .line 476
    const-wide/16 v5, 0x0

    .line 477
    .line 478
    invoke-virtual/range {v3 .. v9}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 479
    .line 480
    .line 481
    :cond_b
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    check-cast p1, Ljava/lang/Boolean;

    .line 486
    .line 487
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 488
    .line 489
    .line 490
    move-result p1

    .line 491
    if-eqz p1, :cond_c

    .line 492
    .line 493
    invoke-virtual {p2}, Lcr1;->D3()V

    .line 494
    .line 495
    .line 496
    :cond_c
    :goto_2
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 497
    .line 498
    .line 499
    return v2

    .line 500
    :pswitch_4
    sget-object p1, Lo92;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 501
    .line 502
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    check-cast p1, Lo92;

    .line 507
    .line 508
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 509
    .line 510
    .line 511
    move-object p2, p0

    .line 512
    check-cast p2, Lcr1;

    .line 513
    .line 514
    iput-object p1, p2, Lcr1;->n:Lo92;

    .line 515
    .line 516
    iget-object p1, p2, Lcr1;->k:Lv83;

    .line 517
    .line 518
    invoke-virtual {p1, v2}, Lv83;->a(I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 522
    .line 523
    .line 524
    return v2

    .line 525
    :pswitch_5
    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 526
    .line 527
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    invoke-static {v3}, Li92;->B3(Landroid/os/IBinder;)Lj92;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 548
    .line 549
    .line 550
    move-object p2, p0

    .line 551
    check-cast p2, Lcr1;

    .line 552
    .line 553
    invoke-virtual {p2, p1, v0, v3, v1}, Lcr1;->C3(Ljava/util/ArrayList;Lu10;Lj92;Z)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 557
    .line 558
    .line 559
    return v2

    .line 560
    :pswitch_6
    sget-object p1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 561
    .line 562
    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 563
    .line 564
    .line 565
    move-result-object p1

    .line 566
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    invoke-static {v3}, Li92;->B3(Landroid/os/IBinder;)Lj92;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 583
    .line 584
    .line 585
    move-object p2, p0

    .line 586
    check-cast p2, Lcr1;

    .line 587
    .line 588
    invoke-virtual {p2, p1, v0, v3, v1}, Lcr1;->B3(Ljava/util/ArrayList;Lu10;Lj92;Z)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 592
    .line 593
    .line 594
    return v2

    .line 595
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 596
    .line 597
    .line 598
    move-result-object p1

    .line 599
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 600
    .line 601
    .line 602
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 606
    .line 607
    .line 608
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 609
    .line 610
    .line 611
    return v2

    .line 612
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 613
    .line 614
    .line 615
    move-result-object p1

    .line 616
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 617
    .line 618
    .line 619
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 620
    .line 621
    .line 622
    move-result-object p1

    .line 623
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 624
    .line 625
    .line 626
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 630
    .line 631
    .line 632
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 633
    .line 634
    .line 635
    return v2

    .line 636
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 637
    .line 638
    .line 639
    move-result-object p1

    .line 640
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 645
    .line 646
    .line 647
    move-object p2, p0

    .line 648
    check-cast p2, Lcr1;

    .line 649
    .line 650
    sget-object v0, Lmz1;->b8:Liz1;

    .line 651
    .line 652
    sget-object v4, Ltw1;->e:Ltw1;

    .line 653
    .line 654
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 655
    .line 656
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    check-cast v0, Ljava/lang/Boolean;

    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    if-nez v0, :cond_d

    .line 667
    .line 668
    goto :goto_4

    .line 669
    :cond_d
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object p1

    .line 673
    check-cast p1, Landroid/view/MotionEvent;

    .line 674
    .line 675
    iget-object v0, p2, Lcr1;->n:Lo92;

    .line 676
    .line 677
    if-nez v0, :cond_e

    .line 678
    .line 679
    goto :goto_3

    .line 680
    :cond_e
    iget-object v3, v0, Lo92;->f:Landroid/view/View;

    .line 681
    .line 682
    :goto_3
    const/4 v0, 0x2

    .line 683
    new-array v0, v0, [I

    .line 684
    .line 685
    if-eqz v3, :cond_f

    .line 686
    .line 687
    invoke-virtual {v3, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 688
    .line 689
    .line 690
    :cond_f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 691
    .line 692
    .line 693
    move-result v3

    .line 694
    float-to-int v3, v3

    .line 695
    aget v1, v0, v1

    .line 696
    .line 697
    sub-int/2addr v3, v1

    .line 698
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 699
    .line 700
    .line 701
    move-result v1

    .line 702
    float-to-int v1, v1

    .line 703
    aget v0, v0, v2

    .line 704
    .line 705
    sub-int/2addr v1, v0

    .line 706
    new-instance v0, Landroid/graphics/Point;

    .line 707
    .line 708
    invoke-direct {v0, v3, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 709
    .line 710
    .line 711
    iput-object v0, p2, Lcr1;->o:Landroid/graphics/Point;

    .line 712
    .line 713
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    if-nez v0, :cond_10

    .line 718
    .line 719
    iget-object v0, p2, Lcr1;->o:Landroid/graphics/Point;

    .line 720
    .line 721
    iput-object v0, p2, Lcr1;->p:Landroid/graphics/Point;

    .line 722
    .line 723
    :cond_10
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 724
    .line 725
    .line 726
    move-result-object p1

    .line 727
    iget-object v0, p2, Lcr1;->o:Landroid/graphics/Point;

    .line 728
    .line 729
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 730
    .line 731
    int-to-float v1, v1

    .line 732
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 733
    .line 734
    int-to-float v0, v0

    .line 735
    invoke-virtual {p1, v1, v0}, Landroid/view/MotionEvent;->setLocation(FF)V

    .line 736
    .line 737
    .line 738
    iget-object p2, p2, Lcr1;->i:Lvs1;

    .line 739
    .line 740
    iget-object p2, p2, Lvs1;->b:Lrs1;

    .line 741
    .line 742
    invoke-interface {p2, p1}, Lrs1;->f(Landroid/view/MotionEvent;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 746
    .line 747
    .line 748
    :goto_4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 749
    .line 750
    .line 751
    return v2

    .line 752
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 753
    .line 754
    .line 755
    move-result-object p1

    .line 756
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 757
    .line 758
    .line 759
    move-result-object p1

    .line 760
    sget-object v1, Lad2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 761
    .line 762
    invoke-static {p2, v1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    check-cast v1, Lad2;

    .line 767
    .line 768
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 769
    .line 770
    .line 771
    move-result-object v4

    .line 772
    if-nez v4, :cond_11

    .line 773
    .line 774
    goto :goto_5

    .line 775
    :cond_11
    invoke-interface {v4, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    instance-of v5, v3, Ltc2;

    .line 780
    .line 781
    if-eqz v5, :cond_12

    .line 782
    .line 783
    check-cast v3, Ltc2;

    .line 784
    .line 785
    goto :goto_5

    .line 786
    :cond_12
    new-instance v3, Lsc2;

    .line 787
    .line 788
    const/4 v5, 0x2

    .line 789
    invoke-direct {v3, v4, v0, v5}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 790
    .line 791
    .line 792
    :goto_5
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 793
    .line 794
    .line 795
    move-object p2, p0

    .line 796
    check-cast p2, Lcr1;

    .line 797
    .line 798
    invoke-virtual {p2, p1, v1, v3}, Lcr1;->e2(Lu10;Lad2;Ltc2;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 802
    .line 803
    .line 804
    return v2

    .line 805
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
