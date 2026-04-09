.class public final Lmb3;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkh2;


# instance fields
.field public final f:Lnb3;

.field public final g:Lgb3;


# direct methods
.method public constructor <init>(Lnb3;Lgb3;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.client.IAdPreloader"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lmb3;->f:Lnb3;

    .line 7
    .line 8
    iput-object p2, p0, Lmb3;->g:Lgb3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    return v5

    .line 14
    :pswitch_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 19
    .line 20
    .line 21
    iget-object v6, v1, Lmb3;->g:Lgb3;

    .line 22
    .line 23
    monitor-enter v6

    .line 24
    :try_start_0
    invoke-static {v4}, Ls2;->a(I)Ls2;

    .line 25
    .line 26
    .line 27
    move-result-object v13

    .line 28
    if-eqz v13, :cond_3

    .line 29
    .line 30
    iget-object v0, v6, Lgb3;->a:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v0, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v0, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 46
    .line 47
    .line 48
    move-result v16

    .line 49
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_2

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    check-cast v7, Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    check-cast v8, Ljb3;

    .line 74
    .line 75
    if-eqz v8, :cond_1

    .line 76
    .line 77
    iget-object v9, v8, Ljb3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    invoke-virtual {v9, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 80
    .line 81
    .line 82
    iget-object v9, v8, Ljb3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    invoke-virtual {v9, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 85
    .line 86
    .line 87
    iget-object v8, v8, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/util/PriorityQueue;->clear()V

    .line 90
    .line 91
    .line 92
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const-string v8, "Destroyed ad preloader for preloadId: "

    .line 97
    .line 98
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-static {v7}, Lgi2;->f0(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    goto :goto_3

    .line 108
    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v4, "Destroyed all ad preloaders for ad format: "

    .line 116
    .line 117
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v7, v6, Lgb3;->c:Lsq0;

    .line 125
    .line 126
    iget-object v0, v6, Lgb3;->g:Lym;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 132
    .line 133
    .line 134
    move-result-wide v9

    .line 135
    const-string v8, "pda"

    .line 136
    .line 137
    const/4 v14, -0x1

    .line 138
    const/4 v15, -0x1

    .line 139
    const/4 v11, 0x0

    .line 140
    const/4 v12, 0x0

    .line 141
    invoke-virtual/range {v7 .. v16}, Lsq0;->y(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ls2;III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    monitor-exit v6

    .line 145
    goto :goto_2

    .line 146
    :cond_3
    :goto_1
    monitor-exit v6

    .line 147
    :goto_2
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 148
    .line 149
    .line 150
    return v3

    .line 151
    :goto_3
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    throw v0

    .line 153
    :pswitch_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v4}, Ls2;->a(I)Ls2;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    if-nez v12, :cond_4

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_4
    iget-object v4, v1, Lmb3;->g:Lgb3;

    .line 172
    .line 173
    monitor-enter v4

    .line 174
    :try_start_2
    iget-object v0, v4, Lgb3;->a:Ljava/util/HashMap;

    .line 175
    .line 176
    invoke-virtual {v0, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-nez v6, :cond_5

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_5
    invoke-virtual {v0, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    check-cast v6, Ljava/util/Map;

    .line 188
    .line 189
    invoke-interface {v6, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    check-cast v6, Ljb3;

    .line 194
    .line 195
    if-eqz v6, :cond_6

    .line 196
    .line 197
    invoke-virtual {v0, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Ljava/util/Map;

    .line 202
    .line 203
    invoke-interface {v0, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    iget-object v0, v6, Ljb3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 207
    .line 208
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 209
    .line 210
    .line 211
    iget-object v0, v6, Ljb3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 212
    .line 213
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 214
    .line 215
    .line 216
    iget-object v0, v6, Ljb3;->i:Ljava/util/PriorityQueue;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    .line 219
    .line 220
    .line 221
    iget-object v0, v4, Lgb3;->c:Lsq0;

    .line 222
    .line 223
    iget-object v5, v4, Lgb3;->g:Lym;

    .line 224
    .line 225
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 229
    .line 230
    .line 231
    move-result-wide v8

    .line 232
    iget-object v5, v6, Ljb3;->e:Lae3;

    .line 233
    .line 234
    iget-object v11, v5, Lae3;->f:Ljava/lang/String;

    .line 235
    .line 236
    iget v13, v5, Lae3;->i:I

    .line 237
    .line 238
    invoke-virtual {v6}, Ljb3;->m()I

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    const-string v7, "pd"

    .line 243
    .line 244
    const/4 v15, 0x1

    .line 245
    move-object v6, v0

    .line 246
    invoke-virtual/range {v6 .. v15}, Lsq0;->y(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ls2;III)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 247
    .line 248
    .line 249
    monitor-exit v4

    .line 250
    move v5, v3

    .line 251
    goto :goto_5

    .line 252
    :catchall_1
    move-exception v0

    .line 253
    goto :goto_6

    .line 254
    :cond_6
    :goto_4
    monitor-exit v4

    .line 255
    :goto_5
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 259
    .line 260
    .line 261
    return v3

    .line 262
    :goto_6
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 263
    throw v0

    .line 264
    :pswitch_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v6}, Ls2;->a(I)Ls2;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    if-nez v13, :cond_7

    .line 280
    .line 281
    goto :goto_d

    .line 282
    :cond_7
    iget-object v6, v1, Lmb3;->g:Lgb3;

    .line 283
    .line 284
    monitor-enter v6

    .line 285
    :try_start_4
    iget-object v0, v6, Lgb3;->a:Ljava/util/HashMap;

    .line 286
    .line 287
    invoke-virtual {v0, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 291
    if-nez v7, :cond_8

    .line 292
    .line 293
    monitor-exit v6

    .line 294
    goto :goto_d

    .line 295
    :cond_8
    :try_start_5
    invoke-virtual {v0, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Ljava/util/Map;

    .line 300
    .line 301
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, Ljb3;

    .line 306
    .line 307
    if-nez v0, :cond_9

    .line 308
    .line 309
    :goto_7
    move v15, v5

    .line 310
    goto :goto_8

    .line 311
    :cond_9
    invoke-virtual {v0}, Ljb3;->m()I

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    goto :goto_7

    .line 316
    :goto_8
    iget-object v7, v6, Lgb3;->c:Lsq0;

    .line 317
    .line 318
    iget-object v5, v6, Lgb3;->g:Lym;

    .line 319
    .line 320
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 324
    .line 325
    .line 326
    move-result-wide v9

    .line 327
    if-nez v0, :cond_a

    .line 328
    .line 329
    :goto_9
    move-object v12, v4

    .line 330
    goto :goto_a

    .line 331
    :cond_a
    iget-object v4, v0, Ljb3;->e:Lae3;

    .line 332
    .line 333
    iget-object v4, v4, Lae3;->f:Ljava/lang/String;

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :goto_a
    if-nez v0, :cond_b

    .line 337
    .line 338
    const/4 v0, -0x1

    .line 339
    :goto_b
    move v14, v0

    .line 340
    goto :goto_c

    .line 341
    :cond_b
    iget-object v0, v0, Ljb3;->e:Lae3;

    .line 342
    .line 343
    iget v0, v0, Lae3;->i:I

    .line 344
    .line 345
    goto :goto_b

    .line 346
    :goto_c
    const-string v8, "pnav"

    .line 347
    .line 348
    const/16 v16, 0x1

    .line 349
    .line 350
    invoke-virtual/range {v7 .. v16}, Lsq0;->y(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ls2;III)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 351
    .line 352
    .line 353
    monitor-exit v6

    .line 354
    move v5, v15

    .line 355
    :goto_d
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 359
    .line 360
    .line 361
    return v3

    .line 362
    :catchall_2
    move-exception v0

    .line 363
    :try_start_6
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 364
    throw v0

    .line 365
    :pswitch_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 370
    .line 371
    .line 372
    iget-object v6, v1, Lmb3;->g:Lgb3;

    .line 373
    .line 374
    monitor-enter v6

    .line 375
    :try_start_7
    new-instance v0, Ljava/util/HashMap;

    .line 376
    .line 377
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 378
    .line 379
    .line 380
    invoke-static {v4}, Ls2;->a(I)Ls2;

    .line 381
    .line 382
    .line 383
    move-result-object v13

    .line 384
    if-eqz v13, :cond_e

    .line 385
    .line 386
    iget-object v4, v6, Lgb3;->a:Ljava/util/HashMap;

    .line 387
    .line 388
    invoke-virtual {v4, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    if-nez v7, :cond_c

    .line 393
    .line 394
    goto :goto_f

    .line 395
    :cond_c
    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    check-cast v4, Ljava/util/Map;

    .line 400
    .line 401
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    if-eqz v7, :cond_d

    .line 414
    .line 415
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    check-cast v7, Ljb3;

    .line 420
    .line 421
    iget-object v8, v7, Ljb3;->k:Ljava/lang/String;

    .line 422
    .line 423
    iget-object v7, v7, Ljb3;->e:Lae3;

    .line 424
    .line 425
    invoke-virtual {v0, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    goto :goto_e

    .line 429
    :catchall_3
    move-exception v0

    .line 430
    goto :goto_12

    .line 431
    :cond_d
    iget-object v7, v6, Lgb3;->c:Lsq0;

    .line 432
    .line 433
    iget-object v4, v6, Lgb3;->g:Lym;

    .line 434
    .line 435
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 439
    .line 440
    .line 441
    move-result-wide v9

    .line 442
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 443
    .line 444
    .line 445
    move-result v16

    .line 446
    const-string v8, "pgcs"

    .line 447
    .line 448
    const/4 v14, -0x1

    .line 449
    const/4 v15, -0x1

    .line 450
    const/4 v11, 0x0

    .line 451
    const/4 v12, 0x0

    .line 452
    invoke-virtual/range {v7 .. v16}, Lsq0;->y(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ls2;III)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 453
    .line 454
    .line 455
    monitor-exit v6

    .line 456
    goto :goto_10

    .line 457
    :cond_e
    :goto_f
    monitor-exit v6

    .line 458
    :goto_10
    new-instance v4, Landroid/os/Bundle;

    .line 459
    .line 460
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    if-eqz v6, :cond_f

    .line 476
    .line 477
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    check-cast v6, Ljava/util/Map$Entry;

    .line 482
    .line 483
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    check-cast v7, Ljava/lang/String;

    .line 488
    .line 489
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v6

    .line 493
    check-cast v6, Lae3;

    .line 494
    .line 495
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    invoke-virtual {v6, v8, v5}, Lae3;->writeToParcel(Landroid/os/Parcel;I)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v8}, Landroid/os/Parcel;->marshall()[B

    .line 503
    .line 504
    .line 505
    move-result-object v6

    .line 506
    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v4, v7, v6}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 510
    .line 511
    .line 512
    goto :goto_11

    .line 513
    :cond_f
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 514
    .line 515
    .line 516
    invoke-static {v2, v4}, Liv1;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 517
    .line 518
    .line 519
    return v3

    .line 520
    :goto_12
    :try_start_8
    monitor-exit v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 521
    throw v0

    .line 522
    :pswitch_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v5

    .line 530
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v1, v5, v4}, Lmb3;->N3(Ljava/lang/String;I)Lae3;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 538
    .line 539
    .line 540
    invoke-static {v2, v0}, Liv1;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 541
    .line 542
    .line 543
    return v3

    .line 544
    :pswitch_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v1, v4}, Lmb3;->M3(Ljava/lang/String;)Lya2;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 556
    .line 557
    .line 558
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 559
    .line 560
    .line 561
    return v3

    .line 562
    :pswitch_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v1, v4}, Lmb3;->L3(Ljava/lang/String;)Lkw1;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 574
    .line 575
    .line 576
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 577
    .line 578
    .line 579
    return v3

    .line 580
    :pswitch_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v1, v4}, Lmb3;->K3(Ljava/lang/String;)Lba2;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 592
    .line 593
    .line 594
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 595
    .line 596
    .line 597
    return v3

    .line 598
    :pswitch_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 599
    .line 600
    .line 601
    move-result v4

    .line 602
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v5

    .line 606
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1, v5, v4}, Lmb3;->J3(Ljava/lang/String;I)Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 617
    .line 618
    .line 619
    return v3

    .line 620
    :pswitch_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    sget-object v6, Lae3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 625
    .line 626
    invoke-static {v0, v6}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 627
    .line 628
    .line 629
    move-result-object v6

    .line 630
    check-cast v6, Lae3;

    .line 631
    .line 632
    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 633
    .line 634
    .line 635
    move-result-object v7

    .line 636
    if-nez v7, :cond_10

    .line 637
    .line 638
    goto :goto_13

    .line 639
    :cond_10
    const-string v4, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2"

    .line 640
    .line 641
    invoke-interface {v7, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    instance-of v8, v4, Lbf2;

    .line 646
    .line 647
    if-eqz v8, :cond_11

    .line 648
    .line 649
    check-cast v4, Lbf2;

    .line 650
    .line 651
    goto :goto_13

    .line 652
    :cond_11
    new-instance v4, Lbf2;

    .line 653
    .line 654
    const-string v8, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2"

    .line 655
    .line 656
    const/4 v9, 0x2

    .line 657
    invoke-direct {v4, v7, v8, v9}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 658
    .line 659
    .line 660
    :goto_13
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v1, v5, v6, v4}, Lmb3;->I3(Ljava/lang/String;Lae3;Lbf2;)Z

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 671
    .line 672
    .line 673
    return v3

    .line 674
    :pswitch_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    invoke-static {v4}, Ls62;->B3(Landroid/os/IBinder;)Lu62;

    .line 679
    .line 680
    .line 681
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 685
    .line 686
    .line 687
    return v3

    .line 688
    :pswitch_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1, v4}, Lmb3;->H3(Ljava/lang/String;)Lba2;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 700
    .line 701
    .line 702
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 703
    .line 704
    .line 705
    return v3

    .line 706
    :pswitch_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v4

    .line 710
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v1, v4}, Lmb3;->G3(Ljava/lang/String;)Z

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 721
    .line 722
    .line 723
    return v3

    .line 724
    :pswitch_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v1, v4}, Lmb3;->F3(Ljava/lang/String;)Lkw1;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 736
    .line 737
    .line 738
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 739
    .line 740
    .line 741
    return v3

    .line 742
    :pswitch_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v4

    .line 746
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v1, v4}, Lmb3;->E3(Ljava/lang/String;)Z

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 757
    .line 758
    .line 759
    return v3

    .line 760
    :pswitch_f
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v4

    .line 764
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v1, v4}, Lmb3;->D3(Ljava/lang/String;)Lya2;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 772
    .line 773
    .line 774
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 775
    .line 776
    .line 777
    return v3

    .line 778
    :pswitch_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v4}, Lmb3;->C3(Ljava/lang/String;)Z

    .line 786
    .line 787
    .line 788
    move-result v0

    .line 789
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 793
    .line 794
    .line 795
    return v3

    .line 796
    :pswitch_11
    sget-object v5, Lae3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 797
    .line 798
    invoke-virtual {v0, v5}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    if-nez v6, :cond_12

    .line 807
    .line 808
    goto :goto_14

    .line 809
    :cond_12
    const-string v4, "com.google.android.gms.ads.internal.client.IAdPreloadCallback"

    .line 810
    .line 811
    invoke-interface {v6, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 812
    .line 813
    .line 814
    move-result-object v4

    .line 815
    instance-of v7, v4, Lod2;

    .line 816
    .line 817
    if-eqz v7, :cond_13

    .line 818
    .line 819
    check-cast v4, Lod2;

    .line 820
    .line 821
    goto :goto_14

    .line 822
    :cond_13
    new-instance v4, Lod2;

    .line 823
    .line 824
    const-string v7, "com.google.android.gms.ads.internal.client.IAdPreloadCallback"

    .line 825
    .line 826
    const/4 v8, 0x2

    .line 827
    invoke-direct {v4, v6, v7, v8}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 828
    .line 829
    .line 830
    :goto_14
    invoke-static {v0}, Liv1;->f(Landroid/os/Parcel;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v1, v5, v4}, Lmb3;->B3(Ljava/util/ArrayList;Lod2;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v2}, Landroid/os/Parcel;->writeNoException()V

    .line 837
    .line 838
    .line 839
    return v3

    .line 840
    nop

    .line 841
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

.method public final B3(Ljava/util/ArrayList;Lod2;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lmb3;->f:Lnb3;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    iget-object v0, v2, Lnb3;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :goto_0
    move-object/from16 v0, p1

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    iget-object v0, v2, Lnb3;->f:Landroid/net/ConnectivityManager;

    .line 20
    .line 21
    const/4 v4, 0x5

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    :try_start_1
    iget-object v0, v2, Lnb3;->f:Landroid/net/ConnectivityManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    :try_start_2
    iget-object v0, v2, Lnb3;->e:Landroid/content/Context;

    .line 30
    .line 31
    const-string v5, "connectivity"

    .line 32
    .line 33
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 38
    .line 39
    iput-object v0, v2, Lnb3;->f:Landroid/net/ConnectivityManager;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_2

    .line 44
    :catch_0
    :try_start_3
    invoke-static {v4}, Lgi2;->q0(I)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_1
    monitor-exit v2

    .line 48
    goto :goto_3

    .line 49
    :goto_2
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    :try_start_4
    throw v0

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    goto/16 :goto_8

    .line 53
    .line 54
    :cond_2
    :goto_3
    iget-object v0, v2, Lnb3;->f:Landroid/net/ConnectivityManager;

    .line 55
    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 59
    .line 60
    sget-object v4, Lmz1;->F:Liz1;

    .line 61
    .line 62
    sget-object v5, Ltw1;->e:Ltw1;

    .line 63
    .line 64
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iput-object v0, v2, Lnb3;->i:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_3
    :try_start_5
    iget-object v0, v2, Lnb3;->f:Landroid/net/ConnectivityManager;

    .line 83
    .line 84
    new-instance v5, Lra0;

    .line 85
    .line 86
    invoke-direct {v5, v2}, Lra0;-><init>(Lnb3;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v5}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :catch_1
    :try_start_6
    invoke-static {v4}, Lgi2;->q0(I)Z

    .line 94
    .line 95
    .line 96
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 97
    .line 98
    sget-object v4, Lmz1;->F:Liz1;

    .line 99
    .line 100
    sget-object v5, Ltw1;->e:Ltw1;

    .line 101
    .line 102
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 103
    .line 104
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 115
    .line 116
    .line 117
    iput-object v0, v2, Lnb3;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 118
    .line 119
    :goto_4
    sget-object v0, Lhg4;->C:Lhg4;

    .line 120
    .line 121
    iget-object v0, v0, Lhg4;->g:Lwy0;

    .line 122
    .line 123
    new-instance v4, Lqw1;

    .line 124
    .line 125
    invoke-direct {v4, v2}, Lqw1;-><init>(Lnb3;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v4}, Lwy0;->f(Lwv1;)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :goto_5
    invoke-virtual {v2, v0}, Lnb3;->d(Ljava/util/List;)Ljava/util/ArrayList;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v4, Ljava/util/EnumMap;

    .line 137
    .line 138
    const-class v5, Ls2;

    .line 139
    .line 140
    invoke-direct {v4, v5}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    const/4 v6, 0x0

    .line 148
    move v7, v6

    .line 149
    :cond_4
    :goto_6
    if-ge v7, v5, :cond_7

    .line 150
    .line 151
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    add-int/lit8 v7, v7, 0x1

    .line 156
    .line 157
    check-cast v8, Lae3;

    .line 158
    .line 159
    iget-object v9, v8, Lae3;->f:Ljava/lang/String;

    .line 160
    .line 161
    iget v10, v8, Lae3;->g:I

    .line 162
    .line 163
    invoke-static {v10}, Ls2;->a(I)Ls2;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    iget-object v11, v2, Lnb3;->c:Lub3;

    .line 168
    .line 169
    move-object/from16 v12, p2

    .line 170
    .line 171
    invoke-virtual {v11, v8, v12}, Lub3;->a(Lae3;Lod2;)Ljb3;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    if-eqz v10, :cond_4

    .line 176
    .line 177
    if-eqz v11, :cond_4

    .line 178
    .line 179
    iget-object v13, v2, Lnb3;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 180
    .line 181
    if-eqz v13, :cond_5

    .line 182
    .line 183
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    invoke-virtual {v11, v13}, Ljb3;->l(I)V

    .line 188
    .line 189
    .line 190
    :cond_5
    iget-object v13, v2, Lnb3;->d:Lsq0;

    .line 191
    .line 192
    iput-object v13, v11, Ljb3;->p:Lsq0;

    .line 193
    .line 194
    invoke-static {v9, v10}, Lnb3;->a(Ljava/lang/String;Ls2;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    monitor-enter v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 199
    :try_start_7
    monitor-enter v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 200
    :try_start_8
    new-instance v15, Ltb3;

    .line 201
    .line 202
    invoke-direct {v15, v11, v6}, Ltb3;-><init>(Ljb3;I)V

    .line 203
    .line 204
    .line 205
    move/from16 v19, v3

    .line 206
    .line 207
    iget-object v3, v11, Ljb3;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 208
    .line 209
    invoke-interface {v3, v15}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 210
    .line 211
    .line 212
    :try_start_9
    monitor-exit v11

    .line 213
    iget-object v3, v2, Lnb3;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 214
    .line 215
    invoke-virtual {v3, v14, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 216
    .line 217
    .line 218
    :try_start_a
    monitor-exit v2

    .line 219
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    sget-object v11, Lj63;->b:Lwc1;

    .line 224
    .line 225
    invoke-virtual {v4, v10}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    if-eqz v11, :cond_6

    .line 230
    .line 231
    invoke-virtual {v4, v10}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    :cond_6
    check-cast v3, Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    add-int/lit8 v3, v3, 0x1

    .line 242
    .line 243
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v4, v10, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    new-instance v3, Lpb3;

    .line 251
    .line 252
    invoke-direct {v3, v9, v10}, Lpb3;-><init>(Ljava/lang/String;Ls2;)V

    .line 253
    .line 254
    .line 255
    new-instance v9, Lqb3;

    .line 256
    .line 257
    invoke-direct {v9, v3}, Lqb3;-><init>(Lpb3;)V

    .line 258
    .line 259
    .line 260
    iget v14, v8, Lae3;->i:I

    .line 261
    .line 262
    iget-object v3, v2, Lnb3;->h:Lym;

    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 268
    .line 269
    .line 270
    move-result-wide v15

    .line 271
    const-string v18, "1"

    .line 272
    .line 273
    move-object/from16 v17, v9

    .line 274
    .line 275
    invoke-virtual/range {v13 .. v18}, Lsq0;->q(IJLqb3;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 276
    .line 277
    .line 278
    move/from16 v3, v19

    .line 279
    .line 280
    goto/16 :goto_6

    .line 281
    .line 282
    :catchall_2
    move-exception v0

    .line 283
    goto :goto_7

    .line 284
    :catchall_3
    move-exception v0

    .line 285
    :try_start_b
    monitor-exit v11
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 286
    :try_start_c
    throw v0

    .line 287
    :goto_7
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 288
    :try_start_d
    throw v0

    .line 289
    :cond_7
    iget-object v0, v2, Lnb3;->d:Lsq0;

    .line 290
    .line 291
    iget-object v3, v2, Lnb3;->h:Lym;

    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 297
    .line 298
    .line 299
    move-result-wide v5

    .line 300
    invoke-virtual {v0, v4, v5, v6}, Lsq0;->r(Ljava/util/EnumMap;J)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 301
    .line 302
    .line 303
    monitor-exit v2

    .line 304
    return-void

    .line 305
    :goto_8
    :try_start_e
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 306
    throw v0
.end method

.method public final C3(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lmb3;->f:Lnb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ls2;->i:Ls2;

    .line 5
    .line 6
    invoke-virtual {v0, p1, v1}, Lnb3;->e(Ljava/lang/String;Ls2;)Z

    .line 7
    .line 8
    .line 9
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p1
.end method

.method public final D3(Ljava/lang/String;)Lya2;
    .locals 3

    .line 1
    iget-object v0, p0, Lmb3;->f:Lnb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ls2;->i:Ls2;

    .line 5
    .line 6
    const-class v2, Lya2;

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lnb3;->f(Ls2;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lya2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final E3(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lmb3;->f:Lnb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ls2;->l:Ls2;

    .line 5
    .line 6
    invoke-virtual {v0, p1, v1}, Lnb3;->e(Ljava/lang/String;Ls2;)Z

    .line 7
    .line 8
    .line 9
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p1
.end method

.method public final F3(Ljava/lang/String;)Lkw1;
    .locals 3

    .line 1
    iget-object v0, p0, Lmb3;->f:Lnb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ls2;->l:Ls2;

    .line 5
    .line 6
    const-class v2, Lkw1;

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lnb3;->f(Ls2;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lkw1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final G3(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lmb3;->f:Lnb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ls2;->h:Ls2;

    .line 5
    .line 6
    invoke-virtual {v0, p1, v1}, Lnb3;->e(Ljava/lang/String;Ls2;)Z

    .line 7
    .line 8
    .line 9
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return p1

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p1
.end method

.method public final H3(Ljava/lang/String;)Lba2;
    .locals 3

    .line 1
    iget-object v0, p0, Lmb3;->f:Lnb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ls2;->h:Ls2;

    .line 5
    .line 6
    const-class v2, Lba2;

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2, p1}, Lnb3;->f(Ls2;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lba2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final I3(Ljava/lang/String;Lae3;Lbf2;)Z
    .locals 9

    .line 1
    iget-object v1, p0, Lmb3;->g:Lgb3;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, v1, Lgb3;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    iget-object v0, v1, Lgb3;->e:Landroid/net/ConnectivityManager;

    .line 16
    .line 17
    const/4 v3, 0x5

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    :try_start_1
    iget-object v0, v1, Lgb3;->e:Landroid/net/ConnectivityManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :try_start_2
    iget-object v0, v1, Lgb3;->d:Landroid/content/Context;

    .line 26
    .line 27
    const-string v4, "connectivity"

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 34
    .line 35
    iput-object v0, v1, Lgb3;->e:Landroid/net/ConnectivityManager;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    move-object p1, v0

    .line 40
    goto :goto_1

    .line 41
    :catch_0
    :try_start_3
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    monitor-exit v1

    .line 45
    goto :goto_2

    .line 46
    :goto_1
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 47
    :try_start_4
    throw p1

    .line 48
    :catchall_1
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    goto/16 :goto_7

    .line 51
    .line 52
    :cond_2
    :goto_2
    iget-object v0, v1, Lgb3;->e:Landroid/net/ConnectivityManager;

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 57
    .line 58
    sget-object v3, Lmz1;->F:Liz1;

    .line 59
    .line 60
    sget-object v4, Ltw1;->e:Ltw1;

    .line 61
    .line 62
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 63
    .line 64
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object v0, v1, Lgb3;->h:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    :try_start_5
    iget-object v0, v1, Lgb3;->e:Landroid/net/ConnectivityManager;

    .line 81
    .line 82
    new-instance v4, Lra0;

    .line 83
    .line 84
    invoke-direct {v4, v1}, Lra0;-><init>(Lgb3;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v4}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :catch_1
    :try_start_6
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 92
    .line 93
    .line 94
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 95
    .line 96
    sget-object v3, Lmz1;->F:Liz1;

    .line 97
    .line 98
    sget-object v4, Ltw1;->e:Ltw1;

    .line 99
    .line 100
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 101
    .line 102
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 113
    .line 114
    .line 115
    iput-object v0, v1, Lgb3;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 116
    .line 117
    :goto_3
    sget-object v0, Lhg4;->C:Lhg4;

    .line 118
    .line 119
    iget-object v0, v0, Lhg4;->g:Lwy0;

    .line 120
    .line 121
    new-instance v3, Lqw1;

    .line 122
    .line 123
    invoke-direct {v3, v1}, Lqw1;-><init>(Lgb3;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v3}, Lwy0;->f(Lwv1;)V

    .line 127
    .line 128
    .line 129
    :goto_4
    iget v0, p2, Lae3;->g:I

    .line 130
    .line 131
    invoke-static {v0}, Ls2;->a(I)Ls2;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-nez v0, :cond_4

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_4
    iget-object v3, v1, Lgb3;->a:Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Ljava/util/Map;

    .line 151
    .line 152
    invoke-interface {v4, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-nez v4, :cond_6

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Lgb3;->d(Ls2;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_6

    .line 163
    .line 164
    iget-object v4, v1, Lgb3;->b:Lub3;

    .line 165
    .line 166
    invoke-virtual {v4, p1, p2, p3}, Lub3;->b(Ljava/lang/String;Lae3;Lbf2;)Ljb3;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    if-eqz p3, :cond_6

    .line 171
    .line 172
    iget-object v4, v1, Lgb3;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 173
    .line 174
    if-eqz v4, :cond_5

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-virtual {p3, v4}, Ljb3;->l(I)V

    .line 181
    .line 182
    .line 183
    :cond_5
    move-object v4, v3

    .line 184
    iget-object v3, v1, Lgb3;->c:Lsq0;

    .line 185
    .line 186
    iput-object v3, p3, Ljb3;->p:Lsq0;

    .line 187
    .line 188
    monitor-enter p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 189
    :try_start_7
    new-instance v5, Ltb3;

    .line 190
    .line 191
    const/4 v6, 0x0

    .line 192
    invoke-direct {v5, p3, v6}, Ltb3;-><init>(Ljb3;I)V

    .line 193
    .line 194
    .line 195
    iget-object v6, p3, Ljb3;->m:Ljava/util/concurrent/ScheduledExecutorService;

    .line 196
    .line 197
    invoke-interface {v6, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 198
    .line 199
    .line 200
    :try_start_8
    monitor-exit p3

    .line 201
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    check-cast v4, Ljava/util/Map;

    .line 206
    .line 207
    invoke-interface {v4, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    new-instance p3, Lpb3;

    .line 211
    .line 212
    iget-object v4, p2, Lae3;->f:Ljava/lang/String;

    .line 213
    .line 214
    invoke-direct {p3, v4, v0}, Lpb3;-><init>(Ljava/lang/String;Ls2;)V

    .line 215
    .line 216
    .line 217
    iput-object p1, p3, Lpb3;->h:Ljava/lang/Object;

    .line 218
    .line 219
    new-instance v7, Lqb3;

    .line 220
    .line 221
    invoke-direct {v7, p3}, Lqb3;-><init>(Lpb3;)V

    .line 222
    .line 223
    .line 224
    iget v4, p2, Lae3;->i:I

    .line 225
    .line 226
    iget-object p1, v1, Lgb3;->g:Lym;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 232
    .line 233
    .line 234
    move-result-wide v5

    .line 235
    const-string v8, "2"

    .line 236
    .line 237
    invoke-virtual/range {v3 .. v8}, Lsq0;->q(IJLqb3;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 238
    .line 239
    .line 240
    monitor-exit v1

    .line 241
    goto :goto_6

    .line 242
    :catchall_2
    move-exception v0

    .line 243
    move-object p1, v0

    .line 244
    :try_start_9
    monitor-exit p3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 245
    :try_start_a
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 246
    :cond_6
    :goto_5
    monitor-exit v1

    .line 247
    const/4 v2, 0x0

    .line 248
    :goto_6
    return v2

    .line 249
    :goto_7
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 250
    throw p1
.end method

.method public final J3(Ljava/lang/String;I)Z
    .locals 13

    .line 1
    invoke-static {p2}, Ls2;->a(I)Ls2;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v1, p0, Lmb3;->g:Lgb3;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v2, v1, Lgb3;->g:Lym;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v6

    .line 21
    iget-object v2, v1, Lgb3;->a:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    monitor-exit v1

    .line 30
    return v0

    .line 31
    :cond_1
    :try_start_1
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljb3;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    move-object v9, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {v2}, Ljb3;->k()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    move-object v9, v4

    .line 53
    :goto_0
    if-eqz v9, :cond_3

    .line 54
    .line 55
    iget-object v4, v2, Ljb3;->e:Lae3;

    .line 56
    .line 57
    iget v4, v4, Lae3;->g:I

    .line 58
    .line 59
    invoke-static {v4}, Ls2;->a(I)Ls2;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    move v12, v4

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move v12, v0

    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    goto :goto_7

    .line 77
    :goto_1
    if-eqz v12, :cond_4

    .line 78
    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    move-object v8, v4

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-object v8, v3

    .line 90
    :goto_2
    if-nez v2, :cond_5

    .line 91
    .line 92
    move-object v10, v3

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    new-instance v3, Lpb3;

    .line 95
    .line 96
    iget-object v4, v2, Ljb3;->e:Lae3;

    .line 97
    .line 98
    iget-object v4, v4, Lae3;->f:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct {v3, v4, p2}, Lpb3;-><init>(Ljava/lang/String;Ls2;)V

    .line 101
    .line 102
    .line 103
    iput-object p1, v3, Lpb3;->h:Ljava/lang/Object;

    .line 104
    .line 105
    new-instance p1, Lqb3;

    .line 106
    .line 107
    invoke-direct {p1, v3}, Lqb3;-><init>(Lpb3;)V

    .line 108
    .line 109
    .line 110
    move-object v10, p1

    .line 111
    :goto_3
    iget-object v3, v1, Lgb3;->c:Lsq0;

    .line 112
    .line 113
    if-nez v2, :cond_6

    .line 114
    .line 115
    move v4, v0

    .line 116
    goto :goto_4

    .line 117
    :cond_6
    iget-object p1, v2, Ljb3;->e:Lae3;

    .line 118
    .line 119
    iget p1, p1, Lae3;->i:I

    .line 120
    .line 121
    move v4, p1

    .line 122
    :goto_4
    if-nez v2, :cond_7

    .line 123
    .line 124
    :goto_5
    move v5, v0

    .line 125
    goto :goto_6

    .line 126
    :cond_7
    invoke-virtual {v2}, Ljb3;->m()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    goto :goto_5

    .line 131
    :goto_6
    const-string v11, "2"

    .line 132
    .line 133
    invoke-virtual/range {v3 .. v11}, Lsq0;->u(IIJLjava/lang/Long;Ljava/lang/String;Lqb3;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    .line 136
    monitor-exit v1

    .line 137
    return v12

    .line 138
    :goto_7
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    throw p1
.end method

.method public final K3(Ljava/lang/String;)Lba2;
    .locals 3

    .line 1
    iget-object v0, p0, Lmb3;->g:Lgb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-class v1, Lba2;

    .line 5
    .line 6
    sget-object v2, Ls2;->h:Ls2;

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1, p1}, Lgb3;->c(Ls2;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lba2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final L3(Ljava/lang/String;)Lkw1;
    .locals 3

    .line 1
    iget-object v0, p0, Lmb3;->g:Lgb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-class v1, Lkw1;

    .line 5
    .line 6
    sget-object v2, Ls2;->l:Ls2;

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1, p1}, Lgb3;->c(Ls2;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lkw1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final M3(Ljava/lang/String;)Lya2;
    .locals 3

    .line 1
    iget-object v0, p0, Lmb3;->g:Lgb3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-class v1, Lya2;

    .line 5
    .line 6
    sget-object v2, Ls2;->i:Ls2;

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1, p1}, Lgb3;->c(Ls2;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lya2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final N3(Ljava/lang/String;I)Lae3;
    .locals 12

    .line 1
    invoke-static {p2}, Ls2;->a(I)Ls2;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez v6, :cond_0

    .line 7
    .line 8
    return-object p2

    .line 9
    :cond_0
    iget-object v10, p0, Lmb3;->g:Lgb3;

    .line 10
    .line 11
    monitor-enter v10

    .line 12
    :try_start_0
    iget-object v0, v10, Lgb3;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v11, v0

    .line 32
    check-cast v11, Ljb3;

    .line 33
    .line 34
    iget-object v0, v10, Lgb3;->c:Lsq0;

    .line 35
    .line 36
    iget-object v1, v10, Lgb3;->g:Lym;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    if-nez v11, :cond_2

    .line 46
    .line 47
    move-object v5, p2

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iget-object v1, v11, Ljb3;->e:Lae3;

    .line 50
    .line 51
    iget-object v1, v1, Lae3;->f:Ljava/lang/String;

    .line 52
    .line 53
    move-object v5, v1

    .line 54
    :goto_0
    const/4 v1, -0x1

    .line 55
    if-nez v11, :cond_3

    .line 56
    .line 57
    move v7, v1

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-object v4, v11, Ljb3;->e:Lae3;

    .line 60
    .line 61
    iget v4, v4, Lae3;->i:I

    .line 62
    .line 63
    move v7, v4

    .line 64
    :goto_1
    if-nez v11, :cond_4

    .line 65
    .line 66
    :goto_2
    move v8, v1

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    invoke-virtual {v11}, Ljb3;->m()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    goto :goto_2

    .line 73
    :goto_3
    const-string v1, "pgc"

    .line 74
    .line 75
    const/4 v9, 0x1

    .line 76
    move-object v4, p1

    .line 77
    invoke-virtual/range {v0 .. v9}, Lsq0;->y(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ls2;III)V

    .line 78
    .line 79
    .line 80
    if-eqz v11, :cond_5

    .line 81
    .line 82
    iget-object p1, v11, Ljb3;->e:Lae3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    monitor-exit v10

    .line 85
    return-object p1

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    move-object p1, v0

    .line 88
    goto :goto_5

    .line 89
    :cond_5
    :goto_4
    monitor-exit v10

    .line 90
    return-object p2

    .line 91
    :goto_5
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    throw p1
.end method

.method public final f1(Ls62;)V
    .locals 0

    .line 1
    return-void
.end method
