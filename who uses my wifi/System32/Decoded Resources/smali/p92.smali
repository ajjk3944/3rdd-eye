.class public final Lp92;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp92;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 69

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lp92;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    move v7, v3

    .line 18
    move v8, v7

    .line 19
    move v10, v8

    .line 20
    move v12, v10

    .line 21
    move v13, v12

    .line 22
    move v14, v13

    .line 23
    move v15, v14

    .line 24
    move v11, v4

    .line 25
    move-object v9, v5

    .line 26
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v3, v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-char v4, v3

    .line 37
    packed-switch v4, :pswitch_data_1

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_0
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    goto :goto_0

    .line 49
    :pswitch_1
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    goto :goto_0

    .line 54
    :pswitch_2
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    goto :goto_0

    .line 59
    :pswitch_3
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    goto :goto_0

    .line 64
    :pswitch_4
    const/4 v4, 0x4

    .line 65
    invoke-static {v1, v3, v4}, Lgi2;->L(Landroid/os/Parcel;II)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    goto :goto_0

    .line 73
    :pswitch_5
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    goto :goto_0

    .line 78
    :pswitch_6
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    goto :goto_0

    .line 83
    :pswitch_7
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    goto :goto_0

    .line 88
    :pswitch_8
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 94
    .line 95
    .line 96
    new-instance v6, Lzb4;

    .line 97
    .line 98
    invoke-direct/range {v6 .. v15}, Lzb4;-><init>(ZZLjava/lang/String;ZFIZZZ)V

    .line 99
    .line 100
    .line 101
    return-object v6

    .line 102
    :pswitch_9
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const/4 v3, 0x0

    .line 107
    const/4 v4, 0x0

    .line 108
    move-object v6, v3

    .line 109
    move-object v9, v6

    .line 110
    move-object v11, v9

    .line 111
    move v7, v4

    .line 112
    move v8, v7

    .line 113
    move v10, v8

    .line 114
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-ge v4, v2, :cond_3

    .line 119
    .line 120
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-char v5, v4

    .line 125
    packed-switch v5, :pswitch_data_2

    .line 126
    .line 127
    .line 128
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :pswitch_a
    invoke-static {v1, v4}, Lgi2;->x(Landroid/os/Parcel;I)I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-nez v4, :cond_1

    .line 141
    .line 142
    move-object v11, v3

    .line 143
    goto :goto_1

    .line 144
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    add-int/2addr v5, v4

    .line 149
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_b
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    goto :goto_1

    .line 158
    :pswitch_c
    invoke-static {v1, v4}, Lgi2;->x(Landroid/os/Parcel;I)I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-nez v4, :cond_2

    .line 167
    .line 168
    move-object v9, v3

    .line 169
    goto :goto_1

    .line 170
    :cond_2
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    add-int/2addr v5, v4

    .line 175
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :pswitch_d
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    goto :goto_1

    .line 184
    :pswitch_e
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    goto :goto_1

    .line 189
    :pswitch_f
    sget-object v5, Ltq0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 190
    .line 191
    invoke-static {v1, v4, v5}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    move-object v6, v4

    .line 196
    check-cast v6, Ltq0;

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_3
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 200
    .line 201
    .line 202
    new-instance v5, Lsh;

    .line 203
    .line 204
    invoke-direct/range {v5 .. v11}, Lsh;-><init>(Ltq0;ZZ[II[I)V

    .line 205
    .line 206
    .line 207
    return-object v5

    .line 208
    :pswitch_10
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    const/4 v3, 0x0

    .line 213
    const/4 v4, 0x0

    .line 214
    move-object v5, v3

    .line 215
    move v6, v4

    .line 216
    move-object v4, v5

    .line 217
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-ge v7, v2, :cond_8

    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    int-to-char v8, v7

    .line 228
    const/4 v9, 0x1

    .line 229
    if-eq v8, v9, :cond_7

    .line 230
    .line 231
    const/4 v9, 0x2

    .line 232
    if-eq v8, v9, :cond_6

    .line 233
    .line 234
    const/4 v9, 0x3

    .line 235
    if-eq v8, v9, :cond_5

    .line 236
    .line 237
    const/4 v9, 0x4

    .line 238
    if-eq v8, v9, :cond_4

    .line 239
    .line 240
    invoke-static {v1, v7}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_4
    sget-object v5, Lsh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 245
    .line 246
    invoke-static {v1, v7, v5}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    check-cast v5, Lsh;

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_5
    invoke-static {v1, v7}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    goto :goto_2

    .line 258
    :cond_6
    sget-object v4, Lju;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 259
    .line 260
    invoke-static {v1, v7, v4}, Lgi2;->j(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    check-cast v4, [Lju;

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_7
    invoke-static {v1, v7}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    goto :goto_2

    .line 272
    :cond_8
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 273
    .line 274
    .line 275
    new-instance v1, Leb4;

    .line 276
    .line 277
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    iput-object v3, v1, Leb4;->f:Landroid/os/Bundle;

    .line 281
    .line 282
    iput-object v4, v1, Leb4;->g:[Lju;

    .line 283
    .line 284
    iput v6, v1, Leb4;->h:I

    .line 285
    .line 286
    iput-object v5, v1, Leb4;->i:Lsh;

    .line 287
    .line 288
    return-object v1

    .line 289
    :pswitch_11
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    const/4 v3, 0x0

    .line 294
    move v4, v3

    .line 295
    move v5, v4

    .line 296
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    if-ge v6, v2, :cond_c

    .line 301
    .line 302
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    int-to-char v7, v6

    .line 307
    const/4 v8, 0x2

    .line 308
    if-eq v7, v8, :cond_b

    .line 309
    .line 310
    const/4 v8, 0x3

    .line 311
    if-eq v7, v8, :cond_a

    .line 312
    .line 313
    const/4 v8, 0x4

    .line 314
    if-eq v7, v8, :cond_9

    .line 315
    .line 316
    invoke-static {v1, v6}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 317
    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_9
    invoke-static {v1, v6}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    goto :goto_3

    .line 325
    :cond_a
    invoke-static {v1, v6}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    goto :goto_3

    .line 330
    :cond_b
    invoke-static {v1, v6}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    goto :goto_3

    .line 335
    :cond_c
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 336
    .line 337
    .line 338
    new-instance v1, Lih3;

    .line 339
    .line 340
    invoke-direct {v1, v3, v4, v5}, Lih3;-><init>(ZZZ)V

    .line 341
    .line 342
    .line 343
    return-object v1

    .line 344
    :pswitch_12
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    const/4 v3, 0x0

    .line 349
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-ge v4, v2, :cond_e

    .line 354
    .line 355
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    int-to-char v5, v4

    .line 360
    const/16 v6, 0xf

    .line 361
    .line 362
    if-eq v5, v6, :cond_d

    .line 363
    .line 364
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_d
    invoke-static {v1, v4}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    goto :goto_4

    .line 373
    :cond_e
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 374
    .line 375
    .line 376
    new-instance v1, Lqf3;

    .line 377
    .line 378
    invoke-direct {v1, v3}, Lqf3;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    return-object v1

    .line 382
    :pswitch_13
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    const/4 v3, 0x0

    .line 387
    move v4, v3

    .line 388
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-ge v5, v2, :cond_11

    .line 393
    .line 394
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    int-to-char v6, v5

    .line 399
    const/4 v7, 0x1

    .line 400
    if-eq v6, v7, :cond_10

    .line 401
    .line 402
    const/4 v7, 0x2

    .line 403
    if-eq v6, v7, :cond_f

    .line 404
    .line 405
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 406
    .line 407
    .line 408
    goto :goto_5

    .line 409
    :cond_f
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    goto :goto_5

    .line 414
    :cond_10
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    goto :goto_5

    .line 419
    :cond_11
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 420
    .line 421
    .line 422
    new-instance v1, Lne3;

    .line 423
    .line 424
    invoke-direct {v1, v3, v4}, Lne3;-><init>(II)V

    .line 425
    .line 426
    .line 427
    return-object v1

    .line 428
    :pswitch_14
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    const/4 v3, 0x0

    .line 433
    const/4 v4, 0x0

    .line 434
    move-object v5, v4

    .line 435
    move-object v6, v5

    .line 436
    move v4, v3

    .line 437
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    if-ge v7, v2, :cond_16

    .line 442
    .line 443
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    int-to-char v8, v7

    .line 448
    const/4 v9, 0x1

    .line 449
    if-eq v8, v9, :cond_15

    .line 450
    .line 451
    const/4 v9, 0x2

    .line 452
    if-eq v8, v9, :cond_14

    .line 453
    .line 454
    const/4 v9, 0x3

    .line 455
    if-eq v8, v9, :cond_13

    .line 456
    .line 457
    const/4 v9, 0x4

    .line 458
    if-eq v8, v9, :cond_12

    .line 459
    .line 460
    invoke-static {v1, v7}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 461
    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_12
    invoke-static {v1, v7}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    goto :goto_6

    .line 469
    :cond_13
    sget-object v6, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 470
    .line 471
    invoke-static {v1, v7, v6}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    check-cast v6, Lpc4;

    .line 476
    .line 477
    goto :goto_6

    .line 478
    :cond_14
    invoke-static {v1, v7}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    goto :goto_6

    .line 483
    :cond_15
    invoke-static {v1, v7}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    goto :goto_6

    .line 488
    :cond_16
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 489
    .line 490
    .line 491
    new-instance v1, Lae3;

    .line 492
    .line 493
    invoke-direct {v1, v5, v3, v6, v4}, Lae3;-><init>(Ljava/lang/String;ILpc4;I)V

    .line 494
    .line 495
    .line 496
    return-object v1

    .line 497
    :pswitch_15
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    const/4 v3, 0x0

    .line 502
    const/4 v4, 0x0

    .line 503
    move-object v5, v4

    .line 504
    move v4, v3

    .line 505
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 506
    .line 507
    .line 508
    move-result v6

    .line 509
    if-ge v6, v2, :cond_1a

    .line 510
    .line 511
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 512
    .line 513
    .line 514
    move-result v6

    .line 515
    int-to-char v7, v6

    .line 516
    const/4 v8, 0x1

    .line 517
    if-eq v7, v8, :cond_19

    .line 518
    .line 519
    const/4 v8, 0x2

    .line 520
    if-eq v7, v8, :cond_18

    .line 521
    .line 522
    const/4 v8, 0x3

    .line 523
    if-eq v7, v8, :cond_17

    .line 524
    .line 525
    invoke-static {v1, v6}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 526
    .line 527
    .line 528
    goto :goto_7

    .line 529
    :cond_17
    invoke-static {v1, v6}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    goto :goto_7

    .line 534
    :cond_18
    invoke-static {v1, v6}, Lgi2;->e(Landroid/os/Parcel;I)[B

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    goto :goto_7

    .line 539
    :cond_19
    invoke-static {v1, v6}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    goto :goto_7

    .line 544
    :cond_1a
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 545
    .line 546
    .line 547
    new-instance v1, Lce3;

    .line 548
    .line 549
    invoke-direct {v1, v5, v3, v4}, Lce3;-><init>([BII)V

    .line 550
    .line 551
    .line 552
    return-object v1

    .line 553
    :pswitch_16
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    const/4 v3, 0x0

    .line 558
    const/4 v4, 0x0

    .line 559
    move-object v9, v3

    .line 560
    move-object v10, v9

    .line 561
    move v6, v4

    .line 562
    move v7, v6

    .line 563
    move v8, v7

    .line 564
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    if-ge v3, v2, :cond_20

    .line 569
    .line 570
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    int-to-char v4, v3

    .line 575
    const/4 v5, 0x1

    .line 576
    if-eq v4, v5, :cond_1f

    .line 577
    .line 578
    const/4 v5, 0x2

    .line 579
    if-eq v4, v5, :cond_1e

    .line 580
    .line 581
    const/4 v5, 0x3

    .line 582
    if-eq v4, v5, :cond_1d

    .line 583
    .line 584
    const/4 v5, 0x4

    .line 585
    if-eq v4, v5, :cond_1c

    .line 586
    .line 587
    const/4 v5, 0x5

    .line 588
    if-eq v4, v5, :cond_1b

    .line 589
    .line 590
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 591
    .line 592
    .line 593
    goto :goto_8

    .line 594
    :cond_1b
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 595
    .line 596
    .line 597
    move-result v8

    .line 598
    goto :goto_8

    .line 599
    :cond_1c
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v10

    .line 603
    goto :goto_8

    .line 604
    :cond_1d
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v9

    .line 608
    goto :goto_8

    .line 609
    :cond_1e
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 610
    .line 611
    .line 612
    move-result v7

    .line 613
    goto :goto_8

    .line 614
    :cond_1f
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 615
    .line 616
    .line 617
    move-result v6

    .line 618
    goto :goto_8

    .line 619
    :cond_20
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 620
    .line 621
    .line 622
    new-instance v5, Lbe3;

    .line 623
    .line 624
    invoke-direct/range {v5 .. v10}, Lbe3;-><init>(IIILjava/lang/String;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    return-object v5

    .line 628
    :pswitch_17
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 629
    .line 630
    .line 631
    move-result v2

    .line 632
    const/4 v3, 0x0

    .line 633
    const/4 v4, 0x0

    .line 634
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 635
    .line 636
    .line 637
    move-result v5

    .line 638
    if-ge v5, v2, :cond_23

    .line 639
    .line 640
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    int-to-char v6, v5

    .line 645
    const/4 v7, 0x1

    .line 646
    if-eq v6, v7, :cond_22

    .line 647
    .line 648
    const/4 v7, 0x2

    .line 649
    if-eq v6, v7, :cond_21

    .line 650
    .line 651
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 652
    .line 653
    .line 654
    goto :goto_9

    .line 655
    :cond_21
    invoke-static {v1, v5}, Lgi2;->e(Landroid/os/Parcel;I)[B

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    goto :goto_9

    .line 660
    :cond_22
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    goto :goto_9

    .line 665
    :cond_23
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 666
    .line 667
    .line 668
    new-instance v1, Lxd3;

    .line 669
    .line 670
    invoke-direct {v1, v4, v3}, Lxd3;-><init>(I[B)V

    .line 671
    .line 672
    .line 673
    return-object v1

    .line 674
    :pswitch_18
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 675
    .line 676
    .line 677
    move-result v2

    .line 678
    const/4 v3, 0x0

    .line 679
    const/4 v4, 0x0

    .line 680
    move v5, v4

    .line 681
    move-object v4, v3

    .line 682
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 683
    .line 684
    .line 685
    move-result v6

    .line 686
    if-ge v6, v2, :cond_27

    .line 687
    .line 688
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 689
    .line 690
    .line 691
    move-result v6

    .line 692
    int-to-char v7, v6

    .line 693
    const/4 v8, 0x1

    .line 694
    if-eq v7, v8, :cond_26

    .line 695
    .line 696
    const/4 v8, 0x2

    .line 697
    if-eq v7, v8, :cond_25

    .line 698
    .line 699
    const/4 v8, 0x3

    .line 700
    if-eq v7, v8, :cond_24

    .line 701
    .line 702
    invoke-static {v1, v6}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 703
    .line 704
    .line 705
    goto :goto_a

    .line 706
    :cond_24
    invoke-static {v1, v6}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v4

    .line 710
    goto :goto_a

    .line 711
    :cond_25
    invoke-static {v1, v6}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    goto :goto_a

    .line 716
    :cond_26
    invoke-static {v1, v6}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 717
    .line 718
    .line 719
    move-result v5

    .line 720
    goto :goto_a

    .line 721
    :cond_27
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 722
    .line 723
    .line 724
    new-instance v1, Lwd3;

    .line 725
    .line 726
    invoke-direct {v1, v5, v3, v4}, Lwd3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    return-object v1

    .line 730
    :pswitch_19
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 731
    .line 732
    .line 733
    move-result v2

    .line 734
    const/4 v3, 0x0

    .line 735
    const/4 v4, 0x0

    .line 736
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 737
    .line 738
    .line 739
    move-result v5

    .line 740
    if-ge v5, v2, :cond_2a

    .line 741
    .line 742
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 743
    .line 744
    .line 745
    move-result v5

    .line 746
    int-to-char v6, v5

    .line 747
    const/4 v7, 0x1

    .line 748
    if-eq v6, v7, :cond_29

    .line 749
    .line 750
    const/4 v7, 0x2

    .line 751
    if-eq v6, v7, :cond_28

    .line 752
    .line 753
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 754
    .line 755
    .line 756
    goto :goto_b

    .line 757
    :cond_28
    invoke-static {v1, v5}, Lgi2;->e(Landroid/os/Parcel;I)[B

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    goto :goto_b

    .line 762
    :cond_29
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    goto :goto_b

    .line 767
    :cond_2a
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 768
    .line 769
    .line 770
    new-instance v1, Lud3;

    .line 771
    .line 772
    invoke-direct {v1, v4, v3}, Lud3;-><init>(I[B)V

    .line 773
    .line 774
    .line 775
    return-object v1

    .line 776
    :pswitch_1a
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    const/4 v3, 0x0

    .line 781
    const/4 v4, 0x0

    .line 782
    move v6, v3

    .line 783
    move v7, v6

    .line 784
    move v8, v7

    .line 785
    move v9, v8

    .line 786
    move v11, v9

    .line 787
    move v12, v11

    .line 788
    move-object v10, v4

    .line 789
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 790
    .line 791
    .line 792
    move-result v3

    .line 793
    if-ge v3, v2, :cond_2b

    .line 794
    .line 795
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    int-to-char v4, v3

    .line 800
    packed-switch v4, :pswitch_data_3

    .line 801
    .line 802
    .line 803
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 804
    .line 805
    .line 806
    goto :goto_c

    .line 807
    :pswitch_1b
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 808
    .line 809
    .line 810
    move-result v12

    .line 811
    goto :goto_c

    .line 812
    :pswitch_1c
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 813
    .line 814
    .line 815
    move-result v11

    .line 816
    goto :goto_c

    .line 817
    :pswitch_1d
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v10

    .line 821
    goto :goto_c

    .line 822
    :pswitch_1e
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 823
    .line 824
    .line 825
    move-result v9

    .line 826
    goto :goto_c

    .line 827
    :pswitch_1f
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 828
    .line 829
    .line 830
    move-result v8

    .line 831
    goto :goto_c

    .line 832
    :pswitch_20
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 833
    .line 834
    .line 835
    move-result v7

    .line 836
    goto :goto_c

    .line 837
    :pswitch_21
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 838
    .line 839
    .line 840
    move-result v6

    .line 841
    goto :goto_c

    .line 842
    :cond_2b
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 843
    .line 844
    .line 845
    new-instance v5, Ld93;

    .line 846
    .line 847
    invoke-direct/range {v5 .. v12}, Ld93;-><init>(IIIILjava/lang/String;II)V

    .line 848
    .line 849
    .line 850
    return-object v5

    .line 851
    :pswitch_22
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    const/4 v3, 0x0

    .line 856
    const/4 v4, 0x0

    .line 857
    move v5, v4

    .line 858
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 859
    .line 860
    .line 861
    move-result v6

    .line 862
    if-ge v6, v2, :cond_2f

    .line 863
    .line 864
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 865
    .line 866
    .line 867
    move-result v6

    .line 868
    int-to-char v7, v6

    .line 869
    const/4 v8, 0x1

    .line 870
    if-eq v7, v8, :cond_2e

    .line 871
    .line 872
    const/4 v8, 0x2

    .line 873
    if-eq v7, v8, :cond_2d

    .line 874
    .line 875
    const/4 v8, 0x3

    .line 876
    if-eq v7, v8, :cond_2c

    .line 877
    .line 878
    invoke-static {v1, v6}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 879
    .line 880
    .line 881
    goto :goto_d

    .line 882
    :cond_2c
    invoke-static {v1, v6}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v3

    .line 886
    goto :goto_d

    .line 887
    :cond_2d
    invoke-static {v1, v6}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 888
    .line 889
    .line 890
    move-result v5

    .line 891
    goto :goto_d

    .line 892
    :cond_2e
    invoke-static {v1, v6}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 893
    .line 894
    .line 895
    move-result v4

    .line 896
    goto :goto_d

    .line 897
    :cond_2f
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 898
    .line 899
    .line 900
    new-instance v1, Lw63;

    .line 901
    .line 902
    invoke-direct {v1, v3, v4, v5}, Lw63;-><init>(Ljava/lang/String;II)V

    .line 903
    .line 904
    .line 905
    return-object v1

    .line 906
    :pswitch_23
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 907
    .line 908
    .line 909
    move-result v2

    .line 910
    const/4 v3, 0x0

    .line 911
    const/4 v4, 0x0

    .line 912
    move-object v7, v3

    .line 913
    move-object v8, v7

    .line 914
    move-object v9, v8

    .line 915
    move-object v10, v9

    .line 916
    move v6, v4

    .line 917
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    if-ge v3, v2, :cond_35

    .line 922
    .line 923
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    int-to-char v4, v3

    .line 928
    const/4 v5, 0x1

    .line 929
    if-eq v4, v5, :cond_34

    .line 930
    .line 931
    const/4 v5, 0x2

    .line 932
    if-eq v4, v5, :cond_33

    .line 933
    .line 934
    const/4 v5, 0x3

    .line 935
    if-eq v4, v5, :cond_32

    .line 936
    .line 937
    const/4 v5, 0x4

    .line 938
    if-eq v4, v5, :cond_31

    .line 939
    .line 940
    const/4 v5, 0x5

    .line 941
    if-eq v4, v5, :cond_30

    .line 942
    .line 943
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 944
    .line 945
    .line 946
    goto :goto_e

    .line 947
    :cond_30
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 948
    .line 949
    .line 950
    move-result-object v10

    .line 951
    goto :goto_e

    .line 952
    :cond_31
    sget-object v4, Lnx2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 953
    .line 954
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 955
    .line 956
    .line 957
    move-result-object v3

    .line 958
    move-object v9, v3

    .line 959
    check-cast v9, Lnx2;

    .line 960
    .line 961
    goto :goto_e

    .line 962
    :cond_32
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v8

    .line 966
    goto :goto_e

    .line 967
    :cond_33
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v7

    .line 971
    goto :goto_e

    .line 972
    :cond_34
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 973
    .line 974
    .line 975
    move-result v6

    .line 976
    goto :goto_e

    .line 977
    :cond_35
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 978
    .line 979
    .line 980
    new-instance v5, Lnx2;

    .line 981
    .line 982
    invoke-direct/range {v5 .. v10}, Lnx2;-><init>(ILjava/lang/String;Ljava/lang/String;Lnx2;Landroid/os/IBinder;)V

    .line 983
    .line 984
    .line 985
    return-object v5

    .line 986
    :pswitch_24
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 987
    .line 988
    .line 989
    move-result v2

    .line 990
    const/4 v3, 0x0

    .line 991
    const/4 v4, 0x0

    .line 992
    move v5, v4

    .line 993
    move-object v4, v3

    .line 994
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 995
    .line 996
    .line 997
    move-result v6

    .line 998
    if-ge v6, v2, :cond_39

    .line 999
    .line 1000
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1001
    .line 1002
    .line 1003
    move-result v6

    .line 1004
    int-to-char v7, v6

    .line 1005
    const/4 v8, 0x1

    .line 1006
    if-eq v7, v8, :cond_38

    .line 1007
    .line 1008
    const/4 v8, 0x2

    .line 1009
    if-eq v7, v8, :cond_37

    .line 1010
    .line 1011
    const/4 v8, 0x3

    .line 1012
    if-eq v7, v8, :cond_36

    .line 1013
    .line 1014
    invoke-static {v1, v6}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1015
    .line 1016
    .line 1017
    goto :goto_f

    .line 1018
    :cond_36
    invoke-static {v1, v6}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v4

    .line 1022
    goto :goto_f

    .line 1023
    :cond_37
    invoke-static {v1, v6}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v3

    .line 1027
    goto :goto_f

    .line 1028
    :cond_38
    invoke-static {v1, v6}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v5

    .line 1032
    goto :goto_f

    .line 1033
    :cond_39
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1034
    .line 1035
    .line 1036
    new-instance v1, Lvm0;

    .line 1037
    .line 1038
    invoke-direct {v1, v5, v3, v4}, Lvm0;-><init>(ZLandroid/os/IBinder;Landroid/os/IBinder;)V

    .line 1039
    .line 1040
    .line 1041
    return-object v1

    .line 1042
    :pswitch_25
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    const/4 v3, 0x0

    .line 1047
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1048
    .line 1049
    .line 1050
    move-result v4

    .line 1051
    if-ge v4, v2, :cond_3b

    .line 1052
    .line 1053
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1054
    .line 1055
    .line 1056
    move-result v4

    .line 1057
    int-to-char v5, v4

    .line 1058
    const/4 v6, 0x2

    .line 1059
    if-eq v5, v6, :cond_3a

    .line 1060
    .line 1061
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1062
    .line 1063
    .line 1064
    goto :goto_10

    .line 1065
    :cond_3a
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1066
    .line 1067
    .line 1068
    move-result v3

    .line 1069
    goto :goto_10

    .line 1070
    :cond_3b
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1071
    .line 1072
    .line 1073
    new-instance v1, Lvz2;

    .line 1074
    .line 1075
    invoke-direct {v1, v3}, Lvz2;-><init>(I)V

    .line 1076
    .line 1077
    .line 1078
    return-object v1

    .line 1079
    :pswitch_26
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1080
    .line 1081
    .line 1082
    move-result v2

    .line 1083
    const/4 v3, 0x0

    .line 1084
    const/4 v4, 0x0

    .line 1085
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1086
    .line 1087
    .line 1088
    move-result v5

    .line 1089
    if-ge v5, v2, :cond_3e

    .line 1090
    .line 1091
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1092
    .line 1093
    .line 1094
    move-result v5

    .line 1095
    int-to-char v6, v5

    .line 1096
    const/4 v7, 0x1

    .line 1097
    if-eq v6, v7, :cond_3d

    .line 1098
    .line 1099
    const/4 v7, 0x2

    .line 1100
    if-eq v6, v7, :cond_3c

    .line 1101
    .line 1102
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1103
    .line 1104
    .line 1105
    goto :goto_11

    .line 1106
    :cond_3c
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1107
    .line 1108
    .line 1109
    move-result v4

    .line 1110
    goto :goto_11

    .line 1111
    :cond_3d
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v3

    .line 1115
    goto :goto_11

    .line 1116
    :cond_3e
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1117
    .line 1118
    .line 1119
    new-instance v1, Ljc2;

    .line 1120
    .line 1121
    invoke-direct {v1, v3, v4}, Ljc2;-><init>(Ljava/lang/String;I)V

    .line 1122
    .line 1123
    .line 1124
    return-object v1

    .line 1125
    :pswitch_27
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1126
    .line 1127
    .line 1128
    move-result v2

    .line 1129
    const/4 v3, 0x0

    .line 1130
    move-object v4, v3

    .line 1131
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1132
    .line 1133
    .line 1134
    move-result v5

    .line 1135
    if-ge v5, v2, :cond_41

    .line 1136
    .line 1137
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1138
    .line 1139
    .line 1140
    move-result v5

    .line 1141
    int-to-char v6, v5

    .line 1142
    const/4 v7, 0x1

    .line 1143
    if-eq v6, v7, :cond_40

    .line 1144
    .line 1145
    const/4 v7, 0x2

    .line 1146
    if-eq v6, v7, :cond_3f

    .line 1147
    .line 1148
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1149
    .line 1150
    .line 1151
    goto :goto_12

    .line 1152
    :cond_3f
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v4

    .line 1156
    goto :goto_12

    .line 1157
    :cond_40
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    goto :goto_12

    .line 1162
    :cond_41
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1163
    .line 1164
    .line 1165
    new-instance v1, Lec2;

    .line 1166
    .line 1167
    invoke-direct {v1, v3, v4}, Lec2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    return-object v1

    .line 1171
    :pswitch_28
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1172
    .line 1173
    .line 1174
    move-result v2

    .line 1175
    const/4 v3, 0x0

    .line 1176
    const/4 v4, 0x0

    .line 1177
    move-object v6, v3

    .line 1178
    move-object v7, v6

    .line 1179
    move-object v8, v7

    .line 1180
    move-object v9, v8

    .line 1181
    move-object v11, v9

    .line 1182
    move v10, v4

    .line 1183
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1184
    .line 1185
    .line 1186
    move-result v3

    .line 1187
    if-ge v3, v2, :cond_42

    .line 1188
    .line 1189
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1190
    .line 1191
    .line 1192
    move-result v3

    .line 1193
    int-to-char v4, v3

    .line 1194
    packed-switch v4, :pswitch_data_4

    .line 1195
    .line 1196
    .line 1197
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1198
    .line 1199
    .line 1200
    goto :goto_13

    .line 1201
    :pswitch_29
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v11

    .line 1205
    goto :goto_13

    .line 1206
    :pswitch_2a
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1207
    .line 1208
    .line 1209
    move-result v10

    .line 1210
    goto :goto_13

    .line 1211
    :pswitch_2b
    sget-object v4, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1212
    .line 1213
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v3

    .line 1217
    move-object v9, v3

    .line 1218
    check-cast v9, Lpc4;

    .line 1219
    .line 1220
    goto :goto_13

    .line 1221
    :pswitch_2c
    sget-object v4, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1222
    .line 1223
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v3

    .line 1227
    move-object v8, v3

    .line 1228
    check-cast v8, Lxe4;

    .line 1229
    .line 1230
    goto :goto_13

    .line 1231
    :pswitch_2d
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v7

    .line 1235
    goto :goto_13

    .line 1236
    :pswitch_2e
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v6

    .line 1240
    goto :goto_13

    .line 1241
    :cond_42
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1242
    .line 1243
    .line 1244
    new-instance v5, Lad2;

    .line 1245
    .line 1246
    invoke-direct/range {v5 .. v11}, Lad2;-><init>(Ljava/lang/String;Ljava/lang/String;Lxe4;Lpc4;ILjava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    return-object v5

    .line 1250
    :pswitch_2f
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1251
    .line 1252
    .line 1253
    move-result v2

    .line 1254
    const-wide/16 v3, -0x1

    .line 1255
    .line 1256
    const/4 v5, 0x0

    .line 1257
    const/4 v6, 0x0

    .line 1258
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1259
    .line 1260
    .line 1261
    move-result v7

    .line 1262
    if-ge v7, v2, :cond_46

    .line 1263
    .line 1264
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1265
    .line 1266
    .line 1267
    move-result v7

    .line 1268
    int-to-char v8, v7

    .line 1269
    const/4 v9, 0x1

    .line 1270
    if-eq v8, v9, :cond_45

    .line 1271
    .line 1272
    const/4 v9, 0x2

    .line 1273
    if-eq v8, v9, :cond_44

    .line 1274
    .line 1275
    const/4 v9, 0x3

    .line 1276
    if-eq v8, v9, :cond_43

    .line 1277
    .line 1278
    invoke-static {v1, v7}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1279
    .line 1280
    .line 1281
    goto :goto_14

    .line 1282
    :cond_43
    invoke-static {v1, v7}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 1283
    .line 1284
    .line 1285
    move-result-wide v3

    .line 1286
    goto :goto_14

    .line 1287
    :cond_44
    invoke-static {v1, v7}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1288
    .line 1289
    .line 1290
    move-result v5

    .line 1291
    goto :goto_14

    .line 1292
    :cond_45
    invoke-static {v1, v7}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v6

    .line 1296
    goto :goto_14

    .line 1297
    :cond_46
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1298
    .line 1299
    .line 1300
    new-instance v1, Lju;

    .line 1301
    .line 1302
    invoke-direct {v1, v5, v3, v4, v6}, Lju;-><init>(IJLjava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    return-object v1

    .line 1306
    :pswitch_30
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1307
    .line 1308
    .line 1309
    move-result v2

    .line 1310
    const/4 v3, 0x0

    .line 1311
    const/4 v4, 0x0

    .line 1312
    move-object v6, v3

    .line 1313
    move-object v7, v6

    .line 1314
    move-object v10, v7

    .line 1315
    move-object v13, v10

    .line 1316
    move v8, v4

    .line 1317
    move v9, v8

    .line 1318
    move v11, v9

    .line 1319
    move v12, v11

    .line 1320
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1321
    .line 1322
    .line 1323
    move-result v3

    .line 1324
    if-ge v3, v2, :cond_47

    .line 1325
    .line 1326
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1327
    .line 1328
    .line 1329
    move-result v3

    .line 1330
    int-to-char v4, v3

    .line 1331
    packed-switch v4, :pswitch_data_5

    .line 1332
    .line 1333
    .line 1334
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1335
    .line 1336
    .line 1337
    goto :goto_15

    .line 1338
    :pswitch_31
    invoke-static {v1, v3}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v13

    .line 1342
    goto :goto_15

    .line 1343
    :pswitch_32
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v12

    .line 1347
    goto :goto_15

    .line 1348
    :pswitch_33
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v11

    .line 1352
    goto :goto_15

    .line 1353
    :pswitch_34
    invoke-static {v1, v3}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v10

    .line 1357
    goto :goto_15

    .line 1358
    :pswitch_35
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v9

    .line 1362
    goto :goto_15

    .line 1363
    :pswitch_36
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v8

    .line 1367
    goto :goto_15

    .line 1368
    :pswitch_37
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v7

    .line 1372
    goto :goto_15

    .line 1373
    :pswitch_38
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v6

    .line 1377
    goto :goto_15

    .line 1378
    :cond_47
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v5, Lrb2;

    .line 1382
    .line 1383
    invoke-direct/range {v5 .. v13}, Lrb2;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ZZLjava/util/List;)V

    .line 1384
    .line 1385
    .line 1386
    return-object v5

    .line 1387
    :pswitch_39
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1388
    .line 1389
    .line 1390
    move-result v2

    .line 1391
    const/4 v3, 0x0

    .line 1392
    move-object v4, v3

    .line 1393
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1394
    .line 1395
    .line 1396
    move-result v5

    .line 1397
    if-ge v5, v2, :cond_4a

    .line 1398
    .line 1399
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1400
    .line 1401
    .line 1402
    move-result v5

    .line 1403
    int-to-char v6, v5

    .line 1404
    const/4 v7, 0x1

    .line 1405
    if-eq v6, v7, :cond_49

    .line 1406
    .line 1407
    const/4 v7, 0x2

    .line 1408
    if-eq v6, v7, :cond_48

    .line 1409
    .line 1410
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1411
    .line 1412
    .line 1413
    goto :goto_16

    .line 1414
    :cond_48
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v4

    .line 1418
    goto :goto_16

    .line 1419
    :cond_49
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v3

    .line 1423
    goto :goto_16

    .line 1424
    :cond_4a
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1425
    .line 1426
    .line 1427
    new-instance v1, Lmb2;

    .line 1428
    .line 1429
    invoke-direct {v1, v3, v4}, Lmb2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1430
    .line 1431
    .line 1432
    return-object v1

    .line 1433
    :pswitch_3a
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1434
    .line 1435
    .line 1436
    move-result v2

    .line 1437
    const/4 v3, 0x0

    .line 1438
    const/4 v4, 0x0

    .line 1439
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1440
    .line 1441
    .line 1442
    move-result v5

    .line 1443
    if-ge v5, v2, :cond_4d

    .line 1444
    .line 1445
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1446
    .line 1447
    .line 1448
    move-result v5

    .line 1449
    int-to-char v6, v5

    .line 1450
    const/4 v7, 0x2

    .line 1451
    if-eq v6, v7, :cond_4c

    .line 1452
    .line 1453
    const/4 v7, 0x3

    .line 1454
    if-eq v6, v7, :cond_4b

    .line 1455
    .line 1456
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1457
    .line 1458
    .line 1459
    goto :goto_17

    .line 1460
    :cond_4b
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1461
    .line 1462
    .line 1463
    move-result v3

    .line 1464
    goto :goto_17

    .line 1465
    :cond_4c
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v4

    .line 1469
    goto :goto_17

    .line 1470
    :cond_4d
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1471
    .line 1472
    .line 1473
    new-instance v1, Lta2;

    .line 1474
    .line 1475
    invoke-direct {v1, v4, v3}, Lta2;-><init>(Ljava/lang/String;I)V

    .line 1476
    .line 1477
    .line 1478
    return-object v1

    .line 1479
    :pswitch_3b
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1480
    .line 1481
    .line 1482
    move-result v2

    .line 1483
    const/4 v3, 0x0

    .line 1484
    move-object v4, v3

    .line 1485
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1486
    .line 1487
    .line 1488
    move-result v5

    .line 1489
    if-ge v5, v2, :cond_50

    .line 1490
    .line 1491
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1492
    .line 1493
    .line 1494
    move-result v5

    .line 1495
    int-to-char v6, v5

    .line 1496
    const/4 v7, 0x2

    .line 1497
    if-eq v6, v7, :cond_4f

    .line 1498
    .line 1499
    const/4 v7, 0x3

    .line 1500
    if-eq v6, v7, :cond_4e

    .line 1501
    .line 1502
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1503
    .line 1504
    .line 1505
    goto :goto_18

    .line 1506
    :cond_4e
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v4

    .line 1510
    goto :goto_18

    .line 1511
    :cond_4f
    sget-object v3, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1512
    .line 1513
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v3

    .line 1517
    check-cast v3, Lpc4;

    .line 1518
    .line 1519
    goto :goto_18

    .line 1520
    :cond_50
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1521
    .line 1522
    .line 1523
    new-instance v1, Lpa2;

    .line 1524
    .line 1525
    invoke-direct {v1, v4, v3}, Lpa2;-><init>(Ljava/lang/String;Lpc4;)V

    .line 1526
    .line 1527
    .line 1528
    return-object v1

    .line 1529
    :pswitch_3c
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1530
    .line 1531
    .line 1532
    move-result v2

    .line 1533
    const/4 v3, 0x0

    .line 1534
    const/4 v4, 0x0

    .line 1535
    move/from16 v16, v3

    .line 1536
    .line 1537
    move/from16 v17, v16

    .line 1538
    .line 1539
    move/from16 v20, v17

    .line 1540
    .line 1541
    move-object v6, v4

    .line 1542
    move-object v7, v6

    .line 1543
    move-object v8, v7

    .line 1544
    move-object v9, v8

    .line 1545
    move-object v10, v9

    .line 1546
    move-object v11, v10

    .line 1547
    move-object v12, v11

    .line 1548
    move-object v13, v12

    .line 1549
    move-object v14, v13

    .line 1550
    move-object v15, v14

    .line 1551
    move-object/from16 v18, v15

    .line 1552
    .line 1553
    move-object/from16 v19, v18

    .line 1554
    .line 1555
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1556
    .line 1557
    .line 1558
    move-result v3

    .line 1559
    if-ge v3, v2, :cond_51

    .line 1560
    .line 1561
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1562
    .line 1563
    .line 1564
    move-result v3

    .line 1565
    int-to-char v4, v3

    .line 1566
    packed-switch v4, :pswitch_data_6

    .line 1567
    .line 1568
    .line 1569
    :pswitch_3d
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1570
    .line 1571
    .line 1572
    goto :goto_19

    .line 1573
    :pswitch_3e
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1574
    .line 1575
    .line 1576
    move-result v20

    .line 1577
    goto :goto_19

    .line 1578
    :pswitch_3f
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v19

    .line 1582
    goto :goto_19

    .line 1583
    :pswitch_40
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v18

    .line 1587
    goto :goto_19

    .line 1588
    :pswitch_41
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v17

    .line 1592
    goto :goto_19

    .line 1593
    :pswitch_42
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v16

    .line 1597
    goto :goto_19

    .line 1598
    :pswitch_43
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v15

    .line 1602
    goto :goto_19

    .line 1603
    :pswitch_44
    sget-object v4, Ld93;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1604
    .line 1605
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v3

    .line 1609
    move-object v14, v3

    .line 1610
    check-cast v14, Ld93;

    .line 1611
    .line 1612
    goto :goto_19

    .line 1613
    :pswitch_45
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v13

    .line 1617
    goto :goto_19

    .line 1618
    :pswitch_46
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v12

    .line 1622
    goto :goto_19

    .line 1623
    :pswitch_47
    sget-object v4, Landroid/content/pm/PackageInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1624
    .line 1625
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v3

    .line 1629
    move-object v11, v3

    .line 1630
    check-cast v11, Landroid/content/pm/PackageInfo;

    .line 1631
    .line 1632
    goto :goto_19

    .line 1633
    :pswitch_48
    invoke-static {v1, v3}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v10

    .line 1637
    goto :goto_19

    .line 1638
    :pswitch_49
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v9

    .line 1642
    goto :goto_19

    .line 1643
    :pswitch_4a
    sget-object v4, Landroid/content/pm/ApplicationInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1644
    .line 1645
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v3

    .line 1649
    move-object v8, v3

    .line 1650
    check-cast v8, Landroid/content/pm/ApplicationInfo;

    .line 1651
    .line 1652
    goto :goto_19

    .line 1653
    :pswitch_4b
    sget-object v4, Le51;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1654
    .line 1655
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v3

    .line 1659
    move-object v7, v3

    .line 1660
    check-cast v7, Le51;

    .line 1661
    .line 1662
    goto :goto_19

    .line 1663
    :pswitch_4c
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v6

    .line 1667
    goto :goto_19

    .line 1668
    :cond_51
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1669
    .line 1670
    .line 1671
    new-instance v5, Lfa2;

    .line 1672
    .line 1673
    invoke-direct/range {v5 .. v20}, Lfa2;-><init>(Landroid/os/Bundle;Le51;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ld93;Ljava/lang/String;ZZLandroid/os/Bundle;Landroid/os/Bundle;I)V

    .line 1674
    .line 1675
    .line 1676
    return-object v5

    .line 1677
    :pswitch_4d
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1678
    .line 1679
    .line 1680
    move-result v2

    .line 1681
    const/4 v3, 0x0

    .line 1682
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1683
    .line 1684
    .line 1685
    move-result v4

    .line 1686
    if-ge v4, v2, :cond_53

    .line 1687
    .line 1688
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1689
    .line 1690
    .line 1691
    move-result v4

    .line 1692
    int-to-char v5, v4

    .line 1693
    const/4 v6, 0x1

    .line 1694
    if-eq v5, v6, :cond_52

    .line 1695
    .line 1696
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1697
    .line 1698
    .line 1699
    goto :goto_1a

    .line 1700
    :cond_52
    invoke-static {v1, v4}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v3

    .line 1704
    goto :goto_1a

    .line 1705
    :cond_53
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1706
    .line 1707
    .line 1708
    new-instance v1, Lw92;

    .line 1709
    .line 1710
    invoke-direct {v1, v3}, Lw92;-><init>(Ljava/lang/String;)V

    .line 1711
    .line 1712
    .line 1713
    return-object v1

    .line 1714
    :pswitch_4e
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1715
    .line 1716
    .line 1717
    move-result v2

    .line 1718
    const/4 v3, 0x0

    .line 1719
    const/4 v4, 0x0

    .line 1720
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1721
    .line 1722
    .line 1723
    move-result v5

    .line 1724
    if-ge v5, v2, :cond_56

    .line 1725
    .line 1726
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1727
    .line 1728
    .line 1729
    move-result v5

    .line 1730
    int-to-char v6, v5

    .line 1731
    const/4 v7, 0x2

    .line 1732
    if-eq v6, v7, :cond_55

    .line 1733
    .line 1734
    const/4 v7, 0x3

    .line 1735
    if-eq v6, v7, :cond_54

    .line 1736
    .line 1737
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1738
    .line 1739
    .line 1740
    goto :goto_1b

    .line 1741
    :cond_54
    invoke-static {v1, v5}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v3

    .line 1745
    goto :goto_1b

    .line 1746
    :cond_55
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1747
    .line 1748
    .line 1749
    move-result v4

    .line 1750
    goto :goto_1b

    .line 1751
    :cond_56
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1752
    .line 1753
    .line 1754
    new-instance v1, Lv92;

    .line 1755
    .line 1756
    invoke-direct {v1, v4, v3}, Lv92;-><init>(ZLjava/util/List;)V

    .line 1757
    .line 1758
    .line 1759
    return-object v1

    .line 1760
    :pswitch_4f
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1761
    .line 1762
    .line 1763
    move-result v2

    .line 1764
    const/4 v5, 0x0

    .line 1765
    const-wide/16 v6, 0x0

    .line 1766
    .line 1767
    move/from16 v27, v5

    .line 1768
    .line 1769
    move/from16 v39, v27

    .line 1770
    .line 1771
    move-wide/from16 v29, v6

    .line 1772
    .line 1773
    move-wide/from16 v36, v29

    .line 1774
    .line 1775
    const/4 v9, 0x0

    .line 1776
    const/4 v10, 0x0

    .line 1777
    const/4 v11, 0x0

    .line 1778
    const/4 v12, 0x0

    .line 1779
    const/4 v13, 0x0

    .line 1780
    const/4 v14, 0x0

    .line 1781
    const/4 v15, 0x0

    .line 1782
    const/16 v16, 0x0

    .line 1783
    .line 1784
    const/16 v17, 0x0

    .line 1785
    .line 1786
    const/16 v18, 0x0

    .line 1787
    .line 1788
    const/16 v19, 0x0

    .line 1789
    .line 1790
    const/16 v20, 0x0

    .line 1791
    .line 1792
    const/16 v21, 0x0

    .line 1793
    .line 1794
    const/16 v22, 0x0

    .line 1795
    .line 1796
    const/16 v23, 0x0

    .line 1797
    .line 1798
    const/16 v24, 0x0

    .line 1799
    .line 1800
    const/16 v25, 0x0

    .line 1801
    .line 1802
    const/16 v26, 0x0

    .line 1803
    .line 1804
    const/16 v28, 0x0

    .line 1805
    .line 1806
    const/16 v31, 0x0

    .line 1807
    .line 1808
    const/16 v32, 0x0

    .line 1809
    .line 1810
    const/16 v33, 0x0

    .line 1811
    .line 1812
    const/16 v34, 0x0

    .line 1813
    .line 1814
    const/16 v35, 0x0

    .line 1815
    .line 1816
    const/16 v38, 0x0

    .line 1817
    .line 1818
    const/16 v40, 0x0

    .line 1819
    .line 1820
    const/16 v41, 0x0

    .line 1821
    .line 1822
    const/16 v42, 0x0

    .line 1823
    .line 1824
    const/16 v43, 0x0

    .line 1825
    .line 1826
    const/16 v44, 0x0

    .line 1827
    .line 1828
    const/16 v45, 0x0

    .line 1829
    .line 1830
    const/16 v46, 0x0

    .line 1831
    .line 1832
    const/16 v47, 0x0

    .line 1833
    .line 1834
    const/16 v48, 0x0

    .line 1835
    .line 1836
    const/16 v49, 0x0

    .line 1837
    .line 1838
    const/16 v50, 0x0

    .line 1839
    .line 1840
    const/16 v51, 0x0

    .line 1841
    .line 1842
    const/16 v52, 0x0

    .line 1843
    .line 1844
    const/16 v53, 0x0

    .line 1845
    .line 1846
    const/16 v54, 0x0

    .line 1847
    .line 1848
    const/16 v55, 0x0

    .line 1849
    .line 1850
    const/16 v56, 0x0

    .line 1851
    .line 1852
    const/16 v57, 0x0

    .line 1853
    .line 1854
    const/16 v58, 0x0

    .line 1855
    .line 1856
    const/16 v59, 0x0

    .line 1857
    .line 1858
    const/16 v60, 0x0

    .line 1859
    .line 1860
    const/16 v61, 0x0

    .line 1861
    .line 1862
    const/16 v62, 0x0

    .line 1863
    .line 1864
    const/16 v63, 0x0

    .line 1865
    .line 1866
    const/16 v64, 0x0

    .line 1867
    .line 1868
    const/16 v65, 0x0

    .line 1869
    .line 1870
    const/16 v66, 0x0

    .line 1871
    .line 1872
    const/16 v67, 0x0

    .line 1873
    .line 1874
    const/16 v68, 0x0

    .line 1875
    .line 1876
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1877
    .line 1878
    .line 1879
    move-result v5

    .line 1880
    if-ge v5, v2, :cond_59

    .line 1881
    .line 1882
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1883
    .line 1884
    .line 1885
    move-result v5

    .line 1886
    int-to-char v6, v5

    .line 1887
    const/4 v7, 0x4

    .line 1888
    packed-switch v6, :pswitch_data_7

    .line 1889
    .line 1890
    .line 1891
    :pswitch_50
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1892
    .line 1893
    .line 1894
    goto :goto_1c

    .line 1895
    :pswitch_51
    invoke-static {v1, v5}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v68

    .line 1899
    goto :goto_1c

    .line 1900
    :pswitch_52
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v67

    .line 1904
    goto :goto_1c

    .line 1905
    :pswitch_53
    sget-object v6, Lf52;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1906
    .line 1907
    invoke-static {v1, v5, v6}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v5

    .line 1911
    move-object/from16 v66, v5

    .line 1912
    .line 1913
    check-cast v66, Lf52;

    .line 1914
    .line 1915
    goto :goto_1c

    .line 1916
    :pswitch_54
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v65

    .line 1920
    goto :goto_1c

    .line 1921
    :pswitch_55
    invoke-static {v1, v5}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v64

    .line 1925
    goto :goto_1c

    .line 1926
    :pswitch_56
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1927
    .line 1928
    .line 1929
    move-result v63

    .line 1930
    goto :goto_1c

    .line 1931
    :pswitch_57
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1932
    .line 1933
    .line 1934
    move-result v62

    .line 1935
    goto :goto_1c

    .line 1936
    :pswitch_58
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1937
    .line 1938
    .line 1939
    move-result v61

    .line 1940
    goto :goto_1c

    .line 1941
    :pswitch_59
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1942
    .line 1943
    .line 1944
    move-result v60

    .line 1945
    goto :goto_1c

    .line 1946
    :pswitch_5a
    invoke-static {v1, v5}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v59

    .line 1950
    goto :goto_1c

    .line 1951
    :pswitch_5b
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v58

    .line 1955
    goto :goto_1c

    .line 1956
    :pswitch_5c
    invoke-static {v1, v5}, Lgi2;->x(Landroid/os/Parcel;I)I

    .line 1957
    .line 1958
    .line 1959
    move-result v5

    .line 1960
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1961
    .line 1962
    .line 1963
    move-result v6

    .line 1964
    if-nez v5, :cond_57

    .line 1965
    .line 1966
    const/16 v57, 0x0

    .line 1967
    .line 1968
    goto :goto_1c

    .line 1969
    :cond_57
    new-instance v7, Ljava/util/ArrayList;

    .line 1970
    .line 1971
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1972
    .line 1973
    .line 1974
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1975
    .line 1976
    .line 1977
    move-result v8

    .line 1978
    const/4 v3, 0x0

    .line 1979
    :goto_1d
    if-ge v3, v8, :cond_58

    .line 1980
    .line 1981
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1982
    .line 1983
    .line 1984
    move-result v57

    .line 1985
    invoke-static/range {v57 .. v57}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v4

    .line 1989
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1990
    .line 1991
    .line 1992
    add-int/lit8 v3, v3, 0x1

    .line 1993
    .line 1994
    goto :goto_1d

    .line 1995
    :cond_58
    add-int/2addr v6, v5

    .line 1996
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1997
    .line 1998
    .line 1999
    move-object/from16 v57, v7

    .line 2000
    .line 2001
    goto :goto_1c

    .line 2002
    :pswitch_5d
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 2003
    .line 2004
    .line 2005
    move-result v56

    .line 2006
    goto/16 :goto_1c

    .line 2007
    .line 2008
    :pswitch_5e
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v55

    .line 2012
    goto/16 :goto_1c

    .line 2013
    .line 2014
    :pswitch_5f
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v54

    .line 2018
    goto/16 :goto_1c

    .line 2019
    .line 2020
    :pswitch_60
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v53

    .line 2024
    goto/16 :goto_1c

    .line 2025
    .line 2026
    :pswitch_61
    invoke-static {v1, v5}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v52

    .line 2030
    goto/16 :goto_1c

    .line 2031
    .line 2032
    :pswitch_62
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 2033
    .line 2034
    .line 2035
    move-result v51

    .line 2036
    goto/16 :goto_1c

    .line 2037
    .line 2038
    :pswitch_63
    sget-object v3, Lvz2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2039
    .line 2040
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v3

    .line 2044
    move-object/from16 v50, v3

    .line 2045
    .line 2046
    check-cast v50, Lvz2;

    .line 2047
    .line 2048
    goto/16 :goto_1c

    .line 2049
    .line 2050
    :pswitch_64
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v49

    .line 2054
    goto/16 :goto_1c

    .line 2055
    .line 2056
    :pswitch_65
    invoke-static {v1, v5}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v48

    .line 2060
    goto/16 :goto_1c

    .line 2061
    .line 2062
    :pswitch_66
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 2063
    .line 2064
    .line 2065
    move-result v47

    .line 2066
    goto/16 :goto_1c

    .line 2067
    .line 2068
    :pswitch_67
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 2069
    .line 2070
    .line 2071
    move-result v46

    .line 2072
    goto/16 :goto_1c

    .line 2073
    .line 2074
    :pswitch_68
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v45

    .line 2078
    goto/16 :goto_1c

    .line 2079
    .line 2080
    :pswitch_69
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 2081
    .line 2082
    .line 2083
    move-result v40

    .line 2084
    goto/16 :goto_1c

    .line 2085
    .line 2086
    :pswitch_6a
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v44

    .line 2090
    goto/16 :goto_1c

    .line 2091
    .line 2092
    :pswitch_6b
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 2093
    .line 2094
    .line 2095
    move-result v43

    .line 2096
    goto/16 :goto_1c

    .line 2097
    .line 2098
    :pswitch_6c
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 2099
    .line 2100
    .line 2101
    move-result v42

    .line 2102
    goto/16 :goto_1c

    .line 2103
    .line 2104
    :pswitch_6d
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 2105
    .line 2106
    .line 2107
    move-result v41

    .line 2108
    goto/16 :goto_1c

    .line 2109
    .line 2110
    :pswitch_6e
    invoke-static {v1, v5, v7}, Lgi2;->L(Landroid/os/Parcel;II)V

    .line 2111
    .line 2112
    .line 2113
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 2114
    .line 2115
    .line 2116
    move-result v3

    .line 2117
    move/from16 v39, v3

    .line 2118
    .line 2119
    goto/16 :goto_1c

    .line 2120
    .line 2121
    :pswitch_6f
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v38

    .line 2125
    goto/16 :goto_1c

    .line 2126
    .line 2127
    :pswitch_70
    invoke-static {v1, v5}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 2128
    .line 2129
    .line 2130
    move-result-wide v3

    .line 2131
    move-wide/from16 v36, v3

    .line 2132
    .line 2133
    goto/16 :goto_1c

    .line 2134
    .line 2135
    :pswitch_71
    invoke-static {v1, v5}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v35

    .line 2139
    goto/16 :goto_1c

    .line 2140
    .line 2141
    :pswitch_72
    sget-object v3, Lr12;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2142
    .line 2143
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v3

    .line 2147
    move-object/from16 v34, v3

    .line 2148
    .line 2149
    check-cast v34, Lr12;

    .line 2150
    .line 2151
    goto/16 :goto_1c

    .line 2152
    .line 2153
    :pswitch_73
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v33

    .line 2157
    goto/16 :goto_1c

    .line 2158
    .line 2159
    :pswitch_74
    invoke-static {v1, v5}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v32

    .line 2163
    goto/16 :goto_1c

    .line 2164
    .line 2165
    :pswitch_75
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v31

    .line 2169
    goto/16 :goto_1c

    .line 2170
    .line 2171
    :pswitch_76
    invoke-static {v1, v5}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 2172
    .line 2173
    .line 2174
    move-result-wide v3

    .line 2175
    move-wide/from16 v29, v3

    .line 2176
    .line 2177
    goto/16 :goto_1c

    .line 2178
    .line 2179
    :pswitch_77
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v28

    .line 2183
    goto/16 :goto_1c

    .line 2184
    .line 2185
    :pswitch_78
    invoke-static {v1, v5, v7}, Lgi2;->L(Landroid/os/Parcel;II)V

    .line 2186
    .line 2187
    .line 2188
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 2189
    .line 2190
    .line 2191
    move-result v3

    .line 2192
    move/from16 v27, v3

    .line 2193
    .line 2194
    goto/16 :goto_1c

    .line 2195
    .line 2196
    :pswitch_79
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 2197
    .line 2198
    .line 2199
    move-result v26

    .line 2200
    goto/16 :goto_1c

    .line 2201
    .line 2202
    :pswitch_7a
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 2203
    .line 2204
    .line 2205
    move-result v25

    .line 2206
    goto/16 :goto_1c

    .line 2207
    .line 2208
    :pswitch_7b
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 2209
    .line 2210
    .line 2211
    move-result v24

    .line 2212
    goto/16 :goto_1c

    .line 2213
    .line 2214
    :pswitch_7c
    invoke-static {v1, v5}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v23

    .line 2218
    goto/16 :goto_1c

    .line 2219
    .line 2220
    :pswitch_7d
    invoke-static {v1, v5}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v22

    .line 2224
    goto/16 :goto_1c

    .line 2225
    .line 2226
    :pswitch_7e
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 2227
    .line 2228
    .line 2229
    move-result v21

    .line 2230
    goto/16 :goto_1c

    .line 2231
    .line 2232
    :pswitch_7f
    invoke-static {v1, v5}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 2233
    .line 2234
    .line 2235
    move-result-object v20

    .line 2236
    goto/16 :goto_1c

    .line 2237
    .line 2238
    :pswitch_80
    sget-object v3, Le51;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2239
    .line 2240
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2241
    .line 2242
    .line 2243
    move-result-object v3

    .line 2244
    move-object/from16 v19, v3

    .line 2245
    .line 2246
    check-cast v19, Le51;

    .line 2247
    .line 2248
    goto/16 :goto_1c

    .line 2249
    .line 2250
    :pswitch_81
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2251
    .line 2252
    .line 2253
    move-result-object v18

    .line 2254
    goto/16 :goto_1c

    .line 2255
    .line 2256
    :pswitch_82
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v17

    .line 2260
    goto/16 :goto_1c

    .line 2261
    .line 2262
    :pswitch_83
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v16

    .line 2266
    goto/16 :goto_1c

    .line 2267
    .line 2268
    :pswitch_84
    sget-object v3, Landroid/content/pm/PackageInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2269
    .line 2270
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v3

    .line 2274
    move-object v15, v3

    .line 2275
    check-cast v15, Landroid/content/pm/PackageInfo;

    .line 2276
    .line 2277
    goto/16 :goto_1c

    .line 2278
    .line 2279
    :pswitch_85
    sget-object v3, Landroid/content/pm/ApplicationInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2280
    .line 2281
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v3

    .line 2285
    move-object v14, v3

    .line 2286
    check-cast v14, Landroid/content/pm/ApplicationInfo;

    .line 2287
    .line 2288
    goto/16 :goto_1c

    .line 2289
    .line 2290
    :pswitch_86
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 2291
    .line 2292
    .line 2293
    move-result-object v13

    .line 2294
    goto/16 :goto_1c

    .line 2295
    .line 2296
    :pswitch_87
    sget-object v3, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2297
    .line 2298
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v3

    .line 2302
    move-object v12, v3

    .line 2303
    check-cast v12, Lxe4;

    .line 2304
    .line 2305
    goto/16 :goto_1c

    .line 2306
    .line 2307
    :pswitch_88
    sget-object v3, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2308
    .line 2309
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v3

    .line 2313
    move-object v11, v3

    .line 2314
    check-cast v11, Lpc4;

    .line 2315
    .line 2316
    goto/16 :goto_1c

    .line 2317
    .line 2318
    :pswitch_89
    invoke-static {v1, v5}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v10

    .line 2322
    goto/16 :goto_1c

    .line 2323
    .line 2324
    :pswitch_8a
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 2325
    .line 2326
    .line 2327
    move-result v9

    .line 2328
    goto/16 :goto_1c

    .line 2329
    .line 2330
    :cond_59
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 2331
    .line 2332
    .line 2333
    new-instance v8, Lu92;

    .line 2334
    .line 2335
    invoke-direct/range {v8 .. v68}, Lu92;-><init>(ILandroid/os/Bundle;Lpc4;Lxe4;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le51;Landroid/os/Bundle;ILjava/util/ArrayList;Landroid/os/Bundle;ZIIFLjava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Lr12;Ljava/util/ArrayList;JLjava/lang/String;FZIIZLjava/lang/String;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;Lvz2;ZLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;IZZZLjava/util/ArrayList;Ljava/lang/String;Lf52;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2336
    .line 2337
    .line 2338
    return-object v8

    .line 2339
    :pswitch_8b
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 2340
    .line 2341
    .line 2342
    move-result v2

    .line 2343
    const/4 v3, 0x0

    .line 2344
    move-object v4, v3

    .line 2345
    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 2346
    .line 2347
    .line 2348
    move-result v5

    .line 2349
    if-ge v5, v2, :cond_5c

    .line 2350
    .line 2351
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 2352
    .line 2353
    .line 2354
    move-result v5

    .line 2355
    int-to-char v6, v5

    .line 2356
    const/4 v7, 0x1

    .line 2357
    if-eq v6, v7, :cond_5b

    .line 2358
    .line 2359
    const/4 v7, 0x2

    .line 2360
    if-eq v6, v7, :cond_5a

    .line 2361
    .line 2362
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 2363
    .line 2364
    .line 2365
    goto :goto_1e

    .line 2366
    :cond_5a
    invoke-static {v1, v5}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 2367
    .line 2368
    .line 2369
    move-result-object v4

    .line 2370
    goto :goto_1e

    .line 2371
    :cond_5b
    invoke-static {v1, v5}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v3

    .line 2375
    goto :goto_1e

    .line 2376
    :cond_5c
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 2377
    .line 2378
    .line 2379
    new-instance v1, Lo92;

    .line 2380
    .line 2381
    invoke-direct {v1, v3, v4}, Lo92;-><init>(Landroid/os/IBinder;Landroid/os/IBinder;)V

    .line 2382
    .line 2383
    .line 2384
    return-object v1

    .line 2385
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8b
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_30
        :pswitch_2f
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_9
    .end packed-switch

    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    :pswitch_data_1
    .packed-switch 0x2
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

    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    :pswitch_data_5
    .packed-switch 0x2
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
    .end packed-switch

    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_3d
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
    .end packed-switch

    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    :pswitch_data_7
    .packed-switch 0x1
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_50
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_50
        :pswitch_50
        :pswitch_50
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_50
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_50
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_50
        :pswitch_53
        :pswitch_52
        :pswitch_51
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp92;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lzb4;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lsh;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Leb4;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lih3;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lqf3;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lne3;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lae3;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lce3;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lbe3;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lxd3;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lwd3;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lud3;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Ld93;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lw63;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lnx2;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lvm0;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lvz2;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Ljc2;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lec2;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lad2;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lju;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Lrb2;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lmb2;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lta2;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lpa2;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lfa2;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Lw92;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Lv92;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [Lu92;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Lo92;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
