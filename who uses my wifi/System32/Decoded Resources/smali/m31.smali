.class public abstract Lm31;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Luk2;

.field public static final b:Lt90;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lp31;

    .line 8
    .line 9
    invoke-direct {v0}, Luk2;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lm31;->a:Luk2;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x1c

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lo31;

    .line 20
    .line 21
    invoke-direct {v0}, Ln31;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lm31;->a:Luk2;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance v0, Ln31;

    .line 28
    .line 29
    invoke-direct {v0}, Ln31;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lm31;->a:Luk2;

    .line 33
    .line 34
    :goto_0
    new-instance v0, Lt90;

    .line 35
    .line 36
    const/16 v1, 0x10

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lt90;-><init>(I)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lm31;->b:Lt90;

    .line 42
    .line 43
    return-void
.end method

.method public static a(Landroid/content/Context;Lsv;Landroid/content/res/Resources;ILjava/lang/String;IILg82;Z)Landroid/graphics/Typeface;
    .locals 14

    .line 1
    move/from16 v4, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, p1, Lvv;

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    const/4 v6, -0x3

    .line 9
    if-eqz v2, :cond_d

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lvv;

    .line 13
    .line 14
    iget-object v2, v0, Lvv;->d:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v2, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 32
    .line 33
    invoke-static {v5, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2, v5}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    move-object v2, v7

    .line 47
    :goto_1
    if-eqz v2, :cond_3

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    new-instance p0, Landroid/os/Handler;

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lr5;

    .line 61
    .line 62
    invoke-direct {v0, v1, v2, v3}, Lr5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object v2

    .line 69
    :cond_3
    const/4 v9, 0x1

    .line 70
    if-eqz p8, :cond_5

    .line 71
    .line 72
    iget v2, v0, Lvv;->c:I

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    :goto_2
    move v2, v9

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move v2, v8

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    if-nez v1, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :goto_3
    const/4 v5, -0x1

    .line 84
    if-eqz p8, :cond_6

    .line 85
    .line 86
    iget v10, v0, Lvv;->b:I

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    move v10, v5

    .line 90
    :goto_4
    new-instance v11, Landroid/os/Handler;

    .line 91
    .line 92
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-direct {v11, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 97
    .line 98
    .line 99
    new-instance v12, Lf23;

    .line 100
    .line 101
    const/16 v13, 0x9

    .line 102
    .line 103
    invoke-direct {v12, v13}, Lf23;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iput-object v1, v12, Lf23;->g:Ljava/lang/Object;

    .line 107
    .line 108
    iget-object v0, v0, Lvv;->a:Lg4;

    .line 109
    .line 110
    new-instance v13, Lgw3;

    .line 111
    .line 112
    const/4 v1, 0x4

    .line 113
    invoke-direct {v13, v12, v11, v1, v8}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 114
    .line 115
    .line 116
    if-eqz v2, :cond_9

    .line 117
    .line 118
    sget-object v1, Lqv;->a:Lt90;

    .line 119
    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    iget-object v2, v0, Lg4;->k:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v2, "-"

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    sget-object v2, Lqv;->a:Lt90;

    .line 145
    .line 146
    invoke-virtual {v2, v1}, Lt90;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Landroid/graphics/Typeface;

    .line 151
    .line 152
    if-eqz v2, :cond_7

    .line 153
    .line 154
    new-instance p0, Ljq3;

    .line 155
    .line 156
    invoke-direct {p0, v12, v2, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v11, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 160
    .line 161
    .line 162
    :goto_5
    move-object v7, v2

    .line 163
    goto/16 :goto_9

    .line 164
    .line 165
    :cond_7
    if-ne v10, v5, :cond_8

    .line 166
    .line 167
    invoke-static {v1, p0, v0, v4}, Lqv;->a(Ljava/lang/String;Landroid/content/Context;Lg4;I)Lpv;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {v13, p0}, Lgw3;->v(Lpv;)V

    .line 172
    .line 173
    .line 174
    iget-object v7, p0, Lpv;->a:Landroid/graphics/Typeface;

    .line 175
    .line 176
    goto/16 :goto_9

    .line 177
    .line 178
    :cond_8
    move-object v3, v0

    .line 179
    new-instance v0, Lnv;

    .line 180
    .line 181
    const/4 v5, 0x0

    .line 182
    move-object v2, p0

    .line 183
    invoke-direct/range {v0 .. v5}, Lnv;-><init>(Ljava/lang/String;Landroid/content/Context;Lg4;II)V

    .line 184
    .line 185
    .line 186
    :try_start_0
    sget-object p0, Lqv;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 187
    .line 188
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 189
    .line 190
    .line 191
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    .line 192
    int-to-long v0, v10

    .line 193
    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 194
    .line 195
    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 199
    :try_start_2
    check-cast p0, Lpv;

    .line 200
    .line 201
    invoke-virtual {v13, p0}, Lgw3;->v(Lpv;)V

    .line 202
    .line 203
    .line 204
    iget-object v7, p0, Lpv;->a:Landroid/graphics/Typeface;

    .line 205
    .line 206
    goto/16 :goto_9

    .line 207
    .line 208
    :catch_0
    move-exception v0

    .line 209
    move-object p0, v0

    .line 210
    goto :goto_6

    .line 211
    :catch_1
    move-exception v0

    .line 212
    move-object p0, v0

    .line 213
    goto :goto_7

    .line 214
    :catch_2
    new-instance p0, Ljava/lang/InterruptedException;

    .line 215
    .line 216
    const-string v0, "timeout"

    .line 217
    .line 218
    invoke-direct {p0, v0}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw p0

    .line 222
    :goto_6
    throw p0

    .line 223
    :goto_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 224
    .line 225
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 229
    :catch_3
    iget-object p0, v13, Lgw3;->h:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p0, Landroid/os/Handler;

    .line 232
    .line 233
    iget-object v0, v13, Lgw3;->g:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lf23;

    .line 236
    .line 237
    new-instance v1, Lcd;

    .line 238
    .line 239
    invoke-direct {v1, v0, v6, v8}, Lcd;-><init>(Ljava/lang/Object;II)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 243
    .line 244
    .line 245
    goto/16 :goto_9

    .line 246
    .line 247
    :cond_9
    sget-object v1, Lqv;->a:Lt90;

    .line 248
    .line 249
    new-instance v1, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    iget-object v2, v0, Lg4;->k:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v2, Ljava/lang/String;

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v2, "-"

    .line 262
    .line 263
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    sget-object v2, Lqv;->a:Lt90;

    .line 274
    .line 275
    invoke-virtual {v2, v1}, Lt90;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, Landroid/graphics/Typeface;

    .line 280
    .line 281
    if-eqz v2, :cond_a

    .line 282
    .line 283
    new-instance p0, Ljq3;

    .line 284
    .line 285
    invoke-direct {p0, v12, v2, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v11, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 289
    .line 290
    .line 291
    goto/16 :goto_5

    .line 292
    .line 293
    :cond_a
    new-instance v2, Lov;

    .line 294
    .line 295
    invoke-direct {v2, v8, v13}, Lov;-><init>(ILjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    sget-object v5, Lqv;->c:Ljava/lang/Object;

    .line 299
    .line 300
    monitor-enter v5

    .line 301
    :try_start_3
    sget-object v3, Lqv;->d:Lbw0;

    .line 302
    .line 303
    invoke-virtual {v3, v1}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    check-cast v6, Ljava/util/ArrayList;

    .line 308
    .line 309
    if-eqz v6, :cond_b

    .line 310
    .line 311
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    monitor-exit v5

    .line 315
    goto :goto_9

    .line 316
    :catchall_0
    move-exception v0

    .line 317
    move-object p0, v0

    .line 318
    goto :goto_a

    .line 319
    :cond_b
    new-instance v6, Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v1, v6}, Lbw0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 331
    move-object v3, v0

    .line 332
    new-instance v0, Lnv;

    .line 333
    .line 334
    const/4 v5, 0x1

    .line 335
    move-object v2, p0

    .line 336
    invoke-direct/range {v0 .. v5}, Lnv;-><init>(Ljava/lang/String;Landroid/content/Context;Lg4;II)V

    .line 337
    .line 338
    .line 339
    sget-object p0, Lqv;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 340
    .line 341
    new-instance v2, Lov;

    .line 342
    .line 343
    invoke-direct {v2, v9, v1}, Lov;-><init>(ILjava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    if-nez v1, :cond_c

    .line 351
    .line 352
    new-instance v1, Landroid/os/Handler;

    .line 353
    .line 354
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 359
    .line 360
    .line 361
    goto :goto_8

    .line 362
    :cond_c
    new-instance v1, Landroid/os/Handler;

    .line 363
    .line 364
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 365
    .line 366
    .line 367
    :goto_8
    new-instance v3, Lgi;

    .line 368
    .line 369
    const/4 v5, 0x3

    .line 370
    invoke-direct {v3, v5}, Lgi;-><init>(I)V

    .line 371
    .line 372
    .line 373
    iput-object v0, v3, Lgi;->g:Ljava/lang/Object;

    .line 374
    .line 375
    iput-object v2, v3, Lgi;->h:Ljava/lang/Object;

    .line 376
    .line 377
    iput-object v1, v3, Lgi;->i:Ljava/lang/Object;

    .line 378
    .line 379
    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 380
    .line 381
    .line 382
    :goto_9
    move-object p0, v7

    .line 383
    move-object/from16 v7, p2

    .line 384
    .line 385
    goto :goto_b

    .line 386
    :goto_a
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 387
    throw p0

    .line 388
    :cond_d
    sget-object v5, Lm31;->a:Luk2;

    .line 389
    .line 390
    move-object v0, p1

    .line 391
    check-cast v0, Ltv;

    .line 392
    .line 393
    move-object/from16 v7, p2

    .line 394
    .line 395
    invoke-virtual {v5, p0, v0, v7, v4}, Luk2;->k(Landroid/content/Context;Ltv;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    if-eqz v1, :cond_f

    .line 400
    .line 401
    if-eqz p0, :cond_e

    .line 402
    .line 403
    new-instance v0, Landroid/os/Handler;

    .line 404
    .line 405
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 410
    .line 411
    .line 412
    new-instance v2, Lr5;

    .line 413
    .line 414
    invoke-direct {v2, v1, p0, v3}, Lr5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 418
    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_e
    invoke-virtual {v1, v6}, Lg82;->b(I)V

    .line 422
    .line 423
    .line 424
    :cond_f
    :goto_b
    if-eqz p0, :cond_10

    .line 425
    .line 426
    sget-object v0, Lm31;->b:Lt90;

    .line 427
    .line 428
    invoke-static/range {p2 .. p6}, Lm31;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-virtual {v0, v1, p0}, Lt90;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    :cond_10
    return-object p0
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
