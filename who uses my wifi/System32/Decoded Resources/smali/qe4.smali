.class public final Lqe4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public A:J

.field public B:Lpz;

.field public final a:Lrc3;

.field public final b:[J

.field public c:Landroid/media/AudioTrack;

.field public d:Lpe4;

.field public e:I

.field public f:J

.field public g:F

.field public h:Z

.field public i:J

.field public j:J

.field public k:J

.field public l:Ljava/lang/reflect/Method;

.field public m:J

.field public n:Z

.field public o:J

.field public p:J

.field public q:J

.field public r:J

.field public s:I

.field public t:I

.field public u:J

.field public v:J

.field public w:J

.field public x:J

.field public y:Z

.field public z:J


# direct methods
.method public constructor <init>(Lrc3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe4;->a:Lrc3;

    .line 5
    .line 6
    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    .line 7
    .line 8
    const-string v0, "getLatency"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lqe4;->l:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    :catch_0
    const/16 p1, 0xa

    .line 18
    .line 19
    new-array p1, p1, [J

    .line 20
    .line 21
    iput-object p1, p0, Lqe4;->b:[J

    .line 22
    .line 23
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    iput-wide v0, p0, Lqe4;->A:J

    .line 29
    .line 30
    iput-wide v0, p0, Lqe4;->z:J

    .line 31
    .line 32
    sget-object p1, Lpz;->o:Lpz;

    .line 33
    .line 34
    iput-object p1, p0, Lqe4;->B:Lpz;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(Landroid/media/AudioTrack;IIIZ)V
    .locals 2

    .line 1
    iput-object p1, p0, Lqe4;->c:Landroid/media/AudioTrack;

    .line 2
    .line 3
    new-instance v0, Lpe4;

    .line 4
    .line 5
    iget-object v1, p0, Lqe4;->a:Lrc3;

    .line 6
    .line 7
    invoke-direct {v0, p1, v1}, Lpe4;-><init>(Landroid/media/AudioTrack;Lrc3;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lqe4;->d:Lpe4;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Lqe4;->e:I

    .line 17
    .line 18
    invoke-static {p2}, Lv23;->a(I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput-boolean p1, p0, Lqe4;->n:Z

    .line 23
    .line 24
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    div-int/2addr p4, p3

    .line 32
    int-to-long p1, p4

    .line 33
    iget p3, p0, Lqe4;->e:I

    .line 34
    .line 35
    invoke-static {p3, p1, p2}, Lv23;->s(IJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-wide p1, v0

    .line 41
    :goto_0
    iput-wide p1, p0, Lqe4;->f:J

    .line 42
    .line 43
    const-wide/16 p1, 0x0

    .line 44
    .line 45
    iput-wide p1, p0, Lqe4;->q:J

    .line 46
    .line 47
    iput-wide p1, p0, Lqe4;->r:J

    .line 48
    .line 49
    iput-wide v0, p0, Lqe4;->u:J

    .line 50
    .line 51
    iput-wide v0, p0, Lqe4;->v:J

    .line 52
    .line 53
    iput-wide p1, p0, Lqe4;->o:J

    .line 54
    .line 55
    iput-wide p1, p0, Lqe4;->m:J

    .line 56
    .line 57
    const/high16 p1, 0x3f800000    # 1.0f

    .line 58
    .line 59
    iput p1, p0, Lqe4;->g:F

    .line 60
    .line 61
    iput-wide v0, p0, Lqe4;->i:J

    .line 62
    .line 63
    iput-boolean p5, p0, Lqe4;->y:Z

    .line 64
    .line 65
    return-void
.end method

.method public final b()J
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lqe4;->c:Landroid/media/AudioTrack;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const-wide/16 v5, 0x3e8

    .line 13
    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x3

    .line 18
    if-ne v2, v10, :cond_19

    .line 19
    .line 20
    iget-object v2, v0, Lqe4;->B:Lpz;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v11

    .line 29
    div-long/2addr v11, v5

    .line 30
    iget-wide v13, v0, Lqe4;->k:J

    .line 31
    .line 32
    sub-long v13, v11, v13

    .line 33
    .line 34
    const-wide/16 v15, 0x7530

    .line 35
    .line 36
    cmp-long v2, v13, v15

    .line 37
    .line 38
    if-ltz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Lqe4;->e()J

    .line 41
    .line 42
    .line 43
    move-result-wide v13

    .line 44
    iget v2, v0, Lqe4;->e:I

    .line 45
    .line 46
    invoke-static {v2, v13, v14}, Lv23;->s(IJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v13

    .line 50
    cmp-long v2, v13, v7

    .line 51
    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    move-object/from16 v26, v1

    .line 55
    .line 56
    move-wide/from16 v16, v5

    .line 57
    .line 58
    move-wide/from16 v22, v7

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    goto/16 :goto_b

    .line 62
    .line 63
    :cond_0
    iget v2, v0, Lqe4;->s:I

    .line 64
    .line 65
    iget v15, v0, Lqe4;->g:F

    .line 66
    .line 67
    invoke-static {v13, v14, v15}, Lv23;->w(JF)J

    .line 68
    .line 69
    .line 70
    move-result-wide v13

    .line 71
    sub-long/2addr v13, v11

    .line 72
    iget-object v15, v0, Lqe4;->b:[J

    .line 73
    .line 74
    aput-wide v13, v15, v2

    .line 75
    .line 76
    iget v2, v0, Lqe4;->s:I

    .line 77
    .line 78
    add-int/2addr v2, v9

    .line 79
    const/16 v13, 0xa

    .line 80
    .line 81
    rem-int/2addr v2, v13

    .line 82
    iput v2, v0, Lqe4;->s:I

    .line 83
    .line 84
    iget v2, v0, Lqe4;->t:I

    .line 85
    .line 86
    if-ge v2, v13, :cond_1

    .line 87
    .line 88
    add-int/2addr v2, v9

    .line 89
    iput v2, v0, Lqe4;->t:I

    .line 90
    .line 91
    :cond_1
    iput-wide v11, v0, Lqe4;->k:J

    .line 92
    .line 93
    iput-wide v7, v0, Lqe4;->j:J

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    :goto_0
    iget v13, v0, Lqe4;->t:I

    .line 97
    .line 98
    if-ge v2, v13, :cond_2

    .line 99
    .line 100
    move-wide/from16 v16, v5

    .line 101
    .line 102
    iget-wide v5, v0, Lqe4;->j:J

    .line 103
    .line 104
    aget-wide v18, v15, v2

    .line 105
    .line 106
    int-to-long v13, v13

    .line 107
    div-long v18, v18, v13

    .line 108
    .line 109
    add-long v5, v18, v5

    .line 110
    .line 111
    iput-wide v5, v0, Lqe4;->j:J

    .line 112
    .line 113
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    move-wide/from16 v5, v16

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    move-wide/from16 v16, v5

    .line 119
    .line 120
    iget-boolean v2, v0, Lqe4;->n:Z

    .line 121
    .line 122
    const-wide/32 v13, 0x7a120

    .line 123
    .line 124
    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    iget-object v2, v0, Lqe4;->l:Ljava/lang/reflect/Method;

    .line 128
    .line 129
    if-eqz v2, :cond_6

    .line 130
    .line 131
    const-wide/32 v18, 0x4c4b40

    .line 132
    .line 133
    .line 134
    iget-wide v5, v0, Lqe4;->o:J

    .line 135
    .line 136
    sub-long v5, v11, v5

    .line 137
    .line 138
    cmp-long v5, v5, v13

    .line 139
    .line 140
    if-ltz v5, :cond_5

    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    :try_start_0
    iget-object v6, v0, Lqe4;->c:Landroid/media/AudioTrack;

    .line 144
    .line 145
    if-eqz v6, :cond_3

    .line 146
    .line 147
    invoke-virtual {v2, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Ljava/lang/Integer;

    .line 152
    .line 153
    sget-object v6, Lv23;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    move-wide/from16 v20, v13

    .line 160
    .line 161
    int-to-long v13, v2

    .line 162
    mul-long v13, v13, v16

    .line 163
    .line 164
    :try_start_1
    iget-wide v9, v0, Lqe4;->f:J

    .line 165
    .line 166
    sub-long/2addr v13, v9

    .line 167
    iput-wide v13, v0, Lqe4;->m:J

    .line 168
    .line 169
    invoke-static {v13, v14, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 170
    .line 171
    .line 172
    move-result-wide v9

    .line 173
    iput-wide v9, v0, Lqe4;->m:J

    .line 174
    .line 175
    cmp-long v13, v9, v18

    .line 176
    .line 177
    if-lez v13, :cond_4

    .line 178
    .line 179
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    new-instance v14, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    add-int/lit8 v13, v13, 0x29

    .line 190
    .line 191
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 192
    .line 193
    .line 194
    const-string v13, "Ignoring impossibly large audio latency: "

    .line 195
    .line 196
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v14, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-static {v9}, La30;->x(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iput-wide v7, v0, Lqe4;->m:J

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :catch_0
    move-wide/from16 v20, v13

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_3
    move-wide/from16 v20, v13

    .line 216
    .line 217
    throw v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 218
    :catch_1
    :goto_1
    iput-object v5, v0, Lqe4;->l:Ljava/lang/reflect/Method;

    .line 219
    .line 220
    :cond_4
    :goto_2
    iput-wide v11, v0, Lqe4;->o:J

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_5
    move-wide/from16 v20, v13

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_6
    move-wide/from16 v20, v13

    .line 227
    .line 228
    const-wide/32 v18, 0x4c4b40

    .line 229
    .line 230
    .line 231
    :goto_3
    iget-object v5, v0, Lqe4;->d:Lpe4;

    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget v9, v5, Lpe4;->b:I

    .line 237
    .line 238
    iget-object v10, v5, Lpe4;->a:Lsn1;

    .line 239
    .line 240
    iget v13, v0, Lqe4;->g:F

    .line 241
    .line 242
    invoke-virtual {v0, v11, v12}, Lqe4;->d(J)J

    .line 243
    .line 244
    .line 245
    move-result-wide v14

    .line 246
    iget-object v2, v5, Lpe4;->c:Lrc3;

    .line 247
    .line 248
    move-wide/from16 v22, v7

    .line 249
    .line 250
    iget-wide v6, v5, Lpe4;->g:J

    .line 251
    .line 252
    sub-long v6, v11, v6

    .line 253
    .line 254
    const/16 v24, 0x2

    .line 255
    .line 256
    iget-wide v3, v5, Lpe4;->f:J

    .line 257
    .line 258
    cmp-long v3, v6, v3

    .line 259
    .line 260
    if-gez v3, :cond_7

    .line 261
    .line 262
    move-object/from16 v26, v1

    .line 263
    .line 264
    goto/16 :goto_a

    .line 265
    .line 266
    :cond_7
    iput-wide v11, v5, Lpe4;->g:J

    .line 267
    .line 268
    iget-object v3, v10, Lsn1;->d:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v3, Landroid/media/AudioTrack;

    .line 271
    .line 272
    iget-object v4, v10, Lsn1;->e:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v4, Landroid/media/AudioTimestamp;

    .line 275
    .line 276
    invoke-virtual {v3, v4}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-eqz v3, :cond_9

    .line 281
    .line 282
    iget-wide v6, v4, Landroid/media/AudioTimestamp;->framePosition:J

    .line 283
    .line 284
    move/from16 v25, v9

    .line 285
    .line 286
    iget-wide v8, v10, Lsn1;->b:J

    .line 287
    .line 288
    cmp-long v8, v8, v6

    .line 289
    .line 290
    if-lez v8, :cond_8

    .line 291
    .line 292
    iget-wide v8, v10, Lsn1;->a:J

    .line 293
    .line 294
    const-wide/16 v26, 0x1

    .line 295
    .line 296
    add-long v8, v8, v26

    .line 297
    .line 298
    iput-wide v8, v10, Lsn1;->a:J

    .line 299
    .line 300
    :cond_8
    iput-wide v6, v10, Lsn1;->b:J

    .line 301
    .line 302
    iget-wide v8, v10, Lsn1;->a:J

    .line 303
    .line 304
    const/16 v26, 0x20

    .line 305
    .line 306
    shl-long v8, v8, v26

    .line 307
    .line 308
    add-long/2addr v6, v8

    .line 309
    iput-wide v6, v10, Lsn1;->c:J

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_9
    move/from16 v25, v9

    .line 313
    .line 314
    :goto_4
    if-eqz v3, :cond_d

    .line 315
    .line 316
    iget-wide v6, v4, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 317
    .line 318
    div-long v6, v6, v16

    .line 319
    .line 320
    iget-wide v8, v10, Lsn1;->c:J

    .line 321
    .line 322
    move-object/from16 v26, v1

    .line 323
    .line 324
    iget-object v1, v10, Lsn1;->e:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v1, Landroid/media/AudioTimestamp;

    .line 327
    .line 328
    iget-wide v0, v1, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 329
    .line 330
    div-long v0, v0, v16

    .line 331
    .line 332
    sub-long v0, v11, v0

    .line 333
    .line 334
    move/from16 v27, v3

    .line 335
    .line 336
    move/from16 v3, v25

    .line 337
    .line 338
    invoke-static {v3, v8, v9}, Lv23;->s(IJ)J

    .line 339
    .line 340
    .line 341
    move-result-wide v8

    .line 342
    invoke-static {v0, v1, v13}, Lv23;->v(JF)J

    .line 343
    .line 344
    .line 345
    move-result-wide v0

    .line 346
    add-long/2addr v0, v8

    .line 347
    sub-long v8, v6, v11

    .line 348
    .line 349
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    .line 350
    .line 351
    .line 352
    move-result-wide v8

    .line 353
    cmp-long v8, v8, v18

    .line 354
    .line 355
    const-string v9, ", "

    .line 356
    .line 357
    move-wide/from16 v28, v0

    .line 358
    .line 359
    if-lez v8, :cond_b

    .line 360
    .line 361
    iget-wide v0, v10, Lsn1;->c:J

    .line 362
    .line 363
    iget-object v2, v2, Lrc3;->g:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v2, Ldf4;

    .line 366
    .line 367
    move-object/from16 v25, v9

    .line 368
    .line 369
    invoke-virtual {v2}, Ldf4;->i()J

    .line 370
    .line 371
    .line 372
    move-result-wide v8

    .line 373
    move/from16 v30, v3

    .line 374
    .line 375
    invoke-virtual {v2}, Ldf4;->j()J

    .line 376
    .line 377
    .line 378
    move-result-wide v2

    .line 379
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v18

    .line 383
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 384
    .line 385
    .line 386
    move-result v18

    .line 387
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v19

    .line 391
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 392
    .line 393
    .line 394
    move-result v19

    .line 395
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v28

    .line 399
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    .line 400
    .line 401
    .line 402
    move-result v28

    .line 403
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v29

    .line 407
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    .line 408
    .line 409
    .line 410
    move-result v29

    .line 411
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v31

    .line 415
    invoke-virtual/range {v31 .. v31}, Ljava/lang/String;->length()I

    .line 416
    .line 417
    .line 418
    move-result v31

    .line 419
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v32

    .line 423
    invoke-virtual/range {v32 .. v32}, Ljava/lang/String;->length()I

    .line 424
    .line 425
    .line 426
    move-result v32

    .line 427
    add-int/lit8 v18, v18, 0x34

    .line 428
    .line 429
    add-int v18, v18, v19

    .line 430
    .line 431
    move-object/from16 v33, v4

    .line 432
    .line 433
    new-instance v4, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    add-int/lit8 v18, v18, 0x2

    .line 436
    .line 437
    add-int v18, v18, v28

    .line 438
    .line 439
    add-int/lit8 v18, v18, 0x2

    .line 440
    .line 441
    add-int v18, v18, v29

    .line 442
    .line 443
    add-int/lit8 v18, v18, 0x2

    .line 444
    .line 445
    add-int v18, v18, v31

    .line 446
    .line 447
    add-int/lit8 v18, v18, 0x2

    .line 448
    .line 449
    move/from16 v31, v13

    .line 450
    .line 451
    add-int v13, v18, v32

    .line 452
    .line 453
    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 454
    .line 455
    .line 456
    const-string v13, "Spurious audio timestamp (system clock mismatch): "

    .line 457
    .line 458
    move-object/from16 v32, v10

    .line 459
    .line 460
    move-object/from16 v10, v25

    .line 461
    .line 462
    invoke-static {v4, v13, v0, v1, v10}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-static {v4, v10, v11, v12, v10}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v4, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-static {v4, v10, v8, v9, v10}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    const/4 v8, 0x4

    .line 488
    invoke-virtual {v5, v8}, Lpe4;->a(I)V

    .line 489
    .line 490
    .line 491
    :cond_a
    :goto_5
    const/4 v0, 0x0

    .line 492
    goto/16 :goto_6

    .line 493
    .line 494
    :cond_b
    move/from16 v30, v3

    .line 495
    .line 496
    move-object/from16 v33, v4

    .line 497
    .line 498
    move-object/from16 v32, v10

    .line 499
    .line 500
    move/from16 v31, v13

    .line 501
    .line 502
    move-object v10, v9

    .line 503
    sub-long v0, v28, v14

    .line 504
    .line 505
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 506
    .line 507
    .line 508
    move-result-wide v0

    .line 509
    cmp-long v0, v0, v18

    .line 510
    .line 511
    if-lez v0, :cond_c

    .line 512
    .line 513
    move-object/from16 v0, v32

    .line 514
    .line 515
    iget-wide v3, v0, Lsn1;->c:J

    .line 516
    .line 517
    iget-object v1, v2, Lrc3;->g:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v1, Ldf4;

    .line 520
    .line 521
    invoke-virtual {v1}, Ldf4;->i()J

    .line 522
    .line 523
    .line 524
    move-result-wide v8

    .line 525
    invoke-virtual {v1}, Ldf4;->j()J

    .line 526
    .line 527
    .line 528
    move-result-wide v1

    .line 529
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v13

    .line 533
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 534
    .line 535
    .line 536
    move-result v13

    .line 537
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v18

    .line 541
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 542
    .line 543
    .line 544
    move-result v18

    .line 545
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v19

    .line 549
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 550
    .line 551
    .line 552
    move-result v19

    .line 553
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v25

    .line 557
    invoke-virtual/range {v25 .. v25}, Ljava/lang/String;->length()I

    .line 558
    .line 559
    .line 560
    move-result v25

    .line 561
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v28

    .line 565
    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    .line 566
    .line 567
    .line 568
    move-result v28

    .line 569
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v29

    .line 573
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    .line 574
    .line 575
    .line 576
    move-result v29

    .line 577
    add-int/lit8 v13, v13, 0x36

    .line 578
    .line 579
    add-int v13, v13, v18

    .line 580
    .line 581
    move/from16 v18, v13

    .line 582
    .line 583
    new-instance v13, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    add-int/lit8 v18, v18, 0x2

    .line 586
    .line 587
    add-int v18, v18, v19

    .line 588
    .line 589
    add-int/lit8 v18, v18, 0x2

    .line 590
    .line 591
    add-int v18, v18, v25

    .line 592
    .line 593
    add-int/lit8 v18, v18, 0x2

    .line 594
    .line 595
    add-int v18, v18, v28

    .line 596
    .line 597
    add-int/lit8 v18, v18, 0x2

    .line 598
    .line 599
    add-int v0, v18, v29

    .line 600
    .line 601
    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 602
    .line 603
    .line 604
    const-string v0, "Spurious audio timestamp (frame position mismatch): "

    .line 605
    .line 606
    invoke-static {v13, v0, v3, v4, v10}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-static {v13, v10, v11, v12, v10}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v13, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-static {v13, v10, v8, v9, v10}, Lex0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v13, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    const/4 v8, 0x4

    .line 632
    invoke-virtual {v5, v8}, Lpe4;->a(I)V

    .line 633
    .line 634
    .line 635
    goto/16 :goto_5

    .line 636
    .line 637
    :cond_c
    const/4 v8, 0x4

    .line 638
    iget v0, v5, Lpe4;->d:I

    .line 639
    .line 640
    if-ne v0, v8, :cond_a

    .line 641
    .line 642
    const/4 v0, 0x0

    .line 643
    invoke-virtual {v5, v0}, Lpe4;->a(I)V

    .line 644
    .line 645
    .line 646
    goto :goto_6

    .line 647
    :cond_d
    move-object/from16 v26, v1

    .line 648
    .line 649
    move/from16 v27, v3

    .line 650
    .line 651
    move-object/from16 v33, v4

    .line 652
    .line 653
    move-object/from16 v32, v10

    .line 654
    .line 655
    move/from16 v31, v13

    .line 656
    .line 657
    move/from16 v30, v25

    .line 658
    .line 659
    goto/16 :goto_5

    .line 660
    .line 661
    :goto_6
    iget v1, v5, Lpe4;->d:I

    .line 662
    .line 663
    if-eqz v1, :cond_16

    .line 664
    .line 665
    const/4 v2, 0x1

    .line 666
    if-eq v1, v2, :cond_11

    .line 667
    .line 668
    move/from16 v3, v24

    .line 669
    .line 670
    if-eq v1, v3, :cond_10

    .line 671
    .line 672
    const/4 v6, 0x3

    .line 673
    if-eq v1, v6, :cond_e

    .line 674
    .line 675
    goto :goto_7

    .line 676
    :cond_e
    if-eqz v27, :cond_f

    .line 677
    .line 678
    invoke-virtual {v5, v0}, Lpe4;->a(I)V

    .line 679
    .line 680
    .line 681
    :cond_f
    :goto_7
    move v1, v0

    .line 682
    goto/16 :goto_9

    .line 683
    .line 684
    :cond_10
    if-nez v27, :cond_f

    .line 685
    .line 686
    invoke-virtual {v5, v0}, Lpe4;->a(I)V

    .line 687
    .line 688
    .line 689
    goto :goto_7

    .line 690
    :cond_11
    if-eqz v27, :cond_15

    .line 691
    .line 692
    move-object/from16 v0, v32

    .line 693
    .line 694
    iget-wide v3, v0, Lsn1;->c:J

    .line 695
    .line 696
    iget-wide v7, v5, Lpe4;->h:J

    .line 697
    .line 698
    cmp-long v1, v3, v7

    .line 699
    .line 700
    if-gtz v1, :cond_12

    .line 701
    .line 702
    goto :goto_8

    .line 703
    :cond_12
    iget-wide v3, v5, Lpe4;->i:J

    .line 704
    .line 705
    sub-long v3, v11, v3

    .line 706
    .line 707
    move/from16 v1, v30

    .line 708
    .line 709
    invoke-static {v1, v7, v8}, Lv23;->s(IJ)J

    .line 710
    .line 711
    .line 712
    move-result-wide v7

    .line 713
    move/from16 v9, v31

    .line 714
    .line 715
    invoke-static {v3, v4, v9}, Lv23;->v(JF)J

    .line 716
    .line 717
    .line 718
    move-result-wide v3

    .line 719
    add-long/2addr v3, v7

    .line 720
    iget-wide v7, v0, Lsn1;->c:J

    .line 721
    .line 722
    iget-object v10, v0, Lsn1;->e:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v10, Landroid/media/AudioTimestamp;

    .line 725
    .line 726
    iget-wide v13, v10, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 727
    .line 728
    div-long v13, v13, v16

    .line 729
    .line 730
    sub-long v13, v11, v13

    .line 731
    .line 732
    invoke-static {v1, v7, v8}, Lv23;->s(IJ)J

    .line 733
    .line 734
    .line 735
    move-result-wide v7

    .line 736
    invoke-static {v13, v14, v9}, Lv23;->v(JF)J

    .line 737
    .line 738
    .line 739
    move-result-wide v9

    .line 740
    add-long/2addr v9, v7

    .line 741
    sub-long/2addr v9, v3

    .line 742
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    .line 743
    .line 744
    .line 745
    move-result-wide v3

    .line 746
    cmp-long v1, v3, v16

    .line 747
    .line 748
    if-gez v1, :cond_13

    .line 749
    .line 750
    const/4 v3, 0x2

    .line 751
    invoke-virtual {v5, v3}, Lpe4;->a(I)V

    .line 752
    .line 753
    .line 754
    goto :goto_a

    .line 755
    :cond_13
    :goto_8
    iget-wide v3, v5, Lpe4;->e:J

    .line 756
    .line 757
    sub-long/2addr v11, v3

    .line 758
    const-wide/32 v3, 0x1e8480

    .line 759
    .line 760
    .line 761
    cmp-long v1, v11, v3

    .line 762
    .line 763
    if-lez v1, :cond_14

    .line 764
    .line 765
    const/4 v6, 0x3

    .line 766
    invoke-virtual {v5, v6}, Lpe4;->a(I)V

    .line 767
    .line 768
    .line 769
    goto :goto_a

    .line 770
    :cond_14
    iget-wide v0, v0, Lsn1;->c:J

    .line 771
    .line 772
    iput-wide v0, v5, Lpe4;->h:J

    .line 773
    .line 774
    move-object/from16 v4, v33

    .line 775
    .line 776
    iget-wide v0, v4, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 777
    .line 778
    div-long v0, v0, v16

    .line 779
    .line 780
    iput-wide v0, v5, Lpe4;->i:J

    .line 781
    .line 782
    goto :goto_a

    .line 783
    :cond_15
    const/4 v1, 0x0

    .line 784
    invoke-virtual {v5, v1}, Lpe4;->a(I)V

    .line 785
    .line 786
    .line 787
    goto :goto_9

    .line 788
    :cond_16
    move v1, v0

    .line 789
    move-object/from16 v0, v32

    .line 790
    .line 791
    move-object/from16 v4, v33

    .line 792
    .line 793
    if-eqz v27, :cond_17

    .line 794
    .line 795
    iget-wide v3, v4, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 796
    .line 797
    div-long v7, v3, v16

    .line 798
    .line 799
    iget-wide v9, v5, Lpe4;->e:J

    .line 800
    .line 801
    cmp-long v7, v7, v9

    .line 802
    .line 803
    if-ltz v7, :cond_18

    .line 804
    .line 805
    iget-wide v7, v0, Lsn1;->c:J

    .line 806
    .line 807
    iput-wide v7, v5, Lpe4;->h:J

    .line 808
    .line 809
    div-long v3, v3, v16

    .line 810
    .line 811
    iput-wide v3, v5, Lpe4;->i:J

    .line 812
    .line 813
    const/4 v2, 0x1

    .line 814
    invoke-virtual {v5, v2}, Lpe4;->a(I)V

    .line 815
    .line 816
    .line 817
    goto :goto_9

    .line 818
    :cond_17
    iget-wide v3, v5, Lpe4;->e:J

    .line 819
    .line 820
    sub-long/2addr v11, v3

    .line 821
    cmp-long v0, v11, v20

    .line 822
    .line 823
    if-lez v0, :cond_18

    .line 824
    .line 825
    const/4 v6, 0x3

    .line 826
    invoke-virtual {v5, v6}, Lpe4;->a(I)V

    .line 827
    .line 828
    .line 829
    :cond_18
    :goto_9
    move-object/from16 v0, p0

    .line 830
    .line 831
    goto :goto_b

    .line 832
    :cond_19
    move-object/from16 v26, v1

    .line 833
    .line 834
    move-wide/from16 v16, v5

    .line 835
    .line 836
    move-wide/from16 v22, v7

    .line 837
    .line 838
    :goto_a
    const/4 v1, 0x0

    .line 839
    goto :goto_9

    .line 840
    :goto_b
    iget-object v3, v0, Lqe4;->B:Lpz;

    .line 841
    .line 842
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 846
    .line 847
    .line 848
    move-result-wide v3

    .line 849
    div-long v3, v3, v16

    .line 850
    .line 851
    iget-object v5, v0, Lqe4;->d:Lpe4;

    .line 852
    .line 853
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    iget v7, v5, Lpe4;->d:I

    .line 857
    .line 858
    const/4 v8, 0x2

    .line 859
    if-ne v7, v8, :cond_1a

    .line 860
    .line 861
    const/4 v1, 0x1

    .line 862
    :cond_1a
    if-eqz v1, :cond_1b

    .line 863
    .line 864
    iget v7, v0, Lqe4;->g:F

    .line 865
    .line 866
    iget-object v8, v5, Lpe4;->a:Lsn1;

    .line 867
    .line 868
    iget-wide v9, v8, Lsn1;->c:J

    .line 869
    .line 870
    iget-object v8, v8, Lsn1;->e:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v8, Landroid/media/AudioTimestamp;

    .line 873
    .line 874
    iget-wide v11, v8, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 875
    .line 876
    div-long v11, v11, v16

    .line 877
    .line 878
    sub-long v11, v3, v11

    .line 879
    .line 880
    iget v8, v5, Lpe4;->b:I

    .line 881
    .line 882
    invoke-static {v8, v9, v10}, Lv23;->s(IJ)J

    .line 883
    .line 884
    .line 885
    move-result-wide v8

    .line 886
    invoke-static {v11, v12, v7}, Lv23;->v(JF)J

    .line 887
    .line 888
    .line 889
    move-result-wide v10

    .line 890
    add-long/2addr v10, v8

    .line 891
    goto :goto_c

    .line 892
    :cond_1b
    invoke-virtual {v0, v3, v4}, Lqe4;->d(J)J

    .line 893
    .line 894
    .line 895
    move-result-wide v10

    .line 896
    :goto_c
    invoke-virtual/range {v26 .. v26}, Landroid/media/AudioTrack;->getPlayState()I

    .line 897
    .line 898
    .line 899
    move-result v7

    .line 900
    const/4 v6, 0x3

    .line 901
    if-ne v7, v6, :cond_20

    .line 902
    .line 903
    if-nez v1, :cond_1c

    .line 904
    .line 905
    iget v1, v5, Lpe4;->d:I

    .line 906
    .line 907
    if-eqz v1, :cond_1d

    .line 908
    .line 909
    const/4 v2, 0x1

    .line 910
    if-ne v1, v2, :cond_1c

    .line 911
    .line 912
    goto :goto_d

    .line 913
    :cond_1c
    invoke-virtual {v0, v10, v11}, Lqe4;->c(J)V

    .line 914
    .line 915
    .line 916
    :cond_1d
    :goto_d
    iget-wide v5, v0, Lqe4;->A:J

    .line 917
    .line 918
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    cmp-long v1, v5, v7

    .line 924
    .line 925
    if-eqz v1, :cond_1e

    .line 926
    .line 927
    sub-long v5, v3, v5

    .line 928
    .line 929
    iget-wide v12, v0, Lqe4;->z:J

    .line 930
    .line 931
    sub-long v12, v10, v12

    .line 932
    .line 933
    iget v1, v0, Lqe4;->g:F

    .line 934
    .line 935
    invoke-static {v5, v6, v1}, Lv23;->v(JF)J

    .line 936
    .line 937
    .line 938
    move-result-wide v5

    .line 939
    iget-wide v14, v0, Lqe4;->z:J

    .line 940
    .line 941
    add-long/2addr v14, v5

    .line 942
    sub-long v16, v14, v10

    .line 943
    .line 944
    cmp-long v1, v12, v22

    .line 945
    .line 946
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->abs(J)J

    .line 947
    .line 948
    .line 949
    move-result-wide v12

    .line 950
    if-eqz v1, :cond_1e

    .line 951
    .line 952
    const-wide/32 v16, 0xf4240

    .line 953
    .line 954
    .line 955
    cmp-long v1, v12, v16

    .line 956
    .line 957
    if-gez v1, :cond_1e

    .line 958
    .line 959
    const-wide/16 v12, 0xa

    .line 960
    .line 961
    mul-long/2addr v5, v12

    .line 962
    const-wide/16 v12, 0x64

    .line 963
    .line 964
    div-long/2addr v5, v12

    .line 965
    sub-long v12, v14, v5

    .line 966
    .line 967
    add-long/2addr v14, v5

    .line 968
    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 969
    .line 970
    .line 971
    move-result-wide v5

    .line 972
    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 973
    .line 974
    .line 975
    move-result-wide v10

    .line 976
    :cond_1e
    iget-boolean v1, v0, Lqe4;->y:Z

    .line 977
    .line 978
    if-nez v1, :cond_1f

    .line 979
    .line 980
    iget-boolean v1, v0, Lqe4;->h:Z

    .line 981
    .line 982
    if-nez v1, :cond_1f

    .line 983
    .line 984
    iget-wide v5, v0, Lqe4;->z:J

    .line 985
    .line 986
    cmp-long v1, v5, v7

    .line 987
    .line 988
    if-eqz v1, :cond_1f

    .line 989
    .line 990
    cmp-long v1, v10, v5

    .line 991
    .line 992
    if-lez v1, :cond_1f

    .line 993
    .line 994
    const/4 v2, 0x1

    .line 995
    iput-boolean v2, v0, Lqe4;->h:Z

    .line 996
    .line 997
    sub-long v1, v10, v5

    .line 998
    .line 999
    sget-object v5, Lv23;->a:Ljava/lang/String;

    .line 1000
    .line 1001
    iget v5, v0, Lqe4;->g:F

    .line 1002
    .line 1003
    invoke-static {v1, v2}, Lv23;->q(J)J

    .line 1004
    .line 1005
    .line 1006
    move-result-wide v1

    .line 1007
    invoke-static {v1, v2, v5}, Lv23;->w(JF)J

    .line 1008
    .line 1009
    .line 1010
    move-result-wide v1

    .line 1011
    iget-object v5, v0, Lqe4;->B:Lpz;

    .line 1012
    .line 1013
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1017
    .line 1018
    .line 1019
    move-result-wide v5

    .line 1020
    invoke-static {v1, v2}, Lv23;->q(J)J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v1

    .line 1024
    sub-long/2addr v5, v1

    .line 1025
    iget-object v1, v0, Lqe4;->a:Lrc3;

    .line 1026
    .line 1027
    iget-object v1, v1, Lrc3;->g:Ljava/lang/Object;

    .line 1028
    .line 1029
    check-cast v1, Ldf4;

    .line 1030
    .line 1031
    iget-object v1, v1, Ldf4;->n:Lbi3;

    .line 1032
    .line 1033
    if-eqz v1, :cond_1f

    .line 1034
    .line 1035
    iget-object v1, v1, Lbi3;->g:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v1, Lef4;

    .line 1038
    .line 1039
    iget-object v1, v1, Lef4;->A0:Lwt2;

    .line 1040
    .line 1041
    iget-object v2, v1, Lwt2;->g:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v2, Landroid/os/Handler;

    .line 1044
    .line 1045
    if-eqz v2, :cond_1f

    .line 1046
    .line 1047
    new-instance v7, Lee4;

    .line 1048
    .line 1049
    invoke-direct {v7, v1, v5, v6}, Lee4;-><init>(Lwt2;J)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1053
    .line 1054
    .line 1055
    :cond_1f
    iput-wide v3, v0, Lqe4;->A:J

    .line 1056
    .line 1057
    iput-wide v10, v0, Lqe4;->z:J

    .line 1058
    .line 1059
    goto :goto_e

    .line 1060
    :cond_20
    const/4 v2, 0x1

    .line 1061
    if-eq v7, v2, :cond_21

    .line 1062
    .line 1063
    :goto_e
    return-wide v10

    .line 1064
    :cond_21
    invoke-virtual {v0, v10, v11}, Lqe4;->c(J)V

    .line 1065
    .line 1066
    .line 1067
    return-wide v10
.end method

.method public final c(J)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lqe4;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-wide v0, p0, Lqe4;->i:J

    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v4, v0, v2

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    cmp-long v4, p1, v0

    .line 17
    .line 18
    if-gez v4, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v4, p0, Lqe4;->g:F

    .line 22
    .line 23
    sub-long/2addr p1, v0

    .line 24
    invoke-static {p1, p2, v4}, Lv23;->w(JF)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    iget-object v0, p0, Lqe4;->B:Lpz;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-static {p1, p2}, Lv23;->q(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    sub-long/2addr v0, p1

    .line 42
    iput-wide v2, p0, Lqe4;->i:J

    .line 43
    .line 44
    iget-object p1, p0, Lqe4;->a:Lrc3;

    .line 45
    .line 46
    iget-object p1, p1, Lrc3;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ldf4;

    .line 49
    .line 50
    iget-object p1, p1, Ldf4;->n:Lbi3;

    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget-object p1, p1, Lbi3;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lef4;

    .line 57
    .line 58
    iget-object p1, p1, Lef4;->A0:Lwt2;

    .line 59
    .line 60
    iget-object p2, p1, Lwt2;->g:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p2, Landroid/os/Handler;

    .line 63
    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    new-instance v2, Lee4;

    .line 67
    .line 68
    invoke-direct {v2, p1, v0, v1}, Lee4;-><init>(Lwt2;J)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    return-void
.end method

.method public final d(J)J
    .locals 5

    .line 1
    iget v0, p0, Lqe4;->t:I

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide p1, p0, Lqe4;->u:J

    .line 11
    .line 12
    cmp-long p1, p1, v1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lqe4;->f()J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    iget v0, p0, Lqe4;->e:I

    .line 21
    .line 22
    invoke-static {v0, p1, p2}, Lv23;->s(IJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lqe4;->e()J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iget v0, p0, Lqe4;->e:I

    .line 32
    .line 33
    invoke-static {v0, p1, p2}, Lv23;->s(IJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-wide v3, p0, Lqe4;->j:J

    .line 39
    .line 40
    add-long/2addr p1, v3

    .line 41
    iget v0, p0, Lqe4;->g:F

    .line 42
    .line 43
    invoke-static {p1, p2, v0}, Lv23;->v(JF)J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    :goto_0
    iget-wide v3, p0, Lqe4;->m:J

    .line 48
    .line 49
    sub-long/2addr p1, v3

    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    iget-wide v3, p0, Lqe4;->u:J

    .line 57
    .line 58
    cmp-long v0, v3, v1

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-wide v0, p0, Lqe4;->x:J

    .line 63
    .line 64
    iget v2, p0, Lqe4;->e:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Lv23;->s(IJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    :cond_2
    return-wide p1
.end method

.method public final e()J
    .locals 12

    .line 1
    iget-wide v0, p0, Lqe4;->u:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lqe4;->f()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-wide v2, p0, Lqe4;->x:J

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_0
    iget-object v0, p0, Lqe4;->B:Lpz;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iget-wide v4, p0, Lqe4;->p:J

    .line 33
    .line 34
    sub-long v4, v0, v4

    .line 35
    .line 36
    const-wide/16 v6, 0x5

    .line 37
    .line 38
    cmp-long v4, v4, v6

    .line 39
    .line 40
    if-ltz v4, :cond_6

    .line 41
    .line 42
    iget-object v4, p0, Lqe4;->c:Landroid/media/AudioTrack;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlayState()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    const/4 v6, 0x1

    .line 52
    if-ne v5, v6, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    int-to-long v6, v4

    .line 60
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const-wide v8, 0xffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v6, v8

    .line 68
    const/16 v8, 0x1d

    .line 69
    .line 70
    if-gt v4, v8, :cond_3

    .line 71
    .line 72
    const-wide/16 v8, 0x0

    .line 73
    .line 74
    cmp-long v4, v6, v8

    .line 75
    .line 76
    if-nez v4, :cond_2

    .line 77
    .line 78
    iget-wide v10, p0, Lqe4;->q:J

    .line 79
    .line 80
    cmp-long v4, v10, v8

    .line 81
    .line 82
    if-lez v4, :cond_2

    .line 83
    .line 84
    const/4 v4, 0x3

    .line 85
    if-ne v5, v4, :cond_2

    .line 86
    .line 87
    iget-wide v4, p0, Lqe4;->v:J

    .line 88
    .line 89
    cmp-long v2, v4, v2

    .line 90
    .line 91
    if-nez v2, :cond_5

    .line 92
    .line 93
    iput-wide v0, p0, Lqe4;->v:J

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    iput-wide v2, p0, Lqe4;->v:J

    .line 97
    .line 98
    :cond_3
    iget-wide v2, p0, Lqe4;->q:J

    .line 99
    .line 100
    cmp-long v2, v2, v6

    .line 101
    .line 102
    if-lez v2, :cond_4

    .line 103
    .line 104
    iget-wide v2, p0, Lqe4;->r:J

    .line 105
    .line 106
    const-wide/16 v4, 0x1

    .line 107
    .line 108
    add-long/2addr v2, v4

    .line 109
    iput-wide v2, p0, Lqe4;->r:J

    .line 110
    .line 111
    :cond_4
    iput-wide v6, p0, Lqe4;->q:J

    .line 112
    .line 113
    :cond_5
    :goto_0
    iput-wide v0, p0, Lqe4;->p:J

    .line 114
    .line 115
    :cond_6
    iget-wide v0, p0, Lqe4;->q:J

    .line 116
    .line 117
    iget-wide v2, p0, Lqe4;->r:J

    .line 118
    .line 119
    const/16 v4, 0x20

    .line 120
    .line 121
    shl-long/2addr v2, v4

    .line 122
    add-long/2addr v0, v2

    .line 123
    return-wide v0
.end method

.method public final f()J
    .locals 10

    .line 1
    iget-object v0, p0, Lqe4;->c:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lqe4;->w:J

    .line 14
    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-object v0, p0, Lqe4;->B:Lpz;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Lv23;->r(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-wide v2, p0, Lqe4;->u:J

    .line 30
    .line 31
    sub-long/2addr v0, v2

    .line 32
    iget v2, p0, Lqe4;->g:F

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lv23;->v(JF)J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    iget v0, p0, Lqe4;->e:I

    .line 39
    .line 40
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 41
    .line 42
    int-to-long v5, v0

    .line 43
    const-wide/32 v7, 0xf4240

    .line 44
    .line 45
    .line 46
    invoke-static/range {v3 .. v9}, Lv23;->t(JJJLjava/math/RoundingMode;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    iget-wide v2, p0, Lqe4;->w:J

    .line 51
    .line 52
    add-long/2addr v2, v0

    .line 53
    return-wide v2
.end method
