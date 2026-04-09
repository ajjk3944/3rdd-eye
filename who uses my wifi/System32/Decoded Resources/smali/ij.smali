.class public final Lij;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Leo1;


# instance fields
.field public volatile f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lij;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c(Ljo1;)Lho1;
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljo1;->e()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v2, v1, [Ljava/lang/String;

    .line 10
    .line 11
    new-array v1, v1, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v3, "ms"

    .line 22
    .line 23
    const-string v4, "Http assets remote cache took "

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    move v6, v5

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    check-cast v8, Ljava/lang/String;

    .line 44
    .line 45
    aput-object v8, v2, v6

    .line 46
    .line 47
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, Ljava/lang/String;

    .line 52
    .line 53
    aput-object v7, v1, v6

    .line 54
    .line 55
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v0, Lq42;

    .line 59
    .line 60
    iget-object p1, p1, Ljo1;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-direct {v0, p1, v2, v1}, Lq42;-><init>(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sget-object p1, Lhg4;->C:Lhg4;

    .line 66
    .line 67
    iget-object v1, p1, Lhg4;->k:Lym;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    const/4 v6, 0x0

    .line 77
    :try_start_0
    new-instance v7, Lpd2;

    .line 78
    .line 79
    invoke-direct {v7}, Lpd2;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v12, Lgw3;

    .line 83
    .line 84
    const/16 v8, 0x16

    .line 85
    .line 86
    invoke-direct {v12, p0, v7, v8}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    new-instance v13, Lv42;

    .line 90
    .line 91
    invoke-direct {v13, p0, v7}, Lv42;-><init>(Lij;Lpd2;)V

    .line 92
    .line 93
    .line 94
    new-instance v8, Lvw1;

    .line 95
    .line 96
    iget-object v9, p0, Lij;->g:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Landroid/content/Context;

    .line 99
    .line 100
    iget-object v10, p1, Lhg4;->t:Lr2;

    .line 101
    .line 102
    invoke-virtual {v10}, Lr2;->a()Landroid/os/Looper;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    sget v11, Lw11;->b:I

    .line 107
    .line 108
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    if-nez v11, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    move-object v9, v11

    .line 116
    :goto_1
    const/16 v11, 0xa6

    .line 117
    .line 118
    invoke-direct/range {v8 .. v13}, Lvw1;-><init>(Landroid/content/Context;Landroid/os/Looper;ILt9;Lu9;)V

    .line 119
    .line 120
    .line 121
    iput-object v8, p0, Lij;->f:Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v8, p0, Lij;->f:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v8, Lvw1;

    .line 126
    .line 127
    invoke-virtual {v8}, Lw9;->n()V

    .line 128
    .line 129
    .line 130
    new-instance v8, Lu42;

    .line 131
    .line 132
    invoke-direct {v8, p0, v0}, Lu42;-><init>(Lij;Lq42;)V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lmd2;->a:Lld2;

    .line 136
    .line 137
    invoke-static {v7, v8, v0}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    sget-object v8, Lmz1;->R4:Liz1;

    .line 142
    .line 143
    sget-object v9, Ltw1;->e:Ltw1;

    .line 144
    .line 145
    iget-object v9, v9, Ltw1;->c:Lkz1;

    .line 146
    .line 147
    invoke-virtual {v9, v8}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    int-to-long v8, v8

    .line 158
    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 159
    .line 160
    sget-object v11, Lmd2;->d:Lkd2;

    .line 161
    .line 162
    invoke-static {v7, v8, v9, v10, v11}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    new-instance v8, Lfu1;

    .line 167
    .line 168
    const/16 v9, 0x9

    .line 169
    .line 170
    invoke-direct {v8, v9, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v7, v8, v0}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 174
    .line 175
    .line 176
    invoke-interface {v7}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 181
    .line 182
    iget-object p1, p1, Lhg4;->k:Lym;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 188
    .line 189
    .line 190
    move-result-wide v7

    .line 191
    sub-long/2addr v7, v1

    .line 192
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    add-int/lit8 p1, p1, 0x20

    .line 201
    .line 202
    new-instance v1, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    sget-object p1, Lr42;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 224
    .line 225
    if-nez v0, :cond_2

    .line 226
    .line 227
    const-string p1, "File descriptor is empty, returning null."

    .line 228
    .line 229
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :goto_2
    move-object p1, v6

    .line 233
    goto :goto_3

    .line 234
    :cond_2
    new-instance v1, Ljava/io/DataInputStream;

    .line 235
    .line 236
    new-instance v2, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 237
    .line 238
    invoke-direct {v2, v0}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 239
    .line 240
    .line 241
    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 242
    .line 243
    .line 244
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    new-array v2, v0, [B

    .line 249
    .line 250
    invoke-virtual {v1, v2, v5, v0}, Ljava/io/DataInputStream;->readFully([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 251
    .line 252
    .line 253
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 254
    .line 255
    .line 256
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    :try_start_2
    invoke-virtual {v1, v2, v5, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 264
    .line 265
    .line 266
    invoke-interface {p1, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    check-cast p1, Landroid/os/Parcelable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 271
    .line 272
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 273
    .line 274
    .line 275
    check-cast p1, Lps0;

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :catchall_0
    move-exception v0

    .line 279
    move-object p1, v0

    .line 280
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 281
    .line 282
    .line 283
    throw p1

    .line 284
    :catchall_1
    move-exception v0

    .line 285
    move-object p1, v0

    .line 286
    goto :goto_6

    .line 287
    :catch_0
    move-exception v0

    .line 288
    move-object p1, v0

    .line 289
    :try_start_3
    const-string v0, "Could not read from parcel file descriptor"

    .line 290
    .line 291
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 292
    .line 293
    .line 294
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :goto_3
    check-cast p1, Lr42;

    .line 299
    .line 300
    if-nez p1, :cond_3

    .line 301
    .line 302
    return-object v6

    .line 303
    :cond_3
    iget-boolean v0, p1, Lr42;->f:Z

    .line 304
    .line 305
    if-nez v0, :cond_6

    .line 306
    .line 307
    iget-object v0, p1, Lr42;->j:[Ljava/lang/String;

    .line 308
    .line 309
    iget-object v1, p1, Lr42;->k:[Ljava/lang/String;

    .line 310
    .line 311
    array-length v2, v0

    .line 312
    array-length v3, v1

    .line 313
    if-eq v2, v3, :cond_4

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_4
    new-instance v10, Ljava/util/HashMap;

    .line 317
    .line 318
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 319
    .line 320
    .line 321
    :goto_4
    array-length v2, v0

    .line 322
    if-ge v5, v2, :cond_5

    .line 323
    .line 324
    aget-object v2, v0, v5

    .line 325
    .line 326
    aget-object v3, v1, v5

    .line 327
    .line 328
    invoke-virtual {v10, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    add-int/lit8 v5, v5, 0x1

    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_5
    iget v8, p1, Lr42;->h:I

    .line 335
    .line 336
    iget-object v9, p1, Lr42;->i:[B

    .line 337
    .line 338
    iget-boolean v12, p1, Lr42;->l:Z

    .line 339
    .line 340
    new-instance v7, Lho1;

    .line 341
    .line 342
    invoke-static {v10}, Lho1;->a(Ljava/util/Map;)Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v11

    .line 346
    invoke-direct/range {v7 .. v12}, Lho1;-><init>(I[BLjava/util/Map;Ljava/util/List;Z)V

    .line 347
    .line 348
    .line 349
    move-object v6, v7

    .line 350
    :goto_5
    return-object v6

    .line 351
    :cond_6
    iget-object p1, p1, Lr42;->g:Ljava/lang/String;

    .line 352
    .line 353
    new-instance v0, Loo1;

    .line 354
    .line 355
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v0

    .line 359
    :goto_6
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 360
    .line 361
    .line 362
    throw p1

    .line 363
    :catchall_2
    move-exception v0

    .line 364
    move-object p1, v0

    .line 365
    sget-object v0, Lhg4;->C:Lhg4;

    .line 366
    .line 367
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 373
    .line 374
    .line 375
    move-result-wide v5

    .line 376
    sub-long/2addr v5, v1

    .line 377
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    add-int/lit8 v0, v0, 0x20

    .line 386
    .line 387
    new-instance v1, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw p1

    .line 409
    :catch_1
    sget-object p1, Lhg4;->C:Lhg4;

    .line 410
    .line 411
    iget-object p1, p1, Lhg4;->k:Lym;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 417
    .line 418
    .line 419
    move-result-wide v7

    .line 420
    sub-long/2addr v7, v1

    .line 421
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 426
    .line 427
    .line 428
    move-result p1

    .line 429
    add-int/lit8 p1, p1, 0x20

    .line 430
    .line 431
    new-instance v0, Ljava/lang/StringBuilder;

    .line 432
    .line 433
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    return-object v6
.end method
