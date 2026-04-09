.class public final Ltg1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lng1;


# instance fields
.field public final a:Lxm3;

.field public final b:I


# direct methods
.method public constructor <init>(ILsn3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ltg1;->b:I

    .line 5
    .line 6
    iput-object p2, p0, Ltg1;->a:Lxm3;

    .line 7
    .line 8
    return-void
.end method

.method public static b(ILkz2;)Ltg1;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "initialCapacity"

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-static {v1, v2}, Lob1;->z(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-array v1, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    iget v3, v0, Lkz2;->c:I

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, -0x2

    .line 15
    move v6, v4

    .line 16
    :goto_0
    invoke-virtual {v0}, Lkz2;->B()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/16 v8, 0x8

    .line 21
    .line 22
    if-le v7, v8, :cond_10

    .line 23
    .line 24
    invoke-virtual {v0}, Lkz2;->c()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-virtual {v0}, Lkz2;->c()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    iget v10, v0, Lkz2;->b:I

    .line 33
    .line 34
    add-int/2addr v10, v9

    .line 35
    invoke-virtual {v0, v10}, Lkz2;->C(I)V

    .line 36
    .line 37
    .line 38
    const v9, 0x5453494c

    .line 39
    .line 40
    .line 41
    if-ne v7, v9, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lkz2;->c()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-static {v7, v0}, Ltg1;->b(ILkz2;)Ltg1;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_0
    const/16 v9, 0xc

    .line 54
    .line 55
    const/4 v11, 0x0

    .line 56
    sparse-switch v7, :sswitch_data_0

    .line 57
    .line 58
    .line 59
    :goto_1
    move-object v7, v11

    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :sswitch_0
    new-instance v7, Lvg1;

    .line 63
    .line 64
    invoke-virtual {v0}, Lkz2;->B()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 69
    .line 70
    invoke-virtual {v0, v8, v9}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-direct {v7, v8}, Lvg1;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_6

    .line 78
    .line 79
    :sswitch_1
    invoke-virtual {v0}, Lkz2;->c()I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-virtual {v0, v9}, Lkz2;->G(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lkz2;->c()I

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lkz2;->c()I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    invoke-virtual {v0}, Lkz2;->c()I

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    invoke-virtual {v0, v2}, Lkz2;->G(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lkz2;->c()I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    invoke-virtual {v0}, Lkz2;->c()I

    .line 105
    .line 106
    .line 107
    move-result v16

    .line 108
    invoke-virtual {v0, v2}, Lkz2;->G(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lkz2;->c()I

    .line 112
    .line 113
    .line 114
    move-result v17

    .line 115
    new-instance v11, Lrg1;

    .line 116
    .line 117
    invoke-direct/range {v11 .. v17}, Lrg1;-><init>(IIIIII)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :sswitch_2
    invoke-virtual {v0}, Lkz2;->c()I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    invoke-virtual {v0, v8}, Lkz2;->G(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lkz2;->c()I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    invoke-virtual {v0}, Lkz2;->c()I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    invoke-virtual {v0, v2}, Lkz2;->G(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lkz2;->c()I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v9}, Lkz2;->G(I)V

    .line 143
    .line 144
    .line 145
    new-instance v9, Lpg1;

    .line 146
    .line 147
    invoke-direct {v9, v7, v8, v11}, Lpg1;-><init>(III)V

    .line 148
    .line 149
    .line 150
    move-object v7, v9

    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :sswitch_3
    const/4 v7, 0x2

    .line 154
    if-ne v5, v7, :cond_2

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Lkz2;->G(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lkz2;->c()I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    invoke-virtual {v0}, Lkz2;->c()I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    invoke-virtual {v0, v2}, Lkz2;->G(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lkz2;->c()I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    sparse-switch v9, :sswitch_data_1

    .line 175
    .line 176
    .line 177
    move-object v12, v11

    .line 178
    goto :goto_2

    .line 179
    :sswitch_4
    const-string v12, "video/mjpeg"

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :sswitch_5
    const-string v12, "video/mp43"

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :sswitch_6
    const-string v12, "video/mp42"

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :sswitch_7
    const-string v12, "video/avc"

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :sswitch_8
    const-string v12, "video/mp4v-es"

    .line 192
    .line 193
    :goto_2
    if-nez v12, :cond_1

    .line 194
    .line 195
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    new-instance v8, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    add-int/lit8 v7, v7, 0x2c

    .line 206
    .line 207
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 208
    .line 209
    .line 210
    const-string v7, "Ignoring track with unsupported compression "

    .line 211
    .line 212
    invoke-static {v8, v9, v7}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :cond_1
    new-instance v9, Lgg4;

    .line 218
    .line 219
    invoke-direct {v9}, Lgg4;-><init>()V

    .line 220
    .line 221
    .line 222
    iput v7, v9, Lgg4;->s:I

    .line 223
    .line 224
    iput v8, v9, Lgg4;->t:I

    .line 225
    .line 226
    invoke-virtual {v9, v12}, Lgg4;->e(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    new-instance v7, Lug1;

    .line 230
    .line 231
    new-instance v8, Lph4;

    .line 232
    .line 233
    invoke-direct {v8, v9}, Lph4;-><init>(Lgg4;)V

    .line 234
    .line 235
    .line 236
    invoke-direct {v7, v8}, Lug1;-><init>(Lph4;)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_6

    .line 240
    .line 241
    :cond_2
    const/4 v7, 0x1

    .line 242
    if-ne v5, v7, :cond_c

    .line 243
    .line 244
    invoke-virtual {v0}, Lkz2;->M()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    const-string v9, "audio/raw"

    .line 249
    .line 250
    const-string v12, "audio/mp4a-latm"

    .line 251
    .line 252
    if-eq v8, v7, :cond_7

    .line 253
    .line 254
    const/16 v7, 0x55

    .line 255
    .line 256
    if-eq v8, v7, :cond_6

    .line 257
    .line 258
    const/16 v7, 0xff

    .line 259
    .line 260
    if-eq v8, v7, :cond_5

    .line 261
    .line 262
    const/16 v7, 0x2000

    .line 263
    .line 264
    if-eq v8, v7, :cond_4

    .line 265
    .line 266
    const/16 v7, 0x2001

    .line 267
    .line 268
    if-eq v8, v7, :cond_3

    .line 269
    .line 270
    move-object v7, v11

    .line 271
    goto :goto_3

    .line 272
    :cond_3
    const-string v7, "audio/vnd.dts"

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_4
    const-string v7, "audio/ac3"

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_5
    move-object v7, v12

    .line 279
    goto :goto_3

    .line 280
    :cond_6
    const-string v7, "audio/mpeg"

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_7
    move-object v7, v9

    .line 284
    :goto_3
    if-nez v7, :cond_8

    .line 285
    .line 286
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    new-instance v9, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    add-int/lit8 v7, v7, 0x2b

    .line 297
    .line 298
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 299
    .line 300
    .line 301
    const-string v7, "Ignoring track with unsupported format tag "

    .line 302
    .line 303
    invoke-static {v9, v8, v7}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_1

    .line 307
    .line 308
    :cond_8
    invoke-virtual {v0}, Lkz2;->M()I

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    invoke-virtual {v0}, Lkz2;->c()I

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    const/4 v13, 0x6

    .line 317
    invoke-virtual {v0, v13}, Lkz2;->G(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Lkz2;->M()I

    .line 321
    .line 322
    .line 323
    move-result v13

    .line 324
    sget-object v14, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 325
    .line 326
    invoke-static {v13, v14}, Lv23;->y(ILjava/nio/ByteOrder;)I

    .line 327
    .line 328
    .line 329
    move-result v13

    .line 330
    invoke-virtual {v0}, Lkz2;->B()I

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    if-lez v14, :cond_9

    .line 335
    .line 336
    invoke-virtual {v0}, Lkz2;->M()I

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    goto :goto_4

    .line 341
    :cond_9
    move v14, v4

    .line 342
    :goto_4
    new-instance v15, Lgg4;

    .line 343
    .line 344
    invoke-direct {v15}, Lgg4;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v15, v7}, Lgg4;->e(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    iput v8, v15, Lgg4;->D:I

    .line 351
    .line 352
    iput v11, v15, Lgg4;->E:I

    .line 353
    .line 354
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v8

    .line 358
    if-eqz v8, :cond_a

    .line 359
    .line 360
    if-eqz v13, :cond_a

    .line 361
    .line 362
    iput v13, v15, Lgg4;->F:I

    .line 363
    .line 364
    :cond_a
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    if-eqz v7, :cond_b

    .line 369
    .line 370
    if-lez v14, :cond_b

    .line 371
    .line 372
    new-array v7, v14, [B

    .line 373
    .line 374
    invoke-virtual {v0, v7, v4, v14}, Lkz2;->H([BII)V

    .line 375
    .line 376
    .line 377
    invoke-static {v7}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    iput-object v7, v15, Lgg4;->o:Ljava/util/List;

    .line 382
    .line 383
    :cond_b
    new-instance v7, Lug1;

    .line 384
    .line 385
    new-instance v8, Lph4;

    .line 386
    .line 387
    invoke-direct {v8, v15}, Lph4;-><init>(Lgg4;)V

    .line 388
    .line 389
    .line 390
    invoke-direct {v7, v8}, Lug1;-><init>(Lph4;)V

    .line 391
    .line 392
    .line 393
    goto :goto_6

    .line 394
    :cond_c
    sget-object v7, Lv23;->a:Ljava/lang/String;

    .line 395
    .line 396
    packed-switch v5, :pswitch_data_0

    .line 397
    .line 398
    .line 399
    const-string v7, "camera motion"

    .line 400
    .line 401
    goto :goto_5

    .line 402
    :pswitch_0
    const-string v7, "metadata"

    .line 403
    .line 404
    goto :goto_5

    .line 405
    :pswitch_1
    const-string v7, "image"

    .line 406
    .line 407
    goto :goto_5

    .line 408
    :pswitch_2
    const-string v7, "text"

    .line 409
    .line 410
    goto :goto_5

    .line 411
    :pswitch_3
    const-string v7, "video"

    .line 412
    .line 413
    goto :goto_5

    .line 414
    :pswitch_4
    const-string v7, "audio"

    .line 415
    .line 416
    goto :goto_5

    .line 417
    :pswitch_5
    const-string v7, "default"

    .line 418
    .line 419
    goto :goto_5

    .line 420
    :pswitch_6
    const-string v7, "unknown"

    .line 421
    .line 422
    goto :goto_5

    .line 423
    :pswitch_7
    const-string v7, "none"

    .line 424
    .line 425
    :goto_5
    const-string v8, "Ignoring strf box for unsupported track type: "

    .line 426
    .line 427
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    invoke-static {v7}, La30;->x(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_1

    .line 435
    .line 436
    :goto_6
    if-eqz v7, :cond_f

    .line 437
    .line 438
    invoke-interface {v7}, Lng1;->a()I

    .line 439
    .line 440
    .line 441
    move-result v8

    .line 442
    const v9, 0x68727473

    .line 443
    .line 444
    .line 445
    if-ne v8, v9, :cond_d

    .line 446
    .line 447
    move-object v5, v7

    .line 448
    check-cast v5, Lrg1;

    .line 449
    .line 450
    invoke-virtual {v5}, Lrg1;->b()I

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    :cond_d
    array-length v8, v1

    .line 455
    add-int/lit8 v9, v6, 0x1

    .line 456
    .line 457
    invoke-static {v8, v9}, Lrm3;->d(II)I

    .line 458
    .line 459
    .line 460
    move-result v11

    .line 461
    if-gt v11, v8, :cond_e

    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_e
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    :goto_7
    aput-object v7, v1, v6

    .line 469
    .line 470
    move v6, v9

    .line 471
    :cond_f
    invoke-virtual {v0, v10}, Lkz2;->E(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v3}, Lkz2;->C(I)V

    .line 475
    .line 476
    .line 477
    goto/16 :goto_0

    .line 478
    .line 479
    :cond_10
    new-instance v0, Ltg1;

    .line 480
    .line 481
    invoke-static {v1, v6}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    move/from16 v2, p0

    .line 486
    .line 487
    invoke-direct {v0, v2, v1}, Ltg1;-><init>(ILsn3;)V

    .line 488
    .line 489
    .line 490
    return-object v0

    .line 491
    :sswitch_data_0
    .sparse-switch
        0x66727473 -> :sswitch_3
        0x68697661 -> :sswitch_2
        0x68727473 -> :sswitch_1
        0x6e727473 -> :sswitch_0
    .end sparse-switch

    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    :sswitch_data_1
    .sparse-switch
        0x30355844 -> :sswitch_8
        0x31435641 -> :sswitch_7
        0x31637661 -> :sswitch_7
        0x3234504d -> :sswitch_6
        0x3334504d -> :sswitch_5
        0x34363248 -> :sswitch_7
        0x34504d46 -> :sswitch_8
        0x44495633 -> :sswitch_8
        0x44495658 -> :sswitch_8
        0x47504a4d -> :sswitch_4
        0x58564944 -> :sswitch_8
        0x64697678 -> :sswitch_8
        0x67706a6d -> :sswitch_4
        0x78766964 -> :sswitch_8
    .end sparse-switch

    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    :pswitch_data_0
    .packed-switch -0x2
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


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ltg1;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final c(Ljava/lang/Class;)Lng1;
    .locals 5

    .line 1
    iget-object v0, p0, Ltg1;->a:Lxm3;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :cond_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lng1;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    if-ne v4, p1, :cond_0

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method
