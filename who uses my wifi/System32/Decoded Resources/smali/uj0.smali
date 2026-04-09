.class public final Luj0;
.super Ljava/util/AbstractList;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final f:[Ljc;

.field public final g:[I


# direct methods
.method public constructor <init>([Ljc;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luj0;->f:[Ljc;

    .line 5
    .line 6
    iput-object p2, p0, Luj0;->g:[I

    .line 7
    .line 8
    return-void
.end method

.method public static a(JLac;ILjava/util/ArrayList;IILjava/util/ArrayList;)V
    .locals 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move/from16 v2, p5

    .line 8
    .line 9
    move/from16 v10, p6

    .line 10
    .line 11
    move-object/from16 v8, p7

    .line 12
    .line 13
    if-ge v2, v10, :cond_11

    .line 14
    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v10, :cond_1

    .line 17
    .line 18
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ljc;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljc;->g()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-lt v4, v1, :cond_0

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_1
    invoke-virtual/range {p4 .. p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljc;

    .line 44
    .line 45
    add-int/lit8 v4, v10, -0x1

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ljc;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljc;->g()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-ne v1, v6, :cond_2

    .line 58
    .line 59
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Ljc;

    .line 76
    .line 77
    move-object/from16 v21, v6

    .line 78
    .line 79
    move v6, v2

    .line 80
    move v2, v3

    .line 81
    move-object/from16 v3, v21

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    const/4 v6, -0x1

    .line 85
    move/from16 v21, v6

    .line 86
    .line 87
    move v6, v2

    .line 88
    move/from16 v2, v21

    .line 89
    .line 90
    :goto_1
    invoke-virtual {v3, v1}, Ljc;->b(I)B

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-virtual {v4, v1}, Ljc;->b(I)B

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    const-wide/16 v15, 0x2

    .line 99
    .line 100
    if-eq v7, v9, :cond_c

    .line 101
    .line 102
    add-int/lit8 v3, v6, 0x1

    .line 103
    .line 104
    const/4 v4, 0x1

    .line 105
    :goto_2
    if-ge v3, v10, :cond_4

    .line 106
    .line 107
    add-int/lit8 v7, v3, -0x1

    .line 108
    .line 109
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    check-cast v7, Ljc;

    .line 114
    .line 115
    invoke-virtual {v7, v1}, Ljc;->b(I)B

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    check-cast v9, Ljc;

    .line 124
    .line 125
    invoke-virtual {v9, v1}, Ljc;->b(I)B

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eq v7, v9, :cond_3

    .line 130
    .line 131
    add-int/lit8 v4, v4, 0x1

    .line 132
    .line 133
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    const-wide/16 v17, 0x4

    .line 137
    .line 138
    iget-wide v11, v0, Lac;->g:J

    .line 139
    .line 140
    div-long v11, v11, v17

    .line 141
    .line 142
    long-to-int v3, v11

    .line 143
    int-to-long v11, v3

    .line 144
    add-long v11, p0, v11

    .line 145
    .line 146
    add-long/2addr v11, v15

    .line 147
    mul-int/lit8 v3, v4, 0x2

    .line 148
    .line 149
    const-wide/16 v19, -0x1

    .line 150
    .line 151
    int-to-long v13, v3

    .line 152
    add-long/2addr v11, v13

    .line 153
    invoke-virtual {v0, v4}, Lac;->m(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v2}, Lac;->m(I)V

    .line 157
    .line 158
    .line 159
    move v2, v6

    .line 160
    :goto_3
    if-ge v2, v10, :cond_7

    .line 161
    .line 162
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Ljc;

    .line 167
    .line 168
    invoke-virtual {v3, v1}, Ljc;->b(I)B

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eq v2, v6, :cond_5

    .line 173
    .line 174
    add-int/lit8 v4, v2, -0x1

    .line 175
    .line 176
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    check-cast v4, Ljc;

    .line 181
    .line 182
    invoke-virtual {v4, v1}, Ljc;->b(I)B

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eq v3, v4, :cond_6

    .line 187
    .line 188
    :cond_5
    and-int/lit16 v3, v3, 0xff

    .line 189
    .line 190
    invoke-virtual {v0, v3}, Lac;->m(I)V

    .line 191
    .line 192
    .line 193
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_7
    new-instance v4, Lac;

    .line 197
    .line 198
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 199
    .line 200
    .line 201
    move v7, v6

    .line 202
    :goto_4
    if-ge v7, v10, :cond_b

    .line 203
    .line 204
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Ljc;

    .line 209
    .line 210
    invoke-virtual {v2, v1}, Ljc;->b(I)B

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    add-int/lit8 v3, v7, 0x1

    .line 215
    .line 216
    move v6, v3

    .line 217
    :goto_5
    if-ge v6, v10, :cond_9

    .line 218
    .line 219
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    check-cast v9, Ljc;

    .line 224
    .line 225
    invoke-virtual {v9, v1}, Ljc;->b(I)B

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    if-eq v2, v9, :cond_8

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_9
    move v6, v10

    .line 236
    :goto_6
    if-ne v3, v6, :cond_a

    .line 237
    .line 238
    add-int/lit8 v2, v1, 0x1

    .line 239
    .line 240
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    check-cast v3, Ljc;

    .line 245
    .line 246
    invoke-virtual {v3}, Ljc;->g()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-ne v2, v3, :cond_a

    .line 251
    .line 252
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Ljava/lang/Integer;

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    invoke-virtual {v0, v2}, Lac;->m(I)V

    .line 263
    .line 264
    .line 265
    move-object v9, v8

    .line 266
    move-wide v2, v11

    .line 267
    move v8, v6

    .line 268
    goto :goto_7

    .line 269
    :cond_a
    iget-wide v2, v4, Lac;->g:J

    .line 270
    .line 271
    div-long v2, v2, v17

    .line 272
    .line 273
    long-to-int v2, v2

    .line 274
    int-to-long v2, v2

    .line 275
    add-long/2addr v2, v11

    .line 276
    mul-long v2, v2, v19

    .line 277
    .line 278
    long-to-int v2, v2

    .line 279
    invoke-virtual {v0, v2}, Lac;->m(I)V

    .line 280
    .line 281
    .line 282
    add-int/lit8 v5, v1, 0x1

    .line 283
    .line 284
    move-object v9, v8

    .line 285
    move-wide v2, v11

    .line 286
    move v8, v6

    .line 287
    move-object/from16 v6, p4

    .line 288
    .line 289
    invoke-static/range {v2 .. v9}, Luj0;->a(JLac;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 290
    .line 291
    .line 292
    move-object v5, v6

    .line 293
    :goto_7
    move-wide v11, v2

    .line 294
    move v7, v8

    .line 295
    move-object v8, v9

    .line 296
    goto :goto_4

    .line 297
    :cond_b
    iget-wide v1, v4, Lac;->g:J

    .line 298
    .line 299
    invoke-virtual {v0, v4, v1, v2}, Lac;->k(Lac;J)V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :cond_c
    move-object v9, v8

    .line 304
    const-wide/16 v17, 0x4

    .line 305
    .line 306
    const-wide/16 v19, -0x1

    .line 307
    .line 308
    invoke-virtual {v3}, Ljc;->g()I

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    invoke-virtual {v4}, Ljc;->g()I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    const/4 v8, 0x0

    .line 321
    move v11, v1

    .line 322
    :goto_8
    if-ge v11, v7, :cond_d

    .line 323
    .line 324
    invoke-virtual {v3, v11}, Ljc;->b(I)B

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    invoke-virtual {v4, v11}, Ljc;->b(I)B

    .line 329
    .line 330
    .line 331
    move-result v13

    .line 332
    if-ne v12, v13, :cond_d

    .line 333
    .line 334
    add-int/lit8 v8, v8, 0x1

    .line 335
    .line 336
    add-int/lit8 v11, v11, 0x1

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_d
    iget-wide v11, v0, Lac;->g:J

    .line 340
    .line 341
    div-long v11, v11, v17

    .line 342
    .line 343
    long-to-int v4, v11

    .line 344
    int-to-long v11, v4

    .line 345
    add-long v11, p0, v11

    .line 346
    .line 347
    add-long/2addr v11, v15

    .line 348
    int-to-long v13, v8

    .line 349
    add-long/2addr v11, v13

    .line 350
    const-wide/16 v13, 0x1

    .line 351
    .line 352
    add-long/2addr v11, v13

    .line 353
    neg-int v4, v8

    .line 354
    invoke-virtual {v0, v4}, Lac;->m(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v2}, Lac;->m(I)V

    .line 358
    .line 359
    .line 360
    move v2, v1

    .line 361
    :goto_9
    add-int v4, v1, v8

    .line 362
    .line 363
    if-ge v2, v4, :cond_e

    .line 364
    .line 365
    invoke-virtual {v3, v2}, Ljc;->b(I)B

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    and-int/lit16 v4, v4, 0xff

    .line 370
    .line 371
    invoke-virtual {v0, v4}, Lac;->m(I)V

    .line 372
    .line 373
    .line 374
    add-int/lit8 v2, v2, 0x1

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_e
    add-int/lit8 v1, v6, 0x1

    .line 378
    .line 379
    if-ne v1, v10, :cond_10

    .line 380
    .line 381
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, Ljc;

    .line 386
    .line 387
    invoke-virtual {v1}, Ljc;->g()I

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-ne v4, v1, :cond_f

    .line 392
    .line 393
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    check-cast v1, Ljava/lang/Integer;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    invoke-virtual {v0, v1}, Lac;->m(I)V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :cond_f
    new-instance v0, Ljava/lang/AssertionError;

    .line 408
    .line 409
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :cond_10
    new-instance v3, Lac;

    .line 414
    .line 415
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 416
    .line 417
    .line 418
    iget-wide v1, v3, Lac;->g:J

    .line 419
    .line 420
    div-long v1, v1, v17

    .line 421
    .line 422
    long-to-int v1, v1

    .line 423
    int-to-long v1, v1

    .line 424
    add-long/2addr v1, v11

    .line 425
    mul-long v1, v1, v19

    .line 426
    .line 427
    long-to-int v1, v1

    .line 428
    invoke-virtual {v0, v1}, Lac;->m(I)V

    .line 429
    .line 430
    .line 431
    move-object v8, v9

    .line 432
    move v7, v10

    .line 433
    move-wide v1, v11

    .line 434
    invoke-static/range {v1 .. v8}, Luj0;->a(JLac;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 435
    .line 436
    .line 437
    iget-wide v1, v3, Lac;->g:J

    .line 438
    .line 439
    invoke-virtual {v0, v3, v1, v2}, Lac;->k(Lac;J)V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :cond_11
    new-instance v0, Ljava/lang/AssertionError;

    .line 444
    .line 445
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 446
    .line 447
    .line 448
    throw v0
.end method

.method public static varargs b([Ljc;)Luj0;
    .locals 15

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance p0, Luj0;

    .line 7
    .line 8
    new-array v0, v2, [Ljc;

    .line 9
    .line 10
    filled-new-array {v2, v1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {p0, v0, v1}, Luj0;-><init>([Ljc;[I)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    new-instance v10, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    move v0, v2

    .line 36
    :goto_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ge v0, v3, :cond_1

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move v0, v2

    .line 53
    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-ge v0, v1, :cond_2

    .line 58
    .line 59
    aget-object v1, p0, v0

    .line 60
    .line 61
    invoke-static {v7, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v10, v1, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljc;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljc;->g()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_d

    .line 86
    .line 87
    move v0, v2

    .line 88
    :goto_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-ge v0, v1, :cond_7

    .line 93
    .line 94
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljc;

    .line 99
    .line 100
    add-int/lit8 v3, v0, 0x1

    .line 101
    .line 102
    move v4, v3

    .line 103
    :goto_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-ge v4, v5, :cond_6

    .line 108
    .line 109
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, Ljc;

    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljc;->g()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-virtual {v5, v1, v6}, Ljc;->f(Ljc;I)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-nez v6, :cond_3

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_3
    invoke-virtual {v5}, Ljc;->g()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-virtual {v1}, Ljc;->g()I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-eq v6, v8, :cond_5

    .line 138
    .line 139
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-le v5, v6, :cond_4

    .line 160
    .line 161
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v1, "duplicate option: "

    .line 176
    .line 177
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p0

    .line 191
    :cond_6
    :goto_4
    move v0, v3

    .line 192
    goto :goto_2

    .line 193
    :cond_7
    new-instance v5, Lac;

    .line 194
    .line 195
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    const/4 v8, 0x0

    .line 199
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    const-wide/16 v3, 0x0

    .line 204
    .line 205
    const/4 v6, 0x0

    .line 206
    invoke-static/range {v3 .. v10}, Luj0;->a(JLac;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 207
    .line 208
    .line 209
    iget-wide v0, v5, Lac;->g:J

    .line 210
    .line 211
    const-wide/16 v3, 0x4

    .line 212
    .line 213
    div-long/2addr v0, v3

    .line 214
    long-to-int v0, v0

    .line 215
    new-array v1, v0, [I

    .line 216
    .line 217
    :goto_5
    if-ge v2, v0, :cond_b

    .line 218
    .line 219
    iget-wide v6, v5, Lac;->g:J

    .line 220
    .line 221
    cmp-long v8, v6, v3

    .line 222
    .line 223
    if-ltz v8, :cond_a

    .line 224
    .line 225
    iget-object v8, v5, Lac;->f:Lxt0;

    .line 226
    .line 227
    iget v9, v8, Lxt0;->b:I

    .line 228
    .line 229
    iget v10, v8, Lxt0;->c:I

    .line 230
    .line 231
    sub-int v11, v10, v9

    .line 232
    .line 233
    const/4 v12, 0x4

    .line 234
    if-ge v11, v12, :cond_8

    .line 235
    .line 236
    invoke-virtual {v5}, Lac;->c()B

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    and-int/lit16 v6, v6, 0xff

    .line 241
    .line 242
    shl-int/lit8 v6, v6, 0x18

    .line 243
    .line 244
    invoke-virtual {v5}, Lac;->c()B

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    and-int/lit16 v7, v7, 0xff

    .line 249
    .line 250
    shl-int/lit8 v7, v7, 0x10

    .line 251
    .line 252
    or-int/2addr v6, v7

    .line 253
    invoke-virtual {v5}, Lac;->c()B

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    and-int/lit16 v7, v7, 0xff

    .line 258
    .line 259
    shl-int/lit8 v7, v7, 0x8

    .line 260
    .line 261
    or-int/2addr v6, v7

    .line 262
    invoke-virtual {v5}, Lac;->c()B

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    and-int/lit16 v7, v7, 0xff

    .line 267
    .line 268
    or-int/2addr v6, v7

    .line 269
    goto :goto_7

    .line 270
    :cond_8
    iget-object v11, v8, Lxt0;->a:[B

    .line 271
    .line 272
    add-int/lit8 v12, v9, 0x1

    .line 273
    .line 274
    aget-byte v13, v11, v9

    .line 275
    .line 276
    and-int/lit16 v13, v13, 0xff

    .line 277
    .line 278
    shl-int/lit8 v13, v13, 0x18

    .line 279
    .line 280
    add-int/lit8 v14, v9, 0x2

    .line 281
    .line 282
    aget-byte v12, v11, v12

    .line 283
    .line 284
    and-int/lit16 v12, v12, 0xff

    .line 285
    .line 286
    shl-int/lit8 v12, v12, 0x10

    .line 287
    .line 288
    or-int/2addr v12, v13

    .line 289
    add-int/lit8 v13, v9, 0x3

    .line 290
    .line 291
    aget-byte v14, v11, v14

    .line 292
    .line 293
    and-int/lit16 v14, v14, 0xff

    .line 294
    .line 295
    shl-int/lit8 v14, v14, 0x8

    .line 296
    .line 297
    or-int/2addr v12, v14

    .line 298
    add-int/lit8 v9, v9, 0x4

    .line 299
    .line 300
    aget-byte v11, v11, v13

    .line 301
    .line 302
    and-int/lit16 v11, v11, 0xff

    .line 303
    .line 304
    or-int/2addr v11, v12

    .line 305
    sub-long/2addr v6, v3

    .line 306
    iput-wide v6, v5, Lac;->g:J

    .line 307
    .line 308
    if-ne v9, v10, :cond_9

    .line 309
    .line 310
    invoke-virtual {v8}, Lxt0;->a()Lxt0;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    iput-object v6, v5, Lac;->f:Lxt0;

    .line 315
    .line 316
    invoke-static {v8}, Lzt0;->r(Lxt0;)V

    .line 317
    .line 318
    .line 319
    :goto_6
    move v6, v11

    .line 320
    goto :goto_7

    .line 321
    :cond_9
    iput v9, v8, Lxt0;->b:I

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :goto_7
    aput v6, v1, v2

    .line 325
    .line 326
    add-int/lit8 v2, v2, 0x1

    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 330
    .line 331
    new-instance v0, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    const-string v1, "size < 4: "

    .line 334
    .line 335
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    iget-wide v1, v5, Lac;->g:J

    .line 339
    .line 340
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw p0

    .line 351
    :cond_b
    iget-wide v2, v5, Lac;->g:J

    .line 352
    .line 353
    const-wide/16 v4, 0x0

    .line 354
    .line 355
    cmp-long v0, v2, v4

    .line 356
    .line 357
    if-nez v0, :cond_c

    .line 358
    .line 359
    new-instance v0, Luj0;

    .line 360
    .line 361
    invoke-virtual {p0}, [Ljc;->clone()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    check-cast p0, [Ljc;

    .line 366
    .line 367
    invoke-direct {v0, p0, v1}, Luj0;-><init>([Ljc;[I)V

    .line 368
    .line 369
    .line 370
    return-object v0

    .line 371
    :cond_c
    new-instance p0, Ljava/lang/AssertionError;

    .line 372
    .line 373
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 374
    .line 375
    .line 376
    throw p0

    .line 377
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 378
    .line 379
    const-string v0, "the empty byte string is not a supported option"

    .line 380
    .line 381
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw p0
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Luj0;->f:[Ljc;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Luj0;->f:[Ljc;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method
