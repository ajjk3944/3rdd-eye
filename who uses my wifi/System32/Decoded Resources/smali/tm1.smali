.class public final Ltm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lkz2;

.field public final d:Llg1;

.field public e:Ljg1;

.field public f:Ljava/lang/String;

.field public g:Lph4;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:J

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:J

.field public s:I

.field public t:J

.field public u:I

.field public v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltm1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Ltm1;->b:I

    .line 7
    .line 8
    new-instance p1, Lkz2;

    .line 9
    .line 10
    const/16 p2, 0x400

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lkz2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ltm1;->c:Lkz2;

    .line 16
    .line 17
    new-instance p2, Llg1;

    .line 18
    .line 19
    iget-object p1, p1, Lkz2;->a:[B

    .line 20
    .line 21
    array-length v0, p1

    .line 22
    invoke-direct {p2, v0, p1}, Llg1;-><init>(I[B)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Ltm1;->d:Llg1;

    .line 26
    .line 27
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide p1, p0, Ltm1;->l:J

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ltm1;->h:I

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Ltm1;->l:J

    .line 10
    .line 11
    iput-boolean v0, p0, Ltm1;->m:Z

    .line 12
    .line 13
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ltm1;->e:Ljg1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lkz2;->B()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_1e

    .line 13
    .line 14
    iget v1, v0, Ltm1;->h:I

    .line 15
    .line 16
    const/16 v2, 0x56

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v1, :cond_1d

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eq v1, v3, :cond_1b

    .line 24
    .line 25
    iget-object v2, v0, Ltm1;->d:Llg1;

    .line 26
    .line 27
    iget-object v6, v0, Ltm1;->c:Lkz2;

    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    const/16 v8, 0x8

    .line 31
    .line 32
    if-eq v1, v4, :cond_19

    .line 33
    .line 34
    invoke-virtual/range {p1 .. p1}, Lkz2;->B()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iget v9, v0, Ltm1;->j:I

    .line 39
    .line 40
    iget v10, v0, Ltm1;->i:I

    .line 41
    .line 42
    sub-int/2addr v9, v10

    .line 43
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v9, v2, Llg1;->a:[B

    .line 48
    .line 49
    iget v10, v0, Ltm1;->i:I

    .line 50
    .line 51
    move-object/from16 v11, p1

    .line 52
    .line 53
    invoke-virtual {v11, v9, v10, v1}, Lkz2;->H([BII)V

    .line 54
    .line 55
    .line 56
    iget v9, v0, Ltm1;->i:I

    .line 57
    .line 58
    add-int/2addr v9, v1

    .line 59
    iput v9, v0, Ltm1;->i:I

    .line 60
    .line 61
    iget v1, v0, Ltm1;->j:I

    .line 62
    .line 63
    if-ne v9, v1, :cond_0

    .line 64
    .line 65
    invoke-virtual {v2, v5}, Llg1;->l(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Llg1;->q()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v9, 0x0

    .line 73
    if-nez v1, :cond_10

    .line 74
    .line 75
    iput-boolean v3, v0, Ltm1;->m:Z

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-ne v1, v3, :cond_1

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Llg1;->r(I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    move v10, v3

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    move v10, v1

    .line 90
    move v1, v5

    .line 91
    :goto_1
    iput v1, v0, Ltm1;->n:I

    .line 92
    .line 93
    if-nez v1, :cond_f

    .line 94
    .line 95
    if-ne v10, v3, :cond_2

    .line 96
    .line 97
    invoke-virtual {v2, v4}, Llg1;->r(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    add-int/2addr v1, v3

    .line 102
    mul-int/2addr v1, v8

    .line 103
    invoke-virtual {v2, v1}, Llg1;->r(I)I

    .line 104
    .line 105
    .line 106
    move v10, v3

    .line 107
    :cond_2
    invoke-virtual {v2}, Llg1;->q()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_e

    .line 112
    .line 113
    const/4 v1, 0x6

    .line 114
    invoke-virtual {v2, v1}, Llg1;->r(I)I

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    iput v12, v0, Ltm1;->o:I

    .line 119
    .line 120
    const/4 v12, 0x4

    .line 121
    invoke-virtual {v2, v12}, Llg1;->r(I)I

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    invoke-virtual {v2, v7}, Llg1;->r(I)I

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    if-nez v13, :cond_d

    .line 130
    .line 131
    if-nez v14, :cond_d

    .line 132
    .line 133
    if-nez v10, :cond_3

    .line 134
    .line 135
    iget v13, v2, Llg1;->b:I

    .line 136
    .line 137
    mul-int/2addr v13, v8

    .line 138
    iget v14, v2, Llg1;->c:I

    .line 139
    .line 140
    add-int/2addr v13, v14

    .line 141
    invoke-virtual {v2}, Llg1;->f()I

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    invoke-static {v2, v3}, Li30;->g0(Llg1;Z)Lqe1;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    iget-object v5, v15, Lqe1;->a:Ljava/lang/String;

    .line 150
    .line 151
    iput-object v5, v0, Ltm1;->v:Ljava/lang/String;

    .line 152
    .line 153
    iget v5, v15, Lqe1;->b:I

    .line 154
    .line 155
    iput v5, v0, Ltm1;->s:I

    .line 156
    .line 157
    iget v5, v15, Lqe1;->c:I

    .line 158
    .line 159
    iput v5, v0, Ltm1;->u:I

    .line 160
    .line 161
    invoke-virtual {v2}, Llg1;->f()I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    sub-int/2addr v14, v5

    .line 166
    invoke-virtual {v2, v13}, Llg1;->l(I)V

    .line 167
    .line 168
    .line 169
    add-int/lit8 v5, v14, 0x7

    .line 170
    .line 171
    div-int/2addr v5, v8

    .line 172
    new-array v5, v5, [B

    .line 173
    .line 174
    invoke-virtual {v2, v14, v5}, Llg1;->v(I[B)V

    .line 175
    .line 176
    .line 177
    new-instance v13, Lgg4;

    .line 178
    .line 179
    invoke-direct {v13}, Lgg4;-><init>()V

    .line 180
    .line 181
    .line 182
    iget-object v14, v0, Ltm1;->f:Ljava/lang/String;

    .line 183
    .line 184
    iput-object v14, v13, Lgg4;->a:Ljava/lang/String;

    .line 185
    .line 186
    const-string v14, "video/mp2t"

    .line 187
    .line 188
    invoke-virtual {v13, v14}, Lgg4;->d(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-string v14, "audio/mp4a-latm"

    .line 192
    .line 193
    invoke-virtual {v13, v14}, Lgg4;->e(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iget-object v14, v0, Ltm1;->v:Ljava/lang/String;

    .line 197
    .line 198
    iput-object v14, v13, Lgg4;->i:Ljava/lang/String;

    .line 199
    .line 200
    iget v14, v0, Ltm1;->u:I

    .line 201
    .line 202
    iput v14, v13, Lgg4;->D:I

    .line 203
    .line 204
    iget v14, v0, Ltm1;->s:I

    .line 205
    .line 206
    iput v14, v13, Lgg4;->E:I

    .line 207
    .line 208
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    iput-object v5, v13, Lgg4;->o:Ljava/util/List;

    .line 213
    .line 214
    iget-object v5, v0, Ltm1;->a:Ljava/lang/String;

    .line 215
    .line 216
    iput-object v5, v13, Lgg4;->d:Ljava/lang/String;

    .line 217
    .line 218
    iget v5, v0, Ltm1;->b:I

    .line 219
    .line 220
    iput v5, v13, Lgg4;->f:I

    .line 221
    .line 222
    new-instance v5, Lph4;

    .line 223
    .line 224
    invoke-direct {v5, v13}, Lph4;-><init>(Lgg4;)V

    .line 225
    .line 226
    .line 227
    iget-object v13, v0, Ltm1;->g:Lph4;

    .line 228
    .line 229
    invoke-virtual {v5, v13}, Lph4;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    if-nez v13, :cond_4

    .line 234
    .line 235
    iput-object v5, v0, Ltm1;->g:Lph4;

    .line 236
    .line 237
    iget v13, v5, Lph4;->F:I

    .line 238
    .line 239
    int-to-long v13, v13

    .line 240
    const-wide/32 v16, 0x3d090000

    .line 241
    .line 242
    .line 243
    div-long v13, v16, v13

    .line 244
    .line 245
    iput-wide v13, v0, Ltm1;->t:J

    .line 246
    .line 247
    iget-object v13, v0, Ltm1;->e:Ljg1;

    .line 248
    .line 249
    invoke-interface {v13, v5}, Ljg1;->d(Lph4;)V

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_3
    invoke-virtual {v2, v4}, Llg1;->r(I)I

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    add-int/2addr v5, v3

    .line 258
    mul-int/2addr v5, v8

    .line 259
    invoke-virtual {v2, v5}, Llg1;->r(I)I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    int-to-long v13, v5

    .line 264
    long-to-int v5, v13

    .line 265
    invoke-virtual {v2}, Llg1;->f()I

    .line 266
    .line 267
    .line 268
    move-result v13

    .line 269
    invoke-static {v2, v3}, Li30;->g0(Llg1;Z)Lqe1;

    .line 270
    .line 271
    .line 272
    move-result-object v14

    .line 273
    iget-object v15, v14, Lqe1;->a:Ljava/lang/String;

    .line 274
    .line 275
    iput-object v15, v0, Ltm1;->v:Ljava/lang/String;

    .line 276
    .line 277
    iget v15, v14, Lqe1;->b:I

    .line 278
    .line 279
    iput v15, v0, Ltm1;->s:I

    .line 280
    .line 281
    iget v14, v14, Lqe1;->c:I

    .line 282
    .line 283
    iput v14, v0, Ltm1;->u:I

    .line 284
    .line 285
    invoke-virtual {v2}, Llg1;->f()I

    .line 286
    .line 287
    .line 288
    move-result v14

    .line 289
    sub-int/2addr v13, v14

    .line 290
    sub-int/2addr v5, v13

    .line 291
    invoke-virtual {v2, v5}, Llg1;->o(I)V

    .line 292
    .line 293
    .line 294
    :cond_4
    :goto_2
    invoke-virtual {v2, v7}, Llg1;->r(I)I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    iput v5, v0, Ltm1;->p:I

    .line 299
    .line 300
    if-eqz v5, :cond_9

    .line 301
    .line 302
    if-eq v5, v3, :cond_8

    .line 303
    .line 304
    if-eq v5, v7, :cond_7

    .line 305
    .line 306
    if-eq v5, v12, :cond_7

    .line 307
    .line 308
    const/4 v7, 0x5

    .line 309
    if-eq v5, v7, :cond_7

    .line 310
    .line 311
    if-eq v5, v1, :cond_6

    .line 312
    .line 313
    const/4 v1, 0x7

    .line 314
    if-ne v5, v1, :cond_5

    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 318
    .line 319
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 320
    .line 321
    .line 322
    throw v1

    .line 323
    :cond_6
    :goto_3
    invoke-virtual {v2, v3}, Llg1;->o(I)V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_7
    invoke-virtual {v2, v1}, Llg1;->o(I)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_8
    const/16 v1, 0x9

    .line 332
    .line 333
    invoke-virtual {v2, v1}, Llg1;->o(I)V

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_9
    invoke-virtual {v2, v8}, Llg1;->o(I)V

    .line 338
    .line 339
    .line 340
    :goto_4
    invoke-virtual {v2}, Llg1;->q()Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    iput-boolean v1, v0, Ltm1;->q:Z

    .line 345
    .line 346
    const-wide/16 v12, 0x0

    .line 347
    .line 348
    iput-wide v12, v0, Ltm1;->r:J

    .line 349
    .line 350
    if-eqz v1, :cond_c

    .line 351
    .line 352
    if-eq v10, v3, :cond_b

    .line 353
    .line 354
    :cond_a
    invoke-virtual {v2}, Llg1;->q()Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    iget-wide v4, v0, Ltm1;->r:J

    .line 359
    .line 360
    shl-long/2addr v4, v8

    .line 361
    invoke-virtual {v2, v8}, Llg1;->r(I)I

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    int-to-long v12, v7

    .line 366
    add-long/2addr v4, v12

    .line 367
    iput-wide v4, v0, Ltm1;->r:J

    .line 368
    .line 369
    if-nez v1, :cond_a

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_b
    invoke-virtual {v2, v4}, Llg1;->r(I)I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    add-int/2addr v1, v3

    .line 377
    mul-int/2addr v1, v8

    .line 378
    invoke-virtual {v2, v1}, Llg1;->r(I)I

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    int-to-long v4, v1

    .line 383
    iput-wide v4, v0, Ltm1;->r:J

    .line 384
    .line 385
    :cond_c
    :goto_5
    invoke-virtual {v2}, Llg1;->q()Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_12

    .line 390
    .line 391
    invoke-virtual {v2, v8}, Llg1;->o(I)V

    .line 392
    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_d
    invoke-static {v9, v9}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    throw v1

    .line 400
    :cond_e
    invoke-static {v9, v9}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    throw v1

    .line 405
    :cond_f
    invoke-static {v9, v9}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    throw v1

    .line 410
    :cond_10
    iget-boolean v1, v0, Ltm1;->m:Z

    .line 411
    .line 412
    if-nez v1, :cond_12

    .line 413
    .line 414
    :cond_11
    :goto_6
    const/4 v4, 0x0

    .line 415
    goto :goto_b

    .line 416
    :cond_12
    :goto_7
    iget v1, v0, Ltm1;->n:I

    .line 417
    .line 418
    if-nez v1, :cond_18

    .line 419
    .line 420
    iget v1, v0, Ltm1;->o:I

    .line 421
    .line 422
    if-nez v1, :cond_17

    .line 423
    .line 424
    iget v1, v0, Ltm1;->p:I

    .line 425
    .line 426
    if-nez v1, :cond_16

    .line 427
    .line 428
    const/4 v1, 0x0

    .line 429
    :goto_8
    invoke-virtual {v2, v8}, Llg1;->r(I)I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    add-int/2addr v1, v4

    .line 434
    const/16 v5, 0xff

    .line 435
    .line 436
    if-eq v4, v5, :cond_15

    .line 437
    .line 438
    iget v4, v2, Llg1;->b:I

    .line 439
    .line 440
    mul-int/2addr v4, v8

    .line 441
    iget v5, v2, Llg1;->c:I

    .line 442
    .line 443
    add-int/2addr v4, v5

    .line 444
    and-int/lit8 v5, v4, 0x7

    .line 445
    .line 446
    if-nez v5, :cond_13

    .line 447
    .line 448
    shr-int/lit8 v4, v4, 0x3

    .line 449
    .line 450
    invoke-virtual {v6, v4}, Lkz2;->E(I)V

    .line 451
    .line 452
    .line 453
    const/4 v4, 0x0

    .line 454
    goto :goto_9

    .line 455
    :cond_13
    mul-int/lit8 v4, v1, 0x8

    .line 456
    .line 457
    iget-object v5, v6, Lkz2;->a:[B

    .line 458
    .line 459
    invoke-virtual {v2, v4, v5}, Llg1;->v(I[B)V

    .line 460
    .line 461
    .line 462
    const/4 v4, 0x0

    .line 463
    invoke-virtual {v6, v4}, Lkz2;->E(I)V

    .line 464
    .line 465
    .line 466
    :goto_9
    iget-object v5, v0, Ltm1;->e:Ljg1;

    .line 467
    .line 468
    invoke-interface {v5, v6, v1, v4}, Ljg1;->a(Lkz2;II)V

    .line 469
    .line 470
    .line 471
    iget-wide v4, v0, Ltm1;->l:J

    .line 472
    .line 473
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    cmp-long v4, v4, v6

    .line 479
    .line 480
    if-eqz v4, :cond_14

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_14
    const/4 v3, 0x0

    .line 484
    :goto_a
    invoke-static {v3}, Lzt0;->b0(Z)V

    .line 485
    .line 486
    .line 487
    iget-object v3, v0, Ltm1;->e:Ljg1;

    .line 488
    .line 489
    iget-wide v4, v0, Ltm1;->l:J

    .line 490
    .line 491
    const/16 v21, 0x0

    .line 492
    .line 493
    const/16 v22, 0x0

    .line 494
    .line 495
    const/16 v19, 0x1

    .line 496
    .line 497
    move/from16 v20, v1

    .line 498
    .line 499
    move-object/from16 v16, v3

    .line 500
    .line 501
    move-wide/from16 v17, v4

    .line 502
    .line 503
    invoke-interface/range {v16 .. v22}, Ljg1;->c(JIIILig1;)V

    .line 504
    .line 505
    .line 506
    iget-wide v3, v0, Ltm1;->l:J

    .line 507
    .line 508
    iget-wide v5, v0, Ltm1;->t:J

    .line 509
    .line 510
    add-long/2addr v3, v5

    .line 511
    iput-wide v3, v0, Ltm1;->l:J

    .line 512
    .line 513
    iget-boolean v1, v0, Ltm1;->q:Z

    .line 514
    .line 515
    if-eqz v1, :cond_11

    .line 516
    .line 517
    iget-wide v3, v0, Ltm1;->r:J

    .line 518
    .line 519
    long-to-int v1, v3

    .line 520
    invoke-virtual {v2, v1}, Llg1;->o(I)V

    .line 521
    .line 522
    .line 523
    goto :goto_6

    .line 524
    :goto_b
    iput v4, v0, Ltm1;->h:I

    .line 525
    .line 526
    goto/16 :goto_0

    .line 527
    .line 528
    :cond_15
    move/from16 v20, v1

    .line 529
    .line 530
    goto :goto_8

    .line 531
    :cond_16
    invoke-static {v9, v9}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    throw v1

    .line 536
    :cond_17
    invoke-static {v9, v9}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    throw v1

    .line 541
    :cond_18
    invoke-static {v9, v9}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    throw v1

    .line 546
    :cond_19
    move-object/from16 v11, p1

    .line 547
    .line 548
    iget v1, v0, Ltm1;->k:I

    .line 549
    .line 550
    and-int/lit16 v1, v1, -0xe1

    .line 551
    .line 552
    shl-int/2addr v1, v8

    .line 553
    invoke-virtual {v11}, Lkz2;->K()I

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    or-int/2addr v1, v3

    .line 558
    iput v1, v0, Ltm1;->j:I

    .line 559
    .line 560
    iget-object v3, v6, Lkz2;->a:[B

    .line 561
    .line 562
    array-length v3, v3

    .line 563
    if-le v1, v3, :cond_1a

    .line 564
    .line 565
    invoke-virtual {v6, v1}, Lkz2;->y(I)V

    .line 566
    .line 567
    .line 568
    iget-object v1, v6, Lkz2;->a:[B

    .line 569
    .line 570
    array-length v3, v1

    .line 571
    iput-object v1, v2, Llg1;->a:[B

    .line 572
    .line 573
    const/4 v4, 0x0

    .line 574
    iput v4, v2, Llg1;->b:I

    .line 575
    .line 576
    iput v4, v2, Llg1;->c:I

    .line 577
    .line 578
    iput v3, v2, Llg1;->d:I

    .line 579
    .line 580
    goto :goto_c

    .line 581
    :cond_1a
    const/4 v4, 0x0

    .line 582
    :goto_c
    iput v4, v0, Ltm1;->i:I

    .line 583
    .line 584
    iput v7, v0, Ltm1;->h:I

    .line 585
    .line 586
    goto/16 :goto_0

    .line 587
    .line 588
    :cond_1b
    move-object/from16 v11, p1

    .line 589
    .line 590
    invoke-virtual {v11}, Lkz2;->K()I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    and-int/lit16 v3, v1, 0xe0

    .line 595
    .line 596
    const/16 v5, 0xe0

    .line 597
    .line 598
    if-ne v3, v5, :cond_1c

    .line 599
    .line 600
    iput v1, v0, Ltm1;->k:I

    .line 601
    .line 602
    :goto_d
    iput v4, v0, Ltm1;->h:I

    .line 603
    .line 604
    goto/16 :goto_0

    .line 605
    .line 606
    :cond_1c
    if-eq v1, v2, :cond_0

    .line 607
    .line 608
    const/4 v4, 0x0

    .line 609
    goto :goto_d

    .line 610
    :cond_1d
    move-object/from16 v11, p1

    .line 611
    .line 612
    invoke-virtual {v11}, Lkz2;->K()I

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    if-ne v1, v2, :cond_0

    .line 617
    .line 618
    iput v3, v0, Ltm1;->h:I

    .line 619
    .line 620
    goto/16 :goto_0

    .line 621
    .line 622
    :cond_1e
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
    iput-wide p2, p0, Ltm1;->l:J

    .line 2
    .line 3
    return-void
.end method

.method public final e(Lnf1;Lin1;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lin1;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lin1;->b()V

    .line 5
    .line 6
    .line 7
    iget v0, p2, Lin1;->d:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-interface {p1, v0, v1}, Lnf1;->z(II)Ljg1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Ltm1;->e:Ljg1;

    .line 15
    .line 16
    invoke-virtual {p2}, Lin1;->b()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, Lin1;->e:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, Ltm1;->f:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method
