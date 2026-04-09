.class public final synthetic Lvg3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lwg3;


# direct methods
.method public synthetic constructor <init>(Lwg3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvg3;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lvg3;->g:Lwg3;

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
    .locals 12

    .line 1
    iget v0, p0, Lvg3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvg3;->g:Lwg3;

    .line 7
    .line 8
    iget-object v1, v0, Lwg3;->m:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v2, v0, Lwg3;->p:Lrq1;

    .line 12
    .line 13
    iget-object v3, v2, Ln54;->f:Lp54;

    .line 14
    .line 15
    const/4 v4, 0x5

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-virtual {v3, v4, v5}, Lp54;->w(ILp54;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ln54;

    .line 22
    .line 23
    invoke-virtual {v2}, Ln54;->c()Lp54;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iput-object v2, v3, Ln54;->g:Lp54;

    .line 28
    .line 29
    check-cast v3, Lrq1;

    .line 30
    .line 31
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 32
    iget-object v2, v0, Lwg3;->n:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v2

    .line 35
    :try_start_1
    iget-object v1, v0, Lwg3;->q:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v1}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput-boolean v1, v0, Lwg3;->r:Z

    .line 46
    .line 47
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 48
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    move v5, v1

    .line 53
    move v6, v5

    .line 54
    :goto_0
    if-ge v5, v2, :cond_4

    .line 55
    .line 56
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Lug3;

    .line 61
    .line 62
    int-to-long v8, v6

    .line 63
    iget-wide v10, v0, Lwg3;->g:J

    .line 64
    .line 65
    cmp-long v8, v8, v10

    .line 66
    .line 67
    if-ltz v8, :cond_0

    .line 68
    .line 69
    invoke-virtual {v3}, Ln54;->d()Lp54;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Lsq1;

    .line 74
    .line 75
    invoke-virtual {v0, v6}, Lwg3;->c(Lsq1;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ln54;->b()V

    .line 79
    .line 80
    .line 81
    iget-object v6, v3, Ln54;->g:Lp54;

    .line 82
    .line 83
    check-cast v6, Lsq1;

    .line 84
    .line 85
    invoke-virtual {v6}, Lsq1;->C()V

    .line 86
    .line 87
    .line 88
    move v6, v1

    .line 89
    :cond_0
    invoke-static {}, Lar1;->A()Lzq1;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    iget v9, v7, Lug3;->a:I

    .line 94
    .line 95
    int-to-long v9, v9

    .line 96
    invoke-virtual {v8}, Ln54;->b()V

    .line 97
    .line 98
    .line 99
    iget-object v11, v8, Ln54;->g:Lp54;

    .line 100
    .line 101
    check-cast v11, Lar1;

    .line 102
    .line 103
    invoke-virtual {v11, v9, v10}, Lar1;->B(J)V

    .line 104
    .line 105
    .line 106
    iget-wide v9, v7, Lug3;->b:J

    .line 107
    .line 108
    invoke-virtual {v8}, Ln54;->b()V

    .line 109
    .line 110
    .line 111
    iget-object v11, v8, Ln54;->g:Lp54;

    .line 112
    .line 113
    check-cast v11, Lar1;

    .line 114
    .line 115
    invoke-virtual {v11, v9, v10}, Lar1;->C(J)V

    .line 116
    .line 117
    .line 118
    iget-wide v9, v7, Lug3;->e:J

    .line 119
    .line 120
    invoke-virtual {v8}, Ln54;->b()V

    .line 121
    .line 122
    .line 123
    iget-object v11, v8, Ln54;->g:Lp54;

    .line 124
    .line 125
    check-cast v11, Lar1;

    .line 126
    .line 127
    invoke-virtual {v11, v9, v10}, Lar1;->F(J)V

    .line 128
    .line 129
    .line 130
    iget-object v9, v7, Lug3;->d:Ljava/lang/String;

    .line 131
    .line 132
    if-eqz v9, :cond_1

    .line 133
    .line 134
    invoke-virtual {v8}, Ln54;->b()V

    .line 135
    .line 136
    .line 137
    iget-object v10, v8, Ln54;->g:Lp54;

    .line 138
    .line 139
    check-cast v10, Lar1;

    .line 140
    .line 141
    invoke-virtual {v10, v9}, Lar1;->G(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_1
    iget-object v7, v7, Lug3;->c:Ljava/lang/Throwable;

    .line 145
    .line 146
    if-nez v7, :cond_2

    .line 147
    .line 148
    const/4 v9, 0x2

    .line 149
    goto :goto_1

    .line 150
    :cond_2
    const/4 v9, 0x3

    .line 151
    :goto_1
    invoke-virtual {v8}, Ln54;->b()V

    .line 152
    .line 153
    .line 154
    iget-object v10, v8, Ln54;->g:Lp54;

    .line 155
    .line 156
    check-cast v10, Lar1;

    .line 157
    .line 158
    invoke-virtual {v10, v9}, Lar1;->H(I)V

    .line 159
    .line 160
    .line 161
    if-eqz v7, :cond_3

    .line 162
    .line 163
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v8}, Ln54;->b()V

    .line 172
    .line 173
    .line 174
    iget-object v10, v8, Ln54;->g:Lp54;

    .line 175
    .line 176
    check-cast v10, Lar1;

    .line 177
    .line 178
    invoke-virtual {v10, v9}, Lar1;->D(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :try_start_2
    new-instance v9, Ljava/io/StringWriter;

    .line 182
    .line 183
    invoke-direct {v9}, Ljava/io/StringWriter;-><init>()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 184
    .line 185
    .line 186
    :try_start_3
    new-instance v10, Ljava/io/PrintWriter;

    .line 187
    .line 188
    invoke-direct {v10, v9}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 189
    .line 190
    .line 191
    :try_start_4
    invoke-virtual {v7, v10}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 198
    :try_start_5
    invoke-virtual {v10}, Ljava/io/PrintWriter;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 199
    .line 200
    .line 201
    :try_start_6
    invoke-virtual {v9}, Ljava/io/StringWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :catchall_0
    move-exception v7

    .line 206
    goto :goto_3

    .line 207
    :catchall_1
    move-exception v7

    .line 208
    :try_start_7
    invoke-virtual {v10}, Ljava/io/PrintWriter;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :catchall_2
    move-exception v10

    .line 213
    :try_start_8
    invoke-virtual {v7, v10}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    :goto_2
    throw v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 217
    :goto_3
    :try_start_9
    invoke-virtual {v9}, Ljava/io/StringWriter;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :catchall_3
    move-exception v9

    .line 222
    :try_start_a
    invoke-virtual {v7, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    :goto_4
    throw v7
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 226
    :catch_0
    const-string v7, ""

    .line 227
    .line 228
    :goto_5
    invoke-virtual {v8}, Ln54;->b()V

    .line 229
    .line 230
    .line 231
    iget-object v9, v8, Ln54;->g:Lp54;

    .line 232
    .line 233
    check-cast v9, Lar1;

    .line 234
    .line 235
    invoke-virtual {v9, v7}, Lar1;->E(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_3
    invoke-virtual {v8}, Ln54;->d()Lp54;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    check-cast v7, Lar1;

    .line 243
    .line 244
    invoke-virtual {v3}, Ln54;->b()V

    .line 245
    .line 246
    .line 247
    iget-object v8, v3, Ln54;->g:Lp54;

    .line 248
    .line 249
    check-cast v8, Lsq1;

    .line 250
    .line 251
    invoke-virtual {v8, v7}, Lsq1;->B(Lar1;)V

    .line 252
    .line 253
    .line 254
    add-int/lit8 v5, v5, 0x1

    .line 255
    .line 256
    add-int/lit8 v6, v6, 0x1

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_4
    if-lez v6, :cond_5

    .line 261
    .line 262
    invoke-virtual {v3}, Ln54;->d()Lp54;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, Lsq1;

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Lwg3;->c(Lsq1;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, Ln54;->b()V

    .line 272
    .line 273
    .line 274
    iget-object v0, v3, Ln54;->g:Lp54;

    .line 275
    .line 276
    check-cast v0, Lsq1;

    .line 277
    .line 278
    invoke-virtual {v0}, Lsq1;->C()V

    .line 279
    .line 280
    .line 281
    :cond_5
    return-void

    .line 282
    :catchall_4
    move-exception v0

    .line 283
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 284
    throw v0

    .line 285
    :catchall_5
    move-exception v0

    .line 286
    :try_start_c
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 287
    throw v0

    .line 288
    :pswitch_0
    iget-object v0, p0, Lvg3;->g:Lwg3;

    .line 289
    .line 290
    iget-boolean v1, v0, Lwg3;->e:Z

    .line 291
    .line 292
    if-eqz v1, :cond_c

    .line 293
    .line 294
    iget-object v1, v0, Lwg3;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 295
    .line 296
    const/4 v2, 0x1

    .line 297
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    if-eqz v1, :cond_6

    .line 302
    .line 303
    goto/16 :goto_7

    .line 304
    .line 305
    :cond_6
    iget-object v1, v0, Lwg3;->a:Landroid/content/Context;

    .line 306
    .line 307
    iget-object v2, v0, Lwg3;->j:Ljava/lang/String;

    .line 308
    .line 309
    iget-wide v3, v0, Lwg3;->i:D

    .line 310
    .line 311
    iget-wide v5, v0, Lwg3;->k:J

    .line 312
    .line 313
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-static {}, Lsq1;->A()Lrq1;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 322
    .line 323
    int-to-long v9, v9

    .line 324
    invoke-virtual {v8}, Ln54;->b()V

    .line 325
    .line 326
    .line 327
    iget-object v11, v8, Ln54;->g:Lp54;

    .line 328
    .line 329
    check-cast v11, Lsq1;

    .line 330
    .line 331
    invoke-virtual {v11, v9, v10}, Lsq1;->D(J)V

    .line 332
    .line 333
    .line 334
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {v8}, Ln54;->b()V

    .line 337
    .line 338
    .line 339
    iget-object v10, v8, Ln54;->g:Lp54;

    .line 340
    .line 341
    check-cast v10, Lsq1;

    .line 342
    .line 343
    invoke-virtual {v10, v9}, Lsq1;->E(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v7}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    invoke-virtual {v8}, Ln54;->b()V

    .line 351
    .line 352
    .line 353
    iget-object v10, v8, Ln54;->g:Lp54;

    .line 354
    .line 355
    check-cast v10, Lsq1;

    .line 356
    .line 357
    invoke-virtual {v10, v9}, Lsq1;->F(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v7}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    invoke-virtual {v8}, Ln54;->b()V

    .line 365
    .line 366
    .line 367
    iget-object v9, v8, Ln54;->g:Lp54;

    .line 368
    .line 369
    check-cast v9, Lsq1;

    .line 370
    .line 371
    invoke-virtual {v9, v7}, Lsq1;->G(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v8}, Ln54;->b()V

    .line 375
    .line 376
    .line 377
    iget-object v7, v8, Ln54;->g:Lp54;

    .line 378
    .line 379
    check-cast v7, Lsq1;

    .line 380
    .line 381
    invoke-virtual {v7, v2}, Lsq1;->J(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-virtual {v8}, Ln54;->b()V

    .line 389
    .line 390
    .line 391
    iget-object v7, v8, Ln54;->g:Lp54;

    .line 392
    .line 393
    check-cast v7, Lsq1;

    .line 394
    .line 395
    invoke-virtual {v7, v2}, Lsq1;->H(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v8}, Ln54;->b()V

    .line 399
    .line 400
    .line 401
    iget-object v2, v8, Ln54;->g:Lp54;

    .line 402
    .line 403
    check-cast v2, Lsq1;

    .line 404
    .line 405
    invoke-virtual {v2, v5, v6}, Lsq1;->M(J)V

    .line 406
    .line 407
    .line 408
    const-wide/16 v5, 0x0

    .line 409
    .line 410
    cmpl-double v2, v3, v5

    .line 411
    .line 412
    if-lez v2, :cond_7

    .line 413
    .line 414
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 415
    .line 416
    div-double/2addr v5, v3

    .line 417
    double-to-int v2, v5

    .line 418
    int-to-long v2, v2

    .line 419
    invoke-virtual {v8}, Ln54;->b()V

    .line 420
    .line 421
    .line 422
    iget-object v4, v8, Ln54;->g:Lp54;

    .line 423
    .line 424
    check-cast v4, Lsq1;

    .line 425
    .line 426
    invoke-virtual {v4, v2, v3}, Lsq1;->L(J)V

    .line 427
    .line 428
    .line 429
    :cond_7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    :try_start_d
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    const/4 v4, 0x0

    .line 438
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 443
    .line 444
    int-to-long v3, v3

    .line 445
    invoke-virtual {v8}, Ln54;->b()V

    .line 446
    .line 447
    .line 448
    iget-object v5, v8, Ln54;->g:Lp54;

    .line 449
    .line 450
    check-cast v5, Lsq1;

    .line 451
    .line 452
    invoke-virtual {v5, v3, v4}, Lsq1;->I(J)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    .line 453
    .line 454
    .line 455
    :catch_1
    :try_start_e
    const-string v3, "android.hardware.type.automotive"

    .line 456
    .line 457
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-eqz v3, :cond_8

    .line 462
    .line 463
    const/4 v1, 0x5

    .line 464
    goto :goto_6

    .line 465
    :cond_8
    const-string v3, "android.hardware.type.watch"

    .line 466
    .line 467
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    const/4 v4, 0x4

    .line 472
    if-eqz v3, :cond_9

    .line 473
    .line 474
    move v1, v4

    .line 475
    goto :goto_6

    .line 476
    :cond_9
    const-string v3, "android.hardware.type.pc"

    .line 477
    .line 478
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-eqz v2, :cond_a

    .line 483
    .line 484
    const/4 v1, 0x7

    .line 485
    goto :goto_6

    .line 486
    :cond_a
    const-string v2, "uimode"

    .line 487
    .line 488
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    check-cast v1, Landroid/app/UiModeManager;

    .line 493
    .line 494
    const/4 v2, 0x2

    .line 495
    if-eqz v1, :cond_b

    .line 496
    .line 497
    invoke-virtual {v1}, Landroid/app/UiModeManager;->getCurrentModeType()I

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-ne v1, v4, :cond_b

    .line 502
    .line 503
    const/4 v1, 0x6

    .line 504
    goto :goto_6

    .line 505
    :cond_b
    move v1, v2

    .line 506
    :goto_6
    invoke-virtual {v8}, Ln54;->b()V

    .line 507
    .line 508
    .line 509
    iget-object v2, v8, Ln54;->g:Lp54;

    .line 510
    .line 511
    check-cast v2, Lsq1;

    .line 512
    .line 513
    invoke-virtual {v2, v1}, Lsq1;->N(I)V
    :try_end_e
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_2

    .line 514
    .line 515
    .line 516
    :catch_2
    invoke-virtual {v8}, Ln54;->d()Lp54;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    check-cast v1, Lsq1;

    .line 521
    .line 522
    iget-object v2, v0, Lwg3;->m:Ljava/lang/Object;

    .line 523
    .line 524
    monitor-enter v2

    .line 525
    :try_start_f
    iget-object v0, v0, Lwg3;->p:Lrq1;

    .line 526
    .line 527
    invoke-virtual {v0, v1}, Ln54;->e(Lp54;)Ln54;

    .line 528
    .line 529
    .line 530
    monitor-exit v2

    .line 531
    goto :goto_7

    .line 532
    :catchall_6
    move-exception v0

    .line 533
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 534
    throw v0

    .line 535
    :cond_c
    :goto_7
    return-void

    .line 536
    nop

    .line 537
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
