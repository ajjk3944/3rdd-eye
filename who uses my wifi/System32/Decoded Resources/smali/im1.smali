.class public final Lim1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# static fields
.field public static final r:[D


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljg1;

.field public final c:Lxb4;

.field public final d:Ljava/lang/String;

.field public final e:Lkz2;

.field public final f:Lr60;

.field public final g:[Z

.field public final h:Lhm1;

.field public i:J

.field public j:Z

.field public k:Z

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:Z

.field public q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lim1;->r:[D

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>(Lxb4;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lim1;->c:Lxb4;

    .line 5
    .line 6
    iput-object p2, p0, Lim1;->d:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p2, 0x4

    .line 9
    new-array p2, p2, [Z

    .line 10
    .line 11
    iput-object p2, p0, Lim1;->g:[Z

    .line 12
    .line 13
    new-instance p2, Lhm1;

    .line 14
    .line 15
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0x80

    .line 19
    .line 20
    new-array v0, v0, [B

    .line 21
    .line 22
    iput-object v0, p2, Lhm1;->d:[B

    .line 23
    .line 24
    iput-object p2, p0, Lim1;->h:Lhm1;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    new-instance p1, Lr60;

    .line 29
    .line 30
    const/16 p2, 0xb2

    .line 31
    .line 32
    invoke-direct {p1, p2}, Lr60;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lim1;->f:Lr60;

    .line 36
    .line 37
    new-instance p1, Lkz2;

    .line 38
    .line 39
    invoke-direct {p1}, Lkz2;-><init>()V

    .line 40
    .line 41
    .line 42
    :goto_0
    iput-object p1, p0, Lim1;->e:Lkz2;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Lim1;->f:Lr60;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :goto_1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    iput-wide p1, p0, Lim1;->m:J

    .line 55
    .line 56
    iput-wide p1, p0, Lim1;->o:J

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lim1;->g:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lwl2;->Z([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lim1;->h:Lhm1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Lhm1;->a:Z

    .line 10
    .line 11
    iput v1, v0, Lhm1;->b:I

    .line 12
    .line 13
    iput v1, v0, Lhm1;->c:I

    .line 14
    .line 15
    iget-object v0, p0, Lim1;->f:Lr60;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lr60;->e()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    iput-wide v2, p0, Lim1;->i:J

    .line 25
    .line 26
    iput-boolean v1, p0, Lim1;->j:Z

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, Lim1;->m:J

    .line 34
    .line 35
    iput-wide v0, p0, Lim1;->o:J

    .line 36
    .line 37
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lim1;->b:Ljg1;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget v2, v1, Lkz2;->b:I

    .line 11
    .line 12
    iget v3, v1, Lkz2;->c:I

    .line 13
    .line 14
    iget-object v4, v1, Lkz2;->a:[B

    .line 15
    .line 16
    iget-wide v5, v0, Lim1;->i:J

    .line 17
    .line 18
    invoke-virtual {v1}, Lkz2;->B()I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    int-to-long v7, v7

    .line 23
    add-long/2addr v5, v7

    .line 24
    iput-wide v5, v0, Lim1;->i:J

    .line 25
    .line 26
    iget-object v5, v0, Lim1;->b:Ljg1;

    .line 27
    .line 28
    invoke-virtual {v1}, Lkz2;->B()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-interface {v5, v1, v6, v7}, Ljg1;->a(Lkz2;II)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v5, v0, Lim1;->g:[Z

    .line 37
    .line 38
    invoke-static {v4, v2, v3, v5}, Lwl2;->W([BII[Z)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget-object v6, v0, Lim1;->f:Lr60;

    .line 43
    .line 44
    iget-object v8, v0, Lim1;->h:Lhm1;

    .line 45
    .line 46
    if-ne v5, v3, :cond_2

    .line 47
    .line 48
    iget-boolean v1, v0, Lim1;->k:Z

    .line 49
    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v8, v4, v2, v3}, Lhm1;->a([BII)V

    .line 53
    .line 54
    .line 55
    :cond_0
    if-eqz v6, :cond_1

    .line 56
    .line 57
    invoke-virtual {v6, v4, v2, v3}, Lr60;->h([BII)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :cond_2
    iget-object v9, v1, Lkz2;->a:[B

    .line 62
    .line 63
    add-int/lit8 v10, v5, 0x3

    .line 64
    .line 65
    aget-byte v9, v9, v10

    .line 66
    .line 67
    and-int/lit16 v9, v9, 0xff

    .line 68
    .line 69
    sub-int v11, v5, v2

    .line 70
    .line 71
    iget-boolean v12, v0, Lim1;->k:Z

    .line 72
    .line 73
    if-nez v12, :cond_d

    .line 74
    .line 75
    if-lez v11, :cond_3

    .line 76
    .line 77
    invoke-virtual {v8, v4, v2, v5}, Lhm1;->a([BII)V

    .line 78
    .line 79
    .line 80
    :cond_3
    if-gez v11, :cond_4

    .line 81
    .line 82
    neg-int v12, v11

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move v12, v7

    .line 85
    :goto_1
    iget-boolean v15, v8, Lhm1;->a:Z

    .line 86
    .line 87
    if-eqz v15, :cond_b

    .line 88
    .line 89
    iget v15, v8, Lhm1;->b:I

    .line 90
    .line 91
    sub-int/2addr v15, v12

    .line 92
    iput v15, v8, Lhm1;->b:I

    .line 93
    .line 94
    iget v12, v8, Lhm1;->c:I

    .line 95
    .line 96
    if-nez v12, :cond_5

    .line 97
    .line 98
    const/16 v12, 0xb5

    .line 99
    .line 100
    if-ne v9, v12, :cond_5

    .line 101
    .line 102
    iput v15, v8, Lhm1;->c:I

    .line 103
    .line 104
    move/from16 v19, v3

    .line 105
    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_5
    iput-boolean v7, v8, Lhm1;->a:Z

    .line 109
    .line 110
    iget-object v12, v0, Lim1;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v15, v8, Lhm1;->d:[B

    .line 116
    .line 117
    iget v7, v8, Lhm1;->b:I

    .line 118
    .line 119
    invoke-static {v15, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    const/4 v15, 0x4

    .line 124
    aget-byte v14, v7, v15

    .line 125
    .line 126
    and-int/lit16 v14, v14, 0xff

    .line 127
    .line 128
    const/16 v16, 0x5

    .line 129
    .line 130
    move/from16 v17, v15

    .line 131
    .line 132
    aget-byte v15, v7, v16

    .line 133
    .line 134
    and-int/lit16 v13, v15, 0xff

    .line 135
    .line 136
    const/16 v18, 0x6

    .line 137
    .line 138
    move/from16 v19, v3

    .line 139
    .line 140
    aget-byte v3, v7, v18

    .line 141
    .line 142
    and-int/lit16 v3, v3, 0xff

    .line 143
    .line 144
    const/16 v18, 0x7

    .line 145
    .line 146
    move/from16 v20, v3

    .line 147
    .line 148
    aget-byte v3, v7, v18

    .line 149
    .line 150
    and-int/lit16 v3, v3, 0xf0

    .line 151
    .line 152
    and-int/lit8 v15, v15, 0xf

    .line 153
    .line 154
    shl-int/lit8 v14, v14, 0x4

    .line 155
    .line 156
    shr-int/lit8 v13, v13, 0x4

    .line 157
    .line 158
    or-int/2addr v13, v14

    .line 159
    shr-int/lit8 v3, v3, 0x4

    .line 160
    .line 161
    const/16 v14, 0x8

    .line 162
    .line 163
    shl-int/2addr v15, v14

    .line 164
    or-int v15, v15, v20

    .line 165
    .line 166
    const/4 v14, 0x2

    .line 167
    if-eq v3, v14, :cond_8

    .line 168
    .line 169
    const/4 v14, 0x3

    .line 170
    if-eq v3, v14, :cond_7

    .line 171
    .line 172
    move/from16 v14, v17

    .line 173
    .line 174
    if-eq v3, v14, :cond_6

    .line 175
    .line 176
    const/high16 v3, 0x3f800000    # 1.0f

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_6
    mul-int/lit8 v3, v15, 0x79

    .line 180
    .line 181
    mul-int/lit8 v14, v13, 0x64

    .line 182
    .line 183
    :goto_2
    int-to-float v3, v3

    .line 184
    int-to-float v14, v14

    .line 185
    div-float/2addr v3, v14

    .line 186
    goto :goto_3

    .line 187
    :cond_7
    mul-int/lit8 v3, v15, 0x10

    .line 188
    .line 189
    mul-int/lit8 v14, v13, 0x9

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_8
    mul-int/lit8 v3, v15, 0x4

    .line 193
    .line 194
    mul-int/lit8 v14, v13, 0x3

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :goto_3
    new-instance v14, Lgg4;

    .line 198
    .line 199
    invoke-direct {v14}, Lgg4;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-object v12, v14, Lgg4;->a:Ljava/lang/String;

    .line 203
    .line 204
    iget-object v12, v0, Lim1;->d:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v14, v12}, Lgg4;->d(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const-string v12, "video/mpeg2"

    .line 210
    .line 211
    invoke-virtual {v14, v12}, Lgg4;->e(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iput v13, v14, Lgg4;->s:I

    .line 215
    .line 216
    iput v15, v14, Lgg4;->t:I

    .line 217
    .line 218
    iput v3, v14, Lgg4;->y:F

    .line 219
    .line 220
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    iput-object v3, v14, Lgg4;->o:Ljava/util/List;

    .line 225
    .line 226
    new-instance v3, Lph4;

    .line 227
    .line 228
    invoke-direct {v3, v14}, Lph4;-><init>(Lgg4;)V

    .line 229
    .line 230
    .line 231
    aget-byte v12, v7, v18

    .line 232
    .line 233
    and-int/lit8 v12, v12, 0xf

    .line 234
    .line 235
    add-int/lit8 v12, v12, -0x1

    .line 236
    .line 237
    const-wide/16 v13, 0x0

    .line 238
    .line 239
    if-ltz v12, :cond_a

    .line 240
    .line 241
    const/16 v15, 0x8

    .line 242
    .line 243
    if-ge v12, v15, :cond_a

    .line 244
    .line 245
    sget-object v13, Lim1;->r:[D

    .line 246
    .line 247
    aget-wide v12, v13, v12

    .line 248
    .line 249
    iget v8, v8, Lhm1;->c:I

    .line 250
    .line 251
    add-int/lit8 v8, v8, 0x9

    .line 252
    .line 253
    aget-byte v7, v7, v8

    .line 254
    .line 255
    and-int/lit8 v8, v7, 0x60

    .line 256
    .line 257
    shr-int/lit8 v8, v8, 0x5

    .line 258
    .line 259
    and-int/lit8 v7, v7, 0x1f

    .line 260
    .line 261
    if-eq v8, v7, :cond_9

    .line 262
    .line 263
    int-to-double v14, v8

    .line 264
    add-int/lit8 v7, v7, 0x1

    .line 265
    .line 266
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    .line 267
    .line 268
    add-double v14, v14, v16

    .line 269
    .line 270
    int-to-double v7, v7

    .line 271
    div-double/2addr v14, v7

    .line 272
    mul-double/2addr v12, v14

    .line 273
    :cond_9
    const-wide v7, 0x412e848000000000L    # 1000000.0

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    div-double/2addr v7, v12

    .line 279
    double-to-long v13, v7

    .line 280
    :cond_a
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-static {v3, v7}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    iget-object v7, v0, Lim1;->b:Ljg1;

    .line 289
    .line 290
    iget-object v8, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v8, Lph4;

    .line 293
    .line 294
    invoke-interface {v7, v8}, Ljg1;->d(Lph4;)V

    .line 295
    .line 296
    .line 297
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, Ljava/lang/Long;

    .line 300
    .line 301
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 302
    .line 303
    .line 304
    move-result-wide v7

    .line 305
    iput-wide v7, v0, Lim1;->l:J

    .line 306
    .line 307
    const/4 v3, 0x1

    .line 308
    iput-boolean v3, v0, Lim1;->k:Z

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_b
    move/from16 v19, v3

    .line 312
    .line 313
    const/4 v3, 0x1

    .line 314
    const/16 v7, 0xb3

    .line 315
    .line 316
    if-ne v9, v7, :cond_c

    .line 317
    .line 318
    iput-boolean v3, v8, Lhm1;->a:Z

    .line 319
    .line 320
    :cond_c
    :goto_4
    sget-object v3, Lhm1;->e:[B

    .line 321
    .line 322
    const/4 v7, 0x0

    .line 323
    const/4 v14, 0x3

    .line 324
    invoke-virtual {v8, v3, v7, v14}, Lhm1;->a([BII)V

    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_d
    move/from16 v19, v3

    .line 329
    .line 330
    :goto_5
    if-eqz v6, :cond_11

    .line 331
    .line 332
    if-lez v11, :cond_e

    .line 333
    .line 334
    invoke-virtual {v6, v4, v2, v5}, Lr60;->h([BII)V

    .line 335
    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    goto :goto_6

    .line 339
    :cond_e
    neg-int v7, v11

    .line 340
    :goto_6
    invoke-virtual {v6, v7}, Lr60;->i(I)Z

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-eqz v2, :cond_f

    .line 345
    .line 346
    iget-object v2, v6, Lr60;->f:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v2, [B

    .line 349
    .line 350
    iget v3, v6, Lr60;->e:I

    .line 351
    .line 352
    invoke-static {v3, v2}, Lwl2;->z(I[B)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 357
    .line 358
    iget-object v3, v6, Lr60;->f:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v3, [B

    .line 361
    .line 362
    iget-object v7, v0, Lim1;->e:Lkz2;

    .line 363
    .line 364
    invoke-virtual {v7, v2, v3}, Lkz2;->z(I[B)V

    .line 365
    .line 366
    .line 367
    iget-object v2, v0, Lim1;->c:Lxb4;

    .line 368
    .line 369
    iget-wide v11, v0, Lim1;->o:J

    .line 370
    .line 371
    invoke-virtual {v2, v11, v12, v7}, Lxb4;->E(JLkz2;)V

    .line 372
    .line 373
    .line 374
    :cond_f
    const/16 v2, 0xb2

    .line 375
    .line 376
    if-ne v9, v2, :cond_11

    .line 377
    .line 378
    iget-object v3, v1, Lkz2;->a:[B

    .line 379
    .line 380
    add-int/lit8 v7, v5, 0x2

    .line 381
    .line 382
    aget-byte v3, v3, v7

    .line 383
    .line 384
    const/4 v7, 0x1

    .line 385
    if-ne v3, v7, :cond_10

    .line 386
    .line 387
    invoke-virtual {v6, v2}, Lr60;->g(I)V

    .line 388
    .line 389
    .line 390
    :cond_10
    move v9, v2

    .line 391
    :cond_11
    if-eqz v9, :cond_14

    .line 392
    .line 393
    const/16 v7, 0xb3

    .line 394
    .line 395
    if-ne v9, v7, :cond_12

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_12
    const/16 v2, 0xb8

    .line 399
    .line 400
    if-ne v9, v2, :cond_13

    .line 401
    .line 402
    const/4 v3, 0x1

    .line 403
    iput-boolean v3, v0, Lim1;->p:Z

    .line 404
    .line 405
    :cond_13
    const/4 v7, 0x0

    .line 406
    goto/16 :goto_c

    .line 407
    .line 408
    :cond_14
    :goto_7
    sub-int v25, v19, v5

    .line 409
    .line 410
    iget-boolean v2, v0, Lim1;->q:Z

    .line 411
    .line 412
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    if-eqz v2, :cond_15

    .line 418
    .line 419
    iget-boolean v2, v0, Lim1;->k:Z

    .line 420
    .line 421
    if-eqz v2, :cond_15

    .line 422
    .line 423
    iget-wide v2, v0, Lim1;->o:J

    .line 424
    .line 425
    cmp-long v7, v2, v5

    .line 426
    .line 427
    if-eqz v7, :cond_15

    .line 428
    .line 429
    iget-boolean v7, v0, Lim1;->p:Z

    .line 430
    .line 431
    iget-wide v11, v0, Lim1;->i:J

    .line 432
    .line 433
    iget-wide v13, v0, Lim1;->n:J

    .line 434
    .line 435
    sub-long/2addr v11, v13

    .line 436
    long-to-int v8, v11

    .line 437
    sub-int v24, v8, v25

    .line 438
    .line 439
    iget-object v8, v0, Lim1;->b:Ljg1;

    .line 440
    .line 441
    const/16 v26, 0x0

    .line 442
    .line 443
    move-wide/from16 v21, v2

    .line 444
    .line 445
    move/from16 v23, v7

    .line 446
    .line 447
    move-object/from16 v20, v8

    .line 448
    .line 449
    invoke-interface/range {v20 .. v26}, Ljg1;->c(JIIILig1;)V

    .line 450
    .line 451
    .line 452
    :cond_15
    move/from16 v3, v25

    .line 453
    .line 454
    iget-boolean v2, v0, Lim1;->j:Z

    .line 455
    .line 456
    if-eqz v2, :cond_17

    .line 457
    .line 458
    iget-boolean v2, v0, Lim1;->q:Z

    .line 459
    .line 460
    if-eqz v2, :cond_16

    .line 461
    .line 462
    goto :goto_8

    .line 463
    :cond_16
    const/4 v3, 0x1

    .line 464
    const/4 v7, 0x0

    .line 465
    goto :goto_a

    .line 466
    :cond_17
    :goto_8
    iget-wide v7, v0, Lim1;->i:J

    .line 467
    .line 468
    int-to-long v2, v3

    .line 469
    sub-long/2addr v7, v2

    .line 470
    iput-wide v7, v0, Lim1;->n:J

    .line 471
    .line 472
    iget-wide v2, v0, Lim1;->m:J

    .line 473
    .line 474
    cmp-long v7, v2, v5

    .line 475
    .line 476
    if-eqz v7, :cond_18

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_18
    iget-wide v2, v0, Lim1;->o:J

    .line 480
    .line 481
    cmp-long v7, v2, v5

    .line 482
    .line 483
    if-eqz v7, :cond_19

    .line 484
    .line 485
    iget-wide v7, v0, Lim1;->l:J

    .line 486
    .line 487
    add-long/2addr v2, v7

    .line 488
    goto :goto_9

    .line 489
    :cond_19
    move-wide v2, v5

    .line 490
    :goto_9
    iput-wide v2, v0, Lim1;->o:J

    .line 491
    .line 492
    const/4 v7, 0x0

    .line 493
    iput-boolean v7, v0, Lim1;->p:Z

    .line 494
    .line 495
    iput-wide v5, v0, Lim1;->m:J

    .line 496
    .line 497
    const/4 v3, 0x1

    .line 498
    iput-boolean v3, v0, Lim1;->j:Z

    .line 499
    .line 500
    :goto_a
    if-nez v9, :cond_1a

    .line 501
    .line 502
    move v14, v3

    .line 503
    goto :goto_b

    .line 504
    :cond_1a
    move v14, v7

    .line 505
    :goto_b
    iput-boolean v14, v0, Lim1;->q:Z

    .line 506
    .line 507
    :goto_c
    move v2, v10

    .line 508
    move/from16 v3, v19

    .line 509
    .line 510
    goto/16 :goto_0
.end method

.method public final c(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lim1;->b:Ljg1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean v3, p0, Lim1;->p:Z

    .line 9
    .line 10
    iget-wide v1, p0, Lim1;->i:J

    .line 11
    .line 12
    iget-wide v4, p0, Lim1;->n:J

    .line 13
    .line 14
    sub-long/2addr v1, v4

    .line 15
    move-wide v4, v1

    .line 16
    iget-wide v1, p0, Lim1;->o:J

    .line 17
    .line 18
    long-to-int v4, v4

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-interface/range {v0 .. v6}, Ljg1;->c(JIIILig1;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lim1;->m:J

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
    iput-object v0, p0, Lim1;->a:Ljava/lang/String;

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
    iput-object v0, p0, Lim1;->b:Ljg1;

    .line 22
    .line 23
    iget-object v0, p0, Lim1;->c:Lxb4;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lxb4;->B(Lnf1;Lin1;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method
