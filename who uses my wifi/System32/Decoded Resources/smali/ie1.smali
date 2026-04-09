.class public final Lie1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lde1;

.field public final b:Lib1;

.field public final c:Lts;

.field public final d:Lts;

.field public final e:Lcm;

.field public final f:Lee1;

.field public g:J

.field public h:J

.field public i:J

.field public j:Lt82;

.field public k:J

.field public final l:Lvq2;


# direct methods
.method public constructor <init>(Lvq2;Lde1;Lee1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lie1;->l:Lvq2;

    .line 5
    .line 6
    iput-object p2, p0, Lie1;->a:Lde1;

    .line 7
    .line 8
    iput-object p3, p0, Lie1;->f:Lee1;

    .line 9
    .line 10
    new-instance p1, Lib1;

    .line 11
    .line 12
    invoke-direct {p1}, Lib1;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lie1;->b:Lib1;

    .line 16
    .line 17
    new-instance p1, Lts;

    .line 18
    .line 19
    invoke-direct {p1}, Lts;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lie1;->c:Lts;

    .line 23
    .line 24
    new-instance p1, Lts;

    .line 25
    .line 26
    invoke-direct {p1}, Lts;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lie1;->d:Lts;

    .line 30
    .line 31
    new-instance p1, Lcm;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x10

    .line 37
    .line 38
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    const/4 v0, 0x1

    .line 43
    if-eq p3, v0, :cond_0

    .line 44
    .line 45
    const/16 p2, 0xf

    .line 46
    .line 47
    invoke-static {p2}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    add-int/2addr p2, p2

    .line 52
    :cond_0
    const/4 p3, 0x0

    .line 53
    iput p3, p1, Lcm;->f:I

    .line 54
    .line 55
    const/4 v0, -0x1

    .line 56
    iput v0, p1, Lcm;->g:I

    .line 57
    .line 58
    iput p3, p1, Lcm;->h:I

    .line 59
    .line 60
    new-array p3, p2, [J

    .line 61
    .line 62
    iput-object p3, p1, Lcm;->j:Ljava/lang/Object;

    .line 63
    .line 64
    add-int/2addr p2, v0

    .line 65
    iput p2, p1, Lcm;->i:I

    .line 66
    .line 67
    iput-object p1, p0, Lie1;->e:Lcm;

    .line 68
    .line 69
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    iput-wide p1, p0, Lie1;->g:J

    .line 75
    .line 76
    sget-object p3, Lt82;->d:Lt82;

    .line 77
    .line 78
    iput-object p3, p0, Lie1;->j:Lt82;

    .line 79
    .line 80
    iput-wide p1, p0, Lie1;->h:J

    .line 81
    .line 82
    iput-wide p1, p0, Lie1;->i:J

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lie1;->l:Lvq2;

    .line 4
    .line 5
    iget-object v2, v1, Lvq2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lmd1;

    .line 8
    .line 9
    :goto_0
    iget-object v3, v0, Lie1;->e:Lcm;

    .line 10
    .line 11
    iget v4, v3, Lcm;->h:I

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-eqz v4, :cond_e

    .line 17
    .line 18
    iget-object v4, v3, Lcm;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, [J

    .line 21
    .line 22
    iget v5, v3, Lcm;->f:I

    .line 23
    .line 24
    aget-wide v7, v4, v5

    .line 25
    .line 26
    iget-object v4, v0, Lie1;->d:Lts;

    .line 27
    .line 28
    invoke-virtual {v4, v7, v8}, Lts;->e(J)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Long;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v9

    .line 41
    iget-wide v11, v0, Lie1;->k:J

    .line 42
    .line 43
    cmp-long v6, v9, v11

    .line 44
    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    iput-wide v9, v0, Lie1;->k:J

    .line 52
    .line 53
    iget-object v4, v0, Lie1;->a:Lde1;

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Lde1;->a(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-wide v13, v0, Lie1;->k:J

    .line 59
    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    iget-object v6, v0, Lie1;->a:Lde1;

    .line 64
    .line 65
    iget-object v4, v0, Lie1;->b:Lib1;

    .line 66
    .line 67
    move-wide/from16 v9, p1

    .line 68
    .line 69
    move-wide/from16 v11, p3

    .line 70
    .line 71
    move-object/from16 v17, v4

    .line 72
    .line 73
    invoke-virtual/range {v6 .. v17}, Lde1;->g(JJJJZZLib1;)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    move-object/from16 v9, v17

    .line 78
    .line 79
    const/4 v10, 0x5

    .line 80
    const/4 v13, 0x4

    .line 81
    if-eq v4, v10, :cond_5

    .line 82
    .line 83
    if-eq v4, v13, :cond_5

    .line 84
    .line 85
    iget-wide v14, v9, Lib1;->a:J

    .line 86
    .line 87
    iget-object v10, v0, Lie1;->f:Lee1;

    .line 88
    .line 89
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    cmp-long v18, v7, v16

    .line 98
    .line 99
    if-eqz v18, :cond_2

    .line 100
    .line 101
    const/16 v18, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    const/16 v18, 0x0

    .line 105
    .line 106
    :goto_1
    invoke-static/range {v18 .. v18}, Lzt0;->D(Z)V

    .line 107
    .line 108
    .line 109
    cmp-long v18, v14, v16

    .line 110
    .line 111
    if-eqz v18, :cond_3

    .line 112
    .line 113
    const/16 v18, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    const/16 v18, 0x0

    .line 117
    .line 118
    :goto_2
    invoke-static/range {v18 .. v18}, Lzt0;->D(Z)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v19, v6

    .line 122
    .line 123
    iget-wide v5, v10, Lee1;->a:J

    .line 124
    .line 125
    cmp-long v20, v5, v16

    .line 126
    .line 127
    if-eqz v20, :cond_4

    .line 128
    .line 129
    iget-wide v11, v10, Lee1;->b:J

    .line 130
    .line 131
    cmp-long v16, v11, v16

    .line 132
    .line 133
    if-eqz v16, :cond_4

    .line 134
    .line 135
    cmp-long v16, v7, v5

    .line 136
    .line 137
    if-eqz v16, :cond_4

    .line 138
    .line 139
    sub-long v11, v14, v11

    .line 140
    .line 141
    sub-long v5, v7, v5

    .line 142
    .line 143
    long-to-double v11, v11

    .line 144
    long-to-double v5, v5

    .line 145
    div-double/2addr v11, v5

    .line 146
    goto :goto_3

    .line 147
    :cond_4
    iget-object v5, v10, Lee1;->d:Landroid/util/Range;

    .line 148
    .line 149
    invoke-virtual {v5}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    check-cast v5, Ljava/lang/Double;

    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 156
    .line 157
    .line 158
    move-result-wide v11

    .line 159
    :goto_3
    iget-object v5, v10, Lee1;->d:Landroid/util/Range;

    .line 160
    .line 161
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v5, v6}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, Ljava/lang/Double;

    .line 170
    .line 171
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 172
    .line 173
    .line 174
    move-result-wide v5

    .line 175
    iget-wide v11, v10, Lee1;->c:D

    .line 176
    .line 177
    const-wide v16, 0x3fe99999a0000000L    # 0.800000011920929

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    mul-double v11, v11, v16

    .line 183
    .line 184
    const-wide v16, 0x3fc99999a0000000L    # 0.20000000298023224

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    mul-double v5, v5, v16

    .line 190
    .line 191
    add-double/2addr v5, v11

    .line 192
    iput-wide v5, v10, Lee1;->c:D

    .line 193
    .line 194
    iput-wide v7, v10, Lee1;->a:J

    .line 195
    .line 196
    iput-wide v14, v10, Lee1;->b:J

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_5
    move-object/from16 v19, v6

    .line 200
    .line 201
    :goto_4
    const/4 v5, 0x3

    .line 202
    const/4 v6, 0x1

    .line 203
    if-eqz v4, :cond_8

    .line 204
    .line 205
    if-eq v4, v6, :cond_8

    .line 206
    .line 207
    const/4 v10, 0x2

    .line 208
    if-eq v4, v10, :cond_7

    .line 209
    .line 210
    if-eq v4, v5, :cond_7

    .line 211
    .line 212
    if-eq v4, v13, :cond_6

    .line 213
    .line 214
    return-void

    .line 215
    :cond_6
    iput-wide v7, v0, Lie1;->h:J

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_7
    iput-wide v7, v0, Lie1;->h:J

    .line 220
    .line 221
    invoke-virtual {v3}, Lcm;->k()J

    .line 222
    .line 223
    .line 224
    new-instance v3, Lck4;

    .line 225
    .line 226
    const/4 v4, 0x1

    .line 227
    invoke-direct {v3, v1, v4}, Lck4;-><init>(Lvq2;I)V

    .line 228
    .line 229
    .line 230
    iget-object v4, v2, Lmd1;->i:Ljava/util/concurrent/Executor;

    .line 231
    .line 232
    invoke-interface {v4, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 233
    .line 234
    .line 235
    iget-object v3, v2, Lmd1;->d:Ljava/util/ArrayDeque;

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    check-cast v3, Lrd1;

    .line 242
    .line 243
    invoke-virtual {v3}, Lrd1;->a()V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_8
    iput-wide v7, v0, Lie1;->h:J

    .line 249
    .line 250
    invoke-virtual {v3}, Lcm;->k()J

    .line 251
    .line 252
    .line 253
    move-result-wide v7

    .line 254
    iget-object v3, v0, Lie1;->c:Lts;

    .line 255
    .line 256
    invoke-virtual {v3, v7, v8}, Lts;->e(J)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    check-cast v3, Lt82;

    .line 261
    .line 262
    if-eqz v3, :cond_9

    .line 263
    .line 264
    sget-object v10, Lt82;->d:Lt82;

    .line 265
    .line 266
    invoke-virtual {v3, v10}, Lt82;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-nez v10, :cond_9

    .line 271
    .line 272
    iget-object v10, v0, Lie1;->j:Lt82;

    .line 273
    .line 274
    invoke-virtual {v3, v10}, Lt82;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    if-nez v10, :cond_9

    .line 279
    .line 280
    iput-object v3, v0, Lie1;->j:Lt82;

    .line 281
    .line 282
    new-instance v10, Lgg4;

    .line 283
    .line 284
    invoke-direct {v10}, Lgg4;-><init>()V

    .line 285
    .line 286
    .line 287
    iget v11, v3, Lt82;->a:I

    .line 288
    .line 289
    iput v11, v10, Lgg4;->s:I

    .line 290
    .line 291
    iget v11, v3, Lt82;->b:I

    .line 292
    .line 293
    iput v11, v10, Lgg4;->t:I

    .line 294
    .line 295
    const-string v11, "video/raw"

    .line 296
    .line 297
    invoke-virtual {v10, v11}, Lgg4;->e(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    new-instance v11, Lph4;

    .line 301
    .line 302
    invoke-direct {v11, v10}, Lph4;-><init>(Lgg4;)V

    .line 303
    .line 304
    .line 305
    iput-object v11, v1, Lvq2;->g:Ljava/lang/Object;

    .line 306
    .line 307
    new-instance v10, Lck4;

    .line 308
    .line 309
    invoke-direct {v10, v1, v3}, Lck4;-><init>(Lvq2;Lt82;)V

    .line 310
    .line 311
    .line 312
    iget-object v3, v2, Lmd1;->i:Ljava/util/concurrent/Executor;

    .line 313
    .line 314
    invoke-interface {v3, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 315
    .line 316
    .line 317
    :cond_9
    if-nez v4, :cond_a

    .line 318
    .line 319
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 320
    .line 321
    .line 322
    move-result-wide v3

    .line 323
    :goto_5
    move-object/from16 v9, v19

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_a
    iget-wide v3, v9, Lib1;->b:J

    .line 327
    .line 328
    goto :goto_5

    .line 329
    :goto_6
    iget v10, v9, Lde1;->d:I

    .line 330
    .line 331
    iput v5, v9, Lde1;->d:I

    .line 332
    .line 333
    iget-object v11, v9, Lde1;->k:Lpz;

    .line 334
    .line 335
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 339
    .line 340
    .line 341
    move-result-wide v11

    .line 342
    invoke-static {v11, v12}, Lv23;->r(J)J

    .line 343
    .line 344
    .line 345
    move-result-wide v11

    .line 346
    iput-wide v11, v9, Lde1;->f:J

    .line 347
    .line 348
    if-eq v10, v5, :cond_b

    .line 349
    .line 350
    move v11, v6

    .line 351
    goto :goto_7

    .line 352
    :cond_b
    const/4 v11, 0x0

    .line 353
    :goto_7
    if-eqz v11, :cond_c

    .line 354
    .line 355
    iget-object v5, v2, Lmd1;->e:Landroid/view/Surface;

    .line 356
    .line 357
    if-eqz v5, :cond_c

    .line 358
    .line 359
    new-instance v5, Lck4;

    .line 360
    .line 361
    const/4 v6, 0x0

    .line 362
    invoke-direct {v5, v1, v6}, Lck4;-><init>(Lvq2;I)V

    .line 363
    .line 364
    .line 365
    iget-object v6, v2, Lmd1;->i:Ljava/util/concurrent/Executor;

    .line 366
    .line 367
    invoke-interface {v6, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 368
    .line 369
    .line 370
    :cond_c
    iget-object v5, v1, Lvq2;->g:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v5, Lph4;

    .line 373
    .line 374
    if-nez v5, :cond_d

    .line 375
    .line 376
    new-instance v5, Lgg4;

    .line 377
    .line 378
    invoke-direct {v5}, Lgg4;-><init>()V

    .line 379
    .line 380
    .line 381
    new-instance v6, Lph4;

    .line 382
    .line 383
    invoke-direct {v6, v5}, Lph4;-><init>(Lgg4;)V

    .line 384
    .line 385
    .line 386
    move-object v9, v6

    .line 387
    :goto_8
    move-wide v5, v7

    .line 388
    move-wide v7, v3

    .line 389
    goto :goto_9

    .line 390
    :cond_d
    move-object v9, v5

    .line 391
    goto :goto_8

    .line 392
    :goto_9
    iget-object v4, v2, Lmd1;->j:Lbe1;

    .line 393
    .line 394
    const/4 v10, 0x0

    .line 395
    invoke-interface/range {v4 .. v10}, Lbe1;->b(JJLph4;Landroid/media/MediaFormat;)V

    .line 396
    .line 397
    .line 398
    iget-object v3, v2, Lmd1;->d:Ljava/util/ArrayDeque;

    .line 399
    .line 400
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    check-cast v3, Lrd1;

    .line 405
    .line 406
    iget-object v4, v3, Lrd1;->c:Lsd1;

    .line 407
    .line 408
    iget-object v5, v3, Lrd1;->a:Lzf4;

    .line 409
    .line 410
    iget v3, v3, Lrd1;->b:I

    .line 411
    .line 412
    invoke-virtual {v4, v5, v3, v7, v8}, Lsd1;->w0(Lzf4;IJ)V

    .line 413
    .line 414
    .line 415
    goto/16 :goto_0

    .line 416
    .line 417
    :cond_e
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 418
    .line 419
    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 420
    .line 421
    .line 422
    throw v1
.end method
