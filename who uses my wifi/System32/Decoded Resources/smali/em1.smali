.class public final Lem1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# instance fields
.field public final a:Lkz2;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljg1;

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:Lph4;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:J


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkz2;

    .line 5
    .line 6
    new-array p3, p3, [B

    .line 7
    .line 8
    invoke-direct {v0, p3}, Lkz2;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lem1;->a:Lkz2;

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    iput p3, p0, Lem1;->h:I

    .line 15
    .line 16
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Lem1;->q:J

    .line 22
    .line 23
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, Lem1;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    const/4 p3, -0x1

    .line 31
    iput p3, p0, Lem1;->o:I

    .line 32
    .line 33
    iput p3, p0, Lem1;->p:I

    .line 34
    .line 35
    iput-object p1, p0, Lem1;->c:Ljava/lang/String;

    .line 36
    .line 37
    iput p2, p0, Lem1;->d:I

    .line 38
    .line 39
    const-string p1, "video/mp2t"

    .line 40
    .line 41
    iput-object p1, p0, Lem1;->e:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lem1;->h:I

    .line 3
    .line 4
    iput v0, p0, Lem1;->i:I

    .line 5
    .line 6
    iput v0, p0, Lem1;->j:I

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, Lem1;->q:J

    .line 14
    .line 15
    iget-object v1, p0, Lem1;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lem1;->g:Ljg1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lkz2;->B()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-lez v2, :cond_37

    .line 15
    .line 16
    iget v2, v0, Lem1;->h:I

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    iget-object v4, v0, Lem1;->a:Lkz2;

    .line 21
    .line 22
    const/4 v5, 0x3

    .line 23
    const/4 v6, 0x2

    .line 24
    const/4 v7, 0x4

    .line 25
    const/4 v8, 0x1

    .line 26
    const/4 v9, 0x0

    .line 27
    if-eqz v2, :cond_33

    .line 28
    .line 29
    const/16 v11, 0x20

    .line 30
    .line 31
    const/4 v12, 0x0

    .line 32
    const/4 v15, 0x5

    .line 33
    if-eq v2, v8, :cond_2c

    .line 34
    .line 35
    if-eq v2, v6, :cond_2a

    .line 36
    .line 37
    const-wide/16 v17, 0x0

    .line 38
    .line 39
    const v19, -0x7fffffff

    .line 40
    .line 41
    .line 42
    const/16 v21, 0x7d00

    .line 43
    .line 44
    const v22, 0xac44

    .line 45
    .line 46
    .line 47
    const v23, 0xbb80

    .line 48
    .line 49
    .line 50
    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    if-eq v2, v5, :cond_18

    .line 56
    .line 57
    if-eq v2, v7, :cond_16

    .line 58
    .line 59
    if-eq v2, v15, :cond_3

    .line 60
    .line 61
    invoke-virtual {v1}, Lkz2;->B()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iget v3, v0, Lem1;->m:I

    .line 66
    .line 67
    iget v4, v0, Lem1;->i:I

    .line 68
    .line 69
    sub-int/2addr v3, v4

    .line 70
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iget-object v3, v0, Lem1;->g:Ljg1;

    .line 75
    .line 76
    invoke-interface {v3, v1, v2, v9}, Ljg1;->a(Lkz2;II)V

    .line 77
    .line 78
    .line 79
    iget v3, v0, Lem1;->i:I

    .line 80
    .line 81
    add-int/2addr v3, v2

    .line 82
    iput v3, v0, Lem1;->i:I

    .line 83
    .line 84
    iget v2, v0, Lem1;->m:I

    .line 85
    .line 86
    if-ne v3, v2, :cond_0

    .line 87
    .line 88
    iget-wide v2, v0, Lem1;->q:J

    .line 89
    .line 90
    cmp-long v2, v2, v25

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    move v2, v8

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    move v2, v9

    .line 97
    :goto_1
    invoke-static {v2}, Lzt0;->b0(Z)V

    .line 98
    .line 99
    .line 100
    iget-object v10, v0, Lem1;->g:Ljg1;

    .line 101
    .line 102
    iget-wide v11, v0, Lem1;->q:J

    .line 103
    .line 104
    iget v2, v0, Lem1;->n:I

    .line 105
    .line 106
    if-ne v2, v7, :cond_2

    .line 107
    .line 108
    move v13, v9

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    move v13, v8

    .line 111
    :goto_2
    iget v14, v0, Lem1;->m:I

    .line 112
    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    invoke-interface/range {v10 .. v16}, Ljg1;->c(JIIILig1;)V

    .line 117
    .line 118
    .line 119
    iget-wide v2, v0, Lem1;->q:J

    .line 120
    .line 121
    iget-wide v4, v0, Lem1;->k:J

    .line 122
    .line 123
    add-long/2addr v2, v4

    .line 124
    iput-wide v2, v0, Lem1;->q:J

    .line 125
    .line 126
    iput v9, v0, Lem1;->h:I

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    iget-object v2, v4, Lkz2;->a:[B

    .line 130
    .line 131
    iget v15, v0, Lem1;->p:I

    .line 132
    .line 133
    invoke-virtual {v0, v1, v2, v15}, Lem1;->f(Lkz2;[BI)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_0

    .line 138
    .line 139
    iget-object v2, v4, Lkz2;->a:[B

    .line 140
    .line 141
    invoke-static {v2}, Lqb1;->Q([B)Llg1;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    invoke-virtual {v15, v11}, Llg1;->r(I)I

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    move/from16 v27, v7

    .line 150
    .line 151
    sget-object v7, Lqb1;->m:[I

    .line 152
    .line 153
    invoke-static {v15, v7}, Lqb1;->O(Llg1;[I)I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    add-int/lit8 v16, v7, 0x1

    .line 158
    .line 159
    const v13, 0x40411bf2

    .line 160
    .line 161
    .line 162
    if-ne v11, v13, :cond_4

    .line 163
    .line 164
    move v11, v8

    .line 165
    goto :goto_3

    .line 166
    :cond_4
    move v11, v9

    .line 167
    :goto_3
    if-eqz v11, :cond_f

    .line 168
    .line 169
    invoke-virtual {v15}, Llg1;->q()Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-eqz v13, :cond_e

    .line 174
    .line 175
    add-int/lit8 v13, v7, -0x1

    .line 176
    .line 177
    aget-byte v19, v2, v13

    .line 178
    .line 179
    shl-int/lit8 v3, v19, 0x8

    .line 180
    .line 181
    aget-byte v7, v2, v7

    .line 182
    .line 183
    and-int/lit16 v7, v7, 0xff

    .line 184
    .line 185
    sget-object v19, Lv23;->a:Ljava/lang/String;

    .line 186
    .line 187
    const v19, 0xffff

    .line 188
    .line 189
    .line 190
    move/from16 v14, v19

    .line 191
    .line 192
    :goto_4
    if-ge v9, v13, :cond_5

    .line 193
    .line 194
    aget-byte v19, v2, v9

    .line 195
    .line 196
    invoke-static/range {v19 .. v19}, Ljava/lang/Byte;->toUnsignedInt(B)I

    .line 197
    .line 198
    .line 199
    move-result v19

    .line 200
    shr-int/lit8 v20, v19, 0x4

    .line 201
    .line 202
    shr-int/lit8 v24, v14, 0xc

    .line 203
    .line 204
    xor-int v10, v24, v20

    .line 205
    .line 206
    sget-object v20, Lv23;->h:[I

    .line 207
    .line 208
    and-int/lit16 v10, v10, 0xff

    .line 209
    .line 210
    aget v10, v20, v10

    .line 211
    .line 212
    shl-int/lit8 v14, v14, 0x4

    .line 213
    .line 214
    int-to-char v14, v14

    .line 215
    xor-int/2addr v10, v14

    .line 216
    int-to-char v10, v10

    .line 217
    and-int/lit8 v14, v19, 0xf

    .line 218
    .line 219
    shr-int/lit8 v19, v10, 0xc

    .line 220
    .line 221
    xor-int v14, v19, v14

    .line 222
    .line 223
    and-int/lit16 v14, v14, 0xff

    .line 224
    .line 225
    aget v14, v20, v14

    .line 226
    .line 227
    shl-int/lit8 v10, v10, 0x4

    .line 228
    .line 229
    int-to-char v10, v10

    .line 230
    xor-int/2addr v10, v14

    .line 231
    int-to-char v14, v10

    .line 232
    add-int/lit8 v9, v9, 0x1

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_5
    int-to-char v2, v3

    .line 236
    or-int/2addr v2, v7

    .line 237
    if-ne v2, v14, :cond_d

    .line 238
    .line 239
    invoke-virtual {v15, v6}, Llg1;->r(I)I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_8

    .line 244
    .line 245
    if-eq v2, v8, :cond_7

    .line 246
    .line 247
    if-ne v2, v6, :cond_6

    .line 248
    .line 249
    const/16 v13, 0x180

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_6
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    new-instance v3, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    add-int/lit8 v1, v1, 0x33

    .line 263
    .line 264
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 265
    .line 266
    .line 267
    const-string v1, "Unsupported base duration index in DTS UHD header: "

    .line 268
    .line 269
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {v12, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    throw v1

    .line 284
    :cond_7
    const/16 v13, 0x1e0

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_8
    const/16 v13, 0x200

    .line 288
    .line 289
    :goto_5
    invoke-virtual {v15, v5}, Llg1;->r(I)I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    add-int/2addr v2, v8

    .line 294
    invoke-virtual {v15, v6}, Llg1;->r(I)I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_b

    .line 299
    .line 300
    if-eq v3, v8, :cond_a

    .line 301
    .line 302
    if-ne v3, v6, :cond_9

    .line 303
    .line 304
    move/from16 v3, v23

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_9
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    new-instance v2, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    add-int/lit8 v1, v1, 0x30

    .line 318
    .line 319
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 320
    .line 321
    .line 322
    const-string v1, "Unsupported clock rate index in DTS UHD header: "

    .line 323
    .line 324
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v12, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    throw v1

    .line 339
    :cond_a
    move/from16 v3, v22

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_b
    move/from16 v3, v21

    .line 343
    .line 344
    :goto_6
    invoke-virtual {v15}, Llg1;->q()Z

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    if-eqz v7, :cond_c

    .line 349
    .line 350
    const/16 v7, 0x24

    .line 351
    .line 352
    invoke-virtual {v15, v7}, Llg1;->o(I)V

    .line 353
    .line 354
    .line 355
    :cond_c
    mul-int/2addr v13, v2

    .line 356
    invoke-virtual {v15, v6}, Llg1;->r(I)I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    shl-int v2, v8, v2

    .line 361
    .line 362
    mul-int v19, v3, v2

    .line 363
    .line 364
    int-to-long v2, v3

    .line 365
    int-to-long v6, v13

    .line 366
    const-wide/32 v32, 0xf4240

    .line 367
    .line 368
    .line 369
    sget-object v36, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 370
    .line 371
    move-wide/from16 v34, v2

    .line 372
    .line 373
    move-wide/from16 v30, v6

    .line 374
    .line 375
    invoke-static/range {v30 .. v36}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 376
    .line 377
    .line 378
    move-result-wide v2

    .line 379
    :goto_7
    move/from16 v9, v19

    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_d
    const-string v1, "CRC check failed"

    .line 383
    .line 384
    invoke-static {v12, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    throw v1

    .line 389
    :cond_e
    const-string v1, "Only supports full channel mask-based audio presentation"

    .line 390
    .line 391
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    throw v1

    .line 396
    :cond_f
    move-wide/from16 v2, v25

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :goto_8
    const/4 v6, 0x0

    .line 400
    const/4 v7, 0x0

    .line 401
    :goto_9
    if-ge v6, v11, :cond_10

    .line 402
    .line 403
    sget-object v6, Lqb1;->n:[I

    .line 404
    .line 405
    invoke-static {v15, v6}, Lqb1;->O(Llg1;[I)I

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    add-int/2addr v7, v6

    .line 410
    move v6, v8

    .line 411
    goto :goto_9

    .line 412
    :cond_10
    const/4 v6, 0x0

    .line 413
    :goto_a
    if-gtz v6, :cond_13

    .line 414
    .line 415
    iget-object v8, v0, Lem1;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 416
    .line 417
    if-eqz v11, :cond_11

    .line 418
    .line 419
    sget-object v10, Lqb1;->o:[I

    .line 420
    .line 421
    invoke-static {v15, v10}, Lqb1;->O(Llg1;[I)I

    .line 422
    .line 423
    .line 424
    move-result v10

    .line 425
    invoke-virtual {v8, v10}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 426
    .line 427
    .line 428
    :cond_11
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 429
    .line 430
    .line 431
    move-result v8

    .line 432
    if-eqz v8, :cond_12

    .line 433
    .line 434
    sget-object v8, Lqb1;->p:[I

    .line 435
    .line 436
    invoke-static {v15, v8}, Lqb1;->O(Llg1;[I)I

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    goto :goto_b

    .line 441
    :cond_12
    const/4 v8, 0x0

    .line 442
    :goto_b
    add-int/2addr v7, v8

    .line 443
    add-int/lit8 v6, v6, 0x1

    .line 444
    .line 445
    goto :goto_a

    .line 446
    :cond_13
    add-int v10, v16, v7

    .line 447
    .line 448
    new-instance v6, Lqe1;

    .line 449
    .line 450
    const-string v7, "audio/vnd.dts.uhd;profile=p2"

    .line 451
    .line 452
    const/4 v8, 0x2

    .line 453
    move-wide v11, v2

    .line 454
    invoke-direct/range {v6 .. v12}, Lqe1;-><init>(Ljava/lang/String;IIIJ)V

    .line 455
    .line 456
    .line 457
    iget v2, v0, Lem1;->n:I

    .line 458
    .line 459
    if-ne v2, v5, :cond_14

    .line 460
    .line 461
    invoke-virtual {v0, v6}, Lem1;->g(Lqe1;)V

    .line 462
    .line 463
    .line 464
    :cond_14
    iput v10, v0, Lem1;->m:I

    .line 465
    .line 466
    cmp-long v2, v11, v25

    .line 467
    .line 468
    if-nez v2, :cond_15

    .line 469
    .line 470
    move-wide/from16 v11, v17

    .line 471
    .line 472
    :cond_15
    iput-wide v11, v0, Lem1;->k:J

    .line 473
    .line 474
    const/4 v2, 0x0

    .line 475
    invoke-virtual {v4, v2}, Lkz2;->E(I)V

    .line 476
    .line 477
    .line 478
    iget-object v3, v0, Lem1;->g:Ljg1;

    .line 479
    .line 480
    iget v5, v0, Lem1;->p:I

    .line 481
    .line 482
    invoke-interface {v3, v4, v5, v2}, Ljg1;->a(Lkz2;II)V

    .line 483
    .line 484
    .line 485
    const/4 v2, 0x6

    .line 486
    iput v2, v0, Lem1;->h:I

    .line 487
    .line 488
    goto/16 :goto_0

    .line 489
    .line 490
    :cond_16
    const/4 v2, 0x6

    .line 491
    iget-object v3, v4, Lkz2;->a:[B

    .line 492
    .line 493
    invoke-virtual {v0, v1, v3, v2}, Lem1;->f(Lkz2;[BI)Z

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    if-eqz v2, :cond_0

    .line 498
    .line 499
    iget-object v2, v4, Lkz2;->a:[B

    .line 500
    .line 501
    invoke-static {v2}, Lqb1;->Q([B)Llg1;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-virtual {v2, v11}, Llg1;->o(I)V

    .line 506
    .line 507
    .line 508
    sget-object v3, Lqb1;->q:[I

    .line 509
    .line 510
    invoke-static {v2, v3}, Lqb1;->O(Llg1;[I)I

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    add-int/2addr v2, v8

    .line 515
    iput v2, v0, Lem1;->p:I

    .line 516
    .line 517
    iget v3, v0, Lem1;->i:I

    .line 518
    .line 519
    if-le v3, v2, :cond_17

    .line 520
    .line 521
    sub-int v2, v3, v2

    .line 522
    .line 523
    sub-int/2addr v3, v2

    .line 524
    iput v3, v0, Lem1;->i:I

    .line 525
    .line 526
    iget v3, v1, Lkz2;->b:I

    .line 527
    .line 528
    sub-int/2addr v3, v2

    .line 529
    invoke-virtual {v1, v3}, Lkz2;->E(I)V

    .line 530
    .line 531
    .line 532
    :cond_17
    iput v15, v0, Lem1;->h:I

    .line 533
    .line 534
    goto/16 :goto_0

    .line 535
    .line 536
    :cond_18
    move/from16 v27, v7

    .line 537
    .line 538
    iget-object v2, v4, Lkz2;->a:[B

    .line 539
    .line 540
    iget v7, v0, Lem1;->o:I

    .line 541
    .line 542
    invoke-virtual {v0, v1, v2, v7}, Lem1;->f(Lkz2;[BI)Z

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    if-eqz v2, :cond_0

    .line 547
    .line 548
    iget-object v2, v4, Lkz2;->a:[B

    .line 549
    .line 550
    invoke-static {v2}, Lqb1;->Q([B)Llg1;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const/16 v7, 0x28

    .line 555
    .line 556
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2, v6}, Llg1;->r(I)I

    .line 560
    .line 561
    .line 562
    move-result v7

    .line 563
    invoke-virtual {v2}, Llg1;->q()Z

    .line 564
    .line 565
    .line 566
    move-result v9

    .line 567
    if-eq v8, v9, :cond_19

    .line 568
    .line 569
    const/16 v10, 0x10

    .line 570
    .line 571
    goto :goto_c

    .line 572
    :cond_19
    const/16 v10, 0x14

    .line 573
    .line 574
    :goto_c
    if-eq v8, v9, :cond_1a

    .line 575
    .line 576
    move v9, v3

    .line 577
    goto :goto_d

    .line 578
    :cond_1a
    const/16 v9, 0xc

    .line 579
    .line 580
    :goto_d
    invoke-virtual {v2, v9}, Llg1;->o(I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2, v10}, Llg1;->r(I)I

    .line 584
    .line 585
    .line 586
    move-result v9

    .line 587
    add-int/lit8 v35, v9, 0x1

    .line 588
    .line 589
    invoke-virtual {v2}, Llg1;->q()Z

    .line 590
    .line 591
    .line 592
    move-result v9

    .line 593
    if-eqz v9, :cond_1f

    .line 594
    .line 595
    invoke-virtual {v2, v6}, Llg1;->r(I)I

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    invoke-virtual {v2, v5}, Llg1;->r(I)I

    .line 600
    .line 601
    .line 602
    move-result v13

    .line 603
    add-int/2addr v13, v8

    .line 604
    invoke-virtual {v2}, Llg1;->q()Z

    .line 605
    .line 606
    .line 607
    move-result v14

    .line 608
    if-eqz v14, :cond_1b

    .line 609
    .line 610
    const/16 v14, 0x24

    .line 611
    .line 612
    invoke-virtual {v2, v14}, Llg1;->o(I)V

    .line 613
    .line 614
    .line 615
    :cond_1b
    invoke-virtual {v2, v5}, Llg1;->r(I)I

    .line 616
    .line 617
    .line 618
    move-result v14

    .line 619
    add-int/2addr v14, v8

    .line 620
    invoke-virtual {v2, v5}, Llg1;->r(I)I

    .line 621
    .line 622
    .line 623
    move-result v5

    .line 624
    add-int/2addr v5, v8

    .line 625
    if-ne v14, v8, :cond_1e

    .line 626
    .line 627
    if-ne v5, v8, :cond_1e

    .line 628
    .line 629
    add-int/2addr v7, v8

    .line 630
    invoke-virtual {v2, v7}, Llg1;->r(I)I

    .line 631
    .line 632
    .line 633
    move-result v5

    .line 634
    const/4 v14, 0x0

    .line 635
    :goto_e
    if-ge v14, v7, :cond_1d

    .line 636
    .line 637
    shr-int v30, v5, v14

    .line 638
    .line 639
    and-int/lit8 v12, v30, 0x1

    .line 640
    .line 641
    if-ne v12, v8, :cond_1c

    .line 642
    .line 643
    invoke-virtual {v2, v3}, Llg1;->o(I)V

    .line 644
    .line 645
    .line 646
    :cond_1c
    add-int/lit8 v14, v14, 0x1

    .line 647
    .line 648
    const/4 v12, 0x0

    .line 649
    goto :goto_e

    .line 650
    :cond_1d
    const/16 v12, 0x200

    .line 651
    .line 652
    mul-int/lit16 v5, v13, 0x200

    .line 653
    .line 654
    invoke-virtual {v2}, Llg1;->q()Z

    .line 655
    .line 656
    .line 657
    move-result v7

    .line 658
    if-eqz v7, :cond_20

    .line 659
    .line 660
    invoke-virtual {v2, v6}, Llg1;->o(I)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2, v6}, Llg1;->r(I)I

    .line 664
    .line 665
    .line 666
    move-result v7

    .line 667
    add-int/2addr v7, v8

    .line 668
    shl-int/2addr v7, v6

    .line 669
    invoke-virtual {v2, v6}, Llg1;->r(I)I

    .line 670
    .line 671
    .line 672
    move-result v12

    .line 673
    add-int/2addr v12, v8

    .line 674
    const/4 v13, 0x0

    .line 675
    :goto_f
    if-ge v13, v12, :cond_20

    .line 676
    .line 677
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 678
    .line 679
    .line 680
    add-int/lit8 v13, v13, 0x1

    .line 681
    .line 682
    goto :goto_f

    .line 683
    :cond_1e
    const-string v1, "Multiple audio presentations or assets not supported"

    .line 684
    .line 685
    invoke-static {v1}, Llq1;->b(Ljava/lang/String;)Llq1;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    throw v1

    .line 690
    :cond_1f
    const/4 v5, 0x0

    .line 691
    const/4 v11, -0x1

    .line 692
    :cond_20
    invoke-virtual {v2, v10}, Llg1;->o(I)V

    .line 693
    .line 694
    .line 695
    const/16 v7, 0xc

    .line 696
    .line 697
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 698
    .line 699
    .line 700
    if-eqz v9, :cond_24

    .line 701
    .line 702
    invoke-virtual {v2}, Llg1;->q()Z

    .line 703
    .line 704
    .line 705
    move-result v7

    .line 706
    if-eqz v7, :cond_21

    .line 707
    .line 708
    move/from16 v7, v27

    .line 709
    .line 710
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 711
    .line 712
    .line 713
    :cond_21
    invoke-virtual {v2}, Llg1;->q()Z

    .line 714
    .line 715
    .line 716
    move-result v7

    .line 717
    if-eqz v7, :cond_22

    .line 718
    .line 719
    const/16 v7, 0x18

    .line 720
    .line 721
    invoke-virtual {v2, v7}, Llg1;->o(I)V

    .line 722
    .line 723
    .line 724
    :cond_22
    invoke-virtual {v2}, Llg1;->q()Z

    .line 725
    .line 726
    .line 727
    move-result v7

    .line 728
    if-eqz v7, :cond_23

    .line 729
    .line 730
    const/16 v7, 0xa

    .line 731
    .line 732
    invoke-virtual {v2, v7}, Llg1;->r(I)I

    .line 733
    .line 734
    .line 735
    move-result v7

    .line 736
    add-int/2addr v7, v8

    .line 737
    invoke-virtual {v2, v7}, Llg1;->x(I)V

    .line 738
    .line 739
    .line 740
    :cond_23
    invoke-virtual {v2, v15}, Llg1;->o(I)V

    .line 741
    .line 742
    .line 743
    sget-object v7, Lqb1;->l:[I

    .line 744
    .line 745
    const/4 v10, 0x4

    .line 746
    invoke-virtual {v2, v10}, Llg1;->r(I)I

    .line 747
    .line 748
    .line 749
    move-result v10

    .line 750
    aget v19, v7, v10

    .line 751
    .line 752
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    add-int/lit8 v14, v2, 0x1

    .line 757
    .line 758
    move/from16 v33, v14

    .line 759
    .line 760
    :goto_10
    move/from16 v34, v19

    .line 761
    .line 762
    goto :goto_11

    .line 763
    :cond_24
    const/16 v33, -0x1

    .line 764
    .line 765
    goto :goto_10

    .line 766
    :goto_11
    if-eqz v9, :cond_28

    .line 767
    .line 768
    if-eqz v11, :cond_27

    .line 769
    .line 770
    if-eq v11, v8, :cond_26

    .line 771
    .line 772
    if-ne v11, v6, :cond_25

    .line 773
    .line 774
    move/from16 v2, v23

    .line 775
    .line 776
    goto :goto_12

    .line 777
    :cond_25
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 782
    .line 783
    .line 784
    move-result v1

    .line 785
    new-instance v2, Ljava/lang/StringBuilder;

    .line 786
    .line 787
    add-int/lit8 v1, v1, 0x33

    .line 788
    .line 789
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 790
    .line 791
    .line 792
    const-string v1, "Unsupported reference clock code in DTS HD header: "

    .line 793
    .line 794
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    const/4 v2, 0x0

    .line 805
    invoke-static {v2, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    throw v1

    .line 810
    :cond_26
    move/from16 v2, v22

    .line 811
    .line 812
    goto :goto_12

    .line 813
    :cond_27
    move/from16 v2, v21

    .line 814
    .line 815
    :goto_12
    int-to-long v6, v5

    .line 816
    int-to-long v10, v2

    .line 817
    sget-object v12, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 818
    .line 819
    const-wide/32 v8, 0xf4240

    .line 820
    .line 821
    .line 822
    invoke-static/range {v6 .. v12}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 823
    .line 824
    .line 825
    move-result-wide v2

    .line 826
    move-wide/from16 v36, v2

    .line 827
    .line 828
    goto :goto_13

    .line 829
    :cond_28
    move-wide/from16 v36, v25

    .line 830
    .line 831
    :goto_13
    new-instance v31, Lqe1;

    .line 832
    .line 833
    const-string v32, "audio/vnd.dts.hd;profile=lbr"

    .line 834
    .line 835
    invoke-direct/range {v31 .. v37}, Lqe1;-><init>(Ljava/lang/String;IIIJ)V

    .line 836
    .line 837
    .line 838
    move-object/from16 v2, v31

    .line 839
    .line 840
    move/from16 v9, v35

    .line 841
    .line 842
    invoke-virtual {v0, v2}, Lem1;->g(Lqe1;)V

    .line 843
    .line 844
    .line 845
    iput v9, v0, Lem1;->m:I

    .line 846
    .line 847
    cmp-long v2, v36, v25

    .line 848
    .line 849
    if-nez v2, :cond_29

    .line 850
    .line 851
    move-wide/from16 v2, v17

    .line 852
    .line 853
    goto :goto_14

    .line 854
    :cond_29
    move-wide/from16 v2, v36

    .line 855
    .line 856
    :goto_14
    iput-wide v2, v0, Lem1;->k:J

    .line 857
    .line 858
    const/4 v2, 0x0

    .line 859
    invoke-virtual {v4, v2}, Lkz2;->E(I)V

    .line 860
    .line 861
    .line 862
    iget-object v3, v0, Lem1;->g:Ljg1;

    .line 863
    .line 864
    iget v5, v0, Lem1;->o:I

    .line 865
    .line 866
    invoke-interface {v3, v4, v5, v2}, Ljg1;->a(Lkz2;II)V

    .line 867
    .line 868
    .line 869
    const/4 v2, 0x6

    .line 870
    iput v2, v0, Lem1;->h:I

    .line 871
    .line 872
    goto/16 :goto_0

    .line 873
    .line 874
    :cond_2a
    const/16 v7, 0xc

    .line 875
    .line 876
    iget-object v2, v4, Lkz2;->a:[B

    .line 877
    .line 878
    const/4 v6, 0x7

    .line 879
    invoke-virtual {v0, v1, v2, v6}, Lem1;->f(Lkz2;[BI)Z

    .line 880
    .line 881
    .line 882
    move-result v2

    .line 883
    if-eqz v2, :cond_0

    .line 884
    .line 885
    iget-object v2, v4, Lkz2;->a:[B

    .line 886
    .line 887
    invoke-static {v2}, Lqb1;->Q([B)Llg1;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    const/16 v4, 0x2a

    .line 892
    .line 893
    invoke-virtual {v2, v4}, Llg1;->o(I)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v2}, Llg1;->q()Z

    .line 897
    .line 898
    .line 899
    move-result v4

    .line 900
    if-eq v8, v4, :cond_2b

    .line 901
    .line 902
    goto :goto_15

    .line 903
    :cond_2b
    move v3, v7

    .line 904
    :goto_15
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    add-int/2addr v2, v8

    .line 909
    iput v2, v0, Lem1;->o:I

    .line 910
    .line 911
    iput v5, v0, Lem1;->h:I

    .line 912
    .line 913
    goto/16 :goto_0

    .line 914
    .line 915
    :cond_2c
    iget-object v2, v4, Lkz2;->a:[B

    .line 916
    .line 917
    const/16 v3, 0x12

    .line 918
    .line 919
    invoke-virtual {v0, v1, v2, v3}, Lem1;->f(Lkz2;[BI)Z

    .line 920
    .line 921
    .line 922
    move-result v2

    .line 923
    if-eqz v2, :cond_0

    .line 924
    .line 925
    iget-object v2, v4, Lkz2;->a:[B

    .line 926
    .line 927
    iget-object v5, v0, Lem1;->l:Lph4;

    .line 928
    .line 929
    const/16 v7, 0x3c

    .line 930
    .line 931
    if-nez v5, :cond_2f

    .line 932
    .line 933
    iget-object v5, v0, Lem1;->f:Ljava/lang/String;

    .line 934
    .line 935
    invoke-static {v2}, Lqb1;->Q([B)Llg1;

    .line 936
    .line 937
    .line 938
    move-result-object v9

    .line 939
    invoke-virtual {v9, v7}, Llg1;->o(I)V

    .line 940
    .line 941
    .line 942
    const/4 v10, 0x6

    .line 943
    invoke-virtual {v9, v10}, Llg1;->r(I)I

    .line 944
    .line 945
    .line 946
    move-result v12

    .line 947
    sget-object v10, Lqb1;->i:[I

    .line 948
    .line 949
    aget v10, v10, v12

    .line 950
    .line 951
    const/4 v12, 0x4

    .line 952
    invoke-virtual {v9, v12}, Llg1;->r(I)I

    .line 953
    .line 954
    .line 955
    move-result v13

    .line 956
    sget-object v12, Lqb1;->j:[I

    .line 957
    .line 958
    aget v12, v12, v13

    .line 959
    .line 960
    invoke-virtual {v9, v15}, Llg1;->r(I)I

    .line 961
    .line 962
    .line 963
    move-result v13

    .line 964
    const/16 v14, 0x1d

    .line 965
    .line 966
    if-lt v13, v14, :cond_2d

    .line 967
    .line 968
    const/4 v13, -0x1

    .line 969
    :goto_16
    const/16 v14, 0xa

    .line 970
    .line 971
    goto :goto_17

    .line 972
    :cond_2d
    sget-object v14, Lqb1;->k:[I

    .line 973
    .line 974
    aget v13, v14, v13

    .line 975
    .line 976
    mul-int/lit16 v13, v13, 0x3e8

    .line 977
    .line 978
    div-int/2addr v13, v6

    .line 979
    goto :goto_16

    .line 980
    :goto_17
    invoke-virtual {v9, v14}, Llg1;->o(I)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v9, v6}, Llg1;->r(I)I

    .line 984
    .line 985
    .line 986
    move-result v9

    .line 987
    if-lez v9, :cond_2e

    .line 988
    .line 989
    move v9, v8

    .line 990
    goto :goto_18

    .line 991
    :cond_2e
    const/4 v9, 0x0

    .line 992
    :goto_18
    add-int/2addr v10, v9

    .line 993
    new-instance v9, Lgg4;

    .line 994
    .line 995
    invoke-direct {v9}, Lgg4;-><init>()V

    .line 996
    .line 997
    .line 998
    iput-object v5, v9, Lgg4;->a:Ljava/lang/String;

    .line 999
    .line 1000
    const-string v5, "video/mp2t"

    .line 1001
    .line 1002
    invoke-virtual {v9, v5}, Lgg4;->d(Ljava/lang/String;)V

    .line 1003
    .line 1004
    .line 1005
    const-string v5, "audio/vnd.dts"

    .line 1006
    .line 1007
    invoke-virtual {v9, v5}, Lgg4;->e(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    iput v13, v9, Lgg4;->g:I

    .line 1011
    .line 1012
    iput v10, v9, Lgg4;->D:I

    .line 1013
    .line 1014
    iput v12, v9, Lgg4;->E:I

    .line 1015
    .line 1016
    const/4 v5, 0x0

    .line 1017
    iput-object v5, v9, Lgg4;->p:Lie4;

    .line 1018
    .line 1019
    iget-object v5, v0, Lem1;->c:Ljava/lang/String;

    .line 1020
    .line 1021
    iput-object v5, v9, Lgg4;->d:Ljava/lang/String;

    .line 1022
    .line 1023
    iget v5, v0, Lem1;->d:I

    .line 1024
    .line 1025
    iput v5, v9, Lgg4;->f:I

    .line 1026
    .line 1027
    new-instance v5, Lph4;

    .line 1028
    .line 1029
    invoke-direct {v5, v9}, Lph4;-><init>(Lgg4;)V

    .line 1030
    .line 1031
    .line 1032
    iput-object v5, v0, Lem1;->l:Lph4;

    .line 1033
    .line 1034
    iget-object v9, v0, Lem1;->g:Ljg1;

    .line 1035
    .line 1036
    invoke-interface {v9, v5}, Ljg1;->d(Lph4;)V

    .line 1037
    .line 1038
    .line 1039
    :cond_2f
    invoke-static {v2}, Lqb1;->D([B)I

    .line 1040
    .line 1041
    .line 1042
    move-result v5

    .line 1043
    iput v5, v0, Lem1;->m:I

    .line 1044
    .line 1045
    const/16 v29, 0x0

    .line 1046
    .line 1047
    aget-byte v5, v2, v29

    .line 1048
    .line 1049
    const/4 v9, -0x2

    .line 1050
    if-eq v5, v9, :cond_32

    .line 1051
    .line 1052
    const/4 v9, -0x1

    .line 1053
    if-eq v5, v9, :cond_31

    .line 1054
    .line 1055
    const/16 v9, 0x1f

    .line 1056
    .line 1057
    if-eq v5, v9, :cond_30

    .line 1058
    .line 1059
    const/16 v27, 0x4

    .line 1060
    .line 1061
    aget-byte v5, v2, v27

    .line 1062
    .line 1063
    and-int/2addr v5, v8

    .line 1064
    const/16 v28, 0x6

    .line 1065
    .line 1066
    shl-int/lit8 v5, v5, 0x6

    .line 1067
    .line 1068
    aget-byte v2, v2, v15

    .line 1069
    .line 1070
    :goto_19
    and-int/lit16 v2, v2, 0xfc

    .line 1071
    .line 1072
    :goto_1a
    shr-int/2addr v2, v6

    .line 1073
    or-int/2addr v2, v5

    .line 1074
    goto :goto_1c

    .line 1075
    :cond_30
    const/16 v27, 0x4

    .line 1076
    .line 1077
    const/16 v28, 0x6

    .line 1078
    .line 1079
    aget-byte v5, v2, v15

    .line 1080
    .line 1081
    const/16 v17, 0x7

    .line 1082
    .line 1083
    and-int/lit8 v5, v5, 0x7

    .line 1084
    .line 1085
    shl-int/lit8 v5, v5, 0x4

    .line 1086
    .line 1087
    aget-byte v2, v2, v28

    .line 1088
    .line 1089
    :goto_1b
    and-int/2addr v2, v7

    .line 1090
    goto :goto_1a

    .line 1091
    :cond_31
    const/16 v17, 0x7

    .line 1092
    .line 1093
    const/16 v27, 0x4

    .line 1094
    .line 1095
    aget-byte v5, v2, v27

    .line 1096
    .line 1097
    and-int/lit8 v5, v5, 0x7

    .line 1098
    .line 1099
    shl-int/lit8 v5, v5, 0x4

    .line 1100
    .line 1101
    aget-byte v2, v2, v17

    .line 1102
    .line 1103
    goto :goto_1b

    .line 1104
    :cond_32
    const/16 v27, 0x4

    .line 1105
    .line 1106
    aget-byte v5, v2, v15

    .line 1107
    .line 1108
    and-int/2addr v5, v8

    .line 1109
    const/16 v28, 0x6

    .line 1110
    .line 1111
    shl-int/lit8 v5, v5, 0x6

    .line 1112
    .line 1113
    aget-byte v2, v2, v27

    .line 1114
    .line 1115
    goto :goto_19

    .line 1116
    :goto_1c
    add-int/2addr v2, v8

    .line 1117
    iget-object v5, v0, Lem1;->l:Lph4;

    .line 1118
    .line 1119
    iget v5, v5, Lph4;->F:I

    .line 1120
    .line 1121
    mul-int/2addr v2, v11

    .line 1122
    int-to-long v6, v2

    .line 1123
    invoke-static {v5, v6, v7}, Lv23;->s(IJ)J

    .line 1124
    .line 1125
    .line 1126
    move-result-wide v5

    .line 1127
    invoke-static {v5, v6}, Lzt0;->y(J)I

    .line 1128
    .line 1129
    .line 1130
    move-result v2

    .line 1131
    int-to-long v5, v2

    .line 1132
    iput-wide v5, v0, Lem1;->k:J

    .line 1133
    .line 1134
    const/4 v2, 0x0

    .line 1135
    invoke-virtual {v4, v2}, Lkz2;->E(I)V

    .line 1136
    .line 1137
    .line 1138
    iget-object v5, v0, Lem1;->g:Ljg1;

    .line 1139
    .line 1140
    invoke-interface {v5, v4, v3, v2}, Ljg1;->a(Lkz2;II)V

    .line 1141
    .line 1142
    .line 1143
    const/4 v2, 0x6

    .line 1144
    iput v2, v0, Lem1;->h:I

    .line 1145
    .line 1146
    goto/16 :goto_0

    .line 1147
    .line 1148
    :cond_33
    invoke-virtual {v1}, Lkz2;->B()I

    .line 1149
    .line 1150
    .line 1151
    move-result v2

    .line 1152
    if-lez v2, :cond_0

    .line 1153
    .line 1154
    iget v2, v0, Lem1;->j:I

    .line 1155
    .line 1156
    shl-int/2addr v2, v3

    .line 1157
    iput v2, v0, Lem1;->j:I

    .line 1158
    .line 1159
    invoke-virtual {v1}, Lkz2;->K()I

    .line 1160
    .line 1161
    .line 1162
    move-result v7

    .line 1163
    or-int/2addr v2, v7

    .line 1164
    iput v2, v0, Lem1;->j:I

    .line 1165
    .line 1166
    invoke-static {v2}, Lqb1;->w(I)I

    .line 1167
    .line 1168
    .line 1169
    move-result v2

    .line 1170
    iput v2, v0, Lem1;->n:I

    .line 1171
    .line 1172
    if-eqz v2, :cond_33

    .line 1173
    .line 1174
    iget-object v3, v4, Lkz2;->a:[B

    .line 1175
    .line 1176
    iget v4, v0, Lem1;->j:I

    .line 1177
    .line 1178
    shr-int/lit8 v7, v4, 0x18

    .line 1179
    .line 1180
    and-int/lit16 v7, v7, 0xff

    .line 1181
    .line 1182
    int-to-byte v7, v7

    .line 1183
    const/16 v29, 0x0

    .line 1184
    .line 1185
    aput-byte v7, v3, v29

    .line 1186
    .line 1187
    shr-int/lit8 v7, v4, 0x10

    .line 1188
    .line 1189
    and-int/lit16 v7, v7, 0xff

    .line 1190
    .line 1191
    int-to-byte v7, v7

    .line 1192
    aput-byte v7, v3, v8

    .line 1193
    .line 1194
    shr-int/lit8 v7, v4, 0x8

    .line 1195
    .line 1196
    and-int/lit16 v7, v7, 0xff

    .line 1197
    .line 1198
    int-to-byte v7, v7

    .line 1199
    aput-byte v7, v3, v6

    .line 1200
    .line 1201
    and-int/lit16 v4, v4, 0xff

    .line 1202
    .line 1203
    int-to-byte v4, v4

    .line 1204
    aput-byte v4, v3, v5

    .line 1205
    .line 1206
    const/4 v7, 0x4

    .line 1207
    iput v7, v0, Lem1;->i:I

    .line 1208
    .line 1209
    const/4 v9, 0x0

    .line 1210
    iput v9, v0, Lem1;->j:I

    .line 1211
    .line 1212
    if-eq v2, v5, :cond_36

    .line 1213
    .line 1214
    if-ne v2, v7, :cond_34

    .line 1215
    .line 1216
    goto :goto_1d

    .line 1217
    :cond_34
    if-ne v2, v8, :cond_35

    .line 1218
    .line 1219
    iput v8, v0, Lem1;->h:I

    .line 1220
    .line 1221
    goto/16 :goto_0

    .line 1222
    .line 1223
    :cond_35
    iput v6, v0, Lem1;->h:I

    .line 1224
    .line 1225
    goto/16 :goto_0

    .line 1226
    .line 1227
    :cond_36
    :goto_1d
    iput v7, v0, Lem1;->h:I

    .line 1228
    .line 1229
    goto/16 :goto_0

    .line 1230
    .line 1231
    :cond_37
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lem1;->q:J

    .line 2
    .line 3
    return-void
.end method

.method public final e(Lnf1;Lin1;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lin1;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lin1;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lin1;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lem1;->f:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lin1;->b()V

    .line 12
    .line 13
    .line 14
    iget p2, p2, Lin1;->d:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-interface {p1, p2, v0}, Lnf1;->z(II)Ljg1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lem1;->g:Ljg1;

    .line 22
    .line 23
    return-void
.end method

.method public final f(Lkz2;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lkz2;->B()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lem1;->i:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lem1;->i:I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0}, Lkz2;->H([BII)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lem1;->i:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Lem1;->i:I

    .line 22
    .line 23
    if-ne p1, p3, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final g(Lqe1;)V
    .locals 4

    .line 1
    iget v0, p1, Lqe1;->b:I

    .line 2
    .line 3
    iget-object v1, p1, Lqe1;->a:Ljava/lang/String;

    .line 4
    .line 5
    const v2, -0x7fffffff

    .line 6
    .line 7
    .line 8
    if-eq v0, v2, :cond_3

    .line 9
    .line 10
    iget p1, p1, Lqe1;->c:I

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-ne p1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v2, p0, Lem1;->l:Lph4;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget v3, v2, Lph4;->E:I

    .line 21
    .line 22
    if-ne p1, v3, :cond_1

    .line 23
    .line 24
    iget v3, v2, Lph4;->F:I

    .line 25
    .line 26
    if-ne v0, v3, :cond_1

    .line 27
    .line 28
    iget-object v2, v2, Lph4;->m:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object v2, p0, Lem1;->l:Lph4;

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    new-instance v2, Lgg4;

    .line 41
    .line 42
    invoke-direct {v2}, Lgg4;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    new-instance v3, Lgg4;

    .line 47
    .line 48
    invoke-direct {v3, v2}, Lgg4;-><init>(Lph4;)V

    .line 49
    .line 50
    .line 51
    move-object v2, v3

    .line 52
    :goto_0
    iget-object v3, p0, Lem1;->f:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v3, v2, Lgg4;->a:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, p0, Lem1;->e:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Lgg4;->d(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v1}, Lgg4;->e(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iput p1, v2, Lgg4;->D:I

    .line 65
    .line 66
    iput v0, v2, Lgg4;->E:I

    .line 67
    .line 68
    iget-object p1, p0, Lem1;->c:Ljava/lang/String;

    .line 69
    .line 70
    iput-object p1, v2, Lgg4;->d:Ljava/lang/String;

    .line 71
    .line 72
    iget p1, p0, Lem1;->d:I

    .line 73
    .line 74
    iput p1, v2, Lgg4;->f:I

    .line 75
    .line 76
    new-instance p1, Lph4;

    .line 77
    .line 78
    invoke-direct {p1, v2}, Lph4;-><init>(Lgg4;)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lem1;->l:Lph4;

    .line 82
    .line 83
    iget-object v0, p0, Lem1;->g:Ljg1;

    .line 84
    .line 85
    invoke-interface {v0, p1}, Ljg1;->d(Lph4;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_1
    return-void
.end method
