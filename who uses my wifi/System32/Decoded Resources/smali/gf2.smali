.class public final Lgf2;
.super Lff2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final k:Ljava/util/Set;

.field public static final l:Ljava/text/DecimalFormat;


# instance fields
.field public i:Ljava/io/File;

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lgf2;->k:Ljava/util/Set;

    .line 11
    .line 12
    new-instance v0, Ljava/text/DecimalFormat;

    .line 13
    .line 14
    const-string v1, "#,###"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lgf2;->l:Ljava/text/DecimalFormat;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Z
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v6, " sec"

    .line 6
    .line 7
    const-string v7, "Timeout exceeded. Limit: "

    .line 8
    .line 9
    const-string v0, " at "

    .line 10
    .line 11
    const-string v3, "HTTP status code "

    .line 12
    .line 13
    const-string v4, "HTTP request failed. Code: "

    .line 14
    .line 15
    const-string v8, "Preloaded "

    .line 16
    .line 17
    const-string v5, " exceeds limit at "

    .line 18
    .line 19
    const-string v9, "Content length "

    .line 20
    .line 21
    const-string v10, "Stream cache aborted, missing content-length header at "

    .line 22
    .line 23
    const-string v11, "Stream cache already in progress at "

    .line 24
    .line 25
    const-string v12, " bytes from "

    .line 26
    .line 27
    const-string v13, "Caching "

    .line 28
    .line 29
    iget-object v14, v1, Lgf2;->i:Ljava/io/File;

    .line 30
    .line 31
    const/16 v16, 0x0

    .line 32
    .line 33
    if-eqz v14, :cond_1c

    .line 34
    .line 35
    :goto_0
    iget-object v14, v1, Lgf2;->i:Ljava/io/File;

    .line 36
    .line 37
    if-nez v14, :cond_0

    .line 38
    .line 39
    move/from16 v14, v16

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    invoke-virtual {v14}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    array-length v15, v14

    .line 47
    move-object/from16 v17, v14

    .line 48
    .line 49
    move/from16 v14, v16

    .line 50
    .line 51
    move/from16 v18, v14

    .line 52
    .line 53
    :goto_1
    if-ge v14, v15, :cond_2

    .line 54
    .line 55
    aget-object v19, v17, v14

    .line 56
    .line 57
    move/from16 v20, v14

    .line 58
    .line 59
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    move/from16 v19, v15

    .line 64
    .line 65
    const-string v15, ".done"

    .line 66
    .line 67
    invoke-virtual {v14, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v14

    .line 71
    if-nez v14, :cond_1

    .line 72
    .line 73
    add-int/lit8 v18, v18, 0x1

    .line 74
    .line 75
    :cond_1
    add-int/lit8 v14, v20, 0x1

    .line 76
    .line 77
    move/from16 v15, v19

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move/from16 v14, v18

    .line 81
    .line 82
    :goto_2
    sget-object v15, Lmz1;->t:Liz1;

    .line 83
    .line 84
    move-object/from16 v17, v0

    .line 85
    .line 86
    sget-object v0, Ltw1;->e:Ltw1;

    .line 87
    .line 88
    move-object/from16 v18, v3

    .line 89
    .line 90
    iget-object v3, v0, Ltw1;->c:Lkz1;

    .line 91
    .line 92
    invoke-virtual {v3, v15}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-le v14, v3, :cond_9

    .line 103
    .line 104
    iget-object v0, v1, Lgf2;->i:Ljava/io/File;

    .line 105
    .line 106
    if-nez v0, :cond_3

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    array-length v3, v0

    .line 114
    const-wide v14, 0x7fffffffffffffffL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    move-object/from16 v19, v0

    .line 120
    .line 121
    move-wide/from16 v20, v14

    .line 122
    .line 123
    move/from16 v0, v16

    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    :goto_3
    if-ge v0, v3, :cond_5

    .line 127
    .line 128
    aget-object v15, v19, v0

    .line 129
    .line 130
    move/from16 v22, v0

    .line 131
    .line 132
    invoke-virtual {v15}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    move/from16 v23, v3

    .line 137
    .line 138
    const-string v3, ".done"

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_4

    .line 145
    .line 146
    invoke-virtual {v15}, Ljava/io/File;->lastModified()J

    .line 147
    .line 148
    .line 149
    move-result-wide v24

    .line 150
    cmp-long v0, v24, v20

    .line 151
    .line 152
    if-gez v0, :cond_4

    .line 153
    .line 154
    move-object v14, v15

    .line 155
    move-wide/from16 v20, v24

    .line 156
    .line 157
    :cond_4
    add-int/lit8 v0, v22, 0x1

    .line 158
    .line 159
    move/from16 v3, v23

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    if-eqz v14, :cond_6

    .line 163
    .line 164
    invoke-virtual {v14}, Ljava/io/File;->delete()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-virtual {v1, v14}, Lgf2;->o(Ljava/io/File;)Ljava/io/File;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 173
    .line 174
    .line 175
    move-result v14

    .line 176
    if-eqz v14, :cond_7

    .line 177
    .line 178
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    and-int/2addr v0, v3

    .line 183
    goto :goto_4

    .line 184
    :cond_6
    move/from16 v0, v16

    .line 185
    .line 186
    :cond_7
    :goto_4
    if-nez v0, :cond_8

    .line 187
    .line 188
    :goto_5
    const-string v0, "Unable to expire stream cache"

    .line 189
    .line 190
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string v0, "expireFailed"

    .line 194
    .line 195
    const/4 v3, 0x0

    .line 196
    invoke-virtual {v1, v2, v3, v0, v3}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return v16

    .line 200
    :cond_8
    move-object/from16 v0, v17

    .line 201
    .line 202
    move-object/from16 v3, v18

    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_9
    const-string v3, "MD5"

    .line 207
    .line 208
    invoke-static {v2, v3}, Lj63;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    new-instance v14, Ljava/io/File;

    .line 213
    .line 214
    iget-object v15, v1, Lgf2;->i:Ljava/io/File;

    .line 215
    .line 216
    move-object/from16 v19, v4

    .line 217
    .line 218
    new-instance v4, Ljava/io/File;

    .line 219
    .line 220
    invoke-direct {v4, v15, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-direct {v14, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1, v14}, Lgf2;->o(Ljava/io/File;)Ljava/io/File;

    .line 231
    .line 232
    .line 233
    move-result-object v15

    .line 234
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    const/4 v4, 0x1

    .line 239
    if-eqz v3, :cond_b

    .line 240
    .line 241
    invoke-virtual {v15}, Ljava/io/File;->isFile()Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-nez v3, :cond_a

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_a
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 249
    .line 250
    .line 251
    move-result-wide v5

    .line 252
    long-to-int v0, v5

    .line 253
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    const-string v5, "Stream cache hit at "

    .line 258
    .line 259
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-static {v3}, Lgi2;->U(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    sget-object v5, Lj63;->b:Lwc1;

    .line 271
    .line 272
    new-instance v6, Ldf2;

    .line 273
    .line 274
    invoke-direct {v6, v1, v2, v3, v0}, Ldf2;-><init>(Lff2;Ljava/lang/String;Ljava/lang/String;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 278
    .line 279
    .line 280
    return v4

    .line 281
    :cond_b
    :goto_6
    iget-object v3, v1, Lgf2;->i:Ljava/io/File;

    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    move-object/from16 v21, v15

    .line 296
    .line 297
    sget-object v15, Lgf2;->k:Ljava/util/Set;

    .line 298
    .line 299
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    monitor-enter v15

    .line 304
    :try_start_0
    invoke-interface {v15, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    if-eqz v4, :cond_c

    .line 309
    .line 310
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    add-int/lit8 v0, v0, 0x24

    .line 319
    .line 320
    new-instance v3, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    const-string v3, "inProgress"

    .line 343
    .line 344
    const/4 v4, 0x0

    .line 345
    invoke-virtual {v1, v2, v0, v3, v4}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    monitor-exit v15

    .line 349
    return v16

    .line 350
    :catchall_0
    move-exception v0

    .line 351
    goto/16 :goto_1d

    .line 352
    .line 353
    :cond_c
    invoke-interface {v15, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    const-string v11, "error"

    .line 358
    .line 359
    :try_start_1
    new-instance v4, Lme3;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1a
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_19

    .line 360
    .line 361
    move-object/from16 v22, v11

    .line 362
    .line 363
    :try_start_2
    sget-object v11, Ltv2;->m:Ltv2;

    .line 364
    .line 365
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 366
    .line 367
    .line 368
    iput-object v11, v4, Lme3;->f:Lll3;

    .line 369
    .line 370
    const/4 v11, 0x0

    .line 371
    iput-object v11, v4, Lme3;->g:Lls3;

    .line 372
    .line 373
    new-instance v11, Lls3;

    .line 374
    .line 375
    move-object/from16 v23, v8

    .line 376
    .line 377
    const/4 v8, 0x2

    .line 378
    invoke-direct {v11, v2, v8}, Lls3;-><init>(Ljava/lang/String;I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v4, v11}, Lme3;->a(Lls3;)Ljava/net/HttpURLConnection;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 386
    .line 387
    .line 388
    move-result v8
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 389
    const/16 v11, 0x190

    .line 390
    .line 391
    if-ge v8, v11, :cond_18

    .line 392
    .line 393
    :try_start_3
    invoke-virtual {v4}, Ljava/net/URLConnection;->getContentLength()I

    .line 394
    .line 395
    .line 396
    move-result v8
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_13

    .line 397
    if-gez v8, :cond_d

    .line 398
    .line 399
    :try_start_4
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    add-int/lit8 v0, v0, 0x37

    .line 408
    .line 409
    new-instance v4, Ljava/lang/StringBuilder;

    .line 410
    .line 411
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    const-string v4, "contentLengthMissing"

    .line 432
    .line 433
    const/4 v11, 0x0

    .line 434
    invoke-virtual {v1, v2, v0, v4, v11}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v15, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    .line 438
    .line 439
    .line 440
    return v16

    .line 441
    :catch_0
    move-exception v0

    .line 442
    goto/16 :goto_1a

    .line 443
    .line 444
    :catch_1
    move-exception v0

    .line 445
    goto/16 :goto_1a

    .line 446
    .line 447
    :cond_d
    :try_start_5
    sget-object v10, Lgf2;->l:Ljava/text/DecimalFormat;

    .line 448
    .line 449
    move-object v11, v6

    .line 450
    move-object/from16 v24, v7

    .line 451
    .line 452
    int-to-long v6, v8

    .line 453
    invoke-virtual {v10, v6, v7}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    sget-object v7, Lmz1;->u:Liz1;

    .line 458
    .line 459
    move-object/from16 v25, v4

    .line 460
    .line 461
    iget-object v4, v0, Ltw1;->c:Lkz1;

    .line 462
    .line 463
    invoke-virtual {v4, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    check-cast v4, Ljava/lang/Integer;

    .line 468
    .line 469
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 470
    .line 471
    .line 472
    move-result v7
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_13

    .line 473
    const-string v4, "File too big for full file cache. Size: "

    .line 474
    .line 475
    if-le v8, v7, :cond_e

    .line 476
    .line 477
    :try_start_6
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    add-int/lit8 v0, v0, 0x21

    .line 486
    .line 487
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 492
    .line 493
    .line 494
    move-result v7

    .line 495
    add-int/2addr v0, v7

    .line 496
    new-instance v7, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    add-int/lit8 v0, v0, 0x28

    .line 529
    .line 530
    new-instance v5, Ljava/lang/StringBuilder;

    .line 531
    .line 532
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    const-string v5, "sizeExceeded"

    .line 550
    .line 551
    invoke-virtual {v1, v2, v4, v5, v0}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-interface {v15, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    .line 555
    .line 556
    .line 557
    return v16

    .line 558
    :cond_e
    :try_start_7
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v5

    .line 562
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 563
    .line 564
    .line 565
    move-result v5

    .line 566
    add-int/lit8 v5, v5, 0x14

    .line 567
    .line 568
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v9

    .line 572
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    add-int/2addr v5, v9

    .line 577
    new-instance v9, Ljava/lang/StringBuilder;

    .line 578
    .line 579
    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v5

    .line 598
    invoke-static {v5}, Lgi2;->U(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v25 .. v25}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 602
    .line 603
    .line 604
    move-result-object v5

    .line 605
    invoke-static {v5}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    .line 606
    .line 607
    .line 608
    move-result-object v6

    .line 609
    new-instance v9, Ljava/io/FileOutputStream;

    .line 610
    .line 611
    invoke-direct {v9, v14}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_13

    .line 612
    .line 613
    .line 614
    :try_start_8
    invoke-virtual {v9}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 615
    .line 616
    .line 617
    move-result-object v13

    .line 618
    const/high16 v5, 0x100000

    .line 619
    .line 620
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 621
    .line 622
    .line 623
    move-result-object v15

    .line 624
    sget-object v5, Lhg4;->C:Lhg4;

    .line 625
    .line 626
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 627
    .line 628
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 632
    .line 633
    .line 634
    move-result-wide v17

    .line 635
    sget-object v5, Lmz1;->K:Liz1;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_12
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_11

    .line 636
    .line 637
    :try_start_9
    iget-object v2, v0, Ltw1;->c:Lkz1;

    .line 638
    .line 639
    invoke-virtual {v2, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    check-cast v2, Ljava/lang/Long;

    .line 644
    .line 645
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 646
    .line 647
    .line 648
    move-result-wide v25

    .line 649
    new-instance v19, Ljava/lang/Object;

    .line 650
    .line 651
    invoke-direct/range {v19 .. v19}, Ljava/lang/Object;-><init>()V

    .line 652
    .line 653
    .line 654
    sget-object v2, Lmz1;->J:Liz1;

    .line 655
    .line 656
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 657
    .line 658
    invoke-virtual {v0, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    check-cast v0, Ljava/lang/Long;

    .line 663
    .line 664
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 665
    .line 666
    .line 667
    move-result-wide v27

    .line 668
    const-wide/high16 v29, -0x8000000000000000L

    .line 669
    .line 670
    move/from16 v0, v16

    .line 671
    .line 672
    :goto_7
    invoke-interface {v6, v15}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-ltz v2, :cond_15

    .line 677
    .line 678
    add-int/2addr v0, v2

    .line 679
    if-gt v0, v7, :cond_14

    .line 680
    .line 681
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 682
    .line 683
    .line 684
    :goto_8
    invoke-virtual {v13, v15}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 685
    .line 686
    .line 687
    move-result v2

    .line 688
    if-gtz v2, :cond_13

    .line 689
    .line 690
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 691
    .line 692
    .line 693
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 694
    .line 695
    .line 696
    move-result-wide v31

    .line 697
    sub-long v31, v31, v17

    .line 698
    .line 699
    const-wide/16 v33, 0x3e8

    .line 700
    .line 701
    mul-long v33, v33, v27

    .line 702
    .line 703
    cmp-long v2, v31, v33

    .line 704
    .line 705
    if-gtz v2, :cond_12

    .line 706
    .line 707
    iget-boolean v2, v1, Lgf2;->j:Z

    .line 708
    .line 709
    if-nez v2, :cond_11

    .line 710
    .line 711
    monitor-enter v19
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_8

    .line 712
    :try_start_a
    sget-object v2, Lhg4;->C:Lhg4;

    .line 713
    .line 714
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 715
    .line 716
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 720
    .line 721
    .line 722
    move-result-wide v31

    .line 723
    add-long v33, v29, v25

    .line 724
    .line 725
    cmp-long v2, v33, v31

    .line 726
    .line 727
    if-lez v2, :cond_f

    .line 728
    .line 729
    monitor-exit v19

    .line 730
    move/from16 v2, v16

    .line 731
    .line 732
    goto :goto_9

    .line 733
    :catchall_1
    move-exception v0

    .line 734
    move-object/from16 v2, p1

    .line 735
    .line 736
    move-object v8, v3

    .line 737
    move-object/from16 v32, v9

    .line 738
    .line 739
    goto/16 :goto_c

    .line 740
    .line 741
    :cond_f
    monitor-exit v19
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 742
    move-wide/from16 v29, v31

    .line 743
    .line 744
    const/4 v2, 0x1

    .line 745
    :goto_9
    if-eqz v2, :cond_10

    .line 746
    .line 747
    move-object v2, v3

    .line 748
    :try_start_b
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    sget-object v5, Lj63;->b:Lwc1;

    .line 753
    .line 754
    move-object/from16 v31, v4

    .line 755
    .line 756
    move v4, v0

    .line 757
    new-instance v0, Lye2;
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_4

    .line 758
    .line 759
    move-object/from16 v20, v6

    .line 760
    .line 761
    move-object/from16 v32, v9

    .line 762
    .line 763
    move-object/from16 v6, v31

    .line 764
    .line 765
    const/4 v9, 0x1

    .line 766
    move/from16 v31, v7

    .line 767
    .line 768
    move-object v7, v5

    .line 769
    move v5, v8

    .line 770
    move-object v8, v2

    .line 771
    move-object/from16 v2, p1

    .line 772
    .line 773
    :try_start_c
    invoke-direct/range {v0 .. v5}, Lye2;-><init>(Lgf2;Ljava/lang/String;Ljava/lang/String;II)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_2

    .line 777
    .line 778
    .line 779
    goto :goto_b

    .line 780
    :catch_2
    move-exception v0

    .line 781
    goto/16 :goto_15

    .line 782
    .line 783
    :catch_3
    move-exception v0

    .line 784
    goto/16 :goto_15

    .line 785
    .line 786
    :catch_4
    move-exception v0

    .line 787
    :goto_a
    move-object v8, v2

    .line 788
    move-object/from16 v32, v9

    .line 789
    .line 790
    move-object/from16 v2, p1

    .line 791
    .line 792
    goto/16 :goto_15

    .line 793
    .line 794
    :catch_5
    move-exception v0

    .line 795
    goto :goto_a

    .line 796
    :cond_10
    move-object/from16 v2, p1

    .line 797
    .line 798
    move-object/from16 v20, v6

    .line 799
    .line 800
    move/from16 v31, v7

    .line 801
    .line 802
    move v5, v8

    .line 803
    move-object/from16 v32, v9

    .line 804
    .line 805
    const/4 v9, 0x1

    .line 806
    move-object v8, v3

    .line 807
    move-object v6, v4

    .line 808
    move v4, v0

    .line 809
    :goto_b
    move v0, v4

    .line 810
    move-object v4, v6

    .line 811
    move-object v3, v8

    .line 812
    move-object/from16 v6, v20

    .line 813
    .line 814
    move/from16 v7, v31

    .line 815
    .line 816
    move-object/from16 v9, v32

    .line 817
    .line 818
    move v8, v5

    .line 819
    goto/16 :goto_7

    .line 820
    .line 821
    :goto_c
    :try_start_d
    monitor-exit v19
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 822
    :try_start_e
    throw v0

    .line 823
    :catchall_2
    move-exception v0

    .line 824
    goto :goto_c

    .line 825
    :cond_11
    move-object/from16 v2, p1

    .line 826
    .line 827
    move-object v8, v3

    .line 828
    move-object/from16 v32, v9

    .line 829
    .line 830
    const-string v11, "externalAbort"
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_2

    .line 831
    .line 832
    :try_start_f
    new-instance v0, Ljava/io/IOException;

    .line 833
    .line 834
    const-string v3, "abort requested"

    .line 835
    .line 836
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    throw v0
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_6

    .line 840
    :catch_6
    move-exception v0

    .line 841
    goto :goto_d

    .line 842
    :catch_7
    move-exception v0

    .line 843
    :goto_d
    move-object v3, v8

    .line 844
    :goto_e
    move-object/from16 v15, v32

    .line 845
    .line 846
    const/4 v4, 0x0

    .line 847
    goto/16 :goto_1b

    .line 848
    .line 849
    :catch_8
    move-exception v0

    .line 850
    :goto_f
    move-object/from16 v2, p1

    .line 851
    .line 852
    :goto_10
    move-object v8, v3

    .line 853
    move-object/from16 v32, v9

    .line 854
    .line 855
    goto/16 :goto_15

    .line 856
    .line 857
    :catch_9
    move-exception v0

    .line 858
    goto :goto_f

    .line 859
    :cond_12
    move-object/from16 v2, p1

    .line 860
    .line 861
    move-object v8, v3

    .line 862
    move-object/from16 v32, v9

    .line 863
    .line 864
    :try_start_10
    const-string v3, "downloadTimeout"
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_2

    .line 865
    .line 866
    :try_start_11
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v4

    .line 874
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 875
    .line 876
    .line 877
    move-result v4

    .line 878
    add-int/lit8 v4, v4, 0x1d

    .line 879
    .line 880
    new-instance v5, Ljava/lang/StringBuilder;

    .line 881
    .line 882
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 883
    .line 884
    .line 885
    move-object/from16 v7, v24

    .line 886
    .line 887
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v15
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_c

    .line 900
    :try_start_12
    new-instance v0, Ljava/io/IOException;

    .line 901
    .line 902
    const-string v4, "stream cache time limit exceeded"

    .line 903
    .line 904
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    throw v0
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_a

    .line 908
    :catch_a
    move-exception v0

    .line 909
    goto :goto_11

    .line 910
    :catch_b
    move-exception v0

    .line 911
    :goto_11
    move-object v11, v3

    .line 912
    :goto_12
    move-object v3, v8

    .line 913
    move-object v4, v15

    .line 914
    move-object/from16 v15, v32

    .line 915
    .line 916
    goto/16 :goto_1b

    .line 917
    .line 918
    :catch_c
    move-exception v0

    .line 919
    goto :goto_13

    .line 920
    :catch_d
    move-exception v0

    .line 921
    :goto_13
    move-object v11, v3

    .line 922
    goto :goto_d

    .line 923
    :cond_13
    move-object/from16 v2, p1

    .line 924
    .line 925
    move-object/from16 v32, v9

    .line 926
    .line 927
    const/4 v9, 0x1

    .line 928
    move-object/from16 v9, v32

    .line 929
    .line 930
    goto/16 :goto_8

    .line 931
    .line 932
    :cond_14
    move-object/from16 v2, p1

    .line 933
    .line 934
    move-object v8, v3

    .line 935
    move-object v6, v4

    .line 936
    move-object/from16 v32, v9

    .line 937
    .line 938
    move v4, v0

    .line 939
    :try_start_13
    const-string v11, "sizeExceeded"
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_2

    .line 940
    .line 941
    :try_start_14
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 950
    .line 951
    .line 952
    move-result v3

    .line 953
    add-int/lit8 v3, v3, 0x28

    .line 954
    .line 955
    new-instance v4, Ljava/lang/StringBuilder;

    .line 956
    .line 957
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v15
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_6

    .line 970
    :try_start_15
    new-instance v0, Ljava/io/IOException;

    .line 971
    .line 972
    const-string v3, "stream cache file size limit exceeded"

    .line 973
    .line 974
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    throw v0
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_f
    .catch Ljava/lang/RuntimeException; {:try_start_15 .. :try_end_15} :catch_e

    .line 978
    :catch_e
    move-exception v0

    .line 979
    goto :goto_12

    .line 980
    :catch_f
    move-exception v0

    .line 981
    goto :goto_12

    .line 982
    :cond_15
    move-object/from16 v2, p1

    .line 983
    .line 984
    move-object v8, v3

    .line 985
    move-object/from16 v32, v9

    .line 986
    .line 987
    const/4 v9, 0x1

    .line 988
    :try_start_16
    invoke-virtual/range {v32 .. v32}, Ljava/io/FileOutputStream;->close()V

    .line 989
    .line 990
    .line 991
    const/4 v3, 0x3

    .line 992
    invoke-static {v3}, Lgi2;->q0(I)Z

    .line 993
    .line 994
    .line 995
    move-result v3

    .line 996
    if-eqz v3, :cond_16

    .line 997
    .line 998
    int-to-long v3, v0

    .line 999
    invoke-virtual {v10, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v4

    .line 1007
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1008
    .line 1009
    .line 1010
    move-result v4

    .line 1011
    add-int/lit8 v4, v4, 0x16

    .line 1012
    .line 1013
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v5

    .line 1017
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1018
    .line 1019
    .line 1020
    move-result v5

    .line 1021
    add-int/2addr v4, v5

    .line 1022
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1025
    .line 1026
    .line 1027
    move-object/from16 v4, v23

    .line 1028
    .line 1029
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v3

    .line 1045
    invoke-static {v3}, Lgi2;->U(Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_16
    move/from16 v3, v16

    .line 1049
    .line 1050
    invoke-virtual {v14, v9, v3}, Ljava/io/File;->setReadable(ZZ)Z

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual/range {v21 .. v21}, Ljava/io/File;->isFile()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v3

    .line 1057
    if-eqz v3, :cond_17

    .line 1058
    .line 1059
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1060
    .line 1061
    .line 1062
    move-result-wide v3

    .line 1063
    move-object/from16 v5, v21

    .line 1064
    .line 1065
    invoke-virtual {v5, v3, v4}, Ljava/io/File;->setLastModified(J)Z
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_16 .. :try_end_16} :catch_2

    .line 1066
    .line 1067
    .line 1068
    goto :goto_14

    .line 1069
    :cond_17
    move-object/from16 v5, v21

    .line 1070
    .line 1071
    :try_start_17
    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_17 .. :try_end_17} :catch_2

    .line 1072
    .line 1073
    .line 1074
    :catch_10
    :goto_14
    :try_start_18
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v3

    .line 1078
    sget-object v4, Lj63;->b:Lwc1;

    .line 1079
    .line 1080
    new-instance v5, Ldf2;

    .line 1081
    .line 1082
    invoke-direct {v5, v1, v2, v3, v0}, Ldf2;-><init>(Lff2;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1086
    .line 1087
    .line 1088
    sget-object v0, Lgf2;->k:Ljava/util/Set;

    .line 1089
    .line 1090
    invoke-interface {v0, v8}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_18 .. :try_end_18} :catch_2

    .line 1091
    .line 1092
    .line 1093
    return v9

    .line 1094
    :catch_11
    move-exception v0

    .line 1095
    goto/16 :goto_10

    .line 1096
    .line 1097
    :catch_12
    move-exception v0

    .line 1098
    goto/16 :goto_10

    .line 1099
    .line 1100
    :goto_15
    move-object v3, v8

    .line 1101
    move-object/from16 v11, v22

    .line 1102
    .line 1103
    goto/16 :goto_e

    .line 1104
    .line 1105
    :catch_13
    move-exception v0

    .line 1106
    :goto_16
    move-object v8, v3

    .line 1107
    goto :goto_1a

    .line 1108
    :catch_14
    move-exception v0

    .line 1109
    goto :goto_16

    .line 1110
    :cond_18
    :try_start_19
    const-string v11, "badUrl"
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_19 .. :try_end_19} :catch_0

    .line 1111
    .line 1112
    :try_start_1a
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v4

    .line 1120
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1121
    .line 1122
    .line 1123
    move-result v4

    .line 1124
    add-int/lit8 v4, v4, 0x1b

    .line 1125
    .line 1126
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1127
    .line 1128
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1129
    .line 1130
    .line 1131
    move-object/from16 v4, v19

    .line 1132
    .line 1133
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v4
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_18
    .catch Ljava/lang/RuntimeException; {:try_start_1a .. :try_end_1a} :catch_17

    .line 1143
    :try_start_1b
    new-instance v0, Ljava/io/IOException;

    .line 1144
    .line 1145
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v5

    .line 1149
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1150
    .line 1151
    .line 1152
    move-result v5

    .line 1153
    add-int/lit8 v5, v5, 0x15

    .line 1154
    .line 1155
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v6

    .line 1159
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1160
    .line 1161
    .line 1162
    move-result v6

    .line 1163
    add-int/2addr v5, v6

    .line 1164
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1165
    .line 1166
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1167
    .line 1168
    .line 1169
    move-object/from16 v5, v18

    .line 1170
    .line 1171
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1175
    .line 1176
    .line 1177
    move-object/from16 v5, v17

    .line 1178
    .line 1179
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v5

    .line 1189
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1190
    .line 1191
    .line 1192
    throw v0
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_16
    .catch Ljava/lang/RuntimeException; {:try_start_1b .. :try_end_1b} :catch_15

    .line 1193
    :catch_15
    move-exception v0

    .line 1194
    goto :goto_17

    .line 1195
    :catch_16
    move-exception v0

    .line 1196
    :goto_17
    const/4 v15, 0x0

    .line 1197
    goto :goto_1b

    .line 1198
    :catch_17
    move-exception v0

    .line 1199
    goto :goto_18

    .line 1200
    :catch_18
    move-exception v0

    .line 1201
    :goto_18
    const/4 v4, 0x0

    .line 1202
    goto :goto_17

    .line 1203
    :catch_19
    move-exception v0

    .line 1204
    :goto_19
    move-object/from16 v22, v11

    .line 1205
    .line 1206
    goto :goto_1a

    .line 1207
    :catch_1a
    move-exception v0

    .line 1208
    goto :goto_19

    .line 1209
    :goto_1a
    move-object/from16 v11, v22

    .line 1210
    .line 1211
    goto :goto_18

    .line 1212
    :goto_1b
    instance-of v5, v0, Ljava/lang/RuntimeException;

    .line 1213
    .line 1214
    if-eqz v5, :cond_19

    .line 1215
    .line 1216
    const-string v5, "VideoStreamFullFileCache.preload"

    .line 1217
    .line 1218
    sget-object v6, Lhg4;->C:Lhg4;

    .line 1219
    .line 1220
    iget-object v6, v6, Lhg4;->h:Lgd2;

    .line 1221
    .line 1222
    invoke-virtual {v6, v5, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1223
    .line 1224
    .line 1225
    :cond_19
    :try_start_1c
    invoke-virtual {v15}, Ljava/io/FileOutputStream;->close()V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_1b
    .catch Ljava/lang/NullPointerException; {:try_start_1c .. :try_end_1c} :catch_1b

    .line 1226
    .line 1227
    .line 1228
    :catch_1b
    iget-boolean v0, v1, Lgf2;->j:Z

    .line 1229
    .line 1230
    const-string v5, "\""

    .line 1231
    .line 1232
    if-eqz v0, :cond_1a

    .line 1233
    .line 1234
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v0

    .line 1238
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1239
    .line 1240
    .line 1241
    move-result v0

    .line 1242
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1243
    .line 1244
    add-int/lit8 v0, v0, 0x1a

    .line 1245
    .line 1246
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1247
    .line 1248
    .line 1249
    const-string v0, "Preload aborted for URL \""

    .line 1250
    .line 1251
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    goto :goto_1c

    .line 1268
    :cond_1a
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1273
    .line 1274
    .line 1275
    move-result v0

    .line 1276
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1277
    .line 1278
    add-int/lit8 v0, v0, 0x19

    .line 1279
    .line 1280
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1281
    .line 1282
    .line 1283
    const/4 v0, 0x5

    .line 1284
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 1285
    .line 1286
    .line 1287
    :goto_1c
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    .line 1288
    .line 1289
    .line 1290
    move-result v0

    .line 1291
    if-eqz v0, :cond_1b

    .line 1292
    .line 1293
    invoke-virtual {v14}, Ljava/io/File;->delete()Z

    .line 1294
    .line 1295
    .line 1296
    move-result v0

    .line 1297
    if-nez v0, :cond_1b

    .line 1298
    .line 1299
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    const-string v5, "Could not delete partial cache file at "

    .line 1308
    .line 1309
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1314
    .line 1315
    .line 1316
    :cond_1b
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v0

    .line 1320
    invoke-virtual {v1, v2, v0, v11, v4}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1321
    .line 1322
    .line 1323
    sget-object v0, Lgf2;->k:Ljava/util/Set;

    .line 1324
    .line 1325
    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1326
    .line 1327
    .line 1328
    const/16 v16, 0x0

    .line 1329
    .line 1330
    return v16

    .line 1331
    :goto_1d
    :try_start_1d
    monitor-exit v15
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    .line 1332
    throw v0

    .line 1333
    :cond_1c
    const-string v0, "noCacheDir"

    .line 1334
    .line 1335
    const/4 v11, 0x0

    .line 1336
    invoke-virtual {v1, v2, v11, v0, v11}, Lff2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1337
    .line 1338
    .line 1339
    const/16 v16, 0x0

    .line 1340
    .line 1341
    return v16
.end method

.method public final l()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lgf2;->j:Z

    .line 3
    .line 4
    return-void
.end method

.method public final o(Ljava/io/File;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lgf2;->i:Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v2, ".done"

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
