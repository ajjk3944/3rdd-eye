.class public final Lah1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public final a:[B

.field public final b:Lkz2;

.field public final c:Lpf1;

.field public d:Lnf1;

.field public e:Ljg1;

.field public f:I

.field public g:Lwn1;

.field public h:Lrf1;

.field public i:I

.field public j:I

.field public k:Lzg1;

.field public l:I

.field public m:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lg82;->q:I

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2a

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Lah1;->a:[B

    .line 9
    .line 10
    new-instance v0, Lkz2;

    .line 11
    .line 12
    const v1, 0x8000

    .line 13
    .line 14
    .line 15
    new-array v1, v1, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v2, v1}, Lkz2;-><init>(I[B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lah1;->b:Lkz2;

    .line 22
    .line 23
    new-instance v0, Lpf1;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lah1;->c:Lpf1;

    .line 29
    .line 30
    iput v2, p0, Lah1;->f:I

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final b(Lmf1;)Z
    .locals 5

    .line 1
    sget-object v0, Lus0;->i:Lus0;

    .line 2
    .line 3
    new-instance v1, Lf20;

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lf20;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v1, p1, v0, v2}, Lf20;->k(Lmf1;Lus0;I)Lwn1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lwn1;->a:[Len1;

    .line 18
    .line 19
    array-length v0, v0

    .line 20
    :cond_0
    new-instance v0, Lkz2;

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, Lkz2;->a:[B

    .line 27
    .line 28
    check-cast p1, Ldf1;

    .line 29
    .line 30
    invoke-virtual {p1, v3, v2, v1, v2}, Ldf1;->B([BIIZ)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lkz2;->P()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const-wide/32 v3, 0x664c6143

    .line 38
    .line 39
    .line 40
    cmp-long p1, v0, v3

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_1
    return v2
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lah1;->f:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v2, :cond_29

    .line 11
    .line 12
    iget-object v6, v0, Lah1;->a:[B

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    if-eq v2, v4, :cond_28

    .line 16
    .line 17
    const/4 v8, 0x3

    .line 18
    const/4 v9, 0x4

    .line 19
    if-eq v2, v7, :cond_26

    .line 20
    .line 21
    const/4 v10, 0x7

    .line 22
    if-eq v2, v8, :cond_1d

    .line 23
    .line 24
    const-wide/16 v12, 0x0

    .line 25
    .line 26
    const-wide/16 v14, -0x1

    .line 27
    .line 28
    if-eq v2, v9, :cond_17

    .line 29
    .line 30
    iget-object v2, v0, Lah1;->e:Ljg1;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lah1;->h:Lrf1;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v6, v0, Lah1;->k:Lzg1;

    .line 41
    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    iget-object v8, v6, Lzg1;->c:Lxe1;

    .line 45
    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    move-object/from16 v8, p2

    .line 49
    .line 50
    invoke-virtual {v6, v1, v8}, Lzg1;->b(Lmf1;Lpf1;)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    return v1

    .line 55
    :cond_0
    iget-wide v8, v0, Lah1;->m:J

    .line 56
    .line 57
    cmp-long v6, v8, v14

    .line 58
    .line 59
    const/4 v8, -0x1

    .line 60
    if-nez v6, :cond_8

    .line 61
    .line 62
    move-object v6, v1

    .line 63
    check-cast v6, Ldf1;

    .line 64
    .line 65
    iput v5, v6, Ldf1;->k:I

    .line 66
    .line 67
    check-cast v1, Ldf1;

    .line 68
    .line 69
    invoke-virtual {v1, v4, v5}, Ldf1;->e(IZ)Z

    .line 70
    .line 71
    .line 72
    new-array v6, v4, [B

    .line 73
    .line 74
    invoke-virtual {v1, v6, v5, v4, v5}, Ldf1;->B([BIIZ)Z

    .line 75
    .line 76
    .line 77
    aget-byte v6, v6, v5

    .line 78
    .line 79
    and-int/2addr v6, v4

    .line 80
    if-eq v4, v6, :cond_1

    .line 81
    .line 82
    move v9, v5

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move v9, v4

    .line 85
    :goto_0
    invoke-virtual {v1, v7, v5}, Ldf1;->e(IZ)Z

    .line 86
    .line 87
    .line 88
    if-eq v4, v6, :cond_2

    .line 89
    .line 90
    const/4 v10, 0x6

    .line 91
    :cond_2
    new-instance v6, Lkz2;

    .line 92
    .line 93
    invoke-direct {v6, v10}, Lkz2;-><init>(I)V

    .line 94
    .line 95
    .line 96
    iget-object v7, v6, Lkz2;->a:[B

    .line 97
    .line 98
    move v11, v5

    .line 99
    :goto_1
    if-ge v11, v10, :cond_4

    .line 100
    .line 101
    sub-int v14, v10, v11

    .line 102
    .line 103
    invoke-virtual {v1, v7, v11, v14}, Ldf1;->y([BII)I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    if-ne v14, v8, :cond_3

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    add-int/2addr v11, v14

    .line 111
    goto :goto_1

    .line 112
    :cond_4
    :goto_2
    invoke-virtual {v6, v11}, Lkz2;->C(I)V

    .line 113
    .line 114
    .line 115
    iput v5, v1, Ldf1;->k:I

    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v6}, Lkz2;->o()J

    .line 118
    .line 119
    .line 120
    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    if-eqz v9, :cond_5

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    iget v1, v2, Lrf1;->b:I

    .line 125
    .line 126
    int-to-long v8, v1

    .line 127
    mul-long/2addr v6, v8

    .line 128
    :goto_3
    iget-wide v1, v2, Lrf1;->j:J

    .line 129
    .line 130
    cmp-long v8, v1, v12

    .line 131
    .line 132
    if-eqz v8, :cond_6

    .line 133
    .line 134
    cmp-long v1, v6, v1

    .line 135
    .line 136
    if-lez v1, :cond_6

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    move-wide v12, v6

    .line 140
    goto :goto_5

    .line 141
    :catch_0
    :goto_4
    move v4, v5

    .line 142
    :goto_5
    if-eqz v4, :cond_7

    .line 143
    .line 144
    iput-wide v12, v0, Lah1;->m:J

    .line 145
    .line 146
    goto/16 :goto_e

    .line 147
    .line 148
    :cond_7
    invoke-static {v3, v3}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    throw v1

    .line 153
    :cond_8
    iget-object v2, v0, Lah1;->b:Lkz2;

    .line 154
    .line 155
    iget v3, v2, Lkz2;->c:I

    .line 156
    .line 157
    const-wide/32 v6, 0xf4240

    .line 158
    .line 159
    .line 160
    const v9, 0x8000

    .line 161
    .line 162
    .line 163
    if-ge v3, v9, :cond_b

    .line 164
    .line 165
    iget-object v10, v2, Lkz2;->a:[B

    .line 166
    .line 167
    sub-int/2addr v9, v3

    .line 168
    check-cast v1, Ldf1;

    .line 169
    .line 170
    invoke-virtual {v1, v10, v3, v9}, Ldf1;->d([BII)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-ne v1, v8, :cond_9

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_9
    move v4, v5

    .line 178
    :goto_6
    if-nez v4, :cond_a

    .line 179
    .line 180
    add-int/2addr v3, v1

    .line 181
    invoke-virtual {v2, v3}, Lkz2;->C(I)V

    .line 182
    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_a
    invoke-virtual {v2}, Lkz2;->B()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-nez v1, :cond_c

    .line 190
    .line 191
    iget-wide v1, v0, Lah1;->m:J

    .line 192
    .line 193
    mul-long/2addr v1, v6

    .line 194
    iget-object v3, v0, Lah1;->h:Lrf1;

    .line 195
    .line 196
    sget-object v4, Lv23;->a:Ljava/lang/String;

    .line 197
    .line 198
    iget v3, v3, Lrf1;->e:I

    .line 199
    .line 200
    int-to-long v3, v3

    .line 201
    div-long v10, v1, v3

    .line 202
    .line 203
    iget-object v9, v0, Lah1;->e:Ljg1;

    .line 204
    .line 205
    iget v13, v0, Lah1;->l:I

    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const/4 v15, 0x0

    .line 209
    const/4 v12, 0x1

    .line 210
    invoke-interface/range {v9 .. v15}, Ljg1;->c(JIIILig1;)V

    .line 211
    .line 212
    .line 213
    return v8

    .line 214
    :cond_b
    move v4, v5

    .line 215
    :cond_c
    :goto_7
    iget v1, v2, Lkz2;->b:I

    .line 216
    .line 217
    iget v3, v0, Lah1;->l:I

    .line 218
    .line 219
    iget v8, v0, Lah1;->i:I

    .line 220
    .line 221
    if-ge v3, v8, :cond_d

    .line 222
    .line 223
    invoke-virtual {v2}, Lkz2;->B()I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    sub-int/2addr v8, v3

    .line 228
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-virtual {v2, v3}, Lkz2;->G(I)V

    .line 233
    .line 234
    .line 235
    :cond_d
    iget-object v3, v0, Lah1;->h:Lrf1;

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    iget v3, v2, Lkz2;->b:I

    .line 241
    .line 242
    :goto_8
    iget v8, v2, Lkz2;->c:I

    .line 243
    .line 244
    add-int/lit8 v8, v8, -0x10

    .line 245
    .line 246
    iget-object v9, v0, Lah1;->c:Lpf1;

    .line 247
    .line 248
    if-gt v3, v8, :cond_f

    .line 249
    .line 250
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 251
    .line 252
    .line 253
    iget-object v8, v0, Lah1;->h:Lrf1;

    .line 254
    .line 255
    iget v10, v0, Lah1;->j:I

    .line 256
    .line 257
    invoke-static {v2, v8, v10, v9}, Li41;->K(Lkz2;Lrf1;ILpf1;)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-eqz v8, :cond_e

    .line 262
    .line 263
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 264
    .line 265
    .line 266
    iget-wide v3, v9, Lpf1;->a:J

    .line 267
    .line 268
    goto :goto_d

    .line 269
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_f
    if-eqz v4, :cond_13

    .line 273
    .line 274
    :goto_9
    iget v4, v2, Lkz2;->c:I

    .line 275
    .line 276
    iget v8, v0, Lah1;->i:I

    .line 277
    .line 278
    sub-int v8, v4, v8

    .line 279
    .line 280
    if-gt v3, v8, :cond_12

    .line 281
    .line 282
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 283
    .line 284
    .line 285
    :try_start_1
    iget-object v4, v0, Lah1;->h:Lrf1;

    .line 286
    .line 287
    iget v8, v0, Lah1;->j:I

    .line 288
    .line 289
    invoke-static {v2, v4, v8, v9}, Li41;->K(Lkz2;Lrf1;ILpf1;)Z

    .line 290
    .line 291
    .line 292
    move-result v4
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 293
    goto :goto_a

    .line 294
    :catch_1
    move v4, v5

    .line 295
    :goto_a
    iget v8, v2, Lkz2;->b:I

    .line 296
    .line 297
    iget v10, v2, Lkz2;->c:I

    .line 298
    .line 299
    if-le v8, v10, :cond_10

    .line 300
    .line 301
    goto :goto_b

    .line 302
    :cond_10
    if-eqz v4, :cond_11

    .line 303
    .line 304
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 305
    .line 306
    .line 307
    iget-wide v3, v9, Lpf1;->a:J

    .line 308
    .line 309
    goto :goto_d

    .line 310
    :cond_11
    :goto_b
    add-int/lit8 v3, v3, 0x1

    .line 311
    .line 312
    goto :goto_9

    .line 313
    :cond_12
    invoke-virtual {v2, v4}, Lkz2;->E(I)V

    .line 314
    .line 315
    .line 316
    goto :goto_c

    .line 317
    :cond_13
    invoke-virtual {v2, v3}, Lkz2;->E(I)V

    .line 318
    .line 319
    .line 320
    :goto_c
    move-wide v3, v14

    .line 321
    :goto_d
    iget v8, v2, Lkz2;->b:I

    .line 322
    .line 323
    sub-int/2addr v8, v1

    .line 324
    invoke-virtual {v2, v1}, Lkz2;->E(I)V

    .line 325
    .line 326
    .line 327
    iget-object v1, v0, Lah1;->e:Ljg1;

    .line 328
    .line 329
    invoke-interface {v1, v2, v8, v5}, Ljg1;->a(Lkz2;II)V

    .line 330
    .line 331
    .line 332
    iget v1, v0, Lah1;->l:I

    .line 333
    .line 334
    add-int/2addr v1, v8

    .line 335
    iput v1, v0, Lah1;->l:I

    .line 336
    .line 337
    cmp-long v8, v3, v14

    .line 338
    .line 339
    if-eqz v8, :cond_14

    .line 340
    .line 341
    iget-wide v8, v0, Lah1;->m:J

    .line 342
    .line 343
    mul-long/2addr v8, v6

    .line 344
    iget-object v6, v0, Lah1;->h:Lrf1;

    .line 345
    .line 346
    sget-object v7, Lv23;->a:Ljava/lang/String;

    .line 347
    .line 348
    iget v6, v6, Lrf1;->e:I

    .line 349
    .line 350
    int-to-long v6, v6

    .line 351
    div-long v17, v8, v6

    .line 352
    .line 353
    iget-object v6, v0, Lah1;->e:Ljg1;

    .line 354
    .line 355
    const/16 v21, 0x0

    .line 356
    .line 357
    const/16 v22, 0x0

    .line 358
    .line 359
    const/16 v19, 0x1

    .line 360
    .line 361
    move/from16 v20, v1

    .line 362
    .line 363
    move-object/from16 v16, v6

    .line 364
    .line 365
    invoke-interface/range {v16 .. v22}, Ljg1;->c(JIIILig1;)V

    .line 366
    .line 367
    .line 368
    iput v5, v0, Lah1;->l:I

    .line 369
    .line 370
    iput-wide v3, v0, Lah1;->m:J

    .line 371
    .line 372
    :cond_14
    iget-object v1, v2, Lkz2;->a:[B

    .line 373
    .line 374
    array-length v1, v1

    .line 375
    iget v3, v2, Lkz2;->c:I

    .line 376
    .line 377
    sub-int/2addr v1, v3

    .line 378
    invoke-virtual {v2}, Lkz2;->B()I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    const/16 v4, 0x10

    .line 383
    .line 384
    if-ge v3, v4, :cond_16

    .line 385
    .line 386
    if-lt v1, v4, :cond_15

    .line 387
    .line 388
    goto :goto_e

    .line 389
    :cond_15
    invoke-virtual {v2}, Lkz2;->B()I

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    iget-object v3, v2, Lkz2;->a:[B

    .line 394
    .line 395
    iget v4, v2, Lkz2;->b:I

    .line 396
    .line 397
    invoke-static {v3, v4, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v5}, Lkz2;->E(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v1}, Lkz2;->C(I)V

    .line 404
    .line 405
    .line 406
    :cond_16
    :goto_e
    return v5

    .line 407
    :cond_17
    move-object v2, v1

    .line 408
    check-cast v2, Ldf1;

    .line 409
    .line 410
    iput v5, v2, Ldf1;->k:I

    .line 411
    .line 412
    new-instance v2, Lkz2;

    .line 413
    .line 414
    invoke-direct {v2, v7}, Lkz2;-><init>(I)V

    .line 415
    .line 416
    .line 417
    iget-object v4, v2, Lkz2;->a:[B

    .line 418
    .line 419
    check-cast v1, Ldf1;

    .line 420
    .line 421
    invoke-virtual {v1, v4, v5, v7, v5}, Ldf1;->B([BIIZ)Z

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2}, Lkz2;->L()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    shr-int/lit8 v4, v2, 0x2

    .line 429
    .line 430
    const/16 v6, 0x3ffe

    .line 431
    .line 432
    if-ne v4, v6, :cond_1c

    .line 433
    .line 434
    iput v5, v1, Ldf1;->k:I

    .line 435
    .line 436
    iput v2, v0, Lah1;->j:I

    .line 437
    .line 438
    iget-object v2, v0, Lah1;->d:Lnf1;

    .line 439
    .line 440
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 441
    .line 442
    iget-wide v3, v1, Ldf1;->i:J

    .line 443
    .line 444
    iget-wide v6, v1, Ldf1;->h:J

    .line 445
    .line 446
    iget-object v1, v0, Lah1;->h:Lrf1;

    .line 447
    .line 448
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    iget-object v8, v1, Lrf1;->k:Lvq2;

    .line 452
    .line 453
    if-eqz v8, :cond_18

    .line 454
    .line 455
    iget-object v8, v8, Lvq2;->g:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v8, [J

    .line 458
    .line 459
    array-length v8, v8

    .line 460
    if-lez v8, :cond_18

    .line 461
    .line 462
    new-instance v6, Lqf1;

    .line 463
    .line 464
    invoke-direct {v6, v1, v3, v4, v5}, Lqf1;-><init>(Ljava/lang/Object;JI)V

    .line 465
    .line 466
    .line 467
    move v15, v5

    .line 468
    goto/16 :goto_11

    .line 469
    .line 470
    :cond_18
    cmp-long v8, v6, v14

    .line 471
    .line 472
    if-eqz v8, :cond_1b

    .line 473
    .line 474
    iget-wide v8, v1, Lrf1;->j:J

    .line 475
    .line 476
    cmp-long v8, v8, v12

    .line 477
    .line 478
    if-lez v8, :cond_1b

    .line 479
    .line 480
    new-instance v16, Lzg1;

    .line 481
    .line 482
    iget v8, v0, Lah1;->j:I

    .line 483
    .line 484
    iget v9, v1, Lrf1;->c:I

    .line 485
    .line 486
    new-instance v10, Lvg0;

    .line 487
    .line 488
    const/16 v12, 0x9

    .line 489
    .line 490
    invoke-direct {v10, v12, v1}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    new-instance v12, Lyg1;

    .line 494
    .line 495
    invoke-direct {v12, v1, v8}, Lyg1;-><init>(Lrf1;I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v1}, Lrf1;->a()J

    .line 499
    .line 500
    .line 501
    move-result-wide v19

    .line 502
    iget-wide v13, v1, Lrf1;->j:J

    .line 503
    .line 504
    iget v8, v1, Lrf1;->d:I

    .line 505
    .line 506
    if-lez v8, :cond_19

    .line 507
    .line 508
    move v15, v5

    .line 509
    move-wide/from16 v25, v6

    .line 510
    .line 511
    int-to-long v5, v9

    .line 512
    int-to-long v7, v8

    .line 513
    add-long/2addr v7, v5

    .line 514
    const-wide/16 v5, 0x2

    .line 515
    .line 516
    div-long/2addr v7, v5

    .line 517
    const-wide/16 v5, 0x1

    .line 518
    .line 519
    add-long/2addr v7, v5

    .line 520
    move-object/from16 v18, v12

    .line 521
    .line 522
    :goto_f
    move-wide/from16 v27, v7

    .line 523
    .line 524
    const/4 v1, 0x6

    .line 525
    goto :goto_10

    .line 526
    :cond_19
    move v15, v5

    .line 527
    move-wide/from16 v25, v6

    .line 528
    .line 529
    iget v5, v1, Lrf1;->a:I

    .line 530
    .line 531
    iget v6, v1, Lrf1;->b:I

    .line 532
    .line 533
    const-wide/16 v7, 0x1000

    .line 534
    .line 535
    if-ne v5, v6, :cond_1a

    .line 536
    .line 537
    if-lez v5, :cond_1a

    .line 538
    .line 539
    int-to-long v7, v5

    .line 540
    :cond_1a
    iget v5, v1, Lrf1;->g:I

    .line 541
    .line 542
    int-to-long v5, v5

    .line 543
    iget v1, v1, Lrf1;->h:I

    .line 544
    .line 545
    move-object/from16 v18, v12

    .line 546
    .line 547
    int-to-long v11, v1

    .line 548
    mul-long/2addr v7, v5

    .line 549
    mul-long/2addr v7, v11

    .line 550
    const-wide/16 v5, 0x8

    .line 551
    .line 552
    div-long/2addr v7, v5

    .line 553
    const-wide/16 v5, 0x40

    .line 554
    .line 555
    add-long/2addr v7, v5

    .line 556
    goto :goto_f

    .line 557
    :goto_10
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    .line 558
    .line 559
    .line 560
    move-result v29

    .line 561
    move-wide/from16 v23, v3

    .line 562
    .line 563
    move-object/from16 v17, v10

    .line 564
    .line 565
    move-wide/from16 v21, v13

    .line 566
    .line 567
    invoke-direct/range {v16 .. v29}, Lzg1;-><init>(Lye1;Laf1;JJJJJI)V

    .line 568
    .line 569
    .line 570
    move-object/from16 v1, v16

    .line 571
    .line 572
    iput-object v1, v0, Lah1;->k:Lzg1;

    .line 573
    .line 574
    iget-object v6, v1, Lzg1;->a:Lwe1;

    .line 575
    .line 576
    goto :goto_11

    .line 577
    :cond_1b
    move v15, v5

    .line 578
    new-instance v6, Lqf1;

    .line 579
    .line 580
    invoke-virtual {v1}, Lrf1;->a()J

    .line 581
    .line 582
    .line 583
    move-result-wide v3

    .line 584
    invoke-direct {v6, v3, v4, v12, v13}, Lqf1;-><init>(JJ)V

    .line 585
    .line 586
    .line 587
    :goto_11
    invoke-interface {v2, v6}, Lnf1;->v(Lcg1;)V

    .line 588
    .line 589
    .line 590
    const/4 v1, 0x5

    .line 591
    iput v1, v0, Lah1;->f:I

    .line 592
    .line 593
    return v15

    .line 594
    :cond_1c
    move v15, v5

    .line 595
    iput v15, v1, Ldf1;->k:I

    .line 596
    .line 597
    const-string v1, "First frame does not start with sync code."

    .line 598
    .line 599
    invoke-static {v3, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    throw v1

    .line 604
    :cond_1d
    move v15, v5

    .line 605
    iget-object v2, v0, Lah1;->h:Lrf1;

    .line 606
    .line 607
    :goto_12
    move-object v3, v1

    .line 608
    check-cast v3, Ldf1;

    .line 609
    .line 610
    iput v15, v3, Ldf1;->k:I

    .line 611
    .line 612
    new-instance v3, Llg1;

    .line 613
    .line 614
    new-array v4, v9, [B

    .line 615
    .line 616
    invoke-direct {v3, v9, v4}, Llg1;-><init>(I[B)V

    .line 617
    .line 618
    .line 619
    move-object v5, v1

    .line 620
    check-cast v5, Ldf1;

    .line 621
    .line 622
    invoke-virtual {v5, v4, v15, v9, v15}, Ldf1;->B([BIIZ)Z

    .line 623
    .line 624
    .line 625
    invoke-virtual {v3}, Llg1;->q()Z

    .line 626
    .line 627
    .line 628
    move-result v4

    .line 629
    invoke-virtual {v3, v10}, Llg1;->r(I)I

    .line 630
    .line 631
    .line 632
    move-result v7

    .line 633
    const/16 v11, 0x18

    .line 634
    .line 635
    invoke-virtual {v3, v11}, Llg1;->r(I)I

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    add-int/2addr v3, v9

    .line 640
    if-nez v7, :cond_1e

    .line 641
    .line 642
    const/16 v2, 0x26

    .line 643
    .line 644
    new-array v3, v2, [B

    .line 645
    .line 646
    invoke-virtual {v5, v3, v15, v2, v15}, Ldf1;->w([BIIZ)Z

    .line 647
    .line 648
    .line 649
    new-instance v2, Lrf1;

    .line 650
    .line 651
    invoke-direct {v2, v9, v3}, Lrf1;-><init>(I[B)V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_18

    .line 655
    .line 656
    :cond_1e
    if-eqz v2, :cond_25

    .line 657
    .line 658
    iget-object v11, v2, Lrf1;->l:Lwn1;

    .line 659
    .line 660
    if-ne v7, v8, :cond_1f

    .line 661
    .line 662
    new-instance v7, Lkz2;

    .line 663
    .line 664
    invoke-direct {v7, v3}, Lkz2;-><init>(I)V

    .line 665
    .line 666
    .line 667
    iget-object v11, v7, Lkz2;->a:[B

    .line 668
    .line 669
    invoke-virtual {v5, v11, v15, v3, v15}, Ldf1;->w([BIIZ)Z

    .line 670
    .line 671
    .line 672
    invoke-static {v7}, Lob1;->B(Lkz2;)Lvq2;

    .line 673
    .line 674
    .line 675
    move-result-object v28

    .line 676
    iget-object v3, v2, Lrf1;->l:Lwn1;

    .line 677
    .line 678
    new-instance v18, Lrf1;

    .line 679
    .line 680
    iget v5, v2, Lrf1;->a:I

    .line 681
    .line 682
    iget v7, v2, Lrf1;->b:I

    .line 683
    .line 684
    iget v11, v2, Lrf1;->c:I

    .line 685
    .line 686
    iget v12, v2, Lrf1;->d:I

    .line 687
    .line 688
    iget v13, v2, Lrf1;->e:I

    .line 689
    .line 690
    iget v14, v2, Lrf1;->g:I

    .line 691
    .line 692
    iget v10, v2, Lrf1;->h:I

    .line 693
    .line 694
    iget-wide v8, v2, Lrf1;->j:J

    .line 695
    .line 696
    move-object/from16 v29, v3

    .line 697
    .line 698
    move/from16 v19, v5

    .line 699
    .line 700
    move/from16 v20, v7

    .line 701
    .line 702
    move-wide/from16 v26, v8

    .line 703
    .line 704
    move/from16 v25, v10

    .line 705
    .line 706
    move/from16 v21, v11

    .line 707
    .line 708
    move/from16 v22, v12

    .line 709
    .line 710
    move/from16 v23, v13

    .line 711
    .line 712
    move/from16 v24, v14

    .line 713
    .line 714
    invoke-direct/range {v18 .. v29}, Lrf1;-><init>(IIIIIIIJLvq2;Lwn1;)V

    .line 715
    .line 716
    .line 717
    :goto_13
    move-object/from16 v2, v18

    .line 718
    .line 719
    goto/16 :goto_18

    .line 720
    .line 721
    :cond_1f
    move v8, v9

    .line 722
    if-ne v7, v8, :cond_21

    .line 723
    .line 724
    new-instance v7, Lkz2;

    .line 725
    .line 726
    invoke-direct {v7, v3}, Lkz2;-><init>(I)V

    .line 727
    .line 728
    .line 729
    iget-object v9, v7, Lkz2;->a:[B

    .line 730
    .line 731
    const/4 v15, 0x0

    .line 732
    invoke-virtual {v5, v9, v15, v3, v15}, Ldf1;->w([BIIZ)Z

    .line 733
    .line 734
    .line 735
    invoke-virtual {v7, v8}, Lkz2;->G(I)V

    .line 736
    .line 737
    .line 738
    invoke-static {v7, v15, v15}, Lpu1;->v(Lkz2;ZZ)Lug0;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    iget-object v3, v3, Lug0;->g:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v3, [Ljava/lang/String;

    .line 745
    .line 746
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 747
    .line 748
    .line 749
    move-result-object v3

    .line 750
    invoke-static {v3}, Lpu1;->A(Ljava/util/List;)Lwn1;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    if-nez v11, :cond_20

    .line 755
    .line 756
    :goto_14
    move-object/from16 v29, v3

    .line 757
    .line 758
    goto :goto_15

    .line 759
    :cond_20
    invoke-virtual {v11, v3}, Lwn1;->b(Lwn1;)Lwn1;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    goto :goto_14

    .line 764
    :goto_15
    iget v3, v2, Lrf1;->a:I

    .line 765
    .line 766
    iget v5, v2, Lrf1;->b:I

    .line 767
    .line 768
    iget v7, v2, Lrf1;->c:I

    .line 769
    .line 770
    iget v8, v2, Lrf1;->d:I

    .line 771
    .line 772
    iget v9, v2, Lrf1;->e:I

    .line 773
    .line 774
    iget v10, v2, Lrf1;->g:I

    .line 775
    .line 776
    iget v11, v2, Lrf1;->h:I

    .line 777
    .line 778
    iget-wide v12, v2, Lrf1;->j:J

    .line 779
    .line 780
    iget-object v2, v2, Lrf1;->k:Lvq2;

    .line 781
    .line 782
    new-instance v18, Lrf1;

    .line 783
    .line 784
    move-object/from16 v28, v2

    .line 785
    .line 786
    move/from16 v19, v3

    .line 787
    .line 788
    move/from16 v20, v5

    .line 789
    .line 790
    move/from16 v21, v7

    .line 791
    .line 792
    move/from16 v22, v8

    .line 793
    .line 794
    move/from16 v23, v9

    .line 795
    .line 796
    move/from16 v24, v10

    .line 797
    .line 798
    move/from16 v25, v11

    .line 799
    .line 800
    move-wide/from16 v26, v12

    .line 801
    .line 802
    invoke-direct/range {v18 .. v29}, Lrf1;-><init>(IIIIIIIJLvq2;Lwn1;)V

    .line 803
    .line 804
    .line 805
    goto :goto_13

    .line 806
    :cond_21
    const/4 v8, 0x6

    .line 807
    if-ne v7, v8, :cond_23

    .line 808
    .line 809
    new-instance v7, Lkz2;

    .line 810
    .line 811
    invoke-direct {v7, v3}, Lkz2;-><init>(I)V

    .line 812
    .line 813
    .line 814
    iget-object v8, v7, Lkz2;->a:[B

    .line 815
    .line 816
    const/4 v15, 0x0

    .line 817
    invoke-virtual {v5, v8, v15, v3, v15}, Ldf1;->w([BIIZ)Z

    .line 818
    .line 819
    .line 820
    const/4 v8, 0x4

    .line 821
    invoke-virtual {v7, v8}, Lkz2;->G(I)V

    .line 822
    .line 823
    .line 824
    invoke-static {v7}, Lnh1;->b(Lkz2;)Lnh1;

    .line 825
    .line 826
    .line 827
    move-result-object v3

    .line 828
    invoke-static {v3}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    new-instance v5, Lwn1;

    .line 833
    .line 834
    invoke-direct {v5, v3}, Lwn1;-><init>(Ljava/util/List;)V

    .line 835
    .line 836
    .line 837
    if-nez v11, :cond_22

    .line 838
    .line 839
    :goto_16
    move-object/from16 v29, v5

    .line 840
    .line 841
    goto :goto_17

    .line 842
    :cond_22
    invoke-virtual {v11, v5}, Lwn1;->b(Lwn1;)Lwn1;

    .line 843
    .line 844
    .line 845
    move-result-object v5

    .line 846
    goto :goto_16

    .line 847
    :goto_17
    iget v3, v2, Lrf1;->a:I

    .line 848
    .line 849
    iget v5, v2, Lrf1;->b:I

    .line 850
    .line 851
    iget v7, v2, Lrf1;->c:I

    .line 852
    .line 853
    iget v8, v2, Lrf1;->d:I

    .line 854
    .line 855
    iget v9, v2, Lrf1;->e:I

    .line 856
    .line 857
    iget v10, v2, Lrf1;->g:I

    .line 858
    .line 859
    iget v11, v2, Lrf1;->h:I

    .line 860
    .line 861
    iget-wide v12, v2, Lrf1;->j:J

    .line 862
    .line 863
    iget-object v2, v2, Lrf1;->k:Lvq2;

    .line 864
    .line 865
    new-instance v18, Lrf1;

    .line 866
    .line 867
    move-object/from16 v28, v2

    .line 868
    .line 869
    move/from16 v19, v3

    .line 870
    .line 871
    move/from16 v20, v5

    .line 872
    .line 873
    move/from16 v21, v7

    .line 874
    .line 875
    move/from16 v22, v8

    .line 876
    .line 877
    move/from16 v23, v9

    .line 878
    .line 879
    move/from16 v24, v10

    .line 880
    .line 881
    move/from16 v25, v11

    .line 882
    .line 883
    move-wide/from16 v26, v12

    .line 884
    .line 885
    invoke-direct/range {v18 .. v29}, Lrf1;-><init>(IIIIIIIJLvq2;Lwn1;)V

    .line 886
    .line 887
    .line 888
    goto/16 :goto_13

    .line 889
    .line 890
    :cond_23
    const/4 v15, 0x0

    .line 891
    invoke-virtual {v5, v3, v15}, Ldf1;->c(IZ)Z

    .line 892
    .line 893
    .line 894
    :goto_18
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 895
    .line 896
    iput-object v2, v0, Lah1;->h:Lrf1;

    .line 897
    .line 898
    if-eqz v4, :cond_24

    .line 899
    .line 900
    iget v1, v2, Lrf1;->c:I

    .line 901
    .line 902
    const/4 v8, 0x6

    .line 903
    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    iput v1, v0, Lah1;->i:I

    .line 908
    .line 909
    iget-object v1, v0, Lah1;->h:Lrf1;

    .line 910
    .line 911
    iget-object v2, v0, Lah1;->g:Lwn1;

    .line 912
    .line 913
    invoke-virtual {v1, v6, v2}, Lrf1;->b([BLwn1;)Lph4;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    iget-object v2, v0, Lah1;->e:Ljg1;

    .line 918
    .line 919
    new-instance v3, Lgg4;

    .line 920
    .line 921
    invoke-direct {v3, v1}, Lgg4;-><init>(Lph4;)V

    .line 922
    .line 923
    .line 924
    const-string v1, "audio/flac"

    .line 925
    .line 926
    invoke-virtual {v3, v1}, Lgg4;->d(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    new-instance v1, Lph4;

    .line 930
    .line 931
    invoke-direct {v1, v3}, Lph4;-><init>(Lgg4;)V

    .line 932
    .line 933
    .line 934
    invoke-interface {v2, v1}, Ljg1;->d(Lph4;)V

    .line 935
    .line 936
    .line 937
    iget-object v1, v0, Lah1;->h:Lrf1;

    .line 938
    .line 939
    invoke-virtual {v1}, Lrf1;->a()J

    .line 940
    .line 941
    .line 942
    const/4 v4, 0x4

    .line 943
    iput v4, v0, Lah1;->f:I

    .line 944
    .line 945
    const/4 v15, 0x0

    .line 946
    return v15

    .line 947
    :cond_24
    const/4 v15, 0x0

    .line 948
    const/4 v8, 0x3

    .line 949
    const/4 v9, 0x4

    .line 950
    const/4 v10, 0x7

    .line 951
    goto/16 :goto_12

    .line 952
    .line 953
    :cond_25
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 954
    .line 955
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 956
    .line 957
    .line 958
    throw v1

    .line 959
    :cond_26
    move v15, v5

    .line 960
    move v4, v9

    .line 961
    new-instance v2, Lkz2;

    .line 962
    .line 963
    invoke-direct {v2, v4}, Lkz2;-><init>(I)V

    .line 964
    .line 965
    .line 966
    iget-object v5, v2, Lkz2;->a:[B

    .line 967
    .line 968
    check-cast v1, Ldf1;

    .line 969
    .line 970
    invoke-virtual {v1, v5, v15, v4, v15}, Ldf1;->w([BIIZ)Z

    .line 971
    .line 972
    .line 973
    invoke-virtual {v2}, Lkz2;->P()J

    .line 974
    .line 975
    .line 976
    move-result-wide v1

    .line 977
    const-wide/32 v4, 0x664c6143

    .line 978
    .line 979
    .line 980
    cmp-long v1, v1, v4

    .line 981
    .line 982
    if-nez v1, :cond_27

    .line 983
    .line 984
    const/4 v1, 0x3

    .line 985
    iput v1, v0, Lah1;->f:I

    .line 986
    .line 987
    return v15

    .line 988
    :cond_27
    const-string v1, "Failed to read FLAC stream marker."

    .line 989
    .line 990
    invoke-static {v3, v1}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    throw v1

    .line 995
    :cond_28
    move v15, v5

    .line 996
    const/16 v2, 0x2a

    .line 997
    .line 998
    move-object v3, v1

    .line 999
    check-cast v3, Ldf1;

    .line 1000
    .line 1001
    invoke-virtual {v3, v6, v15, v2, v15}, Ldf1;->B([BIIZ)Z

    .line 1002
    .line 1003
    .line 1004
    check-cast v1, Ldf1;

    .line 1005
    .line 1006
    iput v15, v1, Ldf1;->k:I

    .line 1007
    .line 1008
    iput v7, v0, Lah1;->f:I

    .line 1009
    .line 1010
    return v15

    .line 1011
    :cond_29
    move v15, v5

    .line 1012
    move-object v2, v1

    .line 1013
    check-cast v2, Ldf1;

    .line 1014
    .line 1015
    iput v15, v2, Ldf1;->k:I

    .line 1016
    .line 1017
    move-object v2, v1

    .line 1018
    check-cast v2, Ldf1;

    .line 1019
    .line 1020
    invoke-virtual {v2}, Ldf1;->n()J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v5

    .line 1024
    new-instance v7, Lf20;

    .line 1025
    .line 1026
    const/16 v8, 0xb

    .line 1027
    .line 1028
    invoke-direct {v7, v8}, Lf20;-><init>(I)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v7, v1, v3, v15}, Lf20;->k(Lmf1;Lus0;I)Lwn1;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    if-eqz v1, :cond_2b

    .line 1036
    .line 1037
    iget-object v7, v1, Lwn1;->a:[Len1;

    .line 1038
    .line 1039
    array-length v7, v7

    .line 1040
    if-nez v7, :cond_2a

    .line 1041
    .line 1042
    goto :goto_19

    .line 1043
    :cond_2a
    move-object v3, v1

    .line 1044
    :cond_2b
    :goto_19
    invoke-virtual {v2}, Ldf1;->n()J

    .line 1045
    .line 1046
    .line 1047
    move-result-wide v7

    .line 1048
    sub-long/2addr v7, v5

    .line 1049
    long-to-int v1, v7

    .line 1050
    const/4 v15, 0x0

    .line 1051
    invoke-virtual {v2, v1, v15}, Ldf1;->c(IZ)Z

    .line 1052
    .line 1053
    .line 1054
    iput-object v3, v0, Lah1;->g:Lwn1;

    .line 1055
    .line 1056
    iput v4, v0, Lah1;->f:I

    .line 1057
    .line 1058
    return v15
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
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput p2, p0, Lah1;->f:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lah1;->k:Lzg1;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, Lzg1;->a(J)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    :goto_1
    iput-wide v0, p0, Lah1;->m:J

    .line 26
    .line 27
    iput p2, p0, Lah1;->l:I

    .line 28
    .line 29
    iget-object p1, p0, Lah1;->b:Lkz2;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lkz2;->y(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lah1;->d:Lnf1;

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
    iput-object v0, p0, Lah1;->e:Ljg1;

    .line 10
    .line 11
    invoke-interface {p1}, Lnf1;->s()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
