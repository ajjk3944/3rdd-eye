.class public final Llm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# static fields
.field public static final l:[F


# instance fields
.field public final a:Lxb4;

.field public final b:Lkz2;

.field public final c:[Z

.field public final d:Ljm1;

.field public final e:Lr60;

.field public f:Lkm1;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Ljg1;

.field public j:Z

.field public k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Llm1;->l:[F

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lxb4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llm1;->a:Lxb4;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, Llm1;->c:[Z

    .line 10
    .line 11
    new-instance p1, Ljm1;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x80

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    iput-object v0, p1, Ljm1;->e:[B

    .line 21
    .line 22
    iput-object p1, p0, Llm1;->d:Ljm1;

    .line 23
    .line 24
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide v0, p0, Llm1;->k:J

    .line 30
    .line 31
    new-instance p1, Lr60;

    .line 32
    .line 33
    const/16 v0, 0xb2

    .line 34
    .line 35
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Llm1;->e:Lr60;

    .line 39
    .line 40
    new-instance p1, Lkz2;

    .line 41
    .line 42
    invoke-direct {p1}, Lkz2;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Llm1;->b:Lkz2;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Llm1;->c:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lwl2;->Z([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llm1;->d:Ljm1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Ljm1;->a:Z

    .line 10
    .line 11
    iput v1, v0, Ljm1;->c:I

    .line 12
    .line 13
    iput v1, v0, Ljm1;->b:I

    .line 14
    .line 15
    iget-object v0, p0, Llm1;->f:Lkm1;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-boolean v1, v0, Lkm1;->b:Z

    .line 20
    .line 21
    iput-boolean v1, v0, Lkm1;->c:Z

    .line 22
    .line 23
    iput-boolean v1, v0, Lkm1;->d:Z

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    iput v1, v0, Lkm1;->e:I

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Llm1;->e:Lr60;

    .line 29
    .line 30
    invoke-virtual {v0}, Lr60;->e()V

    .line 31
    .line 32
    .line 33
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    iput-wide v0, p0, Llm1;->g:J

    .line 36
    .line 37
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    iput-wide v0, p0, Llm1;->k:J

    .line 43
    .line 44
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Llm1;->f:Lkm1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Llm1;->i:Ljg1;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v2, v1, Lkz2;->b:I

    .line 16
    .line 17
    iget v3, v1, Lkz2;->c:I

    .line 18
    .line 19
    iget-object v4, v1, Lkz2;->a:[B

    .line 20
    .line 21
    iget-wide v5, v0, Llm1;->g:J

    .line 22
    .line 23
    invoke-virtual {v1}, Lkz2;->B()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    int-to-long v7, v7

    .line 28
    add-long/2addr v5, v7

    .line 29
    iput-wide v5, v0, Llm1;->g:J

    .line 30
    .line 31
    iget-object v5, v0, Llm1;->i:Ljg1;

    .line 32
    .line 33
    invoke-virtual {v1}, Lkz2;->B()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-interface {v5, v1, v6, v7}, Ljg1;->a(Lkz2;II)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v5, v0, Llm1;->c:[Z

    .line 42
    .line 43
    invoke-static {v4, v2, v3, v5}, Lwl2;->W([BII[Z)I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    iget-object v6, v0, Llm1;->e:Lr60;

    .line 48
    .line 49
    iget-object v8, v0, Llm1;->d:Ljm1;

    .line 50
    .line 51
    if-ne v5, v3, :cond_1

    .line 52
    .line 53
    iget-boolean v1, v0, Llm1;->j:Z

    .line 54
    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {v8, v4, v2, v3}, Ljm1;->a([BII)V

    .line 58
    .line 59
    .line 60
    :cond_0
    iget-object v1, v0, Llm1;->f:Lkm1;

    .line 61
    .line 62
    invoke-virtual {v1, v4, v2, v3}, Lkm1;->a([BII)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6, v4, v2, v3}, Lr60;->h([BII)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    iget-object v9, v1, Lkz2;->a:[B

    .line 70
    .line 71
    add-int/lit8 v10, v5, 0x3

    .line 72
    .line 73
    aget-byte v9, v9, v10

    .line 74
    .line 75
    and-int/lit16 v11, v9, 0xff

    .line 76
    .line 77
    sub-int v12, v5, v2

    .line 78
    .line 79
    iget-boolean v13, v0, Llm1;->j:Z

    .line 80
    .line 81
    const/4 v15, 0x1

    .line 82
    if-nez v13, :cond_17

    .line 83
    .line 84
    if-lez v12, :cond_2

    .line 85
    .line 86
    invoke-virtual {v8, v4, v2, v5}, Ljm1;->a([BII)V

    .line 87
    .line 88
    .line 89
    :cond_2
    if-gez v12, :cond_3

    .line 90
    .line 91
    neg-int v13, v12

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move v13, v7

    .line 94
    :goto_1
    iget v7, v8, Ljm1;->b:I

    .line 95
    .line 96
    if-eqz v7, :cond_15

    .line 97
    .line 98
    const/16 v14, 0xb5

    .line 99
    .line 100
    const-string v17, "Unexpected start code value"

    .line 101
    .line 102
    if-eq v7, v15, :cond_13

    .line 103
    .line 104
    const/4 v15, 0x2

    .line 105
    if-eq v7, v15, :cond_11

    .line 106
    .line 107
    const/4 v15, 0x3

    .line 108
    if-eq v7, v15, :cond_f

    .line 109
    .line 110
    const/16 v7, 0xb3

    .line 111
    .line 112
    if-eq v11, v7, :cond_5

    .line 113
    .line 114
    if-ne v11, v14, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move/from16 v19, v3

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    goto/16 :goto_7

    .line 121
    .line 122
    :cond_5
    :goto_2
    iget v7, v8, Ljm1;->c:I

    .line 123
    .line 124
    sub-int/2addr v7, v13

    .line 125
    iput v7, v8, Ljm1;->c:I

    .line 126
    .line 127
    const/4 v7, 0x0

    .line 128
    iput-boolean v7, v8, Ljm1;->a:Z

    .line 129
    .line 130
    iget-object v7, v0, Llm1;->i:Ljg1;

    .line 131
    .line 132
    iget v9, v8, Ljm1;->d:I

    .line 133
    .line 134
    iget-object v13, v0, Llm1;->h:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v14, v8, Ljm1;->e:[B

    .line 140
    .line 141
    iget v8, v8, Ljm1;->c:I

    .line 142
    .line 143
    invoke-static {v14, v8}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    new-instance v14, Llg1;

    .line 148
    .line 149
    array-length v15, v8

    .line 150
    invoke-direct {v14, v15, v8}, Llg1;-><init>(I[B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v14, v9}, Llg1;->x(I)V

    .line 154
    .line 155
    .line 156
    const/4 v9, 0x4

    .line 157
    invoke-virtual {v14, v9}, Llg1;->x(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v14}, Llg1;->m()V

    .line 161
    .line 162
    .line 163
    const/16 v15, 0x8

    .line 164
    .line 165
    invoke-virtual {v14, v15}, Llg1;->o(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v14}, Llg1;->q()Z

    .line 169
    .line 170
    .line 171
    move-result v17

    .line 172
    if-eqz v17, :cond_6

    .line 173
    .line 174
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 175
    .line 176
    .line 177
    const/4 v15, 0x3

    .line 178
    invoke-virtual {v14, v15}, Llg1;->o(I)V

    .line 179
    .line 180
    .line 181
    :cond_6
    invoke-virtual {v14, v9}, Llg1;->r(I)I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    const-string v18, "Invalid aspect ratio"

    .line 186
    .line 187
    const/16 v15, 0xf

    .line 188
    .line 189
    if-ne v9, v15, :cond_8

    .line 190
    .line 191
    const/16 v15, 0x8

    .line 192
    .line 193
    invoke-virtual {v14, v15}, Llg1;->r(I)I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    invoke-virtual {v14, v15}, Llg1;->r(I)I

    .line 198
    .line 199
    .line 200
    move-result v15

    .line 201
    if-nez v15, :cond_7

    .line 202
    .line 203
    invoke-static/range {v18 .. v18}, La30;->x(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :goto_3
    const/high16 v15, 0x3f800000    # 1.0f

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_7
    int-to-float v9, v9

    .line 210
    int-to-float v15, v15

    .line 211
    div-float v15, v9, v15

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_8
    const/4 v15, 0x7

    .line 215
    if-ge v9, v15, :cond_9

    .line 216
    .line 217
    sget-object v15, Llm1;->l:[F

    .line 218
    .line 219
    aget v15, v15, v9

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_9
    invoke-static/range {v18 .. v18}, La30;->x(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :goto_4
    invoke-virtual {v14}, Llg1;->q()Z

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    if-eqz v9, :cond_a

    .line 231
    .line 232
    const/4 v9, 0x2

    .line 233
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 234
    .line 235
    .line 236
    const/4 v9, 0x1

    .line 237
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v14}, Llg1;->q()Z

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    if-eqz v9, :cond_a

    .line 245
    .line 246
    const/16 v9, 0xf

    .line 247
    .line 248
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v14}, Llg1;->m()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v14}, Llg1;->m()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v14}, Llg1;->m()V

    .line 264
    .line 265
    .line 266
    const/4 v9, 0x3

    .line 267
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 268
    .line 269
    .line 270
    const/16 v9, 0xb

    .line 271
    .line 272
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v14}, Llg1;->m()V

    .line 276
    .line 277
    .line 278
    const/16 v9, 0xf

    .line 279
    .line 280
    invoke-virtual {v14, v9}, Llg1;->o(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v14}, Llg1;->m()V

    .line 284
    .line 285
    .line 286
    :cond_a
    const/4 v9, 0x2

    .line 287
    invoke-virtual {v14, v9}, Llg1;->r(I)I

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    if-eqz v9, :cond_b

    .line 292
    .line 293
    const-string v9, "Unhandled video object layer shape"

    .line 294
    .line 295
    invoke-static {v9}, La30;->x(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    :cond_b
    invoke-virtual {v14}, Llg1;->m()V

    .line 299
    .line 300
    .line 301
    const/16 v9, 0x10

    .line 302
    .line 303
    invoke-virtual {v14, v9}, Llg1;->r(I)I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    invoke-virtual {v14}, Llg1;->m()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v14}, Llg1;->q()Z

    .line 311
    .line 312
    .line 313
    move-result v16

    .line 314
    if-eqz v16, :cond_c

    .line 315
    .line 316
    if-nez v9, :cond_d

    .line 317
    .line 318
    const-string v9, "Invalid vop_increment_time_resolution"

    .line 319
    .line 320
    invoke-static {v9}, La30;->x(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    :cond_c
    move/from16 v19, v3

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_d
    add-int/lit8 v9, v9, -0x1

    .line 327
    .line 328
    move/from16 v19, v3

    .line 329
    .line 330
    const/4 v3, 0x0

    .line 331
    :goto_5
    if-lez v9, :cond_e

    .line 332
    .line 333
    shr-int/lit8 v9, v9, 0x1

    .line 334
    .line 335
    add-int/lit8 v3, v3, 0x1

    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_e
    invoke-virtual {v14, v3}, Llg1;->o(I)V

    .line 339
    .line 340
    .line 341
    :goto_6
    invoke-virtual {v14}, Llg1;->m()V

    .line 342
    .line 343
    .line 344
    const/16 v3, 0xd

    .line 345
    .line 346
    invoke-virtual {v14, v3}, Llg1;->r(I)I

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    invoke-virtual {v14}, Llg1;->m()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v14, v3}, Llg1;->r(I)I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    invoke-virtual {v14}, Llg1;->m()V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v14}, Llg1;->m()V

    .line 361
    .line 362
    .line 363
    new-instance v14, Lgg4;

    .line 364
    .line 365
    invoke-direct {v14}, Lgg4;-><init>()V

    .line 366
    .line 367
    .line 368
    iput-object v13, v14, Lgg4;->a:Ljava/lang/String;

    .line 369
    .line 370
    const-string v13, "video/mp2t"

    .line 371
    .line 372
    invoke-virtual {v14, v13}, Lgg4;->d(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    const-string v13, "video/mp4v-es"

    .line 376
    .line 377
    invoke-virtual {v14, v13}, Lgg4;->e(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    iput v9, v14, Lgg4;->s:I

    .line 381
    .line 382
    iput v3, v14, Lgg4;->t:I

    .line 383
    .line 384
    iput v15, v14, Lgg4;->y:F

    .line 385
    .line 386
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    iput-object v3, v14, Lgg4;->o:Ljava/util/List;

    .line 391
    .line 392
    new-instance v3, Lph4;

    .line 393
    .line 394
    invoke-direct {v3, v14}, Lph4;-><init>(Lgg4;)V

    .line 395
    .line 396
    .line 397
    invoke-interface {v7, v3}, Ljg1;->d(Lph4;)V

    .line 398
    .line 399
    .line 400
    const/4 v9, 0x1

    .line 401
    iput-boolean v9, v0, Llm1;->j:Z

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_f
    move/from16 v19, v3

    .line 405
    .line 406
    and-int/lit16 v3, v9, 0xf0

    .line 407
    .line 408
    const/16 v7, 0x20

    .line 409
    .line 410
    if-eq v3, v7, :cond_10

    .line 411
    .line 412
    invoke-static/range {v17 .. v17}, La30;->x(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    const/4 v7, 0x0

    .line 416
    iput-boolean v7, v8, Ljm1;->a:Z

    .line 417
    .line 418
    iput v7, v8, Ljm1;->c:I

    .line 419
    .line 420
    iput v7, v8, Ljm1;->b:I

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_10
    const/4 v7, 0x0

    .line 424
    iget v3, v8, Ljm1;->c:I

    .line 425
    .line 426
    iput v3, v8, Ljm1;->d:I

    .line 427
    .line 428
    const/4 v9, 0x4

    .line 429
    iput v9, v8, Ljm1;->b:I

    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_11
    move/from16 v19, v3

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    const/16 v3, 0x1f

    .line 436
    .line 437
    if-le v11, v3, :cond_12

    .line 438
    .line 439
    invoke-static/range {v17 .. v17}, La30;->x(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    iput-boolean v7, v8, Ljm1;->a:Z

    .line 443
    .line 444
    iput v7, v8, Ljm1;->c:I

    .line 445
    .line 446
    iput v7, v8, Ljm1;->b:I

    .line 447
    .line 448
    goto :goto_7

    .line 449
    :cond_12
    const/4 v15, 0x3

    .line 450
    iput v15, v8, Ljm1;->b:I

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :cond_13
    move/from16 v19, v3

    .line 454
    .line 455
    const/4 v7, 0x0

    .line 456
    if-eq v11, v14, :cond_14

    .line 457
    .line 458
    invoke-static/range {v17 .. v17}, La30;->x(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    iput-boolean v7, v8, Ljm1;->a:Z

    .line 462
    .line 463
    iput v7, v8, Ljm1;->c:I

    .line 464
    .line 465
    iput v7, v8, Ljm1;->b:I

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_14
    const/4 v9, 0x2

    .line 469
    iput v9, v8, Ljm1;->b:I

    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_15
    move/from16 v19, v3

    .line 473
    .line 474
    const/4 v7, 0x0

    .line 475
    const/16 v3, 0xb0

    .line 476
    .line 477
    if-ne v11, v3, :cond_16

    .line 478
    .line 479
    const/4 v9, 0x1

    .line 480
    iput v9, v8, Ljm1;->b:I

    .line 481
    .line 482
    iput-boolean v9, v8, Ljm1;->a:Z

    .line 483
    .line 484
    :cond_16
    :goto_7
    sget-object v3, Ljm1;->f:[B

    .line 485
    .line 486
    const/4 v15, 0x3

    .line 487
    invoke-virtual {v8, v3, v7, v15}, Ljm1;->a([BII)V

    .line 488
    .line 489
    .line 490
    goto :goto_8

    .line 491
    :cond_17
    move/from16 v19, v3

    .line 492
    .line 493
    :goto_8
    iget-object v3, v0, Llm1;->f:Lkm1;

    .line 494
    .line 495
    invoke-virtual {v3, v4, v2, v5}, Lkm1;->a([BII)V

    .line 496
    .line 497
    .line 498
    if-lez v12, :cond_18

    .line 499
    .line 500
    invoke-virtual {v6, v4, v2, v5}, Lr60;->h([BII)V

    .line 501
    .line 502
    .line 503
    const/4 v2, 0x0

    .line 504
    goto :goto_9

    .line 505
    :cond_18
    neg-int v2, v12

    .line 506
    :goto_9
    invoke-virtual {v6, v2}, Lr60;->i(I)Z

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    if-eqz v2, :cond_19

    .line 511
    .line 512
    iget-object v2, v6, Lr60;->f:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v2, [B

    .line 515
    .line 516
    iget v3, v6, Lr60;->e:I

    .line 517
    .line 518
    invoke-static {v3, v2}, Lwl2;->z(I[B)I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 523
    .line 524
    iget-object v3, v6, Lr60;->f:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v3, [B

    .line 527
    .line 528
    iget-object v7, v0, Llm1;->b:Lkz2;

    .line 529
    .line 530
    invoke-virtual {v7, v2, v3}, Lkz2;->z(I[B)V

    .line 531
    .line 532
    .line 533
    iget-object v2, v0, Llm1;->a:Lxb4;

    .line 534
    .line 535
    iget-wide v8, v0, Llm1;->k:J

    .line 536
    .line 537
    invoke-virtual {v2, v8, v9, v7}, Lxb4;->E(JLkz2;)V

    .line 538
    .line 539
    .line 540
    :cond_19
    const/16 v2, 0xb2

    .line 541
    .line 542
    if-ne v11, v2, :cond_1b

    .line 543
    .line 544
    iget-object v3, v1, Lkz2;->a:[B

    .line 545
    .line 546
    add-int/lit8 v7, v5, 0x2

    .line 547
    .line 548
    aget-byte v3, v3, v7

    .line 549
    .line 550
    const/4 v9, 0x1

    .line 551
    if-ne v3, v9, :cond_1a

    .line 552
    .line 553
    invoke-virtual {v6, v2}, Lr60;->g(I)V

    .line 554
    .line 555
    .line 556
    :cond_1a
    move v11, v2

    .line 557
    goto :goto_a

    .line 558
    :cond_1b
    const/4 v9, 0x1

    .line 559
    :goto_a
    sub-int v3, v19, v5

    .line 560
    .line 561
    iget-wide v5, v0, Llm1;->g:J

    .line 562
    .line 563
    int-to-long v7, v3

    .line 564
    sub-long/2addr v5, v7

    .line 565
    iget-object v2, v0, Llm1;->f:Lkm1;

    .line 566
    .line 567
    iget-boolean v7, v0, Llm1;->j:Z

    .line 568
    .line 569
    invoke-virtual {v2, v3, v5, v6, v7}, Lkm1;->b(IJZ)V

    .line 570
    .line 571
    .line 572
    iget-object v2, v0, Llm1;->f:Lkm1;

    .line 573
    .line 574
    iget-wide v5, v0, Llm1;->k:J

    .line 575
    .line 576
    iput v11, v2, Lkm1;->e:I

    .line 577
    .line 578
    const/4 v7, 0x0

    .line 579
    iput-boolean v7, v2, Lkm1;->d:Z

    .line 580
    .line 581
    const/16 v3, 0xb6

    .line 582
    .line 583
    if-eq v11, v3, :cond_1d

    .line 584
    .line 585
    const/16 v7, 0xb3

    .line 586
    .line 587
    if-ne v11, v7, :cond_1c

    .line 588
    .line 589
    move v14, v7

    .line 590
    move v7, v9

    .line 591
    goto :goto_b

    .line 592
    :cond_1c
    move v14, v11

    .line 593
    const/4 v7, 0x0

    .line 594
    goto :goto_b

    .line 595
    :cond_1d
    move v7, v9

    .line 596
    move v14, v11

    .line 597
    :goto_b
    iput-boolean v7, v2, Lkm1;->b:Z

    .line 598
    .line 599
    if-ne v14, v3, :cond_1e

    .line 600
    .line 601
    move v15, v9

    .line 602
    goto :goto_c

    .line 603
    :cond_1e
    const/4 v15, 0x0

    .line 604
    :goto_c
    iput-boolean v15, v2, Lkm1;->c:Z

    .line 605
    .line 606
    const/4 v7, 0x0

    .line 607
    iput v7, v2, Lkm1;->f:I

    .line 608
    .line 609
    iput-wide v5, v2, Lkm1;->h:J

    .line 610
    .line 611
    move v2, v10

    .line 612
    move/from16 v3, v19

    .line 613
    .line 614
    goto/16 :goto_0
.end method

.method public final c(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Llm1;->f:Lkm1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-wide v1, p0, Llm1;->g:J

    .line 9
    .line 10
    iget-boolean p1, p0, Llm1;->j:Z

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v3, v1, v2, p1}, Lkm1;->b(IJZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Llm1;->f:Lkm1;

    .line 17
    .line 18
    iput-boolean v3, p1, Lkm1;->b:Z

    .line 19
    .line 20
    iput-boolean v3, p1, Lkm1;->c:Z

    .line 21
    .line 22
    iput-boolean v3, p1, Lkm1;->d:Z

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    iput v0, p1, Lkm1;->e:I

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Llm1;->k:J

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
    iget-object v0, p2, Lin1;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Llm1;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lin1;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lin1;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Lnf1;->z(II)Ljg1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Llm1;->i:Ljg1;

    .line 22
    .line 23
    new-instance v1, Lkm1;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lkm1;-><init>(Ljg1;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Llm1;->f:Lkm1;

    .line 29
    .line 30
    iget-object v0, p0, Llm1;->a:Lxb4;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lxb4;->B(Lnf1;Lin1;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
