.class public final Lv52;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lmm2;

.field public final synthetic h:Lb62;

.field public final synthetic i:Lq52;

.field public final synthetic j:Ljava/util/ArrayList;

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lmm2;Lb62;Lq52;Ljava/util/ArrayList;JI)V
    .locals 0

    .line 1
    iput p7, p0, Lv52;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lv52;->h:Lb62;

    .line 4
    .line 5
    iput-object p3, p0, Lv52;->i:Lq52;

    .line 6
    .line 7
    iput-object p4, p0, Lv52;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    iput-wide p5, p0, Lv52;->k:J

    .line 10
    .line 11
    iput-object p1, p0, Lv52;->g:Lmm2;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lv52;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lv52;->g:Lmm2;

    .line 9
    .line 10
    iget-object v2, v1, Lv52;->h:Lb62;

    .line 11
    .line 12
    iget-object v3, v1, Lv52;->i:Lq52;

    .line 13
    .line 14
    iget-object v4, v1, Lv52;->j:Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-wide v5, v1, Lv52;->k:J

    .line 17
    .line 18
    const-string v7, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock"

    .line 19
    .line 20
    invoke-static {v7}, Lgi2;->G(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v7, v0, Lmm2;->b:Ljava/lang/Object;

    .line 24
    .line 25
    const-string v8, " ms. Rejecting."

    .line 26
    .line 27
    const-string v9, " ms. Total latency(onEngLoadedTimeout) is "

    .line 28
    .line 29
    const-string v10, ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is "

    .line 30
    .line 31
    const-string v11, ". Update status(onEngLoadedTimeout) is "

    .line 32
    .line 33
    const-string v12, " ms. JS engine session reference status(onEngLoadedTimeout) is "

    .line 34
    .line 35
    const-string v13, "Could not receive /jsLoaded in "

    .line 36
    .line 37
    monitor-enter v7

    .line 38
    :try_start_0
    const-string v14, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired"

    .line 39
    .line 40
    invoke-static {v14}, Lgi2;->G(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v14, v2, Le6;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v14, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    .line 47
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    const/4 v15, -0x1

    .line 52
    if-eq v14, v15, :cond_2

    .line 53
    .line 54
    iget-object v14, v2, Le6;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v14, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 57
    .line 58
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    const/4 v15, 0x1

    .line 63
    if-ne v14, v15, :cond_0

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_0
    sget-object v14, Lmz1;->g8:Liz1;

    .line 68
    .line 69
    sget-object v15, Ltw1;->e:Ltw1;

    .line 70
    .line 71
    move-wide/from16 v16, v5

    .line 72
    .line 73
    iget-object v5, v15, Ltw1;->c:Lkz1;

    .line 74
    .line 75
    invoke-virtual {v5, v14}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_1

    .line 86
    .line 87
    new-instance v5, Ljava/util/concurrent/TimeoutException;

    .line 88
    .line 89
    const-string v6, "Unable to receive /jsLoaded GMSG."

    .line 90
    .line 91
    invoke-direct {v5, v6}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v6, "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener"

    .line 95
    .line 96
    invoke-virtual {v2, v6, v5}, Le6;->v(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :cond_1
    invoke-virtual {v2}, Le6;->u()V

    .line 104
    .line 105
    .line 106
    :goto_0
    sget-object v5, Lmd2;->f:Lld2;

    .line 107
    .line 108
    new-instance v6, Lu52;

    .line 109
    .line 110
    const/4 v14, 0x1

    .line 111
    invoke-direct {v6, v3, v14}, Lu52;-><init>(Lq52;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v6}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 115
    .line 116
    .line 117
    sget-object v3, Lmz1;->c:Liz1;

    .line 118
    .line 119
    iget-object v5, v15, Ltw1;->c:Lkz1;

    .line 120
    .line 121
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iget-object v2, v2, Le6;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    iget v0, v0, Lmm2;->g:I

    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    sget-object v5, Lhg4;->C:Lhg4;

    .line 149
    .line 150
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 156
    .line 157
    .line 158
    move-result-wide v5

    .line 159
    sub-long v5, v5, v16

    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    add-int/lit8 v14, v14, 0x5e

    .line 166
    .line 167
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 172
    .line 173
    .line 174
    move-result v15

    .line 175
    add-int/2addr v14, v15

    .line 176
    add-int/lit8 v14, v14, 0x27

    .line 177
    .line 178
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    add-int/2addr v14, v15

    .line 187
    add-int/lit8 v14, v14, 0x39

    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    add-int/2addr v14, v15

    .line 194
    add-int/lit8 v14, v14, 0x2a

    .line 195
    .line 196
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result v15

    .line 204
    add-int/2addr v14, v15

    .line 205
    add-int/lit8 v14, v14, 0xf

    .line 206
    .line 207
    new-instance v15, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v15, v14}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v15, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    const-string v0, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released"

    .line 254
    .line 255
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_2
    :goto_1
    :try_start_1
    const-string v0, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled"

    .line 260
    .line 261
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    monitor-exit v7

    .line 265
    :goto_2
    return-void

    .line 266
    :goto_3
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 267
    throw v0

    .line 268
    :pswitch_0
    const-string v0, "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock"

    .line 269
    .line 270
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object v0, v1, Lv52;->g:Lmm2;

    .line 274
    .line 275
    iget-object v2, v0, Lmm2;->b:Ljava/lang/Object;

    .line 276
    .line 277
    const-string v3, " ms at timeout. Rejecting."

    .line 278
    .line 279
    const-string v4, " ms. Total latency(fullLoadTimeout) is "

    .line 280
    .line 281
    const-string v5, ". Update status(fullLoadTimeout) is "

    .line 282
    .line 283
    const-string v6, " ms. JS engine session reference status(fullLoadTimeout) is "

    .line 284
    .line 285
    const-string v7, "Could not finish the full JS engine loading in "

    .line 286
    .line 287
    const-string v8, ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is "

    .line 288
    .line 289
    monitor-enter v2

    .line 290
    :try_start_2
    const-string v9, "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired"

    .line 291
    .line 292
    invoke-static {v9}, Lgi2;->G(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object v9, v1, Lv52;->h:Lb62;

    .line 296
    .line 297
    iget-object v10, v9, Le6;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v10, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 300
    .line 301
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    const/4 v11, -0x1

    .line 306
    if-eq v10, v11, :cond_6

    .line 307
    .line 308
    iget-object v10, v9, Le6;->b:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v10, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 311
    .line 312
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    const/4 v11, 0x1

    .line 317
    if-ne v10, v11, :cond_3

    .line 318
    .line 319
    goto/16 :goto_6

    .line 320
    .line 321
    :cond_3
    sget-object v10, Lmz1;->g8:Liz1;

    .line 322
    .line 323
    sget-object v11, Ltw1;->e:Ltw1;

    .line 324
    .line 325
    iget-object v12, v11, Ltw1;->c:Lkz1;

    .line 326
    .line 327
    invoke-virtual {v12, v10}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    check-cast v10, Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 334
    .line 335
    .line 336
    move-result v10

    .line 337
    if-eqz v10, :cond_4

    .line 338
    .line 339
    new-instance v10, Ljava/util/concurrent/TimeoutException;

    .line 340
    .line 341
    const-string v12, "Unable to fully load JS engine."

    .line 342
    .line 343
    invoke-direct {v10, v12}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const-string v12, "SdkJavascriptFactory.loadJavascriptEngine.Runnable"

    .line 347
    .line 348
    invoke-virtual {v9, v12, v10}, Le6;->v(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 349
    .line 350
    .line 351
    goto :goto_4

    .line 352
    :catchall_1
    move-exception v0

    .line 353
    goto/16 :goto_8

    .line 354
    .line 355
    :cond_4
    invoke-virtual {v9}, Le6;->u()V

    .line 356
    .line 357
    .line 358
    :goto_4
    sget-object v10, Lmd2;->f:Lld2;

    .line 359
    .line 360
    iget-object v12, v1, Lv52;->i:Lq52;

    .line 361
    .line 362
    new-instance v13, Lu52;

    .line 363
    .line 364
    const/4 v14, 0x0

    .line 365
    invoke-direct {v13, v12, v14}, Lu52;-><init>(Lq52;I)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v10, v13}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 369
    .line 370
    .line 371
    sget-object v10, Lmz1;->d:Liz1;

    .line 372
    .line 373
    iget-object v11, v11, Ltw1;->c:Lkz1;

    .line 374
    .line 375
    invoke-virtual {v11, v10}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v10

    .line 379
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    iget-object v9, v9, Le6;->b:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v9, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 386
    .line 387
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 388
    .line 389
    .line 390
    move-result v9

    .line 391
    iget v0, v0, Lmm2;->g:I

    .line 392
    .line 393
    iget-object v11, v1, Lv52;->j:Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 396
    .line 397
    .line 398
    move-result v12

    .line 399
    if-eqz v12, :cond_5

    .line 400
    .line 401
    const-string v8, ". Still waiting for the engine to be loaded"

    .line 402
    .line 403
    goto :goto_5

    .line 404
    :cond_5
    const/4 v12, 0x0

    .line 405
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v11

    .line 413
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 414
    .line 415
    .line 416
    move-result v12

    .line 417
    add-int/lit8 v12, v12, 0x58

    .line 418
    .line 419
    new-instance v13, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v13, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    :goto_5
    sget-object v11, Lhg4;->C:Lhg4;

    .line 435
    .line 436
    iget-object v11, v11, Lhg4;->k:Lym;

    .line 437
    .line 438
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 442
    .line 443
    .line 444
    move-result-wide v11

    .line 445
    iget-wide v13, v1, Lv52;->k:J

    .line 446
    .line 447
    sub-long/2addr v11, v13

    .line 448
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 449
    .line 450
    .line 451
    move-result v13

    .line 452
    add-int/lit8 v13, v13, 0x6b

    .line 453
    .line 454
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v14

    .line 458
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 459
    .line 460
    .line 461
    move-result v14

    .line 462
    add-int/2addr v13, v14

    .line 463
    add-int/lit8 v13, v13, 0x24

    .line 464
    .line 465
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v14

    .line 469
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 470
    .line 471
    .line 472
    move-result v14

    .line 473
    add-int/2addr v13, v14

    .line 474
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 475
    .line 476
    .line 477
    move-result v14

    .line 478
    add-int/2addr v13, v14

    .line 479
    add-int/lit8 v13, v13, 0x27

    .line 480
    .line 481
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v14

    .line 485
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 486
    .line 487
    .line 488
    move-result v14

    .line 489
    add-int/2addr v13, v14

    .line 490
    add-int/lit8 v13, v13, 0x1a

    .line 491
    .line 492
    new-instance v14, Ljava/lang/StringBuilder;

    .line 493
    .line 494
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v14, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 535
    const-string v0, "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released"

    .line 536
    .line 537
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    goto :goto_7

    .line 541
    :cond_6
    :goto_6
    :try_start_3
    const-string v0, "loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled"

    .line 542
    .line 543
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    monitor-exit v2

    .line 547
    :goto_7
    return-void

    .line 548
    :goto_8
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 549
    throw v0

    .line 550
    nop

    .line 551
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
