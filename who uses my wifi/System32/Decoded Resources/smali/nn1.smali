.class public final Lnn1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public a:Lnf1;

.field public b:Ljg1;

.field public c:I

.field public d:J

.field public e:Lln1;

.field public f:I

.field public g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lbd2;->o:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final b(Lmf1;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lbd2;->I(Lmf1;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lnn1;->b:Ljg1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget v2, v0, Lnn1;->c:I

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    const/4 v4, 0x4

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v2, :cond_1a

    .line 19
    .line 20
    const/4 v7, 0x2

    .line 21
    const-wide/16 v8, -0x1

    .line 22
    .line 23
    const/16 v10, 0x8

    .line 24
    .line 25
    if-eq v2, v5, :cond_18

    .line 26
    .line 27
    const/4 v11, 0x3

    .line 28
    if-eq v2, v7, :cond_5

    .line 29
    .line 30
    if-eq v2, v11, :cond_2

    .line 31
    .line 32
    iget-wide v10, v0, Lnn1;->g:J

    .line 33
    .line 34
    cmp-long v2, v10, v8

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v5, v6

    .line 40
    :goto_0
    invoke-static {v5}, Lzt0;->b0(Z)V

    .line 41
    .line 42
    .line 43
    iget-wide v4, v0, Lnn1;->g:J

    .line 44
    .line 45
    move-object v2, v1

    .line 46
    check-cast v2, Ldf1;

    .line 47
    .line 48
    iget-wide v7, v2, Ldf1;->i:J

    .line 49
    .line 50
    sub-long/2addr v4, v7

    .line 51
    iget-object v2, v0, Lnn1;->e:Lln1;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-interface {v2, v1, v4, v5}, Lln1;->b(Lmf1;J)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    return v3

    .line 63
    :cond_1
    return v6

    .line 64
    :cond_2
    move-object v2, v1

    .line 65
    check-cast v2, Ldf1;

    .line 66
    .line 67
    iput v6, v2, Ldf1;->k:I

    .line 68
    .line 69
    new-instance v2, Lkz2;

    .line 70
    .line 71
    invoke-direct {v2, v10}, Lkz2;-><init>(I)V

    .line 72
    .line 73
    .line 74
    const v3, 0x64617461

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v1, v2}, Lbd2;->O(ILmf1;Lkz2;)Lon1;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v1, Ldf1;

    .line 82
    .line 83
    invoke-virtual {v1, v10, v6}, Ldf1;->c(IZ)Z

    .line 84
    .line 85
    .line 86
    iget-wide v10, v1, Ldf1;->i:J

    .line 87
    .line 88
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget-wide v10, v2, Lon1;->b:J

    .line 93
    .line 94
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, Ljava/lang/Long;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    iput v3, v0, Lnn1;->f:I

    .line 111
    .line 112
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Ljava/lang/Long;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    iget-wide v10, v0, Lnn1;->d:J

    .line 121
    .line 122
    cmp-long v5, v10, v8

    .line 123
    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    const-wide v12, 0xffffffffL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    cmp-long v5, v2, v12

    .line 132
    .line 133
    if-nez v5, :cond_3

    .line 134
    .line 135
    move-wide v2, v10

    .line 136
    :cond_3
    iget v5, v0, Lnn1;->f:I

    .line 137
    .line 138
    int-to-long v10, v5

    .line 139
    add-long/2addr v10, v2

    .line 140
    iput-wide v10, v0, Lnn1;->g:J

    .line 141
    .line 142
    iget-wide v1, v1, Ldf1;->h:J

    .line 143
    .line 144
    cmp-long v3, v1, v8

    .line 145
    .line 146
    if-eqz v3, :cond_4

    .line 147
    .line 148
    cmp-long v3, v10, v1

    .line 149
    .line 150
    if-lez v3, :cond_4

    .line 151
    .line 152
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    add-int/lit8 v3, v3, 0x1d

    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    new-instance v7, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    add-int/2addr v3, v5

    .line 173
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 174
    .line 175
    .line 176
    const-string v3, "Data exceeds input length: "

    .line 177
    .line 178
    const-string v5, ", "

    .line 179
    .line 180
    invoke-static {v7, v3, v10, v11, v5}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-static {v3}, La30;->x(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iput-wide v1, v0, Lnn1;->g:J

    .line 194
    .line 195
    move-wide v10, v1

    .line 196
    :cond_4
    iget-object v1, v0, Lnn1;->e:Lln1;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget v2, v0, Lnn1;->f:I

    .line 202
    .line 203
    invoke-interface {v1, v2, v10, v11}, Lln1;->a(IJ)V

    .line 204
    .line 205
    .line 206
    iput v4, v0, Lnn1;->c:I

    .line 207
    .line 208
    return v6

    .line 209
    :cond_5
    new-instance v2, Lkz2;

    .line 210
    .line 211
    const/16 v3, 0x10

    .line 212
    .line 213
    invoke-direct {v2, v3}, Lkz2;-><init>(I)V

    .line 214
    .line 215
    .line 216
    const v7, 0x666d7420

    .line 217
    .line 218
    .line 219
    invoke-static {v7, v1, v2}, Lbd2;->O(ILmf1;Lkz2;)Lon1;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    iget-wide v7, v7, Lon1;->b:J

    .line 224
    .line 225
    const-wide/16 v9, 0x10

    .line 226
    .line 227
    cmp-long v9, v7, v9

    .line 228
    .line 229
    if-ltz v9, :cond_6

    .line 230
    .line 231
    move v9, v5

    .line 232
    goto :goto_1

    .line 233
    :cond_6
    move v9, v6

    .line 234
    :goto_1
    invoke-static {v9}, Lzt0;->b0(Z)V

    .line 235
    .line 236
    .line 237
    iget-object v9, v2, Lkz2;->a:[B

    .line 238
    .line 239
    check-cast v1, Ldf1;

    .line 240
    .line 241
    invoke-virtual {v1, v9, v6, v3, v6}, Ldf1;->B([BIIZ)Z

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v6}, Lkz2;->E(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Lkz2;->M()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    invoke-virtual {v2}, Lkz2;->M()I

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    invoke-virtual {v2}, Lkz2;->i()I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    invoke-virtual {v2}, Lkz2;->i()I

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Lkz2;->M()I

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    invoke-virtual {v2}, Lkz2;->M()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    long-to-int v7, v7

    .line 271
    add-int/lit8 v7, v7, -0x10

    .line 272
    .line 273
    const v8, 0xfffe

    .line 274
    .line 275
    .line 276
    if-lez v7, :cond_f

    .line 277
    .line 278
    new-array v13, v7, [B

    .line 279
    .line 280
    invoke-virtual {v1, v13, v6, v7, v6}, Ldf1;->B([BIIZ)Z

    .line 281
    .line 282
    .line 283
    if-ne v3, v8, :cond_10

    .line 284
    .line 285
    const/16 v3, 0x18

    .line 286
    .line 287
    if-ne v7, v3, :cond_e

    .line 288
    .line 289
    new-instance v3, Lkz2;

    .line 290
    .line 291
    invoke-direct {v3, v13}, Lkz2;-><init>([B)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3}, Lkz2;->M()I

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3}, Lkz2;->M()I

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    if-eqz v7, :cond_8

    .line 302
    .line 303
    if-ne v7, v2, :cond_7

    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_7
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    add-int/lit8 v1, v1, 0x21

    .line 319
    .line 320
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    add-int/2addr v3, v1

    .line 325
    new-instance v1, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    add-int/lit8 v3, v3, 0x13

    .line 328
    .line 329
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 330
    .line 331
    .line 332
    const-string v3, "validBits ( "

    .line 333
    .line 334
    const-string v4, ")  != bitsPerSample( "

    .line 335
    .line 336
    invoke-static {v1, v3, v7, v4, v2}, Lex0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)V

    .line 337
    .line 338
    .line 339
    const-string v2, ") are not supported"

    .line 340
    .line 341
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    throw v1

    .line 353
    :cond_8
    :goto_2
    invoke-virtual {v3}, Lkz2;->i()I

    .line 354
    .line 355
    .line 356
    move-result v7

    .line 357
    shr-int/lit8 v14, v7, 0x12

    .line 358
    .line 359
    if-nez v14, :cond_d

    .line 360
    .line 361
    if-eqz v7, :cond_a

    .line 362
    .line 363
    invoke-static {v7}, Ljava/lang/Integer;->bitCount(I)I

    .line 364
    .line 365
    .line 366
    move-result v14

    .line 367
    if-ne v14, v9, :cond_9

    .line 368
    .line 369
    goto :goto_3

    .line 370
    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->bitCount(I)I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    add-int/lit8 v2, v2, 0x2e

    .line 387
    .line 388
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    new-instance v4, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    add-int/2addr v2, v3

    .line 395
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 396
    .line 397
    .line 398
    const-string v2, "invalid number of channels ("

    .line 399
    .line 400
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    const-string v1, ") in channel mask "

    .line 407
    .line 408
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    throw v1

    .line 423
    :cond_a
    :goto_3
    invoke-virtual {v3}, Lkz2;->M()I

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    const/16 v14, 0xe

    .line 428
    .line 429
    new-array v15, v14, [B

    .line 430
    .line 431
    invoke-virtual {v3, v15, v6, v14}, Lkz2;->H([BII)V

    .line 432
    .line 433
    .line 434
    sget-object v3, Lbd2;->j:[B

    .line 435
    .line 436
    invoke-static {v15, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-nez v3, :cond_c

    .line 441
    .line 442
    sget-object v3, Lbd2;->k:[B

    .line 443
    .line 444
    invoke-static {v15, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-eqz v3, :cond_b

    .line 449
    .line 450
    goto :goto_4

    .line 451
    :cond_b
    const-string v1, "invalid wav format extension guid"

    .line 452
    .line 453
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    throw v1

    .line 458
    :cond_c
    :goto_4
    move v3, v7

    .line 459
    goto :goto_5

    .line 460
    :cond_d
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    new-instance v2, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    add-int/lit8 v1, v1, 0x15

    .line 471
    .line 472
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 473
    .line 474
    .line 475
    const-string v1, "invalid channel mask "

    .line 476
    .line 477
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    throw v1

    .line 492
    :cond_e
    move v3, v8

    .line 493
    goto :goto_5

    .line 494
    :cond_f
    sget-object v13, Lv23;->b:[B

    .line 495
    .line 496
    :cond_10
    :goto_5
    invoke-virtual {v1}, Ldf1;->n()J

    .line 497
    .line 498
    .line 499
    move-result-wide v14

    .line 500
    iget-wide v4, v1, Ldf1;->i:J

    .line 501
    .line 502
    sub-long/2addr v14, v4

    .line 503
    long-to-int v4, v14

    .line 504
    invoke-virtual {v1, v4, v6}, Ldf1;->c(IZ)Z

    .line 505
    .line 506
    .line 507
    new-instance v1, Lcm;

    .line 508
    .line 509
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 510
    .line 511
    .line 512
    iput v9, v1, Lcm;->f:I

    .line 513
    .line 514
    iput v10, v1, Lcm;->g:I

    .line 515
    .line 516
    iput v12, v1, Lcm;->h:I

    .line 517
    .line 518
    iput v2, v1, Lcm;->i:I

    .line 519
    .line 520
    iput-object v13, v1, Lcm;->j:Ljava/lang/Object;

    .line 521
    .line 522
    const/16 v4, 0x11

    .line 523
    .line 524
    if-ne v3, v4, :cond_11

    .line 525
    .line 526
    new-instance v2, Lkn1;

    .line 527
    .line 528
    iget-object v3, v0, Lnn1;->a:Lnf1;

    .line 529
    .line 530
    iget-object v4, v0, Lnn1;->b:Ljg1;

    .line 531
    .line 532
    invoke-direct {v2, v3, v4, v1}, Lkn1;-><init>(Lnf1;Ljg1;Lcm;)V

    .line 533
    .line 534
    .line 535
    iput-object v2, v0, Lnn1;->e:Lln1;

    .line 536
    .line 537
    goto/16 :goto_7

    .line 538
    .line 539
    :cond_11
    const/4 v4, 0x6

    .line 540
    if-ne v3, v4, :cond_12

    .line 541
    .line 542
    new-instance v16, Lmn1;

    .line 543
    .line 544
    iget-object v2, v0, Lnn1;->a:Lnf1;

    .line 545
    .line 546
    iget-object v3, v0, Lnn1;->b:Ljg1;

    .line 547
    .line 548
    const-string v20, "audio/g711-alaw"

    .line 549
    .line 550
    const/16 v21, -0x1

    .line 551
    .line 552
    move-object/from16 v19, v1

    .line 553
    .line 554
    move-object/from16 v17, v2

    .line 555
    .line 556
    move-object/from16 v18, v3

    .line 557
    .line 558
    invoke-direct/range {v16 .. v21}, Lmn1;-><init>(Lnf1;Ljg1;Lcm;Ljava/lang/String;I)V

    .line 559
    .line 560
    .line 561
    move-object/from16 v1, v16

    .line 562
    .line 563
    iput-object v1, v0, Lnn1;->e:Lln1;

    .line 564
    .line 565
    goto :goto_7

    .line 566
    :cond_12
    move-object/from16 v19, v1

    .line 567
    .line 568
    const/4 v1, 0x7

    .line 569
    if-ne v3, v1, :cond_13

    .line 570
    .line 571
    new-instance v16, Lmn1;

    .line 572
    .line 573
    iget-object v1, v0, Lnn1;->a:Lnf1;

    .line 574
    .line 575
    iget-object v2, v0, Lnn1;->b:Ljg1;

    .line 576
    .line 577
    const-string v20, "audio/g711-mlaw"

    .line 578
    .line 579
    const/16 v21, -0x1

    .line 580
    .line 581
    move-object/from16 v17, v1

    .line 582
    .line 583
    move-object/from16 v18, v2

    .line 584
    .line 585
    invoke-direct/range {v16 .. v21}, Lmn1;-><init>(Lnf1;Ljg1;Lcm;Ljava/lang/String;I)V

    .line 586
    .line 587
    .line 588
    move-object/from16 v1, v16

    .line 589
    .line 590
    iput-object v1, v0, Lnn1;->e:Lln1;

    .line 591
    .line 592
    goto :goto_7

    .line 593
    :cond_13
    const/4 v1, 0x1

    .line 594
    if-eq v3, v1, :cond_16

    .line 595
    .line 596
    if-eq v3, v11, :cond_15

    .line 597
    .line 598
    if-eq v3, v8, :cond_16

    .line 599
    .line 600
    :cond_14
    move/from16 v21, v6

    .line 601
    .line 602
    goto :goto_6

    .line 603
    :cond_15
    const/16 v1, 0x20

    .line 604
    .line 605
    if-ne v2, v1, :cond_14

    .line 606
    .line 607
    const/16 v21, 0x4

    .line 608
    .line 609
    goto :goto_6

    .line 610
    :cond_16
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 611
    .line 612
    invoke-static {v2, v1}, Lv23;->y(ILjava/nio/ByteOrder;)I

    .line 613
    .line 614
    .line 615
    move-result v4

    .line 616
    move/from16 v21, v4

    .line 617
    .line 618
    :goto_6
    if-eqz v21, :cond_17

    .line 619
    .line 620
    new-instance v16, Lmn1;

    .line 621
    .line 622
    iget-object v1, v0, Lnn1;->a:Lnf1;

    .line 623
    .line 624
    iget-object v2, v0, Lnn1;->b:Ljg1;

    .line 625
    .line 626
    const-string v20, "audio/raw"

    .line 627
    .line 628
    move-object/from16 v17, v1

    .line 629
    .line 630
    move-object/from16 v18, v2

    .line 631
    .line 632
    invoke-direct/range {v16 .. v21}, Lmn1;-><init>(Lnf1;Ljg1;Lcm;Ljava/lang/String;I)V

    .line 633
    .line 634
    .line 635
    move-object/from16 v1, v16

    .line 636
    .line 637
    iput-object v1, v0, Lnn1;->e:Lln1;

    .line 638
    .line 639
    :goto_7
    iput v11, v0, Lnn1;->c:I

    .line 640
    .line 641
    return v6

    .line 642
    :cond_17
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    new-instance v2, Ljava/lang/StringBuilder;

    .line 651
    .line 652
    add-int/lit8 v1, v1, 0x1d

    .line 653
    .line 654
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 655
    .line 656
    .line 657
    const-string v1, "Unsupported WAV format type: "

    .line 658
    .line 659
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    throw v1

    .line 674
    :cond_18
    new-instance v2, Lkz2;

    .line 675
    .line 676
    invoke-direct {v2, v10}, Lkz2;-><init>(I)V

    .line 677
    .line 678
    .line 679
    invoke-static {v1, v2}, Lon1;->a(Lmf1;Lkz2;)Lon1;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    iget v4, v3, Lon1;->a:I

    .line 684
    .line 685
    const v5, 0x64733634

    .line 686
    .line 687
    .line 688
    if-eq v4, v5, :cond_19

    .line 689
    .line 690
    check-cast v1, Ldf1;

    .line 691
    .line 692
    iput v6, v1, Ldf1;->k:I

    .line 693
    .line 694
    goto :goto_8

    .line 695
    :cond_19
    check-cast v1, Ldf1;

    .line 696
    .line 697
    invoke-virtual {v1, v10, v6}, Ldf1;->e(IZ)Z

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2, v6}, Lkz2;->E(I)V

    .line 701
    .line 702
    .line 703
    iget-object v4, v2, Lkz2;->a:[B

    .line 704
    .line 705
    invoke-virtual {v1, v4, v6, v10, v6}, Ldf1;->B([BIIZ)Z

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2}, Lkz2;->e()J

    .line 709
    .line 710
    .line 711
    move-result-wide v8

    .line 712
    iget-wide v2, v3, Lon1;->b:J

    .line 713
    .line 714
    long-to-int v2, v2

    .line 715
    add-int/2addr v2, v10

    .line 716
    invoke-virtual {v1, v2, v6}, Ldf1;->c(IZ)Z

    .line 717
    .line 718
    .line 719
    :goto_8
    iput-wide v8, v0, Lnn1;->d:J

    .line 720
    .line 721
    iput v7, v0, Lnn1;->c:I

    .line 722
    .line 723
    return v6

    .line 724
    :cond_1a
    move-object v2, v1

    .line 725
    check-cast v2, Ldf1;

    .line 726
    .line 727
    iget-wide v4, v2, Ldf1;->i:J

    .line 728
    .line 729
    const-wide/16 v7, 0x0

    .line 730
    .line 731
    cmp-long v2, v4, v7

    .line 732
    .line 733
    if-nez v2, :cond_1b

    .line 734
    .line 735
    const/4 v2, 0x1

    .line 736
    goto :goto_9

    .line 737
    :cond_1b
    move v2, v6

    .line 738
    :goto_9
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 739
    .line 740
    .line 741
    iget v2, v0, Lnn1;->f:I

    .line 742
    .line 743
    if-eq v2, v3, :cond_1c

    .line 744
    .line 745
    check-cast v1, Ldf1;

    .line 746
    .line 747
    invoke-virtual {v1, v2, v6}, Ldf1;->c(IZ)Z

    .line 748
    .line 749
    .line 750
    const/4 v1, 0x4

    .line 751
    iput v1, v0, Lnn1;->c:I

    .line 752
    .line 753
    return v6

    .line 754
    :cond_1c
    invoke-static {v1}, Lbd2;->I(Lmf1;)Z

    .line 755
    .line 756
    .line 757
    move-result v2

    .line 758
    if-eqz v2, :cond_1d

    .line 759
    .line 760
    check-cast v1, Ldf1;

    .line 761
    .line 762
    invoke-virtual {v1}, Ldf1;->n()J

    .line 763
    .line 764
    .line 765
    move-result-wide v2

    .line 766
    iget-wide v4, v1, Ldf1;->i:J

    .line 767
    .line 768
    sub-long/2addr v2, v4

    .line 769
    long-to-int v2, v2

    .line 770
    invoke-virtual {v1, v2, v6}, Ldf1;->c(IZ)Z

    .line 771
    .line 772
    .line 773
    const/4 v1, 0x1

    .line 774
    iput v1, v0, Lnn1;->c:I

    .line 775
    .line 776
    return v6

    .line 777
    :cond_1d
    const-string v1, "Unsupported or unrecognized wav file type."

    .line 778
    .line 779
    const/4 v2, 0x0

    .line 780
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 781
    .line 782
    .line 783
    move-result-object v1

    .line 784
    throw v1
.end method

.method public final e(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x4

    .line 10
    :goto_0
    iput p1, p0, Lnn1;->c:I

    .line 11
    .line 12
    iget-object p1, p0, Lnn1;->e:Lln1;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-interface {p1, p3, p4}, Lln1;->d(J)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lnn1;->a:Lnf1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lnf1;->z(II)Ljg1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lnn1;->b:Ljg1;

    .line 10
    .line 11
    invoke-interface {p1}, Lnf1;->s()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
