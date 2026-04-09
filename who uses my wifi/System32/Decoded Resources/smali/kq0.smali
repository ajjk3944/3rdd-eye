.class public final Lkq0;
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
    iput p1, p0, Lkq0;->a:I

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
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lkq0;->a:I

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    const/4 v6, 0x4

    .line 11
    const/4 v7, 0x3

    .line 12
    const/4 v8, 0x2

    .line 13
    const/4 v9, 0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x0

    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    move v3, v11

    .line 24
    move v4, v3

    .line 25
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-ge v5, v2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    int-to-char v6, v5

    .line 36
    if-eq v6, v9, :cond_2

    .line 37
    .line 38
    if-eq v6, v8, :cond_1

    .line 39
    .line 40
    if-eq v6, v7, :cond_0

    .line 41
    .line 42
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Li82;

    .line 65
    .line 66
    invoke-direct {v1, v11, v3, v4}, Li82;-><init>(III)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :pswitch_0
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    move v3, v11

    .line 75
    move v4, v3

    .line 76
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-ge v5, v2, :cond_8

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    int-to-char v6, v5

    .line 87
    if-eq v6, v9, :cond_7

    .line 88
    .line 89
    if-eq v6, v8, :cond_6

    .line 90
    .line 91
    if-eq v6, v7, :cond_5

    .line 92
    .line 93
    const/16 v12, 0x3e8

    .line 94
    .line 95
    if-eq v6, v12, :cond_4

    .line 96
    .line 97
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    goto :goto_1

    .line 106
    :cond_5
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    goto :goto_1

    .line 111
    :cond_6
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    goto :goto_1

    .line 116
    :cond_7
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    goto :goto_1

    .line 121
    :cond_8
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 122
    .line 123
    .line 124
    new-instance v1, Lf52;

    .line 125
    .line 126
    invoke-direct {v1, v11, v3, v4, v10}, Lf52;-><init>(IIILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :pswitch_1
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    move-object v3, v10

    .line 135
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-ge v4, v2, :cond_b

    .line 140
    .line 141
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    int-to-char v5, v4

    .line 146
    if-eq v5, v9, :cond_a

    .line 147
    .line 148
    if-eq v5, v8, :cond_9

    .line 149
    .line 150
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_9
    invoke-static {v1, v4}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    goto :goto_2

    .line 159
    :cond_a
    invoke-static {v1, v4}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    goto :goto_2

    .line 164
    :cond_b
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 165
    .line 166
    .line 167
    new-instance v1, Le52;

    .line 168
    .line 169
    invoke-direct {v1, v3, v10}, Le52;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-object v1

    .line 173
    :pswitch_2
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    move-object v3, v10

    .line 178
    move v4, v11

    .line 179
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-ge v5, v2, :cond_10

    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    int-to-char v12, v5

    .line 190
    if-eq v12, v9, :cond_f

    .line 191
    .line 192
    if-eq v12, v8, :cond_e

    .line 193
    .line 194
    if-eq v12, v7, :cond_d

    .line 195
    .line 196
    if-eq v12, v6, :cond_c

    .line 197
    .line 198
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_c
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    goto :goto_3

    .line 207
    :cond_d
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    goto :goto_3

    .line 212
    :cond_e
    invoke-static {v1, v5}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    goto :goto_3

    .line 217
    :cond_f
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    goto :goto_3

    .line 222
    :cond_10
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 223
    .line 224
    .line 225
    new-instance v1, Lw42;

    .line 226
    .line 227
    invoke-direct {v1, v10, v4, v3, v11}, Lw42;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 228
    .line 229
    .line 230
    return-object v1

    .line 231
    :pswitch_3
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    move-wide/from16 v20, v4

    .line 236
    .line 237
    move-object v14, v10

    .line 238
    move-object/from16 v16, v14

    .line 239
    .line 240
    move-object/from16 v17, v16

    .line 241
    .line 242
    move-object/from16 v18, v17

    .line 243
    .line 244
    move v13, v11

    .line 245
    move v15, v13

    .line 246
    move/from16 v19, v15

    .line 247
    .line 248
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-ge v3, v2, :cond_11

    .line 253
    .line 254
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    int-to-char v4, v3

    .line 259
    packed-switch v4, :pswitch_data_1

    .line 260
    .line 261
    .line 262
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :pswitch_4
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 267
    .line 268
    .line 269
    move-result-wide v3

    .line 270
    move-wide/from16 v20, v3

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :pswitch_5
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    move/from16 v19, v3

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :pswitch_6
    invoke-static {v1, v3}, Lgi2;->h(Landroid/os/Parcel;I)[Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    move-object/from16 v18, v3

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :pswitch_7
    invoke-static {v1, v3}, Lgi2;->h(Landroid/os/Parcel;I)[Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    move-object/from16 v17, v3

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :pswitch_8
    invoke-static {v1, v3}, Lgi2;->e(Landroid/os/Parcel;I)[B

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    move-object/from16 v16, v3

    .line 299
    .line 300
    goto :goto_4

    .line 301
    :pswitch_9
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    move v15, v3

    .line 306
    goto :goto_4

    .line 307
    :pswitch_a
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    move-object v14, v3

    .line 312
    goto :goto_4

    .line 313
    :pswitch_b
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    move v13, v3

    .line 318
    goto :goto_4

    .line 319
    :cond_11
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 320
    .line 321
    .line 322
    new-instance v12, Lr42;

    .line 323
    .line 324
    invoke-direct/range {v12 .. v21}, Lr42;-><init>(ZLjava/lang/String;I[B[Ljava/lang/String;[Ljava/lang/String;ZJ)V

    .line 325
    .line 326
    .line 327
    return-object v12

    .line 328
    :pswitch_c
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    move-object v3, v10

    .line 333
    move-object v4, v3

    .line 334
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    if-ge v5, v2, :cond_15

    .line 339
    .line 340
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    int-to-char v6, v5

    .line 345
    if-eq v6, v9, :cond_14

    .line 346
    .line 347
    if-eq v6, v8, :cond_13

    .line 348
    .line 349
    if-eq v6, v7, :cond_12

    .line 350
    .line 351
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 352
    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_12
    invoke-static {v1, v5}, Lgi2;->h(Landroid/os/Parcel;I)[Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    goto :goto_5

    .line 360
    :cond_13
    invoke-static {v1, v5}, Lgi2;->h(Landroid/os/Parcel;I)[Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    goto :goto_5

    .line 365
    :cond_14
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    goto :goto_5

    .line 370
    :cond_15
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 371
    .line 372
    .line 373
    new-instance v1, Lq42;

    .line 374
    .line 375
    invoke-direct {v1, v10, v3, v4}, Lq42;-><init>(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    return-object v1

    .line 379
    :pswitch_d
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    move-object/from16 v18, v10

    .line 384
    .line 385
    move v13, v11

    .line 386
    move v14, v13

    .line 387
    move v15, v14

    .line 388
    move/from16 v16, v15

    .line 389
    .line 390
    move/from16 v17, v16

    .line 391
    .line 392
    move/from16 v19, v17

    .line 393
    .line 394
    move/from16 v20, v19

    .line 395
    .line 396
    move/from16 v21, v20

    .line 397
    .line 398
    move/from16 v22, v21

    .line 399
    .line 400
    move/from16 v23, v22

    .line 401
    .line 402
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-ge v3, v2, :cond_16

    .line 407
    .line 408
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    int-to-char v4, v3

    .line 413
    packed-switch v4, :pswitch_data_2

    .line 414
    .line 415
    .line 416
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 417
    .line 418
    .line 419
    goto :goto_6

    .line 420
    :pswitch_e
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 421
    .line 422
    .line 423
    move-result v23

    .line 424
    goto :goto_6

    .line 425
    :pswitch_f
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 426
    .line 427
    .line 428
    move-result v22

    .line 429
    goto :goto_6

    .line 430
    :pswitch_10
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 431
    .line 432
    .line 433
    move-result v21

    .line 434
    goto :goto_6

    .line 435
    :pswitch_11
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 436
    .line 437
    .line 438
    move-result v20

    .line 439
    goto :goto_6

    .line 440
    :pswitch_12
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 441
    .line 442
    .line 443
    move-result v19

    .line 444
    goto :goto_6

    .line 445
    :pswitch_13
    sget-object v4, Lih3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 446
    .line 447
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 448
    .line 449
    .line 450
    move-result-object v3

    .line 451
    move-object/from16 v18, v3

    .line 452
    .line 453
    check-cast v18, Lih3;

    .line 454
    .line 455
    goto :goto_6

    .line 456
    :pswitch_14
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 457
    .line 458
    .line 459
    move-result v17

    .line 460
    goto :goto_6

    .line 461
    :pswitch_15
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 462
    .line 463
    .line 464
    move-result v16

    .line 465
    goto :goto_6

    .line 466
    :pswitch_16
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 467
    .line 468
    .line 469
    move-result v15

    .line 470
    goto :goto_6

    .line 471
    :pswitch_17
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 472
    .line 473
    .line 474
    move-result v14

    .line 475
    goto :goto_6

    .line 476
    :pswitch_18
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 477
    .line 478
    .line 479
    move-result v13

    .line 480
    goto :goto_6

    .line 481
    :cond_16
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 482
    .line 483
    .line 484
    new-instance v12, Lr12;

    .line 485
    .line 486
    invoke-direct/range {v12 .. v23}, Lr12;-><init>(IZIZILih3;ZIIZI)V

    .line 487
    .line 488
    .line 489
    return-object v12

    .line 490
    :pswitch_19
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    move-wide v14, v4

    .line 495
    move-wide/from16 v21, v14

    .line 496
    .line 497
    move-object v13, v10

    .line 498
    move-object/from16 v16, v13

    .line 499
    .line 500
    move-object/from16 v17, v16

    .line 501
    .line 502
    move-object/from16 v18, v17

    .line 503
    .line 504
    move-object/from16 v19, v18

    .line 505
    .line 506
    move-object/from16 v23, v19

    .line 507
    .line 508
    move/from16 v20, v11

    .line 509
    .line 510
    move/from16 v24, v20

    .line 511
    .line 512
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    if-ge v3, v2, :cond_17

    .line 517
    .line 518
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    int-to-char v4, v3

    .line 523
    packed-switch v4, :pswitch_data_3

    .line 524
    .line 525
    .line 526
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 527
    .line 528
    .line 529
    goto :goto_7

    .line 530
    :pswitch_1a
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    move/from16 v24, v3

    .line 535
    .line 536
    goto :goto_7

    .line 537
    :pswitch_1b
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    move-object/from16 v23, v3

    .line 542
    .line 543
    goto :goto_7

    .line 544
    :pswitch_1c
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 545
    .line 546
    .line 547
    move-result-wide v3

    .line 548
    move-wide/from16 v21, v3

    .line 549
    .line 550
    goto :goto_7

    .line 551
    :pswitch_1d
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    move/from16 v20, v3

    .line 556
    .line 557
    goto :goto_7

    .line 558
    :pswitch_1e
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    move-object/from16 v19, v3

    .line 563
    .line 564
    goto :goto_7

    .line 565
    :pswitch_1f
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    move-object/from16 v18, v3

    .line 570
    .line 571
    goto :goto_7

    .line 572
    :pswitch_20
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    move-object/from16 v17, v3

    .line 577
    .line 578
    goto :goto_7

    .line 579
    :pswitch_21
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    move-object/from16 v16, v3

    .line 584
    .line 585
    goto :goto_7

    .line 586
    :pswitch_22
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 587
    .line 588
    .line 589
    move-result-wide v3

    .line 590
    move-wide v14, v3

    .line 591
    goto :goto_7

    .line 592
    :pswitch_23
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    move-object v13, v3

    .line 597
    goto :goto_7

    .line 598
    :cond_17
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 599
    .line 600
    .line 601
    new-instance v12, Lww1;

    .line 602
    .line 603
    invoke-direct/range {v12 .. v24}, Lww1;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZJLjava/lang/String;I)V

    .line 604
    .line 605
    .line 606
    return-object v12

    .line 607
    :pswitch_24
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    move-wide/from16 v16, v4

    .line 612
    .line 613
    move-object v13, v10

    .line 614
    move v14, v11

    .line 615
    move v15, v14

    .line 616
    move/from16 v18, v15

    .line 617
    .line 618
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 619
    .line 620
    .line 621
    move-result v4

    .line 622
    if-ge v4, v2, :cond_1d

    .line 623
    .line 624
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 625
    .line 626
    .line 627
    move-result v4

    .line 628
    int-to-char v5, v4

    .line 629
    if-eq v5, v8, :cond_1c

    .line 630
    .line 631
    if-eq v5, v7, :cond_1b

    .line 632
    .line 633
    if-eq v5, v6, :cond_1a

    .line 634
    .line 635
    if-eq v5, v3, :cond_19

    .line 636
    .line 637
    const/4 v9, 0x6

    .line 638
    if-eq v5, v9, :cond_18

    .line 639
    .line 640
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 641
    .line 642
    .line 643
    goto :goto_8

    .line 644
    :cond_18
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 645
    .line 646
    .line 647
    move-result v4

    .line 648
    move/from16 v18, v4

    .line 649
    .line 650
    goto :goto_8

    .line 651
    :cond_19
    invoke-static {v1, v4}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 652
    .line 653
    .line 654
    move-result-wide v4

    .line 655
    move-wide/from16 v16, v4

    .line 656
    .line 657
    goto :goto_8

    .line 658
    :cond_1a
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 659
    .line 660
    .line 661
    move-result v4

    .line 662
    move v15, v4

    .line 663
    goto :goto_8

    .line 664
    :cond_1b
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 665
    .line 666
    .line 667
    move-result v4

    .line 668
    move v14, v4

    .line 669
    goto :goto_8

    .line 670
    :cond_1c
    sget-object v5, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 671
    .line 672
    invoke-static {v1, v4, v5}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    check-cast v4, Landroid/os/ParcelFileDescriptor;

    .line 677
    .line 678
    move-object v13, v4

    .line 679
    goto :goto_8

    .line 680
    :cond_1d
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 681
    .line 682
    .line 683
    new-instance v12, Luw1;

    .line 684
    .line 685
    invoke-direct/range {v12 .. v18}, Luw1;-><init>(Landroid/os/ParcelFileDescriptor;ZZJZ)V

    .line 686
    .line 687
    .line 688
    return-object v12

    .line 689
    :pswitch_25
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    if-ge v3, v2, :cond_20

    .line 698
    .line 699
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 700
    .line 701
    .line 702
    move-result v3

    .line 703
    int-to-char v4, v3

    .line 704
    if-eq v4, v9, :cond_1f

    .line 705
    .line 706
    if-eq v4, v8, :cond_1e

    .line 707
    .line 708
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 709
    .line 710
    .line 711
    goto :goto_9

    .line 712
    :cond_1e
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 713
    .line 714
    .line 715
    move-result v11

    .line 716
    goto :goto_9

    .line 717
    :cond_1f
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v10

    .line 721
    goto :goto_9

    .line 722
    :cond_20
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 723
    .line 724
    .line 725
    new-instance v1, Lwu1;

    .line 726
    .line 727
    invoke-direct {v1, v10, v11}, Lwu1;-><init>(Ljava/lang/String;I)V

    .line 728
    .line 729
    .line 730
    return-object v1

    .line 731
    :pswitch_26
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    move-object v13, v10

    .line 736
    move-object v14, v13

    .line 737
    move-object v15, v14

    .line 738
    move-object/from16 v16, v15

    .line 739
    .line 740
    move-object/from16 v17, v16

    .line 741
    .line 742
    move-object/from16 v18, v17

    .line 743
    .line 744
    move-object/from16 v19, v18

    .line 745
    .line 746
    move-object/from16 v20, v19

    .line 747
    .line 748
    move-object/from16 v21, v20

    .line 749
    .line 750
    move-object/from16 v23, v21

    .line 751
    .line 752
    move/from16 v22, v11

    .line 753
    .line 754
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 755
    .line 756
    .line 757
    move-result v3

    .line 758
    if-ge v3, v2, :cond_21

    .line 759
    .line 760
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 761
    .line 762
    .line 763
    move-result v3

    .line 764
    int-to-char v4, v3

    .line 765
    packed-switch v4, :pswitch_data_4

    .line 766
    .line 767
    .line 768
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 769
    .line 770
    .line 771
    goto :goto_a

    .line 772
    :pswitch_27
    invoke-static {v1, v3}, Lgi2;->d(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 773
    .line 774
    .line 775
    move-result-object v23

    .line 776
    goto :goto_a

    .line 777
    :pswitch_28
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 778
    .line 779
    .line 780
    move-result v22

    .line 781
    goto :goto_a

    .line 782
    :pswitch_29
    invoke-static {v1, v3}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 783
    .line 784
    .line 785
    move-result-object v21

    .line 786
    goto :goto_a

    .line 787
    :pswitch_2a
    sget-object v4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 788
    .line 789
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    move-object/from16 v20, v3

    .line 794
    .line 795
    check-cast v20, Landroid/content/Intent;

    .line 796
    .line 797
    goto :goto_a

    .line 798
    :pswitch_2b
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v19

    .line 802
    goto :goto_a

    .line 803
    :pswitch_2c
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v18

    .line 807
    goto :goto_a

    .line 808
    :pswitch_2d
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v17

    .line 812
    goto :goto_a

    .line 813
    :pswitch_2e
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v16

    .line 817
    goto :goto_a

    .line 818
    :pswitch_2f
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v15

    .line 822
    goto :goto_a

    .line 823
    :pswitch_30
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v14

    .line 827
    goto :goto_a

    .line 828
    :pswitch_31
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v13

    .line 832
    goto :goto_a

    .line 833
    :cond_21
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 834
    .line 835
    .line 836
    new-instance v12, Lfc2;

    .line 837
    .line 838
    invoke-direct/range {v12 .. v23}, Lfc2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;ZLandroid/os/Bundle;)V

    .line 839
    .line 840
    .line 841
    return-object v12

    .line 842
    :pswitch_32
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    move-object v3, v10

    .line 847
    move-object v4, v3

    .line 848
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 849
    .line 850
    .line 851
    move-result v5

    .line 852
    if-ge v5, v2, :cond_25

    .line 853
    .line 854
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 855
    .line 856
    .line 857
    move-result v5

    .line 858
    int-to-char v6, v5

    .line 859
    if-eq v6, v9, :cond_24

    .line 860
    .line 861
    if-eq v6, v8, :cond_23

    .line 862
    .line 863
    if-eq v6, v7, :cond_22

    .line 864
    .line 865
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 866
    .line 867
    .line 868
    goto :goto_b

    .line 869
    :cond_22
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    goto :goto_b

    .line 874
    :cond_23
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v3

    .line 878
    goto :goto_b

    .line 879
    :cond_24
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v10

    .line 883
    goto :goto_b

    .line 884
    :cond_25
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 885
    .line 886
    .line 887
    new-instance v1, Lgd1;

    .line 888
    .line 889
    invoke-direct {v1, v10, v3, v4}, Lgd1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    return-object v1

    .line 893
    :pswitch_33
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 894
    .line 895
    .line 896
    move-result v2

    .line 897
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 898
    .line 899
    .line 900
    move-result v3

    .line 901
    if-ge v3, v2, :cond_27

    .line 902
    .line 903
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 904
    .line 905
    .line 906
    move-result v3

    .line 907
    int-to-char v4, v3

    .line 908
    if-eq v4, v9, :cond_26

    .line 909
    .line 910
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 911
    .line 912
    .line 913
    goto :goto_c

    .line 914
    :cond_26
    invoke-static {v1, v3}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 915
    .line 916
    .line 917
    move-result v11

    .line 918
    goto :goto_c

    .line 919
    :cond_27
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 920
    .line 921
    .line 922
    new-instance v1, Lz2;

    .line 923
    .line 924
    invoke-direct {v1, v11}, Lz2;-><init>(Z)V

    .line 925
    .line 926
    .line 927
    return-object v1

    .line 928
    :pswitch_34
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 929
    .line 930
    .line 931
    move-result v2

    .line 932
    move-object v3, v10

    .line 933
    move-object v4, v3

    .line 934
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 935
    .line 936
    .line 937
    move-result v5

    .line 938
    if-ge v5, v2, :cond_2c

    .line 939
    .line 940
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 941
    .line 942
    .line 943
    move-result v5

    .line 944
    int-to-char v12, v5

    .line 945
    if-eq v12, v9, :cond_2b

    .line 946
    .line 947
    if-eq v12, v8, :cond_2a

    .line 948
    .line 949
    if-eq v12, v7, :cond_29

    .line 950
    .line 951
    if-eq v12, v6, :cond_28

    .line 952
    .line 953
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 954
    .line 955
    .line 956
    goto :goto_d

    .line 957
    :cond_28
    sget-object v4, Lrh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 958
    .line 959
    invoke-static {v1, v5, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 960
    .line 961
    .line 962
    move-result-object v4

    .line 963
    check-cast v4, Lrh;

    .line 964
    .line 965
    goto :goto_d

    .line 966
    :cond_29
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 967
    .line 968
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 969
    .line 970
    .line 971
    move-result-object v3

    .line 972
    check-cast v3, Landroid/app/PendingIntent;

    .line 973
    .line 974
    goto :goto_d

    .line 975
    :cond_2a
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v10

    .line 979
    goto :goto_d

    .line 980
    :cond_2b
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 981
    .line 982
    .line 983
    move-result v11

    .line 984
    goto :goto_d

    .line 985
    :cond_2c
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 986
    .line 987
    .line 988
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 989
    .line 990
    invoke-direct {v1, v11, v10, v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lrh;)V

    .line 991
    .line 992
    .line 993
    return-object v1

    .line 994
    :pswitch_35
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 995
    .line 996
    .line 997
    move-result v2

    .line 998
    move-object v3, v10

    .line 999
    move v4, v11

    .line 1000
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1001
    .line 1002
    .line 1003
    move-result v5

    .line 1004
    if-ge v5, v2, :cond_31

    .line 1005
    .line 1006
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    int-to-char v12, v5

    .line 1011
    if-eq v12, v9, :cond_30

    .line 1012
    .line 1013
    if-eq v12, v8, :cond_2f

    .line 1014
    .line 1015
    if-eq v12, v7, :cond_2e

    .line 1016
    .line 1017
    if-eq v12, v6, :cond_2d

    .line 1018
    .line 1019
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1020
    .line 1021
    .line 1022
    goto :goto_e

    .line 1023
    :cond_2d
    invoke-static {v1, v5}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v3

    .line 1027
    goto :goto_e

    .line 1028
    :cond_2e
    sget-object v10, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1029
    .line 1030
    invoke-static {v1, v5, v10}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v5

    .line 1034
    move-object v10, v5

    .line 1035
    check-cast v10, Landroid/app/PendingIntent;

    .line 1036
    .line 1037
    goto :goto_e

    .line 1038
    :cond_2f
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1039
    .line 1040
    .line 1041
    move-result v4

    .line 1042
    goto :goto_e

    .line 1043
    :cond_30
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1044
    .line 1045
    .line 1046
    move-result v11

    .line 1047
    goto :goto_e

    .line 1048
    :cond_31
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1049
    .line 1050
    .line 1051
    new-instance v1, Lrh;

    .line 1052
    .line 1053
    invoke-direct {v1, v11, v4, v10, v3}, Lrh;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    return-object v1

    .line 1057
    :pswitch_36
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1058
    .line 1059
    .line 1060
    move-result v2

    .line 1061
    move v13, v11

    .line 1062
    move v14, v13

    .line 1063
    move v15, v14

    .line 1064
    move/from16 v16, v15

    .line 1065
    .line 1066
    move/from16 v17, v16

    .line 1067
    .line 1068
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1069
    .line 1070
    .line 1071
    move-result v4

    .line 1072
    if-ge v4, v2, :cond_37

    .line 1073
    .line 1074
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1075
    .line 1076
    .line 1077
    move-result v4

    .line 1078
    int-to-char v5, v4

    .line 1079
    if-eq v5, v9, :cond_36

    .line 1080
    .line 1081
    if-eq v5, v8, :cond_35

    .line 1082
    .line 1083
    if-eq v5, v7, :cond_34

    .line 1084
    .line 1085
    if-eq v5, v6, :cond_33

    .line 1086
    .line 1087
    if-eq v5, v3, :cond_32

    .line 1088
    .line 1089
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1090
    .line 1091
    .line 1092
    goto :goto_f

    .line 1093
    :cond_32
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1094
    .line 1095
    .line 1096
    move-result v15

    .line 1097
    goto :goto_f

    .line 1098
    :cond_33
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1099
    .line 1100
    .line 1101
    move-result v14

    .line 1102
    goto :goto_f

    .line 1103
    :cond_34
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v17

    .line 1107
    goto :goto_f

    .line 1108
    :cond_35
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v16

    .line 1112
    goto :goto_f

    .line 1113
    :cond_36
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1114
    .line 1115
    .line 1116
    move-result v13

    .line 1117
    goto :goto_f

    .line 1118
    :cond_37
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1119
    .line 1120
    .line 1121
    new-instance v12, Ltq0;

    .line 1122
    .line 1123
    invoke-direct/range {v12 .. v17}, Ltq0;-><init>(IIIZZ)V

    .line 1124
    .line 1125
    .line 1126
    return-object v12

    .line 1127
    :pswitch_37
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1128
    .line 1129
    .line 1130
    move-result v2

    .line 1131
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1132
    .line 1133
    .line 1134
    move-result v3

    .line 1135
    if-ge v3, v2, :cond_3a

    .line 1136
    .line 1137
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1138
    .line 1139
    .line 1140
    move-result v3

    .line 1141
    int-to-char v4, v3

    .line 1142
    if-eq v4, v9, :cond_39

    .line 1143
    .line 1144
    if-eq v4, v8, :cond_38

    .line 1145
    .line 1146
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1147
    .line 1148
    .line 1149
    goto :goto_10

    .line 1150
    :cond_38
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v10

    .line 1154
    goto :goto_10

    .line 1155
    :cond_39
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1156
    .line 1157
    .line 1158
    move-result v11

    .line 1159
    goto :goto_10

    .line 1160
    :cond_3a
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1161
    .line 1162
    .line 1163
    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    .line 1164
    .line 1165
    invoke-direct {v1, v10, v11}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;I)V

    .line 1166
    .line 1167
    .line 1168
    return-object v1

    .line 1169
    :pswitch_38
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1170
    .line 1171
    .line 1172
    move-result v2

    .line 1173
    move-object v14, v10

    .line 1174
    move-object v15, v14

    .line 1175
    move v13, v11

    .line 1176
    move/from16 v16, v13

    .line 1177
    .line 1178
    move/from16 v17, v16

    .line 1179
    .line 1180
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1181
    .line 1182
    .line 1183
    move-result v4

    .line 1184
    if-ge v4, v2, :cond_40

    .line 1185
    .line 1186
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1187
    .line 1188
    .line 1189
    move-result v4

    .line 1190
    int-to-char v5, v4

    .line 1191
    if-eq v5, v9, :cond_3f

    .line 1192
    .line 1193
    if-eq v5, v8, :cond_3e

    .line 1194
    .line 1195
    if-eq v5, v7, :cond_3d

    .line 1196
    .line 1197
    if-eq v5, v6, :cond_3c

    .line 1198
    .line 1199
    if-eq v5, v3, :cond_3b

    .line 1200
    .line 1201
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1202
    .line 1203
    .line 1204
    goto :goto_11

    .line 1205
    :cond_3b
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v4

    .line 1209
    move/from16 v17, v4

    .line 1210
    .line 1211
    goto :goto_11

    .line 1212
    :cond_3c
    invoke-static {v1, v4}, Lgi2;->t(Landroid/os/Parcel;I)Z

    .line 1213
    .line 1214
    .line 1215
    move-result v4

    .line 1216
    move/from16 v16, v4

    .line 1217
    .line 1218
    goto :goto_11

    .line 1219
    :cond_3d
    sget-object v5, Lrh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1220
    .line 1221
    invoke-static {v1, v4, v5}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v4

    .line 1225
    check-cast v4, Lrh;

    .line 1226
    .line 1227
    move-object v15, v4

    .line 1228
    goto :goto_11

    .line 1229
    :cond_3e
    invoke-static {v1, v4}, Lgi2;->u(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v4

    .line 1233
    move-object v14, v4

    .line 1234
    goto :goto_11

    .line 1235
    :cond_3f
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1236
    .line 1237
    .line 1238
    move-result v4

    .line 1239
    move v13, v4

    .line 1240
    goto :goto_11

    .line 1241
    :cond_40
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1242
    .line 1243
    .line 1244
    new-instance v12, Lyc1;

    .line 1245
    .line 1246
    invoke-direct/range {v12 .. v17}, Lyc1;-><init>(ILandroid/os/IBinder;Lrh;ZZ)V

    .line 1247
    .line 1248
    .line 1249
    return-object v12

    .line 1250
    :pswitch_39
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1251
    .line 1252
    .line 1253
    move-result v2

    .line 1254
    move-object v3, v10

    .line 1255
    move v4, v11

    .line 1256
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1257
    .line 1258
    .line 1259
    move-result v5

    .line 1260
    if-ge v5, v2, :cond_45

    .line 1261
    .line 1262
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1263
    .line 1264
    .line 1265
    move-result v5

    .line 1266
    int-to-char v12, v5

    .line 1267
    if-eq v12, v9, :cond_44

    .line 1268
    .line 1269
    if-eq v12, v8, :cond_43

    .line 1270
    .line 1271
    if-eq v12, v7, :cond_42

    .line 1272
    .line 1273
    if-eq v12, v6, :cond_41

    .line 1274
    .line 1275
    invoke-static {v1, v5}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1276
    .line 1277
    .line 1278
    goto :goto_12

    .line 1279
    :cond_41
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1280
    .line 1281
    invoke-static {v1, v5, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v3

    .line 1285
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1286
    .line 1287
    goto :goto_12

    .line 1288
    :cond_42
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1289
    .line 1290
    .line 1291
    move-result v4

    .line 1292
    goto :goto_12

    .line 1293
    :cond_43
    sget-object v10, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1294
    .line 1295
    invoke-static {v1, v5, v10}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v5

    .line 1299
    check-cast v5, Landroid/accounts/Account;

    .line 1300
    .line 1301
    move-object v10, v5

    .line 1302
    goto :goto_12

    .line 1303
    :cond_44
    invoke-static {v1, v5}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1304
    .line 1305
    .line 1306
    move-result v5

    .line 1307
    move v11, v5

    .line 1308
    goto :goto_12

    .line 1309
    :cond_45
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1310
    .line 1311
    .line 1312
    new-instance v1, Lxc1;

    .line 1313
    .line 1314
    invoke-direct {v1, v11, v10, v4, v3}, Lxc1;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 1315
    .line 1316
    .line 1317
    return-object v1

    .line 1318
    :pswitch_3a
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1319
    .line 1320
    .line 1321
    move-result v2

    .line 1322
    const/4 v3, -0x1

    .line 1323
    move/from16 v23, v3

    .line 1324
    .line 1325
    move-wide/from16 v16, v4

    .line 1326
    .line 1327
    move-wide/from16 v18, v16

    .line 1328
    .line 1329
    move-object/from16 v20, v10

    .line 1330
    .line 1331
    move-object/from16 v21, v20

    .line 1332
    .line 1333
    move v13, v11

    .line 1334
    move v14, v13

    .line 1335
    move v15, v14

    .line 1336
    move/from16 v22, v15

    .line 1337
    .line 1338
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1339
    .line 1340
    .line 1341
    move-result v3

    .line 1342
    if-ge v3, v2, :cond_46

    .line 1343
    .line 1344
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1345
    .line 1346
    .line 1347
    move-result v3

    .line 1348
    int-to-char v4, v3

    .line 1349
    packed-switch v4, :pswitch_data_5

    .line 1350
    .line 1351
    .line 1352
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1353
    .line 1354
    .line 1355
    goto :goto_13

    .line 1356
    :pswitch_3b
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1357
    .line 1358
    .line 1359
    move-result v3

    .line 1360
    move/from16 v23, v3

    .line 1361
    .line 1362
    goto :goto_13

    .line 1363
    :pswitch_3c
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1364
    .line 1365
    .line 1366
    move-result v3

    .line 1367
    move/from16 v22, v3

    .line 1368
    .line 1369
    goto :goto_13

    .line 1370
    :pswitch_3d
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v3

    .line 1374
    move-object/from16 v21, v3

    .line 1375
    .line 1376
    goto :goto_13

    .line 1377
    :pswitch_3e
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v3

    .line 1381
    move-object/from16 v20, v3

    .line 1382
    .line 1383
    goto :goto_13

    .line 1384
    :pswitch_3f
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 1385
    .line 1386
    .line 1387
    move-result-wide v3

    .line 1388
    move-wide/from16 v18, v3

    .line 1389
    .line 1390
    goto :goto_13

    .line 1391
    :pswitch_40
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 1392
    .line 1393
    .line 1394
    move-result-wide v3

    .line 1395
    move-wide/from16 v16, v3

    .line 1396
    .line 1397
    goto :goto_13

    .line 1398
    :pswitch_41
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1399
    .line 1400
    .line 1401
    move-result v3

    .line 1402
    move v15, v3

    .line 1403
    goto :goto_13

    .line 1404
    :pswitch_42
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1405
    .line 1406
    .line 1407
    move-result v3

    .line 1408
    move v14, v3

    .line 1409
    goto :goto_13

    .line 1410
    :pswitch_43
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1411
    .line 1412
    .line 1413
    move-result v3

    .line 1414
    move v13, v3

    .line 1415
    goto :goto_13

    .line 1416
    :cond_46
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1417
    .line 1418
    .line 1419
    new-instance v12, Lre0;

    .line 1420
    .line 1421
    invoke-direct/range {v12 .. v23}, Lre0;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 1422
    .line 1423
    .line 1424
    return-object v12

    .line 1425
    :pswitch_44
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1426
    .line 1427
    .line 1428
    move-result v2

    .line 1429
    move-object v3, v10

    .line 1430
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1431
    .line 1432
    .line 1433
    move-result v4

    .line 1434
    if-ge v4, v2, :cond_4a

    .line 1435
    .line 1436
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1437
    .line 1438
    .line 1439
    move-result v4

    .line 1440
    int-to-char v5, v4

    .line 1441
    if-eq v5, v9, :cond_49

    .line 1442
    .line 1443
    if-eq v5, v8, :cond_48

    .line 1444
    .line 1445
    if-eq v5, v7, :cond_47

    .line 1446
    .line 1447
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1448
    .line 1449
    .line 1450
    goto :goto_14

    .line 1451
    :cond_47
    sget-object v3, Lyc1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1452
    .line 1453
    invoke-static {v1, v4, v3}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v3

    .line 1457
    check-cast v3, Lyc1;

    .line 1458
    .line 1459
    goto :goto_14

    .line 1460
    :cond_48
    sget-object v5, Lrh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1461
    .line 1462
    invoke-static {v1, v4, v5}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v4

    .line 1466
    check-cast v4, Lrh;

    .line 1467
    .line 1468
    move-object v10, v4

    .line 1469
    goto :goto_14

    .line 1470
    :cond_49
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1471
    .line 1472
    .line 1473
    move-result v4

    .line 1474
    move v11, v4

    .line 1475
    goto :goto_14

    .line 1476
    :cond_4a
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1477
    .line 1478
    .line 1479
    new-instance v1, Lsc1;

    .line 1480
    .line 1481
    invoke-direct {v1, v11, v10, v3}, Lsc1;-><init>(ILrh;Lyc1;)V

    .line 1482
    .line 1483
    .line 1484
    return-object v1

    .line 1485
    :pswitch_45
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1486
    .line 1487
    .line 1488
    move-result v2

    .line 1489
    move-object v3, v10

    .line 1490
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1491
    .line 1492
    .line 1493
    move-result v4

    .line 1494
    if-ge v4, v2, :cond_4d

    .line 1495
    .line 1496
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1497
    .line 1498
    .line 1499
    move-result v4

    .line 1500
    int-to-char v5, v4

    .line 1501
    if-eq v5, v9, :cond_4c

    .line 1502
    .line 1503
    if-eq v5, v8, :cond_4b

    .line 1504
    .line 1505
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1506
    .line 1507
    .line 1508
    goto :goto_15

    .line 1509
    :cond_4b
    invoke-static {v1, v4}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v3

    .line 1513
    goto :goto_15

    .line 1514
    :cond_4c
    invoke-static {v1, v4}, Lgi2;->i(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v4

    .line 1518
    move-object v10, v4

    .line 1519
    goto :goto_15

    .line 1520
    :cond_4d
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1521
    .line 1522
    .line 1523
    new-instance v1, Loc1;

    .line 1524
    .line 1525
    invoke-direct {v1, v10, v3}, Loc1;-><init>(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 1526
    .line 1527
    .line 1528
    return-object v1

    .line 1529
    :pswitch_46
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1530
    .line 1531
    .line 1532
    move-result v2

    .line 1533
    move-wide/from16 v20, v4

    .line 1534
    .line 1535
    move-object v14, v10

    .line 1536
    move-object v15, v14

    .line 1537
    move-object/from16 v16, v15

    .line 1538
    .line 1539
    move-object/from16 v17, v16

    .line 1540
    .line 1541
    move-object/from16 v18, v17

    .line 1542
    .line 1543
    move-object/from16 v19, v18

    .line 1544
    .line 1545
    move-object/from16 v22, v19

    .line 1546
    .line 1547
    move-object/from16 v23, v22

    .line 1548
    .line 1549
    move-object/from16 v24, v23

    .line 1550
    .line 1551
    move-object/from16 v25, v24

    .line 1552
    .line 1553
    move v13, v11

    .line 1554
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1555
    .line 1556
    .line 1557
    move-result v3

    .line 1558
    if-ge v3, v2, :cond_4f

    .line 1559
    .line 1560
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1561
    .line 1562
    .line 1563
    move-result v3

    .line 1564
    int-to-char v4, v3

    .line 1565
    packed-switch v4, :pswitch_data_6

    .line 1566
    .line 1567
    .line 1568
    invoke-static {v1, v3}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1569
    .line 1570
    .line 1571
    goto :goto_16

    .line 1572
    :pswitch_47
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v25

    .line 1576
    goto :goto_16

    .line 1577
    :pswitch_48
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v24

    .line 1581
    goto :goto_16

    .line 1582
    :pswitch_49
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1583
    .line 1584
    invoke-static {v1, v3}, Lgi2;->x(Landroid/os/Parcel;I)I

    .line 1585
    .line 1586
    .line 1587
    move-result v3

    .line 1588
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1589
    .line 1590
    .line 1591
    move-result v5

    .line 1592
    if-nez v3, :cond_4e

    .line 1593
    .line 1594
    move-object/from16 v23, v10

    .line 1595
    .line 1596
    goto :goto_16

    .line 1597
    :cond_4e
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v4

    .line 1601
    add-int/2addr v5, v3

    .line 1602
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1603
    .line 1604
    .line 1605
    move-object/from16 v23, v4

    .line 1606
    .line 1607
    goto :goto_16

    .line 1608
    :pswitch_4a
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v22

    .line 1612
    goto :goto_16

    .line 1613
    :pswitch_4b
    invoke-static {v1, v3}, Lgi2;->w(Landroid/os/Parcel;I)J

    .line 1614
    .line 1615
    .line 1616
    move-result-wide v3

    .line 1617
    move-wide/from16 v20, v3

    .line 1618
    .line 1619
    goto :goto_16

    .line 1620
    :pswitch_4c
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v19

    .line 1624
    goto :goto_16

    .line 1625
    :pswitch_4d
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1626
    .line 1627
    invoke-static {v1, v3, v4}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v3

    .line 1631
    move-object/from16 v18, v3

    .line 1632
    .line 1633
    check-cast v18, Landroid/net/Uri;

    .line 1634
    .line 1635
    goto :goto_16

    .line 1636
    :pswitch_4e
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v17

    .line 1640
    goto :goto_16

    .line 1641
    :pswitch_4f
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v16

    .line 1645
    goto :goto_16

    .line 1646
    :pswitch_50
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v15

    .line 1650
    goto :goto_16

    .line 1651
    :pswitch_51
    invoke-static {v1, v3}, Lgi2;->g(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v14

    .line 1655
    goto :goto_16

    .line 1656
    :pswitch_52
    invoke-static {v1, v3}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1657
    .line 1658
    .line 1659
    move-result v3

    .line 1660
    move v13, v3

    .line 1661
    goto :goto_16

    .line 1662
    :cond_4f
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1663
    .line 1664
    .line 1665
    new-instance v12, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1666
    .line 1667
    invoke-direct/range {v12 .. v25}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1668
    .line 1669
    .line 1670
    return-object v12

    .line 1671
    :pswitch_53
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1672
    .line 1673
    .line 1674
    move-result v2

    .line 1675
    move v3, v11

    .line 1676
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1677
    .line 1678
    .line 1679
    move-result v4

    .line 1680
    if-ge v4, v2, :cond_53

    .line 1681
    .line 1682
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1683
    .line 1684
    .line 1685
    move-result v4

    .line 1686
    int-to-char v5, v4

    .line 1687
    if-eq v5, v9, :cond_52

    .line 1688
    .line 1689
    if-eq v5, v8, :cond_51

    .line 1690
    .line 1691
    if-eq v5, v7, :cond_50

    .line 1692
    .line 1693
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1694
    .line 1695
    .line 1696
    goto :goto_17

    .line 1697
    :cond_50
    sget-object v5, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1698
    .line 1699
    invoke-static {v1, v4, v5}, Lgi2;->f(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v4

    .line 1703
    check-cast v4, Landroid/content/Intent;

    .line 1704
    .line 1705
    move-object v10, v4

    .line 1706
    goto :goto_17

    .line 1707
    :cond_51
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1708
    .line 1709
    .line 1710
    move-result v3

    .line 1711
    goto :goto_17

    .line 1712
    :cond_52
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1713
    .line 1714
    .line 1715
    move-result v4

    .line 1716
    move v11, v4

    .line 1717
    goto :goto_17

    .line 1718
    :cond_53
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1719
    .line 1720
    .line 1721
    new-instance v1, Lrb1;

    .line 1722
    .line 1723
    invoke-direct {v1, v11, v3, v10}, Lrb1;-><init>(IILandroid/content/Intent;)V

    .line 1724
    .line 1725
    .line 1726
    return-object v1

    .line 1727
    :pswitch_54
    invoke-static {v1}, Lgi2;->z(Landroid/os/Parcel;)I

    .line 1728
    .line 1729
    .line 1730
    move-result v2

    .line 1731
    :goto_18
    move-object v3, v10

    .line 1732
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1733
    .line 1734
    .line 1735
    move-result v4

    .line 1736
    if-ge v4, v2, :cond_57

    .line 1737
    .line 1738
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1739
    .line 1740
    .line 1741
    move-result v4

    .line 1742
    int-to-char v5, v4

    .line 1743
    if-eq v5, v9, :cond_56

    .line 1744
    .line 1745
    if-eq v5, v8, :cond_54

    .line 1746
    .line 1747
    invoke-static {v1, v4}, Lgi2;->y(Landroid/os/Parcel;I)V

    .line 1748
    .line 1749
    .line 1750
    goto :goto_19

    .line 1751
    :cond_54
    sget-object v3, Lre0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1752
    .line 1753
    invoke-static {v1, v4}, Lgi2;->x(Landroid/os/Parcel;I)I

    .line 1754
    .line 1755
    .line 1756
    move-result v4

    .line 1757
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1758
    .line 1759
    .line 1760
    move-result v5

    .line 1761
    if-nez v4, :cond_55

    .line 1762
    .line 1763
    goto :goto_18

    .line 1764
    :cond_55
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v3

    .line 1768
    add-int/2addr v5, v4

    .line 1769
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1770
    .line 1771
    .line 1772
    goto :goto_19

    .line 1773
    :cond_56
    invoke-static {v1, v4}, Lgi2;->v(Landroid/os/Parcel;I)I

    .line 1774
    .line 1775
    .line 1776
    move-result v4

    .line 1777
    move v11, v4

    .line 1778
    goto :goto_19

    .line 1779
    :cond_57
    invoke-static {v1, v2}, Lgi2;->k(Landroid/os/Parcel;I)V

    .line 1780
    .line 1781
    .line 1782
    new-instance v1, Lq01;

    .line 1783
    .line 1784
    invoke-direct {v1, v11, v3}, Lq01;-><init>(ILjava/util/List;)V

    .line 1785
    .line 1786
    .line 1787
    return-object v1

    .line 1788
    :pswitch_55
    new-instance v2, Lh31;

    .line 1789
    .line 1790
    invoke-direct {v2, v1}, Lh31;-><init>(Landroid/os/Parcel;)V

    .line 1791
    .line 1792
    .line 1793
    return-object v2

    .line 1794
    :pswitch_56
    new-instance v2, Ltx0;

    .line 1795
    .line 1796
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1800
    .line 1801
    .line 1802
    move-result v3

    .line 1803
    iput v3, v2, Ltx0;->f:I

    .line 1804
    .line 1805
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1806
    .line 1807
    .line 1808
    move-result v3

    .line 1809
    iput v3, v2, Ltx0;->g:I

    .line 1810
    .line 1811
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1812
    .line 1813
    .line 1814
    move-result v3

    .line 1815
    iput v3, v2, Ltx0;->h:I

    .line 1816
    .line 1817
    if-lez v3, :cond_58

    .line 1818
    .line 1819
    new-array v3, v3, [I

    .line 1820
    .line 1821
    iput-object v3, v2, Ltx0;->i:[I

    .line 1822
    .line 1823
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1824
    .line 1825
    .line 1826
    :cond_58
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1827
    .line 1828
    .line 1829
    move-result v3

    .line 1830
    iput v3, v2, Ltx0;->j:I

    .line 1831
    .line 1832
    if-lez v3, :cond_59

    .line 1833
    .line 1834
    new-array v3, v3, [I

    .line 1835
    .line 1836
    iput-object v3, v2, Ltx0;->k:[I

    .line 1837
    .line 1838
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1839
    .line 1840
    .line 1841
    :cond_59
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1842
    .line 1843
    .line 1844
    move-result v3

    .line 1845
    if-ne v3, v9, :cond_5a

    .line 1846
    .line 1847
    move v3, v9

    .line 1848
    goto :goto_1a

    .line 1849
    :cond_5a
    move v3, v11

    .line 1850
    :goto_1a
    iput-boolean v3, v2, Ltx0;->m:Z

    .line 1851
    .line 1852
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1853
    .line 1854
    .line 1855
    move-result v3

    .line 1856
    if-ne v3, v9, :cond_5b

    .line 1857
    .line 1858
    move v3, v9

    .line 1859
    goto :goto_1b

    .line 1860
    :cond_5b
    move v3, v11

    .line 1861
    :goto_1b
    iput-boolean v3, v2, Ltx0;->n:Z

    .line 1862
    .line 1863
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1864
    .line 1865
    .line 1866
    move-result v3

    .line 1867
    if-ne v3, v9, :cond_5c

    .line 1868
    .line 1869
    goto :goto_1c

    .line 1870
    :cond_5c
    move v9, v11

    .line 1871
    :goto_1c
    iput-boolean v9, v2, Ltx0;->o:Z

    .line 1872
    .line 1873
    const-class v3, Lsx0;

    .line 1874
    .line 1875
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v3

    .line 1879
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v1

    .line 1883
    iput-object v1, v2, Ltx0;->l:Ljava/util/ArrayList;

    .line 1884
    .line 1885
    return-object v2

    .line 1886
    :pswitch_57
    new-instance v2, Lsx0;

    .line 1887
    .line 1888
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1889
    .line 1890
    .line 1891
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1892
    .line 1893
    .line 1894
    move-result v3

    .line 1895
    iput v3, v2, Lsx0;->f:I

    .line 1896
    .line 1897
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1898
    .line 1899
    .line 1900
    move-result v3

    .line 1901
    iput v3, v2, Lsx0;->g:I

    .line 1902
    .line 1903
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1904
    .line 1905
    .line 1906
    move-result v3

    .line 1907
    if-ne v3, v9, :cond_5d

    .line 1908
    .line 1909
    goto :goto_1d

    .line 1910
    :cond_5d
    move v9, v11

    .line 1911
    :goto_1d
    iput-boolean v9, v2, Lsx0;->i:Z

    .line 1912
    .line 1913
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1914
    .line 1915
    .line 1916
    move-result v3

    .line 1917
    if-lez v3, :cond_5e

    .line 1918
    .line 1919
    new-array v3, v3, [I

    .line 1920
    .line 1921
    iput-object v3, v2, Lsx0;->h:[I

    .line 1922
    .line 1923
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1924
    .line 1925
    .line 1926
    :cond_5e
    return-object v2

    .line 1927
    :pswitch_58
    new-instance v2, Lwt0;

    .line 1928
    .line 1929
    invoke-direct {v2, v1}, Lwt0;-><init>(Landroid/os/Parcel;)V

    .line 1930
    .line 1931
    .line 1932
    return-object v2

    .line 1933
    :pswitch_59
    new-instance v2, Lmq0;

    .line 1934
    .line 1935
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1936
    .line 1937
    .line 1938
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v1

    .line 1942
    sget v3, Llq0;->g:I

    .line 1943
    .line 1944
    if-nez v1, :cond_5f

    .line 1945
    .line 1946
    goto :goto_1e

    .line 1947
    :cond_5f
    sget-object v3, Lz10;->c:Ljava/lang/String;

    .line 1948
    .line 1949
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v3

    .line 1953
    if-eqz v3, :cond_60

    .line 1954
    .line 1955
    instance-of v4, v3, Lz10;

    .line 1956
    .line 1957
    if-eqz v4, :cond_60

    .line 1958
    .line 1959
    move-object v10, v3

    .line 1960
    check-cast v10, Lz10;

    .line 1961
    .line 1962
    goto :goto_1e

    .line 1963
    :cond_60
    new-instance v10, Ly10;

    .line 1964
    .line 1965
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 1966
    .line 1967
    .line 1968
    iput-object v1, v10, Ly10;->f:Landroid/os/IBinder;

    .line 1969
    .line 1970
    :goto_1e
    iput-object v10, v2, Lmq0;->f:Lz10;

    .line 1971
    .line 1972
    return-object v2

    .line 1973
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_19
        :pswitch_d
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    :pswitch_data_2
    .packed-switch 0x1
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
    .end packed-switch

    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch

    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
    .end packed-switch

    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
    .end packed-switch

    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lkq0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Li82;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lf52;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Le52;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lw42;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lr42;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lq42;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lr12;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lww1;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Luw1;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lwu1;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lfc2;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lgd1;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lz2;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lcom/google/android/gms/common/api/Status;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lrh;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Ltq0;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lyc1;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lxc1;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lre0;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lsc1;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Loc1;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lrb1;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lq01;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lh31;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Ltx0;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Lsx0;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [Lwt0;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Lmq0;

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
