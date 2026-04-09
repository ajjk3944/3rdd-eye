.class public final Lwm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljn1;


# instance fields
.field public final a:Lgm1;

.field public final b:Llg1;

.field public c:I

.field public d:I

.field public e:Lx13;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z


# direct methods
.method public constructor <init>(Lgm1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwm1;->a:Lgm1;

    .line 5
    .line 6
    new-instance p1, Llg1;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, Llg1;-><init>(I[B)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lwm1;->b:Llg1;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lwm1;->c:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(ILkz2;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lwm1;->e:Lx13;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    iget-object v3, v0, Lwm1;->a:Lgm1;

    .line 13
    .line 14
    const/4 v4, -0x1

    .line 15
    const/4 v5, 0x2

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x1

    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    iget v2, v0, Lwm1;->c:I

    .line 21
    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    if-eq v2, v7, :cond_3

    .line 25
    .line 26
    if-eq v2, v5, :cond_2

    .line 27
    .line 28
    iget v2, v0, Lwm1;->j:I

    .line 29
    .line 30
    if-eq v2, v4, :cond_0

    .line 31
    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    new-instance v9, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    add-int/lit8 v8, v8, 0x30

    .line 43
    .line 44
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const-string v8, "Unexpected start indicator: expected "

    .line 48
    .line 49
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v2, " more bytes"

    .line 56
    .line 57
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    iget v2, v1, Lkz2;->c:I

    .line 68
    .line 69
    if-nez v2, :cond_1

    .line 70
    .line 71
    move v2, v7

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move v2, v6

    .line 74
    :goto_0
    invoke-interface {v3, v2}, Lgm1;->c(Z)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const-string v2, "Unexpected start indicator reading extended header"

    .line 79
    .line 80
    invoke-static {v2}, La30;->x(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    :goto_1
    iput v7, v0, Lwm1;->c:I

    .line 84
    .line 85
    iput v6, v0, Lwm1;->d:I

    .line 86
    .line 87
    :cond_4
    move/from16 v2, p1

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1}, Lkz2;->B()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-lez v8, :cond_12

    .line 94
    .line 95
    iget v8, v0, Lwm1;->c:I

    .line 96
    .line 97
    if-eqz v8, :cond_11

    .line 98
    .line 99
    iget-object v9, v0, Lwm1;->b:Llg1;

    .line 100
    .line 101
    if-eq v8, v7, :cond_c

    .line 102
    .line 103
    if-eq v8, v5, :cond_8

    .line 104
    .line 105
    invoke-virtual {v1}, Lkz2;->B()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    iget v9, v0, Lwm1;->j:I

    .line 110
    .line 111
    if-ne v9, v4, :cond_5

    .line 112
    .line 113
    move v9, v6

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    sub-int v9, v8, v9

    .line 116
    .line 117
    :goto_3
    if-lez v9, :cond_6

    .line 118
    .line 119
    sub-int/2addr v8, v9

    .line 120
    iget v9, v1, Lkz2;->b:I

    .line 121
    .line 122
    add-int/2addr v9, v8

    .line 123
    invoke-virtual {v1, v9}, Lkz2;->C(I)V

    .line 124
    .line 125
    .line 126
    :cond_6
    invoke-interface {v3, v1}, Lgm1;->b(Lkz2;)V

    .line 127
    .line 128
    .line 129
    iget v9, v0, Lwm1;->j:I

    .line 130
    .line 131
    if-eq v9, v4, :cond_7

    .line 132
    .line 133
    sub-int/2addr v9, v8

    .line 134
    iput v9, v0, Lwm1;->j:I

    .line 135
    .line 136
    if-nez v9, :cond_7

    .line 137
    .line 138
    invoke-interface {v3, v6}, Lgm1;->c(Z)V

    .line 139
    .line 140
    .line 141
    iput v7, v0, Lwm1;->c:I

    .line 142
    .line 143
    iput v6, v0, Lwm1;->d:I

    .line 144
    .line 145
    :cond_7
    move v8, v5

    .line 146
    goto/16 :goto_9

    .line 147
    .line 148
    :cond_8
    const/16 v8, 0xa

    .line 149
    .line 150
    iget v11, v0, Lwm1;->i:I

    .line 151
    .line 152
    invoke-static {v8, v11}, Ljava/lang/Math;->min(II)I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    iget-object v11, v9, Llg1;->a:[B

    .line 157
    .line 158
    invoke-virtual {v0, v1, v11, v8}, Lwm1;->c(Lkz2;[BI)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-eqz v8, :cond_7

    .line 163
    .line 164
    const/4 v8, 0x0

    .line 165
    iget v11, v0, Lwm1;->i:I

    .line 166
    .line 167
    invoke-virtual {v0, v1, v8, v11}, Lwm1;->c(Lkz2;[BI)Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-eqz v8, :cond_7

    .line 172
    .line 173
    invoke-virtual {v9, v6}, Llg1;->l(I)V

    .line 174
    .line 175
    .line 176
    iget-boolean v8, v0, Lwm1;->f:Z

    .line 177
    .line 178
    const/4 v11, 0x3

    .line 179
    const/4 v12, 0x4

    .line 180
    if-eqz v8, :cond_a

    .line 181
    .line 182
    invoke-virtual {v9, v12}, Llg1;->o(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9, v11}, Llg1;->r(I)I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    int-to-long v13, v8

    .line 190
    invoke-virtual {v9, v7}, Llg1;->o(I)V

    .line 191
    .line 192
    .line 193
    const/16 v8, 0xf

    .line 194
    .line 195
    invoke-virtual {v9, v8}, Llg1;->r(I)I

    .line 196
    .line 197
    .line 198
    move-result v15

    .line 199
    shl-int/2addr v15, v8

    .line 200
    invoke-virtual {v9, v7}, Llg1;->o(I)V

    .line 201
    .line 202
    .line 203
    const/16 p1, 0x1e

    .line 204
    .line 205
    invoke-virtual {v9, v8}, Llg1;->r(I)I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    int-to-long v4, v10

    .line 210
    invoke-virtual {v9, v7}, Llg1;->o(I)V

    .line 211
    .line 212
    .line 213
    iget-boolean v10, v0, Lwm1;->h:Z

    .line 214
    .line 215
    if-nez v10, :cond_9

    .line 216
    .line 217
    iget-boolean v10, v0, Lwm1;->g:Z

    .line 218
    .line 219
    if-eqz v10, :cond_9

    .line 220
    .line 221
    invoke-virtual {v9, v12}, Llg1;->o(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9, v11}, Llg1;->r(I)I

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    move-wide/from16 v16, v13

    .line 229
    .line 230
    int-to-long v12, v10

    .line 231
    shl-long v12, v12, p1

    .line 232
    .line 233
    invoke-virtual {v9, v7}, Llg1;->o(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v9, v8}, Llg1;->r(I)I

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    shl-int/2addr v10, v8

    .line 241
    invoke-virtual {v9, v7}, Llg1;->o(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9, v8}, Llg1;->r(I)I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    move-wide/from16 v18, v12

    .line 249
    .line 250
    int-to-long v11, v8

    .line 251
    invoke-virtual {v9, v7}, Llg1;->o(I)V

    .line 252
    .line 253
    .line 254
    iget-object v8, v0, Lwm1;->e:Lx13;

    .line 255
    .line 256
    int-to-long v9, v10

    .line 257
    or-long v9, v18, v9

    .line 258
    .line 259
    or-long/2addr v9, v11

    .line 260
    invoke-virtual {v8, v9, v10}, Lx13;->c(J)J

    .line 261
    .line 262
    .line 263
    iput-boolean v7, v0, Lwm1;->h:Z

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_9
    move-wide/from16 v16, v13

    .line 267
    .line 268
    :goto_4
    shl-long v8, v16, p1

    .line 269
    .line 270
    int-to-long v10, v15

    .line 271
    or-long/2addr v8, v10

    .line 272
    or-long/2addr v4, v8

    .line 273
    iget-object v8, v0, Lwm1;->e:Lx13;

    .line 274
    .line 275
    invoke-virtual {v8, v4, v5}, Lx13;->c(J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v4

    .line 279
    goto :goto_5

    .line 280
    :cond_a
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    :goto_5
    iget-boolean v8, v0, Lwm1;->k:Z

    .line 286
    .line 287
    if-eq v7, v8, :cond_b

    .line 288
    .line 289
    move v12, v6

    .line 290
    goto :goto_6

    .line 291
    :cond_b
    const/4 v12, 0x4

    .line 292
    :goto_6
    or-int/2addr v2, v12

    .line 293
    invoke-interface {v3, v2, v4, v5}, Lgm1;->d(IJ)V

    .line 294
    .line 295
    .line 296
    const/4 v14, 0x3

    .line 297
    iput v14, v0, Lwm1;->c:I

    .line 298
    .line 299
    iput v6, v0, Lwm1;->d:I

    .line 300
    .line 301
    const/4 v4, -0x1

    .line 302
    const/4 v5, 0x2

    .line 303
    goto/16 :goto_2

    .line 304
    .line 305
    :cond_c
    const/16 p1, 0x1e

    .line 306
    .line 307
    iget-object v4, v9, Llg1;->a:[B

    .line 308
    .line 309
    const/16 v5, 0x9

    .line 310
    .line 311
    invoke-virtual {v0, v1, v4, v5}, Lwm1;->c(Lkz2;[BI)Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-eqz v4, :cond_10

    .line 316
    .line 317
    invoke-virtual {v9, v6}, Llg1;->l(I)V

    .line 318
    .line 319
    .line 320
    const/16 v4, 0x18

    .line 321
    .line 322
    invoke-virtual {v9, v4}, Llg1;->r(I)I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-eq v4, v7, :cond_d

    .line 327
    .line 328
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    new-instance v8, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    add-int/lit8 v5, v5, 0x1e

    .line 339
    .line 340
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 341
    .line 342
    .line 343
    const-string v5, "Unexpected start code prefix: "

    .line 344
    .line 345
    invoke-static {v8, v4, v5}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const/4 v4, -0x1

    .line 349
    iput v4, v0, Lwm1;->j:I

    .line 350
    .line 351
    move v5, v6

    .line 352
    const/4 v8, 0x2

    .line 353
    goto :goto_8

    .line 354
    :cond_d
    const/16 v4, 0x8

    .line 355
    .line 356
    invoke-virtual {v9, v4}, Llg1;->o(I)V

    .line 357
    .line 358
    .line 359
    const/16 v5, 0x10

    .line 360
    .line 361
    invoke-virtual {v9, v5}, Llg1;->r(I)I

    .line 362
    .line 363
    .line 364
    move-result v5

    .line 365
    const/4 v8, 0x5

    .line 366
    invoke-virtual {v9, v8}, Llg1;->o(I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v9}, Llg1;->q()Z

    .line 370
    .line 371
    .line 372
    move-result v8

    .line 373
    iput-boolean v8, v0, Lwm1;->k:Z

    .line 374
    .line 375
    const/4 v8, 0x2

    .line 376
    invoke-virtual {v9, v8}, Llg1;->o(I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v9}, Llg1;->q()Z

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    iput-boolean v10, v0, Lwm1;->f:Z

    .line 384
    .line 385
    invoke-virtual {v9}, Llg1;->q()Z

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    iput-boolean v10, v0, Lwm1;->g:Z

    .line 390
    .line 391
    const/4 v10, 0x6

    .line 392
    invoke-virtual {v9, v10}, Llg1;->o(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v9, v4}, Llg1;->r(I)I

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    iput v4, v0, Lwm1;->i:I

    .line 400
    .line 401
    if-nez v5, :cond_e

    .line 402
    .line 403
    const/4 v9, -0x1

    .line 404
    iput v9, v0, Lwm1;->j:I

    .line 405
    .line 406
    move v5, v8

    .line 407
    move v4, v9

    .line 408
    goto :goto_8

    .line 409
    :cond_e
    add-int/lit8 v5, v5, -0x3

    .line 410
    .line 411
    sub-int/2addr v5, v4

    .line 412
    iput v5, v0, Lwm1;->j:I

    .line 413
    .line 414
    if-gez v5, :cond_f

    .line 415
    .line 416
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    new-instance v9, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    add-int/lit8 v4, v4, 0x24

    .line 427
    .line 428
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 429
    .line 430
    .line 431
    const-string v4, "Found negative packet payload size: "

    .line 432
    .line 433
    invoke-static {v9, v5, v4}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 434
    .line 435
    .line 436
    const/4 v4, -0x1

    .line 437
    iput v4, v0, Lwm1;->j:I

    .line 438
    .line 439
    :goto_7
    move v5, v8

    .line 440
    goto :goto_8

    .line 441
    :cond_f
    const/4 v4, -0x1

    .line 442
    goto :goto_7

    .line 443
    :goto_8
    iput v5, v0, Lwm1;->c:I

    .line 444
    .line 445
    iput v6, v0, Lwm1;->d:I

    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_10
    const/4 v4, -0x1

    .line 449
    const/4 v8, 0x2

    .line 450
    goto :goto_9

    .line 451
    :cond_11
    move v8, v5

    .line 452
    invoke-virtual {v1}, Lkz2;->B()I

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    invoke-virtual {v1, v5}, Lkz2;->G(I)V

    .line 457
    .line 458
    .line 459
    :goto_9
    move v5, v8

    .line 460
    goto/16 :goto_2

    .line 461
    .line 462
    :cond_12
    return-void
.end method

.method public final b(Lx13;Lnf1;Lin1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwm1;->e:Lx13;

    .line 2
    .line 3
    iget-object p1, p0, Lwm1;->a:Lgm1;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, Lgm1;->e(Lnf1;Lin1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c(Lkz2;[BI)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lkz2;->B()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lwm1;->d:I

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
    const/4 v1, 0x1

    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lkz2;->G(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v2, p0, Lwm1;->d:I

    .line 24
    .line 25
    invoke-virtual {p1, p2, v2, v0}, Lkz2;->H([BII)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget p1, p0, Lwm1;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, Lwm1;->d:I

    .line 32
    .line 33
    if-ne p1, p3, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwm1;->c:I

    .line 3
    .line 4
    iput v0, p0, Lwm1;->d:I

    .line 5
    .line 6
    iput-boolean v0, p0, Lwm1;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, Lwm1;->a:Lgm1;

    .line 9
    .line 10
    invoke-interface {v0}, Lgm1;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
